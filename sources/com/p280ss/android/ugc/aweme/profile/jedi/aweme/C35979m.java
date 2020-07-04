package com.p280ss.android.ugc.aweme.profile.jedi.aweme;

import com.bytedance.jedi.model.p599a.C11750c;
import com.bytedance.jedi.model.p599a.C11757e;
import com.bytedance.jedi.model.p601c.C11783b;
import com.bytedance.jedi.model.p601c.C11785d;
import com.bytedance.jedi.model.p602d.C11790b;
import com.bytedance.jedi.model.p603e.C11801a.C11802a;
import com.bytedance.jedi.model.p603e.C11801a.C11805b;
import com.bytedance.jedi.model.p603e.C11801a.C11808c;
import com.bytedance.jedi.model.p603e.C11801a.C11811d;
import com.bytedance.jedi.model.repository.C11994b;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.profile.jedi.p1485a.C35820b;
import java.util.List;
import kotlin.C7581n;
import kotlin.Pair;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7496w;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.m */
public final class C35979m extends C11994b {

    /* renamed from: a */
    public static final C35981a f94157a = new C35981a(null);

    /* renamed from: b */
    private final C35972j f94158b = new C35972j();

    /* renamed from: c */
    private final C35965d f94159c = new C35965d();

    /* renamed from: d */
    private final C35971i f94160d = new C35971i();

    /* renamed from: e */
    private final C11750c<String, Aweme> f94161e;

    /* renamed from: f */
    private final C35955a f94162f;

    /* renamed from: g */
    private final C35956b f94163g;

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.m$a */
    public static final class C35981a {
        private C35981a() {
        }

        public /* synthetic */ C35981a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.m$b */
    static final class C35982b<T, R> implements C7327h<T, R> {

        /* renamed from: a */
        public static final C35982b f94165a = new C35982b();

        C35982b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return m115945a((FeedItemList) obj);
        }

