package com.p280ss.android.ugc.aweme.account.login.sms;

import android.arch.lifecycle.C0052o;
import android.content.Context;
import com.google.android.gms.auth.api.p745a.C14944a;
import com.google.android.gms.auth.api.p745a.C14945b;
import com.google.android.gms.tasks.C17054c;
import com.google.android.gms.tasks.C17057f;
import com.p280ss.android.ugc.aweme.account.log.AccountLoginAlogHelper;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21102b;
import com.p280ss.android.ugc.aweme.account.p950k.C21225a;
import com.p280ss.android.ugc.aweme.account.p951l.C21240c;
import com.p280ss.android.ugc.aweme.account.p951l.C21241d;
import com.p280ss.android.ugc.aweme.account.util.C22339p;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.account.login.sms.e */
public final class C21590e {

    /* renamed from: b */
    private static final boolean f57960b = C7163a.m22363a();

    /* renamed from: a */
    public C0052o<String> f57961a = new C0052o<>();

    /* renamed from: c */
    private Context f57962c;

    /* renamed from: d */
    private SmsBroadcastReceiver f57963d;

    /* renamed from: e */
    private C14945b f57964e;

    /* renamed from: f */
    private boolean f57965f;

    /* renamed from: g */
    private int f57966g;

    /* renamed from: h */
    private boolean f57967h;

    /* renamed from: d */
    private boolean m72344d() {
        this.f57966g = C21241d.m71498b(this.f57962c);
        this.f57965f = C22339p.m73948a(this.f57962c);
        if (!this.f57965f || this.f57966g != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo57780a() {
        if (!this.f57967h) {
            m72343a(false, "Feature cannot be used", this.f57965f, this.f57966g);
        } else {
            this.f57964e.mo38025a().mo44285a((C17054c<TResult>) new C21591f<TResult>(this));
        }
    }

    /* renamed from: b */
    public final void mo57782b() {
        if (this.f57967h) {
            if (this.f57963d == null) {
                this.f57963d = new SmsBroadcastReceiver(this.f57962c, this.f57961a);
            }
            this.f57963d.mo57767a();
        }
    }

    /* renamed from: c */
    public final void mo57783c() {
        if (m72344d() && this.f57963d != null) {
            this.f57963d.mo57768b();
        }
    }

    public C21590e(Context context) {
        this.f57962c = context;
        this.f57964e = C14944a.m43392a(context);
        this.f57967h = m72344d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo57781a(C17057f fVar) {
        String str;
        if (!fVar.mo44294b()) {
            StringBuilder sb = new StringBuilder("Failed to start SMS Retriever, exception: ");
            if (fVar.mo44297e() != null) {
                str = C21240c.m71495a(fVar.mo44297e());
            } else {
                str = "";
            }
            sb.append(str);
            m72343a(false, sb.toString(), this.f57965f, this.f57966g);
        } else if (f57960b) {
        }
    }

    /* renamed from: a */
    private static void m72343a(boolean z, String str, boolean z2, int i) {
        AccountLoginAlogHelper.m71523b(false, str, z2, i);
        C21225a.m71441b(false, str, z2, i);
        C6907h.m21524a("sms_auto_fill", (Map) new C21102b().mo56944a("is_successful", 0).mo56946a("error_desc", str).mo56944a("has_sim_card", z2 ? 1 : 0).mo56944a("google_availability", i).f56672a);
    }
}
