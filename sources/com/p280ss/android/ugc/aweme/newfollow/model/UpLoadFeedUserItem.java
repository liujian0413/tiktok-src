package com.p280ss.android.ugc.aweme.newfollow.model;

import android.graphics.Bitmap;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.UpLoadItemViewHolder;
import com.p280ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.newfollow.model.UpLoadFeedUserItem */
public class UpLoadFeedUserItem extends User {
    private Bitmap mCover;
    private UpLoadItemViewHolder mItemView;
    private int mProgress;

    public Bitmap getCover() {
        return this.mCover;
    }

    public int getProgress() {
        return this.mProgress;
    }

    public void setItemView(UpLoadItemViewHolder upLoadItemViewHolder) {
        this.mItemView = upLoadItemViewHolder;
    }

    public void setCover(Bitmap bitmap) {
        if (bitmap != null) {
            this.mCover = bitmap;
        }
    }

    public void setProgress(int i) {
        this.mProgress = i;
        if (this.mItemView != null) {
            this.mItemView.mo87022a(i);
        }
    }
}
