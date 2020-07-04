package kotlin.sequences;

import java.util.Iterator;
import kotlin.collections.C7519g;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;

/* renamed from: kotlin.sequences.k */
public class C7608k extends C7607j {

    /* renamed from: kotlin.sequences.k$a */
    public static final class C7609a implements C7604g<T> {

        /* renamed from: a */
        final /* synthetic */ Iterator f20899a;

        /* renamed from: a */
        public final Iterator<T> mo19416a() {
            return this.f20899a;
        }

        public C7609a(Iterator it) {
            this.f20899a = it;
        }
    }

    /* renamed from: kotlin.sequences.k$b */
    static final class C7610b extends Lambda implements C7562b<C7604g<? extends T>, Iterator<? extends T>> {

        /* renamed from: a */
        public static final C7610b f20900a = new C7610b();

        C7610b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m23645a((C7604g) obj);
        }

        /* renamed from: a */
        private static Iterator<T> m23645a(C7604g<? extends T> gVar) {
            C7573i.m23587b(gVar, "it");
            return gVar.mo19416a();
        }
    }

    /* renamed from: kotlin.sequences.k$c */
    static final class C7611c extends Lambda implements C7562b<T, T> {

        /* renamed from: a */
        public static final C7611c f20901a = new C7611c();

        C7611c() {
            super(1);
        }

        public final T invoke(T t) {
            return t;
        }
    }

    /* renamed from: kotlin.sequences.k$d */
    static final class C7612d extends Lambda implements C7562b<T, T> {

        /* renamed from: a */
        final /* synthetic */ C7561a f20902a;

        C7612d(C7561a aVar) {
            this.f20902a = aVar;
            super(1);
        }

        public final T invoke(T t) {
            C7573i.m23587b(t, "it");
            return this.f20902a.invoke();
        }
    }

    /* renamed from: kotlin.sequences.k$e */
    static final class C7613e extends Lambda implements C7561a<T> {

        /* renamed from: a */
        final /* synthetic */ Object f20903a;

        C7613e(Object obj) {
            this.f20903a = obj;
            super(0);
        }

        public final T invoke() {
            return this.f20903a;
        }
    }

    /* renamed from: a */
    public static final <T> C7604g<T> m23635a() {
        return C48023c.f122848a;
    }

    /* renamed from: a */
    public static final <T> C7604g<T> m23640a(C7604g<? extends C7604g<? extends T>> gVar) {
        C7573i.m23587b(gVar, "$this$flatten");
        return m23641a(gVar, (C7562b<? super T, ? extends Iterator<? extends R>>) C7610b.f20900a);
    }

    /* renamed from: b */
    public static final <T> C7604g<T> m23643b(C7604g<? extends T> gVar) {
        C7573i.m23587b(gVar, "$this$constrainOnce");
        if (gVar instanceof C48021a) {
            return gVar;
        }
        return new C48021a<>(gVar);
    }

    /* renamed from: a */
    public static final <T> C7604g<T> m23637a(Iterator<? extends T> it) {
        C7573i.m23587b(it, "$this$asSequence");
        return C7605h.m23643b(new C7609a(it));
    }

    /* renamed from: a */
    public static final <T> C7604g<T> m23638a(C7561a<? extends T> aVar) {
        C7573i.m23587b(aVar, "nextFunction");
        return C7605h.m23643b(new C48028f(aVar, new C7612d(aVar)));
    }

    /* renamed from: a */
    public static final <T> C7604g<T> m23642a(T... tArr) {
        boolean z;
        C7573i.m23587b(tArr, "elements");
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return C7605h.m23635a();
        }
        return C7519g.m23455i(tArr);
    }

    /* renamed from: a */
    public static final <T> C7604g<T> m23636a(T t, C7562b<? super T, ? extends T> bVar) {
        C7573i.m23587b(bVar, "nextFunction");
        return new C48028f<>(new C7613e(t), bVar);
    }

    /* renamed from: a */
    public static final <T> C7604g<T> m23639a(C7561a<? extends T> aVar, C7562b<? super T, ? extends T> bVar) {
        C7573i.m23587b(aVar, "seedFunction");
        C7573i.m23587b(bVar, "nextFunction");
        return new C48028f<>(aVar, bVar);
    }

    /* renamed from: a */
    private static final <T, R> C7604g<R> m23641a(C7604g<? extends T> gVar, C7562b<? super T, ? extends Iterator<? extends R>> bVar) {
        if (gVar instanceof C48032o) {
            return ((C48032o) gVar).mo120226a(bVar);
        }
        return new C48026e<>(gVar, C7611c.f20901a, bVar);
    }
}
