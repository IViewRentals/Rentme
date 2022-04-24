/* eslint-disable no-use-before-define, no-undef */

const updateDigitalDataUser = (userInfo) => {
  digitalData = digitalData || {};
  digitalData.user = {};
  if (userInfo.myAllHomesUserEmail) {
    digitalData.user.membershipType = 'member';
    digitalData.user.profileId = userInfo.casualMyAllhomesUserId;
    digitalData.user.emailHash = userInfo.emailHash;
  } else {
    digitalData.user.membershipType = 'visitor';
    delete digitalData.user.profileId;
    delete digitalData.user.emailHash;
  }
  digitalData.user.sessionToken = userInfo.sessionToken;
  digitalData.user.ipEncryption = userInfo.ipEncryption;
  dataLayer = dataLayer || [];
  dataLayer.push(digitalData);
};

if (document && document.addEventListener) {
  document.addEventListener('DOMContentLoaded', () => {
    fetch('/ah/ahtwyli', { credentials: 'same-origin' }).then(response => response.json()).then((json) => {
      updateDigitalDataUser(json);
    }).catch(() => {
      updateDigitalDataUser({});
    });
  });
}
