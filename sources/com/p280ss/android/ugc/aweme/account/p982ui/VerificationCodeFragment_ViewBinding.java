package com.p280ss.android.ugc.aweme.account.p982ui;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.account.ui.VerificationCodeFragment_ViewBinding */
public class VerificationCodeFragment_ViewBinding extends BaseAccountFragment_ViewBinding {

    /* renamed from: a */
    private VerificationCodeFragment f59556a;

    /* renamed from: b */
    private View f59557b;

    public void unbind() {
        if (this.f59556a != null) {
            this.f59556a = null;
            this.f59557b.setOnClickListener(null);
            this.f59557b = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public VerificationCodeFragment_ViewBinding(final VerificationCodeFragment verificationCodeFragment, View view) {
        super(verificationCodeFragment, view);
        this.f59556a = verificationCodeFragment;
        View findRequiredView = Utils.findRequiredView(view, R.id.e7b, "method 'reSendCode'");
        this.f59557b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                verificationCodeFragment.reSendCode();
            }
        });
    }
}
