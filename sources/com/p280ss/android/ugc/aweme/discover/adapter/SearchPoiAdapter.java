package com.p280ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.discover.model.SearchPoi;
import com.p280ss.android.ugc.aweme.location.C32630h;
import com.p280ss.android.ugc.aweme.poi.LocationBundle;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.SearchPoiAdapter */
public class SearchPoiAdapter extends SearchBaseAdapter<SearchPoi> {

    /* renamed from: g */
    private LocationBundle f69774g;

    /* renamed from: b */
    public final C1293v mo61146b(ViewGroup viewGroup, int i) {
        SearchPoiViewHolder a = SearchPoiViewHolder.m87057a(viewGroup, this.f69666f, this.f69774g, false);
        a.mo67896a(this.f69665e);
        return a;
    }

    /* renamed from: b */
    public final void mo61148b(C1293v vVar, int i) {
        ((SearchPoiViewHolder) vVar).mo68068a((SearchPoi) this.f67539l.get(i), this.f69666f);
    }

    public SearchPoiAdapter(Context context, C26501r rVar, String str) {
        super(rVar, str);
        this.f69774g = C32630h.m105696b(context).mo83993a();
    }
}
