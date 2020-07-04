package com.p280ss.android.ugc.aweme.shortvideo.cut.gif.p1553a;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.C36964i;
import com.p280ss.android.ugc.aweme.services.IVideo2GifService.ConvertListener;
import com.p280ss.android.ugc.aweme.services.watermark.IWaterMarkService;
import com.p280ss.android.ugc.aweme.share.gif.VideoShare2GifEditContext;
import com.p280ss.android.ugc.aweme.shortvideo.C38527bf;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.vesdk.C45329l;
import com.p280ss.android.vesdk.VEEditor;
import com.p280ss.android.vesdk.VEEditor.VIDEO_RATIO;
import com.p280ss.android.vesdk.VEVideoEncodeSettings;
import com.p280ss.android.vesdk.VEVideoEncodeSettings.C45244a;
import com.p280ss.android.vesdk.VEVideoEncodeSettings.COMPILE_TYPE;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.gif.a.b */
public final class C38758b {
    /* renamed from: a */
    static final /* synthetic */ Object m123781a(ConvertListener convertListener, VEEditor vEEditor) throws Exception {
        convertListener.onDone(false);
        vEEditor.mo107976n();
        return null;
    }

    /* renamed from: a */
    public static void m123783a(VideoShare2GifEditContext videoShare2GifEditContext, ConvertListener convertListener) {
        int i;
        float f;
        VideoShare2GifEditContext videoShare2GifEditContext2 = videoShare2GifEditContext;
        ConvertListener convertListener2 = convertListener;
        convertListener.onStart();
        VEEditor vEEditor = new VEEditor(videoShare2GifEditContext2.f99036f);
        if (vEEditor.mo107906a(new String[]{videoShare2GifEditContext2.f99031a}, (String[]) null, (String[]) null, VIDEO_RATIO.VIDEO_OUT_RATIO_ORIGINAL) != 0) {
            convertListener2.onDone(false);
            return;
        }
        vEEditor.mo107966j();
        vEEditor.mo107934b((C45329l) new C38759c(convertListener2, vEEditor));
        vEEditor.mo107914a((C45329l) new C38760d(convertListener2, vEEditor));
        if (!TextUtils.isEmpty(videoShare2GifEditContext2.f99035e)) {
            File file = new File(videoShare2GifEditContext2.f99035e);
            if (file.exists()) {
                file.delete();
            }
            vEEditor.mo107937c((int) videoShare2GifEditContext2.f99043m, (int) videoShare2GifEditContext2.f99044n);
            if (videoShare2GifEditContext2.f99033c) {
                StringBuilder sb = new StringBuilder();
                sb.append(C35563c.f93238a.getExternalCacheDir());
                sb.append("/watermark.png");
                String sb2 = sb.toString();
                if (C38527bf.m123172a(sb2)) {
                    C7276d.m22816c(sb2);
                }
                ((IWaterMarkService) ServiceManager.get().getService(IWaterMarkService.class)).watermarkParamBuilderService().getGifWatermarkImage(sb2);
                if (videoShare2GifEditContext2.f99039i < videoShare2GifEditContext2.f99040j) {
                    f = 0.47f;
                } else {
                    f = 0.27f;
                }
                float f2 = (((((float) videoShare2GifEditContext2.f99039i) * f) * 52.0f) / 145.0f) / ((float) videoShare2GifEditContext2.f99040j);
                vEEditor.mo107886a(sb2, (double) f, (double) f2, (double) (1.0f - (f / 2.0f)), (double) (1.0f - (f2 / 2.0f)));
            }
            int i2 = videoShare2GifEditContext2.f99039i;
            if (videoShare2GifEditContext2.f99039i > videoShare2GifEditContext2.f99040j) {
                i = 480;
            } else {
                i = 270;
            }
            int min = Math.min(i2, i);
            int i3 = (int) (((((float) min) * 1.0f) / ((float) videoShare2GifEditContext2.f99039i)) * ((float) videoShare2GifEditContext2.f99040j));
            VEVideoEncodeSettings a = new C45244a(2).mo108151a(COMPILE_TYPE.COMPILE_TYPE_HIGH_GIF).mo108149a(min, i3).mo108148a(8).mo108166b(C36964i.m118926b()).mo108162a();
            a.setSpeed(2.5f);
            C38757a aVar = new C38757a(min, i3, videoShare2GifEditContext2.f99043m, videoShare2GifEditContext2.f99044n, 2.5f);
            convertListener2.onConfigured(aVar);
            vEEditor.mo107944d(2);
            vEEditor.mo107916a(videoShare2GifEditContext2.f99035e, (String) null, a);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ Object m123780a(int i, ConvertListener convertListener, float f, VEEditor vEEditor) throws Exception {
        if (i == 4103) {
            convertListener.onDone(true);
            vEEditor.mo107976n();
        } else if (i == 4105) {
            convertListener.onUpdateProgress((int) (f * 100.0f));
        }
        return null;
    }
}
