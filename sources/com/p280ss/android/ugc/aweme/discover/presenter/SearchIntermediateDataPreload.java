package com.p280ss.android.ugc.aweme.discover.presenter;

import com.bytedance.ies.abmock.p260a.C6381a;
import com.bytedance.ies.abmock.p260a.C6382b;

@C6381a(mo15284a = "rn_search_transfer_preload_data")
/* renamed from: com.ss.android.ugc.aweme.discover.presenter.SearchIntermediateDataPreload */
public final class SearchIntermediateDataPreload {
    @C6382b
    private static final boolean DISABLE = false;
    @C6382b(mo15285a = true)
    private static final boolean ENABLE = true;
    public static final SearchIntermediateDataPreload INSTANCE = new SearchIntermediateDataPreload();

    private SearchIntermediateDataPreload() {
    }

    public final boolean getDISABLE() {
        return DISABLE;
    }

    public final boolean getENABLE() {
        return ENABLE;
    }
}
