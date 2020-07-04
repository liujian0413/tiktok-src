package com.p280ss.android.ugc.aweme.commercialize.egg;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.commercialize.EasterEggPageParams;
import com.p280ss.android.ugc.aweme.commercialize.egg.p1123a.C24638b;
import com.p280ss.android.ugc.aweme.commercialize.model.EasterEggInfo;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25352e;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25371n;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.utils.C43081e;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.EasterEggActivityV3 */
public final class EasterEggActivityV3 extends AmeSSActivity implements C24638b {

    /* renamed from: c */
    public static final C24631a f64947c = new C24631a(null);

    /* renamed from: a */
    public long f64948a;

    /* renamed from: b */
    public boolean f64949b;

    /* renamed from: d */
    private CommerceEggLayout f64950d;

    /* renamed from: e */
    private ImageView f64951e;

    /* renamed from: f */
    private EasterEggPageParams f64952f;

    /* renamed from: g */
    private boolean f64953g;

    /* renamed from: h */
    private final Runnable f64954h = new C24632b(this);

    /* renamed from: i */
    private final Runnable f64955i = new C24634d(this);

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.EasterEggActivityV3$a */
    public static final class C24631a {
        private C24631a() {
        }

        public /* synthetic */ C24631a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m80755a(Context context, EasterEggPageParams easterEggPageParams) {
            C7573i.m23587b(context, "context");
            C7573i.m23587b(easterEggPageParams, "pageParams");
            Intent intent = new Intent(context, EasterEggActivityV3.class);
            intent.putExtra("pageParams", easterEggPageParams);
            context.startActivity(intent);
        }

