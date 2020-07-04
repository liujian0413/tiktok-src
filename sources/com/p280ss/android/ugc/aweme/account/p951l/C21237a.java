package com.p280ss.android.ugc.aweme.account.p951l;

import android.content.Context;
import android.os.Build.VERSION;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.bytedance.ies.abmock.C10292j;
import com.bytedance.ies.abmock.C6384b;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21101a;
import com.p280ss.android.ugc.aweme.account.p950k.C21227b;
import com.p280ss.android.ugc.aweme.account.util.C22328g;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.settings.KeepCookieSettings;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.l.a */
public final class C21237a {

    /* renamed from: a */
    public static final C21237a f57048a = new C21237a();

    /* renamed from: b */
    private static final boolean f57049b = C7163a.m22363a();

    private C21237a() {
    }

    /* renamed from: a */
    public static final boolean m71491a() {
        if (!C10292j.m30480a().mo25016a(KeepCookieSettings.class, "keep_lobby_cookies", C6384b.m19835a().mo15294c().getKeepLobbyCookies())) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m71492b() {
        IESSettingsProxy a = C30199h.m98861a();
        C7573i.m23582a((Object) a, "SettingsReader.get()");
        if (!a.getKeepCookies().booleanValue() || !C21671bd.m72539g()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final void m71490a(Context context) {
        if (context != null && m71492b()) {
            JSONObject b = C21101a.m71159a().mo56942a("enter_from", "normal").mo56943b();
            C7573i.m23582a((Object) b, "EventJsonBuilder.newBuil…_from\", \"normal\").build()");
            C21227b.m71450a("monitor_clear_cookie", 1, b);
            if (VERSION.SDK_INT < 21) {
                CookieSyncManager.createInstance(context);
            }
            CookieManager a = C22328g.m73924a();
            if (a != null) {
                a.removeAllCookie();
                if (VERSION.SDK_INT >= 21) {
                    a.flush();
                    return;
                }
                CookieSyncManager.getInstance().sync();
            }
        }
    }
}
