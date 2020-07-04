package com.p280ss.android.ugc.aweme.account.p982ui;

import android.arch.lifecycle.C0069x;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.account.model.AccountOpeModel;
import com.p280ss.android.ugc.aweme.account.model.C22198a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;

/* renamed from: com.ss.android.ugc.aweme.account.ui.VerificationActivity */
public class VerificationActivity extends BaseAccountActivity {

    /* renamed from: k */
    public int f59510k = -1;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo58725a(C22198a aVar) {
        if (aVar == null || !aVar.f59293a) {
            onBackPressed();
        } else {
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        this.f59510k = getIntent().getIntExtra("req_code", -1);
        ((AccountOpeModel) C0069x.m159a((FragmentActivity) this).mo147a(AccountOpeModel.class)).f59291b.observe(this, new C22312k(this));
        int intExtra = getIntent().getIntExtra("verify_type", PreloadTask.BYTE_UNIT_NUMBER);
        if (intExtra == 1024) {
            mo58616a(VerifyIDCardFragment.m73901a(""));
        } else if (intExtra == 2048) {
            User k = C21671bd.m72543k();
            if (k != null) {
                str = k.getBindPhone();
            } else {
                str = "";
            }
            mo58616a(VerificationCodeFragment.m73864b(6, str, "", "", ""));
        } else if (intExtra == 3072) {
            mo58616a(VerifyIDCardFragment.m73901a(getIntent().getStringExtra("shark_ticket")));
        } else {
            if (intExtra == 4096) {
                mo58616a(VerificationCodeFragment.m73864b(7, getIntent().getStringExtra("phone"), "", getIntent().getStringExtra("shark_ticket"), ""));
            }
        }
    }
}
