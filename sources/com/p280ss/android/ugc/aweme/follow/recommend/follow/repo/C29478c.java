package com.p280ss.android.ugc.aweme.follow.recommend.follow.repo;

import android.text.TextUtils;
import com.bytedance.jedi.model.p599a.C11750c;
import com.bytedance.jedi.model.p599a.C11757e;
import com.bytedance.jedi.model.p601c.C11783b;
import com.bytedance.jedi.model.p601c.C11785d;
import com.bytedance.jedi.model.p602d.C11790b;
import com.bytedance.jedi.model.p603e.C11801a.C11802a;
import com.bytedance.jedi.model.p603e.C11801a.C11808c;
import com.bytedance.jedi.model.p603e.C11801a.C11811d;
import com.bytedance.jedi.model.repository.C11994b;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.friends.model.RecommendList;
import com.p280ss.android.ugc.aweme.friends.recommendlist.repository.C30065a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.userservice.api.C42846a;
import java.util.List;
import kotlin.C7581n;
import kotlin.Pair;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7496w;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.repo.c */
public final class C29478c extends C11994b {

    /* renamed from: a */
    private final C29477b f77724a = new C29477b();

    /* renamed from: b */
    private final C29476a f77725b = new C29476a();

    /* renamed from: c */
    private final C30065a f77726c = new C30065a();

    /* renamed from: d */
    private final C11750c<String, User> f77727d = ((C42846a) ServiceManager.get().getService(C42846a.class)).mo104552a();

    /* renamed from: e */
    private final C11750c<String, Aweme> f77728e;

    /* renamed from: b */
    public final C7492s<List<Pair<C7581n, List<C29480e>>>> mo75485b() {
        return C11783b.m34515a((C11757e<K, V>) this.f77725b).mo29343a(false, (C11785d<?, ?>[]) new C11785d[]{C11783b.m34516a((C11790b<K, V, REQ, RESP>) this.f77724a)});
    }

    public C29478c() {
        Object service = ServiceManager.get().getService(IAwemeService.class);
        C7573i.m23582a(service, "ServiceManager.get().get…AwemeService::class.java)");
        this.f77728e = ((IAwemeService) service).getAwemeCache();
        mo29605a((C11790b<K, V, ?, ?>) this.f77724a, (C11757e<K1, V1>) this.f77725b, (C7562b<? super C11808c<K, V, K1, List<V1>>, C7581n>) new RecommendFollowRepository$$special$$inlined$syncAppendedListTo$1<Object,C7581n>());
        mo29604a((C11757e<K, V>) this.f77725b, this.f77727d, (C7562b<? super C11802a<K, List<V>, K1, V1>, C7581n>) new RecommendFollowRepository$$special$$inlined$syncChangedListTo$1<Object,C7581n>());
        mo29603a(this.f77727d, (C11757e<K1, V1>) this.f77725b, (C7562b<? super C11811d<K, V, K1, List<V1>>, C7581n>) new RecommendFollowRepository$$special$$inlined$syncChangedItemTo$1<Object,C7581n>());
        C11750c<String, Aweme> cVar = this.f77728e;
        C7573i.m23582a((Object) cVar, "awemeCache");
        mo29603a(cVar, (C11757e<K1, V1>) this.f77725b, (C7562b<? super C11811d<K, V, K1, List<V1>>, C7581n>) new RecommendFollowRepository$$special$$inlined$syncChangedItemTo$2<Object,C7581n>(this, this));
        mo29606b(this.f77726c, this.f77725b, new RecommendFollowRepository$$special$$inlined$syncRemovedItemTo$1());
    }

    /* renamed from: a */
    public final C7319aa<String> mo75483a(String str) {
        C7573i.m23587b(str, "userId");
        C7319aa<String> a = C7319aa.m22929a((C7496w<? extends T>) this.f77726c.mo29357c(str)).mo19135b(C7333a.m23044b()).mo19127a(C47549a.m148327a());
        C7573i.m23582a((Object) a, "Single.fromObservable(di…dSchedulers.mainThread())");
        return a;
    }

    /* renamed from: a */
    public static C29480e m96966a(C29480e eVar, Aweme aweme) {
        int i = -1;
        int i2 = 0;
        for (Object next : eVar.f77739b) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C7525m.m23465b();
            }
            if (TextUtils.equals(((Aweme) next).getAid(), aweme.getAid())) {
                i = i2;
            }
            i2 = i3;
        }
        if (i >= 0) {
            eVar.f77739b.set(i, aweme);
        }
        return eVar;
    }

    /* renamed from: a */
    public static boolean m96967a(List<? extends Aweme> list, Aweme aweme) {
        String str;
        if (list != null) {
            for (Aweme aweme2 : list) {
                if (aweme != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                if (TextUtils.equals(str, aweme2.getAid())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final C7492s<RecommendList> mo75484a(int i, int i2, String str, int i3, int i4, int i5, String str2, int i6, String str3) {
        C29477b bVar = this.f77724a;
        C29479d dVar = new C29479d(30, i2, str, 11, 0, i5, str2, i6, str3);
        C7492s<RecommendList> a = bVar.mo29357c(dVar).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a());
        C7573i.m23582a((Object) a, "recommendFollowFetcher.r…dSchedulers.mainThread())");
        return a;
    }
}
