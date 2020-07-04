package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.widget.FixedRatioFrameLayout;
import com.p280ss.android.ugc.aweme.commercialize.views.StateDmtTextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity_ViewBinding */
public class HeaderDetailActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private HeaderDetailActivity f94669a;

    /* renamed from: b */
    private View f94670b;

    /* renamed from: c */
    private View f94671c;

    /* renamed from: d */
    private View f94672d;

    /* renamed from: e */
    private View f94673e;

    /* renamed from: f */
    private View f94674f;

    public void unbind() {
        HeaderDetailActivity headerDetailActivity = this.f94669a;
        if (headerDetailActivity != null) {
            this.f94669a = null;
            headerDetailActivity.mTitleBar = null;
            headerDetailActivity.mMore = null;
            headerDetailActivity.userAvatar = null;
            headerDetailActivity.fixedRatioFrame = null;
            headerDetailActivity.rootView = null;
            headerDetailActivity.mDownloadView = null;
            headerDetailActivity.progressBar = null;
            headerDetailActivity.progressBarBg = null;
            headerDetailActivity.bgView = null;
            headerDetailActivity.editText = null;
            headerDetailActivity.avatarDecoPanel = null;
            headerDetailActivity.mDecoTextView = null;
            headerDetailActivity.mDecoHintView = null;
            headerDetailActivity.mDecoActivityText = null;
            headerDetailActivity.mDecoActivityContainer = null;
            headerDetailActivity.avatorImage = null;
            headerDetailActivity.mNewYearLayoutContainer = null;
            headerDetailActivity.mNewYearText = null;
            headerDetailActivity.mNewYearDecoratorImage = null;
            this.f94670b.setOnClickListener(null);
            this.f94670b = null;
            this.f94671c.setOnClickListener(null);
            this.f94671c = null;
            this.f94672d.setOnClickListener(null);
            this.f94672d = null;
            this.f94673e.setOnClickListener(null);
            this.f94673e = null;
            this.f94674f.setOnClickListener(null);
            this.f94674f = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public HeaderDetailActivity_ViewBinding(final HeaderDetailActivity headerDetailActivity, View view) {
        this.f94669a = headerDetailActivity;
        headerDetailActivity.mTitleBar = Utils.findRequiredView(view, R.id.djz, "field 'mTitleBar'");
        View findRequiredView = Utils.findRequiredView(view, R.id.baa, "field 'mMore' and method 'onMoreClick'");
        headerDetailActivity.mMore = findRequiredView;
        this.f94670b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                headerDetailActivity.onMoreClick();
            }
        });
        headerDetailActivity.userAvatar = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.e8q, "field 'userAvatar'", RemoteImageView.class);
        headerDetailActivity.fixedRatioFrame = (FixedRatioFrameLayout) Utils.findRequiredViewAsType(view, R.id.ap_, "field 'fixedRatioFrame'", FixedRatioFrameLayout.class);
        headerDetailActivity.rootView = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.cws, "field 'rootView'", ViewGroup.class);
        View findRequiredView2 = Utils.findRequiredView(view, R.id.b8n, "field 'mDownloadView' and method 'saveBitmap'");
        headerDetailActivity.mDownloadView = (ImageView) Utils.castView(findRequiredView2, R.id.b8n, "field 'mDownloadView'", ImageView.class);
        this.f94671c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                headerDetailActivity.saveBitmap();
            }
        });
        headerDetailActivity.progressBar = (ImageView) Utils.findRequiredViewAsType(view, R.id.bba, "field 'progressBar'", ImageView.class);
        headerDetailActivity.progressBarBg = Utils.findRequiredView(view, R.id.bbb, "field 'progressBarBg'");
        headerDetailActivity.bgView = Utils.findRequiredView(view, R.id.lc, "field 'bgView'");
        View findRequiredView3 = Utils.findRequiredView(view, R.id.dts, "field 'editText' and method 'editProfile'");
        headerDetailActivity.editText = (TextView) Utils.castView(findRequiredView3, R.id.dts, "field 'editText'", TextView.class);
        this.f94672d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                headerDetailActivity.editProfile();
            }
        });
        headerDetailActivity.avatarDecoPanel = Utils.findRequiredView(view, R.id.iu, "field 'avatarDecoPanel'");
        View findRequiredView4 = Utils.findRequiredView(view, R.id.iv, "field 'mDecoTextView' and method 'onSetSameClicked'");
        headerDetailActivity.mDecoTextView = (StateDmtTextView) Utils.castView(findRequiredView4, R.id.iv, "field 'mDecoTextView'", StateDmtTextView.class);
        this.f94673e = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                headerDetailActivity.onSetSameClicked();
            }
        });
        headerDetailActivity.mDecoHintView = (TextView) Utils.findRequiredViewAsType(view, R.id.iw, "field 'mDecoHintView'", TextView.class);
        headerDetailActivity.mDecoActivityText = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.iq, "field 'mDecoActivityText'", DmtTextView.class);
        headerDetailActivity.mDecoActivityContainer = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.io, "field 'mDecoActivityContainer'", RelativeLayout.class);
        headerDetailActivity.avatorImage = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.ip, "field 'avatorImage'", RemoteImageView.class);
        headerDetailActivity.mNewYearLayoutContainer = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.ir, "field 'mNewYearLayoutContainer'", RelativeLayout.class);
        headerDetailActivity.mNewYearText = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.is, "field 'mNewYearText'", DmtTextView.class);
        headerDetailActivity.mNewYearDecoratorImage = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.it, "field 'mNewYearDecoratorImage'", RemoteImageView.class);
        View findRequiredView5 = Utils.findRequiredView(view, R.id.b6a, "method 'onBackClick'");
        this.f94674f = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                headerDetailActivity.onBackClick();
            }
        });
    }
}
