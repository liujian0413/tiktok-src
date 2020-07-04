package com.p280ss.android.ugc.aweme.following.repository;

import com.bytedance.jedi.model.p602d.C11789a;
import com.p280ss.android.ugc.aweme.following.model.C29567c;
import com.p280ss.android.ugc.aweme.following.repository.FollowRelationApi.C29584a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.following.repository.g */
public final class C29605g extends C11789a<C29601c, List<? extends User>, C29601c, C29567c> {

    /* renamed from: a */
    private final FollowRelationApi f77974a = C29584a.m97122a();

    /* renamed from: b */
    private static C29601c m97134b(C29601c cVar) {
        C7573i.m23587b(cVar, "req");
        return cVar;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo29352b(Object obj) {
        return m97134b((C29601c) obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C7492s<C29567c> mo29350a(C29601c cVar) {
        C7573i.m23587b(cVar, "req");
        C7492s<C29567c> b = this.f77974a.queryFollowerList(cVar.f77960a, cVar.f77961b, cVar.f77962c, cVar.f77963d, cVar.f77964e, cVar.f77965f, cVar.f77966g, cVar.f77967h).mo19304b(C7333a.m23044b());
        C7573i.m23582a((Object) b, "service.queryFollowerLis…scribeOn(Schedulers.io())");
        return b;
    }

    /* renamed from: a */
    private static List<User> m97133a(C29601c cVar, C29567c cVar2) {
        C7573i.m23587b(cVar, "req");
        C7573i.m23587b(cVar2, "resp");
        return cVar2.f77906a;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo29351a(Object obj, Object obj2) {
        return m97133a((C29601c) obj, (C29567c) obj2);
    }
}
