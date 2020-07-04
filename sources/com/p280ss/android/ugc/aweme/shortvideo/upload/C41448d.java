package com.p280ss.android.ugc.aweme.shortvideo.upload;

import com.p280ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.p280ss.android.vesdk.C45329l;
import dmt.p1861av.video.C47419ae;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.d */
final /* synthetic */ class C41448d implements C45329l {

    /* renamed from: a */
    private final C414371 f107825a;

    /* renamed from: b */
    private final SynthetiseResult f107826b;

    /* renamed from: c */
    private final C47419ae f107827c;

    C41448d(C414371 r1, SynthetiseResult synthetiseResult, C47419ae aeVar) {
        this.f107825a = r1;
        this.f107826b = synthetiseResult;
        this.f107827c = aeVar;
    }

    public final void onCallback(int i, int i2, float f, String str) {
        this.f107825a.mo102088a(this.f107826b, this.f107827c, i, i2, f, str);
    }
}
