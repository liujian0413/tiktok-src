package com.p280ss.android.ugc.aweme.property;

import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.design.widget.TabLayout.C0376f;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.view.ViewPager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.base.C10747b;
import com.bytedance.ies.dmt.p262ui.common.C6394b;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.property.AVABAndSettingActivity */
public final class AVABAndSettingActivity extends AmeSSActivity implements C10747b {

    /* renamed from: b */
    public static final C36931a f96782b = new C36931a(null);

    /* renamed from: a */
    public C36954a f96783a;

    /* renamed from: c */
    private HashMap f96784c;

    /* renamed from: com.ss.android.ugc.aweme.property.AVABAndSettingActivity$a */
    public static final class C36931a {
        private C36931a() {
        }

        public /* synthetic */ C36931a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m118842a(Context context) {
            C7573i.m23587b(context, "context");
            context.startActivity(new Intent(context, AVABAndSettingActivity.class));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.property.AVABAndSettingActivity$b */
    static final class C36932b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AVABAndSettingActivity f96785a;

        C36932b(AVABAndSettingActivity aVABAndSettingActivity) {
            this.f96785a = aVABAndSettingActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f96785a.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.property.AVABAndSettingActivity$c */
    static final class C36933c<T> implements C0053p<String> {

        /* renamed from: a */
        final /* synthetic */ AVABAndSettingActivity f96786a;

        C36933c(AVABAndSettingActivity aVABAndSettingActivity) {
            this.f96786a = aVABAndSettingActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(String str) {
            TextView textView = (TextView) this.f96786a.mo93318a((int) R.id.ur);
            C7573i.m23582a((Object) textView, "changeLanguage");
            textView.setText(str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.property.AVABAndSettingActivity$d */
    static final class C36934d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AVABAndSettingActivity f96787a;

        C36934d(AVABAndSettingActivity aVABAndSettingActivity) {
            this.f96787a = aVABAndSettingActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f96787a.mo93319a().mo93380a();
        }
    }

    /* renamed from: a */
    public static final void m118834a(Context context) {
        C36931a.m118842a(context);
    }

    /* renamed from: a */
    public final View mo93318a(int i) {
        if (this.f96784c == null) {
            this.f96784c = new HashMap();
        }
        View view = (View) this.f96784c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f96784c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.property.AVABAndSettingActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.property.AVABAndSettingActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.property.AVABAndSettingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: c */
    private final void m118836c() {
        this.f96783a = new C36954a(this);
    }

    /* renamed from: a */
    public final C36954a mo93319a() {
        C36954a aVar = this.f96783a;
        if (aVar == null) {
            C7573i.m23583a("activityPresent");
        }
        return aVar;
    }

    /* renamed from: b */
    private final void m118835b() {
        C6394b.m19905a((Context) this);
        m118836c();
        m118837d();
        m118838e();
        m118839f();
    }

    /* renamed from: f */
    private final void m118839f() {
        ((ImageView) mo93318a((int) R.id.jn)).setOnClickListener(new C36932b(this));
    }

    /* renamed from: d */
    private final void m118837d() {
        ((TextView) mo93318a((int) R.id.ur)).setTextColor(-12965125);
        ((ABAndSettingViewModel) C0069x.m159a((FragmentActivity) this).mo147a(ABAndSettingViewModel.class)).f96762a.observe(this, new C36933c(this));
        ((TextView) mo93318a((int) R.id.ur)).setOnClickListener(new C36934d(this));
    }

    /* renamed from: e */
    private final void m118838e() {
        C0608j supportFragmentManager = getSupportFragmentManager();
        C7573i.m23582a((Object) supportFragmentManager, "supportFragmentManager");
        FmPagerAdapter fmPagerAdapter = new FmPagerAdapter(supportFragmentManager, this);
        ViewPager viewPager = (ViewPager) mo93318a((int) R.id.edp);
        C7573i.m23582a((Object) viewPager, "viewpager");
        viewPager.setAdapter(fmPagerAdapter);
        ((TabLayout) mo93318a((int) R.id.dfx)).addTab(((TabLayout) mo93318a((int) R.id.dfx)).newTab());
        ((TabLayout) mo93318a((int) R.id.dfx)).addTab(((TabLayout) mo93318a((int) R.id.dfx)).newTab());
        ((TabLayout) mo93318a((int) R.id.dfx)).setupWithViewPager((ViewPager) mo93318a((int) R.id.edp), false);
        C0376f tabAt = ((TabLayout) mo93318a((int) R.id.dfx)).getTabAt(0);
        if (tabAt == null) {
            C7573i.m23580a();
        }
        C7573i.m23582a((Object) tabAt, "tablayout.getTabAt(0)!!");
        tabAt.mo1688a((CharSequence) "AB");
        C0376f tabAt2 = ((TabLayout) mo93318a((int) R.id.dfx)).getTabAt(1);
        if (tabAt2 == null) {
            C7573i.m23580a();
        }
        C7573i.m23582a((Object) tabAt2, "tablayout.getTabAt(1)!!");
        tabAt2.mo1688a((CharSequence) "Setting");
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.property.AVABAndSettingActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.ag);
        m118835b();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.property.AVABAndSettingActivity", "onCreate", false);
    }
}
