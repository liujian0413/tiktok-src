package com.p280ss.android.ugc.aweme.shortvideo.upload.p1621b;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.common.base.C17454q;
import com.google.common.base.C17463v;
import com.p280ss.android.ugc.aweme.shortvideo.upload.C41497w;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.utils.C43104eo;
import java.util.concurrent.TimeUnit;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.b.c */
public final class C41444c {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f107814a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C41444c.class), "syntheticTimeCounter", "getSyntheticTimeCounter()Lcom/google/common/base/Stopwatch;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C41444c.class), "uploadWaitTimeCounter", "getUploadWaitTimeCounter()Lcom/ss/android/ugc/aweme/shortvideo/upload/UploadWaitTimeCounter;"))};

    /* renamed from: b */
    public long f107815b = -1;

    /* renamed from: c */
    public long f107816c = -1;

    /* renamed from: d */
    public long f107817d = -1;

    /* renamed from: e */
    public long f107818e = -1;

    /* renamed from: f */
    private final C7541d f107819f = C7546e.m23569a(C41445a.f107821a);

    /* renamed from: g */
    private final C7541d f107820g = C7546e.m23569a(C41446b.f107822a);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.b.c$a */
    static final class C41445a extends Lambda implements C7561a<C17454q> {

        /* renamed from: a */
        public static final C41445a f107821a = new C41445a();

        C41445a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m132101a();
        }

        /* renamed from: a */
        private static C17454q m132101a() {
            return C17454q.m58002a((C17463v) C43104eo.f111724a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.b.c$b */
    static final class C41446b extends Lambda implements C7561a<C41497w> {

        /* renamed from: a */
        public static final C41446b f107822a = new C41446b();

        C41446b() {
            super(0);
        }

        /* renamed from: a */
        private static C41497w m132102a() {
            return new C41497w();
        }

        public final /* synthetic */ Object invoke() {
            return m132102a();
        }
    }

    /* renamed from: g */
    private final C17454q m132093g() {
        return (C17454q) this.f107819f.getValue();
    }

    /* renamed from: h */
    private final C41497w m132094h() {
        return (C41497w) this.f107820g.getValue();
    }

    /* renamed from: e */
    public final void mo102101e() {
        m132094h().mo102154a();
    }

    /* renamed from: f */
    public final void mo102102f() {
        m132094h().mo102155b();
    }

    /* renamed from: a */
    public final long mo102097a() {
        return m132093g().mo44941a(TimeUnit.MILLISECONDS);
    }

    /* renamed from: b */
    public final long mo102098b() {
        return m132094h().mo102156c();
    }

    /* renamed from: c */
    public final void mo102099c() {
        if (m132093g().f48412a) {
            m132092a("repeat startSynthetic");
            return;
        }
        m132093g().mo44942c();
        this.f107815b = System.currentTimeMillis();
    }

    /* renamed from: d */
    public final void mo102100d() {
        if (!m132093g().f48412a) {
            m132092a("repeat endSynthetic");
            return;
        }
        m132093g().mo44943d();
        this.f107816c = System.currentTimeMillis();
    }

    /* renamed from: a */
    private static void m132092a(String str) {
        StringBuilder sb = new StringBuilder("PublishPerformanceRecorder : ");
        sb.append(str);
        String sb2 = sb.toString();
        if (!C6399b.m19928c()) {
            C41530am.m132283b(sb2);
            return;
        }
        throw new RuntimeException(sb2);
    }
}
