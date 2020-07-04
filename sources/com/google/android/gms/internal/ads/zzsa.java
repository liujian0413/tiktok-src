package com.google.android.gms.internal.ads;

import java.io.IOException;

public class zzsa extends IOException {
    private final int type;
    private final brg zzbmr;

    public zzsa(String str, brg brg, int i) {
        super(str);
        this.zzbmr = brg;
        this.type = 1;
    }

    public zzsa(IOException iOException, brg brg, int i) {
        super(iOException);
        this.zzbmr = brg;
        this.type = i;
    }

    public zzsa(String str, IOException iOException, brg brg, int i) {
        super(str, iOException);
        this.zzbmr = brg;
        this.type = 1;
    }
}
