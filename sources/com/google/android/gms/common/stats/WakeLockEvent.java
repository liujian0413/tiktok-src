package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.C15269a;
import java.util.List;

public final class WakeLockEvent extends StatsEvent {
    public static final Creator<WakeLockEvent> CREATOR = new C15311e();

    /* renamed from: a */
    private final int f39547a;

    /* renamed from: b */
    private final long f39548b;

    /* renamed from: c */
    private int f39549c;

    /* renamed from: d */
    private final String f39550d;

    /* renamed from: e */
    private final String f39551e;

    /* renamed from: f */
    private final String f39552f;

    /* renamed from: g */
    private final int f39553g;

    /* renamed from: h */
    private final List<String> f39554h;

    /* renamed from: i */
    private final String f39555i;

    /* renamed from: j */
    private final long f39556j;

    /* renamed from: k */
    private int f39557k;

    /* renamed from: l */
    private final String f39558l;

    /* renamed from: m */
    private final float f39559m;

    /* renamed from: n */
    private final long f39560n;

    /* renamed from: o */
    private long f39561o;

    WakeLockEvent(int i, long j, int i2, String str, int i3, List<String> list, String str2, long j2, int i4, String str3, String str4, float f, long j3, String str5) {
        this.f39547a = i;
        this.f39548b = j;
        this.f39549c = i2;
        this.f39550d = str;
        this.f39551e = str3;
        this.f39552f = str5;
        this.f39553g = i3;
        this.f39561o = -1;
        this.f39554h = list;
        this.f39555i = str2;
        this.f39556j = j2;
        this.f39557k = i4;
        this.f39558l = str4;
        this.f39559m = f;
        this.f39560n = j3;
    }

    public WakeLockEvent(long j, int i, String str, int i2, List<String> list, String str2, long j2, int i3, String str3, String str4, float f, long j3, String str5) {
        this(2, j, i, str, i2, list, str2, j2, i3, str3, str4, f, j3, str5);
    }

    /* renamed from: a */
    public final long mo38670a() {
        return this.f39548b;
    }

    /* renamed from: b */
    public final int mo38671b() {
        return this.f39549c;
    }

    /* renamed from: c */
    public final long mo38672c() {
        return this.f39561o;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44447a(parcel, 1, this.f39547a);
        C15269a.m44448a(parcel, 2, mo38670a());
        C15269a.m44457a(parcel, 4, this.f39550d, false);
        C15269a.m44447a(parcel, 5, this.f39553g);
        C15269a.m44466b(parcel, 6, this.f39554h, false);
        C15269a.m44448a(parcel, 8, this.f39556j);
        C15269a.m44457a(parcel, 10, this.f39551e, false);
        C15269a.m44447a(parcel, 11, mo38671b());
        C15269a.m44457a(parcel, 12, this.f39555i, false);
        C15269a.m44457a(parcel, 13, this.f39558l, false);
        C15269a.m44447a(parcel, 14, this.f39557k);
        C15269a.m44446a(parcel, 15, this.f39559m);
        C15269a.m44448a(parcel, 16, this.f39560n);
        C15269a.m44457a(parcel, 17, this.f39552f, false);
        C15269a.m44443a(parcel, a);
    }

    /* renamed from: d */
    public final String mo38673d() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5 = this.f39550d;
        int i = this.f39553g;
        if (this.f39554h == null) {
            str = "";
        } else {
            str = TextUtils.join(",", this.f39554h);
        }
        int i2 = this.f39557k;
        if (this.f39551e == null) {
            str2 = "";
        } else {
            str2 = this.f39551e;
        }
        if (this.f39558l == null) {
            str3 = "";
        } else {
            str3 = this.f39558l;
        }
        float f = this.f39559m;
        if (this.f39552f == null) {
            str4 = "";
        } else {
            str4 = this.f39552f;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str5).length() + 45 + String.valueOf(str).length() + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("\t");
        sb.append(str5);
        sb.append("\t");
        sb.append(i);
        sb.append("\t");
        sb.append(str);
        sb.append("\t");
        sb.append(i2);
        sb.append("\t");
        sb.append(str2);
        sb.append("\t");
        sb.append(str3);
        sb.append("\t");
        sb.append(f);
        sb.append("\t");
        sb.append(str4);
        return sb.toString();
    }
}
