package com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.p1599ui;

import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.ar.ui.FaceMattingLoadAdapter */
public class FaceMattingLoadAdapter extends C1262a<FaceMattingLoadingViewHolder> {

    /* renamed from: a */
    public boolean f105186a = true;

    public int getItemCount() {
        if (this.f105186a) {
            return 1;
        }
        return 0;
    }

    /* renamed from: a */
    public static void m129386a(FaceMattingLoadingViewHolder faceMattingLoadingViewHolder, int i) {
        faceMattingLoadingViewHolder.mo100509a();
    }

    public /* synthetic */ void onBindViewHolder(C1293v vVar, int i) {
        m129386a((FaceMattingLoadingViewHolder) vVar, i);
    }

    public /* synthetic */ C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m129385a(viewGroup, i);
    }

    /* renamed from: a */
    public static FaceMattingLoadingViewHolder m129385a(ViewGroup viewGroup, int i) {
        return new FaceMattingLoadingViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.t_, viewGroup, false));
    }
}
