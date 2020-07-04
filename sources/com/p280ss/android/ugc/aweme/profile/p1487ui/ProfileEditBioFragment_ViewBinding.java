package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditBioFragment_ViewBinding */
public final class ProfileEditBioFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ProfileEditBioFragment f95028a;

    /* renamed from: b */
    private View f95029b;

    public final void unbind() {
        ProfileEditBioFragment profileEditBioFragment = this.f95028a;
        if (profileEditBioFragment != null) {
            this.f95028a = null;
            profileEditBioFragment.mTvContentName = null;
            profileEditBioFragment.mEditContentInput = null;
            profileEditBioFragment.mClearAllBtn = null;
            profileEditBioFragment.mEditLengthHint = null;
            profileEditBioFragment.mIdEditHintText = null;
            this.f95029b.setOnClickListener(null);
            this.f95029b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ProfileEditBioFragment_ViewBinding(final ProfileEditBioFragment profileEditBioFragment, View view) {
        this.f95028a = profileEditBioFragment;
        profileEditBioFragment.mTvContentName = (TextView) Utils.findRequiredViewAsType(view, R.id.dsi, "field 'mTvContentName'", TextView.class);
        profileEditBioFragment.mEditContentInput = (EditText) Utils.findRequiredViewAsType(view, R.id.ag6, "field 'mEditContentInput'", EditText.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.b7d, "field 'mClearAllBtn' and method 'onClear'");
        profileEditBioFragment.mClearAllBtn = (ImageView) Utils.castView(findRequiredView, R.id.b7d, "field 'mClearAllBtn'", ImageView.class);
        this.f95029b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                profileEditBioFragment.onClear();
            }
        });
        profileEditBioFragment.mEditLengthHint = (TextView) Utils.findRequiredViewAsType(view, R.id.dtu, "field 'mEditLengthHint'", TextView.class);
        profileEditBioFragment.mIdEditHintText = (TextView) Utils.findRequiredViewAsType(view, R.id.dtt, "field 'mIdEditHintText'", TextView.class);
    }
}
