package shark;

import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.jvm.internal.C7573i;

public final class HeapAnalysisException extends RuntimeException {
    public final String toString() {
        StringWriter stringWriter = new StringWriter();
        Throwable cause = getCause();
        if (cause == null) {
            C7573i.m23580a();
        }
        C6497a.m20180a(cause, new PrintWriter(stringWriter));
        StringBuilder sb = new StringBuilder("\n");
        sb.append(stringWriter);
        sb.append(10);
        return sb.toString();
    }

    public HeapAnalysisException(Throwable th) {
        C7573i.m23587b(th, "cause");
        super(th);
    }
}
