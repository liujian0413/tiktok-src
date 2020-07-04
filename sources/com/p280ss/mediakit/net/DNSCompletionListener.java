package com.p280ss.mediakit.net;

import org.json.JSONObject;

/* renamed from: com.ss.mediakit.net.DNSCompletionListener */
public interface DNSCompletionListener {
    void onCancelled();

    void onCompletion(JSONObject jSONObject, Error error);

    void onRetry(Error error);
}
