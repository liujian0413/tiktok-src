package org.aspectj.lang;

import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import java.io.PrintStream;
import java.io.PrintWriter;

public class SoftException extends RuntimeException {
    private static final boolean HAVE_JAVA_14;
    Throwable inner;

    public Throwable getCause() {
        return this.inner;
    }

    public Throwable getWrappedThrowable() {
        return this.inner;
    }

    public void printStackTrace() {
        C6497a.m20179a((Throwable) this, System.err);
    }

    static {
        boolean z;
        try {
            Class.forName("java.nio.Buffer");
            z = true;
        } catch (Throwable unused) {
            z = false;
        }
        HAVE_JAVA_14 = z;
    }

    public SoftException(Throwable th) {
        this.inner = th;
    }

    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        Throwable th = this.inner;
        if (!HAVE_JAVA_14 && th != null) {
            printStream.print("Caused by: ");
            C6497a.m20179a(th, printStream);
        }
    }

    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        Throwable th = this.inner;
        if (!HAVE_JAVA_14 && th != null) {
            printWriter.print("Caused by: ");
            C6497a.m20180a(th, printWriter);
        }
    }
}
