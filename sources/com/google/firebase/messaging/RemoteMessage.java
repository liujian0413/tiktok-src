package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.p022v4.util.ArrayMap;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;
import java.util.Map;

public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Creator<RemoteMessage> CREATOR = new C18363e();

    /* renamed from: a */
    Bundle f49866a;

    /* renamed from: b */
    private Map<String, String> f49867b;

    public RemoteMessage(Bundle bundle) {
        this.f49866a = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44449a(parcel, 2, this.f49866a, false);
        C15269a.m44443a(parcel, a);
    }

    /* renamed from: a */
    public final Map<String, String> mo47290a() {
        if (this.f49867b == null) {
            Bundle bundle = this.f49866a;
            ArrayMap arrayMap = new ArrayMap();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        arrayMap.put(str, str2);
                    }
                }
            }
            this.f49867b = arrayMap;
        }
        return this.f49867b;
    }
}
