var grpc = require("grpc");
var events = require("events");
// add the bookStream global variable
var ccStream = new events.EventEmitter();
var ccProto = grpc.load("Chromecast.proto");
var ccDevice = {
  dname: "CustomCC",
  status: "On",
  app: "No Apps On",
  volume: 64
};
var server = new grpc.Server();
server.bind("0.0.0.0:1237", grpc.ServerCredentials.createInsecure());
console.log("Server running at http://0.0.0.0:1237");

server.addService(ccProto.SmartHomeGRPC.ChromecastService.service, {
  initialDevice: function (call, callback) {
    callback(null, ccDevice);
  },
  changeApplication: function (call, callback) {
    // console.log(call)
    var appName = call.request.text;
    if (appName == "Select an Application") {
      ccDevice.app = "No Apps On";
    } else {
      ccDevice.app = appName
    }
    //console.log(appName)

    return callback(null, ccDevice.app);
  },

  changeVolume: function (call, callback) {
    var reqVolume = call.request.length;
    var new_vol = ccDevice.volume + reqVolume
    if (new_vol < 100 && new_vol >= 0) {
      ccDevice.volume = new_vol;
    }
    console.log(ccDevice);
    return callback(null, ccDevice.volume);
  },
  onOff: function (call, callback) {
    var reqVal = call.request.msg
    console.log(reqVal)
    if (reqVal == true) {
      ccDevice.status = "On"
    } else {
      ccDevice.status = "Off"
    }
    var resp;
    if (ccDevice.status == "On") {
      resp = true;
    } else {
      resp = false;
    }
    callback(null, resp);
  },
  changeDeviceName: function (call, callback) {
    var reqName = call.request.text
    ccDevice.dname = reqName
    console.log("Name" + ccDevice.dname);

    callback(null, ccDevice.dname);
  }
});

server.start();
// In-memory array of book objects