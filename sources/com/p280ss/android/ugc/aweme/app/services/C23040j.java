package com.p280ss.android.ugc.aweme.app.services;

import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.challenge.api.ChallengeApi;
import com.p280ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25242ao;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.main.p1385g.C33020g;
import com.p280ss.android.ugc.aweme.main.p1385g.C33020g.C33021a;
import com.p280ss.android.ugc.aweme.music.model.Music;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.ugc.aweme.app.services.j */
public final class C23040j implements C33020g {

    /* renamed from: com.ss.android.ugc.aweme.app.services.j$a */
    static class C23041a {

        /* renamed from: a */
        public static final C23040j f60804a = new C23040j();
    }

    /* renamed from: a */
    public static C23040j m75720a() {
        return C23041a.f60804a;
    }

    /* renamed from: a */
    public final Challenge mo60013a(String str, int i, boolean z) throws Exception {
        return ChallengeApi.m77599a(str, 0, false).challenge;
    }

    /* renamed from: a */
    static final /* synthetic */ ChallengeDetail m75721a(boolean z, String str, C1592h hVar) throws Exception {
        ChallengeDetail challengeDetail;
        if (hVar.mo6887c() || hVar.mo6889d() || hVar.mo6890e() == null) {
            return null;
        }
        if (z) {
            challengeDetail = (ChallengeDetail) hVar.mo6890e();
            Challenge challenge = challengeDetail.challenge;
            if (challenge != null && C25242ao.m82979c(challenge)) {
                C25242ao.m82972a(challenge);
                challengeDetail = (ChallengeDetail) ChallengeApi.m77602b(str, str, 0, 0).mo6890e();
            }
        } else {
            challengeDetail = (ChallengeDetail) hVar.mo6890e();
        }
        return challengeDetail;
    }

    /* renamed from: a */
    static final /* synthetic */ Object m75722a(String str, Music music, C33021a aVar, String str2, C1592h hVar) throws Exception {
        ChallengeDetail challengeDetail;
        if (hVar.mo6887c() || hVar.mo6889d()) {
            challengeDetail = null;
        } else {
            challengeDetail = (ChallengeDetail) hVar.mo6890e();
            if (challengeDetail != null) {
                List connectMusics = challengeDetail.challenge.getConnectMusics();
                if (connectMusics != null && connectMusics.size() > 0 && (!aVar.mo61959a(str2, challengeDetail.challenge) || !C6399b.m19944t())) {
                    str = null;
                    music = null;
                }
            }
        }
        boolean z = false;
        if (challengeDetail != null && challengeDetail.challenge != null && challengeDetail.challenge.isCommerce() && !C6307b.m19566a((Collection<T>) challengeDetail.challenge.getConnectMusics())) {
            z = true;
        }
        aVar.mo61958a(str, music, z);
        return null;
    }

    /* renamed from: a */
    public final void mo60014a(String str, String str2, String str3, Music music, C33021a aVar) {
        C1592h hVar;
        boolean z;
        if (C25242ao.m82977b(str2)) {
            hVar = ChallengeApi.m77602b(str2, null, 0, 0);
            z = false;
        } else {
            z = true;
            hVar = ChallengeApi.m77597a(str2, null, 0, 0);
        }
        hVar.mo6876a((C1591g<TResult, TContinuationResult>) new C23042k<TResult,TContinuationResult>(z, str2), (Executor) C1592h.f5957a).mo6876a((C1591g<TResult, TContinuationResult>) new C23043l<TResult,TContinuationResult>(str3, music, aVar, str), C1592h.f5958b);
    }
}
