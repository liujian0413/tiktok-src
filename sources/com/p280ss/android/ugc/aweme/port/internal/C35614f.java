package com.p280ss.android.ugc.aweme.port.internal;

import android.app.Activity;
import android.graphics.Bitmap;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.photo.PhotoContext;
import com.p280ss.android.ugc.aweme.services.photo.IPhotoProcessService;
import com.p280ss.android.ugc.aweme.services.photo.IPhotoProcessService.IPhotoServiceListener;
import com.p280ss.android.ugc.aweme.services.watermark.IWaterMarkService;
import com.p280ss.android.ugc.aweme.share.C37984ap;
import com.p280ss.android.ugc.aweme.share.C37995av;
import com.p280ss.android.ugc.aweme.share.libra.CloseClientWatermarkExperiment;

/* renamed from: com.ss.android.ugc.aweme.port.internal.f */
public final class C35614f {
    /* renamed from: a */
    public static void m115057a(Activity activity, Aweme aweme) {
        C37984ap.m121301a().sharePrivateAfterPublishDialog(activity, aweme, 0);
    }

    /* renamed from: b */
    public static void m115059b(Activity activity, Aweme aweme, PhotoContext photoContext) {
        C37984ap.m121301a().sharePhotoAfterPublish(activity, aweme, photoContext);
    }

    /* renamed from: a */
    public static void m115058a(final Activity activity, final Aweme aweme, PhotoContext photoContext) {
        IPhotoProcessService photoProcessService = ((IWaterMarkService) ServiceManager.get().getService(IWaterMarkService.class)).photoProcessService();
        if (CloseClientWatermarkExperiment.INSTANCE.closed()) {
            photoProcessService.savePhotoWithoutWaterMarker(photoContext, new IPhotoServiceListener() {
                public final void onWaterMakerAdded(Bitmap bitmap) {
                }

                public final void onSaved(int i, PhotoContext photoContext) {
                    C35614f.m115059b(activity, aweme, photoContext);
                }
            });
        } else {
            photoProcessService.savePhotoWithWaterMarker(photoContext, new IPhotoServiceListener() {
                public final void onWaterMakerAdded(Bitmap bitmap) {
                }

                public final void onSaved(int i, PhotoContext photoContext) {
                    C35614f.m115059b(activity, aweme, photoContext);
                    C37995av.m121310a();
                }
            });
        }
    }
}
