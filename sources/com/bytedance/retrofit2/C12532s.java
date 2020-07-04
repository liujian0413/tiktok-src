package com.bytedance.retrofit2;

import com.C1642a;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.p264b.C6447a;
import com.bytedance.retrofit2.p264b.C6448aa;
import com.bytedance.retrofit2.p264b.C6449ab;
import com.bytedance.retrofit2.p264b.C6450ac;
import com.bytedance.retrofit2.p264b.C6451b;
import com.bytedance.retrofit2.p264b.C6452c;
import com.bytedance.retrofit2.p264b.C6453d;
import com.bytedance.retrofit2.p264b.C6454e;
import com.bytedance.retrofit2.p264b.C6455f;
import com.bytedance.retrofit2.p264b.C6456g;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6458i;
import com.bytedance.retrofit2.p264b.C6459j;
import com.bytedance.retrofit2.p264b.C6460k;
import com.bytedance.retrofit2.p264b.C6461l;
import com.bytedance.retrofit2.p264b.C6462m;
import com.bytedance.retrofit2.p264b.C6463n;
import com.bytedance.retrofit2.p264b.C6464o;
import com.bytedance.retrofit2.p264b.C6465p;
import com.bytedance.retrofit2.p264b.C6466q;
import com.bytedance.retrofit2.p264b.C6467r;
import com.bytedance.retrofit2.p264b.C6468s;
import com.bytedance.retrofit2.p264b.C6469t;
import com.bytedance.retrofit2.p264b.C6470u;
import com.bytedance.retrofit2.p264b.C6471v;
import com.bytedance.retrofit2.p264b.C6472w;
import com.bytedance.retrofit2.p264b.C6473x;
import com.bytedance.retrofit2.p264b.C6474y;
import com.bytedance.retrofit2.p264b.C6475z;
import com.bytedance.retrofit2.p637a.C12459a.C12460a;
import com.bytedance.retrofit2.p637a.C12461b;
import com.bytedance.retrofit2.p637a.C12462c;
import com.bytedance.retrofit2.p637a.C12464d;
import com.bytedance.retrofit2.p638c.C12469a;
import com.p280ss.android.ugc.aweme.policy.Policy;
import com.taobao.android.dexposed.ClassUtils;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
import retrofit2.p363b.C7747w;
import retrofit2.p363b.C7748x;

/* renamed from: com.bytedance.retrofit2.s */
final class C12532s<T> {

    /* renamed from: a */
    static final Pattern f33245a = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

    /* renamed from: b */
    static final Pattern f33246b = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

    /* renamed from: c */
    final C12460a f33247c;

    /* renamed from: d */
    final C12467c<?> f33248d;

    /* renamed from: e */
    final List<C12469a> f33249e;

    /* renamed from: f */
    final Executor f33250f;

    /* renamed from: g */
    final int f33251g;

    /* renamed from: h */
    final String f33252h;

    /* renamed from: i */
    final boolean f33253i;

    /* renamed from: j */
    final int f33254j;

    /* renamed from: k */
    final boolean f33255k;

    /* renamed from: l */
    final Object f33256l;

    /* renamed from: m */
    public C12520r f33257m;

    /* renamed from: n */
    private final C12479h f33258n;

    /* renamed from: o */
    private final C12475f<TypedInput, T> f33259o;

    /* renamed from: p */
    private final String f33260p;

    /* renamed from: q */
    private final String f33261q;

    /* renamed from: r */
    private final boolean f33262r;

    /* renamed from: s */
    private final boolean f33263s;

    /* renamed from: t */
    private final boolean f33264t;

    /* renamed from: u */
    private final boolean f33265u;

    /* renamed from: v */
    private final C12491n<?>[] f33266v;

    /* renamed from: w */
    private List<C12461b> f33267w;

    /* renamed from: x */
    private String f33268x;

    /* renamed from: com.bytedance.retrofit2.s$a */
    static final class C12533a<T> {

        /* renamed from: A */
        String f33269A;

        /* renamed from: B */
        Set<String> f33270B;

        /* renamed from: C */
        String f33271C;

        /* renamed from: D */
        C12491n<?>[] f33272D;

        /* renamed from: E */
        C12475f<TypedInput, T> f33273E;

        /* renamed from: F */
        C12467c<?> f33274F;

        /* renamed from: a */
        final C12516p f33275a;

        /* renamed from: b */
        final Method f33276b;

        /* renamed from: c */
        final Annotation[] f33277c;

        /* renamed from: d */
        final Annotation[][] f33278d;

        /* renamed from: e */
        final Type[] f33279e;

        /* renamed from: f */
        int f33280f = 1;

        /* renamed from: g */
        String f33281g = "";

        /* renamed from: h */
        boolean f33282h;

        /* renamed from: i */
        int f33283i = -1;

        /* renamed from: j */
        boolean f33284j = true;

        /* renamed from: k */
        boolean f33285k;

        /* renamed from: l */
        Object f33286l;

        /* renamed from: m */
        Type f33287m;

        /* renamed from: n */
        boolean f33288n;

        /* renamed from: o */
        boolean f33289o;

        /* renamed from: p */
        boolean f33290p;

