package com.p280ss.android.ugc.aweme.journey;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.keva.Keva;
import com.bytedance.lighten.core.C12133n;
import com.p280ss.android.common.util.C19290j;
import com.p280ss.android.ugc.aweme.app.DeepLinkHandlerActivity;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p306k.C6870b;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.journey.C32247k.C32248a;
import com.p280ss.android.ugc.aweme.language.C32326h;
import com.p280ss.android.ugc.aweme.language.C7120e;
import com.p280ss.android.ugc.aweme.language.I18nManagerService;
import com.p280ss.android.ugc.aweme.p304ab.C6857a;
import com.p280ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.greenrobot.eventbus.C7709l;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: com.ss.android.ugc.aweme.journey.NewUserJourneyActivity */
public final class NewUserJourneyActivity extends AmeActivity {

    /* renamed from: g */
    public static int f84156g = -1;

    /* renamed from: h */
    public static final C32223a f84157h = new C32223a(null);

    /* renamed from: a */
    public int f84158a = -1;

    /* renamed from: b */
    public C32244h f84159b;

    /* renamed from: c */
    public C7120e f84160c;

    /* renamed from: d */
    public boolean f84161d;

    /* renamed from: e */
    public boolean f84162e = true;

    /* renamed from: f */
    public boolean f84163f;

    /* renamed from: i */
    private Intent f84164i;

    /* renamed from: com.ss.android.ugc.aweme.journey.NewUserJourneyActivity$a */
    public static final class C32223a {
        private C32223a() {
        }

        /* renamed from: a */
        public static void m104521a(int i) {
            NewUserJourneyActivity.f84156g = i;
        }

        public /* synthetic */ C32223a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public final boolean mo83370a(Activity activity) {
            C7573i.m23587b(activity, "activity");
            if (activity.getIntent().getBooleanExtra("new_user_journey", false) || !C32250l.f84286c.mo83470c() || C32250l.f84285b) {
                return false;
            }
            m104521a(0);
            m104522a(activity, false);
            return true;
        }

        /* renamed from: a */
        public static void m104522a(Activity activity, boolean z) {
            C7573i.m23587b(activity, "activity");
            C6857a.m21312e().mo16818a();
            C6857a.m21312e().mo16824b();
            if (!C6870b.m21395c()) {
                Intent intent = new Intent(activity, NewUserJourneyActivity.class);
                intent.putExtra("from_main", z);
                if (!z) {
                    intent.putExtra("deeplink_intent_about_welcome_screen", activity.getIntent());
                    activity.finish();
                }
                activity.overridePendingTransition(0, 0);
                activity.startActivityForResult(intent, 18);
            }
        }

        /* renamed from: a */
        public static void m104523a(Intent intent, Activity activity) {
            C7573i.m23587b(activity, "activity");
            if (!(intent == null || intent.getData() == null)) {
                Intent intent2 = new Intent(activity, DeepLinkHandlerActivity.class);
                intent2.setFlags(268435456);
                intent2.setAction("android.intent.action.VIEW");
                C19290j jVar = new C19290j(intent.getData().toString());
                jVar.mo51188a("random", new Random(1000).toString());
                intent2.setData(Uri.parse(jVar.mo51184a()));
                intent2.putExtras(intent).putExtra("new_user_journey", true);
                if (intent.getBooleanExtra("from_task", false)) {
                    activity.setResult(-1, intent2);
                    return;
                }
                activity.startActivity(intent2);
            }
        }
    }

    /* renamed from: a */
    public static final void m104512a(Activity activity, boolean z) {
        C32223a.m104522a(activity, true);
    }

    /* renamed from: a */
    public static final boolean m104519a(Activity activity) {
        return f84157h.mo83370a(activity);
    }

    public final boolean isRegisterEventBus() {
        return true;
    }

