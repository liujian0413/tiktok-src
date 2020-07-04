package com.p280ss.android.ugc.aweme.global.config.settings;

import com.bytedance.ies.C10294b;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.c */
final class C30195c implements C10294b {

    /* renamed from: a */
    private Map<String, Object> f79449a = new HashMap();

    /* renamed from: b */
    private boolean f79450b = false;

    C30195c() {
    }

    /* renamed from: a */
    public final <T> T mo25017a(String str, Class<T> cls, T t) {
        if (!this.f79449a.containsKey(str) || this.f79449a.get(str) == null) {
            return null;
        }
        return this.f79449a.get(str);
    }

    /* renamed from: a */
    public final <T> List<T> mo25018a(String str, Class<T> cls, List<T> list) {
        if (!this.f79449a.containsKey(str) || this.f79449a.get(str) == null) {
            return null;
        }
        return (List) this.f79449a.get(str);
    }
}
