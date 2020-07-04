package com.p280ss.android.ugc.aweme.account.fragment;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.BindView;
import com.bytedance.ies.dmt.p262ui.titlebar.TextTitleBar;
import com.p280ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil;
import com.p280ss.android.ugc.aweme.account.p982ui.VerificationCodeFragment;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.account.fragment.VerificationCodeFragmentV2 */
public class VerificationCodeFragmentV2 extends VerificationCodeFragment {
    @BindView(2131493535)
    TextTitleBar mTextTitleBar;

    /* renamed from: d */
    public final void mo57106d() {
        super.mo57106d();
        this.mTextTitleBar.setColorMode(0);
        if (this.f59525s == 5) {
            this.mTitleHint.setText(R.string.sj);
            if (!TextUtils.isEmpty(this.f59526t)) {
                this.mTxtHint.setText(getString(R.string.b76, PhoneNumberUtil.m73059a(this.f59526t)));
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.rv, viewGroup, false);
    }

    /* renamed from: b */
    private static VerificationCodeFragmentV2 m71348b(String str, int i, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putInt("type", i);
        bundle.putString("mobile", str2);
        bundle.putString("enter_from", str);
        VerificationCodeFragmentV2 verificationCodeFragmentV2 = new VerificationCodeFragmentV2();
        verificationCodeFragmentV2.setArguments(bundle);
        return verificationCodeFragmentV2;
    }

    /* renamed from: a */
    public static VerificationCodeFragmentV2 m71347a(int i, String str, String str2, String str3, String str4) {
        return m71348b(str4, i, str, C42914ab.m136242a().mo104633a("password", str2).mo104633a("ticket", str3).f111445a);
    }
}
