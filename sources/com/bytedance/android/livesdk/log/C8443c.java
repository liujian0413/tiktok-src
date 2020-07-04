package com.bytedance.android.livesdk.log;

import android.text.TextUtils;
import android.webkit.CookieManager;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.network.api.INetworkService;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.log.p404a.C8411b;
import com.bytedance.android.livesdk.log.p404a.C8412c;
import com.bytedance.android.livesdk.log.p404a.C8413d;
import com.bytedance.android.livesdk.log.p404a.C8414e;
import com.bytedance.android.livesdk.log.p404a.C8415f;
import com.bytedance.android.livesdk.log.p404a.C8416g;
import com.bytedance.android.livesdk.log.p404a.C8417h;
import com.bytedance.android.livesdk.log.p404a.C8418i;
import com.bytedance.android.livesdk.log.p404a.C8419j;
import com.bytedance.android.livesdk.log.p404a.C8420k;
import com.bytedance.android.livesdk.log.p404a.C8421l;
import com.bytedance.android.livesdk.log.p404a.C8422m;
import com.bytedance.android.livesdk.log.p404a.C8423n;
import com.bytedance.android.livesdk.log.p404a.C8424o;
import com.bytedance.android.livesdk.log.p404a.C8425p;
import com.bytedance.android.livesdk.log.p404a.C8426q;
import com.bytedance.android.livesdk.log.p405b.C8429a;
import com.bytedance.android.livesdk.log.p405b.C8430b;
import com.bytedance.android.livesdk.log.p405b.C8431c;
import com.bytedance.android.livesdk.log.p405b.C8432d;
import com.bytedance.android.livesdk.log.p405b.C8433e;
import com.bytedance.android.livesdk.log.p405b.C8434f;
import com.bytedance.android.livesdk.log.p405b.C8435g;
import com.bytedance.android.livesdk.log.p405b.C8436h;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.log.p405b.C8439k;
import com.bytedance.android.livesdk.log.p405b.C8440l;
import com.bytedance.android.livesdk.log.p405b.C8441m;
import com.bytedance.android.livesdk.log.p405b.C8442n;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.C9463e;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.bytedance.android.livesdk.log.c */
public final class C8443c {

    /* renamed from: b */
    private static C8443c f23103b;

    /* renamed from: c */
    private static final List<String> f23104c = Arrays.asList(new String[]{"livesdk_send_gift", "livesdk_recharge_success"});

    /* renamed from: d */
    private static final Map<String, List<String>> f23105d;

    /* renamed from: a */
    private final Map<Class, C8416g> f23106a = new HashMap();

    private C8443c() {
        m25668b();
    }

    /* renamed from: a */
    public static synchronized C8443c m25663a() {
        C8443c cVar;
        synchronized (C8443c.class) {
            if (f23103b == null) {
                f23103b = new C8443c();
            }
            cVar = f23103b;
        }
        return cVar;
    }

    static {
        HashMap hashMap = new HashMap();
        f23105d = hashMap;
        hashMap.put("livesdk_send_gift", Arrays.asList(new String[]{"gift_id", "money", "gift_info"}));
        f23105d.put("livesdk_recharge_success", Arrays.asList(new String[]{"money"}));
    }

