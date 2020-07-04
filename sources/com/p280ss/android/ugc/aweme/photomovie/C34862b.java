package com.p280ss.android.ugc.aweme.photomovie;

import com.p280ss.android.ugc.aweme.services.publish.PublishOutput;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.photomovie.b */
public final class C34862b {
    /* renamed from: a */
    public static final PublishOutput m112408a(PhotoMovieContext photoMovieContext) {
        String str;
        boolean z;
        boolean z2;
        C7573i.m23587b(photoMovieContext, "$this$toPublishOutput");
        String str2 = photoMovieContext.creationId;
        String str3 = photoMovieContext.mFinalVideoTmpPath;
        AVMusic aVMusic = photoMovieContext.mMusic;
        if (aVMusic != null) {
            str = aVMusic.getMusicId();
        } else {
            str = null;
        }
        String str4 = str;
        if (photoMovieContext.mMusic != null) {
            AVMusic aVMusic2 = photoMovieContext.mMusic;
            C7573i.m23582a((Object) aVMusic2, "mMusic");
            z = aVMusic2.isCommerceMusic();
        } else {
            z = false;
        }
        if (photoMovieContext.mMusic != null) {
            AVMusic aVMusic3 = photoMovieContext.mMusic;
            C7573i.m23582a((Object) aVMusic3, "mMusic");
            z2 = aVMusic3.isOriginalSound();
        } else {
            z2 = true;
        }
        PublishOutput publishOutput = new PublishOutput(str2, str3, str4, z, z2);
        return publishOutput;
    }
}
