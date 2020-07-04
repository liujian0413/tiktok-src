package com.p280ss.android.ugc.aweme.discover.mixfeed.viewholder;

import android.view.View;
import android.view.ViewStub;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixVideoViewHolderExperiment5 */
public final class SearchMixVideoViewHolderExperiment5 extends SearchMixVideoViewHolderExperiment4 {
    /* renamed from: a */
    public final void mo68500a(View view) {
        C7573i.m23587b(view, "root");
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.dc_);
        C7573i.m23582a((Object) viewStub, "headStub");
        viewStub.setLayoutResource(R.layout.a7t);
        mo75253a(viewStub.inflate(), 4.0f);
        ViewStub viewStub2 = (ViewStub) view.findViewById(R.id.dc2);
        C7573i.m23582a((Object) viewStub2, "descStub");
        viewStub2.setLayoutResource(R.layout.a6s);
        mo75253a(viewStub2.inflate(), 12.0f);
        ViewStub viewStub3 = (ViewStub) view.findViewById(R.id.dc7);
        C7573i.m23582a((Object) viewStub3, "contentStub");
        viewStub3.setLayoutResource(R.layout.a7n);
        mo75255a(viewStub3.inflate(), 12.0f, 0.0f, 0.0f, 0.0f);
        ViewStub viewStub4 = (ViewStub) view.findViewById(R.id.dcl);
        C7573i.m23582a((Object) viewStub4, "poiStub");
        viewStub4.setLayoutResource(R.layout.a6m);
        viewStub4.inflate();
        ViewStub viewStub5 = (ViewStub) view.findViewById(R.id.dc6);
        C7573i.m23582a((Object) viewStub5, "bottomStub");
        viewStub5.setLayoutResource(R.layout.a7s);
        mo75253a(viewStub5.inflate(), 12.0f);
        ViewStub viewStub6 = (ViewStub) view.findViewById(R.id.dc8);
        C7573i.m23582a((Object) viewStub6, "followTimeStub");
        viewStub6.setLayoutResource(R.layout.a_s);
        View inflate = viewStub6.inflate();
        C7573i.m23582a((Object) inflate, "followTimeStub.inflate()");
        mo68529b(inflate);
        mo75253a(aI_(), 12.0f);
    }
}
