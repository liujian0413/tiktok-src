package com.bytedance.apm.p238b.p467c;

import android.text.TextUtils;
import com.bytedance.apm.p238b.p465a.C9570d;
import com.bytedance.apm.p238b.p466b.C9575b;
import com.bytedance.apm.p245h.C9603b;
import com.bytedance.apm.util.C9650n;
import com.bytedance.apm.util.C9651o;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: com.bytedance.apm.b.c.f */
public final class C9582f extends C9577b implements C9570d {
    /* renamed from: a */
    public final String mo23883a() {
        return "android.location.ILocationManager";
    }

    public C9582f() {
        super("location");
    }

    /* renamed from: a */
    public final void mo23884a(Object obj, Method method, Object[] objArr) {
        try {
            String name = method.getName();
            if (TextUtils.equals(name, "requestLocationUpdates")) {
                mo23902a(C9651o.m28539a(objArr));
                return;
            }
            if (TextUtils.equals(name, "removeUpdates")) {
                mo23903b(C9651o.m28539a(objArr));
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo23906a(C9575b bVar, List<C9603b> list, int i, int i2) {
        C9650n a = mo23901a(list, i, i2);
        bVar.f26164f = ((Long) a.f26366a).longValue();
        bVar.f26169k = ((Long) a.f26367b).longValue();
    }
}
