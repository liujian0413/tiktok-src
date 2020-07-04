package com.p280ss.android.push;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.Service;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Process;
import android.text.TextUtils;
import android.util.Pair;
import com.p280ss.android.pushmanager.thirdparty.IPushDepend;
import com.p280ss.android.pushmanager.thirdparty.ISendTokenCallBack;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.zip.DataFormatException;
import org.json.JSONObject;

/* renamed from: com.ss.android.push.PushDependManager */
public class PushDependManager implements IPushDepend {
    private static PushDependManager sPushDependManager;
    private IPushDepend mPushDependAdapter;
    private String sCurProcessName;

    private PushDependManager() {
    }

    public boolean loggerDebug() {
        if (this.mPushDependAdapter != null) {
            return this.mPushDependAdapter.loggerDebug();
        }
        return false;
    }

    public static PushDependManager inst() {
        if (sPushDependManager == null) {
            synchronized (PushDependManager.class) {
                if (sPushDependManager == null) {
                    sPushDependManager = new PushDependManager();
                }
            }
        }
        return sPushDependManager;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0066 A[SYNTHETIC, Splitter:B:20:0x0066] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006d A[SYNTHETIC, Splitter:B:28:0x006d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String getCurProcessNameFromProc() {
        /*
            r7 = this;
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x006a, all -> 0x0063 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Throwable -> 0x006a, all -> 0x0063 }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Throwable -> 0x006a, all -> 0x0063 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x006a, all -> 0x0063 }
            java.lang.String r5 = "/proc/"
            r4.<init>(r5)     // Catch:{ Throwable -> 0x006a, all -> 0x0063 }
            int r5 = android.os.Process.myPid()     // Catch:{ Throwable -> 0x006a, all -> 0x0063 }
            r4.append(r5)     // Catch:{ Throwable -> 0x006a, all -> 0x0063 }
            java.lang.String r5 = "/cmdline"
            r4.append(r5)     // Catch:{ Throwable -> 0x006a, all -> 0x0063 }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x006a, all -> 0x0063 }
            r3.<init>(r4)     // Catch:{ Throwable -> 0x006a, all -> 0x0063 }
            java.lang.String r4 = "iso-8859-1"
            r2.<init>(r3, r4)     // Catch:{ Throwable -> 0x006a, all -> 0x0063 }
            r1.<init>(r2)     // Catch:{ Throwable -> 0x006a, all -> 0x0063 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x006b, all -> 0x005e }
            r2.<init>()     // Catch:{ Throwable -> 0x006b, all -> 0x005e }
        L_0x002e:
            int r3 = r1.read()     // Catch:{ Throwable -> 0x006b, all -> 0x005e }
            if (r3 <= 0) goto L_0x0039
            char r3 = (char) r3     // Catch:{ Throwable -> 0x006b, all -> 0x005e }
            r2.append(r3)     // Catch:{ Throwable -> 0x006b, all -> 0x005e }
            goto L_0x002e
        L_0x0039:
            boolean r3 = r7.loggerDebug()     // Catch:{ Throwable -> 0x006b, all -> 0x005e }
            if (r3 == 0) goto L_0x0056
            java.lang.String r3 = "Process"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x006b, all -> 0x005e }
            java.lang.String r5 = "get processName = "
            r4.<init>(r5)     // Catch:{ Throwable -> 0x006b, all -> 0x005e }
            java.lang.String r5 = r2.toString()     // Catch:{ Throwable -> 0x006b, all -> 0x005e }
            r4.append(r5)     // Catch:{ Throwable -> 0x006b, all -> 0x005e }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x006b, all -> 0x005e }
            r7.loggerD(r3, r4)     // Catch:{ Throwable -> 0x006b, all -> 0x005e }
        L_0x0056:
            java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x006b, all -> 0x005e }
            r1.close()     // Catch:{ Exception -> 0x005d }
        L_0x005d:
            return r2
        L_0x005e:
            r0 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
            goto L_0x0064
        L_0x0063:
            r1 = move-exception
        L_0x0064:
            if (r0 == 0) goto L_0x0069
            r0.close()     // Catch:{ Exception -> 0x0069 }
        L_0x0069:
            throw r1
        L_0x006a:
            r1 = r0
        L_0x006b:
            if (r1 == 0) goto L_0x0070
            r1.close()     // Catch:{ Exception -> 0x0070 }
        L_0x0070:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.push.PushDependManager.getCurProcessNameFromProc():java.lang.String");
    }

    public void setAdapter(IPushDepend iPushDepend) {
        this.mPushDependAdapter = iPushDepend;
    }

    public void executeAsyncTask(AsyncTask asyncTask) {
        if (this.mPushDependAdapter != null) {
            this.mPushDependAdapter.executeAsyncTask(asyncTask);
        }
    }

    public Pair<String, String> getPushConfig(int i) {
        if (this.mPushDependAdapter != null) {
            return this.mPushDependAdapter.getPushConfig(i);
        }
        return null;
    }

    public void hackJobHandler(Service service) {
        if (this.mPushDependAdapter != null) {
            this.mPushDependAdapter.hackJobHandler(service);
        }
    }

    public boolean isAllowPushService(int i) {
        if (this.mPushDependAdapter != null) {
            return this.mPushDependAdapter.isAllowPushService(i);
        }
        return false;
    }

    public void tryHookInit(Context context) {
        if (this.mPushDependAdapter != null) {
            this.mPushDependAdapter.tryHookInit(context);
        }
    }

    public List<String> getWakeupBlacklistPkg(Context context) {
        if (this.mPushDependAdapter != null) {
            return this.mPushDependAdapter.getWakeupBlacklistPkg(context);
        }
        return new ArrayList();
    }

    public boolean isMainProcess(Context context) {
        String curProcessName = getCurProcessName(context);
        if ((curProcessName == null || !curProcessName.contains(":")) && curProcessName != null && curProcessName.equals(context.getPackageName())) {
            return true;
        }
        return false;
    }

    public String getCurProcessName(Context context) {
        String str = this.sCurProcessName;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            int myPid = Process.myPid();
            for (RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    if (loggerDebug()) {
                        StringBuilder sb = new StringBuilder("processName = ");
                        sb.append(runningAppProcessInfo.processName);
                        loggerD("Process", sb.toString());
                    }
                    this.sCurProcessName = runningAppProcessInfo.processName;
                    return this.sCurProcessName;
                }
            }
        } catch (Exception unused) {
        }
        this.sCurProcessName = getCurProcessNameFromProc();
        return this.sCurProcessName;
    }

    public JSONObject getMessage(byte[] bArr, boolean z) throws DataFormatException, IOException {
        if (this.mPushDependAdapter != null) {
            return this.mPushDependAdapter.getMessage(bArr, z);
        }
        return null;
    }

    public String getToken(Context context, int i) {
        if (this.mPushDependAdapter != null) {
            return this.mPushDependAdapter.getToken(context, i);
        }
        return null;
    }

    public void loggerD(String str, String str2) {
        if (this.mPushDependAdapter != null) {
            this.mPushDependAdapter.loggerD(str, str2);
        }
    }

    public void onNotificationArrived(Context context, JSONObject jSONObject) {
        if (this.mPushDependAdapter != null) {
            this.mPushDependAdapter.onNotificationArrived(context, jSONObject);
        }
    }

    public void saveMapToProvider(Context context, Map<String, ?> map) {
        if (this.mPushDependAdapter != null) {
            this.mPushDependAdapter.saveMapToProvider(context, map);
        }
    }

    public void sendToken(Context context, ISendTokenCallBack iSendTokenCallBack) {
        if (this.mPushDependAdapter != null) {
            this.mPushDependAdapter.sendToken(context, iSendTokenCallBack);
        }
    }

    public Boolean getProviderBoolean(Context context, String str, Boolean bool) {
        if (this.mPushDependAdapter != null) {
            return this.mPushDependAdapter.getProviderBoolean(context, str, bool);
        }
        return bool;
    }

    public int getProviderInt(Context context, String str, int i) {
        if (this.mPushDependAdapter != null) {
            return this.mPushDependAdapter.getProviderInt(context, str, i);
        }
        return i;
    }

    public long getProviderLong(Context context, String str, long j) {
        if (this.mPushDependAdapter != null) {
            return this.mPushDependAdapter.getProviderLong(context, str, j);
        }
        return j;
    }

    public String getProviderString(Context context, String str, String str2) {
        if (this.mPushDependAdapter != null) {
            return this.mPushDependAdapter.getProviderString(context, str, str2);
        }
        return str2;
    }

    public void sendMonitor(Context context, String str, JSONObject jSONObject) {
        if (this.mPushDependAdapter != null) {
            this.mPushDependAdapter.sendMonitor(context, str, jSONObject);
        }
    }

    public void onClickNotPassThroughNotification(Context context, int i, String str, int i2, String str2) {
        if (this.mPushDependAdapter != null) {
            this.mPushDependAdapter.onClickNotPassThroughNotification(context, i, str, i2, str2);
        }
    }

    public void logEvent(Context context, String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
        if (this.mPushDependAdapter != null) {
            this.mPushDependAdapter.logEvent(context, str, str2, str3, j, j2, jSONObject);
        }
    }
}
