package com.p280ss.android.ugc.aweme.tools.beauty.manager;

import com.p280ss.android.ugc.aweme.beauty.C23537g;
import com.p280ss.android.ugc.aweme.beauty.C23538h;
import com.p280ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.p280ss.android.ugc.aweme.effect.p1197c.C27400a;
import com.p280ss.android.ugc.aweme.effect.p1197c.p1198a.C27413a;
import com.p280ss.android.ugc.aweme.effect.p1197c.p1199b.C27418d;
import com.p280ss.android.ugc.aweme.filter.p1242a.C29185b;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.manager.b */
public final class C42191b {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f109760a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C42191b.class), "DOWNLOAD_SCHEDULER", "getDOWNLOAD_SCHEDULER()Lcom/ss/android/ugc/aweme/effect/persistence/PrioritySerialTaskScheduler;"))};

    /* renamed from: b */
    public static final C42191b f109761b = new C42191b();

    /* renamed from: c */
    private static final C7541d f109762c = C7546e.m23569a(C42192a.f109763a);

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.manager.b$a */
    static final class C42192a extends Lambda implements C7561a<C27400a<C23537g, Void>> {

        /* renamed from: a */
        public static final C42192a f109763a = new C42192a();

        C42192a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m134233a();
        }

        /* renamed from: a */
        private static C27400a<C23537g, Void> m134233a() {
            C27400a<C23537g, Void> aVar = new C27400a<>(3, new C29185b());
            aVar.f72293b = 0;
            aVar.f72295d = true;
            aVar.f72294c = true;
            aVar.f72296e = new C27418d() {
                /* renamed from: a */
                public final void mo70531a(Exception exc) {
                    C7573i.m23587b(exc, "exception");
                    if (!C7163a.m22363a()) {
                        C41530am.m132281a((Throwable) exc);
                        return;
                    }
                    throw new RuntimeException(exc);
                }
            };
            return aVar;
        }
    }

    private C42191b() {
    }

    /* renamed from: b */
    private final C27400a<C23537g, Void> m134226b() {
        return (C27400a) f109762c.getValue();
    }

    /* renamed from: a */
    public final void mo103629a() {
        m134226b().mo70507b();
    }

    /* renamed from: b */
    public static boolean m134227b(ComposerBeauty composerBeauty) {
        C7573i.m23587b(composerBeauty, "beautyBean");
        if (C23538h.m77304a(composerBeauty.getEffect().getEffectId()) < 0) {
            return true;
        }
        return C42194c.m134241a(composerBeauty);
    }

    /* renamed from: c */
    public final int mo103633c(ComposerBeauty composerBeauty) {
        C7573i.m23587b(composerBeauty, "beautyBean");
        if (m134227b(composerBeauty)) {
            return 1;
        }
        if (m134226b().mo70506a(new C23537g(composerBeauty, null, 2, null)) || m134226b().mo70510b(new C23537g(composerBeauty, null, 2, null))) {
            return 2;
        }
        return 0;
    }

    /* renamed from: a */
    public static void m134225a(List<ComposerBeauty> list) {
        C7573i.m23587b(list, "beautyBeans");
        if (!(!list.isEmpty())) {
            list = null;
        }
        if (list != null) {
            Iterable<ComposerBeauty> iterable = list;
            Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
            for (ComposerBeauty gVar : iterable) {
                arrayList.add(new C23537g(gVar, null, 2, null));
            }
            f109761b.m134226b().mo70504a((List) arrayList);
        }
    }

    /* renamed from: a */
    public final boolean mo103631a(ComposerBeauty composerBeauty) {
        C7573i.m23587b(composerBeauty, "beautyBean");
        if (1 == mo103633c(composerBeauty)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo103630a(C23537g gVar, C27413a<C23537g, Void> aVar) {
        C7573i.m23587b(gVar, "beautyDownload");
        C7573i.m23587b(aVar, "callback");
        m134226b().m89788a(gVar, aVar, null);
    }

    /* renamed from: b */
    public final void mo103632b(C23537g gVar, C27413a<C23537g, Void> aVar) {
        C7573i.m23587b(gVar, "beautyDownload");
        m134226b().mo70515d(gVar, aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m134223a(C23537g gVar, boolean z, C27413a<C23537g, Void> aVar) {
        C7573i.m23587b(gVar, "beautyDownload");
        if (z) {
            m134226b().mo70509b(gVar, aVar);
        } else {
            m134226b().mo70503a(gVar, aVar);
        }
    }
}
