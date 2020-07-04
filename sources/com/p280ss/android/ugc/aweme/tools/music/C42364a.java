package com.p280ss.android.ugc.aweme.tools.music;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.app.AppCompatActivity;
import com.bytedance.apm.util.C6292i;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.music.service.C33830a;
import com.p280ss.android.ugc.aweme.music.service.IMusicService;
import com.p280ss.android.ugc.aweme.port.p1479in.C35526aa;
import com.p280ss.android.ugc.aweme.port.p1479in.C35527ab;
import com.p280ss.android.ugc.aweme.port.p1479in.C35527ab.C35528a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35527ab.C35529b;
import com.p280ss.android.ugc.aweme.port.p1479in.C35527ab.C35530c;
import com.p280ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p280ss.android.ugc.aweme.services.IMainService;
import com.p280ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicList;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel.MusicType;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.p280ss.android.ugc.aweme.tools.music.aichoosemusic.AIChooseMusicManager;
import com.p280ss.android.ugc.aweme.tools.music.aichoosemusic.C42430c;
import com.p280ss.android.ugc.aweme.tools.music.avoidonresult.C42434a;
import com.p280ss.android.ugc.aweme.tools.music.avoidonresult.C42434a.C42435a;
import com.p280ss.android.ugc.aweme.tools.music.lrc.C42452b;
import com.p280ss.android.ugc.aweme.tools.music.lrc.C42452b.C42460c;
import com.p280ss.android.ugc.aweme.tools.music.music.C42469a;
import com.p280ss.android.ugc.aweme.tools.music.music.StickPointMusicItemAdapter;
import com.p280ss.android.ugc.aweme.tools.music.music.collect.C42472a.C42473a;
import com.p280ss.android.ugc.aweme.tools.music.p1672a.C42374a;
import com.p280ss.android.ugc.aweme.tools.music.p1672a.C42396c.C42397a;
import com.p280ss.android.ugc.aweme.tools.music.p1673b.C42437a;
import com.p280ss.android.ugc.aweme.tools.music.p1674c.C42438a.C42439a;
import com.p280ss.android.ugc.aweme.tools.music.p1674c.C42440b;
import com.p280ss.android.ugc.aweme.tools.music.p1674c.C42440b.C42441a;
import com.p280ss.android.ugc.aweme.tools.music.p1674c.C42445e.C42446a;
import com.p280ss.android.ugc.aweme.toolsport.IAVMusicService;
import com.p280ss.android.ugc.aweme.toolsport.IAVMusicService.C42592b;
import com.p280ss.android.ugc.aweme.toolsport.IAVMusicService.C42593c;
import com.p280ss.android.ugc.aweme.toolsport.IAVMusicService.C42594d;
import com.p280ss.android.ugc.aweme.toolsport.IAVMusicService.C42595e;
import com.p280ss.android.ugc.aweme.toolsport.IAVMusicService.C42596f;
import com.p280ss.android.ugc.aweme.toolsport.IAVMusicService.C42597g;
import com.p280ss.android.ugc.aweme.toolsport.IAVMusicService.C42598h;
import com.p280ss.android.ugc.aweme.toolsport.IAVMusicService.C42599i;
import com.p280ss.android.ugc.aweme.toolsport.IAVMusicService.IStickPointMusicAdapter;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42601a;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42602b;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42603c;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42605d;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42605d.C42606a;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42608f;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42612j;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import org.json.JSONArray;

/* renamed from: com.ss.android.ugc.aweme.tools.music.a */
public final class C42364a implements IAVMusicService {

    /* renamed from: a */
    public final C35527ab f110178a;

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a$a */
    static final class C42365a extends Lambda implements C7562b<Fragment, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C42364a f110179a;

        /* renamed from: b */
        final /* synthetic */ int f110180b;

        /* renamed from: c */
        final /* synthetic */ C42603c f110181c;

