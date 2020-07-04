package com.google.firebase;

import com.google.android.gms.common.internal.C15267r;

public class FirebaseException extends Exception {
    protected FirebaseException() {
    }

    public FirebaseException(String str) {
        super(C15267r.m44387a(str, (Object) "Detail message must not be empty"));
    }

    public FirebaseException(String str, Throwable th) {
        super(C15267r.m44387a(str, (Object) "Detail message must not be empty"), th);
    }
}
