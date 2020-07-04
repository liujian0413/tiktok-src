package com.p280ss.android.ugc.aweme.base.p308ui.session;

import com.p280ss.android.ugc.aweme.antiaddic.C22562c;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.base.ui.session.b */
public final class C23470b {

    /* renamed from: b */
    private static C23470b f61934b;

    /* renamed from: a */
    HashMap<String, C23468a> f61935a = new HashMap<>();

    private C23470b() {
    }

    /* renamed from: a */
    public static C23470b m77051a() {
        if (f61934b == null) {
            synchronized (C22562c.class) {
                if (f61934b == null) {
                    f61934b = new C23470b();
                }
            }
        }
        return f61934b;
    }

    /* renamed from: a */
    public final synchronized void mo61085a(C23468a aVar) {
        this.f61935a.values().remove(aVar);
    }

    /* renamed from: b */
    public final synchronized <T> C23468a<T> mo61086b(String str, Class<T> cls) {
        return (C23468a) this.f61935a.get(str);
    }

    /* renamed from: a */
    public final synchronized <T> C23468a<T> mo61084a(String str, Class<T> cls) {
        if (!this.f61935a.containsKey(str)) {
            this.f61935a.put(str, new C23468a());
        }
        return (C23468a) this.f61935a.get(str);
    }
}
