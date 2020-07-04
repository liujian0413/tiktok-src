package com.p280ss.android.ugc.playerkit.videoview;

import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.text.TextUtils;
import android.view.Surface;
import android.view.ViewGroup;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p066a.p067a.p070b.p072b.C2077a;
import com.bytedance.ttnet.p670a.C12925a;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p280ss.android.ugc.aweme.player.sdk.C34963a;
import com.p280ss.android.ugc.aweme.player.sdk.api.C34971a;
import com.p280ss.android.ugc.aweme.player.sdk.api.C34974d;
import com.p280ss.android.ugc.aweme.player.sdk.api.C34976f;
import com.p280ss.android.ugc.aweme.player.sdk.api.IPlayer.C34970f;
import com.p280ss.android.ugc.aweme.player.sdk.p1459b.C34982c;
import com.p280ss.android.ugc.aweme.player.sdk.p1459b.C34989d;
import com.p280ss.android.ugc.playerkit.C44906a;
import com.p280ss.android.ugc.playerkit.C44911b;
import com.p280ss.android.ugc.playerkit.model.C44917a;
import com.p280ss.android.ugc.playerkit.model.C44919c;
import com.p280ss.android.ugc.playerkit.model.C44920d;
import com.p280ss.android.ugc.playerkit.model.C44921e;
import com.p280ss.android.ugc.playerkit.model.C44923g;
import com.p280ss.android.ugc.playerkit.model.C44924h;
import com.p280ss.android.ugc.playerkit.model.PlayerConfig.Type;
import com.p280ss.android.ugc.playerkit.p1750a.C44907a;
import com.p280ss.android.ugc.playerkit.p1750a.C44910d;
import com.p280ss.android.ugc.playerkit.p1751b.C44913b;
import com.p280ss.android.ugc.playerkit.session.C44925a;
import com.p280ss.android.ugc.playerkit.session.Session;
import com.p280ss.android.ugc.playerkit.videoview.p1754c.C44944a;
import java.net.URI;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.ss.android.ugc.playerkit.videoview.VideoViewComponent */
public class VideoViewComponent implements C34976f, VideoPlayerPageLifecycleProxy, C44960f {

