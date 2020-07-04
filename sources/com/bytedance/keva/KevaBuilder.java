package com.bytedance.keva;

import android.content.Context;
import java.io.File;
import java.util.concurrent.Executor;

public class KevaBuilder {
    private static KevaBuilder mInstance = new KevaBuilder();
    Context mContext;
    Executor mExecutor;
    KevaMonitor mMonitor;
    String mPortedRepoName;
    File mWorkDir;

    static void clearInstance() {
        mInstance = null;
    }

    public static KevaBuilder getInstance() {
        if (mInstance != null) {
            return mInstance;
        }
        return new KevaBuilder();
    }

    public KevaBuilder setContext(Context context) {
        this.mContext = context;
        return this;
    }

    public KevaBuilder setExecutor(Executor executor) {
        this.mExecutor = executor;
        return this;
    }

    public KevaBuilder setMonitor(KevaMonitor kevaMonitor) {
        this.mMonitor = kevaMonitor;
        return this;
    }

    public KevaBuilder setPortedRepoName(String str) {
        this.mPortedRepoName = str;
        return this;
    }

    public KevaBuilder setWorkDir(File file) {
        if (!file.exists() && !file.mkdirs()) {
            return this;
        }
        this.mWorkDir = file;
        return this;
    }
}
