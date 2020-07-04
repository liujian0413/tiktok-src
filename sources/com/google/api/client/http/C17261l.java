package com.google.api.client.http;

import com.google.api.client.util.C17347ab;
import com.google.api.client.util.C17349ad;
import com.google.api.client.util.C17350ae;
import com.google.api.client.util.C17353b;
import com.google.api.client.util.C17362g;
import com.google.api.client.util.C17366i;
import com.google.api.client.util.C17371k;
import com.google.api.client.util.C17384w;
import com.google.api.client.util.C6580n;
import com.google.api.client.util.GenericData;
import com.google.api.client.util.GenericData.Flags;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.api.client.http.l */
public final class C17261l extends GenericData {
    @C6580n(mo15941a = "Accept")
    private List<String> accept;
    @C6580n(mo15941a = "Accept-Encoding")
    private List<String> acceptEncoding = new ArrayList(Collections.singleton("gzip"));
    @C6580n(mo15941a = "Age")
    private List<Long> age;
    @C6580n(mo15941a = "WWW-Authenticate")
    public List<String> authenticate;
    @C6580n(mo15941a = "Authorization")
    public List<String> authorization;
    @C6580n(mo15941a = "Cache-Control")
    private List<String> cacheControl;
    @C6580n(mo15941a = "Content-Encoding")
    private List<String> contentEncoding;
    @C6580n(mo15941a = "Content-Length")
    private List<Long> contentLength;
    @C6580n(mo15941a = "Content-MD5")
    private List<String> contentMD5;
    @C6580n(mo15941a = "Content-Range")
    private List<String> contentRange;
    @C6580n(mo15941a = "Content-Type")
    private List<String> contentType;
    @C6580n(mo15941a = "Cookie")
    private List<String> cookie;
    @C6580n(mo15941a = "Date")
    private List<String> date;
    @C6580n(mo15941a = "ETag")
    private List<String> etag;
    @C6580n(mo15941a = "Expires")
    private List<String> expires;
    @C6580n(mo15941a = "If-Match")
    private List<String> ifMatch;
    @C6580n(mo15941a = "If-Modified-Since")
    private List<String> ifModifiedSince;
    @C6580n(mo15941a = "If-None-Match")
    private List<String> ifNoneMatch;
    @C6580n(mo15941a = "If-Range")
    private List<String> ifRange;
    @C6580n(mo15941a = "If-Unmodified-Since")
    private List<String> ifUnmodifiedSince;
    @C6580n(mo15941a = "Last-Modified")
    private List<String> lastModified;
    @C6580n(mo15941a = "Location")
    private List<String> location;
    @C6580n(mo15941a = "MIME-Version")
    private List<String> mimeVersion;
    @C6580n(mo15941a = "Range")
    private List<String> range;
    @C6580n(mo15941a = "Retry-After")
    private List<String> retryAfter;
    @C6580n(mo15941a = "User-Agent")
    private List<String> userAgent;

    /* renamed from: com.google.api.client.http.l$a */
    static class C17262a extends C17275x {

        /* renamed from: e */
        private final C17261l f48082e;

        /* renamed from: f */
        private final C17263b f48083f;

        /* renamed from: a */
        public final C17276y mo44568a() throws IOException {
            throw new UnsupportedOperationException();
        }

        C17262a(C17261l lVar, C17263b bVar) {
            this.f48082e = lVar;
            this.f48083f = bVar;
        }

        /* renamed from: a */
        public final void mo44570a(String str, String str2) {
            this.f48082e.mo44619a(str, str2, this.f48083f);
        }
    }

    /* renamed from: com.google.api.client.http.l$b */
    static final class C17263b {

        /* renamed from: a */
        final C17353b f48084a;

        /* renamed from: b */
        final StringBuilder f48085b;

        /* renamed from: c */
        final C17362g f48086c;

        /* renamed from: d */
        final List<Type> f48087d;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo44633a() {
            this.f48084a.mo44818a();
        }

        public C17263b(C17261l lVar, StringBuilder sb) {
            Class cls = lVar.getClass();
            this.f48087d = Arrays.asList(new Type[]{cls});
            this.f48086c = C17362g.m57799a(cls, true);
            this.f48085b = sb;
            this.f48084a = new C17353b(lVar);
        }
    }

