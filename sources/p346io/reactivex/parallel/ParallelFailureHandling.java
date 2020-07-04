package p346io.reactivex.parallel;

import p346io.reactivex.p348d.C7324c;

/* renamed from: io.reactivex.parallel.ParallelFailureHandling */
public enum ParallelFailureHandling implements C7324c<Long, Throwable, ParallelFailureHandling> {
    STOP,
    ERROR,
    SKIP,
    RETRY;

    public final ParallelFailureHandling apply(Long l, Throwable th) {
        return this;
    }
}
