package com.p280ss.caijing.globaliap.pay;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import com.p280ss.base.mvp.C45781a;
import com.p280ss.base.mvp.MvpActivity;
import com.p280ss.caijing.globaliap.p1795f.C45864c;
import com.p280ss.caijing.globaliap.p1796g.C45865a;
import com.p280ss.caijing.globaliap.p1797h.C45866a;
import com.p280ss.caijing.globaliap.pay.C45868a.C45869a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* renamed from: com.ss.caijing.globaliap.pay.PayActivity */
public class PayActivity extends MvpActivity implements C45869a {

    /* renamed from: a */
    private C45866a f117280a;

    /* renamed from: b */
    private boolean f117281b;

    /* renamed from: c */
    private String f117282c;

    /* renamed from: com.ss.caijing.globaliap.pay.PayActivity$a */
    class C45867a implements OnCancelListener {
        private C45867a() {
        }

        public final void onCancel(DialogInterface dialogInterface) {
            PayActivity.this.m143933d();
        }

        /* synthetic */ C45867a(PayActivity payActivity, byte b) {
            this();
        }
    }

    public void onBackPressed() {
        m143933d();
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    public void onDestroy() {
        super.onDestroy();
        C45865a.m143931a(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m143933d() {
        if (!this.f117281b) {
            mo111073a(C45874e.m143958a());
        }
    }

    /* renamed from: b */
    public final C45781a mo110997b() {
        C45870b bVar = new C45870b(C45869a.class);
        bVar.f117284e = new WeakReference<>(this);
        return bVar;
    }

    /* renamed from: c */
    public final void mo111074c() {
        this.f117281b = true;
        this.f117280a.setCancelable(false);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f117280a.dismiss();
    }

    public void onResume() {
        super.onResume();
        C45865a.m143931a(false);
        this.f117280a.show();
    }

    /* renamed from: a */
    public final void mo110979a() {
        setContentView(R.layout.aga);
        this.f117280a = new C45866a(this);
        this.f117280a.setOnCancelListener(new C45867a(this, 0));
        this.f117282c = getIntent().getStringExtra("processId");
    }

    /* renamed from: a */
    public final void mo111073a(Bundle bundle) {
        if (bundle != null) {
            Bundle bundle2 = bundle.getBundle("pay_result_extra");
            if (bundle2 != null) {
                String b = C45872c.m143952b(this.f117282c, "app_id", "");
                int i = bundle2.getInt("pay_result_detail_code");
                String string = bundle2.getString("pay_result_msg");
                HashMap hashMap = new HashMap();
                hashMap.put("app_id", b);
                hashMap.put("detailCode", Integer.valueOf(i).toString());
                hashMap.put("detailMsg", string);
                C45864c.m143930a("caijing_iap_pay_activity_result", hashMap);
            }
        }
        Intent intent = new Intent();
        intent.putExtras(bundle);
        setResult(-1, intent);
        finish();
    }
}
