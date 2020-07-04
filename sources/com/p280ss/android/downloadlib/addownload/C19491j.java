package com.p280ss.android.downloadlib.addownload;

import android.content.Context;
import android.text.TextUtils;
import com.p280ss.android.download.api.model.C19391a;
import com.p280ss.android.download.api.model.C19391a.C19392a;
import com.p280ss.android.download.api.p857a.C19372a;
import com.p280ss.android.download.api.p857a.C19373b;
import com.p280ss.android.download.api.p857a.C19374c;
import com.p280ss.android.download.api.p857a.C19375d;
import com.p280ss.android.download.api.p857a.C19376e;
import com.p280ss.android.download.api.p857a.C19377f;
import com.p280ss.android.download.api.p857a.C19378g;
import com.p280ss.android.download.api.p857a.C19379h;
import com.p280ss.android.download.api.p857a.C19380i;
import com.p280ss.android.download.api.p857a.C19383l;
import com.p280ss.android.downloadlib.p862a.C19449a;
import com.p280ss.android.downloadlib.p862a.C19454c;
import com.p280ss.android.downloadlib.p868c.C19510a;
import com.p280ss.android.downloadlib.p868c.C19523h;
import com.p280ss.android.socialbase.appdownloader.AppDownloader;
import com.p280ss.android.socialbase.appdownloader.depend.IAppDownloadMonitorListener;
import org.json.JSONObject;

/* renamed from: com.ss.android.downloadlib.addownload.j */
public final class C19491j {

    /* renamed from: a */
    private static Context f52769a;

    /* renamed from: b */
    private static C19375d f52770b;

    /* renamed from: c */
    private static C19373b f52771c;

    /* renamed from: d */
    private static C19379h f52772d;

    /* renamed from: e */
    private static C19376e f52773e;

    /* renamed from: f */
    private static C19377f f52774f;

    /* renamed from: g */
    private static C19378g f52775g;

    /* renamed from: h */
    private static C19391a f52776h;

    /* renamed from: i */
    private static C19372a f52777i;

    /* renamed from: j */
    private static IAppDownloadMonitorListener f52778j;

    /* renamed from: k */
    private static C19374c f52779k;

    /* renamed from: l */
    private static C19380i f52780l;

    /* renamed from: m */
    private static C19383l f52781m;

    /* renamed from: n */
    private static String f52782n;

    /* renamed from: b */
    public static C19375d m64220b() {
        return f52770b;
    }

    /* renamed from: e */
    public static C19376e m64224e() {
        return f52773e;
    }

    /* renamed from: f */
    public static C19377f m64225f() {
        return C19494k.m64241a();
    }

    /* renamed from: h */
    public static C19380i m64227h() {
        return f52780l;
    }

    /* renamed from: k */
    public static C19372a m64230k() {
        return f52777i;
    }

    /* renamed from: l */
    public static C19374c m64231l() {
        return f52779k;
    }

    /* renamed from: r */
    public static C19383l m64237r() {
        return f52781m;
    }

    /* renamed from: a */
    public static void m64217a(IAppDownloadMonitorListener iAppDownloadMonitorListener) {
        f52778j = iAppDownloadMonitorListener;
    }

    /* renamed from: a */
    public static void m64216a(C19391a aVar) {
        f52776h = aVar;
    }

    /* renamed from: a */
    public static void m64218a(String str) {
        AppDownloader.getInstance().setFileProviderAuthority(str);
    }

