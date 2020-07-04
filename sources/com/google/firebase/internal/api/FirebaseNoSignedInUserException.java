package com.google.firebase.internal.api;

import com.google.firebase.FirebaseException;

public class FirebaseNoSignedInUserException extends FirebaseException {
    public FirebaseNoSignedInUserException(String str) {
        super(str);
    }
}
