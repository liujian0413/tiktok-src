package com.ttnet.org.chromium.base;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.ttnet.org.chromium.base.LifeCycleMonitor.AppStateListener;
import com.ttnet.org.chromium.base.annotations.JNINamespace;

@JNINamespace("base::android")
public class PowerMonitor implements AppStateListener {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static String CRONET_ACTION_BACK = null;
    public static String CRONET_ACTION_FORE = null;
    private static final String TAG = "PowerMonitor";
    public static String WSCHANNEL_ACTION_BACK;
    public static String WSCHANNEL_ACTION_FORE;
    private static LifeCycleMonitor mLifeCycleMonitor = new LifeCycleMonitor();
    public static long receive_back_action;
    public static long receive_fore_action;
    private static AppStateReceiver receiver;
    private static PowerMonitor sInstance;
    private boolean mIsBatteryPower;

    public static class AppStateReceiver extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
            long currentTimeMillis = System.currentTimeMillis();
            String action = intent.getAction();
            if (action.equals(PowerMonitor.CRONET_ACTION_FORE) || action.equals(PowerMonitor.WSCHANNEL_ACTION_FORE)) {
                long j = currentTimeMillis - PowerMonitor.receive_fore_action;
                PowerMonitor.receive_fore_action = currentTimeMillis;
                if (j > 10000) {
                    PowerMonitor.nativeOnResume();
                }
                return;
            }
            if (action.equals(PowerMonitor.CRONET_ACTION_BACK) || action.equals(PowerMonitor.WSCHANNEL_ACTION_BACK)) {
                long j2 = currentTimeMillis - PowerMonitor.receive_back_action;
                PowerMonitor.receive_back_action = currentTimeMillis;
                if (j2 > 10000) {
                    PowerMonitor.nativeOnSuspend();
                }
            }
        }
    }

    private PowerMonitor() {
    }

    private static native void nativeOnBatteryChargingChanged();

    public static native void nativeOnResume();

    public static native void nativeOnSuspend();

    public static void createForTests() {
        sInstance = new PowerMonitor();
    }

    private static boolean isBatteryPower() {
        if (sInstance == null) {
            create();
        }
        return sInstance.mIsBatteryPower;
    }

    public void onEnterToBackground() {
        Context applicationContext = ContextUtils.getApplicationContext();
        if (ProcessUtils.isMainProcess(applicationContext)) {
            Intent intent = new Intent();
            intent.setAction(CRONET_ACTION_BACK);
            applicationContext.sendBroadcast(intent);
        }
        nativeOnSuspend();
    }

    public void onEnterToForeground() {
        Context applicationContext = ContextUtils.getApplicationContext();
        if (ProcessUtils.isMainProcess(applicationContext)) {
            Intent intent = new Intent();
            intent.setAction(CRONET_ACTION_FORE);
            applicationContext.sendBroadcast(intent);
        }
        nativeOnResume();
    }

    public static void create() {
        ThreadUtils.assertOnUiThread();
        if (sInstance == null) {
            Context applicationContext = ContextUtils.getApplicationContext();
            sInstance = new PowerMonitor();
            Intent registerReceiver = applicationContext.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                onBatteryChargingChanged(registerReceiver);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(applicationContext.getPackageName());
            sb.append(".cronet.APP_BACKGROUND");
            CRONET_ACTION_BACK = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(applicationContext.getPackageName());
            sb2.append(".cronet.APP_FOREGROUND");
            CRONET_ACTION_FORE = sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(applicationContext.getPackageName());
            sb3.append(".wschannel.APP_BACKGROUND");
            WSCHANNEL_ACTION_BACK = sb3.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(applicationContext.getPackageName());
            sb4.append(".wschannel.APP_FOREGROUND");
            WSCHANNEL_ACTION_FORE = sb4.toString();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
            applicationContext.registerReceiver(new BroadcastReceiver() {
                public void onReceive(Context context, Intent intent) {
                    PowerMonitor.onBatteryChargingChanged(intent);
                }
            }, intentFilter);
            if (ProcessUtils.isMainProcess(applicationContext)) {
                Application application = (Application) applicationContext;
                mLifeCycleMonitor.setAppStateChangedListener(sInstance);
                application.registerActivityLifecycleCallbacks(mLifeCycleMonitor);
                return;
            }
            receiver = new AppStateReceiver();
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction(CRONET_ACTION_BACK);
            intentFilter2.addAction(CRONET_ACTION_FORE);
            intentFilter2.addAction(WSCHANNEL_ACTION_BACK);
            intentFilter2.addAction(WSCHANNEL_ACTION_FORE);
            applicationContext.registerReceiver(receiver, intentFilter2);
        }
    }

    public static void onBatteryChargingChanged(Intent intent) {
        int intExtra = intent.getIntExtra("plugged", -1);
        PowerMonitor powerMonitor = sInstance;
        boolean z = true;
        if (intExtra == 2 || intExtra == 1) {
            z = false;
        }
        powerMonitor.mIsBatteryPower = z;
        nativeOnBatteryChargingChanged();
    }
}
