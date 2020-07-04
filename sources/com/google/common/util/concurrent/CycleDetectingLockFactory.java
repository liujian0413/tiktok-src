package com.google.common.util.concurrent;

import com.google.common.collect.C17795bu;
import com.google.common.collect.C17800bv;
import com.google.common.collect.ImmutableSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

public class CycleDetectingLockFactory {

    /* renamed from: a */
    public static final Logger f49583a = Logger.getLogger(CycleDetectingLockFactory.class.getName());

    /* renamed from: b */
    private static final ConcurrentMap<Class<? extends Enum>, Map<? extends Enum, C18214b>> f49584b = new C17800bv().mo46020d().mo46023g();

    /* renamed from: c */
    private static final ThreadLocal<ArrayList<C18214b>> f49585c = new ThreadLocal<ArrayList<C18214b>>() {
        /* renamed from: a */
        private static ArrayList<C18214b> m60142a() {
            return C17795bu.m59143a(3);
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object initialValue() {
            return m60142a();
        }
    };

    public enum Policies {
        THROW {
        },
        WARN {
        },
        DISABLED {
        }
    }

    public static final class PotentialDeadlockException extends C18213a {
        private final C18213a conflictingStackTrace;

        public final C18213a getConflictingStackTrace() {
            return this.conflictingStackTrace;
        }

        public final String getMessage() {
            StringBuilder sb = new StringBuilder(super.getMessage());
            for (Throwable th = this.conflictingStackTrace; th != null; th = th.getCause()) {
                sb.append(", ");
                sb.append(th.getMessage());
            }
            return sb.toString();
        }

        private PotentialDeadlockException(C18214b bVar, C18214b bVar2, C18213a aVar) {
            super(bVar, bVar2);
            this.conflictingStackTrace = aVar;
            initCause(aVar);
        }
    }

    /* renamed from: com.google.common.util.concurrent.CycleDetectingLockFactory$a */
    static class C18213a extends IllegalStateException {
        static final StackTraceElement[] EMPTY_STACK_TRACE = new StackTraceElement[0];
        static final ImmutableSet<String> EXCLUDED_CLASS_NAMES = ImmutableSet.m58652of(CycleDetectingLockFactory.class.getName(), C18213a.class.getName(), C18214b.class.getName());

        C18213a(C18214b bVar, C18214b bVar2) {
            StringBuilder sb = new StringBuilder();
            sb.append(bVar.f49586a);
            sb.append(" -> ");
            sb.append(bVar2.f49586a);
            super(sb.toString());
            StackTraceElement[] stackTrace = getStackTrace();
            int length = stackTrace.length;
            int i = 0;
            while (i < length) {
                if (C18215c.class.getName().equals(stackTrace[i].getClassName())) {
                    setStackTrace(EMPTY_STACK_TRACE);
                    return;
                } else if (!EXCLUDED_CLASS_NAMES.contains(stackTrace[i].getClassName())) {
                    setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i, length));
                    return;
                } else {
                    i++;
                }
            }
        }
    }

    /* renamed from: com.google.common.util.concurrent.CycleDetectingLockFactory$b */
    static class C18214b {

        /* renamed from: a */
        public final String f49586a;
    }

    /* renamed from: com.google.common.util.concurrent.CycleDetectingLockFactory$c */
    public static final class C18215c<E extends Enum<E>> extends CycleDetectingLockFactory {
    }
}
