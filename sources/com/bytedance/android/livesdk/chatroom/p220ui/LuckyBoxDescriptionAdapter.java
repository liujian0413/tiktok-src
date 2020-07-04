package com.bytedance.android.livesdk.chatroom.p220ui;

import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.model.C4869ad;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.LuckyBoxDescriptionAdapter */
public class LuckyBoxDescriptionAdapter extends C1262a<C5146a> {

    /* renamed from: a */
    private LayoutInflater f15088a;

    /* renamed from: b */
    private int f15089b;

    /* renamed from: c */
    private List<C4869ad> f15090c;

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.LuckyBoxDescriptionAdapter$a */
    static class C5146a extends C1293v {

        /* renamed from: a */
        HSImageView f15091a;

        /* renamed from: b */
        TextView f15092b;

        C5146a(View view) {
            super(view);
            this.f15091a = (HSImageView) view.findViewById(R.id.ay4);
            this.f15092b = (TextView) view.findViewById(R.id.dsr);
        }
    }

    public int getItemCount() {
        if (this.f15090c == null) {
            return 0;
        }
        return this.f15090c.size();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo13381a(List<C4869ad> list) {
        this.f15090c = list;
        notifyDataSetChanged();
    }

    LuckyBoxDescriptionAdapter(LayoutInflater layoutInflater, int i) {
        this.f15088a = layoutInflater;
        this.f15089b = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C5146a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C5146a(this.f15088a.inflate(this.f15089b, viewGroup, false));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(C5146a aVar, int i) {
        C4869ad adVar = (C4869ad) this.f15090c.get(i);
        if (adVar.f13933a != null) {
            C5343e.m17038a(aVar.f15091a, adVar.f13933a);
        }
        aVar.f15092b.setText(adVar.f13934b);
    }
}
