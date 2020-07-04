package com.facebook.react.modules.fresco;

import android.util.Pair;
import com.facebook.imagepipeline.p721h.C13651a;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.HashMap;
import java.util.Map;

public class SystraceRequestListener extends C13651a {
    int mCurrentID;
    Map<String, Pair<Integer, String>> mProducerID = new HashMap();
    Map<String, Pair<Integer, String>> mRequestsID = new HashMap();

    public void onProducerEvent(String str, String str2, String str3) {
    }

    public void onProducerFinishWithCancellation(String str, String str2, Map<String, String> map) {
    }

    public void onProducerFinishWithFailure(String str, String str2, Throwable th, Map<String, String> map) {
    }

    public void onProducerFinishWithSuccess(String str, String str2, Map<String, String> map) {
    }

    public void onProducerStart(String str, String str2) {
    }

    public void onRequestCancellation(String str) {
    }

    public void onRequestFailure(ImageRequest imageRequest, String str, Throwable th, boolean z) {
    }

    public void onRequestStart(ImageRequest imageRequest, Object obj, String str, boolean z) {
    }

    public void onRequestSuccess(ImageRequest imageRequest, String str, boolean z) {
    }

    public boolean requiresExtraMap(String str) {
        return false;
    }
}
