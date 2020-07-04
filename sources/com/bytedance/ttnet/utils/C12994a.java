package com.bytedance.ttnet.utils;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.frameworks.baselib.network.http.exception.CdnCacheVerifyException;
import com.bytedance.frameworks.baselib.network.http.util.C10189i;
import com.bytedance.retrofit2.p637a.C12461b;
import com.bytedance.retrofit2.p637a.C12462c;
import com.bytedance.retrofit2.p637a.C12464d;
import com.bytedance.ttnet.p671c.C12955b;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.ttnet.utils.a */
public final class C12994a {

    /* renamed from: a */
    private static volatile boolean f34405a;

    /* renamed from: b */
    private static List<C12996b> f34406b = new ArrayList();

    /* renamed from: c */
    private static ReentrantReadWriteLock f34407c;

    /* renamed from: d */
    private static Lock f34408d;

    /* renamed from: e */
    private static Lock f34409e = f34407c.writeLock();

    /* renamed from: com.bytedance.ttnet.utils.a$a */
    public static class C12995a {

        /* renamed from: a */
        public int f34410a;

        /* renamed from: b */
        public String f34411b;
    }

    /* renamed from: com.bytedance.ttnet.utils.a$b */
    public static class C12996b {

        /* renamed from: a */
        private Pattern f34412a;

        /* renamed from: a */
        public final boolean mo31533a(String str) {
            try {
                this.f34412a = Pattern.compile(str);
                return true;
            } catch (PatternSyntaxException unused) {
                return false;
            }
        }

        /* renamed from: a */
        public final boolean mo31534a(URI uri) {
            if (uri == null || TextUtils.isEmpty(uri.getHost()) || this.f34412a == null) {
                return false;
            }
            String host = uri.getHost();
            if (!TextUtils.isEmpty(uri.getPath())) {
                StringBuilder sb = new StringBuilder();
                sb.append(host);
                sb.append(uri.getPath());
                host = sb.toString();
            }
            return this.f34412a.matcher(host).matches();
        }
    }

    /* renamed from: a */
    private static String m37909a() {
        return UUID.randomUUID().toString();
    }

    static {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        f34407c = reentrantReadWriteLock;
        f34408d = reentrantReadWriteLock.readLock();
    }

    /* renamed from: a */
    private static void m37916a(boolean z) {
        f34405a = z;
    }

    /* renamed from: a */
    private static String m37910a(URI uri) {
        if (m37919b(uri)) {
            return m37909a();
        }
        return null;
    }

    /* renamed from: a */
    public static C12995a m37908a(JSONObject jSONObject) {
        int optInt = jSONObject.optInt("ttnet_response_verify_enabled", -1);
        JSONArray optJSONArray = jSONObject.optJSONArray("ttnet_response_verify");
        String str = "";
        if (optJSONArray != null) {
            str = optJSONArray.toString();
        }
        m37911a(optInt, optJSONArray);
        C12995a aVar = new C12995a();
        aVar.f34410a = optInt;
        aVar.f34411b = str;
        return aVar;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    private static boolean m37919b(URI uri) {
        try {
            f34408d.lock();
            for (C12996b a : f34406b) {
                if (a.mo31534a(uri)) {
                    f34408d.unlock();
                    return true;
                }
            }
            f34408d.unlock();
            return false;
        } catch (Throwable th) {
            f34408d.unlock();
            throw th;
        }
    }

    /* renamed from: a */
    public static void m37912a(SharedPreferences sharedPreferences) {
        JSONArray jSONArray;
        int i = sharedPreferences.getInt("ttnet_response_verify_enabled", -1);
        String string = sharedPreferences.getString("ttnet_response_verify", "");
        if (!TextUtils.isEmpty(string)) {
            try {
                jSONArray = new JSONArray(string);
            } catch (Throwable unused) {
            }
            m37911a(i, jSONArray);
        }
        jSONArray = null;
        m37911a(i, jSONArray);
    }

    /* renamed from: a */
    private static void m37915a(List<C12996b> list) {
        try {
            f34409e.lock();
            f34406b = list;
        } finally {
            f34409e.unlock();
        }
    }

    /* renamed from: b */
    private static void m37918b(String str, List<C12461b> list) {
        try {
            String a = m37910a(C10189i.m30260a(str));
            if (!TextUtils.isEmpty(a)) {
                list.add(new C12461b("X-TT-VERIFY-ID", a));
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private static void m37911a(int i, JSONArray jSONArray) {
        if (i > 0) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                int length = jSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    String optString = jSONArray.optString(i2);
                    if (!TextUtils.isEmpty(optString)) {
                        C12996b bVar = new C12996b();
                        if (bVar.mo31533a(optString)) {
                            arrayList.add(bVar);
                        }
                    }
                }
                m37915a((List<C12996b>) arrayList);
            }
            m37916a(true);
            return;
        }
        m37916a(false);
    }

    /* renamed from: a */
    public static void m37914a(String str, List<C12461b> list) {
        if (f34405a) {
            m37918b(str, list);
        }
    }

    /* renamed from: b */
    private static void m37917b(C12462c cVar, C12464d dVar, C12955b bVar) throws IOException {
        String str;
        C12461b a = cVar.mo30442a("X-TT-VERIFY-ID");
        String str2 = null;
        if (a != null) {
            str = a.f33096b;
        } else {
            str = null;
        }
        C12461b a2 = dVar.mo30450a("X-TT-VERIFY-ID");
        if (a2 != null) {
            str2 = a2.f33096b;
        }
        if (str != null) {
            if (str2 == null) {
                bVar.f34301B = 1;
            } else if (str.equals(str2)) {
                bVar.f34301B = 2;
            } else {
                bVar.f34301B = 3;
                try {
                    dVar.f33122e.mo10444in().close();
                } catch (Throwable unused) {
                }
            }
            if (bVar.f34301B == 3) {
                throw new CdnCacheVerifyException("Fail to verify cdn cache");
            }
        }
    }

    /* renamed from: a */
    public static void m37913a(C12462c cVar, C12464d dVar, C12955b bVar) throws IOException {
        if (f34405a && bVar != null) {
            m37917b(cVar, dVar, bVar);
        }
    }
}
