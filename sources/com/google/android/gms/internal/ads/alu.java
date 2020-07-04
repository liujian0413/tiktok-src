package com.google.android.gms.internal.ads;

final class alu implements aiu {

    /* renamed from: a */
    private final /* synthetic */ alt f40611a;

    alu(alt alt) {
        this.f40611a = alt;
    }

    /* renamed from: a */
    public final void mo39508a(String str, String str2) {
        alt alt = this.f40611a;
        String str3 = "ExoPlayer caching failed. Type: ";
        String valueOf = String.valueOf(str);
        alt.f40609f = valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(str2).length());
        sb.append("ExoPlayer failed during precache: ");
        sb.append(str);
        sb.append(" Exception: ");
        sb.append(str2);
        acd.m45783e(sb.toString());
        this.f40611a.mo39647a();
    }
}
