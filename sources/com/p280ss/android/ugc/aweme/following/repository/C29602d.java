package com.p280ss.android.ugc.aweme.following.repository;

import com.bytedance.jedi.model.p599a.C11750c;
import com.bytedance.jedi.model.p599a.C11757e;
import com.bytedance.jedi.model.p602d.C11790b;
import com.bytedance.jedi.model.p603e.C11801a.C11802a;
import com.bytedance.jedi.model.p603e.C11801a.C11808c;
import com.bytedance.jedi.model.p603e.C11801a.C11811d;
import com.bytedance.jedi.model.repository.C11994b;
import com.p280ss.android.ugc.aweme.following.model.C29567c;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p1019ap.C22666a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.userservice.api.C42846a;
import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;
import p346io.reactivex.C7492s;

/* renamed from: com.ss.android.ugc.aweme.following.repository.d */
public final class C29602d extends C11994b implements C22666a {

    /* renamed from: a */
    private final C29605g f77968a = new C29605g();

    /* renamed from: b */
    private final C29608j f77969b = new C29608j();

    /* renamed from: c */
    private final C11750c<String, User> f77970c = ((C42846a) ServiceManager.get().getService(C42846a.class)).mo104552a();

    public C29602d() {
        mo29605a((C11790b<K, V, ?, ?>) this.f77968a, (C11757e<K1, V1>) this.f77969b, (C7562b<? super C11808c<K, V, K1, List<V1>>, C7581n>) new C29585x754cdc68<Object,C7581n>());
        mo29604a((C11757e<K, V>) this.f77969b, this.f77970c, (C7562b<? super C11802a<K, List<V>, K1, V1>, C7581n>) new FollowerRelationRepository$$special$$inlined$syncChangedListTo$1<Object,C7581n>());
        mo29603a(this.f77970c, (C11757e<K1, V1>) this.f77969b, (C7562b<? super C11811d<K, V, K1, List<V1>>, C7581n>) new FollowerRelationRepository$$special$$inlined$syncChangedItemTo$1<Object,C7581n>());
    }

    public final C7492s<C29567c> queryFollowerList(String str, String str2, long j, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        String str3 = str;
        C7573i.m23587b(str, "userId");
        String str4 = str2;
        C7573i.m23587b(str2, "secUserId");
        C29605g gVar = this.f77968a;
        C29601c cVar = new C29601c(str3, str4, j, i, i2, i3, i4, i5);
        return gVar.mo29357c(cVar);
    }
}
