package com.p280ss.android.ugc.aweme.app.debug;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.setting.C7214e;
import com.p280ss.android.ugc.aweme.setting.model.AbTestModel;
import com.p280ss.android.ugc.aweme.setting.p1516d.C37618a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.app.debug.AbsABActivity */
public abstract class AbsABActivity extends AmeBaseActivity {

    /* renamed from: c */
    protected LinearLayout f60661c;

    /* renamed from: d */
    protected AbTestModel f60662d;

    /* renamed from: e */
    protected AbTestSettingPageParam f60663e;

    /* renamed from: a */
    public final int mo58708a() {
        return R.layout.a3;
    }

    public void back() {
        finish();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo58711c();

    public boolean isRegisterEventBus() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo59893d() {
        this.f60663e = (AbTestSettingPageParam) getIntent().getSerializableExtra("paeg_param");
        ((TextView) findViewById(R.id.title)).setText(this.f60663e.category);
        this.f60661c = (LinearLayout) findViewById(R.id.bgh);
        this.f60662d = C7213d.m22500a().mo18803bo();
        mo58711c();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo59893d();
    }

    @C7709l
    public void onEvent(C37618a aVar) {
        C7214e.m22629b().mo16900a(getApplicationContext(), "ab_test_model", (Object) this.f60662d);
    }
}
