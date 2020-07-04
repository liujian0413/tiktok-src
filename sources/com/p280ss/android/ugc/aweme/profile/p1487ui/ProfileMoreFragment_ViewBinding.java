package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p262ui.titlebar.ButtonTitleBar;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileMoreFragment_ViewBinding */
public class ProfileMoreFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ProfileMoreFragment f95193a;

    /* renamed from: b */
    private View f95194b;

    /* renamed from: c */
    private View f95195c;

    /* renamed from: d */
    private View f95196d;

    /* renamed from: e */
    private View f95197e;

    /* renamed from: f */
    private View f95198f;

    /* renamed from: g */
    private View f95199g;

    /* renamed from: h */
    private View f95200h;

    public void unbind() {
        ProfileMoreFragment profileMoreFragment = this.f95193a;
        if (profileMoreFragment != null) {
            this.f95193a = null;
            profileMoreFragment.mTitleBar = null;
            profileMoreFragment.mSendMsgImage = null;
            profileMoreFragment.mBlock = null;
            profileMoreFragment.mRemarkName = null;
            profileMoreFragment.mRemarkNameUnderline = null;
            profileMoreFragment.mRemoveFollower = null;
            profileMoreFragment.mRemoveFollowerUnderline = null;
            profileMoreFragment.shareView = null;
            profileMoreFragment.mBackBtn = null;
            profileMoreFragment.mAvatarIv = null;
            this.f95194b.setOnClickListener(null);
            this.f95194b = null;
            this.f95195c.setOnClickListener(null);
            this.f95195c = null;
            this.f95196d.setOnClickListener(null);
            this.f95196d = null;
            this.f95197e.setOnClickListener(null);
            this.f95197e = null;
            this.f95198f.setOnClickListener(null);
            this.f95198f = null;
            this.f95199g.setOnClickListener(null);
            this.f95199g = null;
            this.f95200h.setOnClickListener(null);
            this.f95200h = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ProfileMoreFragment_ViewBinding(final ProfileMoreFragment profileMoreFragment, View view) {
        this.f95193a = profileMoreFragment;
        profileMoreFragment.mTitleBar = (ButtonTitleBar) Utils.findRequiredViewAsType(view, R.id.dke, "field 'mTitleBar'", ButtonTitleBar.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.d37, "field 'mSendMsgImage' and method 'onClick'");
        profileMoreFragment.mSendMsgImage = (RemoteImageView) Utils.castView(findRequiredView, R.id.d37, "field 'mSendMsgImage'", RemoteImageView.class);
        this.f95194b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                profileMoreFragment.onClick(view);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, R.id.mt, "field 'mBlock' and method 'onClick'");
        profileMoreFragment.mBlock = (CommonItemView) Utils.castView(findRequiredView2, R.id.mt, "field 'mBlock'", CommonItemView.class);
        this.f95195c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                profileMoreFragment.onClick(view);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, R.id.crk, "field 'mRemarkName' and method 'onClick'");
        profileMoreFragment.mRemarkName = (CommonItemView) Utils.castView(findRequiredView3, R.id.crk, "field 'mRemarkName'", CommonItemView.class);
        this.f95196d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                profileMoreFragment.onClick(view);
            }
        });
        profileMoreFragment.mRemarkNameUnderline = Utils.findRequiredView(view, R.id.crl, "field 'mRemarkNameUnderline'");
        View findRequiredView4 = Utils.findRequiredView(view, R.id.crn, "field 'mRemoveFollower' and method 'onClick'");
        profileMoreFragment.mRemoveFollower = (CommonItemView) Utils.castView(findRequiredView4, R.id.crn, "field 'mRemoveFollower'", CommonItemView.class);
        this.f95197e = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                profileMoreFragment.onClick(view);
            }
        });
        profileMoreFragment.mRemoveFollowerUnderline = Utils.findRequiredView(view, R.id.cro, "field 'mRemoveFollowerUnderline'");
        View findRequiredView5 = Utils.findRequiredView(view, R.id.d4i, "field 'shareView' and method 'onClick'");
        profileMoreFragment.shareView = findRequiredView5;
        this.f95198f = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                profileMoreFragment.onClick(view);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, R.id.jo, "field 'mBackBtn' and method 'onClick'");
        profileMoreFragment.mBackBtn = findRequiredView6;
        this.f95199g = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                profileMoreFragment.onClick(view);
            }
        });
        profileMoreFragment.mAvatarIv = (AvatarImageView) Utils.findRequiredViewAsType(view, R.id.ic, "field 'mAvatarIv'", AvatarImageView.class);
        View findRequiredView7 = Utils.findRequiredView(view, R.id.crz, "method 'onClick'");
        this.f95200h = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                profileMoreFragment.onClick(view);
            }
        });
    }
}
