package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.MultilineInputFragment_ViewBinding */
public class MultilineInputFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MultilineInputFragment f94698a;

    /* renamed from: b */
    private View f94699b;

    /* renamed from: c */
    private View f94700c;

    /* renamed from: d */
    private View f94701d;

    /* renamed from: e */
    private View f94702e;

    public void unbind() {
        MultilineInputFragment multilineInputFragment = this.f94698a;
        if (multilineInputFragment != null) {
            this.f94698a = null;
            multilineInputFragment.mTitleBar = null;
            multilineInputFragment.mInput = null;
            multilineInputFragment.mClearAllBtn = null;
            multilineInputFragment.mLengthHint = null;
            multilineInputFragment.mPopRemarkname = null;
            multilineInputFragment.mTvContactname = null;
            multilineInputFragment.mTvSetting = null;
            this.f94699b.setOnClickListener(null);
            this.f94699b = null;
            this.f94700c.setOnClickListener(null);
            this.f94700c = null;
            this.f94701d.setOnClickListener(null);
            this.f94701d = null;
            this.f94702e.setOnClickListener(null);
            this.f94702e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MultilineInputFragment_ViewBinding(final MultilineInputFragment multilineInputFragment, View view) {
        this.f94698a = multilineInputFragment;
        multilineInputFragment.mTitleBar = (ButtonTitleBar) Utils.findRequiredViewAsType(view, R.id.djz, "field 'mTitleBar'", ButtonTitleBar.class);
        multilineInputFragment.mInput = (EditText) Utils.findRequiredViewAsType(view, R.id.b19, "field 'mInput'", EditText.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.b7d, "field 'mClearAllBtn' and method 'onClick'");
        multilineInputFragment.mClearAllBtn = (ImageView) Utils.castView(findRequiredView, R.id.b7d, "field 'mClearAllBtn'", ImageView.class);
        this.f94699b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                multilineInputFragment.onClick(view);
            }
        });
        multilineInputFragment.mLengthHint = (TextView) Utils.findRequiredViewAsType(view, R.id.dwr, "field 'mLengthHint'", TextView.class);
        multilineInputFragment.mPopRemarkname = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.ci1, "field 'mPopRemarkname'", RelativeLayout.class);
        multilineInputFragment.mTvContactname = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.dse, "field 'mTvContactname'", DmtTextView.class);
        View findRequiredView2 = Utils.findRequiredView(view, R.id.e1r, "field 'mTvSetting' and method 'onClick'");
        multilineInputFragment.mTvSetting = (DmtTextView) Utils.castView(findRequiredView2, R.id.e1r, "field 'mTvSetting'", DmtTextView.class);
        this.f94700c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                multilineInputFragment.onClick(view);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, R.id.jo, "method 'onClick'");
        this.f94701d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                multilineInputFragment.onClick(view);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, R.id.ct5, "method 'onClick'");
        this.f94702e = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                multilineInputFragment.onClick(view);
            }
        });
    }
}
