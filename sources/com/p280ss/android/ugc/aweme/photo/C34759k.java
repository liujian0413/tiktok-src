package com.p280ss.android.ugc.aweme.photo;

import com.p280ss.android.ugc.aweme.services.publish.PublishOutput;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.photo.k */
public final class C34759k {
    /* renamed from: a */
    public static final PublishOutput m112137a(PhotoContext photoContext) {
        C7573i.m23587b(photoContext, "$this$toPublishOutput");
        PublishOutput publishOutput = new PublishOutput(photoContext.creationId, photoContext.mPhotoLocalPath, "", false, false, 24, null);
        return publishOutput;
    }
}
