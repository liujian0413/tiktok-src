package com.bytedance.android.livesdk.rank.viewbinder;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.livesdk.rank.model.C8858g;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import p1886me.drakeet.multitype.C48226c;

/* renamed from: com.bytedance.android.livesdk.rank.viewbinder.u */
public final class C8910u extends C48226c<C8858g, C8911a> {

    /* renamed from: com.bytedance.android.livesdk.rank.viewbinder.u$a */
    static class C8911a extends C1293v {
        C8911a(View view) {
            super(view);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo21998a(String str, int i) {
            ((TextView) this.itemView).setText(str);
            this.itemView.setBackgroundColor(i);
        }
    }

    /* renamed from: a */
    private static void m26653a(C8911a aVar, C8858g gVar) {
        aVar.mo21998a(gVar.f24107a, gVar.f24108b);
    }

    /* renamed from: b */
    private static C8911a m26654b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C8911a(layoutInflater.inflate(R.layout.at5, viewGroup, false));
    }

    /* renamed from: a */
    public final /* synthetic */ C1293v mo21965a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m26654b(layoutInflater, viewGroup);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo21966a(C1293v vVar, Object obj) {
        m26653a((C8911a) vVar, (C8858g) obj);
    }
}
