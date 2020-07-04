package com.p280ss.android.ugc.aweme.follow.recommend.follow.repo;

import com.bytedance.jedi.model.p602d.C11789a;
import com.p280ss.android.ugc.aweme.follow.recommend.follow.repo.RecommendFollowApi.C29464a;
import com.p280ss.android.ugc.aweme.friends.model.RecommendList;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;

/* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.repo.b */
public final class C29477b extends C11789a<C29479d, List<? extends C29480e>, C29479d, RecommendList> {

    /* renamed from: a */
    private final RecommendFollowApi f77723a = C29464a.m96959a();

    /* renamed from: a */
    private static C29479d m96960a(C29479d dVar) {
        C7573i.m23587b(dVar, "req");
        return dVar;
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo29352b(Object obj) {
        return m96960a((C29479d) obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C7492s<RecommendList> mo29350a(C29479d dVar) {
        C7573i.m23587b(dVar, "req");
        return this.f77723a.recommendList(dVar.f77729a, dVar.f77730b, dVar.f77731c, dVar.f77732d, dVar.f77733e, dVar.f77734f, dVar.f77735g, dVar.f77736h, dVar.f77737i);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo29351a(Object obj, Object obj2) {
        return m96961a((C29479d) obj, (RecommendList) obj2);
    }

    /* renamed from: a */
    private static List<C29480e> m96961a(C29479d dVar, RecommendList recommendList) {
        C7573i.m23587b(dVar, "req");
        C7573i.m23587b(recommendList, "resp");
        if (recommendList.status_code != 0) {
            return null;
        }
        List<C29480e> recommendFollowList = recommendList.getRecommendFollowList();
        Iterable iterable = recommendFollowList;
        List userList = recommendList.getUserList();
        C7573i.m23582a((Object) userList, "resp.userList");
        Iterable iterable2 = userList;
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(C7525m.m23469a(iterable, 10), C7525m.m23469a(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            User user = (User) it2.next();
            C29480e eVar = (C29480e) it.next();
            C7573i.m23582a((Object) user, "user");
            eVar.mo75490a(user);
            arrayList.add(eVar);
        }
        return recommendFollowList;
    }
}
