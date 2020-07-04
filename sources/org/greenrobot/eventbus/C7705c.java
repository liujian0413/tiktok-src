package org.greenrobot.eventbus;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.logging.Level;

/* renamed from: org.greenrobot.eventbus.c */
public class C7705c {

    /* renamed from: a */
    public static String f20938a = "EventBus";

    /* renamed from: b */
    static volatile C7705c f20939b;

    /* renamed from: e */
    private static final C48330d f20940e = new C48330d();

    /* renamed from: f */
    private static final Map<Class<?>, List<Class<?>>> f20941f = new HashMap();

    /* renamed from: c */
    public final ExecutorService f20942c;

    /* renamed from: d */
    public final C48332f f20943d;

    /* renamed from: g */
    private final Map<Class<?>, CopyOnWriteArrayList<C48345p>> f20944g;

    /* renamed from: h */
    private final Map<Object, List<Class<?>>> f20945h;

    /* renamed from: i */
    private final Map<Class<?>, Object> f20946i;

    /* renamed from: j */
    private final ThreadLocal<C7708a> f20947j;

    /* renamed from: k */
    private final C48335g f20948k;

    /* renamed from: l */
    private final C48340k f20949l;

    /* renamed from: m */
    private final C48329b f20950m;

    /* renamed from: n */
    private final C48323a f20951n;

    /* renamed from: o */
    private final C48343o f20952o;

    /* renamed from: p */
    private final boolean f20953p;

    /* renamed from: q */
    private final boolean f20954q;

    /* renamed from: r */
    private final boolean f20955r;

    /* renamed from: s */
    private final boolean f20956s;

    /* renamed from: t */
    private final boolean f20957t;

    /* renamed from: u */
    private final boolean f20958u;

    /* renamed from: v */
    private final int f20959v;

    /* renamed from: org.greenrobot.eventbus.c$a */
    static final class C7708a {

        /* renamed from: a */
        final List<Object> f20962a = new ArrayList();

        /* renamed from: b */
        boolean f20963b;

        /* renamed from: c */
        boolean f20964c;

        /* renamed from: d */
        C48345p f20965d;

        /* renamed from: e */
        Object f20966e;

        /* renamed from: f */
        boolean f20967f;

        C7708a() {
        }
    }

    /* renamed from: a */
    public final void mo20389a(Object obj) {
        List<C48342n> a = this.f20952o.mo121782a(obj.getClass());
        synchronized (this) {
            for (C48342n a2 : a) {
                m23802a(obj, a2);
            }
        }
    }

    /* renamed from: a */
    public final <T> T mo20388a(Class<T> cls) {
        T cast;
        synchronized (this.f20946i) {
            cast = cls.cast(this.f20946i.get(cls));
        }
        return cast;
    }

