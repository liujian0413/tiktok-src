package com.p280ss.android.socialbase.downloader.depend;

import org.json.JSONObject;

/* renamed from: com.ss.android.socialbase.downloader.depend.IDownloadMonitorDepend */
public interface IDownloadMonitorDepend {
    String getEventPage();

    void monitorLogSend(JSONObject jSONObject);
}
