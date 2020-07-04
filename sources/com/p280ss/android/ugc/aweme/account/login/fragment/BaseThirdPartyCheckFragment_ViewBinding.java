package com.p280ss.android.ugc.aweme.account.login.fragment;

import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.widget.DmtButton;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.BaseThirdPartyCheckFragment_ViewBinding */
public class BaseThirdPartyCheckFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private BaseThirdPartyCheckFragment f57531a;

    /* renamed from: b */
    private View f57532b;

    /* renamed from: c */
    private View f57533c;

    public void unbind() {
        BaseThirdPartyCheckFragment baseThirdPartyCheckFragment = this.f57531a;
        if (baseThirdPartyCheckFragment != null) {
            this.f57531a = null;
            baseThirdPartyCheckFragment.mIvback = null;
            baseThirdPartyCheckFragment.mTvBindDetail = null;
            baseThirdPartyCheckFragment.mIvPlatForm = null;
            baseThirdPartyCheckFragment.mCountDownFive = null;
            baseThirdPartyCheckFragment.mBtnConfirm = null;
            this.f57532b.setOnClickListener(null);
            this.f57532b = null;
            this.f57533c.setOnClickListener(null);
            this.f57533c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public BaseThirdPartyCheckFragment_ViewBinding(final BaseThirdPartyCheckFragment baseThirdPartyCheckFragment, View view) {
        this.f57531a = baseThirdPartyCheckFragment;
        View findRequiredView = Utils.findRequiredView(view, R.id.b6a, "field 'mIvback' and method 'onClick'");
        baseThirdPartyCheckFragment.mIvback = (ImageView) Utils.castView(findRequiredView, R.id.b6a, "field 'mIvback'", ImageView.class);
        this.f57532b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                baseThirdPartyCheckFragment.onClick(view);
            }
        });
        baseThirdPartyCheckFragment.mTvBindDetail = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.e39, "field 'mTvBindDetail'", DmtTextView.class);
        baseThirdPartyCheckFragment.mIvPlatForm = (ImageView) Utils.findRequiredViewAsType(view, R.id.bb3, "field 'mIvPlatForm'", ImageView.class);
        baseThirdPartyCheckFragment.mCountDownFive = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.dsx, "field 'mCountDownFive'", DmtTextView.class);
        View findRequiredView2 = Utils.findRequiredView(view, R.id.py, "field 'mBtnConfirm' and method 'onClick'");
        baseThirdPartyCheckFragment.mBtnConfirm = (DmtButton) Utils.castView(findRequiredView2, R.id.py, "field 'mBtnConfirm'", DmtButton.class);
        this.f57533c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                baseThirdPartyCheckFragment.onClick(view);
            }
        });
    }
}
