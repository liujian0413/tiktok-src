package com.p280ss.android.ugc.aweme.qrcode;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.titlebar.TextTitleBar;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.base.component.C23305g;
import com.p280ss.android.ugc.aweme.commercialize.PoiCouponInputActivity;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.qrcode.QRCodeParams.C36995a;
import com.p280ss.android.ugc.aweme.qrcode.p1499v2.QRCodeActivityV2;
import com.p280ss.android.ugc.aweme.qrcode.view.C37121a;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.qrcode.BaseScanQRCodeActivity */
public abstract class BaseScanQRCodeActivity extends AmeSSActivity implements OnClickListener {

    /* renamed from: a */
    protected TextView f96914a;

    /* renamed from: b */
    protected TextTitleBar f96915b;

    /* renamed from: c */
    protected C37121a f96916c;

    /* renamed from: d */
    protected View f96917d;

    /* renamed from: e */
    protected boolean f96918e;

    /* renamed from: f */
    public int f96919f;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo93419a(Bundle bundle) {
    }

    public void onResume() {
        super.onResume();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void mo93420b() {
        User curUser = C21115b.m71197a().getCurUser();
        QRCodeActivityV2.m119235a(this, new C36995a().mo93428a(4, C43122ff.m136788s(curUser), "scan").mo93433a(C43122ff.m136789t(curUser), C43122ff.m136790u(curUser), C43122ff.m136783n(curUser)).f96920a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo93418a() {
        this.f96914a = (TextView) findViewById(R.id.dyf);
        this.f96915b = (TextTitleBar) findViewById(R.id.djz);
        this.f96915b.getBackBtn().setImageResource(R.drawable.akw);
        this.f96917d = findViewById(R.id.dal);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.ei);
        this.f96918e = getIntent().getBooleanExtra("enter_from", false);
        this.f96919f = getIntent().getIntExtra("scan_page_from", 0);
        mo93418a();
        mo93419a(bundle);
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (view.getId() == R.id.dyf && !C27326a.m89578a(view)) {
            if (this.f96919f == 3) {
                Intent intent = new Intent(this, PoiCouponInputActivity.class);
                intent.putExtra("from_page", 1);
                startActivity(intent);
            } else if (!C21115b.m71197a().isLogin()) {
                C32656f.m105744a((Activity) this, "scan", "click_my_qr", (Bundle) null, (C23305g) new C37003a(this));
            } else if (this.f96918e) {
                finish();
            } else {
                mo93420b();
            }
        }
    }
}
