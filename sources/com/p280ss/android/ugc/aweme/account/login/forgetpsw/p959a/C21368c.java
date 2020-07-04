package com.p280ss.android.ugc.aweme.account.login.forgetpsw.p959a;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.account.login.forgetpsw.model.FindPswByEmailResponse;
import com.p280ss.android.ugc.aweme.account.login.forgetpsw.p961ui.C21380c;
import com.p280ss.android.ugc.aweme.account.p938b.C21116a;
import com.p280ss.android.ugc.aweme.account.util.C22326e;
import com.p280ss.android.ugc.aweme.account.util.C22338o;
import com.p280ss.android.ugc.aweme.account.util.C22345t;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.forgetpsw.a.c */
public final class C21368c extends C21116a<C21366b, C21380c> {
    /* renamed from: e */
    private static void m71848e() {
        C22345t.m73958a(System.currentTimeMillis());
    }

    /* renamed from: c */
    public final void mo57470c() {
        mo59134U_();
        mo66535W_();
    }

    /* renamed from: S_ */
    public final void mo57293S_() {
        super.mo57293S_();
        ((C21380c) this.f67572c).mo57484a(true);
    }

    /* renamed from: d */
    public final void mo57471d() {
        if (!C22326e.m73921a(((C21380c) this.f67572c).mo57481a(), "https://support.tiktok.com")) {
            C22326e.m73922b(((C21380c) this.f67572c).mo57481a(), "https://support.tiktok.com");
        }
    }

    /* renamed from: b */
    public final void mo56977b() {
        super.mo56977b();
        if (this.f67572c != null) {
            ((C21380c) this.f67572c).mo57484a(false);
        }
        if (((C21366b) this.f67571b).getData() != null) {
            int i = ((FindPswByEmailResponse) ((C21366b) this.f67571b).getData()).status_code;
            if (TextUtils.equals(((FindPswByEmailResponse) ((C21366b) this.f67571b).getData()).message, "success") && i == 0) {
                m71848e();
                ((C21380c) this.f67572c).mo57482a(R.string.cbp, R.string.cbq);
            } else if (((FindPswByEmailResponse) ((C21366b) this.f67571b).getData()).getData() != null) {
                ((C21380c) this.f67572c).mo57483a(C22338o.m73946a(Integer.valueOf(i), ((FindPswByEmailResponse) ((C21366b) this.f67571b).getData()).getData().getDescription()));
            }
        }
    }

    /* renamed from: a */
    public final void mo57469a(C21380c cVar) {
        mo66537a(cVar);
        mo66536a(new C21366b());
    }

    /* renamed from: a */
    public final void mo57296a(Exception exc) {
        super.mo57296a(exc);
        if (this.f67572c != null) {
            ((C21380c) this.f67572c).mo57484a(false);
            ((C21380c) this.f67572c).mo57483a(((C21380c) this.f67572c).mo57481a().getString(R.string.bfd));
        }
    }
}
