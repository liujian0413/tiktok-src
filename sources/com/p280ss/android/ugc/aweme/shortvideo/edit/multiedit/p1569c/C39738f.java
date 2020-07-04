package com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.p1569c;

import android.app.Activity;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.util.C0902i;
import android.text.TextUtils;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.apm.util.C6292i;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.jedi.arch.JediViewModel;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.aweme.base.activity.C23254a;
import com.p280ss.android.ugc.aweme.base.activity.C23258e;
import com.p280ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.cut.C38774k;
import com.p280ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p280ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.cut.viewmodel.C39293a;
import com.p280ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.p1567a.C39696a;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.p1567a.C39700b;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.p1567a.C39702d;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.p1568b.C39708a;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.p1568b.C39709b;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.p1568b.C39710c;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.p1568b.C39711d;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.view.C39761a;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.view.C39763c;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.view.C39773d;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.TimeSpeedModelExtension;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordNewActivity;
import com.p280ss.android.ugc.gamora.editor.EditViewModel;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.BooleanRef;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.f */
public final class C39738f implements OnClickListener {

    /* renamed from: A */
    private ArrayList<TimeSpeedModelExtension> f103277A;

    /* renamed from: B */
    private ArrayList<TimeSpeedModelExtension> f103278B;

    /* renamed from: C */
    private ArrayList<TimeSpeedModelExtension> f103279C;

    /* renamed from: D */
    private boolean f103280D;

    /* renamed from: E */
    private C23258e f103281E;

    /* renamed from: F */
    private final C23254a f103282F = new C39745g(this);

    /* renamed from: G */
    private C39708a f103283G;

    /* renamed from: a */
    public CutMultiVideoViewModel f103284a;

    /* renamed from: b */
    public VideoEditViewModel f103285b;

    /* renamed from: c */
    public FragmentActivity f103286c;

    /* renamed from: d */
    public C39761a f103287d;

    /* renamed from: e */
    public C39718d f103288e = new C39718d();

    /* renamed from: f */
    public C39750g f103289f = new C39750g();

    /* renamed from: g */
    public C39720e f103290g = new C39720e();

    /* renamed from: h */
    public int f103291h;

    /* renamed from: i */
    public VideoPublishEditModel f103292i;

    /* renamed from: j */
    public MultiEditVideoRecordData f103293j;

    /* renamed from: k */
    public MultiEditVideoRecordData f103294k;

    /* renamed from: l */
    public boolean f103295l;

    /* renamed from: m */
    public int f103296m = 1;

    /* renamed from: n */
    public int f103297n;

    /* renamed from: o */
    public C39717c f103298o = new C39717c();

    /* renamed from: p */
    private VEVideoCutterViewModel f103299p;

    /* renamed from: q */
    private EditViewModel f103300q;

    /* renamed from: r */
    private View f103301r;

    /* renamed from: s */
    private ArrayList<MediaModel> f103302s = new ArrayList<>();

    /* renamed from: t */
    private boolean f103303t;

    /* renamed from: u */
    private ArrayList<VideoSegment> f103304u = new ArrayList<>();

    /* renamed from: v */
    private MultiEditVideoRecordData f103305v;

    /* renamed from: w */
    private MultiEditVideoRecordData f103306w;

    /* renamed from: x */
    private AVMusic f103307x;

    /* renamed from: y */
    private int f103308y;

    /* renamed from: z */
    private ArrayList<TimeSpeedModelExtension> f103309z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.f$a */
    static final class C39739a extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C39738f f103310a;

        C39739a(C39738f fVar) {
            this.f103310a = fVar;
            super(0);
        }

        /* renamed from: a */
        private void m127181a() {
            this.f103310a.mo99138g();
        }

