package com.p280ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import android.content.Intent;
import android.support.p022v4.app.JobIntentService;
import bolts.C1591g;
import bolts.C1592h;
import bolts.C1606i;
import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.photo.publish.C34788e;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39526e;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.C39692a;
import com.p280ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.TimeSpeedModelExtension;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.backgroundvideo.C40414d;
import com.p280ss.android.ugc.aweme.tools.extract.C42320g.C42321a;
import com.p280ss.android.ugc.aweme.tools.extract.C42323i;
import com.p280ss.android.ugc.aweme.tools.extract.C42331n;
import com.p280ss.android.ugc.aweme.tools.extract.upload.C42339a;
import com.p280ss.android.ugc.aweme.tools.extract.upload.C42340b;
import com.p280ss.android.ugc.aweme.tools.extract.upload.VideoFramesUploadService;
import com.p280ss.android.ugc.aweme.video.C7276d;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ck */
public final class C38582ck {
    /* renamed from: a */
    static final /* synthetic */ Object m123275a(Object obj) throws Exception {
        String str = ((VideoPublishEditModel) obj).extractFramesModel.extractFramesDir;
        C7276d.m22822e(str);
        C7276d.m22816c(str);
        return null;
    }

    /* renamed from: c */
    private static boolean m123286c(Object obj) {
        if (C35563c.f93230L.mo93343b(Property.CloseUploadExtractFrames) == 0) {
            if (obj instanceof PhotoMovieContext) {
                return true;
            }
            if (obj instanceof VideoPublishEditModel) {
                VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
                if (videoPublishEditModel.isMvThemeVideoType() || videoPublishEditModel.isStatusVideoType()) {
                    return true;
                }
                return videoPublishEditModel.shouldUploadExtractFrames();
            }
        }
        return false;
    }

    /* renamed from: b */
    private static C1592h<Void> m123281b(Object obj) {
        C1606i iVar = new C1606i();
        if (obj instanceof PhotoMovieContext) {
            C1592h.m7859b((Callable<TResult>) new C38642cp<TResult>(obj, iVar));
        } else if (!(obj instanceof VideoPublishEditModel)) {
            return C1592h.m7865h();
        } else {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
            if (videoPublishEditModel.isMvThemeVideoType()) {
                C1592h.m7859b((Callable<TResult>) new C38643cq<TResult>(obj, iVar));
            } else if (videoPublishEditModel.isStatusVideoType() && videoPublishEditModel.statusCreateVideoData.getBgFrom().equals("upload")) {
                C1592h.m7859b((Callable<TResult>) new C38644cr<TResult>(obj, iVar));
            } else if (videoPublishEditModel.mFromCut || videoPublishEditModel.mFromMultiCut || C39526e.m126249b(videoPublishEditModel)) {
                C1592h.m7859b((Callable<TResult>) new C38645cs<TResult>(obj, iVar));
            } else if (videoPublishEditModel.containBackgroundVideo) {
                C1592h.m7859b((Callable<TResult>) new C38646ct<TResult>(obj, iVar));
            } else {
                iVar.mo6903b(null);
            }
        }
        return iVar.f6010a;
    }

    /* renamed from: b */
    static final /* synthetic */ Object m123282b(Object obj, C1606i iVar) throws Exception {
        C42331n nVar = new C42331n(((VideoPublishEditModel) obj).getPreviewInfo());
        nVar.mo103792a((C42321a) new C39316cv(obj, nVar, iVar));
        return null;
    }

    /* renamed from: c */
    static final /* synthetic */ Object m123284c(Object obj, C1606i iVar) throws Exception {
        C42323i iVar2 = new C42323i(Collections.singletonList(((VideoPublishEditModel) obj).statusCreateVideoData.getBgSrcImage()));
        iVar2.mo103792a((C42321a) new C39317cw(obj, iVar2, iVar));
        return null;
    }

    /* renamed from: d */
    static final /* synthetic */ Object m123287d(Object obj, C1606i iVar) throws Exception {
        C42323i iVar2 = new C42323i(((VideoPublishEditModel) obj).mvCreateVideoData.srcSelectMediaList);
        iVar2.mo103792a((C42321a) new C38585cn(obj, iVar2, iVar));
        return null;
    }

