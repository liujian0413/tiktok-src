package com.p280ss.android.ugc.aweme.account.login.fragment;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.p280ss.android.ugc.aweme.account.login.p974ui.LoginButton;
import com.p280ss.android.ugc.aweme.account.login.p974ui.MusCountDownView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.BaseMusSecureSendCodeFragment_ViewBinding */
public class BaseMusSecureSendCodeFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private BaseMusSecureSendCodeFragment f57518a;

    /* renamed from: b */
    private View f57519b;

    /* renamed from: c */
    private View f57520c;

    public void unbind() {
        BaseMusSecureSendCodeFragment baseMusSecureSendCodeFragment = this.f57518a;
        if (baseMusSecureSendCodeFragment != null) {
            this.f57518a = null;
            baseMusSecureSendCodeFragment.mTvPhoneNumber = null;
            baseMusSecureSendCodeFragment.mTvHint = null;
            baseMusSecureSendCodeFragment.mEdCode = null;
            baseMusSecureSendCodeFragment.mBtnLogin = null;
            baseMusSecureSendCodeFragment.mTvWrongCode = null;
            baseMusSecureSendCodeFragment.mCountDownView = null;
            baseMusSecureSendCodeFragment.mGetVoiceCode = null;
            baseMusSecureSendCodeFragment.mEdCodeUnderline = null;
            baseMusSecureSendCodeFragment.mBtnLoginPhonePassword = null;
            baseMusSecureSendCodeFragment.mWrongCodeContainer = null;
            baseMusSecureSendCodeFragment.tipTitle = null;
            baseMusSecureSendCodeFragment.loginViewText = null;
            this.f57519b.setOnClickListener(null);
            this.f57519b = null;
            this.f57520c.setOnClickListener(null);
            this.f57520c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public BaseMusSecureSendCodeFragment_ViewBinding(final BaseMusSecureSendCodeFragment baseMusSecureSendCodeFragment, View view) {
        this.f57518a = baseMusSecureSendCodeFragment;
        baseMusSecureSendCodeFragment.mTvPhoneNumber = (TextView) Utils.findRequiredViewAsType(view, R.id.cb4, "field 'mTvPhoneNumber'", TextView.class);
        baseMusSecureSendCodeFragment.mTvHint = (TextView) Utils.findRequiredViewAsType(view, R.id.dvl, "field 'mTvHint'", TextView.class);
        baseMusSecureSendCodeFragment.mEdCode = (EditText) Utils.findRequiredViewAsType(view, R.id.agc, "field 'mEdCode'", EditText.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.qm, "field 'mBtnLogin' and method 'onClick'");
        baseMusSecureSendCodeFragment.mBtnLogin = (LoginButton) Utils.castView(findRequiredView, R.id.qm, "field 'mBtnLogin'", LoginButton.class);
        this.f57519b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                baseMusSecureSendCodeFragment.onClick(view);
            }
        });
        baseMusSecureSendCodeFragment.mTvWrongCode = (TextView) Utils.findRequiredViewAsType(view, R.id.ehi, "field 'mTvWrongCode'", TextView.class);
        baseMusSecureSendCodeFragment.mCountDownView = (MusCountDownView) Utils.findRequiredViewAsType(view, R.id.c0t, "field 'mCountDownView'", MusCountDownView.class);
        View findRequiredView2 = Utils.findRequiredView(view, R.id.aqc, "field 'mGetVoiceCode' and method 'onClick'");
        baseMusSecureSendCodeFragment.mGetVoiceCode = (TextView) Utils.castView(findRequiredView2, R.id.aqc, "field 'mGetVoiceCode'", TextView.class);
        this.f57520c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                baseMusSecureSendCodeFragment.onClick(view);
            }
        });
        baseMusSecureSendCodeFragment.mEdCodeUnderline = Utils.findRequiredView(view, R.id.afz, "field 'mEdCodeUnderline'");
        baseMusSecureSendCodeFragment.mBtnLoginPhonePassword = Utils.findRequiredView(view, R.id.qt, "field 'mBtnLoginPhonePassword'");
        baseMusSecureSendCodeFragment.mWrongCodeContainer = Utils.findRequiredView(view, R.id.ehj, "field 'mWrongCodeContainer'");
        baseMusSecureSendCodeFragment.tipTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.djl, "field 'tipTitle'", TextView.class);
        baseMusSecureSendCodeFragment.loginViewText = Utils.findRequiredView(view, R.id.qu, "field 'loginViewText'");
    }
}
