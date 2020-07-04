package com.p280ss.android.ugc.aweme.music;

import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.music.p1410ui.CheckableImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.music.OriginMusicViewHolder_ViewBinding */
public class OriginMusicViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private OriginMusicViewHolder f87891a;

    /* renamed from: b */
    private View f87892b;

    /* renamed from: c */
    private View f87893c;

    /* renamed from: d */
    private View f87894d;

    public void unbind() {
        OriginMusicViewHolder originMusicViewHolder = this.f87891a;
        if (originMusicViewHolder != null) {
            this.f87891a = null;
            originMusicViewHolder.mNameView = null;
            originMusicViewHolder.mDurationView = null;
            originMusicViewHolder.mCoverView = null;
            originMusicViewHolder.mOkView = null;
            originMusicViewHolder.mRightView = null;
            originMusicViewHolder.mPlayView = null;
            originMusicViewHolder.mTvConfirm = null;
            originMusicViewHolder.mTopView = null;
            originMusicViewHolder.mIvMusicCollect = null;
            originMusicViewHolder.mProgressBarView = null;
            originMusicViewHolder.musicItemll = null;
            originMusicViewHolder.ivDetail = null;
            originMusicViewHolder.txtUserCount = null;
            originMusicViewHolder.mTagView = null;
            this.f87892b.setOnClickListener(null);
            this.f87892b = null;
            this.f87893c.setOnClickListener(null);
            this.f87893c = null;
            this.f87894d.setOnClickListener(null);
            this.f87894d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public OriginMusicViewHolder_ViewBinding(final OriginMusicViewHolder originMusicViewHolder, View view) {
        this.f87891a = originMusicViewHolder;
        originMusicViewHolder.mNameView = (TextView) Utils.findRequiredViewAsType(view, R.id.dyg, "field 'mNameView'", TextView.class);
        originMusicViewHolder.mDurationView = (TextView) Utils.findRequiredViewAsType(view, R.id.dtp, "field 'mDurationView'", TextView.class);
        originMusicViewHolder.mCoverView = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.czm, "field 'mCoverView'", RemoteImageView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.cuo, "field 'mOkView' and method 'onClick'");
        originMusicViewHolder.mOkView = (RelativeLayout) Utils.castView(findRequiredView, R.id.cuo, "field 'mOkView'", RelativeLayout.class);
        this.f87892b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                originMusicViewHolder.onClick(view);
            }
        });
        originMusicViewHolder.mRightView = (ConstraintLayout) Utils.findRequiredViewAsType(view, R.id.cuu, "field 'mRightView'", ConstraintLayout.class);
        originMusicViewHolder.mPlayView = (ImageView) Utils.findRequiredViewAsType(view, R.id.bch, "field 'mPlayView'", ImageView.class);
        originMusicViewHolder.mTvConfirm = (TextView) Utils.findRequiredViewAsType(view, R.id.e7a, "field 'mTvConfirm'", TextView.class);
        View findRequiredView2 = Utils.findRequiredView(view, R.id.bss, "field 'mTopView' and method 'onClick'");
        originMusicViewHolder.mTopView = (LinearLayout) Utils.castView(findRequiredView2, R.id.bss, "field 'mTopView'", LinearLayout.class);
        this.f87893c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                originMusicViewHolder.onClick(view);
            }
        });
        originMusicViewHolder.mIvMusicCollect = (CheckableImageView) Utils.findRequiredViewAsType(view, R.id.bae, "field 'mIvMusicCollect'", CheckableImageView.class);
        originMusicViewHolder.mProgressBarView = (ProgressBar) Utils.findRequiredViewAsType(view, R.id.ca4, "field 'mProgressBarView'", ProgressBar.class);
        originMusicViewHolder.musicItemll = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.c1g, "field 'musicItemll'", LinearLayout.class);
        View findRequiredView3 = Utils.findRequiredView(view, R.id.c1c, "field 'ivDetail' and method 'onClick'");
        originMusicViewHolder.ivDetail = (ImageView) Utils.castView(findRequiredView3, R.id.c1c, "field 'ivDetail'", ImageView.class);
        this.f87894d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                originMusicViewHolder.onClick(view);
            }
        });
        originMusicViewHolder.txtUserCount = (TextView) Utils.findRequiredViewAsType(view, R.id.e4f, "field 'txtUserCount'", TextView.class);
        originMusicViewHolder.mTagView = (TextView) Utils.findRequiredViewAsType(view, R.id.dfz, "field 'mTagView'", TextView.class);
    }
}
