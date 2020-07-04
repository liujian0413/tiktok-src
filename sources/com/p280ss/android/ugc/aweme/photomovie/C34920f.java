package com.p280ss.android.ugc.aweme.photomovie;

import android.content.Context;
import android.text.TextUtils;
import bolts.C1591g;
import bolts.C1592h;
import com.google.common.util.concurrent.C18245g;
import com.google.common.util.concurrent.C18246h;
import com.google.common.util.concurrent.C18253l;
import com.google.common.util.concurrent.C18254m;
import com.p280ss.android.medialib.FFMpegManager;
import com.p280ss.android.medialib.photomovie.PhotoMovie;
import com.p280ss.android.medialib.photomovie.PhotoMovie.C19757b;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.C23364n;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.p1048ax.C23139a;
import com.p280ss.android.ugc.aweme.photo.p1451a.C34727a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.C38452am;
import com.p280ss.android.ugc.aweme.shortvideo.C38455ap;
import com.p280ss.android.ugc.aweme.shortvideo.C39359dv;
import com.p280ss.android.ugc.aweme.shortvideo.C39799ej;
import com.p280ss.android.ugc.aweme.shortvideo.C39811er;
import com.p280ss.android.ugc.aweme.shortvideo.C39815ev;
import com.p280ss.android.ugc.aweme.shortvideo.SynthetiseException;
import com.p280ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.p280ss.android.ugc.aweme.shortvideo.model.VideoCreation;
import com.p280ss.android.ugc.aweme.shortvideo.p1551c.C38566l;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.vesdk.filterparam.VETransitionFilterParam;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.ugc.aweme.photomovie.f */
public final class C34920f {
    /* renamed from: a */
    public final C39359dv<SynthetiseResult> mo88487a(Object obj) {
        return m112560a((PhotoMovieContext) obj);
    }

    /* renamed from: b */
    public static long m112563b(Object obj) {
        return new File(((PhotoMovieContext) obj).mOutputVideoPath).length();
    }

