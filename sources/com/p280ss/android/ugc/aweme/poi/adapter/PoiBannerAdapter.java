package com.p280ss.android.ugc.aweme.poi.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.uikit.viewpager.AbsPagerAdapter;
import com.p280ss.android.ugc.aweme.poi.adapter.viewholder.PoiBannerViewHolder;
import com.p280ss.android.ugc.aweme.poi.adapter.viewholder.PoiBannerViewHolder.C35018a;
import com.p280ss.android.ugc.aweme.poi.model.PoiPhoto;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.PoiBannerAdapter */
public class PoiBannerAdapter extends AbsPagerAdapter {

    /* renamed from: d */
    private List<PoiPhoto> f91419d;

    /* renamed from: e */
    private C35018a f91420e;

    /* renamed from: f */
    private String f91421f;

    public int getCount() {
        if (this.f91419d == null) {
            return 0;
        }
        return this.f91419d.size();
    }

    /* renamed from: a */
    public final void mo88769a(List<PoiPhoto> list) {
        this.f91419d = list;
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public final View mo26999a(int i, View view, ViewGroup viewGroup) {
        PoiBannerViewHolder poiBannerViewHolder;
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a0g, viewGroup, false);
            poiBannerViewHolder = new PoiBannerViewHolder(view, this.f91420e);
            view.setTag(poiBannerViewHolder);
        } else {
            poiBannerViewHolder = (PoiBannerViewHolder) view.getTag();
        }
        if (getCount() > 0) {
            poiBannerViewHolder.mo88788a((PoiPhoto) this.f91419d.get(i), this.f91421f);
        }
        return view;
    }

    public PoiBannerAdapter(Context context, LayoutInflater layoutInflater, String str, C35018a aVar) {
        super(context, layoutInflater);
        this.f91420e = aVar;
        this.f91421f = str;
    }
}
