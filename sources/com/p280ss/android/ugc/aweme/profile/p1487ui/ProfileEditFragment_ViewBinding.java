package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.view.View;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.p308ui.AnimatedImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditFragment_ViewBinding */
public class ProfileEditFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ProfileEditFragment f95094a;

    /* renamed from: b */
    private View f95095b;

    /* renamed from: c */
    private View f95096c;

    /* renamed from: d */
    private View f95097d;

    /* renamed from: e */
    private View f95098e;

    /* renamed from: f */
    private View f95099f;

    /* renamed from: g */
    private View f95100g;

    /* renamed from: h */
    private View f95101h;

    /* renamed from: i */
    private View f95102i;

    /* renamed from: j */
    private View f95103j;

    /* renamed from: k */
    private View f95104k;

    /* renamed from: l */
    private View f95105l;

    public void unbind() {
        ProfileEditFragment profileEditFragment = this.f95094a;
        if (profileEditFragment != null) {
            this.f95094a = null;
            profileEditFragment.mHeaderImage = null;
            profileEditFragment.mDmtStatusView = null;
            profileEditFragment.mHintArea = null;
            profileEditFragment.personalLinkArea = null;
            profileEditFragment.personalLink = null;
            profileEditFragment.mNickNameLayout = null;
            profileEditFragment.mUsernameLayout = null;
            profileEditFragment.mBioLayout = null;
            profileEditFragment.mWebsiteLayout = null;
            profileEditFragment.mMailLayout = null;
            profileEditFragment.authInstagramName = null;
            profileEditFragment.authYoutubeName = null;
            profileEditFragment.authTwitterName = null;
            this.f95095b.setOnClickListener(null);
            this.f95095b = null;
            this.f95096c.setOnClickListener(null);
            this.f95096c = null;
            this.f95097d.setOnClickListener(null);
            this.f95097d = null;
            this.f95098e.setOnClickListener(null);
            this.f95098e = null;
            this.f95099f.setOnClickListener(null);
            this.f95099f = null;
            this.f95100g.setOnClickListener(null);
            this.f95100g = null;
            this.f95101h.setOnClickListener(null);
            this.f95101h = null;
            this.f95102i.setOnClickListener(null);
            this.f95102i = null;
            this.f95103j.setOnClickListener(null);
            this.f95103j = null;
            this.f95104k.setOnClickListener(null);
            this.f95104k = null;
            this.f95105l.setOnClickListener(null);
            this.f95105l = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ProfileEditFragment_ViewBinding(final ProfileEditFragment profileEditFragment, View view) {
        this.f95094a = profileEditFragment;
        View findRequiredView = Utils.findRequiredView(view, R.id.aus, "field 'mHeaderImage' and method 'editHeaderImage'");
        profileEditFragment.mHeaderImage = (AnimatedImageView) Utils.castView(findRequiredView, R.id.aus, "field 'mHeaderImage'", AnimatedImageView.class);
        this.f95095b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                profileEditFragment.editHeaderImage(view);
            }
        });
        profileEditFragment.mDmtStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.dav, "field 'mDmtStatusView'", DmtStatusView.class);
        profileEditFragment.mHintArea = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.b2q, "field 'mHintArea'", LinearLayout.class);
        View findRequiredView2 = Utils.findRequiredView(view, R.id.bs5, "field 'personalLinkArea' and method 'edit'");
        profileEditFragment.personalLinkArea = (LinearLayout) Utils.castView(findRequiredView2, R.id.bs5, "field 'personalLinkArea'", LinearLayout.class);
        this.f95096c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                profileEditFragment.edit(view);
            }
        });
        profileEditFragment.personalLink = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.cak, "field 'personalLink'", DmtTextView.class);
        View findRequiredView3 = Utils.findRequiredView(view, R.id.c4c, "field 'mNickNameLayout' and method 'editNickName'");
        profileEditFragment.mNickNameLayout = (CommonItemView) Utils.castView(findRequiredView3, R.id.c4c, "field 'mNickNameLayout'", CommonItemView.class);
        this.f95097d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                profileEditFragment.editNickName(view);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, R.id.e_b, "field 'mUsernameLayout' and method 'editUserName'");
        profileEditFragment.mUsernameLayout = (CommonItemView) Utils.castView(findRequiredView4, R.id.e_b, "field 'mUsernameLayout'", CommonItemView.class);
        this.f95098e = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                profileEditFragment.editUserName(view);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, R.id.mi, "field 'mBioLayout' and method 'editBio'");
        profileEditFragment.mBioLayout = (CommonItemView) Utils.castView(findRequiredView5, R.id.mi, "field 'mBioLayout'", CommonItemView.class);
        this.f95099f = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                profileEditFragment.editBio(view);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, R.id.egg, "field 'mWebsiteLayout' and method 'editWebsite'");
        profileEditFragment.mWebsiteLayout = (CommonItemView) Utils.castView(findRequiredView6, R.id.egg, "field 'mWebsiteLayout'", CommonItemView.class);
        this.f95100g = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                profileEditFragment.editWebsite(view);
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, R.id.bwg, "field 'mMailLayout' and method 'editMail'");
        profileEditFragment.mMailLayout = (CommonItemView) Utils.castView(findRequiredView7, R.id.bwg, "field 'mMailLayout'", CommonItemView.class);
        this.f95101h = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                profileEditFragment.editMail(view);
            }
        });
        View findRequiredView8 = Utils.findRequiredView(view, R.id.b25, "field 'authInstagramName' and method 'onBindInstagram'");
        profileEditFragment.authInstagramName = (CommonItemView) Utils.castView(findRequiredView8, R.id.b25, "field 'authInstagramName'", CommonItemView.class);
        this.f95102i = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                profileEditFragment.onBindInstagram(view);
            }
        });
        View findRequiredView9 = Utils.findRequiredView(view, R.id.ei3, "field 'authYoutubeName' and method 'onBindYouTube'");
        profileEditFragment.authYoutubeName = (CommonItemView) Utils.castView(findRequiredView9, R.id.ei3, "field 'authYoutubeName'", CommonItemView.class);
        this.f95103j = findRequiredView9;
        findRequiredView9.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                profileEditFragment.onBindYouTube(view);
            }
        });
        View findRequiredView10 = Utils.findRequiredView(view, R.id.e69, "field 'authTwitterName' and method 'onBindTwitter'");
        profileEditFragment.authTwitterName = (CommonItemView) Utils.castView(findRequiredView10, R.id.e69, "field 'authTwitterName'", CommonItemView.class);
        this.f95104k = findRequiredView10;
        findRequiredView10.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                profileEditFragment.onBindTwitter(view);
            }
        });
        View findRequiredView11 = Utils.findRequiredView(view, R.id.e7y, "method 'editUserName'");
        this.f95105l = findRequiredView11;
        findRequiredView11.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                profileEditFragment.editUserName(view);
            }
        });
    }
}
