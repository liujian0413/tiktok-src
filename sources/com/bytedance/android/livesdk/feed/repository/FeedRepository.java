package com.bytedance.android.livesdk.feed.repository;

import android.arch.paging.C0100h.C0106d.C0107a;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.feed.C2344a;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.base.model.media.C2358d;
import com.bytedance.android.live.core.feed.FeedApi;
import com.bytedance.android.live.core.network.NetworkStat;
import com.bytedance.android.live.core.p145a.C3144a;
import com.bytedance.android.live.core.p145a.C3145b;
import com.bytedance.android.live.core.p145a.C3158n;
import com.bytedance.android.live.core.paging.C3197b;
import com.bytedance.android.live.core.paging.p151a.C3182d;
import com.bytedance.android.live.core.paging.p152b.C3199b;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.core.utils.C3407t;
import com.bytedance.android.live.network.response.C3474a;
import com.bytedance.android.livesdk.feed.ApiCallBack;
import com.bytedance.android.livesdk.feed.ApiCallBack.ApiType;
import com.bytedance.android.livesdk.feed.C5980f;
import com.bytedance.android.livesdk.feed.C6038k;
import com.bytedance.android.livesdk.feed.C6083o;
import com.bytedance.android.livesdk.feed.IFeedRepository;
import com.bytedance.android.livesdk.feed.IFeedRepository.C5920a;
import com.bytedance.android.livesdk.feed.feed.C5984a;
import com.bytedance.android.livesdk.feed.feed.C5985b;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.feed.p227b.C5951b;
import com.bytedance.android.livesdk.feed.p228c.C5967a;
import com.bytedance.android.livesdk.feed.p229d.C5971a;
import com.bytedance.android.livesdk.feed.setting.LiveFeedSettings;
import com.bytedance.android.livesdkapi.depend.model.live.C9368k;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C6311g;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p346io.reactivex.C7492s;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p354j.C7486b;

public class FeedRepository extends BaseFeedRepository implements ApiCallBack, IFeedRepository {

    /* renamed from: f */
    protected final FeedApi f17986f;

    /* renamed from: g */
    protected final C3144a<FeedDataKey, C2344a> f17987g;

    /* renamed from: h */
    protected C5920a f17988h;

    /* renamed from: i */
    protected C5984a<C3197b<FeedItem>, C5985b> f17989i;

    /* renamed from: j */
    protected C7486b<Object> f17990j = C7486b.m23223a();

    /* renamed from: k */
    protected C7486b<String> f17991k = C7486b.m23223a();

    /* renamed from: l */
    protected C7486b<List<ImageModel>> f17992l = C7486b.m23223a();

    /* renamed from: m */
    protected C7486b<Pair<String, String>> f17993m = C7486b.m23223a();

    /* renamed from: n */
    protected C7486b<String> f17994n = C7486b.m23223a();

    /* renamed from: o */
    protected final C5971a f17995o;

    /* renamed from: p */
    protected C3197b<FeedItem> f17996p;

    /* renamed from: q */
    protected int f17997q = -1;

    /* renamed from: r */
    protected final C3144a<Long, Integer> f17998r;

    /* renamed from: s */
    public C5980f f17999s;

    /* renamed from: t */
    public C6087a f18000t;

    /* renamed from: u */
    private C5967a f18001u;

    /* renamed from: v */
    private String f18002v;

    /* renamed from: w */
    private C6083o f18003w;

    /* renamed from: x */
    private boolean f18004x = false;

    /* renamed from: com.bytedance.android.livesdk.feed.repository.FeedRepository$a */
    public static class C6087a implements C3199b<FeedItem> {

        /* renamed from: a */
        public String f18005a;

        /* renamed from: b */
        C7486b<String> f18006b;

        /* renamed from: c */
        C7486b<String> f18007c;

        /* renamed from: d */
        private int f18008d;

        /* renamed from: e */
        private FeedApi f18009e;

        /* renamed from: f */
        private String f18010f = "enter_auto";

        /* renamed from: g */
        private String f18011g = "feed_loadmore";

        /* renamed from: h */
        private C5971a f18012h;

        /* renamed from: i */
        private C6088a f18013i;

        /* renamed from: j */
        private C5980f f18014j;

        /* renamed from: k */
        private long f18015k;

        /* renamed from: l */
        private C5967a f18016l;

        /* renamed from: m */
        private FeedDataKey f18017m;

        /* renamed from: n */
        private ApiCallBack f18018n;

