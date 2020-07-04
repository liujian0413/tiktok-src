package com.bytedance.android.live.network;

import com.bytedance.android.live.base.model.NameValuePair;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.live.network.c */
public interface C3455c {

    /* renamed from: com.bytedance.android.live.network.c$a */
    public static class C3456a {

        /* renamed from: a */
        public String f10263a;

        /* renamed from: b */
        public List<NameValuePair> f10264b;

        public C3456a(String str, List<NameValuePair> list) {
            this.f10263a = str;
            this.f10264b = list;
        }
    }

    /* renamed from: a */
    C3456a mo10438a(C3456a aVar);

    /* renamed from: a */
    void mo10439a(Map<String, String> map);
}
