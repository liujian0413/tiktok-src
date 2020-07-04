package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditContentFragment_ViewBinding */
public final class ProfileEditContentFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ProfileEditContentFragment f95064a;

    /* renamed from: b */
    private View f95065b;

    public final void unbind() {
        ProfileEditContentFragment profileEditContentFragment = this.f95064a;
        if (profileEditContentFragment != null) {
            this.f95064a = null;
            profileEditContentFragment.mTvContentName = null;
            profileEditContentFragment.mEditContentInput = null;
            profileEditContentFragment.mClearAllBtn = null;
            profileEditContentFragment.mEditLengthHint = null;
            profileEditContentFragment.mIdEditHintText = null;
            this.f95065b.setOnClickListener(null);
            this.f95065b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ProfileEditContentFragment_ViewBinding(final ProfileEditContentFragment profileEditContentFragment, View view) {
        this.f95064a = profileEditContentFragment;
        profileEditContentFragment.mTvContentName = (TextView) Utils.findRequiredViewAsType(view, R.id.dsi, "field 'mTvContentName'", TextView.class);
        profileEditContentFragment.mEditContentInput = (EditText) Utils.findRequiredViewAsType(view, R.id.ag6, "field 'mEditContentInput'", EditText.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.b7d, "field 'mClearAllBtn' and method 'onClear'");
        profileEditContentFragment.mClearAllBtn = (ImageView) Utils.castView(findRequiredView, R.id.b7d, "field 'mClearAllBtn'", ImageView.class);
        this.f95065b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                profileEditContentFragment.onClear();
            }
        });
        profileEditContentFragment.mEditLengthHint = (TextView) Utils.findRequiredViewAsType(view, R.id.dtu, "field 'mEditLengthHint'", TextView.class);
        profileEditContentFragment.mIdEditHintText = (TextView) Utils.findRequiredViewAsType(view, R.id.dtt, "field 'mIdEditHintText'", TextView.class);
    }
}
