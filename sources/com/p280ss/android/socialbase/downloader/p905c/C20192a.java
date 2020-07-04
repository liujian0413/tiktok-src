package com.p280ss.android.socialbase.downloader.p905c;

import com.p280ss.android.socialbase.downloader.depend.IDownloadMonitorDepend;
import com.p280ss.android.socialbase.downloader.exception.BaseException;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import org.json.JSONObject;

/* renamed from: com.ss.android.socialbase.downloader.c.a */
public final class C20192a {
    /* renamed from: a */
    public static void m66504a(IDownloadMonitorDepend iDownloadMonitorDepend, DownloadInfo downloadInfo, BaseException baseException, int i) {
        if (iDownloadMonitorDepend != null) {
            try {
                JSONObject a = m66503a(iDownloadMonitorDepend.getEventPage(), downloadInfo, baseException, i);
                if (a == null) {
                    a = new JSONObject();
                }
                iDownloadMonitorDepend.monitorLogSend(a);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:5|6|7|(2:9|10)|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002c */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static org.json.JSONObject m66503a(java.lang.String r8, com.p280ss.android.socialbase.downloader.model.DownloadInfo r9, com.p280ss.android.socialbase.downloader.exception.BaseException r10, int r11) {
        /*
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x01a0 }
            r0.<init>()     // Catch:{ JSONException -> 0x01a0 }
            com.ss.android.socialbase.downloader.downloader.p r1 = com.p280ss.android.socialbase.downloader.downloader.C20269b.m66747f()     // Catch:{ JSONException -> 0x01a2 }
            java.lang.String r2 = ""
            java.lang.String r3 = ""
            java.lang.String r4 = ""
            r5 = 0
            if (r1 == 0) goto L_0x0034
            java.lang.String r2 = r1.mo54460b()     // Catch:{ JSONException -> 0x01a2 }
            boolean r4 = android.text.TextUtils.isDigitsOnly(r2)     // Catch:{ Exception -> 0x002c }
            if (r4 == 0) goto L_0x002c
            java.lang.Long r4 = java.lang.Long.valueOf(r2)     // Catch:{ Exception -> 0x002c }
            long r4 = r4.longValue()     // Catch:{ Exception -> 0x002c }
            r6 = 100
            long r4 = r4 % r6
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x002c }
            r3 = r4
        L_0x002c:
            java.lang.String r4 = r1.mo54459a()     // Catch:{ JSONException -> 0x01a2 }
            int r5 = r1.mo54461c()     // Catch:{ JSONException -> 0x01a2 }
        L_0x0034:
            java.lang.String r1 = "event_page"
            r0.put(r1, r8)     // Catch:{ JSONException -> 0x01a2 }
            java.lang.String r8 = "app_id"
            r0.put(r8, r4)     // Catch:{ JSONException -> 0x01a2 }
            java.lang.String r8 = "device_id"
            r0.put(r8, r2)     // Catch:{ JSONException -> 0x01a2 }
            java.lang.String r8 = "device_id_postfix"
            r0.put(r8, r3)     // Catch:{ JSONException -> 0x01a2 }
            java.lang.String r8 = "update_version"
            r0.put(r8, r5)     // Catch:{ JSONException -> 0x01a2 }
            java.lang.String r8 = "download_status"
            r0.put(r8, r11)     // Catch:{ JSONException -> 0x01a2 }
            if (r9 == 0) goto L_0x018b
            java.lang.String r8 = "download_id"
            int r11 = r9.getId()     // Catch:{ JSONException -> 0x01a2 }
            r0.put(r8, r11)     // Catch:{ JSONException -> 0x01a2 }
            java.lang.String r8 = "name"
            java.lang.String r11 = r9.getName()     // Catch:{ JSONException -> 0x01a2 }
            r0.put(r8, r11)     // Catch:{ JSONException -> 0x01a2 }
            java.lang.String r8 = "url"
            java.lang.String r11 = r9.getUrl()     // Catch:{ JSONException -> 0x01a2 }
            r0.put(r8, r11)     // Catch:{ JSONException -> 0x01a2 }
            java.lang.String r8 = "download_time"
            long r1 = r9.getDownloadTime()     // Catch:{ JSONException -> 0x01a2 }
            r0.put(r8, r1)     // Catch:{ JSONException -> 0x01a2 }
            java.lang.String r8 = "cur_bytes"
            long r1 = r9.getCurBytes()     // Catch:{ JSONException -> 0x01a2 }
            r0.put(r8, r1)     // Catch:{ JSONException -> 0x01a2 }
            java.lang.String r8 = "total_bytes"
            long r1 = r9.getTotalBytes()     // Catch:{ JSONException -> 0x01a2 }
            r0.put(r8, r1)     // Catch:{ JSONException -> 0x01a2 }
            java.lang.String r8 = "network_quality"
            java.lang.String r11 = r9.getNetworkQuality()     // Catch:{ JSONException -> 0x01a2 }
            r0.put(r8, r11)     // Catch:{ JSONException -> 0x01a2 }
            java.lang.String r8 = "only_wifi"
            boolean r11 = r9.isOnlyWifi()     // Catch:{ JSONException -> 0x01a2 }
            r0.put(r8, r11)     // Catch:{ JSONException -> 0x01a2 }
            java.lang.String r8 = "need_https_degrade"
            boolean r11 = r9.isNeedHttpsToHttpRetry()     // Catch:{ JSONException -> 0x01a2 }
            r0.put(r8, r11)     // Catch:{ JSONException -> 0x01a2 }
            java.lang.String r8 = "https_degrade_retry_used"
            boolean r11 = r9.isHttpsToHttpRetryUsed()     // Catch:{ JSONException -> 0x01a2 }
            r0.put(r8, r11)     // Catch:{ JSONException -> 0x01a2 }
            java.lang.String r8 = "md5"
            java.lang.String r11 = r9.getMd5()     // Catch:{ JSONException -> 0x01a2 }
            r0.put(r8, r11)     // Catch:{ JSONException -> 0x01a2 }
            java.lang.String r8 = "chunk_count"
            int r11 = r9.getChunkCount()     // Catch:{ JSONException -> 0x01a2 }
            r0.put(r8, r11)     // Catch:{ JSONException -> 0x01a2 }
            java.lang.String r8 = "is_force"
            boolean r11 = r9.isForce()     // Catch:{ JSONException -> 0x01a2 }
            r0.put(r8, r11)     // Catch:{ JSONException -> 0x01a2 }
            java.lang.String r8 = "retry_count"
            int r11 = r9.getRetryCount()     // Catch:{ JSONException -> 0x01a2 }
            r0.put(r8, r11)     // Catch:{ JSONException -> 0x01a2 }
            java.lang.String r8 = "cur_retry_time"
            int r11 = r9.getCurRetryTime()     // Catch:{ JSONException -> 0x01a2 }
            r0.put(r8, r11)     // Catch:{ JSONException -> 0x01a2 }
            java.lang.String r8 = "need_retry_delay"
            boolean r11 = r9.isNeedRetryDelay()     // Catch:{ JSONException -> 0x01a2 }
            r0.put(r8, r11)     // Catch:{ JSONException -> 0x01a2 }
            java.lang.String r8 = "need_reuse_first_connection"
            boolean r11 = r9.isNeedReuseFirstConnection()     // Catch:{ JSONException -> 0x01a2 }
            r0.put(r8, r11)     // Catch:{ JSONException -> 0x01a2 }
            java.lang.String r8 = "default_http_service_backup"
            boolean r11 = r9.isNeedDefaultHttpServiceBackUp()     // Catch:{ JSONException -> 0x01a2 }
            r0.put(r8, r11)     // Catch:{ JSONException -> 0x01a2 }
            java.lang.String r8 = "retry_delay_status"
            com.ss.android.socialbase.downloader.constants.RetryDelayStatus r11 = r9.getRetryDelayStatus()     // Catch:{ JSONException -> 0x01a2 }
            int r11 = r11.ordinal()     // Catch:{ JSONException -> 0x01a2 }
            r0.put(r8, r11)     // Catch:{ JSONException -> 0x01a2 }
            java.lang.String r8 = "backup_url_used"
            boolean r11 = r9.isBackUpUrlUsed()     // Catch:{ JSONException -> 0x01a2 }
            r0.put(r8, r11)     // Catch:{ JSONException -> 0x01a2 }
            java.lang.String r8 = "download_byte_error_retry_status"
            com.ss.android.socialbase.downloader.constants.ByteInvalidRetryStatus r11 = r9.getByteInvalidRetryStatus()     // Catch:{ JSONException -> 0x01a2 }
            int r11 = r11.ordinal()     // Catch:{ JSONException -> 0x01a2 }
            r0.put(r8, r11)     // Catch:{ JSONException -> 0x01a2 }
            java.lang.String r8 = "forbidden_handler_status"
            com.ss.android.socialbase.downloader.constants.AsyncHandleStatus r11 = r9.getAsyncHandleStatus()     // Catch:{ JSONException -> 0x01a2 }
            int r11 = r11.ordinal()     // Catch:{ JSONException -> 0x01a2 }
            r0.put(r8, r11)     // Catch:{ JSONException -> 0x01a2 }
            java.lang.String r8 = "need_independent_process"
            boolean r11 = r9.isNeedIndependentProcess()     // Catch:{ JSONException -> 0x01a2 }
            r0.put(r8, r11)     // Catch:{ JSONException -> 0x01a2 }
            java.lang.String r8 = "head_connection_error_msg"
            java.lang.String r11 = r9.getHeadConnectionException()     // Catch:{ JSONException -> 0x01a2 }
            if (r11 == 0) goto L_0x013c
            java.lang.String r11 = r9.getHeadConnectionException()     // Catch:{ JSONException -> 0x01a2 }
            goto L_0x013e
        L_0x013c:
            java.lang.String r11 = ""
        L_0x013e:
            r0.put(r8, r11)     // Catch:{ JSONException -> 0x01a2 }
            java.lang.String r8 = "extra"
            java.lang.String r11 = r9.getExtra()     // Catch:{ JSONException -> 0x01a2 }
            if (r11 == 0) goto L_0x014e
            java.lang.String r11 = r9.getExtra()     // Catch:{ JSONException -> 0x01a2 }
            goto L_0x0150
        L_0x014e:
            java.lang.String r11 = ""
        L_0x0150:
            r0.put(r8, r11)     // Catch:{ JSONException -> 0x01a2 }
            java.lang.String r8 = "add_listener_to_same_task"
            boolean r11 = r9.isAddListenerToSameTask()     // Catch:{ JSONException -> 0x01a2 }
            r0.put(r8, r11)     // Catch:{ JSONException -> 0x01a2 }
            java.util.List r8 = r9.getBackUpUrls()     // Catch:{ JSONException -> 0x01a2 }
            if (r8 == 0) goto L_0x0178
            java.lang.String r8 = "backup_url_count"
            java.util.List r11 = r9.getBackUpUrls()     // Catch:{ JSONException -> 0x01a2 }
            int r11 = r11.size()     // Catch:{ JSONException -> 0x01a2 }
            r0.put(r8, r11)     // Catch:{ JSONException -> 0x01a2 }
            java.lang.String r8 = "cur_backup_url_index"
            int r11 = r9.getCurBackUpUrlIndex()     // Catch:{ JSONException -> 0x01a2 }
            r0.put(r8, r11)     // Catch:{ JSONException -> 0x01a2 }
        L_0x0178:
            java.util.List r8 = r9.getForbiddenBackupUrls()     // Catch:{ JSONException -> 0x01a2 }
            if (r8 == 0) goto L_0x018b
            java.lang.String r8 = "forbidden_urls"
            java.util.List r9 = r9.getForbiddenBackupUrls()     // Catch:{ JSONException -> 0x01a2 }
            java.lang.String r9 = r9.toString()     // Catch:{ JSONException -> 0x01a2 }
            r0.put(r8, r9)     // Catch:{ JSONException -> 0x01a2 }
        L_0x018b:
            if (r10 == 0) goto L_0x01a2
            java.lang.String r8 = "error_code"
            int r9 = r10.getErrorCode()     // Catch:{ JSONException -> 0x01a2 }
            r0.put(r8, r9)     // Catch:{ JSONException -> 0x01a2 }
            java.lang.String r8 = "error_msg"
            java.lang.String r9 = r10.getErrorMessage()     // Catch:{ JSONException -> 0x01a2 }
            r0.put(r8, r9)     // Catch:{ JSONException -> 0x01a2 }
            goto L_0x01a2
        L_0x01a0:
            r8 = 0
            r0 = r8
        L_0x01a2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.socialbase.downloader.p905c.C20192a.m66503a(java.lang.String, com.ss.android.socialbase.downloader.model.DownloadInfo, com.ss.android.socialbase.downloader.exception.BaseException, int):org.json.JSONObject");
    }
}
