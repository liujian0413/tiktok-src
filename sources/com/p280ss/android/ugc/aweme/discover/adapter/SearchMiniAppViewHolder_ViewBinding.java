package com.p280ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.SearchMiniAppViewHolder_ViewBinding */
public class SearchMiniAppViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SearchMiniAppViewHolder f69709a;

    public void unbind() {
        SearchMiniAppViewHolder searchMiniAppViewHolder = this.f69709a;
        if (searchMiniAppViewHolder != null) {
            this.f69709a = null;
            searchMiniAppViewHolder.mAvatarIV = null;
            searchMiniAppViewHolder.mAvatarSmallIV = null;
            searchMiniAppViewHolder.mTitleTV = null;
            searchMiniAppViewHolder.mSummaryTV = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public SearchMiniAppViewHolder_ViewBinding(SearchMiniAppViewHolder searchMiniAppViewHolder, View view) {
        this.f69709a = searchMiniAppViewHolder;
        searchMiniAppViewHolder.mAvatarIV = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.b64, "field 'mAvatarIV'", RemoteImageView.class);
        searchMiniAppViewHolder.mAvatarSmallIV = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.b69, "field 'mAvatarSmallIV'", RemoteImageView.class);
        searchMiniAppViewHolder.mTitleTV = (TextView) Utils.findRequiredViewAsType(view, R.id.dxx, "field 'mTitleTV'", TextView.class);
        searchMiniAppViewHolder.mSummaryTV = (TextView) Utils.findRequiredViewAsType(view, R.id.dxw, "field 'mSummaryTV'", TextView.class);
    }
}
