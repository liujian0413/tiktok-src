package com.p280ss.android.ugc.aweme.account.p982ui;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.sdk.account.p645a.C12728d;
import com.bytedance.sdk.account.p645a.p647b.C12718b;
import com.bytedance.sdk.account.p645a.p649d.C12730b;
import com.bytedance.sdk.account.p660d.C12798d;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.account.util.C22344s;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.account.ui.UpdatePwdCommitPwdFragment */
public class UpdatePwdCommitPwdFragment extends BaseAccountFragment {

    /* renamed from: e */
    private C12728d f59507e;

    public void onDestroyView() {
        super.onDestroyView();
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final int mo58623x() {
        return 2;
    }

    /* renamed from: u */
    public final void mo58620u() {
        super.mo58620u();
        C21671bd.m72522a(8, 2, (Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final boolean mo58622w() {
        if (this.mPasswordEt == null || this.mPasswordEt.getText() == null || this.mPasswordEt.getText().length() < 8) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo57106d() {
        this.f59507e = C12798d.m37186a(getContext());
        this.mTitleHint.setText(R.string.fjy);
        this.mPasswordEt.setTransformationMethod(PasswordTransformationMethod.getInstance());
        this.mPasswordEt.setHint(R.string.fk0);
        this.mTxtHint.setText(R.string.csi);
        this.mBtnLogin.setBackgroundResource(R.drawable.oh);
        this.mTitleHint.setTextSize(26.0f);
        C6907h.m21518a((Context) getActivity(), "set_psd_in", "psd", C21671bd.m72536d(), 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo58621v() {
        if (this.mPasswordEt != null) {
            int length = this.mPasswordEt.getText().toString().trim().length();
            if (length < 8 || length > 20) {
                C10761a.m31399c((Context) getActivity(), (int) R.string.csj).mo25750a();
                return;
            }
            final String trim = this.mPasswordEt.getText().toString().trim();
            this.f59507e.mo31182a(trim, (C12718b) new C12718b() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onSuccess(C12730b bVar) {
                    String str;
                    if (UpdatePwdCommitPwdFragment.this.isViewValid() && UpdatePwdCommitPwdFragment.this.getActivity() != null) {
                        User k = C21671bd.m72543k();
                        if (k != null) {
                            str = k.getBindPhone();
                        } else {
                            str = "";
                        }
                        ((BaseAccountActivity) UpdatePwdCommitPwdFragment.this.getActivity()).mo58616a(VerificationCodeFragment.m73864b(1, str, trim, "", ""));
                    }
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onError(C12730b bVar, int i) {
                    if (UpdatePwdCommitPwdFragment.this.isViewValid() && !TextUtils.isEmpty(bVar.f33703c)) {
                        C22344s.m73953a(UpdatePwdCommitPwdFragment.this.getContext(), bVar.f33703c, bVar.f33702b);
                    }
                }
            });
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }
}
