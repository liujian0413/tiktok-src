package com.p280ss.android.ugc.aweme.shortvideo;

import android.text.TextUtils;
import com.p280ss.android.agilelogger.ALog;
import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35581q;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.draft.IDraftService;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.p1567a.C39702d;
import com.p280ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.p280ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule;
import com.p280ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule.C41064b;
import com.p280ss.android.ugc.aweme.video.C7276d;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.fc */
public final class C39861fc implements C40023l<C38455ap> {

    /* renamed from: a */
    private final int f103584a;

    /* renamed from: b */
    private final Object f103585b;

    public final void onProgressUpdate(int i, boolean z) {
    }

    public final void onSynthetiseSuccess(String str) {
    }

    /* renamed from: a */
    private final void m127584a(C38455ap apVar) {
        AVUploadSaveModel aVUploadSaveModel;
        StringBuilder sb = new StringBuilder("args is ");
        sb.append(this.f103585b);
        C6921a.m21555a(sb.toString());
        String str = null;
        if (this.f103584a == 0) {
            Object obj = this.f103585b;
            if (obj != null) {
                VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
                str = videoPublishEditModel.getLocalFinalPath();
                aVUploadSaveModel = videoPublishEditModel.mSaveModel;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
            }
        } else if (this.f103584a == 6) {
            Object obj2 = this.f103585b;
            if (obj2 != null) {
                PhotoMovieContext photoMovieContext = (PhotoMovieContext) obj2;
                str = photoMovieContext.getLocalTempPath();
                aVUploadSaveModel = photoMovieContext.mSaveModel;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.photomovie.PhotoMovieContext");
            }
        } else {
            aVUploadSaveModel = null;
        }
        if (!TextUtils.isEmpty(str)) {
            apVar.mSaveModel = aVUploadSaveModel;
            C7276d.m22822e(C39811er.f103476l);
        }
    }

    public final void onError(VideoPublishException videoPublishException) {
        String str;
        C7573i.m23587b(videoPublishException, "e");
        if (videoPublishException.isRecover()) {
            int i = this.f103584a;
            if (i == 0) {
                Object obj = this.f103585b;
                if (obj != null) {
                    if (((VideoPublishEditModel) obj).isMultiVideoEdit()) {
                        C39702d.m127068c();
                    }
                    str = ((VideoPublishEditModel) this.f103585b).getDraftPrimaryKey();
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
                }
            } else if (i != 6) {
                str = "";
            } else {
                Object obj2 = this.f103585b;
                if (obj2 != null) {
                    str = ((PhotoMovieContext) obj2).getDraftPrimaryKey();
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.photomovie.PhotoMovieContext");
                }
            }
            if (!TextUtils.isEmpty(str)) {
                Object service = ServiceManager.get().getService(IAVService.class);
                C7573i.m23582a(service, "ServiceManager.get().get…e(IAVService::class.java)");
                ((IAVService) service).getPublishService().setUploadRecoverPath(str);
            }
        }
    }

    public C39861fc(int i, Object obj) {
        C7573i.m23587b(obj, "args");
        this.f103584a = i;
        this.f103585b = obj;
    }

    public final void onSuccess(C38455ap apVar, boolean z) {
        C7573i.m23587b(apVar, "response");
        m127584a(apVar);
        int i = this.f103584a;
        if (i == 0) {
            Object obj = this.f103585b;
            if (!(obj instanceof VideoPublishEditModel)) {
                obj = null;
            }
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
            if (videoPublishEditModel != null) {
                IDraftService draftService = ((IAVService) ServiceManager.get().getService(IAVService.class)).draftService();
                C27311c queryDraft = draftService.queryDraft(videoPublishEditModel.getDraftPrimaryKey());
                if (queryDraft != null) {
                    C35581q qVar = C35563c.f93222D;
                    String aj = queryDraft.mo70221aj();
                    C7573i.m23582a((Object) aj, "draft.draftPrimaryKey");
                    qVar.mo83115a(aj);
                    draftService.delete(queryDraft);
                    draftService.notifyDraftDelete(queryDraft);
                    AVAweme a = C35563c.f93221C.mo83254a(apVar);
                    if (a != null) {
                        new C39350dn();
                        C39350dn.m125707a(C35563c.f93238a, a.aid, apVar.materialId, this.f103585b);
                        new C38582ck().mo96558a(C35563c.f93238a, this.f103585b, queryDraft, a.aid, apVar.materialId);
                        C41064b bVar = SubtitleModule.f106768S;
                        String str = apVar.materialId;
                        if (str == null) {
                            str = "";
                        }
                        bVar.mo101517a(str);
                        if (videoPublishEditModel.isMultiVideoEdit()) {
                            C39702d.m127068c();
                        }
                    }
                }
            }
        } else if (i != 6) {
            ALog.m20871e("ShortVideoPublishCallback", "unknown video type");
        } else {
            Object obj2 = this.f103585b;
            if (!(obj2 instanceof PhotoMovieContext)) {
                obj2 = null;
            }
            PhotoMovieContext photoMovieContext = (PhotoMovieContext) obj2;
            if (photoMovieContext != null) {
                IDraftService draftService2 = ((IAVService) ServiceManager.get().getService(IAVService.class)).draftService();
                C27311c queryDraft2 = draftService2.queryDraft(photoMovieContext.getDraftPrimaryKey());
                if (queryDraft2 != null) {
                    C35581q qVar2 = C35563c.f93222D;
                    String aj2 = queryDraft2.mo70221aj();
                    C7573i.m23582a((Object) aj2, "draft.draftPrimaryKey");
                    qVar2.mo83115a(aj2);
                    draftService2.delete(queryDraft2);
                    draftService2.notifyDraftDelete(queryDraft2);
                    AVAweme a2 = C35563c.f93221C.mo83254a(apVar);
                    if (a2 != null) {
                        new C38582ck().mo96558a(C35563c.f93238a, this.f103585b, queryDraft2, a2.aid, apVar.materialId);
                    }
                }
            }
        }
    }
}
