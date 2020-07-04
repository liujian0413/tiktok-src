package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.profile.fansshake.C35787c;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.BaseDTProfileFragment_ViewBinding */
public class BaseDTProfileFragment_ViewBinding extends BaseProfileFragment_ViewBinding {

    /* renamed from: a */
    private BaseDTProfileFragment f94514a;

    public void unbind() {
        BaseDTProfileFragment baseDTProfileFragment = this.f94514a;
        if (baseDTProfileFragment != null) {
            this.f94514a = null;
            baseDTProfileFragment.mTitleColorCtrl = null;
            baseDTProfileFragment.mMoreBtnBg = null;
            baseDTProfileFragment.mBackBtnBg = null;
            baseDTProfileFragment.mUserCover = null;
            baseDTProfileFragment.mCoverMask = null;
            baseDTProfileFragment.mFastChatBtn = null;
            baseDTProfileFragment.mFastFollowBtn = null;
            baseDTProfileFragment.mFansShakeView = null;
            baseDTProfileFragment.mProfileCoverLayout = null;
            baseDTProfileFragment.mPauseIv = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public BaseDTProfileFragment_ViewBinding(BaseDTProfileFragment baseDTProfileFragment, View view) {
        super(baseDTProfileFragment, view);
        this.f94514a = baseDTProfileFragment;
        baseDTProfileFragment.mTitleColorCtrl = Utils.findRequiredView(view, R.id.dk8, "field 'mTitleColorCtrl'");
        baseDTProfileFragment.mMoreBtnBg = Utils.findRequiredView(view, R.id.c00, "field 'mMoreBtnBg'");
        baseDTProfileFragment.mBackBtnBg = view.findViewById(R.id.jp);
        baseDTProfileFragment.mUserCover = (SmartImageView) Utils.findRequiredViewAsType(view, R.id.b81, "field 'mUserCover'", SmartImageView.class);
        baseDTProfileFragment.mCoverMask = view.findViewById(R.id.a4o);
        baseDTProfileFragment.mFastChatBtn = (RemoteImageView) Utils.findOptionalViewAsType(view, R.id.ait, "field 'mFastChatBtn'", RemoteImageView.class);
        baseDTProfileFragment.mFastFollowBtn = (DmtTextView) Utils.findOptionalViewAsType(view, R.id.aiu, "field 'mFastFollowBtn'", DmtTextView.class);
        baseDTProfileFragment.mFansShakeView = (C35787c) Utils.findOptionalViewAsType(view, R.id.aiq, "field 'mFansShakeView'", C35787c.class);
        baseDTProfileFragment.mProfileCoverLayout = (FrameLayout) Utils.findOptionalViewAsType(view, R.id.ckw, "field 'mProfileCoverLayout'", FrameLayout.class);
        baseDTProfileFragment.mPauseIv = (ImageView) Utils.findOptionalViewAsType(view, R.id.bau, "field 'mPauseIv'", ImageView.class);
    }
}