        C42365a(C42364a aVar, int i, C42603c cVar) {
            this.f110179a = aVar;
            this.f110180b = i;
            this.f110181c = cVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m134717a((Fragment) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m134717a(Fragment fragment) {
            C7573i.m23587b(fragment, "it");
            this.f110179a.f110178a.mo83262a(fragment, this.f110180b, this.f110181c.f110754a, this.f110181c.f110755b, null, this.f110181c.f110756c, this.f110181c.f110757d, this.f110181c.f110758e, this.f110181c.f110759f);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a$b */
    public static final class C42366b implements C42595e {

        /* renamed from: a */
        public C35528a f110182a;

        /* renamed from: b */
        final /* synthetic */ C42364a f110183b;

        /* renamed from: c */
        final /* synthetic */ C42596f f110184c;

        /* renamed from: com.ss.android.ugc.aweme.tools.music.a$b$a */
        public static final class C42367a implements C35529b {

            /* renamed from: a */
            final /* synthetic */ C42366b f110185a;

            C42367a(C42366b bVar) {
                this.f110185a = bVar;
            }

            /* renamed from: a */
            public final void mo90341a(Exception exc, String str) {
                C7573i.m23587b(exc, "e");
                C7573i.m23587b(str, "failMsg");
                this.f110185a.f110184c.mo99876a(exc, str);
            }

            /* renamed from: a */
            public final void mo90342a(List<AVMusic> list, String str) {
                C7573i.m23587b(list, "musicList");
                C7573i.m23587b(str, "filePath");
                this.f110185a.f110184c.mo99877a(list, str);
            }
        }

        /* renamed from: a */
        public final boolean mo103868a(Object... objArr) {
            C7573i.m23587b(objArr, "params");
            return this.f110182a.mo83272a(Arrays.copyOf(objArr, 0));
        }

        C42366b(C42364a aVar, C42596f fVar) {
            this.f110183b = aVar;
            this.f110184c = fVar;
            C35528a a = aVar.f110178a.mo83259a((C35529b) new C42367a(this));
            C7573i.m23582a((Object) a, "proxy.createMusicChoices…         }\n            })");
            this.f110182a = a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a$c */
    public static final class C42368c implements C35530c {

        /* renamed from: a */
        final /* synthetic */ C42599i f110186a;

        C42368c(C42599i iVar) {
            this.f110186a = iVar;
        }

        /* renamed from: a */
        public final void mo90343a(String str, int i, String str2, int i2) {
            C7573i.m23587b(str, "musicUrl");
            this.f110186a.mo100634a(str, i, str2, i2);
        }

        /* renamed from: a */
        public final void mo90344a(String str, int i, String str2, Exception exc) {
            C7573i.m23587b(str, "musicUrl");
            this.f110186a.mo100635a(str, i, str2, exc);
        }

        /* renamed from: a */
        public final void mo90345a(String str, int i, String str2, float[] fArr) {
            C7573i.m23587b(str, "musicFile");
            this.f110186a.mo100636a(str, i, str2, fArr);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a$d */
    static final class C42369d implements C42460c {

        /* renamed from: a */
        final /* synthetic */ C42598h f110187a;

        C42369d(C42598h hVar) {
            this.f110187a = hVar;
        }

        /* renamed from: a */
        public final void mo103869a(int i, String str, JSONArray jSONArray) {
            this.f110187a.mo104198a(i, str, jSONArray);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a$e */
    public static final class C42370e implements C33830a {

        /* renamed from: a */
        final /* synthetic */ C42594d f110188a;

        C42370e(C42594d dVar) {
            this.f110188a = dVar;
        }

        /* renamed from: a */
        public final void mo59431a(Exception exc) {
            C7573i.m23587b(exc, "e");
            this.f110188a.mo101896a(exc);
        }

        /* renamed from: a */
        public final void mo59432a(String str, MusicModel musicModel) {
            C7573i.m23587b(str, "path");
            C7573i.m23587b(musicModel, "music");
            C42594d dVar = this.f110188a;
            new C42440b();
            AVMusic a = C42440b.m134896a(musicModel);
            if (a == null) {
                C7573i.m23580a();
            }
            dVar.mo101897a(str, a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a$f */
    public static final class C42371f implements C42435a {

        /* renamed from: a */
        final /* synthetic */ C42364a f110189a;

        /* renamed from: b */
        final /* synthetic */ C7562b f110190b;

        /* renamed from: c */
        final /* synthetic */ C7561a f110191c;

        /* renamed from: a */
        public final void mo103870a(int i, Intent intent) {
            Boolean bool;
            String str;
            Serializable serializable;
            String str2;
            AVMusic aVMusic;
            if (i == -1) {
                MusicModel musicModel = null;
                if (intent != null) {
                    bool = Boolean.valueOf(intent.getBooleanExtra("is_cancel_current_choose_music", false));
                } else {
                    bool = null;
                }
                if (intent != null) {
                    str = intent.getStringExtra("path");
                } else {
                    str = null;
                }
                if (intent != null) {
                    serializable = intent.getSerializableExtra("music_model");
                } else {
                    serializable = null;
                }
                MusicModel musicModel2 = (MusicModel) serializable;
                if (intent != null) {
                    str2 = intent.getStringExtra("music_origin");
                } else {
                    str2 = null;
                }
                if (musicModel2 != null) {
                    int b = this.f110189a.mo103862b(str);
                    if (musicModel2.getMusicType() == MusicType.LOCAL) {
                        Music a = C42364a.m134688a(musicModel2, str);
                        new C42440b();
                        if (a != null) {
                            musicModel = a.convertToMusicModel();
                        }
                        aVMusic = C42440b.m134896a(musicModel);
                    } else {
                        new C42440b();
                        aVMusic = C42440b.m134896a(musicModel2);
                    }
                    if (aVMusic != null) {
                        aVMusic.duration = b;
                    }
                    C7562b bVar = this.f110190b;
                    if (bVar != null) {
                        bVar.invoke(C42606a.m135392a(bool, str2, aVMusic, str));
                    }
                } else {
                    C7562b bVar2 = this.f110190b;
                    if (bVar2 != null) {
                        bVar2.invoke(C42606a.m135392a(bool, str2, null, str));
                    }
                }
            } else {
                C7561a aVar = this.f110191c;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
        }

        C42371f(C42364a aVar, C7562b bVar, C7561a aVar2) {
            this.f110189a = aVar;
            this.f110190b = bVar;
            this.f110191c = aVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a$g */
    public static final class C42372g implements C42597g {

        /* renamed from: a */
        final /* synthetic */ C42608f f110192a;

        /* renamed from: com.ss.android.ugc.aweme.tools.music.a$g$a */
        static final class C42373a implements C42437a {

            /* renamed from: a */
            final /* synthetic */ C42602b f110193a;

            C42373a(C42602b bVar) {
                this.f110193a = bVar;
            }

            /* renamed from: a */
            public final void mo103873a(MusicModel musicModel, boolean z) {
                C42602b bVar = this.f110193a;
                new C42440b();
                bVar.mo104199a(C42440b.m134896a(musicModel), z);
            }
        }

        C42372g(C42608f fVar) {
            this.f110192a = fVar;
        }

        /* renamed from: a */
        public final C42597g mo103871a(C42602b bVar) {
            C7573i.m23587b(bVar, "listener");
            C42397a.m134792a().mo103914a(this.f110192a);
            C42397a.m134792a().mo103913a((C42437a) new C42373a(bVar));
            return this;
        }

        /* renamed from: a */
        public final C42597g mo103872a(List<String> list) {
            C42397a.m134792a().mo103914a(this.f110192a);
            C42397a.m134792a().mo103915a(list);
            return this;
        }
    }

    /* renamed from: a */
    public final List<MusicModel> mo103851a() {
        return AIChooseMusicManager.f110256a.mo103927m();
    }

    /* renamed from: a */
    public final List<AVMusic> mo103853a(List<? extends MusicModel> list) {
        return C42441a.m134899a(list);
    }

    /* renamed from: a */
    public final void mo103854a(Activity activity, int i, C42603c cVar, C7562b<? super C42605d, C7581n> bVar, C7561a<C7581n> aVar) {
        C7573i.m23587b(activity, "activity");
        C7573i.m23587b(cVar, "requestBean");
        new C42434a((FragmentActivity) activity).mo103947a(i, new C42365a(this, i, cVar), m134689a(bVar, aVar));
    }

    /* renamed from: a */
    public final void mo103858a(String str, C35526aa aaVar) {
        C7573i.m23587b(str, "musicId");
        C7573i.m23587b(aaVar, "listener");
        this.f110178a.mo83264a(str, aaVar);
    }

    /* renamed from: a */
    public final void mo103856a(AVMusic aVMusic, C42599i iVar) {
        C7573i.m23587b(aVMusic, "musicModel");
        C7573i.m23587b(iVar, "listener");
        this.f110178a.mo83263a(aVMusic, (C35530c) new C42368c(iVar));
    }

    /* renamed from: a */
    public final boolean mo103861a(AVMusic aVMusic, Context context, boolean z) {
        C7573i.m23587b(aVMusic, "musicModel");
        C7573i.m23587b(context, "ameActivity");
        return this.f110178a.mo83266a(aVMusic, context, z);
    }

    /* renamed from: a */
    public final String mo103850a(String str) {
        String a = this.f110178a.mo83261a(str);
        C7573i.m23582a((Object) a, "proxy.getRhythmMusicFilePath(musicPath)");
        return a;
    }

    /* renamed from: a */
    public final boolean mo103860a(int i) {
        return this.f110178a.mo83265a(i);
    }

    /* renamed from: a */
    public final void mo103855a(Context context, String str, int i, ProgressDialog progressDialog, C42594d dVar) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(str, "musicId");
        C7573i.m23587b(progressDialog, "progressDialog");
        C7573i.m23587b(dVar, "callback");
        ((IMusicService) ServiceManager.get().getService(IMusicService.class)).fetchMusicDetail(context, str, 0, progressDialog, new C42370e(dVar));
    }

    /* renamed from: a */
    public final void mo103857a(String str, int i, C42598h hVar) {
        C7573i.m23587b(str, "lrcUrl");
        C7573i.m23587b(hVar, "callback");
        C42452b.m134910a().mo103959a(str, i, (C42460c) new C42369d(hVar));
    }

    /* renamed from: a */
    public final C42597g mo103848a(C42608f fVar) {
        C42397a.m134792a().mo103914a(fVar);
        return new C42372g(fVar);
    }

    /* renamed from: a */
    public final void mo103859a(boolean z) {
        C42430c.m134871a(true);
    }

    /* renamed from: a */
    public final Object mo103849a(AVMusicWaveBean aVMusicWaveBean) {
        if (aVMusicWaveBean == null) {
            return null;
        }
        MusicWaveBean musicWaveBean = new MusicWaveBean();
        musicWaveBean.setMusicWavePointArray(aVMusicWaveBean.getMusicWavePointArray());
        return musicWaveBean;
    }

    /* renamed from: a */
    public final List<AVMusic> mo103852a(int i, String str) {
        MusicList musicList;
        IMainService iMainService = (IMainService) ServiceManager.get().getService(IMainService.class);
        if (iMainService != null) {
            com.p280ss.android.ugc.aweme.services.music.IMusicService musicService = iMainService.musicService();
            if (musicService != null) {
                musicList = musicService.getStickPointMusicList(0, 20, i, str);
                if (musicList != null || C6292i.m19525a(musicList.musicList)) {
                    return null;
                }
                return C42441a.m134899a(C42446a.m134902a(musicList.musicList));
            }
        }
        musicList = null;
        if (musicList != null) {
        }
        return null;
    }

    /* renamed from: c */
    public final void mo103864c() {
        C42473a.m134989a().mo104009a();
    }

    /* renamed from: d */
    public final boolean mo103866d() {
        return C42430c.m134872a();
    }

    /* renamed from: e */
    public final C42592b mo103867e() {
        return AIChooseMusicManager.f110256a;
    }

    /* renamed from: b */
    public final File mo103863b() {
        return C42452b.m134913b();
    }

    public C42364a() {
        Object service = ServiceManager.get().getService(IAVServiceProxy.class);
        C7573i.m23582a(service, "ServiceManager.get().get…ServiceProxy::class.java)");
        this.f110178a = ((IAVServiceProxy) service).getMusicService();
    }

    /* renamed from: b */
    public final int mo103862b(String str) {
        return this.f110178a.mo83267b(str);
    }

    /* renamed from: a */
    public final UrlModel mo103841a(Object obj) {
        return this.f110178a.mo83258a(obj);
    }

    /* renamed from: a */
    public final AVChallenge mo103842a(Challenge challenge) {
        return C42439a.m134895a(challenge);
    }

    /* renamed from: c */
    public final void mo103865c(String str) {
        boolean z;
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C42469a.m134960b();
        } else {
            C42469a.m134959a(str);
        }
    }

    /* renamed from: a */
    public final AVMusic mo103843a(MusicModel musicModel) {
        new C42440b();
        return C42440b.m134896a(musicModel);
    }

    /* renamed from: a */
    public final AVMusicWaveBean mo103844a(Serializable serializable) {
        if (serializable == null) {
            return null;
        }
        if (serializable instanceof MusicWaveBean) {
            AVMusicWaveBean aVMusicWaveBean = new AVMusicWaveBean();
            aVMusicWaveBean.setMusicWavePointArray(((MusicWaveBean) serializable).getMusicWavePointArray());
            return aVMusicWaveBean;
        } else if (serializable instanceof AVMusicWaveBean) {
            return (AVMusicWaveBean) serializable;
        } else {
            return null;
        }
    }

    /* renamed from: a */
    public final C42595e mo103847a(C42596f fVar) {
        C7573i.m23587b(fVar, "view");
        return new C42366b(this, fVar);
    }

    /* renamed from: a */
    private final C42435a m134689a(C7562b<? super C42605d, C7581n> bVar, C7561a<C7581n> aVar) {
        return new C42371f(this, bVar, aVar);
    }

    /* renamed from: a */
    public static Music m134688a(MusicModel musicModel, String str) {
        Music music;
        if (musicModel != null) {
            musicModel.setPath(str);
        }
        if (musicModel != null) {
            music = musicModel.convertToMusic();
        } else {
            music = null;
        }
        UrlModel urlModel = new UrlModel();
        urlModel.setUri(str);
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            arrayList.add(str);
        }
        urlModel.setUrlList(arrayList);
        if (music != null) {
            music.setPlayUrl(urlModel);
        }
        return music;
    }

    /* renamed from: a */
    public final IStickPointMusicAdapter mo103845a(List<AVMusic> list, C42612j jVar) {
        C7573i.m23587b(jVar, "itemListener");
        if (C6292i.m19525a(list)) {
            return new StickPointMusicItemAdapter(new ArrayList(), jVar);
        }
        List arrayList = new ArrayList();
        if (list == null) {
            C7573i.m23580a();
        }
        for (AVMusic a : list) {
            arrayList.add(C42441a.m134898a(a));
        }
        return new StickPointMusicItemAdapter(arrayList, jVar);
    }

    /* renamed from: a */
    public final C42593c mo103846a(AppCompatActivity appCompatActivity, C15389d dVar, C42601a aVar) {
        C7573i.m23587b(appCompatActivity, "activity");
        C7573i.m23587b(aVar, "AIMusicConfig");
        return new C42374a(appCompatActivity, dVar, aVar);
    }
}
