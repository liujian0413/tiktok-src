package com.p280ss.android.ugc.aweme.account.login.forgetpsw.p961ui;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.p280ss.android.ugc.aweme.account.login.p974ui.LoginButton;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.forgetpsw.ui.FindPswByEmailActivity_ViewBinding */
public class FindPswByEmailActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private FindPswByEmailActivity f57389a;

    /* renamed from: b */
    private View f57390b;

    /* renamed from: c */
    private TextWatcher f57391c;

    /* renamed from: d */
    private View f57392d;

    /* renamed from: e */
    private View f57393e;

    /* renamed from: f */
    private View f57394f;

    public void unbind() {
        FindPswByEmailActivity findPswByEmailActivity = this.f57389a;
        if (findPswByEmailActivity != null) {
            this.f57389a = null;
            findPswByEmailActivity.mRoot = null;
            findPswByEmailActivity.mEtEmail = null;
            findPswByEmailActivity.mClearEmail = null;
            findPswByEmailActivity.mTvHelperCenter = null;
            findPswByEmailActivity.mBtnNext = null;
            findPswByEmailActivity.mWrongEmailContainer = null;
            findPswByEmailActivity.mWrongEmailText = null;
            findPswByEmailActivity.mEtEmailUnderline = null;
            ((TextView) this.f57390b).removeTextChangedListener(this.f57391c);
            this.f57391c = null;
            this.f57390b = null;
            this.f57392d.setOnClickListener(null);
            this.f57392d = null;
            this.f57393e.setOnClickListener(null);
            this.f57393e = null;
            this.f57394f.setOnClickListener(null);
            this.f57394f = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public FindPswByEmailActivity_ViewBinding(final FindPswByEmailActivity findPswByEmailActivity, View view) {
        this.f57389a = findPswByEmailActivity;
        findPswByEmailActivity.mRoot = Utils.findRequiredView(view, R.id.cwi, "field 'mRoot'");
        View findRequiredView = Utils.findRequiredView(view, R.id.ag0, "field 'mEtEmail' and method 'afterPswInput'");
        findPswByEmailActivity.mEtEmail = (EditText) Utils.castView(findRequiredView, R.id.ag0, "field 'mEtEmail'", EditText.class);
        this.f57390b = findRequiredView;
        this.f57391c = new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                findPswByEmailActivity.afterPswInput(editable);
            }
        };
        ((TextView) findRequiredView).addTextChangedListener(this.f57391c);
        View findRequiredView2 = Utils.findRequiredView(view, R.id.wo, "field 'mClearEmail' and method 'onClearEmailClick'");
        findPswByEmailActivity.mClearEmail = (ImageView) Utils.castView(findRequiredView2, R.id.wo, "field 'mClearEmail'", ImageView.class);
        this.f57392d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                findPswByEmailActivity.onClearEmailClick();
            }
        });
        findPswByEmailActivity.mTvHelperCenter = (TextView) Utils.findRequiredViewAsType(view, R.id.dvk, "field 'mTvHelperCenter'", TextView.class);
        View findRequiredView3 = Utils.findRequiredView(view, R.id.pz, "field 'mBtnNext' and method 'onNextClick'");
        findPswByEmailActivity.mBtnNext = (LoginButton) Utils.castView(findRequiredView3, R.id.pz, "field 'mBtnNext'", LoginButton.class);
        this.f57393e = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                findPswByEmailActivity.onNextClick();
            }
        });
        findPswByEmailActivity.mWrongEmailContainer = Utils.findRequiredView(view, R.id.ehl, "field 'mWrongEmailContainer'");
        findPswByEmailActivity.mWrongEmailText = (TextView) Utils.findRequiredViewAsType(view, R.id.ehk, "field 'mWrongEmailText'", TextView.class);
        findPswByEmailActivity.mEtEmailUnderline = Utils.findRequiredView(view, R.id.ag1, "field 'mEtEmailUnderline'");
        View findRequiredView4 = Utils.findRequiredView(view, R.id.b6a, "method 'onBackClick'");
        this.f57394f = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                findPswByEmailActivity.onBackClick();
            }
        });
        findPswByEmailActivity.mHelpCenterRegular = view.getContext().getResources().getString(R.string.ccy);
    }
}
