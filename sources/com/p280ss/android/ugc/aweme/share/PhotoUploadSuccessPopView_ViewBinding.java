package com.p280ss.android.ugc.aweme.share;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.common.widget.PullUpLayout;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.share.PhotoUploadSuccessPopView_ViewBinding */
public class PhotoUploadSuccessPopView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private PhotoUploadSuccessPopView f98824a;

    /* renamed from: b */
    private View f98825b;

    public void unbind() {
        PhotoUploadSuccessPopView photoUploadSuccessPopView = this.f98824a;
        if (photoUploadSuccessPopView != null) {
            this.f98824a = null;
            photoUploadSuccessPopView.mPullUpLayout = null;
            photoUploadSuccessPopView.mLayoutView = null;
            photoUploadSuccessPopView.mRootLayout = null;
            photoUploadSuccessPopView.mVideoCover = null;
            photoUploadSuccessPopView.mShareItemContainer = null;
            photoUploadSuccessPopView.commerceView = null;
            photoUploadSuccessPopView.commerceIconView = null;
            photoUploadSuccessPopView.commerceMsgView = null;
            photoUploadSuccessPopView.commerceLineView = null;
            this.f98825b.setOnClickListener(null);
            this.f98825b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PhotoUploadSuccessPopView_ViewBinding(final PhotoUploadSuccessPopView photoUploadSuccessPopView, View view) {
        this.f98824a = photoUploadSuccessPopView;
        photoUploadSuccessPopView.mPullUpLayout = (PullUpLayout) Utils.findRequiredViewAsType(view, R.id.clx, "field 'mPullUpLayout'", PullUpLayout.class);
        photoUploadSuccessPopView.mLayoutView = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.bh2, "field 'mLayoutView'", RelativeLayout.class);
        photoUploadSuccessPopView.mRootLayout = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.bh1, "field 'mRootLayout'", LinearLayout.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.azf, "field 'mVideoCover' and method 'onClick'");
        photoUploadSuccessPopView.mVideoCover = (RemoteImageView) Utils.castView(findRequiredView, R.id.azf, "field 'mVideoCover'", RemoteImageView.class);
        this.f98825b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                photoUploadSuccessPopView.onClick(view);
            }
        });
        photoUploadSuccessPopView.mShareItemContainer = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.cbk, "field 'mShareItemContainer'", LinearLayout.class);
        photoUploadSuccessPopView.commerceView = Utils.findRequiredView(view, R.id.bqu, "field 'commerceView'");
        photoUploadSuccessPopView.commerceIconView = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.b7q, "field 'commerceIconView'", RemoteImageView.class);
        photoUploadSuccessPopView.commerceMsgView = (TextView) Utils.findRequiredViewAsType(view, R.id.ds8, "field 'commerceMsgView'", TextView.class);
        photoUploadSuccessPopView.commerceLineView = Utils.findRequiredView(view, R.id.bm7, "field 'commerceLineView'");
    }
}
