package com.p280ss.android.ugc.aweme.account.login.p974ui;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.telephony.PhoneNumberUtils;
import com.p280ss.android.mobilelib.present.CommonPresent;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil;
import com.p280ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil.PhoneNumber;
import com.p280ss.android.ugc.aweme.main.p1385g.C33034t;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.BasePhoneNumberFragment */
public abstract class BasePhoneNumberFragment<T extends CommonPresent> extends BaseFragment<T> {

    /* renamed from: l */
    public PhoneNumber f58330l = new PhoneNumber();

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public boolean mo58147k() {
        return PhoneNumberUtil.m73060b(this.f58330l);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo58148l() {
        m72869a(this.f58330l);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final String mo58149m() {
        return this.f58330l.getRawInput();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final String mo58150n() {
        return this.f58330l.getCountryIso();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final int mo58151o() {
        return this.f58330l.getCountryCode();
    }

    public void onResume() {
        super.onResume();
        mo57106d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public String mo58152p() {
        return PhoneNumberUtil.m73058a(this.f58330l);
    }

    /* renamed from: a */
    private PhoneNumber mo57105a() {
        if (getActivity() == null || !(getActivity() instanceof LoginOrRegisterActivity)) {
            return null;
        }
        return ((LoginOrRegisterActivity) getActivity()).f58323o;
    }

    /* renamed from: d */
    private void mo57106d() {
        if (mo57105a() != null) {
            this.f58330l.setCountryCode(mo57105a().getCountryCode());
            this.f58330l.setNationalNumber(mo57105a().getNationalNumber());
            this.f58330l.setRawInput(mo57105a().getRawInput());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final String mo58153q() {
        if (VERSION.SDK_INT >= 21) {
            StringBuilder sb = new StringBuilder("+");
            sb.append(this.f58330l.getCountryCode());
            sb.append(' ');
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f58330l.getNationalNumber());
            sb.append(PhoneNumberUtil.m73059a(sb2.toString()));
            return PhoneNumberUtils.formatNumber(sb.toString(), this.f58330l.getCountryIso());
        }
        StringBuilder sb3 = new StringBuilder("+");
        sb3.append(this.f58330l.getCountryCode());
        sb3.append(' ');
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f58330l.getNationalNumber());
        sb3.append(PhoneNumberUtil.m73059a(sb4.toString()));
        return sb3.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo58143a(int i) {
        this.f58330l.setCountryCode(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo58146b(String str) {
        this.f58330l.setCountryIso(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo58144a(long j) {
        this.f58330l.setNationalNumber(j);
    }

    /* renamed from: a */
    private void m72869a(PhoneNumber phoneNumber) {
        if (phoneNumber != null && mo57105a() != null) {
            mo57105a().setCountryCode(phoneNumber.getCountryCode());
            mo57105a().setNationalNumber(phoneNumber.getNationalNumber());
            mo57105a().setRawInput(phoneNumber.getRawInput());
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        mo57106d();
        if (mo58151o() == 0) {
            mo58143a(PhoneNumberUtil.m73057a((Context) activity).mo58312a(((C33034t) C21671bd.m72521a(C33034t.class)).mo60002b(), Locale.getDefault().getCountry()));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo58145a(String str) {
        this.f58330l.setRawInput(str);
    }
}
