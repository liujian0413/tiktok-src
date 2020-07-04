package com.google.api.client.http;

import com.google.api.client.util.C17384w;
import java.nio.charset.Charset;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.api.client.http.n */
public final class C17265n {

    /* renamed from: c */
    private static final Pattern f48088c = Pattern.compile("[\\w!#$&.+\\-\\^_]+|[*]");

    /* renamed from: d */
    private static final Pattern f48089d = Pattern.compile("[\\p{ASCII}&&[^\\p{Cntrl} ;/=\\[\\]\\(\\)\\<\\>\\@\\,\\:\\\"\\?\\=]]+");

    /* renamed from: e */
    private static final Pattern f48090e;

    /* renamed from: f */
    private static final Pattern f48091f;

    /* renamed from: a */
    public String f48092a = "application";

    /* renamed from: b */
    public String f48093b = "octet-stream";

    /* renamed from: g */
    private final SortedMap<String, String> f48094g = new TreeMap();

    /* renamed from: h */
    private String f48095h;

    public final String toString() {
        return mo44636a();
    }

    public final int hashCode() {
        return mo44636a().hashCode();
    }

    /* renamed from: b */
    public final Charset mo44638b() {
        String a = mo44637a("charset");
        if (a == null) {
            return null;
        }
        return Charset.forName(a);
    }

    /* renamed from: a */
    public final String mo44636a() {
        if (this.f48095h != null) {
            return this.f48095h;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f48092a);
        sb.append('/');
        sb.append(this.f48093b);
        if (this.f48094g != null) {
            for (Entry entry : this.f48094g.entrySet()) {
                String str = (String) entry.getValue();
                sb.append("; ");
                sb.append((String) entry.getKey());
                sb.append("=");
                if (!m57421b(str)) {
                    str = m57427g(str);
                }
                sb.append(str);
            }
        }
        this.f48095h = sb.toString();
        return this.f48095h;
    }

    static {
        String str = "[^\\s/=;\"]+";
        String valueOf = String.valueOf(String.valueOf(str));
        String valueOf2 = String.valueOf(String.valueOf(str));
        String valueOf3 = String.valueOf(String.valueOf(";.*"));
        StringBuilder sb = new StringBuilder(valueOf.length() + 14 + valueOf2.length() + valueOf3.length());
        sb.append("\\s*(");
        sb.append(valueOf);
        sb.append(")/(");
        sb.append(valueOf2);
        sb.append(")\\s*(");
        sb.append(valueOf3);
        sb.append(")?");
        f48090e = Pattern.compile(sb.toString(), 32);
        String valueOf4 = String.valueOf(String.valueOf("\"([^\"]*)\""));
        String valueOf5 = String.valueOf(String.valueOf("[^\\s;\"]*"));
        StringBuilder sb2 = new StringBuilder(valueOf4.length() + 1 + valueOf5.length());
        sb2.append(valueOf4);
        sb2.append("|");
        sb2.append(valueOf5);
        String sb3 = sb2.toString();
        String valueOf6 = String.valueOf(String.valueOf(str));
        String valueOf7 = String.valueOf(String.valueOf(sb3));
        StringBuilder sb4 = new StringBuilder(valueOf6.length() + 12 + valueOf7.length());
        sb4.append("\\s*;\\s*(");
        sb4.append(valueOf6);
        sb4.append(")=(");
        sb4.append(valueOf7);
        sb4.append(")");
        f48091f = Pattern.compile(sb4.toString());
    }

    /* renamed from: b */
    static boolean m57421b(String str) {
        return f48089d.matcher(str).matches();
    }

    /* renamed from: f */
    private C17265n m57426f(String str) {
        this.f48095h = null;
        this.f48094g.remove(str.toLowerCase());
        return this;
    }

    /* renamed from: a */
    public final C17265n mo44635a(Charset charset) {
        String str;
        String str2 = "charset";
        if (charset == null) {
            str = null;
        } else {
            str = charset.name();
        }
        mo44634a(str2, str);
        return this;
    }

    public C17265n(String str) {
        m57425e(str);
    }

    /* renamed from: a */
    private boolean m57420a(C17265n nVar) {
        if (nVar == null || !this.f48092a.equalsIgnoreCase(nVar.f48092a) || !this.f48093b.equalsIgnoreCase(nVar.f48093b)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private C17265n m57423c(String str) {
        C17384w.m57851a(f48088c.matcher(str).matches(), (Object) "Type contains reserved characters");
        this.f48092a = str;
        this.f48095h = null;
        return this;
    }

    /* renamed from: d */
    private C17265n m57424d(String str) {
        C17384w.m57851a(f48088c.matcher(str).matches(), (Object) "Subtype contains reserved characters");
        this.f48093b = str;
        this.f48095h = null;
        return this;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17265n)) {
            return false;
        }
        C17265n nVar = (C17265n) obj;
        if (!m57420a(nVar) || !this.f48094g.equals(nVar.f48094g)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    private static String m57427g(String str) {
        String valueOf = String.valueOf(String.valueOf(str.replace("\\", "\\\\").replace("\"", "\\\"")));
        StringBuilder sb = new StringBuilder(valueOf.length() + 2);
        sb.append("\"");
        sb.append(valueOf);
        sb.append("\"");
        return sb.toString();
    }

    /* renamed from: e */
    private C17265n m57425e(String str) {
        Matcher matcher = f48090e.matcher(str);
        C17384w.m57851a(matcher.matches(), (Object) "Type must be in the 'maintype/subtype; parameter=value' format");
        m57423c(matcher.group(1));
        m57424d(matcher.group(2));
        String group = matcher.group(3);
        if (group != null) {
            Matcher matcher2 = f48091f.matcher(group);
            while (matcher2.find()) {
                String group2 = matcher2.group(1);
                String group3 = matcher2.group(3);
                if (group3 == null) {
                    group3 = matcher2.group(2);
                }
                mo44634a(group2, group3);
            }
        }
        return this;
    }

    /* renamed from: a */
    public final String mo44637a(String str) {
        return (String) this.f48094g.get(str.toLowerCase());
    }

    /* renamed from: b */
    public static boolean m57422b(String str, String str2) {
        if (str2 == null || !new C17265n(str).m57420a(new C17265n(str2))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final C17265n mo44634a(String str, String str2) {
        if (str2 == null) {
            m57426f(str);
            return this;
        }
        C17384w.m57851a(f48089d.matcher(str).matches(), (Object) "Name contains reserved characters");
        this.f48095h = null;
        this.f48094g.put(str.toLowerCase(), str2);
        return this;
    }
}
