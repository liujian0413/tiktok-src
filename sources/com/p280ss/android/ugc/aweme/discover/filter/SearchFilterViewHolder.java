package com.p280ss.android.ugc.aweme.discover.filter;

import android.view.View;
import com.p280ss.android.ugc.aweme.discover.adapter.AbsSearchViewHolder;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.filter.SearchFilterViewHolder */
public final class SearchFilterViewHolder extends AbsSearchViewHolder {

    /* renamed from: c */
    public final C26637a f70225c;

    /* renamed from: com.ss.android.ugc.aweme.discover.filter.SearchFilterViewHolder$a */
    public interface C26637a {
    }

    /* renamed from: a */
    public final void mo68325a(boolean z) {
    }

    public SearchFilterViewHolder(View view, C26637a aVar) {
        C7573i.m23587b(view, "itemView");
        C7573i.m23587b(aVar, "filterListener");
        super(view);
        this.f70225c = aVar;
    }
}
