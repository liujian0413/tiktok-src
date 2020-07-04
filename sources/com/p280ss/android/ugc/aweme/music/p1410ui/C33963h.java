package com.p280ss.android.ugc.aweme.music.p1410ui;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import bolts.C1592h;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.framwork.core.monitor.C6379c;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.facebook.network.connectionclass.C14143b;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.music.C33788d;
import com.p280ss.android.ugc.aweme.music.p1409c.C33784d;
import com.p280ss.android.ugc.aweme.music.service.IMusicService;
import com.p280ss.android.ugc.aweme.port.p1479in.C35546al.C35547a;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel.MusicType;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.p280ss.android.ugc.aweme.utils.C42973bg;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.ugc.iesdownload.C44850c;
import com.p280ss.android.ugc.iesdownload.p1745b.C44849d;
import com.p280ss.android.ugc.p1716b.C43656b;
import com.p280ss.android.ugc.p1716b.p1717a.C43651a;
import com.p280ss.android.ugc.p1716b.p1718b.C43657a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.Collection;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.music.ui.h */
public final class C33963h {

    /* renamed from: a */
    public C43656b f88596a = new C43656b();

    /* renamed from: b */
    public Activity f88597b;

    /* renamed from: c */
    public C33970a f88598c;

    /* renamed from: d */
    public int f88599d;

    /* renamed from: e */
    public boolean f88600e;

    /* renamed from: f */
    public long f88601f;

    /* renamed from: g */
    private C6309f f88602g;

    /* renamed from: com.ss.android.ugc.aweme.music.ui.h$a */
    interface C33970a {
        /* renamed from: a */
        void mo86461a(MusicModel musicModel);

        /* renamed from: a */
        void mo86462a(String str, MusicModel musicModel);

        /* renamed from: a_ */
        void mo86463a_(int i, int i2);

        void bq_();

        /* renamed from: i */
        void mo86466i();

        /* renamed from: j */
        void mo86467j();

        /* renamed from: k */
        void mo86468k();

        /* renamed from: l */
        boolean mo86469l();
    }

    /* renamed from: a */
    public static IMusicService m109429a() {
        return (IMusicService) ServiceManager.get().getService(IMusicService.class);
    }

