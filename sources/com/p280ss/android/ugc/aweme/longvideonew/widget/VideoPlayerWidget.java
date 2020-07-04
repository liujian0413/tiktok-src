package com.p280ss.android.ugc.aweme.longvideonew.widget;

import android.arch.lifecycle.C0053p;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.utils.C6900g;
import com.p280ss.android.ugc.aweme.commercialize.log.C24935ah;
import com.p280ss.android.ugc.aweme.commercialize.log.C24935ah.C24936a;
import com.p280ss.android.ugc.aweme.commercialize.p1119c.C24574n;
import com.p280ss.android.ugc.aweme.feed.C28297e;
import com.p280ss.android.ugc.aweme.feed.helper.C28412a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.freeflowcard.p1279b.C29972a;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.longvideo.C32752l;
import com.p280ss.android.ugc.aweme.longvideonew.C32783f;
import com.p280ss.android.ugc.aweme.longvideonew.feature.C32797c;
import com.p280ss.android.ugc.aweme.longvideonew.p1376a.C32773a;
import com.p280ss.android.ugc.aweme.longvideonew.p1376a.C32773a.C32775b;
import com.p280ss.android.ugc.aweme.longvideonew.p1376a.C32773a.C32776c;
import com.p280ss.android.ugc.aweme.player.sdk.api.C34976f;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.GenericWidget;
import com.p280ss.android.ugc.aweme.video.C43316v;
import com.p280ss.android.ugc.aweme.web.jsbridge.C43527w;
import com.p280ss.android.ugc.playerkit.model.C44919c;
import com.p280ss.android.ugc.playerkit.model.C44920d;
import com.p280ss.android.ugc.playerkit.model.C44921e;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.longvideonew.widget.VideoPlayerWidget */
public final class VideoPlayerWidget extends GenericWidget implements C0053p<C23083a>, C34976f {

    /* renamed from: q */
    public static final C32810a f85604q = new C32810a(null);

    /* renamed from: a */
    public C32773a f85605a;

    /* renamed from: i */
    public boolean f85606i;

    /* renamed from: j */
    public final Aweme f85607j;

    /* renamed from: k */
    public final String f85608k;

    /* renamed from: l */
    public final int f85609l;

    /* renamed from: m */
    public final String f85610m;

    /* renamed from: n */
    public final C28297e f85611n;

    /* renamed from: o */
    public final int f85612o;

    /* renamed from: p */
    public final String f85613p;

    /* renamed from: r */
    private C24935ah f85614r;

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.widget.VideoPlayerWidget$a */
    public static final class C32810a {
        private C32810a() {
        }

        public /* synthetic */ C32810a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.widget.VideoPlayerWidget$b */
    public static final class C32811b implements C32776c {

        /* renamed from: a */
        final /* synthetic */ VideoPlayerWidget f85615a;

        C32811b(VideoPlayerWidget videoPlayerWidget) {
            this.f85615a = videoPlayerWidget;
        }

