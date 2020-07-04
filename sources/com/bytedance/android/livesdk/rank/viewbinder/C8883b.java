package com.bytedance.android.livesdk.rank.viewbinder;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import p1886me.drakeet.multitype.C48226c;

/* renamed from: com.bytedance.android.livesdk.rank.viewbinder.b */
public final class C8883b extends C48226c<String, C8884a> {

    /* renamed from: com.bytedance.android.livesdk.rank.viewbinder.b$a */
    class C8884a extends C1293v {

        /* renamed from: b */
        private TextView f24201b;

        /* renamed from: a */
        public final void mo21973a(String str) {
            this.f24201b.setText(str);
        }

        public C8884a(View view) {
            super(view);
            this.f24201b = (TextView) view.findViewById(R.id.title);
        }
    }

    /* renamed from: a */
    private static void m26586a(C8884a aVar, String str) {
        aVar.mo21973a(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C8884a mo21965a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C8884a(layoutInflater.inflate(R.layout.av_, viewGroup, false));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo21966a(C1293v vVar, Object obj) {
        m26586a((C8884a) vVar, (String) obj);
    }
}
