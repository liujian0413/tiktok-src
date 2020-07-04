package com.facebook.react.modules.netinfo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.p022v4.p024b.C0656a;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.DeviceEventManagerModule.RCTDeviceEventEmitter;

@ReactModule(name = "NetInfo")
public class NetInfoModule extends ReactContextBaseJavaModule implements LifecycleEventListener {
    private String mConnectionType = "unknown";
    private final ConnectivityBroadcastReceiver mConnectivityBroadcastReceiver;
    private String mConnectivityDeprecated = "UNKNOWN";
    private final ConnectivityManager mConnectivityManager;
    private String mEffectiveConnectionType = "unknown";
    private boolean mNoNetworkPermission;

    class ConnectivityBroadcastReceiver extends BroadcastReceiver {
        private boolean isRegistered;

        public boolean isRegistered() {
            return this.isRegistered;
        }

        public void setRegistered(boolean z) {
            this.isRegistered = z;
        }

        private ConnectivityBroadcastReceiver() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                NetInfoModule.this.updateAndSendConnectionType();
            }
        }
    }

    public String getName() {
        return "NetInfo";
    }

    public void onHostDestroy() {
    }

    public void onHostPause() {
        unregisterReceiver();
    }

    public void onHostResume() {
        registerReceiver();
    }

    public void initialize() {
        getReactApplicationContext().addLifecycleEventListener(this);
    }

    private WritableMap createConnectivityEventMap() {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("network_info", this.mConnectivityDeprecated);
        writableNativeMap.putString("connectionType", this.mConnectionType);
        writableNativeMap.putString("effectiveConnectionType", this.mEffectiveConnectionType);
        return writableNativeMap;
    }

    private void registerReceiver() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        getReactApplicationContext().registerReceiver(this.mConnectivityBroadcastReceiver, intentFilter);
        this.mConnectivityBroadcastReceiver.setRegistered(true);
        updateAndSendConnectionType();
    }

    private void sendConnectivityChangedEvent() {
        ((RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(RCTDeviceEventEmitter.class)).emit("networkStatusDidChange", createConnectivityEventMap());
    }

    private void unregisterReceiver() {
        if (this.mConnectivityBroadcastReceiver.isRegistered()) {
            getReactApplicationContext().unregisterReceiver(this.mConnectivityBroadcastReceiver);
            this.mConnectivityBroadcastReceiver.setRegistered(false);
        }
    }

    private String getCurrentConnectionType() {
        try {
            NetworkInfo activeNetworkInfo = this.mConnectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isConnected()) {
                    if (ConnectivityManager.isNetworkTypeValid(activeNetworkInfo.getType())) {
                        return activeNetworkInfo.getTypeName().toUpperCase();
                    }
                    return "UNKNOWN";
                }
            }
            return "NONE";
        } catch (SecurityException unused) {
            this.mNoNetworkPermission = true;
            return "UNKNOWN";
        }
    }

    public void updateAndSendConnectionType() {
        String str;
        String currentConnectionType;
        String str2 = "unknown";
        try {
            NetworkInfo activeNetworkInfo = this.mConnectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isConnected()) {
                    switch (activeNetworkInfo.getType()) {
                        case 0:
                        case 4:
                            str2 = getEffectiveConnectionType(activeNetworkInfo);
                            str = "cellular";
                            break;
                        case 1:
                            str = "wifi";
                            break;
                        case 6:
                            str = "wimax";
                            break;
                        case 7:
                            str = "bluetooth";
                            break;
                        case 9:
                            str = "ethernet";
                            break;
                        default:
                            str = "unknown";
                            break;
                    }
                    currentConnectionType = getCurrentConnectionType();
                    if (str.equalsIgnoreCase(this.mConnectionType) || !str2.equalsIgnoreCase(this.mEffectiveConnectionType) || !currentConnectionType.equalsIgnoreCase(this.mConnectivityDeprecated)) {
                        this.mConnectionType = str;
                        this.mEffectiveConnectionType = str2;
                        this.mConnectivityDeprecated = currentConnectionType;
                        sendConnectivityChangedEvent();
                    }
                    return;
                }
            }
            str = "none";
        } catch (SecurityException unused) {
            this.mNoNetworkPermission = true;
            str = "unknown";
        }
        currentConnectionType = getCurrentConnectionType();
        if (str.equalsIgnoreCase(this.mConnectionType)) {
        }
        this.mConnectionType = str;
        this.mEffectiveConnectionType = str2;
        this.mConnectivityDeprecated = currentConnectionType;
        sendConnectivityChangedEvent();
    }

    @ReactMethod
    public void getCurrentConnectivity(Promise promise) {
        if (this.mNoNetworkPermission) {
            promise.reject("E_MISSING_PERMISSION", "To use NetInfo on Android, add the following to your AndroidManifest.xml:\n<uses-permission android:name=\"android.permission.ACCESS_NETWORK_STATE\" />", null);
        } else {
            promise.resolve(createConnectivityEventMap());
        }
    }

    @ReactMethod
    public void isConnectionMetered(Promise promise) {
        if (this.mNoNetworkPermission) {
            promise.reject("E_MISSING_PERMISSION", "To use NetInfo on Android, add the following to your AndroidManifest.xml:\n<uses-permission android:name=\"android.permission.ACCESS_NETWORK_STATE\" />", null);
        } else {
            promise.resolve(Boolean.valueOf(C0656a.m2837a(this.mConnectivityManager)));
        }
    }

    public NetInfoModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mConnectivityManager = (ConnectivityManager) reactApplicationContext.getSystemService("connectivity");
        this.mConnectivityBroadcastReceiver = new ConnectivityBroadcastReceiver();
    }

    private String getEffectiveConnectionType(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return "2g";
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
                return "3g";
            case 13:
            case 15:
                return "4g";
            default:
                return "unknown";
        }
    }
}
