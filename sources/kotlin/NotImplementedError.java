package kotlin;

import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

public final class NotImplementedError extends Error {
    public NotImplementedError() {
        this(null, 1, null);
    }

    public NotImplementedError(String str) {
        C7573i.m23587b(str, "message");
        super(str);
    }

    public /* synthetic */ NotImplementedError(String str, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            str = "An operation is not implemented.";
        }
        this(str);
    }
}
