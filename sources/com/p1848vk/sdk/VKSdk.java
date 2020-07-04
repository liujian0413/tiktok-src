package com.p1848vk.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.os.Handler;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.p1848vk.sdk.VKServiceActivity.VKServiceType;
import com.p1848vk.sdk.api.C47121c;
import com.p1848vk.sdk.api.C47123e;
import com.p1848vk.sdk.api.VKRequest;
import com.p1848vk.sdk.api.VKRequest.C47115a;
import com.p1848vk.sdk.p1849a.C47109c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.vk.sdk.VKSdk */
public class VKSdk {

    /* renamed from: a */
    public static final List<Object> f120863a = new CopyOnWriteArrayList();

    /* renamed from: b */
    private static Handler f120864b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private static int f120865c = 0;

    /* renamed from: e */
    private static VKSdk f120866e = null;

    /* renamed from: f */
    private static boolean f120867f = false;

    /* renamed from: g */
    private static String f120868g;

    /* renamed from: h */
    private static volatile LoginState f120869h;

    /* renamed from: i */
    private static ArrayList<String> f120870i;

    /* renamed from: d */
    private final Context f120871d;

    /* renamed from: com.vk.sdk.VKSdk$LoginState */
    public enum LoginState {
        Unknown,
        LoggedOut,
        Pending,
        LoggedIn
    }

    /* renamed from: com.vk.sdk.VKSdk$a */
    static class C47103a {

        /* renamed from: a */
        public C47106a f120877a;

        /* renamed from: b */
        public C47106a f120878b;

        /* renamed from: c */
        public C47121c f120879c;

        public C47103a(C47106a aVar) {
            this.f120877a = aVar;
        }

        public C47103a(C47121c cVar) {
            this.f120879c = cVar;
        }

        public C47103a(C47106a aVar, C47106a aVar2) {
            this.f120877a = aVar2;
            this.f120878b = aVar;
        }
    }

    /* renamed from: a */
    public static boolean m147259a() {
        return f120867f;
    }

    /* renamed from: b */
    static int m147263b() {
        return f120865c;
    }

    /* renamed from: e */
    public static String m147271e() {
        return f120868g;
    }

    /* renamed from: a */
    private static void m147256a(final C47106a aVar, final C47106a aVar2) {
        f120864b.post(new Runnable() {
            public final void run() {
                Iterator it = VKSdk.f120863a.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        });
    }

    /* renamed from: a */
    public static boolean m147260a(int i, int i2, Intent intent, C47216b<C47106a> bVar) {
        if (i != VKServiceType.Authorization.getOuterCode()) {
            return false;
        }
        if (i2 == -1) {
            bVar.mo29992a(C47106a.m147288b());
        } else if (i2 == 0) {
            long j = 0;
            if (intent != null) {
                j = intent.getLongExtra("vk_extra_error_id", 0);
            }
            bVar.mo29991a((C47121c) C47217c.m147670a(j));
        }
        return true;
    }

    /* renamed from: a */
    static boolean m147262a(Context context, int i, Intent intent, C47216b<C47106a> bVar) {
        Map map;
        if (i != -1 || intent == null) {
            bVar.mo29991a(new C47121c(-102));
            m147269c(context);
            return false;
        }
        if (intent.hasExtra("extra-token-data")) {
            map = C47109c.m147306a(intent.getStringExtra("extra-token-data"));
        } else if (intent.getExtras() != null) {
            map = new HashMap();
            for (String str : intent.getExtras().keySet()) {
                map.put(str, String.valueOf(intent.getExtras().get(str)));
            }
        } else {
            map = null;
        }
        C47103a a = m147248a(context, map);
        if (a.f120879c != null) {
            bVar.mo29991a(a.f120879c);
        } else if (a.f120877a != null) {
            if (a.f120878b != null) {
                VKRequest b = VKRequest.m147317b(intent.getLongExtra("extra-validation-request", 0));
                if (b != null) {
                    b.mo118684b();
                    b.mo118398f();
                }
            } else {
                m147257a((C47115a) null);
            }
            bVar.mo29992a(a.f120877a);
        }
        f120870i = null;
        m147269c(context);
        return true;
    }

    /* renamed from: a */
    public static void m147258a(C47121c cVar) {
        if (cVar.f120923d == 5) {
            m147265b(C47218d.m147673a());
        }
    }

    /* renamed from: a */
    private static void m147257a(C47115a aVar) {
        VKRequest vKRequest = new VKRequest("stats.trackVisitor");
        vKRequest.f120901j = 0;
        vKRequest.mo118390a(aVar);
    }

    /* renamed from: a */
    private static void m147255a(LoginState loginState, C47216b<LoginState> bVar) {
        f120869h = loginState;
        if (bVar != null) {
            bVar.mo29992a(f120869h);
        }
    }

    /* renamed from: c */
    public static C47106a m147268c() {
        return C47106a.m147288b();
    }

    /* renamed from: d */
    public static boolean m147270d() {
        C47106a b = C47106a.m147288b();
        if (b == null || b.mo118386a()) {
            return false;
        }
        return true;
    }

    private VKSdk(Context context) {
        this.f120871d = context;
    }

    /* renamed from: a */
    public static boolean m147261a(Context context) {
        return m147267b(context, null);
    }

    /* renamed from: b */
    public static void m147265b(Context context) {
        C47106a a = C47106a.m147284a(context, (C47106a) null);
        if (a != null) {
            m147256a(a, (C47106a) null);
        }
    }

    /* renamed from: c */
    private static void m147269c(Context context) {
        m147253a(context, null);
    }

    /* renamed from: a */
    private static ArrayList<String> m147251a(String... strArr) {
        if (strArr == null) {
            strArr = new String[0];
        }
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(strArr));
        if (!arrayList.contains("offline")) {
            arrayList.add("offline");
        }
        return arrayList;
    }

