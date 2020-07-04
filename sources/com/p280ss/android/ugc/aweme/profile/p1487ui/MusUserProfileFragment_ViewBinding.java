package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.p280ss.android.ugc.aweme.base.p308ui.AnimationImageView;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.RecommendCommonUserViewMus;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.MusUserProfileFragment_ViewBinding */
public class MusUserProfileFragment_ViewBinding extends MusAbsProfileFragment_ViewBinding {

    /* renamed from: a */
    private MusUserProfileFragment f94883a;

    /* renamed from: b */
    private View f94884b;

    /* renamed from: c */
    private View f94885c;

    /* renamed from: d */
    private View f94886d;

    /* renamed from: e */
    private View f94887e;

    /* renamed from: f */
    private View f94888f;

    /* renamed from: g */
    private View f94889g;

    /* renamed from: h */
    private View f94890h;

    /* renamed from: i */
    private View f94891i;

    /* renamed from: j */
    private View f94892j;

    public void unbind() {
        MusUserProfileFragment musUserProfileFragment = this.f94883a;
        if (musUserProfileFragment != null) {
            this.f94883a = null;
            musUserProfileFragment.followIv = null;
            musUserProfileFragment.sendMsgBtn = null;
            musUserProfileFragment.followBn = null;
            musUserProfileFragment.mFastFollowBtn = null;
            musUserProfileFragment.mFastSendMsgBtn = null;
            musUserProfileFragment.mFastLeftFollow = null;
            musUserProfileFragment.mFastLeftMsg = null;
            musUserProfileFragment.mIvMutual = null;
            musUserProfileFragment.mTvFollow = null;
            musUserProfileFragment.mFlHead = null;
            musUserProfileFragment.requestedBtn = null;
            musUserProfileFragment.adBottomMoreBtn = null;
            musUserProfileFragment.mLiveStatusView = null;
            musUserProfileFragment.txtAdBottomDes = null;
            musUserProfileFragment.recommededUsersIv = null;
            musUserProfileFragment.mRecommendCommonUserView = null;
            musUserProfileFragment.viewUserInfo = null;
            musUserProfileFragment.mTitleBar = null;
            this.f94884b.setOnClickListener(null);
            this.f94884b = null;
            this.f94885c.setOnClickListener(null);
            this.f94885c = null;
            this.f94886d.setOnClickListener(null);
            this.f94886d = null;
            this.f94887e.setOnClickListener(null);
            this.f94887e = null;
            this.f94888f.setOnClickListener(null);
            this.f94888f = null;
            this.f94889g.setOnClickListener(null);
            this.f94889g = null;
            this.f94890h.setOnClickListener(null);
            this.f94890h = null;
            this.f94891i.setOnClickListener(null);
            this.f94891i = null;
            this.f94892j.setOnClickListener(null);
            this.f94892j = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MusUserProfileFragment_ViewBinding(final MusUserProfileFragment musUserProfileFragment, View view) {
        super(musUserProfileFragment, view);
        this.f94883a = musUserProfileFragment;
        View findRequiredView = Utils.findRequiredView(view, R.id.anq, "field 'followIv' and method 'onImClick'");
        musUserProfileFragment.followIv = findRequiredView;
        this.f94884b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                musUserProfileFragment.onImClick(view);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, R.id.d38, "field 'sendMsgBtn' and method 'onImClick'");
        musUserProfileFragment.sendMsgBtn = (Button) Utils.castView(findRequiredView2, R.id.d38, "field 'sendMsgBtn'", Button.class);
        this.f94885c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                musUserProfileFragment.onImClick(view);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, R.id.ck9, "field 'followBn' and method 'follow'");
        musUserProfileFragment.followBn = (TextView) Utils.castView(findRequiredView3, R.id.ck9, "field 'followBn'", TextView.class);
        this.f94886d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                musUserProfileFragment.mo92090i(view);
            }
        });
        musUserProfileFragment.mFastFollowBtn = view.findViewById(R.id.aiu);
        musUserProfileFragment.mFastSendMsgBtn = view.findViewById(R.id.aix);
        musUserProfileFragment.mFastLeftFollow = view.findViewById(R.id.aiv);
        musUserProfileFragment.mFastLeftMsg = view.findViewById(R.id.aiw);
        musUserProfileFragment.mIvMutual = view.findViewById(R.id.bak);
        musUserProfileFragment.mTvFollow = (TextView) Utils.findOptionalViewAsType(view, R.id.duo, "field 'mTvFollow'", TextView.class);
        musUserProfileFragment.mFlHead = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.amb, "field 'mFlHead'", FrameLayout.class);
        View findRequiredView4 = Utils.findRequiredView(view, R.id.cs8, "field 'requestedBtn' and method 'onImClick'");
        musUserProfileFragment.requestedBtn = (TextView) Utils.castView(findRequiredView4, R.id.cs8, "field 'requestedBtn'", TextView.class);
        this.f94887e = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                musUserProfileFragment.onImClick(view);
            }
        });
        musUserProfileFragment.adBottomMoreBtn = (TextView) Utils.findRequiredViewAsType(view, R.id.bf, "field 'adBottomMoreBtn'", TextView.class);
        musUserProfileFragment.mLiveStatusView = (AnimationImageView) Utils.findRequiredViewAsType(view, R.id.ew, "field 'mLiveStatusView'", AnimationImageView.class);
        musUserProfileFragment.txtAdBottomDes = (TextView) Utils.findRequiredViewAsType(view, R.id.e6d, "field 'txtAdBottomDes'", TextView.class);
        View findRequiredView5 = Utils.findRequiredView(view, R.id.cpf, "field 'recommededUsersIv' and method 'recommendUsersClick'");
        musUserProfileFragment.recommededUsersIv = (ImageView) Utils.castView(findRequiredView5, R.id.cpf, "field 'recommededUsersIv'", ImageView.class);
        this.f94888f = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                musUserProfileFragment.recommendUsersClick(view);
            }
        });
        musUserProfileFragment.mRecommendCommonUserView = (RecommendCommonUserViewMus) Utils.findRequiredViewAsType(view, R.id.cp1, "field 'mRecommendCommonUserView'", RecommendCommonUserViewMus.class);
        musUserProfileFragment.viewUserInfo = Utils.findRequiredView(view, R.id.e9b, "field 'viewUserInfo'");
        musUserProfileFragment.mTitleBar = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.djz, "field 'mTitleBar'", RelativeLayout.class);
        View findRequiredView6 = Utils.findRequiredView(view, R.id.jo, "method 'onBack'");
        this.f94889g = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                musUserProfileFragment.onBack(view);
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, R.id.ck_, "method 'onReport'");
        this.f94890h = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                musUserProfileFragment.onReport(view);
            }
        });
        View findRequiredView8 = Utils.findRequiredView(view, R.id.bc, "method 'onAdBottomClick'");
        this.f94891i = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                musUserProfileFragment.onAdBottomClick(view);
            }
        });
        View findRequiredView9 = Utils.findRequiredView(view, R.id.be, "method 'onAdBottomClick'");
        this.f94892j = findRequiredView9;
        findRequiredView9.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                musUserProfileFragment.onAdBottomClick(view);
            }
        });
    }
}
