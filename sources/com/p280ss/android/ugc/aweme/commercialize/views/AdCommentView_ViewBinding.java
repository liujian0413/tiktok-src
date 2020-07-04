package com.p280ss.android.ugc.aweme.commercialize.views;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.p308ui.CircleImageView;
import com.p280ss.android.ugc.aweme.views.MentionTextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdCommentView_ViewBinding */
public class AdCommentView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private AdCommentView f66827a;

    /* renamed from: b */
    private View f66828b;

    /* renamed from: c */
    private View f66829c;

    /* renamed from: d */
    private View f66830d;

    /* renamed from: e */
    private View f66831e;

    /* renamed from: f */
    private View f66832f;

    /* renamed from: g */
    private View f66833g;

    /* renamed from: h */
    private View f66834h;

    /* renamed from: i */
    private View f66835i;

    public void unbind() {
        AdCommentView adCommentView = this.f66827a;
        if (adCommentView != null) {
            this.f66827a = null;
            adCommentView.mAvatarView = null;
            adCommentView.mTitleView = null;
            adCommentView.mContentView = null;
            adCommentView.mCommentContainer = null;
            adCommentView.mReplyContainer = null;
            adCommentView.mReplyTitleView = null;
            adCommentView.mReplyContentView = null;
            adCommentView.mMenuItem = null;
            adCommentView.mReplyDivider = null;
            adCommentView.mCommentTimeView = null;
            adCommentView.mDiggView = null;
            adCommentView.mCommentStyleView = null;
            adCommentView.mDiggLayout = null;
            adCommentView.mReplyCommentStyleView = null;
            adCommentView.contentll = null;
            this.f66828b.setOnClickListener(null);
            this.f66828b = null;
            this.f66829c.setOnClickListener(null);
            this.f66829c = null;
            this.f66830d.setOnClickListener(null);
            this.f66830d = null;
            this.f66831e.setOnClickListener(null);
            this.f66831e = null;
            this.f66832f.setOnClickListener(null);
            this.f66832f = null;
            this.f66833g.setOnClickListener(null);
            this.f66833g = null;
            this.f66834h.setOnClickListener(null);
            this.f66834h = null;
            this.f66835i.setOnClickListener(null);
            this.f66835i = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public AdCommentView_ViewBinding(final AdCommentView adCommentView, View view) {
        this.f66827a = adCommentView;
        View findRequiredView = Utils.findRequiredView(view, R.id.ic, "field 'mAvatarView' and method 'onClick'");
        adCommentView.mAvatarView = (CircleImageView) Utils.castView(findRequiredView, R.id.ic, "field 'mAvatarView'", CircleImageView.class);
        this.f66828b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                adCommentView.onClick(view);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, R.id.title, "field 'mTitleView' and method 'onClick'");
        adCommentView.mTitleView = (DmtTextView) Utils.castView(findRequiredView2, R.id.title, "field 'mTitleView'", DmtTextView.class);
        this.f66829c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                adCommentView.onClick(view);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, R.id.a1q, "field 'mContentView' and method 'onClick'");
        adCommentView.mContentView = (MentionTextView) Utils.castView(findRequiredView3, R.id.a1q, "field 'mContentView'", MentionTextView.class);
        this.f66830d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                adCommentView.onClick(view);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, R.id.z5, "field 'mCommentContainer' and method 'onClick'");
        adCommentView.mCommentContainer = findRequiredView4;
        this.f66831e = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                adCommentView.onClick(view);
            }
        });
        adCommentView.mReplyContainer = Utils.findRequiredView(view, R.id.crv, "field 'mReplyContainer'");
        adCommentView.mReplyTitleView = (TextView) Utils.findRequiredViewAsType(view, R.id.cry, "field 'mReplyTitleView'", TextView.class);
        adCommentView.mReplyContentView = (MentionTextView) Utils.findRequiredViewAsType(view, R.id.crw, "field 'mReplyContentView'", MentionTextView.class);
        adCommentView.mMenuItem = (ImageView) Utils.findOptionalViewAsType(view, R.id.ahb, "field 'mMenuItem'", ImageView.class);
        adCommentView.mReplyDivider = Utils.findRequiredView(view, R.id.crx, "field 'mReplyDivider'");
        adCommentView.mCommentTimeView = (TextView) Utils.findRequiredViewAsType(view, R.id.zu, "field 'mCommentTimeView'", TextView.class);
        adCommentView.mDiggView = (ImageView) Utils.findRequiredViewAsType(view, R.id.b8j, "field 'mDiggView'", ImageView.class);
        View findRequiredView5 = Utils.findRequiredView(view, R.id.zt, "field 'mCommentStyleView' and method 'onClick'");
        adCommentView.mCommentStyleView = (TextView) Utils.castView(findRequiredView5, R.id.zt, "field 'mCommentStyleView'", TextView.class);
        this.f66832f = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                adCommentView.onClick(view);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, R.id.bh7, "field 'mDiggLayout' and method 'onClick'");
        adCommentView.mDiggLayout = (RelativeLayout) Utils.castView(findRequiredView6, R.id.bh7, "field 'mDiggLayout'", RelativeLayout.class);
        this.f66833g = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                adCommentView.onClick(view);
            }
        });
        adCommentView.mReplyCommentStyleView = (TextView) Utils.findRequiredViewAsType(view, R.id.cru, "field 'mReplyCommentStyleView'", TextView.class);
        View findRequiredView7 = Utils.findRequiredView(view, R.id.a29, "field 'contentll' and method 'onClick'");
        adCommentView.contentll = (LinearLayout) Utils.castView(findRequiredView7, R.id.a29, "field 'contentll'", LinearLayout.class);
        this.f66834h = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                adCommentView.onClick(view);
            }
        });
        View findRequiredView8 = Utils.findRequiredView(view, R.id.zg, "method 'onClick'");
        this.f66835i = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                adCommentView.onClick(view);
            }
        });
        adCommentView.size = view.getContext().getResources().getDimensionPixelSize(R.dimen.dn);
    }
}
