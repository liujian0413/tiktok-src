package com.bytedance.android.livesdk.rank.viewbinder;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.livesdk.rank.model.C8855d;
import com.bytedance.common.utility.C9738o;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import p1886me.drakeet.multitype.C48226c;

/* renamed from: com.bytedance.android.livesdk.rank.viewbinder.n */
public final class C8899n extends C48226c<C8855d, C8900a> {

    /* renamed from: com.bytedance.android.livesdk.rank.viewbinder.n$a */
    class C8900a extends C1293v {

        /* renamed from: b */
        private TextView f24252b;

        /* renamed from: a */
        public final void mo21990a(C8855d dVar) {
            String str;
            TextView textView = this.f24252b;
            if (dVar != null) {
                str = dVar.f24094a;
            } else {
                str = "";
            }
            C9738o.m28704a(textView, (CharSequence) str);
        }

        public C8900a(View view) {
            super(view);
            this.f24252b = (TextView) view.findViewById(R.id.djj);
        }
    }

    /* renamed from: a */
    private static void m26622a(C8900a aVar, C8855d dVar) {
        aVar.mo21990a(dVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C8900a mo21965a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C8900a(layoutInflater.inflate(R.layout.av7, viewGroup, false));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo21966a(C1293v vVar, Object obj) {
        m26622a((C8900a) vVar, (C8855d) obj);
    }
}