    /* renamed from: a */
    public final String mo44616a() {
        return (String) m57391b(this.contentType);
    }

    /* renamed from: a */
    public final void mo44618a(C17276y yVar, StringBuilder sb) throws IOException {
        clear();
        C17263b bVar = new C17263b(this, sb);
        int g = yVar.mo44579g();
        for (int i = 0; i < g; i++) {
            mo44619a(yVar.mo44572a(i), yVar.mo44574b(i), bVar);
        }
        bVar.mo44633a();
    }

    /* renamed from: a */
    public final void mo44617a(C17261l lVar) {
        try {
            C17263b bVar = new C17263b(this, null);
            m57387a(lVar, null, null, null, new C17262a(this, bVar));
            bVar.mo44633a();
        } catch (IOException e) {
            throw C17349ad.m57773a(e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo44619a(String str, String str2, C17263b bVar) {
        List<Type> list = bVar.f48087d;
        C17362g gVar = bVar.f48086c;
        C17353b bVar2 = bVar.f48084a;
        StringBuilder sb = bVar.f48085b;
        if (sb != null) {
            String valueOf = String.valueOf(String.valueOf(str));
            String valueOf2 = String.valueOf(String.valueOf(str2));
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 2 + valueOf2.length());
            sb2.append(valueOf);
            sb2.append(": ");
            sb2.append(valueOf2);
            sb.append(sb2.toString());
            sb.append(C17347ab.f48262a);
        }
        C17371k a = gVar.mo44831a(str);
        if (a != null) {
            Type a2 = C17366i.m57809a(list, a.mo44856a());
            if (C17350ae.m57785a(a2)) {
                Class a3 = C17350ae.m57775a(list, C17350ae.m57786b(a2));
                bVar2.mo44819a(a.f48313b, a3, m57385a((Type) a3, list, str2));
            } else if (C17350ae.m57784a(C17350ae.m57775a(list, a2), Iterable.class)) {
                Collection collection = (Collection) a.mo44855a((Object) this);
                if (collection == null) {
                    collection = C17366i.m57813b(a2);
                    a.mo44857a((Object) this, (Object) collection);
                }
                collection.add(m57385a(a2 == Object.class ? null : C17350ae.m57787c(a2), list, str2));
            } else {
                a.mo44857a((Object) this, m57385a(a2, list, str2));
            }
        } else {
            ArrayList arrayList = (ArrayList) get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                mo44448c(str, (Object) arrayList);
            }
            arrayList.add(str2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public C17261l clone() {
        return (C17261l) super.clone();
    }

    /* renamed from: d */
    public final String mo44624d() {
        return (String) m57391b(this.range);
    }

    /* renamed from: e */
    public final String mo44626e() {
        return (String) m57391b(this.userAgent);
    }

    public C17261l() {
        super(EnumSet.of(Flags.IGNORE_CASE));
    }

    /* renamed from: c */
    public final String mo44622c() {
        return (String) m57391b(this.location);
    }

    /* renamed from: a */
    private C17261l m57384a(List<String> list) {
        this.authorization = list;
        return this;
    }

    /* renamed from: a */
    public final C17261l mo44613a(Long l) {
        this.contentLength = m57392b((T) l);
        return this;
    }

    /* renamed from: c */
    public final C17261l mo44621c(String str) {
        this.contentEncoding = m57392b((T) str);
        return this;
    }

    /* renamed from: d */
    public final C17261l mo44623d(String str) {
        this.contentRange = m57392b((T) str);
        return this;
    }

    /* renamed from: e */
    public final C17261l mo44625e(String str) {
        this.contentType = m57392b((T) str);
        return this;
    }

    /* renamed from: g */
    public final C17261l mo44628g(String str) {
        this.ifMatch = m57392b((T) null);
        return this;
    }

    /* renamed from: h */
    public final C17261l mo44629h(String str) {
        this.ifNoneMatch = m57392b((T) null);
        return this;
    }

    /* renamed from: i */
    public final C17261l mo44630i(String str) {
        this.ifUnmodifiedSince = m57392b((T) null);
        return this;
    }

    /* renamed from: j */
    public final C17261l mo44631j(String str) {
        this.ifRange = m57392b((T) null);
        return this;
    }

    /* renamed from: k */
    public final C17261l mo44632k(String str) {
        this.userAgent = m57392b((T) str);
        return this;
    }

    /* renamed from: b */
    private static <T> T m57391b(List<T> list) {
        if (list == null) {
            return null;
        }
        return list.get(0);
    }

    /* renamed from: f */
    public final C17261l mo44627f(String str) {
        this.ifModifiedSince = m57392b((T) null);
        return this;
    }

    /* renamed from: a */
    private static String m57386a(Object obj) {
        if (obj instanceof Enum) {
            return C17371k.m57823a((Enum) obj).f48314c;
        }
        return obj.toString();
    }

    /* renamed from: b */
    private static <T> List<T> m57392b(T t) {
        if (t == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(t);
        return arrayList;
    }

    /* renamed from: b */
    public final C17261l mo44620b(String str) {
        return m57384a(m57392b((T) str));
    }

    /* renamed from: a */
    public final C17261l mo44614a(String str) {
        this.acceptEncoding = m57392b((T) null);
        return this;
    }

    /* renamed from: a */
    public final C17261l mo44448c(String str, Object obj) {
        return (C17261l) super.mo44448c(str, obj);
    }

    /* renamed from: a */
    private static Object m57385a(Type type, List<Type> list, String str) {
        return C17366i.m57808a(C17366i.m57809a(list, type), str);
    }

    /* renamed from: a */
    public static void m57389a(C17261l lVar, StringBuilder sb, Logger logger, Writer writer) throws IOException {
        m57388a(lVar, null, null, null, null, writer);
    }

    /* renamed from: a */
    static void m57387a(C17261l lVar, StringBuilder sb, StringBuilder sb2, Logger logger, C17275x xVar) throws IOException {
        m57388a(lVar, sb, sb2, logger, xVar, null);
    }

    /* renamed from: a */
    private static void m57388a(C17261l lVar, StringBuilder sb, StringBuilder sb2, Logger logger, C17275x xVar, Writer writer) throws IOException {
        HashSet hashSet = new HashSet();
        for (Entry entry : lVar.entrySet()) {
            String str = (String) entry.getKey();
            C17384w.m57852a(hashSet.add(str), "multiple headers of the same name (headers are case insensitive): %s", str);
            Object value = entry.getValue();
            if (value != null) {
                C17371k a = lVar.f48237m.mo44831a(str);
                if (a != null) {
                    str = a.f48314c;
                }
                Class cls = value.getClass();
                if ((value instanceof Iterable) || cls.isArray()) {
                    for (Object a2 : C17350ae.m57777a(value)) {
                        m57390a(logger, sb, sb2, xVar, str, a2, writer);
                    }
                } else {
                    m57390a(logger, sb, sb2, xVar, str, value, writer);
                }
            } else {
                C17261l lVar2 = lVar;
            }
        }
        if (writer != null) {
            writer.flush();
        }
    }

    /* renamed from: a */
    private static void m57390a(Logger logger, StringBuilder sb, StringBuilder sb2, C17275x xVar, String str, Object obj, Writer writer) throws IOException {
        String str2;
        if (obj != null && !C17366i.m57811a(obj)) {
            String a = m57386a(obj);
            if (("Authorization".equalsIgnoreCase(str) || "Cookie".equalsIgnoreCase(str)) && (logger == null || !logger.isLoggable(Level.ALL))) {
                str2 = "<Not Logged>";
            } else {
                str2 = a;
            }
            if (sb != null) {
                sb.append(str);
                sb.append(": ");
                sb.append(str2);
                sb.append(C17347ab.f48262a);
            }
            if (sb2 != null) {
                sb2.append(" -H '");
                sb2.append(str);
                sb2.append(": ");
                sb2.append(str2);
                sb2.append("'");
            }
            if (xVar != null) {
                xVar.mo44570a(str, a);
            }
            if (writer != null) {
                writer.write(str);
                writer.write(": ");
                writer.write(a);
                writer.write("\r\n");
            }
        }
    }
}
