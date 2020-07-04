package com.p280ss.caijing.globaliap.pay;

import android.app.Activity;
import android.os.Bundle;
import com.p280ss.base.mvp.C45786e;
import com.p280ss.caijing.globaliap.p1791d.C45818d;
import com.p280ss.caijing.globaliap.p1791d.C45818d.C45819a;
import com.p280ss.caijing.globaliap.p1791d.C45818d.C45823e;
import com.p280ss.caijing.globaliap.p1791d.C45829e;
import com.p280ss.caijing.globaliap.p1795f.C45864c;
import com.p280ss.caijing.globaliap.pay.C45868a.C45869a;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* renamed from: com.ss.caijing.globaliap.pay.b */
public final class C45870b extends C45786e<C45869a> {

    /* renamed from: e */
    WeakReference<Activity> f117284e;

    /* renamed from: f */
    private String f117285f;

    /* renamed from: d */
    public final void mo111001d() {
        super.mo111001d();
        C45872c.m143953b(this.f117285f);
    }

    public C45870b(Class<C45869a> cls) {
        super(cls);
    }

    /* renamed from: c */
    public final void mo111000c(Bundle bundle) {
        super.mo111000c(bundle);
        bundle.putString("processId", this.f117285f);
    }

    /* renamed from: b */
    public final void mo110999b(Bundle bundle) {
        super.mo110999b(bundle);
        if (bundle == null || !bundle.containsKey("processId")) {
            super.mo111003f();
            this.f117285f = this.f117115c.getString("processId");
        } else {
            this.f117285f = bundle.getString("processId");
        }
        super.mo111003f();
        C45818d dVar = new C45818d(this.f117113a);
        this.f117116d.add(dVar);
        Activity activity = (Activity) this.f117284e.get();
        String str = this.f117285f;
        C458711 r2 = new C45823e() {
            /* renamed from: b */
            public final void mo111045b() {
                ((C45869a) C45870b.this.mo111002e()).mo111074c();
            }

            /* renamed from: a */
            public final void mo111043a() {
                C45869a aVar = (C45869a) C45870b.this.mo111002e();
                Bundle bundle = new Bundle();
                bundle.putInt("pay_result_code", 0);
                Bundle bundle2 = new Bundle();
                bundle2.putInt("pay_result_detail_code", 0);
                bundle2.putString("pay_result_msg", "success");
                bundle.putBundle("pay_result_extra", bundle2);
                aVar.mo111073a(bundle);
            }

            /* renamed from: a */
            public final void mo111044a(Bundle bundle) {
                ((C45869a) C45870b.this.mo111002e()).mo111073a(bundle);
            }
        };
        dVar.f117191b = new C45829e(dVar.mo110998b());
        dVar.f117198i = new WeakReference<>(activity);
        dVar.f117190a = str;
        dVar.f117192c = r2;
        dVar.f117191b.mo111051a(new C45819a(dVar, 0));
        String b = C45872c.m143952b(dVar.f117190a, "app_id", "");
        HashMap hashMap = new HashMap();
        hashMap.put("app_id", b);
        C45864c.m143930a("caijing_iap_google_request", hashMap);
    }
}
