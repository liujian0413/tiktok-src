package com.google.android.gms.analytics;

import android.os.Build.VERSION;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.util.C15322e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.analytics.i */
public final class C14930i {

    /* renamed from: a */
    public final C14932k f38602a;

    /* renamed from: b */
    public boolean f38603b;

    /* renamed from: c */
    public long f38604c;

    /* renamed from: d */
    public long f38605d;

    /* renamed from: e */
    public boolean f38606e;

    /* renamed from: f */
    public final List<C14939o> f38607f;

    /* renamed from: g */
    private final C15322e f38608g;

    /* renamed from: h */
    private long f38609h;

    /* renamed from: i */
    private long f38610i;

    /* renamed from: j */
    private long f38611j;

    /* renamed from: k */
    private final Map<Class<? extends C14931j>, C14931j> f38612k;

    /* renamed from: a */
    public final C14930i mo37990a() {
        return new C14930i(this);
    }

    /* renamed from: a */
    public final void mo37992a(C14931j jVar) {
        C15267r.m44384a(jVar);
        Class cls = jVar.getClass();
        if (cls.getSuperclass() == C14931j.class) {
            jVar.mo37998a(mo37993b(cls));
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public final <T extends C14931j> T mo37991a(Class<T> cls) {
        return (C14931j) this.f38612k.get(cls);
    }

    /* renamed from: b */
    public final <T extends C14931j> T mo37993b(Class<T> cls) {
        T t = (C14931j) this.f38612k.get(cls);
        if (t != null) {
            return t;
        }
        T c = m43361c(cls);
        this.f38612k.put(cls, c);
        return c;
    }

    /* renamed from: b */
    public final Collection<C14931j> mo37994b() {
        return this.f38612k.values();
    }

    /* renamed from: c */
    public final void mo37995c() {
        this.f38602a.f38614e.mo38002a(this);
    }

    C14930i(C14932k kVar, C15322e eVar) {
        C15267r.m44384a(kVar);
        C15267r.m44384a(eVar);
        this.f38602a = kVar;
        this.f38608g = eVar;
        this.f38610i = 1800000;
        this.f38611j = 3024000000L;
        this.f38612k = new HashMap();
        this.f38607f = new ArrayList();
    }

    private C14930i(C14930i iVar) {
        this.f38602a = iVar.f38602a;
        this.f38608g = iVar.f38608g;
        this.f38604c = iVar.f38604c;
        this.f38605d = iVar.f38605d;
        this.f38609h = iVar.f38609h;
        this.f38610i = iVar.f38610i;
        this.f38611j = iVar.f38611j;
        this.f38607f = new ArrayList(iVar.f38607f);
        this.f38612k = new HashMap(iVar.f38612k.size());
        for (Entry entry : iVar.f38612k.entrySet()) {
            C14931j c = m43361c((Class) entry.getKey());
            ((C14931j) entry.getValue()).mo37998a(c);
            this.f38612k.put((Class) entry.getKey(), c);
        }
    }

    /* renamed from: c */
    private static <T extends C14931j> T m43361c(Class<T> cls) {
        try {
            return (C14931j) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            if (e instanceof InstantiationException) {
                throw new IllegalArgumentException("dataType doesn't have default constructor", e);
            } else if (e instanceof IllegalAccessException) {
                throw new IllegalArgumentException("dataType default constructor is not accessible", e);
            } else if (VERSION.SDK_INT < 19 || !(e instanceof ReflectiveOperationException)) {
                throw new RuntimeException(e);
            } else {
                throw new IllegalArgumentException("Linkage exception", e);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo37996d() {
        this.f38609h = this.f38608g.mo38685b();
        if (this.f38605d != 0) {
            this.f38604c = this.f38605d;
        } else {
            this.f38604c = this.f38608g.mo38684a();
        }
        this.f38603b = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo37997e() {
        this.f38606e = true;
    }
}
