package com.p280ss.android.ugc.aweme.base.livedata;

import com.p280ss.android.ugc.aweme.arch.widgets.base.C23084b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.base.livedata.a */
public final class C23352a {

    /* renamed from: a */
    private final Map<String, C23084b<Object>> f61441a;

    /* renamed from: com.ss.android.ugc.aweme.base.livedata.a$a */
    static class C23354a {

        /* renamed from: a */
        public static final C23352a f61442a = new C23352a();
    }

    /* renamed from: a */
    public static C23352a m76612a() {
        return C23354a.f61442a;
    }

    private C23352a() {
        this.f61441a = new HashMap();
    }

    /* renamed from: a */
    public final C23084b<Object> mo60650a(String str) {
        return mo60651a(str, Object.class);
    }

    /* renamed from: a */
    public final synchronized <T> C23084b<T> mo60651a(String str, Class<T> cls) {
        if (!this.f61441a.containsKey(str)) {
            this.f61441a.put(str, new C23084b());
        }
        return (C23084b) this.f61441a.get(str);
    }
}
