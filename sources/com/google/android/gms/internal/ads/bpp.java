package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;

final class bpp {

    /* renamed from: a */
    private final bnd[] f43171a;

    /* renamed from: b */
    private final bnf f43172b;

    /* renamed from: c */
    private bnd f43173c;

    public bpp(bnd[] bndArr, bnf bnf) {
        this.f43171a = bndArr;
        this.f43172b = bnf;
    }

    /* renamed from: a */
    public final bnd mo41109a(bne bne, Uri uri) throws IOException, InterruptedException {
        if (this.f43173c != null) {
            return this.f43173c;
        }
        bnd[] bndArr = this.f43171a;
        int length = bndArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            bnd bnd = bndArr[i];
            try {
                if (bnd.mo41016a(bne)) {
                    this.f43173c = bnd;
                    bne.mo41005a();
                    break;
                }
                i++;
            } catch (EOFException unused) {
            } finally {
                bne.mo41005a();
            }
        }
        if (this.f43173c != null) {
            this.f43173c.mo41015a(this.f43172b);
            return this.f43173c;
        }
        String a = bsf.m49937a((Object[]) this.f43171a);
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 58);
        sb.append("None of the available extractors (");
        sb.append(a);
        sb.append(") could read the stream.");
        throw new zzrb(sb.toString(), uri);
    }

    /* renamed from: a */
    public final void mo41110a() {
        if (this.f43173c != null) {
            this.f43173c = null;
        }
    }
}
