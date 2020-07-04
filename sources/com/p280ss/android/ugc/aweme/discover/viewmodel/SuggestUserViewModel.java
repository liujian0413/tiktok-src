package com.p280ss.android.ugc.aweme.discover.viewmodel;

import android.arch.lifecycle.C0063u;
import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23084b;
import com.p280ss.android.ugc.aweme.discover.api.SuggestApi;
import com.p280ss.android.ugc.aweme.discover.api.p1174a.C26568a;
import com.p280ss.android.ugc.aweme.discover.model.suggest.SuggestUser;
import com.p280ss.android.ugc.aweme.discover.model.suggest.SuggestUserResponse;
import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.SuggestUserViewModel */
public final class SuggestUserViewModel extends C0063u {

    /* renamed from: a */
    public C23084b<C26568a<List<SuggestUser>>> f71769a = new C23084b<>();

    /* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.SuggestUserViewModel$a */
    static final class C27253a<TTaskResult, TContinuationResult> implements C1591g<SuggestUserResponse, Object> {

        /* renamed from: a */
        final /* synthetic */ SuggestUserViewModel f71770a;

        C27253a(SuggestUserViewModel suggestUserViewModel) {
            this.f71770a = suggestUserViewModel;
        }

        public final /* synthetic */ Object then(C1592h hVar) {
            m89270a(hVar);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m89270a(C1592h<SuggestUserResponse> hVar) {
            C7573i.m23582a((Object) hVar, "it");
            if (hVar.mo6889d()) {
                C23084b<C26568a<List<SuggestUser>>> bVar = this.f71770a.f71769a;
                Exception f = hVar.mo6891f();
                C7573i.m23582a((Object) f, "it.error");
                bVar.setValue(new C26568a(f));
                return;
            }
            this.f71770a.f71769a.setValue(new C26568a(((SuggestUserResponse) hVar.mo6890e()).data));
        }
    }

    /* renamed from: a */
    public final void mo70001a() {
        SuggestApi.m87320a().mo6876a((C1591g<TResult, TContinuationResult>) new C27253a<TResult,TContinuationResult>(this), C1592h.f5958b);
    }
}
