package com.p280ss.android.ugc.aweme.profile.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.profile.adapter.ProfileCoverViewHolder_ViewBinding */
public class ProfileCoverViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ProfileCoverViewHolder f93647a;

    public void unbind() {
        ProfileCoverViewHolder profileCoverViewHolder = this.f93647a;
        if (profileCoverViewHolder != null) {
            this.f93647a = null;
            profileCoverViewHolder.mCoverImage = null;
            profileCoverViewHolder.mSelectBtn = null;
            profileCoverViewHolder.mUnselectedText = null;
            profileCoverViewHolder.mSelectedImage = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ProfileCoverViewHolder_ViewBinding(ProfileCoverViewHolder profileCoverViewHolder, View view) {
        this.f93647a = profileCoverViewHolder;
        profileCoverViewHolder.mCoverImage = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.b7x, "field 'mCoverImage'", RemoteImageView.class);
        profileCoverViewHolder.mSelectBtn = Utils.findRequiredView(view, R.id.an0, "field 'mSelectBtn'");
        profileCoverViewHolder.mUnselectedText = (TextView) Utils.findRequiredViewAsType(view, R.id.e48, "field 'mUnselectedText'", TextView.class);
        profileCoverViewHolder.mSelectedImage = (ImageView) Utils.findRequiredViewAsType(view, R.id.bc3, "field 'mSelectedImage'", ImageView.class);
    }
}
