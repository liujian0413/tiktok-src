package com.p280ss.android.ugc.aweme.following.repository;

import com.bytedance.jedi.model.p602d.C11789a;
import com.p280ss.android.ugc.aweme.following.model.C29564a;
import com.p280ss.android.ugc.aweme.following.repository.FollowRelationApi.C29584a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;

/* renamed from: com.ss.android.ugc.aweme.following.repository.f */
public final class C29604f extends C11789a<C29599a, List<? extends User>, C29599a, C29564a> {

    /* renamed from: a */
    private final FollowRelationApi f77973a = C29584a.m97122a();

    /* renamed from: b */
    private static C29599a m97128b(C29599a aVar) {
        C7573i.m23587b(aVar, "req");
        return aVar;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo29352b(Object obj) {
        return m97128b((C29599a) obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C7492s<C29564a> mo29350a(C29599a aVar) {
        C7573i.m23587b(aVar, "req");
        return this.f77973a.queryConnectedList(aVar.f77954a, aVar.f77955b, aVar.f77956c);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo29351a(Object obj, Object obj2) {
        return m97127a((C29599a) obj, (C29564a) obj2);
    }

    /* renamed from: a */
    private static List<User> m97127a(C29599a aVar, C29564a aVar2) {
        C7573i.m23587b(aVar, "req");
        C7573i.m23587b(aVar2, "resp");
        if (aVar2.status_code == 0) {
            return aVar2.f77892b;
        }
        return null;
    }
}