        public final /* synthetic */ Object invoke() {
            m127181a();
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.f$b */
    static final class C39740b extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C39738f f103311a;

        C39740b(C39738f fVar) {
            this.f103311a = fVar;
            super(0);
        }

        /* renamed from: a */
        private void m127182a() {
            this.f103311a.mo99135d();
        }

        public final /* synthetic */ Object invoke() {
            m127182a();
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.f$c */
    public static final class C39741c implements C39710c {

        /* renamed from: a */
        final /* synthetic */ C39738f f103312a;

        /* renamed from: a */
        public final void mo99084a() {
            this.f103312a.f103289f.mo99143a(C39738f.m127155e(this.f103312a), this.f103312a.f103291h, false, true);
        }

        /* renamed from: b */
        public final void mo99089b() {
            this.f103312a.f103289f.mo99143a(C39738f.m127155e(this.f103312a), this.f103312a.f103291h, false, false);
        }

        /* renamed from: c */
        public final void mo99090c() {
            this.f103312a.f103289f.mo99143a(C39738f.m127155e(this.f103312a), this.f103312a.f103291h, true, false);
        }

        /* renamed from: d */
        public final void mo99091d() {
            if (!C39738f.m127156f(this.f103312a).multiEditVideoRecordData.isMultiEditRetake || C39738f.m127156f(this.f103312a).multiEditVideoRecordData.segmentSizeChange) {
                this.f103312a.f103289f.mo99144a(C39738f.m127155e(this.f103312a), (VideoSegment) C39738f.m127154d(this.f103312a).mo97721n().get(this.f103312a.f103291h), this.f103312a.f103291h);
            } else {
                this.f103312a.f103289f.mo99147b(C39738f.m127155e(this.f103312a), (VideoSegment) C39738f.m127154d(this.f103312a).mo97721n().get(this.f103312a.f103291h), this.f103312a.f103291h);
            }
        }

        C39741c(C39738f fVar) {
            this.f103312a = fVar;
        }

        /* renamed from: a */
        public final void mo99088a(Integer num) {
            int i;
            C39738f fVar = this.f103312a;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 1;
            }
            fVar.f103296m = i;
        }

        /* renamed from: a */
        public final void mo99087a(C0902i<Integer, Integer> iVar) {
            if (iVar != null && this.f103312a.f103296m != 2) {
                C39761a c = C39738f.m127152c(this.f103312a);
                F f = iVar.f3154a;
                if (f == null) {
                    C7573i.m23580a();
                }
                C7573i.m23582a((Object) f, "pair.first!!");
                int intValue = ((Number) f).intValue();
                S s = iVar.f3155b;
                if (s == null) {
                    C7573i.m23580a();
                }
                C7573i.m23582a((Object) s, "pair.second!!");
                c.mo99183a(intValue, ((Number) s).intValue());
            }
        }

        /* renamed from: a */
        public final void mo99085a(int i, int i2) {
            this.f103312a.mo99125a(i, i2);
        }

        /* renamed from: a */
        public final void mo99086a(long j, long j2) {
            if (this.f103312a.mo99131a()) {
                if (this.f103312a.f103297n == 0) {
                    this.f103312a.f103297n = (int) (this.f103312a.f103298o.f103235b - this.f103312a.f103298o.f103234a);
                }
                int i = (int) (j2 - j);
                C39700b.f103201a.mo99067a(false, true, 0, this.f103312a.f103297n, i);
                this.f103312a.f103297n = i;
            } else if (this.f103312a.f103296m == 1) {
                if (this.f103312a.f103297n == 0) {
                    this.f103312a.f103297n = (int) (this.f103312a.f103298o.f103235b - this.f103312a.f103298o.f103234a);
                }
                int i2 = (int) (j2 - j);
                C39700b.f103201a.mo99067a(false, false, 0, this.f103312a.f103297n, i2);
                this.f103312a.f103297n = i2;
            } else {
                if (this.f103312a.f103297n == 0) {
                    C39738f fVar = this.f103312a;
                    Object obj = C39738f.m127154d(this.f103312a).mo97721n().get(this.f103312a.f103291h);
                    C7573i.m23582a(obj, "videoEditViewModel.origi…deoList[currentEditIndex]");
                    long i3 = ((VideoSegment) obj).mo96910i();
                    Object obj2 = C39738f.m127154d(this.f103312a).mo97721n().get(this.f103312a.f103291h);
                    C7573i.m23582a(obj2, "videoEditViewModel.origi…deoList[currentEditIndex]");
                    fVar.f103297n = (int) (i3 - ((VideoSegment) obj2).mo96909h());
                }
                int i4 = (int) (j2 - j);
                C39700b.f103201a.mo99067a(true, false, this.f103312a.f103291h, this.f103312a.f103297n, i4);
                this.f103312a.f103297n = i4;
            }
            if (this.f103312a.f103296m == 1) {
                this.f103312a.f103298o.f103234a = j;
                this.f103312a.f103298o.f103235b = j2;
                C0902i d = C39738f.m127152c(this.f103312a).mo99201d();
                C39717c cVar = this.f103312a.f103298o;
                F f = d.f3154a;
                if (f == null) {
                    C7573i.m23580a();
                }
                cVar.f103236c = ((Number) f).floatValue();
                C39717c cVar2 = this.f103312a.f103298o;
                S s = d.f3155b;
                if (s == null) {
                    C7573i.m23580a();
                }
                cVar2.f103237d = ((Number) s).floatValue();
                this.f103312a.f103288e.mo99106a(C39738f.m127149a(this.f103312a), (int) j, (int) j2);
                return;
            }
            this.f103312a.f103288e.mo99107a(C39738f.m127149a(this.f103312a), this.f103312a.f103298o.f103243j, (int) j, (int) (j2 - j));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.f$d */
    public static final class C39742d implements C39711d {

        /* renamed from: a */
        final /* synthetic */ C39738f f103313a;

        /* renamed from: b */
        public final void mo99094b() {
            this.f103313a.f103295l = false;
        }

        /* renamed from: a */
        public final void mo99092a() {
            if (!this.f103313a.f103298o.f103240g) {
                this.f103313a.mo99134c();
            }
        }

        C39742d(C39738f fVar) {
            this.f103313a = fVar;
        }

        /* renamed from: a */
        public final void mo99093a(boolean z, boolean z2) {
            this.f103313a.mo99130a(z, z2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.f$e */
    public static final class C39743e implements C39708a {

        /* renamed from: a */
        final /* synthetic */ C39738f f103314a;

        /* renamed from: a */
        public final void mo99080a() {
            this.f103314a.f103290g.mo99115a();
        }

        /* renamed from: b */
        public final void mo99081b() {
            this.f103314a.f103290g.mo99120b();
        }

        /* renamed from: c */
        public final void mo99082c() {
            if (!this.f103314a.f103298o.f103238e) {
                this.f103314a.f103288e.mo99113c();
                this.f103314a.f103288e.f103245a = null;
                return;
            }
            if (!C39738f.m127152c(this.f103314a).mo99199b()) {
                this.f103314a.f103288e.mo99113c();
            }
        }

        C39743e(C39738f fVar) {
            this.f103314a = fVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.f$f */
    public static final class C39744f implements C39709b {

        /* renamed from: a */
        final /* synthetic */ C39738f f103315a;

        C39744f(C39738f fVar) {
            this.f103315a = fVar;
        }

        /* renamed from: a */
        public final void mo99083a(int i) {
            C39700b.f103201a.mo99063a(i);
            this.f103315a.mo99124a(i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.f$g */
    static final class C39745g implements C23254a {

        /* renamed from: a */
        final /* synthetic */ C39738f f103316a;

        C39745g(C39738f fVar) {
            this.f103316a = fVar;
        }

        /* renamed from: a */
        public final boolean mo60522a(int i, KeyEvent keyEvent) {
            if (i != 4 || !this.f103316a.f103298o.f103238e) {
                return false;
            }
            if (this.f103316a.f103296m == 1) {
                this.f103316a.mo99136e();
            } else {
                this.f103316a.mo99137f();
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.f$h */
    static final class C39746h extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C39738f f103317a;

        C39746h(C39738f fVar) {
            this.f103317a = fVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m127199a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m127199a() {
            C39738f.m127157g(this.f103317a).mo96667a((VideoSegment) C39738f.m127154d(this.f103317a).mo97721n().get(this.f103317a.f103291h));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.f$i */
    static final class C39747i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C39738f f103318a;

        C39747i(C39738f fVar) {
            this.f103318a = fVar;
        }

        public final void run() {
            this.f103318a.f103288e.mo99114d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.f$j */
    static final class C39748j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C39738f f103319a;

        C39748j(C39738f fVar) {
            this.f103319a = fVar;
        }

        public final void run() {
            this.f103319a.f103288e.mo99110a(C39738f.m127149a(this.f103319a), C39738f.m127151b(this.f103319a));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.f$k */
    static final class C39749k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C39738f f103320a;

        /* renamed from: b */
        final /* synthetic */ BooleanRef f103321b;

        C39749k(C39738f fVar, BooleanRef booleanRef) {
            this.f103320a = fVar;
            this.f103321b = booleanRef;
        }

        public final void run() {
            this.f103320a.f103290g.mo99119a(this.f103321b.element);
        }
    }

    /* renamed from: a */
    public final void mo99130a(boolean z, boolean z2) {
        Pair pair;
        this.f103297n = 0;
        VideoEditViewModel videoEditViewModel = this.f103285b;
        if (videoEditViewModel == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        VideoSegment videoSegment = (VideoSegment) videoEditViewModel.mo97721n().get(this.f103291h);
        if (z || z2) {
            this.f103298o.mo99099a();
            C39717c cVar = this.f103298o;
            MultiEditVideoRecordData multiEditVideoRecordData = this.f103293j;
            if (multiEditVideoRecordData == null) {
                C7573i.m23583a("curRecordData");
            }
            cVar.mo99101b(multiEditVideoRecordData);
        } else if (this.f103298o.f103240g) {
            m127153c(true);
        }
        m127165o();
        if (z2) {
            m127150a(videoSegment);
            MultiEditVideoRecordData multiEditVideoRecordData2 = this.f103293j;
            if (multiEditVideoRecordData2 == null) {
                C7573i.m23583a("curRecordData");
            }
            MultiEditVideoRecordData multiEditVideoRecordData3 = this.f103294k;
            if (multiEditVideoRecordData3 == null) {
                C7573i.m23583a("originRecordData");
            }
            this.f103294k = C39702d.m127059a(multiEditVideoRecordData2, multiEditVideoRecordData3);
            MultiEditVideoRecordData multiEditVideoRecordData4 = this.f103294k;
            if (multiEditVideoRecordData4 == null) {
                C7573i.m23583a("originRecordData");
            }
            multiEditVideoRecordData4.resetTimeData();
        } else if (z) {
            MultiEditVideoRecordData multiEditVideoRecordData5 = this.f103293j;
            if (multiEditVideoRecordData5 == null) {
                C7573i.m23583a("curRecordData");
            }
            List<MultiEditVideoSegmentRecordData> list = multiEditVideoRecordData5.segmentDataList;
            C7573i.m23582a((Object) list, "curRecordData.segmentDataList");
            int i = 0;
            for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : list) {
                if (C7573i.m23585a((Object) multiEditVideoSegmentRecordData.videoPath, (Object) videoSegment.mo96896a(false))) {
                    C7573i.m23582a((Object) videoSegment, "videoSegment");
                    multiEditVideoSegmentRecordData.startTime = videoSegment.mo96909h();
                    multiEditVideoSegmentRecordData.endTime = videoSegment.mo96910i();
                    i = (int) (videoSegment.mo96910i() - videoSegment.mo96909h());
                }
            }
            C39700b.f103201a.mo99070b(this.f103298o.f103244k, i);
        }
        if (z || z2) {
            MultiEditVideoRecordData multiEditVideoRecordData6 = this.f103293j;
            if (multiEditVideoRecordData6 == null) {
                C7573i.m23583a("curRecordData");
            }
            Pair playInOutTime = multiEditVideoRecordData6.getPlayInOutTime();
            C7573i.m23582a((Object) playInOutTime, "curRecordData.playInOutTime");
            pair = playInOutTime;
        } else {
            MultiEditVideoRecordData multiEditVideoRecordData7 = this.f103293j;
            if (multiEditVideoRecordData7 == null) {
                C7573i.m23583a("curRecordData");
            }
            Integer num = (Integer) multiEditVideoRecordData7.getPlayInOutTime().second;
            if (this.f103298o.f103235b > 0) {
                num = Integer.valueOf((int) this.f103298o.f103235b);
            }
            pair = new Pair(Integer.valueOf((int) this.f103298o.f103234a), num);
        }
        this.f103290g.mo99119a(true);
        C39718d dVar = this.f103288e;
        MultiEditVideoRecordData multiEditVideoRecordData8 = this.f103293j;
        if (multiEditVideoRecordData8 == null) {
            C7573i.m23583a("curRecordData");
        }
        dVar.mo99109a(multiEditVideoRecordData8, videoSegment, pair, z, z2);
    }

    /* renamed from: i */
    private final void m127159i() {
        this.f103283G = new C39743e(this);
        this.f103288e.f103245a = this.f103283G;
    }

    /* renamed from: j */
    private final void m127160j() {
        C39750g gVar = this.f103289f;
        C39761a aVar = this.f103287d;
        if (aVar == null) {
            C7573i.m23583a("viewManager");
        }
        gVar.mo99146a(aVar);
        this.f103289f.mo99145a((C39711d) new C39742d(this));
    }

    /* renamed from: b */
    public final void mo99132b() {
        C39761a aVar = this.f103287d;
        if (aVar == null) {
            C7573i.m23583a("viewManager");
        }
        aVar.mo99198b(true);
    }

    /* renamed from: d */
    public final void mo99135d() {
        if (!this.f103295l) {
            this.f103295l = true;
            C38774k.m123821b();
            CutMultiVideoViewModel cutMultiVideoViewModel = this.f103284a;
            if (cutMultiVideoViewModel == null) {
                C7573i.m23583a("cutMultiVideoViewModel");
            }
            cutMultiVideoViewModel.mo96671c();
        }
    }

    /* renamed from: o */
    private final void m127165o() {
        this.f103298o.f103241h = false;
        this.f103298o.f103240g = false;
        VideoPublishEditModel videoPublishEditModel = this.f103292i;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("model");
        }
        videoPublishEditModel.multiEditVideoRecordData.isMultiEditRetake = false;
        VideoPublishEditModel videoPublishEditModel2 = this.f103292i;
        if (videoPublishEditModel2 == null) {
            C7573i.m23583a("model");
        }
        videoPublishEditModel2.multiEditVideoRecordData.segmentSizeChange = false;
        VideoPublishEditModel videoPublishEditModel3 = this.f103292i;
        if (videoPublishEditModel3 == null) {
            C7573i.m23583a("model");
        }
        videoPublishEditModel3.multiEditVideoRecordData.currentEditIndex = -1;
    }

    /* renamed from: a */
    public final boolean mo99131a() {
        return this.f103298o.f103239f;
    }

    /* renamed from: g */
    public final void mo99138g() {
        C39718d dVar = this.f103288e;
        MultiEditVideoRecordData multiEditVideoRecordData = this.f103305v;
        if (multiEditVideoRecordData == null) {
            C7573i.m23583a("restoreRecordData");
        }
        dVar.mo99104a(multiEditVideoRecordData);
        EditViewModel editViewModel = this.f103300q;
        if (editViewModel == null) {
            C7573i.m23583a("editViewModel");
        }
        editViewModel.mo106453n().setValue(Boolean.valueOf(false));
        m127153c(false);
    }

    /* renamed from: k */
    private final void m127161k() {
        C39720e eVar = this.f103290g;
        VEVideoCutterViewModel vEVideoCutterViewModel = this.f103299p;
        if (vEVideoCutterViewModel == null) {
            C7573i.m23583a("veVideoCutterViewModel");
        }
        CutMultiVideoViewModel cutMultiVideoViewModel = this.f103284a;
        if (cutMultiVideoViewModel == null) {
            C7573i.m23583a("cutMultiVideoViewModel");
        }
        VideoEditViewModel videoEditViewModel = this.f103285b;
        if (videoEditViewModel == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        C39718d dVar = this.f103288e;
        C39761a aVar = this.f103287d;
        if (aVar == null) {
            C7573i.m23583a("viewManager");
        }
        eVar.mo99117a(vEVideoCutterViewModel, cutMultiVideoViewModel, videoEditViewModel, dVar, aVar);
        this.f103290g.mo99118a((C39710c) new C39741c(this));
        C39720e eVar2 = this.f103290g;
        FragmentActivity fragmentActivity = this.f103286c;
        if (fragmentActivity == null) {
            C7573i.m23583a("activity");
        }
        eVar2.mo99116a(fragmentActivity);
    }

    /* renamed from: e */
    public final void mo99136e() {
        boolean z;
        MultiEditVideoRecordData multiEditVideoRecordData = this.f103305v;
        if (multiEditVideoRecordData == null) {
            C7573i.m23583a("restoreRecordData");
        }
        if (multiEditVideoRecordData.startTime != this.f103298o.f103234a) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            MultiEditVideoRecordData multiEditVideoRecordData2 = this.f103305v;
            if (multiEditVideoRecordData2 == null) {
                C7573i.m23583a("restoreRecordData");
            }
            if (multiEditVideoRecordData2.endTime != this.f103298o.f103235b) {
                z = true;
            } else {
                z = false;
            }
        }
        if (!z) {
            MultiEditVideoRecordData multiEditVideoRecordData3 = this.f103293j;
            if (multiEditVideoRecordData3 == null) {
                C7573i.m23583a("curRecordData");
            }
            MultiEditVideoRecordData multiEditVideoRecordData4 = this.f103305v;
            if (multiEditVideoRecordData4 == null) {
                C7573i.m23583a("restoreRecordData");
            }
            z = !multiEditVideoRecordData3.isEqual(multiEditVideoRecordData4);
        }
        if (z) {
            FragmentActivity fragmentActivity = this.f103286c;
            if (fragmentActivity == null) {
                C7573i.m23583a("activity");
            }
            C39696a.m127030b(fragmentActivity, new C39739a(this));
        } else {
            mo99138g();
        }
        this.f103306w = null;
        m127165o();
        C39700b.f103201a.mo99068b();
    }

    /* renamed from: f */
    public final void mo99137f() {
        C39761a aVar = this.f103287d;
        if (aVar == null) {
            C7573i.m23583a("viewManager");
        }
        boolean e = aVar.mo99202e();
        if (!e && this.f103280D && this.f103306w != null) {
            MultiEditVideoRecordData multiEditVideoRecordData = this.f103306w;
            if (multiEditVideoRecordData == null) {
                C7573i.m23580a();
            }
            String str = ((MultiEditVideoSegmentRecordData) multiEditVideoRecordData.segmentDataList.get(this.f103291h)).videoPath;
            MultiEditVideoRecordData multiEditVideoRecordData2 = this.f103293j;
            if (multiEditVideoRecordData2 == null) {
                C7573i.m23583a("curRecordData");
            }
            e = !C7573i.m23585a((Object) ((MultiEditVideoSegmentRecordData) multiEditVideoRecordData2.segmentDataList.get(this.f103291h)).videoPath, (Object) str);
        }
        if (e) {
            FragmentActivity fragmentActivity = this.f103286c;
            if (fragmentActivity == null) {
                C7573i.m23583a("activity");
            }
            C39696a.m127029a(fragmentActivity, new C39740b(this));
        } else {
            mo99135d();
        }
        C39700b.f103201a.mo99062a();
        this.f103280D = false;
    }

    /* renamed from: c */
    public final void mo99134c() {
        int i = 0;
        this.f103298o.f103243j = 0;
        VideoEditViewModel videoEditViewModel = this.f103285b;
        if (videoEditViewModel == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        VideoSegment videoSegment = (VideoSegment) videoEditViewModel.mo97721n().get(this.f103291h);
        VideoEditViewModel videoEditViewModel2 = this.f103285b;
        if (videoEditViewModel2 == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        List n = videoEditViewModel2.mo97721n();
        C7573i.m23582a((Object) n, "videoEditViewModel.originVideoList");
        for (Object next : n) {
            int i2 = i + 1;
            if (i < 0) {
                C7525m.m23465b();
            }
            VideoSegment videoSegment2 = (VideoSegment) next;
            if (i < this.f103291h) {
                C39717c cVar = this.f103298o;
                int i3 = cVar.f103243j;
                C7573i.m23582a((Object) videoSegment2, "videoSegment");
                cVar.f103243j = i3 + ((int) (videoSegment2.mo96910i() - videoSegment2.mo96909h()));
            }
            i = i2;
        }
        C39717c cVar2 = this.f103298o;
        C7573i.m23582a((Object) videoSegment, "videoSegment");
        cVar2.f103244k = (int) (videoSegment.mo96910i() - videoSegment.mo96909h());
        C39718d dVar = this.f103288e;
        MultiEditVideoRecordData multiEditVideoRecordData = this.f103293j;
        if (multiEditVideoRecordData == null) {
            C7573i.m23583a("curRecordData");
        }
        dVar.mo99108a(multiEditVideoRecordData, videoSegment, this.f103291h, this.f103298o.f103243j);
    }

    /* renamed from: h */
    private final void m127158h() {
        C39761a cVar;
        if (this.f103298o.f103239f) {
            cVar = new C39773d();
        } else {
            cVar = new C39763c();
        }
        this.f103287d = cVar;
        C39761a aVar = this.f103287d;
        if (aVar == null) {
            C7573i.m23583a("viewManager");
        }
        FragmentActivity fragmentActivity = this.f103286c;
        if (fragmentActivity == null) {
            C7573i.m23583a("activity");
        }
        View view = this.f103301r;
        if (view == null) {
            C7573i.m23583a("rootView");
        }
        aVar.mo99186a(fragmentActivity, view);
        C39761a aVar2 = this.f103287d;
        if (aVar2 == null) {
            C7573i.m23583a("viewManager");
        }
        FragmentActivity fragmentActivity2 = this.f103286c;
        if (fragmentActivity2 == null) {
            C7573i.m23583a("activity");
        }
        CutMultiVideoViewModel cutMultiVideoViewModel = this.f103284a;
        if (cutMultiVideoViewModel == null) {
            C7573i.m23583a("cutMultiVideoViewModel");
        }
        aVar2.mo99187a(fragmentActivity2, cutMultiVideoViewModel, (List<? extends MediaModel>) this.f103302s, !mo99131a());
        int i = 0;
        for (Object next : this.f103304u) {
            int i2 = i + 1;
            if (i < 0) {
                C7525m.m23465b();
            }
            VideoSegment videoSegment = (VideoSegment) next;
            VideoEditViewModel videoEditViewModel = this.f103285b;
            if (videoEditViewModel == null) {
                C7573i.m23583a("videoEditViewModel");
            }
            Object obj = videoEditViewModel.mo97721n().get(i);
            C7573i.m23582a(obj, "videoEditViewModel.originVideoList[index]");
            ((VideoSegment) obj).mo96898a(videoSegment.mo96909h());
            VideoEditViewModel videoEditViewModel2 = this.f103285b;
            if (videoEditViewModel2 == null) {
                C7573i.m23583a("videoEditViewModel");
            }
            Object obj2 = videoEditViewModel2.mo97721n().get(i);
            C7573i.m23582a(obj2, "videoEditViewModel.originVideoList[index]");
            ((VideoSegment) obj2).mo96901b(videoSegment.mo96910i());
            i = i2;
        }
        C39761a aVar3 = this.f103287d;
        if (aVar3 == null) {
            C7573i.m23583a("viewManager");
        }
        FragmentActivity fragmentActivity3 = this.f103286c;
        if (fragmentActivity3 == null) {
            C7573i.m23583a("activity");
        }
        VideoEditViewModel videoEditViewModel3 = this.f103285b;
        if (videoEditViewModel3 == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        CutMultiVideoViewModel cutMultiVideoViewModel2 = this.f103284a;
        if (cutMultiVideoViewModel2 == null) {
            C7573i.m23583a("cutMultiVideoViewModel");
        }
        VideoEditViewModel videoEditViewModel4 = this.f103285b;
        if (videoEditViewModel4 == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        aVar3.mo99188a(fragmentActivity3, videoEditViewModel3, cutMultiVideoViewModel2, videoEditViewModel4.mo97721n());
        C39761a aVar4 = this.f103287d;
        if (aVar4 == null) {
            C7573i.m23583a("viewManager");
        }
        aVar4.mo99192a((C39709b) new C39744f(this));
        C39761a aVar5 = this.f103287d;
        if (aVar5 == null) {
            C7573i.m23583a("viewManager");
        }
        aVar5.mo99190a((OnClickListener) this);
        if (this.f103298o.f103236c > 0.0f && this.f103298o.f103237d > 0.0f) {
            C0902i iVar = new C0902i(Float.valueOf(this.f103298o.f103236c), Float.valueOf(this.f103298o.f103237d));
            C39761a aVar6 = this.f103287d;
            if (aVar6 == null) {
                C7573i.m23583a("viewManager");
            }
            aVar6.mo99196b(iVar);
        }
        C39761a aVar7 = this.f103287d;
        if (aVar7 == null) {
            C7573i.m23583a("viewManager");
        }
        aVar7.mo99200c();
    }

    /* renamed from: l */
    private final void m127162l() {
        MultiEditVideoRecordData multiEditVideoRecordData = this.f103293j;
        if (multiEditVideoRecordData == null) {
            C7573i.m23583a("curRecordData");
        }
        if (!C6292i.m19525a(multiEditVideoRecordData.segmentDataList)) {
            this.f103302s.clear();
            MultiEditVideoRecordData multiEditVideoRecordData2 = this.f103293j;
            if (multiEditVideoRecordData2 == null) {
                C7573i.m23583a("curRecordData");
            }
            for (MultiEditVideoSegmentRecordData convertModel : multiEditVideoRecordData2.segmentDataList) {
                this.f103302s.add(convertModel.convertModel());
            }
            VideoEditViewModel videoEditViewModel = this.f103285b;
            if (videoEditViewModel == null) {
                C7573i.m23583a("videoEditViewModel");
            }
            videoEditViewModel.mo97697a((List<MediaModel>) this.f103302s);
            VideoEditViewModel videoEditViewModel2 = this.f103285b;
            if (videoEditViewModel2 == null) {
                C7573i.m23583a("videoEditViewModel");
            }
            List n = videoEditViewModel2.mo97721n();
            this.f103304u.clear();
            MultiEditVideoRecordData multiEditVideoRecordData3 = this.f103293j;
            if (multiEditVideoRecordData3 == null) {
                C7573i.m23583a("curRecordData");
            }
            List<MultiEditVideoSegmentRecordData> list = multiEditVideoRecordData3.segmentDataList;
            C7573i.m23582a((Object) list, "curRecordData.segmentDataList");
            boolean z = false;
            int i = 0;
            for (Object next : list) {
                int i2 = i + 1;
                if (i < 0) {
                    C7525m.m23465b();
                }
                MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = (MultiEditVideoSegmentRecordData) next;
                VideoSegment videoSegment = new VideoSegment((MediaModel) this.f103302s.get(i));
                videoSegment.f100759a = i;
                videoSegment.mo96898a(multiEditVideoSegmentRecordData.startTime);
                if (multiEditVideoSegmentRecordData.endTime <= 0) {
                    Object obj = this.f103302s.get(i);
                    C7573i.m23582a(obj, "mediaModelList[index]");
                    multiEditVideoSegmentRecordData.endTime = ((MediaModel) obj).f88159e;
                }
                videoSegment.mo96901b(multiEditVideoSegmentRecordData.endTime);
                this.f103304u.add(videoSegment);
                Object obj2 = n.get(i);
                C7573i.m23582a(obj2, "updateVideoList[index]");
                ((VideoSegment) obj2).mo96898a(multiEditVideoSegmentRecordData.startTime);
                Object obj3 = n.get(i);
                C7573i.m23582a(obj3, "updateVideoList[index]");
                ((VideoSegment) obj3).mo96901b(multiEditVideoSegmentRecordData.endTime);
                i = i2;
            }
            C39717c cVar = this.f103298o;
            MultiEditVideoRecordData multiEditVideoRecordData4 = this.f103293j;
            if (multiEditVideoRecordData4 == null) {
                C7573i.m23583a("curRecordData");
            }
            if (multiEditVideoRecordData4.segmentDataList.size() == 1) {
                MultiEditVideoRecordData multiEditVideoRecordData5 = this.f103293j;
                if (multiEditVideoRecordData5 == null) {
                    C7573i.m23583a("curRecordData");
                }
                if (multiEditVideoRecordData5.isSingleVideo) {
                    z = true;
                }
            }
            cVar.f103239f = z;
        }
    }

    /* renamed from: m */
    private final void m127163m() {
        this.f103298o.mo99099a();
        C39717c cVar = this.f103298o;
        MultiEditVideoRecordData multiEditVideoRecordData = this.f103293j;
        if (multiEditVideoRecordData == null) {
            C7573i.m23583a("curRecordData");
        }
        cVar.mo99101b(multiEditVideoRecordData);
        int i = this.f103291h;
        RetakeVideoContext retakeVideoContext = new RetakeVideoContext();
        MultiEditVideoRecordData multiEditVideoRecordData2 = this.f103293j;
        if (multiEditVideoRecordData2 == null) {
            C7573i.m23583a("curRecordData");
        }
        retakeVideoContext.f99690d = multiEditVideoRecordData2.convertData();
        retakeVideoContext.f99689c = i;
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            MultiEditVideoRecordData multiEditVideoRecordData3 = this.f103293j;
            if (multiEditVideoRecordData3 == null) {
                C7573i.m23583a("curRecordData");
            }
            j += ((MultiEditVideoSegmentRecordData) multiEditVideoRecordData3.segmentDataList.get(i2)).videoLength;
        }
        retakeVideoContext.f99688b = j / 1000;
        MultiEditVideoRecordData multiEditVideoRecordData4 = this.f103293j;
        if (multiEditVideoRecordData4 == null) {
            C7573i.m23583a("curRecordData");
        }
        retakeVideoContext.f99687a = ((MultiEditVideoSegmentRecordData) multiEditVideoRecordData4.segmentDataList.get(i)).videoLength / 1000;
        StringBuilder sb = new StringBuilder();
        MultiEditVideoRecordData multiEditVideoRecordData5 = this.f103293j;
        if (multiEditVideoRecordData5 == null) {
            C7573i.m23583a("curRecordData");
        }
        sb.append(multiEditVideoRecordData5.curRecordingDir);
        sb.append(File.separator);
        sb.append("new");
        retakeVideoContext.mo96131a(sb.toString());
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = new MultiEditVideoStatusRecordData();
        MultiEditVideoRecordData multiEditVideoRecordData6 = this.f103293j;
        if (multiEditVideoRecordData6 == null) {
            C7573i.m23583a("curRecordData");
        }
        multiEditVideoRecordData6.hasRetake = true;
        multiEditVideoStatusRecordData.currentEditIndex = this.f103291h;
        ArrayList<TimeSpeedModelExtension> arrayList = this.f103309z;
        if (arrayList == null) {
            C7573i.m23583a("originalRecordSegments");
        }
        multiEditVideoStatusRecordData.originalSegments = arrayList;
        ArrayList<TimeSpeedModelExtension> arrayList2 = this.f103277A;
        if (arrayList2 == null) {
            C7573i.m23583a("restoreRecordSegments");
        }
        multiEditVideoStatusRecordData.restoreSegments = arrayList2;
        ArrayList<TimeSpeedModelExtension> arrayList3 = this.f103279C;
        if (arrayList3 == null) {
            C7573i.m23583a("singleRestoreSegments");
        }
        multiEditVideoStatusRecordData.singleRestoreSegments = arrayList3;
        ArrayList<TimeSpeedModelExtension> arrayList4 = this.f103278B;
        if (arrayList4 == null) {
            C7573i.m23583a("editSegments");
        }
        multiEditVideoStatusRecordData.editSegments = arrayList4;
        MultiEditVideoRecordData multiEditVideoRecordData7 = this.f103293j;
        if (multiEditVideoRecordData7 == null) {
            C7573i.m23583a("curRecordData");
        }
        multiEditVideoStatusRecordData.curMultiEditVideoRecordData = multiEditVideoRecordData7;
        MultiEditVideoRecordData multiEditVideoRecordData8 = this.f103294k;
        if (multiEditVideoRecordData8 == null) {
            C7573i.m23583a("originRecordData");
        }
        multiEditVideoStatusRecordData.originMultiEditRecordData = multiEditVideoRecordData8;
        MultiEditVideoRecordData multiEditVideoRecordData9 = this.f103305v;
        if (multiEditVideoRecordData9 == null) {
            C7573i.m23583a("restoreRecordData");
        }
        multiEditVideoStatusRecordData.restoreMultiEditVideoRecordData = multiEditVideoRecordData9;
        MultiEditVideoRecordData multiEditVideoRecordData10 = this.f103293j;
        if (multiEditVideoRecordData10 == null) {
            C7573i.m23583a("curRecordData");
        }
        multiEditVideoStatusRecordData.singleRestoreMultiEditRecordData = C39702d.m127059a(multiEditVideoRecordData10, (MultiEditVideoRecordData) null);
        multiEditVideoStatusRecordData.recordMusic = this.f103307x;
        multiEditVideoStatusRecordData.originalMusicStart = this.f103308y;
        retakeVideoContext.f99691e = multiEditVideoStatusRecordData;
        VideoPublishEditModel videoPublishEditModel = this.f103292i;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("model");
        }
        if (videoPublishEditModel.mIsFromDraft) {
            FragmentActivity fragmentActivity = this.f103286c;
            if (fragmentActivity == null) {
                C7573i.m23583a("activity");
            }
            if (fragmentActivity instanceof VEVideoPublishEditActivity) {
                FragmentActivity fragmentActivity2 = this.f103286c;
                if (fragmentActivity2 == null) {
                    C7573i.m23583a("activity");
                }
                if (fragmentActivity2 != null) {
                    VEVideoPublishEditActivity vEVideoPublishEditActivity = (VEVideoPublishEditActivity) fragmentActivity2;
                    VideoPublishEditModel videoPublishEditModel2 = this.f103292i;
                    if (videoPublishEditModel2 == null) {
                        C7573i.m23583a("model");
                    }
                    Intent a = vEVideoPublishEditActivity.mo98062a(videoPublishEditModel2);
                    if (a != null) {
                        a.putExtra("retake_video", retakeVideoContext);
                        a.putExtra("retake_shoot_mode", 1);
                        VideoPublishEditModel videoPublishEditModel3 = this.f103292i;
                        if (videoPublishEditModel3 == null) {
                            C7573i.m23583a("model");
                        }
                        vEVideoPublishEditActivity.mo98067a(a, videoPublishEditModel3);
                    } else {
                        return;
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity");
                }
            } else {
                return;
            }
        } else {
            FragmentActivity fragmentActivity3 = this.f103286c;
            if (fragmentActivity3 == null) {
                C7573i.m23583a("activity");
            }
            Intent intent = new Intent(fragmentActivity3, VideoRecordNewActivity.class);
            intent.putExtra("retake_video", retakeVideoContext);
            intent.putExtra("retake_shoot_mode", 1);
            FragmentActivity fragmentActivity4 = this.f103286c;
            if (fragmentActivity4 == null) {
                C7573i.m23583a("activity");
            }
            fragmentActivity4.startActivity(intent);
        }
        C39700b.f103201a.mo99069b(this.f103291h);
    }

    /* renamed from: n */
    private final void m127164n() {
        VideoEditViewModel videoEditViewModel = this.f103285b;
        if (videoEditViewModel == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        if (!C6292i.m19525a(videoEditViewModel.mo97721n())) {
            MultiEditVideoRecordData multiEditVideoRecordData = this.f103293j;
            if (multiEditVideoRecordData == null) {
                C7573i.m23583a("curRecordData");
            }
            if (!C6292i.m19525a(multiEditVideoRecordData.segmentDataList)) {
                if (!mo99131a()) {
                    VideoEditViewModel videoEditViewModel2 = this.f103285b;
                    if (videoEditViewModel2 == null) {
                        C7573i.m23583a("videoEditViewModel");
                    }
                    List<VideoSegment> n = videoEditViewModel2.mo97721n();
                    C7573i.m23582a((Object) n, "videoEditViewModel.originVideoList");
                    for (VideoSegment videoSegment : n) {
                        MultiEditVideoRecordData multiEditVideoRecordData2 = this.f103293j;
                        if (multiEditVideoRecordData2 == null) {
                            C7573i.m23583a("curRecordData");
                        }
                        List<MultiEditVideoSegmentRecordData> list = multiEditVideoRecordData2.segmentDataList;
                        C7573i.m23582a((Object) list, "curRecordData.segmentDataList");
                        for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : list) {
                            if (!TextUtils.isEmpty(videoSegment.mo96896a(false)) && C7573i.m23585a((Object) videoSegment.mo96896a(false), (Object) multiEditVideoSegmentRecordData.videoPath)) {
                                C7573i.m23582a((Object) videoSegment, "videoSegment");
                                multiEditVideoSegmentRecordData.startTime = videoSegment.mo96909h();
                                multiEditVideoSegmentRecordData.endTime = videoSegment.mo96910i();
                            }
                        }
                    }
                }
                C39717c cVar = this.f103298o;
                MultiEditVideoRecordData multiEditVideoRecordData3 = this.f103293j;
                if (multiEditVideoRecordData3 == null) {
                    C7573i.m23583a("curRecordData");
                }
                cVar.mo99101b(multiEditVideoRecordData3);
                C39700b bVar = C39700b.f103201a;
                MultiEditVideoRecordData multiEditVideoRecordData4 = this.f103293j;
                if (multiEditVideoRecordData4 == null) {
                    C7573i.m23583a("curRecordData");
                }
                MultiEditVideoRecordData multiEditVideoRecordData5 = this.f103305v;
                if (multiEditVideoRecordData5 == null) {
                    C7573i.m23583a("restoreRecordData");
                }
                bVar.mo99065a(multiEditVideoRecordData4, multiEditVideoRecordData5);
                MultiEditVideoRecordData multiEditVideoRecordData6 = this.f103293j;
                if (multiEditVideoRecordData6 == null) {
                    C7573i.m23583a("curRecordData");
                }
                MultiEditVideoRecordData multiEditVideoRecordData7 = this.f103305v;
                if (multiEditVideoRecordData7 == null) {
                    C7573i.m23583a("restoreRecordData");
                }
                this.f103305v = C39702d.m127059a(multiEditVideoRecordData6, multiEditVideoRecordData7);
                C39718d dVar = this.f103288e;
                MultiEditVideoRecordData multiEditVideoRecordData8 = this.f103293j;
                if (multiEditVideoRecordData8 == null) {
                    C7573i.m23583a("curRecordData");
                }
                dVar.mo99104a(multiEditVideoRecordData8);
                EditViewModel editViewModel = this.f103300q;
                if (editViewModel == null) {
                    C7573i.m23583a("editViewModel");
                }
                editViewModel.mo106453n().setValue(Boolean.valueOf(true));
                this.f103306w = null;
                m127165o();
                VideoPublishEditModel videoPublishEditModel = this.f103292i;
                if (videoPublishEditModel == null) {
                    C7573i.m23583a("model");
                }
                MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = videoPublishEditModel.multiEditVideoRecordData;
                ArrayList<TimeSpeedModelExtension> arrayList = this.f103278B;
                if (arrayList == null) {
                    C7573i.m23583a("editSegments");
                }
                multiEditVideoStatusRecordData.editSegments = new ArrayList<>(arrayList);
                VideoPublishEditModel videoPublishEditModel2 = this.f103292i;
                if (videoPublishEditModel2 == null) {
                    C7573i.m23583a("model");
                }
                MultiEditVideoStatusRecordData multiEditVideoStatusRecordData2 = videoPublishEditModel2.multiEditVideoRecordData;
                ArrayList<TimeSpeedModelExtension> arrayList2 = this.f103278B;
                if (arrayList2 == null) {
                    C7573i.m23583a("editSegments");
                }
                multiEditVideoStatusRecordData2.restoreSegments = new ArrayList<>(arrayList2);
            }
        }
    }

    /* renamed from: a */
    public final void mo99127a(C15389d dVar) {
        this.f103288e.mo99103a(dVar);
    }

    /* renamed from: a */
    public static final /* synthetic */ MultiEditVideoRecordData m127149a(C39738f fVar) {
        MultiEditVideoRecordData multiEditVideoRecordData = fVar.f103293j;
        if (multiEditVideoRecordData == null) {
            C7573i.m23583a("curRecordData");
        }
        return multiEditVideoRecordData;
    }

    /* renamed from: b */
    public static final /* synthetic */ MultiEditVideoRecordData m127151b(C39738f fVar) {
        MultiEditVideoRecordData multiEditVideoRecordData = fVar.f103294k;
        if (multiEditVideoRecordData == null) {
            C7573i.m23583a("originRecordData");
        }
        return multiEditVideoRecordData;
    }

    /* renamed from: c */
    public static final /* synthetic */ C39761a m127152c(C39738f fVar) {
        C39761a aVar = fVar.f103287d;
        if (aVar == null) {
            C7573i.m23583a("viewManager");
        }
        return aVar;
    }

    /* renamed from: d */
    public static final /* synthetic */ VideoEditViewModel m127154d(C39738f fVar) {
        VideoEditViewModel videoEditViewModel = fVar.f103285b;
        if (videoEditViewModel == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        return videoEditViewModel;
    }

    /* renamed from: e */
    public static final /* synthetic */ FragmentActivity m127155e(C39738f fVar) {
        FragmentActivity fragmentActivity = fVar.f103286c;
        if (fragmentActivity == null) {
            C7573i.m23583a("activity");
        }
        return fragmentActivity;
    }

    /* renamed from: f */
    public static final /* synthetic */ VideoPublishEditModel m127156f(C39738f fVar) {
        VideoPublishEditModel videoPublishEditModel = fVar.f103292i;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("model");
        }
        return videoPublishEditModel;
    }

    /* renamed from: g */
    public static final /* synthetic */ CutMultiVideoViewModel m127157g(C39738f fVar) {
        CutMultiVideoViewModel cutMultiVideoViewModel = fVar.f103284a;
        if (cutMultiVideoViewModel == null) {
            C7573i.m23583a("cutMultiVideoViewModel");
        }
        return cutMultiVideoViewModel;
    }

    /* renamed from: a */
    public final void mo99124a(int i) {
        this.f103291h = i;
        if (this.f103291h >= 0) {
            CutMultiVideoViewModel cutMultiVideoViewModel = this.f103284a;
            if (cutMultiVideoViewModel == null) {
                C7573i.m23583a("cutMultiVideoViewModel");
            }
            cutMultiVideoViewModel.mo96664a(this.f103291h, this.f103291h);
        }
    }

    /* renamed from: b */
    public final void mo99133b(boolean z) {
        if (z) {
            this.f103288e.mo99114d();
            return;
        }
        if (this.f103287d != null) {
            C39761a aVar = this.f103287d;
            if (aVar == null) {
                C7573i.m23583a("viewManager");
            }
            if (!aVar.mo99199b()) {
                this.f103288e.mo99113c();
                return;
            }
        }
        if (this.f103298o.f103239f) {
            View view = this.f103301r;
            if (view == null) {
                C7573i.m23583a("rootView");
            }
            view.postDelayed(new C39747i(this), 100);
        }
    }

    /* renamed from: a */
    private final void m127150a(VideoSegment videoSegment) {
        MultiEditVideoRecordData multiEditVideoRecordData = this.f103293j;
        if (multiEditVideoRecordData == null) {
            C7573i.m23583a("curRecordData");
        }
        multiEditVideoRecordData.segmentDataList.remove(this.f103291h);
        VideoEditViewModel videoEditViewModel = this.f103285b;
        if (videoEditViewModel == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        videoEditViewModel.mo97721n().remove(videoSegment);
        C39761a aVar = this.f103287d;
        if (aVar == null) {
            C7573i.m23583a("viewManager");
        }
        aVar.mo99197b(videoSegment);
        C39761a aVar2 = this.f103287d;
        if (aVar2 == null) {
            C7573i.m23583a("viewManager");
        }
        aVar2.mo99194a(false);
        int i = this.f103291h;
        ArrayList<TimeSpeedModelExtension> arrayList = this.f103278B;
        if (arrayList == null) {
            C7573i.m23583a("editSegments");
        }
        if (i < arrayList.size()) {
            ArrayList<TimeSpeedModelExtension> arrayList2 = this.f103278B;
            if (arrayList2 == null) {
                C7573i.m23583a("editSegments");
            }
            arrayList2.remove(this.f103291h);
        }
        C39700b.f103201a.mo99071d(this.f103291h);
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x011e  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m127153c(boolean r7) {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r0 = r6.f103293j
            if (r0 != 0) goto L_0x0009
            java.lang.String r1 = "curRecordData"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0009:
            boolean r0 = r0.hasRetake
            if (r7 == 0) goto L_0x0023
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r1 = r6.f103306w
            if (r1 == 0) goto L_0x0023
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r1 = r6.f103306w
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r2 = r6.f103293j
            if (r2 != 0) goto L_0x001c
            java.lang.String r3 = "curRecordData"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x001c:
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r1 = com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.p1567a.C39702d.m127059a(r1, r2)
            r6.f103293j = r1
            goto L_0x003b
        L_0x0023:
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r1 = r6.f103305v
            if (r1 != 0) goto L_0x002c
            java.lang.String r2 = "restoreRecordData"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x002c:
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r2 = r6.f103293j
            if (r2 != 0) goto L_0x0035
            java.lang.String r3 = "curRecordData"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x0035:
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r1 = com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.p1567a.C39702d.m127059a(r1, r2)
            r6.f103293j = r1
        L_0x003b:
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r1 = r6.f103293j
            if (r1 != 0) goto L_0x0044
            java.lang.String r2 = "curRecordData"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x0044:
            r1.hasRetake = r0
            if (r7 == 0) goto L_0x006c
            java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension> r7 = r6.f103279C
            if (r7 != 0) goto L_0x0051
            java.lang.String r0 = "singleRestoreSegments"
            kotlin.jvm.internal.C7573i.m23583a(r0)
        L_0x0051:
            java.util.List r7 = (java.util.List) r7
            boolean r7 = com.bytedance.apm.util.C6292i.m19525a(r7)
            if (r7 != 0) goto L_0x006c
            java.util.ArrayList r7 = new java.util.ArrayList
            java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension> r0 = r6.f103279C
            if (r0 != 0) goto L_0x0064
            java.lang.String r1 = "singleRestoreSegments"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0064:
            java.util.Collection r0 = (java.util.Collection) r0
            r7.<init>(r0)
            r6.f103278B = r7
            goto L_0x007e
        L_0x006c:
            java.util.ArrayList r7 = new java.util.ArrayList
            java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension> r0 = r6.f103277A
            if (r0 != 0) goto L_0x0077
            java.lang.String r1 = "restoreRecordSegments"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0077:
            java.util.Collection r0 = (java.util.Collection) r0
            r7.<init>(r0)
            r6.f103278B = r7
        L_0x007e:
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r7 = r6.f103293j
            if (r7 != 0) goto L_0x0087
            java.lang.String r0 = "curRecordData"
            kotlin.jvm.internal.C7573i.m23583a(r0)
        L_0x0087:
            r0 = 0
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r7 = com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.p1567a.C39702d.m127059a(r7, r0)
            r6.f103294k = r7
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r7 = r6.f103294k
            if (r7 != 0) goto L_0x0097
            java.lang.String r0 = "originRecordData"
            kotlin.jvm.internal.C7573i.m23583a(r0)
        L_0x0097:
            r7.resetTimeData()
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.c r7 = r6.f103298o
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r0 = r6.f103293j
            if (r0 != 0) goto L_0x00a5
            java.lang.String r1 = "curRecordData"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x00a5:
            r7.mo99100a(r0)
            r6.m127162l()
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a r7 = r6.f103287d
            if (r7 != 0) goto L_0x00b4
            java.lang.String r0 = "viewManager"
            kotlin.jvm.internal.C7573i.m23583a(r0)
        L_0x00b4:
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r0 = r6.f103285b
            if (r0 != 0) goto L_0x00bd
            java.lang.String r1 = "videoEditViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x00bd:
            java.util.List r0 = r0.mo97721n()
            r7.mo99193a(r0)
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r7 = r6.f103285b
            if (r7 != 0) goto L_0x00cd
            java.lang.String r0 = "videoEditViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r0)
        L_0x00cd:
            java.util.ArrayList<com.ss.android.ugc.aweme.music.mediachoose.helper.MediaModel> r0 = r6.f103302s
            java.util.List r0 = (java.util.List) r0
            r7.mo97697a(r0)
            android.support.v4.util.i r7 = new android.support.v4.util.i
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r0 = r6.f103305v
            if (r0 != 0) goto L_0x00df
            java.lang.String r1 = "restoreRecordData"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x00df:
            float r0 = r0.leftSlideX
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r1 = r6.f103305v
            if (r1 != 0) goto L_0x00ee
            java.lang.String r2 = "restoreRecordData"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x00ee:
            float r1 = r1.rightSlideX
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r7.<init>(r0, r1)
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a r0 = r6.f103287d
            if (r0 != 0) goto L_0x0100
            java.lang.String r1 = "viewManager"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0100:
            r0.mo99189a(r7)
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a r7 = r6.f103287d
            if (r7 != 0) goto L_0x010c
            java.lang.String r0 = "viewManager"
            kotlin.jvm.internal.C7573i.m23583a(r0)
        L_0x010c:
            r7.mo99200c()
            java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment> r7 = r6.f103304u
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            r0 = 0
            java.util.Iterator r7 = r7.iterator()
        L_0x0118:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x016b
            java.lang.Object r1 = r7.next()
            int r2 = r0 + 1
            if (r0 >= 0) goto L_0x0129
            kotlin.collections.C7525m.m23465b()
        L_0x0129:
            com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment r1 = (com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment) r1
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r3 = r6.f103285b
            if (r3 != 0) goto L_0x0134
            java.lang.String r4 = "videoEditViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r4)
        L_0x0134:
            java.util.List r3 = r3.mo97721n()
            java.lang.Object r3 = r3.get(r0)
            java.lang.String r4 = "videoEditViewModel.originVideoList[index]"
            kotlin.jvm.internal.C7573i.m23582a(r3, r4)
            com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment r3 = (com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment) r3
            long r4 = r1.mo96909h()
            r3.mo96898a(r4)
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r3 = r6.f103285b
            if (r3 != 0) goto L_0x0153
            java.lang.String r4 = "videoEditViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r4)
        L_0x0153:
            java.util.List r3 = r3.mo97721n()
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r3 = "videoEditViewModel.originVideoList[index]"
            kotlin.jvm.internal.C7573i.m23582a(r0, r3)
            com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment r0 = (com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment) r0
            long r3 = r1.mo96910i()
            r0.mo96901b(r3)
            r0 = r2
            goto L_0x0118
        L_0x016b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.p1569c.C39738f.m127153c(boolean):void");
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C7573i.m23587b(view, "v");
        int id = view.getId();
        if (id == R.id.b5o) {
            if (!this.f103295l) {
                this.f103295l = true;
                C38774k.m123823c();
                CutMultiVideoViewModel cutMultiVideoViewModel = this.f103284a;
                if (cutMultiVideoViewModel == null) {
                    C7573i.m23583a("cutMultiVideoViewModel");
                }
                cutMultiVideoViewModel.mo96672d();
                m127165o();
                this.f103280D = false;
            }
        } else if (id == R.id.b5h) {
            mo99137f();
        } else if (id == R.id.b5i) {
            VideoEditViewModel videoEditViewModel = this.f103285b;
            if (videoEditViewModel == null) {
                C7573i.m23583a("videoEditViewModel");
            }
            if (videoEditViewModel.mo97721n().size() == 1) {
                FragmentActivity fragmentActivity = this.f103286c;
                if (fragmentActivity == null) {
                    C7573i.m23583a("activity");
                }
                C10761a.m31409e((Context) fragmentActivity, (int) R.string.axl).mo25750a();
                return;
            }
            FragmentActivity fragmentActivity2 = this.f103286c;
            if (fragmentActivity2 == null) {
                C7573i.m23583a("activity");
            }
            Resources resources = fragmentActivity2.getResources();
            Object[] objArr = new Object[1];
            VideoEditViewModel videoEditViewModel2 = this.f103285b;
            if (videoEditViewModel2 == null) {
                C7573i.m23583a("videoEditViewModel");
            }
            objArr[0] = Float.valueOf(((float) ((VideoSegment) videoEditViewModel2.mo97721n().get(this.f103291h)).f100761c) / 1000.0f);
            String string = resources.getString(R.string.axj, objArr);
            FragmentActivity fragmentActivity3 = this.f103286c;
            if (fragmentActivity3 == null) {
                C7573i.m23583a("activity");
            }
            Activity activity = fragmentActivity3;
            C7573i.m23582a((Object) string, "duration");
            C39696a.m127028a(activity, string, new C39746h(this));
        } else if (id == R.id.e15) {
            m127164n();
        } else if (id == R.id.dr7) {
            mo99136e();
        } else if (id != R.id.a2u) {
            if (id == R.id.crr) {
                m127163m();
            }
        } else if (this.f103288e.mo99111a()) {
            C39761a aVar = this.f103287d;
            if (aVar == null) {
                C7573i.m23583a("viewManager");
            }
            aVar.mo99194a(true);
            VEVideoCutterViewModel vEVideoCutterViewModel = this.f103299p;
            if (vEVideoCutterViewModel == null) {
                C7573i.m23583a("veVideoCutterViewModel");
            }
            vEVideoCutterViewModel.mo97802a(new C39293a(2, false));
        } else {
            C39761a aVar2 = this.f103287d;
            if (aVar2 == null) {
                C7573i.m23583a("viewManager");
            }
            aVar2.mo99194a(false);
            VEVideoCutterViewModel vEVideoCutterViewModel2 = this.f103299p;
            if (vEVideoCutterViewModel2 == null) {
                C7573i.m23583a("veVideoCutterViewModel");
            }
            vEVideoCutterViewModel2.mo97802a(new C39293a(1, false));
        }
    }

    /* renamed from: a */
    public final void mo99128a(VideoPublishEditModel videoPublishEditModel) {
        MultiEditVideoRecordData multiEditVideoRecordData;
        C7573i.m23587b(videoPublishEditModel, "model");
        if (!this.f103303t) {
            this.f103292i = videoPublishEditModel;
            MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = videoPublishEditModel.multiEditVideoRecordData;
            if (multiEditVideoStatusRecordData != null) {
                multiEditVideoRecordData = multiEditVideoStatusRecordData.curMultiEditVideoRecordData;
            } else {
                multiEditVideoRecordData = null;
            }
            if (multiEditVideoRecordData != null && !C6292i.m19525a(multiEditVideoStatusRecordData.curMultiEditVideoRecordData.segmentDataList)) {
                this.f103303t = true;
                if (multiEditVideoStatusRecordData.originalSegments != null) {
                    ArrayList<TimeSpeedModelExtension> arrayList = multiEditVideoStatusRecordData.originalSegments;
                    C7573i.m23582a((Object) arrayList, "recordData.originalSegments");
                    this.f103309z = arrayList;
                    ArrayList<TimeSpeedModelExtension> arrayList2 = multiEditVideoStatusRecordData.restoreSegments;
                    if (arrayList2 == null) {
                        ArrayList<TimeSpeedModelExtension> arrayList3 = this.f103309z;
                        if (arrayList3 == null) {
                            C7573i.m23583a("originalRecordSegments");
                        }
                        arrayList2 = new ArrayList<>(arrayList3);
                    }
                    this.f103277A = arrayList2;
                    ArrayList<TimeSpeedModelExtension> arrayList4 = multiEditVideoStatusRecordData.editSegments;
                    if (arrayList4 == null) {
                        ArrayList<TimeSpeedModelExtension> arrayList5 = this.f103277A;
                        if (arrayList5 == null) {
                            C7573i.m23583a("restoreRecordSegments");
                        }
                        arrayList4 = new ArrayList<>(arrayList5);
                    }
                    this.f103278B = arrayList4;
                    ArrayList<TimeSpeedModelExtension> arrayList6 = multiEditVideoStatusRecordData.singleRestoreSegments;
                    if (arrayList6 == null) {
                        ArrayList<TimeSpeedModelExtension> arrayList7 = this.f103277A;
                        if (arrayList7 == null) {
                            C7573i.m23583a("restoreRecordSegments");
                        }
                        arrayList6 = new ArrayList<>(arrayList7);
                    }
                    this.f103279C = arrayList6;
                    if (multiEditVideoStatusRecordData.segmentSizeChange) {
                        ArrayList<TimeSpeedModelExtension> arrayList8 = this.f103278B;
                        if (arrayList8 == null) {
                            C7573i.m23583a("editSegments");
                        }
                        this.f103279C = arrayList8;
                    }
                }
                MultiEditVideoRecordData multiEditVideoRecordData2 = multiEditVideoStatusRecordData.curMultiEditVideoRecordData;
                C7573i.m23582a((Object) multiEditVideoRecordData2, "recordData.curMultiEditVideoRecordData");
                this.f103293j = multiEditVideoRecordData2;
                this.f103307x = multiEditVideoStatusRecordData.recordMusic;
                this.f103308y = multiEditVideoStatusRecordData.originalMusicStart;
                if (multiEditVideoStatusRecordData.restoreMultiEditVideoRecordData == null) {
                    this.f103305v = C39702d.m127059a(multiEditVideoStatusRecordData.curMultiEditVideoRecordData, (MultiEditVideoRecordData) null);
                } else {
                    MultiEditVideoRecordData multiEditVideoRecordData3 = multiEditVideoStatusRecordData.restoreMultiEditVideoRecordData;
                    C7573i.m23582a((Object) multiEditVideoRecordData3, "recordData.restoreMultiEditVideoRecordData");
                    this.f103305v = multiEditVideoRecordData3;
                }
                if (multiEditVideoStatusRecordData.singleRestoreMultiEditRecordData == null) {
                    this.f103306w = C39702d.m127059a(multiEditVideoStatusRecordData.curMultiEditVideoRecordData, (MultiEditVideoRecordData) null);
                } else {
                    this.f103306w = multiEditVideoStatusRecordData.singleRestoreMultiEditRecordData;
                }
                MultiEditVideoRecordData multiEditVideoRecordData4 = this.f103293j;
                if (multiEditVideoRecordData4 == null) {
                    C7573i.m23583a("curRecordData");
                }
                this.f103294k = C39702d.m127059a(multiEditVideoRecordData4, (MultiEditVideoRecordData) null);
                MultiEditVideoRecordData multiEditVideoRecordData5 = this.f103294k;
                if (multiEditVideoRecordData5 == null) {
                    C7573i.m23583a("originRecordData");
                }
                multiEditVideoRecordData5.resetTimeData();
                C39717c cVar = this.f103298o;
                MultiEditVideoRecordData multiEditVideoRecordData6 = this.f103293j;
                if (multiEditVideoRecordData6 == null) {
                    C7573i.m23583a("curRecordData");
                }
                cVar.mo99100a(multiEditVideoRecordData6);
                this.f103298o.f103240g = multiEditVideoStatusRecordData.isMultiEditRetake;
                this.f103298o.f103241h = multiEditVideoStatusRecordData.segmentSizeChange;
                this.f103298o.f103242i = multiEditVideoStatusRecordData.currentEditIndex;
                m127162l();
                m127158h();
                m127160j();
                m127161k();
                m127159i();
                if (multiEditVideoStatusRecordData.currentEditIndex >= 0 && !multiEditVideoStatusRecordData.segmentSizeChange) {
                    C39750g gVar = this.f103289f;
                    FragmentActivity fragmentActivity = this.f103286c;
                    if (fragmentActivity == null) {
                        C7573i.m23583a("activity");
                    }
                    VideoEditViewModel videoEditViewModel = this.f103285b;
                    if (videoEditViewModel == null) {
                        C7573i.m23583a("videoEditViewModel");
                    }
                    gVar.mo99147b(fragmentActivity, (VideoSegment) videoEditViewModel.mo97721n().get(multiEditVideoStatusRecordData.currentEditIndex), multiEditVideoStatusRecordData.currentEditIndex);
                    mo99124a(multiEditVideoStatusRecordData.currentEditIndex);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo99129a(boolean z) {
        boolean z2;
        this.f103298o.f103238e = z;
        C39761a aVar = this.f103287d;
        if (aVar == null) {
            C7573i.m23583a("viewManager");
        }
        aVar.mo99198b(z);
        if (z) {
            if (mo99131a()) {
                View view = this.f103301r;
                if (view == null) {
                    C7573i.m23583a("rootView");
                }
                view.postDelayed(new C39748j(this), 10);
            } else if (!this.f103298o.f103240g) {
                C39718d dVar = this.f103288e;
                MultiEditVideoRecordData multiEditVideoRecordData = this.f103293j;
                if (multiEditVideoRecordData == null) {
                    C7573i.m23583a("curRecordData");
                }
                MultiEditVideoRecordData multiEditVideoRecordData2 = this.f103293j;
                if (multiEditVideoRecordData2 == null) {
                    C7573i.m23583a("curRecordData");
                }
                dVar.mo99110a(multiEditVideoRecordData, multiEditVideoRecordData2);
            } else if (!this.f103298o.f103241h) {
                this.f103296m = 2;
                C39761a aVar2 = this.f103287d;
                if (aVar2 == null) {
                    C7573i.m23583a("viewManager");
                }
                aVar2.mo99204g();
            }
            if (!this.f103298o.f103240g) {
                MultiEditVideoRecordData multiEditVideoRecordData3 = this.f103293j;
                if (multiEditVideoRecordData3 == null) {
                    C7573i.m23583a("curRecordData");
                }
                MultiEditVideoRecordData multiEditVideoRecordData4 = this.f103305v;
                if (multiEditVideoRecordData4 == null) {
                    C7573i.m23583a("restoreRecordData");
                }
                C39702d.m127059a(multiEditVideoRecordData3, multiEditVideoRecordData4);
            }
            C23258e eVar = this.f103281E;
            if (eVar != null) {
                eVar.mo60525a(this.f103282F);
            }
            this.f103288e.f103245a = this.f103283G;
            C39761a aVar3 = this.f103287d;
            if (aVar3 == null) {
                C7573i.m23583a("viewManager");
            }
            aVar3.mo99194a(true);
            VEVideoCutterViewModel vEVideoCutterViewModel = this.f103299p;
            if (vEVideoCutterViewModel == null) {
                C7573i.m23583a("veVideoCutterViewModel");
            }
            vEVideoCutterViewModel.mo97802a(new C39293a(2, false));
        } else {
            C23258e eVar2 = this.f103281E;
            if (eVar2 != null) {
                eVar2.mo60526b(this.f103282F);
            }
            this.f103290g.mo99120b();
        }
        this.f103290g.f103254g = z;
        if (!this.f103298o.f103240g || this.f103298o.f103241h) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f103280D = z2;
        BooleanRef booleanRef = new BooleanRef();
        booleanRef.element = false;
        if (this.f103280D) {
            booleanRef.element = true;
        }
        if (!this.f103298o.f103240g) {
            booleanRef.element = true;
        }
        View view2 = this.f103301r;
        if (view2 == null) {
            C7573i.m23583a("rootView");
        }
        view2.postDelayed(new C39749k(this, booleanRef), 100);
        if (this.f103298o.f103241h) {
            m127165o();
        }
    }

    /* renamed from: a */
    public final void mo99125a(int i, int i2) {
        VideoEditViewModel videoEditViewModel = this.f103285b;
        if (videoEditViewModel == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        VideoSegment videoSegment = (VideoSegment) videoEditViewModel.mo97721n().remove(i);
        VideoEditViewModel videoEditViewModel2 = this.f103285b;
        if (videoEditViewModel2 == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        videoEditViewModel2.mo97721n().add(i2, videoSegment);
        VideoEditViewModel videoEditViewModel3 = this.f103285b;
        if (videoEditViewModel3 == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        List<VideoSegment> n = videoEditViewModel3.mo97721n();
        C7573i.m23582a((Object) n, "videoEditViewModel.originVideoList");
        int i3 = 0;
        int i4 = 0;
        for (VideoSegment videoSegment2 : n) {
            videoSegment2.f100759a = i3;
            if (i3 < i2) {
                C7573i.m23582a((Object) videoSegment2, "segment");
                i4 += (int) (videoSegment2.mo96910i() - videoSegment2.mo96909h());
            }
            i3++;
        }
        MultiEditVideoRecordData multiEditVideoRecordData = this.f103293j;
        if (multiEditVideoRecordData == null) {
            C7573i.m23583a("curRecordData");
        }
        MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = (MultiEditVideoSegmentRecordData) multiEditVideoRecordData.segmentDataList.remove(i);
        MultiEditVideoRecordData multiEditVideoRecordData2 = this.f103293j;
        if (multiEditVideoRecordData2 == null) {
            C7573i.m23583a("curRecordData");
        }
        multiEditVideoRecordData2.segmentDataList.add(i2, multiEditVideoSegmentRecordData);
        C39718d dVar = this.f103288e;
        MultiEditVideoRecordData multiEditVideoRecordData3 = this.f103293j;
        if (multiEditVideoRecordData3 == null) {
            C7573i.m23583a("curRecordData");
        }
        dVar.mo99105a(multiEditVideoRecordData3, i4);
        C39761a aVar = this.f103287d;
        if (aVar == null) {
            C7573i.m23583a("viewManager");
        }
        aVar.mo99203f();
        C39761a aVar2 = this.f103287d;
        if (aVar2 == null) {
            C7573i.m23583a("viewManager");
        }
        aVar2.mo99200c();
        C39717c cVar = this.f103298o;
        MultiEditVideoRecordData multiEditVideoRecordData4 = this.f103305v;
        if (multiEditVideoRecordData4 == null) {
            C7573i.m23583a("restoreRecordData");
        }
        cVar.mo99100a(multiEditVideoRecordData4);
        ArrayList<TimeSpeedModelExtension> arrayList = this.f103278B;
        if (arrayList == null) {
            C7573i.m23583a("editSegments");
        }
        if (i < arrayList.size()) {
            ArrayList<TimeSpeedModelExtension> arrayList2 = this.f103278B;
            if (arrayList2 == null) {
                C7573i.m23583a("editSegments");
            }
            Object remove = arrayList2.remove(i);
            C7573i.m23582a(remove, "editSegments.removeAt(from)");
            TimeSpeedModelExtension timeSpeedModelExtension = (TimeSpeedModelExtension) remove;
            ArrayList<TimeSpeedModelExtension> arrayList3 = this.f103278B;
            if (arrayList3 == null) {
                C7573i.m23583a("editSegments");
            }
            arrayList3.add(i2, timeSpeedModelExtension);
        }
        C39700b.f103201a.mo99064a(i, i2);
    }

    /* renamed from: a */
    public final void mo99126a(FragmentActivity fragmentActivity, View view) {
        C23258e eVar;
        C7573i.m23587b(fragmentActivity, "activity");
        C7573i.m23587b(view, "rootView");
        this.f103286c = fragmentActivity;
        this.f103301r = view;
        JediViewModel a = C36113b.m116288a(fragmentActivity).mo91871a(EditViewModel.class);
        C7573i.m23582a((Object) a, "JediViewModelProviders.o…ditViewModel::class.java)");
        this.f103300q = (EditViewModel) a;
        C0063u a2 = C0069x.m159a(fragmentActivity).mo147a(VideoEditViewModel.class);
        C7573i.m23582a((Object) a2, "ViewModelProviders.of(ac…ditViewModel::class.java)");
        this.f103285b = (VideoEditViewModel) a2;
        C0063u a3 = C0069x.m159a(fragmentActivity).mo147a(CutMultiVideoViewModel.class);
        C7573i.m23582a((Object) a3, "ViewModelProviders.of(ac…deoViewModel::class.java)");
        this.f103284a = (CutMultiVideoViewModel) a3;
        C0063u a4 = C0069x.m159a(fragmentActivity).mo147a(VEVideoCutterViewModel.class);
        C7573i.m23582a((Object) a4, "ViewModelProviders.of(ac…terViewModel::class.java)");
        this.f103299p = (VEVideoCutterViewModel) a4;
        if (fragmentActivity instanceof C23258e) {
            eVar = (C23258e) fragmentActivity;
        } else {
            eVar = null;
        }
        this.f103281E = eVar;
    }
}