    /* renamed from: a */
    private boolean m23807a(Object obj, C7708a aVar, Class<?> cls) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        synchronized (this) {
            copyOnWriteArrayList = (CopyOnWriteArrayList) this.f20944g.get(cls);
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C48345p pVar = (C48345p) it.next();
            aVar.f20966e = obj;
            aVar.f20965d = pVar;
            try {
                m23806a(pVar, obj, aVar.f20964c);
                if (aVar.f20967f) {
                    break;
                }
            } finally {
                aVar.f20966e = null;
                aVar.f20965d = null;
                aVar.f20967f = false;
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo20390a(C48338i iVar) {
        Object obj = iVar.f123414a;
        C48345p pVar = iVar.f123415b;
        C48338i.m149921a(iVar);
        if (pVar.f123444c) {
            m23809b(pVar, obj);
        }
    }

    public C7705c() {
        this(f20940e);
    }

    /* renamed from: b */
    public static C48330d m23808b() {
        return new C48330d();
    }

    /* renamed from: c */
    private boolean m23811c() {
        if (this.f20948k != null) {
            return this.f20948k.mo121776a();
        }
        return true;
    }

    /* renamed from: a */
    public static C7705c m23799a() {
        if (f20939b == null) {
            synchronized (C7705c.class) {
                if (f20939b == null) {
                    f20939b = new C7705c();
                }
            }
        }
        return f20939b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("EventBus[indexCount=");
        sb.append(this.f20959v);
        sb.append(", eventInheritance=");
        sb.append(this.f20958u);
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: b */
    public final synchronized boolean mo20392b(Object obj) {
        return this.f20945h.containsKey(obj);
    }

    /* renamed from: b */
    public final <T> T mo20391b(Class<T> cls) {
        T cast;
        synchronized (this.f20946i) {
            cast = cls.cast(this.f20946i.remove(cls));
        }
        return cast;
    }

    /* renamed from: f */
    public final void mo20396f(Object obj) {
        synchronized (this.f20946i) {
            this.f20946i.put(obj.getClass(), obj);
        }
        mo20394d(obj);
    }

    /* renamed from: c */
    private static List<Class<?>> m23810c(Class<?> cls) {
        List<Class<?>> list;
        synchronized (f20941f) {
            list = (List) f20941f.get(cls);
            if (list == null) {
                list = new ArrayList<>();
                for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
                    list.add(cls2);
                    m23803a(list, (Class<?>[]) cls2.getInterfaces());
                }
                f20941f.put(cls, list);
            }
        }
        return list;
    }

    /* renamed from: e */
    public final void mo20395e(Object obj) {
        C7708a aVar = (C7708a) this.f20947j.get();
        if (!aVar.f20963b) {
            throw new EventBusException("This method may only be called from inside event handling methods on the posting thread");
        } else if (obj == null) {
            throw new EventBusException("Event may not be null");
        } else if (aVar.f20966e != obj) {
            throw new EventBusException("Only the currently handled event may be aborted");
        } else if (aVar.f20965d.f123443b.f123424b == ThreadMode.POSTING) {
            aVar.f20967f = true;
        } else {
            throw new EventBusException(" event handlers may only abort the incoming event");
        }
    }

    /* renamed from: g */
    public final boolean mo20397g(Object obj) {
        synchronized (this.f20946i) {
            Class cls = obj.getClass();
            if (!obj.equals(this.f20946i.get(cls))) {
                return false;
            }
            this.f20946i.remove(cls);
            return true;
        }
    }

    C7705c(C48330d dVar) {
        C48340k kVar;
        int i;
        this.f20947j = new ThreadLocal<C7708a>() {
            /* renamed from: a */
            private static C7708a m23822a() {
                return new C7708a();
            }

            /* access modifiers changed from: protected */
            public final /* synthetic */ Object initialValue() {
                return m23822a();
            }
        };
        this.f20943d = dVar.mo121769a();
        this.f20944g = new HashMap();
        this.f20945h = new HashMap();
        this.f20946i = new ConcurrentHashMap();
        this.f20948k = dVar.mo121770b();
        if (this.f20948k != null) {
            kVar = this.f20948k.mo121775a(this);
        } else {
            kVar = null;
        }
        this.f20949l = kVar;
        this.f20950m = new C48329b(this);
        this.f20951n = new C48323a(this);
        if (dVar.f123401j != null) {
            i = dVar.f123401j.size();
        } else {
            i = 0;
        }
        this.f20959v = i;
        this.f20952o = new C48343o(dVar.f123401j, dVar.f123399h, dVar.f123398g);
        this.f20954q = dVar.f123392a;
        this.f20955r = dVar.f123393b;
        this.f20956s = dVar.f123394c;
        this.f20957t = dVar.f123395d;
        this.f20953p = dVar.f123396e;
        this.f20958u = dVar.f123397f;
        this.f20942c = dVar.f123400i;
    }

    /* renamed from: c */
    public final synchronized void mo20393c(Object obj) {
        List<Class> list = (List) this.f20945h.get(obj);
        if (list != null) {
            for (Class a : list) {
                m23800a(obj, a);
            }
            this.f20945h.remove(obj);
            return;
        }
        C48332f fVar = this.f20943d;
        Level level = Level.WARNING;
        StringBuilder sb = new StringBuilder("Subscriber to unregister was not registered before: ");
        sb.append(obj.getClass());
        fVar.mo121773a(level, sb.toString());
    }

    /* renamed from: d */
    public final void mo20394d(Object obj) {
        C7708a aVar = (C7708a) this.f20947j.get();
        List<Object> list = aVar.f20962a;
        list.add(obj);
        if (!aVar.f20963b) {
            aVar.f20964c = m23811c();
            aVar.f20963b = true;
            if (!aVar.f20967f) {
                while (!list.isEmpty()) {
                    try {
                        m23801a(list.remove(0), aVar);
                    } finally {
                        aVar.f20963b = false;
                        aVar.f20964c = false;
                    }
                }
                return;
            }
            throw new EventBusException("Internal error. Abort state was not reset");
        }
    }

    /* renamed from: a */
    private void m23804a(C48345p pVar, Object obj) {
        if (obj != null) {
            m23806a(pVar, obj, m23811c());
        }
    }

    /* renamed from: a */
    private void m23800a(Object obj, Class<?> cls) {
        List list = (List) this.f20944g.get(cls);
        if (list != null) {
            int size = list.size();
            int i = 0;
            while (i < size) {
                C48345p pVar = (C48345p) list.get(i);
                if (pVar.f123442a == obj) {
                    pVar.f123444c = false;
                    list.remove(i);
                    i--;
                    size--;
                }
                i++;
            }
        }
    }

    /* renamed from: b */
    private void m23809b(C48345p pVar, Object obj) {
        try {
            pVar.f123443b.f123423a.invoke(pVar.f123442a, new Object[]{obj});
        } catch (InvocationTargetException e) {
            m23805a(pVar, obj, e.getCause());
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException("Unexpected exception", e2);
        }
    }

    /* renamed from: a */
    private void m23801a(Object obj, C7708a aVar) throws Error {
        boolean z;
        Class<C48341m> cls = obj.getClass();
        if (this.f20958u) {
            List c = m23810c(cls);
            z = false;
            for (int i = 0; i < c.size(); i++) {
                z |= m23807a(obj, aVar, (Class) c.get(i));
            }
        } else {
            z = m23807a(obj, aVar, cls);
        }
        if (!z) {
            if (this.f20955r) {
                C48332f fVar = this.f20943d;
                Level level = Level.FINE;
                StringBuilder sb = new StringBuilder("No subscribers registered for event ");
                sb.append(cls);
                fVar.mo121773a(level, sb.toString());
            }
            if (this.f20957t && cls != C48337h.class && cls != C48341m.class) {
                mo20394d(new C48337h(this, obj));
            }
        }
    }

    /* renamed from: a */
    private void m23802a(Object obj, C48342n nVar) {
        Class<?> cls = nVar.f123425c;
        C48345p pVar = new C48345p(obj, nVar);
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f20944g.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            this.f20944g.put(cls, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(pVar)) {
            StringBuilder sb = new StringBuilder("Subscriber ");
            sb.append(obj.getClass());
            sb.append(" already registered to event ");
            sb.append(cls);
            throw new EventBusException(sb.toString());
        }
        int size = copyOnWriteArrayList.size();
        int i = 0;
        while (true) {
            if (i > size) {
                break;
            } else if (i == size || nVar.f123426d > ((C48345p) copyOnWriteArrayList.get(i)).f123443b.f123426d) {
                copyOnWriteArrayList.add(i, pVar);
            } else {
                i++;
            }
        }
        copyOnWriteArrayList.add(i, pVar);
        List list = (List) this.f20945h.get(obj);
        if (list == null) {
            list = new ArrayList();
            this.f20945h.put(obj, list);
        }
        list.add(cls);
        if (nVar.f123427e) {
            if (this.f20958u) {
                for (Entry entry : this.f20946i.entrySet()) {
                    if (cls.isAssignableFrom((Class) entry.getKey())) {
                        m23804a(pVar, entry.getValue());
                    }
                }
                return;
            }
            m23804a(pVar, this.f20946i.get(cls));
        }
    }

    /* renamed from: a */
    private static void m23803a(List<Class<?>> list, Class<?>[] clsArr) {
        for (Class<?> cls : clsArr) {
            if (!list.contains(cls)) {
                list.add(cls);
                m23803a(list, (Class<?>[]) cls.getInterfaces());
            }
        }
    }

    /* renamed from: a */
    private void m23805a(C48345p pVar, Object obj, Throwable th) {
        if (obj instanceof C48341m) {
            if (this.f20954q) {
                C48332f fVar = this.f20943d;
                Level level = Level.SEVERE;
                StringBuilder sb = new StringBuilder("SubscriberExceptionEvent subscriber ");
                sb.append(pVar.f123442a.getClass());
                sb.append(" threw an exception");
                fVar.mo121774a(level, sb.toString(), th);
                C48341m mVar = (C48341m) obj;
                C48332f fVar2 = this.f20943d;
                Level level2 = Level.SEVERE;
                StringBuilder sb2 = new StringBuilder("Initial event ");
                sb2.append(mVar.f123421c);
                sb2.append(" caused exception in ");
                sb2.append(mVar.f123422d);
                fVar2.mo121774a(level2, sb2.toString(), mVar.f123420b);
            }
        } else if (!this.f20953p) {
            if (this.f20954q) {
                C48332f fVar3 = this.f20943d;
                Level level3 = Level.SEVERE;
                StringBuilder sb3 = new StringBuilder("Could not dispatch event: ");
                sb3.append(obj.getClass());
                sb3.append(" to subscribing class ");
                sb3.append(pVar.f123442a.getClass());
                fVar3.mo121774a(level3, sb3.toString(), th);
            }
            if (this.f20956s) {
                mo20394d(new C48341m(this, th, obj, pVar.f123442a));
            }
        } else {
            throw new EventBusException("Invoking subscriber failed", th);
        }
    }

    /* renamed from: a */
    private void m23806a(C48345p pVar, Object obj, boolean z) {
        switch (pVar.f123443b.f123424b) {
            case POSTING:
                m23809b(pVar, obj);
                return;
            case MAIN:
                if (z) {
                    m23809b(pVar, obj);
                    return;
                } else {
                    this.f20949l.mo121760a(pVar, obj);
                    return;
                }
            case MAIN_ORDERED:
                if (this.f20949l != null) {
                    this.f20949l.mo121760a(pVar, obj);
                    return;
                } else {
                    m23809b(pVar, obj);
                    return;
                }
            case BACKGROUND:
                if (z) {
                    this.f20950m.mo121760a(pVar, obj);
                    return;
                } else {
                    m23809b(pVar, obj);
                    return;
                }
            case ASYNC:
                this.f20951n.mo121760a(pVar, obj);
                return;
            default:
                StringBuilder sb = new StringBuilder("Unknown thread mode: ");
                sb.append(pVar.f123443b.f123424b);
                throw new IllegalStateException(sb.toString());
        }
    }
}
