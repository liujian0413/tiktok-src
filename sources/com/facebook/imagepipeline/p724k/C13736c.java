package com.facebook.imagepipeline.p724k;

import com.facebook.imagepipeline.p724k.C13767t;
import java.util.Map;

/* renamed from: com.facebook.imagepipeline.k.c */
public abstract class C13736c<FETCH_STATE extends C13767t> implements C13683ai<FETCH_STATE> {
    public Map<String, String> getExtraMap(FETCH_STATE fetch_state, int i) {
        return null;
    }

    public void onFetchCompletion(FETCH_STATE fetch_state, int i) {
    }

    public boolean shouldPropagate(FETCH_STATE fetch_state) {
        return true;
    }
}
