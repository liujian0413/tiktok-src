package com.p280ss.android.ugc.aweme.feed.netdetector;

import android.os.Handler;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.p280ss.android.ugc.aweme.feed.netdetector.base.C28555d;
import com.p280ss.android.ugc.aweme.feed.netdetector.fetchfeed.FetchFeedDetectorManager;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.feed.netdetector.a */
public final class C28545a {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f75189a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C28545a.class), "fetchFeedDetectorManager", "getFetchFeedDetectorManager()Lcom/ss/android/ugc/aweme/feed/netdetector/fetchfeed/FetchFeedDetectorManager;"))};

    /* renamed from: b */
    public static final C28545a f75190b = new C28545a();

    /* renamed from: c */
    private static final C7541d f75191c = C7546e.m23569a(C28546a.f75192a);

    /* renamed from: com.ss.android.ugc.aweme.feed.netdetector.a$a */
    static final class C28546a extends Lambda implements C7561a<FetchFeedDetectorManager> {

        /* renamed from: a */
        public static final C28546a f75192a = new C28546a();

        C28546a() {
            super(0);
        }

        /* renamed from: a */
        private static FetchFeedDetectorManager m93756a() {
            return new FetchFeedDetectorManager();
        }

        public final /* synthetic */ Object invoke() {
            return m93756a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.netdetector.a$b */
    static final class C28547b implements Runnable {

        /* renamed from: a */
        public static final C28547b f75193a = new C28547b();

        C28547b() {
        }

        public final void run() {
            C28545a.f75190b.mo73257a().mo73273b();
        }
    }

    private C28545a() {
    }

    /* renamed from: a */
    public final FetchFeedDetectorManager mo73257a() {
        return (FetchFeedDetectorManager) f75191c.getValue();
    }

    /* renamed from: b */
    public static void m93751b() {
        if (C28548b.m93760b()) {
            new Handler().postDelayed(C28547b.f75193a, DouPlusShareGuideExperiment.MIN_VALID_DURATION);
        }
    }

    /* renamed from: a */
    public final C28555d mo73256a(C28555d dVar) {
        C7573i.m23587b(dVar, "requestDetectInterceptor");
        if (!C28548b.m93758a()) {
            return dVar;
        }
        mo73257a().mo73269a(dVar);
        return dVar;
    }

    /* renamed from: a */
    public final void mo73258a(C7562b<? super Boolean, C7581n> bVar) {
        C7573i.m23587b(bVar, "unit");
        if (C28548b.m93760b()) {
            mo73257a().mo73272a(bVar);
        }
    }

    /* renamed from: b */
    public final void mo73259b(C7562b<? super Boolean, C7581n> bVar) {
        C7573i.m23587b(bVar, "unit");
        if (C28548b.m93760b()) {
            mo73257a().mo73274b(bVar);
        }
    }
}
