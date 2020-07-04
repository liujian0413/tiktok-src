package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;
import java.util.Iterator;

public final class zzad extends AbstractSafeParcelable implements Iterable<String> {
    public static final Creator<zzad> CREATOR = new C16936f();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Bundle f47517a;

    zzad(Bundle bundle) {
        this.f47517a = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44449a(parcel, 2, mo44169b(), false);
        C15269a.m44443a(parcel, a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Object mo44168a(String str) {
        return this.f47517a.get(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final Long mo44170b(String str) {
        return Long.valueOf(this.f47517a.getLong(str));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final Double mo44171c(String str) {
        return Double.valueOf(this.f47517a.getDouble(str));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final String mo44172d(String str) {
        return this.f47517a.getString(str);
    }

    /* renamed from: a */
    public final int mo44167a() {
        return this.f47517a.size();
    }

    public final String toString() {
        return this.f47517a.toString();
    }

    /* renamed from: b */
    public final Bundle mo44169b() {
        return new Bundle(this.f47517a);
    }

    public final Iterator<String> iterator() {
        return new C16908e(this);
    }
}
