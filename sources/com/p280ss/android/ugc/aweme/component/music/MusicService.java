package com.p280ss.android.ugc.aweme.component.music;

import android.app.ProgressDialog;
import android.content.Context;
import android.widget.TextView;
import bolts.C1591g;
import bolts.C1592h;
import com.C1642a;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.gson.C6709k;
import com.p280ss.android.ugc.aweme.choosemusic.api.ChooseMusicApi;
import com.p280ss.android.ugc.aweme.choosemusic.p1092f.C23889d;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.music.C33672a;
import com.p280ss.android.ugc.aweme.music.C33788d;
import com.p280ss.android.ugc.aweme.music.api.MusicApi;
import com.p280ss.android.ugc.aweme.music.experiment.MusicPartnersExperiment;
import com.p280ss.android.ugc.aweme.music.model.CollectedMusicList;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.music.model.MusicList;
import com.p280ss.android.ugc.aweme.music.p1406ab.C33703a;
import com.p280ss.android.ugc.aweme.music.p1409c.C33775a;
import com.p280ss.android.ugc.aweme.music.p1409c.C33775a.C33780a;
import com.p280ss.android.ugc.aweme.music.p1409c.C33784d;
import com.p280ss.android.ugc.aweme.music.p1409c.C33785e;
import com.p280ss.android.ugc.aweme.music.p1410ui.C33914a;
import com.p280ss.android.ugc.aweme.music.p1410ui.C33929af;
import com.p280ss.android.ugc.aweme.music.p1410ui.C33951d;
import com.p280ss.android.ugc.aweme.music.p1410ui.C34018y;
import com.p280ss.android.ugc.aweme.music.p1410ui.p1411a.C33915a;
import com.p280ss.android.ugc.aweme.music.p1410ui.p1411a.C33916b;
import com.p280ss.android.ugc.aweme.music.p1410ui.p1411a.C33917c;
import com.p280ss.android.ugc.aweme.music.p1410ui.p1411a.C33918d;
import com.p280ss.android.ugc.aweme.music.service.C33830a;
import com.p280ss.android.ugc.aweme.music.service.IMusicService;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel.MusicType;
import com.p280ss.android.ugc.aweme.shortvideo.model.SuggestMusicList;
import com.p280ss.android.ugc.p1716b.C43656b;
import com.p280ss.android.ugc.p1716b.p1717a.C43651a;
import com.p280ss.android.ugc.p1716b.p1718b.C43657a;
import java.util.List;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.component.music.MusicService */
public class MusicService implements IMusicService {

    /* renamed from: com.ss.android.ugc.aweme.component.music.MusicService$a */
    static class C25802a {

        /* renamed from: a */
        public static final MusicService f68218a = new MusicService();
    }

    public static MusicService getInstance() {
        return C25802a.f68218a;
    }

    public void initService() {
        C33918d.m109333a();
    }

    public int getMusicDownloadStrategy() {
        return C33915a.m109326a();
    }

    public boolean isUseDownloader() {
        return C33915a.m109328b();
    }

    public C1592h<List<MusicModel>> refreshHotMusicList() {
        return ChooseMusicApi.m78099a().getHotMusicList(0, 10).mo6875a((C1591g<TResult, TContinuationResult>) new C1591g<MusicList, List<MusicModel>>() {
            public final /* synthetic */ Object then(C1592h hVar) throws Exception {
                return m84797a(hVar);
            }

            /* renamed from: a */
            private static List<MusicModel> m84797a(C1592h<MusicList> hVar) throws Exception {
                if (hVar.mo6887c() || hVar.mo6889d() || hVar.mo6890e() == null) {
                    return null;
                }
                return C23889d.m78218a(((MusicList) hVar.mo6890e()).items);
            }
        });
    }

