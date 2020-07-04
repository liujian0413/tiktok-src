package com.p280ss.ttuploader.net;

import org.json.JSONObject;

/* renamed from: com.ss.ttuploader.net.DNSCompletionListener */
public interface DNSCompletionListener {
    void onCancelled();

    void onCompletion(JSONObject jSONObject, Error error);

    void onRetry(Error error);
}
