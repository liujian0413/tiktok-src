package retrofit2;

import com.C1642a;
import com.p280ss.android.ugc.aweme.policy.Policy;
import com.taobao.android.dexposed.ClassUtils;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Call.Factory;
import okhttp3.Headers;
import okhttp3.Headers.Builder;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody.Part;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import retrofit2.p363b.C7725a;
import retrofit2.p363b.C7726b;
import retrofit2.p363b.C7727c;
import retrofit2.p363b.C7728d;
import retrofit2.p363b.C7729e;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7731g;
import retrofit2.p363b.C7732h;
import retrofit2.p363b.C7733i;
import retrofit2.p363b.C7734j;
import retrofit2.p363b.C7735k;
import retrofit2.p363b.C7736l;
import retrofit2.p363b.C7737m;
import retrofit2.p363b.C7738n;
import retrofit2.p363b.C7739o;
import retrofit2.p363b.C7740p;
import retrofit2.p363b.C7741q;
import retrofit2.p363b.C7742r;
import retrofit2.p363b.C7743s;
import retrofit2.p363b.C7744t;
import retrofit2.p363b.C7745u;
import retrofit2.p363b.C7746v;
import retrofit2.p363b.C7748x;

/* renamed from: retrofit2.n */
final class C48520n<R, T> {

    /* renamed from: a */
    static final Pattern f123683a = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

    /* renamed from: b */
    static final Pattern f123684b = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

    /* renamed from: c */
    final Factory f123685c;

    /* renamed from: d */
    final C48476c<R, T> f123686d;

    /* renamed from: e */
    private final HttpUrl f123687e;

    /* renamed from: f */
    private final C48479e<ResponseBody, R> f123688f;

    /* renamed from: g */
    private final String f123689g;

    /* renamed from: h */
    private final String f123690h;

    /* renamed from: i */
    private final Headers f123691i;

    /* renamed from: j */
    private final MediaType f123692j;

    /* renamed from: k */
    private final boolean f123693k;

    /* renamed from: l */
    private final boolean f123694l;

    /* renamed from: m */
    private final boolean f123695m;

    /* renamed from: n */
    private final C48494i<?>[] f123696n;

    /* renamed from: retrofit2.n$a */
    static final class C48521a<T, R> {

        /* renamed from: a */
        final C48517m f123697a;

        /* renamed from: b */
        final Method f123698b;

        /* renamed from: c */
        final Annotation[] f123699c;

        /* renamed from: d */
        final Annotation[][] f123700d;

        /* renamed from: e */
        final Type[] f123701e;

        /* renamed from: f */
        Type f123702f;

        /* renamed from: g */
        boolean f123703g;

        /* renamed from: h */
        boolean f123704h;

        /* renamed from: i */
        boolean f123705i;

        /* renamed from: j */
        boolean f123706j;

        /* renamed from: k */
        boolean f123707k;

        /* renamed from: l */
        boolean f123708l;

        /* renamed from: m */
        String f123709m;

        /* renamed from: n */
        boolean f123710n;

        /* renamed from: o */
        boolean f123711o;

        /* renamed from: p */
        boolean f123712p;

        /* renamed from: q */
        String f123713q;

        /* renamed from: r */
        Headers f123714r;

        /* renamed from: s */
        MediaType f123715s;

        /* renamed from: t */
        Set<String> f123716t;

        /* renamed from: u */
        C48494i<?>[] f123717u;

        /* renamed from: v */
        C48479e<ResponseBody, T> f123718v;

        /* renamed from: w */
        C48476c<T, R> f123719w;

