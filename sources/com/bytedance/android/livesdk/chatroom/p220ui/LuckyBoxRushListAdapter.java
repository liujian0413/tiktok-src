package com.bytedance.android.livesdk.chatroom.p220ui;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.model.C4930z.C4931a;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.LuckyBoxRushListAdapter */
public class LuckyBoxRushListAdapter extends C1262a<C5147a> {

    /* renamed from: a */
    private List<C4931a> f15093a;

    /* renamed from: b */
    private LayoutInflater f15094b;

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.LuckyBoxRushListAdapter$a */
    static class C5147a extends C1293v {

        /* renamed from: a */
        public TextView f15095a;

        /* renamed from: b */
        public TextView f15096b;

        /* renamed from: c */
        public HSImageView f15097c;

        C5147a(View view) {
            super(view);
            this.f15095a = (TextView) view.findViewById(R.id.c33);
            this.f15096b = (TextView) view.findViewById(R.id.a3d);
            this.f15097c = (HSImageView) view.findViewById(R.id.ay4);
        }
    }

    public int getItemCount() {
        if (this.f15093a != null) {
            return this.f15093a.size();
        }
        return 0;
    }

    LuckyBoxRushListAdapter(Context context, List<C4931a> list) {
        this.f15094b = LayoutInflater.from(context);
        this.f15093a = list;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C5147a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C5147a(this.f15094b.inflate(R.layout.axr, viewGroup, false));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(C5147a aVar, int i) {
        C4931a aVar2 = (C4931a) this.f15093a.get(i);
        if (aVar2 != null && aVar2.f14131a != null) {
            aVar.f15095a.setText(aVar2.f14131a.getNickName());
            if (!TextUtils.isEmpty(aVar2.f14133c)) {
                aVar.f15096b.setVisibility(0);
                aVar.f15096b.setText(aVar2.f14133c);
            } else {
                aVar.f15096b.setVisibility(8);
            }
            if (aVar2.f14132b != null) {
                aVar.f15097c.setVisibility(0);
                C5343e.m17038a(aVar.f15097c, aVar2.f14132b);
                return;
            }
            aVar.f15097c.setVisibility(8);
        }
    }
}
