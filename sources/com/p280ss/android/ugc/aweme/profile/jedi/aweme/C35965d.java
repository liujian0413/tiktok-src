package com.p280ss.android.ugc.aweme.profile.jedi.aweme;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.jedi.model.p602d.C11789a;
import com.p280ss.android.ugc.aweme.base.p1054a.p1055a.C23222h;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p280ss.android.ugc.aweme.profile.C36089t;
import java.util.List;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.d */
public final class C35965d extends C11789a<C35967e, List<? extends Aweme>, C35967e, FeedItemList> {

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.d$a */
    static final class C35966a<T, R> implements C7327h<T, R> {

        /* renamed from: a */
        final /* synthetic */ C35967e f94137a;

        C35966a(C35967e eVar) {
            this.f94137a = eVar;
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
            if (r2 == null) goto L_0x0013;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.p280ss.android.ugc.aweme.feed.model.FeedItemList apply(com.p280ss.android.ugc.aweme.profile.jedi.aweme.C35967e r2) {
            /*
                r1 = this;
                java.lang.String r0 = "it"
                kotlin.jvm.internal.C7573i.m23587b(r2, r0)
                com.ss.android.ugc.aweme.profile.jedi.aweme.e r2 = r1.f94137a
                java.lang.String r2 = r2.f94141d
                if (r2 == 0) goto L_0x0013
                com.ss.android.ugc.aweme.profile.jedi.aweme.l r0 = com.p280ss.android.ugc.aweme.profile.jedi.aweme.C35975l.f94147a
                com.ss.android.ugc.aweme.feed.model.FeedItemList r2 = r0.mo90901a(r2)
                if (r2 != 0) goto L_0x0018
            L_0x0013:
                com.ss.android.ugc.aweme.feed.model.FeedItemList r2 = new com.ss.android.ugc.aweme.feed.model.FeedItemList
                r2.<init>()
            L_0x0018:
                r0 = 0
                r2.hasMore = r0
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.profile.jedi.aweme.C35965d.C35966a.apply(com.ss.android.ugc.aweme.profile.jedi.aweme.e):com.ss.android.ugc.aweme.feed.model.FeedItemList");
        }
    }

    /* renamed from: a */
    private static C35967e m115908a(C35967e eVar) {
        C7573i.m23587b(eVar, "req");
        return eVar;
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo29352b(Object obj) {
        return m115908a((C35967e) obj);
    }

    /* renamed from: a */
    public final /* synthetic */ C7492s mo29350a(Object obj) {
        return m115910b((C35967e) obj);
    }

    /* renamed from: b */
    private static C7492s<FeedItemList> m115910b(C35967e eVar) {
        C7573i.m23587b(eVar, "req");
        ((C36089t) C23222h.m76242a(C6399b.m19921a(), C36089t.class)).mo60380a("");
        C7492s<FeedItemList> b = C7492s.m23301b(eVar).mo19317d((C7327h<? super T, ? extends R>) new C35966a<Object,Object>(eVar)).mo19304b(C7333a.m23044b());
        C7573i.m23582a((Object) b, "Observable.just(req).map…scribeOn(Schedulers.io())");
        return b;
    }

    /* renamed from: a */
    private static List<Aweme> m115909a(C35967e eVar, FeedItemList feedItemList) {
        C7573i.m23587b(eVar, "req");
        C7573i.m23587b(feedItemList, "resp");
        return feedItemList.getItems();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo29351a(Object obj, Object obj2) {
        return m115909a((C35967e) obj, (FeedItemList) obj2);
    }
}
