package com.p280ss.android.ugc.aweme.sharer;

import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.sharer.ShareException */
public final class ShareException extends RuntimeException {
    public static final C38289a Companion = new C38289a(null);
    private final String message;

    /* renamed from: com.ss.android.ugc.aweme.sharer.ShareException$a */
    public static final class C38289a {
        private C38289a() {
        }

        public /* synthetic */ C38289a(C7571f fVar) {
            this();
        }
    }

    public final String getMessage() {
        return this.message;
    }

    public ShareException(String str) {
        C7573i.m23587b(str, "message");
        super(str);
        this.message = str;
    }
}