    /* renamed from: a */
    private C39359dv<SynthetiseResult> m112560a(final PhotoMovieContext photoMovieContext) {
        C349211 r0 = new C39359dv<SynthetiseResult>("PhotoMovieCompiler") {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ Void mo88488a(PhotoMovieContext photoMovieContext, C1592h hVar) throws Exception {
                if (hVar.mo6887c()) {
                    mo47087a((Throwable) new CancellationException());
                } else if (hVar.mo6889d()) {
                    mo47087a((Throwable) hVar.mo6891f());
                } else {
                    if (photoMovieContext.isSaveLocalWithoutWaterMark()) {
                        C7276d.m22822e(C39811er.f103476l);
                        C7276d.m22820d(photoMovieContext.mOutputVideoPath, photoMovieContext.getLocalTempPath());
                    }
                    mo47088b(hVar.mo6890e());
                }
                return null;
            }

            {
                C1592h.m7855a((Callable<TResult>) new Callable<SynthetiseResult>() {
                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public SynthetiseResult call() {
                        Integer num;
                        int i;
                        StringBuilder sb = new StringBuilder();
                        for (String append : photoMovieContext.mImageList) {
                            sb.append(append);
                            sb.append(",");
                        }
                        C6893q.m21447a("photo_movie_edit_log", new C6869c().mo16885a("mVideoLength", Integer.valueOf(photoMovieContext.getVideoLength())).mo16885a("mFilterId", Integer.valueOf(photoMovieContext.mFilterId)).mo16887a("image_list", sb.toString()).mo16888b());
                        SynthetiseResult synthetiseResult = new SynthetiseResult();
                        synthetiseResult.isFromDraft = photoMovieContext.mIsFromDraft;
                        synthetiseResult.outputFile = photoMovieContext.mOutputVideoPath;
                        synthetiseResult.isMusic = 1;
                        synthetiseResult.outputWavFile = photoMovieContext.mInputAudioPath;
                        String[] strArr = new String[photoMovieContext.mImageList.size()];
                        photoMovieContext.mImageList.toArray(strArr);
                        C19757b bVar = new C19757b();
                        bVar.f53619a = strArr;
                        bVar.f53626h = photoMovieContext.mFilterPath;
                        bVar.f53625g = photoMovieContext.mPlayType;
                        photoMovieContext.mWidth = C35563c.f93255r.getVideoWidth();
                        photoMovieContext.mHeight = C35563c.f93255r.getVideoHeight();
                        synthetiseResult.videoWidth = photoMovieContext.mWidth;
                        synthetiseResult.videoHeight = photoMovieContext.mHeight;
                        bVar.f53624f = new int[]{photoMovieContext.mWidth, photoMovieContext.mHeight};
                        bVar.f53621c = photoMovieContext.mOutputVideoPath;
                        bVar.f53620b = photoMovieContext.mInputAudioPath;
                        File parentFile = new File(photoMovieContext.mOutputVideoPath).getParentFile();
                        if (parentFile.exists() || parentFile.mkdirs()) {
                            if (photoMovieContext.mMusicPath != null) {
                                int a = FFMpegManager.m64569a().mo51826a(photoMovieContext.mMusicPath, photoMovieContext.mInputAudioPath, 0, (long) photoMovieContext.getVideoLength());
                                if (a != 0) {
                                    synthetiseResult.ret = a;
                                    StringBuilder sb2 = new StringBuilder("Resample failed, ret = ");
                                    sb2.append(a);
                                    throw new SynthetiseException(sb2.toString(), synthetiseResult);
                                }
                            }
                            Integer.valueOf(0);
                            if (photoMovieContext.photoTime == 0 || photoMovieContext.transTime == 0) {
                                num = Integer.valueOf(PhotoMovie.calulateDuration(bVar));
                                bVar.f53629k.f53634b = 2500;
                                bVar.f53629k.f53635c = VETransitionFilterParam.TransitionDuration_DEFAULT;
                            } else {
                                if (bVar.f53619a.length == 0) {
                                    i = 0;
                                } else {
                                    i = (bVar.f53619a.length * photoMovieContext.photoTime) - photoMovieContext.transTime;
                                }
                                num = Integer.valueOf(i);
                                bVar.f53629k.f53634b = photoMovieContext.photoTime;
                                bVar.f53629k.f53635c = photoMovieContext.transTime;
                            }
                            Integer num2 = num;
                            bVar.f53622d = new String[]{"description"};
                            bVar.f53623e = new String[]{C38566l.m123251a(false, true, null, null, num2, Integer.valueOf(photoMovieContext.mWidth), Integer.valueOf(photoMovieContext.mHeight))};
                            bVar.f53630l = new C34924h(this);
                            PhotoMovie instance = PhotoMovie.getInstance();
                            if (photoMovieContext.isSaveLocalWithWaterMark()) {
                                C34920f.m112561a(photoMovieContext, instance);
                                PhotoMovie.setPhotoMovieListener(C34925i.f91098a);
                            }
                            int synthetise = instance.synthetise(bVar);
                            synthetiseResult.ret = synthetise;
                            if (synthetise != 0) {
                                throw new SynthetiseException("Photo movie synthesise failed.", synthetiseResult);
                            } else if (synthetiseResult.outputFile != null && new File(synthetiseResult.outputFile).exists() && new File(synthetiseResult.outputFile).length() != 0) {
                                return synthetiseResult;
                            } else {
                                synthetiseResult.ret = 10038;
                                throw new SynthetiseException("OnSynthetiseFinish failed. ret = 0 but file does not exist in movie", synthetiseResult);
                            }
                        } else {
                            throw new SynthetiseException("mkdirs failed.", synthetiseResult);
                        }
                    }

                    /* access modifiers changed from: 0000 */
                    /* renamed from: b */
                    public final /* synthetic */ void mo88489b(int i) {
                        C349211.this.mo97923a(i);
                    }
                }, (Executor) C39815ev.f103488a).mo6875a((C1591g<TResult, TContinuationResult>) new C34923g<TResult,TContinuationResult>(this, photoMovieContext));
            }
        };
        C18246h.m60214a((C18253l<V>) r0, (C18245g<? super V>) new C34936t<Object>(), C18254m.m60217a());
        return r0;
    }

