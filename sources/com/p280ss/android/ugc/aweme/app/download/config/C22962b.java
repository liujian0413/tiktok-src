package com.p280ss.android.ugc.aweme.app.download.config;

import android.text.TextUtils;
import com.p280ss.android.downloadlib.C19497b;
import com.p280ss.android.socialbase.downloader.exception.BaseException;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.ugc.aweme.base.C6893q;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.app.download.config.b */
public final class C22962b extends C19497b {
    public final void onAppDownloadMonitorSend(DownloadInfo downloadInfo, BaseException baseException, int i) {
        String str;
        long j;
        if (downloadInfo != null) {
            super.onAppDownloadMonitorSend(downloadInfo, baseException, i);
            if (i == -1 || i == -3) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    String extra = downloadInfo.getExtra();
                    String str2 = "";
                    long j2 = 0;
                    if (!TextUtils.isEmpty(extra)) {
                        JSONObject jSONObject2 = new JSONObject(extra);
                        long optLong = jSONObject2.optLong("extra");
                        String optString = jSONObject2.optString("log_extra");
                        if (optLong > 0) {
                            if (!TextUtils.isEmpty(optString)) {
                                str = optString;
                                j = jSONObject2.optLong("ext_value");
                                j2 = optLong;
                            }
                        }
                        return;
                    }
                    str = str2;
                    j = 0;
                    jSONObject.put("app_name", downloadInfo.getTitle());
                    jSONObject.put("status_value", i);
                    jSONObject.put("download_url", downloadInfo.getUrl());
                    jSONObject.put("ad_id", j2);
                    jSONObject.put("ext_value", j);
                    jSONObject.put("log_extra", str);
                    jSONObject.put("download_id", downloadInfo.getId());
                    jSONObject.put("cur_bytes", downloadInfo.getCurBytes());
                    jSONObject.put("total_bytes", downloadInfo.getTotalBytes());
                    jSONObject.put("chunk_count", downloadInfo.getChunkCount());
                    jSONObject.put("network_quality", downloadInfo.getNetworkQuality());
                    jSONObject.put("download_time", downloadInfo.getDownloadTime());
                    if (i == -1) {
                        if (baseException != null && !TextUtils.isEmpty(baseException.getMessage())) {
                            jSONObject.put("error_code", baseException.getErrorCode());
                            jSONObject.put("message", baseException.getMessage());
                            jSONObject.put("retry_count", downloadInfo.getRetryCount());
                            String backUpUrl = downloadInfo.getBackUpUrl();
                            if (TextUtils.isEmpty(backUpUrl) && downloadInfo.isBackUpUrlUsed()) {
                                backUpUrl = "all backUrl used";
                            }
                            jSONObject.put("cur_backup_url", backUpUrl);
                            jSONObject.put("temp_path", downloadInfo.getTempFilePath());
                        }
                        C6893q.m21444a("aweme_ad_apk_download_error_rate", 1, jSONObject);
                        C6893q.m21444a("aweme_ad_apk_download_error", 1, jSONObject);
                        C6893q.m21444a("apk_download_error_rate", 0, jSONObject);
                        return;
                    }
                    C6893q.m21444a("aweme_ad_apk_download_error_rate", 0, jSONObject);
                    C6893q.m21444a("apk_download_error_rate", 1, jSONObject);
                } catch (Exception unused) {
                }
            }
        }
    }
}
