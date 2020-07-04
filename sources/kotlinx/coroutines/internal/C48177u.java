package kotlinx.coroutines.internal;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.concurrent.CancellationException;
import kotlin.C7579l;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.coroutines.C47919b;
import kotlin.coroutines.jvm.internal.C47953c;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;
import kotlinx.coroutines.C48059ag;

/* renamed from: kotlinx.coroutines.internal.u */
public final class C48177u {
    /* renamed from: a */
    private static final ArrayDeque<StackTraceElement> m149468a(C47953c cVar) {
        ArrayDeque<StackTraceElement> arrayDeque = new ArrayDeque<>();
        StackTraceElement stackTraceElement = cVar.getStackTraceElement();
        if (stackTraceElement != null) {
            arrayDeque.add(m149462a(stackTraceElement));
        }
        while (true) {
            if (!(cVar instanceof C47953c)) {
                cVar = null;
            }
            if (cVar == null) {
                break;
            }
            cVar = cVar.getCallerFrame();
            if (cVar == null) {
                break;
            }
            StackTraceElement stackTraceElement2 = cVar.getStackTraceElement();
            if (stackTraceElement2 != null) {
                arrayDeque.add(m149462a(stackTraceElement2));
            }
        }
        return arrayDeque;
    }

    /* renamed from: a */
    private static final boolean m149470a(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        return stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && C7573i.m23585a((Object) stackTraceElement.getMethodName(), (Object) stackTraceElement2.getMethodName()) && C7573i.m23585a((Object) stackTraceElement.getFileName(), (Object) stackTraceElement2.getFileName()) && C7573i.m23585a((Object) stackTraceElement.getClassName(), (Object) stackTraceElement2.getClassName());
    }

