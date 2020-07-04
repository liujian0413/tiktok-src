package com.bytedance.apm.p238b.p467c;

import com.bytedance.apm.p238b.p465a.C9570d;
import com.bytedance.apm.p238b.p466b.C9575b;
import com.bytedance.apm.p245h.C9603b;
import com.bytedance.apm.util.C9646l;
import com.bytedance.apm.util.C9650n;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: com.bytedance.apm.b.c.h */
public final class C9585h extends C9577b implements C9570d {
    /* renamed from: a */
    public final String mo23883a() {
        return "android.os.IPowerManager";
    }

    public C9585h() {
        super("power");
    }

    /* renamed from: a */
    public final void mo23884a(Object obj, Method method, Object[] objArr) {
        try {
            String name = method.getName();
            if ("acquireWakeLock".equals(name)) {
                mo23902a("");
                return;
            }
            if ("releaseWakeLock".equals(name)) {
                mo23903b("");
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo23906a(C9575b bVar, List<C9603b> list, int i, int i2) {
        C9650n a = mo23901a(list, i, i2);
        bVar.f26165g = C9646l.m28536a((Long) a.f26366a);
        bVar.f26170l = C9646l.m28536a((Long) a.f26367b);
    }
}