        /* renamed from: o */
        private C7486b<List<ImageModel>> f18019o;

        /* renamed from: p */
        private final C47562b f18020p = new C47562b();

        /* renamed from: q */
        private C6083o f18021q;

        /* renamed from: com.bytedance.android.livesdk.feed.repository.FeedRepository$a$a */
        interface C6088a {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final /* synthetic */ void mo14759b() {
            this.f18014j.mo14610a();
        }

        /* renamed from: a */
        public final void mo14755a() {
            this.f18020p.mo119660a();
        }

        /* renamed from: a */
        private void m19013a(C7321c cVar) {
            this.f18020p.mo119661a(cVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final /* synthetic */ void mo14760c(Pair pair) throws Exception {
            this.f18015k = 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo14757a(Integer num) throws Exception {
            this.f18014j.mo14610a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public final /* synthetic */ void mo14761d(Pair pair) throws Exception {
            new Handler(Looper.getMainLooper()).post(new C6097i(this));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public final /* synthetic */ void mo14762e(Pair pair) throws Exception {
            if (pair.first != null) {
                this.f18010f = (String) pair.first;
            }
            if (pair.second != null) {
                this.f18011g = (String) pair.second;
            }
        }

        /* renamed from: b */
        static final /* synthetic */ void m19014b(Pair pair) throws Exception {
            if (pair != null && !C6311g.m19573a((List) pair.first)) {
                for (FeedItem feedItem : (List) pair.first) {
                    if (((C2344a) pair.second).mo8249a() != null) {
                        feedItem.logPb = ((C2344a) pair.second).mo8249a().toString();
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo14756a(Pair pair) throws Exception {
            if (pair != null && !C6311g.m19573a((List) pair.first)) {
                ArrayList arrayList = new ArrayList();
                for (FeedItem feedItem : (List) pair.first) {
                    if (!(feedItem == null || feedItem.item == null || !(feedItem.item instanceof C2358d) || ((C2358d) feedItem.item).getVideoModel() == null || ((C2358d) feedItem.item).getVideoModel().getCoverModel() == null)) {
                        arrayList.add(((C2358d) feedItem.item).getVideoModel().getCoverModel());
                    }
                }
                this.f18019o.onNext(arrayList);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo14758a(boolean z, Throwable th) throws Exception {
            ApiType apiType;
            String str;
            ApiCallBack apiCallBack = this.f18018n;
            if (z) {
                apiType = ApiType.REFRESH;
            } else {
                apiType = ApiType.LOAD_MORE;
            }
            if (z) {
                str = this.f18010f;
            } else {
                str = this.f18011g;
            }
            apiCallBack.mo14444a(apiType, str, th);
        }

        /* renamed from: a */
        private static void m19012a(FeedItem feedItem, C2344a aVar) {
            if (!(feedItem == null || aVar == null || (feedItem.type != 1 && feedItem.type != 2))) {
                Room room = (Room) feedItem.item;
                if (aVar.mo8249a() != null) {
                    room.setLog_pb(aVar.mo8249a().toString());
                    if (room.getOwner() != null) {
                        room.getOwner().setLogPb(aVar.mo8249a().toString());
                    }
                }
                room.setRequestId(feedItem.resId);
            }
            if (feedItem != null && feedItem.type == 1 && (feedItem.item instanceof Room)) {
                ((Room) feedItem.item).isFromRecommendCard = feedItem.isRecommendCard;
            }
        }

        /* renamed from: b */
        private static void m19015b(FeedItem feedItem, C2344a aVar) {
            if (feedItem != null && aVar != null && feedItem.type == 3) {
                C9368k kVar = (C9368k) feedItem.item;
                if (aVar.mo8249a() != null) {
                    kVar.f25676J = aVar.mo8249a().toString();
                }
                kVar.f25675I = feedItem.resId;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ Pair mo14754a(boolean z, C3474a aVar) throws Exception {
            ApiType apiType;
            String str;
            ArrayList<FeedItem> arrayList = new ArrayList<>(aVar.f10296b);
            if (this.f18015k != 0 && !arrayList.isEmpty()) {
                FeedItem feedItem = (FeedItem) arrayList.get(0);
                if (feedItem.item != null && feedItem.item.getId() == this.f18015k) {
                    feedItem.repeatDisable = true;
                }
            }
            C2344a aVar2 = (C2344a) aVar.f10297c;
            if (!C6311g.m19573a(arrayList)) {
                for (FeedItem feedItem2 : arrayList) {
                    m19012a(feedItem2, aVar2);
                    m19015b(feedItem2, aVar2);
                }
            }
            this.f18014j.mo14614a(this.f18005a, arrayList, aVar2, z);
            if (z) {
                this.f18008d = arrayList.size();
            } else {
                this.f18008d += arrayList.size();
            }
            ApiCallBack apiCallBack = this.f18018n;
            if (z) {
                apiType = ApiType.REFRESH;
            } else {
                apiType = ApiType.LOAD_MORE;
            }
            if (z) {
                str = this.f18010f;
            } else {
                str = this.f18011g;
            }
            apiCallBack.mo14443a(apiType, str, aVar2);
            return Pair.create(arrayList, aVar.f10297c);
        }

        /* renamed from: a */
        public final C7492s<Pair<List<FeedItem>, C2344a>> mo10093a(boolean z, Long l, int i) {
            C7492s sVar;
            m19013a(C7492s.m23301b(Integer.valueOf(1)).mo19320e(3000, TimeUnit.MILLISECONDS).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C6098j<Object>(this), C6099k.f18031a));
            if (z) {
                this.f18018n.mo14442a(ApiType.REFRESH, this.f18010f);
                if (this.f18015k > 0) {
                    sVar = this.f18009e.feed(this.f18005a, 0, "push");
                } else {
                    if (((Boolean) LiveFeedSettings.REFRESH_SHOW_SANDBOX_ROOM.mo10240a()).booleanValue() && C5951b.m18637b().mo14561a().getChannel().equals("local_test")) {
                        this.f18010f = "feed_refresh_local_test";
                    }
                    sVar = this.f18009e.feed(this.f18005a, 0, this.f18010f);
                }
                this.f18006b.onNext(this.f18010f);
            } else {
                this.f18018n.mo14442a(ApiType.LOAD_MORE, this.f18011g);
                sVar = this.f18009e.feed(this.f18005a, l.longValue(), this.f18011g);
                this.f18006b.onNext(this.f18011g);
                this.f18007c.onNext(this.f18011g);
            }
            return sVar.mo19317d((C7327h<? super T, ? extends R>) new C6100l<Object,Object>(this, z)).mo19316d((C7326g<? super T>) new C6101m<Object>(this)).mo19316d((C7326g<? super T>) new C6102n<Object>(this)).mo19316d(C6103o.f18036a).mo19316d((C7326g<? super T>) new C6104p<Object>(this)).mo19307c((C7326g<? super Throwable>) new C6105q<Object>(this, z));
        }

        C6087a(String str, FeedApi feedApi, C5971a aVar, C5980f fVar, C7486b<Pair<String, String>> bVar, ApiCallBack apiCallBack, C7486b<String> bVar2, C7486b<String> bVar3, String str2, C6088a aVar2, C5967a aVar3, FeedDataKey feedDataKey, C7486b<List<ImageModel>> bVar4, C6083o oVar) {
            this.f18005a = str;
            this.f18009e = feedApi;
            this.f18013i = aVar2;
            this.f18014j = fVar;
            this.f18012h = aVar;
            this.f18016l = aVar3;
            this.f18017m = feedDataKey;
            this.f18006b = bVar2;
            this.f18018n = apiCallBack;
            this.f18007c = bVar3;
            this.f18010f = str2;
            m19013a(bVar.mo19280a((C7326g<? super T>) new C6095g<Object>(this), C6096h.f18028a));
            this.f18019o = bVar4;
            this.f18021q = oVar;
        }
    }

    /* renamed from: a */
    public final C7486b<Object> mo14495a() {
        return this.f17990j;
    }

    /* renamed from: b */
    public final C7492s<String> mo14499b() {
        return this.f17991k;
    }

    /* renamed from: c */
    public final C7492s<List<ImageModel>> mo14500c() {
        return this.f17992l;
    }

    /* renamed from: e */
    public final C5980f mo14502e() {
        return this.f17999s;
    }

    /* renamed from: i */
    public final C3197b<FeedItem> mo14748i() {
        return this.f17996p;
    }

    /* renamed from: j */
    public final C5984a<C3197b<FeedItem>, C5985b> mo14753j() {
        return this.f17989i;
    }

    /* renamed from: m */
    private String m18994m() {
        if (this.f18004x) {
            return "enter_auto_from_room";
        }
        return "enter_auto";
    }

    /* renamed from: f */
    public final List<FeedItem> mo14508f() {
        return this.f17979b.mo9986a(mo14747h());
    }

    /* renamed from: k */
    private int m18992k() {
        if (this.f17988h == null || this.f17988h.mo14504b() <= 0) {
            return 12;
        }
        return this.f17988h.mo14504b();
    }

    /* renamed from: l */
    private int m18993l() {
        if (this.f17988h == null || this.f17988h.mo14505c() <= 0) {
            return 4;
        }
        return this.f17988h.mo14505c();
    }

    /* renamed from: d */
    public final void mo14501d() {
        if (this.f17978a != null) {
            mo14747h();
            TextUtils.equals(this.f18002v, "enter_auto");
            mo14747h();
        }
    }

    /* renamed from: g */
    public final void mo14509g() {
        this.f17979b.mo9990b(mo14747h());
        if (this.f18000t != null) {
            this.f18000t.mo14755a();
        }
    }

    /* renamed from: h */
    public final FeedDataKey mo14747h() {
        if (this.f17988h != null) {
            return this.f17988h.mo14503a();
        }
        throw new IllegalStateException("not call init() or params be null");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo14752d(String str) throws Exception {
        this.f18002v = str;
    }

    /* renamed from: a */
    public final void mo14497a(C5920a aVar) {
        this.f17988h = aVar;
    }

    /* renamed from: b */
    public final void mo14506b(String str) {
        FeedItem c = mo14507c(str);
        if (c != null) {
            this.f17979b.mo9988a(mo14747h(), c);
        }
        if (this.f17996p != null) {
            this.f17996p.mo10039h();
        }
    }

    /* renamed from: c */
    public final FeedItem mo14507c(String str) {
        return (FeedItem) this.f17979b.mo9985a(mo14747h(), (C3158n<V>) new C6094f<V>(str));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo14751a(NetworkStat networkStat) {
        if (networkStat != null && networkStat.mo10027c() && this.f17990j != null) {
            this.f17990j.onNext(C3303k.f10035a);
        }
    }

    /* renamed from: a */
    public final C5984a<C3197b<FeedItem>, C5985b> mo14494a(String str) {
        FeedApi feedApi = this.f17986f;
        C5971a aVar = this.f17995o;
        C5980f fVar = this.f17999s;
        C7486b<Pair<String, String>> bVar = this.f17993m;
        C7486b<String> bVar2 = this.f17994n;
        C7486b<String> bVar3 = this.f17991k;
        String m = m18994m();
        C6092d dVar = new C6092d(this);
        C5967a aVar2 = this.f18001u;
        FeedDataKey a = this.f17988h.mo14503a();
        C7486b<List<ImageModel>> bVar4 = this.f17992l;
        C6083o oVar = this.f18003w;
        C6087a aVar3 = r0;
        C6087a aVar4 = new C6087a(str, feedApi, aVar, fVar, bVar, this, bVar2, bVar3, m, dVar, aVar2, a, bVar4, oVar);
        this.f18000t = aVar3;
        C3197b<FeedItem> n = new C3182d().mo10054a((C3199b<V>) this.f18000t).mo10055a(this.f17988h.mo14503a()).mo10053a(this.f17979b, this.f17987g).mo10052a(new C0107a().mo228a(false).mo227a(m18992k()).mo231c(m18992k()).mo230b(m18993l()).mo229a()).mo10063n();
        this.f17989i = new C5984a<>(n, new C5985b());
        this.f17996p = n;
        n.mo10034c().observeForever(new C6093e(this));
        return this.f17989i;
    }

    /* renamed from: a */
    public final void mo14498a(String str, String str2) {
        this.f17993m.onNext(new Pair(str, str2));
    }

    /* renamed from: a */
    static final /* synthetic */ boolean m18991a(String str, FeedItem feedItem) throws Exception {
        if (feedItem == null || feedItem.item == null || !C3407t.m12666a(feedItem.item.getMixId(), str)) {
            return false;
        }
        return true;
    }

    public FeedRepository(C5980f fVar, FeedApi feedApi, C3144a<FeedDataKey, C2344a> aVar, C3145b<FeedDataKey, FeedItem> bVar, C3144a<Long, Integer> aVar2, C5971a aVar3, C6038k kVar, C5967a aVar4) {
        super(fVar, null, bVar);
        this.f17999s = fVar;
        this.f17986f = feedApi;
        this.f17987g = aVar;
        this.f17998r = aVar2;
        this.f17995o = aVar3;
        this.f18001u = aVar4;
        mo14746a(this.f17994n.mo19280a((C7326g<? super T>) new C6090b<Object>(this), C6091c.f18023a));
    }
}
