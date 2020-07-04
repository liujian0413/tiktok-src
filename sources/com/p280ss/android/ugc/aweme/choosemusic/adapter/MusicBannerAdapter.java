package com.p280ss.android.ugc.aweme.choosemusic.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.uikit.viewpager.AbsPagerAdapter;
import com.p280ss.android.ugc.aweme.choosemusic.viewholder.MusicBannerViewHolder;
import com.p280ss.android.ugc.aweme.discover.model.Banner;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.adapter.MusicBannerAdapter */
public class MusicBannerAdapter extends AbsPagerAdapter {

    /* renamed from: d */
    protected List<Banner> f62936d;

    /* renamed from: e */
    private int f62937e;

    public int getCount() {
        if (this.f62936d == null) {
            return 0;
        }
        return this.f62936d.size();
    }

    /* renamed from: a */
    public final void mo61896a(List<Banner> list) {
        if (this.f62936d != list) {
            this.f62936d = list;
            notifyDataSetChanged();
        }
    }

    public MusicBannerAdapter(Context context, LayoutInflater layoutInflater, int i) {
        super(context, layoutInflater);
        this.f62937e = i;
    }

    /* renamed from: a */
    public final View mo26999a(int i, View view, ViewGroup viewGroup) {
        MusicBannerViewHolder musicBannerViewHolder;
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.zd, viewGroup, false);
            musicBannerViewHolder = new MusicBannerViewHolder(view, this.f62937e);
            view.setTag(musicBannerViewHolder);
        } else {
            musicBannerViewHolder = (MusicBannerViewHolder) view.getTag();
        }
        if (getCount() > 0) {
            musicBannerViewHolder.mo62189a((Banner) this.f62936d.get(i), i);
        }
        return view;
    }
}
