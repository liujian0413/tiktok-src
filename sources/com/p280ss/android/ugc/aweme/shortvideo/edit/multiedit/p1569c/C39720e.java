package com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.p1569c;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.os.Handler;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.util.C0902i;
import com.p280ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.C38786e;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p280ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel.C39249a;
import com.p280ss.android.ugc.aweme.shortvideo.cut.viewmodel.C39293a;
import com.p280ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.p1568b.C39710c;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.view.C39761a;
import com.p280ss.android.vesdk.VEEditor.SEEK_MODE;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.e */
public final class C39720e {

    /* renamed from: a */
    public VEVideoCutterViewModel f103248a;

    /* renamed from: b */
    public C39718d f103249b;

    /* renamed from: c */
    public C39710c f103250c;

    /* renamed from: d */
    public C39761a f103251d;

    /* renamed from: e */
    public int f103252e;

    /* renamed from: f */
    public boolean f103253f = true;

    /* renamed from: g */
    public boolean f103254g;

    /* renamed from: h */
    public final Handler f103255h = new Handler();

    /* renamed from: i */
    public final C39293a f103256i = new C39293a(3, 0, SEEK_MODE.EDITOR_SEEK_FLAG_OnGoing);

    /* renamed from: j */
    public final C39737q f103257j = new C39737q(this);

    /* renamed from: k */
    private CutMultiVideoViewModel f103258k;

    /* renamed from: l */
    private VideoEditViewModel f103259l;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.e$a */
    static final class C39721a<T> implements C0053p<C39293a> {

        /* renamed from: a */
        final /* synthetic */ C39720e f103260a;

