package com.p280ss.android.ugc.aweme.music.adapter;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.music.p1406ab.C33703a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.music.adapter.LocalSoundEmptyViewHolder */
public final class LocalSoundEmptyViewHolder extends C1293v {

    /* renamed from: a */
    public final DmtTextView f87971a;

    public LocalSoundEmptyViewHolder(View view) {
        C7573i.m23587b(view, "view");
        super(view);
        this.f87971a = (DmtTextView) view.findViewById(R.id.buf);
        if (C33703a.m108720d() == 2) {
            DmtTextView dmtTextView = this.f87971a;
            C7573i.m23582a((Object) dmtTextView, "title");
            dmtTextView.setText(view.getContext().getString(R.string.chx));
            return;
        }
        DmtTextView dmtTextView2 = this.f87971a;
        C7573i.m23582a((Object) dmtTextView2, "title");
        dmtTextView2.setText(view.getContext().getString(R.string.chw));
    }
}
