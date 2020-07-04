package com.bytedance.android.live.wallet.adapter;

import android.support.p022v4.view.PagerAdapter;
import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.wallet.adapter.ReChargeHalDialogListAdapter.C3621b;
import com.bytedance.android.livesdkapi.depend.model.ChargeDeal;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

public class RechargeCnPagerAdapter extends PagerAdapter {

    /* renamed from: a */
    private List<ChargeDeal> f10845a;

    /* renamed from: b */
    private int f10846b;

    /* renamed from: c */
    private int f10847c;

    /* renamed from: d */
    private C3621b f10848d;

    public int getCount() {
        return this.f10847c;
    }

    public int getItemPosition(Object obj) {
        return -2;
    }

    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        List<ChargeDeal> list;
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.av9, viewGroup, false);
        recyclerView.setOverScrollMode(2);
        recyclerView.setLayoutManager(new GridLayoutManager(viewGroup.getContext(), 3));
        if (this.f10845a.size() <= 9) {
            list = this.f10845a;
        } else {
            List<ChargeDeal> list2 = this.f10845a;
            int i2 = i * 6;
            int i3 = (i + 1) * 6;
            if (this.f10845a.size() <= i3) {
                i3 = this.f10845a.size();
            }
            list = list2.subList(i2, i3);
        }
        recyclerView.setAdapter(new ReChargeHalDialogListAdapter(list, this.f10848d, (long) this.f10846b));
        viewGroup.addView(recyclerView);
        return recyclerView;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }
}
