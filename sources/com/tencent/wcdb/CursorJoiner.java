package com.tencent.wcdb;

import java.util.Iterator;

public final class CursorJoiner implements Iterable<Result>, Iterator<Result> {

    /* renamed from: a */
    private C46432f f119438a;

    /* renamed from: b */
    private C46432f f119439b;

    /* renamed from: c */
    private boolean f119440c;

    /* renamed from: d */
    private Result f119441d;

    /* renamed from: e */
    private int[] f119442e;

    /* renamed from: f */
    private int[] f119443f;

    /* renamed from: g */
    private String[] f119444g;

    public enum Result {
        RIGHT,
        LEFT,
        BOTH
    }

    public final Iterator<Result> iterator() {
        return this;
    }

    public final void remove() {
        throw new UnsupportedOperationException("not implemented");
    }

    /* renamed from: b */
    private void m145727b() {
        if (this.f119440c) {
            switch (this.f119441d) {
                case BOTH:
                    this.f119438a.moveToNext();
                    this.f119439b.moveToNext();
                    break;
                case LEFT:
                    this.f119438a.moveToNext();
                    break;
                case RIGHT:
                    this.f119439b.moveToNext();
                    break;
            }
            this.f119440c = false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Result next() {
        if (hasNext()) {
            m145727b();
            boolean z = !this.f119438a.isAfterLast();
            boolean z2 = !this.f119439b.isAfterLast();
            if (z && z2) {
                m145726a(this.f119444g, this.f119438a, this.f119442e, 0);
                m145726a(this.f119444g, this.f119439b, this.f119443f, 1);
                switch (m145724a(this.f119444g)) {
                    case -1:
                        this.f119441d = Result.LEFT;
                        break;
                    case 0:
                        this.f119441d = Result.BOTH;
                        break;
                    case 1:
                        this.f119441d = Result.RIGHT;
                        break;
                }
            } else if (z) {
                this.f119441d = Result.LEFT;
            } else {
                this.f119441d = Result.RIGHT;
            }
            this.f119440c = true;
            return this.f119441d;
        }
        throw new IllegalStateException("you must only call next() when hasNext() is true");
    }

    public final boolean hasNext() {
        if (this.f119440c) {
            switch (this.f119441d) {
                case BOTH:
                    if (!this.f119438a.isLast() || !this.f119439b.isLast()) {
                        return true;
                    }
                    return false;
                case LEFT:
                    if (!this.f119438a.isLast() || !this.f119439b.isAfterLast()) {
                        return true;
                    }
                    return false;
                case RIGHT:
                    if (!this.f119438a.isAfterLast() || !this.f119439b.isLast()) {
                        return true;
                    }
                    return false;
                default:
                    StringBuilder sb = new StringBuilder("bad value for mCompareResult, ");
                    sb.append(this.f119441d);
                    throw new IllegalStateException(sb.toString());
            }
        } else if (!this.f119438a.isAfterLast() || !this.f119439b.isAfterLast()) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    private static int m145724a(String... strArr) {
        if (strArr.length % 2 == 0) {
            for (int i = 0; i < strArr.length; i += 2) {
                if (strArr[i] != null) {
                    int i2 = i + 1;
                    if (strArr[i2] == null) {
                        return 1;
                    }
                    int compareTo = strArr[i].compareTo(strArr[i2]);
                    if (compareTo != 0) {
                        if (compareTo < 0) {
                            return -1;
                        }
                        return 1;
                    }
                } else if (strArr[i + 1] != null) {
                    return -1;
                }
            }
            return 0;
        }
        throw new IllegalArgumentException("you must specify an even number of values");
    }

    /* renamed from: a */
    private static void m145726a(String[] strArr, C46432f fVar, int[] iArr, int i) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            strArr[(i2 * 2) + i] = fVar.getString(iArr[i2]);
        }
    }
}
