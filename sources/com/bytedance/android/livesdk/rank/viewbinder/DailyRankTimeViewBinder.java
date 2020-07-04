package com.bytedance.android.livesdk.rank.viewbinder;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;
import p1886me.drakeet.multitype.C48226c;

public final class DailyRankTimeViewBinder extends C48226c<String, TimeTextViewHolder> {

    public static final class TimeTextViewHolder extends C1293v {
        public TimeTextViewHolder(View view) {
            C7573i.m23587b(view, "itemView");
            super(view);
        }

        /* renamed from: a */
        public final void mo21971a(String str) {
            C7573i.m23587b(str, "description");
            View view = this.itemView;
            C7573i.m23582a((Object) view, "itemView");
            TextView textView = (TextView) view.findViewById(R.id.a7m);
            C7573i.m23582a((Object) textView, "itemView.description");
            textView.setText(str);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ C1293v mo21965a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m26575b(layoutInflater, viewGroup);
    }

    /* renamed from: a */
    private static void m26574a(TimeTextViewHolder timeTextViewHolder, String str) {
        C7573i.m23587b(timeTextViewHolder, "holder");
        C7573i.m23587b(str, "item");
        timeTextViewHolder.mo21971a(str);
    }

    /* renamed from: b */
    private static TimeTextViewHolder m26575b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C7573i.m23587b(layoutInflater, "inflater");
        C7573i.m23587b(viewGroup, "parent");
        View inflate = layoutInflater.inflate(R.layout.aw8, viewGroup, false);
        C7573i.m23582a((Object) inflate, "inflater.inflate(R.layou…ime_count, parent, false)");
        return new TimeTextViewHolder(inflate);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo21966a(C1293v vVar, Object obj) {
        m26574a((TimeTextViewHolder) vVar, (String) obj);
    }
}
