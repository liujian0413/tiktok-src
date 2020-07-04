package com.p280ss.android.ugc.aweme.status.repository;

import android.support.p022v4.app.FragmentActivity;
import com.google.common.util.concurrent.C18245g;
import com.google.common.util.concurrent.C18246h;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.socialbase.downloader.downloader.Downloader;
import com.p280ss.android.socialbase.downloader.exception.BaseException;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.socialbase.downloader.model.DownloadTask;
import com.p280ss.android.ugc.aweme.base.C23364n;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.port.p1479in.C35603z;
import com.p280ss.android.ugc.aweme.status.p1631a.C41805b;
import com.p280ss.android.ugc.aweme.tools.AVApi;
import java.io.File;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.status.repository.StatusMusicListRepository */
public final class StatusMusicListRepository {
    public static final C41825a Companion = new C41825a(null);
    private FragmentActivity activity;
    private final IRetrofit retrofit;

    /* renamed from: com.ss.android.ugc.aweme.status.repository.StatusMusicListRepository$RetrofitService */
    public interface RetrofitService {
        @C7730f(mo20420a = "/aweme/v1/music/list/")
        C18253l<C41827b> getMusicListmusicList(@C7744t(mo20436a = "scene") String str, @C7744t(mo20436a = "cursor") int i, @C7744t(mo20436a = "count") int i2, @C7744t(mo20436a = "region") String str2);
    }

    /* renamed from: com.ss.android.ugc.aweme.status.repository.StatusMusicListRepository$a */
    public static final class C41825a {
        private C41825a() {
        }

        public /* synthetic */ C41825a(C7571f fVar) {
            this();
        }
    }

    public final FragmentActivity getActivity() {
        return this.activity;
    }

    public final IRetrofit getRetrofit() {
        return this.retrofit;
    }

    public final void setActivity(FragmentActivity fragmentActivity) {
        C7573i.m23587b(fragmentActivity, "<set-?>");
        this.activity = fragmentActivity;
    }

    public StatusMusicListRepository(FragmentActivity fragmentActivity, final Callback callback) {
        C7573i.m23587b(fragmentActivity, "activity");
        C7573i.m23587b(callback, "cb");
        this.activity = fragmentActivity;
        IRetrofitService iRetrofitService = (IRetrofitService) ServiceManager.get().getService(IRetrofitService.class);
        Object service = ServiceManager.get().getService(AVApi.class);
        C7573i.m23582a(service, "ServiceManager.get().getService(AVApi::class.java)");
        IRetrofit createNewRetrofit = iRetrofitService.createNewRetrofit(((AVApi) service).getAPI_URL_PREFIX_SI());
        C7573i.m23582a((Object) createNewRetrofit, "ServiceManager.get().get….java).apI_URL_PREFIX_SI)");
        this.retrofit = createNewRetrofit;
        C35603z zVar = C35563c.f93245h;
        C7573i.m23582a((Object) zVar, "AVEnv.LOCATION_SERVICE");
        String c = zVar.mo83209c();
        C7573i.m23582a((Object) c, "AVEnv.LOCATION_SERVICE.region");
        C18246h.m60214a(((RetrofitService) this.retrofit.create(RetrofitService.class)).getMusicListmusicList("status", 0, 30, c), (C18245g<? super V>) new C18245g<C41827b>(this) {

            /* renamed from: a */
            final /* synthetic */ StatusMusicListRepository f108791a;

            /* renamed from: com.ss.android.ugc.aweme.status.repository.StatusMusicListRepository$1$a */
            public static final class C41824a extends C41805b {

                /* renamed from: a */
                final /* synthetic */ C418231 f108793a;

                /* renamed from: b */
                final /* synthetic */ Music f108794b;

                public final void onProgress(DownloadInfo downloadInfo) {
                    super.onProgress(downloadInfo);
                    callback.onProgress(downloadInfo);
                }

                public final void onSuccessed(DownloadInfo downloadInfo) {
                    super.onSuccessed(downloadInfo);
                    callback.callback(this.f108794b);
                }

                C41824a(C418231 r1, Music music) {
                    this.f108793a = r1;
                    this.f108794b = music;
                }

                public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                    super.onFailed(downloadInfo, baseException);
                    callback.callback(null);
                }
            }

            public final void onFailure(Throwable th) {
                C7573i.m23587b(th, "t");
                callback.callback(null);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onSuccess(C41827b bVar) {
                if (bVar != null && bVar.f108800a != null) {
                    List<? extends Music> list = bVar.f108800a;
                    if (list == null) {
                        C7573i.m23580a();
                    }
                    if (!list.isEmpty()) {
                        List<? extends Music> list2 = bVar.f108800a;
                        if (list2 == null) {
                            C7573i.m23580a();
                        }
                        double random = Math.random();
                        List<? extends Music> list3 = bVar.f108800a;
                        if (list3 == null) {
                            C7573i.m23580a();
                        }
                        double size = (double) (list3.size() - 1);
                        Double.isNaN(size);
                        Music music = (Music) list2.get((int) (random * size));
                        UrlModel playUrl = music.getPlayUrl();
                        C7573i.m23582a((Object) playUrl, "music.playUrl");
                        String uri = playUrl.getUri();
                        C7573i.m23582a((Object) uri, "music.playUrl.uri");
                        List b = C7634n.m23768b((CharSequence) uri, new String[]{"/"}, false, 0);
                        StringBuilder sb = new StringBuilder();
                        File filesDir = C35574k.m114861b().getFilesDir();
                        C7573i.m23582a((Object) filesDir, "CameraClient.getApplication().getFilesDir()");
                        sb.append(filesDir.getAbsolutePath());
                        sb.append(File.separator);
                        sb.append("status");
                        sb.append((String) b.get(b.size() - 1));
                        File file = new File(sb.toString());
                        music.setPath(file.getAbsolutePath());
                        DownloadTask with = Downloader.with(this.f108791a.getActivity());
                        UrlModel playUrl2 = music.getPlayUrl();
                        C7573i.m23582a((Object) playUrl2, "music.playUrl");
                        with.url(playUrl2.getUri()).savePath(file.getParent()).name(file.getName()).mainThreadListener(new C41824a(this, music)).download();
                    }
                }
            }

            {
                this.f108791a = r1;
            }
        }, (Executor) C23364n.f61448a);
    }
}