        C39721a(C39720e eVar) {
            this.f103260a = eVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(C39293a aVar) {
            Integer num;
            if (aVar != null) {
                num = Integer.valueOf(aVar.f102021c);
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 1) {
                this.f103260a.f103255h.post(this.f103260a.f103257j);
                C39720e.m127119a(this.f103260a).mo99113c();
            } else if (num != null && num.intValue() == 2) {
                this.f103260a.f103255h.removeCallbacks(this.f103260a.f103257j);
                C39720e.m127119a(this.f103260a).mo99114d();
            } else {
                if (num != null && num.intValue() == 3) {
                    this.f103260a.f103255h.removeCallbacks(this.f103260a.f103257j);
                    C39720e.m127119a(this.f103260a).mo99102a(aVar.f102020b, aVar.f102019a);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.e$b */
    static final class C39722b<T> implements C0053p<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C39720e f103261a;

        C39722b(C39720e eVar) {
            this.f103261a = eVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            if (this.f103261a.f103254g && bool != null) {
                if (!(!bool.booleanValue())) {
                    bool = null;
                }
                if (bool != null) {
                    C39720e.m127121c(this.f103261a).mo97802a(new C39293a(3, C39720e.m127122d(this.f103261a).mo99182a().getPlayingPosition(), SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.e$c */
    static final class C39723c<T> implements C0053p<Long> {

        /* renamed from: a */
        final /* synthetic */ C39720e f103262a;

        C39723c(C39720e eVar) {
            this.f103262a = eVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Long l) {
            if (this.f103262a.f103254g && l != null) {
                C39720e.m127121c(this.f103262a).mo97802a(new C39293a(3, l.longValue(), SEEK_MODE.EDITOR_SEEK_FLAG_OnGoing));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.e$d */
    static final class C39724d<T> implements C0053p<Void> {

        /* renamed from: a */
        final /* synthetic */ C39720e f103263a;

        C39724d(C39720e eVar) {
            this.f103263a = eVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Void voidR) {
            if (this.f103263a.f103254g) {
                C39720e.m127121c(this.f103263a).mo97802a(new C39293a(3, this.f103263a.mo99121c(), SEEK_MODE.EDITOR_SEEK_FLAG_OnGoing));
                C39720e.m127122d(this.f103263a).mo99200c();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.e$e */
    static final class C39725e<T> implements C0053p<Void> {

        /* renamed from: a */
        final /* synthetic */ C39720e f103264a;

        C39725e(C39720e eVar) {
            this.f103264a = eVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Void voidR) {
            if (this.f103264a.f103254g) {
                C39720e.m127121c(this.f103264a).mo97802a(new C39293a(3, this.f103264a.mo99122d(), SEEK_MODE.EDITOR_SEEK_FLAG_OnGoing));
                C39720e.m127122d(this.f103264a).mo99200c();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.e$f */
    static final class C39726f<T> implements C0053p<Void> {

        /* renamed from: a */
        final /* synthetic */ C39720e f103265a;

        C39726f(C39720e eVar) {
            this.f103265a = eVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Void voidR) {
            if (this.f103265a.f103254g) {
                C39720e.m127121c(this.f103265a).mo97802a(new C39293a(3, this.f103265a.mo99121c(), SEEK_MODE.EDITOR_SEEK_FLAG_LAST_UpdateIn));
                C39720e.m127122d(this.f103265a).mo99200c();
                C39720e.m127120b(this.f103265a).mo99086a(this.f103265a.mo99121c(), this.f103265a.mo99122d());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.e$g */
    static final class C39727g<T> implements C0053p<Void> {

        /* renamed from: a */
        final /* synthetic */ C39720e f103266a;

        C39727g(C39720e eVar) {
            this.f103266a = eVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Void voidR) {
            if (this.f103266a.f103254g) {
                C39720e.m127121c(this.f103266a).mo97802a(new C39293a(3, this.f103266a.mo99122d(), SEEK_MODE.EDITOR_SEEK_FLAG_LAST_UpdateOut));
                C39720e.m127122d(this.f103266a).mo99200c();
                C39720e.m127120b(this.f103266a).mo99086a(this.f103266a.mo99121c(), this.f103266a.mo99122d());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.e$h */
    static final class C39728h<T> implements C0053p<Void> {

        /* renamed from: a */
        final /* synthetic */ C39720e f103267a;

        C39728h(C39720e eVar) {
            this.f103267a = eVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Void voidR) {
            if (this.f103267a.f103254g) {
                this.f103267a.f103256i.f102020b = C39720e.m127122d(this.f103267a).mo99182a().getPlayingPosition();
                C39720e.m127121c(this.f103267a).mo97802a(this.f103267a.f103256i);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.e$i */
    static final class C39729i<T> implements C0053p<C0902i<Integer, Integer>> {

        /* renamed from: a */
        final /* synthetic */ C39720e f103268a;

        C39729i(C39720e eVar) {
            this.f103268a = eVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(C0902i<Integer, Integer> iVar) {
            C39720e.m127120b(this.f103268a).mo99087a(iVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.e$j */
    static final class C39730j<T> implements C0053p<C38786e> {

        /* renamed from: a */
        final /* synthetic */ C39720e f103269a;

        C39730j(C39720e eVar) {
            this.f103269a = eVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(C38786e eVar) {
            Integer num;
            if (eVar != null) {
                num = Integer.valueOf(eVar.f100800b);
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 0) {
                if (this.f103269a.f103253f) {
                    this.f103269a.f103252e = eVar.f100801c;
                    C39720e.m127121c(this.f103269a).mo97802a(new C39293a(2, false));
                }
                this.f103269a.f103253f = false;
                C39720e.m127122d(this.f103269a).mo99195a(false, 0);
                return;
            }
            if ((num == null || num.intValue() != 1) && num != null && num.intValue() == 2) {
                this.f103269a.f103253f = true;
                C39720e.m127122d(this.f103269a).mo99195a(true, eVar.f100802d);
                C39720e.m127120b(this.f103269a).mo99085a(this.f103269a.f103252e, eVar.f100802d);
                if (!C39720e.m127122d(this.f103269a).mo99199b()) {
                    C39720e.m127121c(this.f103269a).mo97802a(new C39293a(1, false));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.e$k */
    public static final class C39731k implements C39249a {

        /* renamed from: a */
        final /* synthetic */ C39720e f103270a;

        C39731k(C39720e eVar) {
            this.f103270a = eVar;
        }

        /* renamed from: a */
        public final void mo96777a(VideoSegment videoSegment) {
            if (this.f103270a.f103254g) {
                C39720e.m127122d(this.f103270a).mo99191a(videoSegment);
            }
        }

        /* renamed from: b */
        public final void mo96778b(VideoSegment videoSegment) {
            if (this.f103270a.f103254g) {
                C39720e.m127122d(this.f103270a).mo99197b(videoSegment);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.e$l */
    static final class C39732l<T> implements C0053p<C0902i<Integer, Integer>> {

        /* renamed from: a */
        final /* synthetic */ C39720e f103271a;

        C39732l(C39720e eVar) {
            this.f103271a = eVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(C0902i<Integer, Integer> iVar) {
            if (this.f103271a.f103254g) {
                C39720e.m127120b(this.f103271a).mo99091d();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.e$m */
    static final class C39733m<T> implements C0053p<Void> {

        /* renamed from: a */
        final /* synthetic */ C39720e f103272a;

        C39733m(C39720e eVar) {
            this.f103272a = eVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Void voidR) {
            if (this.f103272a.f103254g) {
                C39720e.m127120b(this.f103272a).mo99089b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.e$n */
    static final class C39734n<T> implements C0053p<Void> {

        /* renamed from: a */
        final /* synthetic */ C39720e f103273a;

        C39734n(C39720e eVar) {
            this.f103273a = eVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Void voidR) {
            if (this.f103273a.f103254g) {
                C39720e.m127120b(this.f103273a).mo99090c();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.e$o */
    static final class C39735o<T> implements C0053p<VideoSegment> {

        /* renamed from: a */
        final /* synthetic */ C39720e f103274a;

        C39735o(C39720e eVar) {
            this.f103274a = eVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(VideoSegment videoSegment) {
            if (this.f103274a.f103254g) {
                C39720e.m127120b(this.f103274a).mo99084a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.e$p */
    static final class C39736p<T> implements C0053p<Integer> {

        /* renamed from: a */
        final /* synthetic */ C39720e f103275a;

        C39736p(C39720e eVar) {
            this.f103275a = eVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Integer num) {
            if (this.f103275a.f103254g) {
                C39720e.m127120b(this.f103275a).mo99088a(num);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.e$q */
    public static final class C39737q implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C39720e f103276a;

        public final void run() {
            this.f103276a.mo99119a(false);
            this.f103276a.f103255h.postDelayed(this, 30);
        }

        C39737q(C39720e eVar) {
            this.f103276a = eVar;
        }
    }

    /* renamed from: e */
    private final long m127123e() {
        C39718d dVar = this.f103249b;
        if (dVar == null) {
            C7573i.m23583a("editorPresenter");
        }
        return dVar.mo99112b();
    }

    /* renamed from: a */
    public final void mo99115a() {
        this.f103255h.post(this.f103257j);
    }

    /* renamed from: b */
    public final void mo99120b() {
        this.f103255h.removeCallbacks(this.f103257j);
    }

    /* renamed from: c */
    public final long mo99121c() {
        C39761a aVar = this.f103251d;
        if (aVar == null) {
            C7573i.m23583a("viewManager");
        }
        return aVar.mo99182a().getLeftSeekingValue();
    }

    /* renamed from: d */
    public final long mo99122d() {
        C39761a aVar = this.f103251d;
        if (aVar == null) {
            C7573i.m23583a("viewManager");
        }
        return aVar.mo99182a().getRightSeekingValue();
    }

    /* renamed from: a */
    public final void mo99118a(C39710c cVar) {
        C7573i.m23587b(cVar, "listener");
        this.f103250c = cVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ C39718d m127119a(C39720e eVar) {
        C39718d dVar = eVar.f103249b;
        if (dVar == null) {
            C7573i.m23583a("editorPresenter");
        }
        return dVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ C39710c m127120b(C39720e eVar) {
        C39710c cVar = eVar.f103250c;
        if (cVar == null) {
            C7573i.m23583a("multiEditVideoObserversListener");
        }
        return cVar;
    }

    /* renamed from: c */
    public static final /* synthetic */ VEVideoCutterViewModel m127121c(C39720e eVar) {
        VEVideoCutterViewModel vEVideoCutterViewModel = eVar.f103248a;
        if (vEVideoCutterViewModel == null) {
            C7573i.m23583a("veVideoCutterViewModel");
        }
        return vEVideoCutterViewModel;
    }

    /* renamed from: d */
    public static final /* synthetic */ C39761a m127122d(C39720e eVar) {
        C39761a aVar = eVar.f103251d;
        if (aVar == null) {
            C7573i.m23583a("viewManager");
        }
        return aVar;
    }

    /* renamed from: a */
    public final void mo99119a(boolean z) {
        long e = m127123e();
        if (z) {
            e = 0;
        }
        if (e >= 0) {
            CutMultiVideoViewModel cutMultiVideoViewModel = this.f103258k;
            if (cutMultiVideoViewModel == null) {
                C7573i.m23583a("cutMultiVideoViewModel");
            }
            VideoEditViewModel videoEditViewModel = this.f103259l;
            if (videoEditViewModel == null) {
                C7573i.m23583a("videoEditViewModel");
            }
            List m = videoEditViewModel.mo97720m();
            VideoEditViewModel videoEditViewModel2 = this.f103259l;
            if (videoEditViewModel2 == null) {
                C7573i.m23583a("videoEditViewModel");
            }
            cutMultiVideoViewModel.mo96666a(e, m, videoEditViewModel2.mo97722o());
        }
    }

    /* renamed from: a */
    public final void mo99116a(FragmentActivity fragmentActivity) {
        C7573i.m23587b(fragmentActivity, "activity");
        VEVideoCutterViewModel vEVideoCutterViewModel = this.f103248a;
        if (vEVideoCutterViewModel == null) {
            C7573i.m23583a("veVideoCutterViewModel");
        }
        C0043i iVar = fragmentActivity;
        vEVideoCutterViewModel.mo97801a().observe(iVar, new C39721a(this));
        CutMultiVideoViewModel cutMultiVideoViewModel = this.f103258k;
        if (cutMultiVideoViewModel == null) {
            C7573i.m23583a("cutMultiVideoViewModel");
        }
        cutMultiVideoViewModel.f100394a.observe(iVar, new C39729i(this));
        CutMultiVideoViewModel cutMultiVideoViewModel2 = this.f103258k;
        if (cutMultiVideoViewModel2 == null) {
            C7573i.m23583a("cutMultiVideoViewModel");
        }
        cutMultiVideoViewModel2.f100403j.observe(iVar, new C39730j(this));
        VideoEditViewModel videoEditViewModel = this.f103259l;
        if (videoEditViewModel == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        videoEditViewModel.f101856u = new C39731k(this);
        VideoEditViewModel videoEditViewModel2 = this.f103259l;
        if (videoEditViewModel2 == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        videoEditViewModel2.f101849n.observe(iVar, new C39732l(this));
        VideoEditViewModel videoEditViewModel3 = this.f103259l;
        if (videoEditViewModel3 == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        videoEditViewModel3.f101850o.observe(iVar, new C39733m(this));
        VideoEditViewModel videoEditViewModel4 = this.f103259l;
        if (videoEditViewModel4 == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        videoEditViewModel4.f101851p.observe(iVar, new C39734n(this));
        VideoEditViewModel videoEditViewModel5 = this.f103259l;
        if (videoEditViewModel5 == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        videoEditViewModel5.f101852q.observe(iVar, new C39735o(this));
        VideoEditViewModel videoEditViewModel6 = this.f103259l;
        if (videoEditViewModel6 == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        videoEditViewModel6.f101836a.observe(iVar, new C39736p(this));
        VideoEditViewModel videoEditViewModel7 = this.f103259l;
        if (videoEditViewModel7 == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        videoEditViewModel7.f101837b.observe(iVar, new C39722b(this));
        VideoEditViewModel videoEditViewModel8 = this.f103259l;
        if (videoEditViewModel8 == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        videoEditViewModel8.f101839d.observe(iVar, new C39723c(this));
        VideoEditViewModel videoEditViewModel9 = this.f103259l;
        if (videoEditViewModel9 == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        videoEditViewModel9.f101841f.observe(iVar, new C39724d(this));
        VideoEditViewModel videoEditViewModel10 = this.f103259l;
        if (videoEditViewModel10 == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        videoEditViewModel10.f101840e.observe(iVar, new C39725e(this));
        VideoEditViewModel videoEditViewModel11 = this.f103259l;
        if (videoEditViewModel11 == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        videoEditViewModel11.f101842g.observe(iVar, new C39726f(this));
        VideoEditViewModel videoEditViewModel12 = this.f103259l;
        if (videoEditViewModel12 == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        videoEditViewModel12.f101845j.observe(iVar, new C39727g(this));
        VideoEditViewModel videoEditViewModel13 = this.f103259l;
        if (videoEditViewModel13 == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        videoEditViewModel13.f101846k.observe(iVar, new C39728h(this));
    }

    /* renamed from: a */
    public final void mo99117a(VEVideoCutterViewModel vEVideoCutterViewModel, CutMultiVideoViewModel cutMultiVideoViewModel, VideoEditViewModel videoEditViewModel, C39718d dVar, C39761a aVar) {
        C7573i.m23587b(vEVideoCutterViewModel, "veVideoCutterViewModel");
        C7573i.m23587b(cutMultiVideoViewModel, "cutterViewModel");
        C7573i.m23587b(videoEditViewModel, "videoEditViewModel");
        C7573i.m23587b(dVar, "editorPresenter");
        C7573i.m23587b(aVar, "viewManager");
        this.f103248a = vEVideoCutterViewModel;
        this.f103258k = cutMultiVideoViewModel;
        this.f103259l = videoEditViewModel;
        this.f103249b = dVar;
        this.f103251d = aVar;
    }
}
