package com.bytedance.apm.p236a.p462c;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* renamed from: com.bytedance.apm.a.c.b */
public final class C9552b {

    /* renamed from: a */
    private static String f26137a;

    /* renamed from: a */
    public static String m28307a(Context context) {
        return C9553c.m28309a(context);
    }

    /* renamed from: a */
    private static String m28306a() {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            StringBuilder sb = new StringBuilder("/proc/");
            sb.append(Process.myPid());
            sb.append("/cmdline");
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(sb.toString()), "iso-8859-1"));
            try {
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    int read = bufferedReader.read();
                    if (read > 0) {
                        sb2.append((char) read);
                    } else {
                        String sb3 = sb2.toString();
                        C9551a.m28305a(bufferedReader);
                        return sb3;
                    }
                }
            } catch (Throwable th) {
                BufferedReader bufferedReader3 = bufferedReader;
                th = th;
                bufferedReader2 = bufferedReader3;
                C9551a.m28305a(bufferedReader2);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            C9551a.m28305a(bufferedReader2);
            throw th;
        }
    }

    /* renamed from: b */
    public static String m28308b(Context context) {
        String str = f26137a;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            int myPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                for (RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                    if (runningAppProcessInfo.pid == myPid) {
                        String str2 = runningAppProcessInfo.processName;
                        f26137a = str2;
                        return str2;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        String a = m28306a();
        f26137a = a;
        if (a == null) {
            return "";
        }
        return f26137a;
    }
}
