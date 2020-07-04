package com.p280ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.SearchHistoryItemViewHolder_ViewBinding */
public class SearchHistoryItemViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SearchHistoryItemViewHolder f69702a;

    public void unbind() {
        SearchHistoryItemViewHolder searchHistoryItemViewHolder = this.f69702a;
        if (searchHistoryItemViewHolder != null) {
            this.f69702a = null;
            searchHistoryItemViewHolder.mDeleteView = null;
            searchHistoryItemViewHolder.mContentView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public SearchHistoryItemViewHolder_ViewBinding(SearchHistoryItemViewHolder searchHistoryItemViewHolder, View view) {
        this.f69702a = searchHistoryItemViewHolder;
        searchHistoryItemViewHolder.mDeleteView = Utils.findRequiredView(view, R.id.b8a, "field 'mDeleteView'");
        searchHistoryItemViewHolder.mContentView = (TextView) Utils.findRequiredViewAsType(view, R.id.dsf, "field 'mContentView'", TextView.class);
    }
}
