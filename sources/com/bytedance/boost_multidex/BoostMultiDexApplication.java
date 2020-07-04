package com.bytedance.boost_multidex;

import android.app.Application;
import android.content.Context;

public class BoostMultiDexApplication extends Application {
    private boolean isOptProcess;

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        this.isOptProcess = BoostMultiDex.isOptimizeProcess(Utility.getCurProcessName(context));
        if (this.isOptProcess) {
            BoostMultiDex.install(context);
        }
    }

    public void onCreate() {
        super.onCreate();
        if (!this.isOptProcess) {
        }
    }
}