    /* renamed from: h */
    private static C44907a f115580h = new C44907a() {
        public final void onEvent(JSONArray jSONArray) {
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        AppLog.recordMiscLog(C6399b.m19921a(), "video_playq", jSONArray.getJSONObject(i));
                    } catch (JSONException unused) {
                    }
                }
            }
        }
    };

    /* renamed from: a */
    public C34974d f115581a;

    /* renamed from: b */
    public C44962h f115582b;

    /* renamed from: c */
    public Video f115583c;

    /* renamed from: d */
    public Session f115584d;

    /* renamed from: e */
    public volatile boolean f115585e;

    /* renamed from: f */
    public boolean f115586f;

    /* renamed from: g */
    public int f115587g;

    /* renamed from: i */
    private boolean f115588i;

    /* renamed from: j */
    private Set<C34976f> f115589j;

    /* renamed from: k */
    private C34971a f115590k;

    /* renamed from: com.ss.android.ugc.playerkit.videoview.VideoViewComponent$a */
    static class C44930a implements C44910d<Boolean> {

        /* renamed from: a */
        private VideoUrlModel f115592a;

        /* access modifiers changed from: private */
        /* renamed from: b */
        public Boolean mo104814a() {
            if (CommonWidget.INSTANCE.cacheChecker() == null) {
                return Boolean.FALSE;
            }
            return Boolean.valueOf(CommonWidget.INSTANCE.cacheChecker().mo105118a(this.f115592a));
        }

        public C44930a(VideoUrlModel videoUrlModel) {
            this.f115592a = videoUrlModel;
        }
    }

    /* renamed from: com.ss.android.ugc.playerkit.videoview.VideoViewComponent$b */
    static class C44931b implements C44910d<C44924h> {

        /* renamed from: a */
        private VideoUrlModel f115593a;

        /* renamed from: b */
        private Session f115594b;

        /* renamed from: c */
        private boolean f115595c;

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C44924h mo104814a() {
            return C44944a.m141816a().mo107453f(this.f115593a.getUrlKey()).mo107468a(this.f115593a, this.f115594b.playerType, this.f115595c);
        }

        public C44931b(VideoUrlModel videoUrlModel, Session session, boolean z) {
            this.f115593a = videoUrlModel;
            this.f115594b = session;
            this.f115595c = z;
        }
    }

    /* renamed from: com.ss.android.ugc.playerkit.videoview.VideoViewComponent$c */
    static class C44932c implements C44910d<Integer> {

        /* renamed from: a */
        private VideoUrlModel f115596a;

        /* access modifiers changed from: private */
        /* renamed from: b */
        public Integer mo104814a() {
            return Integer.valueOf(C44911b.m141670a(this.f115596a));
        }

        public C44932c(VideoUrlModel videoUrlModel) {
            this.f115596a = videoUrlModel;
        }
    }

    /* renamed from: b */
    public final void mo64947b(boolean z) {
    }

    @C0054q(mo125a = Event.ON_PAUSE)
    public void onPagePause() {
        mo71672ad();
    }

    @C0054q(mo125a = Event.ON_RESUME)
    public void onPageResume() {
        mo71671ac();
    }

    /* renamed from: a */
    public final void mo107433a(KeepSurfaceTextureView keepSurfaceTextureView) {
        this.f115582b = C44962h.m141885a(keepSurfaceTextureView);
        m141745a(keepSurfaceTextureView.getContext());
    }

    /* renamed from: a */
    public final void mo71663a(C34976f fVar) {
        this.f115589j.add(fVar);
        if (this.f115581a != null) {
            this.f115581a.mo88624a((C34976f) this);
        }
    }

    /* renamed from: a */
    public final void mo107434a(C44963i iVar) {
        this.f115582b.mo107455a(iVar);
    }

    /* renamed from: a */
    public final void mo63044a(C44920d dVar) {
        if (!this.f115589j.isEmpty()) {
            for (C34976f a : this.f115589j) {
                a.mo63044a(dVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo63043a(C44919c cVar) {
        this.f115585e = false;
        if (!this.f115589j.isEmpty()) {
            for (C34976f a : this.f115589j) {
                a.mo63043a(cVar);
            }
        }
        if (cVar.f115523b && this.f115583c != null) {
            m141746a(this.f115583c.getPlayAddrH264(), true, true, this.f115587g, this.f115583c.isNeedSetCookie());
        }
    }

    /* renamed from: a */
    public final void mo63046a(String str) {
        if (!this.f115589j.isEmpty()) {
            for (C34976f a : this.f115589j) {
                a.mo63046a(str);
            }
        }
    }

    /* renamed from: a */
    public final void mo63045a(C44921e eVar) {
        this.f115585e = false;
        this.f115586f = false;
        C44933a.m141791a().mo107441a(this);
        if (!this.f115589j.isEmpty()) {
            for (C34976f a : this.f115589j) {
                a.mo63045a(eVar);
            }
        }
    }

    /* renamed from: af */
    public final long mo71674af() {
        if (this.f115581a != null) {
            return this.f115581a.mo88640i();
        }
        return 0;
    }

    /* renamed from: ag */
    public final void mo71675ag() {
        if (this.f115581a != null) {
            this.f115581a.mo88647p();
        }
    }

    /* renamed from: ah */
    public final C34970f mo71676ah() {
        if (this.f115581a != null) {
            return this.f115581a.mo88651t();
        }
        return null;
    }

    /* renamed from: c */
    public final long mo107437c() {
        if (this.f115581a != null) {
            return this.f115581a.mo88639h();
        }
        return 0;
    }

    /* renamed from: d */
    public final boolean mo107438d() {
        if (this.f115581a != null) {
            return this.f115581a.mo88641j();
        }
        return false;
    }

    public VideoViewComponent() {
        this.f115589j = Collections.newSetFromMap(new WeakHashMap());
        this.f115587g = 0;
        this.f115590k = C44964j.f115636a;
    }

    /* renamed from: a */
    public final void mo107431a() {
        if (this.f115581a != null) {
            this.f115581a.mo88618a(0.0f, 0.0f);
        }
    }

    /* renamed from: ab */
    public final void mo71670ab() {
        if (C34963a.f91251a) {
            new StringBuilder("render() called ").append(this.f115581a);
        }
        if (this.f115581a != null) {
            C44933a.m141791a().mo107441a(this);
            this.f115585e = false;
            this.f115581a.mo88629b();
        }
    }

    /* renamed from: ac */
    public final void mo71671ac() {
        if (C34963a.f91251a) {
            new StringBuilder("resume() called ").append(this.f115581a);
        }
        if (this.f115584d != null && this.f115584d.urlModel != null) {
            this.f115581a.mo88627a(this.f115584d.urlModel.getSourceId());
        }
    }

    /* renamed from: ad */
    public final void mo71672ad() {
        if (C34963a.f91251a) {
            new StringBuilder("pause() called ").append(this.f115581a);
        }
        if (this.f115581a != null) {
            this.f115581a.mo88636e();
        }
        if (this.f115582b != null) {
            this.f115582b.mo107461e();
            if (this.f115581a != null && this.f115581a.mo88649r() == Type.IjkHardware && this.f115582b.mo107476i()) {
                this.f115582b.mo107456a(true);
            }
        }
    }

    /* renamed from: b */
    public final void mo107435b() {
        if (C34963a.f91251a) {
            new StringBuilder("release() called ").append(this.f115581a);
        }
        if (this.f115581a != null) {
            this.f115581a.mo88637f();
        }
        if (this.f115582b != null) {
            this.f115582b.mo107462f();
        }
    }

    /* renamed from: ae */
    public final void mo71673ae() {
        if (C34963a.f91251a) {
            new StringBuilder("stop() called ").append(this.f115581a);
        }
        if (this.f115581a != null) {
            if (C44943c.f115608a && C44911b.m141672a(this.f115581a.mo88649r()) && C44917a.m141692r().mo105102e()) {
                C44943c.f115608a = this.f115581a.mo88638g();
            }
            this.f115581a.mo88635d();
        }
        if (this.f115582b != null) {
            this.f115582b.mo107462f();
        }
    }

    /* renamed from: c */
    private static C44910d<Integer> m141750c(VideoUrlModel videoUrlModel) {
        return new C44932c(videoUrlModel);
    }

    /* renamed from: d */
    private static C44910d<Boolean> m141751d(VideoUrlModel videoUrlModel) {
        return new C44930a(videoUrlModel);
    }

    /* renamed from: b */
    public final void mo107436b(C44963i iVar) {
        this.f115582b.mo107458b(iVar);
    }

    /* renamed from: a */
    private void m141745a(Context context) {
        this.f115582b.mo107455a((C44963i) new C44963i() {
            /* renamed from: b */
            public final void mo63039b(int i, int i2) {
            }

            public final void aA_() {
                if (VideoViewComponent.this.f115582b.mo107463g() == 1) {
                    VideoViewComponent.this.f115581a.mo88631b((Surface) null);
                }
            }

            /* renamed from: a */
            public final void mo63037a(int i, int i2) {
                if (VideoViewComponent.this.f115582b.mo107463g() == 1 && VideoViewComponent.this.f115582b.mo107464h()) {
                    VideoViewComponent.this.f115582b.mo107456a(false);
                }
                if (VideoViewComponent.this.f115586f) {
                    VideoViewComponent.this.f115586f = false;
                    VideoViewComponent.this.mo71661a(VideoViewComponent.this.f115583c, true, VideoViewComponent.this.f115587g);
                }
            }
        });
    }

    /* renamed from: b */
    public final void mo64944b(float f) {
        if (!this.f115589j.isEmpty()) {
            for (C34976f b : this.f115589j) {
                b.mo64944b(f);
            }
        }
    }

    /* renamed from: c */
    public final void mo64949c(String str) {
        if (!this.f115589j.isEmpty()) {
            for (C34976f c : this.f115589j) {
                c.mo64949c(str);
            }
        }
    }

    /* renamed from: d */
    public final void mo64951d(String str) {
        if (!this.f115589j.isEmpty()) {
            for (C34976f d : this.f115589j) {
                d.mo64951d(str);
            }
        }
    }

    /* renamed from: e */
    public final void mo64953e(String str) {
        if (!this.f115589j.isEmpty()) {
            for (C34976f e : this.f115589j) {
                e.mo64953e(str);
            }
        }
    }

    /* renamed from: e_ */
    public final void mo64954e_(boolean z) {
        if (!this.f115589j.isEmpty()) {
            for (C34976f e_ : this.f115589j) {
                e_.mo64954e_(z);
            }
        }
    }

    public VideoViewComponent(boolean z) {
        this.f115589j = Collections.newSetFromMap(new WeakHashMap());
        this.f115587g = 0;
        this.f115590k = C44965k.f115637a;
        this.f115588i = true;
    }

    /* renamed from: a */
    private static boolean m141748a(VideoUrlModel videoUrlModel) {
        if (videoUrlModel == null) {
            return false;
        }
        List<String> urlList = videoUrlModel.getUrlList();
        if (urlList == null || urlList.size() <= 0) {
            return false;
        }
        boolean z = true;
        for (String a : urlList) {
            if (!m141747a(C6399b.m19921a(), a)) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: b */
    private boolean m141749b(VideoUrlModel videoUrlModel) {
        if (videoUrlModel != null && this.f115584d != null && this.f115584d.urlModel != null && C6319n.m19594a(videoUrlModel.getUri(), this.f115584d.urlModel.getUri()) && C6319n.m19594a(videoUrlModel.getRatio(), this.f115584d.urlModel.getRatio()) && !TextUtils.isEmpty(videoUrlModel.getSourceId()) && this.f115581a.mo88628a(videoUrlModel.getSourceId(), videoUrlModel.getBitRatedRatioUri())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo107432a(ViewGroup viewGroup) {
        this.f115582b = C44962h.m141884a(viewGroup);
        m141745a(viewGroup.getContext());
    }

    /* renamed from: b */
    public final void mo71692b(C34976f fVar) {
        this.f115589j.remove(fVar);
        if (this.f115589j.isEmpty() && this.f115581a != null) {
            this.f115581a.mo88624a((C34976f) null);
        }
    }

    /* renamed from: b */
    public final void mo64946b(C44919c cVar) {
        this.f115585e = false;
        if (!this.f115589j.isEmpty()) {
            for (C34976f b : this.f115589j) {
                b.mo64946b(cVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo71660a(Video video) {
        boolean z;
        if (C34963a.f91251a) {
            new StringBuilder("tryResume() called ").append(this.f115581a);
        }
        VideoUrlModel playAddrH265 = video.getPlayAddrH265();
        VideoUrlModel playAddrH264 = video.getPlayAddrH264();
        if (playAddrH265 != null || playAddrH264 != null) {
            if (m141749b(playAddrH265) || m141749b(playAddrH264)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                mo71671ac();
            } else {
                mo71661a(video, true, this.f115587g);
            }
        }
    }

    /* renamed from: b */
    public final void mo63047b(String str) {
        if (!this.f115589j.isEmpty()) {
            for (C34976f b : this.f115589j) {
                b.mo63047b(str);
            }
        }
    }

    /* renamed from: a */
    private static boolean m141747a(Context context, String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("https://")) {
            return false;
        }
        try {
            if (C12925a.m37625a(context).mo24814d(URI.create(str).getHost()) != null) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    private static C44910d<C44924h> m141744a(VideoUrlModel videoUrlModel, Session session, boolean z) {
        return new C44931b(videoUrlModel, session, z);
    }

    /* renamed from: a */
    public final void mo71661a(Video video, boolean z, int i) {
        if (video != null) {
            this.f115583c = video;
            if (!this.f115582b.mo107459c()) {
                this.f115586f = true;
            } else if (this.f115585e) {
                mo71670ab();
            } else if (C44943c.m141815a(video, C44917a.m141692r().mo105098a())) {
                m141746a(video.getPlayAddrH265(), z, false, i, video.isNeedSetCookie());
            } else {
                m141746a(video.getPlayAddrH264(), z, false, i, video.isNeedSetCookie());
            }
        }
    }

    /* renamed from: a */
    private void m141746a(VideoUrlModel videoUrlModel, boolean z, boolean z2, int i, boolean z3) {
        VideoUrlModel videoUrlModel2 = videoUrlModel;
        if (C34963a.f91251a) {
            new StringBuilder("play() called ").append(this.f115581a);
        }
        if (videoUrlModel2 != null && C44911b.m141671a((UrlModel) videoUrlModel)) {
            String uri = videoUrlModel.getUri();
            if (TextUtils.isEmpty(uri)) {
                StringBuilder sb = new StringBuilder("VideoUrlModel url_key is null. vid=");
                sb.append(videoUrlModel.getSourceId());
                C2077a.m9160a((Throwable) new RuntimeException(sb.toString()));
            }
            this.f115584d = C44925a.m141730a().mo107410d(uri);
            this.f115587g = i;
            if (this.f115588i) {
                this.f115581a = new C34982c(new C34989d(C44917a.m141692r().mo105098a()));
            } else {
                this.f115581a = C44944a.m141816a().mo107451d(uri);
            }
            this.f115584d.uri = uri;
            this.f115584d.urlModel = videoUrlModel2;
            this.f115584d.playerType = this.f115581a.mo88649r();
            this.f115581a.mo88624a((C34976f) this);
            this.f115581a.mo88625a(f115580h);
            this.f115581a.mo88622a(this.f115590k);
            this.f115581a.mo88623a(CommonWidget.INSTANCE.playInfoCallback());
            C44906a.m141666a().mo107383a(this.f115584d.uri, "player_try_play");
            C44913b.m141676a(uri);
            C44923g gVar = new C44923g(m141744a(videoUrlModel2, this.f115584d, z2), m141751d(videoUrlModel), C44917a.m141692r().mo105109l(), videoUrlModel.getSourceId(), z, C44917a.m141692r().mo105110m(), false, videoUrlModel.isH265(), 0, m141750c(videoUrlModel), uri, true, true, C44917a.m141692r().mo105112o(), this.f115587g);
            gVar.f115545l = C44917a.m141692r().mo105113p();
            gVar.f115548o = videoUrlModel.getBitRatedRatioUri();
            C44925a.m141730a().mo107406a(gVar.f115548o, videoUrlModel.getFileCheckSum());
            gVar.f115555v = C44917a.m141692r().mo105114q();
            if (z3 && m141748a(videoUrlModel)) {
                gVar.f115557x = true;
            }
            this.f115581a.mo88620a(this.f115582b.mo107457b());
            this.f115581a.mo88626a(gVar);
            if (!z) {
                this.f115585e = true;
            }
            if (this.f115582b != null) {
                this.f115582b.mo107462f();
            }
        }
    }
}