        /* renamed from: q */
        boolean f33291q;

        /* renamed from: r */
        boolean f33292r;

        /* renamed from: s */
        boolean f33293s;

        /* renamed from: t */
        boolean f33294t;

        /* renamed from: u */
        String f33295u;

        /* renamed from: v */
        boolean f33296v;

        /* renamed from: w */
        boolean f33297w;

        /* renamed from: x */
        boolean f33298x;

        /* renamed from: y */
        String f33299y;

        /* renamed from: z */
        List<C12461b> f33300z;

        /* renamed from: a */
        public final C12532s mo30509a() {
            Annotation[] annotationArr;
            this.f33274F = m36413b();
            this.f33287m = this.f33274F.mo30454a();
            if (this.f33287m != C12464d.class) {
                this.f33273E = m36417c();
                for (Annotation annotation : this.f33277c) {
                    m36412a(annotation);
                    if (C12511o.m36353b()) {
                        m36416b(annotation);
                    }
                }
                if (this.f33295u != null) {
                    if (!this.f33296v && !this.f33285k) {
                        if (this.f33298x) {
                            throw m36406a("Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                        } else if (this.f33297w) {
                            throw m36406a("FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                        }
                    }
                    int length = this.f33278d.length;
                    this.f33272D = new C12491n[length];
                    int i = 0;
                    while (i < length) {
                        Type type = this.f33279e[i];
                        if (!C12536v.m36445d(type)) {
                            Annotation[] annotationArr2 = this.f33278d[i];
                            if (annotationArr2 != null) {
                                this.f33272D[i] = m36403a(i, type, annotationArr2);
                                i++;
                            } else {
                                throw m36405a(i, "No Retrofit annotation found.", new Object[0]);
                            }
                        } else {
                            throw m36405a(i, "Parameter type must not include a type variable or wildcard: %s", type);
                        }
                    }
                    if (this.f33299y == null && !this.f33293s) {
                        throw m36406a("Missing either @%s URL or @Url parameter.", this.f33295u);
                    } else if (!this.f33297w && !this.f33298x && !this.f33296v && !this.f33285k && this.f33290p) {
                        throw m36406a("Non-body HTTP method cannot contain @Body.", new Object[0]);
                    } else if (this.f33297w && !this.f33288n) {
                        throw m36406a("Form-encode method must contain at least one @Field.", new Object[0]);
                    } else if (!this.f33298x || this.f33289o) {
                        return new C12532s(this);
                    } else {
                        throw m36406a("Multipart method must contain at least one @Part.", new Object[0]);
                    }
                } else {
                    throw m36406a("HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
                }
            } else {
                StringBuilder sb = new StringBuilder("'");
                sb.append(C12536v.m36429a(this.f33287m).getName());
                sb.append("' is not a valid response body type.");
                throw m36406a(sb.toString(), new Object[0]);
            }
        }

        /* renamed from: a */
        private void m36412a(Annotation annotation) {
            if (annotation instanceof C6452c) {
                m36411a(Policy.ACTION_DELETE, ((C6452c) annotation).mo15736a(), false);
            } else if (annotation instanceof C6457h) {
                m36411a("GET", ((C6457h) annotation).mo15740a(), false);
            } else {
                if (annotation instanceof C6458i) {
                    m36411a("HEAD", ((C6458i) annotation).mo15741a(), false);
                    if (!Void.class.equals(this.f33287m)) {
                        throw m36406a("HEAD method must use Void as response type.", new Object[0]);
                    }
                } else if (annotation instanceof C6467r) {
                    m36411a("PATCH", ((C6467r) annotation).mo15749a(), true);
                } else if (annotation instanceof C6468s) {
                    m36411a("POST", ((C6468s) annotation).mo15750a(), true);
                } else if (annotation instanceof C6469t) {
                    m36411a("PUT", ((C6469t) annotation).mo15751a(), true);
                } else if (annotation instanceof C6466q) {
                    m36411a("OPTIONS", ((C6466q) annotation).mo15748a(), false);
                } else if (annotation instanceof C6459j) {
                    C6459j jVar = (C6459j) annotation;
                    m36411a(jVar.mo15742a(), jVar.mo15743b(), jVar.mo15744c());
                } else if (annotation instanceof C6462m) {
                    String[] a = ((C6462m) annotation).mo15746a();
                    if (a.length != 0) {
                        this.f33300z = m36409a(a);
                    } else {
                        throw m36406a("@Headers annotation is empty.", new Object[0]);
                    }
                } else if (annotation instanceof C6465p) {
                    if (!this.f33297w) {
                        this.f33298x = true;
                    } else {
                        throw m36406a("Only one encoding annotation is allowed.", new Object[0]);
                    }
                } else if (annotation instanceof C6456g) {
                    if (!this.f33298x) {
                        this.f33297w = true;
                    } else {
                        throw m36406a("Only one encoding annotation is allowed.", new Object[0]);
                    }
                } else if (annotation instanceof C6449ab) {
                    this.f33282h = true;
                } else if (annotation instanceof C6473x) {
                    this.f33280f = ((C6473x) annotation).mo15756a();
                } else if (annotation instanceof C6448aa) {
                    this.f33281g = ((C6448aa) annotation).mo15735a();
                }
            }
        }

        /* renamed from: a */
        private void m36411a(String str, String str2, boolean z) {
            if (this.f33295u == null) {
                this.f33295u = str;
                if (str != null) {
                    this.f33271C = C12532s.m36400b(str);
                }
                if (this.f33271C != null) {
                    this.f33285k = true;
                }
                this.f33296v = z;
                if (!str2.isEmpty()) {
                    int indexOf = str2.indexOf(63);
                    if (indexOf != -1 && indexOf < str2.length() - 1) {
                        String substring = str2.substring(indexOf + 1);
                        if (C12532s.f33245a.matcher(substring).find()) {
                            throw m36406a("URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                        }
                    }
                    this.f33299y = str2;
                    this.f33270B = C12532s.m36399a(str2);
                    return;
                }
                return;
            }
            throw m36406a("Only one HTTP method is allowed. Found: %s and %s.", this.f33295u, str);
        }

        /* renamed from: c */
        private C12475f<TypedInput, T> m36417c() {
            try {
                return this.f33275a.mo30493b(this.f33287m, this.f33276b.getAnnotations());
            } catch (RuntimeException e) {
                throw m36408a((Throwable) e, "Unable to create converter for %s", this.f33287m);
            }
        }

        /* renamed from: b */
        private C12467c<?> m36413b() {
            Type genericReturnType = this.f33276b.getGenericReturnType();
            if (C12536v.m36445d(genericReturnType)) {
                throw m36406a("Method return type must not include a type variable or wildcard: %s", genericReturnType);
            } else if (genericReturnType != Void.TYPE) {
                try {
                    return this.f33275a.mo30489a(genericReturnType, this.f33276b.getAnnotations());
                } catch (RuntimeException e) {
                    throw m36408a((Throwable) e, "Unable to create call adapter for %s", genericReturnType);
                }
            } else {
                throw m36406a("Service methods cannot return void.", new Object[0]);
            }
        }

        /* renamed from: b */
        private void m36416b(Annotation annotation) {
            if (annotation instanceof C7726b) {
                m36411a(Policy.ACTION_DELETE, ((C7726b) annotation).mo20416a(), false);
            } else if (annotation instanceof C7730f) {
                m36411a("GET", ((C7730f) annotation).mo20420a(), false);
            } else {
                if (annotation instanceof C7731g) {
                    m36411a("HEAD", ((C7731g) annotation).mo20421a(), false);
                    if (!Void.class.equals(this.f33287m)) {
                        throw m36406a("HEAD method must use Void as response type.", new Object[0]);
                    }
                } else if (annotation instanceof C7738n) {
                    m36411a("PATCH", ((C7738n) annotation).mo20428a(), true);
                } else if (annotation instanceof C7739o) {
                    m36411a("POST", ((C7739o) annotation).mo20429a(), true);
                } else if (annotation instanceof C7740p) {
                    m36411a("PUT", ((C7740p) annotation).mo20430a(), true);
                } else if (annotation instanceof C7737m) {
                    m36411a("OPTIONS", ((C7737m) annotation).mo20427a(), false);
                } else if (annotation instanceof C7732h) {
                    C7732h hVar = (C7732h) annotation;
                    m36411a(hVar.mo20422a(), hVar.mo20423b(), hVar.mo20424c());
                } else if (annotation instanceof C7735k) {
                    String[] a = ((C7735k) annotation).mo20426a();
                    if (a.length != 0) {
                        this.f33300z = m36409a(a);
                    } else {
                        throw m36406a("@Headers annotation is empty.", new Object[0]);
                    }
                } else if (annotation instanceof C7736l) {
                    if (!this.f33297w) {
                        this.f33298x = true;
                    } else {
                        throw m36406a("Only one encoding annotation is allowed.", new Object[0]);
                    }
                } else if (annotation instanceof C7729e) {
                    if (!this.f33298x) {
                        this.f33297w = true;
                    } else {
                        throw m36406a("Only one encoding annotation is allowed.", new Object[0]);
                    }
                } else if (annotation instanceof C7747w) {
                    this.f33282h = true;
                }
            }
        }

        /* renamed from: a */
        private List<C12461b> m36409a(String[] strArr) {
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                int indexOf = str.indexOf(58);
                if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                    throw m36406a("@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String substring = str.substring(0, indexOf);
                String trim = str.substring(indexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(substring)) {
                    this.f33269A = trim;
                } else {
                    arrayList.add(new C12461b(substring, trim));
                }
            }
            return arrayList;
        }

        /* renamed from: a */
        private RuntimeException m36406a(String str, Object... objArr) {
            return m36408a((Throwable) null, str, objArr);
        }

        public C12533a(C12516p pVar, Method method) {
            this.f33275a = pVar;
            this.f33276b = method;
            this.f33277c = method.getAnnotations();
            this.f33279e = method.getGenericParameterTypes();
            this.f33278d = method.getParameterAnnotations();
        }

        /* renamed from: b */
        private void m36415b(int i, String str) {
            if (!C12532s.f33246b.matcher(str).matches()) {
                throw m36405a(i, "@Path parameter name must match %s. Found: %s", C12532s.f33245a.pattern(), str);
            } else if (!this.f33270B.contains(str)) {
                throw m36405a(i, "URL \"%s\" does not contain \"{%s}\".", this.f33299y, str);
            }
        }

        /* renamed from: a */
        private void m36410a(int i, String str) {
            if (!C12532s.f33246b.matcher(str).matches()) {
                throw m36405a(i, "@Method parameter name must match %s. Found: %s", C12532s.f33245a.pattern(), str);
            } else if (this.f33271C != null && !this.f33271C.equals(str)) {
                throw m36405a(i, "Method \"%s\" does not contain \"{%s}\".", this.f33295u, str);
            }
        }

        /* renamed from: a */
        private RuntimeException m36405a(int i, String str, Object... objArr) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" (parameter #");
            sb.append(i + 1);
            sb.append(")");
            return m36406a(sb.toString(), objArr);
        }

        /* renamed from: a */
        private C12491n<?> m36403a(int i, Type type, Annotation[] annotationArr) {
            C12491n<?> nVar = null;
            for (Annotation annotation : annotationArr) {
                C12491n<?> a = m36404a(i, type, annotationArr, annotation);
                if (a == null && C12511o.m36353b()) {
                    a = m36414b(i, type, annotationArr, annotation);
                }
                if (a != null) {
                    if (nVar == null) {
                        nVar = a;
                    } else {
                        throw m36405a(i, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                    }
                }
            }
            if (nVar != null) {
                return nVar;
            }
            throw m36405a(i, "No Retrofit annotation found.", new Object[0]);
        }

        /* renamed from: a */
        private RuntimeException m36408a(Throwable th, String str, Object... objArr) {
            String a = C1642a.m8034a(str, objArr);
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            sb.append("\n    for method ");
            sb.append(this.f33276b.getDeclaringClass().getSimpleName());
            sb.append(ClassUtils.PACKAGE_SEPARATOR);
            sb.append(this.f33276b.getName());
            return new IllegalArgumentException(sb.toString(), th);
        }

        /* renamed from: a */
        private RuntimeException m36407a(Throwable th, int i, String str, Object... objArr) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" (parameter #");
            sb.append(i + 1);
            sb.append(")");
            return m36408a(th, sb.toString(), objArr);
        }

        /* renamed from: a */
        private C12491n<?> m36404a(int i, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof C6450ac) {
                if (this.f33293s) {
                    throw m36405a(i, "Multiple @Url method annotations found.", new Object[0]);
                } else if (this.f33291q) {
                    throw m36405a(i, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.f33292r) {
                    throw m36405a(i, "A @Url parameter must not come after a @Query", new Object[0]);
                } else if (this.f33299y == null) {
                    this.f33293s = true;
                    if (type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                        return new C12510q();
                    }
                    throw m36405a(i, "@Url must be String, java.net.URI, or android.net.Uri type.", new Object[0]);
                } else {
                    throw m36405a(i, "@Url cannot be used with @%s URL", this.f33295u);
                }
            } else if (annotation instanceof C6472w) {
                if (this.f33292r) {
                    throw m36405a(i, "A @Path parameter must not come after a @Query.", new Object[0]);
                } else if (this.f33293s) {
                    throw m36405a(i, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.f33299y != null) {
                    this.f33291q = true;
                    C6472w wVar = (C6472w) annotation;
                    String a = wVar.mo15754a();
                    m36415b(i, a);
                    return new C12506m(a, this.f33275a.mo30495d(type, annotationArr), wVar.mo15755b());
                } else {
                    throw m36405a(i, "@Path can only be used with relative url on @%s", this.f33295u);
                }
            } else if (annotation instanceof C6474y) {
                C6474y yVar = (C6474y) annotation;
                String a2 = yVar.mo15757a();
                boolean b = yVar.mo15758b();
                Class a3 = C12536v.m36429a(type);
                this.f33292r = true;
                if (Iterable.class.isAssignableFrom(a3)) {
                    if (type instanceof ParameterizedType) {
                        return new C12507n(a2, this.f33275a.mo30495d(C12536v.m36432a(0, (ParameterizedType) type), annotationArr), b).mo30481a();
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(a3.getSimpleName());
                    sb.append(" must include generic type (e.g., ");
                    sb.append(a3.getSimpleName());
                    sb.append("<String>)");
                    throw m36405a(i, sb.toString(), new Object[0]);
                } else if (!a3.isArray()) {
                    return new C12507n(a2, this.f33275a.mo30495d(type, annotationArr), b);
                } else {
                    return new C12507n(a2, this.f33275a.mo30495d(C12532s.m36398a(a3.getComponentType()), annotationArr), b).mo30483b();
                }
            } else if (annotation instanceof C6475z) {
                Class a4 = C12536v.m36429a(type);
                if (Map.class.isAssignableFrom(a4)) {
                    Type a5 = C12536v.m36433a(type, a4, Map.class);
                    if (a5 instanceof ParameterizedType) {
                        ParameterizedType parameterizedType = (ParameterizedType) a5;
                        Type a6 = C12536v.m36432a(0, parameterizedType);
                        if (String.class == a6) {
                            return new C12508o(this.f33275a.mo30495d(C12536v.m36432a(1, parameterizedType), annotationArr), ((C6475z) annotation).mo15759a());
                        }
                        StringBuilder sb2 = new StringBuilder("@QueryMap keys must be of type String: ");
                        sb2.append(a6);
                        throw m36405a(i, sb2.toString(), new Object[0]);
                    }
                    throw m36405a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw m36405a(i, "@QueryMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof C6460k) {
                String a7 = ((C6460k) annotation).mo15745a();
                Class a8 = C12536v.m36429a(type);
                if (Iterable.class.isAssignableFrom(a8)) {
                    if (type instanceof ParameterizedType) {
                        return new C12499f(a7, this.f33275a.mo30495d(C12536v.m36432a(0, (ParameterizedType) type), annotationArr)).mo30481a();
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(a8.getSimpleName());
                    sb3.append(" must include generic type (e.g., ");
                    sb3.append(a8.getSimpleName());
                    sb3.append("<String>)");
                    throw m36405a(i, sb3.toString(), new Object[0]);
                } else if (!a8.isArray()) {
                    return new C12499f(a7, this.f33275a.mo30495d(type, annotationArr));
                } else {
                    return new C12499f(a7, this.f33275a.mo30495d(C12532s.m36398a(a8.getComponentType()), annotationArr)).mo30483b();
                }
            } else if (annotation instanceof C6461l) {
                Class a9 = C12536v.m36429a(type);
                if (List.class.isAssignableFrom(a9)) {
                    Type a10 = C12536v.m36433a(type, a9, List.class);
                    if (a10 instanceof ParameterizedType) {
                        Type a11 = C12536v.m36432a(0, (ParameterizedType) a10);
                        if (C12461b.class == a11) {
                            return new C12500g(this.f33275a.mo30496e(a11, annotationArr));
                        }
                        StringBuilder sb4 = new StringBuilder("@HeaderList keys must be of type retrofit.client.Header: ");
                        sb4.append(a11);
                        throw m36405a(i, sb4.toString(), new Object[0]);
                    }
                    throw m36405a(i, "List must include generic types (e.g., List<Header>)", new Object[0]);
                }
                throw m36405a(i, "@HeaderList parameter type must be List.", new Object[0]);
            } else if (annotation instanceof C6454e) {
                if (this.f33297w) {
                    C6454e eVar = (C6454e) annotation;
                    String a12 = eVar.mo15737a();
                    boolean b2 = eVar.mo15738b();
                    this.f33288n = true;
                    Class a13 = C12536v.m36429a(type);
                    if (Iterable.class.isAssignableFrom(a13)) {
                        if (type instanceof ParameterizedType) {
                            return new C12497d(a12, this.f33275a.mo30495d(C12536v.m36432a(0, (ParameterizedType) type), annotationArr), b2).mo30481a();
                        }
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(a13.getSimpleName());
                        sb5.append(" must include generic type (e.g., ");
                        sb5.append(a13.getSimpleName());
                        sb5.append("<String>)");
                        throw m36405a(i, sb5.toString(), new Object[0]);
                    } else if (!a13.isArray()) {
                        return new C12497d(a12, this.f33275a.mo30495d(type, annotationArr), b2);
                    } else {
                        return new C12497d(a12, this.f33275a.mo30495d(C12532s.m36398a(a13.getComponentType()), annotationArr), b2).mo30483b();
                    }
                } else {
                    throw m36405a(i, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
            } else if (annotation instanceof C6455f) {
                if (this.f33297w) {
                    Class a14 = C12536v.m36429a(type);
                    if (Map.class.isAssignableFrom(a14)) {
                        Type a15 = C12536v.m36433a(type, a14, Map.class);
                        if (a15 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType2 = (ParameterizedType) a15;
                            Type a16 = C12536v.m36432a(0, parameterizedType2);
                            if (String.class == a16) {
                                C12475f d = this.f33275a.mo30495d(C12536v.m36432a(1, parameterizedType2), annotationArr);
                                this.f33288n = true;
                                return new C12498e(d, ((C6455f) annotation).mo15739a());
                            }
                            StringBuilder sb6 = new StringBuilder("@FieldMap keys must be of type String: ");
                            sb6.append(a16);
                            throw m36405a(i, sb6.toString(), new Object[0]);
                        }
                        throw m36405a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw m36405a(i, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                throw m36405a(i, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
            } else if (annotation instanceof C6470u) {
                if (this.f33298x) {
                    C6470u uVar = (C6470u) annotation;
                    this.f33289o = true;
                    return new C12504k(uVar.mo15752a(), this.f33275a.mo30490a(type, annotationArr, this.f33277c));
                }
                throw m36405a(i, "@Part parameters can only be used with multipart encoding.", new Object[0]);
            } else if (annotation instanceof C6471v) {
                if (this.f33298x) {
                    this.f33289o = true;
                    Class a17 = C12536v.m36429a(type);
                    if (Map.class.isAssignableFrom(a17)) {
                        Type a18 = C12536v.m36433a(type, a17, Map.class);
                        if (a18 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType3 = (ParameterizedType) a18;
                            Type a19 = C12536v.m36432a(0, parameterizedType3);
                            if (String.class == a19) {
                                return new C12505l(this.f33275a.mo30490a(C12536v.m36432a(1, parameterizedType3), annotationArr, this.f33277c), ((C6471v) annotation).mo15753a());
                            }
                            StringBuilder sb7 = new StringBuilder("@PartMap keys must be of type String: ");
                            sb7.append(a19);
                            throw m36405a(i, sb7.toString(), new Object[0]);
                        }
                        throw m36405a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw m36405a(i, "@PartMap parameter type must be Map.", new Object[0]);
                }
                throw m36405a(i, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
            } else if (annotation instanceof C6451b) {
                if (this.f33297w || this.f33298x) {
                    throw m36405a(i, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                } else if (!this.f33290p) {
                    try {
                        C12475f a20 = this.f33275a.mo30490a(type, annotationArr, this.f33277c);
                        this.f33290p = true;
                        return new C12495b(this.f33285k, a20);
                    } catch (RuntimeException e) {
                        throw m36407a((Throwable) e, i, "Unable to create @Body converter for %s", type);
                    }
                } else {
                    throw m36405a(i, "Multiple @Body method annotations found.", new Object[0]);
                }
            } else if (annotation instanceof C6464o) {
                if (!this.f33294t) {
                    this.f33294t = true;
                    String a21 = ((C6464o) annotation).mo15747a();
                    m36410a(i, a21);
                    return new C12503j(a21, this.f33275a.mo30495d(type, annotationArr));
                }
                throw m36405a(i, "Multiple @Method method annotations found.", new Object[0]);
            } else if (annotation instanceof C6463n) {
                try {
                    return new C12502i(this.f33275a.mo30495d(type, annotationArr));
                } catch (RuntimeException e2) {
                    throw m36407a((Throwable) e2, i, "Unable to create @MaxLength converter for %s", type);
                }
            } else if (annotation instanceof C6447a) {
                try {
                    return new C12494a(this.f33275a.mo30495d(type, annotationArr));
                } catch (RuntimeException e3) {
                    throw m36407a((Throwable) e3, i, "Unable to create @AddCommonParam converter for %s", type);
                }
            } else if (!(annotation instanceof C6453d)) {
                return null;
            } else {
                try {
                    return new C12496c(this.f33275a.mo30494c(type, annotationArr));
                } catch (RuntimeException e4) {
                    throw m36407a((Throwable) e4, i, "Unable to create @ExtraInfo converter for %s", type);
                }
            }
        }

        /* renamed from: b */
        private C12491n<?> m36414b(int i, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof C7748x) {
                if (this.f33293s) {
                    throw m36405a(i, "Multiple @Url method annotations found.", new Object[0]);
                } else if (this.f33291q) {
                    throw m36405a(i, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.f33292r) {
                    throw m36405a(i, "A @Url parameter must not come after a @Query", new Object[0]);
                } else if (this.f33299y == null) {
                    this.f33293s = true;
                    if (type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                        return new C12510q();
                    }
                    throw m36405a(i, "@Url must be String, java.net.URI, or android.net.Uri type.", new Object[0]);
                } else {
                    throw m36405a(i, "@Url cannot be used with @%s URL", this.f33295u);
                }
            } else if (annotation instanceof C7743s) {
                if (this.f33292r) {
                    throw m36405a(i, "A @Path parameter must not come after a @Query.", new Object[0]);
                } else if (this.f33293s) {
                    throw m36405a(i, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.f33299y != null) {
                    this.f33291q = true;
                    C7743s sVar = (C7743s) annotation;
                    String a = sVar.mo20434a();
                    m36415b(i, a);
                    return new C12506m(a, this.f33275a.mo30495d(type, annotationArr), !sVar.mo20435b());
                } else {
                    throw m36405a(i, "@Path can only be used with relative url on @%s", this.f33295u);
                }
            } else if (annotation instanceof C7744t) {
                C7744t tVar = (C7744t) annotation;
                String a2 = tVar.mo20436a();
                boolean b = tVar.mo20437b();
                Class a3 = C12536v.m36429a(type);
                this.f33292r = true;
                if (Iterable.class.isAssignableFrom(a3)) {
                    if (type instanceof ParameterizedType) {
                        return new C12507n(a2, this.f33275a.mo30495d(C12536v.m36432a(0, (ParameterizedType) type), annotationArr), !b).mo30481a();
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(a3.getSimpleName());
                    sb.append(" must include generic type (e.g., ");
                    sb.append(a3.getSimpleName());
                    sb.append("<String>)");
                    throw m36405a(i, sb.toString(), new Object[0]);
                } else if (!a3.isArray()) {
                    return new C12507n(a2, this.f33275a.mo30495d(type, annotationArr), !b);
                } else {
                    return new C12507n(a2, this.f33275a.mo30495d(C12532s.m36398a(a3.getComponentType()), annotationArr), !b).mo30483b();
                }
            } else if (annotation instanceof C7746v) {
                boolean a4 = ((C7746v) annotation).mo20439a();
                Class a5 = C12536v.m36429a(type);
                this.f33292r = true;
                if (Iterable.class.isAssignableFrom(a5)) {
                    if (type instanceof ParameterizedType) {
                        return new C12509p(this.f33275a.mo30495d(C12536v.m36432a(0, (ParameterizedType) type), annotationArr), a4).mo30481a();
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(a5.getSimpleName());
                    sb2.append(" must include generic type (e.g., ");
                    sb2.append(a5.getSimpleName());
                    sb2.append("<String>)");
                    throw m36405a(i, sb2.toString(), new Object[0]);
                } else if (!a5.isArray()) {
                    return new C12509p(this.f33275a.mo30495d(type, annotationArr), a4);
                } else {
                    return new C12509p(this.f33275a.mo30495d(C12532s.m36398a(a5.getComponentType()), annotationArr), a4).mo30483b();
                }
            } else if (annotation instanceof C7745u) {
                Class a6 = C12536v.m36429a(type);
                if (Map.class.isAssignableFrom(a6)) {
                    Type a7 = C12536v.m36433a(type, a6, Map.class);
                    if (a7 instanceof ParameterizedType) {
                        ParameterizedType parameterizedType = (ParameterizedType) a7;
                        Type a8 = C12536v.m36432a(0, parameterizedType);
                        if (String.class == a8) {
                            return new C12508o(this.f33275a.mo30495d(C12536v.m36432a(1, parameterizedType), annotationArr), !((C7745u) annotation).mo20438a());
                        }
                        StringBuilder sb3 = new StringBuilder("@QueryMap keys must be of type String: ");
                        sb3.append(a8);
                        throw m36405a(i, sb3.toString(), new Object[0]);
                    }
                    throw m36405a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw m36405a(i, "@QueryMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof C7733i) {
                String a9 = ((C7733i) annotation).mo20425a();
                Class a10 = C12536v.m36429a(type);
                if (Iterable.class.isAssignableFrom(a10)) {
                    if (type instanceof ParameterizedType) {
                        return new C12499f(a9, this.f33275a.mo30495d(C12536v.m36432a(0, (ParameterizedType) type), annotationArr)).mo30481a();
                    }
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(a10.getSimpleName());
                    sb4.append(" must include generic type (e.g., ");
                    sb4.append(a10.getSimpleName());
                    sb4.append("<String>)");
                    throw m36405a(i, sb4.toString(), new Object[0]);
                } else if (!a10.isArray()) {
                    return new C12499f(a9, this.f33275a.mo30495d(type, annotationArr));
                } else {
                    return new C12499f(a9, this.f33275a.mo30495d(C12532s.m36398a(a10.getComponentType()), annotationArr)).mo30483b();
                }
            } else if (annotation instanceof C7734j) {
                Class a11 = C12536v.m36429a(type);
                if (Map.class.isAssignableFrom(a11)) {
                    Type a12 = C12536v.m36433a(type, a11, Map.class);
                    if (a12 instanceof ParameterizedType) {
                        ParameterizedType parameterizedType2 = (ParameterizedType) a12;
                        Type a13 = C12536v.m36432a(0, parameterizedType2);
                        if (String.class == a13) {
                            return new C12501h(this.f33275a.mo30495d(C12536v.m36432a(1, parameterizedType2), annotationArr));
                        }
                        StringBuilder sb5 = new StringBuilder("@HeaderMap keys must be of type String: ");
                        sb5.append(a13);
                        throw m36405a(i, sb5.toString(), new Object[0]);
                    }
                    throw m36405a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw m36405a(i, "@HeaderMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof C7727c) {
                if (this.f33297w) {
                    C7727c cVar = (C7727c) annotation;
                    String a14 = cVar.mo20417a();
                    boolean b2 = cVar.mo20418b();
                    this.f33288n = true;
                    Class a15 = C12536v.m36429a(type);
                    if (Iterable.class.isAssignableFrom(a15)) {
                        if (type instanceof ParameterizedType) {
                            return new C12497d(a14, this.f33275a.mo30495d(C12536v.m36432a(0, (ParameterizedType) type), annotationArr), !b2).mo30481a();
                        }
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(a15.getSimpleName());
                        sb6.append(" must include generic type (e.g., ");
                        sb6.append(a15.getSimpleName());
                        sb6.append("<String>)");
                        throw m36405a(i, sb6.toString(), new Object[0]);
                    } else if (!a15.isArray()) {
                        return new C12497d(a14, this.f33275a.mo30495d(type, annotationArr), !b2);
                    } else {
                        return new C12497d(a14, this.f33275a.mo30495d(C12532s.m36398a(a15.getComponentType()), annotationArr), !b2).mo30483b();
                    }
                } else {
                    throw m36405a(i, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
            } else if (annotation instanceof C7728d) {
                if (this.f33297w) {
                    Class a16 = C12536v.m36429a(type);
                    if (Map.class.isAssignableFrom(a16)) {
                        Type a17 = C12536v.m36433a(type, a16, Map.class);
                        if (a17 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType3 = (ParameterizedType) a17;
                            Type a18 = C12536v.m36432a(0, parameterizedType3);
                            if (String.class == a18) {
                                C12475f d = this.f33275a.mo30495d(C12536v.m36432a(1, parameterizedType3), annotationArr);
                                this.f33288n = true;
                                return new C12498e(d, !((C7728d) annotation).mo20419a());
                            }
                            StringBuilder sb7 = new StringBuilder("@FieldMap keys must be of type String: ");
                            sb7.append(a18);
                            throw m36405a(i, sb7.toString(), new Object[0]);
                        }
                        throw m36405a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw m36405a(i, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                throw m36405a(i, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
            } else if (annotation instanceof C7741q) {
                if (this.f33298x) {
                    C7741q qVar = (C7741q) annotation;
                    this.f33289o = true;
                    return new C12504k(qVar.mo20431a(), this.f33275a.mo30490a(type, annotationArr, this.f33277c));
                }
                throw m36405a(i, "@Part parameters can only be used with multipart encoding.", new Object[0]);
            } else if (annotation instanceof C7742r) {
                if (this.f33298x) {
                    this.f33289o = true;
                    Class a19 = C12536v.m36429a(type);
                    if (Map.class.isAssignableFrom(a19)) {
                        Type a20 = C12536v.m36433a(type, a19, Map.class);
                        if (a20 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType4 = (ParameterizedType) a20;
                            Type a21 = C12536v.m36432a(0, parameterizedType4);
                            if (String.class == a21) {
                                return new C12505l(this.f33275a.mo30490a(C12536v.m36432a(1, parameterizedType4), annotationArr, this.f33277c), ((C7742r) annotation).mo20433a());
                            }
                            StringBuilder sb8 = new StringBuilder("@PartMap keys must be of type String: ");
                            sb8.append(a21);
                            throw m36405a(i, sb8.toString(), new Object[0]);
                        }
                        throw m36405a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw m36405a(i, "@PartMap parameter type must be Map.", new Object[0]);
                }
                throw m36405a(i, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
            } else if (!(annotation instanceof C7725a)) {
                return null;
            } else {
                if (this.f33297w || this.f33298x) {
                    throw m36405a(i, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                } else if (!this.f33290p) {
                    try {
                        C12475f a22 = this.f33275a.mo30490a(type, annotationArr, this.f33277c);
                        this.f33290p = true;
                        return new C12495b(this.f33285k, a22);
                    } catch (RuntimeException e) {
                        throw m36407a((Throwable) e, i, "Unable to create @Body converter for %s", type);
                    }
                } else {
                    throw m36405a(i, "Multiple @Body method annotations found.", new Object[0]);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final T mo30508a(TypedInput typedInput) throws IOException {
        return this.f33259o.mo10447a(typedInput);
    }

    /* renamed from: a */
    static Set<String> m36399a(String str) {
        Matcher matcher = f33245a.matcher(str);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (matcher.find()) {
            linkedHashSet.add(matcher.group(1));
        }
        return linkedHashSet;
    }

    /* renamed from: b */
    static String m36400b(String str) {
        Matcher matcher = f33245a.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    /* renamed from: a */
    static Class<?> m36398a(Class<?> cls) {
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

    C12532s(C12533a<T> aVar) {
        this.f33247c = aVar.f33275a.f33183a;
        this.f33248d = aVar.f33274F;
        this.f33249e = aVar.f33275a.f33189g;
        this.f33250f = aVar.f33275a.f33188f;
        this.f33258n = aVar.f33275a.f33184b;
        this.f33259o = aVar.f33273E;
        this.f33260p = aVar.f33295u;
        this.f33261q = aVar.f33299y;
        this.f33263s = aVar.f33296v;
        this.f33264t = aVar.f33297w;
        this.f33265u = aVar.f33298x;
        this.f33266v = aVar.f33272D;
        this.f33267w = aVar.f33300z;
        this.f33268x = aVar.f33269A;
        this.f33251g = aVar.f33280f;
        this.f33252h = aVar.f33281g;
        this.f33253i = aVar.f33282h;
        this.f33254j = aVar.f33283i;
        this.f33255k = aVar.f33284j;
        this.f33262r = aVar.f33285k;
        this.f33256l = aVar.f33286l;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C12462c mo30507a(C12488k kVar, Object... objArr) throws IOException {
        int i;
        Object[] objArr2 = objArr;
        RequestBuilder requestBuilder = r2;
        RequestBuilder requestBuilder2 = new RequestBuilder(this.f33260p, this.f33258n, this.f33261q, this.f33267w, this.f33268x, this.f33251g, this.f33253i, this.f33254j, this.f33255k, this.f33256l, this.f33263s, this.f33264t, this.f33265u, this.f33252h);
        C12491n[] nVarArr = (C12491n[]) this.f33266v;
        Object[] objArr3 = objArr;
        if (objArr3 != null) {
            i = objArr3.length;
        } else {
            i = 0;
        }
        if (i == nVarArr.length) {
            for (int i2 = 0; i2 < i; i2++) {
                nVarArr[i2].mo30482a(requestBuilder, objArr3[i2]);
            }
            return requestBuilder.mo30404a(kVar);
        }
        StringBuilder sb = new StringBuilder("Argument count (");
        sb.append(i);
        sb.append(") doesn't match expected count (");
        sb.append(nVarArr.length);
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }
}
