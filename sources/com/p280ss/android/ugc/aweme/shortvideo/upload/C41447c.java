package com.p280ss.android.ugc.aweme.shortvideo.upload;

import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.c */
final /* synthetic */ class C41447c implements Callable {

    /* renamed from: a */
    private final C414371 f107823a;

    /* renamed from: b */
    private final VideoPublishEditModel f107824b;

    C41447c(C414371 r1, VideoPublishEditModel videoPublishEditModel) {
        this.f107823a = r1;
        this.f107824b = videoPublishEditModel;
    }

    public final Object call() {
        return this.f107823a.mo102087a(this.f107824b);
    }
}
