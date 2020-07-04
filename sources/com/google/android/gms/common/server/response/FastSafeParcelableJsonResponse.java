package com.google.android.gms.common.server.response;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;

public abstract class FastSafeParcelableJsonResponse extends FastJsonResponse implements SafeParcelable {
    /* renamed from: a */
    public Object mo38643a(String str) {
        return null;
    }

    /* renamed from: b */
    public boolean mo38644b(String str) {
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public int hashCode() {
        int i = 0;
        for (Field field : mo38038a().values()) {
            if (mo38039a(field)) {
                i = (i * 31) + mo38040b(field).hashCode();
            }
        }
        return i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        FastJsonResponse fastJsonResponse = (FastJsonResponse) obj;
        for (Field field : mo38038a().values()) {
            if (mo38039a(field)) {
                if (!fastJsonResponse.mo38039a(field) || !mo38040b(field).equals(fastJsonResponse.mo38040b(field))) {
                    return false;
                }
            } else if (fastJsonResponse.mo38039a(field)) {
                return false;
            }
        }
        return true;
    }
}
