package com.p280ss.android.ugc.aweme.userservice.jedi.p1690a;

import com.bytedance.jedi.model.p602d.C11789a;
import com.p280ss.android.ugc.aweme.profile.model.CommitRemarkNameResponse;
import com.p280ss.android.ugc.aweme.userservice.jedi.model.JediRemarkApi;
import com.p280ss.android.ugc.aweme.userservice.jedi.model.JediRemarkApi.C42865a;
import com.p280ss.android.ugc.aweme.utils.C43077dz;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.userservice.jedi.a.d */
public final class C42856d extends C11789a<String, String, C42857e, CommitRemarkNameResponse> {

    /* renamed from: a */
    private final JediRemarkApi f111347a = C42865a.m136065a();

    /* renamed from: b */
    private static String m136047b(C42857e eVar) {
        C7573i.m23587b(eVar, "req");
        return eVar.f111348a;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo29352b(Object obj) {
        return m136047b((C42857e) obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C7492s<CommitRemarkNameResponse> mo29350a(C42857e eVar) {
        C7573i.m23587b(eVar, "req");
        JediRemarkApi jediRemarkApi = this.f111347a;
        String str = eVar.f111349b;
        String str2 = eVar.f111348a;
        String b = C43077dz.m136657a().mo104733b(eVar.f111348a);
        C7573i.m23582a((Object) b, "SecUidManager.get().get(req.userId)");
        C7492s<CommitRemarkNameResponse> b2 = jediRemarkApi.commitRemarkName(str, str2, b).mo19304b(C7333a.m23044b());
        C7573i.m23582a((Object) b2, "service.commitRemarkName…scribeOn(Schedulers.io())");
        return b2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo29351a(Object obj, Object obj2) {
        return m136046a((C42857e) obj, (CommitRemarkNameResponse) obj2);
    }

    /* renamed from: a */
    private static String m136046a(C42857e eVar, CommitRemarkNameResponse commitRemarkNameResponse) {
        C7573i.m23587b(eVar, "req");
        C7573i.m23587b(commitRemarkNameResponse, "resp");
        if (commitRemarkNameResponse.statusCode == 0) {
            return commitRemarkNameResponse.remarkName;
        }
        return null;
    }
}
