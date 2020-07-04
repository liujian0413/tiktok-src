package com.p280ss.android.ugc.aweme.shortvideo.upload;

import com.p280ss.ttuploader.TTVideoInfo;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.UploadException */
public final class UploadException extends RuntimeException {
    public static final C41432a Companion = new C41432a(null);
    private final TTVideoInfo mInfo;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.UploadException$a */
    public static final class C41432a {
        private C41432a() {
        }

        public /* synthetic */ C41432a(C7571f fVar) {
            this();
        }
    }

    public final long getErrorCode() {
        TTVideoInfo tTVideoInfo = this.mInfo;
        if (tTVideoInfo != null) {
            return tTVideoInfo.mErrcode;
        }
        return 0;
    }

    public UploadException(TTVideoInfo tTVideoInfo) {
        this.mInfo = tTVideoInfo;
    }
}