    /* renamed from: c */
    private Map<String, String> m25669c() {
        String str;
        CookieManager instance = CookieManager.getInstance();
        INetworkService iNetworkService = (INetworkService) C3596c.m13172a(INetworkService.class);
        if (iNetworkService != null) {
            str = iNetworkService.getHostDomain();
        } else {
            str = "";
        }
        String cookie = instance.getCookie(str);
        if (TextUtils.isEmpty(cookie)) {
            return Collections.EMPTY_MAP;
        }
        String[] split = cookie.split(";");
        if (split.length <= 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap hashMap = new HashMap();
        for (String split2 : split) {
            String[] split3 = split2.split("=");
            if (split3.length == 2) {
                hashMap.put(m25664a(split3[0]), m25664a(split3[1]));
            }
        }
        return hashMap;
    }

    /* renamed from: b */
    private void m25668b() {
        m25665a(Room.class, (C8416g<T>) new C8423n<T>());
        m25665a(C8430b.class, (C8416g<T>) new C8412c<T>());
        m25665a(C8442n.class, (C8416g<T>) new C8425p<T>());
        m25665a(C8441m.class, (C8416g<T>) new C8424o<T>());
        m25665a(C8440l.class, (C8416g<T>) new C8422m<T>());
        m25665a(C8431c.class, (C8416g<T>) new C8413d<T>());
        m25665a(C8436h.class, (C8416g<T>) new C8419j<T>());
        m25665a(C8434f.class, (C8416g<T>) new C8417h<T>());
        C8420k kVar = new C8420k();
        kVar.mo21570a("event_page", "live_detail");
        m25665a(C8438j.class, (C8416g<T>) kVar);
        m25665a(User.class, (C8416g<T>) new C8426q<T>());
        m25665a(C8435g.class, (C8416g<T>) new C8418i<T>());
        m25665a(C8429a.class, (C8416g<T>) new C8411b<T>());
        m25665a(C8432d.class, (C8416g<T>) new C8414e<T>());
        m25665a(C8433e.class, (C8416g<T>) new C8415f<T>());
        m25665a(C8439k.class, (C8416g<T>) new C8421l<T>());
    }

    /* renamed from: a */
    private static String m25664a(String str) {
        if (str == null) {
            return null;
        }
        return str.trim();
    }

    /* renamed from: a */
    private static void m25667a(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        for (Entry entry : map.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue());
        }
        C8444d.m25673b().mo9999a("ttlive_eventlog", (Map<String, ?>) hashMap);
    }

    /* renamed from: a */
    public final C8416g mo21605a(Class cls) {
        if (this.f23106a.containsKey(cls)) {
            return (C8416g) this.f23106a.get(cls);
        }
        return null;
    }

    /* renamed from: a */
    private <T> void m25665a(Class<T> cls, C8416g<T> gVar) {
        this.f23106a.put(cls, gVar);
    }

    /* renamed from: a */
    private void m25666a(String str, Map<String, String> map) {
        if (!map.isEmpty() && !TextUtils.isEmpty(str) && f23104c.contains(str)) {
            Map c = m25669c();
            String str2 = (String) c.get("store-idc");
            String str3 = (String) c.get("store-country-code");
            if ("maliva".equals(str2) && "us".equals(str3)) {
                List<String> list = (List) f23105d.get(str);
                if (list != null && !list.isEmpty()) {
                    for (String remove : list) {
                        map.remove(remove);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo21607a(String str, Object... objArr) {
        mo21606a(str, null, objArr);
    }

    /* renamed from: a */
    public final void mo21606a(String str, Map<String, String> map, Object... objArr) {
        HashMap hashMap = new HashMap();
        if (this.f23106a.containsKey(C8430b.class)) {
            ((C8416g) this.f23106a.get(C8430b.class)).mo21571a((Map<String, String>) hashMap);
        }
        if (objArr != null) {
            for (Object obj : objArr) {
                if (obj != null) {
                    if (obj instanceof Class) {
                        if (this.f23106a.containsKey(obj)) {
                            ((C8416g) this.f23106a.get(obj)).mo21571a((Map<String, String>) hashMap);
                        }
                    } else if (this.f23106a.containsKey(obj.getClass())) {
                        ((C8416g) this.f23106a.get(obj.getClass())).mo21572a((Map<String, String>) hashMap, obj);
                    }
                }
            }
        }
        if (map != null && map.size() > 0) {
            hashMap.putAll(map);
        }
        if (!str.startsWith("livesdk_")) {
            StringBuilder sb = new StringBuilder("livesdk_");
            sb.append(str);
            str = sb.toString();
        }
        if (!hashMap.containsKey("_param_live_platform")) {
            hashMap.put("_param_live_platform", "live");
        }
        hashMap.put("sdk_version", "1380");
        if (str.equals("livesdk_live_show")) {
            if (hashMap.containsKey("event_page")) {
                hashMap.get("event_page");
            }
            if (hashMap.containsKey("event_module")) {
                hashMap.get("event_module");
            }
        } else {
            if (hashMap.containsKey("enter_from")) {
                hashMap.get("enter_from");
            }
            if (hashMap.containsKey("source")) {
                hashMap.get("source");
            }
        }
        m25666a(str, (Map<String, String>) hashMap);
        ((C9463e) C3596c.m13172a(C9463e.class)).mo23269a(str, hashMap);
        m25667a((Map<String, String>) hashMap);
    }
}
