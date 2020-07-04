package com.p280ss.android.ugc.aweme.poi.adapter;

import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.poi.PoiSimpleBundle;
import com.p280ss.android.ugc.aweme.poi.adapter.viewholder.PoiDcdProductViewHolder;
import com.p280ss.android.ugc.aweme.poi.model.PoiDcdCar;
import com.p280ss.android.ugc.aweme.poi.model.PoiProductInfo;
import com.p280ss.android.ugc.aweme.poi.utils.C35454m;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.PoiProductAdapter */
public class PoiProductAdapter extends C1262a {

    /* renamed from: a */
    private PoiProductInfo f91422a;

    /* renamed from: b */
    private List<PoiDcdCar> f91423b;

    /* renamed from: c */
    private PoiSimpleBundle f91424c;

    public int getItemCount() {
        return this.f91423b.size();
    }

    public PoiProductAdapter(PoiProductInfo poiProductInfo, PoiSimpleBundle poiSimpleBundle) {
        this.f91422a = poiProductInfo;
        this.f91423b = poiProductInfo.products;
        this.f91424c = poiSimpleBundle;
    }

    public C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (this.f91422a.isDcd()) {
            i2 = R.layout.a0n;
        } else {
            i2 = R.layout.a0o;
        }
        return new PoiDcdProductViewHolder(from.inflate(i2, viewGroup, false));
    }

    public void onBindViewHolder(C1293v vVar, int i) {
        PoiDcdCar poiDcdCar = (PoiDcdCar) this.f91423b.get(i);
        ((PoiDcdProductViewHolder) vVar).mo88799a(poiDcdCar, this.f91422a.supplierSource, this.f91424c);
        C35454m.m114523a(this.f91424c, "project_card_show", C22984d.m75611a().mo59973a("enter_from", "poi_page").mo59973a("product_id", poiDcdCar.extId).mo59973a("poi_id", this.f91424c.getPoiId()).mo59973a("content_type", this.f91422a.supplierSource));
    }
}
