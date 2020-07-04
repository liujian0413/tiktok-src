package com.bytedance.android.livesdk.rank.viewbinder;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.livesdk.rank.model.C8853b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import p1886me.drakeet.multitype.C48226c;

/* renamed from: com.bytedance.android.livesdk.rank.viewbinder.a */
public final class C8881a extends C48226c<C8853b, C8882a> {

    /* renamed from: com.bytedance.android.livesdk.rank.viewbinder.a$a */
    class C8882a extends C1293v {

        /* renamed from: b */
        private TextView f24197b;

        /* renamed from: c */
        private TextView f24198c;

        /* renamed from: d */
        private TextView f24199d;

        /* renamed from: b */
        private static String m26583b(C8853b bVar) {
            return bVar.f24088c;
        }

        /* renamed from: c */
        private static SpannableString m26584c(C8853b bVar) {
            if (bVar == null || TextUtils.isEmpty(bVar.f24086a)) {
                return new SpannableString("");
            }
            return new SpannableString(bVar.f24086a);
        }

        /* renamed from: a */
        public final void mo21972a(C8853b bVar) {
            if (bVar != null) {
                this.f24197b.setText(bVar.f24087b);
                this.f24198c.setText(m26583b(bVar));
                SpannableString c = m26584c(bVar);
                switch (bVar.f24089d) {
                    case 1:
                    case 2:
                        this.f24199d.setText(c);
                        this.f24199d.setVisibility(0);
                        return;
                    default:
                        this.f24199d.setVisibility(8);
                        return;
                }
            }
        }

        C8882a(View view) {
            super(view);
            this.f24197b = (TextView) view.findViewById(R.id.a3j);
            this.f24198c = (TextView) view.findViewById(R.id.a3e);
            this.f24199d = (TextView) view.findViewById(R.id.title);
        }
    }

    /* renamed from: a */
    private static void m26579a(C8882a aVar, C8853b bVar) {
        aVar.mo21972a(bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C8882a mo21965a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C8882a(layoutInflater.inflate(R.layout.ar9, viewGroup, false));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo21966a(C1293v vVar, Object obj) {
        m26579a((C8882a) vVar, (C8853b) obj);
    }
}
