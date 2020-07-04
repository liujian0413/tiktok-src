package com.bytedance.ttnet.encrypt;

import android.util.Pair;
import com.bytedance.frameworks.baselib.network.http.C10142f;
import com.bytedance.frameworks.baselib.network.http.C10142f.C10151i;
import com.bytedance.frameworks.baselib.network.http.C10142f.C10152j;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.bytedance.ttnet.encrypt.TtTokenConfig.C12977a;
import java.net.URI;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bytedance.ttnet.encrypt.c */
public class C12980c implements C10151i, C10152j {

    /* renamed from: a */
    private static C12980c f34377a;

    /* renamed from: b */
    private static C12981a f34378b;

    /* renamed from: c */
    private C12977a f34379c = TtTokenConfig.m37818a().mo31494b();

    /* renamed from: com.bytedance.ttnet.encrypt.c$a */
    public interface C12981a {
        /* renamed from: p */
        boolean mo31421p();

        /* renamed from: q */
        Set<String> mo31422q();
    }

    /* renamed from: d */
    public static C12981a m37838d() {
        return f34378b;
    }

    /* renamed from: b */
    public final void mo24820b() {
        TtTokenConfig.m37818a().mo31497e();
    }

    private C12980c() {
        C10142f.m30111a((C10152j) this);
    }

    /* renamed from: c */
    public static C12980c m37837c() {
        if (f34377a == null) {
            synchronized (C12980c.class) {
                if (f34377a == null) {
                    f34377a = new C12980c();
                }
            }
        }
        return f34377a;
    }

    /* renamed from: a */
    public final Map<String, ?> mo24817a() {
        if (f34378b == null || !f34378b.mo31421p()) {
            return Collections.emptyMap();
        }
        return TtTokenConfig.m37818a().mo31495c();
    }

    /* renamed from: a */
    public static void m37836a(C12981a aVar) {
        f34378b = aVar;
    }

    /* renamed from: a */
    public final void mo24788a(Map<String, ?> map) {
        if (map != null) {
            this.f34379c = (C12977a) map.get("session_token");
        }
    }

    /* renamed from: a */
    public final Pair<Boolean, String> mo24815a(String str) {
        if (f34378b == null || !f34378b.mo31421p()) {
            return new Pair<>(Boolean.valueOf(false), str);
        }
        return C12979b.m37831a(this.f34379c, str);
    }

    /* renamed from: b */
    public final Pair<Boolean, byte[]> mo24819b(byte[] bArr) {
        if (f34378b == null || !f34378b.mo31421p()) {
            return new Pair<>(Boolean.valueOf(false), bArr);
        }
        return C12979b.m37835b(this.f34379c, bArr);
    }

    /* renamed from: a */
    public final Pair<Boolean, byte[]> mo24816a(byte[] bArr) {
        if (f34378b == null || !f34378b.mo31421p()) {
            return new Pair<>(Boolean.valueOf(false), bArr);
        }
        return C12979b.m37832a(this.f34379c, bArr);
    }

    /* renamed from: a */
    public final boolean mo24818a(URI uri) {
        boolean z;
        if (uri == null || f34378b == null || !f34378b.mo31421p() || !WebKitApi.SCHEME_HTTP.equals(uri.getScheme())) {
            return false;
        }
        Set q = f34378b.mo31422q();
        if (q == null || q.isEmpty()) {
            return false;
        }
        Iterator it = q.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            String str = (String) it.next();
            if (uri.getHost() != null && uri.getHost().contains(str)) {
                z = true;
                break;
            }
        }
        if (!z) {
            return false;
        }
        return true;
    }
}
