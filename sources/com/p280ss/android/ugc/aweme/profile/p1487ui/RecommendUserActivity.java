package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.C0633q;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p262ui.titlebar.NormalTitleBar;
import com.bytedance.ies.dmt.p262ui.titlebar.p565a.C10797a;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.p280ss.android.ugc.aweme.app.C22689a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.qrcode.QRCodePermissionActivity;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.RecommendUserActivity */
public class RecommendUserActivity extends AmeSSActivity {

    /* renamed from: a */
    public String f95227a;

    /* renamed from: b */
    private NormalTitleBar f95228b;

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.RecommendUserActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.RecommendUserActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.RecommendUserActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
        C10994a.m32208b(this);
    }

    /* renamed from: a */
    private void m117275a() {
        Intent intent = getIntent();
        if (intent != null) {
            this.f95227a = intent.getStringExtra("enter_from");
        }
    }

    /* renamed from: b */
    private void m117279b() {
        this.f95228b = (NormalTitleBar) findViewById(R.id.djz);
        this.f95228b.setTitle((int) R.string.dc0);
        this.f95228b.setTitleColor(getResources().getColor(R.color.aye));
        this.f95228b.setOnTitleBarClickListener(new C10797a() {
            /* renamed from: a */
            public final void mo25895a(View view) {
                RecommendUserActivity.this.finish();
            }

            /* renamed from: b */
            public final void mo25896b(View view) {
                C6907h.m21524a("qr_code_scan_enter", (Map) C22984d.m75611a().mo59973a("enter_from", RecommendUserActivity.this.f95227a).f60753a);
                QRCodePermissionActivity.m119022a(RecommendUserActivity.this, false);
            }
        });
        m117280c();
    }

    /* renamed from: c */
    private void m117280c() {
        RecommendUserFragment recommendUserFragment = new RecommendUserFragment();
        recommendUserFragment.setArguments(getIntent().getExtras());
        C0633q a = getSupportFragmentManager().mo2645a();
        a.mo2600b(R.id.aoy, recommendUserFragment, "recommend_user_container");
        a.mo2606d();
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.RecommendUserActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.ed);
        m117275a();
        m117279b();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.RecommendUserActivity", "onCreate", false);
    }

    /* renamed from: a */
    public static void m117276a(Context context, String str, int i, String str2, String str3) {
        m117277a(context, str, 2, "", str2, str3);
    }

    /* renamed from: a */
    public static void m117277a(Context context, String str, int i, String str2, String str3, String str4) {
        m117278a(context, str, i, str2, str3, str4, "");
    }

    /* renamed from: a */
    public static void m117278a(Context context, String str, int i, String str2, String str3, String str4, String str5) {
        Intent intent = new Intent(context, RecommendUserActivity.class);
        intent.putExtra("uid", str);
        intent.putExtra(C22689a.f60407a, str5);
        intent.putExtra("type", i);
        intent.putExtra("enter_from", str2);
        intent.putExtra("extra_previous_page", str3);
        intent.putExtra("request_id", str4);
        context.startActivity(intent);
        C6907h.m21524a("enter_find_friends_list", (Map) C22984d.m75611a().mo59973a("enter_from", str3).f60753a);
    }
}
