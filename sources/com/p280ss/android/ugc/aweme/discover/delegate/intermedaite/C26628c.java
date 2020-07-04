package com.p280ss.android.ugc.aweme.discover.delegate.intermedaite;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.discover.adapter.SearchChallengeViewHolder;
import com.p280ss.android.ugc.aweme.discover.adapter.SearchChallengeViewHolder.C26437a;
import com.p280ss.android.ugc.aweme.discover.adapter.SearchSquareAdapter;
import com.p280ss.android.ugc.aweme.discover.delegate.intermedaite.C26632g.C26633a;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.discover.model.suggest.SuggestChallenge;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.delegate.intermedaite.c */
public final class C26628c extends C26633a implements C26437a {
    public C26628c(SearchSquareAdapter<?> searchSquareAdapter) {
        C7573i.m23587b(searchSquareAdapter, "adapter");
        super(searchSquareAdapter);
    }

    /* renamed from: a */
    public final C1293v mo68320a(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "parent");
        SearchChallengeViewHolder a = SearchChallengeViewHolder.m86973a(viewGroup, "", this, null);
        C7573i.m23582a((Object) a, "SearchChallengeViewHolde…e(parent, \"\", this, null)");
        a.f69672g = "search_for_you_list";
        return a;
    }

    /* renamed from: a */
    public final void mo68032a(Challenge challenge, int i) {
        C7573i.m23587b(challenge, "challenge");
        C6907h.m21524a("enter_tag_detail", (Map) C22984d.m75611a().mo59973a("enter_from", "search_for_you_list").mo59973a("tag_id", challenge.getCid()).mo59973a("log_pb", C28199ae.m92689a().mo71791a(challenge.getRequestId())).mo59970a(POIService.KEY_ORDER, mo68324a((Object) challenge)).f60753a);
    }

    /* renamed from: a */
    public final void mo68321a(List<? extends Object> list, int i, C1293v vVar, List<Object> list2) {
        C7573i.m23587b(list, "items");
        C7573i.m23587b(vVar, "holder");
        C7573i.m23587b(list2, "payloads");
        Object obj = list.get(i);
        if (obj != null) {
            ((SearchChallengeViewHolder) vVar).mo68030a((SuggestChallenge) obj, "");
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.model.suggest.SuggestChallenge");
    }
}
