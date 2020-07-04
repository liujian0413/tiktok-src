package dmt.p1861av.video;

import com.p280ss.android.vesdk.C45329l;

/* renamed from: dmt.av.video.al */
final /* synthetic */ class C47438al implements C45329l {

    /* renamed from: a */
    private final C474201 f121804a;

    /* renamed from: b */
    private final VEPreviewParams f121805b;

    C47438al(C474201 r1, VEPreviewParams vEPreviewParams) {
        this.f121804a = r1;
        this.f121805b = vEPreviewParams;
    }

    public final void onCallback(int i, int i2, float f, String str) {
        this.f121804a.mo119578a(this.f121805b, i, i2, f, str);
    }
}
