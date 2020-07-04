package com.bytedance.neverland.internal;

import android.os.Build;
import android.os.Build.VERSION;
import com.bytedance.neverland.Config;
import com.bytedance.neverland.network.Reporter;
import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class CrashHandler implements UncaughtExceptionHandler {
    public CountDownLatch countDownLatch = new CountDownLatch(2);
    public File javaCrashDir;
    private File nativeCrashDir;
    public NeverlandImpl neverland;
    private UncaughtExceptionHandler originHandler;

    private static native void initialize(String str);

    static native void setEnableCatchNativeCrash(boolean z);

    /* access modifiers changed from: 0000 */
    public int checkCrashFiles() {
        int checkNativeCrashFiles = checkNativeCrashFiles();
        checkJavaCrashFiles();
        return checkNativeCrashFiles;
    }

    public int obtainNativeCrashFilesNum() {
        File[] listFiles = this.nativeCrashDir.listFiles();
        if (listFiles != null) {
            return listFiles.length;
        }
        return 0;
    }

    private int checkJavaCrashFiles() {
        final File[] listFiles = this.javaCrashDir.listFiles();
        new Thread(new Runnable() {
            public void run() {
                int i;
                File[] listFiles;
                if (listFiles.length > 20) {
                    i = listFiles.length - 20;
                } else {
                    i = 0;
                }
                for (File file : CrashHandler.this.javaCrashDir.listFiles()) {
                    if (file.isFile() && file.getName().endsWith(".jc")) {
                        int i2 = i - 1;
                        if (i > 0) {
                            file.delete();
                        } else if (Reporter.report(5, Utility.readFile(file.getPath()))) {
                            file.delete();
                        }
                        i = i2;
                    }
                }
                CrashHandler.this.countDownLatch.countDown();
            }
        }).start();
        return listFiles.length;
    }

    private int checkNativeCrashFiles() {
        final File[] listFiles = this.nativeCrashDir.listFiles();
        new Thread(new Runnable() {
            public void run() {
                int i;
                File[] fileArr;
                if (listFiles.length > 20) {
                    i = listFiles.length - 20;
                } else {
                    i = 0;
                }
                int i2 = i;
                for (File file : listFiles) {
                    if (file.isFile() && file.getName().endsWith(".nc")) {
                        int i3 = i2 - 1;
                        if (i2 > 0) {
                            file.delete();
                        } else {
                            if (CrashHandler.this.obtainCommonReporter().addParams("exception_type", "native").addParams("timestamp", Utility.getReadableTime(Long.valueOf(file.getName().substring(0, file.getName().length() - 3)).longValue())).addParams("exception_msg", CrashHandler.this.obtainCompressedMsg(Utility.readFile(file.getPath()).replace(CrashHandler.this.neverland.packageName, "PN"))).report(5)) {
                                file.delete();
                            }
                        }
                        i2 = i3;
                    }
                }
                CrashHandler.this.countDownLatch.countDown();
            }
        }).start();
        return listFiles.length;
    }

    public Reporter obtainCommonReporter() {
        return new Reporter().addParams("app_id", Integer.valueOf(this.neverland.appId)).addParams("device_platform", "android").addParams("os_version_code", Integer.valueOf(VERSION.SDK_INT)).addParams("device_type", Build.MODEL).addParams("device_fingerprint", Build.FINGERPRINT).addParams("sdk_int", VERSION.RELEASE).addParams("random_id", this.neverland.randomId).addParams("device_id", this.neverland.deviceId).addParams("package_name", this.neverland.packageName).addParams("app_version", this.neverland.version).addParams("app_detail_version", this.neverland.detailVersion).addParams("is_first_launch", Boolean.valueOf(this.neverland.isFirstLaunch())).addParams("unfatal_exception_msg", this.neverland.unFatalExceptions).addParams("multidex_cost_time", Long.valueOf(this.neverland.costMultiDex));
    }

    private String obtainStackString(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        C6497a.m20180a(th, new PrintWriter(stringWriter, true));
        return stringWriter.getBuffer().toString();
    }

    public String obtainCompressedMsg(String str) {
        String compress = Utility.compress(str);
        if (compress == null || compress.length() > 18000) {
            return Utility.compress(str.substring(0, 16000));
        }
        return compress;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        if (this.neverland.enable) {
            handleJavaCrash(thread, th);
        }
        this.originHandler.uncaughtException(thread, th);
    }

    CrashHandler(NeverlandImpl neverlandImpl, Config config) {
        if (this.originHandler == null) {
            this.originHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(this);
            this.neverland = neverlandImpl;
            this.javaCrashDir = new File(neverlandImpl.filesDirPath, "java");
            if (!this.javaCrashDir.exists()) {
                this.javaCrashDir.mkdirs();
            }
            try {
                config.loadLibrary("neverland");
                this.nativeCrashDir = new File(neverlandImpl.filesDirPath, "native");
                if (!this.nativeCrashDir.exists()) {
                    this.nativeCrashDir.mkdirs();
                }
                initialize(this.nativeCrashDir.getPath());
            } catch (Throwable unused) {
            }
        }
    }

    private void handleJavaCrash(Thread thread, Throwable th) {
        Reporter addParams = obtainCommonReporter().addParams("timestamp", Utility.getReadableTime(System.currentTimeMillis())).addParams("exception_msg", obtainCompressedMsg(obtainStackString(th))).addParams("exception_type", "java");
        try {
            JSONObject jSONObject = this.neverland.jsonObjectMultiDex;
            if (jSONObject != null) {
                addParams.addParams("extral", jSONObject.toString(3));
            }
        } catch (Exception unused) {
        }
        String buildParamsString = addParams.buildParamsString();
        File file = this.javaCrashDir;
        StringBuilder sb = new StringBuilder();
        sb.append(System.currentTimeMillis());
        sb.append(".jc");
        File file2 = new File(file, sb.toString());
        boolean saveStringToFile = Utility.saveStringToFile(file2, buildParamsString);
        if (addParams.report(2) && saveStringToFile) {
            file2.delete();
        }
        try {
            this.countDownLatch.await(4, TimeUnit.SECONDS);
        } catch (InterruptedException unused2) {
        }
    }
}
