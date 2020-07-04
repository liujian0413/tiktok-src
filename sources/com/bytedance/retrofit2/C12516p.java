package com.bytedance.retrofit2;

import android.os.SystemClock;
import com.bytedance.retrofit2.C12467c.C12468a;
import com.bytedance.retrofit2.C12475f.C12476a;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p637a.C12459a.C12460a;
import com.bytedance.retrofit2.p637a.C12461b;
import com.bytedance.retrofit2.p638c.C12469a;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.bytedance.retrofit2.p */
public final class C12516p {

    /* renamed from: a */
    public final C12460a f33183a;

    /* renamed from: b */
    public final C12479h f33184b;

    /* renamed from: c */
    public final List<C12476a> f33185c;

    /* renamed from: d */
    public final List<C12468a> f33186d;

    /* renamed from: e */
    public final Executor f33187e;

    /* renamed from: f */
    public final Executor f33188f;

    /* renamed from: g */
    public final List<C12469a> f33189g;

    /* renamed from: h */
    private final Map<Method, C12532s> f33190h = new LinkedHashMap();

    /* renamed from: i */
    private final boolean f33191i;

    /* renamed from: com.bytedance.retrofit2.p$a */
    public static final class C12518a {

        /* renamed from: a */
        private C12511o f33195a;

        /* renamed from: b */
        private C12460a f33196b;

        /* renamed from: c */
        private C12479h f33197c;

        /* renamed from: d */
        private List<C12469a> f33198d;

        /* renamed from: e */
        private List<C12476a> f33199e;

        /* renamed from: f */
        private List<C12468a> f33200f;

        /* renamed from: g */
        private Executor f33201g;

        /* renamed from: h */
        private Executor f33202h;

        /* renamed from: i */
        private boolean f33203i;

        public C12518a() {
            this(C12511o.m36352a());
        }

        /* renamed from: a */
        public final C12516p mo30504a() {
            if (this.f33197c == null) {
                throw new IllegalStateException("Endpoint may not be null.");
            } else if (this.f33196b == null) {
                throw new IllegalStateException("ClientProvider may not be null.");
            } else if (this.f33201g != null) {
                Executor executor = this.f33202h;
                if (executor == null) {
                    executor = this.f33195a.mo30485c();
                }
                Executor executor2 = executor;
                ArrayList arrayList = new ArrayList(this.f33200f);
                arrayList.add(this.f33195a.mo30484a(executor2));
                C12516p pVar = new C12516p(this.f33197c, this.f33196b, this.f33198d, new ArrayList(this.f33199e), arrayList, this.f33201g, executor2, this.f33203i);
                return pVar;
            } else {
                throw new IllegalStateException("HttpExecutor may not be null.");
            }
        }

        /* renamed from: b */
        private C12518a m36374b(C12460a aVar) {
            this.f33196b = (C12460a) C12536v.m36431a(aVar, "provider == null");
            return this;
        }

        /* renamed from: a */
        public final C12518a mo30498a(C12460a aVar) {
            return m36374b((C12460a) C12536v.m36431a(aVar, "provider == null"));
        }

        /* renamed from: a */
        public final C12518a mo30499a(C12468a aVar) {
            this.f33200f.add(C12536v.m36431a(aVar, "factory == null"));
            return this;
        }

        private C12518a(C12511o oVar) {
            this.f33198d = new LinkedList();
            this.f33199e = new ArrayList();
            this.f33200f = new ArrayList();
            this.f33195a = oVar;
            this.f33199e.add(new C12449a());
        }

        /* renamed from: a */
        public final C12518a mo30500a(C12469a aVar) {
            this.f33198d.add((C12469a) C12536v.m36431a(aVar, "interceptor == null"));
            return this;
        }

        /* renamed from: a */
        public final C12518a mo30501a(C12476a aVar) {
            this.f33199e.add(C12536v.m36431a(aVar, "factory == null"));
            return this;
        }

        /* renamed from: a */
        public final C12518a mo30502a(String str) {
            if (str == null || str.trim().length() == 0) {
                throw new NullPointerException("Endpoint may not be blank.");
            }
            this.f33197c = C12480i.m36311a(str);
            return this;
        }

        /* renamed from: a */
        public final C12518a mo30503a(Executor executor) {
            this.f33201g = (Executor) C12536v.m36431a(executor, "httpExecutor == null");
            return this;
        }
    }

