package com.p280ss.android.ugc.aweme.userservice.jedi.p1690a;

import com.bytedance.jedi.model.p602d.C11789a;
import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p280ss.android.ugc.aweme.userservice.jedi.model.JediFollowApi;
import com.p280ss.android.ugc.aweme.userservice.jedi.model.JediFollowApi.C42864a;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.userservice.jedi.a.a */
public final class C42848a extends C11789a<String, Integer, C42849b, FollowStatus> {

    /* renamed from: a */
    public final JediFollowApi f111329a = C42864a.m136064a();

    /* renamed from: b */
    private static String m136034b(C42849b bVar) {
        C7573i.m23587b(bVar, "req");
        return bVar.f111330a;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo29352b(Object obj) {
        return m136034b((C42849b) obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C7492s<FollowStatus> mo29350a(C42849b bVar) {
        C7573i.m23587b(bVar, "req");
        if (bVar.f111334e == -1) {
            C7492s<FollowStatus> b = this.f111329a.follow(bVar.f111330a, bVar.f111331b, bVar.f111332c, bVar.f111333d, null, bVar.f111335f, null).mo19304b(C7333a.m23044b());
            C7573i.m23582a((Object) b, "service.follow(req.userI…scribeOn(Schedulers.io())");
            return b;
        }
        C7492s<FollowStatus> b2 = this.f111329a.follow(bVar.f111330a, bVar.f111331b, bVar.f111332c, bVar.f111333d, Integer.valueOf(bVar.f111334e), bVar.f111335f, Integer.valueOf(bVar.f111336g)).mo19304b(C7333a.m23044b());
        C7573i.m23582a((Object) b2, "service.follow(req.userI…scribeOn(Schedulers.io())");
        return b2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo29351a(Object obj, Object obj2) {
        return m136033a((C42849b) obj, (FollowStatus) obj2);
    }

    /* renamed from: a */
    private static Integer m136033a(C42849b bVar, FollowStatus followStatus) {
        C7573i.m23587b(bVar, "req");
        C7573i.m23587b(followStatus, "resp");
        if (followStatus.status_code == 0) {
            return Integer.valueOf(followStatus.followStatus);
        }
        return null;
    }
}
