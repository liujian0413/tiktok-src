package com.p1848vk.sdk;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.p1848vk.sdk.p1849a.C47108b;
import com.p1848vk.sdk.p1849a.C47109c;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.vk.sdk.a */
public class C47106a {

    /* renamed from: i */
    private static volatile C47106a f120882i;

    /* renamed from: a */
    public String f120883a;

    /* renamed from: b */
    public int f120884b;

    /* renamed from: c */
    public String f120885c;

    /* renamed from: d */
    public String f120886d;

    /* renamed from: e */
    public boolean f120887e;

    /* renamed from: f */
    public long f120888f;

    /* renamed from: g */
    public String f120889g;

    /* renamed from: h */
    private Map<String, Boolean> f120890h;

    private C47106a() {
    }

    /* renamed from: e */
    private String m147292e() {
        return C47108b.m147301a(m147291d());
    }

    /* renamed from: b */
    public static C47106a m147288b() {
        if (f120882i == null) {
            synchronized (C47106a.class) {
                if (f120882i == null) {
                    f120882i = m147290c(C47218d.m147673a(), "VK_SDK_ACCESS_TOKEN_PLEASE_DONT_TOUCH");
                }
            }
        }
        return f120882i;
    }

    /* renamed from: c */
    public final void mo118388c() {
        m147287a(C47218d.m147673a(), "VK_SDK_ACCESS_TOKEN_PLEASE_DONT_TOUCH");
    }

    /* renamed from: d */
    private Map<String, String> m147291d() {
        HashMap hashMap = new HashMap();
        hashMap.put("access_token", this.f120883a);
        StringBuilder sb = new StringBuilder();
        sb.append(this.f120884b);
        hashMap.put("expires_in", sb.toString());
        hashMap.put("user_id", this.f120885c);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f120888f);
        hashMap.put("created", sb2.toString());
        if (this.f120890h != null) {
            hashMap.put("scope", TextUtils.join(",", this.f120890h.keySet()));
        }
        if (this.f120886d != null) {
            hashMap.put("secret", this.f120886d);
        }
        if (this.f120887e) {
            hashMap.put("https_required", "1");
        }
        if (this.f120889g != null) {
            hashMap.put("email", this.f120889g);
        }
        return hashMap;
    }

    /* renamed from: a */
    public final boolean mo118386a() {
        if (this.f120884b <= 0 || ((long) (this.f120884b * 1000)) + this.f120888f >= System.currentTimeMillis()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static C47106a m147285a(String str) {
        if (str == null) {
            return null;
        }
        return m147286a(C47109c.m147306a(str));
    }

    /* renamed from: a */
    public final C47106a mo118385a(C47106a aVar) {
        Map d = m147291d();
        d.putAll(aVar.m147291d());
        return m147286a(d);
    }

    /* renamed from: a */
    public static C47106a m147286a(Map<String, String> map) {
        if (map == null || map.size() == 0) {
            return null;
        }
        C47106a aVar = new C47106a();
        try {
            aVar.f120883a = (String) map.get("access_token");
            aVar.f120885c = (String) map.get("user_id");
            aVar.f120886d = (String) map.get("secret");
            aVar.f120889g = (String) map.get("email");
            aVar.f120887e = false;
            if (map.get("expires_in") != null) {
                aVar.f120884b = Integer.parseInt((String) map.get("expires_in"));
            }
            String str = (String) map.get("scope");
            if (str != null) {
                HashMap hashMap = new HashMap();
                for (String put : str.split(",")) {
                    hashMap.put(put, Boolean.valueOf(true));
                }
                aVar.f120890h = hashMap;
            }
            if (map.containsKey("https_required")) {
                aVar.f120887e = ((String) map.get("https_required")).equals("1");
            } else if (aVar.f120886d == null) {
                aVar.f120887e = true;
            }
            if (map.containsKey("created")) {
                aVar.f120888f = Long.parseLong((String) map.get("created"));
            } else {
                aVar.f120888f = System.currentTimeMillis();
            }
            if (aVar.f120883a != null) {
                return aVar;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final boolean mo118387a(String... strArr) {
        for (String str : strArr) {
            if (this.f120890h.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    private static C47106a m147290c(Context context, String str) {
        return m147285a(PreferenceManager.getDefaultSharedPreferences(context).getString(str, null));
    }

    /* renamed from: a */
    static C47106a m147284a(Context context, C47106a aVar) {
        C47106a aVar2 = f120882i;
        f120882i = aVar;
        if (aVar != null) {
            f120882i.mo118388c();
        } else {
            m147289b(context, "VK_SDK_ACCESS_TOKEN_PLEASE_DONT_TOUCH");
        }
        return aVar2;
    }

    /* renamed from: a */
    private void m147287a(Context context, String str) {
        if (context != null) {
            Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
            edit.putString(str, m147292e());
            edit.apply();
        }
    }

    /* renamed from: b */
    private static void m147289b(Context context, String str) {
        if (context != null) {
            Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
            edit.remove(str);
            edit.apply();
        }
    }
}
