package com.p280ss.android.ugc.aweme.friends.p1285ui;

import android.support.p029v7.widget.RecyclerView.C1293v;
import com.p280ss.android.ugc.aweme.friends.model.RecommendContact;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.RecommendContactViewHolder */
public final class RecommendContactViewHolder extends C1293v {

    /* renamed from: a */
    private final RecommendContactItemView f79288a;

    /* renamed from: a */
    public final String mo76571a() {
        return this.f79288a.getEnterFrom();
    }

    public RecommendContactViewHolder(RecommendContactItemView recommendContactItemView) {
        C7573i.m23587b(recommendContactItemView, "recommendView");
        super(recommendContactItemView);
        this.f79288a = recommendContactItemView;
    }

    /* renamed from: a */
    public final void mo76572a(RecommendContact recommendContact, int i) {
        C7573i.m23587b(recommendContact, "contact");
        this.f79288a.mo76565a(recommendContact, i);
    }
}
