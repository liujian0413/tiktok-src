package com.p280ss.android.ugc.aweme.photomovie.edit;

import com.bytedance.common.utility.C6319n;
import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.draft.model.DraftEditTransferModel;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.C39810eq;
import com.p280ss.android.ugc.aweme.shortvideo.C40005j;
import com.p280ss.android.ugc.aweme.tools.extension.C42311e;
import com.p280ss.android.ugc.aweme.tools.extension.Scene;

/* renamed from: com.ss.android.ugc.aweme.photomovie.edit.c */
public final class C34871c {
    /* renamed from: a */
    public static C27311c m112429a(PhotoMovieContext photoMovieContext) {
        C27311c cVar = new C27311c();
        if (C6319n.m19593a(photoMovieContext.mFinalVideoTmpPath)) {
            photoMovieContext.mFinalVideoTmpPath = C39810eq.m127462b("-concat-v");
        }
        cVar.f72034c = photoMovieContext;
        cVar.mo70257g(C35563c.f93224F.mo70090e().mo90399a());
        if (photoMovieContext.mMusic != null) {
            cVar.f72036e = photoMovieContext.mMusic;
        }
        cVar.mo70186a(photoMovieContext.mCoverStartTm);
        cVar.f72038g = photoMovieContext.mMusicPath;
        cVar.f72018F = System.currentTimeMillis();
        cVar.f72017E = C35563c.f93260w.mo57091d();
        cVar.mo70274k(C35563c.f93250m.mo83215a(photoMovieContext.poiId));
        cVar.mo70201a(photoMovieContext.mSaveModel);
        C42311e.m134571a(C40005j.m127910a((BaseShortVideoContext) photoMovieContext), C40005j.m127907a(cVar.f72031S), Scene.PUBLISH, Scene.DRAFT);
        cVar.f72031S.f72002p = photoMovieContext.poiData;
        if (photoMovieContext.draftEditTransferModel != null) {
            cVar.f72035d = photoMovieContext.getDraftPrimaryKey();
        }
        photoMovieContext.draftEditTransferModel = new DraftEditTransferModel(cVar.mo70221aj(), null);
        return cVar;
    }
}
