
package com.ss.android.message;

interface IPushAppCallback {
    boolean getEnable();
    int getPushEnable();
    long getAppId();
    String getClientId();
    String getDeviceId();
    String getInstallId();
    String getPackage();
}
