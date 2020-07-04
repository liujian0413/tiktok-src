package com.p280ss.android.ugc.aweme.discover.helper;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.content.Context;
import android.os.CountDownTimer;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import bolts.C1592h;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23084b;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.discover.mob.SearchContext;
import com.p280ss.android.ugc.aweme.experiment.RemoveMusic15sCapExperiment;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.music.C33788d;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.music.p1409c.C33784d;
import com.p280ss.android.ugc.aweme.music.p1409c.C33785e;
import com.p280ss.android.ugc.aweme.music.p1410ui.C33929af;
import com.p280ss.android.ugc.aweme.music.p1410ui.C34018y;
import com.p280ss.android.ugc.aweme.music.service.IMusicService;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel.MusicType;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.p280ss.android.ugc.aweme.util.C42880h;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.p280ss.android.ugc.aweme.utils.C42973bg;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.ugc.p1716b.C43656b;
import com.p280ss.android.ugc.p1716b.p1717a.C43651a;
import com.p280ss.android.ugc.p1716b.p1717a.C43652b;
import com.p280ss.android.ugc.p1716b.p1717a.C43653c;
import com.p280ss.android.ugc.p1716b.p1717a.C43654d;
import com.p280ss.android.ugc.p1716b.p1718b.C43657a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.C7581n;
import kotlin.Pair;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;
import p346io.reactivex.C7492s;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper */
public final class MusicPlayHelper extends C0063u {

    /* renamed from: e */
    public static final C26638a f70227e = new C26638a(null);

    /* renamed from: a */
    public final C23084b<Pair<Integer, Long>> f70228a = new C23084b<>();

    /* renamed from: b */
    public boolean f70229b;

    /* renamed from: c */
    public final C23084b<C26657e> f70230c = new C23084b<>();

    /* renamed from: d */
    public String f70231d = "";

    /* renamed from: f */
    private final C43656b f70232f = new C43656b();

    /* renamed from: g */
    private Music f70233g;

    /* renamed from: h */
    private CountDownTimer f70234h;

    /* renamed from: i */
    private C7321c f70235i;

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper$a */
    public static final class C26638a {
        private C26638a() {
        }

        public /* synthetic */ C26638a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper$b */
    public static final class C26639b implements C33788d {

        /* renamed from: a */
        final /* synthetic */ MusicPlayHelper f70236a;

        /* renamed from: b */
        final /* synthetic */ MusicModel f70237b;

        /* renamed from: c */
        final /* synthetic */ long f70238c;

        /* renamed from: d */
        final /* synthetic */ int f70239d;

        /* renamed from: com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper$b$a */
        static final class C26640a<V> implements Callable<C7581n> {

            /* renamed from: a */
            final /* synthetic */ C26639b f70240a;

            /* renamed from: b */
            final /* synthetic */ Exception f70241b;

            /* renamed from: c */
            final /* synthetic */ String f70242c;

            C26640a(C26639b bVar, Exception exc, String str) {
                this.f70240a = bVar;
                this.f70241b = exc;
                this.f70242c = str;
            }

            public final /* synthetic */ Object call() {
                m87549a();
                return C7581n.f20898a;
            }

