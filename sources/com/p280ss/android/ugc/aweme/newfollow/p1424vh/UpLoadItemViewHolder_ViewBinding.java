package com.p280ss.android.ugc.aweme.newfollow.p1424vh;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.newfollow.vh.UpLoadItemViewHolder_ViewBinding */
public class UpLoadItemViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private UpLoadItemViewHolder f89375a;

    public void unbind() {
        UpLoadItemViewHolder upLoadItemViewHolder = this.f89375a;
        if (upLoadItemViewHolder != null) {
            this.f89375a = null;
            upLoadItemViewHolder.mCoverImage = null;
            upLoadItemViewHolder.mTextView = null;
            upLoadItemViewHolder.mProgressBar = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public UpLoadItemViewHolder_ViewBinding(UpLoadItemViewHolder upLoadItemViewHolder, View view) {
        this.f89375a = upLoadItemViewHolder;
        upLoadItemViewHolder.mCoverImage = (ImageView) Utils.findRequiredViewAsType(view, R.id.a4j, "field 'mCoverImage'", ImageView.class);
        upLoadItemViewHolder.mTextView = (TextView) Utils.findRequiredViewAsType(view, R.id.e8a, "field 'mTextView'", TextView.class);
        upLoadItemViewHolder.mProgressBar = (ProgressBar) Utils.findRequiredViewAsType(view, R.id.e8c, "field 'mProgressBar'", ProgressBar.class);
    }
}
