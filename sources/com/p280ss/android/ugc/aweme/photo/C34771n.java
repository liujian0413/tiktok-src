package com.p280ss.android.ugc.aweme.photo;

import com.p280ss.ttuploader.TTImageInfo;
import com.p280ss.ttuploader.TTImageUploader;
import com.p280ss.ttuploader.TTImageUploaderListener;

/* renamed from: com.ss.android.ugc.aweme.photo.n */
final /* synthetic */ class C34771n implements TTImageUploaderListener {

    /* renamed from: a */
    private final C347633 f90648a;

    /* renamed from: b */
    private final TTImageUploader f90649b;

    C34771n(C347633 r1, TTImageUploader tTImageUploader) {
        this.f90648a = r1;
        this.f90649b = tTImageUploader;
    }

    public final void onNotify(int i, long j, TTImageInfo tTImageInfo) {
        this.f90648a.mo88210a(this.f90649b, i, j, tTImageInfo);
    }
}
