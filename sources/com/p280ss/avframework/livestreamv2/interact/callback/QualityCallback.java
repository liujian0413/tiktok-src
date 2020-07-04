package com.p280ss.avframework.livestreamv2.interact.callback;

import org.json.JSONObject;

/* renamed from: com.ss.avframework.livestreamv2.interact.callback.QualityCallback */
public interface QualityCallback {
    void onLogMonitor(String str, JSONObject jSONObject);

    void onPushStreamQuality(long j, long j2);

    void onStreamDelay(int i);
}