        /* renamed from: a */
        public static void m80754a(Activity activity, EasterEggPageParams easterEggPageParams, int i) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(easterEggPageParams, "pageParams");
            Intent intent = new Intent(activity, EasterEggActivityV3.class);
            intent.putExtra("pageParams", easterEggPageParams);
            activity.startActivityForResult(intent, i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.EasterEggActivityV3$b */
    static final class C24632b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ EasterEggActivityV3 f64956a;

        C24632b(EasterEggActivityV3 easterEggActivityV3) {
            this.f64956a = easterEggActivityV3;
        }

        public final void run() {
            if (!this.f64956a.isFinishing()) {
                Map e = this.f64956a.mo64493e();
                e.put("disappear_method", "auto_disappear");
                e.put("duration", String.valueOf(System.currentTimeMillis() - this.f64956a.f64948a));
                C6907h.m21524a("egg_ad_disappear", e);
                this.f64956a.finish();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.EasterEggActivityV3$c */
    static final class C24633c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EasterEggActivityV3 f64957a;

        C24633c(EasterEggActivityV3 easterEggActivityV3) {
            this.f64957a = easterEggActivityV3;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            Map e = this.f64957a.mo64493e();
            e.put("disappear_method", "click_close_button");
            e.put("duration", String.valueOf(System.currentTimeMillis() - this.f64957a.f64948a));
            C6907h.m21524a("egg_ad_disappear", e);
            this.f64957a.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.EasterEggActivityV3$d */
    static final class C24634d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ EasterEggActivityV3 f64958a;

        C24634d(EasterEggActivityV3 easterEggActivityV3) {
            this.f64958a = easterEggActivityV3;
        }

        public final void run() {
            if (!this.f64958a.isFinishing() && !this.f64958a.f64949b) {
                this.f64958a.mo64488a("overtime");
                this.f64958a.finish();
            }
        }
    }

    /* renamed from: c */
    public final boolean mo64491c() {
        return true;
    }

    /* renamed from: d */
    public final boolean mo64492d() {
        return true;
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.egg.EasterEggActivityV3", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.egg.EasterEggActivityV3", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.egg.EasterEggActivityV3", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: b */
    public final void mo64489b() {
        mo64488a("load_fail");
        finish();
    }

    public final void finish() {
        setResult(1002);
        super.finish();
        overridePendingTransition(0, 0);
    }

    public final void onDestroy() {
        super.onDestroy();
        CommerceEggLayout commerceEggLayout = this.f64950d;
        if (commerceEggLayout == null) {
            C7573i.m23583a("mEggLayout");
        }
        commerceEggLayout.mo64482a();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CommerceEggLayout commerceEggLayout = this.f64950d;
        if (commerceEggLayout == null) {
            C7573i.m23583a("mEggLayout");
        }
        commerceEggLayout.removeCallbacks(this.f64954h);
        CommerceEggLayout commerceEggLayout2 = this.f64950d;
        if (commerceEggLayout2 == null) {
            C7573i.m23583a("mEggLayout");
        }
        commerceEggLayout2.removeCallbacks(this.f64955i);
    }

    /* renamed from: g */
    private final void m80742g() {
        Serializable serializableExtra = getIntent().getSerializableExtra("pageParams");
        if (serializableExtra != null) {
            EasterEggPageParams easterEggPageParams = (EasterEggPageParams) serializableExtra;
            if (easterEggPageParams.getEasterEggInfo() != null) {
                this.f64952f = easterEggPageParams;
            } else {
                finish();
            }
        } else {
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.EasterEggPageParams");
        }
    }

    /* renamed from: a */
    public final void mo64485a() {
        if (!this.f64949b && !this.f64953g) {
            this.f64949b = true;
            C6907h.m21524a("show_egg_ad", (Map) mo64493e());
            CommerceEggLayout commerceEggLayout = this.f64950d;
            if (commerceEggLayout == null) {
                C7573i.m23583a("mEggLayout");
            }
            commerceEggLayout.postDelayed(this.f64954h, 7000);
        }
    }

    public final void onBackPressed() {
        super.onBackPressed();
        finish();
        C6907h.onEvent(MobClick.obtain().setEventName("result_ad").setLabelName("close").setJsonObject(C6869c.m21381a().mo16887a("refer", "egg").mo16888b()));
    }

    /* renamed from: f */
    private final void m80741f() {
        View findViewById = findViewById(R.id.a0o);
        C7573i.m23582a((Object) findViewById, "findViewById(R.id.commmerce_egg_layout)");
        this.f64950d = (CommerceEggLayout) findViewById;
        View findViewById2 = findViewById(R.id.x_);
        C7573i.m23582a((Object) findViewById2, "findViewById(R.id.close)");
        this.f64951e = (ImageView) findViewById2;
        ImageView imageView = this.f64951e;
        if (imageView == null) {
            C7573i.m23583a("mCloseBtn");
        }
        imageView.setOnClickListener(new C24633c(this));
        ImageView imageView2 = this.f64951e;
        if (imageView2 == null) {
            C7573i.m23583a("mCloseBtn");
        }
        C43081e.m136670a(imageView2);
    }

    /* renamed from: h */
    private final void m80743h() {
        EasterEggPageParams easterEggPageParams = this.f64952f;
        if (easterEggPageParams == null) {
            C7573i.m23583a("pageParams");
        }
        C24641b a = C24670l.m80849a(easterEggPageParams.getEasterEggInfo(), false);
        if (a == null) {
            mo64489b();
            return;
        }
        this.f64948a = System.currentTimeMillis();
        CommerceEggLayout commerceEggLayout = this.f64950d;
        if (commerceEggLayout == null) {
            C7573i.m23583a("mEggLayout");
        }
        commerceEggLayout.mo64484a(a, this, 0, false);
        ImageView imageView = this.f64951e;
        if (imageView == null) {
            C7573i.m23583a("mCloseBtn");
        }
        imageView.bringToFront();
        CommerceEggLayout commerceEggLayout2 = this.f64950d;
        if (commerceEggLayout2 == null) {
            C7573i.m23583a("mEggLayout");
        }
        Runnable runnable = this.f64955i;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        C7213d a2 = C7213d.m22500a();
        C7573i.m23582a((Object) a2, "AbTestManager.getInstance()");
        commerceEggLayout2.postDelayed(runnable, timeUnit.toMillis((long) a2.mo18781at()));
    }

    /* renamed from: i */
    private final void m80744i() {
        EasterEggPageParams easterEggPageParams = this.f64952f;
        if (easterEggPageParams == null) {
            C7573i.m23583a("pageParams");
        }
        EasterEggInfo easterEggInfo = easterEggPageParams.getEasterEggInfo();
        C25371n.m83439a((Context) this, C25352e.m83369g(easterEggInfo), C25352e.m83368f(easterEggInfo), C25352e.m83370h(easterEggInfo));
        Map e = mo64493e();
        e.put("duration", String.valueOf(System.currentTimeMillis() - this.f64948a));
        e.put("enter_method", "click_carton");
        C6907h.m21524a("click_egg_ad", e);
        finish();
    }

    /* renamed from: e */
    public final HashMap<String, String> mo64493e() {
        HashMap<String, String> hashMap = new HashMap<>();
        Map map = hashMap;
        String str = "enter_from";
        EasterEggPageParams easterEggPageParams = this.f64952f;
        if (easterEggPageParams == null) {
            C7573i.m23583a("pageParams");
        }
        map.put(str, easterEggPageParams.getEnterFrom());
        String str2 = "search_keyword";
        EasterEggPageParams easterEggPageParams2 = this.f64952f;
        if (easterEggPageParams2 == null) {
            C7573i.m23583a("pageParams");
        }
        map.put(str2, easterEggPageParams2.getKeyWords());
        String str3 = "egg_ad_id";
        EasterEggPageParams easterEggPageParams3 = this.f64952f;
        if (easterEggPageParams3 == null) {
            C7573i.m23583a("pageParams");
        }
        map.put(str3, C25352e.m83357c(easterEggPageParams3.getEasterEggInfo()));
        return hashMap;
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.egg.EasterEggActivityV3", "onCreate", true);
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        setContentView((int) R.layout.el);
        m80742g();
        m80741f();
        m80743h();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.egg.EasterEggActivityV3", "onCreate", false);
    }

    /* renamed from: a */
    public final void mo64488a(String str) {
        if (!this.f64953g && !this.f64949b) {
            this.f64953g = true;
            Map e = mo64493e();
            e.put("fail_type", str);
            C6907h.m21524a("show_egg_ad_fail", e);
        }
    }

    /* renamed from: a */
    public final void mo64486a(View view, int i) {
        C7573i.m23587b(view, "eggView");
        m80744i();
    }

    /* renamed from: a */
    public final void mo64487a(View view, View view2) {
        C7573i.m23587b(view2, "eggLayout");
        m80744i();
    }

    /* renamed from: b */
    public final void mo64490b(View view, View view2) {
        C7573i.m23587b(view, "eggView");
        C7573i.m23587b(view2, "eggLayout");
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        view.setLayoutParams(layoutParams);
    }
}
