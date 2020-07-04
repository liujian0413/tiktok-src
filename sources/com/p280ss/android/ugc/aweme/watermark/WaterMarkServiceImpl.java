package com.p280ss.android.ugc.aweme.watermark;

import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.services.photo.IPhotoProcessService;
import com.p280ss.android.ugc.aweme.services.watermark.IWaterMarkService;
import com.p280ss.android.ugc.aweme.services.watermark.IWaterMarkService.IWatermarkParamBuilderService;
import com.p280ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p280ss.android.ugc.aweme.shortvideo.videoprocess.C41633a;
import com.p280ss.android.ugc.aweme.shortvideo.videoprocess.watercompose.C41641b;
import com.p280ss.android.ugc.aweme.shortvideo.videoprocess.watercompose.C41643c;
import com.p280ss.android.vesdk.VEWatermarkParam;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.watermark.WaterMarkServiceImpl */
public final class WaterMarkServiceImpl implements IWaterMarkService {
    static final /* synthetic */ C7595j[] $$delegatedProperties = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(WaterMarkServiceImpl.class), "waterMarkComposer", "getWaterMarkComposer()Lcom/ss/android/ugc/aweme/watermark/WaterMarkComposer;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(WaterMarkServiceImpl.class), "photoProcessServiceImpl", "getPhotoProcessServiceImpl()Lcom/ss/android/ugc/aweme/watermark/PhotoProcessServiceImpl;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(WaterMarkServiceImpl.class), "watermarkParamBuilderServieImpl", "getWatermarkParamBuilderServieImpl()Lcom/ss/android/ugc/aweme/watermark/WatermarkParamBuilderServiceImpl;"))};
    private final C7541d photoProcessServiceImpl$delegate = C7546e.m23569a(C43397a.f112400a);
    private final C7541d waterMarkComposer$delegate = C7546e.m23569a(C43399c.f112402a);
    private final C7541d watermarkParamBuilderServieImpl$delegate = C7546e.m23569a(C43400d.f112403a);

    /* renamed from: com.ss.android.ugc.aweme.watermark.WaterMarkServiceImpl$a */
    static final class C43397a extends Lambda implements C7561a<C43407f> {

        /* renamed from: a */
        public static final C43397a f112400a = new C43397a();

        C43397a() {
            super(0);
        }

        /* renamed from: a */
        private static C43407f m137721a() {
            return new C43407f();
        }

        public final /* synthetic */ Object invoke() {
            return m137721a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.watermark.WaterMarkServiceImpl$b */
    public static final class C43398b implements C41643c {

        /* renamed from: a */
        final /* synthetic */ C41633a f112401a;

        /* renamed from: a */
        public final void mo102268a() {
        }

        /* renamed from: a */
        public final void mo102269a(float f) {
        }

        /* renamed from: a */
        public final void mo102270a(int i, String str, int i2) {
            C7573i.m23587b(str, "errorMsg");
        }

        C43398b(C41633a aVar) {
            this.f112401a = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.watermark.WaterMarkServiceImpl$c */
    static final class C43399c extends Lambda implements C7561a<C43420m> {

        /* renamed from: a */
        public static final C43399c f112402a = new C43399c();

        C43399c() {
            super(0);
        }

        /* renamed from: a */
        private static C43420m m137725a() {
            return new C43420m();
        }

        public final /* synthetic */ Object invoke() {
            return m137725a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.watermark.WaterMarkServiceImpl$d */
    static final class C43400d extends Lambda implements C7561a<C43429t> {

        /* renamed from: a */
        public static final C43400d f112403a = new C43400d();

        C43400d() {
            super(0);
        }

        /* renamed from: a */
        private static C43429t m137726a() {
            return new C43429t();
        }

        public final /* synthetic */ Object invoke() {
            return m137726a();
        }
    }

    private final C43407f getPhotoProcessServiceImpl() {
        return (C43407f) this.photoProcessServiceImpl$delegate.getValue();
    }

    private final C43420m getWaterMarkComposer() {
        return (C43420m) this.waterMarkComposer$delegate.getValue();
    }

    private final C43429t getWatermarkParamBuilderServieImpl() {
        return (C43429t) this.watermarkParamBuilderServieImpl$delegate.getValue();
    }

    public final void cancelWaterMark() {
        getWaterMarkComposer().mo105344b();
    }

    public final IPhotoProcessService photoProcessService() {
        return getPhotoProcessServiceImpl();
    }

    public final IWatermarkParamBuilderService watermarkParamBuilderService() {
        return getWatermarkParamBuilderServieImpl();
    }

    public final synchronized void prepareDataForI18n(C43419l lVar) {
        C7573i.m23587b(lVar, "waterMarkBuilder");
        getWaterMarkComposer().f112472d = lVar;
        getWaterMarkComposer().mo105340a();
    }

    public final synchronized void waterMark(C43419l lVar) {
        C7573i.m23587b(lVar, "waterMarkBuilder");
        getWaterMarkComposer().mo105342a(lVar);
    }

    public final String[] createWaterMarkImages(String str, String str2, String str3, String str4, boolean z) {
        C7573i.m23587b(str, "text");
        C7573i.m23587b(str2, "dir");
        C7573i.m23587b(str3, "commonName");
        String[] a = C43426q.m137816a(str, str2, str3, str4, z);
        C7573i.m23582a((Object) a, "WaterMarkImageHelper.cre…, waterPicDir, leftAlign)");
        return a;
    }

    public final synchronized void waterMark(int i, String str, String str2, int[] iArr, C41633a aVar) {
        C7573i.m23587b(str, "videoPath");
        C7573i.m23587b(str2, "outVideoPath");
        C7573i.m23587b(iArr, "videoSize");
        VEWatermarkParam a = C43416i.m137758a(i, str2, C35563c.f93260w.mo57092e(), iArr, false, "", false);
        if (a != null) {
            waterMark(str, str2, iArr, a, null, aVar);
        }
    }

    public final synchronized void waterMark(String str, String str2, int[] iArr, VEWatermarkParam vEWatermarkParam, C43417j jVar, C41633a aVar) {
        C7573i.m23587b(str, "videoPath");
        C7573i.m23587b(str2, "outVideoPath");
        C7573i.m23587b(iArr, "videoSize");
        C7573i.m23587b(vEWatermarkParam, "veWatermarkParam");
        C43418k kVar = new C43418k(str, str2, vEWatermarkParam, C43416i.m137757a(iArr[0], iArr[1]), null, 16, null);
        if (jVar != null) {
            kVar.mo105323a(jVar);
        }
        String a = Workspace.m122803a(kVar.f112491g);
        C7573i.m23582a((Object) a, "Workspace.getDraftDirFro…markParam.inputMediaPath)");
        new C41641b(a).mo102267a(kVar, new C43398b(aVar));
    }
}
