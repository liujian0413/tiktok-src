package com.p280ss.android.ugc.aweme.account.p982ui;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.widget.DmtButton;
import com.bytedance.ies.dmt.p262ui.widget.DmtLoadingLayout;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.account.ui.BaseAccountFragment_ViewBinding */
public class BaseAccountFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private BaseAccountFragment f59357a;

    /* renamed from: b */
    private View f59358b;

    /* renamed from: c */
    private View f59359c;

    /* renamed from: d */
    private View f59360d;

    /* renamed from: e */
    private View f59361e;

    public void unbind() {
        BaseAccountFragment baseAccountFragment = this.f59357a;
        if (baseAccountFragment != null) {
            this.f59357a = null;
            baseAccountFragment.mPhoneContainer = null;
            baseAccountFragment.mEditCodeContainer = null;
            baseAccountFragment.mEditText = null;
            baseAccountFragment.backBtn = null;
            baseAccountFragment.mTxtHint = null;
            baseAccountFragment.mTxtTimer = null;
            baseAccountFragment.mBtnLogin = null;
            baseAccountFragment.mRlTitle = null;
            baseAccountFragment.mTitleHint = null;
            baseAccountFragment.mRightText = null;
            baseAccountFragment.mPasswordEt = null;
            baseAccountFragment.mPasswordTip = null;
            baseAccountFragment.mSafeCheckHint = null;
            baseAccountFragment.mBtnPreAccount = null;
            baseAccountFragment.mPhoneDownView = null;
            baseAccountFragment.mCodeDownView = null;
            baseAccountFragment.mPasswordDownView = null;
            baseAccountFragment.mLLContainer = null;
            baseAccountFragment.mLoadingUI = null;
            baseAccountFragment.mDmtStatusView = null;
            baseAccountFragment.mSwitchToEmail = null;
            baseAccountFragment.mSelectCountryDown = null;
            this.f59358b.setOnClickListener(null);
            this.f59358b = null;
            this.f59359c.setOnClickListener(null);
            this.f59359c = null;
            this.f59360d.setOnClickListener(null);
            this.f59360d = null;
            this.f59361e.setOnClickListener(null);
            this.f59361e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public BaseAccountFragment_ViewBinding(final BaseAccountFragment baseAccountFragment, View view) {
        this.f59357a = baseAccountFragment;
        baseAccountFragment.mPhoneContainer = Utils.findRequiredView(view, R.id.br9, "field 'mPhoneContainer'");
        baseAccountFragment.mEditCodeContainer = Utils.findRequiredView(view, R.id.br8, "field 'mEditCodeContainer'");
        baseAccountFragment.mEditText = (EditText) Utils.findRequiredViewAsType(view, R.id.ac4, "field 'mEditText'", EditText.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.jo, "field 'backBtn'");
        baseAccountFragment.backBtn = (ImageView) Utils.castView(findRequiredView, R.id.jo, "field 'backBtn'", ImageView.class);
        this.f59358b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                baseAccountFragment.onClick(view);
            }
        });
        baseAccountFragment.mTxtHint = (TextView) Utils.findRequiredViewAsType(view, R.id.e6z, "field 'mTxtHint'", TextView.class);
        baseAccountFragment.mTxtTimer = (TextView) Utils.findRequiredViewAsType(view, R.id.e7b, "field 'mTxtTimer'", TextView.class);
        View findRequiredView2 = Utils.findRequiredView(view, R.id.qm, "field 'mBtnLogin'");
        baseAccountFragment.mBtnLogin = findRequiredView2;
        this.f59359c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                baseAccountFragment.onClick(view);
            }
        });
        baseAccountFragment.mRlTitle = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.cv7, "field 'mRlTitle'", RelativeLayout.class);
        baseAccountFragment.mTitleHint = (TextView) Utils.findRequiredViewAsType(view, R.id.dkd, "field 'mTitleHint'", TextView.class);
        View findRequiredView3 = Utils.findRequiredView(view, R.id.e77, "field 'mRightText'");
        baseAccountFragment.mRightText = (TextView) Utils.castView(findRequiredView3, R.id.e77, "field 'mRightText'", TextView.class);
        this.f59360d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                baseAccountFragment.onClick(view);
            }
        });
        baseAccountFragment.mPasswordEt = (EditText) Utils.findRequiredViewAsType(view, R.id.abz, "field 'mPasswordEt'", EditText.class);
        baseAccountFragment.mPasswordTip = (TextView) Utils.findRequiredViewAsType(view, R.id.dz7, "field 'mPasswordTip'", TextView.class);
        baseAccountFragment.mSafeCheckHint = (TextView) Utils.findRequiredViewAsType(view, R.id.e14, "field 'mSafeCheckHint'", TextView.class);
        View findRequiredView4 = Utils.findRequiredView(view, R.id.r0, "field 'mBtnPreAccount'");
        baseAccountFragment.mBtnPreAccount = (DmtButton) Utils.castView(findRequiredView4, R.id.r0, "field 'mBtnPreAccount'", DmtButton.class);
        this.f59361e = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                baseAccountFragment.onClick(view);
            }
        });
        baseAccountFragment.mPhoneDownView = Utils.findRequiredView(view, R.id.cb1, "field 'mPhoneDownView'");
        baseAccountFragment.mCodeDownView = Utils.findRequiredView(view, R.id.xu, "field 'mCodeDownView'");
        baseAccountFragment.mPasswordDownView = Utils.findRequiredView(view, R.id.c_l, "field 'mPasswordDownView'");
        baseAccountFragment.mLLContainer = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.bqv, "field 'mLLContainer'", LinearLayout.class);
        baseAccountFragment.mLoadingUI = (DmtLoadingLayout) Utils.findOptionalViewAsType(view, R.id.bu7, "field 'mLoadingUI'", DmtLoadingLayout.class);
        baseAccountFragment.mDmtStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.dav, "field 'mDmtStatusView'", DmtStatusView.class);
        baseAccountFragment.mSwitchToEmail = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.e8i, "field 'mSwitchToEmail'", DmtTextView.class);
        baseAccountFragment.mSelectCountryDown = (ImageView) Utils.findRequiredViewAsType(view, R.id.bc2, "field 'mSelectCountryDown'", ImageView.class);
    }
}
