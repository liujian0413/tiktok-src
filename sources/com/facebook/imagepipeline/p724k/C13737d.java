package com.facebook.imagepipeline.p724k;

import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequest.RequestLevel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.imagepipeline.k.d */
public class C13737d implements C13700an {

    /* renamed from: a */
    private final ImageRequest f36461a;

    /* renamed from: b */
    private final String f36462b;

    /* renamed from: c */
    private final C13702ap f36463c;

    /* renamed from: d */
    private final Object f36464d;

    /* renamed from: e */
    private final RequestLevel f36465e;

    /* renamed from: f */
    private boolean f36466f;

    /* renamed from: g */
    private Priority f36467g;

    /* renamed from: h */
    private boolean f36468h;

    /* renamed from: i */
    private boolean f36469i;

    /* renamed from: j */
    private final List<C13701ao> f36470j = new ArrayList();

    /* renamed from: a */
    public final ImageRequest mo33333a() {
        return this.f36461a;
    }

    /* renamed from: b */
    public final String mo33335b() {
        return this.f36462b;
    }

    /* renamed from: c */
    public final C13702ap mo33336c() {
        return this.f36463c;
    }

    /* renamed from: d */
    public final Object mo33337d() {
        return this.f36464d;
    }

    /* renamed from: e */
    public final RequestLevel mo33338e() {
        return this.f36465e;
    }

    /* renamed from: f */
    public final synchronized boolean mo33339f() {
        return this.f36466f;
    }

    /* renamed from: g */
    public final synchronized Priority mo33340g() {
        return this.f36467g;
    }

    /* renamed from: h */
    public final synchronized boolean mo33341h() {
        return this.f36468h;
    }

    /* renamed from: i */
    public final void mo33361i() {
        m40532d(m40533j());
    }

    /* renamed from: j */
    private synchronized List<C13701ao> m40533j() {
        if (this.f36469i) {
            return null;
        }
        this.f36469i = true;
        return new ArrayList(this.f36470j);
    }

    /* renamed from: a */
    public static void m40529a(List<C13701ao> list) {
        if (list != null) {
            for (C13701ao b : list) {
                b.mo33319b();
            }
        }
    }

    /* renamed from: b */
    public static void m40530b(List<C13701ao> list) {
        if (list != null) {
            for (C13701ao c : list) {
                c.mo33320c();
            }
        }
    }

    /* renamed from: c */
    public static void m40531c(List<C13701ao> list) {
        if (list != null) {
            for (C13701ao d : list) {
                d.mo33321d();
            }
        }
    }

    /* renamed from: d */
    private static void m40532d(List<C13701ao> list) {
        if (list != null) {
            for (C13701ao a : list) {
                a.mo29896a();
            }
        }
    }

    /* renamed from: a */
    public final synchronized List<C13701ao> mo33358a(Priority priority) {
        if (priority == this.f36467g) {
            return null;
        }
        this.f36467g = priority;
        return new ArrayList(this.f36470j);
    }

    /* renamed from: b */
    public final synchronized List<C13701ao> mo33360b(boolean z) {
        if (z == this.f36468h) {
            return null;
        }
        this.f36468h = z;
        return new ArrayList(this.f36470j);
    }

    /* renamed from: a */
    public final synchronized List<C13701ao> mo33359a(boolean z) {
        if (z == this.f36466f) {
            return null;
        }
        this.f36466f = z;
        return new ArrayList(this.f36470j);
    }

    /* renamed from: a */
    public final void mo33334a(C13701ao aoVar) {
        boolean z;
        synchronized (this) {
            this.f36470j.add(aoVar);
            z = this.f36469i;
        }
        if (z) {
            aoVar.mo29896a();
        }
    }

    public C13737d(ImageRequest imageRequest, String str, C13702ap apVar, Object obj, RequestLevel requestLevel, boolean z, boolean z2, Priority priority) {
        this.f36461a = imageRequest;
        this.f36462b = str;
        this.f36463c = apVar;
        this.f36464d = obj;
        this.f36465e = requestLevel;
        this.f36466f = z;
        this.f36467g = priority;
        this.f36468h = z2;
    }
}
