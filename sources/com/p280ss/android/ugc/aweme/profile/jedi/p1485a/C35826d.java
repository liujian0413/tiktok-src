package com.p280ss.android.ugc.aweme.profile.jedi.p1485a;

import com.bytedance.jedi.model.p602d.C11800e;
import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.profile.service.C36065a;
import com.p280ss.android.ugc.aweme.services.IAVService;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.C7581n;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.p1877a.C47886a;
import p346io.reactivex.C7492s;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.profile.jedi.a.d */
public final class C35826d extends C11800e<C7581n, List<? extends C27311c>> {

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.a.d$a */
    static final class C35827a<V> implements Callable<T> {

        /* renamed from: a */
        public static final C35827a f93879a = new C35827a();

        /* renamed from: com.ss.android.ugc.aweme.profile.jedi.a.d$a$a */
        public static final class C35828a<T> implements Comparator<T> {
            public final int compare(T t, T t2) {
                C27311c cVar = (C27311c) t2;
                C7573i.m23582a((Object) cVar, "it");
                Comparable valueOf = Long.valueOf(cVar.f72018F);
                C27311c cVar2 = (C27311c) t;
                C7573i.m23582a((Object) cVar2, "it");
                return C47886a.m148819a(valueOf, Long.valueOf(cVar2.f72018F));
            }
        }

        C35827a() {
        }

        public final /* synthetic */ Object call() {
            return m115653a();
        }

        /* renamed from: a */
        private static List<C27311c> m115653a() {
            C36065a.f94305a.mo91792a();
            List<C27311c> queryList = ((IAVService) ServiceManager.get().getService(IAVService.class)).draftService().queryList();
            if (queryList == null) {
                queryList = C7525m.m23461a();
            }
            if (queryList.size() > 1) {
                C7525m.m23474a(queryList, new C35828a());
            }
            return queryList;
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C7492s mo29350a(Object obj) {
        return m115651a((C7581n) obj);
    }

    /* renamed from: a */
    private static C7492s<List<C27311c>> m115651a(C7581n nVar) {
        C7573i.m23587b(nVar, "req");
        C7492s<List<C27311c>> a = C7492s.m23290a((Callable<? extends T>) C35827a.f93879a).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a());
        C7573i.m23582a((Object) a, "Observable.fromCallable …dSchedulers.mainThread())");
        return a;
    }
}
