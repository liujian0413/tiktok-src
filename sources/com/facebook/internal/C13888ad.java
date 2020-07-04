package com.facebook.internal;

import com.facebook.C13499h;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.internal.ad */
public class C13888ad {

    /* renamed from: c */
    static final /* synthetic */ boolean f36783c = (!C13888ad.class.desiredAssertionStatus());

    /* renamed from: a */
    public final Object f36784a;

    /* renamed from: b */
    public C13891b f36785b;

    /* renamed from: d */
    private final int f36786d;

    /* renamed from: e */
    private final Executor f36787e;

    /* renamed from: f */
    private C13891b f36788f;

    /* renamed from: g */
    private int f36789g;

    /* renamed from: com.facebook.internal.ad$a */
    public interface C13890a {
    }

    /* renamed from: com.facebook.internal.ad$b */
    class C13891b implements C13890a {

        /* renamed from: d */
        static final /* synthetic */ boolean f36792d = (!C13888ad.class.desiredAssertionStatus());

        /* renamed from: a */
        public final Runnable f36793a;

        /* renamed from: b */
        public C13891b f36794b;

        /* renamed from: c */
        public boolean f36795c;

        /* renamed from: f */
        private C13891b f36797f;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C13891b mo33545a(C13891b bVar) {
            if (!f36792d && this.f36794b == null) {
                throw new AssertionError();
            } else if (f36792d || this.f36797f != null) {
                if (bVar == this) {
                    if (this.f36794b == this) {
                        bVar = null;
                    } else {
                        bVar = this.f36794b;
                    }
                }
                this.f36794b.f36797f = this.f36797f;
                this.f36797f.f36794b = this.f36794b;
                this.f36797f = null;
                this.f36794b = null;
                return bVar;
            } else {
                throw new AssertionError();
            }
        }

        C13891b(Runnable runnable) {
            this.f36793a = runnable;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C13891b mo33546a(C13891b bVar, boolean z) {
            if (!f36792d && this.f36794b != null) {
                throw new AssertionError();
            } else if (f36792d || this.f36797f == null) {
                if (bVar == null) {
                    this.f36797f = this;
                    this.f36794b = this;
                    bVar = this;
                } else {
                    this.f36794b = bVar;
                    this.f36797f = bVar.f36797f;
                    C13891b bVar2 = this.f36794b;
                    this.f36797f.f36794b = this;
                    bVar2.f36797f = this;
                }
                if (z) {
                    return this;
                }
                return bVar;
            } else {
                throw new AssertionError();
            }
        }
    }

    public C13888ad() {
        this(8);
    }

    /* renamed from: a */
    private void m41012a() {
        mo33543a((C13891b) null);
    }

    public C13888ad(int i) {
        this(i, C13499h.m39719e());
    }

    /* renamed from: b */
    private void m41013b(final C13891b bVar) {
        this.f36787e.execute(new Runnable() {
            public final void run() {
                try {
                    bVar.f36793a.run();
                } finally {
                    C13888ad.this.mo33543a(bVar);
                }
            }
        });
    }

    /* renamed from: a */
    public final C13890a mo33542a(Runnable runnable) {
        return m41011a(runnable, true);
    }

    /* renamed from: a */
    public final void mo33543a(C13891b bVar) {
        C13891b bVar2;
        synchronized (this.f36784a) {
            if (bVar != null) {
                try {
                    this.f36788f = bVar.mo33545a(this.f36788f);
                    this.f36789g--;
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            if (this.f36789g < this.f36786d) {
                bVar2 = this.f36785b;
                if (bVar2 != null) {
                    this.f36785b = bVar2.mo33545a(this.f36785b);
                    this.f36788f = bVar2.mo33546a(this.f36788f, false);
                    this.f36789g++;
                    bVar2.f36795c = true;
                }
            } else {
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            m41013b(bVar2);
        }
    }

    private C13888ad(int i, Executor executor) {
        this.f36784a = new Object();
        this.f36788f = null;
        this.f36789g = 0;
        this.f36786d = i;
        this.f36787e = executor;
    }

    /* renamed from: a */
    private C13890a m41011a(Runnable runnable, boolean z) {
        C13891b bVar = new C13891b(runnable);
        synchronized (this.f36784a) {
            this.f36785b = bVar.mo33546a(this.f36785b, true);
        }
        m41012a();
        return bVar;
    }
}
