package com.p280ss.android.ugc.aweme.shortvideo.videoprocess.p1627a;

import com.p280ss.android.medialib.FFMpegManager;
import com.p280ss.android.ugc.aweme.base.utils.C23485m;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.services.watermark.IWaterMarkService;
import com.p280ss.android.ugc.aweme.shortvideo.C38527bf;
import com.p280ss.android.ugc.aweme.shortvideo.C39810eq;
import com.p280ss.android.ugc.aweme.shortvideo.videoprocess.C41633a;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.vesdk.VEUtils;
import com.p280ss.android.vesdk.VEUtils.C45235b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.videoprocess.a.a */
public final class C41634a extends Thread {

    /* renamed from: a */
    private String f108203a;

    /* renamed from: b */
    private String f108204b;

    /* renamed from: c */
    private C41633a f108205c;

    /* renamed from: d */
    private boolean f108206d;

    public final void run() {
        int i;
        int i2;
        float f;
        int i3;
        StringBuilder sb = new StringBuilder();
        sb.append(C35563c.f93238a.getExternalCacheDir());
        sb.append("/watermark.png");
        String sb2 = sb.toString();
        if (C38527bf.m123172a(sb2)) {
            C7276d.m22816c(sb2);
        }
        int[] a = FFMpegManager.m64569a().mo51828a(this.f108203a);
        if (a[0] == 0) {
            i = a[2];
            i2 = a[3];
        } else {
            i2 = 0;
            i = 0;
        }
        FFMpegManager.m64569a().mo51829b();
        if (i < i2) {
            f = 0.47f;
        } else {
            f = 0.27f;
        }
        if (i > i2) {
            i3 = 480;
        } else {
            i3 = 270;
        }
        C45235b bVar = new C45235b();
        bVar.f116391c = C39810eq.m127461a(".png");
        bVar.f116389a = this.f108203a;
        bVar.f116390b = this.f108204b;
        bVar.f116394f = 0.4f;
        bVar.f116395g = 8;
        bVar.f116396h = i3;
        if (this.f108206d) {
            float f2 = (float) i;
            bVar.f116398j = (int) ((1.0f - f) * f2);
            bVar.f116399k = 0;
            bVar.f116393e = (int) (f * f2);
            ((IWaterMarkService) ServiceManager.get().getService(IWaterMarkService.class)).watermarkParamBuilderService().getGifWatermarkImage(sb2);
            bVar.f116392d = sb2;
        }
        int convertVideo2Gif = VEUtils.convertVideo2Gif(bVar, new C41635b(this));
        C7276d.m22816c(sb2);
        C23485m.m77116a(new C41636c(this, convertVideo2Gif));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo102256a(int i) {
        C23485m.m77116a(new C41637d(this, i));
    }

    public C41634a(String str, String str2, boolean z, C41633a aVar) {
        this.f108203a = str;
        this.f108204b = str2;
        this.f108205c = aVar;
        this.f108206d = z;
    }
}
