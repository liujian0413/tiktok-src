package com.bytedance.retrofit2.p638c;

import com.bytedance.retrofit2.C12466b;
import com.bytedance.retrofit2.C12520r;
import com.bytedance.retrofit2.C12534t;
import com.bytedance.retrofit2.CallServerInterceptor;
import com.bytedance.retrofit2.p637a.C12462c;
import com.bytedance.retrofit2.p638c.C12469a.C12470a;
import java.util.List;

/* renamed from: com.bytedance.retrofit2.c.b */
public final class C12471b implements C12470a {

    /* renamed from: a */
    public final int f33124a;

    /* renamed from: b */
    public C12520r f33125b;

    /* renamed from: c */
    private final List<C12469a> f33126c;

    /* renamed from: d */
    private final C12462c f33127d;

    /* renamed from: e */
    private final C12466b f33128e;

    /* renamed from: f */
    private int f33129f;

    /* renamed from: a */
    public final C12462c mo30456a() {
        return this.f33127d;
    }

    /* renamed from: a */
    public final C12534t mo30457a(C12462c cVar) throws Exception {
        return C12472c.m36293a(this, cVar);
    }

    /* renamed from: b */
    public final C12520r mo30458b() {
        return this.f33125b;
    }

    /* renamed from: b */
    public final C12534t mo30459b(C12462c cVar) throws Exception {
        String str;
        if (this.f33124a < this.f33126c.size()) {
            this.f33129f++;
            if (this.f33129f > 1) {
                for (C12469a aVar : this.f33126c) {
                    if (aVar instanceof CallServerInterceptor) {
                        ((CallServerInterceptor) aVar).mo30402b();
                    }
                }
            }
            C12471b bVar = new C12471b(this.f33126c, this.f33124a + 1, cVar, this.f33128e, this.f33125b);
            C12469a aVar2 = (C12469a) this.f33126c.get(this.f33124a);
            StringBuilder sb = new StringBuilder("interceptor = ");
            if (aVar2 != null) {
                str = aVar2.toString();
            } else {
                str = "";
            }
            sb.append(str);
            sb.append(" url = ");
            sb.append(cVar.f33098b);
            C12534t a = aVar2.mo10436a(bVar);
            if (a == null) {
                StringBuilder sb2 = new StringBuilder("interceptor ");
                sb2.append(aVar2);
                sb2.append(" returned null");
                throw new NullPointerException(sb2.toString());
            } else if (a.f33301a != null) {
                return a;
            } else {
                StringBuilder sb3 = new StringBuilder("interceptor ");
                sb3.append(aVar2);
                sb3.append(" returned a ssResponse with no body");
                throw new IllegalStateException(sb3.toString());
            }
        } else {
            throw new AssertionError();
        }
    }

    public C12471b(List<C12469a> list, int i, C12462c cVar, C12466b bVar, C12520r rVar) {
        this.f33126c = list;
        this.f33124a = i;
        this.f33127d = cVar;
        this.f33128e = bVar;
        this.f33125b = rVar;
    }
}
