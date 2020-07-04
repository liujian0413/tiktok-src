package com.p280ss.android.ugc.aweme.longvideonew;

import android.os.SystemClock;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.util.NetworkUtils;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.longvideo.p1375b.C32729f;
import com.p280ss.android.ugc.aweme.longvideo.p1375b.C32729f.C32730a;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.metrics.C33253ax;
import com.p280ss.android.ugc.aweme.metrics.C33254ay;
import com.p280ss.android.ugc.aweme.metrics.C33255az;
import com.p280ss.android.ugc.aweme.player.sdk.api.C34976f;
import com.p280ss.android.ugc.aweme.video.C43268o;
import com.p280ss.android.ugc.aweme.video.C43316v;
import com.p280ss.android.ugc.aweme.video.p1700d.C43208c;
import com.p280ss.android.ugc.playerkit.model.C44919c;
import com.p280ss.android.ugc.playerkit.model.C44920d;
import com.p280ss.android.ugc.playerkit.model.C44921e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.longvideonew.f */
public final class C32783f implements C34976f {

    /* renamed from: e */
    public static final C32784a f85496e = new C32784a(null);

    /* renamed from: a */
    public final Aweme f85497a;

    /* renamed from: b */
    public final String f85498b;

    /* renamed from: c */
    public final int f85499c;

    /* renamed from: d */
    public final C43316v f85500d;

    /* renamed from: f */
    private long f85501f = -1;

    /* renamed from: g */
    private long f85502g;

    /* renamed from: h */
    private int f85503h = 1;

    /* renamed from: i */
    private boolean f85504i;

    /* renamed from: j */
    private long f85505j = -1;

    /* renamed from: k */
    private boolean f85506k;

    /* renamed from: l */
    private int f85507l;

    /* renamed from: m */
    private long f85508m = -1;

    /* renamed from: n */
    private long f85509n = -1;

    /* renamed from: o */
    private long f85510o;

    /* renamed from: p */
    private long f85511p;

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.f$a */
    public static final class C32784a {
        private C32784a() {
        }

        public /* synthetic */ C32784a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: b */
    public final void mo64944b(float f) {
    }

    /* renamed from: b */
    public final void mo64946b(C44919c cVar) {
    }

    /* renamed from: b */
    public final void mo64947b(boolean z) {
    }

    /* renamed from: e */
    public final void mo64953e(String str) {
    }

    /* renamed from: a */
    private final void m106112a() {
        if (this.f85501f != -1) {
            C32730a.m105943a(SystemClock.elapsedRealtime() - this.f85501f, "long_video_first_frame_time");
            this.f85501f = -1;
        }
    }

    /* renamed from: c */
    public final void mo64949c(String str) {
        this.f85502g = SystemClock.elapsedRealtime();
        this.f85501f = SystemClock.elapsedRealtime();
    }

    /* renamed from: a */
    public final void mo63043a(C44919c cVar) {
        Video video;
        Aweme aweme = this.f85497a;
        if (aweme != null) {
            video = aweme.getVideo();
        } else {
            video = null;
        }
        C32730a.m105946a(cVar, video, "aweme_long_video_error_rate", 1, "aweme_long_video_play_error_log", "play_error");
    }

    /* renamed from: b */
    public final void mo63047b(String str) {
        new C33254ay().mo85197a(this.f85498b).mo85200b(this.f85498b).mo85202c(this.f85497a, this.f85499c).mo85194a(this.f85503h).mo85252e();
    }

    /* renamed from: a */
    public final void mo63044a(C44920d dVar) {
        Video video;
        this.f85508m = SystemClock.elapsedRealtime();
        m106112a();
        Aweme aweme = this.f85497a;
        if (aweme != null) {
            video = aweme.getVideo();
        } else {
            video = null;
        }
        C32730a.m105944a(video, "aweme_long_video_error_rate");
    }

    /* renamed from: a */
    public final void mo63045a(C44921e eVar) {
        this.f85506k = true;
        new C33253ax().mo85164a(this.f85498b).mo85179i(this.f85498b).mo85171c(this.f85497a, this.f85499c).mo85182o(C43268o.m137252J().name()).mo85167b(this.f85503h).mo85252e();
    }

