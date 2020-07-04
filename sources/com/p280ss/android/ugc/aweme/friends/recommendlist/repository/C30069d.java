package com.p280ss.android.ugc.aweme.friends.recommendlist.repository;

import com.bytedance.jedi.model.p599a.C11750c;
import com.bytedance.jedi.model.p599a.C11757e;
import com.bytedance.jedi.model.p601c.C11783b;
import com.bytedance.jedi.model.p601c.C11785d;
import com.bytedance.jedi.model.p601c.C11786e;
import com.bytedance.jedi.model.p602d.C11790b;
import com.bytedance.jedi.model.p603e.C11801a.C11802a;
import com.bytedance.jedi.model.p603e.C11801a.C11808c;
import com.bytedance.jedi.model.p603e.C11801a.C11811d;
import com.bytedance.jedi.model.repository.C11994b;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.friends.model.RecommendList;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.user.repository.C42844a;
import com.p280ss.android.ugc.aweme.userservice.api.C42846a;
import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7496w;

/* renamed from: com.ss.android.ugc.aweme.friends.recommendlist.repository.d */
public final class C30069d extends C11994b {

    /* renamed from: a */
    private final C30068c f79039a = new C30068c();

    /* renamed from: b */
    private final C30067b f79040b = new C30067b();

    /* renamed from: c */
    private final C30065a f79041c = new C30065a();

    /* renamed from: d */
    private final C11750c<String, User> f79042d = ((C42846a) ServiceManager.get().getService(C42846a.class)).mo104552a();

    public C30069d() {
        mo29605a((C11790b<K, V, ?, ?>) this.f79039a, (C11757e<K1, V1>) this.f79040b, (C7562b<? super C11808c<K, V, K1, List<V1>>, C7581n>) new RecommendListRepository$$special$$inlined$syncAppendedListTo$1<Object,C7581n>());
        mo29604a((C11757e<K, V>) this.f79040b, this.f79042d, (C7562b<? super C11802a<K, List<V>, K1, V1>, C7581n>) new RecommendListRepository$$special$$inlined$syncChangedListTo$1<Object,C7581n>());
        mo29603a(this.f79042d, (C11757e<K1, V1>) this.f79040b, (C7562b<? super C11811d<K, V, K1, List<V1>>, C7581n>) new RecommendListRepository$$special$$inlined$syncChangedItemTo$1<Object,C7581n>());
        mo29606b(this.f79041c, this.f79040b, new RecommendListRepository$$special$$inlined$syncRemovedItemTo$1());
    }

    /* renamed from: a */
    public final C7319aa<String> mo76451a(String str) {
        C7573i.m23587b(str, "userId");
        C7319aa<String> a = C7319aa.m22929a((C7496w<? extends T>) this.f79041c.mo29357c(str));
        C7573i.m23582a((Object) a, "Single.fromObservable(di…dFetcher.request(userId))");
        return a;
    }

    /* renamed from: a */
    public final C7492s<C11786e<List<C42844a>>> mo76452a(int i) {
        return C11783b.m34515a((C11757e<K, V>) this.f79040b).mo29342a(Integer.valueOf(i), (C11785d<?, ?>[]) new C11785d[]{C11783b.m34516a((C11790b<K, V, REQ, RESP>) this.f79039a)});
    }

    /* renamed from: a */
    public final C7492s<RecommendList> mo76453a(Integer num, Integer num2, String str, int i, Integer num3, Integer num4, String str2, String str3, Integer num5, String str4) {
        C30068c cVar = this.f79039a;
        C30070e eVar = new C30070e(num, num2, str, i, num3, num4, str2, null, num5, str4);
        return cVar.mo29357c(eVar);
    }
}
