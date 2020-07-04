package com.google.android.gms.tagmanager;

/* renamed from: com.google.android.gms.tagmanager.ax */
final class C17006ax extends C17005aw {

    /* renamed from: a */
    private static final Object f47642a = new Object();

    /* renamed from: j */
    private static C17006ax f47643j;

    /* renamed from: b */
    private volatile C17047v f47644b;

    /* renamed from: c */
    private int f47645c = 1800000;

    /* renamed from: d */
    private boolean f47646d = true;

    /* renamed from: e */
    private boolean f47647e;

    /* renamed from: f */
    private boolean f47648f = true;

    /* renamed from: g */
    private boolean f47649g = true;

    /* renamed from: h */
    private C17049x f47650h = new C17007ay(this);

    /* renamed from: i */
    private boolean f47651i = false;

    /* renamed from: b */
    public static C17006ax m56479b() {
        if (f47643j == null) {
            f47643j = new C17006ax();
        }
        return f47643j;
    }

    private C17006ax() {
    }

    /* renamed from: a */
    public final synchronized void mo44226a() {
        if (!this.f47647e) {
            this.f47646d = true;
            return;
        }
        C17047v vVar = this.f47644b;
        new C17008az(this);
    }
}
