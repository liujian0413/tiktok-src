package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.C14793ay;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.ck */
public final class C15600ck {

    /* renamed from: a */
    private boolean f44226a;

    /* renamed from: b */
    private final List<C15598ci> f44227b = new LinkedList();

    /* renamed from: c */
    private final Map<String, String> f44228c = new LinkedHashMap();

    /* renamed from: d */
    private final Object f44229d = new Object();

    /* renamed from: e */
    private String f44230e;

    /* renamed from: f */
    private C15600ck f44231f;

    public C15600ck(boolean z, String str, String str2) {
        this.f44226a = z;
        this.f44228c.put("action", str);
        this.f44228c.put("ad_format", str2);
    }

    /* renamed from: a */
    public final void mo41456a(C15600ck ckVar) {
        synchronized (this.f44229d) {
            this.f44231f = ckVar;
        }
    }

    /* renamed from: a */
    public final C15598ci mo41454a() {
        return mo41455a(C14793ay.m42901g().mo38685b());
    }

    /* renamed from: a */
    public final C15598ci mo41455a(long j) {
        if (!this.f44226a) {
            return null;
        }
        return new C15598ci(j, null, null);
    }

    /* renamed from: a */
    public final boolean mo41460a(C15598ci ciVar, String... strArr) {
        if (!this.f44226a || ciVar == null) {
            return false;
        }
        return mo41459a(ciVar, C14793ay.m42901g().mo38685b(), strArr);
    }

    /* renamed from: a */
    public final boolean mo41459a(C15598ci ciVar, long j, String... strArr) {
        synchronized (this.f44229d) {
            for (String ciVar2 : strArr) {
                this.f44227b.add(new C15598ci(j, ciVar2, ciVar));
            }
        }
        return true;
    }

    /* renamed from: b */
    public final String mo41461b() {
        String sb;
        StringBuilder sb2 = new StringBuilder();
        synchronized (this.f44229d) {
            for (C15598ci ciVar : this.f44227b) {
                long j = ciVar.f44221a;
                String str = ciVar.f44222b;
                C15598ci ciVar2 = ciVar.f44223c;
                if (ciVar2 != null && j > 0) {
                    long j2 = j - ciVar2.f44221a;
                    sb2.append(str);
                    sb2.append('.');
                    sb2.append(j2);
                    sb2.append(',');
                }
            }
            this.f44227b.clear();
            if (!TextUtils.isEmpty(this.f44230e)) {
                sb2.append(this.f44230e);
            } else if (sb2.length() > 0) {
                sb2.setLength(sb2.length() - 1);
            }
            sb = sb2.toString();
        }
        return sb;
    }

    /* renamed from: a */
    public final void mo41457a(String str) {
        if (this.f44226a) {
            synchronized (this.f44229d) {
                this.f44230e = str;
            }
        }
    }

    /* renamed from: a */
    public final void mo41458a(String str, String str2) {
        if (this.f44226a && !TextUtils.isEmpty(str2)) {
            C15588bz a = C14793ay.m42898d().mo39086a();
            if (a != null) {
                synchronized (this.f44229d) {
                    C15594ce a2 = a.mo41445a(str);
                    Map<String, String> map = this.f44228c;
                    map.put(str, a2.mo41451a((String) map.get(str), str2));
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final Map<String, String> mo41462c() {
        synchronized (this.f44229d) {
            C15588bz a = C14793ay.m42898d().mo39086a();
            if (a != null) {
                if (this.f44231f != null) {
                    Map<String, String> a2 = a.mo41446a(this.f44228c, this.f44231f.mo41462c());
                    return a2;
                }
            }
            Map<String, String> map = this.f44228c;
            return map;
        }
    }
}
