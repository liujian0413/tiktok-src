package com.p280ss.android.push;

import com.C1642a;
import java.io.Serializable;

/* renamed from: com.ss.android.push.Triple */
public abstract class Triple<L, M, R> implements Serializable, Comparable<Triple<L, M, R>> {
    private static final long serialVersionUID = 1;

    public abstract L getLeft();

    public abstract M getMiddle();

    public abstract R getRight();

    public int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (getLeft() == null) {
            i = 0;
        } else {
            i = getLeft().hashCode();
        }
        if (getMiddle() == null) {
            i2 = 0;
        } else {
            i2 = getMiddle().hashCode();
        }
        int i4 = i ^ i2;
        if (getRight() != null) {
            i3 = getRight().hashCode();
        }
        return i4 ^ i3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(getLeft());
        sb.append(',');
        sb.append(getMiddle());
        sb.append(',');
        sb.append(getRight());
        sb.append(')');
        return sb.toString();
    }

    public String toString(String str) {
        return C1642a.m8034a(str, new Object[]{getLeft(), getMiddle(), getRight()});
    }

    public int compareTo(Triple<L, M, R> triple) {
        int compareTo = ((Comparable) getLeft()).compareTo(triple.getLeft());
        if (compareTo != 0) {
            return compareTo;
        }
        int compareTo2 = ((Comparable) getMiddle()).compareTo(triple.getMiddle());
        if (compareTo2 != 0) {
            return compareTo2;
        }
        return ((Comparable) getRight()).compareTo(triple.getRight());
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Triple)) {
            return false;
        }
        Triple triple = (Triple) obj;
        if (!equals(getLeft(), triple.getLeft()) || !equals(getMiddle(), triple.getMiddle()) || !equals(getRight(), triple.getRight())) {
            return false;
        }
        return true;
    }

    private boolean equals(Object obj, Object obj2) {
        if (obj == null || obj2 == null || (obj != obj2 && !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    /* renamed from: of */
    public static <L, M, R> Triple<L, M, R> m65931of(L l, M m, R r) {
        return new ImmutableTriple(l, m, r);
    }
}
