package com.p280ss.android.ugc.aweme.poi.p335ui.detail.multirows;

import android.support.p022v4.app.FragmentActivity;
import android.view.View;
import com.p280ss.android.ugc.aweme.challenge.C23685d;
import com.p280ss.android.ugc.aweme.challenge.adapter.DetailAwemeViewHolder;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.DetailAwemeListFragment.C23743b;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.DetailAwemeListFragment.DetailAwemeListProvider;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.location.C32639p.C32640a;
import com.p280ss.android.ugc.aweme.location.LocationResult;
import com.p280ss.android.ugc.aweme.poi.C35086h.C35087a;
import com.p280ss.android.ugc.aweme.poi.PoiSimpleBundle;
import com.p280ss.android.ugc.aweme.poi.model.C35122k;
import com.p280ss.android.ugc.aweme.poi.utils.C35440a;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.multirows.PoiDetailAwemeListProvider */
public final class PoiDetailAwemeListProvider implements DetailAwemeListProvider {
    private final PoiSimpleBundle poiBundle;

    public PoiDetailAwemeListProvider(PoiSimpleBundle poiSimpleBundle) {
        this.poiBundle = poiSimpleBundle;
    }

    public final C23743b getJumpToVideoParam(C23743b bVar, Aweme aweme) {
        C7573i.m23587b(bVar, "param");
        bVar.f62612a = "poi_multi_colums";
        bVar.f62613b = "poi_id";
        bVar.f62614c = "poi_page";
        return bVar;
    }

    public final C25674b<? extends C25673a<?, ?>> getPresenter(int i, FragmentActivity fragmentActivity) {
        String str;
        C25674b<? extends C25673a<?, ?>> bVar = new C25674b<>();
        C35122k kVar = new C35122k();
        PoiSimpleBundle poiSimpleBundle = this.poiBundle;
        String str2 = null;
        if (poiSimpleBundle != null) {
            str = poiSimpleBundle.getPoiId();
        } else {
            str = null;
        }
        kVar.f91873b = str;
        PoiSimpleBundle poiSimpleBundle2 = this.poiBundle;
        if (poiSimpleBundle2 != null) {
            str2 = poiSimpleBundle2.getBackendType();
        }
        kVar.f91876e = str2;
        bVar.mo66536a(kVar);
        return bVar;
    }

    public final boolean sendCustomRequest(C25674b<? extends C25673a<?, ?>> bVar, int i) {
        String str;
        C35087a aVar = new C35087a();
        PoiSimpleBundle poiSimpleBundle = this.poiBundle;
        String str2 = null;
        if (poiSimpleBundle != null) {
            str = poiSimpleBundle.getPoiId();
        } else {
            str = null;
        }
        C35087a a = aVar.mo88937a(str);
        PoiSimpleBundle poiSimpleBundle2 = this.poiBundle;
        if (poiSimpleBundle2 != null) {
            str2 = poiSimpleBundle2.getAwemeId();
        }
        C35087a b = a.mo88945d(str2).mo88940b(3);
        LocationResult a2 = C32640a.m105721a().mo84021a();
        if (a2 != null) {
            String[] a3 = C35440a.m114452a(a2);
            b.mo88942b(a3[0]).mo88944c(a3[1]);
        }
        if (bVar != null) {
            bVar.mo56976a(Integer.valueOf(i), b.mo88939a());
        }
        return true;
    }

    public final DetailAwemeViewHolder onCreateDetailAwemeViewHolder(View view, String str, C23685d dVar) {
        return new PoiDetailAwemeViewHolder(view, str, dVar);
    }
}