        /* renamed from: a */
        public final void mo84297a(int i) {
            this.f85615a.f60922e.mo60134a("action_video_secondary_progress", (Object) Integer.valueOf(i));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.widget.VideoPlayerWidget$c */
    public static final class C32812c implements C32775b {

        /* renamed from: a */
        final /* synthetic */ VideoPlayerWidget f85616a;

        /* renamed from: a */
        public final boolean mo84296a() {
            if (this.f85616a.f85606i) {
                return false;
            }
            C6900g b = C6900g.m21454b();
            C7573i.m23582a((Object) b, "NetworkStateManager.getInstance()");
            if (b.mo16942c()) {
                return true;
            }
            C29972a.m98273a().mo76167a(this.f85616a.f85608k);
            return true;
        }

        C32812c(VideoPlayerWidget videoPlayerWidget) {
            this.f85616a = videoPlayerWidget;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.widget.VideoPlayerWidget$d */
    static final class C32813d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VideoPlayerWidget f85617a;

        C32813d(VideoPlayerWidget videoPlayerWidget) {
            this.f85617a = videoPlayerWidget;
        }

        public final void run() {
            String str;
            C32773a aVar = this.f85617a.f85605a;
            if (aVar != null) {
                Aweme aweme = this.f85617a.f85607j;
                if (aweme != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                aVar.mo63047b(str);
            }
        }
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
    public final long mo84340a() {
        C32773a aVar = this.f85605a;
        if (aVar != null) {
            C43316v vVar = aVar.f85480b;
            if (vVar != null) {
                return vVar.mo104915n();
            }
        }
        return 0;
    }

    public final void onPause() {
        super.onPause();
        C32773a aVar = this.f85605a;
        if (aVar != null) {
            aVar.mo84292e();
        }
    }

    public final void onResume() {
        super.onResume();
        C32773a aVar = this.f85605a;
        if (aVar != null) {
            aVar.mo84291d();
        }
    }

    /* renamed from: d */
    private static boolean m106183d() {
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            Integer isAdapterVideoPlaySize = a.getIsAdapterVideoPlaySize();
            if (isAdapterVideoPlaySize != null) {
                if (isAdapterVideoPlaySize.intValue() == 1) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        C32773a aVar = this.f85605a;
        if (aVar != null) {
            aVar.mo84293f();
        }
        if (C24936a.m81819a(this.f85607j)) {
            this.f85614r.mo65205b();
        }
    }

    public final void onCreate() {
        super.onCreate();
        C0053p pVar = this;
        this.f60922e.mo60132a("action_seek_stop_tracking_touch", pVar).mo60132a("action_play_control", pVar).mo60132a("action_replay", pVar).mo60132a("action_video_play_loop", pVar).mo60132a("action_video_mute", pVar).mo60132a("action_video_unmute", pVar).mo60132a("action_video_auto_resize", pVar);
        if (C24936a.m81819a(this.f85607j)) {
            this.f85614r.mo65204a();
        }
    }

    /* renamed from: e */
    private final boolean m106184e() {
        C43316v vVar;
        try {
            if (this.f85607j == null) {
                return false;
            }
            Video a = C32752l.f85394b.mo84248a(this.f85607j);
            if (a == null) {
                a = C32752l.f85393a.mo84248a(this.f85607j);
            }
            if (a == null) {
                return false;
            }
            C32773a aVar = this.f85605a;
            if (aVar != null) {
                vVar = aVar.f85480b;
            } else {
                vVar = null;
            }
            if (vVar == null) {
                return false;
            }
            int l = vVar.mo104913l();
            int m = vVar.mo104914m();
            if (l <= 0 || m <= 0 || a.getWidth() <= 0 || a.getHeight() <= 0 || !C28412a.m93389a(a.getWidth(), a.getHeight(), l, m)) {
                return false;
            }
            a.setWidth(l);
            a.setHeight(m);
            UrlModel originCover = a.getOriginCover();
            if (originCover != null) {
                originCover.setWidth(l);
            }
            UrlModel originCover2 = a.getOriginCover();
            if (originCover2 != null) {
                originCover2.setHeight(m);
            }
            this.f60922e.mo60134a("resize_video_and_cover", (Object) new C32797c(l, m));
            return true;
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: a */
    public final void mo63043a(C44919c cVar) {
        this.f60922e.mo60134a("action_video_on_play_fail", (Object) cVar);
    }

    /* renamed from: c */
    public final void mo64949c(String str) {
        this.f60922e.mo60134a("action_video_on_prepare_play", (Object) str);
    }

    /* renamed from: b */
    public final void mo64944b(float f) {
        this.f60922e.mo60134a("action_video_on_play_progress_change", (Object) Float.valueOf(f));
    }

    /* renamed from: e_ */
    public final void mo64954e_(boolean z) {
        this.f60922e.mo60134a("action_video_on_buffering", (Object) Boolean.valueOf(z));
    }

    /* renamed from: a */
    public final void mo63045a(C44921e eVar) {
        this.f60922e.mo60134a("on_render_first_frame", (Object) eVar);
        if (m106183d()) {
            m106184e();
        }
    }

    /* renamed from: a */
    public final void mo63044a(C44920d dVar) {
        boolean z;
        VideoPlayerWidget videoPlayerWidget;
        this.f60922e.mo60134a("action_video_on_render_ready", (Object) dVar);
        if (!TextUtils.isEmpty(this.f85613p) || this.f85607j == null) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            videoPlayerWidget = this;
        } else {
            videoPlayerWidget = null;
        }
        VideoPlayerWidget videoPlayerWidget2 = videoPlayerWidget;
        if (videoPlayerWidget2 != null) {
            String str = videoPlayerWidget2.f85613p;
            long a = videoPlayerWidget2.mo84340a();
            Aweme aweme = videoPlayerWidget2.f85607j;
            if (aweme == null) {
                C7573i.m23580a();
            }
            String aid = aweme.getAid();
            C7573i.m23582a((Object) aid, "mAweme!!.aid");
            C43527w wVar = new C43527w(str, 0, a, aid);
            C42961az.m136380a(wVar);
        }
    }

    /* renamed from: b */
    public final void mo63047b(String str) {
        boolean z;
        VideoPlayerWidget videoPlayerWidget;
        this.f60922e.mo60134a("action_video_on_play_completed", (Object) "onPlayCompleted");
        if (!TextUtils.isEmpty(this.f85613p) || this.f85607j == null) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            videoPlayerWidget = this;
        } else {
            videoPlayerWidget = null;
        }
        VideoPlayerWidget videoPlayerWidget2 = videoPlayerWidget;
        if (videoPlayerWidget2 != null) {
            String str2 = videoPlayerWidget2.f85613p;
            long a = videoPlayerWidget2.mo84340a();
            Aweme aweme = videoPlayerWidget2.f85607j;
            if (aweme == null) {
                C7573i.m23580a();
            }
            String aid = aweme.getAid();
            C7573i.m23582a((Object) aid, "mAweme!!.aid");
            C43527w wVar = new C43527w(str2, 3, a, aid);
            C42961az.m136380a(wVar);
        }
    }

    /* renamed from: d */
    public final void mo64951d(String str) {
        boolean z;
        VideoPlayerWidget videoPlayerWidget;
        this.f60922e.mo60134a("action_video_on_pause_play", (Object) str);
        if (!TextUtils.isEmpty(this.f85613p) || this.f85607j == null) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            videoPlayerWidget = this;
        } else {
            videoPlayerWidget = null;
        }
        VideoPlayerWidget videoPlayerWidget2 = videoPlayerWidget;
        if (videoPlayerWidget2 != null) {
            String str2 = videoPlayerWidget2.f85613p;
            long a = videoPlayerWidget2.mo84340a();
            Aweme aweme = videoPlayerWidget2.f85607j;
            if (aweme == null) {
                C7573i.m23580a();
            }
            String aid = aweme.getAid();
            C7573i.m23582a((Object) aid, "mAweme!!.aid");
            C43527w wVar = new C43527w(str2, 1, a, aid);
            C42961az.m136380a(wVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(C23083a aVar) {
        String str;
        if (aVar != null) {
            str = aVar.f60948a;
        } else {
            str = null;
        }
        if (str != null) {
            switch (str.hashCode()) {
                case -1926260769:
                    if (str.equals("action_video_unmute")) {
                        C32773a aVar2 = this.f85605a;
                        if (aVar2 != null) {
                            aVar2.mo84295h();
                            break;
                        } else {
                            return;
                        }
                    }
                    break;
                case -1061452538:
                    if (str.equals("action_video_mute")) {
                        C32773a aVar3 = this.f85605a;
                        if (aVar3 != null) {
                            aVar3.mo84294g();
                            break;
                        } else {
                            return;
                        }
                    }
                    break;
                case -884511230:
                    if (str.equals("action_video_play_loop")) {
                        C24574n nVar = (C24574n) aVar.mo60161a();
                        C32773a aVar4 = this.f85605a;
                        if (aVar4 != null) {
                            aVar4.mo84285a(nVar);
                            break;
                        } else {
                            return;
                        }
                    }
                    break;
                case -263396937:
                    if (str.equals("action_video_auto_resize")) {
                        m106184e();
                        break;
                    }
                    break;
                case 561796795:
                    if (str.equals("action_play_control")) {
                        C32773a aVar5 = this.f85605a;
                        if (aVar5 != null) {
                            aVar5.mo84290c();
                            break;
                        } else {
                            return;
                        }
                    }
                    break;
                case 710880054:
                    if (str.equals("action_seek_stop_tracking_touch")) {
                        Object a = aVar.mo60161a();
                        if (a == null) {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
                        } else if (((Float) a).floatValue() == 100.0f) {
                            View view = this.f60921d;
                            if (view != null) {
                                view.postDelayed(new C32813d(this), 600);
                                break;
                            } else {
                                return;
                            }
                        } else {
                            C32773a aVar6 = this.f85605a;
                            if (aVar6 != null) {
                                Object a2 = aVar.mo60161a();
                                C7573i.m23582a(a2, "t.getData()");
                                aVar6.mo84283a(((Number) a2).floatValue());
                                break;
                            } else {
                                return;
                            }
                        }
                    }
                    break;
                case 1497529872:
                    if (str.equals("action_replay")) {
                        C32773a aVar7 = this.f85605a;
                        if (aVar7 != null) {
                            aVar7.mo84289b();
                            break;
                        } else {
                            return;
                        }
                    }
                    break;
            }
        }
    }

    /* renamed from: a */
    public final void mo60146a(View view) {
        boolean z;
        boolean z2;
        C43316v vVar;
        super.mo60146a(view);
        if ("long_video_player_activity".equals(this.f85610m)) {
            z2 = true;
            z = true;
        } else {
            z2 = false;
            z = false;
        }
        if (view != null) {
            C32773a aVar = new C32773a((ViewGroup) view, this.f85607j, z2, z, this.f85612o);
            this.f85605a = aVar;
            C32773a aVar2 = this.f85605a;
            if (aVar2 != null) {
                aVar2.mo84288a((C34976f) this);
            }
            C32773a aVar3 = this.f85605a;
            if (aVar3 != null) {
                Aweme aweme = this.f85607j;
                String str = this.f85608k;
                int i = this.f85609l;
                C32773a aVar4 = this.f85605a;
                if (aVar4 != null) {
                    vVar = aVar4.f85480b;
                } else {
                    vVar = null;
                }
                aVar3.mo84288a((C34976f) new C32783f(aweme, str, i, vVar));
            }
            if (C24936a.m81819a(this.f85607j)) {
                C32773a aVar5 = this.f85605a;
                if (aVar5 != null) {
                    aVar5.mo84288a((C34976f) this.f85614r);
                }
            }
            C32773a aVar6 = this.f85605a;
            if (aVar6 != null) {
                aVar6.mo84287a((C32776c) new C32811b(this));
            }
            C32773a aVar7 = this.f85605a;
            if (aVar7 != null) {
                aVar7.mo84286a((C32775b) new C32812c(this));
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* renamed from: a */
    public final void mo63046a(String str) {
        boolean z;
        VideoPlayerWidget videoPlayerWidget;
        this.f60922e.mo60134a("action_video_on_resume_play", (Object) str);
        if (!TextUtils.isEmpty(this.f85613p) || this.f85607j == null) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            videoPlayerWidget = this;
        } else {
            videoPlayerWidget = null;
        }
        VideoPlayerWidget videoPlayerWidget2 = videoPlayerWidget;
        if (videoPlayerWidget2 != null) {
            String str2 = videoPlayerWidget2.f85613p;
            long a = videoPlayerWidget2.mo84340a();
            Aweme aweme = videoPlayerWidget2.f85607j;
            if (aweme == null) {
                C7573i.m23580a();
            }
            String aid = aweme.getAid();
            C7573i.m23582a((Object) aid, "mAweme!!.aid");
            C43527w wVar = new C43527w(str2, 0, a, aid);
            C42961az.m136380a(wVar);
        }
    }

    public VideoPlayerWidget(Aweme aweme, String str, int i, String str2, C28297e eVar, int i2, String str3) {
        C7573i.m23587b(str, "mEventType");
        C7573i.m23587b(str2, "mBusinessType");
        C7573i.m23587b(str3, "reactSessionId");
        this.f85607j = aweme;
        this.f85608k = str;
        this.f85609l = i;
        this.f85610m = str2;
        this.f85611n = eVar;
        this.f85612o = i2;
        this.f85613p = str3;
        this.f85614r = new C24935ah(this.f85607j);
    }

    public /* synthetic */ VideoPlayerWidget(Aweme aweme, String str, int i, String str2, C28297e eVar, int i2, String str3, int i3, C7571f fVar) {
        this(aweme, str, i, str2, eVar, 0, "");
    }
}
