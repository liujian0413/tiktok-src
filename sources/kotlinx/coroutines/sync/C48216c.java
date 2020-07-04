package kotlinx.coroutines.sync;

import kotlin.Result.Failure;
import kotlin.coroutines.C47919b;
import kotlin.coroutines.intrinsics.C47948a;
import kotlin.jvm.p357a.C7561a;
import kotlinx.coroutines.internal.C48178v;

/* renamed from: kotlinx.coroutines.sync.c */
public final class C48216c {

    /* renamed from: a */
    public static final C48178v f123116a = new C48178v("LOCK_FAIL");

    /* renamed from: b */
    public static final C48178v f123117b = new C48178v("ENQUEUE_FAIL");

    /* renamed from: c */
    public static final C48178v f123118c = new C48178v("UNLOCK_FAIL");

    /* renamed from: d */
    public static final C48178v f123119d = new C48178v("SELECT_SUCCESS");

    /* renamed from: e */
    public static final C48178v f123120e = new C48178v("LOCKED");

    /* renamed from: f */
    public static final C48178v f123121f = new C48178v("UNLOCKED");

    /* renamed from: g */
    public static final C48214a f123122g = new C48214a(f123120e);

    /* renamed from: h */
    public static final C48214a f123123h = new C48214a(f123121f);

    /* renamed from: a */
    public static final <T> Object m149603a(C48215b bVar, Object obj, C7561a<? extends T> aVar, C47919b<? super T> bVar2) {
        MutexKt$withLock$1 mutexKt$withLock$1 = (MutexKt$withLock$1) bVar2;
        if ((mutexKt$withLock$1.label & Integer.MIN_VALUE) != 0) {
            mutexKt$withLock$1.label -= Integer.MIN_VALUE;
        } else {
            mutexKt$withLock$1 = new MutexKt$withLock$1(bVar2);
        }
        Object obj2 = mutexKt$withLock$1.result;
        Object a = C47948a.m148881a();
        switch (mutexKt$withLock$1.label) {
            case 0:
                if (!(obj2 instanceof Failure)) {
                    C48215b bVar3 = null;
                    mutexKt$withLock$1.L$0 = bVar3;
                    mutexKt$withLock$1.L$1 = bVar3;
                    mutexKt$withLock$1.L$2 = bVar3;
                    mutexKt$withLock$1.label = 1;
                    if (bVar3.mo120453a(bVar3, mutexKt$withLock$1) == a) {
                        return a;
                    }
                } else {
                    throw ((Failure) obj2).exception;
                }
                break;
            case 1:
                aVar = (C7561a) mutexKt$withLock$1.L$2;
                if (obj2 instanceof Failure) {
                    throw ((Failure) obj2).exception;
                }
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return aVar.invoke();
    }
}
