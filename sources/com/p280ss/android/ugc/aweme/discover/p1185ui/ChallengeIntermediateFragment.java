package com.p280ss.android.ugc.aweme.discover.p1185ui;

import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.discover.api.p1174a.C26568a;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.discover.model.suggest.SuggestChallenge;
import com.p280ss.android.ugc.aweme.discover.viewmodel.SuggestChallengeViewModel;
import com.p280ss.android.ugc.aweme.search.C37380c;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.ChallengeIntermediateFragment */
public final class ChallengeIntermediateFragment extends SearchIntermediateFragment<SuggestChallenge> {

    /* renamed from: e */
    private SuggestChallengeViewModel f70903e;

    /* renamed from: f */
    private final C0053p<C26568a<List<SuggestChallenge>>> f70904f = new C26878a(this);

    /* renamed from: g */
    private HashMap f70905g;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.ChallengeIntermediateFragment$a */
    static final class C26878a<T> implements C0053p<C26568a<List<? extends SuggestChallenge>>> {

        /* renamed from: a */
        final /* synthetic */ ChallengeIntermediateFragment f70906a;

        C26878a(ChallengeIntermediateFragment challengeIntermediateFragment) {
            this.f70906a = challengeIntermediateFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(C26568a<List<SuggestChallenge>> aVar) {
            if (this.f70906a.isViewValid()) {
                List list = null;
                if (aVar != null && aVar.f70088a) {
                    list = aVar.f70089b;
                }
                this.f70906a.mo69721o().mo68079c(list);
                this.f70906a.mo69548a(list);
            }
        }
    }

    /* renamed from: a */
    public final String mo69547a() {
        return "tag";
    }

    /* renamed from: d */
    public final int mo69549d() {
        return C27029ba.f71324f;
    }

    /* renamed from: f */
    public final void mo69551f() {
        if (this.f70905g != null) {
            this.f70905g.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo69551f();
    }

    /* renamed from: e */
    public final void mo69550e() {
        super.mo69550e();
        if (C37380c.m119975b()) {
            SuggestChallengeViewModel suggestChallengeViewModel = this.f70903e;
            if (suggestChallengeViewModel == null) {
                C7573i.m23583a("mSuggestChallengeViewModel");
            }
            suggestChallengeViewModel.mo69999a();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0063u a = C0069x.m157a((Fragment) this).mo147a(SuggestChallengeViewModel.class);
        C7573i.m23582a((Object) a, "ViewModelProviders.of(th…ngeViewModel::class.java)");
        this.f70903e = (SuggestChallengeViewModel) a;
        SuggestChallengeViewModel suggestChallengeViewModel = this.f70903e;
        if (suggestChallengeViewModel == null) {
            C7573i.m23583a("mSuggestChallengeViewModel");
        }
        suggestChallengeViewModel.f71765a.observe(this, this.f70904f);
    }

    /* renamed from: a */
    public final void mo69548a(List<SuggestChallenge> list) {
        Collection collection = list;
        if (!C6307b.m19566a(collection)) {
            StringBuilder sb = new StringBuilder();
            if (list == null) {
                C7573i.m23580a();
            }
            int size = collection.size();
            for (int i = 0; i < size; i++) {
                Challenge challenge = ((SuggestChallenge) list.get(i)).challenge;
                if (challenge == null) {
                    C7573i.m23580a();
                }
                sb.append(challenge.getCid());
                if (i < list.size() - 1) {
                    sb.append(",");
                }
            }
            C6907h.m21524a("search_for_you_show", (Map) C22984d.m75611a().mo59973a("search_type", mo69547a()).mo59973a("tag_list", sb.toString()).f60753a);
        }
    }
}
