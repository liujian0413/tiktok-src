package com.p280ss.android.socialbase.downloader.downloader;

import android.content.Context;
import com.p280ss.android.socialbase.downloader.depend.C20259y;
import com.p280ss.android.socialbase.downloader.network.C20345d;
import com.p280ss.android.socialbase.downloader.network.C20347f;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.socialbase.downloader.downloader.f */
public final class C20279f {

    /* renamed from: a */
    public final Context f54815a;

    /* renamed from: b */
    public C20285j f54816b;

    /* renamed from: c */
    public C20286k f54817c;

    /* renamed from: d */
    public int f54818d;

    /* renamed from: e */
    public C20281h f54819e;

    /* renamed from: f */
    public C20259y f54820f;

    /* renamed from: g */
    public C20347f f54821g;

    /* renamed from: h */
    public C20345d f54822h;

    /* renamed from: i */
    public C20287l f54823i;

    /* renamed from: j */
    public ExecutorService f54824j;

    /* renamed from: k */
    public ExecutorService f54825k;

    /* renamed from: l */
    public ExecutorService f54826l;

    /* renamed from: m */
    public ExecutorService f54827m;

    /* renamed from: n */
    public int f54828n;

    /* renamed from: o */
    public C20280g f54829o;

    /* renamed from: p */
    public boolean f54830p;

    /* renamed from: q */
    public C20291p f54831q;

    /* renamed from: r */
    public boolean f54832r;

    /* renamed from: s */
    public int f54833s = 1073741311;

    /* renamed from: a */
    public final Downloader mo54342a() {
        return new Downloader(this);
    }

    /* renamed from: a */
    public final C20279f mo54343a(int i) {
        this.f54833s = i;
        return this;
    }

    /* renamed from: b */
    public final C20279f mo54348b(ExecutorService executorService) {
        this.f54826l = executorService;
        return this;
    }

    public C20279f(Context context) {
        this.f54815a = context;
    }

    /* renamed from: a */
    public final C20279f mo54344a(C20280g gVar) {
        this.f54829o = gVar;
        return this;
    }

    /* renamed from: a */
    public final C20279f mo54345a(C20347f fVar) {
        this.f54821g = fVar;
        return this;
    }

    /* renamed from: a */
    public final C20279f mo54346a(ExecutorService executorService) {
        this.f54825k = executorService;
        return this;
    }

    /* renamed from: a */
    public final C20279f mo54347a(boolean z) {
        this.f54832r = z;
        return this;
    }
}
