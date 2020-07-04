package com.p280ss.android.ugc.aweme.account.login.sms;

import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import android.widget.EditText;
import bolts.C1591g;
import bolts.C1592h;
import com.google.android.gms.auth.api.C14941a;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig.C14954a;
import com.google.android.gms.auth.api.credentials.HintRequest.C14955a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C15037d;
import com.google.android.gms.common.api.C15037d.C15038a;
import com.google.android.gms.common.api.C15037d.C15039b;
import com.google.android.gms.common.api.C15037d.C15040c;
import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.account.log.AccountLoginAlogHelper;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21102b;
import com.p280ss.android.ugc.aweme.account.p950k.C21225a;
import com.p280ss.android.ugc.aweme.account.p951l.C21240c;
import com.p280ss.android.ugc.aweme.account.p951l.C21241d;
import com.p280ss.android.ugc.aweme.account.util.C22339p;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.utils.C43173w;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.account.login.sms.a */
public final class C21586a implements C15039b, C15040c {

    /* renamed from: b */
    private static final boolean f57946b = C7163a.m22363a();

    /* renamed from: a */
    public EditText f57947a;

    /* renamed from: c */
    private C15037d f57948c;

    /* renamed from: d */
    private Fragment f57949d;

    /* renamed from: e */
    private int f57950e;

    /* renamed from: f */
    private boolean f57951f;

    /* renamed from: g */
    private String f57952g;

    /* renamed from: h */
    private Exception f57953h;

    /* renamed from: i */
    private boolean f57954i = m72331d();

    /* renamed from: a */
    public final void mo38257a(int i) {
    }

    /* renamed from: a */
    public final void mo38258a(Bundle bundle) {
    }

    /* renamed from: a */
    public final void mo38259a(ConnectionResult connectionResult) {
    }

    /* renamed from: d */
    private boolean m72331d() {
        this.f57950e = C21241d.m71498b(C21671bd.m72532b());
        this.f57951f = C22339p.m73948a(C21671bd.m72532b());
        if (!this.f57951f || this.f57950e != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo57776b() {
        if (this.f57954i && this.f57948c != null && this.f57948c.mo38249j()) {
            this.f57948c.mo38234a(this.f57949d.getActivity());
            this.f57948c.mo38246g();
        }
    }

    /* renamed from: c */
    public final void mo57777c() {
        if (!this.f57954i) {
            m72328a(false, "Feature cannot be used", this.f57951f, this.f57950e);
        } else if (this.f57948c == null) {
            StringBuilder sb = new StringBuilder("Failed to create GoogleApiClient, exception: ");
            sb.append(C21240c.m71495a(this.f57953h));
            m72328a(false, sb.toString(), this.f57951f, this.f57950e);
        } else if (this.f57949d == null || !this.f57949d.isAdded()) {
            StringBuilder sb2 = new StringBuilder("Unexpected error occurred, fragment: ");
            sb2.append(this.f57949d);
            m72328a(false, sb2.toString(), this.f57951f, this.f57950e);
        } else {
            try {
                this.f57949d.startIntentSenderForResult(C14941a.f38653g.mo38058a(this.f57948c, new C14955a().mo38053a(new C14954a().mo38049a(true).mo38050a()).mo38054a(true).mo38055a()).getIntentSender(), 1000, null, 0, 0, 0, null);
            } catch (SendIntentException e) {
                StringBuilder sb3 = new StringBuilder("Error when calling startIntentSenderForResult: ");
                sb3.append(C21240c.m71495a(e));
                m72328a(false, sb3.toString(), this.f57951f, this.f57950e);
            }
        }
    }

    /* renamed from: a */
    public final void mo57772a() {
        if (this.f57954i) {
            try {
                this.f57948c = new C15038a(this.f57949d.getContext()).mo38254a((C15039b) this).mo38251a(this.f57949d.getActivity(), (C15040c) this).mo38252a(C14941a.f38650d).mo38256a();
            } catch (Exception e) {
                this.f57953h = e;
            }
        }
    }

    /* renamed from: b */
    private void m72330b(String str) {
        C43173w.m136924a((Runnable) new C21589d(this, str));
    }

    /* renamed from: a */
    public final void mo57774a(EditText editText) {
        this.f57947a = editText;
        mo57777c();
    }

    /* renamed from: b */
    private void m72329b(Intent intent) {
        C1592h.m7853a((Callable<TResult>) new C21587b<TResult>(this, intent)).mo6875a((C1591g<TResult, TContinuationResult>) new C21588c<TResult,TContinuationResult>(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Boolean mo57770a(Intent intent) throws Exception {
        String str;
        String str2;
        Credential credential = (Credential) intent.getParcelableExtra("com.google.android.gms.credentials.Credential");
        boolean z = false;
        if (credential == null) {
            str = "No \"Credential\" retrieved from Credential.EXTRA_KEY";
        } else {
            String str3 = credential.f38699a;
            PhoneNumber phoneNumber = null;
            try {
                str2 = null;
                phoneNumber = PhoneNumberUtil.getInstance().parse(str3, null);
            } catch (NumberParseException e) {
                StringBuilder sb = new StringBuilder("NumberParseException: ");
                sb.append(e.getMessage());
                str2 = sb.toString();
            }
            if (phoneNumber != null) {
                z = true;
            }
            if (phoneNumber != null) {
                str3 = String.valueOf(phoneNumber.getNationalNumber());
            }
            m72330b(str3);
            str = str2;
        }
        m72328a(TextUtils.isEmpty(str), str, this.f57951f, this.f57950e);
        return Boolean.valueOf(z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Void mo57771a(C1592h hVar) throws Exception {
        if (!C43173w.m136926a(hVar) || !((Boolean) hVar.mo6890e()).booleanValue()) {
            StringBuilder sb = new StringBuilder("Bolts result error: ");
            sb.append(C21240c.m71495a(hVar.mo6891f()));
            m72328a(false, sb.toString(), this.f57951f, this.f57950e);
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo57775a(String str) {
        this.f57947a.setText(str);
        if (!TextUtils.isEmpty(str)) {
            this.f57947a.setSelection(str.length());
        }
    }

    public C21586a(Fragment fragment, String str) {
        this.f57949d = fragment;
        this.f57952g = str;
    }

    /* renamed from: a */
    public final void mo57773a(int i, int i2, Intent intent) {
        if (this.f57954i && i == 1000 && this.f57947a != null) {
            if (i2 == -1) {
                m72329b(intent);
                return;
            }
            this.f57947a.requestFocus();
            StringBuilder sb = new StringBuilder("onActivityResult result code: ");
            sb.append(i2);
            m72328a(false, sb.toString(), this.f57951f, this.f57950e);
        }
    }

    /* renamed from: a */
    private void m72328a(boolean z, String str, boolean z2, int i) {
        AccountLoginAlogHelper.m71519a(z, str, z2, i);
        C21225a.m71439a(z, str, z2, i);
        C6907h.m21524a("phone_auto_fill", (Map) new C21102b().mo56946a("enter_method", this.f57952g).mo56944a("is_successful", z ? 1 : 0).mo56946a("error_desc", str).mo56944a("has_sim_card", z2 ? 1 : 0).mo56944a("google_availability", i).f56672a);
    }
}
