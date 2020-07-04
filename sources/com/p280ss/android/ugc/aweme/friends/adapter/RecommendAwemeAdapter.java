package com.p280ss.android.ugc.aweme.friends.adapter;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.friends.adapter.RecommendAwemeViewHolder.C30016a;
import com.p280ss.android.ugc.aweme.profile.model.RecommendAwemeItem;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.friends.adapter.RecommendAwemeAdapter */
public class RecommendAwemeAdapter extends BaseAdapter<RecommendAwemeItem> {

    /* renamed from: a */
    public int f78932a;

    /* renamed from: b */
    public C30016a f78933b;

    public void onViewAttachedToWindow(C1293v vVar) {
        super.onViewAttachedToWindow(vVar);
        if (vVar instanceof RecommendAwemeViewHolder) {
            ((RecommendAwemeViewHolder) vVar).mo66492a(true);
        }
    }

    public void onViewDetachedFromWindow(C1293v vVar) {
        super.onViewDetachedFromWindow(vVar);
        if (vVar instanceof RecommendAwemeViewHolder) {
            ((RecommendAwemeViewHolder) vVar).mo66492a(false);
        }
    }

    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        if (vVar instanceof RecommendAwemeViewHolder) {
            ((RecommendAwemeViewHolder) vVar).mo66491a((RecommendAwemeItem) mo62312a().get(i), this.f78932a);
        }
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        RecommendAwemeViewHolder recommendAwemeViewHolder = new RecommendAwemeViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ss, viewGroup, false));
        recommendAwemeViewHolder.f78934a = this.f78933b;
        recommendAwemeViewHolder.mo76225a((viewGroup.getMeasuredWidth() - C23486n.m77122a(8.0d)) / 3);
        return recommendAwemeViewHolder;
    }
}
