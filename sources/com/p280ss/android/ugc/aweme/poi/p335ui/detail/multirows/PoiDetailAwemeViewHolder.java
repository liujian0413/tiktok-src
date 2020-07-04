package com.p280ss.android.ugc.aweme.poi.p335ui.detail.multirows;

import android.view.View;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.challenge.C23685d;
import com.p280ss.android.ugc.aweme.challenge.adapter.DetailAwemeViewHolder;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.multirows.PoiDetailAwemeViewHolder */
public final class PoiDetailAwemeViewHolder extends DetailAwemeViewHolder {
    public PoiDetailAwemeViewHolder(View view, String str, C23685d dVar) {
        super(view, str, dVar);
    }

    /* renamed from: a */
    public final void mo61579a(Aweme aweme, int i, boolean z) {
        super.mo61579a(aweme, i, z);
        TextView textView = this.f62394e;
        C7573i.m23582a((Object) textView, "ivSponser");
        textView.setVisibility(8);
    }
}
