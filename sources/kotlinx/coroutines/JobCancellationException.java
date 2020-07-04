package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.C7573i;

public final class JobCancellationException extends CancellationException {
    public final C48100bi job;

    public final Throwable fillInStackTrace() {
        if (!C48059ag.f122906a) {
            return this;
        }
        Throwable fillInStackTrace = super.fillInStackTrace();
        C7573i.m23582a((Object) fillInStackTrace, "super.fillInStackTrace()");
        return fillInStackTrace;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; job=");
        sb.append(this.job);
        return sb.toString();
    }

    public final int hashCode() {
        int i;
        String message = getMessage();
        if (message == null) {
            C7573i.m23580a();
        }
        int hashCode = ((message.hashCode() * 31) + this.job.hashCode()) * 31;
        Throwable cause = getCause();
        if (cause != null) {
            i = cause.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r3.getCause(), (java.lang.Object) getCause()) != false) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = r2
            kotlinx.coroutines.JobCancellationException r0 = (kotlinx.coroutines.JobCancellationException) r0
            if (r3 == r0) goto L_0x0034
            boolean r0 = r3 instanceof kotlinx.coroutines.JobCancellationException
            if (r0 == 0) goto L_0x0032
            kotlinx.coroutines.JobCancellationException r3 = (kotlinx.coroutines.JobCancellationException) r3
            java.lang.String r0 = r3.getMessage()
            java.lang.String r1 = r2.getMessage()
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0032
            kotlinx.coroutines.bi r0 = r3.job
            kotlinx.coroutines.bi r1 = r2.job
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0032
            java.lang.Throwable r3 = r3.getCause()
            java.lang.Throwable r0 = r2.getCause()
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r3, r0)
            if (r3 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r3 = 0
            return r3
        L_0x0034:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobCancellationException.equals(java.lang.Object):boolean");
    }

    public JobCancellationException(String str, Throwable th, C48100bi biVar) {
        C7573i.m23587b(str, "message");
        C7573i.m23587b(biVar, "job");
        super(str);
        this.job = biVar;
        if (th != null) {
            initCause(th);
        }
    }
}
