package com.p280ss.videoarch.liveplayer.p1834a;

import java.util.ArrayList;

/* renamed from: com.ss.videoarch.liveplayer.a.b */
public final class C46282b {

    /* renamed from: a */
    public int f118912a;

    /* renamed from: b */
    private C46281a f118913b;

    /* renamed from: c */
    private C46284d[] f118914c;

    /* renamed from: d */
    private C46283c f118915d;

    /* renamed from: e */
    private String[] f118916e;

    /* renamed from: f */
    private int f118917f;

    /* renamed from: b */
    public final String mo115021b() {
        this.f118917f++;
        return m145293d();
    }

    /* renamed from: c */
    public final void mo115022c() {
        this.f118917f = 0;
        this.f118913b = null;
        this.f118916e = null;
        this.f118915d = null;
        this.f118914c = null;
    }

    /* renamed from: d */
    private String m145293d() {
        int i;
        if (this.f118916e == null || this.f118916e.length == 0) {
            return null;
        }
        if (this.f118917f < this.f118916e.length) {
            i = this.f118917f;
        } else {
            i = 0;
        }
        return this.f118916e[i];
    }

    /* renamed from: a */
    public final C46284d mo115014a() {
        if (this.f118914c == null || this.f118914c.length == 0) {
            return null;
        }
        for (int i = 0; i < this.f118914c.length; i++) {
            if (this.f118914c[i].f118919a != null) {
                return this.f118914c[i];
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo115017a(C46283c cVar) {
        this.f118915d = cVar;
        this.f118917f = 0;
        this.f118912a = 2;
    }

    /* renamed from: b */
    public final C46284d mo115020b(String str) {
        if (this.f118914c == null || this.f118914c.length == 0) {
            return null;
        }
        for (int i = 0; i < this.f118914c.length; i++) {
            if (this.f118914c[i].mo115026a() == str) {
                return this.f118914c[i];
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo115018a(C46284d[] dVarArr) {
        this.f118914c = dVarArr;
        this.f118917f = 0;
        this.f118912a = 1;
        ArrayList arrayList = new ArrayList();
        for (C46284d dVar : dVarArr) {
            if (dVar.f118919a != null) {
                arrayList.add(dVar.f118919a);
            }
            if (dVar.f118920b != null) {
                arrayList.add(dVar.f118920b);
            }
        }
        this.f118916e = new String[arrayList.size()];
        arrayList.toArray(this.f118916e);
    }

    /* renamed from: a */
    public final boolean mo115019a(String str) {
        if (this.f118912a == 2 || this.f118915d != null) {
            return this.f118915d.mo115025a(str);
        }
        return false;
    }

    /* renamed from: a */
    public final String mo115015a(String str, String str2) {
        if (this.f118912a != 2 || this.f118915d == null) {
            return null;
        }
        return this.f118915d.mo115023a(str, str2);
    }

    /* renamed from: a */
    public final String mo115016a(String str, String str2, String str3) {
        if (this.f118912a != 2 || this.f118915d == null) {
            return null;
        }
        return this.f118915d.mo115024a(str, str2, str3);
    }
}
