package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

public class ClientIdentity extends AbstractSafeParcelable {
    public static final Creator<ClientIdentity> CREATOR = new C15273v();

    /* renamed from: a */
    private final int f39318a;

    /* renamed from: b */
    private final String f39319b;

    public ClientIdentity(int i, String str) {
        this.f39318a = i;
        this.f39319b = str;
    }

    public int hashCode() {
        return this.f39318a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof ClientIdentity)) {
            return false;
        }
        ClientIdentity clientIdentity = (ClientIdentity) obj;
        return clientIdentity.f39318a == this.f39318a && C15265q.m44381a(clientIdentity.f39319b, this.f39319b);
    }

    public String toString() {
        int i = this.f39318a;
        String str = this.f39319b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(i);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44447a(parcel, 1, this.f39318a);
        C15269a.m44457a(parcel, 2, this.f39319b, false);
        C15269a.m44443a(parcel, a);
    }
}
