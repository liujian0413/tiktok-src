package org.greenrobot.eventbus;

import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.taobao.android.dexposed.ClassUtils;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.greenrobot.eventbus.p1894a.C48326c;
import org.greenrobot.eventbus.p1894a.C48327d;

/* renamed from: org.greenrobot.eventbus.o */
final class C48343o {

    /* renamed from: a */
    private static final Map<Class<?>, List<C48342n>> f123429a = new ConcurrentHashMap();

    /* renamed from: e */
    private static final C48344a[] f123430e = new C48344a[4];

    /* renamed from: b */
    private List<C48327d> f123431b;

    /* renamed from: c */
    private final boolean f123432c;

    /* renamed from: d */
    private final boolean f123433d;

    /* renamed from: org.greenrobot.eventbus.o$a */
    static class C48344a {

        /* renamed from: a */
        final List<C48342n> f123434a = new ArrayList();

        /* renamed from: b */
        final Map<Class, Object> f123435b = new HashMap();

        /* renamed from: c */
        final Map<String, Class> f123436c = new HashMap();

        /* renamed from: d */
        final StringBuilder f123437d = new StringBuilder(PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);

        /* renamed from: e */
        Class<?> f123438e;

        /* renamed from: f */
        Class<?> f123439f;

        /* renamed from: g */
        boolean f123440g;

        /* renamed from: h */
        C48326c f123441h;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo121783a() {
            this.f123434a.clear();
            this.f123435b.clear();
            this.f123436c.clear();
            this.f123437d.setLength(0);
            this.f123438e = null;
            this.f123439f = null;
            this.f123440g = false;
            this.f123441h = null;
        }

