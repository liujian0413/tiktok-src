package com.bytedance.android.livesdk.feed.banner.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.banner.C2337a;
import com.bytedance.android.live.uikit.viewpager.AbsPagerAdapter;
import com.bytedance.android.livesdk.feed.C6076m;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

public class BannerPageAdapter extends AbsPagerAdapter {

    /* renamed from: a */
    public List<C2337a> f17677a = new ArrayList();

    /* renamed from: e */
    public String f17678e;

    /* renamed from: f */
    private C6076m f17679f;

    public int getItemPosition(Object obj) {
        return -2;
    }

    public int getCount() {
        if (this.f17677a == null) {
            return 0;
        }
        if (this.f17677a.size() > 1) {
            return Integer.MAX_VALUE;
        }
        return this.f17677a.size();
    }

    /* renamed from: a */
    public final void mo14603a(List<C2337a> list) {
        this.f17677a.clear();
        if (list != null) {
            this.f17677a.addAll(list);
        }
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public final C2337a mo14602a(int i) {
        if (this.f17677a == null || this.f17677a.isEmpty() || i < 0) {
            return null;
        }
        return (C2337a) this.f17677a.get(i % this.f17677a.size());
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (obj != null) {
            View view = (View) obj;
            viewGroup.removeView(view);
            if (this.f10760b.size() < this.f17677a.size()) {
                this.f10760b.add(view);
            }
        }
    }

    /* renamed from: a */
    public final View mo9423a(int i, View view, ViewGroup viewGroup) {
        C5956a aVar;
        if (view == null) {
            view = this.f10761c.inflate(R.layout.arf, viewGroup, false);
            aVar = new C5956a(view, viewGroup.getContext(), this.f17678e, this.f17679f);
            view.setTag(aVar);
        } else {
            aVar = (C5956a) view.getTag();
        }
        if (this.f17677a != null && !this.f17677a.isEmpty()) {
            List<C2337a> list = this.f17677a;
            aVar.mo14605a((C2337a) list.get(i % list.size()));
        }
        return view;
    }

    public BannerPageAdapter(Context context, LayoutInflater layoutInflater, String str, C6076m mVar) {
        super(context, layoutInflater);
        this.f17678e = str;
        this.f17679f = mVar;
    }
}
