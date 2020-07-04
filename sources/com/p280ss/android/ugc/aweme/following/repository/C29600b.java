package com.p280ss.android.ugc.aweme.following.repository;

import com.bytedance.jedi.model.p599a.C11750c;
import com.bytedance.jedi.model.p599a.C11757e;
import com.bytedance.jedi.model.p602d.C11790b;
import com.bytedance.jedi.model.p603e.C11801a.C11802a;
import com.bytedance.jedi.model.p603e.C11801a.C11808c;
import com.bytedance.jedi.model.p603e.C11801a.C11811d;
import com.bytedance.jedi.model.repository.C11994b;
import com.p280ss.android.ugc.aweme.following.model.C29564a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.userservice.api.C42846a;
import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;
import p346io.reactivex.C7492s;

/* renamed from: com.ss.android.ugc.aweme.following.repository.b */
public final class C29600b extends C11994b {

    /* renamed from: a */
    private final C29604f f77957a = new C29604f();

    /* renamed from: b */
    private final C29608j f77958b = new C29608j();

    /* renamed from: c */
    private final C11750c<String, User> f77959c = ((C42846a) ServiceManager.get().getService(C42846a.class)).mo104552a();

    public C29600b() {
        mo29605a((C11790b<K, V, ?, ?>) this.f77957a, (C11757e<K1, V1>) this.f77958b, (C7562b<? super C11808c<K, V, K1, List<V1>>, C7581n>) new C29576x89ea801d<Object,C7581n>());
        mo29604a((C11757e<K, V>) this.f77958b, this.f77959c, (C7562b<? super C11802a<K, List<V>, K1, V1>, C7581n>) new C29582x836c75c<Object,C7581n>());
        mo29603a(this.f77959c, (C11757e<K1, V1>) this.f77958b, (C7562b<? super C11811d<K, V, K1, List<V1>>, C7581n>) new C29579xfe314f51<Object,C7581n>());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C7492s<C29564a> m97124a(String str, Integer num, Integer num2) {
        C7573i.m23587b(str, "uid");
        return this.f77957a.mo29357c(new C29599a(str, num, num2));
    }
}
