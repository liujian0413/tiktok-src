package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditBioUrlFragment_ViewBinding */
public final class ProfileEditBioUrlFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ProfileEditBioUrlFragment f95047a;

    /* renamed from: b */
    private View f95048b;

    public final void unbind() {
        ProfileEditBioUrlFragment profileEditBioUrlFragment = this.f95047a;
        if (profileEditBioUrlFragment != null) {
            this.f95047a = null;
            profileEditBioUrlFragment.mDmtStatusView = null;
            profileEditBioUrlFragment.mTvContentName = null;
            profileEditBioUrlFragment.mEditContentInput = null;
            profileEditBioUrlFragment.mClearAllBtn = null;
            profileEditBioUrlFragment.mEditLengthHint = null;
            profileEditBioUrlFragment.mIdEditHintText = null;
            this.f95048b.setOnClickListener(null);
            this.f95048b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ProfileEditBioUrlFragment_ViewBinding(final ProfileEditBioUrlFragment profileEditBioUrlFragment, View view) {
        this.f95047a = profileEditBioUrlFragment;
        profileEditBioUrlFragment.mDmtStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.dav, "field 'mDmtStatusView'", DmtStatusView.class);
        profileEditBioUrlFragment.mTvContentName = (TextView) Utils.findRequiredViewAsType(view, R.id.dsi, "field 'mTvContentName'", TextView.class);
        profileEditBioUrlFragment.mEditContentInput = (EditText) Utils.findRequiredViewAsType(view, R.id.ag6, "field 'mEditContentInput'", EditText.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.b7d, "field 'mClearAllBtn' and method 'onClear'");
        profileEditBioUrlFragment.mClearAllBtn = (ImageView) Utils.castView(findRequiredView, R.id.b7d, "field 'mClearAllBtn'", ImageView.class);
        this.f95048b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                profileEditBioUrlFragment.onClear();
            }
        });
        profileEditBioUrlFragment.mEditLengthHint = (TextView) Utils.findRequiredViewAsType(view, R.id.dtu, "field 'mEditLengthHint'", TextView.class);
        profileEditBioUrlFragment.mIdEditHintText = (TextView) Utils.findRequiredViewAsType(view, R.id.dtt, "field 'mIdEditHintText'", TextView.class);
    }
}
