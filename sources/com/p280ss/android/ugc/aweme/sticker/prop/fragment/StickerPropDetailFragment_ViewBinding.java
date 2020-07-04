package com.p280ss.android.ugc.aweme.sticker.prop.fragment;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageWithVerify;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.music.p1410ui.CheckableImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.sticker.prop.fragment.StickerPropDetailFragment_ViewBinding */
public class StickerPropDetailFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private StickerPropDetailFragment f108936a;

    /* renamed from: b */
    private View f108937b;

    /* renamed from: c */
    private View f108938c;

    /* renamed from: d */
    private View f108939d;

    /* renamed from: e */
    private View f108940e;

    /* renamed from: f */
    private View f108941f;

    public void unbind() {
        StickerPropDetailFragment stickerPropDetailFragment = this.f108936a;
        if (stickerPropDetailFragment != null) {
            this.f108936a = null;
            stickerPropDetailFragment.mStartRecodeLayout = null;
            stickerPropDetailFragment.mStartRecordOutRing = null;
            stickerPropDetailFragment.mTextStickerInfo = null;
            stickerPropDetailFragment.mLayoutStickerUrl = null;
            stickerPropDetailFragment.mTextStickerUrl = null;
            stickerPropDetailFragment.mVpExpandContainer = null;
            stickerPropDetailFragment.txtDisclaimer = null;
            stickerPropDetailFragment.ivDisclaimer = null;
            stickerPropDetailFragment.imgToRecord = null;
            stickerPropDetailFragment.lockImageView = null;
            stickerPropDetailFragment.coverImgView = null;
            stickerPropDetailFragment.titleTextView = null;
            stickerPropDetailFragment.nickNameTextView = null;
            stickerPropDetailFragment.usedCountTextView = null;
            stickerPropDetailFragment.mHeadLayout = null;
            stickerPropDetailFragment.mInfoView = null;
            stickerPropDetailFragment.mStatusView = null;
            stickerPropDetailFragment.mBgCover = null;
            stickerPropDetailFragment.mStickerOwnerProfileView = null;
            stickerPropDetailFragment.mVsOriginalMusic = null;
            stickerPropDetailFragment.avarMini = null;
            stickerPropDetailFragment.nickNamePrefix = null;
            stickerPropDetailFragment.ownerCellBottomLine = null;
            stickerPropDetailFragment.mBottomLineView = null;
            stickerPropDetailFragment.mTopLineView = null;
            stickerPropDetailFragment.mArrowImg = null;
            stickerPropDetailFragment.mStickerPropActImgView = null;
            stickerPropDetailFragment.mStickerPropActImgView_i18n = null;
            stickerPropDetailFragment.gridView = null;
            stickerPropDetailFragment.mCollectView = null;
            stickerPropDetailFragment.ivCollect = null;
            stickerPropDetailFragment.tvCollect = null;
            stickerPropDetailFragment.mAdOwnerLL = null;
            stickerPropDetailFragment.mAdNickNameTv = null;
            stickerPropDetailFragment.mLinkIconIv = null;
            stickerPropDetailFragment.mShareBtn = null;
            stickerPropDetailFragment.activityBannerContainer = null;
            stickerPropDetailFragment.activityBannerBg = null;
            stickerPropDetailFragment.detailPageInfo = null;
            this.f108937b.setOnClickListener(null);
            this.f108937b = null;
            this.f108938c.setOnClickListener(null);
            this.f108938c = null;
            this.f108939d.setOnClickListener(null);
            this.f108939d = null;
            this.f108940e.setOnClickListener(null);
            this.f108940e = null;
            this.f108941f.setOnClickListener(null);
            this.f108941f = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public StickerPropDetailFragment_ViewBinding(final StickerPropDetailFragment stickerPropDetailFragment, View view) {
        this.f108936a = stickerPropDetailFragment;
        View findRequiredView = Utils.findRequiredView(view, R.id.da5, "field 'mStartRecodeLayout' and method 'click'");
        stickerPropDetailFragment.mStartRecodeLayout = findRequiredView;
        this.f108937b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                stickerPropDetailFragment.click(view);
            }
        });
        stickerPropDetailFragment.mStartRecordOutRing = Utils.findRequiredView(view, R.id.da8, "field 'mStartRecordOutRing'");
        stickerPropDetailFragment.mTextStickerInfo = (TextView) Utils.findRequiredViewAsType(view, R.id.dht, "field 'mTextStickerInfo'", TextView.class);
        stickerPropDetailFragment.mLayoutStickerUrl = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.bia, "field 'mLayoutStickerUrl'", LinearLayout.class);
        stickerPropDetailFragment.mTextStickerUrl = (TextView) Utils.findRequiredViewAsType(view, R.id.dhu, "field 'mTextStickerUrl'", TextView.class);
        stickerPropDetailFragment.mVpExpandContainer = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.ah5, "field 'mVpExpandContainer'", LinearLayout.class);
        stickerPropDetailFragment.txtDisclaimer = (TextView) Utils.findRequiredViewAsType(view, R.id.ah7, "field 'txtDisclaimer'", TextView.class);
        stickerPropDetailFragment.ivDisclaimer = (ImageView) Utils.findRequiredViewAsType(view, R.id.ah6, "field 'ivDisclaimer'", ImageView.class);
        stickerPropDetailFragment.imgToRecord = (ImageView) Utils.findRequiredViewAsType(view, R.id.b02, "field 'imgToRecord'", ImageView.class);
        stickerPropDetailFragment.lockImageView = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.dba, "field 'lockImageView'", RemoteImageView.class);
        stickerPropDetailFragment.coverImgView = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.db_, "field 'coverImgView'", RemoteImageView.class);
        stickerPropDetailFragment.titleTextView = (TextView) Utils.findRequiredViewAsType(view, R.id.dbb, "field 'titleTextView'", TextView.class);
        stickerPropDetailFragment.nickNameTextView = (TextView) Utils.findRequiredViewAsType(view, R.id.dyk, "field 'nickNameTextView'", TextView.class);
        stickerPropDetailFragment.usedCountTextView = (TextView) Utils.findRequiredViewAsType(view, R.id.e8g, "field 'usedCountTextView'", TextView.class);
        stickerPropDetailFragment.mHeadLayout = Utils.findRequiredView(view, R.id.aue, "field 'mHeadLayout'");
        stickerPropDetailFragment.mInfoView = Utils.findRequiredView(view, R.id.b16, "field 'mInfoView'");
        stickerPropDetailFragment.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.dav, "field 'mStatusView'", DmtStatusView.class);
        stickerPropDetailFragment.mBgCover = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.lo, "field 'mBgCover'", RemoteImageView.class);
        View findRequiredView2 = Utils.findRequiredView(view, R.id.bk1, "field 'mStickerOwnerProfileView' and method 'click'");
        stickerPropDetailFragment.mStickerOwnerProfileView = (ViewGroup) Utils.castView(findRequiredView2, R.id.bk1, "field 'mStickerOwnerProfileView'", ViewGroup.class);
        this.f108938c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                stickerPropDetailFragment.click(view);
            }
        });
        stickerPropDetailFragment.mVsOriginalMusic = (ViewStub) Utils.findRequiredViewAsType(view, R.id.eev, "field 'mVsOriginalMusic'", ViewStub.class);
        stickerPropDetailFragment.avarMini = (AvatarImageWithVerify) Utils.findRequiredViewAsType(view, R.id.j9, "field 'avarMini'", AvatarImageWithVerify.class);
        stickerPropDetailFragment.nickNamePrefix = (TextView) Utils.findRequiredViewAsType(view, R.id.dyl, "field 'nickNamePrefix'", TextView.class);
        stickerPropDetailFragment.ownerCellBottomLine = Utils.findRequiredView(view, R.id.c9r, "field 'ownerCellBottomLine'");
        stickerPropDetailFragment.mBottomLineView = Utils.findRequiredView(view, R.id.nz, "field 'mBottomLineView'");
        stickerPropDetailFragment.mTopLineView = Utils.findRequiredView(view, R.id.dmc, "field 'mTopLineView'");
        stickerPropDetailFragment.mArrowImg = (ImageView) Utils.findRequiredViewAsType(view, R.id.h5, "field 'mArrowImg'", ImageView.class);
        stickerPropDetailFragment.mStickerPropActImgView = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.bcn, "field 'mStickerPropActImgView'", RemoteImageView.class);
        stickerPropDetailFragment.mStickerPropActImgView_i18n = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.bco, "field 'mStickerPropActImgView_i18n'", RemoteImageView.class);
        stickerPropDetailFragment.gridView = (GridView) Utils.findRequiredViewAsType(view, R.id.db0, "field 'gridView'", GridView.class);
        View findRequiredView3 = Utils.findRequiredView(view, R.id.db8, "field 'mCollectView' and method 'click'");
        stickerPropDetailFragment.mCollectView = findRequiredView3;
        this.f108939d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                stickerPropDetailFragment.click(view);
            }
        });
        stickerPropDetailFragment.ivCollect = (CheckableImageView) Utils.findRequiredViewAsType(view, R.id.db9, "field 'ivCollect'", CheckableImageView.class);
        stickerPropDetailFragment.tvCollect = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.e2p, "field 'tvCollect'", DmtTextView.class);
        stickerPropDetailFragment.mAdOwnerLL = Utils.findRequiredView(view, R.id.cs, "field 'mAdOwnerLL'");
        stickerPropDetailFragment.mAdNickNameTv = (TextView) Utils.findRequiredViewAsType(view, R.id.cm, "field 'mAdNickNameTv'", TextView.class);
        stickerPropDetailFragment.mLinkIconIv = (ImageView) Utils.findRequiredViewAsType(view, R.id.bmo, "field 'mLinkIconIv'", ImageView.class);
        View findRequiredView4 = Utils.findRequiredView(view, R.id.d4t, "field 'mShareBtn' and method 'click'");
        stickerPropDetailFragment.mShareBtn = (ImageView) Utils.castView(findRequiredView4, R.id.d4t, "field 'mShareBtn'", ImageView.class);
        this.f108940e = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                stickerPropDetailFragment.click(view);
            }
        });
        stickerPropDetailFragment.activityBannerContainer = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.aq, "field 'activityBannerContainer'", FrameLayout.class);
        stickerPropDetailFragment.activityBannerBg = (SmartImageView) Utils.findRequiredViewAsType(view, R.id.ar, "field 'activityBannerBg'", SmartImageView.class);
        stickerPropDetailFragment.detailPageInfo = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.a80, "field 'detailPageInfo'", DmtTextView.class);
        View findRequiredView5 = Utils.findRequiredView(view, R.id.jo, "method 'click'");
        this.f108941f = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                stickerPropDetailFragment.click(view);
            }
        });
    }
}
