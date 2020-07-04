package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;
import java.util.List;

@C6505uv
public final class zzwr extends AbstractSafeParcelable {
    public static final Creator<zzwr> CREATOR = new bvx();

    /* renamed from: a */
    public final String f45767a;

    /* renamed from: b */
    public final boolean f45768b;

    /* renamed from: c */
    public long f45769c;

    /* renamed from: d */
    private final long f45770d;

    /* renamed from: e */
    private final String f45771e;

    /* renamed from: f */
    private final String f45772f;

    /* renamed from: g */
    private final String f45773g;

    /* renamed from: h */
    private final Bundle f45774h;

    /* renamed from: a */
    public static zzwr m53214a(String str) {
        return m53213a(Uri.parse(str));
    }

    /* renamed from: a */
    public static zzwr m53213a(Uri uri) {
        long parseLong;
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                int size = pathSegments.size();
                StringBuilder sb = new StringBuilder(62);
                sb.append("Expected 2 path parts for namespace and id, found :");
                sb.append(size);
                acd.m45783e(sb.toString());
                return null;
            }
            String str = (String) pathSegments.get(0);
            String str2 = (String) pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("url");
            boolean equals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            if (queryParameter2 == null) {
                parseLong = 0;
            } else {
                parseLong = Long.parseLong(queryParameter2);
            }
            long j = parseLong;
            Bundle bundle = new Bundle();
            for (String str3 : uri.getQueryParameterNames()) {
                if (str3.startsWith("tag.")) {
                    bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                }
            }
            zzwr zzwr = new zzwr(queryParameter, j, host, str, str2, bundle, equals, 0);
            return zzwr;
        } catch (NullPointerException | NumberFormatException e) {
            acd.m45780c("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    zzwr(String str, long j, String str2, String str3, String str4, Bundle bundle, boolean z, long j2) {
        this.f45767a = str;
        this.f45770d = j;
        if (str2 == null) {
            str2 = "";
        }
        this.f45771e = str2;
        if (str3 == null) {
            str3 = "";
        }
        this.f45772f = str3;
        if (str4 == null) {
            str4 = "";
        }
        this.f45773g = str4;
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.f45774h = bundle;
        this.f45768b = z;
        this.f45769c = j2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44457a(parcel, 2, this.f45767a, false);
        C15269a.m44448a(parcel, 3, this.f45770d);
        C15269a.m44457a(parcel, 4, this.f45771e, false);
        C15269a.m44457a(parcel, 5, this.f45772f, false);
        C15269a.m44457a(parcel, 6, this.f45773g, false);
        C15269a.m44449a(parcel, 7, this.f45774h, false);
        C15269a.m44459a(parcel, 8, this.f45768b);
        C15269a.m44448a(parcel, 9, this.f45769c);
        C15269a.m44443a(parcel, a);
    }
}
