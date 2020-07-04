package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditUsernameFragment_ViewBinding */
public final class ProfileEditUsernameFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ProfileEditUsernameFragment f95149a;

    /* renamed from: b */
    private View f95150b;

    public final void unbind() {
        ProfileEditUsernameFragment profileEditUsernameFragment = this.f95149a;
        if (profileEditUsernameFragment != null) {
            this.f95149a = null;
            profileEditUsernameFragment.mTvContentName = null;
            profileEditUsernameFragment.mEditContentInput = null;
            profileEditUsernameFragment.mClearAllBtn = null;
            profileEditUsernameFragment.mUserLinkHint = null;
            profileEditUsernameFragment.mIdEditHintText = null;
            this.f95150b.setOnClickListener(null);
            this.f95150b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ProfileEditUsernameFragment_ViewBinding(final ProfileEditUsernameFragment profileEditUsernameFragment, View view) {
        this.f95149a = profileEditUsernameFragment;
        profileEditUsernameFragment.mTvContentName = (TextView) Utils.findRequiredViewAsType(view, R.id.dsi, "field 'mTvContentName'", TextView.class);
        profileEditUsernameFragment.mEditContentInput = (EditText) Utils.findRequiredViewAsType(view, R.id.ag6, "field 'mEditContentInput'", EditText.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.b7d, "field 'mClearAllBtn' and method 'onClear'");
        profileEditUsernameFragment.mClearAllBtn = (ImageView) Utils.castView(findRequiredView, R.id.b7d, "field 'mClearAllBtn'", ImageView.class);
        this.f95150b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                profileEditUsernameFragment.onClear();
            }
        });
        profileEditUsernameFragment.mUserLinkHint = (TextView) Utils.findRequiredViewAsType(view, R.id.e9i, "field 'mUserLinkHint'", TextView.class);
        profileEditUsernameFragment.mIdEditHintText = (TextView) Utils.findRequiredViewAsType(view, R.id.dtt, "field 'mIdEditHintText'", TextView.class);
    }
}
