package com.p280ss.android.vesdk;

import com.p280ss.android.vesdk.VEImageDetectUtils.IDetectImageResultListener;
import java.util.List;

/* renamed from: com.ss.android.vesdk.p */
public final class C45333p {

    /* renamed from: a */
    private VEImageDetectUtils f116758a;

    /* renamed from: a */
    public final void mo108543a() {
        if (this.f116758a != null) {
            this.f116758a.stopDetectImagesContentIfNeed();
        }
    }

    /* renamed from: a */
    public final synchronized void mo108544a(String str, String str2, List<String> list, IDetectImageResultListener iDetectImageResultListener) {
        this.f116758a = new VEImageDetectUtils();
        this.f116758a.init();
        this.f116758a.setDetectImageContentListener(iDetectImageResultListener);
        this.f116758a.detectImageContent(str, str2, list);
        this.f116758a.destroy();
    }

    /* renamed from: a */
    public final synchronized void mo108545a(String str, List<String> list, List<String> list2, IDetectImageResultListener iDetectImageResultListener) {
        this.f116758a = new VEImageDetectUtils();
        this.f116758a.init();
        this.f116758a.setDetectImageContentListener(iDetectImageResultListener);
        this.f116758a.detectImagesContent(str, list, list2);
        this.f116758a.destroy();
    }
}
