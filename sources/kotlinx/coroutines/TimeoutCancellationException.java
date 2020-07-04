package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.C7573i;

public final class TimeoutCancellationException extends CancellationException {
    public final C48100bi coroutine;

    public TimeoutCancellationException(String str) {
        C7573i.m23587b(str, "message");
        this(str, null);
    }

    public TimeoutCancellationException(String str, C48100bi biVar) {
        C7573i.m23587b(str, "message");
        super(str);
        this.coroutine = biVar;
    }
}
