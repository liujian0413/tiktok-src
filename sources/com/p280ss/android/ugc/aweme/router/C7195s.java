package com.p280ss.android.ugc.aweme.router;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.support.p022v4.app.C0598c;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.framwork.core.monitor.C6379c;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.router.OpenResultCallback;
import com.bytedance.router.SmartRouter;
import com.p280ss.android.p854d.C19292b;
import com.p280ss.android.ugc.aweme.app.C22912d;
import com.p280ss.android.ugc.aweme.router.C37260c.C37261a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.router.s */
public class C7195s {

    /* renamed from: b */
    private static final String f20125b = "com.ss.android.ugc.aweme.router.s";

    /* renamed from: c */
    private static Application f20126c;

    /* renamed from: d */
    private static final LinkedHashMap<String, C37273j> f20127d = new LinkedHashMap<>();

    /* renamed from: e */
    private static Set<C7201a> f20128e = new LinkedHashSet();

    /* renamed from: f */
    private static C7202b f20129f = null;

    /* renamed from: g */
    private static boolean f20130g = false;

    /* renamed from: h */
    private static C7195s f20131h;

    /* renamed from: i */
    private static boolean f20132i = false;

    /* renamed from: a */
    public C37283q f20133a = new C37283q();

    /* renamed from: com.ss.android.ugc.aweme.router.s$a */
    public interface C7201a {
        /* renamed from: a */
        void mo18691a();
    }

    /* renamed from: com.ss.android.ugc.aweme.router.s$b */
    public interface C7202b {
        /* renamed from: a */
        String mo18692a(String str);
    }

    /* renamed from: a */
    private static boolean m22446a(C37273j jVar, String str) {
        return jVar != null;
    }

    /* renamed from: a */
    public final boolean mo18679a(Activity activity, String str) {
        return C37285t.m119752a(this, activity, str);
    }

    /* renamed from: a */
    public final boolean mo18680a(Activity activity, String str, int i) {
        return C37285t.m119753a(this, activity, str, i);
    }

    /* renamed from: a */
    public final boolean mo18681a(Activity activity, String str, View view) {
        return C37285t.m119754a(this, activity, str, view);
    }

    /* renamed from: a */
    public final boolean mo18682a(String str) {
        return C37285t.m119755a(this, str);
    }

    /* renamed from: a */
    public final boolean mo18683a(String str, HashMap hashMap) {
        return C37285t.m119756a(this, str, hashMap);
    }

    /* renamed from: a */
    public static C7195s m22438a() {
        if (f20131h != null) {
            return f20131h;
        }
        throw new RuntimeException("RouterManager need init first before use!");
    }

    /* renamed from: b */
    private static void m22447b() {
        if (!f20130g) {
            synchronized (f20127d) {
                for (C7201a a : f20128e) {
                    a.mo18691a();
                }
                f20130g = true;
            }
        }
    }

    /* renamed from: a */
    public static void m22441a(C7202b bVar) {
        f20129f = bVar;
    }

    /* renamed from: a */
    public static void m22440a(C7201a aVar) {
        f20128e.add(aVar);
    }

    private C7195s(Application application) {
        f20126c = application;
    }

