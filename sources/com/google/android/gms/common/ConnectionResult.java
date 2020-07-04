package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15265q;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

public final class ConnectionResult extends AbstractSafeParcelable {
    public static final Creator<ConnectionResult> CREATOR = new C15184h();

    /* renamed from: a */
    public static final ConnectionResult f38845a = new ConnectionResult(0);

    /* renamed from: b */
    public final int f38846b;

    /* renamed from: c */
    public final PendingIntent f38847c;

    /* renamed from: d */
    public final String f38848d;

    /* renamed from: e */
    private final int f38849e;

    ConnectionResult(int i, int i2, PendingIntent pendingIntent, String str) {
        this.f38849e = i;
        this.f38846b = i2;
        this.f38847c = pendingIntent;
        this.f38848d = str;
    }

    public ConnectionResult(int i) {
        this(i, null, null);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, null);
    }

    private ConnectionResult(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, null);
    }

    /* renamed from: a */
    public final boolean mo38153a() {
        return (this.f38846b == 0 || this.f38847c == null) ? false : true;
    }

    /* renamed from: b */
    public final boolean mo38154b() {
        return this.f38846b == 0;
    }

    /* renamed from: a */
    static String m43534a(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.f38846b == connectionResult.f38846b && C15265q.m44381a(this.f38847c, connectionResult.f38847c) && C15265q.m44381a(this.f38848d, connectionResult.f38848d);
    }

    public final int hashCode() {
        return C15265q.m44379a(Integer.valueOf(this.f38846b), this.f38847c, this.f38848d);
    }

    public final String toString() {
        return C15265q.m44380a((Object) this).mo38611a("statusCode", m43534a(this.f38846b)).mo38611a("resolution", this.f38847c).mo38611a("message", this.f38848d).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44447a(parcel, 1, this.f38849e);
        C15269a.m44447a(parcel, 2, this.f38846b);
        C15269a.m44452a(parcel, 3, (Parcelable) this.f38847c, i, false);
        C15269a.m44457a(parcel, 4, this.f38848d, false);
        C15269a.m44443a(parcel, a);
    }
}
