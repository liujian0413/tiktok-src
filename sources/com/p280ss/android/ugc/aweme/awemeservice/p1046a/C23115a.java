package com.p280ss.android.ugc.aweme.awemeservice.p1046a;

import com.p280ss.android.ugc.aweme.awemeservice.p1047b.C23135b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.services.IMainService;
import java.util.Collection;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.p1870h.C47589b;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p348d.C7328l;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.awemeservice.a.a */
public final class C23115a {

    /* renamed from: a */
    public static final C23122b<String> f61033a = new C23121a();

    /* renamed from: b */
    public static final C23115a f61034b = new C23115a();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static C23122b<String> f61035c;

    /* renamed from: com.ss.android.ugc.aweme.awemeservice.a.a$a */
    public static final class C23121a implements C23122b<String> {
        C23121a() {
        }

        /* renamed from: b */
        public final void mo60235b() {
            C23115a.f61035c.mo60235b();
        }

        /* renamed from: a */
        public final Collection<Aweme> mo60233a() {
            Collection<Aweme> a = C23115a.f61035c.mo60233a();
            C7573i.m23582a((Object) a, "cache.values()");
            return a;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Aweme mo60232a(Object obj) {
            return m75972a((String) obj);
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ boolean mo60236b(Object obj) {
            return m75974b((String) obj);
        }

        /* renamed from: a */
        private static Aweme m75972a(String str) {
            Aweme a = C23115a.f61035c.mo60232a(str);
            C7573i.m23582a((Object) a, "cache.get(key)");
            return a;
        }

        /* renamed from: b */
        private static boolean m75974b(String str) {
            return C23115a.f61035c.mo60236b(str);
        }

        /* renamed from: a */
        private static void m75973a(String str, Aweme aweme) {
            if (aweme != null) {
                Aweme clone = aweme.clone();
                C7573i.m23582a((Object) clone, "aweme.clone()");
                C23135b.m76053a(clone);
            }
            C23115a.f61035c.mo60234a(str, aweme);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo60234a(Object obj, Aweme aweme) {
            m75973a((String) obj, aweme);
        }
    }

    private C23115a() {
    }

    static {
        C23122b<String> cVar;
        Object service = ServiceManager.get().getService(IMainService.class);
        C7573i.m23582a(service, "ServiceManager.get().get…IMainService::class.java)");
        if (((IMainService) service).isReplaceAwemeCache()) {
            cVar = new C23124d<>();
        } else {
            cVar = new C23123c<>();
        }
        f61035c = cVar;
        C47589b.m148385a(C23135b.m76054b()).mo19317d((C7327h<? super T, ? extends R>) C231161.f61036a).mo19291a((C7328l<? super T>) C231172.f61037a).mo19317d((C7327h<? super T, ? extends R>) C231183.f61038a).mo19294a(C7333a.m23044b()).mo19280a((C7326g<? super T>) C231194.f61039a, (C7326g<? super Throwable>) C231205.f61040a);
    }
}
