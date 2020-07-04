package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.fx */
final class C16542fx extends C16544fz {

    /* renamed from: a */
    private int f46330a;

    /* renamed from: b */
    private final int f46331b = this.f46332c.size();

    /* renamed from: c */
    private final /* synthetic */ zzte f46332c;

    C16542fx(zzte zzte) {
        this.f46332c = zzte;
    }

    public final boolean hasNext() {
        return this.f46330a < this.f46331b;
    }

    /* renamed from: a */
    public final byte mo42753a() {
        int i = this.f46330a;
        if (i < this.f46331b) {
            this.f46330a = i + 1;
            return this.f46332c.zzan(i);
        }
        throw new NoSuchElementException();
    }
}
