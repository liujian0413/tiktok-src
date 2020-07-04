package com.google.android.gms.internal.ads;

final class aee implements bxd {

    /* renamed from: a */
    private final /* synthetic */ String f40093a;

    /* renamed from: b */
    private final /* synthetic */ aeh f40094b;

    aee(aea aea, String str, aeh aeh) {
        this.f40093a = str;
        this.f40094b = aeh;
    }

    /* renamed from: a */
    public final void mo39251a(zzae zzae) {
        String str = this.f40093a;
        String zzae2 = zzae.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(zzae2).length());
        sb.append("Failed to load URL: ");
        sb.append(str);
        sb.append("\n");
        sb.append(zzae2);
        acd.m45783e(sb.toString());
        this.f40094b.mo39256a(null);
    }
}
