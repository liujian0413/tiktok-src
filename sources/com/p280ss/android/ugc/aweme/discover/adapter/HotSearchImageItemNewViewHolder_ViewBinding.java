package com.p280ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.discover.widget.HotSearchTitleTextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.HotSearchImageItemNewViewHolder_ViewBinding */
public class HotSearchImageItemNewViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private HotSearchImageItemNewViewHolder f69502a;

    public void unbind() {
        HotSearchImageItemNewViewHolder hotSearchImageItemNewViewHolder = this.f69502a;
        if (hotSearchImageItemNewViewHolder != null) {
            this.f69502a = null;
            hotSearchImageItemNewViewHolder.mImageView = null;
            hotSearchImageItemNewViewHolder.mMaskView = null;
            hotSearchImageItemNewViewHolder.mTitleView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public HotSearchImageItemNewViewHolder_ViewBinding(HotSearchImageItemNewViewHolder hotSearchImageItemNewViewHolder, View view) {
        this.f69502a = hotSearchImageItemNewViewHolder;
        hotSearchImageItemNewViewHolder.mImageView = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.b7x, "field 'mImageView'", RemoteImageView.class);
        hotSearchImageItemNewViewHolder.mMaskView = Utils.findRequiredView(view, R.id.ed0, "field 'mMaskView'");
        hotSearchImageItemNewViewHolder.mTitleView = (HotSearchTitleTextView) Utils.findRequiredViewAsType(view, R.id.e3f, "field 'mTitleView'", HotSearchTitleTextView.class);
    }
}
