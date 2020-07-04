package com.bytedance.apm.p238b.p467c;

import com.bytedance.apm.p238b.p465a.C9570d;
import com.bytedance.apm.p238b.p466b.C9575b;
import com.bytedance.apm.p245h.C9603b;
import com.bytedance.apm.util.C9639b;
import com.bytedance.apm.util.C9650n;
import com.bytedance.apm.util.C9651o;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: com.bytedance.apm.b.c.d */
public final class C9580d extends C9576a implements C9570d {
    /* renamed from: a */
    public final String mo23883a() {
        return "android.app.IAlarmManager";
    }

    public C9580d() {
        super("alarm");
    }

    /* renamed from: a */
    public final void mo23884a(Object obj, Method method, Object[] objArr) {
        try {
            if ("set".equals(method.getName())) {
                String a = C9651o.m28539a(objArr);
                int intValue = objArr[C9639b.m28513a(objArr, Integer.class)].intValue();
                if (intValue == 2 || intValue == 0) {
                    mo23897a(a);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo23906a(C9575b bVar, List<C9603b> list, int i, int i2) {
        C9650n a = mo23896a(list, i, i2);
        bVar.f26166h = ((Long) a.f26366a).longValue();
        bVar.f26171m = ((Long) a.f26367b).longValue();
    }
}
