package com.p280ss.android.ugc.aweme.services.watermark;

import com.p280ss.android.ugc.aweme.account.model.C22200c;
import com.p280ss.android.ugc.aweme.services.photo.IPhotoProcessService;
import com.p280ss.android.ugc.aweme.shortvideo.videoprocess.C41633a;
import com.p280ss.android.ugc.aweme.watermark.C43417j;
import com.p280ss.android.ugc.aweme.watermark.C43419l;
import com.p280ss.android.vesdk.VEWatermarkParam;

/* renamed from: com.ss.android.ugc.aweme.services.watermark.IWaterMarkService */
public interface IWaterMarkService {

    /* renamed from: com.ss.android.ugc.aweme.services.watermark.IWaterMarkService$IWatermarkParamBuilderService */
    public interface IWatermarkParamBuilderService {

        /* renamed from: com.ss.android.ugc.aweme.services.watermark.IWaterMarkService$IWatermarkParamBuilderService$DefaultImpls */
        public static final class DefaultImpls {
            public static /* synthetic */ VEWatermarkParam createWatermark$default(IWatermarkParamBuilderService iWatermarkParamBuilderService, int i, String str, C22200c cVar, int[] iArr, boolean z, String str2, boolean z2, int i2, Object obj) {
                boolean z3;
                String str3;
                boolean z4;
                if (obj == null) {
                    if ((i2 & 16) != 0) {
                        z3 = false;
                    } else {
                        z3 = z;
                    }
                    if ((i2 & 32) != 0) {
                        str3 = "";
                    } else {
                        str3 = str2;
                    }
                    if ((i2 & 64) != 0) {
                        z4 = false;
                    } else {
                        z4 = z2;
                    }
                    return iWatermarkParamBuilderService.createWatermark(i, str, cVar, iArr, z3, str3, z4);
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createWatermark");
            }
        }

        VEWatermarkParam createWatermark(int i, String str, C22200c cVar, int[] iArr, boolean z, String str2, boolean z2);

        void getGifWatermarkImage(String str);
    }

    void cancelWaterMark();

    String[] createWaterMarkImages(String str, String str2, String str3, String str4, boolean z);

    IPhotoProcessService photoProcessService();

    void prepareDataForI18n(C43419l lVar);

    void waterMark(int i, String str, String str2, int[] iArr, C41633a aVar);

    void waterMark(C43419l lVar);

    void waterMark(String str, String str2, int[] iArr, VEWatermarkParam vEWatermarkParam, C43417j jVar, C41633a aVar);

    IWatermarkParamBuilderService watermarkParamBuilderService();
}
