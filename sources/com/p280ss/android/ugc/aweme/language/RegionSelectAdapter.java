package com.p280ss.android.ugc.aweme.language;

import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.C7581n;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.language.RegionSelectAdapter */
public final class RegionSelectAdapter extends C1262a<RegionSelectViewHolder> {

    /* renamed from: a */
    public List<? extends C32329j> f84389a = C7525m.m23461a();

    /* renamed from: b */
    public C7562b<? super C32329j, C7581n> f84390b;

    /* renamed from: c */
    public C32329j f84391c;

    public final int getItemCount() {
        return this.f84389a.size();
    }

    /* renamed from: a */
    public final void mo83515a(List<? extends C32329j> list) {
        C7573i.m23587b(list, "<set-?>");
        this.f84389a = list;
    }

    public final /* synthetic */ C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m104853a(viewGroup, i);
    }

    /* renamed from: a */
    private static RegionSelectViewHolder m104853a(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "viewGroup");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a1x, viewGroup, false);
        C7573i.m23582a((Object) inflate, "itemView");
        return new RegionSelectViewHolder(inflate);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(RegionSelectViewHolder regionSelectViewHolder, int i) {
        C7573i.m23587b(regionSelectViewHolder, "vh");
        regionSelectViewHolder.mo83526a((C32329j) this.f84389a.get(i), this.f84390b, this.f84391c);
    }
}
