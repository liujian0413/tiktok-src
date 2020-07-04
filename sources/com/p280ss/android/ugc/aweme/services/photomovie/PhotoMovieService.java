package com.p280ss.android.ugc.aweme.services.photomovie;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.net.Uri;
import android.text.TextUtils;
import com.p280ss.android.medialib.model.CoverInfo;
import com.p280ss.android.medialib.photomovie.MovieCover;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p1059d.p1060a.C23319b;
import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.photo.C34731e;
import com.p280ss.android.ugc.aweme.photomovie.C34937u;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext.C34822a;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContextOld;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContextOld.C34824a;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieEditActivity;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p280ss.android.ugc.aweme.utils.C43142i;
import com.p280ss.android.ugc.aweme.utils.MediaType;
import java.io.File;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.services.photomovie.PhotoMovieService */
public class PhotoMovieService implements IPhotoMovieService {
    public void getPhotoMovieCover(final PhotoMovieContext photoMovieContext, final C34822a aVar) {
        C6726a.m20842a(new Runnable() {
            public void run() {
                if (photoMovieContext.mImageList != null) {
                    String[] strArr = new String[photoMovieContext.mImageList.size()];
                    for (int i = 0; i < strArr.length; i++) {
                        strArr[i] = (String) photoMovieContext.mImageList.get(i);
                    }
                    CoverInfo cover = new MovieCover().getCover(C43142i.m136844a(strArr, MediaType.IMAGE), photoMovieContext.mFilterPath, photoMovieContext.mPlayType, (long) (photoMovieContext.mCoverStartTm * 1000.0f), (int) PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH, (int) PhotoMovieContext.PHOTO_MOVIE_COVER_HEIGHT);
                    if (cover == null || cover.getData() == null) {
                        if (!TextUtils.isEmpty(photoMovieContext.getPhotoMovieCover())) {
                            C23323e.m76501a(C34731e.m112065a(Uri.fromFile(new File(photoMovieContext.getPhotoMovieCover()))), (int) PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH, (int) PhotoMovieContext.PHOTO_MOVIE_COVER_HEIGHT, (C23319b<Bitmap>) new C23319b<Bitmap>() {
                                public void accept(Bitmap bitmap) {
                                    aVar.mo70305a(bitmap, PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH, PhotoMovieContext.PHOTO_MOVIE_COVER_HEIGHT);
                                }
                            });
                        }
                        return;
                    }
                    aVar.mo70305a(Bitmap.createBitmap(cover.getData(), cover.getWidth(), cover.getHeight(), Config.ARGB_8888), cover.getWidth(), cover.getHeight());
                }
            }
        });
    }

    public void getPhotoMovieCover(final PhotoMovieContextOld photoMovieContextOld, final C34824a aVar) {
        C6726a.m20842a(new Runnable() {
            public void run() {
                if (photoMovieContextOld.f90819b != null) {
                    String[] strArr = new String[photoMovieContextOld.f90819b.size()];
                    for (int i = 0; i < strArr.length; i++) {
                        strArr[i] = (String) photoMovieContextOld.f90819b.get(i);
                    }
                    CoverInfo cover = new MovieCover().getCover(C43142i.m136844a(strArr, MediaType.IMAGE), photoMovieContextOld.f90829l, photoMovieContextOld.f90824g, (long) (photoMovieContextOld.f90827j * 1000.0f), (int) PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH, (int) PhotoMovieContext.PHOTO_MOVIE_COVER_HEIGHT);
                    if (cover == null || cover.getData() == null) {
                        if (!TextUtils.isEmpty(photoMovieContextOld.mo88329a())) {
                            C23323e.m76501a(C34731e.m112065a(Uri.fromFile(new File(photoMovieContextOld.mo88329a()))), (int) PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH, (int) PhotoMovieContext.PHOTO_MOVIE_COVER_HEIGHT, (C23319b<Bitmap>) new C23319b<Bitmap>() {
                                public void accept(Bitmap bitmap) {
                                }
                            });
                        }
                        return;
                    }
                    Bitmap.createBitmap(cover.getData(), cover.getWidth(), cover.getHeight(), Config.ARGB_8888);
                    cover.getWidth();
                    cover.getHeight();
                }
            }
        });
    }

    public void startEditDraftActivity(Context context, C27311c cVar, List<MusicModel> list) {
        C34937u.m112585a(context, cVar, C35563c.f93246i.mo103853a(list));
    }

    public void toPhotoMovieEditActivity(Context context, PhotoMovieContext photoMovieContext, List<MusicModel> list, String str) {
        PhotoMovieEditActivity.m112309a(context, photoMovieContext, C35563c.f93246i.mo103853a(list), str);
    }
}
