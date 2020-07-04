package com.facebook.imagepipeline.p724k;

import java.util.Map;

/* renamed from: com.facebook.imagepipeline.k.ap */
public interface C13702ap {
    void onProducerEvent(String str, String str2, String str3);

    void onProducerFinishWithCancellation(String str, String str2, Map<String, String> map);

    void onProducerFinishWithFailure(String str, String str2, Throwable th, Map<String, String> map);

    void onProducerFinishWithSuccess(String str, String str2, Map<String, String> map);

    void onProducerStart(String str, String str2);

    void onUltimateProducerReached(String str, String str2, boolean z);

    boolean requiresExtraMap(String str);
}