    /* renamed from: d */
    public final void mo64951d(String str) {
        Object obj;
        float f;
        this.f85509n = SystemClock.elapsedRealtime();
        C33255az a = new C33255az().mo85221a(this.f85498b).mo85071g(this.f85497a).mo85218a(SystemClock.elapsedRealtime() - this.f85502g);
        C43316v vVar = this.f85500d;
        Video video = null;
        if (vVar != null) {
            obj = vVar.mo104901a();
        } else {
            obj = null;
        }
        C33255az e = a.mo85226d(String.valueOf(obj)).mo85227e(C33230ac.m107206a(this.f85497a, this.f85499c));
        C43316v vVar2 = this.f85500d;
        if (vVar2 != null) {
            f = vVar2.mo104908g();
        } else {
            f = -1.0f;
        }
        e.mo85216a(f).mo85217a(this.f85503h).mo85252e();
        int i = 0;
        if (this.f85504i) {
            mo64954e_(false);
        }
        long elapsedRealtime = (SystemClock.elapsedRealtime() - this.f85508m) - this.f85510o;
        if (elapsedRealtime > 0) {
            String str2 = "long_video_block";
            C6869c a2 = C43208c.m137001a(C6869c.m21381a().mo16884a("count_rate", Float.valueOf((((float) this.f85507l) * 1000.0f) / ((float) elapsedRealtime))).mo16886a("duration_rate", Long.valueOf(this.f85511p / elapsedRealtime)).mo16885a("block_count", Integer.valueOf(this.f85507l)).mo16886a("block_duration", Long.valueOf(this.f85511p))).mo16886a("duration", Long.valueOf(elapsedRealtime));
            String str3 = "video_duration";
            Aweme aweme = this.f85497a;
            if (aweme != null) {
                video = aweme.getVideo();
            }
            if (video != null) {
                i = this.f85497a.getVideo().getDuration();
            }
            C6877n.m21447a(str2, a2.mo16885a(str3, Integer.valueOf(i)).mo16887a("netType", NetworkUtils.getNetworkAccessType(C6399b.m19921a())).mo16888b());
        }
    }

    /* renamed from: e_ */
    public final void mo64954e_(boolean z) {
        String str;
        Video video;
        boolean z2 = z;
        if (this.f85506k) {
            this.f85504i = z2;
            if (z2) {
                this.f85507l++;
                if (this.f85505j == -1) {
                    this.f85505j = SystemClock.elapsedRealtime();
                }
            } else if (this.f85505j != -1) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.f85505j;
                this.f85511p += elapsedRealtime;
                this.f85505j = -1;
                IRequestIdService iRequestIdService = (IRequestIdService) ServiceManager.get().getService(IRequestIdService.class);
                Aweme aweme = this.f85497a;
                if (aweme != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                String str2 = iRequestIdService.getRequestIdAndIndex(C7573i.m23577a(str, (Object) Integer.valueOf(this.f85499c))).f61058a;
                C32730a aVar = C32729f.f85309a;
                Aweme aweme2 = this.f85497a;
                if (aweme2 != null) {
                    video = aweme2.getVideo();
                } else {
                    video = null;
                }
                String m = C33230ac.m107238m(this.f85497a);
                C7573i.m23582a((Object) m, "MobUtils.getAid(mAweme)");
                aVar.mo84204a(video, m, elapsedRealtime, "resume", str2, "type_long_video_log_block_report", this.f85500d);
            }
        }
    }

    /* renamed from: a */
    public final void mo63046a(String str) {
        this.f85502g = SystemClock.elapsedRealtime();
        if (this.f85509n != -1) {
            this.f85510o += SystemClock.elapsedRealtime() - this.f85509n;
            this.f85509n = -1;
        }
    }

    public C32783f(Aweme aweme, String str, int i, C43316v vVar) {
        C7573i.m23587b(str, "mEventType");
        this.f85497a = aweme;
        this.f85498b = str;
        this.f85499c = i;
        this.f85500d = vVar;
    }
}
