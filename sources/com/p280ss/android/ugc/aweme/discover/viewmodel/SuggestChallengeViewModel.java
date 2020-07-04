package com.p280ss.android.ugc.aweme.discover.viewmodel;

import android.arch.lifecycle.C0063u;
import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23084b;
import com.p280ss.android.ugc.aweme.discover.api.SuggestApi;
import com.p280ss.android.ugc.aweme.discover.api.p1174a.C26568a;
import com.p280ss.android.ugc.aweme.discover.model.suggest.SuggestChallenge;
import com.p280ss.android.ugc.aweme.discover.model.suggest.SuggestChallengeResponse;
import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.SuggestChallengeViewModel */
public final class SuggestChallengeViewModel extends C0063u {

    /* renamed from: a */
    public final C23084b<C26568a<List<SuggestChallenge>>> f71765a = new C23084b<>();

    /* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.SuggestChallengeViewModel$a */
    static final class C27251a<TTaskResult, TContinuationResult> implements C1591g<SuggestChallengeResponse, Object> {

        /* renamed from: a */
        final /* synthetic */ SuggestChallengeViewModel f71766a;

        C27251a(SuggestChallengeViewModel suggestChallengeViewModel) {
            this.f71766a = suggestChallengeViewModel;
        }

        public final /* synthetic */ Object then(C1592h hVar) {
            m89266a(hVar);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m89266a(C1592h<SuggestChallengeResponse> hVar) {
            C7573i.m23582a((Object) hVar, "it");
            if (hVar.mo6889d()) {
                C23084b<C26568a<List<SuggestChallenge>>> bVar = this.f71766a.f71765a;
                Exception f = hVar.mo6891f();
                C7573i.m23582a((Object) f, "it.error");
                bVar.setValue(new C26568a(f));
                return;
            }
            this.f71766a.f71765a.setValue(new C26568a(((SuggestChallengeResponse) hVar.mo6890e()).data));
        }
    }

    /* renamed from: a */
    public final void mo69999a() {
        SuggestApi.m87322c().mo6876a((C1591g<TResult, TContinuationResult>) new C27251a<TResult,TContinuationResult>(this), C1592h.f5958b);
    }
}
