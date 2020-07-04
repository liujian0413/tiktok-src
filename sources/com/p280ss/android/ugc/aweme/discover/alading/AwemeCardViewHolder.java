package com.p280ss.android.ugc.aweme.discover.alading;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.p280ss.android.ugc.aweme.feed.widget.LinearGradientDraweeView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.alading.AwemeCardViewHolder */
public final class AwemeCardViewHolder extends C1293v {

    /* renamed from: a */
    public View f70014a;

    /* renamed from: b */
    public SmartImageView f70015b;

    /* renamed from: c */
    public TextView f70016c;

    public AwemeCardViewHolder(View view) {
        C7573i.m23587b(view, "itemView");
        super(view);
        this.f70014a = view;
        LinearGradientDraweeView linearGradientDraweeView = (LinearGradientDraweeView) view.findViewById(R.id.a4g);
        C7573i.m23582a((Object) linearGradientDraweeView, "itemView.cover");
        this.f70015b = linearGradientDraweeView;
        DmtTextView dmtTextView = (DmtTextView) view.findViewById(R.id.blt);
        C7573i.m23582a((Object) dmtTextView, "itemView.like_count");
        this.f70016c = dmtTextView;
    }
}