        C48344a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo121786b() {
            if (!this.f123440g) {
                this.f123439f = this.f123439f.getSuperclass();
                String name = this.f123439f.getName();
                if (!name.startsWith("java.") && !name.startsWith("javax.") && !name.startsWith("android.")) {
                    return;
                }
            }
            this.f123439f = null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo121784a(Class<?> cls) {
            this.f123439f = cls;
            this.f123438e = cls;
            this.f123440g = false;
            this.f123441h = null;
        }

        /* renamed from: b */
        private boolean m149934b(Method method, Class<?> cls) {
            this.f123437d.setLength(0);
            this.f123437d.append(method.getName());
            StringBuilder sb = this.f123437d;
            sb.append('>');
            sb.append(cls.getName());
            String sb2 = this.f123437d.toString();
            Class declaringClass = method.getDeclaringClass();
            Class cls2 = (Class) this.f123436c.put(sb2, declaringClass);
            if (cls2 == null || cls2.isAssignableFrom(declaringClass)) {
                return true;
            }
            this.f123436c.put(sb2, cls2);
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo121785a(Method method, Class<?> cls) {
            Object put = this.f123435b.put(cls, method);
            if (put == null) {
                return true;
            }
            if (put instanceof Method) {
                if (m149934b((Method) put, cls)) {
                    this.f123435b.put(cls, this);
                } else {
                    throw new IllegalStateException();
                }
            }
            return m149934b(method, cls);
        }
    }

    /* renamed from: a */
    private static C48344a m149928a() {
        synchronized (f123430e) {
            int i = 0;
            while (i < 4) {
                try {
                    C48344a aVar = f123430e[i];
                    if (aVar != null) {
                        f123430e[i] = null;
                        return aVar;
                    }
                    i++;
                } finally {
                    while (true) {
                    }
                }
            }
            return new C48344a();
        }
    }

    /* renamed from: c */
    private List<C48342n> m149931c(Class<?> cls) {
        C48344a a = m149928a();
        a.mo121784a(cls);
        while (a.f123439f != null) {
            m149932c(a);
            a.mo121786b();
        }
        return m149927a(a);
    }

    /* renamed from: a */
    private static List<C48342n> m149927a(C48344a aVar) {
        ArrayList arrayList = new ArrayList(aVar.f123434a);
        aVar.mo121783a();
        synchronized (f123430e) {
            int i = 0;
            while (true) {
                if (i >= 4) {
                    break;
                }
                try {
                    if (f123430e[i] == null) {
                        f123430e[i] = aVar;
                        break;
                    }
                    i++;
                } finally {
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private List<C48342n> m149929b(Class<?> cls) {
        C48342n[] c;
        C48344a a = m149928a();
        a.mo121784a(cls);
        while (a.f123439f != null) {
            a.f123441h = m149930b(a);
            if (a.f123441h != null) {
                for (C48342n nVar : a.f123441h.mo121765c()) {
                    if (a.mo121785a(nVar.f123423a, nVar.f123425c)) {
                        a.f123434a.add(nVar);
                    }
                }
            } else {
                m149932c(a);
            }
            a.mo121786b();
        }
        return m149927a(a);
    }

    /* renamed from: b */
    private C48326c m149930b(C48344a aVar) {
        if (!(aVar.f123441h == null || aVar.f123441h.mo121764b() == null)) {
            C48326c b = aVar.f123441h.mo121764b();
            if (aVar.f123439f == b.mo121762a()) {
                return b;
            }
        }
        if (this.f123431b != null) {
            for (C48327d a : this.f123431b) {
                C48326c a2 = a.mo57952a(aVar.f123439f);
                if (a2 != null) {
                    return a2;
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    private void m149932c(C48344a aVar) {
        Method[] methodArr;
        try {
            methodArr = aVar.f123439f.getDeclaredMethods();
        } catch (Throwable unused) {
            methodArr = aVar.f123439f.getMethods();
            aVar.f123440g = true;
        }
        for (Method method : methodArr) {
            int modifiers = method.getModifiers();
            if ((modifiers & 1) != 0 && (modifiers & 5192) == 0) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1) {
                    C7709l lVar = (C7709l) method.getAnnotation(C7709l.class);
                    if (lVar != null) {
                        Class cls = parameterTypes[0];
                        if (aVar.mo121785a(method, cls)) {
                            ThreadMode a = lVar.mo20400a();
                            List<C48342n> list = aVar.f123434a;
                            C48342n nVar = new C48342n(method, cls, a, lVar.mo20402c(), lVar.mo20401b());
                            list.add(nVar);
                        }
                    }
                } else if (this.f123432c && method.isAnnotationPresent(C7709l.class)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(method.getDeclaringClass().getName());
                    sb.append(ClassUtils.PACKAGE_SEPARATOR);
                    sb.append(method.getName());
                    String sb2 = sb.toString();
                    StringBuilder sb3 = new StringBuilder("@Subscribe method ");
                    sb3.append(sb2);
                    sb3.append("must have exactly 1 parameter but has ");
                    sb3.append(parameterTypes.length);
                    throw new EventBusException(sb3.toString());
                }
            } else if (this.f123432c && method.isAnnotationPresent(C7709l.class)) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(method.getDeclaringClass().getName());
                sb4.append(ClassUtils.PACKAGE_SEPARATOR);
                sb4.append(method.getName());
                String sb5 = sb4.toString();
                StringBuilder sb6 = new StringBuilder();
                sb6.append(sb5);
                sb6.append(" is a illegal @Subscribe method: must be public, non-static, and non-abstract");
                throw new EventBusException(sb6.toString());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final List<C48342n> mo121782a(Class<?> cls) {
        List<C48342n> list;
        List<C48342n> list2 = (List) f123429a.get(cls);
        if (list2 != null) {
            return list2;
        }
        if (this.f123433d) {
            list = m149931c(cls);
        } else {
            list = m149929b(cls);
        }
        if (!list.isEmpty()) {
            f123429a.put(cls, list);
            return list;
        }
        StringBuilder sb = new StringBuilder("Subscriber ");
        sb.append(cls);
        sb.append(" and its super classes have no public methods with the @Subscribe annotation");
        throw new EventBusException(sb.toString());
    }

    C48343o(List<C48327d> list, boolean z, boolean z2) {
        this.f123431b = list;
        this.f123432c = z;
        this.f123433d = z2;
    }
}
