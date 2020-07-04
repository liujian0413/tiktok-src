package com.google.android.gms.common.api;

import android.support.p022v4.util.ArrayMap;
import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C15017a.C15021d;
import com.google.android.gms.common.api.internal.C15110cd;
import com.google.android.gms.common.internal.C15267r;
import java.util.ArrayList;

public class AvailabilityException extends Exception {
    private final ArrayMap<C15110cd<?>, ConnectionResult> zaay;

    public AvailabilityException(ArrayMap<C15110cd<?>, ConnectionResult> arrayMap) {
        this.zaay = arrayMap;
    }

    public ConnectionResult getConnectionResult(C15034c<? extends C15021d> cVar) {
        C15110cd<O> cdVar = cVar.f38886d;
        C15267r.m44395b(this.zaay.get(cdVar) != null, "The given API was not part of the availability request.");
        return (ConnectionResult) this.zaay.get(cdVar);
    }

    public final ArrayMap<C15110cd<?>, ConnectionResult> zaj() {
        return this.zaay;
    }

    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (C15110cd cdVar : this.zaay.keySet()) {
            ConnectionResult connectionResult = (ConnectionResult) this.zaay.get(cdVar);
            if (connectionResult.mo38154b()) {
                z = false;
            }
            String a = cdVar.mo38366a();
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 2 + String.valueOf(valueOf).length());
            sb.append(a);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        if (z) {
            sb2.append("None of the queried APIs are available. ");
        } else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
