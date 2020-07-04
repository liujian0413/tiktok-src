package com.p280ss.android.ugc.aweme.storage.exception;

import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.storage.exception.UnregisteredPersistedWhiteListException */
public final class UnregisteredPersistedWhiteListException extends RuntimeException {
    public UnregisteredPersistedWhiteListException() {
        this(null, 1, null);
    }

    public UnregisteredPersistedWhiteListException(String str) {
        super(str);
    }

    public /* synthetic */ UnregisteredPersistedWhiteListException(String str, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            str = "";
        }
        this(str);
    }
}
