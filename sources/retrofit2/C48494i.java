package retrofit2;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Map;
import java.util.Map.Entry;
import okhttp3.Headers;
import okhttp3.MultipartBody.Part;
import okhttp3.RequestBody;

/* renamed from: retrofit2.i */
abstract class C48494i<T> {

    /* renamed from: retrofit2.i$a */
    static final class C48497a<T> extends C48494i<T> {

        /* renamed from: a */
        private final C48479e<T, RequestBody> f123624a;

        C48497a(C48479e<T, RequestBody> eVar) {
            this.f123624a = eVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo123292a(C48514k kVar, T t) {
            if (t != null) {
                try {
                    kVar.f123651a = (RequestBody) this.f123624a.mo123281a(t);
                } catch (IOException e) {
                    StringBuilder sb = new StringBuilder("Unable to convert ");
                    sb.append(t);
                    sb.append(" to RequestBody");
                    throw new RuntimeException(sb.toString(), e);
                }
            } else {
                throw new IllegalArgumentException("Body parameter value must not be null.");
            }
        }
    }

    /* renamed from: retrofit2.i$b */
    static final class C48498b<T> extends C48494i<T> {

        /* renamed from: a */
        private final String f123625a;

        /* renamed from: b */
        private final C48479e<T, String> f123626b;

        /* renamed from: c */
        private final boolean f123627c;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo123292a(C48514k kVar, T t) throws IOException {
            if (t != null) {
                String str = (String) this.f123626b.mo123281a(t);
                if (str != null) {
                    kVar.mo123306c(this.f123625a, str, this.f123627c);
                }
            }
        }

        C48498b(String str, C48479e<T, String> eVar, boolean z) {
            this.f123625a = (String) C48522o.m150306a(str, "name == null");
            this.f123626b = eVar;
            this.f123627c = z;
        }
    }

    /* renamed from: retrofit2.i$c */
    static final class C48499c<T> extends C48494i<Map<String, T>> {

        /* renamed from: a */
        private final C48479e<T, String> f123628a;

        /* renamed from: b */
        private final boolean f123629b;

