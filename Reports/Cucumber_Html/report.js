$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Test.feature");
formatter.feature({
  "line": 1,
  "name": "To Test The Adactin Hotel Application",
  "description": "",
  "id": "to-test-the-adactin-hotel-application",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2143632700,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Checks The Login Functionality",
  "description": "",
  "id": "to-test-the-adactin-hotel-application;checks-the-login-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user Launch The Url Of The Adactin Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The Username In The Respective Field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The Password In The Respective Field",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Clicks The Loginbutton and Its Navigates To The Home Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_Launch_The_Url_Of_The_Adactin_Application()"
});
formatter.result({
  "duration": 5739785000,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Enter_The_Username_In_The_Respective_Field()"
});
formatter.result({
  "duration": 88464800,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#usrname\"}\n  (Session info: chrome\u003d128.0.6613.138)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-F526N0H8\u0027, ip: \u0027192.168.0.106\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.23\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 128.0.6613.138, chrome: {chromedriverVersion: 128.0.6613.137 (fe621c5aa2d..., userDataDir: C:\\Users\\h\\AppData\\Local\\Te...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:58033}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: ce0b0ccd7188cdd45d7ded9a485bbe68\n*** Element info: {Using\u003did, value\u003dusrname}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat com.bstepdef.Stepdefinition.user_Enter_The_Username_In_The_Respective_Field(Stepdefinition.java:109)\r\n\tat ✽.When user Enter The Username In The Respective Field(Test.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Stepdefinition.user_Enter_The_Password_In_The_Respective_Field()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinition.user_Clicks_The_Loginbutton_and_Its_Navigates_To_The_Home_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 908527500,
  "status": "passed"
});
});