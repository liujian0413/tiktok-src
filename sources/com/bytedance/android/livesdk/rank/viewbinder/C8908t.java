package com.bytedance.android.livesdk.rank.viewbinder;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.common.utility.C6319n;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import p1886me.drakeet.multitype.C48226c;

/* renamed from: com.bytedance.android.livesdk.rank.viewbinder.t */
public final class C8908t extends C48226c<String, C8909a> {

    /* renamed from: com.bytedance.android.livesdk.rank.viewbinder.t$a */
    static class C8909a extends C1293v {
        C8909a(View view) {
            super(view);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo21997a(String str) {
            Context context = this.itemView.getContext();
            if (!C6319n.m19593a(str)) {
                int lastIndexOf = str.lastIndexOf(" ");
                if (!(context == null || context.getResources() == null || lastIndexOf < 0)) {
                    SpannableString spannableString = new SpannableString(str);
                    spannableString.setSpan(new ForegroundColorSpan(context.getResources().getColor(R.color.as2)), lastIndexOf, str.length(), 33);
                    ((TextView) this.itemView).setText(spannableString);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m26648a(C8909a aVar, String str) {
        aVar.mo21997a(str);
    }

    /* renamed from: a */
    public final /* synthetic */ C1293v mo21965a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m26649b(layoutInflater, viewGroup);
    }

    /* renamed from: b */
    private static C8909a m26649b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C8909a(layoutInflater.inflate(R.layout.at7, viewGroup, false));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo21966a(C1293v vVar, Object obj) {
        m26648a((C8909a) vVar, (String) obj);
    }
}
