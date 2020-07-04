package com.p280ss.android.ugc.aweme.shortvideo.p1571f;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0052o;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import bolts.C1592h;
import com.bytedance.common.utility.C6306c;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.medialib.FFMpegManager;
import com.p280ss.android.medialib.FFMpegManager.C19611a;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.p294e.C6806b;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.download.C22968d;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.utils.C23483k;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.detail.api.DetailApi;
import com.p280ss.android.ugc.aweme.experiment.ToolsUseDownloaderExperiment;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.metrics.C33242an;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.ISDKService.VideoSplitMessage;
import com.p280ss.android.ugc.aweme.services.IShortVideoConfig;
import com.p280ss.android.ugc.aweme.services.sticker.OnUnlockShareFinishListener;
import com.p280ss.android.ugc.aweme.services.sticker.UnLockSticker;
import com.p280ss.android.ugc.aweme.share.C38275x;
import com.p280ss.android.ugc.aweme.shortvideo.model.GameDuetResource;
import com.p280ss.android.ugc.aweme.shortvideo.reaction.p1589a.C40266a;
import com.p280ss.android.ugc.aweme.shortvideo.reaction.p1589a.C40272e;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.unlock.C40961h;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.unlock.C40969m;
import com.p280ss.android.ugc.aweme.shortvideo.view.C41654d;
import com.p280ss.android.ugc.aweme.sticker.C41847c;
import com.p280ss.android.ugc.aweme.util.C42880h;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43167r;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.ugc.aweme.video.local.C43250b;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.iesdownload.C44850c;
import com.p280ss.android.ugc.iesdownload.C44854e.C44856a;
import com.p280ss.android.ugc.iesdownload.p1745b.C44849d;
import com.p280ss.android.vesdk.VEUtils;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.Collection;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.f.c */
public final class C39828c implements C44849d {

    /* renamed from: a */
    public String f103512a;

    /* renamed from: b */
    public String f103513b;

    /* renamed from: c */
    public String f103514c;

    /* renamed from: d */
    public int f103515d;

    /* renamed from: e */
    public String f103516e = ((IAVService) ServiceManager.get().getService(IAVService.class)).shortVideoConfig().cacheDir();

    /* renamed from: f */
    public C41654d f103517f;

    /* renamed from: g */
    protected Activity f103518g;

    /* renamed from: h */
    public C39843a f103519h = new C39844b();

    /* renamed from: i */
    public String f103520i;

    /* renamed from: j */
    public Aweme f103521j;

    /* renamed from: k */
    public int f103522k;

    /* renamed from: l */
    public int f103523l;

    /* renamed from: m */
    public String f103524m = "";

    /* renamed from: n */
    public GameDuetResource f103525n;

    /* renamed from: o */
    public boolean f103526o = false;

