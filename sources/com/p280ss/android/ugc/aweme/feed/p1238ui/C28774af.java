package com.p280ss.android.ugc.aweme.feed.p1238ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p262ui.widget.util.C10834d;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.utils.permission.C43152a.C43154a;
import com.p280ss.android.ugc.aweme.views.C43374j;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.af */
public final class C28774af extends C43374j implements C43154a {

    /* renamed from: a */
    private final Activity f75890a;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.af$a */
    static final class C28775a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C28774af f75891a;

        C28775a(C28774af afVar) {
            this.f75891a = afVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f75891a.mo73993d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.af$b */
    static final class C28776b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C28774af f75892a;

        C28776b(C28774af afVar) {
            this.f75892a = afVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f75892a.mo73994e();
        }
    }

    public final void onBackPressed() {
        super.onBackPressed();
        mo73993d();
    }

    /* renamed from: c */
    public final void mo73992c() {
        super.mo73992c();
        this.f112344h = -2;
        this.f112345i = -2;
    }

    /* renamed from: b */
    public final void mo71376b() {
        C6907h.m21524a("system_location_permission_result", (Map) C22984d.m75611a().mo59973a("is_allow", "0").f60753a);
    }

    /* renamed from: d */
    public final void mo73993d() {
        dismiss();
        C6907h.m21524a("location_permission_result", (Map) C22984d.m75611a().mo59973a("is_allow", "0").f60753a);
    }

    /* renamed from: a */
    public final void mo71375a() {
        C6907h.m21524a("system_location_permission_result", (Map) C22984d.m75611a().mo59973a("is_allow", "1").f60753a);
        ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).tryRefreshLocation(this.f75890a);
    }

    /* renamed from: e */
    public final void mo73994e() {
        dismiss();
        C6907h.m21524a("location_permission_result", (Map) C22984d.m75611a().mo59973a("is_allow", "1").f60753a);
        ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).requestLocationPermissions(this.f75890a, this);
    }

    /* renamed from: f */
    private void m94751f() {
        setCanceledOnTouchOutside(false);
        ((DmtTextView) findViewById(R.id.e3f)).setFontType(C10834d.f29337g);
        ((DmtTextView) findViewById(R.id.dqh)).setFontType(C10834d.f29337g);
        ((DmtTextView) findViewById(R.id.dr5)).setOnClickListener(new C28775a(this));
        ((DmtTextView) findViewById(R.id.dqh)).setOnClickListener(new C28776b(this));
    }

    public C28774af(Activity activity) {
        C7573i.m23587b(activity, "activity");
        super((Context) activity, (int) R.style.w2, 0, 0);
        this.f75890a = activity;
        setContentView(R.layout.kt);
        m94751f();
    }
}
