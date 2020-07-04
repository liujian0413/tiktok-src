package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.PinchImageView;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.PreviewBoxView;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.SwitchModeFrameLayout;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileCoverCropActivity_ViewBinding */
public class ProfileCoverCropActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ProfileCoverCropActivity f94988a;

    /* renamed from: b */
    private View f94989b;

    /* renamed from: c */
    private View f94990c;

    public void unbind() {
        ProfileCoverCropActivity profileCoverCropActivity = this.f94988a;
        if (profileCoverCropActivity != null) {
            this.f94988a = null;
            profileCoverCropActivity.mTitleBar = null;
            profileCoverCropActivity.mCropContainer = null;
            profileCoverCropActivity.mCoverImage = null;
            profileCoverCropActivity.mCoverWindow = null;
            profileCoverCropActivity.mFakeShelter = null;
            profileCoverCropActivity.mFakeShelterTop = null;
            profileCoverCropActivity.mCancel = null;
            profileCoverCropActivity.mConfirm = null;
            profileCoverCropActivity.mStatusView = null;
            this.f94989b.setOnClickListener(null);
            this.f94989b = null;
            this.f94990c.setOnClickListener(null);
            this.f94990c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ProfileCoverCropActivity_ViewBinding(final ProfileCoverCropActivity profileCoverCropActivity, View view) {
        this.f94988a = profileCoverCropActivity;
        profileCoverCropActivity.mTitleBar = Utils.findRequiredView(view, R.id.djz, "field 'mTitleBar'");
        profileCoverCropActivity.mCropContainer = (SwitchModeFrameLayout) Utils.findRequiredViewAsType(view, R.id.a59, "field 'mCropContainer'", SwitchModeFrameLayout.class);
        profileCoverCropActivity.mCoverImage = (PinchImageView) Utils.findRequiredViewAsType(view, R.id.b7x, "field 'mCoverImage'", PinchImageView.class);
        profileCoverCropActivity.mCoverWindow = (PreviewBoxView) Utils.findRequiredViewAsType(view, R.id.b84, "field 'mCoverWindow'", PreviewBoxView.class);
        profileCoverCropActivity.mFakeShelter = (ImageView) Utils.findRequiredViewAsType(view, R.id.b93, "field 'mFakeShelter'", ImageView.class);
        profileCoverCropActivity.mFakeShelterTop = Utils.findRequiredView(view, R.id.b94, "field 'mFakeShelterTop'");
        View findRequiredView = Utils.findRequiredView(view, R.id.dr5, "field 'mCancel' and method 'onViewClicked'");
        profileCoverCropActivity.mCancel = (DmtTextView) Utils.castView(findRequiredView, R.id.dr5, "field 'mCancel'", DmtTextView.class);
        this.f94989b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                profileCoverCropActivity.onViewClicked(view);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, R.id.ds9, "field 'mConfirm' and method 'onViewClicked'");
        profileCoverCropActivity.mConfirm = (DmtTextView) Utils.castView(findRequiredView2, R.id.ds9, "field 'mConfirm'", DmtTextView.class);
        this.f94990c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                profileCoverCropActivity.onViewClicked(view);
            }
        });
        profileCoverCropActivity.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.dav, "field 'mStatusView'", DmtStatusView.class);
    }
}
