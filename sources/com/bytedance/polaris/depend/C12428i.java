package com.bytedance.polaris.depend;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.common.utility.C6319n;
import com.bytedance.polaris.C12332a;
import com.bytedance.polaris.browser.PolarisBrowserActivity;
import com.bytedance.polaris.model.C12436b;
import com.bytedance.polaris.p633a.C12335a;
import com.bytedance.polaris.p634b.C12370u;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.bytedance.polaris.depend.i */
public final class C12428i {

    /* renamed from: a */
    public static WeakReference<Activity> f32976a;

    /* renamed from: b */
    private static Application f32977b;

    /* renamed from: c */
    private static C12424e f32978c;

    /* renamed from: d */
    private static C12422c f32979d;

    /* renamed from: e */
    private static C12426g f32980e;

    /* renamed from: f */
    private static C12425f f32981f;

    /* renamed from: g */
    private static C12434l f32982g;

    /* renamed from: h */
    private static boolean f32983h;

    /* renamed from: i */
    private static boolean f32984i;

    /* renamed from: j */
    private static ActivityLifecycleCallbacks f32985j = new ActivityLifecycleCallbacks() {
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public final void onActivityDestroyed(Activity activity) {
        }

        public final void onActivityPaused(Activity activity) {
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public final void onActivityStarted(Activity activity) {
        }

        public final void onActivityStopped(Activity activity) {
        }

        public final void onActivityResumed(Activity activity) {
            if (activity != null) {
                C12428i.f32976a = new WeakReference<>(activity);
            }
            if (!TextUtils.isEmpty(C12428i.m36159i().mo30324c())) {
            }
        }
    };

    /* renamed from: a */
    public static boolean m36148a() {
        return f32984i;
    }

    /* renamed from: b */
    public static C12434l m36151b() {
        return f32982g;
    }

    /* renamed from: c */
    public static Application m36153c() {
        return C12430j.m36167a();
    }

    /* renamed from: d */
    public static Application m36154d() {
        return f32977b;
    }

    /* renamed from: e */
    public static C12422c m36155e() {
        return C12430j.m36168b();
    }

    /* renamed from: f */
    public static C12422c m36156f() {
        return f32979d;
    }

    /* renamed from: g */
    public static C12426g m36157g() {
        return C12430j.m36169c();
    }

    /* renamed from: h */
    public static C12426g m36158h() {
        return f32980e;
    }

    /* renamed from: i */
    public static C12424e m36159i() {
        return C12430j.m36170d();
    }

    /* renamed from: j */
    public static C12424e m36160j() {
        return f32978c;
    }

    /* renamed from: l */
    public static boolean m36162l() {
        return f32983h;
    }

    /* renamed from: p */
    private static boolean m36166p() {
        m36159i();
        return false;
    }

    /* renamed from: m */
    public static Activity m36163m() {
        if (f32976a == null) {
            return null;
        }
        return (Activity) f32976a.get();
    }

    /* renamed from: n */
    public static boolean m36164n() {
        C12424e i = m36159i();
        return (i == null || i.mo30325d()) ? false : false;
    }

    /* renamed from: k */
    public static void m36161k() {
        C12424e i = m36159i();
        i.mo30323b();
        if (i != null && !i.mo30323b()) {
            C12335a.m35825b().mo30175a();
        }
    }

    /* renamed from: o */
    public static void m36165o() {
        if (!TextUtils.isEmpty(m36159i().mo30324c())) {
            C12332a.m35814a().mo30169b();
        }
    }

    /* renamed from: a */
    private static C12421b m36141a(Uri uri) {
        C12421b bVar;
        if (f32981f != null) {
            bVar = f32981f.mo30328a(uri);
        } else {
            bVar = null;
        }
        if (bVar == null) {
            return new C12436b(uri);
        }
        return bVar;
    }

    /* renamed from: b */
    public static String m36152b(String str) {
        C12424e i = m36159i();
        String str2 = "";
        if (i != null) {
            str2 = i.mo30326e();
        }
        if (!C12370u.m35938d(str2)) {
            str2 = "http://ib.snssdk.com";
        } else if (str2.endsWith("/")) {
            str2 = str2.substring(0, str2.length() - 1);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public static void m36146a(C12431k kVar) {
        C12431k.m36171a(kVar, "config");
        f32984i = true;
        f32977b = kVar.f32990e;
        f32978c = kVar.f32989d;
        f32979d = kVar.f32986a;
        f32980e = kVar.f32987b;
        f32983h = kVar.f32992g;
        f32981f = kVar.f32988c;
        f32982g = kVar.f32991f;
        if (f32981f == null || f32981f.mo30327a() > 0) {
            f32977b.registerActivityLifecycleCallbacks(f32985j);
            m36165o();
            return;
        }
        throw new VersionMismatchError("polaris-reactnative versionCode mismatch");
    }

    /* renamed from: a */
    public static boolean m36150a(String str) {
        return C12370u.m35940f(str);
    }

    /* renamed from: a */
    private static String m36142a(String str, boolean z) {
        String str2;
        String str3;
        if (C6319n.m19593a(str)) {
            return str;
        }
        Uri parse = Uri.parse(str);
        boolean d = C12370u.m35938d(str);
        if (!d && !m36150a(str)) {
            return str;
        }
        if (!d) {
            z |= parse.getBooleanQueryParameter("should_append_common_param", false);
        }
        if (d) {
            str2 = str;
        } else {
            str2 = C12370u.m35926a(parse);
        }
        if (z) {
            str3 = C12370u.m35936b(str2);
        } else {
            str3 = C12370u.m35937c(str2);
        }
        if (d) {
            return str3;
        }
        return C12370u.m35927a(str, str3);
    }

    /* renamed from: a */
    private static boolean m36149a(Context context, C12421b bVar) {
        if (context == null || bVar == null || !m36166p()) {
            return false;
        }
        return f32981f.mo30329a(context, bVar);
    }

    /* renamed from: a */
    public static void m36143a(Context context, String str, boolean z) {
        m36144a(context, str, true, false);
    }

    /* renamed from: a */
    public static void m36147a(String str, C12423d<JSONObject> dVar, JSONObject jSONObject) {
        C12335a.m35825b().mo30177a(str, null, (JSONObject) null);
    }

    /* renamed from: a */
    public static void m36144a(Context context, String str, boolean z, boolean z2) {
        m36145a(context, str, z, false, null);
    }

    /* renamed from: a */
    private static void m36145a(Context context, String str, boolean z, boolean z2, Bundle bundle) {
        if (!C6319n.m19593a(str) && context != null) {
            String a = m36142a(str, z);
            Uri parse = Uri.parse(a);
            if (C12370u.m35938d(a)) {
                Intent intent = new Intent(context, PolarisBrowserActivity.class);
                intent.addFlags(268435456);
                intent.setData(parse);
                intent.putExtra("swipe_mode", C12370u.m35924a(parse, "swipe_mode", 2));
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                PolarisBrowserActivity.m35966a(intent, parse);
                if (z2) {
                    intent.putExtra("auto_upload_invitation_code", z2);
                }
                context.startActivity(intent);
                return;
            }
            if (m36150a(a)) {
                if (C12370u.m35939e(a)) {
                    C12421b a2 = m36141a(parse);
                    if (a2 != null && !m36149a(context, a2)) {
                        String a3 = a2.mo30304a();
                        if (!C6319n.m19593a(a3)) {
                            parse = Uri.parse(a3);
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                Intent a4 = PolarisBrowserActivity.m35963a(context, parse);
                if (a4 != null) {
                    if (!(context instanceof Activity)) {
                        a4.addFlags(268435456);
                    }
                    if (z2 && a4 != null) {
                        a4.putExtra("auto_upload_invitation_code", z2);
                    }
                    context.startActivity(a4);
                }
            }
        }
    }
}
