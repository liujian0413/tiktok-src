package kotlinx.coroutines;

import kotlin.jvm.internal.C7573i;

public final class CompletionHandlerException extends RuntimeException {
    public CompletionHandlerException(String str, Throwable th) {
        C7573i.m23587b(str, "message");
        C7573i.m23587b(th, "cause");
        super(str, th);
    }
}
