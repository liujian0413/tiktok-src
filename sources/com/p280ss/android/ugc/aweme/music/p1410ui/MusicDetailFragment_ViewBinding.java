package com.p280ss.android.ugc.aweme.music.p1410ui;

import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.music.ui.MusicDetailFragment_ViewBinding */
public class MusicDetailFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MusicDetailFragment f88328a;

    /* renamed from: b */
    private View f88329b;

    /* renamed from: c */
    private View f88330c;

    /* renamed from: d */
    private View f88331d;

    /* renamed from: e */
    private View f88332e;

    /* renamed from: f */
    private View f88333f;

    /* renamed from: g */
    private View f88334g;

    /* renamed from: h */
    private View f88335h;

    /* renamed from: i */
    private View f88336i;

    public void unbind() {
        MusicDetailFragment musicDetailFragment = this.f88328a;
        if (musicDetailFragment != null) {
            this.f88328a = null;
            musicDetailFragment.mMusicName = null;
            musicDetailFragment.mNickName = null;
            musicDetailFragment.mPlaceHolder = null;
            musicDetailFragment.mMusicCover = null;
            musicDetailFragment.mTitleLayout = null;
            musicDetailFragment.mHeadLayout = null;
            musicDetailFragment.mMusicUsedCount = null;
            musicDetailFragment.mBgCover = null;
            musicDetailFragment.ivMusicCollect = null;
            musicDetailFragment.mMusicCollectLayout = null;
            musicDetailFragment.mMusicCollectionText = null;
            musicDetailFragment.mMusicianEntry = null;
            musicDetailFragment.ivPlay = null;
            musicDetailFragment.ivStop = null;
            musicDetailFragment.recyclerTag = null;
            musicDetailFragment.tagMask = null;
            musicDetailFragment.tagLayout = null;
            musicDetailFragment.txtElse = null;
            musicDetailFragment.ivMusicianMark = null;
            musicDetailFragment.btnEditMusicTitle = null;
            musicDetailFragment.mMusicTitle = null;
            musicDetailFragment.mStatusView = null;
            musicDetailFragment.ivShareBtn = null;
            musicDetailFragment.mVsOriginalMusic = null;
            musicDetailFragment.mVsMusicOwner = null;
            musicDetailFragment.mVsThirdMusic = null;
            musicDetailFragment.mVsThirdMusicNewStyle = null;
            musicDetailFragment.mVsSimilarMusic = null;
            musicDetailFragment.mFlStartRecord = null;
            this.f88329b.setOnClickListener(null);
            this.f88329b = null;
            this.f88330c.setOnClickListener(null);
            this.f88330c = null;
            this.f88331d.setOnClickListener(null);
            this.f88331d = null;
            this.f88332e.setOnClickListener(null);
            this.f88332e = null;
            this.f88333f.setOnClickListener(null);
            this.f88333f = null;
            this.f88334g.setOnClickListener(null);
            this.f88334g = null;
            this.f88335h.setOnClickListener(null);
            this.f88335h = null;
            this.f88336i.setOnClickListener(null);
            this.f88336i = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MusicDetailFragment_ViewBinding(final MusicDetailFragment musicDetailFragment, View view) {
        this.f88328a = musicDetailFragment;
        View findRequiredView = Utils.findRequiredView(view, R.id.c1j, "field 'mMusicName' and method 'click'");
        musicDetailFragment.mMusicName = (ViewGroup) Utils.castView(findRequiredView, R.id.c1j, "field 'mMusicName'", ViewGroup.class);
        this.f88329b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                musicDetailFragment.click(view);
            }
        });
        musicDetailFragment.mNickName = (TextView) Utils.findRequiredViewAsType(view, R.id.dyk, "field 'mNickName'", TextView.class);
        musicDetailFragment.mPlaceHolder = (TextView) Utils.findRequiredViewAsType(view, R.id.dzm, "field 'mPlaceHolder'", TextView.class);
        View findRequiredView2 = Utils.findRequiredView(view, R.id.c1_, "field 'mMusicCover' and method 'click'");
        musicDetailFragment.mMusicCover = (SmartImageView) Utils.castView(findRequiredView2, R.id.c1_, "field 'mMusicCover'", SmartImageView.class);
        this.f88330c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                musicDetailFragment.click(view);
            }
        });
        musicDetailFragment.mTitleLayout = Utils.findRequiredView(view, R.id.dke, "field 'mTitleLayout'");
        musicDetailFragment.mHeadLayout = Utils.findRequiredView(view, R.id.aue, "field 'mHeadLayout'");
        musicDetailFragment.mMusicUsedCount = (TextView) Utils.findRequiredViewAsType(view, R.id.e8g, "field 'mMusicUsedCount'", TextView.class);
        musicDetailFragment.mBgCover = (SmartImageView) Utils.findRequiredViewAsType(view, R.id.lo, "field 'mBgCover'", SmartImageView.class);
        musicDetailFragment.ivMusicCollect = (CheckableImageView) Utils.findRequiredViewAsType(view, R.id.c19, "field 'ivMusicCollect'", CheckableImageView.class);
        View findRequiredView3 = Utils.findRequiredView(view, R.id.bs1, "field 'mMusicCollectLayout' and method 'click'");
        musicDetailFragment.mMusicCollectLayout = findRequiredView3;
        this.f88331d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                musicDetailFragment.click(view);
            }
        });
        musicDetailFragment.mMusicCollectionText = (TextView) Utils.findRequiredViewAsType(view, R.id.dy9, "field 'mMusicCollectionText'", TextView.class);
        musicDetailFragment.mMusicianEntry = (ImageView) Utils.findRequiredViewAsType(view, R.id.baj, "field 'mMusicianEntry'", ImageView.class);
        View findRequiredView4 = Utils.findRequiredView(view, R.id.c1t, "field 'ivPlay' and method 'click'");
        musicDetailFragment.ivPlay = (ImageView) Utils.castView(findRequiredView4, R.id.c1t, "field 'ivPlay'", ImageView.class);
        this.f88332e = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                musicDetailFragment.click(view);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, R.id.c1z, "field 'ivStop' and method 'click'");
        musicDetailFragment.ivStop = (ImageView) Utils.castView(findRequiredView5, R.id.c1z, "field 'ivStop'", ImageView.class);
        this.f88333f = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                musicDetailFragment.click(view);
            }
        });
        musicDetailFragment.recyclerTag = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.dg9, "field 'recyclerTag'", RecyclerView.class);
        musicDetailFragment.tagMask = Utils.findRequiredView(view, R.id.dg4, "field 'tagMask'");
        musicDetailFragment.tagLayout = Utils.findRequiredView(view, R.id.a82, "field 'tagLayout'");
        musicDetailFragment.txtElse = (TextView) Utils.findRequiredViewAsType(view, R.id.ad8, "field 'txtElse'", TextView.class);
        musicDetailFragment.ivMusicianMark = (ImageView) Utils.findRequiredViewAsType(view, R.id.c9h, "field 'ivMusicianMark'", ImageView.class);
        musicDetailFragment.btnEditMusicTitle = (Button) Utils.findRequiredViewAsType(view, R.id.aca, "field 'btnEditMusicTitle'", Button.class);
        musicDetailFragment.mMusicTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.c24, "field 'mMusicTitle'", TextView.class);
        musicDetailFragment.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.dav, "field 'mStatusView'", DmtStatusView.class);
        View findRequiredView6 = Utils.findRequiredView(view, R.id.d4t, "field 'ivShareBtn' and method 'click'");
        musicDetailFragment.ivShareBtn = (ImageView) Utils.castView(findRequiredView6, R.id.d4t, "field 'ivShareBtn'", ImageView.class);
        this.f88334g = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                musicDetailFragment.click(view);
            }
        });
        musicDetailFragment.mVsOriginalMusic = (ViewStub) Utils.findRequiredViewAsType(view, R.id.eeu, "field 'mVsOriginalMusic'", ViewStub.class);
        musicDetailFragment.mVsMusicOwner = (ViewStub) Utils.findRequiredViewAsType(view, R.id.eet, "field 'mVsMusicOwner'", ViewStub.class);
        musicDetailFragment.mVsThirdMusic = (ViewStub) Utils.findRequiredViewAsType(view, R.id.ef1, "field 'mVsThirdMusic'", ViewStub.class);
        musicDetailFragment.mVsThirdMusicNewStyle = (ViewStub) Utils.findRequiredViewAsType(view, R.id.ef2, "field 'mVsThirdMusicNewStyle'", ViewStub.class);
        musicDetailFragment.mVsSimilarMusic = (ViewStub) Utils.findRequiredViewAsType(view, R.id.eey, "field 'mVsSimilarMusic'", ViewStub.class);
        View findRequiredView7 = Utils.findRequiredView(view, R.id.da5, "field 'mFlStartRecord' and method 'click'");
        musicDetailFragment.mFlStartRecord = (FrameLayout) Utils.castView(findRequiredView7, R.id.da5, "field 'mFlStartRecord'", FrameLayout.class);
        this.f88335h = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                musicDetailFragment.click(view);
            }
        });
        View findRequiredView8 = Utils.findRequiredView(view, R.id.jo, "method 'click'");
        this.f88336i = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                musicDetailFragment.click(view);
            }
        });
    }
}
