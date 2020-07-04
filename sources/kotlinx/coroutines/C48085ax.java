package kotlinx.coroutines;

import kotlin.jvm.internal.C7573i;
import kotlinx.coroutines.internal.C48150b;

/* renamed from: kotlinx.coroutines.ax */
public abstract class C48085ax extends C48222y {

    /* renamed from: b */
    private long f122943b;

    /* renamed from: c */
    private boolean f122944c;

    /* renamed from: d */
    private C48150b<C48079ar<?>> f122945d;

    /* renamed from: c */
    private static long m149080c(boolean z) {
        return z ? 4294967296L : 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo120305h() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo120300c() {
        return mo120304g();
    }

    /* renamed from: f */
    public final boolean mo120303f() {
        if (this.f122943b >= m149080c(true)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final boolean mo120304g() {
        C48150b<C48079ar<?>> bVar = this.f122945d;
        if (bVar != null) {
            return bVar.mo120368a();
        }
        return true;
    }

    /* renamed from: b */
    public long mo120298b() {
        if (!mo120302e()) {
            return Long.MAX_VALUE;
        }
        return mo120301d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public long mo120301d() {
        C48150b<C48079ar<?>> bVar = this.f122945d;
        if (bVar != null && !bVar.mo120368a()) {
            return 0;
        }
        return Long.MAX_VALUE;
    }

    /* renamed from: e */
    public final boolean mo120302e() {
        C48150b<C48079ar<?>> bVar = this.f122945d;
        if (bVar == null) {
            return false;
        }
        C48079ar arVar = (C48079ar) bVar.mo120369b();
        if (arVar == null) {
            return false;
        }
        arVar.run();
        return true;
    }

    /* renamed from: a */
    public final void mo120297a(boolean z) {
        this.f122943b += m149080c(z);
        if (!z) {
            this.f122944c = true;
        }
    }

    /* renamed from: a */
    public final void mo120296a(C48079ar<?> arVar) {
        C7573i.m23587b(arVar, "task");
        C48150b<C48079ar<?>> bVar = this.f122945d;
        if (bVar == null) {
            bVar = new C48150b<>();
            this.f122945d = bVar;
        }
        bVar.mo120367a(arVar);
    }

    /* renamed from: b */
    public final void mo120299b(boolean z) {
        boolean z2;
        this.f122943b -= m149080c(z);
        if (this.f122943b <= 0) {
            if (this.f122943b == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (this.f122944c) {
                    mo120305h();
                }
                return;
            }
            throw new IllegalStateException("Extra decrementUseCount".toString());
        }
    }
}