        C48499c(C48479e<T, String> eVar, boolean z) {
            this.f123628a = eVar;
            this.f123629b = z;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo123292a(C48514k kVar, Map<String, T> map) throws IOException {
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String str2 = (String) this.f123628a.mo123281a(value);
                            if (str2 != null) {
                                kVar.mo123306c(str, str2, this.f123629b);
                            } else {
                                StringBuilder sb = new StringBuilder("Field map value '");
                                sb.append(value);
                                sb.append("' converted to null by ");
                                sb.append(this.f123628a.getClass().getName());
                                sb.append(" for key '");
                                sb.append(str);
                                sb.append("'.");
                                throw new IllegalArgumentException(sb.toString());
                            }
                        } else {
                            StringBuilder sb2 = new StringBuilder("Field map contained null value for key '");
                            sb2.append(str);
                            sb2.append("'.");
                            throw new IllegalArgumentException(sb2.toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Field map contained null key.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Field map was null.");
        }
    }

    /* renamed from: retrofit2.i$d */
    static final class C48500d<T> extends C48494i<T> {

        /* renamed from: a */
        private final String f123630a;

        /* renamed from: b */
        private final C48479e<T, String> f123631b;

        C48500d(String str, C48479e<T, String> eVar) {
            this.f123630a = (String) C48522o.m150306a(str, "name == null");
            this.f123631b = eVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo123292a(C48514k kVar, T t) throws IOException {
            if (t != null) {
                String str = (String) this.f123631b.mo123281a(t);
                if (str != null) {
                    kVar.mo123301a(this.f123630a, str);
                }
            }
        }
    }

    /* renamed from: retrofit2.i$e */
    static final class C48501e<T> extends C48494i<Map<String, T>> {

        /* renamed from: a */
        private final C48479e<T, String> f123632a;

        C48501e(C48479e<T, String> eVar) {
            this.f123632a = eVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo123292a(C48514k kVar, Map<String, T> map) throws IOException {
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            kVar.mo123301a(str, (String) this.f123632a.mo123281a(value));
                        } else {
                            StringBuilder sb = new StringBuilder("Header map contained null value for key '");
                            sb.append(str);
                            sb.append("'.");
                            throw new IllegalArgumentException(sb.toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Header map contained null key.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Header map was null.");
        }
    }

    /* renamed from: retrofit2.i$f */
    static final class C48502f<T> extends C48494i<T> {

        /* renamed from: a */
        private final Headers f123633a;

        /* renamed from: b */
        private final C48479e<T, RequestBody> f123634b;

        C48502f(Headers headers, C48479e<T, RequestBody> eVar) {
            this.f123633a = headers;
            this.f123634b = eVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo123292a(C48514k kVar, T t) {
            if (t != null) {
                try {
                    kVar.mo123303a(this.f123633a, (RequestBody) this.f123634b.mo123281a(t));
                } catch (IOException e) {
                    StringBuilder sb = new StringBuilder("Unable to convert ");
                    sb.append(t);
                    sb.append(" to RequestBody");
                    throw new RuntimeException(sb.toString(), e);
                }
            }
        }
    }

    /* renamed from: retrofit2.i$g */
    static final class C48503g<T> extends C48494i<Map<String, T>> {

        /* renamed from: a */
        private final C48479e<T, RequestBody> f123635a;

        /* renamed from: b */
        private final String f123636b;

        C48503g(C48479e<T, RequestBody> eVar, String str) {
            this.f123635a = eVar;
            this.f123636b = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo123292a(C48514k kVar, Map<String, T> map) throws IOException {
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            StringBuilder sb = new StringBuilder("form-data; name=\"");
                            sb.append(str);
                            sb.append("\"");
                            kVar.mo123303a(Headers.m23792of("Content-Disposition", sb.toString(), "Content-Transfer-Encoding", this.f123636b), (RequestBody) this.f123635a.mo123281a(value));
                        } else {
                            StringBuilder sb2 = new StringBuilder("Part map contained null value for key '");
                            sb2.append(str);
                            sb2.append("'.");
                            throw new IllegalArgumentException(sb2.toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Part map contained null key.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Part map was null.");
        }
    }

    /* renamed from: retrofit2.i$h */
    static final class C48504h<T> extends C48494i<T> {

        /* renamed from: a */
        private final String f123637a;

        /* renamed from: b */
        private final C48479e<T, String> f123638b;

        /* renamed from: c */
        private final boolean f123639c;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo123292a(C48514k kVar, T t) throws IOException {
            if (t != null) {
                kVar.mo123302a(this.f123637a, (String) this.f123638b.mo123281a(t), this.f123639c);
                return;
            }
            StringBuilder sb = new StringBuilder("Path parameter \"");
            sb.append(this.f123637a);
            sb.append("\" value must not be null.");
            throw new IllegalArgumentException(sb.toString());
        }

        C48504h(String str, C48479e<T, String> eVar, boolean z) {
            this.f123637a = (String) C48522o.m150306a(str, "name == null");
            this.f123638b = eVar;
            this.f123639c = z;
        }
    }

    /* renamed from: retrofit2.i$i */
    static final class C48505i<T> extends C48494i<T> {

        /* renamed from: a */
        private final String f123640a;

        /* renamed from: b */
        private final C48479e<T, String> f123641b;

        /* renamed from: c */
        private final boolean f123642c;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo123292a(C48514k kVar, T t) throws IOException {
            if (t != null) {
                String str = (String) this.f123641b.mo123281a(t);
                if (str != null) {
                    kVar.mo123305b(this.f123640a, str, this.f123642c);
                }
            }
        }

        C48505i(String str, C48479e<T, String> eVar, boolean z) {
            this.f123640a = (String) C48522o.m150306a(str, "name == null");
            this.f123641b = eVar;
            this.f123642c = z;
        }
    }

    /* renamed from: retrofit2.i$j */
    static final class C48506j<T> extends C48494i<Map<String, T>> {

        /* renamed from: a */
        private final C48479e<T, String> f123643a;

        /* renamed from: b */
        private final boolean f123644b;

        C48506j(C48479e<T, String> eVar, boolean z) {
            this.f123643a = eVar;
            this.f123644b = z;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo123292a(C48514k kVar, Map<String, T> map) throws IOException {
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String str2 = (String) this.f123643a.mo123281a(value);
                            if (str2 != null) {
                                kVar.mo123305b(str, str2, this.f123644b);
                            } else {
                                StringBuilder sb = new StringBuilder("Query map value '");
                                sb.append(value);
                                sb.append("' converted to null by ");
                                sb.append(this.f123643a.getClass().getName());
                                sb.append(" for key '");
                                sb.append(str);
                                sb.append("'.");
                                throw new IllegalArgumentException(sb.toString());
                            }
                        } else {
                            StringBuilder sb2 = new StringBuilder("Query map contained null value for key '");
                            sb2.append(str);
                            sb2.append("'.");
                            throw new IllegalArgumentException(sb2.toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Query map contained null key.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Query map was null.");
        }
    }

    /* renamed from: retrofit2.i$k */
    static final class C48507k<T> extends C48494i<T> {

        /* renamed from: a */
        private final C48479e<T, String> f123645a;

        /* renamed from: b */
        private final boolean f123646b;

        C48507k(C48479e<T, String> eVar, boolean z) {
            this.f123645a = eVar;
            this.f123646b = z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo123292a(C48514k kVar, T t) throws IOException {
            if (t != null) {
                kVar.mo123305b((String) this.f123645a.mo123281a(t), null, this.f123646b);
            }
        }
    }

    /* renamed from: retrofit2.i$l */
    static final class C48508l extends C48494i<Part> {

        /* renamed from: a */
        static final C48508l f123647a = new C48508l();

        private C48508l() {
        }

        /* renamed from: a */
        private static void m150239a(C48514k kVar, Part part) throws IOException {
            if (part != null) {
                kVar.mo123304a(part);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo123292a(C48514k kVar, Object obj) throws IOException {
            m150239a(kVar, (Part) obj);
        }
    }

    /* renamed from: retrofit2.i$m */
    static final class C48509m extends C48494i<Object> {
        C48509m() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo123292a(C48514k kVar, Object obj) {
            C48522o.m150306a(obj, "@Url parameter is null.");
            kVar.mo123300a(obj);
        }
    }

    C48494i() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo123292a(C48514k kVar, T t) throws IOException;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C48494i<Iterable<T>> mo123291a() {
        return new C48494i<Iterable<T>>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo123292a(C48514k kVar, Iterable<T> iterable) throws IOException {
                if (iterable != null) {
                    for (T a : iterable) {
                        C48494i.this.mo123292a(kVar, a);
                    }
                }
            }
        };
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C48494i<Object> mo123293b() {
        return new C48494i<Object>() {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final void mo123292a(C48514k kVar, Object obj) throws IOException {
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i = 0; i < length; i++) {
                        C48494i.this.mo123292a(kVar, Array.get(obj, i));
                    }
                }
            }
        };
    }
}
