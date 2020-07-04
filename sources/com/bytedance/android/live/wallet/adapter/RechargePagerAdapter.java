package com.bytedance.android.live.wallet.adapter;

import android.content.Context;
import android.support.p022v4.view.PagerAdapter;
import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.live.core.utils.C3404s;
import com.bytedance.android.live.wallet.adapter.ReChargeListAdapter.C3624b;
import com.bytedance.android.live.wallet.customview.WalletPagerSlidingTabStrip.C3697a;
import com.bytedance.android.live.wallet.model.C3822h;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

public final class RechargePagerAdapter extends PagerAdapter implements C3697a {

    /* renamed from: a */
    public String f10849a = "";

    /* renamed from: b */
    public List<? extends C3822h> f10850b;

    /* renamed from: c */
    public final C3624b f10851c;

    public final int getItemPosition(Object obj) {
        C7573i.m23587b(obj, "object");
        return -2;
    }

    public final int getCount() {
        return this.f10850b.size();
    }

    /* renamed from: a */
    public final void mo11069a(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.f10849a = str;
    }

    /* renamed from: a */
    public final void mo11070a(List<? extends C3822h> list) {
        C7573i.m23587b(list, "<set-?>");
        this.f10850b = list;
    }

    public final boolean isViewFromObject(View view, Object obj) {
        C7573i.m23587b(view, "view");
        C7573i.m23587b(obj, "object");
        return C7573i.m23585a((Object) view, obj);
    }

    public RechargePagerAdapter(List<? extends C3822h> list, C3624b bVar) {
        C7573i.m23587b(list, "vigoRechargeList");
        C7573i.m23587b(bVar, "mOnClickDeal");
        this.f10850b = list;
        this.f10851c = bVar;
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "container");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.av9, viewGroup, false);
        if (inflate != null) {
            RecyclerView recyclerView = (RecyclerView) inflate;
            recyclerView.setOverScrollMode(2);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(viewGroup.getContext(), 3);
            recyclerView.setLayoutManager(gridLayoutManager);
            ReChargeListAdapter reChargeListAdapter = new ReChargeListAdapter((C3822h) this.f10850b.get(i), this.f10849a, this.f10851c);
            recyclerView.setAdapter(reChargeListAdapter);
            gridLayoutManager.f4721g = new RechargePagerAdapter$instantiateItem$1(reChargeListAdapter);
            viewGroup.addView(inflate);
            return inflate;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.RecyclerView");
    }

    /* renamed from: a */
    public final View mo11068a(Context context, int i) {
        View view;
        int i2;
        C7573i.m23587b(context, "context");
        C3822h hVar = (C3822h) this.f10850b.get(i);
        Integer num = null;
        if (C7573i.m23585a((Object) hVar.f11375a, (Object) "Huoli")) {
            view = LayoutInflater.from(context).inflate(R.layout.ata, null);
        } else {
            view = LayoutInflater.from(context).inflate(R.layout.at_, null);
        }
        String str = ((C3822h) this.f10850b.get(i)).f11375a;
        if (str != null) {
            switch (str.hashCode()) {
                case -1791295757:
                    if (str.equals("Pay by mobile")) {
                        num = Integer.valueOf(R.drawable.cbg);
                        break;
                    }
                    break;
                case -816503921:
                    if (str.equals("GooglePay")) {
                        num = Integer.valueOf(R.drawable.cbh);
                        break;
                    }
                    break;
                case -46205774:
                    if (str.equals("MasterCard")) {
                        num = Integer.valueOf(R.drawable.cbi);
                        break;
                    }
                    break;
                case 2666593:
                    if (str.equals("Visa")) {
                        num = Integer.valueOf(R.drawable.cbk);
                        break;
                    }
                    break;
                case 342921846:
                    if (str.equals("OneCard")) {
                        num = Integer.valueOf(R.drawable.cbj);
                        break;
                    }
                    break;
            }
        }
        if (num != null) {
            ((ImageView) view.findViewById(R.id.b79)).setImageResource(num.intValue());
        }
        View findViewById = view.findViewById(R.id.b78);
        if (findViewById != null) {
            if (hVar.f11377c == 1) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            findViewById.setVisibility(i2);
        }
        C3404s.m12659b((ImageView) view.findViewById(R.id.b78), hVar.f11379e);
        C7573i.m23582a((Object) view, "tabView");
        return view;
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        C7573i.m23587b(viewGroup, "container");
        C7573i.m23587b(obj, "object");
        viewGroup.removeView((View) obj);
    }
}
