package com.bytedance.android.live.wallet.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.banner.C2337a;
import com.bytedance.android.live.uikit.viewpager.AbsPagerAdapter;
import com.bytedance.android.live.wallet.viewholder.C3829a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

public class DiamondBannerPageAdapter extends AbsPagerAdapter {

    /* renamed from: a */
    public List<C2337a> f10803a = new ArrayList();

    public int getItemPosition(Object obj) {
        return -2;
    }

    public int getCount() {
        if (this.f10803a == null) {
            return 0;
        }
        if (this.f10803a.size() > 1) {
            return Integer.MAX_VALUE;
        }
        return this.f10803a.size();
    }

    /* renamed from: a */
    public final void mo11061a(List<C2337a> list) {
        this.f10803a.clear();
        if (list != null) {
            this.f10803a.addAll(list);
        }
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public final C2337a mo11060a(int i) {
        if (this.f10803a == null || this.f10803a.isEmpty() || i < 0) {
            return null;
        }
        return (C2337a) this.f10803a.get(i % this.f10803a.size());
    }

    public DiamondBannerPageAdapter(Context context, LayoutInflater layoutInflater) {
        super(context, layoutInflater);
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (obj != null) {
            View view = (View) obj;
            viewGroup.removeView(view);
            if (this.f10760b.size() < this.f10803a.size()) {
                this.f10760b.add(view);
            }
        }
    }

    /* renamed from: a */
    public final View mo9423a(int i, View view, ViewGroup viewGroup) {
        C3829a aVar;
        if (view == null) {
            view = this.f10761c.inflate(R.layout.azs, viewGroup, false);
            aVar = new C3829a(view, viewGroup.getContext());
            view.setTag(aVar);
        } else {
            aVar = (C3829a) view.getTag();
        }
        if (this.f10803a != null && !this.f10803a.isEmpty()) {
            List<C2337a> list = this.f10803a;
            aVar.mo11338a((C2337a) list.get(i % list.size()));
        }
        return view;
    }
}