    /* renamed from: p */
    public boolean f103527p = ((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().enableDuetReactVEEditor();

    /* renamed from: q */
    public C0052o<VideoSplitMessage> f103528q = new C0052o<>();

    /* renamed from: r */
    public int f103529r;

    /* renamed from: s */
    C41847c f103530s;

    /* renamed from: t */
    OnUnlockShareFinishListener f103531t = new OnUnlockShareFinishListener() {
        public final void onVKShareSucceed(Effect effect) {
        }

        public final void onShareAppFailed() {
            C40961h.m130826a((Context) C39828c.this.f103518g);
        }

        public final void onShareAppSucceed(Effect effect) {
            if (C39828c.this.f103530s != null) {
                C40969m mVar = new C40969m();
                mVar.f106497a = UnLockSticker.STICKER_UNLOCKED;
                mVar.f106498b = effect;
                C42961az.m136381b(mVar);
                C40961h.m130828a("prop_reuse");
                C39828c.this.mo99247a(false, true);
            }
        }
    };

    /* renamed from: u */
    public Runnable f103532u = new Runnable() {
        public final void run() {
            if (C39828c.this.f103517f != null) {
                C41654d dVar = C39828c.this.f103517f;
                int i = 100;
                if (C39828c.this.f103515d < 100) {
                    i = C39828c.this.f103515d;
                }
                dVar.setProgress(i);
            }
        }
    };

    /* renamed from: v */
    private Handler f103533v = new Handler(Looper.getMainLooper());

    /* renamed from: w */
    private long f103534w;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.f.c$a */
    public interface C39843a {
        /* renamed from: a */
        void mo59437a();

        /* renamed from: a */
        void mo59438a(String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.f.c$b */
    class C39844b implements C39843a {
        /* renamed from: a */
        public final void mo59437a() {
        }

        /* renamed from: a */
        public final void mo59438a(String str) {
        }

        C39844b() {
        }
    }

    /* renamed from: f */
    public final void mo59418f() {
    }

    /* renamed from: g */
    public final void mo59419g() {
    }

    /* renamed from: a */
    public final void mo99245a(final String str, Activity activity, final String str2) {
        this.f103518g = activity;
        if (!((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().isPublishFinished() && !((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().isUnKnown()) {
            m127530k();
            this.f103519h.mo59437a();
        } else if (C23483k.m77110a(str)) {
            this.f103519h.mo59437a();
        } else {
            this.f103518g = activity;
            this.f103524m = str2;
            if (this.f103517f == null && this.f103518g != null) {
                this.f103517f = C41654d.m132586b(this.f103518g, this.f103518g.getResources().getString(R.string.awk));
                this.f103517f.setIndeterminate(true);
            }
            if (this.f103527p) {
                m127528i();
            }
            C6726a.m20842a(new Runnable() {
                public final void run() {
                    try {
                        final Aweme a = DetailApi.m85567a(str, "");
                        C6726a.m20844b(new Runnable() {
                            public final void run() {
                                if (C39828c.this.f103518g != null) {
                                    if (a == null) {
                                        C39828c.this.mo99249c();
                                    } else if (a.getStatus() != null && a.getStatus().isPrivate()) {
                                        C10761a.m31409e(C39828c.this.f103518g.getApplicationContext(), (int) R.string.bh3).mo25750a();
                                        C39828c.this.mo99249c();
                                        C39828c.this.f103519h.mo59437a();
                                    } else if (a.getStatus() == null || !a.getStatus().isDelete()) {
                                        C39828c.this.mo99243a(a, C39828c.this.f103518g, str2);
                                    } else {
                                        C10761a.m31409e(C39828c.this.f103518g.getApplicationContext(), (int) R.string.bh2).mo25750a();
                                        C39828c.this.mo99249c();
                                        C39828c.this.f103519h.mo59437a();
                                    }
                                }
                            }
                        });
                    } catch (Exception unused) {
                        C39828c.this.mo99250d();
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo99247a(final boolean z, final boolean z2) {
        C6726a.m20844b(new Runnable() {
            public final void run() {
                C39828c.this.mo99249c();
                if (z) {
                    C10761a.m31399c(C39828c.this.f103518g.getApplicationContext(), (int) R.string.b2u).mo25750a();
                }
                String uuid = UUID.randomUUID().toString();
                C6907h.m21524a("shoot", (Map) C22984d.m75611a().mo59973a("creation_id", uuid).mo59973a("shoot_way", "split").mo59970a("_staging_flag", C6399b.m19946v() ^ true ? 1 : 0).mo59973a("group_id", C39828c.this.f103521j.getAid()).f60753a);
                Intent intent = new Intent();
                intent.putExtra("shoot_way", "split");
                intent.putExtra("creation_id", uuid);
                C33242an.m107315a(C39828c.this.f103524m);
                intent.putExtra("duet_video_path", C39828c.this.f103513b);
                intent.putExtra("duet_audio_path", C39828c.this.f103514c);
                intent.putExtra("duet_video_width", C39828c.this.f103522k);
                intent.putExtra("duet_video_height", C39828c.this.f103523l);
                intent.putExtra("duet_from", C39828c.this.f103521j.getAid());
                intent.putExtra("duet_author", C39828c.this.f103521j.getAuthor());
                if (!(C39828c.this.f103521j == null || C39828c.this.f103521j.getFromRawChallenge() == null || !C39828c.this.f103521j.getFromRawChallenge().isCommerce())) {
                    intent.putExtra("duet_hash_tag", C39828c.this.f103521j.getFromRawChallenge().getChallengeName());
                }
                intent.putExtra("music_origin", "split");
                if (z2) {
                    intent.putExtra("toastOnResume", true);
                }
                if (C39828c.this.f103526o) {
                    intent.putExtra("duet_sticker_game", C39828c.this.f103525n);
                    intent.putExtra("first_face_sticker", C39828c.this.f103525n.gameSticker.getStickerId());
                }
                if (C39828c.this.f103521j.hasStickerID()) {
                    intent.putStringArrayListExtra("reuse_sticker_ids", C38275x.m122271b(C39828c.this.f103521j.getStickerIDs()));
                }
                ((IAVService) ServiceManager.get().getService(IAVService.class)).getVideoRecordEntranceService().startToolPermissionActivity(C39828c.this.f103518g, intent);
                String str = "";
                if (!(C39828c.this.f103521j.getAuthor() == null && C39828c.this.f103521j.getAuthor().getUid() == null)) {
                    str = C39828c.this.f103521j.getAuthor().getUid();
                }
                C6907h.onEvent(MobClick.obtain().setEventName("shoot").setLabelName("split").setValue(C39828c.this.f103521j.getAid()).setExtValueString(str));
                C39828c.this.f103519h.mo59438a(C39828c.this.f103521j.getAid());
            }
        });
    }

    /* renamed from: a */
    public final void mo99246a(boolean z) {
        mo99247a(z, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo99251e() {
        if (this.f103529r == 0) {
            mo99250d();
        }
    }

    /* renamed from: i */
    private void m127528i() {
        C1592h.m7855a((Callable<TResult>) new C39845d<TResult>(this), C1592h.f5958b);
    }

    /* renamed from: k */
    private void m127530k() {
        C6726a.m20844b(new Runnable() {
            public final void run() {
                if (C39828c.this.f103518g != null) {
                    C9738o.m28710b((Context) C39828c.this.f103518g, (int) R.string.ig, 0);
                }
            }
        });
    }

    /* renamed from: c */
    public final void mo99249c() {
        if (this.f103517f != null) {
            try {
                this.f103517f.dismiss();
            } catch (Exception unused) {
            }
            this.f103517f = null;
        }
    }

    /* renamed from: d */
    public final void mo99250d() {
        C6726a.m20844b(new Runnable() {
            public final void run() {
                if (C39828c.this.f103518g != null) {
                    C39828c.this.mo99249c();
                    C10761a.m31399c((Context) C39828c.this.f103518g, (int) R.string.avg).mo25750a();
                    C39828c.this.f103519h.mo59437a();
                }
            }
        });
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final /* synthetic */ Object mo99252h() throws Exception {
        this.f103528q.observe((C0043i) this.f103518g, new C39847f(this));
        return null;
    }

    /* renamed from: j */
    private boolean m127529j() {
        if (!C7276d.m22826g()) {
            C10761a.m31399c((Context) this.f103518g, (int) R.string.djg).mo25750a();
            return false;
        } else if (C7276d.m22827h() >= 20971520) {
            return true;
        } else {
            C10761a.m31399c((Context) this.f103518g, (int) R.string.djh).mo25750a();
            return false;
        }
    }

    /* renamed from: b */
    public final void mo99248b() {
        C6726a.m20844b(new Runnable() {
            public final void run() {
                String str;
                C39828c.this.mo99249c();
                C39828c.this.f103517f = C41654d.m132586b(C39828c.this.f103518g, C39828c.this.f103518g.getResources().getString(R.string.dtv));
                C39828c.this.f103517f.setIndeterminate(true);
                if (C6399b.m19928c()) {
                    Activity activity = C39828c.this.f103518g;
                    StringBuilder sb = new StringBuilder("Is ");
                    if (C39828c.this.f103527p) {
                        str = "using";
                    } else {
                        str = "not using";
                    }
                    sb.append(str);
                    sb.append(" veeditor");
                    C10761a.m31403c((Context) activity, sb.toString()).mo25750a();
                }
            }
        });
        C6726a.m20842a(new Runnable() {
            public final void run() {
                if (C7276d.m22812b(C39828c.this.f103513b) && C7276d.m22812b(C39828c.this.f103514c)) {
                    C39828c.this.mo99242a();
                } else if (C39828c.this.f103527p) {
                    int[] iArr = new int[11];
                    VEUtils.getVideoFileInfo(C39828c.this.f103512a, iArr);
                    C39828c.this.f103522k = C39828c.m127526b(iArr[0]);
                    C39828c.this.f103523l = C39828c.m127526b(iArr[1]);
                    ((IAVService) ServiceManager.get().getService(IAVService.class)).getSDKService().split(C39828c.this.f103516e, C39828c.this.f103512a, C39828c.this.f103514c, C39828c.this.f103513b, C39828c.this.f103522k, C39828c.this.f103523l, iArr[7], 1000, C39828c.this.f103528q);
                } else {
                    int[] a = FFMpegManager.m64569a().mo51828a(C39828c.this.f103512a);
                    FFMpegManager.m64569a().mo51829b();
                    if (a[0] != 0) {
                        C39828c.this.mo99250d();
                        return;
                    }
                    C39828c.this.f103522k = C39828c.m127526b(a[2] / 2);
                    C39828c.this.f103523l = C39828c.m127526b(a[3] / 2);
                    C19611a aVar = new C19611a();
                    aVar.f53066o = C39828c.this.f103522k;
                    aVar.f53067p = C39828c.this.f103523l;
                    aVar.f53054c = C39828c.this.f103514c;
                    aVar.f53052a = C39828c.this.f103512a;
                    aVar.f53053b = C39828c.this.f103513b;
                    aVar.f53057f = C9738o.m28691a((Context) C39828c.this.f103518g);
                    aVar.f53055d = 0;
                    aVar.f53056e = (long) a[1];
                    aVar.f53061j = 0;
                    aVar.f53065n = 1000;
                    aVar.f53072u = true;
                    if (FFMpegManager.m64569a().mo51824a(aVar) == 0) {
                        C39828c.this.mo99242a();
                    } else {
                        C39828c.this.mo99250d();
                    }
                }
            }
        });
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0087, code lost:
        if (r0 == null) goto L_0x008c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d1  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo99242a() {
        /*
            r7 = this;
            android.app.Activity r0 = r7.f103518g
            if (r0 == 0) goto L_0x00d5
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r1 = com.p280ss.android.ugc.aweme.services.IAVService.class
            java.lang.Object r0 = r0.getService(r1)
            com.ss.android.ugc.aweme.services.IAVService r0 = (com.p280ss.android.ugc.aweme.services.IAVService) r0
            com.ss.android.ugc.aweme.services.video.IAVPublishService r0 = r0.publishService()
            r1 = 0
            r0.setCurMusic(r1)
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r2 = com.p280ss.android.ugc.aweme.services.IAVService.class
            java.lang.Object r0 = r0.getService(r2)
            com.ss.android.ugc.aweme.services.IAVService r0 = (com.p280ss.android.ugc.aweme.services.IAVService) r0
            com.ss.android.ugc.aweme.services.video.IAVPublishService r0 = r0.publishService()
            r0.removeChallenges()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f103521j
            com.ss.android.ugc.aweme.music.model.Music r0 = r0.getMusic()
            if (r0 == 0) goto L_0x0050
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r2 = com.p280ss.android.ugc.aweme.services.IAVService.class
            java.lang.Object r0 = r0.getService(r2)
            com.ss.android.ugc.aweme.services.IAVService r0 = (com.p280ss.android.ugc.aweme.services.IAVService) r0
            com.ss.android.ugc.aweme.services.video.IAVPublishService r0 = r0.publishService()
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r7.f103521j
            com.ss.android.ugc.aweme.music.model.Music r2 = r2.getMusic()
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r2 = r2.convertToMusicModel()
            r0.setCurMusic(r2)
        L_0x0050:
            int r0 = r7.f103522k
            if (r0 == 0) goto L_0x0058
            int r0 = r7.f103523l
            if (r0 != 0) goto L_0x008c
        L_0x0058:
            android.media.MediaMetadataRetriever r0 = new android.media.MediaMetadataRetriever     // Catch:{ Exception -> 0x0082, all -> 0x007d }
            r0.<init>()     // Catch:{ Exception -> 0x0082, all -> 0x007d }
            java.lang.String r2 = r7.f103513b     // Catch:{ Exception -> 0x007b }
            r0.setDataSource(r2)     // Catch:{ Exception -> 0x007b }
            r2 = 18
            java.lang.String r2 = r0.extractMetadata(r2)     // Catch:{ Exception -> 0x007b }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ Exception -> 0x007b }
            r7.f103522k = r2     // Catch:{ Exception -> 0x007b }
            r2 = 19
            java.lang.String r2 = r0.extractMetadata(r2)     // Catch:{ Exception -> 0x007b }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ Exception -> 0x007b }
            r7.f103523l = r2     // Catch:{ Exception -> 0x007b }
            goto L_0x0089
        L_0x007b:
            r2 = move-exception
            goto L_0x0084
        L_0x007d:
            r0 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
            goto L_0x00cf
        L_0x0082:
            r2 = move-exception
            r0 = r1
        L_0x0084:
            com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21554a(r2)     // Catch:{ all -> 0x00ce }
            if (r0 == 0) goto L_0x008c
        L_0x0089:
            r0.release()
        L_0x008c:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f103521j
            com.ss.android.ugc.aweme.feed.model.GameInfo r0 = r0.getGameInfo()
            if (r0 == 0) goto L_0x00c9
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r2 = com.p280ss.android.ugc.aweme.services.IAVService.class
            java.lang.Object r0 = r0.getService(r2)
            com.ss.android.ugc.aweme.services.IAVService r0 = (com.p280ss.android.ugc.aweme.services.IAVService) r0
            com.ss.android.ugc.aweme.services.effect.IEffectService r0 = r0.effectService()
            android.app.Activity r2 = r7.f103518g
            java.lang.String r3 = com.p280ss.android.ugc.aweme.language.C32326h.m104885g()
            com.ss.android.ugc.aweme.net.r r4 = com.p280ss.android.ugc.aweme.net.C34098r.m109769a()
            okhttp3.OkHttpClient r4 = r4.mo86751b()
            com.ss.android.ugc.aweme.effectplatform.e r0 = r0.createEffectPlatform(r2, r3, r4)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r7.f103521j
            long r2 = m127527b(r2)
            java.lang.String r4 = java.lang.String.valueOf(r2)
            com.ss.android.ugc.aweme.shortvideo.f.c$9 r5 = new com.ss.android.ugc.aweme.shortvideo.f.c$9
            r5.<init>(r2)
            r0.mo70630a(r4, r1, r5)
            return
        L_0x00c9:
            r0 = 0
            r7.mo99246a(r0)
            return
        L_0x00ce:
            r1 = move-exception
        L_0x00cf:
            if (r0 == 0) goto L_0x00d4
            r0.release()
        L_0x00d4:
            throw r1
        L_0x00d5:
            r7.mo99250d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.p1571f.C39828c.mo99242a():void");
    }

    /* renamed from: a */
    public final void mo59407a(int i) {
        this.f103534w = System.currentTimeMillis();
    }

    /* renamed from: a */
    private void m127524a(Aweme aweme) {
        C43250b.m137222a(aweme.getAid(), new C44856a().mo107294a(this.f103520i).mo107298b(this.f103512a).mo107297a(), this);
    }

    /* renamed from: b */
    public static int m127526b(int i) {
        double d = (double) i;
        Double.isNaN(d);
        return ((int) Math.round((d * 1.0d) / 16.0d)) * 16;
    }

    /* renamed from: b */
    private static long m127527b(Aweme aweme) {
        if (aweme.getStickerIDs() == null || aweme.getStickerIDs().isEmpty()) {
            return -1;
        }
        try {
            return Long.parseLong(aweme.getStickerIDs().split(",")[0]);
        } catch (NumberFormatException unused) {
            C42880h.m136156a("id format error");
            return -1;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo99244a(VideoSplitMessage videoSplitMessage) {
        if (videoSplitMessage != null) {
            if (videoSplitMessage.getResult() != 1) {
                mo99250d();
            } else {
                mo99242a();
            }
        }
    }

    /* renamed from: a */
    public final void mo59411a(C44850c cVar) {
        mo99250d();
        if (C39848g.m127558a(C6399b.m19921a())) {
            C6877n.m21444a("aweme_download_error_rate", 1, C6869c.m21381a().mo16887a("url", this.f103520i).mo16882a("tools_use_downloader", Boolean.valueOf(false)).mo16888b());
        }
    }

    /* renamed from: a */
    public final void mo59412a(String str) {
        if (str != null) {
            if (str.length() == 0) {
                StringBuilder sb = new StringBuilder("WaterMarkComposer download file size == 0: ");
                sb.append(this.f103520i);
                C6921a.m21559a((Throwable) new Exception(sb.toString()));
                mo99250d();
                return;
            }
            this.f103512a = str;
            mo99248b();
        }
        if (C39848g.m127558a(AwemeApplication.m21341a())) {
            C6877n.m21444a("aweme_download_error_rate", 0, new C6869c().mo16886a("duration", Long.valueOf(System.currentTimeMillis() - this.f103534w)).mo16887a("url", this.f103520i).mo16882a("tools_use_downloader", Boolean.valueOf(false)).mo16888b());
        }
    }

    /* renamed from: a */
    public final void mo59408a(int i, long j, long j2) {
        if (this.f103518g != null) {
            this.f103529r = i;
            this.f103515d = i;
            C6726a.m20844b(this.f103532u);
        }
    }

    /* renamed from: a */
    private void m127525a(Aweme aweme, String str, String str2) {
        C40266a.m128655a(aweme.getAid(), this.f103520i, str, str2, new C40272e(this.f103520i, "duet") {
            /* renamed from: a */
            public final void mo99266a(String str, String str2) {
                super.mo99266a(str, str2);
                if (new File(str2).length() == 0) {
                    StringBuilder sb = new StringBuilder("WaterMarkComposer download file size == 0: ");
                    sb.append(C39828c.this.f103520i);
                    C6921a.m21559a((Throwable) new Exception(sb.toString()));
                    C39828c.this.mo99250d();
                    return;
                }
                C39828c.this.f103512a = str2;
                C39828c.this.mo99248b();
            }

            /* renamed from: a */
            public final void mo99265a(Exception exc, String str, Integer num) {
                super.mo99265a(exc, str, num);
                C39828c.this.mo99250d();
            }

            /* renamed from: a */
            public final void mo99264a(int i, long j, long j2) {
                super.mo99264a(i, j, j2);
                if (C39828c.this.f103518g != null) {
                    C39828c.this.f103529r = i;
                    C39828c.this.f103515d = i;
                    C6726a.m20844b(C39828c.this.f103532u);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo99243a(Aweme aweme, Activity activity, String str) {
        this.f103518g = activity;
        if (((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().isPublishFinished() || ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().isUnKnown()) {
            this.f103521j = aweme;
            this.f103524m = str;
            if (this.f103521j == null || this.f103521j.getAuthor() == null || !m127529j() || !C39848g.m127558a(C6399b.m19921a())) {
                this.f103519h.mo59437a();
                mo99249c();
                return;
            }
            if (this.f103527p) {
                m127528i();
            }
            ((IAVService) ServiceManager.get().getService(IAVService.class)).getFilterService().mo74858a();
            if (!C43167r.m136904a(this.f103521j)) {
                IShortVideoConfig shortVideoConfig = ((IAVService) ServiceManager.get().getService(IAVService.class)).shortVideoConfig();
                if (this.f103521j.getVideo() != null && ((long) this.f103521j.getVideo().getVideoLength()) > shortVideoConfig.maxRecordingTime()) {
                    C6726a.m20844b(new Runnable() {
                        public final void run() {
                            C39828c.this.mo99249c();
                            if (C39828c.this.f103518g != null) {
                                new C10741a(C39828c.this.f103518g).mo25649a((int) R.string.wo).mo25657b((int) R.string.wn).mo25658b((int) R.string.wm, (OnClickListener) new OnClickListener() {
                                    public final void onClick(DialogInterface dialogInterface, int i) {
                                        C39828c.this.f103519h.mo59437a();
                                    }
                                }).mo25656a().mo25637a();
                            }
                        }
                    });
                } else if (!C6399b.m19947w() || this.f103521j.getAuthor() == null || !this.f103521j.getAuthor().isPreventDownload()) {
                    mo99250d();
                } else {
                    C6726a.m20844b(new Runnable() {
                        public final void run() {
                            if (C39828c.this.f103518g != null) {
                                C39828c.this.mo99249c();
                                C10761a.m31409e(C39828c.this.f103518g.getApplicationContext(), (int) R.string.awl).mo25750a();
                                C39828c.this.f103519h.mo59437a();
                            }
                        }
                    });
                }
            } else if (!C39827b.m127522a(this.f103521j)) {
                C39827b.m127521a(activity, this.f103521j);
                mo99249c();
                this.f103519h.mo59437a();
            } else {
                VideoUrlModel playAddrH264 = this.f103521j.getVideo().getPlayAddrH264();
                if (playAddrH264 == null || C6307b.m19566a((Collection<T>) playAddrH264.getUrlList())) {
                    this.f103519h.mo59437a();
                    return;
                }
                this.f103520i = C22968d.m75564a(aweme, C6806b.m21144a().mo16627a((String) playAddrH264.getUrlList().get(0)));
                String a = C6306c.m19561a(playAddrH264.getBitRatedRatioUri());
                StringBuilder sb = new StringBuilder();
                sb.append(this.f103516e);
                sb.append(a);
                sb.append(".mp4");
                this.f103512a = sb.toString();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f103516e);
                sb2.append("temp_");
                sb2.append(a);
                sb2.append(".mp4");
                this.f103513b = sb2.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.f103516e);
                sb3.append("temp_");
                sb3.append(a);
                sb3.append(".wav");
                this.f103514c = sb3.toString();
                if (C7276d.m22812b(this.f103512a)) {
                    mo99248b();
                    return;
                }
                if (this.f103517f == null) {
                    this.f103517f = C41654d.m132586b(this.f103518g, this.f103518g.getResources().getString(R.string.awk));
                }
                this.f103517f.setIndeterminate(false);
                this.f103517f.setProgress(0);
                if (!C7276d.m22812b(this.f103512a)) {
                    C7276d.m22803a(this.f103516e, false);
                }
                if (C6384b.m19835a().mo15292a(ToolsUseDownloaderExperiment.class, true, "tools_use_downloader", C6384b.m19835a().mo15295d().tools_use_downloader, false)) {
                    String str2 = this.f103516e;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(a);
                    sb4.append(".mp4");
                    m127525a(aweme, str2, sb4.toString());
                } else {
                    m127524a(aweme);
                }
                this.f103529r = 0;
                this.f103533v.postDelayed(new C39846e(this), 60000);
            }
        } else {
            m127530k();
            this.f103519h.mo59437a();
        }
    }
}
