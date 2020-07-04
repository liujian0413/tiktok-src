package com.p280ss.android.ugc.aweme.discover.viewmodel;

import android.arch.lifecycle.C0063u;
import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23084b;
import com.p280ss.android.ugc.aweme.discover.api.SuggestApi;
import com.p280ss.android.ugc.aweme.discover.api.p1174a.C26568a;
import com.p280ss.android.ugc.aweme.discover.model.suggest.SuggestMusic;
import com.p280ss.android.ugc.aweme.discover.model.suggest.SuggestMusicResponse;
import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.SuggestMusicViewModel */
public final class SuggestMusicViewModel extends C0063u {

    /* renamed from: a */
    public final C23084b<C26568a<List<SuggestMusic>>> f71767a = new C23084b<>();

    /* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.SuggestMusicViewModel$a */
    static final class C27252a<TTaskResult, TContinuationResult> implements C1591g<SuggestMusicResponse, Object> {

        /* renamed from: a */
        final /* synthetic */ SuggestMusicViewModel f71768a;

        C27252a(SuggestMusicViewModel suggestMusicViewModel) {
            this.f71768a = suggestMusicViewModel;
        }

        public final /* synthetic */ Object then(C1592h hVar) {
            m89268a(hVar);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m89268a(C1592h<SuggestMusicResponse> hVar) {
            C7573i.m23582a((Object) hVar, "it");
            if (hVar.mo6889d()) {
                C23084b<C26568a<List<SuggestMusic>>> bVar = this.f71768a.f71767a;
                Exception f = hVar.mo6891f();
                C7573i.m23582a((Object) f, "it.error");
                bVar.setValue(new C26568a(f));
                return;
            }
            this.f71768a.f71767a.setValue(new C26568a(((SuggestMusicResponse) hVar.mo6890e()).data));
        }
    }

    /* renamed from: a */
    public final void mo70000a() {
        SuggestApi.m87321b().mo6876a((C1591g<TResult, TContinuationResult>) new C27252a<TResult,TContinuationResult>(this), C1592h.f5958b);
    }
}
