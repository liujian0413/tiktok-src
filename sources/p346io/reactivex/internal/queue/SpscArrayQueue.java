package p346io.reactivex.internal.queue;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p346io.reactivex.internal.p353b.C47603h;
import p346io.reactivex.internal.util.C47841i;

/* renamed from: io.reactivex.internal.queue.SpscArrayQueue */
public final class SpscArrayQueue<E> extends AtomicReferenceArray<E> implements C47603h<E> {
    private static final Integer MAX_LOOK_AHEAD_STEP = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    private static final long serialVersionUID = -1296597691183856449L;
    final AtomicLong consumerIndex = new AtomicLong();
    final int lookAheadStep;
    final int mask = (length() - 1);
    final AtomicLong producerIndex = new AtomicLong();
    long producerLookAhead;

    /* access modifiers changed from: 0000 */
    public final int calcElementOffset(long j, int i) {
        return ((int) j) & i;
    }

    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public final boolean isEmpty() {
        if (this.producerIndex.get() == this.consumerIndex.get()) {
            return true;
        }
        return false;
    }

    public final E poll() {
        long j = this.consumerIndex.get();
        int calcElementOffset = calcElementOffset(j);
        E lvElement = lvElement(calcElementOffset);
        if (lvElement == null) {
            return null;
        }
        soConsumerIndex(j + 1);
        soElement(calcElementOffset, null);
        return lvElement;
    }

    /* access modifiers changed from: 0000 */
    public final int calcElementOffset(long j) {
        return ((int) j) & this.mask;
    }

    /* access modifiers changed from: 0000 */
    public final E lvElement(int i) {
        return get(i);
    }

    /* access modifiers changed from: 0000 */
    public final void soConsumerIndex(long j) {
        this.consumerIndex.lazySet(j);
    }

    /* access modifiers changed from: 0000 */
    public final void soProducerIndex(long j) {
        this.producerIndex.lazySet(j);
    }

    public SpscArrayQueue(int i) {
        super(C47841i.m148736a(i));
        this.lookAheadStep = Math.min(i / 4, MAX_LOOK_AHEAD_STEP.intValue());
    }

    public final boolean offer(E e) {
        if (e != null) {
            int i = this.mask;
            long j = this.producerIndex.get();
            int calcElementOffset = calcElementOffset(j, i);
            if (j >= this.producerLookAhead) {
                long j2 = ((long) this.lookAheadStep) + j;
                if (lvElement(calcElementOffset(j2, i)) == null) {
                    this.producerLookAhead = j2;
                } else if (lvElement(calcElementOffset) != null) {
                    return false;
                }
            }
            soElement(calcElementOffset, e);
            soProducerIndex(j + 1);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    /* access modifiers changed from: 0000 */
    public final void soElement(int i, E e) {
        lazySet(i, e);
    }

    public final boolean offer(E e, E e2) {
        if (!offer(e) || !offer(e2)) {
            return false;
        }
        return true;
    }
}
