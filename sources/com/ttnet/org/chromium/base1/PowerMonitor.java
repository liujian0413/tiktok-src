package com.ttnet.org.chromium.base1;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import com.ttnet.org.chromium.base1.LifeCycleMonitor.AppStateListener;
import com.ttnet.org.chromium.base1.annotations.JNINamespace;

@JNINamespace("base::android")
public class PowerMonitor implements AppStateListener {
    public static String CRONET_ACTION_BACK = null;
    public static String CRONET_ACTION_FORE = null;
    private static final String TAG = "PowerMonitor";
    public static String WSCHANNEL_ACTION_BACK;
    public static String WSCHANNEL_ACTION_FORE;
    private static Context mContext;
    private static LifeCycleMonitor mLifeCycleMonitor = new LifeCycleMonitor();
    public static long receive_back_action = 0;
    public static long receive_fore_action = 0;
    private static AppStateReceiver receiver;
    private static PowerMonitor sInstance;
    private final Handler mHandler;
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

    static class LazyHolder {
        public static final PowerMonitor INSTANCE = new PowerMonitor();

        private LazyHolder() {
        }
    }

    private static native void nativeOnBatteryChargingChanged();

    public static native void nativeOnResume();

    public static native void nativeOnSuspend();

    private static boolean isBatteryPower() {
        return sInstance.mIsBatteryPower;
    }

    private PowerMonitor() {
        this.mHandler = new Handler(Looper.getMainLooper());
    }

    public void onEnterToBackground() {
        if (ProcessUtils.isMainProcess(mContext)) {
            Intent intent = new Intent();
            intent.setAction(CRONET_ACTION_BACK);
            mContext.sendBroadcast(intent);
        }
        nativeOnSuspend();
    }

    public void onEnterToForeground() {
        if (ProcessUtils.isMainProcess(mContext)) {
            Intent intent = new Intent();
            intent.setAction(CRONET_ACTION_FORE);
            mContext.sendBroadcast(intent);
        }
        nativeOnResume();
    }

    public static void createForTests(Context context) {
        sInstance = LazyHolder.INSTANCE;
    }

    public static void onBatteryChargingChanged(Intent intent) {
        if (sInstance != null) {
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

    public static void create(Context context) {
        mContext = context.getApplicationContext();
        StringBuilder sb = new StringBuilder();
        sb.append(mContext.getPackageName());
        sb.append(".cronet.APP_BACKGROUND");
        CRONET_ACTION_BACK = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(mContext.getPackageName());
        sb2.append(".cronet.APP_FOREGROUND");
        CRONET_ACTION_FORE = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(mContext.getPackageName());
        sb3.append(".wschannel.APP_BACKGROUND");
        WSCHANNEL_ACTION_BACK = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(mContext.getPackageName());
        sb4.append(".wschannel.APP_FOREGROUND");
        WSCHANNEL_ACTION_FORE = sb4.toString();
        if (sInstance == null) {
            sInstance = LazyHolder.INSTANCE;
            Intent registerReceiver = mContext.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                onBatteryChargingChanged(registerReceiver);
            }
            if (ProcessUtils.isMainProcess(mContext)) {
                Application application = (Application) mContext;
                mLifeCycleMonitor.setAppStateChangedListener(sInstance);
                application.registerActivityLifecycleCallbacks(mLifeCycleMonitor);
                return;
            }
            receiver = new AppStateReceiver();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(CRONET_ACTION_BACK);
            intentFilter.addAction(CRONET_ACTION_FORE);
            intentFilter.addAction(WSCHANNEL_ACTION_BACK);
            intentFilter.addAction(WSCHANNEL_ACTION_FORE);
            mContext.registerReceiver(receiver, intentFilter);
        }
    }
}
