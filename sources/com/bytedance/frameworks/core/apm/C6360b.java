package com.bytedance.frameworks.core.apm;

import android.text.TextUtils;
import com.bytedance.apm.p245h.C6212a;
import com.bytedance.apm.p245h.C6213e;
import com.bytedance.frameworks.core.apm.p257a.p258a.C6354a;
import com.bytedance.frameworks.core.apm.p257a.p258a.C6355b;
import com.bytedance.frameworks.core.apm.p257a.p258a.C6356c;
import com.bytedance.frameworks.core.apm.p257a.p259b.C6357a;
import com.bytedance.frameworks.core.apm.p257a.p259b.C6358b;
import com.bytedance.frameworks.core.apm.p257a.p259b.C6359c;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.frameworks.core.apm.b */
public final class C6360b {

    /* renamed from: a */
    public List<C6354a<? extends C6213e>> f18642a;

    /* renamed from: b */
    public C6359c f18643b;

    /* renamed from: c */
    private Map<Class<?>, C6354a<? extends C6213e>> f18644c;

    /* renamed from: d */
    private C6356c f18645d;

    /* renamed from: e */
    private C6355b f18646e;

    /* renamed from: com.bytedance.frameworks.core.apm.b$a */
    static class C6362a {

        /* renamed from: a */
        public static final C6360b f18647a = new C6360b();
    }

    /* renamed from: a */
    public static C6360b m19768a() {
        return C6362a.f18647a;
    }

    /* renamed from: b */
    public final int mo15272b() {
        int i;
        if (this.f18645d != null) {
            i = this.f18645d.mo15261g();
        } else {
            i = 0;
        }
        if (this.f18646e != null) {
            i += this.f18646e.mo15261g();
        }
        return i + C6357a.m19743f().mo15237a(null, null) + C6358b.m19753f().mo15237a(null, null);
    }

    private C6360b() {
        this.f18642a = new LinkedList();
        this.f18644c = new HashMap();
        this.f18643b = new C6359c();
        this.f18645d = new C6356c();
        this.f18642a.add(this.f18645d);
        this.f18644c.put(C6213e.class, this.f18645d);
        this.f18646e = new C6355b();
        this.f18642a.add(this.f18646e);
        this.f18644c.put(C6212a.class, this.f18646e);
    }

    /* renamed from: a */
    public final void mo15270a(C6213e eVar) {
        this.f18645d.mo15254a(eVar);
    }

    /* renamed from: b */
    public final void mo15274b(List<C6213e> list) {
        this.f18645d.mo15258b(list);
    }

    /* renamed from: a */
    public final C6354a<? extends C6213e> mo15268a(Class<?> cls) {
        return (C6354a) this.f18644c.get(cls);
    }

    /* renamed from: b */
    public final int mo15273b(long j) {
        int i;
        if (this.f18645d != null) {
            i = this.f18645d.mo15257b(j);
        } else {
            i = 0;
        }
        if (this.f18646e != null) {
            return i + this.f18646e.mo15257b(j);
        }
        return i;
    }

    /* renamed from: a */
    public final void mo15269a(long j) {
        this.f18645d.mo15242a(j);
        this.f18646e.mo15242a(j);
    }

    /* renamed from: a */
    public final void mo15271a(List<C6212a> list) {
        this.f18646e.mo15258b(list);
    }

    /* renamed from: a */
    public final int mo15267a(String str, List<Long> list) {
        if (TextUtils.equals(str, "api_all")) {
            return this.f18646e.mo15259c(list);
        }
        return this.f18645d.mo15259c(list);
    }
}
