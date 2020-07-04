package com.p280ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.SearchHistoryLastItemHolder_ViewBinding */
public class SearchHistoryLastItemHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SearchHistoryLastItemHolder f69708a;

    public void unbind() {
        SearchHistoryLastItemHolder searchHistoryLastItemHolder = this.f69708a;
        if (searchHistoryLastItemHolder != null) {
            this.f69708a = null;
            searchHistoryLastItemHolder.mTipView = null;
            searchHistoryLastItemHolder.mLineView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public SearchHistoryLastItemHolder_ViewBinding(SearchHistoryLastItemHolder searchHistoryLastItemHolder, View view) {
        this.f69708a = searchHistoryLastItemHolder;
        searchHistoryLastItemHolder.mTipView = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.e1e, "field 'mTipView'", DmtTextView.class);
        searchHistoryLastItemHolder.mLineView = Utils.findRequiredView(view, R.id.eck, "field 'mLineView'");
    }
}
