package com.p280ss.android.ugc.aweme.miniapp.appgroup;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.miniapp.appgroup.MicroAppItemViewHolder */
public final class MicroAppItemViewHolder extends C1293v {

    /* renamed from: a */
    public final SimpleDraweeView f87175a;

    /* renamed from: b */
    public final DmtTextView f87176b;

    public MicroAppItemViewHolder(View view) {
        C7573i.m23587b(view, "microItemView");
        super(view);
        View findViewById = view.findViewById(R.id.byk);
        C7573i.m23582a((Object) findViewById, "microItemView.findViewById(R.id.micro_app_icon)");
        this.f87175a = (SimpleDraweeView) findViewById;
        View findViewById2 = view.findViewById(R.id.byl);
        C7573i.m23582a((Object) findViewById2, "microItemView.findViewById(R.id.micro_app_name)");
        this.f87176b = (DmtTextView) findViewById2;
    }
}
