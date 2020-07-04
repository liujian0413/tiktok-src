package com.p280ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.C0063u;
import android.support.p022v4.util.ArrayMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.StatusStoreViewModel */
public class StatusStoreViewModel extends C0063u {

    /* renamed from: a */
    private Map<String, Object> f99814a = new ArrayMap();

    public void onCleared() {
        super.onCleared();
        this.f99814a.clear();
    }

    /* renamed from: b */
    public final <T> void mo96201b(String str, T t) {
        this.f99814a.put(str, t);
    }

    /* renamed from: a */
    public final <T> T mo96200a(String str, T t) {
        T t2 = this.f99814a.get(str);
        if (t2 == null) {
            return t;
        }
        return t2;
    }
}
