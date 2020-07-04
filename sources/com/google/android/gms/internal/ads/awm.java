package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

final class awm extends awo {

    /* renamed from: a */
    private int f41135a;

    /* renamed from: b */
    private final int f41136b = this.f41137c.size();

    /* renamed from: c */
    private final /* synthetic */ zzcce f41137c;

    awm(zzcce zzcce) {
        this.f41137c = zzcce;
    }

    public final boolean hasNext() {
        return this.f41135a < this.f41136b;
    }

    /* renamed from: a */
    public final byte mo40111a() {
        int i = this.f41135a;
        if (i < this.f41136b) {
            this.f41135a = i + 1;
            return this.f41137c.zzfj(i);
        }
        throw new NoSuchElementException();
    }
}
