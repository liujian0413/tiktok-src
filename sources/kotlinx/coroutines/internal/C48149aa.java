package kotlinx.coroutines.internal;

import kotlin.coroutines.C47924e;
import kotlin.jvm.internal.C7573i;

/* renamed from: kotlinx.coroutines.internal.aa */
final class C48149aa {

    /* renamed from: a */
    public final C47924e f122994a;

    /* renamed from: b */
    private Object[] f122995b;

    /* renamed from: c */
    private int f122996c;

    /* renamed from: b */
    public final void mo120366b() {
        this.f122996c = 0;
    }

    /* renamed from: a */
    public final Object mo120364a() {
        Object[] objArr = this.f122995b;
        int i = this.f122996c;
        this.f122996c = i + 1;
        return objArr[i];
    }

    /* renamed from: a */
    public final void mo120365a(Object obj) {
        Object[] objArr = this.f122995b;
        int i = this.f122996c;
        this.f122996c = i + 1;
        objArr[i] = obj;
    }

    public C48149aa(C47924e eVar, int i) {
        C7573i.m23587b(eVar, "context");
        this.f122994a = eVar;
        this.f122995b = new Object[i];
    }
}
