package dmt.p1861av.video;

import com.p280ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.p280ss.android.vesdk.C45329l;

/* renamed from: dmt.av.video.o */
final /* synthetic */ class C47474o implements C45329l {

    /* renamed from: a */
    private final C474691 f121897a;

    /* renamed from: b */
    private final SynthetiseResult f121898b;

    /* renamed from: c */
    private final C47419ae f121899c;

    C47474o(C474691 r1, SynthetiseResult synthetiseResult, C47419ae aeVar) {
        this.f121897a = r1;
        this.f121898b = synthetiseResult;
        this.f121899c = aeVar;
    }

    public final void onCallback(int i, int i2, float f, String str) {
        this.f121897a.mo119593a(this.f121898b, this.f121899c, i, i2, f, str);
    }
}
