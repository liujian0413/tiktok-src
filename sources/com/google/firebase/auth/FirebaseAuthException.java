package com.google.firebase.auth;

import com.google.android.gms.common.internal.C15267r;
import com.google.firebase.FirebaseException;

public class FirebaseAuthException extends FirebaseException {
    private final String zza;

    public String getErrorCode() {
        return this.zza;
    }

    public FirebaseAuthException(String str, String str2) {
        super(str2);
        this.zza = C15267r.m44386a(str);
    }
}