    /* renamed from: e */
    static final /* synthetic */ Object m123288e(Object obj, C1606i iVar) throws Exception {
        C42323i iVar2 = new C42323i(((PhotoMovieContext) obj).mImageList);
        iVar2.mo103792a((C42321a) new C38586co(obj, iVar2, iVar));
        return null;
    }

    /* renamed from: a */
    private static void m123278a(C27311c cVar, Object obj) {
        if (cVar != null) {
            cVar.mo70278m();
            C40414d.m129225a((List<TimeSpeedModelExtension>) ShortVideoContext.m122682a(cVar.f72019G));
            return;
        }
        if (obj instanceof VideoPublishEditModel) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
            C39692a.m127024a(videoPublishEditModel.getPreviewInfo(), videoPublishEditModel.isFastImport);
        }
    }

    /* renamed from: b */
    static final /* synthetic */ void m123283b(Object obj, C42323i iVar, C1606i iVar2, boolean z) {
        ((VideoPublishEditModel) obj).extractFramesModel = iVar.mo103798e();
        iVar2.mo6903b(null);
    }

    /* renamed from: c */
    static final /* synthetic */ void m123285c(Object obj, C42323i iVar, C1606i iVar2, boolean z) {
        ((PhotoMovieContext) obj).extractFramesModel = iVar.mo103798e();
        iVar2.mo6903b(null);
    }

    /* renamed from: a */
    static final /* synthetic */ void m123279a(Object obj, C42323i iVar, C1606i iVar2, boolean z) {
        ((VideoPublishEditModel) obj).extractFramesModel = iVar.mo103798e();
        iVar2.mo6903b(null);
    }

    /* renamed from: a */
    static final /* synthetic */ void m123280a(Object obj, C42331n nVar, C1606i iVar, boolean z) {
        ((VideoPublishEditModel) obj).extractFramesModel = nVar.mo103798e();
        iVar.mo6903b(null);
    }

    /* renamed from: a */
    public final void mo96558a(Context context, Object obj, C27311c cVar, String str, String str2) {
        int i;
        boolean z = obj instanceof VideoPublishEditModel;
        if (!z || !C34788e.m112192d(((VideoPublishEditModel) obj).videoType)) {
            i = 1;
        } else {
            i = 2;
        }
        if (!m123286c(obj)) {
            m123278a(cVar, obj);
            if (z && ((VideoPublishEditModel) obj).extractFramesModel != null) {
                C1592h.m7853a((Callable<TResult>) new C38583cl<TResult>(obj));
            }
            return;
        }
        C1592h b = m123281b(obj);
        C38584cm cmVar = new C38584cm(this, cVar, obj, str, str2, context, i);
        b.mo6875a((C1591g<TResult, TContinuationResult>) cmVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Void mo96557a(C27311c cVar, Object obj, String str, String str2, Context context, int i, C1592h hVar) throws Exception {
        ExtractFramesModel extractFramesModel;
        String str3;
        Object obj2 = obj;
        m123278a(cVar, obj);
        if (hVar.mo6887c() || hVar.mo6889d()) {
            return null;
        }
        if (obj2 instanceof PhotoMovieContext) {
            extractFramesModel = ((PhotoMovieContext) obj2).extractFramesModel;
        } else {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj2;
            ExtractFramesModel extractFramesModel2 = videoPublishEditModel.extractFramesModel;
            if (extractFramesModel2 != null) {
                extractFramesModel2.setStickerIds(videoPublishEditModel.mStickerID);
            }
            extractFramesModel = extractFramesModel2;
        }
        if (extractFramesModel != null) {
            C42340b bVar = new C42340b(str, str2, "", "", extractFramesModel, System.currentTimeMillis());
            C42339a.m134629a(context).mo103820a(bVar);
        }
        Intent intent = new Intent();
        String str4 = "authkey";
        if (i == 1) {
            str3 = C35563c.f93230L.mo93346e(Property.SdkV4AuthKey);
        } else {
            str3 = C35563c.f93230L.mo93346e(Property.StorySdkV4AuthKey);
        }
        intent.putExtra(str4, str3);
        JobIntentService.enqueueWork(context.getApplicationContext(), VideoFramesUploadService.class, 3009, intent);
        return null;
    }
}
