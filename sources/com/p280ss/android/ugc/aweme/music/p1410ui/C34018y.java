package com.p280ss.android.ugc.aweme.music.p1410ui;

import android.app.Activity;
import android.content.Context;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.facebook.network.connectionclass.C14143b;
import com.google.gson.C6600e;
import com.p280ss.android.medialib.FFMpegManager;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.choosemusic.p1092f.C23889d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.C6909j;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.music.C33672a;
import com.p280ss.android.ugc.aweme.music.C33788d;
import com.p280ss.android.ugc.aweme.music.api.MusicApi;
import com.p280ss.android.ugc.aweme.music.model.MusicCategory;
import com.p280ss.android.ugc.aweme.music.p1406ab.C33703a;
import com.p280ss.android.ugc.aweme.music.p1409c.C33783c;
import com.p280ss.android.ugc.aweme.music.p1409c.C33784d;
import com.p280ss.android.ugc.aweme.music.p1409c.C33785e;
import com.p280ss.android.ugc.aweme.music.p1410ui.p1411a.C33915a;
import com.p280ss.android.ugc.aweme.music.p1410ui.p1411a.C33916b;
import com.p280ss.android.ugc.aweme.music.p1410ui.p1411a.C33917c;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel.MusicType;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.p280ss.android.ugc.aweme.shortvideo.view.C41654d;
import com.p280ss.android.ugc.aweme.storage.C41912c;
import com.p280ss.android.ugc.aweme.storage.C41932d;
import com.p280ss.android.ugc.aweme.storage.C41935e;
import com.p280ss.android.ugc.aweme.util.C42880h;
import com.p280ss.android.ugc.aweme.utils.C42973bg;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.ugc.iesdownload.C44850c;
import com.p280ss.android.ugc.iesdownload.p1745b.C44849d;
import com.p280ss.android.ugc.p1716b.C43656b;
import com.p280ss.android.ugc.p1716b.C43659c;
import com.p280ss.android.ugc.p1716b.p1717a.C43651a;
import com.p280ss.android.ugc.p1716b.p1717a.C43654d;
import com.p280ss.android.ugc.p1716b.p1718b.C43657a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.music.ui.y */
public class C34018y implements C6310a, C33672a {

    /* renamed from: o */
    public static C33961f f88721o;

    /* renamed from: a */
    private int f88722a;

    /* renamed from: b */
    private boolean f88723b;

    /* renamed from: c */
    private C6309f f88724c = new C6309f(this);

    /* renamed from: e */
    protected C33951d f88725e;

    /* renamed from: f */
    protected int f88726f;

    /* renamed from: g */
    public C41654d f88727g;

    /* renamed from: h */
    public C43656b f88728h;

    /* renamed from: i */
    public C34026a f88729i;

    /* renamed from: j */
    public String f88730j;

    /* renamed from: k */
    public MusicCategory f88731k;

    /* renamed from: l */
    public int f88732l;

    /* renamed from: m */
    public boolean f88733m;

    /* renamed from: n */
    public MusicModel f88734n;

    /* renamed from: p */
    public int f88735p;

    /* renamed from: q */
    protected CountDownTimer f88736q;

    /* renamed from: r */
    public boolean f88737r;

    /* renamed from: com.ss.android.ugc.aweme.music.ui.y$a */
    public interface C34026a {
        /* renamed from: a */
        void mo61905a();
    }

    /* renamed from: a */
    private static String mo61972a(int i, int i2) {
        if (i2 == 0) {
            switch (i) {
                case 0:
                    return "edit_page_list";
                case 1:
                    return "edit_page_favourite";
                case 2:
                    return "edit_page_search";
                case 3:
                    return "edit_page_banner";
                case 5:
                case 6:
                    return "edit_page_local";
                case 7:
                    return "single_song";
                case 8:
                    return "edit_page_fm";
                case 9:
                    return "sticker_rec";
                case 10:
                    return "challenge_rec";
            }
        } else if (i2 == 2) {
            switch (i) {
                case 0:
                    return "shoot_page_list";
                case 1:
                    return "shoot_page_favourite";
                case 2:
                    return "shoot_page_search";
                case 3:
                    return "shoot_page_banner";
                case 5:
                case 6:
                    return "shoot_page_local";
                case 8:
                    return "shoot_page_fm";
                case 9:
                    return "sticker_rec";
                case 10:
                    return "challenge_rec";
            }
        }
        return "";
    }

