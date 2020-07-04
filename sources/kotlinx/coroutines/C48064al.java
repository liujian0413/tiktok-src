package kotlinx.coroutines;

import kotlin.coroutines.C47919b;
import kotlin.coroutines.C47924e;
import kotlin.coroutines.jvm.internal.C7540d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.C7573i;

/* renamed from: kotlinx.coroutines.al */
class C48064al<T> extends C48048a<T> implements C48063ak<T> {

    @C7540d(mo19421b = "Builders.common.kt", mo19422c = {99}, mo19423d = "await$suspendImpl", mo19424e = "kotlinx.coroutines.DeferredCoroutine")
    /* renamed from: kotlinx.coroutines.al$a */
    static final class C48065a extends ContinuationImpl {

        /* renamed from: a */
        /* synthetic */ Object f122912a;

        /* renamed from: b */
        int f122913b;

        /* renamed from: c */
        final /* synthetic */ C48064al f122914c;

        /* renamed from: d */
        Object f122915d;

        C48065a(C48064al alVar, C47919b bVar) {
            this.f122914c = alVar;
            super(bVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f122912a = obj;
            this.f122913b |= Integer.MIN_VALUE;
            return C48064al.m149036a(this.f122914c, this);
        }
    }

    /* renamed from: a */
    public final Object mo120272a(C47919b<? super T> bVar) {
        return m149036a(this, bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean mo120273h() {
        return true;
    }

    public C48064al(C47924e eVar, boolean z) {
        C7573i.m23587b(eVar, "parentContext");
        super(eVar, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.lang.Object m149036a(kotlinx.coroutines.C48064al r3, kotlin.coroutines.C47919b r4) {
        /*
            boolean r0 = r4 instanceof kotlinx.coroutines.C48064al.C48065a
            if (r0 == 0) goto L_0x0014
            r0 = r4
            kotlinx.coroutines.al$a r0 = (kotlinx.coroutines.C48064al.C48065a) r0
            int r1 = r0.f122913b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r4 = r0.f122913b
            int r4 = r4 - r2
            r0.f122913b = r4
            goto L_0x0019
        L_0x0014:
            kotlinx.coroutines.al$a r0 = new kotlinx.coroutines.al$a
            r0.<init>(r3, r4)
        L_0x0019:
            java.lang.Object r4 = r0.f122912a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C47948a.m148881a()
            int r2 = r0.f122913b
            switch(r2) {
                case 0: goto L_0x0036;
                case 1: goto L_0x002c;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L_0x002c:
            boolean r3 = r4 instanceof kotlin.Result.Failure
            if (r3 != 0) goto L_0x0031
            goto L_0x0046
        L_0x0031:
            kotlin.Result$Failure r4 = (kotlin.Result.Failure) r4
            java.lang.Throwable r3 = r4.exception
            throw r3
        L_0x0036:
            boolean r2 = r4 instanceof kotlin.Result.Failure
            if (r2 != 0) goto L_0x0047
            r0.f122915d = r3
            r4 = 1
            r0.f122913b = r4
            java.lang.Object r4 = r3.mo120340c(r0)
            if (r4 != r1) goto L_0x0046
            return r1
        L_0x0046:
            return r4
        L_0x0047:
            kotlin.Result$Failure r4 = (kotlin.Result.Failure) r4
            java.lang.Throwable r3 = r4.exception
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C48064al.m149036a(kotlinx.coroutines.al, kotlin.coroutines.b):java.lang.Object");
    }
}