    public boolean getIsUseMusicPartnersNewStyle() {
        if (!C6399b.m19944t() || !C6384b.m19835a().mo15292a(MusicPartnersExperiment.class, true, "music_detail_music_partners_new_style", C6384b.m19835a().mo15295d().music_detail_music_partners_new_style, false)) {
            return false;
        }
        return true;
    }

    public void initMusicDownloadStrategy(int i) {
        C33915a.m109327a(i);
    }

    public void updateMusicAbTestModel(C6709k kVar) {
        C33703a.m108717a(kVar);
    }

    public List<String> getMusicCoverUrl(String str) {
        return C33918d.f88507a.mo86580a(str);
    }

    public long getMusicDuration(String str) {
        return C33784d.m108918a(str);
    }

    public String getRhythmMusicFilePath(String str) {
        return C33785e.m108939a(str);
    }

    public C33672a provideMusicDownloadPlayHelper(C33951d dVar) {
        return new C33914a(dVar);
    }

    public String formatVideoDuration(int i) {
        if (i <= 0) {
            return "";
        }
        int i2 = i / 1000;
        int i3 = i2 % 60;
        int i4 = i2 / 60;
        int i5 = i4 / 60;
        int i6 = i4 % 60;
        if (i5 == 0) {
            return C1642a.m8035a(Locale.CHINA, "%02d:%02d", new Object[]{Integer.valueOf(i6), Integer.valueOf(i3)});
        }
        return C1642a.m8035a(Locale.CHINA, "%02d:%02d:%02d", new Object[]{Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i3)});
    }

    public C1592h<SuggestMusicList> refreshSuggestList(String str, String str2) {
        return refreshSuggestList(str, str2, "");
    }

    public Music fetchMusicById(String str, int i) {
        try {
            Music music = MusicApi.m108887a(str, i).music;
            if (music != null) {
                return music;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public C1592h<CollectedMusicList> userCollectedMusicList(int i, int i2) {
        return ChooseMusicApi.m78099a().userCollectedMusicList(i, i2);
    }

    public C1592h<SuggestMusicList> refreshSuggestLyricList(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().recommentMusicByAIPolicy());
        return ChooseMusicApi.m78099a().getRecommenLyricMusicListFromAI(0, 50, "shoot_page", str, sb.toString(), str2, "aweme_sticker").mo6875a((C1591g<TResult, TContinuationResult>) new C1591g<MusicList, SuggestMusicList>() {
            public final /* synthetic */ Object then(C1592h hVar) throws Exception {
                return m84796a(hVar);
            }

            /* renamed from: a */
            private static SuggestMusicList m84796a(C1592h<MusicList> hVar) throws Exception {
                if (hVar.mo6889d() || hVar.mo6887c() || hVar.mo6890e() == null) {
                    return null;
                }
                SuggestMusicList suggestMusicList = new SuggestMusicList();
                suggestMusicList.musicList = C23889d.m78218a(((MusicList) hVar.mo6890e()).items);
                suggestMusicList.musicType = Integer.valueOf(((MusicList) hVar.mo6890e()).mMusicType);
                suggestMusicList.logPb = ((MusicList) hVar.mo6890e()).logPb;
                return suggestMusicList;
            }
        });
    }

    public void downloadMusic(MusicModel musicModel, final C33788d dVar) {
        C43657a aVar = new C43657a();
        C43656b bVar = new C43656b();
        C33929af afVar = new C33929af(null, C34018y.f88721o);
        afVar.mo86590a(new C33788d() {
            /* renamed from: a */
            public final void mo67058a(String str, int i, String str2, int i2) {
                dVar.mo67058a(str, i, str2, i2);
            }

            /* renamed from: a */
            public final void mo67059a(String str, int i, String str2, Exception exc) {
                dVar.mo67059a(str, i, str2, exc);
            }

            /* renamed from: a */
            public final void mo67060a(String str, int i, String str2, float[] fArr) {
                dVar.mo67060a(str, i, str2, fArr);
            }
        });
        bVar.mo105599a((C43651a) afVar);
        bVar.mo105606a(((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getMusicService().mo83260a(musicModel.getMusicId(), "draft_page"));
        if (musicModel.getMusicType() == MusicType.ONLINE) {
            aVar.f112969b = 4;
            aVar.f112968a = musicModel.getPath();
            bVar.mo105609b(aVar);
            return;
        }
        aVar.f112969b = 3;
        aVar.f112968a = musicModel.getPath();
        bVar.mo105609b(aVar);
    }

    public void mobMusicDownloadStart(String str, String str2, String str3) {
        C33916b.m109329a(str, str2, str3);
    }

    public void attachPartnerTag(TextView textView, Music music, boolean z) {
        C33918d.f88507a.mo86581a(textView, music, z);
    }

    public boolean checkValidMusic(MusicModel musicModel, Context context, boolean z) {
        return C33784d.m108931a(musicModel, context, z);
    }

    public C1592h<SuggestMusicList> refreshSuggestList(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().recommentMusicByAIPolicy());
        return ChooseMusicApi.m78099a().getRecommenMusicListFromAI(0, 10, "shoot_page", str, sb.toString(), str2, str3).mo6875a((C1591g<TResult, TContinuationResult>) new C1591g<MusicList, SuggestMusicList>() {
            public final /* synthetic */ Object then(C1592h hVar) throws Exception {
                return m84795a(hVar);
            }

            /* renamed from: a */
            private static SuggestMusicList m84795a(C1592h<MusicList> hVar) throws Exception {
                if (hVar.mo6889d() || hVar.mo6887c() || hVar.mo6890e() == null) {
                    return null;
                }
                SuggestMusicList suggestMusicList = new SuggestMusicList();
                suggestMusicList.musicList = C23889d.m78218a(((MusicList) hVar.mo6890e()).items);
                suggestMusicList.musicType = Integer.valueOf(((MusicList) hVar.mo6890e()).mMusicType);
                suggestMusicList.logPb = ((MusicList) hVar.mo6890e()).logPb;
                return suggestMusicList;
            }
        });
    }

    public void mobMusicDownloadFail(String str, String str2, String str3, String str4) {
        C33916b.m109331a(str, str2, str3, str4);
    }

    public void monitorMusicDownload(String str, long j, String str2, int i) {
        C33917c.m109332a(str, j, str2, i);
    }

    public boolean checkValidMusic(MusicModel musicModel, Context context, boolean z, boolean z2) {
        return C33784d.m108932a(musicModel, context, z, z2);
    }

    public void mobMusicDownloadSuccess(String str, String str2, String str3, long j, long j2) {
        C33916b.m109330a(str, str2, str3, Long.valueOf(j), Long.valueOf(j2));
    }

    public void fetchMusicDetail(Context context, String str, int i, ProgressDialog progressDialog, final C33830a aVar) {
        MusicModel musicModel;
        try {
            final Music music = MusicApi.m108887a(str, 0).music;
            C33775a aVar2 = new C33775a(context, progressDialog);
            if (music != null) {
                musicModel = music.convertToMusicModel();
            } else {
                musicModel = null;
            }
            aVar2.mo86190a(musicModel, new C33780a() {
                /* renamed from: a */
                public final void mo67056a(Exception exc) {
                    if (aVar != null) {
                        aVar.mo59431a(exc);
                    }
                }

                /* renamed from: a */
                public final void mo67057a(String str) {
                    MusicModel musicModel;
                    if (aVar != null) {
                        try {
                            if (music != null) {
                                musicModel = music.convertToMusicModel();
                            } else {
                                musicModel = null;
                            }
                            aVar.mo59432a(str, musicModel);
                        } catch (Exception e) {
                            aVar.mo59431a(e);
                        }
                    }
                }
            });
        } catch (Exception e) {
            if (aVar != null) {
                aVar.mo59431a(e);
            }
        }
    }
}
