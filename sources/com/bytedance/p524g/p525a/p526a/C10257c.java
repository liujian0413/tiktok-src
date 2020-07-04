package com.bytedance.p524g.p525a.p526a;

import com.bytedance.p524g.p525a.p528c.C10269a;
import com.bytedance.p524g.p525a.p528c.C10270b;
import com.bytedance.p524g.p525a.p528c.C10271c;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.g.a.a.c */
public final class C10257c implements C10256b<C10270b> {

    /* renamed from: a */
    private Map<Byte, C10270b> f27873a = new HashMap();

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C10270b mo24982a(byte b) {
        C10270b bVar;
        C10270b bVar2 = (C10270b) this.f27873a.get(Byte.valueOf(b));
        if (bVar2 != null) {
            return bVar2;
        }
        if (b != 1) {
            bVar = new C10269a();
        } else {
            bVar = new C10271c();
        }
        this.f27873a.put(Byte.valueOf(b), bVar);
        return bVar;
    }
}
