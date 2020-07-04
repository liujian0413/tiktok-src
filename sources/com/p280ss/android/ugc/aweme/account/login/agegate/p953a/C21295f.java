package com.p280ss.android.ugc.aweme.account.login.agegate.p953a;

import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.account.login.C21537g;
import com.p280ss.android.ugc.aweme.account.util.C22323b;
import com.p280ss.android.ugc.aweme.common.C25652b;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.agegate.a.f */
public final class C21295f extends C25652b<C21290a, C21296g> {

    /* renamed from: a */
    private String[] f57212a;

    /* renamed from: c */
    public final void mo57298c() {
        mo59134U_();
        mo66535W_();
    }

    /* renamed from: S_ */
    public final void mo57293S_() {
        super.mo57293S_();
        ((C21296g) this.f67572c).mo57301a(true);
    }

    /* renamed from: b */
    public final void mo56977b() {
        int i;
        super.mo56977b();
        if (this.f67571b == null || !((C21290a) this.f67571b).mo57283a()) {
            i = 0;
        } else {
            i = 1;
        }
        C21537g.m72225b(1, i, "");
        if (this.f67572c != null) {
            ((C21296g) this.f67572c).mo57301a(false);
            if (this.f67571b == null || !((C21290a) this.f67571b).mo57283a()) {
                ((C21296g) this.f67572c).mo57300a(new Exception(((C21290a) this.f67571b).mo57286b()));
            } else {
                ((C21296g) this.f67572c).mo57299a();
            }
        }
    }

    /* renamed from: a */
    public final void mo57295a(C21296g gVar) {
        mo66537a(gVar);
        mo66536a(new C21290a());
        this.f57212a = C21671bd.m72532b().getResources().getStringArray(R.array.a1);
    }

    /* renamed from: a */
    public final void mo57296a(Exception exc) {
        super.mo57296a(exc);
        C21537g.m72225b(0, 0, exc.getMessage());
        if (this.f67572c != null) {
            ((C21296g) this.f67572c).mo57301a(false);
            ((C21296g) this.f67572c).mo57300a(exc);
        }
    }

    /* renamed from: a */
    public final void mo57297a(boolean z, boolean z2) {
        String c = ((C21290a) mo66539h()).mo57287c();
        mo56976a(c, Boolean.valueOf(z2));
        if (!z) {
            C22323b.m73915a(c);
        }
    }

    /* renamed from: a */
    public final void mo57294a(int i, int i2, int i3) {
        ((C21290a) mo66539h()).mo57282a(i, i2, i3);
        StringBuilder sb = new StringBuilder();
        sb.append(this.f57212a[i2 - 1]);
        sb.append(" ");
        sb.append(i3);
        sb.append(" ");
        sb.append(i);
    }
}
