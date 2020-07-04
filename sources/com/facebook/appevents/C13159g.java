package com.facebook.appevents;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.C13499h;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger.FlushBehavior;
import com.facebook.appevents.internal.C13165a;
import com.facebook.internal.C13876aa;
import com.facebook.internal.C13920m;
import com.facebook.internal.C13926o;
import com.facebook.internal.C13949t;
import com.facebook.internal.C13967z;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

/* renamed from: com.facebook.appevents.g */
class C13159g {

    /* renamed from: a */
    public static final String f34858a = C13159g.class.getCanonicalName();

    /* renamed from: d */
    private static ScheduledThreadPoolExecutor f34859d;

    /* renamed from: e */
    private static FlushBehavior f34860e = FlushBehavior.AUTO;

    /* renamed from: f */
    private static final Object f34861f = new Object();

    /* renamed from: g */
    private static String f34862g;

    /* renamed from: h */
    private static boolean f34863h;

    /* renamed from: i */
    private static String f34864i;

    /* renamed from: b */
    private final String f34865b;

    /* renamed from: c */
    private final C13117a f34866c;

    /* renamed from: c */
    static void m38469c() {
        C13149d.m38447a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo32330a(String str, Bundle bundle) {
        m38465a(str, null, bundle, false, C13165a.m38484b());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo32329a(String str, double d, Bundle bundle) {
        m38465a(str, Double.valueOf(d), bundle, false, C13165a.m38484b());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo32331a(String str, Double d, Bundle bundle) {
        m38465a(str, d, bundle, true, C13165a.m38484b());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo32332a(String str, BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (bigDecimal != null && currency != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = bundle;
            bundle2.putString("fb_currency", currency.getCurrencyCode());
            m38465a(str, Double.valueOf(bigDecimal.doubleValue()), bundle2, true, C13165a.m38484b());
        }
    }

    /* renamed from: b */
    static void m38467b() {
        C13149d.m38450a(C13162h.EXPLICIT);
    }

    /* renamed from: a */
    static FlushBehavior m38459a() {
        FlushBehavior flushBehavior;
        synchronized (f34861f) {
            flushBehavior = f34860e;
        }
        return flushBehavior;
    }

    /* renamed from: d */
    static String m38470d() {
        String str;
        synchronized (f34861f) {
            str = f34864i;
        }
        return str;
    }

    /* renamed from: f */
    static Executor m38472f() {
        if (f34859d == null) {
            m38473g();
        }
        return f34859d;
    }

    /* renamed from: h */
    private static void m38474h() {
        if (m38459a() != FlushBehavior.EXPLICIT_ONLY) {
            C13149d.m38450a(C13162h.EAGER_FLUSHING_EVENT);
        }
    }

    /* renamed from: e */
    static String m38471e() {
        return C7285c.m22838a(C13499h.m39721g(), "com.facebook.sdk.appEventPreferences", 0).getString("install_referrer", null);
    }

    /* renamed from: g */
    private static void m38473g() {
        synchronized (f34861f) {
            if (f34859d == null) {
                f34859d = new ScheduledThreadPoolExecutor(1);
                f34859d.scheduleAtFixedRate(new Runnable() {
                    public final void run() {
                        HashSet<String> hashSet = new HashSet<>();
                        for (C13117a b : C13149d.m38451b()) {
                            hashSet.add(b.mo32287b());
                        }
                        for (String a : hashSet) {
                            C13926o.m41099a(a, true);
                        }
                    }
                }, 0, 86400, TimeUnit.SECONDS);
            }
        }
    }

    /* renamed from: b */
    private static void m38468b(String str) {
        C13949t.m41130a(LoggingBehavior.DEVELOPER_ERRORS, "AppEvents", str);
    }

    /* renamed from: a */
    static String m38460a(Context context) {
        if (f34862g == null) {
            synchronized (f34861f) {
                if (f34862g == null) {
                    String string = C7285c.m22838a(context, "com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null);
                    f34862g = string;
                    if (string == null) {
                        StringBuilder sb = new StringBuilder("XZ");
                        sb.append(UUID.randomUUID().toString());
                        f34862g = sb.toString();
                        C7285c.m22838a(context, "com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", f34862g).apply();
                    }
                }
            }
        }
        return f34862g;
    }

    /* renamed from: a */
    static void m38464a(String str) {
        SharedPreferences a = C7285c.m22838a(C13499h.m39721g(), "com.facebook.sdk.appEventPreferences", 0);
        if (str != null) {
            a.edit().putString("install_referrer", str).apply();
        }
    }

    /* renamed from: a */
    static void m38462a(final Context context, String str) {
        if (C13499h.m39728n()) {
            final C13159g gVar = new C13159g(context, str, (AccessToken) null);
            f34859d.execute(new Runnable() {
                public final void run() {
                    Bundle bundle = new Bundle();
                    String[] strArr = {"com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.all.All", "com.android.billingclient.api.BillingClient", "com.android.vending.billing.IInAppBillingService"};
                    String[] strArr2 = {"core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included"};
                    int i = 0;
                    for (int i2 = 0; i2 < 10; i2++) {
                        String str = strArr[i2];
                        String str2 = strArr2[i2];
                        try {
                            Class.forName(str);
                            bundle.putInt(str2, 1);
                            i |= 1 << i2;
                        } catch (ClassNotFoundException unused) {
                        }
                    }
                    SharedPreferences a = C7285c.m22838a(context, "com.facebook.sdk.appEventPreferences", 0);
                    if (a.getInt("kitsBitmask", 0) != i) {
                        a.edit().putInt("kitsBitmask", i).apply();
                        gVar.mo32331a("fb_sdk_initialize", (Double) null, bundle);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    static void m38461a(Application application, String str) {
        if (C13499h.m39710a()) {
            C13120b.m38368a();
            C13192m.m38565a();
            if (str == null) {
                str = C13499h.m39725k();
            }
            C13499h.m39705a((Context) application, str);
            C13165a.m38482a(application, str);
            return;
        }
        throw new FacebookException("The Facebook sdk must be initialized before calling activateApp");
    }

    /* renamed from: a */
    private static void m38463a(AppEvent appEvent, C13117a aVar) {
        C13149d.m38449a(aVar, appEvent);
        if (!appEvent.getIsImplicit() && !f34863h) {
            if (appEvent.getName().equals("fb_mobile_activate_app")) {
                f34863h = true;
                return;
            }
            C13949t.m41130a(LoggingBehavior.APP_EVENTS, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
        }
    }

    C13159g(Context context, String str, AccessToken accessToken) {
        this(C13967z.m41261c(context), str, accessToken);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo32333a(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        m38466a(bigDecimal, currency, bundle, true);
    }

    C13159g(String str, String str2, AccessToken accessToken) {
        C13876aa.m40975a();
        this.f34865b = str;
        if (accessToken == null) {
            accessToken = AccessToken.m38225a();
        }
        if (!AccessToken.m38232b() || (str2 != null && !str2.equals(accessToken.f34630h))) {
            if (str2 == null) {
                str2 = C13967z.m41219a(C13499h.m39721g());
            }
            this.f34866c = new C13117a(null, str2);
        } else {
            this.f34866c = new C13117a(accessToken);
        }
        m38473g();
    }

    /* renamed from: a */
    private void m38466a(BigDecimal bigDecimal, Currency currency, Bundle bundle, boolean z) {
        if (bigDecimal == null) {
            m38468b("purchaseAmount cannot be null");
        } else if (currency == null) {
            m38468b("currency cannot be null");
        } else {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = bundle;
            bundle2.putString("fb_currency", currency.getCurrencyCode());
            m38465a("fb_mobile_purchase", Double.valueOf(bigDecimal.doubleValue()), bundle2, true, C13165a.m38484b());
            m38474h();
        }
    }

    /* renamed from: a */
    private void m38465a(String str, Double d, Bundle bundle, boolean z, UUID uuid) {
        if (str != null && !str.isEmpty()) {
            if (C13920m.m41091a("app_events_killswitch", C13499h.m39725k(), false)) {
                C13949t.m41131a(LoggingBehavior.APP_EVENTS, "AppEvents", "KillSwitch is enabled and fail to log app event: %s", str);
                return;
            }
            try {
                AppEvent appEvent = new AppEvent(this.f34865b, str, d, bundle, z, C13165a.m38483a(), uuid);
                m38463a(appEvent, this.f34866c);
            } catch (JSONException e) {
                C13949t.m41131a(LoggingBehavior.APP_EVENTS, "AppEvents", "JSON encoding for app event failed: '%s'", e.toString());
            } catch (FacebookException e2) {
                C13949t.m41131a(LoggingBehavior.APP_EVENTS, "AppEvents", "Invalid app event: %s", e2.toString());
            }
        }
    }
}
