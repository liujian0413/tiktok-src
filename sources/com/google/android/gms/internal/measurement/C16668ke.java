package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ke */
final class C16668ke extends IllegalArgumentException {
    C16668ke(int i, int i2) {
        StringBuilder sb = new StringBuilder(54);
        sb.append("Unpaired surrogate at index ");
        sb.append(i);
        sb.append(" of ");
        sb.append(i2);
        super(sb.toString());
    }
}
