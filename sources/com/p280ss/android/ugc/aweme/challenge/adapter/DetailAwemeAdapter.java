package com.p280ss.android.ugc.aweme.challenge.adapter;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.challenge.C23685d;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.DetailAwemeListFragment.DetailAwemeListProvider;
import com.p280ss.android.ugc.aweme.common.adapter.AnimatedAdapter;
import com.p280ss.android.ugc.aweme.common.adapter.AnimatedViewHolder;
import com.p280ss.android.ugc.aweme.common.p1142c.C25663d;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.challenge.adapter.DetailAwemeAdapter */
public class DetailAwemeAdapter extends AnimatedAdapter {

    /* renamed from: e */
    public boolean f62385e;

    /* renamed from: f */
    private String f62386f;

    /* renamed from: g */
    private C23685d f62387g;

    /* renamed from: h */
    private C25663d<AnimatedViewHolder> f62388h;

    /* renamed from: i */
    private DetailAwemeListProvider f62389i;

    public int getItemCount() {
        if (this.f67566v) {
            return mo60557c() + 1;
        }
        return mo60557c();
    }

    public void onViewAttachedToWindow(C1293v vVar) {
        super.onViewAttachedToWindow(vVar);
        if (this.f62385e && vVar.mItemViewType == 0 && this.f62388h != null) {
            this.f62388h.mo61737a((DetailAwemeViewHolder) vVar);
        }
    }

    /* renamed from: e */
    private List<Integer> m77582e(List<Aweme> list) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i = 0;
        for (int max = Math.max(0, this.f67540m - 1); max < size; max++) {
            Aweme aweme = (Aweme) list.get(max);
            aweme.setOriginalPos(max);
            if (aweme.getIsTop() == 1) {
                list.remove(aweme);
                list.add(i, aweme);
                i++;
                arrayList.add(Integer.valueOf(max));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo58045a(List<Aweme> list) {
        this.f67540m = 0;
        if (TextUtils.equals(this.f62386f, "challenge")) {
            this.f67539l = list;
            m77582e(this.f67539l);
            super.mo58045a(this.f67539l);
            return;
        }
        super.mo58045a(list);
    }

    /* renamed from: b */
    public final void mo61577b(List<Aweme> list) {
        if (TextUtils.equals(this.f62386f, "challenge")) {
            this.f67539l = list;
            List e = m77582e(this.f67539l);
            super.mo61577b(list);
            if (e.size() > 0) {
                notifyItemRangeInserted(0, e.size());
            }
            return;
        }
        super.mo61577b(list);
    }

    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        ((DetailAwemeViewHolder) vVar).mo61579a((Aweme) this.f67539l.get(i), i, this.f62385e);
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        return this.f62389i.onCreateDetailAwemeViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.uc, viewGroup, false), this.f62386f, this.f62387g);
    }

    public DetailAwemeAdapter(String str, C23685d dVar, C25663d<AnimatedViewHolder> dVar2, DetailAwemeListProvider detailAwemeListProvider) {
        this.f62386f = str;
        this.f62387g = dVar;
        this.f62388h = dVar2;
        this.f62389i = detailAwemeListProvider;
    }
}
