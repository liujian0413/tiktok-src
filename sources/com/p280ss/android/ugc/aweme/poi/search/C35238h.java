package com.p280ss.android.ugc.aweme.poi.search;

import android.content.Context;
import android.util.AttributeSet;

/* renamed from: com.ss.android.ugc.aweme.poi.search.h */
public final class C35238h extends C35228a {
    public final String getPoiSearchRegionType() {
        return "oversea";
    }

    /* access modifiers changed from: protected */
    public final int getSearchType() {
        if (this.f92280a) {
            return 3;
        }
        return 0;
    }

    public C35238h(Context context, String str, boolean z) {
        this(context, null, str, z);
    }

    private C35238h(Context context, AttributeSet attributeSet, String str, boolean z) {
        this(context, null, 0, str, z);
    }

    private C35238h(Context context, AttributeSet attributeSet, int i, String str, boolean z) {
        super(context, attributeSet, 0, str, z);
    }
}