    /* renamed from: b */
    private void m36364b(Class<?> cls) {
        for (Method a : cls.getDeclaredMethods()) {
            mo30491a(a);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C12532s mo30491a(Method method) {
        C12532s sVar;
        synchronized (this.f33190h) {
            sVar = (C12532s) this.f33190h.get(method);
            if (sVar == null) {
                sVar = new C12533a(this, method).mo30509a();
                this.f33190h.put(method, sVar);
            }
        }
        return sVar;
    }

    /* renamed from: a */
    public final <T> T mo30492a(final Class<T> cls) {
        C12536v.m36436a(cls);
        if (this.f33191i) {
            m36364b(cls);
        }
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() {

            /* renamed from: c */
            private final C12511o f33194c = C12511o.m36352a();

            public final Object invoke(Object obj, Method method, Object... objArr) throws Throwable {
                if (method.getDeclaringClass() == Object.class) {
                    return method.invoke(this, objArr);
                }
                C12520r rVar = new C12520r();
                rVar.f33207c = SystemClock.uptimeMillis();
                C12532s a = C12516p.this.mo30491a(method);
                rVar.f33208d = SystemClock.uptimeMillis();
                a.f33257m = rVar;
                return a.f33248d.mo30453a(new SsHttpCall(a, objArr));
            }
        });
    }

    /* renamed from: a */
    public final C12467c<?> mo30489a(Type type, Annotation[] annotationArr) {
        return mo30488a((C12468a) null, type, annotationArr);
    }

    /* renamed from: b */
    public final <T> C12475f<TypedInput, T> mo30493b(Type type, Annotation[] annotationArr) {
        return m36362a((C12476a) null, type, annotationArr);
    }

    /* renamed from: c */
    public final <T> C12475f<T, Object> mo30494c(Type type, Annotation[] annotationArr) {
        C12536v.m36431a(type, "type == null");
        C12536v.m36431a(annotationArr, "annotations == null");
        int size = this.f33185c.size();
        for (int i = 0; i < size; i++) {
            C12475f<T, Object> b = ((C12476a) this.f33185c.get(i)).mo30436b(type, annotationArr, this);
            if (b != null) {
                return b;
            }
        }
        throw new IllegalArgumentException("Could not locate object converter");
    }

    /* renamed from: d */
    public final <T> C12475f<T, String> mo30495d(Type type, Annotation[] annotationArr) {
        C12536v.m36431a(type, "type == null");
        C12536v.m36431a(annotationArr, "annotations == null");
        int size = this.f33185c.size();
        for (int i = 0; i < size; i++) {
            C12475f<T, String> c = ((C12476a) this.f33185c.get(i)).mo30437c(type, annotationArr, this);
            if (c != null) {
                return c;
            }
        }
        return C12457h.f33093a;
    }

    /* renamed from: e */
    public final <T> C12475f<T, C12461b> mo30496e(Type type, Annotation[] annotationArr) {
        C12536v.m36431a(type, "type == null");
        C12536v.m36431a(annotationArr, "annotations == null");
        int size = this.f33185c.size();
        for (int i = 0; i < size; i++) {
            C12475f<T, C12461b> d = ((C12476a) this.f33185c.get(i)).mo30438d(type, annotationArr, this);
            if (d != null) {
                return d;
            }
        }
        throw new IllegalArgumentException("Could not locate header converter");
    }

    /* renamed from: a */
    public final <T> C12475f<T, TypedOutput> mo30490a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return m36363a(null, type, annotationArr, annotationArr2);
    }

    /* renamed from: a */
    private <T> C12475f<TypedInput, T> m36362a(C12476a aVar, Type type, Annotation[] annotationArr) {
        C12536v.m36431a(type, "type == null");
        C12536v.m36431a(annotationArr, "annotations == null");
        int indexOf = this.f33185c.indexOf(null) + 1;
        int size = this.f33185c.size();
        for (int i = indexOf; i < size; i++) {
            C12475f<TypedInput, T> a = ((C12476a) this.f33185c.get(i)).mo10441a(type, annotationArr, this);
            if (a != null) {
                return a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate TypeInput converter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.f33185c.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(((C12476a) this.f33185c.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public final C12467c<?> mo30488a(C12468a aVar, Type type, Annotation[] annotationArr) {
        C12536v.m36431a(type, "returnType == null");
        C12536v.m36431a(annotationArr, "annotations == null");
        int indexOf = this.f33186d.indexOf(aVar) + 1;
        int size = this.f33186d.size();
        for (int i = indexOf; i < size; i++) {
            C12467c<?> a = ((C12468a) this.f33186d.get(i)).mo30455a(type, annotationArr, this);
            if (a != null) {
                return a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(((C12468a) this.f33186d.get(i2)).getClass().getName());
            }
            sb.append(10);
        }
        sb.append("  Tried:");
        int size2 = this.f33186d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(((C12468a) this.f33186d.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    private <T> C12475f<T, TypedOutput> m36363a(C12476a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        C12536v.m36431a(type, "type == null");
        C12536v.m36431a(annotationArr, "parameterAnnotations == null");
        C12536v.m36431a(annotationArr2, "methodAnnotations == null");
        int indexOf = this.f33185c.indexOf(null) + 1;
        int size = this.f33185c.size();
        for (int i = indexOf; i < size; i++) {
            C12475f<T, TypedOutput> a = ((C12476a) this.f33185c.get(i)).mo10442a(type, annotationArr, annotationArr2, this);
            if (a != null) {
                return a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.f33185c.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(((C12476a) this.f33185c.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    C12516p(C12479h hVar, C12460a aVar, List<C12469a> list, List<C12476a> list2, List<C12468a> list3, Executor executor, Executor executor2, boolean z) {
        this.f33184b = hVar;
        this.f33183a = aVar;
        this.f33189g = list;
        this.f33185c = Collections.unmodifiableList(list2);
        this.f33186d = Collections.unmodifiableList(list3);
        this.f33188f = executor;
        this.f33187e = executor2;
        this.f33191i = z;
    }
}
