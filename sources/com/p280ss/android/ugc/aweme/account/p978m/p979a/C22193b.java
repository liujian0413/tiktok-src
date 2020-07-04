package com.p280ss.android.ugc.aweme.account.p978m.p979a;

import android.content.Context;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.web.p582a.C11087a;
import com.bytedance.ies.web.p582a.C11093e;
import com.bytedance.ies.web.p582a.C11097i;
import com.bytedance.sdk.account.p645a.p646a.C12707b;
import com.bytedance.sdk.account.p645a.p646a.C12710e;
import com.bytedance.sdk.account.p660d.C12798d;
import com.bytedance.sdk.account.p662f.p663a.C12833p;
import com.bytedance.sdk.account.p662f.p663a.C12836s;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12852m;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12855p;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.account.login.p956b.C21335l;
import com.p280ss.android.ugc.aweme.account.login.p974ui.InputCaptchaFragment;
import com.p280ss.android.ugc.aweme.account.login.p974ui.InputCaptchaFragment.C21823a;
import com.p280ss.android.ugc.aweme.account.login.p974ui.InputCaptchaFragment.C21824b;
import com.p280ss.android.ugc.aweme.account.util.C22338o;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.m.a.b */
public final class C22193b implements C11093e, C21823a, C21824b {

    /* renamed from: a */
    public static int f59271a = 22;

    /* renamed from: b */
    public static int f59272b = 23;

    /* renamed from: c */
    protected WeakReference<Context> f59273c;

    /* renamed from: d */
    private C11087a f59274d;

    /* renamed from: e */
    private InputCaptchaFragment f59275e;

    /* renamed from: f */
    private C12855p f59276f;

    /* renamed from: g */
    private C12852m f59277g;

    /* renamed from: h */
    private C11097i f59278h;

    /* renamed from: b */
    public final void mo58201b() {
        mo58545a(this.f59278h, false);
    }

    /* renamed from: c */
    private FragmentActivity m73628c() {
        if (this.f59273c != null) {
            return (FragmentActivity) this.f59273c.get();
        }
        return null;
    }

    /* renamed from: a */
    public final void mo57346a() {
        C12798d.m37186a(C21671bd.m72532b()).mo31177a(f59271a, this.f59277g);
    }

    public C22193b(WeakReference<Context> weakReference, C11087a aVar) {
        this.f59273c = weakReference;
        this.f59274d = aVar;
    }

    /* renamed from: a */
    public final void mo58545a(C11097i iVar, boolean z) {
        if (iVar != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("code", z ? 1 : 0);
            } catch (JSONException unused) {
            }
            this.f59274d.mo27030a(iVar.f30169b, jSONObject);
        }
    }

    /* renamed from: a */
    public final void mo57347a(String str, int i) {
        this.f59275e.dismiss();
        C12798d.m37186a(C21671bd.m72532b()).mo31187a("", str, f59271a, this.f59276f);
    }

    public final void call(final C11097i iVar, JSONObject jSONObject) throws Exception {
        if (this.f59273c.get() != null) {
            if (TextUtils.isEmpty(C21671bd.m72520a().getCurUser().getBindPhone())) {
                C10761a.m31399c((Context) this.f59273c.get(), (int) R.string.bdp).mo25750a();
                mo58545a(iVar, false);
                return;
            }
            this.f59278h = iVar;
            this.f59278h.f30173f = false;
            this.f59276f = new C21335l() {
                public final void onSuccess(C12710e<C12836s> eVar) {
                    super.onSuccess(eVar);
                    C22193b.this.mo58545a(iVar, true);
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onNeedCaptcha(C12710e<C12836s> eVar, String str) {
                    if (!TextUtils.isEmpty(str)) {
                        C22193b.this.mo58546a(str, eVar.f33703c, C22193b.f59271a, C22193b.this);
                        return;
                    }
                    if (C22193b.this.f59273c != null) {
                        C10761a.m31403c((Context) C22193b.this.f59273c.get(), C22338o.m73945a((C12707b) eVar)).mo25750a();
                    }
                    C22193b.this.mo58545a(iVar, false);
                }

                public final void onError(C12710e<C12836s> eVar, int i) {
                    super.onError(eVar, i);
                    if (C22193b.this.f59273c != null) {
                        C10761a.m31403c((Context) C22193b.this.f59273c.get(), C22338o.m73945a((C12707b) eVar)).mo25750a();
                    }
                    C22193b.this.mo58545a(iVar, false);
                }
            };
            this.f59277g = new C12852m() {
                public final void onSuccess(C12710e<C12833p> eVar) {
                    C22193b.this.mo58546a(((C12833p) eVar.f33709g).f33986a, null, C22193b.f59271a, C22193b.this);
                }

                public final void onError(C12710e<C12833p> eVar, int i) {
                    if (C22193b.this.f59273c != null) {
                        C10761a.m31403c((Context) C22193b.this.f59273c.get(), C22338o.m73945a((C12707b) eVar)).mo25750a();
                    }
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onNeedCaptcha(C12710e<C12833p> eVar, String str) {
                    if (!TextUtils.isEmpty(str)) {
                        C22193b.this.mo58546a(str, eVar.f33703c, C22193b.f59271a, C22193b.this);
                        return;
                    }
                    if (C22193b.this.f59273c != null) {
                        C10761a.m31403c((Context) C22193b.this.f59273c.get(), C22338o.m73945a((C12707b) eVar)).mo25750a();
                    }
                }
            };
            C12798d.m37186a(C21671bd.m72532b()).mo31187a("", "", f59271a, this.f59276f);
        }
    }

    /* renamed from: a */
    public final void mo58546a(String str, String str2, int i, C21823a aVar) {
        if (m73628c() != null) {
            if (this.f59275e == null) {
                this.f59275e = InputCaptchaFragment.m72938a(str, i, aVar);
                C0633q a = m73628c().getSupportFragmentManager().mo2645a();
                a.mo2588a((Fragment) this.f59275e, "captcha");
                a.mo2606d();
            } else if (m73628c().getSupportFragmentManager().mo2644a("captcha") == null) {
                this.f59275e.show(m73628c().getSupportFragmentManager(), "captcha");
                this.f59275e.f58411d = aVar;
            }
            this.f59275e.f58412e = this;
            this.f59275e.mo58197a(str, str2, i);
        }
    }
}