    /* renamed from: b */
    static String m109553b(int i) {
        return i == 0 ? "song_choose_page" : i == 1 ? "collection_music" : i == 2 ? "song_choose_page" : i == 3 ? "song_category" : "";
    }

    /* renamed from: c */
    private static String m109556c(int i) {
        switch (i) {
            case 0:
            case 1:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
                return "change_music_page";
            case 2:
                return "search_music";
            case 3:
                return "change_music_page_detail";
            case 7:
                return "personal_homepage";
            default:
                return "";
        }
    }

    /* renamed from: d */
    private static String m109559d(int i) {
        if (i == 0) {
            return "music_library_hot";
        }
        if (i == 1) {
            return "music_library_mine";
        }
        if (i == 2) {
            return "music_library_search";
        }
        if (i == 3) {
            return "music_library_list";
        }
        return null;
    }

    public void handleMsg(Message message) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo86579a(MusicModel musicModel, Context context) {
        return C33784d.m108931a(musicModel, context, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo86678a(String str, MusicModel musicModel, String str2) {
        if (this.f88725e != null) {
            this.f88733m = true;
            if (this.f88725e.mo62001k() != null) {
                mo61974b();
                C33783c.m108916a().pause();
                ((IAVService) ServiceManager.get().getService(IAVService.class)).getMusicWaveBean(str, 1, false, false, -1, new C33922ac(this, musicModel, str, str2));
            }
        }
    }

    /* renamed from: a */
    public final boolean mo86679a(C43657a aVar, MusicModel musicModel, int i, String str, String str2, boolean z) {
        if (C30199h.m98861a().getEnableMusicDownloadHttps().intValue() == 0) {
            return false;
        }
        String str3 = aVar.f112968a;
        if (TextUtils.isEmpty(str3) || !str3.startsWith("http://")) {
            return false;
        }
        m109555b(str2);
        aVar.f112968a = str3.replace("http://", "https://");
        if (z) {
            m109560d(aVar, musicModel, i, str);
        }
        StringBuilder sb = new StringBuilder("Music retry download: ");
        sb.append(aVar.f112968a);
        C6921a.m21555a(sb.toString());
        this.f88728h.mo105609b(aVar);
        return true;
    }

    /* renamed from: a */
    public void mo61971a() {
        mo61974b();
        if (this.f88727g != null) {
            this.f88727g.dismiss();
            this.f88727g = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo61974b() {
        if (this.f88736q != null) {
            this.f88736q.cancel();
        }
        this.f88728h.mo105608b();
    }

    /* renamed from: c */
    public void mo61975c() {
        this.f88728h.mo105602a((C43654d) new C43654d() {
            /* renamed from: a */
            public final void mo61985a(int i, int i2) {
                if (C34018y.this.f88734n != null) {
                    C34018y.this.mo86681c(C34018y.this.f88734n, C34018y.this.f88735p, C34018y.this.f88737r);
                }
                C34018y.this.mo86677a("play_music");
                if (C34018y.this.f88733m && C34018y.this.f88728h != null) {
                    C34018y.this.mo61974b();
                }
                if (!(C34018y.this.f88725e == null || C34018y.this.f88725e.mo61999f() == null || i2 == 0)) {
                    C34018y.this.f88725e.mo61999f().setDuration(i2);
                }
            }
        });
    }

    /* renamed from: f */
    private String m109562f() {
        String str = "";
        if (this.f88726f == 1) {
            return str;
        }
        if (this.f88726f == 0) {
            return "video_edit_page";
        }
        if (this.f88726f == 2) {
            return "video_shoot_page";
        }
        return str;
    }

    /* renamed from: g */
    private String m109563g() {
        if (this.f88731k == null || this.f88731k.categoryId == null) {
            return "";
        }
        return this.f88731k.categoryId;
    }

    /* renamed from: h */
    private String m109564h() {
        if (this.f88731k == null || this.f88731k.categoryName == null) {
            return "";
        }
        return this.f88731k.categoryName;
    }

    static {
        C41912c cVar;
        if (f88721o == null) {
            try {
                cVar = new C41932d(new File(C7276d.m22821e(), "music_effects"), 1, 16777216);
            } catch (IOException unused) {
                cVar = new C41935e();
            }
            f88721o = new C33961f(cVar);
        }
    }

    /* renamed from: e */
    private void m109561e() {
        if (this.f88725e != null) {
            this.f88727g = C41654d.m132586b(this.f88725e.mo62001k(), this.f88725e.mo62001k().getResources().getString(R.string.dy2));
            this.f88727g.setIndeterminate(false);
        }
    }

    /* renamed from: d */
    public void mo61976d() {
        if (this.f88736q != null) {
            this.f88736q.cancel();
        }
        this.f88724c.removeCallbacksAndMessages(null);
        if (this.f88725e != null) {
            this.f88725e = null;
        }
        this.f88728h.mo105598a();
    }

    /* renamed from: a */
    public final C34018y mo86672a(int i) {
        this.f88726f = i;
        return this;
    }

    public C34018y(C33951d dVar) {
        this.f88725e = dVar;
        this.f88728h = new C43656b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo86578a(MusicModel musicModel) {
        ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().setCurMusic(musicModel);
    }

    /* renamed from: b */
    static final /* synthetic */ MusicModel m109552b(MusicModel musicModel) throws Exception {
        if (TextUtils.isEmpty(musicModel.getMusicId())) {
            return musicModel;
        }
        musicModel.setMusic(MusicApi.m108887a(musicModel.getMusicId(), 0).music);
        musicModel.setStrongBeatUrl(musicModel.getMusic().getStrongBeatUrl());
        return musicModel;
    }

    /* renamed from: b */
    private static void m109555b(String str) {
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

    /* renamed from: a */
    public final void mo86677a(String str) {
        if (this.f88734n != null) {
            if (this.f88735p == 2) {
                C22984d a = C22984d.m75611a();
                a.mo59973a("music_id", this.f88734n.getMusicId()).mo59973a("enter_from", "search_music").mo59973a("search_keyword", C33784d.m108920a()).mo59973a("log_pb", new C6600e().mo15979b((Object) this.f88734n.getLogPb()));
                C6907h.m21525a(str, C33933ai.m109379a(a.f60753a));
                return;
            }
            C6907h.m21524a(str, (Map) C22984d.m75611a().mo59973a("music_id", this.f88734n.getMusicId()).mo59973a("enter_from", m109553b(this.f88735p)).mo59973a("enter_method", "click_play_music").mo59973a("previous_page", m109562f()).mo59973a("category_id", m109563g()).mo59973a("category_name", m109564h()).f60753a);
        }
    }

    /* renamed from: b */
    public final void mo86680b(MusicModel musicModel, int i) {
        mo86085b(musicModel, i, true);
    }

    /* renamed from: a */
    public final void mo86674a(MusicModel musicModel, int i) {
        mo61973a(musicModel, i, true);
    }

    /* renamed from: c */
    private void m109557c(MusicModel musicModel, int i) {
        String c = m109556c(i);
        String str = "";
        if (this.f88726f == 0) {
            str = "video_edit_page";
        } else if (this.f88726f == 2) {
            str = "video_shoot_page";
        }
        C22984d a = C22984d.m75611a();
        C22984d a2 = a.mo59973a("enter_from", c).mo59973a("music_id", musicModel.getMusicId()).mo59973a("category_id", m109563g()).mo59973a("category_name", m109564h()).mo59970a(POIService.KEY_ORDER, this.f88732l + 1);
        String str2 = "previous_page";
        if (TextUtils.equals("personal_homepage", c)) {
            str = "";
        }
        a2.mo59973a(str2, str);
        C6907h.m21525a("add_music", C33933ai.m109379a(a.f60753a));
    }

    /* renamed from: a */
    public void mo61973a(MusicModel musicModel, int i, boolean z) {
        if (this.f88725e != null) {
            Activity k = this.f88725e.mo62001k();
            this.f88735p = i;
            if ((k == null || mo86579a(musicModel, (Context) k)) && musicModel != null) {
                this.f88734n = musicModel;
                this.f88737r = z;
                this.f88728h.mo105608b();
                String path = musicModel.getPath();
                C43657a aVar = new C43657a();
                if (musicModel.getMusicType() == MusicType.ONLINE) {
                    aVar.f112969b = 4;
                    String a = C43659c.m138324a().mo105612a(path);
                    if (C33703a.m108723g()) {
                        aVar.f112970c = musicModel.getRealAuditionDuration();
                    } else {
                        aVar.f112970c = musicModel.getDuration();
                    }
                    if (TextUtils.isEmpty(a) || !C7276d.m22812b(a) || new File(a).length() <= 0) {
                        aVar.f112968a = musicModel.getPath();
                        this.f88728h.mo105605a(aVar, z);
                        if (this.f88729i != null) {
                            this.f88729i.mo61905a();
                        }
                    } else {
                        aVar.f112968a = a;
                        this.f88728h.mo105605a(aVar, z);
                        if (this.f88729i != null) {
                            this.f88729i.mo61905a();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo86085b(MusicModel musicModel, int i, boolean z) {
        if (this.f88725e != null && musicModel != null) {
            this.f88734n = musicModel;
            this.f88733m = false;
            C6869c cVar = new C6869c();
            if (i == 2) {
                cVar.mo16887a("source", "search");
            }
            if (this.f88726f != 1) {
                String str = "";
                String str2 = "";
                if (this.f88726f == 0) {
                    str = "mid_page";
                    str2 = "video_edit_page";
                } else if (this.f88726f == 2) {
                    str = "shoot_page";
                    str2 = "video_shoot_page";
                }
                cVar.mo16887a("enter_from", m109559d(i));
                if (musicModel.getMusicType() == MusicType.ONLINE) {
                    if (!C6319n.m19593a(musicModel.getMusicId())) {
                        C6907h.onEvent(MobClick.obtain().setEventName("music_add").setLabelName(str).setValue(musicModel.getMusicId()).setJsonObject(cVar.mo16888b()));
                        String c = m109556c(i);
                        if (C23889d.m78222c() || C33703a.m108716a() == 0 || TextUtils.equals("personal_homepage", c)) {
                            C22984d a = C22984d.m75611a();
                            C22984d a2 = a.mo59973a("enter_from", c).mo59973a("music_id", musicModel.getMusicId()).mo59973a("category_id", m109563g()).mo59973a("category_name", m109564h()).mo59970a(POIService.KEY_ORDER, this.f88732l + 1);
                            String str3 = "previous_page";
                            if (TextUtils.equals("personal_homepage", c)) {
                                str2 = "";
                            }
                            a2.mo59973a(str3, str2);
                            if (TextUtils.equals(c, "search_music")) {
                                a.mo59973a("search_keyword", C33784d.m108920a());
                                a.mo59973a("log_pb", new C6600e().mo15979b((Object) musicModel.getLogPb()));
                                C6907h.m21525a("add_music", C33933ai.m109379a(a.f60753a));
                            } else {
                                C6907h.m21524a("add_music", (Map) a.f60753a);
                            }
                        }
                    }
                } else if (!C6319n.m19593a(musicModel.getSongId())) {
                    C6907h.onEvent(MobClick.obtain().setEventName("music_add").setLabelName(str).setValue(musicModel.getSongId()).setJsonObject(cVar.mo16888b()));
                }
            } else if (!C6319n.m19593a(musicModel.getMusicId())) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("song_position", this.f88730j);
                    if (i == 2) {
                        jSONObject.put("search_keyword", musicModel.getSearchKeyWords());
                    }
                } catch (JSONException unused) {
                }
                C6907h.onEvent(MobClick.obtain().setEventName("shoot").setLabelName("popular_song").setValue(musicModel.getMusicId()).setJsonObject(jSONObject));
            }
            mo86578a(musicModel);
            if (musicModel.getMusicType() != MusicType.LOCAL) {
                C43657a aVar = new C43657a();
                Activity k = this.f88725e.mo62001k();
                if (k == null || !mo86579a(musicModel, (Context) k)) {
                    this.f88725e.mo61994a(musicModel, new Exception(k.getString(R.string.chd)));
                    return;
                }
                if (musicModel.getMusicType().equals(MusicType.ONLINE)) {
                    if (z) {
                        m109561e();
                    }
                    aVar.f112969b = 4;
                    aVar.f112968a = musicModel.getPath();
                    m109554b(aVar, musicModel, i, mo61972a(i, this.f88726f));
                    mo61974b();
                }
            } else if (FFMpegManager.m64569a().mo51830b(musicModel.getPath()) == 0) {
                mo86678a(musicModel.getPath(), musicModel, mo61972a(i, this.f88726f));
                m109557c(musicModel, i);
            } else {
                Activity k2 = this.f88725e.mo62001k();
                if (k2 != null) {
                    C10761a.m31409e((Context) k2, (int) R.string.c4l).mo25750a();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo86681c(MusicModel musicModel, int i, boolean z) {
        if (C33703a.m108723g()) {
            if (this.f88736q != null) {
                this.f88736q.cancel();
            }
            if (musicModel.getDuration() != musicModel.getAuditionDuration().intValue()) {
                long realAuditionDuration = (long) musicModel.getRealAuditionDuration();
                if (realAuditionDuration <= 0) {
                    StringBuilder sb = new StringBuilder("MusicDownloadPlayHelper: audition_duration is zero, music id: ");
                    sb.append(musicModel.getMusicId());
                    C42880h.m136156a(sb.toString());
                    return;
                }
                C340202 r1 = new CountDownTimer(realAuditionDuration, 1000, z, musicModel, i) {

                    /* renamed from: a */
                    final /* synthetic */ boolean f88739a;

                    /* renamed from: b */
                    final /* synthetic */ MusicModel f88740b;

                    /* renamed from: c */
                    final /* synthetic */ int f88741c;

                    public final void onTick(long j) {
                    }

                    public final void onFinish() {
                        C34018y.this.f88728h.mo105608b();
                        if (this.f88739a) {
                            C34018y.this.mo61973a(this.f88740b, this.f88741c, true);
                        }
                    }

                    {
                        this.f88739a = r6;
                        this.f88740b = r7;
                        this.f88741c = r8;
                    }
                };
                this.f88736q = r1;
                this.f88736q.start();
            }
        }
    }

    /* renamed from: b */
    private void m109554b(C43657a aVar, MusicModel musicModel, int i, String str) {
        C1592h a = C1592h.m7853a((Callable<TResult>) new C34027z<TResult>(musicModel));
        C33920aa aaVar = new C33920aa(this, aVar, musicModel, i, str);
        a.mo6876a((C1591g<TResult, TContinuationResult>) aaVar, C1592h.f5958b);
    }

    /* renamed from: d */
    private void m109560d(C43657a aVar, MusicModel musicModel, final int i, String str) {
        final long currentTimeMillis = System.currentTimeMillis();
        final int musicWaveBeanRemainProgress = ((IAVService) ServiceManager.get().getService(IAVService.class)).getMusicWaveBeanRemainProgress(1);
        C33929af afVar = new C33929af(C33785e.m108938a(musicModel), f88721o);
        final C43657a aVar2 = aVar;
        final MusicModel musicModel2 = musicModel;
        final int i2 = i;
        final String str2 = str;
        C340213 r0 = new C33788d() {
            /* renamed from: a */
            public final void mo67058a(String str, final int i, String str2, final int i2) {
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public final void run() {
                        if (C34018y.this.f88725e != null && C34018y.this.f88725e.mo62002l() && i == 4 && C34018y.this.f88727g != null) {
                            if (i2 >= musicWaveBeanRemainProgress) {
                                C34018y.this.f88727g.setProgress(musicWaveBeanRemainProgress);
                                return;
                            }
                            C34018y.this.f88727g.setProgress(i2);
                        }
                    }
                });
            }

            /* renamed from: a */
            public final void mo67059a(final String str, final int i, String str2, final Exception exc) {
                String str3;
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public final void run() {
                        String str;
                        String str2;
                        if (C34018y.this.f88725e != null && i == 4 && C34018y.this.f88725e.mo62002l()) {
                            C34018y.this.f88725e.mo61994a(musicModel2, exc);
                            int i = 2;
                            if (exc != null && exc.getMessage() != null && exc.getMessage().startsWith("android storage memory size is too low")) {
                                i = 5;
                                C10761a.m31399c((Context) C34018y.this.f88725e.mo62001k(), (int) R.string.at0).mo25750a();
                            } else if (!C34018y.this.mo86679a(aVar2, musicModel2, i2, str2, "", false)) {
                                C10761a.m31399c((Context) C34018y.this.f88725e.mo62001k(), (int) R.string.ch7).mo25750a();
                            } else {
                                return;
                            }
                            if (!(exc == null || exc.getMessage() == null || exc.getMessage().startsWith("cancel by user"))) {
                                i = 1;
                            }
                            if (C34018y.this.f88727g != null) {
                                C34018y.this.f88727g.dismiss();
                                C34018y.this.f88727g = null;
                            }
                            C34018y.this.mo61974b();
                            if (C33928ae.m109364a(C34018y.this.f88725e.mo62001k())) {
                                C6893q.m21444a("aweme_music_download_error_rate", i, C6869c.m21381a().mo16887a("fileUri", str).mo16887a("hostname", C33784d.m108935c(str)).mo16887a("trace", "MusicDownloadPlayHelper").mo16885a("source_platform", Integer.valueOf(musicModel2.getSourcePlatform())).mo16885a("downloadStrategy", Integer.valueOf(C33915a.m109326a())).mo16888b());
                                String musicId = musicModel2.getMusicId();
                                String str3 = "music_choose_page";
                                String str4 = str;
                                if (exc != null) {
                                    str2 = exc.getMessage();
                                } else {
                                    str2 = "";
                                }
                                C33916b.m109331a(musicId, str3, str4, str2);
                            }
                            try {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("netWorkQuality", C14143b.m41756a().mo33901b().toString());
                                jSONObject.put("netWorkSpeed", (int) C14143b.m41756a().mo33902c());
                                String str5 = "errorDesc";
                                if (exc != null) {
                                    str = exc.getMessage();
                                } else {
                                    str = "";
                                }
                                jSONObject.put(str5, str);
                                jSONObject.put("errorUrl", str);
                                C6893q.m21452b("aweme_music_download_log", "aweme_music", jSONObject);
                            } catch (Exception unused) {
                            }
                        }
                    }
                });
                MobClick extValueString = MobClick.obtain().setEventName("music_download_end").setLabelName("perf_monitor").setExtValueString(musicModel2.getMusicId());
                C6909j a = new C6909j().mo16966a("is_success", "0").mo16966a("duration", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
                String str4 = "sdk_type";
                if (C33915a.m109328b()) {
                    str3 = "TTDownloader";
                } else {
                    str3 = "Downloader";
                }
                C6907h.onEvent(extValueString.setJsonObject(a.mo16966a(str4, str3).mo16967a()));
            }

            /* renamed from: a */
            public final void mo67060a(String str, int i, String str2, float[] fArr) {
                String str3 = str;
                final long length = new File(str).length();
                if (!C42973bg.m136427a(str) || ((IAVService) ServiceManager.get().getService(IAVService.class)).getSDKService().checkAudioFile(str) < 0) {
                    if (!C34018y.this.mo86679a(aVar2, musicModel2, i2, str2, str, false)) {
                        C33916b.m109331a(musicModel2.getMusicId(), "music_choose_page", musicModel2.getPath(), "file not valid");
                    } else {
                        return;
                    }
                }
                Handler handler = new Handler(Looper.getMainLooper());
                final int i2 = i;
                final String str4 = str;
                C340221 r0 = new Runnable() {
                    public final void run() {
                        if (i2 == 4) {
                            C34018y.this.mo86678a(str4, musicModel2, str2);
                            if (C34018y.this.f88725e != null && C33923ad.m109344a(C34018y.this.f88725e.mo62001k())) {
                                long currentTimeMillis = System.currentTimeMillis() - currentTimeMillis;
                                C33916b.m109330a(musicModel2.getMusicId(), "music_choose_page", musicModel2.getPath(), Long.valueOf(currentTimeMillis), Long.valueOf(length));
                                C33917c.m109332a(str4, currentTimeMillis, aVar2.f112968a, musicModel2.getSourcePlatform());
                            }
                        }
                    }
                };
                handler.post(r0);
                C6907h.onEvent(MobClick.obtain().setEventName("music_download_end").setLabelName("perf_monitor").setExtValueString(musicModel2.getMusicId()).setJsonObject(new C6909j().mo16966a("is_success", "1").mo16966a("duration", String.valueOf(System.currentTimeMillis() - currentTimeMillis)).mo16966a("downloadStrategy", String.valueOf(C33915a.m109326a())).mo16967a()));
            }
        };
        afVar.mo86590a(r0);
        this.f88728h.mo105599a((C43651a) afVar);
        this.f88728h.mo105606a((C44849d) new C44849d() {
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
                C34018y.m109553b(i);
            }
        });
        if (C6399b.m19944t()) {
            this.f88728h.f112966a = C33915a.m109328b();
        }
    }

    /* renamed from: c */
    private void m109558c(C43657a aVar, MusicModel musicModel, int i, String str) {
        m109560d(aVar, musicModel, i, str);
        this.f88728h.mo105609b(aVar);
        this.f88723b = true;
        C33916b.m109329a(musicModel.getMusicId(), "music_choose_page", musicModel.getPath());
        int intValue = C30199h.m98861a().getEnableMusicOvertimeDetect().intValue();
        if (intValue > 0) {
            C6309f fVar = this.f88724c;
            C33921ab abVar = new C33921ab(this, aVar, musicModel, i, str);
            fVar.postDelayed(abVar, (long) intValue);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo86675a(MusicModel musicModel, String str, String str2, Object obj) {
        if (obj != null && (obj instanceof MusicWaveBean)) {
            musicModel.setMusicWaveBean((MusicWaveBean) obj);
        }
        if (this.f88727g != null) {
            this.f88727g.setProgress(100);
            this.f88727g.dismiss();
        }
        mo86578a(musicModel);
        this.f88725e.mo61996a(str, musicModel, str2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo86676a(C43657a aVar, MusicModel musicModel, int i, String str) {
        if (this.f88722a == 0 && this.f88723b) {
            if (mo86679a(aVar, musicModel, i, str, "", true)) {
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Void mo86673a(C43657a aVar, MusicModel musicModel, int i, String str, C1592h hVar) throws Exception {
        m109558c(aVar, musicModel, i, str);
        return null;
    }
}
