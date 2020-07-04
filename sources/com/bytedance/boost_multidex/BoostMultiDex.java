package com.bytedance.boost_multidex;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import com.taobao.android.dexposed.ClassUtils;
import java.io.File;
import java.util.StringTokenizer;

public class BoostMultiDex {
    public static Result install(Context context) {
        return install(context, null);
    }

    public static Result install(Context context, Monitor monitor) {
        String sb;
        Monitor.init(monitor);
        Monitor monitor2 = Monitor.get();
        monitor2.logInfo("BoostMultiDex Installing, version is 1.0.1");
        if (isVMMultidexCapable(System.getProperty("java.vm.version"))) {
            sb = "VM has support, BoostMultiDex support library is disabled.";
        } else if (VERSION.SDK_INT < 14) {
            StringBuilder sb2 = new StringBuilder("BoostMultiDex installation failed. SDK ");
            sb2.append(VERSION.SDK_INT);
            sb2.append(" is unsupported. Min SDK version is 14");
            sb2.append(ClassUtils.PACKAGE_SEPARATOR);
            sb = sb2.toString();
        } else {
            Result result = Result.get();
            try {
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                if (applicationInfo != null) {
                    File file = new File(applicationInfo.sourceDir);
                    String processName = monitor2.getProcessName();
                    if (processName != null) {
                        processName = Utility.getCurProcessName(context);
                    }
                    if (Utility.isOptimizeProcess(processName)) {
                        new DexInstallProcessor().doInstallationInOptProcess(context, file);
                        return null;
                    }
                    new DexInstallProcessor().doInstallation(context, file, result);
                    monitor2.logInfo("install done");
                    return result;
                }
                throw new RuntimeException("No ApplicationInfo available, i.e. running on a test Context: BoostMultiDex support library is disabled.");
            } catch (Throwable th) {
                monitor2.logError("BoostMultiDex installation failure", th);
                result.setFatalThrowable(th);
            }
        }
        monitor2.logInfo(sb);
        return null;
    }

    public static boolean isOptimizeProcess(String str) {
        return Utility.isOptimizeProcess(str);
    }

    private static boolean isVMMultidexCapable(String str) {
        boolean z = false;
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ClassUtils.PACKAGE_SEPARATOR);
            String str2 = null;
            String nextToken = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
            if (stringTokenizer.hasMoreTokens()) {
                str2 = stringTokenizer.nextToken();
            }
            if (!(nextToken == null || str2 == null)) {
                try {
                    int parseInt = Integer.parseInt(nextToken);
                    int parseInt2 = Integer.parseInt(str2);
                    if (parseInt > 2 || (parseInt == 2 && parseInt2 > 0)) {
                        z = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        Monitor monitor = Monitor.get();
        StringBuilder sb = new StringBuilder("VM with version ");
        sb.append(str);
        sb.append(z ? " has support" : " does not have support");
        monitor.logInfo(sb.toString());
        return z;
    }
}