    /* renamed from: d */
    public final void mo86630d(MusicModel musicModel) {
        int intValue = C30199h.m98861a().getEnableMusicOvertimeDetect().intValue();
        if (intValue > 0) {
            this.f88602g.postDelayed(new C33971i(this, musicModel), (long) intValue);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo86631e(MusicModel musicModel) {
        if (this.f88599d == 0 && this.f88600e && !mo86627a(musicModel, "", true)) {
        }
    }

    /* renamed from: a */
    private static void m109430a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                C7276d.m22816c(str);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("Delete invalid file failed: ");
                sb.append(e.getMessage());
                C6921a.m21555a(sb.toString());
            }
        }
    }

    /* renamed from: b */
    public final void mo86628b(final MusicModel musicModel) {
        String str;
        if (musicModel.getStrongBeatUrl() == null || C6307b.m19566a((Collection<T>) musicModel.getStrongBeatUrl().getUrlList())) {
            str = null;
        } else {
            str = (String) musicModel.getStrongBeatUrl().getUrlList().get(0);
        }
        C33929af afVar = new C33929af(str, C34018y.f88721o);
        final int musicWaveBeanRemainProgress = ((IAVService) ServiceManager.get().getService(IAVService.class)).getMusicWaveBeanRemainProgress(2);
        afVar.mo86590a(new C33788d() {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ Void mo86632a(String str, MusicModel musicModel) throws Exception {
                C33963h.this.f88598c.mo86462a(str, musicModel);
                return null;
            }

            /* renamed from: a */
            public final void mo67058a(String str, int i, String str2, final int i2) {
                C33963h.this.f88599d = i2;
                if (C33963h.this.f88597b != null) {
                    C33963h.this.f88597b.runOnUiThread(new Runnable() {
                        public final void run() {
                            C33963h.this.f88598c.mo86463a_(i2, musicWaveBeanRemainProgress);
                        }
                    });
                }
            }

            /* renamed from: a */
            public final void mo67059a(final String str, int i, String str2, final Exception exc) {
                C33963h.this.f88600e = false;
                C6726a.m20844b(new Runnable() {
                    public final void run() {
                        String str;
                        C33963h.this.f88596a.mo105608b();
                        int i = 2;
                        if (C33963h.this.f88597b != null) {
                            if (exc != null && exc.getMessage() != null && exc.getMessage().startsWith("android storage memory size is too low")) {
                                C33963h.this.f88598c.mo86466i();
                                C10761a.m31399c((Context) C33963h.this.f88597b, (int) R.string.at0).mo25750a();
                                i = 5;
                            } else if (!C33963h.this.mo86627a(musicModel, "", false)) {
                                C33963h.this.f88598c.mo86466i();
                                C10761a.m31399c((Context) C33963h.this.f88597b, (int) R.string.ch7).mo25750a();
                            } else {
                                return;
                            }
                            if (exc != null && !exc.getMessage().startsWith("cancel by user")) {
                                i = 1;
                            }
                        }
                        if (C33974l.m109458a(C6399b.m19921a())) {
                            C6877n.m21444a("aweme_music_download_error_rate", i, C6869c.m21381a().mo16887a("fileUri", str).mo16887a("hostname", C33784d.m108935c(str)).mo16887a("trace", "BaseDetailFragment").mo16885a("source_platform", Integer.valueOf(musicModel.getSourcePlatform())).mo16885a("downloadStrategy", Integer.valueOf(C33963h.m109429a().getMusicDownloadStrategy())).mo16888b());
                            IMusicService a = C33963h.m109429a();
                            String musicId = musicModel.getMusicId();
                            String str2 = "music_detail_page";
                            String str3 = str;
                            if (exc != null) {
                                str = exc.getMessage();
                            } else {
                                str = "";
                            }
                            a.mobMusicDownloadFail(musicId, str2, str3, str);
                        }
                    }
                });
                C33963h.m109432a("aweme_music_download_log", "aweme_music", exc.getMessage(), str);
            }

            /* renamed from: a */
            public final void mo67060a(String str, int i, String str2, float[] fArr) {
                String str3 = str;
                int i2 = i;
                String str4 = str2;
                C33963h.this.f88600e = false;
                StringBuilder sb = new StringBuilder("BaseDetailFragment,onDownloadSuccess  musicFileName=");
                sb.append(str3);
                sb.append("  musicSource=");
                sb.append(i2);
                sb.append(" musicEffectsUrl");
                sb.append(str4);
                C6921a.m21555a(sb.toString());
                if (C33963h.this.f88598c.mo86469l()) {
                    if (musicModel != null) {
                        Object musicWaveBean = ((IAVService) ServiceManager.get().getService(IAVService.class)).getMusicWaveBean(str, 2, true, false, -1, null);
                        if (musicWaveBean != null && (musicWaveBean instanceof MusicWaveBean)) {
                            musicModel.setMusicWaveBean((MusicWaveBean) musicWaveBean);
                        }
                    }
                    if (!C42973bg.m136427a(str)) {
                        StringBuilder sb2 = new StringBuilder("BaseDetailFragment,onDownloadError  musicFileName=");
                        sb2.append(str3);
                        sb2.append(" musicSource=");
                        sb2.append(i2);
                        sb2.append("  musicEffectsUrl=");
                        sb2.append(str4);
                        sb2.append(" fileUri=");
                        sb2.append(musicModel.getPath());
                        sb2.append(" musicId=");
                        sb2.append(musicModel.getMusicId());
                        C6921a.m21555a(sb2.toString());
                        if (!C33963h.this.mo86627a(musicModel, str3, false)) {
                            C33963h.this.f88598c.bq_();
                            C10761a.m31399c(C6399b.m19921a(), (int) R.string.ch7).mo25750a();
                            C6877n.m21444a("aweme_music_download_error_rate", 3, C6869c.m21381a().mo16887a("musicPath", str3).mo16887a("fileUri", musicModel.getPath()).mo16887a("hostname", C33784d.m108935c(musicModel.getPath())).mo16885a("downloadStrategy", Integer.valueOf(C33963h.m109429a().getMusicDownloadStrategy())).mo16888b());
                            C33963h.m109429a().mobMusicDownloadFail(musicModel.getMusicId(), "music_detail_page", musicModel.getPath(), "file not exist");
                            return;
                        }
                        return;
                    }
                    long length = new File(str3).length();
                    final int checkAudioFile = ((IAVService) ServiceManager.get().getService(IAVService.class)).getSDKService().checkAudioFile(str3);
                    if (checkAudioFile >= 0) {
                        C33963h.this.f88598c.bq_();
                        StringBuilder sb3 = new StringBuilder("BaseDetailFragment,checkAudioFile  musicFileName=");
                        sb3.append(str3);
                        sb3.append("  musicSource=");
                        sb3.append(i2);
                        sb3.append("   musicEffectsUrl=");
                        sb3.append(str4);
                        sb3.append("  fileUri=");
                        sb3.append(musicModel.getPath());
                        sb3.append("  code=");
                        String sb4 = sb3.toString();
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(String.valueOf(checkAudioFile));
                        sb5.append("  musicPath=");
                        sb5.append(str3);
                        sb5.append("  fileLength=");
                        sb5.append(String.valueOf(length));
                        sb5.append(" musicId=");
                        sb5.append(musicModel.getMusicId());
                        C6921a.m21562b(sb4, sb5.toString());
                        if (C33975m.m109459a(C6399b.m19921a())) {
                            long currentTimeMillis = System.currentTimeMillis() - C33963h.this.f88601f;
                            C33963h.m109429a().mobMusicDownloadSuccess(musicModel.getMusicId(), "music_detail_page", musicModel.getPath(), currentTimeMillis, length);
                            C33963h.m109429a().monitorMusicDownload(str, currentTimeMillis, musicModel.getPath(), musicModel.getSourcePlatform());
                        }
                        C33963h.m109431a(str3, str4, System.currentTimeMillis() - C33963h.this.f88601f);
                        C1592h.m7855a((Callable<TResult>) new C33973k<TResult>(this, str3, musicModel), C1592h.f5958b);
                    } else if (!C33963h.this.mo86627a(musicModel, str3, false)) {
                        C33963h.this.f88598c.bq_();
                        C10761a.m31399c(C6399b.m19921a(), (int) R.string.ch7).mo25750a();
                        C33963h.m109429a().mobMusicDownloadFail(musicModel.getMusicId(), "music_detail_page", musicModel.getPath(), "file not valid");
                        final String str5 = str;
                        final int i3 = i;
                        final String str6 = str2;
                        final long j = length;
                        C339661 r0 = new Callable<Void>() {
                            /* access modifiers changed from: private */
                            /* renamed from: a */
                            public Void call() {
                                StringBuilder sb = new StringBuilder("BaseDetailFragment,checkAudioFile  musicFileName=");
                                sb.append(str5);
                                sb.append("  musicSource=");
                                sb.append(i3);
                                sb.append("   musicEffectsUrl=");
                                sb.append(str6);
                                sb.append("  fileUri=");
                                sb.append(musicModel.getPath());
                                sb.append("  code=");
                                String sb2 = sb.toString();
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(String.valueOf(checkAudioFile));
                                sb3.append("  musicPath=");
                                sb3.append(str5);
                                sb3.append("  fileLength=");
                                sb3.append(j);
                                sb3.append(" musicId=");
                                sb3.append(musicModel.getMusicId());
                                C6921a.m21562b(sb2, sb3.toString());
                                C6877n.m21444a("aweme_music_download_error_rate", 4, C6869c.m21381a().mo16887a("musicPath", str5).mo16885a("downloadStrategy", Integer.valueOf(C33963h.m109429a().getMusicDownloadStrategy())).mo16887a("fileLength", String.valueOf(j)).mo16887a("fileUri", musicModel.getPath()).mo16887a("hostname", C33784d.m108935c(musicModel.getPath())).mo16887a("fileMagic", C42973bg.m136432d(str5)).mo16887a("code", String.valueOf(checkAudioFile)).mo16888b());
                                return null;
                            }
                        };
                        C1592h.m7853a((Callable<TResult>) r0);
                    }
                }
            }
        });
        this.f88596a.mo105599a((C43651a) afVar);
        this.f88596a.mo105606a((C44849d) new C44849d() {
            /* renamed from: a */
            public final void mo59408a(int i, long j, long j2) {
            }

            /* renamed from: a */
            public final void mo59411a(C44850c cVar) {
            }

            /* renamed from: a */
            public final void mo59412a(String str) {
            }

            /* renamed from: f */
            public final void mo59418f() {
            }

            /* renamed from: g */
            public final void mo59419g() {
            }

            /* renamed from: a */
            public final void mo59407a(int i) {
                C33963h.this.f88598c.mo86461a(musicModel);
            }
        });
        if (C6399b.m19944t()) {
            this.f88596a.f112966a = m109429a().isUseDownloader();
        }
    }

    /* renamed from: c */
    public final void mo86629c(MusicModel musicModel) {
        C43657a aVar = new C43657a();
        if (musicModel.getMusicType().equals(MusicType.ONLINE)) {
            aVar.f112968a = musicModel.getPath();
            aVar.f112969b = 4;
        } else {
            aVar.f112969b = 3;
            aVar.f112968a = musicModel.getPath();
        }
        this.f88601f = System.currentTimeMillis();
        this.f88596a.mo105609b(aVar);
        this.f88600e = true;
        m109429a().mobMusicDownloadStart(musicModel.getMusicId(), "music_detail_page", musicModel.getPath());
    }

    /* renamed from: a */
    public final void mo86626a(final MusicModel musicModel) {
        if (this.f88597b != null) {
            IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
            if (iAVService == null || !iAVService.needLoginBeforeRecord()) {
                ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getShortVideoPluginService().mo90366a(C6399b.m19921a(), true, new C35547a() {
                    public final void onSuccess() {
                        if (musicModel != null) {
                            C33963h.this.mo86628b(musicModel);
                            if (!C33972j.m109457a(C33963h.this.f88597b)) {
                                C10761a.m31399c((Context) C33963h.this.f88597b, (int) R.string.cjs).mo25750a();
                                return;
                            }
                            C33963h.this.f88598c.mo86468k();
                            C33963h.this.mo86629c(musicModel);
                            C33963h.this.mo86630d(musicModel);
                        }
                    }
                });
            } else {
                this.f88598c.mo86467j();
            }
        }
    }

    public C33963h(C6309f fVar, Activity activity, C33970a aVar) {
        this.f88602g = fVar;
        this.f88597b = activity;
        this.f88598c = aVar;
    }

    /* renamed from: a */
    public static void m109431a(String str, String str2, long j) {
        double d;
        long length = new File(str).length();
        if (j == 0) {
            d = 0.0d;
        } else {
            d = (double) (length / j);
        }
        C6379c.m19826a("aweme_music_detail_download_success_rate", C6869c.m21381a().mo16886a("duration", Long.valueOf(j)).mo16883a("speed", Double.valueOf(d)).mo16886a("size", Long.valueOf(length)).mo16887a("fileName", str).mo16887a("musicEffectsUrl", str2).mo16888b());
    }

    /* renamed from: a */
    public final boolean mo86627a(MusicModel musicModel, String str, boolean z) {
        if (C30199h.m98861a().getEnableMusicDownloadHttps().intValue() == 0) {
            return false;
        }
        String path = musicModel.getPath();
        if (TextUtils.isEmpty(path) || !path.startsWith("http://")) {
            return false;
        }
        m109430a(str);
        musicModel.setPath(path.replace("http://", "https://"));
        StringBuilder sb = new StringBuilder("Music retry download: ");
        sb.append(musicModel.getPath());
        C6921a.m21555a(sb.toString());
        if (z) {
            mo86628b(musicModel);
        }
        mo86629c(musicModel);
        return true;
    }

    /* renamed from: a */
    public static void m109432a(String str, String str2, String str3, String str4) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("netWorkQuality", C14143b.m41756a().mo33901b().toString());
            jSONObject.put("netWorkSpeed", (int) C14143b.m41756a().mo33902c());
            jSONObject.put("errorDesc", str3);
            jSONObject.put("errorUrl", str4);
            C6877n.m21407a(str, str2, jSONObject);
        } catch (Exception unused) {
        }
    }
}
