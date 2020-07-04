package okio;

import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;

final class Segment {
    final byte[] data;
    int limit;
    Segment next;
    boolean owner;
    int pos;
    Segment prev;
    boolean shared;

    Segment() {
        this.data = new byte[VideoCacheReadBuffersizeExperiment.DEFAULT];
        this.owner = true;
    }

    public final Segment pop() {
        Segment segment;
        if (this.next != this) {
            segment = this.next;
        } else {
            segment = null;
        }
        this.prev.next = this.next;
        this.next.prev = this.prev;
        this.next = null;
        this.prev = null;
        return segment;
    }

    /* access modifiers changed from: 0000 */
    public final Segment sharedCopy() {
        this.shared = true;
        Segment segment = new Segment(this.data, this.pos, this.limit, true, false);
        return segment;
    }

    /* access modifiers changed from: 0000 */
    public final Segment unsharedCopy() {
        Segment segment = new Segment((byte[]) this.data.clone(), this.pos, this.limit, false, true);
        return segment;
    }

    public final void compact() {
        int i;
        if (this.prev == this) {
            throw new IllegalStateException();
        } else if (this.prev.owner) {
            int i2 = this.limit - this.pos;
            int i3 = 8192 - this.prev.limit;
            if (this.prev.shared) {
                i = 0;
            } else {
                i = this.prev.pos;
            }
            if (i2 <= i3 + i) {
                writeTo(this.prev, i2);
                pop();
                SegmentPool.recycle(this);
            }
        }
    }

    public final Segment push(Segment segment) {
        segment.prev = this;
        segment.next = this.next;
        this.next.prev = segment;
        this.next = segment;
        return segment;
    }

    public final Segment split(int i) {
        Segment segment;
        if (i <= 0 || i > this.limit - this.pos) {
            throw new IllegalArgumentException();
        }
        if (i >= 1024) {
            segment = sharedCopy();
        } else {
            segment = SegmentPool.take();
            System.arraycopy(this.data, this.pos, segment.data, 0, i);
        }
        segment.limit = segment.pos + i;
        this.pos += i;
        this.prev.push(segment);
        return segment;
    }

    public final void writeTo(Segment segment, int i) {
        if (segment.owner) {
            if (segment.limit + i > 8192) {
                if (segment.shared) {
                    throw new IllegalArgumentException();
                } else if ((segment.limit + i) - segment.pos <= 8192) {
                    System.arraycopy(segment.data, segment.pos, segment.data, 0, segment.limit - segment.pos);
                    segment.limit -= segment.pos;
                    segment.pos = 0;
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.data, this.pos, segment.data, segment.limit, i);
            segment.limit += i;
            this.pos += i;
            return;
        }
        throw new IllegalArgumentException();
    }

    Segment(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.data = bArr;
        this.pos = i;
        this.limit = i2;
        this.shared = z;
        this.owner = z2;
    }
}
