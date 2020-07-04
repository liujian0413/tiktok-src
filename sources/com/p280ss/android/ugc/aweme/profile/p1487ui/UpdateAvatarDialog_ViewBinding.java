package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.internal.Utils;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.UpdateAvatarDialog_ViewBinding */
public class UpdateAvatarDialog_ViewBinding extends UpdateUserInfoDialog_ViewBinding {

    /* renamed from: a */
    private UpdateAvatarDialog f95266a;

    public void unbind() {
        UpdateAvatarDialog updateAvatarDialog = this.f95266a;
        if (updateAvatarDialog != null) {
            this.f95266a = null;
            updateAvatarDialog.mPolicyDes = null;
            updateAvatarDialog.mAvatarImageView = null;
            updateAvatarDialog.txtDisclaimer = null;
            updateAvatarDialog.ivDisclaimer = null;
            updateAvatarDialog.mVpExpandContainer = null;
            updateAvatarDialog.mAvatarContainer = null;
            updateAvatarDialog.mAvatarDecoration = null;
            updateAvatarDialog.mDecorationRecyclerView = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public UpdateAvatarDialog_ViewBinding(UpdateAvatarDialog updateAvatarDialog, View view) {
        super(updateAvatarDialog, view);
        this.f95266a = updateAvatarDialog;
        updateAvatarDialog.mPolicyDes = (TextView) Utils.findRequiredViewAsType(view, R.id.chz, "field 'mPolicyDes'", TextView.class);
        updateAvatarDialog.mAvatarImageView = (AvatarImageView) Utils.findRequiredViewAsType(view, R.id.ck5, "field 'mAvatarImageView'", AvatarImageView.class);
        updateAvatarDialog.txtDisclaimer = (TextView) Utils.findRequiredViewAsType(view, R.id.ah7, "field 'txtDisclaimer'", TextView.class);
        updateAvatarDialog.ivDisclaimer = (ImageView) Utils.findRequiredViewAsType(view, R.id.ah6, "field 'ivDisclaimer'", ImageView.class);
        updateAvatarDialog.mVpExpandContainer = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.ah5, "field 'mVpExpandContainer'", ViewGroup.class);
        updateAvatarDialog.mAvatarContainer = Utils.findRequiredView(view, R.id.im, "field 'mAvatarContainer'");
        updateAvatarDialog.mAvatarDecoration = (ImageView) Utils.findRequiredViewAsType(view, R.id.ck6, "field 'mAvatarDecoration'", ImageView.class);
        updateAvatarDialog.mDecorationRecyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.ix, "field 'mDecorationRecyclerView'", RecyclerView.class);
    }
}