            /* JADX WARNING: Removed duplicated region for block: B:13:0x0043  */
            /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
            /* JADX WARNING: Removed duplicated region for block: B:16:0x004b  */
            /* JADX WARNING: Removed duplicated region for block: B:24:0x007e  */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private void m87549a() {
                /*
                    r13 = this;
                    com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper$b r0 = r13.f70240a
                    com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper r0 = r0.f70236a
                    r0.mo68326a()
                    java.lang.Exception r0 = r13.f70241b
                    r1 = 1
                    r2 = 0
                    r3 = 0
                    r4 = 2
                    if (r0 == 0) goto L_0x0027
                    java.lang.Exception r0 = r13.f70241b
                    java.lang.String r0 = r0.getMessage()
                    if (r0 == 0) goto L_0x0027
                    java.lang.String r5 = "android storage memory size is too low"
                    boolean r0 = kotlin.text.C7634n.m23721b(r0, r5, false)
                    if (r0 != r1) goto L_0x0027
                    r0 = 5
                    r5 = 2131822642(0x7f110832, float:1.9278061E38)
                    r9 = 2131822642(0x7f110832, float:1.9278061E38)
                    goto L_0x003f
                L_0x0027:
                    com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper$b r0 = r13.f70240a
                    com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper r0 = r0.f70236a
                    com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper$b r5 = r13.f70240a
                    com.ss.android.ugc.aweme.shortvideo.model.MusicModel r5 = r5.f70237b
                    java.lang.String r6 = ""
                    boolean r0 = r0.mo68333a(r5, r6, r3)
                    if (r0 == 0) goto L_0x0038
                    return
                L_0x0038:
                    r5 = 2131824947(0x7f111133, float:1.9282736E38)
                    r0 = 2
                    r9 = 2131824947(0x7f111133, float:1.9282736E38)
                L_0x003f:
                    java.lang.Exception r5 = r13.f70241b
                    if (r5 == 0) goto L_0x0048
                    java.lang.String r5 = r5.getMessage()
                    goto L_0x0049
                L_0x0048:
                    r5 = r2
                L_0x0049:
                    if (r5 == 0) goto L_0x005f
                    java.lang.Exception r5 = r13.f70241b
                    java.lang.String r5 = r5.getMessage()
                    if (r5 != 0) goto L_0x0056
                    kotlin.jvm.internal.C7573i.m23580a()
                L_0x0056:
                    java.lang.String r6 = "cancel by user"
                    boolean r2 = kotlin.text.C7634n.m23721b(r5, r6, false)
                    if (r2 == 0) goto L_0x005f
                    r0 = 1
                L_0x005f:
                    com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper$b r1 = r13.f70240a
                    com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper r1 = r1.f70236a
                    com.ss.android.ugc.aweme.arch.widgets.base.b<com.ss.android.ugc.aweme.discover.helper.e> r1 = r1.f70230c
                    com.ss.android.ugc.aweme.discover.helper.e r2 = new com.ss.android.ugc.aweme.discover.helper.e
                    r7 = 4
                    r8 = -1
                    r10 = 0
                    r11 = 8
                    r12 = 0
                    r6 = r2
                    r6.<init>(r7, r8, r9, r10, r11, r12)
                    r1.postValue(r2)
                    android.content.Context r1 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()
                    boolean r1 = com.p280ss.android.ugc.aweme.discover.helper.C26660h.m87591a(r1)
                    if (r1 == 0) goto L_0x00eb
                    java.lang.String r1 = "aweme_music_download_error_rate"
                    com.ss.android.ugc.aweme.app.g.c r2 = com.p280ss.android.ugc.aweme.app.p305g.C6869c.m21381a()
                    java.lang.String r3 = "fileUri"
                    java.lang.String r4 = r13.f70242c
                    com.ss.android.ugc.aweme.app.g.c r2 = r2.mo16887a(r3, r4)
                    java.lang.String r3 = "hostname"
                    java.lang.String r4 = r13.f70242c
                    java.lang.String r4 = com.p280ss.android.ugc.aweme.music.p1409c.C33784d.m108935c(r4)
                    com.ss.android.ugc.aweme.app.g.c r2 = r2.mo16887a(r3, r4)
                    java.lang.String r3 = "trace"
                    java.lang.String r4 = "BaseDetailFragment"
                    com.ss.android.ugc.aweme.app.g.c r2 = r2.mo16887a(r3, r4)
                    java.lang.String r3 = "source_platform"
                    com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper$b r4 = r13.f70240a
                    com.ss.android.ugc.aweme.shortvideo.model.MusicModel r4 = r4.f70237b
                    int r4 = r4.getSourcePlatform()
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                    com.ss.android.ugc.aweme.app.g.c r2 = r2.mo16885a(r3, r4)
                    java.lang.String r3 = "downloadStrategy"
                    com.ss.android.ugc.aweme.music.service.IMusicService r4 = com.p280ss.android.ugc.aweme.discover.helper.MusicPlayHelper.m87534b()
                    int r4 = r4.getMusicDownloadStrategy()
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                    com.ss.android.ugc.aweme.app.g.c r2 = r2.mo16885a(r3, r4)
                    org.json.JSONObject r2 = r2.mo16888b()
                    com.p280ss.android.ugc.aweme.app.C6877n.m21444a(r1, r0, r2)
                    com.ss.android.ugc.aweme.music.service.IMusicService r0 = com.p280ss.android.ugc.aweme.discover.helper.MusicPlayHelper.m87534b()
                    com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper$b r1 = r13.f70240a
                    com.ss.android.ugc.aweme.shortvideo.model.MusicModel r1 = r1.f70237b
                    java.lang.String r1 = r1.getMusicId()
                    java.lang.String r2 = "music_detail_page"
                    java.lang.String r3 = r13.f70242c
                    java.lang.Exception r4 = r13.f70241b
                    if (r4 == 0) goto L_0x00e6
                    java.lang.Exception r4 = r13.f70241b
                    java.lang.String r4 = r4.getMessage()
                    goto L_0x00e8
                L_0x00e6:
                    java.lang.String r4 = ""
                L_0x00e8:
                    r0.mobMusicDownloadFail(r1, r2, r3, r4)
                L_0x00eb:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.helper.MusicPlayHelper.C26639b.C26640a.m87549a():void");
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper$b$b */
        static final class C26641b<V> implements Callable<TResult> {

            /* renamed from: a */
            final /* synthetic */ C26639b f70243a;

            /* renamed from: b */
            final /* synthetic */ String f70244b;

            /* renamed from: c */
            final /* synthetic */ int f70245c;

            /* renamed from: d */
            final /* synthetic */ String f70246d;

            /* renamed from: e */
            final /* synthetic */ int f70247e;

            /* renamed from: f */
            final /* synthetic */ long f70248f;

            C26641b(C26639b bVar, String str, int i, String str2, int i2, long j) {
                this.f70243a = bVar;
                this.f70244b = str;
                this.f70245c = i;
                this.f70246d = str2;
                this.f70247e = i2;
                this.f70248f = j;
            }

            public final /* synthetic */ Object call() {
                m87550a();
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m87550a() {
                StringBuilder sb = new StringBuilder("BaseDetailFragment,checkAudioFile  musicFileName=");
                sb.append(this.f70244b);
                sb.append("  musicSource=");
                sb.append(this.f70245c);
                sb.append("   musicEffectsUrl=");
                sb.append(this.f70246d);
                sb.append("  fileUri=");
                sb.append(this.f70243a.f70237b.getPath());
                sb.append("  code=");
                String sb2 = sb.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(String.valueOf(this.f70247e));
                sb3.append("  musicPath=");
                sb3.append(this.f70244b);
                sb3.append("  fileLength=");
                sb3.append(this.f70248f);
                sb3.append(" musicId=");
                sb3.append(this.f70243a.f70237b.getMusicId());
                C6921a.m21562b(sb2, sb3.toString());
                C6877n.m21444a("aweme_music_download_error_rate", 4, C6869c.m21381a().mo16887a("musicPath", this.f70244b).mo16885a("downloadStrategy", Integer.valueOf(MusicPlayHelper.m87534b().getMusicDownloadStrategy())).mo16887a("fileLength", String.valueOf(this.f70248f)).mo16887a("fileUri", this.f70243a.f70237b.getPath()).mo16887a("hostname", C33784d.m108935c(this.f70243a.f70237b.getPath())).mo16887a("fileMagic", C42973bg.m136432d(this.f70244b)).mo16887a("code", String.valueOf(this.f70247e)).mo16888b());
            }
        }

        C26639b(MusicPlayHelper musicPlayHelper, MusicModel musicModel, long j, int i) {
            this.f70236a = musicPlayHelper;
            this.f70237b = musicModel;
            this.f70238c = j;
            this.f70239d = i;
        }

        /* renamed from: a */
        public final void mo67058a(String str, int i, String str2, int i2) {
            C7573i.m23587b(str, "musicUrl");
            C23084b<C26657e> bVar = this.f70236a.f70230c;
            if (i2 >= this.f70239d) {
                i2 = this.f70239d;
            }
            C26657e eVar = new C26657e(2, i2, 0, null, 12, null);
            bVar.postValue(eVar);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0020, code lost:
            if (r4 == null) goto L_0x0022;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo67059a(java.lang.String r1, int r2, java.lang.String r3, java.lang.Exception r4) {
            /*
                r0 = this;
                java.lang.String r2 = "musicUrl"
                kotlin.jvm.internal.C7573i.m23587b(r1, r2)
                com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper r2 = r0.f70236a
                r3 = 0
                r2.f70229b = r3
                com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper$b$a r2 = new com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper$b$a
                r2.<init>(r0, r4, r1)
                java.util.concurrent.Callable r2 = (java.util.concurrent.Callable) r2
                java.util.concurrent.Executor r3 = bolts.C1592h.f5958b
                bolts.C1592h.m7855a(r2, r3)
                java.lang.String r2 = "aweme_music_download_log"
                java.lang.String r3 = "aweme_music"
                if (r4 == 0) goto L_0x0022
                java.lang.String r4 = r4.getMessage()
                if (r4 != 0) goto L_0x0024
            L_0x0022:
                java.lang.String r4 = ""
            L_0x0024:
                com.p280ss.android.ugc.aweme.app.p305g.C22983b.m75610a(r2, r3, r4, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.helper.MusicPlayHelper.C26639b.mo67059a(java.lang.String, int, java.lang.String, java.lang.Exception):void");
        }

        /* renamed from: a */
        public final void mo67060a(String str, int i, String str2, float[] fArr) {
            String str3 = str;
            int i2 = i;
            String str4 = str2;
            C7573i.m23587b(str3, "musicFileName");
            this.f70236a.f70229b = false;
            StringBuilder sb = new StringBuilder("BaseDetailFragment,onDownloadSuccess  musicFileName=");
            sb.append(str3);
            sb.append("  musicSource=");
            sb.append(i2);
            sb.append(" musicEffectsUrl");
            sb.append(str4);
            C6921a.m21555a(sb.toString());
            if (this.f70237b != null) {
                Object musicWaveBean = ((IAVService) ServiceManager.get().getService(IAVService.class)).getMusicWaveBean(str, 2, true, false, -1, null);
                if (musicWaveBean != null && (musicWaveBean instanceof MusicWaveBean)) {
                    this.f70237b.setMusicWaveBean((MusicWaveBean) musicWaveBean);
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
                sb2.append(this.f70237b.getPath());
                sb2.append(" musicId=");
                sb2.append(this.f70237b.getMusicId());
                C6921a.m21555a(sb2.toString());
                if (!this.f70236a.mo68333a(this.f70237b, str3, false)) {
                    C23084b<C26657e> bVar = this.f70236a.f70230c;
                    C26657e eVar = new C26657e(4, -1, R.string.ch7, null, 8, null);
                    bVar.postValue(eVar);
                    C6877n.m21444a("aweme_music_download_error_rate", 3, C6869c.m21381a().mo16887a("musicPath", str3).mo16887a("fileUri", this.f70237b.getPath()).mo16887a("hostname", C33784d.m108935c(this.f70237b.getPath())).mo16885a("downloadStrategy", Integer.valueOf(MusicPlayHelper.m87534b().getMusicDownloadStrategy())).mo16888b());
                    return;
                }
                return;
            }
            long length = new File(str3).length();
            Object service = ServiceManager.get().getService(IAVService.class);
            C7573i.m23582a(service, "ServiceManager.get().get…e(IAVService::class.java)");
            int checkAudioFile = ((IAVService) service).getSDKService().checkAudioFile(str3);
            if (checkAudioFile >= 0) {
                StringBuilder sb3 = new StringBuilder("BaseDetailFragment,checkAudioFile  musicFileName=");
                sb3.append(str3);
                sb3.append("  musicSource=");
                sb3.append(i2);
                sb3.append("   musicEffectsUrl=");
                sb3.append(str4);
                sb3.append("  fileUri=");
                sb3.append(this.f70237b.getPath());
                sb3.append("  code=");
                String sb4 = sb3.toString();
                StringBuilder sb5 = new StringBuilder();
                sb5.append(String.valueOf(checkAudioFile));
                sb5.append("  musicPath=");
                sb5.append(str3);
                sb5.append("  fileLength=");
                sb5.append(String.valueOf(length));
                sb5.append(" musicId=");
                sb5.append(this.f70237b.getMusicId());
                C6921a.m21562b(sb4, sb5.toString());
                if (C26659g.m87590a(C6399b.m19921a())) {
                    long currentTimeMillis = System.currentTimeMillis() - this.f70238c;
                    MusicPlayHelper.m87534b().mobMusicDownloadSuccess(this.f70237b.getMusicId(), this.f70236a.f70231d, this.f70237b.getPath(), currentTimeMillis, length);
                    MusicPlayHelper.m87534b().monitorMusicDownload(str, currentTimeMillis, this.f70237b.getPath(), this.f70237b.getSourcePlatform());
                }
                this.f70236a.f70230c.postValue(new C26657e(3, 100, 0, new C26665m(str3, this.f70237b)));
            } else if (!this.f70236a.mo68333a(this.f70237b, str3, false)) {
                C23084b<C26657e> bVar2 = this.f70236a.f70230c;
                C26657e eVar2 = new C26657e(4, -1, R.string.ch7, null, 8, null);
                bVar2.postValue(eVar2);
                C26641b bVar3 = new C26641b(this, str, i, str2, checkAudioFile, length);
                C1592h.m7853a((Callable<TResult>) bVar3);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper$c */
    static final class C26642c implements C43654d {

        /* renamed from: a */
        final /* synthetic */ MusicPlayHelper f70249a;

        /* renamed from: b */
        final /* synthetic */ FragmentActivity f70250b;

        /* renamed from: c */
        final /* synthetic */ Music f70251c;

        /* renamed from: d */
        final /* synthetic */ MusicModel f70252d;

        /* renamed from: e */
        final /* synthetic */ int f70253e;

        /* renamed from: f */
        final /* synthetic */ boolean f70254f;

        /* renamed from: g */
        final /* synthetic */ String f70255g;

        C26642c(MusicPlayHelper musicPlayHelper, FragmentActivity fragmentActivity, Music music, MusicModel musicModel, int i, boolean z, String str) {
            this.f70249a = musicPlayHelper;
            this.f70250b = fragmentActivity;
            this.f70251c = music;
            this.f70252d = musicModel;
            this.f70253e = i;
            this.f70254f = z;
            this.f70255g = str;
        }

        /* renamed from: a */
        public final void mo61985a(int i, int i2) {
            this.f70249a.mo68329a(this.f70250b, this.f70251c);
            this.f70249a.f70228a.setValue(new Pair(Integer.valueOf(2), Long.valueOf(this.f70251c.getId())));
            MusicModel musicModel = this.f70252d;
            C7573i.m23582a((Object) musicModel, "musicModel");
            MusicPlayHelper.m87532a(musicModel, this.f70253e, this.f70254f);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper$d */
    static final class C26643d implements C43652b {

        /* renamed from: a */
        final /* synthetic */ MusicPlayHelper f70256a;

        C26643d(MusicPlayHelper musicPlayHelper) {
            this.f70256a = musicPlayHelper;
        }

        /* renamed from: a */
        public final void mo61979a() {
            this.f70256a.f70228a.setValue(new Pair(Integer.valueOf(0), Long.valueOf(-1)));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper$e */
    static final class C26644e implements C43653c {

        /* renamed from: a */
        final /* synthetic */ MusicPlayHelper f70257a;

        C26644e(MusicPlayHelper musicPlayHelper) {
            this.f70257a = musicPlayHelper;
        }

        /* renamed from: a */
        public final void mo61980a(int i, int i2) {
            this.f70257a.f70228a.setValue(new Pair(Integer.valueOf(0), Long.valueOf(-1)));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper$f */
    static final class C26645f<T> implements C7326g<Long> {

        /* renamed from: a */
        final /* synthetic */ MusicPlayHelper f70258a;

        /* renamed from: b */
        final /* synthetic */ MusicModel f70259b;

        C26645f(MusicPlayHelper musicPlayHelper, MusicModel musicModel) {
            this.f70258a = musicPlayHelper;
            this.f70259b = musicModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Long l) {
            if (this.f70258a.f70229b) {
                C26657e eVar = (C26657e) this.f70258a.f70230c.getValue();
                if (eVar == null || eVar.f70284b != 0 || this.f70258a.mo68333a(this.f70259b, "", true)) {
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper$g */
    public static final class C26646g extends CountDownTimer {

        /* renamed from: a */
        final /* synthetic */ MusicPlayHelper f70260a;

        /* renamed from: b */
        final /* synthetic */ long f70261b;

        public final void onTick(long j) {
        }

        public final void onFinish() {
            this.f70260a.mo68326a();
        }

        C26646g(MusicPlayHelper musicPlayHelper, long j, long j2, long j3) {
            this.f70260a = musicPlayHelper;
            this.f70261b = j;
            super(j2, 1000);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0116 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo68331a(android.support.p022v4.app.FragmentActivity r20, com.p280ss.android.ugc.aweme.music.model.Music r21, java.lang.String r22, int r23, boolean r24) {
        /*
            r19 = this;
            r8 = r19
            r9 = r20
            r10 = r21
            java.lang.String r0 = "context"
            kotlin.jvm.internal.C7573i.m23587b(r9, r0)
            java.lang.String r0 = "music"
            kotlin.jvm.internal.C7573i.m23587b(r10, r0)
            java.lang.String r0 = "keyWord"
            r7 = r22
            kotlin.jvm.internal.C7573i.m23587b(r7, r0)
            com.ss.android.ugc.b.b r0 = r8.f70232f
            r0.mo105608b()
            r8.f70233g = r10
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r4 = r21.convertToMusicModel()
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.music.service.IMusicService> r1 = com.p280ss.android.ugc.aweme.music.service.IMusicService.class
            java.lang.Object r0 = r0.getService(r1)
            com.ss.android.ugc.aweme.music.service.IMusicService r0 = (com.p280ss.android.ugc.aweme.music.service.IMusicService) r0
            r11 = r9
            android.content.Context r11 = (android.content.Context) r11
            r1 = 1
            boolean r0 = r0.checkValidMusic(r4, r11, r1)
            if (r0 != 0) goto L_0x0039
            return
        L_0x0039:
            com.ss.android.ugc.b.b.a r12 = new com.ss.android.ugc.b.b.a
            r12.<init>()
            java.lang.String r0 = "musicModel"
            kotlin.jvm.internal.C7573i.m23582a(r4, r0)
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel$MusicType r0 = r4.getMusicType()
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel$MusicType r2 = com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel.MusicType.ONLINE
            if (r0 != r2) goto L_0x004e
            r0 = 4
            r12.f112969b = r0
        L_0x004e:
            com.bytedance.ies.abmock.b r13 = com.bytedance.ies.abmock.C6384b.m19835a()
            java.lang.Class<com.ss.android.ugc.aweme.experiment.RemoveMusic15sCapExperiment> r14 = com.p280ss.android.ugc.aweme.experiment.RemoveMusic15sCapExperiment.class
            r15 = 1
            java.lang.String r16 = "remove_15s_cap_music"
            com.bytedance.ies.abmock.b r0 = com.bytedance.ies.abmock.C6384b.m19835a()
            com.bytedance.ies.abmock.ABModel r0 = r0.mo15295d()
            boolean r0 = r0.remove_15s_cap_music
            r18 = 1
            r17 = r0
            boolean r0 = r13.mo15292a(r14, r15, r16, r17, r18)
            if (r0 == 0) goto L_0x007b
            java.lang.Integer r0 = r4.getAuditionDuration()
            java.lang.String r2 = "musicModel.auditionDuration"
            kotlin.jvm.internal.C7573i.m23582a(r0, r2)
            int r0 = r0.intValue()
            r12.f112970c = r0
            goto L_0x0081
        L_0x007b:
            int r0 = r4.getDuration()
            r12.f112970c = r0
        L_0x0081:
            com.ss.android.ugc.aweme.arch.widgets.base.b<kotlin.Pair<java.lang.Integer, java.lang.Long>> r0 = r8.f70228a
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            long r5 = r21.getId()
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r2.<init>(r1, r3)
            r0.setValue(r2)
            com.ss.android.ugc.b.b r13 = r8.f70232f
            com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper$c r14 = new com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper$c
            r0 = r14
            r1 = r19
            r2 = r20
            r3 = r21
            r5 = r23
            r6 = r24
            r7 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            com.ss.android.ugc.b.a.d r14 = (com.p280ss.android.ugc.p1716b.p1717a.C43654d) r14
            r13.mo105602a(r14)
            com.ss.android.ugc.b.b r0 = r8.f70232f
            com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper$d r1 = new com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper$d
            r1.<init>(r8)
            com.ss.android.ugc.b.a.b r1 = (com.p280ss.android.ugc.p1716b.p1717a.C43652b) r1
            r0.mo105600a(r1)
            com.ss.android.ugc.b.b r0 = r8.f70232f
            com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper$e r1 = new com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper$e
            r1.<init>(r8)
            com.ss.android.ugc.b.a.c r1 = (com.p280ss.android.ugc.p1716b.p1717a.C43653c) r1
            r0.mo105601a(r1)
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r21.getPlayUrl()
            if (r0 == 0) goto L_0x0102
            java.util.List r0 = r0.getUrlList()
            if (r0 == 0) goto L_0x0102
            int r1 = r0.size()
            if (r1 <= 0) goto L_0x00e9
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r12.f112968a = r0
            com.ss.android.ugc.b.b r0 = r8.f70232f
            r0.mo105605a(r12, r1)
            goto L_0x0105
        L_0x00e9:
            m87530a(r11, r10)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Music Url List size is zero, and music id:  "
            r0.<init>(r1)
            long r1 = r21.getId()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.p280ss.android.ugc.aweme.util.C42880h.m136156a(r0)
            goto L_0x0105
        L_0x0102:
            m87530a(r11, r10)
        L_0x0105:
            android.arch.lifecycle.Lifecycle r0 = r20.getLifecycle()
            if (r0 == 0) goto L_0x0116
            com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper$play$6 r1 = new com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper$play$6
            r1.<init>(r8)
            android.arch.lifecycle.h r1 = (android.arch.lifecycle.C0042h) r1
            r0.mo55a(r1)
            return
        L_0x0116:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.helper.MusicPlayHelper.mo68331a(android.support.v4.app.FragmentActivity, com.ss.android.ugc.aweme.music.model.Music, java.lang.String, int, boolean):void");
    }

    /* renamed from: a */
    public final boolean mo68332a(long j) {
        if (this.f70228a.getValue() != null) {
            Pair pair = (Pair) this.f70228a.getValue();
            if (pair != null && ((Number) pair.getFirst()).intValue() == 2) {
                Pair pair2 = (Pair) this.f70228a.getValue();
                if (pair2 != null && ((Number) pair2.getSecond()).longValue() == j) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo68330a(FragmentActivity fragmentActivity, Music music, String str) {
        C7573i.m23587b(fragmentActivity, "context");
        C7573i.m23587b(music, "music");
        C7573i.m23587b(str, "enterFrom");
        Context context = fragmentActivity;
        if (!C26658f.m87589a(context)) {
            C10761a.m31399c(context, (int) R.string.cjs).mo25750a();
            return;
        }
        this.f70231d = str;
        IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
        if (iAVService == null || !iAVService.needLoginBeforeRecord()) {
            MusicModel convertToMusicModel = music.convertToMusicModel();
            C7573i.m23582a((Object) convertToMusicModel, "musicModel");
            if (convertToMusicModel.getMusicType() == MusicType.ONLINE) {
                m87535b(convertToMusicModel);
                m87531a(convertToMusicModel);
                m87536c(convertToMusicModel);
                mo68326a();
            }
            return;
        }
        C32656f.m105743a((Activity) fragmentActivity, str, "click_music_shoot", C42914ab.m136242a().mo104633a("login_title", fragmentActivity.getResources().getString(R.string.dtg)).f111445a);
    }

    /* renamed from: a */
    public final boolean mo68333a(MusicModel musicModel, String str, boolean z) {
        IESSettingsProxy a = C30199h.m98861a();
        C7573i.m23582a((Object) a, "SettingsReader.get()");
        Integer enableMusicDownloadHttps = a.getEnableMusicDownloadHttps();
        if (enableMusicDownloadHttps != null && enableMusicDownloadHttps.intValue() == 0) {
            return false;
        }
        String path = musicModel.getPath();
        if (!TextUtils.isEmpty(path)) {
            C7573i.m23582a((Object) path, "url");
            if (C7634n.m23721b(path, "http://", false)) {
                m87533a(str);
                musicModel.setPath(C7634n.m23711a(path, "http://", "https://", false));
                StringBuilder sb = new StringBuilder("Music retry download: ");
                sb.append(musicModel.getPath());
                C6921a.m21555a(sb.toString());
                if (z) {
                    m87535b(musicModel);
                }
                m87531a(musicModel);
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static IMusicService m87534b() {
        Object service = ServiceManager.get().getService(IMusicService.class);
        C7573i.m23582a(service, "ServiceManager.get().get…MusicService::class.java)");
        return (IMusicService) service;
    }

    public final void onCleared() {
        CountDownTimer countDownTimer = this.f70234h;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        mo68326a();
        C7321c cVar = this.f70235i;
        if (cVar != null && !cVar.isDisposed()) {
            cVar.dispose();
        }
        this.f70232f.mo105598a();
    }

    /* renamed from: a */
    public final void mo68326a() {
        CountDownTimer countDownTimer = this.f70234h;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f70232f.mo105608b();
        this.f70233g = null;
        this.f70228a.setValue(new Pair(Integer.valueOf(0), Long.valueOf(-1)));
    }

    /* renamed from: a */
    public final void mo68328a(C0053p<Pair<Integer, Long>> pVar) {
        C7573i.m23587b(pVar, "observer");
        this.f70228a.removeObserver(pVar);
    }

    /* renamed from: a */
    private static void m87533a(String str) {
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

    /* renamed from: c */
    private final void m87536c(MusicModel musicModel) {
        int i;
        IESSettingsProxy a = C30199h.m98861a();
        C7573i.m23582a((Object) a, "SettingsReader.get()");
        Integer enableMusicOvertimeDetect = a.getEnableMusicOvertimeDetect();
        if (enableMusicOvertimeDetect != null) {
            i = enableMusicOvertimeDetect.intValue();
        } else {
            i = 0;
        }
        if (i > 0) {
            this.f70235i = C7492s.m23295b((long) i, TimeUnit.MILLISECONDS).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19325f((C7326g<? super T>) new C26645f<Object>(this, musicModel));
        }
    }

    /* renamed from: b */
    public final boolean mo68334b(long j) {
        if (this.f70228a.getValue() != null) {
            Pair pair = (Pair) this.f70228a.getValue();
            if (pair != null && ((Number) pair.getFirst()).intValue() == 1) {
                Pair pair2 = (Pair) this.f70228a.getValue();
                if (pair2 != null && ((Number) pair2.getSecond()).longValue() == j) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private final void m87531a(MusicModel musicModel) {
        C43657a aVar = new C43657a();
        if (musicModel.getMusicType() == MusicType.ONLINE) {
            aVar.f112968a = musicModel.getPath();
            aVar.f112969b = 4;
        } else {
            aVar.f112969b = 3;
            aVar.f112968a = musicModel.getPath();
        }
        this.f70232f.mo105609b(aVar);
        this.f70229b = true;
        C23084b<C26657e> bVar = this.f70230c;
        C26657e eVar = new C26657e(1, 0, 0, null, 12, null);
        bVar.setValue(eVar);
        m87534b().mobMusicDownloadStart(musicModel.getMusicId(), "music_detail_page", musicModel.getPath());
    }

    /* renamed from: b */
    private final void m87535b(MusicModel musicModel) {
        long currentTimeMillis = System.currentTimeMillis();
        C33929af afVar = new C33929af(C33785e.m108938a(musicModel), C34018y.f88721o);
        C26639b bVar = new C26639b(this, musicModel, currentTimeMillis, ((IAVService) ServiceManager.get().getService(IAVService.class)).getMusicWaveBeanRemainProgress(2));
        afVar.mo86590a(bVar);
        this.f70232f.mo105599a((C43651a) afVar);
        if (C6399b.m19944t()) {
            this.f70232f.f112966a = m87534b().isUseDownloader();
        }
    }

    /* renamed from: a */
    private static void m87530a(Context context, Music music) {
        String offlineDesc = music.getOfflineDesc();
        if (TextUtils.isEmpty(offlineDesc)) {
            offlineDesc = context.getString(R.string.chd);
        }
        C10761a.m31410e(context, offlineDesc).mo25750a();
    }

    /* renamed from: a */
    public final void mo68327a(C0043i iVar, C0053p<Pair<Integer, Long>> pVar) {
        C7573i.m23587b(iVar, "lifecycleOwner");
        C7573i.m23587b(pVar, "observer");
        this.f70228a.mo60162a(iVar, pVar, false);
    }

    /* renamed from: a */
    public final void mo68329a(FragmentActivity fragmentActivity, Music music) {
        if (C6384b.m19835a().mo15292a(RemoveMusic15sCapExperiment.class, true, "remove_15s_cap_music", C6384b.m19835a().mo15295d().remove_15s_cap_music, true)) {
            CountDownTimer countDownTimer = this.f70234h;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            if (music.getDuration() != music.getRealAuditionDuration()) {
                long realAuditionDuration = ((long) music.getRealAuditionDuration()) * 1000;
                if (realAuditionDuration <= 0) {
                    StringBuilder sb = new StringBuilder("MusicPlayHelper: audition_duration is zero, music id: ");
                    sb.append(music.getId());
                    C42880h.m136156a(sb.toString());
                    return;
                }
                C26646g gVar = new C26646g(this, realAuditionDuration, realAuditionDuration, 1000);
                this.f70234h = gVar;
                CountDownTimer countDownTimer2 = this.f70234h;
                if (countDownTimer2 != null) {
                    countDownTimer2.start();
                }
            }
        }
    }

    /* renamed from: a */
    public static void m87532a(MusicModel musicModel, int i, boolean z) {
        int i2;
        String str;
        C7573i.m23587b(musicModel, "musicModel");
        if (z) {
            i2 = 3;
        } else {
            i2 = 1;
        }
        String a = SearchContext.m87922a(i2);
        String str2 = "play_music";
        C22984d a2 = C22984d.m75611a().mo59973a("music_id", musicModel.getMusicId());
        String str3 = "enter_from";
        if (z) {
            str = "general_search";
        } else {
            str = "search_result";
        }
        C6907h.m21524a(str2, (Map) a2.mo59973a(str3, str).mo59973a("enter_method", "click_play_music").mo59970a(POIService.KEY_ORDER, i).mo59973a("log_pb", C28199ae.m92689a().mo71791a(a)).f60753a);
    }
}
