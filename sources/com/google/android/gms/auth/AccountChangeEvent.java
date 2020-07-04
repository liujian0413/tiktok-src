package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15265q;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

public class AccountChangeEvent extends AbstractSafeParcelable {
    public static final Creator<AccountChangeEvent> CREATOR = new C14940a();

    /* renamed from: a */
    public final String f38628a;

    /* renamed from: b */
    public final int f38629b;

    /* renamed from: c */
    public final int f38630c;

    /* renamed from: d */
    public final String f38631d;

    /* renamed from: e */
    private final int f38632e;

    /* renamed from: f */
    private final long f38633f;

    AccountChangeEvent(int i, long j, String str, int i2, int i3, String str2) {
        this.f38632e = i;
        this.f38633f = j;
        this.f38628a = (String) C15267r.m44384a(str);
        this.f38629b = i2;
        this.f38630c = i3;
        this.f38631d = str2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44447a(parcel, 1, this.f38632e);
        C15269a.m44448a(parcel, 2, this.f38633f);
        C15269a.m44457a(parcel, 3, this.f38628a, false);
        C15269a.m44447a(parcel, 4, this.f38629b);
        C15269a.m44447a(parcel, 5, this.f38630c);
        C15269a.m44457a(parcel, 6, this.f38631d, false);
        C15269a.m44443a(parcel, a);
    }

    public String toString() {
        String str = "UNKNOWN";
        switch (this.f38629b) {
            case 1:
                str = "ADDED";
                break;
            case 2:
                str = "REMOVED";
                break;
            case 3:
                str = "RENAMED_FROM";
                break;
            case 4:
                str = "RENAMED_TO";
                break;
        }
        String str2 = this.f38628a;
        String str3 = this.f38631d;
        int i = this.f38630c;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 91 + String.valueOf(str).length() + String.valueOf(str3).length());
        sb.append("AccountChangeEvent {accountName = ");
        sb.append(str2);
        sb.append(", changeType = ");
        sb.append(str);
        sb.append(", changeData = ");
        sb.append(str3);
        sb.append(", eventIndex = ");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }

    public int hashCode() {
        return C15265q.m44379a(Integer.valueOf(this.f38632e), Long.valueOf(this.f38633f), this.f38628a, Integer.valueOf(this.f38629b), Integer.valueOf(this.f38630c), this.f38631d);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AccountChangeEvent)) {
            return false;
        }
        AccountChangeEvent accountChangeEvent = (AccountChangeEvent) obj;
        return this.f38632e == accountChangeEvent.f38632e && this.f38633f == accountChangeEvent.f38633f && C15265q.m44381a(this.f38628a, accountChangeEvent.f38628a) && this.f38629b == accountChangeEvent.f38629b && this.f38630c == accountChangeEvent.f38630c && C15265q.m44381a(this.f38631d, accountChangeEvent.f38631d);
    }
}
