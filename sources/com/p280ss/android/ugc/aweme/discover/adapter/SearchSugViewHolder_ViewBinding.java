package com.p280ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.p280ss.android.ugc.aweme.choosemusic.view.SugCompletionView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.SearchSugViewHolder_ViewBinding */
public class SearchSugViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SearchSugViewHolder f69820a;

    public void unbind() {
        SearchSugViewHolder searchSugViewHolder = this.f69820a;
        if (searchSugViewHolder != null) {
            this.f69820a = null;
            searchSugViewHolder.mSugView = null;
            searchSugViewHolder.mIvSugCompletion = null;
            searchSugViewHolder.mIvSearchIcon = null;
            searchSugViewHolder.mBottomDivider = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public SearchSugViewHolder_ViewBinding(SearchSugViewHolder searchSugViewHolder, View view) {
        this.f69820a = searchSugViewHolder;
        searchSugViewHolder.mSugView = (TextView) Utils.findRequiredViewAsType(view, R.id.e2w, "field 'mSugView'", TextView.class);
        searchSugViewHolder.mIvSugCompletion = (SugCompletionView) Utils.findRequiredViewAsType(view, R.id.bct, "field 'mIvSugCompletion'", SugCompletionView.class);
        searchSugViewHolder.mIvSearchIcon = (ImageView) Utils.findRequiredViewAsType(view, R.id.bbz, "field 'mIvSearchIcon'", ImageView.class);
        searchSugViewHolder.mBottomDivider = Utils.findRequiredView(view, R.id.nt, "field 'mBottomDivider'");
    }
}