    /* renamed from: a */
    private static void m64219a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("download_notification_config")) {
            String obj = jSONObject.opt("download_notification_config").toString();
            if (!TextUtils.isEmpty(obj)) {
                try {
                    JSONObject jSONObject2 = new JSONObject(obj);
                    AppDownloader.getInstance().minResumeFailedIntervalTime = jSONObject2.optLong("min_resume_failed_interval_time");
                    AppDownloader.getInstance().minResumeUnInstallIntervalTime = jSONObject2.optLong("min_resume_uninstall_interval_time");
                    AppDownloader.getInstance().setMaxResumeFailedNotificationShowCount(jSONObject2.optInt("max_resume_failed_notification_show_count"));
                    AppDownloader.getInstance().setMaxResumeUnInstallNotificationShowCount(jSONObject2.optInt("max_resume_uninstall_notification_show_count"));
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static Context m64206a() {
        if (f52769a != null) {
            return f52769a;
        }
        throw new IllegalArgumentException("Context is null");
    }

    /* renamed from: c */
    public static C19373b m64222c() {
        if (f52771c == null) {
            f52771c = new C19373b() {
            };
        }
        return f52771c;
    }

    /* renamed from: d */
    public static C19379h m64223d() {
        if (f52772d == null) {
            f52772d = new C19449a();
        }
        return f52772d;
    }

    /* renamed from: g */
    public static C19377f m64226g() {
        if (f52774f == null) {
            f52774f = new C19454c();
        }
        return f52774f;
    }

    /* renamed from: s */
    public static boolean m64238s() {
        if (m64228i().optInt("disable_task_settings", 0) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public static boolean m64239t() {
        if (m64228i().optInt("download_service_need_foreground", 0) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static C19391a m64229j() {
        if (f52776h == null) {
            f52776h = new C19392a().mo51384a();
        }
        return f52776h;
    }

    /* renamed from: m */
    public static String m64232m() {
        if (TextUtils.isEmpty(f52782n)) {
            String optString = m64228i().optString("download_completed_event_tag");
            if (TextUtils.isEmpty(optString)) {
                optString = "embeded_ad";
            }
            f52782n = optString;
        }
        return f52782n;
    }

    /* renamed from: n */
    public static boolean m64233n() {
        if (m64228i().optInt("is_enable_start_install_again") == 1 || m64234o()) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public static boolean m64234o() {
        if (m64228i().optInt("is_enable_start_install_again") == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public static long m64235p() {
        long optLong = m64228i().optLong("start_install_interval");
        if (optLong == 0) {
            return 300000;
        }
        return optLong;
    }

    /* renamed from: q */
    public static long m64236q() {
        long optLong = m64228i().optLong("next_install_min_interval");
        if (optLong == 0) {
            return 10000;
        }
        return optLong;
    }

    /* renamed from: i */
    public static JSONObject m64228i() {
        if (f52775g == null) {
            f52775g = new C19378g() {
                /* renamed from: a */
                public final JSONObject mo51363a() {
                    return new JSONObject();
                }
            };
        }
        return (JSONObject) C19523h.m64306a((T[]) new JSONObject[]{f52775g.mo51363a(), new JSONObject()});
    }

    /* renamed from: a */
    public static void m64208a(C19372a aVar) {
        f52777i = aVar;
    }

    /* renamed from: a */
    public static void m64209a(C19373b bVar) {
        f52771c = bVar;
    }

    /* renamed from: a */
    public static void m64207a(Context context) {
        if (context == null || context.getApplicationContext() == null) {
            throw new IllegalArgumentException("Context is null");
        }
        f52769a = context.getApplicationContext();
    }

    /* renamed from: b */
    public static void m64221b(Context context) {
        if (f52769a == null && context != null && context.getApplicationContext() != null) {
            f52769a = context.getApplicationContext();
        }
    }

    /* renamed from: a */
    public static void m64210a(C19375d dVar) {
        f52770b = dVar;
    }

    /* renamed from: a */
    public static void m64211a(C19376e eVar) {
        f52773e = eVar;
    }

    /* renamed from: a */
    public static void m64212a(C19377f fVar) {
        f52774f = fVar;
    }

    /* renamed from: a */
    public static void m64213a(C19378g gVar) {
        f52775g = gVar;
        try {
            m64219a(gVar.mo51363a());
            if (gVar.mo51363a().optInt("hook", 0) == 1) {
                C19510a.m64277a();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m64214a(C19379h hVar) {
        f52772d = hVar;
    }

    /* renamed from: a */
    public static void m64215a(C19383l lVar) {
        f52781m = lVar;
    }
}
