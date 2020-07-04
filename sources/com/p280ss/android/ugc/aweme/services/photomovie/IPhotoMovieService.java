package com.p280ss.android.ugc.aweme.services.photomovie;

import android.content.Context;
import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext.C34822a;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContextOld;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContextOld.C34824a;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.services.photomovie.IPhotoMovieService */
public interface IPhotoMovieService {
    void getPhotoMovieCover(PhotoMovieContext photoMovieContext, C34822a aVar);

    void getPhotoMovieCover(PhotoMovieContextOld photoMovieContextOld, C34824a aVar);

    void startEditDraftActivity(Context context, C27311c cVar, List<MusicModel> list);

    void toPhotoMovieEditActivity(Context context, PhotoMovieContext photoMovieContext, List<MusicModel> list, String str);
}
