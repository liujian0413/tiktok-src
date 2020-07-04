package p346io.reactivex.exceptions;

import p346io.reactivex.internal.util.C47836e;

/* renamed from: io.reactivex.exceptions.a */
public final class C7331a {
    /* renamed from: a */
    public static RuntimeException m23008a(Throwable th) {
        throw C47836e.m148716a(th);
    }

    /* renamed from: b */
    public static void m23009b(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        } else if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        } else if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }
}
