package com.ttnet.org.chromium.net;

import android.telephony.CellLocation;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyManager;
import com.ttnet.org.chromium.base.ContextUtils;
import com.ttnet.org.chromium.base.ThreadUtils;

public class AndroidTelephonyManagerBridge {
    private static volatile AndroidTelephonyManagerBridge sInstance;
    private Listener mListener;
    private volatile String mNetworkCountryIso;
    private volatile String mNetworkOperator;
    private volatile String mSimOperator;

    class Listener extends PhoneStateListener {
        private ServiceState mServiceState;

        private Listener() {
        }

        public void onServiceStateChanged(ServiceState serviceState) {
            if (this.mServiceState == null || !this.mServiceState.equals(serviceState)) {
                this.mServiceState = serviceState;
                AndroidTelephonyManagerBridge.this.update(AndroidTelephonyManagerBridge.getTelephonyManager());
            }
        }
    }

    private AndroidTelephonyManagerBridge() {
    }

    private static AndroidTelephonyManagerBridge create() {
        AndroidTelephonyManagerBridge androidTelephonyManagerBridge = new AndroidTelephonyManagerBridge();
        ThreadUtils.runOnUiThread((Runnable) new AndroidTelephonyManagerBridge$$Lambda$0(androidTelephonyManagerBridge));
        return androidTelephonyManagerBridge;
    }

    public static TelephonyManager getTelephonyManager() {
        return (TelephonyManager) ContextUtils.getApplicationContext().getSystemService("phone");
    }

    public CellLocation getCellLocation() {
        TelephonyManager telephonyManager = getTelephonyManager();
        if (telephonyManager == null) {
            return null;
        }
        return telephonyManager.getCellLocation();
    }

    public int getPhoneType() {
        TelephonyManager telephonyManager = getTelephonyManager();
        if (telephonyManager == null) {
            return -1;
        }
        return telephonyManager.getPhoneType();
    }

    public static AndroidTelephonyManagerBridge getInstance() {
        AndroidTelephonyManagerBridge androidTelephonyManagerBridge = sInstance;
        if (androidTelephonyManagerBridge == null) {
            synchronized (AndroidTelephonyManagerBridge.class) {
                androidTelephonyManagerBridge = sInstance;
                if (androidTelephonyManagerBridge == null) {
                    androidTelephonyManagerBridge = create();
                    sInstance = androidTelephonyManagerBridge;
                }
            }
        }
        return androidTelephonyManagerBridge;
    }

    public String getNetworkCountryIso() {
        if (this.mNetworkCountryIso == null) {
            TelephonyManager telephonyManager = getTelephonyManager();
            if (telephonyManager == null) {
                return "";
            }
            this.mNetworkCountryIso = telephonyManager.getNetworkCountryIso();
        }
        return this.mNetworkCountryIso;
    }

    public String getNetworkOperator() {
        if (this.mNetworkOperator == null) {
            TelephonyManager telephonyManager = getTelephonyManager();
            if (telephonyManager == null) {
                return "";
            }
            this.mNetworkOperator = telephonyManager.getNetworkOperator();
        }
        return this.mNetworkOperator;
    }

    public String getSimOperator() {
        if (this.mSimOperator == null) {
            TelephonyManager telephonyManager = getTelephonyManager();
            if (telephonyManager == null) {
                return "";
            }
            this.mSimOperator = telephonyManager.getSimOperator();
        }
        return this.mSimOperator;
    }

    static final /* synthetic */ void lambda$create$0$AndroidTelephonyManagerBridge(AndroidTelephonyManagerBridge androidTelephonyManagerBridge) {
        TelephonyManager telephonyManager = getTelephonyManager();
        if (telephonyManager != null) {
            androidTelephonyManagerBridge.listenTelephonyServiceState(telephonyManager);
        }
    }

    private void listenTelephonyServiceState(TelephonyManager telephonyManager) {
        ThreadUtils.assertOnUiThread();
        this.mListener = new Listener();
        telephonyManager.listen(this.mListener, 1);
    }

    public void update(TelephonyManager telephonyManager) {
        if (telephonyManager != null) {
            this.mNetworkCountryIso = telephonyManager.getNetworkCountryIso();
            this.mNetworkOperator = telephonyManager.getNetworkOperator();
            this.mSimOperator = telephonyManager.getSimOperator();
        }
    }
}