        /* renamed from: a */
        public final C48520n mo123326a() {
            this.f123719w = m150299b();
            this.f123702f = this.f123719w.mo80367a();
            if (this.f123702f == C48516l.class || this.f123702f == Response.class) {
                StringBuilder sb = new StringBuilder("'");
                sb.append(C48522o.m150304a(this.f123702f).getName());
                sb.append("' is not a valid response body type. Did you mean ResponseBody?");
                throw m150290a(sb.toString(), new Object[0]);
            }
            this.f123718v = m150300c();
            for (Annotation a : this.f123699c) {
                m150298a(a);
            }
            if (this.f123709m != null) {
                if (!this.f123710n) {
                    if (this.f123712p) {
                        throw m150290a("Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    } else if (this.f123711o) {
                        throw m150290a("FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                int length = this.f123700d.length;
                this.f123717u = new C48494i[length];
                int i = 0;
                while (i < length) {
                    Type type = this.f123701e[i];
                    if (!C48522o.m150319d(type)) {
                        Annotation[] annotationArr = this.f123700d[i];
                        if (annotationArr != null) {
                            this.f123717u[i] = m150294a(i, type, annotationArr);
                            i++;
                        } else {
                            throw m150289a(i, "No Retrofit annotation found.", new Object[0]);
                        }
                    } else {
                        throw m150289a(i, "Parameter type must not include a type variable or wildcard: %s", type);
                    }
                }
                if (this.f123713q == null && !this.f123708l) {
                    throw m150290a("Missing either @%s URL or @Url parameter.", this.f123709m);
                } else if (!this.f123711o && !this.f123712p && !this.f123710n && this.f123705i) {
                    throw m150290a("Non-body HTTP method cannot contain @Body.", new Object[0]);
                } else if (this.f123711o && !this.f123703g) {
                    throw m150290a("Form-encoded method must contain at least one @Field.", new Object[0]);
                } else if (!this.f123712p || this.f123704h) {
                    return new C48520n(this);
                } else {
                    throw m150290a("Multipart method must contain at least one @Part.", new Object[0]);
                }
            } else {
                throw m150290a("HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
        }

        /* renamed from: a */
        private void m150298a(Annotation annotation) {
            if (annotation instanceof C7726b) {
                m150297a(Policy.ACTION_DELETE, ((C7726b) annotation).mo20416a(), false);
            } else if (annotation instanceof C7730f) {
                m150297a("GET", ((C7730f) annotation).mo20420a(), false);
            } else {
                if (annotation instanceof C7731g) {
                    m150297a("HEAD", ((C7731g) annotation).mo20421a(), false);
                    if (!Void.class.equals(this.f123702f)) {
                        throw m150290a("HEAD method must use Void as response type.", new Object[0]);
                    }
                } else if (annotation instanceof C7738n) {
                    m150297a("PATCH", ((C7738n) annotation).mo20428a(), true);
                } else if (annotation instanceof C7739o) {
                    m150297a("POST", ((C7739o) annotation).mo20429a(), true);
                } else if (annotation instanceof C7740p) {
                    m150297a("PUT", ((C7740p) annotation).mo20430a(), true);
                } else if (annotation instanceof C7737m) {
                    m150297a("OPTIONS", ((C7737m) annotation).mo20427a(), false);
                } else if (annotation instanceof C7732h) {
                    C7732h hVar = (C7732h) annotation;
                    m150297a(hVar.mo20422a(), hVar.mo20423b(), hVar.mo20424c());
                } else if (annotation instanceof C7735k) {
                    String[] a = ((C7735k) annotation).mo20426a();
                    if (a.length != 0) {
                        this.f123714r = m150293a(a);
                    } else {
                        throw m150290a("@Headers annotation is empty.", new Object[0]);
                    }
                } else if (annotation instanceof C7736l) {
                    if (!this.f123711o) {
                        this.f123712p = true;
                    } else {
                        throw m150290a("Only one encoding annotation is allowed.", new Object[0]);
                    }
                } else if (annotation instanceof C7729e) {
                    if (!this.f123712p) {
                        this.f123711o = true;
                    } else {
                        throw m150290a("Only one encoding annotation is allowed.", new Object[0]);
                    }
                }
            }
        }

        /* renamed from: a */
        private void m150297a(String str, String str2, boolean z) {
            if (this.f123709m == null) {
                this.f123709m = str;
                this.f123710n = z;
                if (!str2.isEmpty()) {
                    int indexOf = str2.indexOf(63);
                    if (indexOf != -1 && indexOf < str2.length() - 1) {
                        String substring = str2.substring(indexOf + 1);
                        if (C48520n.f123683a.matcher(substring).find()) {
                            throw m150290a("URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                        }
                    }
                    this.f123713q = str2;
                    this.f123716t = C48520n.m150286a(str2);
                    return;
                }
                return;
            }
            throw m150290a("Only one HTTP method is allowed. Found: %s and %s.", this.f123709m, str);
        }

        /* renamed from: c */
        private C48479e<ResponseBody, T> m150300c() {
            try {
                return this.f123697a.mo123316b(this.f123702f, this.f123698b.getAnnotations());
            } catch (RuntimeException e) {
                throw m150292a((Throwable) e, "Unable to create converter for %s", this.f123702f);
            }
        }

        /* renamed from: b */
        private C48476c<T, R> m150299b() {
            Type genericReturnType = this.f123698b.getGenericReturnType();
            if (C48522o.m150319d(genericReturnType)) {
                throw m150290a("Method return type must not include a type variable or wildcard: %s", genericReturnType);
            } else if (genericReturnType != Void.TYPE) {
                try {
                    return this.f123697a.mo123313a(genericReturnType, this.f123698b.getAnnotations());
                } catch (RuntimeException e) {
                    throw m150292a((Throwable) e, "Unable to create call adapter for %s", genericReturnType);
                }
            } else {
                throw m150290a("Service methods cannot return void.", new Object[0]);
            }
        }

        /* renamed from: a */
        private Headers m150293a(String[] strArr) {
            Builder builder = new Builder();
            for (String str : strArr) {
                int indexOf = str.indexOf(58);
                if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                    throw m150290a("@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String substring = str.substring(0, indexOf);
                String trim = str.substring(indexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(substring)) {
                    MediaType parse = MediaType.parse(trim);
                    if (parse != null) {
                        this.f123715s = parse;
                    } else {
                        throw m150290a("Malformed content type: %s", trim);
                    }
                } else {
                    builder.add(substring, trim);
                }
            }
            return builder.build();
        }

        /* renamed from: a */
        private RuntimeException m150290a(String str, Object... objArr) {
            return m150292a((Throwable) null, str, objArr);
        }

        C48521a(C48517m mVar, Method method) {
            this.f123697a = mVar;
            this.f123698b = method;
            this.f123699c = method.getAnnotations();
            this.f123701e = method.getGenericParameterTypes();
            this.f123700d = method.getParameterAnnotations();
        }

        /* renamed from: a */
        private void m150296a(int i, String str) {
            if (!C48520n.f123684b.matcher(str).matches()) {
                throw m150289a(i, "@Path parameter name must match %s. Found: %s", C48520n.f123683a.pattern(), str);
            } else if (!this.f123716t.contains(str)) {
                throw m150289a(i, "URL \"%s\" does not contain \"{%s}\".", this.f123713q, str);
            }
        }

        /* renamed from: a */
        private RuntimeException m150289a(int i, String str, Object... objArr) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" (parameter #");
            sb.append(i + 1);
            sb.append(")");
            return m150290a(sb.toString(), objArr);
        }

        /* renamed from: a */
        private RuntimeException m150292a(Throwable th, String str, Object... objArr) {
            String a = C1642a.m8034a(str, objArr);
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            sb.append("\n    for method ");
            sb.append(this.f123698b.getDeclaringClass().getSimpleName());
            sb.append(ClassUtils.PACKAGE_SEPARATOR);
            sb.append(this.f123698b.getName());
            return new IllegalArgumentException(sb.toString(), th);
        }

        /* renamed from: a */
        private C48494i<?> m150294a(int i, Type type, Annotation[] annotationArr) {
            C48494i<?> iVar = null;
            for (Annotation a : annotationArr) {
                C48494i<?> a2 = m150295a(i, type, annotationArr, a);
                if (a2 != null) {
                    if (iVar == null) {
                        iVar = a2;
                    } else {
                        throw m150289a(i, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                    }
                }
            }
            if (iVar != null) {
                return iVar;
            }
            throw m150289a(i, "No Retrofit annotation found.", new Object[0]);
        }

        /* renamed from: a */
        private RuntimeException m150291a(Throwable th, int i, String str, Object... objArr) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" (parameter #");
            sb.append(i + 1);
            sb.append(")");
            return m150292a(th, sb.toString(), objArr);
        }

        /* renamed from: a */
        private C48494i<?> m150295a(int i, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof C7748x) {
                if (this.f123708l) {
                    throw m150289a(i, "Multiple @Url method annotations found.", new Object[0]);
                } else if (this.f123706j) {
                    throw m150289a(i, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.f123707k) {
                    throw m150289a(i, "A @Url parameter must not come after a @Query", new Object[0]);
                } else if (this.f123713q == null) {
                    this.f123708l = true;
                    if (type == HttpUrl.class || type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                        return new C48509m();
                    }
                    throw m150289a(i, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                } else {
                    throw m150289a(i, "@Url cannot be used with @%s URL", this.f123709m);
                }
            } else if (annotation instanceof C7743s) {
                if (this.f123707k) {
                    throw m150289a(i, "A @Path parameter must not come after a @Query.", new Object[0]);
                } else if (this.f123708l) {
                    throw m150289a(i, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.f123713q != null) {
                    this.f123706j = true;
                    C7743s sVar = (C7743s) annotation;
                    String a = sVar.mo20434a();
                    m150296a(i, a);
                    return new C48504h(a, this.f123697a.mo123317c(type, annotationArr), sVar.mo20435b());
                } else {
                    throw m150289a(i, "@Path can only be used with relative url on @%s", this.f123709m);
                }
            } else if (annotation instanceof C7744t) {
                C7744t tVar = (C7744t) annotation;
                String a2 = tVar.mo20436a();
                boolean b = tVar.mo20437b();
                Class a3 = C48522o.m150304a(type);
                this.f123707k = true;
                if (Iterable.class.isAssignableFrom(a3)) {
                    if (type instanceof ParameterizedType) {
                        return new C48505i(a2, this.f123697a.mo123317c(C48522o.m150307a(0, (ParameterizedType) type), annotationArr), b).mo123291a();
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(a3.getSimpleName());
                    sb.append(" must include generic type (e.g., ");
                    sb.append(a3.getSimpleName());
                    sb.append("<String>)");
                    throw m150289a(i, sb.toString(), new Object[0]);
                } else if (!a3.isArray()) {
                    return new C48505i(a2, this.f123697a.mo123317c(type, annotationArr), b);
                } else {
                    return new C48505i(a2, this.f123697a.mo123317c(C48520n.m150285a(a3.getComponentType()), annotationArr), b).mo123293b();
                }
            } else if (annotation instanceof C7746v) {
                boolean a4 = ((C7746v) annotation).mo20439a();
                Class a5 = C48522o.m150304a(type);
                this.f123707k = true;
                if (Iterable.class.isAssignableFrom(a5)) {
                    if (type instanceof ParameterizedType) {
                        return new C48507k(this.f123697a.mo123317c(C48522o.m150307a(0, (ParameterizedType) type), annotationArr), a4).mo123291a();
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(a5.getSimpleName());
                    sb2.append(" must include generic type (e.g., ");
                    sb2.append(a5.getSimpleName());
                    sb2.append("<String>)");
                    throw m150289a(i, sb2.toString(), new Object[0]);
                } else if (!a5.isArray()) {
                    return new C48507k(this.f123697a.mo123317c(type, annotationArr), a4);
                } else {
                    return new C48507k(this.f123697a.mo123317c(C48520n.m150285a(a5.getComponentType()), annotationArr), a4).mo123293b();
                }
            } else if (annotation instanceof C7745u) {
                Class a6 = C48522o.m150304a(type);
                if (Map.class.isAssignableFrom(a6)) {
                    Type a7 = C48522o.m150308a(type, a6, Map.class);
                    if (a7 instanceof ParameterizedType) {
                        ParameterizedType parameterizedType = (ParameterizedType) a7;
                        Type a8 = C48522o.m150307a(0, parameterizedType);
                        if (String.class == a8) {
                            return new C48506j(this.f123697a.mo123317c(C48522o.m150307a(1, parameterizedType), annotationArr), ((C7745u) annotation).mo20438a());
                        }
                        StringBuilder sb3 = new StringBuilder("@QueryMap keys must be of type String: ");
                        sb3.append(a8);
                        throw m150289a(i, sb3.toString(), new Object[0]);
                    }
                    throw m150289a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw m150289a(i, "@QueryMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof C7733i) {
                String a9 = ((C7733i) annotation).mo20425a();
                Class a10 = C48522o.m150304a(type);
                if (Iterable.class.isAssignableFrom(a10)) {
                    if (type instanceof ParameterizedType) {
                        return new C48500d(a9, this.f123697a.mo123317c(C48522o.m150307a(0, (ParameterizedType) type), annotationArr)).mo123291a();
                    }
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(a10.getSimpleName());
                    sb4.append(" must include generic type (e.g., ");
                    sb4.append(a10.getSimpleName());
                    sb4.append("<String>)");
                    throw m150289a(i, sb4.toString(), new Object[0]);
                } else if (!a10.isArray()) {
                    return new C48500d(a9, this.f123697a.mo123317c(type, annotationArr));
                } else {
                    return new C48500d(a9, this.f123697a.mo123317c(C48520n.m150285a(a10.getComponentType()), annotationArr)).mo123293b();
                }
            } else if (annotation instanceof C7734j) {
                Class a11 = C48522o.m150304a(type);
                if (Map.class.isAssignableFrom(a11)) {
                    Type a12 = C48522o.m150308a(type, a11, Map.class);
                    if (a12 instanceof ParameterizedType) {
                        ParameterizedType parameterizedType2 = (ParameterizedType) a12;
                        Type a13 = C48522o.m150307a(0, parameterizedType2);
                        if (String.class == a13) {
                            return new C48501e(this.f123697a.mo123317c(C48522o.m150307a(1, parameterizedType2), annotationArr));
                        }
                        StringBuilder sb5 = new StringBuilder("@HeaderMap keys must be of type String: ");
                        sb5.append(a13);
                        throw m150289a(i, sb5.toString(), new Object[0]);
                    }
                    throw m150289a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw m150289a(i, "@HeaderMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof C7727c) {
                if (this.f123711o) {
                    C7727c cVar = (C7727c) annotation;
                    String a14 = cVar.mo20417a();
                    boolean b2 = cVar.mo20418b();
                    this.f123703g = true;
                    Class a15 = C48522o.m150304a(type);
                    if (Iterable.class.isAssignableFrom(a15)) {
                        if (type instanceof ParameterizedType) {
                            return new C48498b(a14, this.f123697a.mo123317c(C48522o.m150307a(0, (ParameterizedType) type), annotationArr), b2).mo123291a();
                        }
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(a15.getSimpleName());
                        sb6.append(" must include generic type (e.g., ");
                        sb6.append(a15.getSimpleName());
                        sb6.append("<String>)");
                        throw m150289a(i, sb6.toString(), new Object[0]);
                    } else if (!a15.isArray()) {
                        return new C48498b(a14, this.f123697a.mo123317c(type, annotationArr), b2);
                    } else {
                        return new C48498b(a14, this.f123697a.mo123317c(C48520n.m150285a(a15.getComponentType()), annotationArr), b2).mo123293b();
                    }
                } else {
                    throw m150289a(i, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
            } else if (annotation instanceof C7728d) {
                if (this.f123711o) {
                    Class a16 = C48522o.m150304a(type);
                    if (Map.class.isAssignableFrom(a16)) {
                        Type a17 = C48522o.m150308a(type, a16, Map.class);
                        if (a17 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType3 = (ParameterizedType) a17;
                            Type a18 = C48522o.m150307a(0, parameterizedType3);
                            if (String.class == a18) {
                                C48479e c = this.f123697a.mo123317c(C48522o.m150307a(1, parameterizedType3), annotationArr);
                                this.f123703g = true;
                                return new C48499c(c, ((C7728d) annotation).mo20419a());
                            }
                            StringBuilder sb7 = new StringBuilder("@FieldMap keys must be of type String: ");
                            sb7.append(a18);
                            throw m150289a(i, sb7.toString(), new Object[0]);
                        }
                        throw m150289a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw m150289a(i, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                throw m150289a(i, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
            } else if (annotation instanceof C7741q) {
                if (this.f123712p) {
                    C7741q qVar = (C7741q) annotation;
                    this.f123704h = true;
                    String a19 = qVar.mo20431a();
                    Class a20 = C48522o.m150304a(type);
                    if (!a19.isEmpty()) {
                        StringBuilder sb8 = new StringBuilder("form-data; name=\"");
                        sb8.append(a19);
                        sb8.append("\"");
                        Headers of = Headers.m23792of("Content-Disposition", sb8.toString(), "Content-Transfer-Encoding", qVar.mo20432b());
                        if (Iterable.class.isAssignableFrom(a20)) {
                            if (type instanceof ParameterizedType) {
                                Type a21 = C48522o.m150307a(0, (ParameterizedType) type);
                                if (!Part.class.isAssignableFrom(C48522o.m150304a(a21))) {
                                    return new C48502f(of, this.f123697a.mo123314a(a21, annotationArr, this.f123699c)).mo123291a();
                                }
                                throw m150289a(i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                            }
                            StringBuilder sb9 = new StringBuilder();
                            sb9.append(a20.getSimpleName());
                            sb9.append(" must include generic type (e.g., ");
                            sb9.append(a20.getSimpleName());
                            sb9.append("<String>)");
                            throw m150289a(i, sb9.toString(), new Object[0]);
                        } else if (a20.isArray()) {
                            Class a22 = C48520n.m150285a(a20.getComponentType());
                            if (!Part.class.isAssignableFrom(a22)) {
                                return new C48502f(of, this.f123697a.mo123314a((Type) a22, annotationArr, this.f123699c)).mo123293b();
                            }
                            throw m150289a(i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        } else if (!Part.class.isAssignableFrom(a20)) {
                            return new C48502f(of, this.f123697a.mo123314a(type, annotationArr, this.f123699c));
                        } else {
                            throw m150289a(i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        }
                    } else if (Iterable.class.isAssignableFrom(a20)) {
                        if (!(type instanceof ParameterizedType)) {
                            StringBuilder sb10 = new StringBuilder();
                            sb10.append(a20.getSimpleName());
                            sb10.append(" must include generic type (e.g., ");
                            sb10.append(a20.getSimpleName());
                            sb10.append("<String>)");
                            throw m150289a(i, sb10.toString(), new Object[0]);
                        } else if (Part.class.isAssignableFrom(C48522o.m150304a(C48522o.m150307a(0, (ParameterizedType) type)))) {
                            return C48508l.f123647a.mo123291a();
                        } else {
                            throw m150289a(i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                        }
                    } else if (a20.isArray()) {
                        if (Part.class.isAssignableFrom(a20.getComponentType())) {
                            return C48508l.f123647a.mo123293b();
                        }
                        throw m150289a(i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    } else if (Part.class.isAssignableFrom(a20)) {
                        return C48508l.f123647a;
                    } else {
                        throw m150289a(i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                } else {
                    throw m150289a(i, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                }
            } else if (annotation instanceof C7742r) {
                if (this.f123712p) {
                    this.f123704h = true;
                    Class a23 = C48522o.m150304a(type);
                    if (Map.class.isAssignableFrom(a23)) {
                        Type a24 = C48522o.m150308a(type, a23, Map.class);
                        if (a24 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType4 = (ParameterizedType) a24;
                            Type a25 = C48522o.m150307a(0, parameterizedType4);
                            if (String.class == a25) {
                                Type a26 = C48522o.m150307a(1, parameterizedType4);
                                if (!Part.class.isAssignableFrom(C48522o.m150304a(a26))) {
                                    return new C48503g(this.f123697a.mo123314a(a26, annotationArr, this.f123699c), ((C7742r) annotation).mo20433a());
                                }
                                throw m150289a(i, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                            }
                            StringBuilder sb11 = new StringBuilder("@PartMap keys must be of type String: ");
                            sb11.append(a25);
                            throw m150289a(i, sb11.toString(), new Object[0]);
                        }
                        throw m150289a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw m150289a(i, "@PartMap parameter type must be Map.", new Object[0]);
                }
                throw m150289a(i, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
            } else if (!(annotation instanceof C7725a)) {
                return null;
            } else {
                if (this.f123711o || this.f123712p) {
                    throw m150289a(i, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                } else if (!this.f123705i) {
                    try {
                        C48479e a27 = this.f123697a.mo123314a(type, annotationArr, this.f123699c);
                        this.f123705i = true;
                        return new C48497a(a27);
                    } catch (RuntimeException e) {
                        throw m150291a((Throwable) e, i, "Unable to create @Body converter for %s", type);
                    }
                } else {
                    throw m150289a(i, "Multiple @Body method annotations found.", new Object[0]);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final R mo123324a(ResponseBody responseBody) throws IOException {
        return this.f123688f.mo123281a(responseBody);
    }

    /* renamed from: a */
    static Set<String> m150286a(String str) {
        Matcher matcher = f123683a.matcher(str);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (matcher.find()) {
            linkedHashSet.add(matcher.group(1));
        }
        return linkedHashSet;
    }

    C48520n(C48521a<R, T> aVar) {
        this.f123685c = aVar.f123697a.f123666a;
        this.f123686d = aVar.f123719w;
        this.f123687e = aVar.f123697a.f123667b;
        this.f123688f = aVar.f123718v;
        this.f123689g = aVar.f123709m;
        this.f123690h = aVar.f123713q;
        this.f123691i = aVar.f123714r;
        this.f123692j = aVar.f123715s;
        this.f123693k = aVar.f123710n;
        this.f123694l = aVar.f123711o;
        this.f123695m = aVar.f123712p;
        this.f123696n = aVar.f123717u;
    }

    /* renamed from: a */
    static Class<?> m150285a(Class<?> cls) {
        if (Boolean.TYPE == cls) {
            return Boolean.class;
        }
        if (Byte.TYPE == cls) {
            return Byte.class;
        }
        if (Character.TYPE == cls) {
            return Character.class;
        }
        if (Double.TYPE == cls) {
            return Double.class;
        }
        if (Float.TYPE == cls) {
            return Float.class;
        }
        if (Integer.TYPE == cls) {
            return Integer.class;
        }
        if (Long.TYPE == cls) {
            return Long.class;
        }
        if (Short.TYPE == cls) {
            return Short.class;
        }
        return cls;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Request mo123325a(Object... objArr) throws IOException {
        int i;
        C48514k kVar = new C48514k(this.f123689g, this.f123687e, this.f123690h, this.f123691i, this.f123692j, this.f123693k, this.f123694l, this.f123695m);
        C48494i<?>[] iVarArr = this.f123696n;
        if (objArr != null) {
            i = objArr.length;
        } else {
            i = 0;
        }
        if (i == iVarArr.length) {
            for (int i2 = 0; i2 < i; i2++) {
                iVarArr[i2].mo123292a(kVar, objArr[i2]);
            }
            return kVar.mo123299a();
        }
        StringBuilder sb = new StringBuilder("Argument count (");
        sb.append(i);
        sb.append(") doesn't match expected count (");
        sb.append(iVarArr.length);
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }
}
