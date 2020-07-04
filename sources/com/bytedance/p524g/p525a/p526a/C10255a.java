package com.bytedance.p524g.p525a.p526a;

import com.bytedance.p524g.p525a.p527b.C10259a;
import com.bytedance.p524g.p525a.p527b.C10263b;
import com.bytedance.p524g.p525a.p527b.C10267c;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.g.a.a.a */
public final class C10255a implements C10256b<C10267c> {

    /* renamed from: a */
    private Map<Byte, C10267c> f27872a = new HashMap();

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C10267c mo24982a(byte b) {
        C10267c cVar;
        C10267c cVar2 = (C10267c) this.f27872a.get(Byte.valueOf(b));
        if (cVar2 != null) {
            return cVar2;
        }
        if (b != 2) {
            cVar = new C10259a();
        } else {
            cVar = new C10263b();
        }
        this.f27872a.put(Byte.valueOf(b), cVar);
        return cVar;
    }
}
