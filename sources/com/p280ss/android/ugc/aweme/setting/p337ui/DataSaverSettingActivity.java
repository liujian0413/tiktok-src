package com.p280ss.android.ugc.aweme.setting.p337ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import android.widget.TextView;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.setting.C37653j;
import com.p280ss.android.ugc.aweme.setting.api.DataSaverApi.C37569a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.DataSaverSettingActivity */
public final class DataSaverSettingActivity extends AmeBaseActivity {

    /* renamed from: a */
    private HashMap f98386a;

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.DataSaverSettingActivity$a */
    static final class C37749a<TTaskResult, TContinuationResult> implements C1591g<BaseResponse, Object> {

        /* renamed from: a */
        final /* synthetic */ DataSaverSettingActivity f98387a;

        C37749a(DataSaverSettingActivity dataSaverSettingActivity) {
            this.f98387a = dataSaverSettingActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(C1592h<BaseResponse> hVar) {
            int i;
            C7573i.m23582a((Object) hVar, "it");
            if (hVar.mo6889d() || hVar.mo6887c()) {
                CommonItemView commonItemView = (CommonItemView) this.f98387a.mo95131a(R.id.a6_);
                C7573i.m23582a((Object) commonItemView, "data_saver_item");
                CommonItemView commonItemView2 = (CommonItemView) this.f98387a.mo95131a(R.id.a6_);
                C7573i.m23582a((Object) commonItemView2, "data_saver_item");
                commonItemView.setChecked(!commonItemView2.mo25778c());
                C10761a.m31399c((Context) this.f98387a, (int) R.string.b29).mo25750a();
            } else if (hVar.mo6882b()) {
                CommonItemView commonItemView3 = (CommonItemView) this.f98387a.mo95131a(R.id.a6_);
                C7573i.m23582a((Object) commonItemView3, "data_saver_item");
                if (commonItemView3.mo25778c()) {
                    i = 1;
                } else {
                    i = 2;
                }
                if (C37653j.m120480a(i)) {
                    CommonItemView commonItemView4 = (CommonItemView) this.f98387a.mo95131a(R.id.a6_);
                    C7573i.m23582a((Object) commonItemView4, "data_saver_item");
                    if (commonItemView4.mo25778c()) {
                        C6907h.onEventV3("data_saver_on");
                    } else {
                        C6907h.onEventV3("data_saver_off");
                    }
                } else {
                    CommonItemView commonItemView5 = (CommonItemView) this.f98387a.mo95131a(R.id.a6_);
                    C7573i.m23582a((Object) commonItemView5, "data_saver_item");
                    CommonItemView commonItemView6 = (CommonItemView) this.f98387a.mo95131a(R.id.a6_);
                    C7573i.m23582a((Object) commonItemView6, "data_saver_item");
                    commonItemView5.setChecked(!commonItemView6.mo25778c());
                    C10761a.m31399c((Context) this.f98387a, (int) R.string.b29).mo25750a();
                }
                return null;
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.DataSaverSettingActivity$b */
    static final class C37750b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DataSaverSettingActivity f98388a;

        C37750b(DataSaverSettingActivity dataSaverSettingActivity) {
            this.f98388a = dataSaverSettingActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f98388a.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.DataSaverSettingActivity$c */
    static final class C37751c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DataSaverSettingActivity f98389a;

        C37751c(DataSaverSettingActivity dataSaverSettingActivity) {
            this.f98389a = dataSaverSettingActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f98389a.mo58711c();
        }
    }

    /* renamed from: a */
    public final int mo58708a() {
        return R.layout.b9;
    }

    /* renamed from: a */
    public final View mo95131a(int i) {
        if (this.f98386a == null) {
            this.f98386a = new HashMap();
        }
        View view = (View) this.f98386a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f98386a.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.DataSaverSettingActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.DataSaverSettingActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.DataSaverSettingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onDestroy() {
        ImmersionBar.with((Activity) this).destroy();
        super.onDestroy();
    }

    /* renamed from: i */
    private final void m120709i() {
        CommonItemView commonItemView = (CommonItemView) mo95131a(R.id.a6_);
        C7573i.m23582a((Object) commonItemView, "data_saver_item");
        commonItemView.setChecked(C37653j.m120479a());
    }

    /* renamed from: c */
    public final void mo58711c() {
        CommonItemView commonItemView = (CommonItemView) mo95131a(R.id.a6_);
        C7573i.m23582a((Object) commonItemView, "data_saver_item");
        CommonItemView commonItemView2 = (CommonItemView) mo95131a(R.id.a6_);
        C7573i.m23582a((Object) commonItemView2, "data_saver_item");
        int i = 1;
        commonItemView.setChecked(!commonItemView2.mo25778c());
        CommonItemView commonItemView3 = (CommonItemView) mo95131a(R.id.a6_);
        C7573i.m23582a((Object) commonItemView3, "data_saver_item");
        if (!commonItemView3.mo25778c()) {
            i = 2;
        }
        C37569a.m120340a(i, new C37749a(this));
    }

    public final void setStatusBarColor() {
        if (C6399b.m19946v()) {
            ImmersionBar.with((Activity) this).statusBarDarkFont(true).statusBarColor((int) R.color.a03).init();
        } else {
            ImmersionBar.with((Activity) this).statusBarColor((int) R.color.a3z).init();
        }
    }

    /* renamed from: d */
    private final void m120708d() {
        View findViewById = findViewById(R.id.title);
        C7573i.m23582a((Object) findViewById, "findViewById<TextView>(R.id.title)");
        ((TextView) findViewById).setText(getString(R.string.an_));
        findViewById(R.id.jo).setOnClickListener(new C37750b(this));
        if (C6399b.m19946v()) {
            ((RelativeLayout) mo95131a(R.id.cwi)).setBackgroundColor(getResources().getColor(R.color.a7f));
            mo95131a(R.id.dke).setBackgroundColor(getResources().getColor(R.color.a6c));
        }
        ((CommonItemView) mo95131a(R.id.a6_)).setOnClickListener(new C37751c(this));
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.DataSaverSettingActivity", "onCreate", true);
        super.onCreate(bundle);
        m120708d();
        m120709i();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.DataSaverSettingActivity", "onCreate", false);
    }
}