    /* renamed from: a */
    private static final void m149469a(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (m149471b(stackTraceElementArr[i])) {
                break;
            } else {
                i++;
            }
        }
        int i2 = i + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (length2 >= i2) {
            while (true) {
                StackTraceElement stackTraceElement = stackTraceElementArr[length2];
                Object last = arrayDeque.getLast();
                C7573i.m23582a(last, "result.last");
                if (m149470a(stackTraceElement, (StackTraceElement) last)) {
                    arrayDeque.removeLast();
                }
                arrayDeque.addFirst(stackTraceElementArr[length2]);
                if (length2 != i2) {
                    length2--;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    private static boolean m149471b(StackTraceElement stackTraceElement) {
        C7573i.m23587b(stackTraceElement, "receiver$0");
        String className = stackTraceElement.getClassName();
        C7573i.m23582a((Object) className, "className");
        return C7634n.m23721b(className, "\b\b\b", false);
    }

    /* renamed from: a */
    private static StackTraceElement m149463a(String str) {
        C7573i.m23587b(str, "message");
        StringBuilder sb = new StringBuilder("\b\b\b(");
        sb.append(str);
        return new StackTraceElement(sb.toString(), "\b", "\b", -1);
    }

    /* renamed from: b */
    public static final <E extends Throwable> boolean m149472b(E e) {
        if (!C48059ag.f122907b || !C48059ag.f122906a || (e instanceof CancellationException) || (e instanceof C48172p)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static StackTraceElement m149462a(StackTraceElement stackTraceElement) {
        C7573i.m23587b(stackTraceElement, "element");
        String className = stackTraceElement.getClassName();
        C7573i.m23582a((Object) className, "element.className");
        if (!C7634n.m23770b((CharSequence) className, '/', false)) {
            return stackTraceElement;
        }
        String className2 = stackTraceElement.getClassName();
        C7573i.m23582a((Object) className2, "element.className");
        return new StackTraceElement(C7634n.m23709a(className2, '/', '.', false), stackTraceElement.getMethodName(), stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }

    /* renamed from: c */
    private static final <E extends Throwable> Pair<E, StackTraceElement[]> m149473c(E e) {
        boolean z;
        Throwable cause = e.getCause();
        if (cause == null || !C7573i.m23585a((Object) cause.getClass(), (Object) e.getClass())) {
            return C7579l.m23633a(e, new StackTraceElement[0]);
        }
        StackTraceElement[] stackTrace = e.getStackTrace();
        C7573i.m23582a((Object) stackTrace, "currentTrace");
        int length = stackTrace.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            C7573i.m23582a((Object) stackTraceElement, "it");
            if (m149471b(stackTraceElement)) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            return C7579l.m23633a(cause, stackTrace);
        }
        return C7579l.m23633a(e, new StackTraceElement[0]);
    }

    /* renamed from: a */
    public static final <E extends Throwable> E m149464a(E e) {
        C7573i.m23587b(e, "exception");
        if (m149472b(e)) {
            return e;
        }
        Throwable cause = e.getCause();
        if (cause != null) {
            boolean z = true;
            if (!(!C7573i.m23585a((Object) cause.getClass(), (Object) e.getClass()))) {
                StackTraceElement[] stackTrace = e.getStackTrace();
                C7573i.m23582a((Object) stackTrace, "exception.stackTrace");
                int length = stackTrace.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z = false;
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i];
                    C7573i.m23582a((Object) stackTraceElement, "it");
                    if (m149471b(stackTraceElement)) {
                        break;
                    }
                    i++;
                }
                if (!z) {
                    return e;
                }
                E cause2 = e.getCause();
                if (!(cause2 instanceof Throwable)) {
                    cause2 = null;
                }
                if (cause2 != null) {
                    e = cause2;
                }
                return e;
            }
        }
        return e;
    }

    /* renamed from: a */
    private static final int m149461a(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i = 0; i < length; i++) {
            if (C7573i.m23585a((Object) str, (Object) stackTraceElementArr[i].getClassName())) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static final <E extends Throwable> E m149466a(E e, C47919b<?> bVar) {
        C7573i.m23587b(e, "exception");
        C7573i.m23587b(bVar, "continuation");
        if (m149472b(e) || !(bVar instanceof C47953c)) {
            return e;
        }
        return m149467a(e, (C47953c) bVar);
    }

    /* renamed from: a */
    public static final <E extends Throwable> E m149467a(E e, C47953c cVar) {
        Pair c = m149473c(e);
        E e2 = (Throwable) c.component1();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) c.component2();
        Throwable a = C48155g.m149404a(e2);
        if (a == null) {
            return e;
        }
        ArrayDeque a2 = m149468a(cVar);
        if (a2.isEmpty()) {
            return e;
        }
        if (e2 != e) {
            m149469a(stackTraceElementArr, a2);
        }
        return m149465a(e2, a, a2);
    }

    /* renamed from: a */
    private static final <E extends Throwable> E m149465a(E e, E e2, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(m149463a("Coroutine boundary"));
        StackTraceElement[] stackTrace = e.getStackTrace();
        C7573i.m23582a((Object) stackTrace, "causeTrace");
        int a = m149461a(stackTrace, "kotlin.coroutines.jvm.internal.BaseContinuationImpl");
        int i = 0;
        if (a == -1) {
            Collection collection = arrayDeque;
            if (collection != null) {
                Object[] array = collection.toArray(new StackTraceElement[0]);
                if (array != null) {
                    e2.setStackTrace((StackTraceElement[]) array);
                    return e2;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new TypeCastException("null cannot be cast to non-null type java.util.Collection<T>");
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[(arrayDeque.size() + a)];
        for (int i2 = 0; i2 < a; i2++) {
            stackTraceElementArr[i2] = stackTrace[i2];
        }
        for (StackTraceElement stackTraceElement : arrayDeque) {
            stackTraceElementArr[a + i] = stackTraceElement;
            i++;
        }
        e2.setStackTrace(stackTraceElementArr);
        return e2;
    }
}
