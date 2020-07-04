package com.p280ss.android.ugc.aweme.account.p942e;

import com.p280ss.android.ugc.aweme.account.login.model.C21566a;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.ugc.aweme.account.e.a */
public final class C21170a {

    /* renamed from: a */
    private static C21566a f56942a;

    /* renamed from: b */
    private static List<WeakReference<C21171a>> f56943b = new LinkedList();

    /* renamed from: c */
    private static List<C21172b> f56944c = new CopyOnWriteArrayList();

    /* renamed from: com.ss.android.ugc.aweme.account.e.a$a */
    public interface C21171a {
        /* renamed from: a */
        void mo57095a(C21566a aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.e.a$b */
    public interface C21172b {
        /* renamed from: a_ */
        void mo57096a_(int i);
    }

    /* renamed from: a */
    public static C21566a m71336a() {
        return f56942a;
    }

    /* renamed from: a */
    public static void m71339a(C21172b bVar) {
        f56944c.add(bVar);
    }

    /* renamed from: b */
    public static void m71341b(C21172b bVar) {
        f56944c.remove(bVar);
    }

    /* renamed from: a */
    public static void m71337a(int i) {
        for (C21172b a_ : f56944c) {
            a_.mo57096a_(i);
        }
    }

    /* renamed from: a */
    public static void m71338a(C21171a aVar) {
        synchronized (C21170a.class) {
            f56943b.add(new WeakReference(aVar));
        }
    }

    /* renamed from: a */
    public static void m71340a(C21566a aVar) {
        synchronized (C21170a.class) {
            f56942a = aVar;
            Iterator it = f56943b.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() == null) {
                    it.remove();
                } else {
                    ((C21171a) weakReference.get()).mo57095a(aVar);
                }
            }
        }
    }
}
