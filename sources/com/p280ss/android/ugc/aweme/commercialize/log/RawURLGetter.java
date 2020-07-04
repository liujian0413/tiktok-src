package com.p280ss.android.ugc.aweme.commercialize.log;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import bolts.C1592h;
import com.bytedance.common.p479c.C9684b;
import com.bytedance.common.utility.C6319n;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.CronetIOException;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.retrofit2.p264b.C6448aa;
import com.bytedance.retrofit2.p264b.C6450ac;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6461l;
import com.bytedance.retrofit2.p637a.C12461b;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.http.legacy.C6809a;
import com.p280ss.android.http.legacy.client.HttpResponseException;
import com.p280ss.android.http.legacy.p296a.C19561a;
import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ugc.aweme.app.C22689a.C22704b;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference0;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.RawURLGetter */
public final class RawURLGetter {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f65745a = {C7575l.m23601a((PropertyReference0) new PropertyReference0Impl(C7575l.m23595a(RawURLGetter.class), "newUa", "<v#0>"))};

    /* renamed from: b */
    public static final RawURLGetter f65746b = new RawURLGetter();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final RawUrlApi f65747c = ((RawUrlApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C19223b.f51890e).mo26431b(false).mo26430a().mo26435a(RawUrlApi.class));

    /* renamed from: d */
    private static String f65748d;

    /* renamed from: e */
    private static boolean f65749e;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.log.RawURLGetter$RawUrlApi */
    public interface RawUrlApi {
        @C6457h
        @C6448aa(mo15735a = "vas_ad_track")
        C18253l<String> doGet(@C6450ac String str, @C6461l List<C12461b> list);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.log.RawURLGetter$a */
    public interface C24924a {
        /* renamed from: a */
        void mo65177a(int i, boolean z, Exception exc);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.log.RawURLGetter$b */
    static final class C24925b extends Lambda implements C7561a<String> {

        /* renamed from: a */
        public static final C24925b f65750a = new C24925b();

        C24925b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m81773a();
        }

        /* renamed from: a */
        private static String m81773a() {
            boolean z;
            String a = RawURLGetter.m81765a(C6399b.m19921a(), (WebView) null);
            CharSequence charSequence = a;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                a = System.getProperty("http.agent");
                if (a == null) {
                    return "";
                }
            }
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.log.RawURLGetter$c */
    static final class C24926c<V> implements Callable<C7581n> {

        /* renamed from: a */
        final /* synthetic */ String f65751a;

        /* renamed from: b */
        final /* synthetic */ C24924a f65752b;

        C24926c(String str, C24924a aVar) {
            this.f65751a = str;
            this.f65752b = aVar;
        }

        public final /* synthetic */ Object call() {
            m81774a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m81774a() {
            boolean z;
            Iterable<C6809a> iterable;
            String a = RawURLGetter.m81766a("other");
            if (a.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                iterable = null;
            } else {
                iterable = C7525m.m23466c(new C19561a("User-Agent", a));
            }
            ArrayList arrayList = new ArrayList();
            if (iterable != null) {
                for (C6809a aVar : iterable) {
                    arrayList.add(new C12461b(aVar.mo16635a(), aVar.mo16636b()));
                }
            }
            try {
                RawURLGetter.f65747c.doGet(this.f65751a, arrayList).get();
                RawURLGetter.m81768a(this.f65752b, C34943c.f91127w, true, null);
            } catch (HttpResponseException e) {
                RawURLGetter.m81768a(this.f65752b, e.getStatusCode(), false, e);
            } catch (CronetIOException e2) {
                RawURLGetter.m81768a(this.f65752b, e2.getStatusCode(), false, e2);
            } catch (Exception e3) {
                RawURLGetter.m81768a(this.f65752b, 0, false, e3);
            }
        }
    }

    private RawURLGetter() {
    }

    /* renamed from: a */
    public static final String m81764a() {
        return m81766a("other");
    }

    /* renamed from: b */
    public static final String m81771b(String str) throws HttpResponseException, NullPointerException, Exception {
        boolean z;
        if (str != null) {
            List<C6809a> list = null;
            String a = m81766a("other");
            if (a.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                list = C7525m.m23466c(new C19561a("User-Agent", a));
            }
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                for (C6809a aVar : list) {
                    arrayList.add(new C12461b(aVar.mo16635a(), aVar.mo16636b()));
                }
            }
            return (String) f65747c.doGet(str, arrayList).get();
        }
        throw new NullPointerException("url is null");
    }

    /* renamed from: a */
    public static final String m81766a(String str) {
        C7573i.m23587b(str, "from");
        SharePrefCache inst = SharePrefCache.inst();
        C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
        SharedPreferences sharePref = inst.getSharePref();
        String string = sharePref.getString("ad_user_agent_sp", null);
        C7541d a = C7546e.m23569a(C24925b.f65750a);
        boolean z = false;
        C7595j jVar = f65745a[0];
        CharSequence charSequence = string;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        }
        if (z) {
            C7573i.m23582a((Object) sharePref, "sp");
            if (m81770a(sharePref, str)) {
                String property = System.getProperty("http.agent");
                if (property == null) {
                    property = "";
                }
                return property;
            }
            String str2 = (String) a.getValue();
            sharePref.edit().putString("ad_user_agent_sp", (String) a.getValue()).apply();
            return str2;
        }
        C7121a.m22248b().mo18559a(new RawURLGetter$getAdUserAgent$1(sharePref, a, jVar)).mo18560a();
        return string;
    }

    /* renamed from: a */
    public static final void m81769a(String str, C24924a aVar) {
        C7573i.m23587b(str, "url");
        C1592h.m7855a((Callable<TResult>) new C24926c<TResult>(str, aVar), (Executor) C7258h.m22730c());
    }

    /* renamed from: a */
    public static String m81765a(Context context, WebView webView) {
        if (!C6319n.m19593a(f65748d)) {
            return f65748d;
        }
        String a = C9684b.m28615a(context);
        f65748d = a;
        if (!C6319n.m19593a(a)) {
            return f65748d;
        }
        if (!f65749e && context != null && (context instanceof Activity)) {
            f65749e = true;
            try {
                WebView webView2 = new WebView(context);
                WebSettings settings = webView2.getSettings();
                C7573i.m23582a((Object) settings, "webview.settings");
                f65748d = settings.getUserAgentString();
                webView2.destroy();
            } catch (Throwable unused) {
            }
        }
        return f65748d;
    }

    /* renamed from: a */
    private static boolean m81770a(SharedPreferences sharedPreferences, String str) {
        if (!TextUtils.equals(str, C22704b.f60414c)) {
            return false;
        }
        boolean z = sharedPreferences.getBoolean("ad_user_agent_has_read_sp", false);
        sharedPreferences.edit().putBoolean("ad_user_agent_has_read_sp", true).apply();
        if (!z) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m81768a(C24924a aVar, int i, boolean z, Exception exc) {
        if (aVar != null) {
            try {
                aVar.mo65177a(i, z, exc);
            } catch (Exception unused) {
            }
        }
    }
}
