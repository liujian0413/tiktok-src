package com.p280ss.android.ugc.aweme.photomovie;

import android.content.Context;
import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.draft.model.DraftEditTransferModel;
import com.p280ss.android.ugc.aweme.p1001al.C22488a;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.photomovie.u */
public final class C34937u {
    /* renamed from: a */
    public static void m112585a(Context context, C27311c cVar, List<AVMusic> list) {
        PhotoMovieContext photoMovieContext = cVar.f72034c;
        if (photoMovieContext != null && cVar.f72033b != null) {
            photoMovieContext.challenges = cVar.f72033b.f71935c;
            photoMovieContext.title = cVar.f72033b.f71933a;
            photoMovieContext.structList = cVar.f72033b.f71934b;
            photoMovieContext.isPrivate = cVar.f72013A;
            photoMovieContext.mIsFromDraft = true;
            photoMovieContext.mFrom = 1;
            photoMovieContext.poiId = cVar.mo70167I();
            photoMovieContext.mSaveModel = cVar.mo70166H();
            photoMovieContext.draftEditTransferModel = new DraftEditTransferModel(cVar.mo70221aj(), null);
            C22488a.m74376a().mo59051a(context, photoMovieContext, list);
        }
    }

    /* renamed from: a */
    public static void m112586a(Context context, PhotoMovieContext photoMovieContext, List<AVMusic> list, String str) {
        PhotoMovieEditActivity.m112309a(context, photoMovieContext, list, str);
    }
}
