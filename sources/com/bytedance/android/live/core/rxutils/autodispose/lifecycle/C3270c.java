package com.bytedance.android.live.core.rxutils.autodispose.lifecycle;

import com.bytedance.android.live.core.rxutils.autodispose.C3279r;
import com.bytedance.android.live.core.rxutils.autodispose.OutsideScopeException;
import java.util.Comparator;
import p346io.reactivex.C7318a;
import p346io.reactivex.C7322c;
import p346io.reactivex.C7492s;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7328l;

/* renamed from: com.bytedance.android.live.core.rxutils.autodispose.lifecycle.c */
public final class C3270c {

    /* renamed from: a */
    private static final Comparator<Comparable<Object>> f9985a = C3273f.f9989a;

    /* renamed from: a */
    public static <E> C7322c m12328a(C3269b<E> bVar) throws OutsideScopeException {
        return m12329a(bVar, true);
    }

    /* renamed from: a */
    private static <E> C7322c m12330a(C7492s<E> sVar, E e) {
        Comparator<Comparable<Object>> comparator;
        if (e instanceof Comparable) {
            comparator = f9985a;
        } else {
            comparator = null;
        }
        return m12331a(sVar, e, comparator);
    }

    /* renamed from: a */
    private static <E> C7322c m12329a(C3269b<E> bVar, boolean z) throws OutsideScopeException {
        Object d = bVar.mo10174d();
        C3268a b = bVar.mo10172b();
        if (d != null) {
            try {
                return m12330a(bVar.mo10171a(), (E) b.apply(d));
            } catch (Exception e) {
                if (!(e instanceof LifecycleEndedException)) {
                    return C7318a.m22917a((Throwable) e);
                }
                C7326g b2 = C3279r.m12344b();
                if (b2 != null) {
                    try {
                        b2.accept((LifecycleEndedException) e);
                        return C7318a.m22916a();
                    } catch (Exception e2) {
                        return C7318a.m22917a((Throwable) e2);
                    }
                } else {
                    throw e;
                }
            }
        } else {
            throw new LifecycleNotStartedException();
        }
    }

    /* renamed from: a */
    private static <E> C7322c m12331a(C7492s<E> sVar, E e, Comparator<E> comparator) {
        C7328l lVar;
        if (comparator != null) {
            lVar = new C3271d(comparator, e);
        } else {
            lVar = new C3272e(e);
        }
        return sVar.mo19298b(1).mo19309c(lVar).mo19329h();
    }

    /* renamed from: a */
    static final /* synthetic */ boolean m12333a(Comparator comparator, Object obj, Object obj2) throws Exception {
        if (comparator.compare(obj2, obj) >= 0) {
            return true;
        }
        return false;
    }
}
