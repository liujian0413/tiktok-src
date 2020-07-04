package com.ttnet.org.chromium.net;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import com.ttnet.org.chromium.base.ApplicationStatus;
import com.ttnet.org.chromium.base.ApplicationStatus.ApplicationStateListener;
import com.ttnet.org.chromium.base.ContextUtils;
import com.ttnet.org.chromium.base.ThreadUtils;
import com.ttnet.org.chromium.base.annotations.JNINamespace;

@JNINamespace("net::android")
public class AndroidCellularSignalStrength {
    private static final AndroidCellularSignalStrength sInstance = new AndroidCellularSignalStrength();
    public volatile int mSignalLevel = Integer.MIN_VALUE;

    class CellStateListener extends PhoneStateListener implements ApplicationStateListener {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final TelephonyManager mTelephonyManager = ((TelephonyManager) ContextUtils.getApplicationContext().getSystemService("phone"));

        static {
            Class<AndroidCellularSignalStrength> cls = AndroidCellularSignalStrength.class;
        }

        private void register() {
            this.mTelephonyManager.listen(this, 256);
        }

        private void unregister() {
            AndroidCellularSignalStrength.this.mSignalLevel = Integer.MIN_VALUE;
            this.mTelephonyManager.listen(this, 0);
        }

        public void onApplicationStateChange(int i) {
            if (i == 1) {
                register();
                return;
            }
            if (i == 2) {
                unregister();
            }
        }

        public void onSignalStrengthsChanged(SignalStrength signalStrength) {
            if (ApplicationStatus.getStateForApplication() == 1) {
                try {
                    AndroidCellularSignalStrength.this.mSignalLevel = signalStrength.getLevel();
                } catch (SecurityException unused) {
                    AndroidCellularSignalStrength.this.mSignalLevel = Integer.MIN_VALUE;
                }
            }
        }

        CellStateListener() {
            ThreadUtils.assertOnBackgroundThread();
            if (this.mTelephonyManager.getSimState() == 5) {
                ApplicationStatus.registerApplicationStateListener(this);
                onApplicationStateChange(ApplicationStatus.getStateForApplication());
            }
        }
    }

    private static int getSignalStrengthLevel() {
        return sInstance.mSignalLevel;
    }

    private AndroidCellularSignalStrength() {
        if (VERSION.SDK_INT >= 23) {
            HandlerThread handlerThread = new HandlerThread("AndroidCellularSignalStrength");
            handlerThread.start();
            new Handler(handlerThread.getLooper()).post(new Runnable() {
                public void run() {
                    new CellStateListener();
                }
            });
        }
    }
}
