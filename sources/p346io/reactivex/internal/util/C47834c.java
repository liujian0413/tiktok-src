package p346io.reactivex.internal.util;

import p346io.reactivex.internal.schedulers.C47813j;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.util.c */
public final class C47834c {
    /* renamed from: a */
    public static void m148711a() {
        if (!C7332a.m23030a()) {
            return;
        }
        if ((Thread.currentThread() instanceof C47813j) || C7332a.m23038c()) {
            StringBuilder sb = new StringBuilder("Attempt to block on a Scheduler ");
            sb.append(Thread.currentThread().getName());
            sb.append(" that doesn't support blocking operators as they may lead to deadlock");
            throw new IllegalStateException(sb.toString());
        }
    }
}
