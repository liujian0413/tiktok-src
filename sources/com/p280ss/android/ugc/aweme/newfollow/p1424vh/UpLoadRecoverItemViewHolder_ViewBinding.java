package com.p280ss.android.ugc.aweme.newfollow.p1424vh;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.newfollow.vh.UpLoadRecoverItemViewHolder_ViewBinding */
public class UpLoadRecoverItemViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private UpLoadRecoverItemViewHolder f89378a;

    public void unbind() {
        UpLoadRecoverItemViewHolder upLoadRecoverItemViewHolder = this.f89378a;
        if (upLoadRecoverItemViewHolder != null) {
            this.f89378a = null;
            upLoadRecoverItemViewHolder.mCoverImage = null;
            upLoadRecoverItemViewHolder.mTextView = null;
            upLoadRecoverItemViewHolder.mProgressBar = null;
            upLoadRecoverItemViewHolder.mIvClose = null;
            upLoadRecoverItemViewHolder.mIvRefresh = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public UpLoadRecoverItemViewHolder_ViewBinding(UpLoadRecoverItemViewHolder upLoadRecoverItemViewHolder, View view) {
        this.f89378a = upLoadRecoverItemViewHolder;
        upLoadRecoverItemViewHolder.mCoverImage = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.a4j, "field 'mCoverImage'", RemoteImageView.class);
        upLoadRecoverItemViewHolder.mTextView = (TextView) Utils.findRequiredViewAsType(view, R.id.e8a, "field 'mTextView'", TextView.class);
        upLoadRecoverItemViewHolder.mProgressBar = (ProgressBar) Utils.findRequiredViewAsType(view, R.id.e8c, "field 'mProgressBar'", ProgressBar.class);
        upLoadRecoverItemViewHolder.mIvClose = (ImageView) Utils.findRequiredViewAsType(view, R.id.b7g, "field 'mIvClose'", ImageView.class);
        upLoadRecoverItemViewHolder.mIvRefresh = (ImageView) Utils.findRequiredViewAsType(view, R.id.bbg, "field 'mIvRefresh'", ImageView.class);
    }
}
