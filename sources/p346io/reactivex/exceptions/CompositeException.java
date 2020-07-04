package p346io.reactivex.exceptions;

import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: io.reactivex.exceptions.CompositeException */
public final class CompositeException extends RuntimeException {
    private static final long serialVersionUID = 3026362227162912146L;
    private Throwable cause;
    private final List<Throwable> exceptions;
    private final String message;

    /* renamed from: io.reactivex.exceptions.CompositeException$a */
    static final class C47575a extends RuntimeException {
        private static final long serialVersionUID = 3875212506787802066L;

        C47575a() {
        }

        public final String getMessage() {
            return "Chain of Causes for CompositeException In Order Received =>";
        }
    }

    /* renamed from: io.reactivex.exceptions.CompositeException$b */
    static abstract class C47576b {
        C47576b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo119675a(Object obj);
    }

    /* renamed from: io.reactivex.exceptions.CompositeException$c */
    static final class C47577c extends C47576b {

        /* renamed from: a */
        private final PrintStream f122016a;

        C47577c(PrintStream printStream) {
            this.f122016a = printStream;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo119675a(Object obj) {
            this.f122016a.println(obj);
        }
    }

    /* renamed from: io.reactivex.exceptions.CompositeException$d */
    static final class C47578d extends C47576b {

        /* renamed from: a */
        private final PrintWriter f122017a;

        C47578d(PrintWriter printWriter) {
            this.f122017a = printWriter;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo119675a(Object obj) {
            this.f122017a.println(obj);
        }
    }

    public final List<Throwable> getExceptions() {
        return this.exceptions;
    }

    public final String getMessage() {
        return this.message;
    }

    public final void printStackTrace() {
        C6497a.m20179a((Throwable) this, System.err);
    }

    public final int size() {
        return this.exceptions.size();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:9|(4:12|(2:14|32)(2:15|33)|31|10)|16|17|18|19|30) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0054 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.Throwable getCause() {
        /*
            r8 = this;
            monitor-enter(r8)
            java.lang.Throwable r0 = r8.cause     // Catch:{ all -> 0x005f }
            if (r0 != 0) goto L_0x005b
            io.reactivex.exceptions.CompositeException$a r0 = new io.reactivex.exceptions.CompositeException$a     // Catch:{ all -> 0x005f }
            r0.<init>()     // Catch:{ all -> 0x005f }
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x005f }
            r1.<init>()     // Catch:{ all -> 0x005f }
            java.util.List<java.lang.Throwable> r2 = r8.exceptions     // Catch:{ all -> 0x005f }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x005f }
            r3 = r0
        L_0x0016:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x005f }
            if (r4 == 0) goto L_0x0059
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x005f }
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch:{ all -> 0x005f }
            boolean r5 = r1.contains(r4)     // Catch:{ all -> 0x005f }
            if (r5 != 0) goto L_0x0016
            r1.add(r4)     // Catch:{ all -> 0x005f }
            java.util.List r5 = r8.getListOfCauses(r4)     // Catch:{ all -> 0x005f }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x005f }
        L_0x0033:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x005f }
            if (r6 == 0) goto L_0x0051
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x005f }
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch:{ all -> 0x005f }
            boolean r7 = r1.contains(r6)     // Catch:{ all -> 0x005f }
            if (r7 == 0) goto L_0x004d
            java.lang.RuntimeException r4 = new java.lang.RuntimeException     // Catch:{ all -> 0x005f }
            java.lang.String r6 = "Duplicate found in causal chain so cropping to prevent loop ..."
            r4.<init>(r6)     // Catch:{ all -> 0x005f }
            goto L_0x0033
        L_0x004d:
            r1.add(r6)     // Catch:{ all -> 0x005f }
            goto L_0x0033
        L_0x0051:
            r3.initCause(r4)     // Catch:{ Throwable -> 0x0054 }
        L_0x0054:
            java.lang.Throwable r3 = r8.getRootCause(r3)     // Catch:{ all -> 0x005f }
            goto L_0x0016
        L_0x0059:
            r8.cause = r0     // Catch:{ all -> 0x005f }
        L_0x005b:
            java.lang.Throwable r0 = r8.cause     // Catch:{ all -> 0x005f }
            monitor-exit(r8)
            return r0
        L_0x005f:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p346io.reactivex.exceptions.CompositeException.getCause():java.lang.Throwable");
    }

    public final void printStackTrace(PrintStream printStream) {
        printStackTrace((C47576b) new C47577c(printStream));
    }

    public CompositeException(Throwable... thArr) {
        List list;
        if (thArr == null) {
            list = Collections.singletonList(new NullPointerException("exceptions was null"));
        } else {
            list = Arrays.asList(thArr);
        }
        this((Iterable<? extends Throwable>) list);
    }

    private List<Throwable> getListOfCauses(Throwable th) {
        ArrayList arrayList = new ArrayList();
        Throwable cause2 = th.getCause();
        if (cause2 == null || cause2 == th) {
            return arrayList;
        }
        while (true) {
            arrayList.add(cause2);
            Throwable cause3 = cause2.getCause();
            if (cause3 == null || cause3 == cause2) {
                return arrayList;
            }
            cause2 = cause3;
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    public final Throwable getRootCause(Throwable th) {
        Throwable cause2 = th.getCause();
        if (cause2 == null || this.cause == cause2) {
            return th;
        }
        while (true) {
            Throwable cause3 = cause2.getCause();
            if (cause3 == null || cause3 == cause2) {
                return cause2;
            }
            cause2 = cause3;
        }
        return cause2;
    }

    public final void printStackTrace(PrintWriter printWriter) {
        printStackTrace((C47576b) new C47578d(printWriter));
    }

    public CompositeException(Iterable<? extends Throwable> iterable) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (iterable != null) {
            for (Throwable th : iterable) {
                if (th instanceof CompositeException) {
                    linkedHashSet.addAll(((CompositeException) th).getExceptions());
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            arrayList.addAll(linkedHashSet);
            this.exceptions = Collections.unmodifiableList(arrayList);
            StringBuilder sb = new StringBuilder();
            sb.append(this.exceptions.size());
            sb.append(" exceptions occurred. ");
            this.message = sb.toString();
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }

    private void printStackTrace(C47576b bVar) {
        StackTraceElement[] stackTrace;
        StringBuilder sb = new StringBuilder(PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
        sb.append(this);
        sb.append(10);
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb.append("\tat ");
            sb.append(stackTraceElement);
            sb.append(10);
        }
        int i = 1;
        for (Throwable th : this.exceptions) {
            sb.append("  ComposedException ");
            sb.append(i);
            sb.append(" :\n");
            appendStackTrace(sb, th, "\t");
            i++;
        }
        bVar.mo119675a(sb.toString());
    }

    private void appendStackTrace(StringBuilder sb, Throwable th, String str) {
        StackTraceElement[] stackTrace;
        while (true) {
            sb.append(str);
            sb.append(th);
            sb.append(10);
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                sb.append("\t\tat ");
                sb.append(stackTraceElement);
                sb.append(10);
            }
            if (th.getCause() != null) {
                sb.append("\tCaused by: ");
                th = th.getCause();
                str = "";
            } else {
                return;
            }
        }
    }
}
