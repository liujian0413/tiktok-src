package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.google.android.gms.common.internal.C15265q;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;
import java.util.Collections;
import java.util.List;

public class Credential extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<Credential> CREATOR = new C14957b();

    /* renamed from: a */
    public final String f38699a;

    /* renamed from: b */
    public final String f38700b;

    /* renamed from: c */
    public final Uri f38701c;

    /* renamed from: d */
    public final List<IdToken> f38702d;

    /* renamed from: e */
    public final String f38703e;

    /* renamed from: f */
    public final String f38704f;

    /* renamed from: g */
    public final String f38705g;

    /* renamed from: h */
    public final String f38706h;

    Credential(String str, String str2, Uri uri, List<IdToken> list, String str3, String str4, String str5, String str6) {
        List<IdToken> list2;
        String trim = ((String) C15267r.m44385a(str, (Object) "credential identifier cannot be null")).trim();
        C15267r.m44387a(trim, (Object) "credential identifier cannot be empty");
        if (str3 == null || !TextUtils.isEmpty(str3)) {
            if (str4 != null) {
                boolean z = false;
                if (!TextUtils.isEmpty(str4)) {
                    Uri parse = Uri.parse(str4);
                    if (parse.isAbsolute() && parse.isHierarchical() && !TextUtils.isEmpty(parse.getScheme()) && !TextUtils.isEmpty(parse.getAuthority()) && (WebKitApi.SCHEME_HTTP.equalsIgnoreCase(parse.getScheme()) || WebKitApi.SCHEME_HTTPS.equalsIgnoreCase(parse.getScheme()))) {
                        z = true;
                    }
                }
                if (!Boolean.valueOf(z).booleanValue()) {
                    throw new IllegalArgumentException("Account type must be a valid Http/Https URI");
                }
            }
            if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
                if (str2 != null && TextUtils.isEmpty(str2.trim())) {
                    str2 = null;
                }
                this.f38700b = str2;
                this.f38701c = uri;
                if (list == null) {
                    list2 = Collections.emptyList();
                } else {
                    list2 = Collections.unmodifiableList(list);
                }
                this.f38702d = list2;
                this.f38699a = trim;
                this.f38703e = str3;
                this.f38704f = str4;
                this.f38705g = str5;
                this.f38706h = str6;
                return;
            }
            throw new IllegalArgumentException("Password and AccountType are mutually exclusive");
        }
        throw new IllegalArgumentException("Password must not be empty if set");
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44457a(parcel, 1, this.f38699a, false);
        C15269a.m44457a(parcel, 2, this.f38700b, false);
        C15269a.m44452a(parcel, 3, (Parcelable) this.f38701c, i, false);
        C15269a.m44468c(parcel, 4, this.f38702d, false);
        C15269a.m44457a(parcel, 5, this.f38703e, false);
        C15269a.m44457a(parcel, 6, this.f38704f, false);
        C15269a.m44457a(parcel, 9, this.f38705g, false);
        C15269a.m44457a(parcel, 10, this.f38706h, false);
        C15269a.m44443a(parcel, a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Credential)) {
            return false;
        }
        Credential credential = (Credential) obj;
        return TextUtils.equals(this.f38699a, credential.f38699a) && TextUtils.equals(this.f38700b, credential.f38700b) && C15265q.m44381a(this.f38701c, credential.f38701c) && TextUtils.equals(this.f38703e, credential.f38703e) && TextUtils.equals(this.f38704f, credential.f38704f);
    }

    public int hashCode() {
        return C15265q.m44379a(this.f38699a, this.f38700b, this.f38701c, this.f38703e, this.f38704f);
    }
}