    /* renamed from: c */
    public static boolean m112564c(Object obj) {
        boolean z;
        String str;
        PhotoMovieContext photoMovieContext = (PhotoMovieContext) obj;
        if (!photoMovieContext.isSaveLocal()) {
            return false;
        }
        String localTempPath = photoMovieContext.getLocalTempPath();
        boolean isSaveToLocalPathInsteadOfAlbum = photoMovieContext.isSaveToLocalPathInsteadOfAlbum();
        if (photoMovieContext.isSaveToAlbum() || !isSaveToLocalPathInsteadOfAlbum) {
            z = true;
        } else {
            z = false;
        }
        if (TextUtils.isEmpty(localTempPath) || !new File(localTempPath).exists() || new File(localTempPath).length() <= 0) {
            return false;
        }
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append(C23139a.m76055a(C35563c.f93238a));
            sb.append(new File(localTempPath).getName());
            str = sb.toString();
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C35563c.f93259v.mo83146a((Context) C35563c.f93238a));
            sb2.append(new File(localTempPath).getName());
            str = sb2.toString();
        }
        C7276d.m22820d(localTempPath, str);
        photoMovieContext.mSaveModel.setLocalFinalPath(str);
        if (z) {
            C34727a.m112060a(C35563c.f93238a, str);
        }
        return true;
    }

    /* renamed from: a */
    public static void m112561a(PhotoMovieContext photoMovieContext, PhotoMovie photoMovie) {
        PhotoMovieContext photoMovieContext2 = photoMovieContext;
        photoMovie.setMarkParam(C35563c.f93256s.mo83286a(photoMovieContext2.mOutputVideoPath, photoMovieContext2.mWidth, photoMovieContext2.mHeight, photoMovieContext2.mSaveModel.getSaveType()), photoMovieContext.getLocalTempPath(), false, 2, 0, C39799ej.m127421b(photoMovieContext2.mSaveModel.getSaveType()), 0, 16, 20);
    }

    /* renamed from: a */
    static void m112562a(PhotoMovieContext photoMovieContext, SynthetiseResult synthetiseResult, LinkedHashMap<String, String> linkedHashMap) {
        String str;
        String str2;
        linkedHashMap.put("video_type", "6");
        if (photoMovieContext.mMusic != null) {
            linkedHashMap.put("music_id", String.valueOf(photoMovieContext.mMusic.getId()));
        }
        if (!TextUtils.isEmpty(photoMovieContext.creationId)) {
            linkedHashMap.put("creation_id", photoMovieContext.creationId);
        }
        linkedHashMap.put("original", "0");
        String str3 = "transition_type";
        if (photoMovieContext.mPlayType == 0) {
            str = "1";
        } else {
            str = "2";
        }
        linkedHashMap.put(str3, str);
        if (!TextUtils.isEmpty(photoMovieContext.shopDraftId)) {
            linkedHashMap.put("shop_draft_id", photoMovieContext.shopDraftId);
        }
        if (!TextUtils.isEmpty(photoMovieContext.mFilterName)) {
            linkedHashMap.put("filter_name", photoMovieContext.mFilterName);
        }
        if (photoMovieContext.mFilterId > 0) {
            linkedHashMap.put("filter_id", String.valueOf(photoMovieContext.mFilterId));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(photoMovieContext.mCoverStartTm);
        linkedHashMap.put("cover_tsp", sb.toString());
        new C39815ev().mo99236a((BaseShortVideoContext) photoMovieContext, synthetiseResult, linkedHashMap);
        HashMap a = C35563c.f93257t.mo83274a((Object) photoMovieContext);
        if (!a.isEmpty()) {
            linkedHashMap.putAll(a);
        }
        linkedHashMap.put("video_cnt", "0");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(photoMovieContext.mRealImageCount);
        linkedHashMap.put("pic_cnt", sb2.toString());
        String str4 = "is_multi_content";
        if (photoMovieContext.mRealImageCount > 1) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        linkedHashMap.put(str4, str2);
        if (photoMovieContext.poiServerMobParam != null) {
            linkedHashMap.putAll(photoMovieContext.poiServerMobParam);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C18253l<? extends C38455ap> mo88486a(PhotoMovieContext photoMovieContext, VideoCreation videoCreation, SynthetiseResult synthetiseResult, LinkedHashMap<String, String> linkedHashMap) {
        m112562a(photoMovieContext, synthetiseResult, linkedHashMap);
        C18253l<? extends C38455ap> a = C35563c.f93257t.mo83273a(videoCreation.materialId, linkedHashMap);
        C18246h.m60214a(a, (C18245g<? super V>) new C38452am<Object>(), (Executor) C23364n.f61448a);
        return a;
    }
}
