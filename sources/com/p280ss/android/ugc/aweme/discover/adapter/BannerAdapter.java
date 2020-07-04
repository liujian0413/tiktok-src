package com.p280ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.viewpager.AbsPagerAdapter;
import com.p280ss.android.ugc.aweme.discover.model.Banner;
import com.p280ss.android.ugc.aweme.notification.util.C34626j;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.BannerAdapter */
public class BannerAdapter extends AbsPagerAdapter {

    /* renamed from: d */
    protected List<Banner> f69415d;

    public int getCount() {
        if (this.f69415d == null) {
            return 0;
        }
        return this.f69415d.size();
    }

    /* renamed from: a */
    public final void mo67907a(List<Banner> list) {
        if (this.f69415d != list) {
            this.f69415d = list;
            notifyDataSetChanged();
        }
    }

    public BannerAdapter(Context context, LayoutInflater layoutInflater) {
        super(context, layoutInflater);
    }

    /* renamed from: a */
    public final View mo26999a(int i, View view, ViewGroup viewGroup) {
        BannerViewHolder bannerViewHolder;
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ua, viewGroup, false);
            bannerViewHolder = new BannerViewHolder(view);
            view.setTag(bannerViewHolder);
        } else {
            bannerViewHolder = (BannerViewHolder) view.getTag();
        }
        if (getCount() > 0) {
            bannerViewHolder.mo67908a((Banner) this.f69415d.get(i), i);
            if (C6399b.m19944t() && bannerViewHolder.mSdCover != null) {
                if (VERSION.SDK_INT >= 23) {
                    bannerViewHolder.mSdCover.setForeground(viewGroup.getContext().getDrawable(R.drawable.nd));
                } else {
                    C34626j.m111876a(bannerViewHolder.mSdCover);
                }
            }
        }
        return view;
    }
}
