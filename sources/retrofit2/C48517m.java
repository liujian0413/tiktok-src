package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import okhttp3.Call.Factory;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.C48476c.C48477a;
import retrofit2.C48479e.C48480a;

/* renamed from: retrofit2.m */
public final class C48517m {

    /* renamed from: a */
    public final Factory f123666a;

    /* renamed from: b */
    public final HttpUrl f123667b;

    /* renamed from: c */
    public final List<C48480a> f123668c;

    /* renamed from: d */
    public final List<C48477a> f123669d;

    /* renamed from: e */
    public final Executor f123670e;

    /* renamed from: f */
    final boolean f123671f;

    /* renamed from: g */
    private final Map<Method, C48520n<?, ?>> f123672g = new ConcurrentHashMap();

    /* renamed from: retrofit2.m$a */
    public static final class C48519a {

        /* renamed from: a */
        private final C48510j f123676a;

        /* renamed from: b */
        private Factory f123677b;

        /* renamed from: c */
        private HttpUrl f123678c;

        /* renamed from: d */
        private final List<C48480a> f123679d;

        /* renamed from: e */
        private final List<C48477a> f123680e;

        /* renamed from: f */
        private Executor f123681f;

        /* renamed from: g */
        private boolean f123682g;

        public C48519a() {
            this(C48510j.m150242a());
        }

        /* renamed from: a */
        public final C48517m mo123323a() {
            if (this.f123678c != null) {
                Factory factory = this.f123677b;
                if (factory == null) {
                    factory = new OkHttpClient();
                }
                Factory factory2 = factory;
                Executor executor = this.f123681f;
                if (executor == null) {
                    executor = this.f123676a.mo123297b();
                }
                Executor executor2 = executor;
                ArrayList arrayList = new ArrayList(this.f123680e);
                arrayList.add(this.f123676a.mo123295a(executor2));
                C48517m mVar = new C48517m(factory2, this.f123678c, new ArrayList(this.f123679d), arrayList, executor2, this.f123682g);
                return mVar;
            }
            throw new IllegalStateException("Base URL required.");
        }

        /* renamed from: a */
        private C48519a m150278a(Factory factory) {
            this.f123677b = (Factory) C48522o.m150306a(factory, "factory == null");
            return this;
        }

        private C48519a(C48510j jVar) {
            this.f123679d = new ArrayList();
            this.f123680e = new ArrayList();
            this.f123676a = jVar;
            this.f123679d.add(new C48463a());
        }

        /* renamed from: a */
        public final C48519a mo123320a(OkHttpClient okHttpClient) {
            return m150278a((Factory) C48522o.m150306a(okHttpClient, "client == null"));
        }

        /* renamed from: a */
        private C48519a m150279a(HttpUrl httpUrl) {
            C48522o.m150306a(httpUrl, "baseUrl == null");
            List<String> list = httpUrl.pathSegments;
            if ("".equals(list.get(list.size() - 1))) {
                this.f123678c = httpUrl;
                return this;
            }
            StringBuilder sb = new StringBuilder("baseUrl must end in /: ");
            sb.append(httpUrl);
            throw new IllegalArgumentException(sb.toString());
        }

        /* renamed from: a */
        public final C48519a mo123319a(String str) {
            C48522o.m150306a(str, "baseUrl == null");
            HttpUrl parse = HttpUrl.parse(str);
            if (parse != null) {
                return m150279a(parse);
            }
            StringBuilder sb = new StringBuilder("Illegal URL: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }

        /* renamed from: a */
        public final C48519a mo123321a(C48477a aVar) {
            this.f123680e.add(C48522o.m150306a(aVar, "factory == null"));
            return this;
        }

        /* renamed from: a */
        public final C48519a mo123322a(C48480a aVar) {
            this.f123679d.add(C48522o.m150306a(aVar, "factory == null"));
            return this;
        }
    }

    /* renamed from: b */
    private void m150271b(Class<?> cls) {
        Method[] declaredMethods;
        C48510j a = C48510j.m150242a();
        for (Method method : cls.getDeclaredMethods()) {
            if (!a.mo123296a(method)) {
                mo123315a(method);
            }
        }
    }

    /* renamed from: a */
    public final <T> T mo123312a(final Class<T> cls) {
        C48522o.m150312a(cls);
        if (this.f123671f) {
            m150271b(cls);
        }
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() {

            /* renamed from: c */
            private final C48510j f123675c = C48510j.m150242a();

            public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
                if (method.getDeclaringClass() == Object.class) {
                    return method.invoke(this, objArr);
                }
                if (this.f123675c.mo123296a(method)) {
                    return this.f123675c.mo123294a(method, cls, obj, objArr);
                }
                C48520n a = C48517m.this.mo123315a(method);
                return a.f123686d.mo80366a(new C48489h(a, objArr));
            }
        });
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C48520n<?, ?> mo123315a(Method method) {
        C48520n<?, ?> nVar;
        C48520n<?, ?> nVar2 = (C48520n) this.f123672g.get(method);
        if (nVar2 != null) {
            return nVar2;
        }
        synchronized (this.f123672g) {
            nVar = (C48520n) this.f123672g.get(method);
            if (nVar == null) {
                nVar = new C48521a(this, method).mo123326a();
                this.f123672g.put(method, nVar);
            }
        }
        return nVar;
    }

