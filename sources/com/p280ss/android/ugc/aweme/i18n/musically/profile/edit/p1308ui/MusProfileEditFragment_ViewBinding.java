package com.p280ss.android.ugc.aweme.i18n.musically.profile.edit.p1308ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.p280ss.android.ugc.aweme.profile.p1487ui.ProfileEditFragment_ViewBinding;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.i18n.musically.profile.edit.ui.MusProfileEditFragment_ViewBinding */
public class MusProfileEditFragment_ViewBinding extends ProfileEditFragment_ViewBinding {

    /* renamed from: a */
    private MusProfileEditFragment f80233a;

    /* renamed from: b */
    private View f80234b;

    public void unbind() {
        MusProfileEditFragment musProfileEditFragment = this.f80233a;
        if (musProfileEditFragment != null) {
            this.f80233a = null;
            musProfileEditFragment.mRlAvatarChangeByVideo = null;
            musProfileEditFragment.mAvatarVideoImageView = null;
            musProfileEditFragment.mHeaderImageVideoIcon = null;
            this.f80234b.setOnClickListener(null);
            this.f80234b = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MusProfileEditFragment_ViewBinding(final MusProfileEditFragment musProfileEditFragment, View view) {
        super(musProfileEditFragment, view);
        this.f80233a = musProfileEditFragment;
        View findRequiredView = Utils.findRequiredView(view, R.id.ctv, "field 'mRlAvatarChangeByVideo' and method 'editHeaderImageVideo'");
        musProfileEditFragment.mRlAvatarChangeByVideo = (RelativeLayout) Utils.castView(findRequiredView, R.id.ctv, "field 'mRlAvatarChangeByVideo'", RelativeLayout.class);
        this.f80234b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                musProfileEditFragment.editHeaderImageVideo();
            }
        });
        musProfileEditFragment.mAvatarVideoImageView = (MusAvatarImageView) Utils.findRequiredViewAsType(view, R.id.aut, "field 'mAvatarVideoImageView'", MusAvatarImageView.class);
        musProfileEditFragment.mHeaderImageVideoIcon = (ImageView) Utils.findRequiredViewAsType(view, R.id.auu, "field 'mHeaderImageVideoIcon'", ImageView.class);
    }
}
