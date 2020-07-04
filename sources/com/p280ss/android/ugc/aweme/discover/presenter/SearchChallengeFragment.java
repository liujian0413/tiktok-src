package com.p280ss.android.ugc.aweme.discover.presenter;

import android.view.View;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.common.p1144e.C25675c;
import com.p280ss.android.ugc.aweme.discover.adapter.C26501r;
import com.p280ss.android.ugc.aweme.discover.adapter.SearchChallengeAdapter;
import com.p280ss.android.ugc.aweme.discover.model.SearchChallenge;
import com.p280ss.android.ugc.aweme.discover.p1185ui.SearchOriginalFragment;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import java.util.HashMap;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.presenter.SearchChallengeFragment */
public final class SearchChallengeFragment extends SearchOriginalFragment<SearchChallenge> implements C25675c<SearchChallenge> {

    /* renamed from: e */
    private HashMap f70746e;

    /* renamed from: a */
    public final View mo68429a(int i) {
        if (this.f70746e == null) {
            this.f70746e = new HashMap();
        }
        View view = (View) this.f70746e.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f70746e.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: b_ */
    public final boolean mo68435b_(boolean z) {
        return z;
    }

    /* renamed from: g */
    public final void mo68430g() {
        if (this.f70746e != null) {
            this.f70746e.clear();
        }
    }

    /* renamed from: k */
    public final String mo68437k() {
        return "tag";
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo68430g();
    }

    /* renamed from: n */
    public final void mo68440n() {
        mo69686a((BaseAdapter<D>) new SearchChallengeAdapter<D>(new C26501r(false), this.f71090i));
    }

    /* renamed from: m */
    public final void mo68439m() {
        mo69750a((C26827i<?>) new C26830k<Object>());
        C26827i N = mo69749N();
        if (N != null) {
            ((C26830k) N).mo66536a(new C26828j());
            mo69749N().mo66537a(this);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.presenter.SearchChallengePresenter");
    }

    /* renamed from: a */
    public final void mo68433a(String str) {
        C7573i.m23587b(str, POIService.KEY_KEYWORD);
        if (mo69704y() != null) {
            BaseAdapter y = mo69704y();
            if (y != null) {
                ((SearchChallengeAdapter) y).f69666f = str;
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.adapter.SearchChallengeAdapter");
        }
    }
}
