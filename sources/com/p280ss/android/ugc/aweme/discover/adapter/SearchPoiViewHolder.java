package com.p280ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.router.SmartRouter;
import com.p280ss.android.ugc.aweme.discover.mob.SearchContext;
import com.p280ss.android.ugc.aweme.discover.model.SearchPoi;
import com.p280ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct;
import com.p280ss.android.ugc.aweme.poi.LocationBundle;
import com.p280ss.android.ugc.aweme.poi.model.C35109e;
import com.p280ss.android.ugc.aweme.poi.model.PoiBundle;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.SearchPoiViewHolder */
public class SearchPoiViewHolder extends AbsSearchViewHolder {

    /* renamed from: c */
    Context f69775c;

    /* renamed from: d */
    SearchPoi f69776d;

    /* renamed from: e */
    String f69777e;

    /* renamed from: f */
    private boolean f69778f;

    /* renamed from: g */
    private PoiItemViewHolder f69779g;

    /* renamed from: d */
    public final View mo67902d() {
        return this.itemView;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo68067a(View view) {
        String str;
        int i;
        if (this.f69776d != null && this.f69776d.poi != null) {
            SimplePoiInfoStruct simplePoiInfoStruct = this.f69776d.poi;
            C35109e a = new C35109e().mo89342c(simplePoiInfoStruct.getPoiId()).mo89350k(simplePoiInfoStruct.getPoiName()).mo89334a(simplePoiInfoStruct);
            if (this.f69778f) {
                str = "general_search";
            } else {
                str = "search_result";
            }
            C35109e t = a.mo89352m(str).mo89356q("click_search_result").mo89359t(this.f69776d.logPb);
            if (this.f69778f) {
                i = -1;
            } else {
                i = getAdapterPosition();
            }
            PoiBundle a2 = t.mo89332a(i).mo89358s(this.f69777e).mo89331a();
            SearchContext.m87924a(view, simplePoiInfoStruct.getPoiId());
            SmartRouter.buildRoute(this.f69775c, "//poi/detail").withParam("poi_bundle", (Serializable) a2).open();
        }
    }

    /* renamed from: a */
    public final void mo68068a(SearchPoi searchPoi, String str) {
        if (searchPoi != null && searchPoi.poi != null) {
            this.f69777e = str;
            this.f69776d = searchPoi;
            SimplePoiInfoStruct simplePoiInfoStruct = searchPoi.poi;
            simplePoiInfoStruct.setCost(0.0d);
            simplePoiInfoStruct.setPosition(searchPoi.position);
            this.f69779g.mo67995a(-1, simplePoiInfoStruct);
        }
    }

    /* renamed from: a */
    public static SearchPoiViewHolder m87057a(ViewGroup viewGroup, String str, LocationBundle locationBundle, boolean z) {
        return new SearchPoiViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a0k, viewGroup, false), str, locationBundle, false);
    }

    private SearchPoiViewHolder(View view, String str, LocationBundle locationBundle, boolean z) {
        super(view);
        this.f69778f = z;
        this.f69775c = view.getContext();
        this.f69775c = view.getContext();
        this.f69779g = new PoiItemViewHolder(view, locationBundle);
        this.f69777e = str;
        view.setOnClickListener(new C26478ac(this));
    }
}