    public final void onBackPressed() {
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.journey.NewUserJourneyActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.journey.NewUserJourneyActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.journey.NewUserJourneyActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onDestroy() {
        C32250l.f84285b = true;
        super.onDestroy();
    }

    public final void setStatusBarColor() {
        super.setStatusBarColor();
        if (VERSION.SDK_INT >= 23) {
            C23487o.m77155c((Activity) this);
        }
    }

    public final boolean useImmerseMode() {
        if (VERSION.SDK_INT >= 21) {
            return true;
        }
        return false;
    }

    public final void finish() {
        C32250l.f84285b = true;
        C32223a.m104523a(this.f84164i, (Activity) this);
        super.finish();
        overridePendingTransition(0, R.anim.an);
    }

    public final int getStatusBarColor() {
        if (VERSION.SDK_INT >= 23) {
            return getResources().getColor(R.color.az3);
        }
        return super.getStatusBarColor();
    }

    /* renamed from: b */
    private final boolean m104520b() {
        CharSequence charSequence = "en";
        Resources resources = getResources();
        C7573i.m23582a((Object) resources, "resources");
        Locale locale = resources.getConfiguration().locale;
        C7573i.m23582a((Object) locale, "resources.configuration.locale");
        if (TextUtils.equals(charSequence, locale.getLanguage()) && TextUtils.equals("MY", C32326h.m104885g())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private final boolean m104518a() {
        if (this.f84160c != null) {
            C7120e eVar = this.f84160c;
            if (eVar == null) {
                C7573i.m23580a();
            }
            CharSequence g = eVar.mo18536g();
            C7120e currentI18nItem = ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getCurrentI18nItem(this);
            C7573i.m23582a((Object) currentI18nItem, "ServiceManager.get().get….getCurrentI18nItem(this)");
            if (!TextUtils.equals(g, currentI18nItem.mo18536g())) {
                return true;
            }
        }
        return false;
    }

    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        m104513a(intent);
    }

    @C7709l(mo20400a = ThreadMode.MAIN)
    public final void onEvent(C32256n nVar) {
        C7573i.m23587b(nVar, "event");
        m104517a(nVar.f84300a);
    }

    /* renamed from: a */
    private final void m104513a(Intent intent) {
        Intent intent2;
        if (intent != null) {
            intent2 = (Intent) intent.getParcelableExtra("deeplink_intent_about_welcome_screen");
        } else {
            intent2 = null;
        }
        if (intent2 != null) {
            this.f84164i = intent2;
            if (!C32248a.m104747a()) {
                C32248a.m104745a((Context) this);
            }
        }
    }

    @C7709l(mo20400a = ThreadMode.MAIN, mo20401b = true)
    public final void onEvent(C32244h hVar) {
        List<C32246j> list;
        C7573i.m23587b(hVar, "event");
        int b = (int) C9738o.m28708b((Context) this, 28.0f);
        C32245i iVar = hVar.f84273a;
        if (iVar != null) {
            list = iVar.f84275a;
        } else {
            list = null;
        }
        if (list != null && (!list.isEmpty())) {
            Fragment a = getSupportFragmentManager().mo2642a((int) R.id.aoy);
            if (this.f84158a <= 0) {
                for (C32246j jVar : list) {
                    String str = jVar.f84279c;
                    if (str == null) {
                        str = "";
                    }
                    C12133n.m35301a(str).mo29841a((FragmentActivity) this).mo29836a(b, b).mo29854b();
                }
            } else if (this.f84158a == 1 && (a instanceof InfoCollectionFragment)) {
                InfoCollectionFragment infoCollectionFragment = (InfoCollectionFragment) a;
                if (infoCollectionFragment.f84094g == null) {
                    infoCollectionFragment.f84094g = list;
                }
            }
        }
        this.f84159b = hVar;
    }

    public final void onCreate(Bundle bundle) {
        C22984d dVar;
        String str;
        boolean z;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.journey.NewUserJourneyActivity", "onCreate", true);
        super.onCreate(bundle);
        if (C32250l.m104755f() == null) {
            StringBuilder sb = new StringBuilder();
            try {
                Activity[] activityStack = ActivityStack.getActivityStack();
                if (activityStack != null) {
                    if (activityStack.length == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        for (Activity activity : activityStack) {
                            sb.append(activity.getClass().getName());
                        }
                    }
                }
            } catch (Exception unused) {
            }
            str = "start_path";
            dVar = new C22984d().mo59970a("path", f84156g).mo59973a("debuginfo", sb.toString());
        } else {
            str = "absdk_result";
            dVar = C32250l.m104755f();
            if (dVar == null) {
                C7573i.m23580a();
            }
        }
        C6907h.m21524a(str, (Map) dVar.f60753a);
        this.f84163f = false;
        this.f84162e = getIntent().getBooleanExtra("from_main", true);
        if (!this.f84162e) {
            C32250l.m104750a(1);
        }
        C32250l.f84285b = false;
        m104513a(getIntent());
        Keva.getRepo("new_user_journey").storeBoolean("new_user_journey_show", true);
        setContentView((int) R.layout.ch);
        m104517a((Boolean) null);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.journey.NewUserJourneyActivity", "onCreate", false);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x010b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m104517a(java.lang.Boolean r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 == 0) goto L_0x000e
            boolean r1 = r6.f84161d
            if (r1 != 0) goto L_0x000e
            boolean r7 = r7.booleanValue()
            r7 = r7 ^ r0
            r6.f84161d = r7
        L_0x000e:
            int r7 = r6.f84158a
            int r7 = r7 + r0
            r6.f84158a = r7
            int r7 = r6.f84158a
            r1 = 2
            r2 = 0
            r3 = 0
            switch(r7) {
                case 0: goto L_0x011b;
                case 1: goto L_0x00e1;
                case 2: goto L_0x00b5;
                case 3: goto L_0x0098;
                case 4: goto L_0x0034;
                default: goto L_0x001b;
            }
        L_0x001b:
            boolean r7 = r6.m104518a()
            if (r7 == 0) goto L_0x0158
            boolean r7 = r6.f84163f
            if (r7 != 0) goto L_0x0158
            r6.f84163f = r0
            com.ss.android.ugc.aweme.i18n.language.a.e r7 = com.p280ss.android.ugc.aweme.i18n.language.p1303a.C30468e.m99511a()
            com.ss.android.ugc.aweme.language.e r0 = r6.f84160c
            if (r0 != 0) goto L_0x0126
            kotlin.jvm.internal.C7573i.m23580a()
            goto L_0x0126
        L_0x0034:
            com.ss.android.ugc.aweme.journey.JourneyVideoFragment r7 = new com.ss.android.ugc.aweme.journey.JourneyVideoFragment
            r7.<init>()
            boolean r4 = r6.m104518a()
            if (r4 != 0) goto L_0x004b
            com.ss.android.ugc.aweme.interest.i r4 = new com.ss.android.ugc.aweme.interest.i
            boolean r5 = r6.f84161d
            r0 = r0 ^ r5
            r4.<init>(r0)
            com.p280ss.android.ugc.aweme.utils.C42961az.m136380a(r4)
            goto L_0x0092
        L_0x004b:
            com.ss.android.ugc.aweme.language.e r0 = r6.f84160c
            if (r0 != 0) goto L_0x0052
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0052:
            java.lang.String r0 = r0.mo18530a()
            if (r0 != 0) goto L_0x0059
            goto L_0x0086
        L_0x0059:
            int r4 = r0.hashCode()
            r5 = 104135475(0x634fb33, float:3.403879E-35)
            if (r4 == r5) goto L_0x0077
            r5 = 1978411730(0x75ec2ad2, float:5.9875516E32)
            if (r4 == r5) goto L_0x0068
            goto L_0x0086
        L_0x0068:
            java.lang.String r4 = "zh-Hant-TW"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0086
            java.lang.String r0 = "向上滑動"
            java.lang.String r4 = "我們會顯示使用您所選語言製作的影片"
            java.lang.String r5 = "開始觀看"
            goto L_0x008c
        L_0x0077:
            java.lang.String r4 = "ms-MY"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0086
            java.lang.String r0 = "Leret ke atas"
            java.lang.String r4 = "Teruskan menemui lebih banyak video"
            java.lang.String r5 = "Mula menonton"
            goto L_0x008c
        L_0x0086:
            java.lang.String r0 = "Swipe up"
            java.lang.String r4 = "Keep discovering more videos"
            java.lang.String r5 = "Start watching"
        L_0x008c:
            r7.f84144l = r0
            r7.f84145m = r4
            r7.f84146n = r5
        L_0x0092:
            android.support.v4.app.Fragment r7 = (android.support.p022v4.app.Fragment) r7
            r6.m104514a(r7, false)
            return
        L_0x0098:
            boolean r7 = r6.m104520b()
            if (r7 == 0) goto L_0x00b1
            boolean r7 = r6.f84162e
            if (r7 == 0) goto L_0x00b1
            com.ss.android.ugc.aweme.journey.InfoCollectionFragment r7 = new com.ss.android.ugc.aweme.journey.InfoCollectionFragment
            r7.<init>()
            int r0 = r6.f84158a
            r7.f84092e = r0
            android.support.v4.app.Fragment r7 = (android.support.p022v4.app.Fragment) r7
            r6.m104514a(r7, false)
            return
        L_0x00b1:
            r6.m104517a((java.lang.Boolean) null)
            return
        L_0x00b5:
            com.ss.android.ugc.aweme.journey.h r7 = r6.f84159b
            if (r7 == 0) goto L_0x00c0
            com.ss.android.ugc.aweme.journey.g r7 = r7.f84274b
            if (r7 == 0) goto L_0x00c0
            java.util.List<com.ss.android.ugc.aweme.journey.e> r7 = r7.f84271a
            goto L_0x00c1
        L_0x00c0:
            r7 = r3
        L_0x00c1:
            if (r7 == 0) goto L_0x00dd
            com.ss.android.ugc.aweme.journey.InfoCollectionFragment r7 = new com.ss.android.ugc.aweme.journey.InfoCollectionFragment
            r7.<init>()
            int r0 = r6.f84158a
            r7.f84092e = r0
            com.ss.android.ugc.aweme.journey.h r0 = r6.f84159b
            if (r0 != 0) goto L_0x00d3
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x00d3:
            com.ss.android.ugc.aweme.journey.g r0 = r0.f84274b
            r7.f84093f = r0
            android.support.v4.app.Fragment r7 = (android.support.p022v4.app.Fragment) r7
            r6.m104514a(r7, false)
            return
        L_0x00dd:
            r6.m104517a((java.lang.Boolean) null)
            return
        L_0x00e1:
            com.ss.android.ugc.aweme.journey.h r7 = r6.f84159b
            if (r7 == 0) goto L_0x00ec
            com.ss.android.ugc.aweme.journey.i r7 = r7.f84273a
            if (r7 == 0) goto L_0x00ec
            java.util.List<com.ss.android.ugc.aweme.journey.j> r7 = r7.f84275a
            goto L_0x00ed
        L_0x00ec:
            r7 = r3
        L_0x00ed:
            if (r7 != 0) goto L_0x00fc
            com.ss.android.ugc.aweme.journey.l r4 = com.p280ss.android.ugc.aweme.journey.C32250l.f84286c
            boolean r4 = r4.mo83472e()
            if (r4 == 0) goto L_0x00f8
            goto L_0x00fc
        L_0x00f8:
            r6.m104517a((java.lang.Boolean) null)
            return
        L_0x00fc:
            com.ss.android.ugc.aweme.journey.InfoCollectionFragment r0 = new com.ss.android.ugc.aweme.journey.InfoCollectionFragment
            r0.<init>()
            int r4 = r6.f84158a
            r0.f84092e = r4
            r0.f84094g = r7
            com.ss.android.ugc.aweme.journey.h r7 = r6.f84159b
            if (r7 == 0) goto L_0x0112
            com.ss.android.ugc.aweme.journey.i r7 = r7.f84273a
            if (r7 == 0) goto L_0x0112
            boolean r7 = r7.f84276b
            goto L_0x0113
        L_0x0112:
            r7 = 0
        L_0x0113:
            r0.f84099l = r7
            android.support.v4.app.Fragment r0 = (android.support.p022v4.app.Fragment) r0
            r6.m104514a(r0, false)
            return
        L_0x011b:
            com.ss.android.ugc.aweme.journey.SloganFragment r7 = new com.ss.android.ugc.aweme.journey.SloganFragment
            r7.<init>()
            android.support.v4.app.Fragment r7 = (android.support.p022v4.app.Fragment) r7
            r6.m104514a(r7, r0)
            return
        L_0x0126:
            java.lang.String r0 = r0.mo18530a()
            com.ss.android.ugc.aweme.language.e r1 = r6.f84160c
            if (r1 != 0) goto L_0x0131
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0131:
            java.lang.String r1 = r1.mo18536g()
            r4 = r6
            android.content.Context r4 = (android.content.Context) r4
            r7.mo80141a(r0, r1, r4)
            com.ss.android.ugc.aweme.IAccountUserService r7 = com.p280ss.android.ugc.aweme.account.C21115b.m71197a()
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.language.I18nManagerService> r1 = com.p280ss.android.ugc.aweme.language.I18nManagerService.class
            java.lang.Object r0 = r0.getService(r1)
            java.lang.String r1 = "ServiceManager.get().get…nagerService::class.java)"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            com.ss.android.ugc.aweme.language.I18nManagerService r0 = (com.p280ss.android.ugc.aweme.language.I18nManagerService) r0
            java.lang.String r0 = r0.getAppLanguage()
            r7.updateLanguage(r3, r0, r2)
            return
        L_0x0158:
            boolean r7 = r6.isFinishing()
            if (r7 != 0) goto L_0x0161
            r6.finish()
        L_0x0161:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.journey.NewUserJourneyActivity.m104517a(java.lang.Boolean):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m104514a(Fragment fragment, boolean z) {
        int i;
        C7573i.m23587b(fragment, "fragment");
        C0633q a = getSupportFragmentManager().mo2645a();
        C7573i.m23582a((Object) a, "supportFragmentManager.beginTransaction()");
        if (z) {
            i = 0;
        } else {
            i = R.anim.aq;
        }
        a.mo2583a(i, (int) R.anim.ar);
        a.mo2599b(R.id.aoy, fragment);
        a.mo2606d();
    }
}
