package com.google.api.client.http;

import com.google.api.client.util.C17384w;
import com.google.api.client.util.GenericData;
import com.google.api.client.util.p782a.C17340a;
import com.google.api.client.util.p782a.C17341b;
import com.google.api.client.util.p782a.C17342c;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.google.api.client.http.g */
public final class C17256g extends GenericData {

    /* renamed from: g */
    private static final C17341b f48073g = new C17342c("=&-_.!~*'()@:$,;/?:", false);

    /* renamed from: a */
    public String f48074a;

    /* renamed from: b */
    public String f48075b;

    /* renamed from: c */
    public String f48076c;

    /* renamed from: d */
    public int f48077d;

    /* renamed from: e */
    public List<String> f48078e;

    /* renamed from: f */
    public String f48079f;

    public C17256g() {
        this.f48077d = -1;
    }

    public final String toString() {
        return mo44609c();
    }

    /* renamed from: f */
    private URL m57370f() {
        return m57368d(mo44609c());
    }

    public final int hashCode() {
        return mo44609c().hashCode();
    }

    /* renamed from: a */
    public final C17256g clone() {
        C17256g gVar = (C17256g) super.clone();
        if (this.f48078e != null) {
            gVar.f48078e = new ArrayList(this.f48078e);
        }
        return gVar;
    }

    /* renamed from: e */
    private String m57369e() {
        StringBuilder sb = new StringBuilder();
        if (this.f48078e != null) {
            m57363a(sb);
        }
        m57364a(entrySet(), sb);
        String str = this.f48079f;
        if (str != null) {
            sb.append('#');
            sb.append(f48073g.mo44809a(str));
        }
        return sb.toString();
    }

    /* renamed from: d */
    private String m57367d() {
        StringBuilder sb = new StringBuilder();
        sb.append((String) C17384w.m57847a(this.f48074a));
        sb.append("://");
        if (this.f48076c != null) {
            sb.append(C17340a.m57756e(this.f48076c));
            sb.append('@');
        }
        sb.append((String) C17384w.m57847a(this.f48075b));
        int i = this.f48077d;
        if (i != -1) {
            sb.append(':');
            sb.append(i);
        }
        return sb.toString();
    }

    /* renamed from: c */
    public final String mo44609c() {
        String valueOf = String.valueOf(m57367d());
        String valueOf2 = String.valueOf(m57369e());
        if (valueOf2.length() != 0) {
            return valueOf.concat(valueOf2);
        }
        return new String(valueOf);
    }

    public C17256g(String str) {
        this(m57368d(str));
    }

    /* renamed from: d */
    private static URL m57368d(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: b */
    public final void mo44608b(String str) {
        this.f48078e = m57366c(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || !(obj instanceof C17256g)) {
            return false;
        }
        return mo44609c().equals(((C17256g) obj).toString());
    }

    /* renamed from: a */
    private void m57363a(StringBuilder sb) {
        int size = this.f48078e.size();
        for (int i = 0; i < size; i++) {
            String str = (String) this.f48078e.get(i);
            if (i != 0) {
                sb.append('/');
            }
            if (str.length() != 0) {
                sb.append(C17340a.m57754c(str));
            }
        }
    }

    /* renamed from: c */
    private static List<String> m57366c(String str) {
        boolean z;
        String str2;
        if (str == null || str.length() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        boolean z2 = true;
        int i = 0;
        while (z2) {
            int indexOf = str.indexOf(47, i);
            if (indexOf != -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str2 = str.substring(i, indexOf);
            } else {
                str2 = str.substring(i);
            }
            arrayList.add(C17340a.m57753b(str2));
            i = indexOf + 1;
            z2 = z;
        }
        return arrayList;
    }

    public C17256g(URL url) {
        this(url.getProtocol(), url.getHost(), url.getPort(), url.getPath(), url.getRef(), url.getQuery(), url.getUserInfo());
    }

    /* renamed from: a */
    public final URL mo44607a(String str) {
        try {
            return new URL(m57370f(), str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C17256g mo44448c(String str, Object obj) {
        return (C17256g) super.mo44448c(str, obj);
    }

    /* renamed from: a */
    static void m57364a(Set<Entry<String, Object>> set, StringBuilder sb) {
        boolean z = true;
        for (Entry entry : set) {
            Object value = entry.getValue();
            if (value != null) {
                String f = C17340a.m57757f((String) entry.getKey());
                if (value instanceof Collection) {
                    for (Object a : (Collection) value) {
                        z = m57365a(z, sb, f, a);
                    }
                } else {
                    z = m57365a(z, sb, f, value);
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m57365a(boolean z, StringBuilder sb, String str, Object obj) {
        if (z) {
            z = false;
            sb.append('?');
        } else {
            sb.append('&');
        }
        sb.append(str);
        String f = C17340a.m57757f(obj.toString());
        if (f.length() != 0) {
            sb.append('=');
            sb.append(f);
        }
        return z;
    }

    private C17256g(String str, String str2, int i, String str3, String str4, String str5, String str6) {
        String str7;
        this.f48077d = -1;
        this.f48074a = str.toLowerCase();
        this.f48075b = str2;
        this.f48077d = i;
        this.f48078e = m57366c(str3);
        String str8 = null;
        if (str4 != null) {
            str7 = C17340a.m57753b(str4);
        } else {
            str7 = null;
        }
        this.f48079f = str7;
        if (str5 != null) {
            C17240ac.m57316a(str5, (Object) this);
        }
        if (str6 != null) {
            str8 = C17340a.m57753b(str6);
        }
        this.f48076c = str8;
    }
}
