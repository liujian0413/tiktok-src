package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageView;
import com.p280ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer;
import com.p280ss.android.ugc.aweme.commercialize.views.AdHalfWebPageMaskLayer;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.UserProfileFragment_ViewBinding */
public class UserProfileFragment_ViewBinding extends BaseDTProfileFragment_ViewBinding {

    /* renamed from: a */
    private UserProfileFragment f95382a;

    /* renamed from: b */
    private View f95383b;

    /* renamed from: c */
    private View f95384c;

    /* renamed from: d */
    private View f95385d;

    /* renamed from: e */
    private View f95386e;

    /* renamed from: f */
    private View f95387f;

    /* renamed from: g */
    private View f95388g;

    public void unbind() {
        UserProfileFragment userProfileFragment = this.f95382a;
        if (userProfileFragment != null) {
            this.f95382a = null;
            userProfileFragment.adBottomMoreBtn = null;
            userProfileFragment.adBottomAvatar = null;
            userProfileFragment.adBottomTitle = null;
            userProfileFragment.adBottomDescLL = null;
            userProfileFragment.adBottomCloseBtn = null;
            userProfileFragment.txtHomePageBottomTextual = null;
            userProfileFragment.mBackBtn = null;
            userProfileFragment.adBottomLayout = null;
            userProfileFragment.mRightMoreBtn = null;
            userProfileFragment.mHitRankTagContainer = null;
            userProfileFragment.blackMaskLayer = null;
            userProfileFragment.adHalfLandpageContainer = null;
            this.f95383b.setOnClickListener(null);
            this.f95383b = null;
            this.f95384c.setOnClickListener(null);
            this.f95384c = null;
            this.f95385d.setOnClickListener(null);
            this.f95385d = null;
            this.f95386e.setOnClickListener(null);
            this.f95386e = null;
            this.f95387f.setOnClickListener(null);
            this.f95387f = null;
            this.f95388g.setOnClickListener(null);
            this.f95388g = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public UserProfileFragment_ViewBinding(final UserProfileFragment userProfileFragment, View view) {
        super(userProfileFragment, view);
        this.f95382a = userProfileFragment;
        View findRequiredView = Utils.findRequiredView(view, R.id.bf, "field 'adBottomMoreBtn' and method 'onAdBottomClick'");
        userProfileFragment.adBottomMoreBtn = (TextView) Utils.castView(findRequiredView, R.id.bf, "field 'adBottomMoreBtn'", TextView.class);
        this.f95383b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                userProfileFragment.onAdBottomClick(view);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, R.id.bb, "field 'adBottomAvatar' and method 'onAdBottomClick'");
        userProfileFragment.adBottomAvatar = (AvatarImageView) Utils.castView(findRequiredView2, R.id.bb, "field 'adBottomAvatar'", AvatarImageView.class);
        this.f95384c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                userProfileFragment.onAdBottomClick(view);
            }
        });
        userProfileFragment.adBottomTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.bg, "field 'adBottomTitle'", TextView.class);
        View findRequiredView3 = Utils.findRequiredView(view, R.id.bd, "field 'adBottomDescLL' and method 'onAdBottomClick'");
        userProfileFragment.adBottomDescLL = findRequiredView3;
        this.f95385d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                userProfileFragment.onAdBottomClick(view);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, R.id.bc, "field 'adBottomCloseBtn' and method 'onAdBottomClick'");
        userProfileFragment.adBottomCloseBtn = findRequiredView4;
        this.f95386e = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                userProfileFragment.onAdBottomClick(view);
            }
        });
        userProfileFragment.txtHomePageBottomTextual = (TextView) Utils.findRequiredViewAsType(view, R.id.e6v, "field 'txtHomePageBottomTextual'", TextView.class);
        View findRequiredView5 = Utils.findRequiredView(view, R.id.jo, "field 'mBackBtn' and method 'onBack'");
        userProfileFragment.mBackBtn = (ImageView) Utils.castView(findRequiredView5, R.id.jo, "field 'mBackBtn'", ImageView.class);
        this.f95387f = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                userProfileFragment.onBack(view);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, R.id.be, "field 'adBottomLayout' and method 'onAdBottomClick'");
        userProfileFragment.adBottomLayout = findRequiredView6;
        this.f95388g = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                userProfileFragment.onAdBottomClick(view);
            }
        });
        userProfileFragment.mRightMoreBtn = (ImageView) Utils.findRequiredViewAsType(view, R.id.dk5, "field 'mRightMoreBtn'", ImageView.class);
        userProfileFragment.mHitRankTagContainer = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.e9y, "field 'mHitRankTagContainer'", FrameLayout.class);
        userProfileFragment.blackMaskLayer = (AdHalfWebPageMaskLayer) Utils.findRequiredViewAsType(view, R.id.mr, "field 'blackMaskLayer'", AdHalfWebPageMaskLayer.class);
        userProfileFragment.adHalfLandpageContainer = (AdHalfWebPageContainer) Utils.findRequiredViewAsType(view, R.id.bz, "field 'adHalfLandpageContainer'", AdHalfWebPageContainer.class);
    }
}