    /* renamed from: a */
    public final C48476c<?, ?> mo123313a(Type type, Annotation[] annotationArr) {
        return m150268a((C48477a) null, type, annotationArr);
    }

    /* renamed from: b */
    public final <T> C48479e<ResponseBody, T> mo123316b(Type type, Annotation[] annotationArr) {
        return m150269a((C48480a) null, type, annotationArr);
    }

    /* renamed from: c */
    public final <T> C48479e<T, String> mo123317c(Type type, Annotation[] annotationArr) {
        C48522o.m150306a(type, "type == null");
        C48522o.m150306a(annotationArr, "annotations == null");
        int size = this.f123668c.size();
        for (int i = 0; i < size; i++) {
            this.f123668c.get(i);
        }
        return C48467d.f123583a;
    }

    /* renamed from: a */
    public final <T> C48479e<T, RequestBody> mo123314a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return m150270a(null, type, annotationArr, annotationArr2);
    }

    /* renamed from: a */
    private C48476c<?, ?> m150268a(C48477a aVar, Type type, Annotation[] annotationArr) {
        C48522o.m150306a(type, "returnType == null");
        C48522o.m150306a(annotationArr, "annotations == null");
        int indexOf = this.f123669d.indexOf(null) + 1;
        int size = this.f123669d.size();
        for (int i = indexOf; i < size; i++) {
            C48476c<?, ?> a = ((C48477a) this.f123669d.get(i)).mo80365a(type, annotationArr, this);
            if (a != null) {
                return a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.f123669d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(((C48477a) this.f123669d.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    private <T> C48479e<ResponseBody, T> m150269a(C48480a aVar, Type type, Annotation[] annotationArr) {
        C48522o.m150306a(type, "type == null");
        C48522o.m150306a(annotationArr, "annotations == null");
        int indexOf = this.f123668c.indexOf(null) + 1;
        int size = this.f123668c.size();
        for (int i = indexOf; i < size; i++) {
            C48479e<ResponseBody, T> a = ((C48480a) this.f123668c.get(i)).mo123279a(type, annotationArr, this);
            if (a != null) {
                return a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.f123668c.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(((C48480a) this.f123668c.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    private <T> C48479e<T, RequestBody> m150270a(C48480a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        C48522o.m150306a(type, "type == null");
        C48522o.m150306a(annotationArr, "parameterAnnotations == null");
        C48522o.m150306a(annotationArr2, "methodAnnotations == null");
        int indexOf = this.f123668c.indexOf(null) + 1;
        int size = this.f123668c.size();
        for (int i = indexOf; i < size; i++) {
            C48479e<T, RequestBody> a = ((C48480a) this.f123668c.get(i)).mo123280a(type, annotationArr, annotationArr2, this);
            if (a != null) {
                return a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.f123668c.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(((C48480a) this.f123668c.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    C48517m(Factory factory, HttpUrl httpUrl, List<C48480a> list, List<C48477a> list2, Executor executor, boolean z) {
        this.f123666a = factory;
        this.f123667b = httpUrl;
        this.f123668c = Collections.unmodifiableList(list);
        this.f123669d = Collections.unmodifiableList(list2);
        this.f123670e = executor;
        this.f123671f = z;
    }
}
