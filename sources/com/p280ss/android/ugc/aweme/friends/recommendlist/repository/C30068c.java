package com.p280ss.android.ugc.aweme.friends.recommendlist.repository;

import com.bytedance.jedi.model.p602d.C11789a;
import com.p280ss.android.ugc.aweme.friends.model.RecommendList;
import com.p280ss.android.ugc.aweme.friends.recommendlist.repository.RecommendApi.C30055a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.user.repository.C42844a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.friends.recommendlist.repository.c */
public final class C30068c extends C11789a<C30070e, List<? extends C42844a>, C30070e, RecommendList> {

    /* renamed from: a */
    private final RecommendApi f79038a = C30055a.m98524a();

    /* renamed from: b */
    private static C30070e m98534b(C30070e eVar) {
        C7573i.m23587b(eVar, "req");
        return eVar;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo29352b(Object obj) {
        return m98534b((C30070e) obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C7492s<RecommendList> mo29350a(C30070e eVar) {
        C7573i.m23587b(eVar, "req");
        C7492s<RecommendList> b = this.f79038a.recommendList(eVar.f79043a, eVar.f79044b, eVar.f79045c, eVar.f79046d, eVar.f79047e, eVar.f79048f, eVar.f79049g, eVar.f79050h, eVar.f79051i, eVar.f79052j).mo19304b(C7333a.m23044b());
        C7573i.m23582a((Object) b, "service.recommendList(re…scribeOn(Schedulers.io())");
        return b;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo29351a(Object obj, Object obj2) {
        return m98533a((C30070e) obj, (RecommendList) obj2);
    }

    /* renamed from: a */
    private static List<C42844a> m98533a(C30070e eVar, RecommendList recommendList) {
        C7573i.m23587b(eVar, "req");
        C7573i.m23587b(recommendList, "resp");
        List<C42844a> list = null;
        if (recommendList.status_code != 0) {
            return null;
        }
        List<User> userList = recommendList.getUserList();
        if (userList != null) {
            list = new ArrayList<>();
            for (User user : userList) {
                C7573i.m23582a((Object) user, "it");
                user.setRequestId(recommendList.getRid());
                String rid = recommendList.getRid();
                C7573i.m23582a((Object) rid, "resp.rid");
                C42844a aVar = new C42844a(user, rid, 0, 4, null);
                list.add(aVar);
            }
        }
        return list;
    }
}
