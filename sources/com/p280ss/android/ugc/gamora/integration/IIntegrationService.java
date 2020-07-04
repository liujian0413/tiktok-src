package com.p280ss.android.ugc.gamora.integration;

import android.content.Context;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.gamora.bottomtab.C43868d;
import com.p280ss.android.ugc.gamora.recorder.toolbar.C44781c;
import java.util.List;

/* renamed from: com.ss.android.ugc.gamora.integration.IIntegrationService */
public interface IIntegrationService extends C44389a, C44390b {
    C44781c getToolbarManager(C43868d dVar);

    void openPhotoMovieActivity(Context context, PhotoMovieContext photoMovieContext, List<? extends AVMusic> list, String str);
}