    /* renamed from: a */
    private static int m147247a(Context context, String str) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt(str, 0);
    }

    /* renamed from: a */
    private static C47103a m147248a(Context context, Map<String, String> map) {
        if (!(map == null || f120870i == null)) {
            map.put("scope", TextUtils.join(",", f120870i));
        }
        C47106a a = C47106a.m147286a(map);
        if (a != null && a.f120883a != null) {
            C47106a b = C47106a.m147288b();
            if (b != null) {
                C47106a a2 = b.mo118385a(a);
                C47106a.m147284a(context, b.mo118385a(a));
                m147256a(b, a2);
                return new C47103a(b, a);
            }
            C47106a.m147284a(context, a);
            m147256a(b, a);
            return new C47103a(a);
        } else if (map == null || !map.containsKey("success")) {
            C47121c cVar = new C47121c(map);
            if (!(cVar.f120924e == null && cVar.f120925f == null)) {
                cVar = new C47121c(-102);
            }
            return new C47103a(cVar);
        } else {
            C47106a b2 = C47106a.m147288b();
            if (a == null) {
                a = C47106a.m147288b();
            }
            return new C47103a(b2, a);
        }
    }

    /* renamed from: b */
    private static boolean m147267b(final Context context, C47216b<LoginState> bVar) {
        final Context applicationContext = context.getApplicationContext();
        C47218d.m147675a(applicationContext);
        C47106a b = C47106a.m147288b();
        if (b == null || b.f120883a == null || b.mo118386a()) {
            m147253a(context, null);
            return false;
        }
        m147255a(LoginState.Pending, null);
        m147257a((C47115a) new C47115a(null) {
            /* renamed from: a */
            public final void mo118377a(C47123e eVar) {
                VKSdk.m147253a(context, null);
            }

            /* renamed from: a */
            public final void mo118376a(C47121c cVar) {
                if (!(cVar == null || cVar.f120921b == null || cVar.f120921b.f120923d != 5)) {
                    VKSdk.m147265b(applicationContext);
                }
                VKSdk.m147253a(context, null);
            }
        });
        return true;
    }

    /* renamed from: a */
    public static void m147252a(Activity activity, String... strArr) {
        ArrayList<String> a = m147251a(strArr);
        f120870i = a;
        VKServiceActivity.m147275a(activity, a);
    }

    /* renamed from: a */
    public static void m147253a(Context context, C47216b<LoginState> bVar) {
        C47218d.m147675a(context);
        if (C47106a.m147288b() != null) {
            m147255a(LoginState.LoggedIn, bVar);
        } else {
            m147255a(LoginState.LoggedOut, bVar);
        }
    }

    /* renamed from: a */
    private static String m147250a(Context context, String str, String str2) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString(str, str2);
    }

    /* renamed from: b */
    private static void m147266b(Context context, String str, String str2) {
        Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putString(str, str2);
        edit.apply();
    }

    /* renamed from: a */
    public static VKSdk m147249a(Context context, int i, String str) {
        if (i == 0) {
            i = m147247a(context, "VK_SDK_APP_ID_PLEASE_DONT_TOUCH");
        }
        if (TextUtils.isEmpty(str)) {
            str = m147250a(context, "VK_SDK_APP_VERSION_PLEASE_DONT_TOUCH", "5.21");
        }
        if (i != 0) {
            f120867f = true;
            VKSdk b = m147264b(context, i, str);
            if (f120865c != 0) {
                m147254a(context, "VK_SDK_APP_ID_PLEASE_DONT_TOUCH", f120865c);
            }
            if (f120868g != null) {
                m147266b(context, "VK_SDK_APP_VERSION_PLEASE_DONT_TOUCH", f120868g);
            }
            return b;
        }
        throw new RuntimeException("your_app_id is 0");
    }

    /* renamed from: b */
    private static synchronized VKSdk m147264b(Context context, int i, String str) {
        VKSdk vKSdk;
        synchronized (VKSdk.class) {
            if (f120865c == 0) {
                f120866e = new VKSdk(context);
                f120865c = i;
                if (TextUtils.isEmpty(str)) {
                    str = "5.21";
                }
                f120868g = str;
                f120869h = LoginState.Unknown;
                m147261a(context);
            }
            vKSdk = f120866e;
        }
        return vKSdk;
    }

    /* renamed from: a */
    private static void m147254a(Context context, String str, int i) {
        Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putInt(str, i);
        edit.apply();
    }
}
