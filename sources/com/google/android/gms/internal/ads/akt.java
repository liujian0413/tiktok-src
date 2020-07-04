package com.google.android.gms.internal.ads;

import android.os.Build.VERSION;
import java.util.Arrays;
import java.util.List;

@C6505uv
public final class akt implements all {
    /* renamed from: a */
    public final alb mo39640a(aik aik, int i, String str, aij aij) {
        if (VERSION.SDK_INT >= 16 && i > 0) {
            List asList = Arrays.asList(aij.f40315e.split(","));
            if (asList.contains("3")) {
                int b = akh.m46201b();
                if (b < aij.f40318h) {
                    return new aly(aik, aij);
                }
                if (b < aij.f40312b) {
                    return new alx(aik, aij);
                }
                return new aln(aik);
            } else if (asList.contains("1")) {
                int b2 = aip.m46027b();
                if (b2 < aij.f40318h) {
                    if (i == 1) {
                        return new als(aik);
                    }
                    if (i == 2) {
                        return new alp(aik, null);
                    }
                }
                if (b2 < aij.f40312b) {
                    return new alo(aik, aij);
                }
                return new aln(aik);
            }
        }
        return new alm(aik);
    }
}
