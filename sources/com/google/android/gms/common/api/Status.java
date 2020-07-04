package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender.SendIntentException;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15265q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

public final class Status extends AbstractSafeParcelable implements C15044g, ReflectedParcelable {
    public static final Creator<Status> CREATOR = new C15164n();

    /* renamed from: a */
    public static final Status f38867a = new Status(0);

    /* renamed from: b */
    public static final Status f38868b = new Status(14);

    /* renamed from: c */
    public static final Status f38869c = new Status(8);

    /* renamed from: d */
    public static final Status f38870d = new Status(15);

    /* renamed from: e */
    public static final Status f38871e = new Status(16);

    /* renamed from: f */
    public static final Status f38872f = new Status(18);

    /* renamed from: j */
    private static final Status f38873j = new Status(17);

    /* renamed from: g */
    public final int f38874g;

    /* renamed from: h */
    public final String f38875h;

    /* renamed from: i */
    public final PendingIntent f38876i;

    /* renamed from: k */
    private final int f38877k;

    Status(int i, int i2, String str, PendingIntent pendingIntent) {
        this.f38877k = i;
        this.f38874g = i2;
        this.f38875h = str;
        this.f38876i = pendingIntent;
    }

    /* renamed from: a */
    public final Status mo38101a() {
        return this;
    }

    public Status(int i) {
        this(i, null);
    }

    public Status(int i, String str) {
        this(1, i, str, null);
    }

    public Status(int i, String str, PendingIntent pendingIntent) {
        this(1, i, str, pendingIntent);
    }

    /* renamed from: a */
    public final void mo38199a(Activity activity, int i) throws SendIntentException {
        if (mo38200b()) {
            activity.startIntentSenderForResult(this.f38876i.getIntentSender(), i, null, 0, 0, 0);
        }
    }

    /* renamed from: b */
    public final boolean mo38200b() {
        return this.f38876i != null;
    }

    /* renamed from: c */
    public final boolean mo38201c() {
        return this.f38874g <= 0;
    }

    public final int hashCode() {
        return C15265q.m44379a(Integer.valueOf(this.f38877k), Integer.valueOf(this.f38874g), this.f38875h, this.f38876i);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.f38877k != status.f38877k || this.f38874g != status.f38874g || !C15265q.m44381a(this.f38875h, status.f38875h) || !C15265q.m44381a(this.f38876i, status.f38876i)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private String m43547d() {
        if (this.f38875h != null) {
            return this.f38875h;
        }
        return C15033b.m43574a(this.f38874g);
    }

    public final String toString() {
        return C15265q.m44380a((Object) this).mo38611a("statusCode", m43547d()).mo38611a("resolution", this.f38876i).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44447a(parcel, 1, this.f38874g);
        C15269a.m44457a(parcel, 2, this.f38875h, false);
        C15269a.m44452a(parcel, 3, (Parcelable) this.f38876i, i, false);
        C15269a.m44447a(parcel, 1000, this.f38877k);
        C15269a.m44443a(parcel, a);
    }
}
