package com.bytedance.framwork.core.sdkmonitor;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitor.IGetCommonParams;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public class SDKMonitorUtils {
    private static ConcurrentHashMap<String, SDKMonitor> sAidToMonitorCommon = new ConcurrentHashMap<>();

    public static SDKMonitor getInstance(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (sAidToMonitorCommon.get(str) == null) {
                synchronized (SDKMonitorUtils.class) {
                    if (sAidToMonitorCommon.get(str) == null) {
                        sAidToMonitorCommon.put(str, new SDKMonitor(str));
                    }
                }
            }
            return (SDKMonitor) sAidToMonitorCommon.get(str);
        }
        throw new IllegalArgumentException("param 'aid' is not allowed to assigned empty string");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0016, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void setConfigUrl(java.lang.String r2, java.util.List<java.lang.String> r3) {
        /*
            java.lang.Class<com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils> r0 = com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils.class
            monitor-enter(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0017 }
            if (r1 != 0) goto L_0x0015
            boolean r1 = com.bytedance.framwork.core.sdkmonitor.C10245d.m30370a(r3)     // Catch:{ all -> 0x0017 }
            if (r1 == 0) goto L_0x0010
            goto L_0x0015
        L_0x0010:
            com.bytedance.framwork.core.sdkmonitor.SDKMonitor.setConfigUrl(r2, r3)     // Catch:{ all -> 0x0017 }
            monitor-exit(r0)
            return
        L_0x0015:
            monitor-exit(r0)
            return
        L_0x0017:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils.setConfigUrl(java.lang.String, java.util.List):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0016, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void setDeafultReportUrl(java.lang.String r2, java.util.List<java.lang.String> r3) {
        /*
            java.lang.Class<com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils> r0 = com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils.class
            monitor-enter(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0017 }
            if (r1 != 0) goto L_0x0015
            boolean r1 = com.bytedance.framwork.core.sdkmonitor.C10245d.m30370a(r3)     // Catch:{ all -> 0x0017 }
            if (r1 == 0) goto L_0x0010
            goto L_0x0015
        L_0x0010:
            com.bytedance.framwork.core.sdkmonitor.SDKMonitor.setDeafultReportUrl(r2, r3)     // Catch:{ all -> 0x0017 }
            monitor-exit(r0)
            return
        L_0x0015:
            monitor-exit(r0)
            return
        L_0x0017:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils.setDeafultReportUrl(java.lang.String, java.util.List):void");
    }

    public static synchronized void init(Context context, String str, JSONObject jSONObject, IGetCommonParams iGetCommonParams) {
        synchronized (SDKMonitorUtils.class) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("param 'aid' is not allowed to assigned empty string");
            } else if (jSONObject == null) {
                throw new IllegalArgumentException("param 'headerInfo' is not allowed to be null");
            } else if (sAidToMonitorCommon.get(str) == null) {
                SDKMonitor sDKMonitor = new SDKMonitor(str);
                sDKMonitor.init(context, jSONObject, iGetCommonParams);
                sAidToMonitorCommon.put(str, sDKMonitor);
            }
        }
    }
}
