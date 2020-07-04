package com.p280ss.android.ugc.aweme.p313im.sdk.chat.model;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.Range */
public final class Range {
    private int from;

    /* renamed from: to */
    private int f80996to;

    public final int getFrom() {
        return this.from;
    }

    public final int getTo() {
        return this.f80996to;
    }

    public final int hashCode() {
        return (this.from * 31) + this.f80996to;
    }

    public final void setFrom(int i) {
        this.from = i;
    }

    public final void setTo(int i) {
        this.f80996to = i;
    }

    public final int getAnchorPosition(int i) {
        if ((i - this.from) - (this.f80996to - i) >= 0) {
            return this.f80996to;
        }
        return this.from;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Range)) {
            return false;
        }
        Range range = (Range) obj;
        if (this.from == range.from && this.f80996to == range.f80996to) {
            return true;
        }
        return false;
    }

    public Range(int i, int i2) {
        this.from = i;
        this.f80996to = i2;
    }

    public final boolean contains(int i, int i2) {
        if (this.from > i || this.f80996to < i2) {
            return false;
        }
        return true;
    }

    public final boolean isEqual(int i, int i2) {
        if ((this.from == i && this.f80996to == i2) || (this.from == i2 && this.f80996to == i)) {
            return true;
        }
        return false;
    }

    public final boolean isWrappedBy(int i, int i2) {
        int i3 = this.from + 1;
        int i4 = this.f80996to;
        if (i3 > i || i4 <= i) {
            int i5 = this.from + 1;
            int i6 = this.f80996to;
            if (i5 > i2 || i6 <= i2) {
                return false;
            }
        }
        return true;
    }
}
