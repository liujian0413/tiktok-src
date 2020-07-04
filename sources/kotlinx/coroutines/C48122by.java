package kotlinx.coroutines;

import kotlin.C47965i;
import kotlin.Result;
import kotlin.coroutines.C47919b;
import kotlin.coroutines.C47924e;
import kotlin.coroutines.intrinsics.C47948a;
import kotlin.jvm.internal.C7573i;
import kotlinx.coroutines.internal.C48177u;
import kotlinx.coroutines.internal.C48180x;

/* renamed from: kotlinx.coroutines.by */
public final class C48122by {
    /* renamed from: a */
    public static final boolean m149233a(int i) {
        return i == 1;
    }

    /* renamed from: b */
    public static final boolean m149236b(int i) {
        return i == 0 || i == 1;
    }

    /* renamed from: a */
    public static final <T> void m149231a(C47919b<? super T> bVar, T t, int i) {
        C7573i.m23587b(bVar, "receiver$0");
        switch (i) {
            case 0:
                bVar.resumeWith(Result.m150902constructorimpl(t));
                return;
            case 1:
                C48078aq.m149060a(bVar, t);
                return;
            case 2:
                C48078aq.m149065b(bVar, t);
                return;
            case 3:
                C48076ao aoVar = (C48076ao) bVar;
                C47924e context = aoVar.getContext();
                Object a = C48180x.m149482a(context, aoVar.f122929b);
                try {
                    aoVar.f122931d.resumeWith(Result.m150902constructorimpl(t));
                    return;
                } finally {
                    C48180x.m149483b(context, a);
                }
            case 4:
                return;
            default:
                StringBuilder sb = new StringBuilder("Invalid mode ");
                sb.append(i);
                throw new IllegalStateException(sb.toString().toString());
        }
    }

    /* renamed from: b */
    public static final <T> void m149234b(C47919b<? super T> bVar, T t, int i) {
        C7573i.m23587b(bVar, "receiver$0");
        switch (i) {
            case 0:
                C47948a.m148878a(bVar).resumeWith(Result.m150902constructorimpl(t));
                return;
            case 1:
                C48078aq.m149060a(C47948a.m148878a(bVar), t);
                return;
            case 2:
                bVar.resumeWith(Result.m150902constructorimpl(t));
                return;
            case 3:
                C47924e context = bVar.getContext();
                Object a = C48180x.m149482a(context, null);
                try {
                    bVar.resumeWith(Result.m150902constructorimpl(t));
                    return;
                } finally {
                    C48180x.m149483b(context, a);
                }
            case 4:
                return;
            default:
                StringBuilder sb = new StringBuilder("Invalid mode ");
                sb.append(i);
                throw new IllegalStateException(sb.toString().toString());
        }
    }

    /* renamed from: a */
    public static final <T> void m149232a(C47919b<? super T> bVar, Throwable th, int i) {
        C7573i.m23587b(bVar, "receiver$0");
        C7573i.m23587b(th, "exception");
        switch (i) {
            case 0:
                bVar.resumeWith(Result.m150902constructorimpl(C47965i.m148906a(th)));
                return;
            case 1:
                C48078aq.m149061a(bVar, th);
                return;
            case 2:
                C48078aq.m149066b(bVar, th);
                return;
            case 3:
                C48076ao aoVar = (C48076ao) bVar;
                C47924e context = aoVar.getContext();
                Object a = C48180x.m149482a(context, aoVar.f122929b);
                try {
                    C47919b<T> bVar2 = aoVar.f122931d;
                    bVar2.resumeWith(Result.m150902constructorimpl(C47965i.m148906a(C48177u.m149466a(th, bVar2))));
                    return;
                } finally {
                    C48180x.m149483b(context, a);
                }
            case 4:
                return;
            default:
                StringBuilder sb = new StringBuilder("Invalid mode ");
                sb.append(i);
                throw new IllegalStateException(sb.toString().toString());
        }
    }

    /* renamed from: b */
    public static final <T> void m149235b(C47919b<? super T> bVar, Throwable th, int i) {
        C7573i.m23587b(bVar, "receiver$0");
        C7573i.m23587b(th, "exception");
        switch (i) {
            case 0:
                C47948a.m148878a(bVar).resumeWith(Result.m150902constructorimpl(C47965i.m148906a(th)));
                return;
            case 1:
                C48078aq.m149061a(C47948a.m148878a(bVar), th);
                return;
            case 2:
                bVar.resumeWith(Result.m150902constructorimpl(C47965i.m148906a(th)));
                return;
            case 3:
                C47924e context = bVar.getContext();
                Object a = C48180x.m149482a(context, null);
                try {
                    bVar.resumeWith(Result.m150902constructorimpl(C47965i.m148906a(th)));
                    return;
                } finally {
                    C48180x.m149483b(context, a);
                }
            case 4:
                return;
            default:
                StringBuilder sb = new StringBuilder("Invalid mode ");
                sb.append(i);
                throw new IllegalStateException(sb.toString().toString());
        }
    }
}
