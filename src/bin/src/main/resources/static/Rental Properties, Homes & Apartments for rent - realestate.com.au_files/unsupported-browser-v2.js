document.addEventListener('DOMContentLoaded', function () {
  var userAgentVal = navigator.userAgent;
  if (/MSIE/.test(userAgentVal) || /Trident/.test(userAgentVal)) {
    var alert = document.createElement('div');

    var style =
      '.unsupported-browser {position: fixed;top: 0;left: 0;width: 100%;  z-index: 100000;background-color: #ff5961;color: #ffffff;margin: auto;  font-size: 0.8125em;}' +
      '.unsupported-browser__content-wrapper {max-width: 1040px;margin: auto; position: relative;padding: 20px 20px 15px 20px;}' +
      '.unsupported-browser__content-wrapper > h1 {color: #ffffff;  margin-bottom: 0px;font-weight: normal;}' +
      '.unsupported-browser__content-wrapper > p {line-height: 2;}' +
      '.unsupported-browser__dismiss {position: absolute;top: 25px;right:   20px;color: #ffffff;font-size: 1.5em;text-decoration: none;}' +
      '.unsupported-browser__dismiss svg {width: 16px;height: 16px;}' +
      '.unsupported-browser__dismiss:hover {color: #ffffff;}';

    alert.innerHTML =
      '<style>' +
      style +
      '</style>' +
      '<div id="unsupported-browser-banner" class="unsupported-browser">' +
      '<a id="unsupported-browser-dismiss" class="unsupported-browser__dismiss"   href="#"><svg viewBox="0 0 16 16"><path d="M2.353 2.353l11.294  11.294m0-11.294L2.353 13.647" stroke="currentColor" fill="none"  fill-rule="evenodd" stroke-linecap="round" stroke-linejoin="round"></path></svg></a>' +
      '<div class="unsupported-browser__content-wrapper"><h1>Sorry,   realestate.com.au no longer supports this browser</h1><p>For the best   experience, download the latest browsers</p></div>' +
      '</div>';

    document.body.insertBefore(alert, document.body.firstChild);
    document.getElementById('unsupported-browser-dismiss').addEventListener('click', function (e) {
      e.preventDefault();
      document.getElementById('unsupported-browser-banner').style.display = 'none';
    });
  }
});
