package com.p280ss.android.ugc.aweme.watermark;

import com.p280ss.android.ugc.aweme.account.model.C22200c;
import com.p280ss.android.ugc.aweme.services.watermark.IWaterMarkService.IWatermarkParamBuilderService;
import com.p280ss.android.vesdk.VEWatermarkParam;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.watermark.t */
public final class C43429t implements IWatermarkParamBuilderService {
    public final void getGifWatermarkImage(String str) {
        C7573i.m23587b(str, "imagePath");
        new C43403c().mo105308a().mo105312a(str);
    }

    public final VEWatermarkParam createWatermark(int i, String str, C22200c cVar, int[] iArr, boolean z, String str2, boolean z2) {
        C7573i.m23587b(str, "videoPath");
        C7573i.m23587b(iArr, "videoSize");
        C7573i.m23587b(str2, "extFile");
        return C43416i.m137758a(i, str, cVar, iArr, z, str2, z2);
    }
}
