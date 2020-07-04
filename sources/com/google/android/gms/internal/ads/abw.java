package com.google.android.gms.internal.ads;

import java.math.BigInteger;

@C6505uv
public final class abw {

    /* renamed from: a */
    private BigInteger f39953a = BigInteger.ONE;

    /* renamed from: b */
    private String f39954b = "0";

    /* renamed from: a */
    public final synchronized String mo39112a() {
        String bigInteger;
        bigInteger = this.f39953a.toString();
        this.f39953a = this.f39953a.add(BigInteger.ONE);
        this.f39954b = bigInteger;
        return bigInteger;
    }

    /* renamed from: b */
    public final synchronized String mo39113b() {
        return this.f39954b;
    }
}