    /* renamed from: a */
    public static void m22439a(Application application) {
        if (f20131h == null) {
            synchronized (C7195s.class) {
                if (f20131h == null) {
                    f20131h = new C7195s(application);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m22445a(boolean z) {
        f20132i = z;
    }

    /* renamed from: b */
    public final boolean mo18687b(String str) {
        C19292b.m63215a(C6399b.m19921a()).mo51192a(str);
        final boolean[] zArr = new boolean[1];
        SmartRouter.buildRoute(C6399b.m19921a(), str).withCallback(new OpenResultCallback() {
            public final void onSuccess() {
                zArr[0] = true;
            }

            public final void onFail(String str, String str2) {
                zArr[0] = false;
                C7195s.m22444a(str, true);
            }
        }).open();
        if (!zArr[0]) {
            m22447b();
            if (f20129f != null) {
                str = f20129f.mo18692a(str);
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            C37273j jVar = null;
            Iterator it = f20127d.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str2 = (String) it.next();
                if (C37286v.m119758a(str2, str)) {
                    jVar = (C37273j) f20127d.get(str2);
                    break;
                }
            }
            if (!m22446a(jVar, str)) {
                m22444a(str, false);
                return false;
            }
            zArr[0] = jVar.mo59315a(str);
        }
        if (!zArr[0]) {
            m22444a(str, false);
        }
        return zArr[0];
    }

    /* renamed from: a */
    public static void m22442a(String str, C37273j jVar) {
        f20127d.put(str, jVar);
    }

    /* renamed from: a */
    public static void m22443a(String str, Class<? extends Activity> cls) {
        C37259b bVar = new C37259b(f20126c, str, cls);
        bVar.f97376c = f20132i;
        if (f20127d.get(str) == null) {
            f20127d.put(str, bVar);
        }
    }

    /* renamed from: b */
    public final boolean mo18684b(Activity activity, String str) {
        C19292b.m63215a(C6399b.m19921a()).mo51192a(str);
        final boolean[] zArr = new boolean[1];
        SmartRouter.buildRoute((Context) activity, str).withCallback(new OpenResultCallback() {
            public final void onSuccess() {
                zArr[0] = true;
            }

            public final void onFail(String str, String str2) {
                zArr[0] = false;
                C7195s.m22444a(str, true);
            }
        }).open();
        if (!zArr[0]) {
            m22447b();
            if (f20129f != null) {
                str = f20129f.mo18692a(str);
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            C37273j jVar = null;
            Iterator it = f20127d.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str2 = (String) it.next();
                if (C37286v.m119758a(str2, str)) {
                    jVar = (C37273j) f20127d.get(str2);
                    break;
                }
            }
            if (!m22446a(jVar, str)) {
                m22444a(str, false);
                return false;
            }
            zArr[0] = jVar.mo59313a(activity, str);
        }
        if (!zArr[0]) {
            m22444a(str, false);
        }
        return zArr[0];
    }

    /* renamed from: a */
    public static void m22444a(String str, boolean z) {
        String str2;
        try {
            if (TextUtils.isEmpty(str)) {
                str = "empty url";
            }
            JSONObject jSONObject = new JSONObject();
            String str3 = "type";
            if (z) {
                str2 = "smartrouter";
            } else {
                str2 = "all";
            }
            jSONObject.put(str3, str2);
            jSONObject.put(C22912d.f60642b, str);
            C6379c.m19828a("in_app_router_no_matched", (JSONObject) null, (JSONObject) null, jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public final boolean mo18688b(String str, HashMap<String, String> hashMap) {
        String str2;
        if (hashMap != null) {
            C7203u a = C7203u.m22460a(str);
            for (Entry entry : hashMap.entrySet()) {
                a.mo18694a((String) entry.getKey(), (String) entry.getValue());
            }
            str2 = a.mo18695a();
        } else {
            str2 = str;
        }
        C19292b.m63215a(C6399b.m19921a()).mo51192a(str2);
        final boolean[] zArr = new boolean[1];
        SmartRouter.buildRoute(C6399b.m19921a(), str2).withCallback(new OpenResultCallback() {
            public final void onSuccess() {
                zArr[0] = true;
            }

            public final void onFail(String str, String str2) {
                zArr[0] = false;
                C7195s.m22444a(str, true);
            }
        }).open();
        if (!zArr[0]) {
            m22447b();
            if (f20129f != null) {
                str = f20129f.mo18692a(str);
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            C37273j jVar = null;
            Iterator it = f20127d.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str3 = (String) it.next();
                if (C37286v.m119758a(str3, str)) {
                    jVar = (C37273j) f20127d.get(str3);
                    break;
                }
            }
            if (!m22446a(jVar, str2)) {
                m22444a(str2, false);
                return false;
            }
            zArr[0] = jVar.mo59315a(str2);
        }
        if (!zArr[0]) {
            m22444a(str2, false);
        }
        return zArr[0];
    }

    /* renamed from: b */
    public final boolean mo18685b(Activity activity, String str, int i) {
        C19292b.m63215a(C6399b.m19921a()).mo51192a(str);
        final boolean[] zArr = new boolean[1];
        SmartRouter.buildRoute((Context) activity, str).withCallback(new OpenResultCallback() {
            public final void onSuccess() {
                zArr[0] = true;
            }

            public final void onFail(String str, String str2) {
                zArr[0] = false;
                C7195s.m22444a(str, true);
            }
        }).open(i);
        if (!zArr[0]) {
            m22447b();
            if (f20129f != null) {
                str = f20129f.mo18692a(str);
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            C37273j jVar = null;
            Iterator it = f20127d.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str2 = (String) it.next();
                if (C37286v.m119758a(str2, str)) {
                    jVar = (C37273j) f20127d.get(str2);
                    break;
                }
            }
            if (!m22446a(jVar, str)) {
                m22444a(str, false);
                return false;
            } else if (jVar instanceof C37259b) {
                C37259b bVar = (C37259b) jVar;
                C37260c a = new C37261a().mo93881a(1).mo93882a();
                a.f97382c = i;
                bVar.f97375b = a;
                zArr[0] = bVar.mo59313a(activity, str);
            } else {
                zArr[0] = jVar.mo59313a(activity, str);
            }
        }
        if (!zArr[0]) {
            m22444a(str, false);
        }
        return zArr[0];
    }

    /* renamed from: b */
    public final boolean mo18686b(Activity activity, String str, View view) {
        C0598c a = C0598c.m2486a(view, view.getWidth() / 2, view.getHeight() / 2, 0, 0);
        C19292b.m63215a(C6399b.m19921a()).mo51192a(str);
        final boolean[] zArr = new boolean[1];
        SmartRouter.buildRoute((Context) activity, str).withBundleAnimation(a.mo2580a()).withCallback(new OpenResultCallback() {
            public final void onSuccess() {
                zArr[0] = true;
            }

            public final void onFail(String str, String str2) {
                zArr[0] = false;
                C7195s.m22444a(str, true);
            }
        }).open();
        if (!zArr[0]) {
            m22447b();
            if (f20129f != null) {
                str = f20129f.mo18692a(str);
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            C37273j jVar = null;
            Iterator it = f20127d.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str2 = (String) it.next();
                if (C37286v.m119758a(str2, str)) {
                    jVar = (C37273j) f20127d.get(str2);
                    break;
                }
            }
            if (!m22446a(jVar, str)) {
                m22444a(str, false);
                return false;
            }
            zArr[0] = jVar.mo59314a(activity, str, view);
        }
        if (!zArr[0]) {
            m22444a(str, false);
        }
        return zArr[0];
    }
}
