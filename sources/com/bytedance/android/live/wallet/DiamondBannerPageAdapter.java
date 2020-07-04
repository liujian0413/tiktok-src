package com.bytedance.android.live.wallet;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.banner.C2337a;
import com.bytedance.android.live.uikit.viewpager.AbsPagerAdapter;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

public class DiamondBannerPageAdapter extends AbsPagerAdapter {

    /* renamed from: a */
    public List<C2337a> f10778a;

    public int getItemPosition(Object obj) {
        return -2;
    }

    public int getCount() {
        if (this.f10778a == null) {
            return 0;
        }
        if (this.f10778a.size() > 1) {
            return Integer.MAX_VALUE;
        }
        return this.f10778a.size();
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (obj != null) {
            View view = (View) obj;
            viewGroup.removeView(view);
            if (this.f10760b.size() < this.f10778a.size()) {
                this.f10760b.add(view);
            }
        }
    }

    /* renamed from: a */
    public final View mo9423a(int i, View view, ViewGroup viewGroup) {
        C3599a aVar;
        if (view == null) {
            view = this.f10761c.inflate(R.layout.azs, viewGroup, false);
            aVar = new C3599a(view, viewGroup.getContext());
            view.setTag(aVar);
        } else {
            aVar = (C3599a) view.getTag();
        }
        if (this.f10778a != null && !this.f10778a.isEmpty()) {
            List<C2337a> list = this.f10778a;
            aVar.mo11036a((C2337a) list.get(i % list.size()));
        }
        return view;
    }
}
