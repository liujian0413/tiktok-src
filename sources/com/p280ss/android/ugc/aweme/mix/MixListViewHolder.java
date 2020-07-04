package com.p280ss.android.ugc.aweme.mix;

import android.graphics.Color;
import android.view.View;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.challenge.C23685d;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.mix.MixListViewHolder */
public final class MixListViewHolder extends CommonLogicViewHolder {
    /* renamed from: b */
    public final void mo85803b(DmtTextView dmtTextView) {
        C7573i.m23587b(dmtTextView, "descView");
    }

    /* renamed from: q */
    public final void mo69905q() {
        this.f87424k.setBackground(null);
    }

    /* renamed from: p */
    public final void mo62390p() {
        super.mo62390p();
        this.f87424k.setBackgroundColor(Color.parseColor("#0FFFFFFF"));
    }

    /* renamed from: a */
    public final void mo85801a(DmtTextView dmtTextView) {
        C7573i.m23587b(dmtTextView, "descView");
        dmtTextView.setTextColor(this.f87423j);
    }

    public MixListViewHolder(View view, C23685d dVar) {
        C7573i.m23587b(view, "view");
        C7573i.m23587b(dVar, "onItemClickListener");
        super(view, dVar);
    }
}
