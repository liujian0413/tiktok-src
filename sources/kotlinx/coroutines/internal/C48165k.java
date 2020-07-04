package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.C7573i;

/* renamed from: kotlinx.coroutines.internal.k */
public class C48165k<E> {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f123019a = AtomicReferenceFieldUpdater.newUpdater(C48165k.class, Object.class, "_cur$internal");
    public volatile /* synthetic */ Object _cur$internal = new C48166l(8, false);

    /* renamed from: a */
    public final int mo120382a() {
        return ((C48166l) this._cur$internal).mo120389b();
    }

    /* renamed from: b */
    public final void mo120384b() {
        while (true) {
            C48166l lVar = (C48166l) this._cur$internal;
            if (!lVar.mo120390c()) {
                f123019a.compareAndSet(this, lVar, lVar.mo120392e());
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006c, code lost:
        r7 = r9;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final E mo120385c() {
        /*
            r11 = this;
        L_0x0000:
            java.lang.Object r0 = r11._cur$internal
            kotlinx.coroutines.internal.l r0 = (kotlinx.coroutines.internal.C48166l) r0
        L_0x0004:
            long r3 = r0._state$internal
            r1 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            r5 = 0
            r7 = 0
            int r8 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r8 == 0) goto L_0x0013
            kotlinx.coroutines.internal.v r7 = kotlinx.coroutines.internal.C48166l.f123021e
            goto L_0x006d
        L_0x0013:
            r1 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r1 = r1 & r3
            r5 = 0
            long r1 = r1 >> r5
            int r8 = (int) r1
            r1 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r1 = r1 & r3
            r5 = 30
            long r1 = r1 >> r5
            int r1 = (int) r1
            int r2 = r0.f123024a
            r1 = r1 & r2
            int r2 = r0.f123024a
            r2 = r2 & r8
            if (r1 != r2) goto L_0x002d
            goto L_0x006d
        L_0x002d:
            java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> r1 = r0.f123025c
            int r2 = r0.f123024a
            r2 = r2 & r8
            java.lang.Object r9 = r1.get(r2)
            if (r9 != 0) goto L_0x003d
            boolean r1 = r0.f123026d
            if (r1 == 0) goto L_0x0004
            goto L_0x006d
        L_0x003d:
            boolean r1 = r9 instanceof kotlinx.coroutines.internal.C48166l.C48168b
            if (r1 == 0) goto L_0x0042
            goto L_0x006d
        L_0x0042:
            int r1 = r8 + 1
            r2 = 1073741823(0x3fffffff, float:1.9999999)
            r10 = r1 & r2
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.internal.C48166l.f123020b
            kotlinx.coroutines.internal.l$a r2 = kotlinx.coroutines.internal.C48166l.f123022f
            long r5 = r2.mo120393a(r3, r10)
            r2 = r0
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L_0x0061
            java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> r1 = r0.f123025c
            int r2 = r0.f123024a
            r2 = r2 & r8
            r1.set(r2, r7)
            goto L_0x006c
        L_0x0061:
            boolean r1 = r0.f123026d
            if (r1 == 0) goto L_0x0004
            r1 = r0
        L_0x0066:
            kotlinx.coroutines.internal.l r1 = r1.mo120387a(r8, r10)
            if (r1 != 0) goto L_0x0066
        L_0x006c:
            r7 = r9
        L_0x006d:
            kotlinx.coroutines.internal.v r1 = kotlinx.coroutines.internal.C48166l.f123021e
            if (r7 == r1) goto L_0x0072
            return r7
        L_0x0072:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f123019a
            kotlinx.coroutines.internal.l r2 = r0.mo120392e()
            r1.compareAndSet(r11, r0, r2)
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C48165k.mo120385c():java.lang.Object");
    }

    public C48165k(boolean z) {
    }

    /* renamed from: a */
    public final boolean mo120383a(E e) {
        C7573i.m23587b(e, "element");
        while (true) {
            C48166l lVar = (C48166l) this._cur$internal;
            switch (lVar.mo120386a(e)) {
                case 0:
                    return true;
                case 1:
                    f123019a.compareAndSet(this, lVar, lVar.mo120392e());
                    break;
                case 2:
                    return false;
            }
        }
    }
}
