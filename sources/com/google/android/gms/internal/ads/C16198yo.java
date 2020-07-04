package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.yo */
public class C16198yo extends bcj implements Closeable {

    /* renamed from: f */
    private static bcr f45430f = bcr.m48435a(C16198yo.class);

    public C16198yo(bcl bcl, C16169xm xmVar) throws IOException {
        mo40492a(bcl, bcl.mo39634a(), xmVar);
    }

    public void close() throws IOException {
        this.f41455b.close();
    }

    public String toString() {
        String obj = this.f41455b.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 7);
        sb.append("model(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
