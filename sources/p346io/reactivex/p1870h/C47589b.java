package p346io.reactivex.p1870h;

import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;
import p346io.reactivex.p348d.C7327h;

/* renamed from: io.reactivex.h.b */
public final class C47589b {

    /* renamed from: io.reactivex.h.b$a */
    static final class C47590a<T, R> implements C7327h<T, Iterable<? extends U>> {

        /* renamed from: a */
        public static final C47590a f122040a = new C47590a();

        C47590a() {
        }

        /* renamed from: a */
        private static Iterable<T> m148386a(Iterable<? extends T> iterable) {
            C7573i.m23587b(iterable, "it");
            return iterable;
        }

        public final /* synthetic */ Object apply(Object obj) {
            return m148386a((Iterable) obj);
        }
    }

    /* renamed from: a */
    public static final <T> C7492s<T> m148385a(C7492s<? extends Iterable<? extends T>> sVar) {
        C7573i.m23587b(sVar, "$receiver");
        C7492s<T> b = sVar.mo19300b((C7327h<? super T, ? extends Iterable<? extends U>>) C47590a.f122040a);
        C7573i.m23582a((Object) b, "flatMapIterable { it }");
        return b;
    }
}
