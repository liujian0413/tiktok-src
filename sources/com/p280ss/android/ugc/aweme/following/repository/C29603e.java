package com.p280ss.android.ugc.aweme.following.repository;

import com.bytedance.jedi.model.p599a.C11757e;
import com.bytedance.jedi.model.p602d.C11790b;
import com.bytedance.jedi.model.p603e.C11801a.C11802a;
import com.bytedance.jedi.model.p603e.C11801a.C11808c;
import com.bytedance.jedi.model.p603e.C11801a.C11811d;
import com.bytedance.jedi.model.repository.C11994b;
import com.p280ss.android.ugc.aweme.following.model.C29570e;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.userservice.api.C42846a;
import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;
import p346io.reactivex.C7492s;

/* renamed from: com.ss.android.ugc.aweme.following.repository.e */
public final class C29603e extends C11994b {

    /* renamed from: a */
    private final C29606h f77971a = new C29606h();

    /* renamed from: b */
    private final C29608j f77972b = new C29608j();

    public C29603e() {
        mo29605a((C11790b<K, V, ?, ?>) this.f77971a, (C11757e<K1, V1>) this.f77972b, (C7562b<? super C11808c<K, V, K1, List<V1>>, C7581n>) new C29591x3b3aa995<Object,C7581n>());
        mo29604a((C11757e<K, V>) this.f77972b, ((C42846a) ServiceManager.get().getService(C42846a.class)).mo104552a(), (C7562b<? super C11802a<K, List<V>, K1, V1>, C7581n>) new C29597x4fff8ee4<Object,C7581n>());
        mo29603a(((C42846a) ServiceManager.get().getService(C42846a.class)).mo104552a(), (C11757e<K1, V1>) this.f77972b, (C7562b<? super C11811d<K, V, K1, List<V1>>, C7581n>) new C29594x45fa16d9<Object,C7581n>());
    }

    /* renamed from: a */
    public final C7492s<C29570e> mo75616a(String str, String str2, long j, int i, int i2, int i3, int i4, int i5) {
        String str3 = str;
        C7573i.m23587b(str, "userId");
        String str4 = str2;
        C7573i.m23587b(str2, "secUserId");
        C29606h hVar = this.f77971a;
        C29601c cVar = new C29601c(str3, str4, j, 20, i2, i3, i4, i5);
        return hVar.mo29357c(cVar);
    }
}