        /* renamed from: a */
        private static FeedItemList m115945a(FeedItemList feedItemList) {
            List<Aweme> list;
            C7573i.m23587b(feedItemList, "it");
            List items = feedItemList.getItems();
            if (items != null) {
                list = C7525m.m23510e(items);
            } else {
                list = null;
            }
            feedItemList.items = list;
            return feedItemList;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.m$c */
    static final class C35983c<T, R> implements C7327h<T, R> {

        /* renamed from: a */
        public static final C35983c f94166a = new C35983c();

        C35983c() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return m115946a((FeedItemList) obj);
        }

        /* renamed from: a */
        private static FeedItemList m115946a(FeedItemList feedItemList) {
            List<Aweme> list;
            C7573i.m23587b(feedItemList, "it");
            List items = feedItemList.getItems();
            if (items != null) {
                list = C7525m.m23510e(items);
            } else {
                list = null;
            }
            feedItemList.items = list;
            return feedItemList;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.m$d */
    static final class C35984d<T> implements C7326g<FeedItemList> {

        /* renamed from: a */
        final /* synthetic */ String f94167a;

        C35984d(String str) {
            this.f94167a = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(FeedItemList feedItemList) {
            C35975l lVar = C35975l.f94147a;
            C7573i.m23582a((Object) feedItemList, "it");
            C35975l.m115925a(feedItemList, this.f94167a, 20);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.m$e */
    static final class C35985e<T, R> implements C7327h<T, R> {

        /* renamed from: a */
        public static final C35985e f94168a = new C35985e();

        C35985e() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return m115948a((FeedItemList) obj);
        }

        /* renamed from: a */
        private static FeedItemList m115948a(FeedItemList feedItemList) {
            List<Aweme> list;
            C7573i.m23587b(feedItemList, "it");
            List items = feedItemList.getItems();
            if (items != null) {
                list = C7525m.m23510e(items);
            } else {
                list = null;
            }
            feedItemList.items = list;
            return feedItemList;
        }
    }

    /* renamed from: c */
    public static C7492s<List<C27311c>> m115936c() {
        C7492s<List<C27311c>> d = C35820b.m115647d();
        C7573i.m23582a((Object) d, "AwemeDraftRepository.observeDrafts()");
        return d;
    }

    /* renamed from: d */
    public static C7319aa<List<C27311c>> m115937d() {
        C7319aa<List<C27311c>> b = C35820b.m115645b();
        C7573i.m23582a((Object) b, "AwemeDraftRepository.getDrafts()");
        return b;
    }

    /* renamed from: b */
    public final C7492s<List<Pair<Integer, List<Aweme>>>> mo90906b() {
        return C11783b.m34515a((C11757e<K, V>) this.f94160d).mo29343a(false, (C11785d<?, ?>[]) new C11785d[0]);
    }

    public C35979m() {
        Object service = ServiceManager.get().getService(IAwemeService.class);
        C7573i.m23582a(service, "ServiceManager.get().get…AwemeService::class.java)");
        this.f94161e = ((IAwemeService) service).getAwemeCache();
        this.f94162f = new C35955a();
        this.f94163g = new C35956b();
        mo29605a((C11790b<K, V, ?, ?>) this.f94158b, (C11757e<K1, V1>) this.f94160d, (C7562b<? super C11808c<K, V, K1, List<V1>>, C7581n>) new JediAwemeListRepository$$special$$inlined$syncAppendedListTo$1<Object,C7581n>());
        C11757e eVar = this.f94160d;
        C11750c<String, Aweme> cVar = this.f94161e;
        C7573i.m23582a((Object) cVar, "awemeCache");
        mo29604a(eVar, cVar, (C7562b<? super C11802a<K, List<V>, K1, V1>, C7581n>) new JediAwemeListRepository$$special$$inlined$syncChangedListTo$1<Object,C7581n>());
        C11750c<String, Aweme> cVar2 = this.f94161e;
        C7573i.m23582a((Object) cVar2, "awemeCache");
        mo29603a(cVar2, (C11757e<K1, V1>) this.f94160d, (C7562b<? super C11811d<K, V, K1, List<V1>>, C7581n>) new JediAwemeListRepository$$special$$inlined$syncChangedItemTo$1<Object,C7581n>());
        mo29606b(this.f94162f, this.f94160d, new JediAwemeListRepository$$special$$inlined$syncRemovedItemTo$1());
        mo29602a(C11783b.m34516a((C11790b<K, V, REQ, RESP>) this.f94163g), C11783b.m34515a((C11757e<K, V>) this.f94160d), C11805b.m34556a((C7563m<? super V, ? super V1, Boolean>) C11807b.f31599a, (C7563m<? super V, ? super V1, ? extends V1>) C359801.f94164a));
    }

    /* renamed from: a */
    public final void mo90904a(Aweme aweme) {
        C7573i.m23587b(aweme, "aweme");
        this.f94163g.mo90895a(aweme);
    }

    /* renamed from: a */
    public final void mo90905a(String str) {
        C7573i.m23587b(str, "aid");
        this.f94162f.mo90894a(str);
    }

    /* renamed from: a */
    public final C7492s<FeedItemList> mo90902a(long j, int i) {
        C35972j jVar = this.f94158b;
        C35967e eVar = new C35967e(4, i, j, null, null, 24, null);
        C7492s<FeedItemList> d = jVar.mo29357c(eVar).mo19294a(C47549a.m148327a()).mo19317d((C7327h<? super T, ? extends R>) C35982b.f94165a);
        C7573i.m23582a((Object) d, "awemeListFetcher.request…tems?.filterNotNull() } }");
        return d;
    }

    /* renamed from: a */
    public final C7492s<FeedItemList> mo90903a(String str, String str2, long j, int i) {
        C35972j jVar = this.f94158b;
        C35967e eVar = new C35967e(1, i, j, str, str2);
        C7492s<FeedItemList> d = jVar.mo29357c(eVar).mo19294a(C47549a.m148327a()).mo19317d((C7327h<? super T, ? extends R>) C35983c.f94166a);
        C7573i.m23582a((Object) d, "awemeListFetcher.request…tems?.filterNotNull() } }");
        return d;
    }

    /* renamed from: b */
    public final C7492s<FeedItemList> mo90907b(String str, String str2, long j, int i) {
        C35967e eVar = new C35967e(0, i, j, str, str2);
        C7492s d = this.f94158b.mo29357c(eVar).mo19317d((C7327h<? super T, ? extends R>) C35985e.f94168a);
        if (j == 0) {
            C7492s<FeedItemList> a = C7492s.m23297b((C7496w<? extends T>) d.mo19316d((C7326g<? super T>) new C35984d<Object>(str)).mo19302b((C7496w<? extends T>) this.f94159c.mo29357c(eVar)), (C7496w<? extends T>) this.f94159c.mo29357c(eVar)).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a());
            C7573i.m23582a((Object) a, "Observable.merge(fromNet…dSchedulers.mainThread())");
            return a;
        }
        C7492s<FeedItemList> a2 = d.mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a());
        C7573i.m23582a((Object) a2, "fromNetwork.subscribeOn(…dSchedulers.mainThread())");
        return a2;
    }

    /* renamed from: a */
    public static /* synthetic */ C7492s m115934a(C35979m mVar, String str, String str2, long j, int i, int i2, Object obj) {
        int i3;
        if ((i2 & 4) != 0) {
            j = 0;
        }
        long j2 = j;
        if ((i2 & 8) != 0) {
            i3 = 20;
        } else {
            i3 = i;
        }
        return mVar.mo90903a(str, str2, j2, i3);
    }

    /* renamed from: b */
    public static /* synthetic */ C7492s m115935b(C35979m mVar, String str, String str2, long j, int i, int i2, Object obj) {
        int i3;
        if ((i2 & 4) != 0) {
            j = 0;
        }
        long j2 = j;
        if ((i2 & 8) != 0) {
            i3 = 20;
        } else {
            i3 = i;
        }
        return mVar.mo90907b(str, str2, j2, i3);
    }
}
