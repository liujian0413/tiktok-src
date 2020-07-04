package com.google.android.gms.maps.model;

public final class CustomCap extends Cap {

    /* renamed from: a */
    public final C16769a f46782a;

    /* renamed from: b */
    public final float f46783b;

    public final String toString() {
        String valueOf = String.valueOf(this.f46782a);
        float f = this.f46783b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 55);
        sb.append("[CustomCap: bitmapDescriptor=");
        sb.append(valueOf);
        sb.append(" refWidth=");
        sb.append(f);
        sb.append("]");
        return sb.toString();
    }
}
