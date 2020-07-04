package com.p280ss.android.ugc.aweme.account.fragment;

import android.view.View;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.titlebar.TextTitleBar;
import com.p280ss.android.ugc.aweme.account.p982ui.VerificationCodeFragment_ViewBinding;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.account.fragment.VerificationCodeFragmentV2_ViewBinding */
public class VerificationCodeFragmentV2_ViewBinding extends VerificationCodeFragment_ViewBinding {

    /* renamed from: a */
    private VerificationCodeFragmentV2 f56950a;

    public void unbind() {
        VerificationCodeFragmentV2 verificationCodeFragmentV2 = this.f56950a;
        if (verificationCodeFragmentV2 != null) {
            this.f56950a = null;
            verificationCodeFragmentV2.mTextTitleBar = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public VerificationCodeFragmentV2_ViewBinding(VerificationCodeFragmentV2 verificationCodeFragmentV2, View view) {
        super(verificationCodeFragmentV2, view);
        this.f56950a = verificationCodeFragmentV2;
        verificationCodeFragmentV2.mTextTitleBar = (TextTitleBar) Utils.findRequiredViewAsType(view, R.id.djz, "field 'mTextTitleBar'", TextTitleBar.class);
    }
}
