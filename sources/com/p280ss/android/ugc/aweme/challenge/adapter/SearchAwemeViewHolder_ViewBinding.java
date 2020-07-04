package com.p280ss.android.ugc.aweme.challenge.adapter;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.challenge.adapter.SearchAwemeViewHolder_ViewBinding */
public class SearchAwemeViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SearchAwemeViewHolder f62401a;

    public void unbind() {
        SearchAwemeViewHolder searchAwemeViewHolder = this.f62401a;
        if (searchAwemeViewHolder != null) {
            this.f62401a = null;
            searchAwemeViewHolder.mTitleView = null;
            searchAwemeViewHolder.mDescView = null;
            searchAwemeViewHolder.mJoinCountView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public SearchAwemeViewHolder_ViewBinding(SearchAwemeViewHolder searchAwemeViewHolder, View view) {
        this.f62401a = searchAwemeViewHolder;
        searchAwemeViewHolder.mTitleView = (TextView) Utils.findRequiredViewAsType(view, R.id.title, "field 'mTitleView'", TextView.class);
        searchAwemeViewHolder.mDescView = (TextView) Utils.findRequiredViewAsType(view, R.id.a7e, "field 'mDescView'", TextView.class);
        searchAwemeViewHolder.mJoinCountView = (TextView) Utils.findRequiredViewAsType(view, R.id.bf8, "field 'mJoinCountView'", TextView.class);
        searchAwemeViewHolder.margin = view.getContext().getResources().getDimensionPixelSize(R.dimen.cx);
    }
}
