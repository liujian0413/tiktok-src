package com.p280ss.android.ugc.aweme.longvideo.feature;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.os.SystemClock;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.longvideo.DiggView.C32699a;
import com.p280ss.android.ugc.aweme.longvideo.p1375b.C32729f;
import com.p280ss.android.ugc.aweme.longvideo.p1375b.C32729f.C32730a;
import com.p280ss.android.ugc.aweme.longvideo.viewmodel.LongVideoMobViewModel;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.metrics.C33248at;
import com.p280ss.android.ugc.aweme.metrics.C33253ax;
import com.p280ss.android.ugc.aweme.metrics.C33254ay;
import com.p280ss.android.ugc.aweme.metrics.C33255az;
import com.p280ss.android.ugc.aweme.metrics.C33283y;
import com.p280ss.android.ugc.aweme.player.sdk.api.C34976f;
import com.p280ss.android.ugc.aweme.video.C43268o;
import com.p280ss.android.ugc.aweme.video.C43316v;
import com.p280ss.android.ugc.playerkit.model.C44919c;
import com.p280ss.android.ugc.playerkit.model.C44920d;
import com.p280ss.android.ugc.playerkit.model.C44921e;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.longvideo.feature.LongVideoPlayMob */
public final class LongVideoPlayMob implements C0042h, OnSeekBarChangeListener, C32699a, C34976f {

    /* renamed from: a */
    public long f85324a;

    /* renamed from: b */
    public long f85325b = -1;

    /* renamed from: c */
    public long f85326c;

    /* renamed from: d */
    public LongVideoMobViewModel f85327d;

    /* renamed from: e */
    public Aweme f85328e;

    /* renamed from: f */
    public String f85329f = "";

    /* renamed from: g */
    public int f85330g;

    /* renamed from: h */
    public int f85331h;

    /* renamed from: i */
    public int f85332i;

    /* renamed from: j */
    public long f85333j;

    /* renamed from: k */
    public boolean f85334k;

    /* renamed from: l */
    public final FragmentActivity f85335l;

