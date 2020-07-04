package com.bytedance.frameworks.baselib.network.http.impl;

import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.taobao.android.dexposed.ClassUtils;
import java.net.URI;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: com.bytedance.frameworks.baselib.network.http.impl.e */
public final class C10163e implements Cloneable {

    /* renamed from: m */
    private static final Set<String> f27667m;

    /* renamed from: n */
    private static Pattern f27668n;

    /* renamed from: o */
    private static Pattern f27669o;

    /* renamed from: p */
    private static final ThreadLocal<DateFormat> f27670p = new ThreadLocal<DateFormat>() {
        /* access modifiers changed from: protected */
        public final /* synthetic */ Object initialValue() {
            return m30185a();
        }

        /* renamed from: a */
        private static DateFormat m30185a() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            return simpleDateFormat;
        }
    };

    /* renamed from: q */
    private static final String[] f27671q = {"EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};

    /* renamed from: a */
    public String f27672a;

    /* renamed from: b */
    public String f27673b;

    /* renamed from: c */
    public boolean f27674c;

    /* renamed from: d */
    public String f27675d;

    /* renamed from: e */
    public long f27676e = -1;

    /* renamed from: f */
    public final String f27677f;

    /* renamed from: g */
    public String f27678g;

    /* renamed from: h */
    public String f27679h;

    /* renamed from: i */
    public boolean f27680i;

    /* renamed from: j */
    public boolean f27681j;

    /* renamed from: k */
    public String f27682k;

    /* renamed from: l */
    public int f27683l = 1;

    /* renamed from: com.bytedance.frameworks.baselib.network.http.impl.e$a */
    static class C10165a {

        /* renamed from: a */
        boolean f27684a;

        /* renamed from: b */
        boolean f27685b;

        /* renamed from: c */
        boolean f27686c;

        /* renamed from: d */
        private final String f27687d;

        /* renamed from: e */
        private final String f27688e;

        /* renamed from: f */
        private int f27689f;

        /* renamed from: c */
        private void m30191c() {
            while (this.f27689f < this.f27687d.length() && " \t".indexOf(this.f27687d.charAt(this.f27689f)) != -1) {
                this.f27689f++;
            }
        }

        /* renamed from: b */
        private boolean m30190b() {
            m30191c();
            if (this.f27689f >= this.f27687d.length() || this.f27687d.charAt(this.f27689f) != '=') {
                return false;
            }
            this.f27689f++;
            return true;
        }

        /* renamed from: a */
        public final List<C10163e> mo24845a() {
            int i;
            String str;
            String str2;
            ArrayList arrayList = new ArrayList(2);
            if (this.f27688e.startsWith("set-cookie2:")) {
                this.f27689f += 12;
                this.f27686c = true;
                i = 0;
            } else {
                if (this.f27688e.startsWith("set-cookie:")) {
                    this.f27689f += 11;
                }
                i = 1;
            }
            while (true) {
                String a = m30187a(false);
                if (a == null) {
                    if (!arrayList.isEmpty()) {
                        return arrayList;
                    }
                    StringBuilder sb = new StringBuilder("No cookies in ");
                    sb.append(this.f27687d);
                    throw new IllegalArgumentException(sb.toString());
                } else if (m30190b()) {
                    if (i != 0) {
                        str = ";";
                    } else {
                        str = ",;";
                    }
                    C10163e eVar = new C10163e(a, m30186a(str));
                    eVar.f27683l = i ^ 1;
                    arrayList.add(eVar);
                    while (true) {
                        m30191c();
                        if (this.f27689f == this.f27687d.length()) {
                            break;
                        } else if (this.f27687d.charAt(this.f27689f) == ',') {
                            this.f27689f++;
                            break;
                        } else {
                            if (this.f27687d.charAt(this.f27689f) == ';') {
                                this.f27689f++;
                            }
                            String a2 = m30187a(true);
                            if (a2 != null) {
                                if (i != 0 || "expires".equals(a2) || "port".equals(a2)) {
                                    str2 = ";";
                                } else {
                                    str2 = ";,";
                                }
                                String str3 = null;
                                if (m30190b()) {
                                    str3 = m30186a(str2);
                                }
                                m30188a(eVar, a2, str3);
                            }
                        }
                    }
                    if (this.f27684a) {
                        eVar.f27683l = 0;
                    } else if (this.f27685b) {
                        eVar.f27683l = 1;
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder("Expected '=' after ");
                    sb2.append(a);
                    sb2.append(" in ");
                    sb2.append(this.f27687d);
                    throw new IllegalArgumentException(sb2.toString());
                }
            }
        }

        C10165a(String str) {
            this.f27687d = str;
            this.f27688e = str.toLowerCase(Locale.US);
        }

        /* renamed from: a */
        private String m30186a(String str) {
            m30191c();
            int b = m30189b(str);
            String substring = this.f27687d.substring(this.f27689f, b);
            this.f27689f = b;
            return substring;
        }

        /* renamed from: a */
        private String m30187a(boolean z) {
            String str;
            String str2;
            m30191c();
            int b = m30189b(",;= \t");
            if (z) {
                str = this.f27688e;
            } else {
                str = this.f27687d;
            }
            if (this.f27689f < b) {
                str2 = str.substring(this.f27689f, b);
            } else {
                str2 = null;
            }
            this.f27689f = b;
            return str2;
        }

        /* renamed from: b */
        private int m30189b(String str) {
            for (int i = this.f27689f; i < this.f27687d.length(); i++) {
                if (str.indexOf(this.f27687d.charAt(i)) != -1) {
                    return i;
                }
            }
            return this.f27687d.length();
        }

        /* renamed from: a */
        private void m30188a(C10163e eVar, String str, String str2) {
            if (str.equals("comment") && eVar.f27672a == null) {
                eVar.f27672a = str2;
            } else if (str.equals("commenturl") && eVar.f27673b == null) {
                eVar.f27673b = str2;
            } else if (str.equals("discard")) {
                eVar.f27674c = true;
            } else if (!str.equals("domain") || eVar.f27675d != null) {
                if (str.equals("expires")) {
                    this.f27684a = true;
                    if (eVar.f27676e == -1) {
                        Date c = C10163e.m30176c(str2);
                        if (c != null) {
                            eVar.mo24837a(c);
                        } else {
                            eVar.f27676e = 0;
                        }
                    }
                } else if (str.equals("max-age") && eVar.f27676e == -1) {
                    try {
                        long parseLong = Long.parseLong(str2);
                        this.f27685b = true;
                        eVar.f27676e = parseLong;
                    } catch (NumberFormatException unused) {
                        StringBuilder sb = new StringBuilder("Invalid max-age: ");
                        sb.append(str2);
                        throw new IllegalArgumentException(sb.toString());
                    }
                } else if (str.equals("path") && eVar.f27678g == null) {
                    eVar.f27678g = str2;
                } else if (str.equals("port") && eVar.f27679h == null) {
                    if (str2 == null) {
                        str2 = "";
                    }
                    eVar.f27679h = str2;
                } else if (str.equals("secure")) {
                    eVar.f27680i = true;
                } else if (str.equals("httponly")) {
                    eVar.f27681j = true;
                } else if (str.equals(C38347c.f99551f) && !this.f27686c) {
                    eVar.f27683l = Integer.parseInt(str2);
                }
            } else {
                eVar.f27675d = str2;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo24838a() {
        boolean z = false;
        if (this.f27676e == -1) {
            return false;
        }
        if (this.f27676e <= 0) {
            z = true;
        }
        return z;
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public final int hashCode() {
        int i;
        int hashCode = this.f27677f.toLowerCase(Locale.US).hashCode();
        int i2 = 0;
        if (this.f27675d == null) {
            i = 0;
        } else {
            i = this.f27675d.toLowerCase(Locale.US).hashCode();
        }
        int i3 = hashCode + i;
        if (this.f27678g != null) {
            i2 = this.f27678g.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        if (this.f27683l == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f27677f);
            sb.append("=");
            sb.append(this.f27682k);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f27677f);
        sb2.append("=\"");
        sb2.append(this.f27682k);
        sb2.append("\"");
        m30170a(sb2, "Path", this.f27678g);
        m30170a(sb2, "Domain", this.f27675d);
        m30170a(sb2, "Port", this.f27679h);
        return sb2.toString();
    }

    static {
        HashSet hashSet = new HashSet();
        f27667m = hashSet;
        hashSet.add("comment");
        f27667m.add("commenturl");
        f27667m.add("discard");
        f27667m.add("domain");
        f27667m.add("expires");
        f27667m.add("httponly");
        f27667m.add("max-age");
        f27667m.add("path");
        f27667m.add("port");
        f27667m.add("secure");
        f27667m.add(C38347c.f99551f);
        f27668n = null;
        f27669o = null;
        try {
            f27668n = Pattern.compile("(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])", 2);
            f27669o = Pattern.compile("([0-9a-f]{1,4}:){7}([0-9a-f]){1,4}", 2);
        } catch (PatternSyntaxException unused) {
        }
    }

    /* renamed from: a */
    public static List<C10163e> m30169a(String str) {
        return new C10165a(str).mo24845a();
    }

    /* renamed from: b */
    public final void mo24839b(String str) {
        String str2;
        if (str == null) {
            str2 = null;
        } else {
            str2 = str.toLowerCase(Locale.US);
        }
        this.f27675d = str2;
    }

    /* renamed from: d */
    private static String m30178d(String str) {
        if (str == null) {
            return "/";
        }
        if (str.endsWith("/")) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("/");
        return sb.toString();
    }

    /* renamed from: f */
    private static boolean m30180f(String str) {
        try {
            if (f27668n.matcher(str).matches() || f27669o.matcher(str).matches()) {
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* renamed from: c */
    public static Date m30176c(String str) {
        try {
            return ((DateFormat) f27670p.get()).parse(str);
        } catch (ParseException unused) {
            String[] strArr = f27671q;
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                try {
                    return new SimpleDateFormat(strArr[i], Locale.US).parse(str);
                } catch (ParseException unused2) {
                    i++;
                }
            }
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10163e)) {
            return false;
        }
        C10163e eVar = (C10163e) obj;
        if (!this.f27677f.equalsIgnoreCase(eVar.f27677f) || (this.f27675d == null ? eVar.f27675d != null : !this.f27675d.equalsIgnoreCase(eVar.f27675d)) || !m30172a((Object) this.f27678g, (Object) eVar.f27678g)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private static boolean m30179e(String str) {
        boolean z;
        if (str.length() == 0 || str.startsWith(ClassUtils.INNER_CLASS_SEPARATOR) || f27667m.contains(str.toLowerCase(Locale.US))) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return z;
        }
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt < 0 || charAt >= 127 || charAt == ';' || charAt == ',' || (Character.isWhitespace(charAt) && charAt != ' ')) {
                return false;
            }
        }
        return z;
    }

    /* renamed from: a */
    public final void mo24836a(int i) {
        if (i == 0 || i == 1) {
            this.f27683l = i;
            return;
        }
        StringBuilder sb = new StringBuilder("Bad version: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public final void mo24837a(Date date) {
        this.f27676e = (date.getTime() - System.currentTimeMillis()) / 1000;
    }

    /* renamed from: b */
    public static boolean m30175b(C10163e eVar, URI uri) {
        if (!eVar.f27680i || WebKitApi.SCHEME_HTTPS.equalsIgnoreCase(uri.getScheme())) {
            return true;
        }
        return false;
    }

    public C10163e(String str, String str2) {
        String trim = str.trim();
        if (m30179e(trim)) {
            this.f27677f = trim;
            this.f27682k = str2;
            return;
        }
        StringBuilder sb = new StringBuilder("Invalid name: ");
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public static boolean m30171a(C10163e eVar, URI uri) {
        return m30178d(uri.getPath()).startsWith(m30178d(eVar.f27678g));
    }

    /* renamed from: a */
    private static boolean m30172a(Object obj, Object obj2) {
        if (obj != null) {
            return obj.equals(obj2);
        }
        if (obj2 == null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m30177c(C10163e eVar, URI uri) {
        if (eVar.f27679h == null) {
            return true;
        }
        return Arrays.asList(eVar.f27679h.split(",")).contains(Integer.toString(SerializableHttpCookie.getEffectivePort(uri.getScheme(), uri.getPort())));
    }

    /* renamed from: a */
    private static boolean m30173a(String str, int i) {
        int indexOf = str.indexOf(46, i + 1);
        if (indexOf == -1 || indexOf >= str.length() - 1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m30174a(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        String lowerCase = str2.toLowerCase(Locale.US);
        String lowerCase2 = str.toLowerCase(Locale.US);
        if (lowerCase.equals(lowerCase2) && (m30173a(lowerCase, 0) || m30180f(lowerCase))) {
            return true;
        }
        if (!m30173a(lowerCase, 0)) {
            return lowerCase2.equals(".local");
        }
        if (lowerCase2.length() == lowerCase.length() + 1 && lowerCase2.startsWith(ClassUtils.PACKAGE_SEPARATOR) && lowerCase2.endsWith(lowerCase) && m30173a(lowerCase2, 1)) {
            return true;
        }
        if (lowerCase.length() <= lowerCase2.length() || !lowerCase.endsWith(lowerCase2) || ((!lowerCase2.startsWith(ClassUtils.PACKAGE_SEPARATOR) || !m30173a(lowerCase2, 1)) && !lowerCase2.equals(".local"))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static void m30170a(StringBuilder sb, String str, String str2) {
        if (str2 != null && sb != null) {
            sb.append(";$");
            sb.append(str);
            sb.append("=\"");
            sb.append(str2);
            sb.append("\"");
        }
    }
}
