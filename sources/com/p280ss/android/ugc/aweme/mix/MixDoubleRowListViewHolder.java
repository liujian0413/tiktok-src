package com.p280ss.android.ugc.aweme.mix;

import android.view.View;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.challenge.C23685d;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.MixStatisStruct;
import com.p280ss.android.ugc.aweme.feed.model.MixStruct;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.mix.MixDoubleRowListViewHolder */
public final class MixDoubleRowListViewHolder extends CommonLogicViewHolder {

    /* renamed from: m */
    public final View f87547m = mo85800a((int) R.id.k5);

    /* renamed from: n */
    public final DmtTextView f87548n = ((DmtTextView) mo85800a((int) R.id.bz3));

    /* renamed from: b */
    public final void mo85803b(DmtTextView dmtTextView) {
        C7573i.m23587b(dmtTextView, "descView");
    }

    /* renamed from: p */
    public final void mo62390p() {
        super.mo62390p();
        this.f87548n.setVisibility(0);
        this.f87547m.setVisibility(0);
    }

    /* renamed from: q */
    public final void mo69905q() {
        this.f87548n.setVisibility(8);
        this.f87547m.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo85801a(DmtTextView dmtTextView) {
        C7573i.m23587b(dmtTextView, "descView");
        dmtTextView.setTextColor(this.f87423j);
    }

    /* renamed from: b */
    public final void mo85863b(Aweme aweme, long j) {
        if (aweme != null) {
            MixStruct mixInfo = aweme.getMixInfo();
            if (mixInfo != null) {
                MixStatisStruct mixStatisStruct = mixInfo.statis;
                if (mixStatisStruct != null && mixStatisStruct.currentEpisode == j) {
                    mo69905q();
                }
            }
        }
    }

    public MixDoubleRowListViewHolder(View view, C23685d dVar) {
        C7573i.m23587b(view, "view");
        C7573i.m23587b(dVar, "onItemClickListener");
        super(view, dVar);
    }
}
