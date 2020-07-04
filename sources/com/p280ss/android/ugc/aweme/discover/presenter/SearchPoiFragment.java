package com.p280ss.android.ugc.aweme.discover.presenter;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.common.p1144e.C25675c;
import com.p280ss.android.ugc.aweme.discover.adapter.C26501r;
import com.p280ss.android.ugc.aweme.discover.adapter.SearchPoiAdapter;
import com.p280ss.android.ugc.aweme.discover.model.SearchPoi;
import com.p280ss.android.ugc.aweme.discover.p1185ui.SearchBaseFragment.C26932a;
import com.p280ss.android.ugc.aweme.discover.p1185ui.SearchOriginalFragment;
import com.p280ss.android.ugc.aweme.location.C32624f;
import com.p280ss.android.ugc.aweme.location.C32630h;
import com.p280ss.android.ugc.aweme.poi.LocationBundle;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import java.util.HashMap;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.presenter.SearchPoiFragment */
public final class SearchPoiFragment extends SearchOriginalFragment<SearchPoi> implements C25675c<SearchPoi> {

    /* renamed from: H */
    private double f70758H;

    /* renamed from: J */
    private HashMap f70759J;

    /* renamed from: e */
    private double f70760e;

    /* renamed from: Y_ */
    public final boolean mo16933Y_() {
        return false;
    }

    /* renamed from: a */
    public final View mo68429a(int i) {
        if (this.f70759J == null) {
            this.f70759J = new HashMap();
        }
        View view = (View) this.f70759J.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f70759J.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: b_ */
    public final boolean mo68435b_(boolean z) {
        return false;
    }

    /* renamed from: g */
    public final void mo68430g() {
        if (this.f70759J != null) {
            this.f70759J.clear();
        }
    }

    /* renamed from: k */
    public final String mo68437k() {
        return "poi";
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo68430g();
    }

    /* renamed from: m */
    public final void mo68439m() {
        mo69750a((C26827i<?>) new C26840q<Object>());
        mo69749N().mo66537a(this);
    }

    /* renamed from: n */
    public final void mo68440n() {
        mo69686a((BaseAdapter<D>) new SearchPoiAdapter<D>(getContext(), new C26501r(false), this.f71090i));
    }

    /* renamed from: l */
    public final void mo68438l() {
        if ((this.f71093l == 2 || this.f71093l == 5) && TextUtils.equals(this.f71090i, this.f71091j)) {
            mo69749N().mo69495b(C26932a.m88487a());
        } else {
            mo69749N().mo69495b(0);
        }
        mo69749N().mo56976a(Integer.valueOf(4), mo69679J(), Integer.valueOf(1), Double.valueOf(this.f70760e), Double.valueOf(this.f70758H), Integer.valueOf(this.f71097p));
    }

    /* renamed from: a */
    public final void mo68433a(String str) {
        C7573i.m23587b(str, POIService.KEY_KEYWORD);
        if (mo69704y() != null) {
            BaseAdapter y = mo69704y();
            if (y != null) {
                ((SearchPoiAdapter) y).f69666f = str;
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.adapter.SearchPoiAdapter");
        }
    }

    /* renamed from: b */
    public final void mo69467b(int i) {
        mo69749N().mo56976a(Integer.valueOf(1), this.f71090i, Integer.valueOf(i), Double.valueOf(this.f70760e), Double.valueOf(this.f70758H), Integer.valueOf(this.f71097p));
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        LocationBundle a = C32630h.m105696b(getContext()).mo83994a((C32624f) null);
        if (a != null) {
            this.f70760e = a.latitude;
            this.f70758H = a.longitude;
        }
    }

    /* renamed from: b */
    public final void mo59108b(List<? extends SearchPoi> list, boolean z) {
        if (C6399b.m19944t()) {
            if (mo69749N() != null) {
                C26827i N = mo69749N();
                if (N == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.presenter.SearchPoiPresenter");
                } else if (((C26840q) N).mo69501e()) {
                    z = true;
                }
            }
            z = false;
        }
        super.mo59108b(list, z);
    }
}
