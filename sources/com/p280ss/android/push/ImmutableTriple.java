package com.p280ss.android.push;

/* renamed from: com.ss.android.push.ImmutableTriple */
public final class ImmutableTriple<L, M, R> extends Triple<L, M, R> {
    private static final long serialVersionUID = 1;
    public final L left;
    public final M middle;
    public final R right;

    public final L getLeft() {
        return this.left;
    }

    public final M getMiddle() {
        return this.middle;
    }

    public final R getRight() {
        return this.right;
    }

    /* renamed from: of */
    public static <L, M, R> ImmutableTriple<L, M, R> m65930of(L l, M m, R r) {
        return new ImmutableTriple<>(l, m, r);
    }

    public ImmutableTriple(L l, M m, R r) {
        this.left = l;
        this.middle = m;
        this.right = r;
    }
}
