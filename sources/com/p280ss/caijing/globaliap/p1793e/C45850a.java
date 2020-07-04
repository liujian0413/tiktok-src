package com.p280ss.caijing.globaliap.p1793e;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.p280ss.caijing.globaliap.p1793e.C45850a.C45851a;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.caijing.globaliap.e.a */
public abstract class C45850a<Response extends C45851a> {

    /* renamed from: com.ss.caijing.globaliap.e.a$a */
    public static class C45851a implements Serializable {

        /* renamed from: g */
        public String f117265g;

        /* renamed from: h */
        public String f117266h;

        /* renamed from: c */
        public final boolean mo111067c() {
            return TextUtils.equals(this.f117265g, "CD0000");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Map<String, String> mo111013a(Map<String, String> map);

    /* renamed from: a */
    public final Map<String, String> mo111066a() {
        HashMap hashMap = new HashMap();
        hashMap.put("charset", "utf-8");
        hashMap.put(C38347c.f99551f, "1.0");
        hashMap.put("format", "JSON");
        return mo111013a(hashMap);
    }
}
