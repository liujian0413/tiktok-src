package com.bytedance.frameworks.baselib.network.dispatcher;

import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: com.bytedance.frameworks.baselib.network.dispatcher.f */
public final class C10101f {

    /* renamed from: a */
    public ThreadPoolExecutor f27477a;

    /* renamed from: b */
    public ThreadPoolExecutor f27478b;

    /* renamed from: c */
    public int f27479c;

    /* renamed from: d */
    public int f27480d;

    /* renamed from: e */
    public int f27481e;

    /* renamed from: f */
    public int f27482f;

    /* renamed from: g */
    public long f27483g;

    /* renamed from: h */
    public long f27484h;

    /* renamed from: i */
    public long f27485i;

    /* renamed from: j */
    public boolean f27486j;

    /* renamed from: com.bytedance.frameworks.baselib.network.dispatcher.f$a */
    public static final class C10103a {

        /* renamed from: a */
        public ThreadPoolExecutor f27487a;

        /* renamed from: b */
        public ThreadPoolExecutor f27488b;

        /* renamed from: c */
        public int f27489c;

        /* renamed from: d */
        public int f27490d;

        /* renamed from: e */
        public int f27491e;

        /* renamed from: f */
        public int f27492f;

        /* renamed from: g */
        public long f27493g;

        /* renamed from: h */
        public long f27494h;

        /* renamed from: i */
        public long f27495i;

        /* renamed from: j */
        public boolean f27496j = true;

        /* renamed from: a */
        public final C10101f mo24761a() {
            return new C10101f(this);
        }

        /* renamed from: a */
        public final C10103a mo24760a(boolean z) {
            this.f27496j = true;
            return this;
        }

        /* renamed from: c */
        public final C10103a mo24764c(long j) {
            this.f27495i = 10;
            return this;
        }

        /* renamed from: a */
        public final C10103a mo24759a(long j) {
            this.f27493g = 30;
            return this;
        }

        /* renamed from: b */
        public final C10103a mo24763b(long j) {
            this.f27494h = 10;
            return this;
        }

        /* renamed from: a */
        public final C10103a mo24758a(int i, int i2) {
            this.f27489c = 8;
            this.f27491e = 8;
            return this;
        }

        /* renamed from: b */
        public final C10103a mo24762b(int i, int i2) {
            this.f27490d = 8;
            this.f27492f = 8;
            return this;
        }
    }

    /* renamed from: a */
    public static C10103a m29994a() {
        return new C10103a();
    }

    private C10101f(C10103a aVar) {
        this.f27479c = 8;
        this.f27480d = 8;
        this.f27481e = 8;
        this.f27482f = 8;
        this.f27483g = 30;
        this.f27484h = 10;
        this.f27485i = 10;
        this.f27486j = true;
        if (aVar.f27488b != null) {
            this.f27477a = aVar.f27488b;
        }
        if (aVar.f27487a != null) {
            this.f27478b = aVar.f27487a;
        }
        if (aVar.f27489c > 0) {
            this.f27479c = aVar.f27489c;
        }
        if (aVar.f27490d > 0) {
            this.f27480d = aVar.f27490d;
        }
        if (aVar.f27491e > 0) {
            this.f27481e = aVar.f27491e;
        }
        if (aVar.f27492f > 0) {
            this.f27482f = aVar.f27492f;
        }
        if (aVar.f27493g > 0) {
            this.f27483g = aVar.f27493g;
        }
        if (aVar.f27494h > 0) {
            this.f27484h = aVar.f27494h;
        }
        if (aVar.f27495i > 0) {
            this.f27485i = aVar.f27495i;
        }
        this.f27486j = aVar.f27496j;
    }
}
