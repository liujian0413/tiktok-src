package com.p280ss.android.ugc.aweme.shortvideo.subtitle;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtPanelRecyleView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule_ViewBinding */
public class SubtitleModule_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SubtitleModule f106941a;

    public void unbind() {
        SubtitleModule subtitleModule = this.f106941a;
        if (subtitleModule != null) {
            this.f106941a = null;
            subtitleModule.mEffectTitleLayout = null;
            subtitleModule.mContentLayout = null;
            subtitleModule.mCancelView = null;
            subtitleModule.mSaveView = null;
            subtitleModule.mLoadingArea = null;
            subtitleModule.mLoadingStatusView = null;
            subtitleModule.mSubtitleLayout = null;
            subtitleModule.mRecyclerView = null;
            subtitleModule.mHighLightArea = null;
            subtitleModule.mIvFont = null;
            subtitleModule.mIvDelete = null;
            subtitleModule.mLoadingProgress = null;
            subtitleModule.mLoadingHint = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public SubtitleModule_ViewBinding(SubtitleModule subtitleModule, View view) {
        this.f106941a = subtitleModule;
        subtitleModule.mEffectTitleLayout = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.acz, "field 'mEffectTitleLayout'", RelativeLayout.class);
        subtitleModule.mContentLayout = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.a2j, "field 'mContentLayout'", FrameLayout.class);
        subtitleModule.mCancelView = (TextView) Utils.findRequiredViewAsType(view, R.id.dr5, "field 'mCancelView'", TextView.class);
        subtitleModule.mSaveView = (TextView) Utils.findRequiredViewAsType(view, R.id.e15, "field 'mSaveView'", TextView.class);
        subtitleModule.mLoadingArea = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.btf, "field 'mLoadingArea'", LinearLayout.class);
        subtitleModule.mLoadingStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.bu0, "field 'mLoadingStatusView'", DmtStatusView.class);
        subtitleModule.mSubtitleLayout = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.ddc, "field 'mSubtitleLayout'", LinearLayout.class);
        subtitleModule.mRecyclerView = (AVDmtPanelRecyleView) Utils.findRequiredViewAsType(view, R.id.cqp, "field 'mRecyclerView'", AVDmtPanelRecyleView.class);
        subtitleModule.mHighLightArea = Utils.findRequiredView(view, R.id.avg, "field 'mHighLightArea'");
        subtitleModule.mIvFont = (ImageView) Utils.findRequiredViewAsType(view, R.id.axv, "field 'mIvFont'", ImageView.class);
        subtitleModule.mIvDelete = (ImageView) Utils.findRequiredViewAsType(view, R.id.axu, "field 'mIvDelete'", ImageView.class);
        subtitleModule.mLoadingProgress = (TextView) Utils.findRequiredViewAsType(view, R.id.bty, "field 'mLoadingProgress'", TextView.class);
        subtitleModule.mLoadingHint = (TextView) Utils.findRequiredViewAsType(view, R.id.btt, "field 'mLoadingHint'", TextView.class);
    }
}