    /* renamed from: m */
    public final C43316v f85336m;

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

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
    }

    @C0054q(mo125a = Event.ON_RESUME)
    public final void onResume() {
        this.f85326c = System.currentTimeMillis();
    }

    /* renamed from: b */
    private final void m105968b() {
        if (this.f85325b != -1) {
            C32730a.m105943a(System.currentTimeMillis() - this.f85325b, "long_video_first_frame_time");
            this.f85325b = -1;
        }
    }

    /* renamed from: a */
    public final void mo84155a() {
        new C33283y().mo85380d(this.f85329f).mo85381e(this.f85329f).mo85376b(this.f85330g).mo85071g(this.f85328e).mo85378c(this.f85332i).mo85373a(System.currentTimeMillis() - this.f85324a).mo85252e();
    }

    @C0054q(mo125a = Event.ON_PAUSE)
    public final void onPause() {
        long currentTimeMillis = System.currentTimeMillis() - this.f85326c;
        if (!TextUtils.equals(this.f85329f, "discovery_second_floor")) {
            new C33248at("long_video_stay_time").mo85138a(String.valueOf(currentTimeMillis)).mo85139b(this.f85329f).mo85071g(this.f85328e).mo85252e();
        }
    }

    /* renamed from: a */
    public final void mo63046a(String str) {
        this.f85324a = System.currentTimeMillis();
    }

    /* renamed from: c */
    public final void mo64949c(String str) {
        this.f85324a = System.currentTimeMillis();
        this.f85325b = System.currentTimeMillis();
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        if (seekBar != null) {
            this.f85331h = seekBar.getProgress();
        }
    }

    /* renamed from: a */
    public final void mo63043a(C44919c cVar) {
        Video video;
        Aweme aweme = this.f85328e;
        if (aweme != null) {
            video = aweme.getVideo();
        } else {
            video = null;
        }
        C32730a.m105946a(cVar, video, "aweme_long_video_error_rate", 1, "aweme_long_video_play_error_log", "play_error");
    }

    /* renamed from: b */
    public final void mo63047b(String str) {
        new C33254ay().mo85197a(this.f85329f).mo85200b(this.f85329f).mo85202c(this.f85328e, this.f85330g).mo85194a(this.f85332i).mo85252e();
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        String str;
        String str2;
        if (seekBar != null) {
            if (this.f85331h < seekBar.getProgress()) {
                str = "front";
            } else {
                str = "back";
            }
            String str3 = "click_progress_bar";
            C22984d a = C22984d.m75611a().mo59973a("enter_from", this.f85329f).mo59973a("action_type", str);
            String str4 = "group_id";
            Aweme aweme = this.f85328e;
            if (aweme != null) {
                str2 = aweme.getAid();
            } else {
                str2 = null;
            }
            C6907h.m21524a(str3, (Map) a.mo59973a(str4, str2).f60753a);
        }
    }

    /* renamed from: a */
    public final void mo63044a(C44920d dVar) {
        Video video;
        m105968b();
        Aweme aweme = this.f85328e;
        if (aweme != null) {
            video = aweme.getVideo();
        } else {
            video = null;
        }
        C32730a.m105944a(video, "aweme_long_video_error_rate");
    }

    /* renamed from: d */
    public final void mo64951d(String str) {
        new C33255az().mo85221a(this.f85329f).mo85071g(this.f85328e).mo85218a(System.currentTimeMillis() - this.f85324a).mo85226d(this.f85336m.mo104901a().toString()).mo85227e(C33230ac.m107206a(this.f85328e, this.f85330g)).mo85216a(this.f85336m.mo104908g()).mo85217a(this.f85332i).mo85252e();
        if (this.f85334k) {
            mo64954e_(false);
        }
    }

    /* renamed from: e_ */
    public final void mo64954e_(boolean z) {
        String str;
        Video video;
        boolean z2 = z;
        this.f85334k = z2;
        if (z2) {
            if (this.f85333j == -1) {
                this.f85333j = SystemClock.elapsedRealtime();
            }
        } else if (this.f85333j != -1) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f85333j;
            this.f85333j = -1;
            IRequestIdService iRequestIdService = (IRequestIdService) ServiceManager.get().getService(IRequestIdService.class);
            Aweme aweme = this.f85328e;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            String str2 = iRequestIdService.getRequestIdAndIndex(C7573i.m23577a(str, (Object) Integer.valueOf(this.f85330g))).f61058a;
            C32730a aVar = C32729f.f85309a;
            Aweme aweme2 = this.f85328e;
            if (aweme2 != null) {
                video = aweme2.getVideo();
            } else {
                video = null;
            }
            String m = C33230ac.m107238m(this.f85328e);
            C7573i.m23582a((Object) m, "MobUtils.getAid(aweme)");
            aVar.mo84204a(video, m, elapsedRealtime, "resume", str2, "type_long_video_log_block_report", this.f85336m);
        }
    }

    /* renamed from: a */
    public final void mo63045a(C44921e eVar) {
        new C33253ax().mo85164a(this.f85329f).mo85179i(this.f85329f).mo85171c(this.f85328e, this.f85330g).mo85182o(C43268o.m137252J().name()).mo85167b(this.f85332i).mo85252e();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0046, code lost:
        if (r2 == null) goto L_0x0048;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LongVideoPlayMob(android.support.p022v4.app.FragmentActivity r2, com.p280ss.android.ugc.aweme.video.C43316v r3) {
        /*
            r1 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.C7573i.m23587b(r2, r0)
            java.lang.String r0 = "mPlayManager"
            kotlin.jvm.internal.C7573i.m23587b(r3, r0)
            r1.<init>()
            r1.f85335l = r2
            r1.f85336m = r3
            r2 = -1
            r1.f85325b = r2
            java.lang.String r0 = ""
            r1.f85329f = r0
            r0 = 1
            r1.f85332i = r0
            r1.f85333j = r2
            android.support.v4.app.FragmentActivity r2 = r1.f85335l
            android.arch.lifecycle.Lifecycle r2 = r2.getLifecycle()
            r3 = r1
            android.arch.lifecycle.h r3 = (android.arch.lifecycle.C0042h) r3
            r2.mo55a(r3)
            android.support.v4.app.FragmentActivity r2 = r1.f85335l
            com.ss.android.ugc.aweme.longvideo.viewmodel.LongVideoMobViewModel r2 = com.p280ss.android.ugc.aweme.longvideo.p1375b.C32718a.C32719a.m105912a(r2)
            r1.f85327d = r2
            com.ss.android.ugc.aweme.longvideo.viewmodel.LongVideoMobViewModel r2 = r1.f85327d
            if (r2 == 0) goto L_0x0039
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r2.f85427b
            goto L_0x003a
        L_0x0039:
            r2 = 0
        L_0x003a:
            r1.f85328e = r2
            com.ss.android.ugc.aweme.longvideo.viewmodel.LongVideoMobViewModel r2 = r1.f85327d
            if (r2 == 0) goto L_0x0048
            com.ss.android.ugc.aweme.longvideo.g r2 = r2.f85426a
            if (r2 == 0) goto L_0x0048
            java.lang.String r2 = r2.f85375a
            if (r2 != 0) goto L_0x004a
        L_0x0048:
            java.lang.String r2 = ""
        L_0x004a:
            r1.f85329f = r2
            com.ss.android.ugc.aweme.longvideo.viewmodel.LongVideoMobViewModel r2 = r1.f85327d
            if (r2 == 0) goto L_0x0057
            com.ss.android.ugc.aweme.longvideo.g r2 = r2.f85426a
            if (r2 == 0) goto L_0x0057
            int r2 = r2.f85376b
            goto L_0x0058
        L_0x0057:
            r2 = 0
        L_0x0058:
            r1.f85330g = r2
            com.ss.android.ugc.aweme.longvideo.viewmodel.LongVideoMobViewModel r2 = r1.f85327d
            if (r2 == 0) goto L_0x0064
            com.ss.android.ugc.aweme.longvideo.g r2 = r2.f85426a
            if (r2 == 0) goto L_0x0064
            int r0 = r2.f85377c
        L_0x0064:
            r1.f85332i = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.longvideo.feature.LongVideoPlayMob.<init>(android.support.v4.app.FragmentActivity, com.ss.android.ugc.aweme.video.v):void");
    }
}
