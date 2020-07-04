package com.p280ss.android.ugc.aweme.shortvideo.cut.scene;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.content.Intent;
import android.p013ss.com.vboost.C0166a;
import android.p013ss.com.vboost.C0173d;
import android.p013ss.com.vboost.Status;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.util.C0902i;
import android.view.SurfaceView;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.ies.NullValueException;
import com.bytedance.jedi.arch.JediViewModel;
import com.p280ss.android.ugc.asve.p754b.C15391f;
import com.p280ss.android.ugc.asve.p754b.C15392g;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.services.video.IVideoConfigService;
import com.p280ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p280ss.android.ugc.aweme.shortvideo.cut.C38747c;
import com.p280ss.android.ugc.aweme.shortvideo.cut.C38748d;
import com.p280ss.android.ugc.aweme.shortvideo.cut.C38772i;
import com.p280ss.android.ugc.aweme.shortvideo.cut.C38789o;
import com.p280ss.android.ugc.aweme.shortvideo.cut.C38791p;
import com.p280ss.android.ugc.aweme.shortvideo.cut.C38793q;
import com.p280ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.cut.VECutVideoFragment;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.CutVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C39182e;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C39210k;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.adapter.C39144d;
import com.p280ss.android.ugc.aweme.shortvideo.cut.videoedit.C39252c;
import com.p280ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.cut.viewmodel.C39293a;
import com.p280ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39526e;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.C39693b;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.C39695d;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C40178f;
import com.p280ss.android.ugc.aweme.shortvideo.p1547a.C38420b;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.themechange.base.C42111b;
import com.p280ss.android.ugc.aweme.tools.p1665a.C42131a;
import com.p280ss.android.ugc.aweme.tools.p1665a.C42133c;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.vesdk.C45255af;
import com.p280ss.android.vesdk.C45329l;
import com.p280ss.android.vesdk.VEEditor.SCALE_MODE;
import com.p280ss.android.vesdk.VEEditor.SEEK_MODE;
import com.p280ss.android.vesdk.VEEditor.VIDEO_RATIO;
import com.p280ss.android.vesdk.VEListener.C45219o;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.C7579l;
import kotlin.C7581n;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.C7507ae;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.af */
public final class C38916af {

    /* renamed from: a */
    public int f101068a = -1;

    /* renamed from: b */
    public boolean f101069b = true;

    /* renamed from: c */
    public boolean f101070c = C39182e.m125105i();

    /* renamed from: d */
    public float f101071d;

    /* renamed from: e */
    public int f101072e = C42111b.f109618a.mo103542a(true, false, false, false, false);

    /* renamed from: f */
    public C38772i f101073f;

    /* renamed from: g */
    public C38420b f101074g;

    /* renamed from: h */
    public C45329l f101075h;

    /* renamed from: i */
    public VEVideoCutterViewModel f101076i;

    /* renamed from: j */
    public VideoEditViewModel f101077j;

    /* renamed from: k */
    public CutVideoEditViewModel f101078k;

    /* renamed from: l */
    public C39210k f101079l = new C39210k();

    /* renamed from: m */
    public C45219o f101080m;

    /* renamed from: n */
    public C38931ag f101081n;

    /* renamed from: o */
    private long f101082o;

    /* renamed from: p */
    private boolean f101083p;

    /* renamed from: q */
    private boolean f101084q;

    /* renamed from: r */
    private CutMultiVideoViewModel f101085r;

    /* renamed from: s */
    private C40178f f101086s = new C40178f();

    /* renamed from: t */
    private final boolean f101087t = C35563c.f93231M.mo93305a(Property.EnableVboostOpt);

    /* renamed from: u */
    private boolean f101088u;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.af$a */
    static final class C38917a<T> implements C0053p<C39293a> {

        /* renamed from: a */
        final /* synthetic */ C38916af f101089a;

        C38917a(C38916af afVar) {
            this.f101089a = afVar;
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
                C38772i iVar = this.f101089a.f101073f;
                if (iVar != null) {
                    iVar.mo96861a(aVar.f102022d);
                }
            } else if (num != null && num.intValue() == 2) {
                C38772i iVar2 = this.f101089a.f101073f;
                if (iVar2 != null) {
                    iVar2.mo96863b(aVar.f102022d);
                }
            } else if (num != null && num.intValue() == 3) {
                C38772i iVar3 = this.f101089a.f101073f;
                if (iVar3 != null) {
                    iVar3.mo96860a(aVar.f102020b, aVar.f102019a);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.af$b */
    static final class C38918b<V> implements Callable<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C7561a f101090a;

        C38918b(C7561a aVar) {
            this.f101090a = aVar;
        }

        /* renamed from: a */
        private void m124305a() {
            this.f101090a.invoke();
        }

        public final /* synthetic */ Object call() {
            m124305a();
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.af$c */
    static final class C38919c<TTaskResult, TContinuationResult> implements C1591g<TResult, TContinuationResult> {

        /* renamed from: a */
        final /* synthetic */ C38916af f101091a;

        /* renamed from: b */
        final /* synthetic */ long f101092b;

        /* renamed from: c */
        final /* synthetic */ boolean f101093c;

        /* renamed from: d */
        final /* synthetic */ Workspace f101094d;

        /* renamed from: e */
        final /* synthetic */ C38747c f101095e;

        C38919c(C38916af afVar, long j, boolean z, Workspace workspace, C38747c cVar) {
            this.f101091a = afVar;
            this.f101092b = j;
            this.f101093c = z;
            this.f101094d = workspace;
            this.f101095e = cVar;
        }

        public final /* synthetic */ Object then(C1592h hVar) {
            m124306a(hVar);
            return C7581n.f20898a;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0053  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x005d  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x001c  */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x0032  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m124306a(bolts.C1592h<java.lang.Integer> r7) {
            /*
                r6 = this;
                long r0 = java.lang.System.currentTimeMillis()
                long r2 = r6.f101092b
                long r0 = r0 - r2
                if (r7 == 0) goto L_0x0016
                java.lang.Object r7 = r7.mo6890e()
                java.lang.Integer r7 = (java.lang.Integer) r7
                if (r7 == 0) goto L_0x0016
                int r7 = r7.intValue()
                goto L_0x0018
            L_0x0016:
                r7 = 30
            L_0x0018:
                boolean r2 = r6.f101093c
                if (r2 != 0) goto L_0x0032
                com.ss.android.ugc.aweme.shortvideo.cut.scene.af r2 = r6.f101091a
                com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r2 = com.p280ss.android.ugc.aweme.shortvideo.cut.scene.C38916af.m124279b(r2)
                java.util.List r2 = r2.mo97721n()
                java.lang.String r3 = "videoEditViewModel.originVideoList"
                kotlin.jvm.internal.C7573i.m23582a(r2, r3)
                com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace r3 = r6.f101094d
                com.ss.android.ugc.aweme.shortvideo.cut.d r7 = com.p280ss.android.ugc.aweme.shortvideo.cut.C38749e.m123749a(r2, r3, r7)
                goto L_0x004d
            L_0x0032:
                com.ss.android.ugc.aweme.shortvideo.cut.e r2 = com.p280ss.android.ugc.aweme.shortvideo.cut.C38749e.f100704a
                com.ss.android.ugc.aweme.shortvideo.cut.scene.af r3 = r6.f101091a
                com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r3 = com.p280ss.android.ugc.aweme.shortvideo.cut.scene.C38916af.m124279b(r3)
                java.util.List r3 = r3.mo97721n()
                java.lang.String r4 = "videoEditViewModel.originVideoList"
                kotlin.jvm.internal.C7573i.m23582a(r3, r4)
                com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace r4 = r6.f101094d
                com.ss.android.ugc.aweme.shortvideo.cut.scene.af r5 = r6.f101091a
                float r5 = r5.f101071d
                com.ss.android.ugc.aweme.shortvideo.cut.d r7 = r2.mo96833a(r3, r4, r7, r5)
            L_0x004d:
                com.ss.android.ugc.aweme.shortvideo.cut.scene.af r2 = r6.f101091a
                com.ss.android.ugc.aweme.shortvideo.a.b r2 = r2.f101074g
                if (r2 == 0) goto L_0x0057
                r3 = 1
                r2.mo38845f(r3)
            L_0x0057:
                com.ss.android.ugc.aweme.shortvideo.cut.scene.af r2 = r6.f101091a
                com.ss.android.ugc.aweme.shortvideo.a.b r2 = r2.f101074g
                if (r2 == 0) goto L_0x0061
                r3 = -1
                r2.mo38829c(r3)
            L_0x0061:
                com.ss.android.ugc.aweme.shortvideo.cut.scene.af r2 = r6.f101091a
                android.ss.com.vboost.Status r3 = android.p013ss.com.vboost.Status.BEGIN
                r2.mo97207a(r3)
                com.ss.android.ugc.aweme.shortvideo.cut.scene.af r2 = r6.f101091a
                com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.k r2 = r2.f101079l
                com.ss.android.ugc.aweme.shortvideo.cut.scene.af$c$1 r3 = new com.ss.android.ugc.aweme.shortvideo.cut.scene.af$c$1
                r3.<init>(r6, r0, r7)
                com.ss.android.vesdk.VEListener$k r3 = (com.p280ss.android.vesdk.VEListener.C45215k) r3
                r2.mo97517a(r7, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.cut.scene.C38916af.C38919c.m124306a(bolts.h):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.af$d */
    static final class C38924d extends Lambda implements C7562b<long[], List<? extends VideoSegment>> {

        /* renamed from: a */
        final /* synthetic */ C38916af f101107a;

        /* renamed from: b */
        final /* synthetic */ C0902i f101108b;

        /* renamed from: c */
        final /* synthetic */ long f101109c;

        C38924d(C38916af afVar, C0902i iVar, long j) {
            this.f101107a = afVar;
            this.f101108b = iVar;
            this.f101109c = j;
            super(1);
        }

        /* renamed from: a */
        public final List<VideoSegment> invoke(long[] jArr) {
            long[] jArr2 = jArr;
            C7573i.m23587b(jArr2, "targetBoundary");
            if (C38916af.m124281c(this.f101107a).f100834d == 0 || (C39182e.f101552a.mo97470h() && this.f101107a.f101070c)) {
                jArr2[0] = -1;
                jArr2[1] = -1;
                List n = C38916af.m124279b(this.f101107a).mo97721n();
                C7573i.m23582a((Object) n, "videoEditViewModel.originVideoList");
                Iterable iterable = n;
                Collection arrayList = new ArrayList();
                for (Object next : iterable) {
                    if (!((VideoSegment) next).f100768j) {
                        arrayList.add(next);
                    }
                }
                return (List) arrayList;
            }
            List<VideoSegment> arrayList2 = new ArrayList<>();
            Long l = (Long) this.f101108b.f3154a;
            if (l == null) {
                l = Long.valueOf(0);
            }
            C7573i.m23582a((Object) l, "boundary.first ?: 0");
            long longValue = l.longValue();
            Long l2 = (Long) this.f101108b.f3155b;
            if (l2 == null) {
                l2 = Long.valueOf(this.f101109c);
            }
            C7573i.m23582a((Object) l2, "boundary.second ?: maxDuration");
            long longValue2 = l2.longValue();
            List n2 = C38916af.m124279b(this.f101107a).mo97721n();
            C7573i.m23582a((Object) n2, "videoEditViewModel.originVideoList");
            Iterable iterable2 = n2;
            Collection arrayList3 = new ArrayList();
            for (Object next2 : iterable2) {
                if (!((VideoSegment) next2).f100768j) {
                    arrayList3.add(next2);
                }
            }
            List list = (List) arrayList3;
            int size = list.size();
            long j = 0;
            long j2 = 0;
            for (int i = 0; i < size && j <= longValue2; i++) {
                VideoSegment videoSegment = (VideoSegment) list.get(i);
                C7573i.m23582a((Object) videoSegment, "segment");
                j += videoSegment.mo96910i() - videoSegment.mo96909h();
                if (longValue > j) {
                    j2 += videoSegment.mo96910i() - videoSegment.mo96909h();
                } else {
                    arrayList2.add(videoSegment);
                }
            }
            long j3 = longValue - j2;
            if (j3 < 0) {
                j3 = 0;
            }
            jArr2[0] = j3;
            jArr2[1] = j - longValue2;
            return arrayList2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.af$e */
    static final class C38925e<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C38916af f101110a;

        C38925e(C38916af afVar) {
            this.f101110a = afVar;
        }

        public final /* synthetic */ Object call() {
            return Integer.valueOf(m124311a());
        }

        /* renamed from: a */
        private int m124311a() {
            List<VideoSegment> n = C38916af.m124279b(this.f101110a).mo97721n();
            int i = 0;
            if (n != null) {
                if (!(!n.isEmpty())) {
                    n = null;
                }
                if (n != null) {
                    for (VideoSegment videoSegment : n) {
                        if (videoSegment != null && !videoSegment.f100768j && videoSegment.mo96902c() > i) {
                            i = videoSegment.mo96902c();
                        }
                    }
                }
            }
            if (51 <= i && 74 >= i) {
                return i / 2;
            }
            if (i >= 75) {
                return i / 3;
            }
            return i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.af$f */
    static final class C38926f implements C45329l {

        /* renamed from: a */
        final /* synthetic */ C38916af f101111a;

        C38926f(C38916af afVar) {
            this.f101111a = afVar;
        }

        public final void onCallback(int i, int i2, float f, String str) {
            if (i == 4101) {
                C38916af.m124276a((C7561a<C7581n>) new C7561a<C7581n>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C38926f f101112a;

                    {
                        this.f101112a = r1;
                    }

                    public final /* synthetic */ Object invoke() {
                        m124312a();
                        return C7581n.f20898a;
                    }

                    /* renamed from: a */
                    private void m124312a() {
                        C38916af.m124267a(this.f101112a.f101111a).mo97802a(new C39293a(1, false));
                    }
                });
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.af$g */
    static final class C38928g implements C45219o {

        /* renamed from: a */
        final /* synthetic */ C38916af f101113a;

        C38928g(C38916af afVar) {
            this.f101113a = afVar;
        }

        /* renamed from: a */
        public final void mo38884a() {
            C38916af.m124276a((C7561a<C7581n>) new C7561a<C7581n>(this) {

                /* renamed from: a */
                final /* synthetic */ C38928g f101114a;

                {
                    this.f101114a = r1;
                }

                public final /* synthetic */ Object invoke() {
                    m124314a();
                    return C7581n.f20898a;
                }

                /* renamed from: a */
                private void m124314a() {
                    if (this.f101114a.f101113a.f101069b) {
                        C38931ag agVar = this.f101114a.f101113a.f101081n;
                        if (agVar != null) {
                            agVar.bM_();
                        }
                        this.f101114a.f101113a.f101069b = false;
                    }
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.af$h */
    static final class C38930h extends Lambda implements C7561a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C38916af f101115a;

        C38930h(C38916af afVar) {
            this.f101115a = afVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(mo97224a());
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x00c8, code lost:
            if (r7 <= java.lang.Integer.parseInt((java.lang.String) r6.get(0))) goto L_0x00ca;
         */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00eb A[Catch:{ Exception -> 0x00f4 }] */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00ee A[Catch:{ Exception -> 0x00f4 }] */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x00f3 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x00fc A[SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo97224a() {
            /*
                r13 = this;
                com.ss.android.ugc.aweme.shortvideo.cut.scene.af r0 = r13.f101115a
                com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r0 = com.p280ss.android.ugc.aweme.shortvideo.cut.scene.C38916af.m124279b(r0)
                java.util.List r0 = r0.mo97721n()
                java.lang.String r1 = "videoEditViewModel.originVideoList"
                kotlin.jvm.internal.C7573i.m23582a(r0, r1)
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.Collection r1 = (java.util.Collection) r1
                java.util.Iterator r0 = r0.iterator()
            L_0x001c:
                boolean r2 = r0.hasNext()
                r3 = 1
                if (r2 == 0) goto L_0x0033
                java.lang.Object r2 = r0.next()
                r4 = r2
                com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment r4 = (com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment) r4
                boolean r4 = r4.f100768j
                r3 = r3 ^ r4
                if (r3 == 0) goto L_0x001c
                r1.add(r2)
                goto L_0x001c
            L_0x0033:
                java.util.List r1 = (java.util.List) r1
                r0 = r1
                java.util.Collection r0 = (java.util.Collection) r0
                int r0 = r0.size()
                r2 = 0
                r4 = 0
            L_0x003e:
                if (r4 >= r0) goto L_0x0107
                java.lang.Object r5 = r1.get(r4)
                com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment r5 = (com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment) r5
                java.lang.String r6 = r5.mo96896a(r2)
                java.lang.String r7 = "segment.getPath(false)"
                kotlin.jvm.internal.C7573i.m23582a(r6, r7)
                boolean r6 = com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C40173d.m128357b(r6)
                if (r6 == 0) goto L_0x005c
                com.ss.android.ugc.aweme.shortvideo.cut.scene.af r0 = r13.f101115a
                r1 = -11009(0xffffffffffffd4ff, float:NaN)
                r0.f101068a = r1
                return r2
            L_0x005c:
                java.lang.String r6 = "segment"
                kotlin.jvm.internal.C7573i.m23582a(r5, r6)
                int r6 = r5.mo96903d()
                com.ss.android.ugc.aweme.property.AVAB r7 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93231M
                com.ss.android.ugc.aweme.property.AVAB$Property r8 = com.p280ss.android.ugc.aweme.property.AVAB.Property.FastImportGopLimit
                int r7 = r7.mo93306b(r8)
                if (r6 > r7) goto L_0x0100
                int r6 = r5.mo96902c()
                float r6 = (float) r6
                float r7 = r5.mo96911j()
                float r6 = r6 * r7
                com.ss.android.ugc.aweme.property.AVAB r7 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93231M
                com.ss.android.ugc.aweme.property.AVAB$Property r8 = com.p280ss.android.ugc.aweme.property.AVAB.Property.FastImportFpsLimit
                int r7 = r7.mo93306b(r8)
                float r7 = (float) r7
                int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
                if (r6 <= 0) goto L_0x0089
                goto L_0x0100
            L_0x0089:
                com.ss.android.ugc.aweme.shortvideo.cut.q$a r6 = com.p280ss.android.ugc.aweme.shortvideo.cut.C38793q.f100815a     // Catch:{ Exception -> 0x00f4 }
                java.lang.String r6 = r6.mo96930a()     // Catch:{ Exception -> 0x00f4 }
                r7 = r6
                java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch:{ Exception -> 0x00f4 }
                java.lang.String[] r8 = new java.lang.String[r3]     // Catch:{ Exception -> 0x00f4 }
                java.lang.String r6 = "*"
                r8[r2] = r6     // Catch:{ Exception -> 0x00f4 }
                r9 = 0
                r10 = 0
                r11 = 6
                r12 = 0
                java.util.List r6 = kotlin.text.C7634n.m23768b(r7, r8, false, 0)     // Catch:{ Exception -> 0x00f4 }
                int r7 = r5.f100765g     // Catch:{ Exception -> 0x00f4 }
                int r8 = r5.f100766h     // Catch:{ Exception -> 0x00f4 }
                int r7 = java.lang.Math.min(r7, r8)     // Catch:{ Exception -> 0x00f4 }
                int r8 = r5.f100765g     // Catch:{ Exception -> 0x00f4 }
                int r5 = r5.f100766h     // Catch:{ Exception -> 0x00f4 }
                int r5 = java.lang.Math.max(r8, r5)     // Catch:{ Exception -> 0x00f4 }
                java.lang.Object r8 = r6.get(r3)     // Catch:{ Exception -> 0x00f4 }
                java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x00f4 }
                java.lang.String r9 = ""
                boolean r8 = kotlin.jvm.internal.C7573i.m23585a(r8, r9)     // Catch:{ Exception -> 0x00f4 }
                if (r8 == 0) goto L_0x00ce
                java.lang.Object r5 = r6.get(r2)     // Catch:{ Exception -> 0x00f4 }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x00f4 }
                int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ Exception -> 0x00f4 }
                if (r7 > r5) goto L_0x00cc
            L_0x00ca:
                r5 = 1
                goto L_0x00e7
            L_0x00cc:
                r5 = 0
                goto L_0x00e7
            L_0x00ce:
                java.lang.Object r8 = r6.get(r2)     // Catch:{ Exception -> 0x00f4 }
                java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x00f4 }
                int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ Exception -> 0x00f4 }
                if (r7 > r8) goto L_0x00cc
                java.lang.Object r6 = r6.get(r3)     // Catch:{ Exception -> 0x00f4 }
                java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x00f4 }
                int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ Exception -> 0x00f4 }
                if (r5 > r6) goto L_0x00cc
                goto L_0x00ca
            L_0x00e7:
                com.ss.android.ugc.aweme.shortvideo.cut.scene.af r6 = r13.f101115a     // Catch:{ Exception -> 0x00f4 }
                if (r5 != 0) goto L_0x00ee
                r7 = -11004(0xffffffffffffd504, float:NaN)
                goto L_0x00ef
            L_0x00ee:
                r7 = 0
            L_0x00ef:
                r6.f101068a = r7     // Catch:{ Exception -> 0x00f4 }
                if (r5 != 0) goto L_0x00fc
                return r2
            L_0x00f4:
                r5 = move-exception
                java.lang.String r5 = r5.getMessage()
                com.p280ss.android.ugc.aweme.shortvideo.util.C41530am.m132283b(r5)
            L_0x00fc:
                int r4 = r4 + 1
                goto L_0x003e
            L_0x0100:
                com.ss.android.ugc.aweme.shortvideo.cut.scene.af r0 = r13.f101115a
                r1 = -11005(0xffffffffffffd503, float:NaN)
                r0.f101068a = r1
                return r2
            L_0x0107:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.cut.scene.C38916af.C38930h.mo97224a():boolean");
        }
    }

    /* renamed from: a */
    private static boolean m124277a(int i, int i2, int i3) {
        if (i > i2) {
            int i4 = i2;
            i2 = i;
            i = i4;
        }
        return (i < 1080 && i2 < 1920) || (i <= 1080 && i2 <= 1920 && i3 < 35);
    }

    /* renamed from: a */
    public final long mo97202a() {
        C38772i iVar = this.f101073f;
        if (iVar != null) {
            return iVar.mo96864c();
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo97208a(FragmentActivity fragmentActivity) {
        C7573i.m23587b(fragmentActivity, "activity");
        C0063u a = C0069x.m159a(fragmentActivity).mo147a(CutMultiVideoViewModel.class);
        C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…deoViewModel::class.java]");
        this.f101085r = (CutMultiVideoViewModel) a;
        C0063u a2 = C0069x.m159a(fragmentActivity).mo147a(VEVideoCutterViewModel.class);
        C7573i.m23582a((Object) a2, "ViewModelProviders.of(ac…terViewModel::class.java]");
        this.f101076i = (VEVideoCutterViewModel) a2;
        C0063u a3 = C0069x.m159a(fragmentActivity).mo147a(VideoEditViewModel.class);
        C7573i.m23582a((Object) a3, "ViewModelProviders.of(ac…ditViewModel::class.java]");
        this.f101077j = (VideoEditViewModel) a3;
        JediViewModel a4 = C36113b.m116288a(fragmentActivity).mo91871a(CutVideoEditViewModel.class);
        C7573i.m23582a((Object) a4, "JediViewModelProviders.o…ditViewModel::class.java]");
        this.f101078k = (CutVideoEditViewModel) a4;
        this.f101088u = C7573i.m23585a((Object) "from_chat", (Object) fragmentActivity.getIntent().getStringExtra("enter_from"));
        m124271a((C0043i) fragmentActivity);
    }

    /* renamed from: a */
    public final void mo97209a(FragmentActivity fragmentActivity, C0043i iVar, String str, SurfaceView surfaceView, C39252c cVar) {
        C7573i.m23587b(fragmentActivity, "activity");
        C7573i.m23587b(iVar, "lifecycleOwner");
        C7573i.m23587b(str, "workspace");
        C7573i.m23587b(surfaceView, "surfaceView");
        C7573i.m23587b(cVar, "videoEditView");
        if (!m124278a((Context) fragmentActivity, iVar, str, surfaceView, cVar)) {
            C38931ag agVar = this.f101081n;
            if (agVar != null) {
                agVar.bK_();
            }
        }
    }

    /* renamed from: a */
    private final boolean m124278a(Context context, C0043i iVar, String str, SurfaceView surfaceView, C39252c cVar) {
        int i;
        SurfaceView surfaceView2 = surfaceView;
        if (this.f101084q) {
            return true;
        }
        VideoEditViewModel videoEditViewModel = this.f101077j;
        if (videoEditViewModel == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        C0052o<CutVideoContext> oVar = videoEditViewModel.f101855t;
        C7573i.m23582a((Object) oVar, "videoEditViewModel.cutVideoContext");
        if (oVar.getValue() == null) {
            C41530am.m132283b("VECutVideoPresenter,init error because of null cutVideoContext");
            return false;
        }
        VideoEditViewModel videoEditViewModel2 = this.f101077j;
        if (videoEditViewModel2 == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        List n = videoEditViewModel2.mo97721n();
        int size = n != null ? n.size() : 0;
        if (size == 0) {
            return false;
        }
        this.f101084q = true;
        C38420b bVar = new C38420b(str, surfaceView2);
        C38916af afVar = this;
        if (afVar.f101075h == null) {
            this.f101075h = new C38926f(this);
        }
        C45329l lVar = this.f101075h;
        if (lVar == null) {
            C7573i.m23583a("infoCallback");
        }
        bVar.mo38824b(lVar);
        bVar.mo38773a(SCALE_MODE.SCALE_MODE_CENTER_INSIDE);
        bVar.mo38832c(true);
        if (afVar.f101080m == null) {
            this.f101080m = new C38928g(this);
        }
        C45219o oVar2 = this.f101080m;
        if (oVar2 == null) {
            C7573i.m23583a("firstFrameListener");
        }
        bVar.mo38800a(oVar2);
        this.f101074g = bVar;
        List arrayList = new ArrayList();
        int[] iArr = new int[size];
        int[] iArr2 = new int[size];
        float[] fArr = new float[size];
        int[] iArr3 = new int[size];
        int[] iArr4 = iArr3;
        m124275a(n, arrayList, iArr, iArr2, fArr, iArr3);
        Collection collection = arrayList;
        Object[] array = collection.toArray(new String[0]);
        if (array != null) {
            C45255af afVar2 = new C45255af((String[]) array);
            C38420b bVar2 = this.f101074g;
            if (bVar2 == null) {
                C7573i.m23580a();
            }
            C38789o oVar3 = new C38789o(bVar2, afVar2);
            C38420b bVar3 = this.f101074g;
            if (bVar3 == null) {
                C7573i.m23580a();
            }
            C39144d dVar = new C39144d(bVar3, afVar2);
            this.f101079l.f101623a = oVar3;
            this.f101079l.f101624b = dVar;
            this.f101086s.f104452a = this.f101074g;
            C38420b bVar4 = this.f101074g;
            if (bVar4 == null) {
                C7573i.m23580a();
            }
            this.f101073f = new C38791p(context, bVar4, surfaceView2, iVar);
            C38420b bVar5 = this.f101074g;
            if (bVar5 != null) {
                boolean z = C39182e.f101552a.mo97470h() && arrayList.size() > 1;
                if (z) {
                    Object[] array2 = collection.toArray(new String[0]);
                    if (array2 != null) {
                        i = bVar5.mo38772a(new C15392g((String[]) array2, VIDEO_RATIO.VIDEO_OUT_RATIO_ORIGINAL));
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                } else {
                    Object[] array3 = collection.toArray(new String[0]);
                    if (array3 != null) {
                        C15391f fVar = new C15391f((String[]) array3);
                        fVar.mo38887a(VIDEO_RATIO.VIDEO_OUT_RATIO_ORIGINAL);
                        fVar.f39683a = iArr;
                        fVar.f39684b = iArr2;
                        fVar.f39689g = fArr;
                        i = bVar5.mo38772a(fVar);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                }
                if (i == 0) {
                    List list = n;
                    C42133c.m134097a(afVar2, n, iArr, iArr2, fArr, iArr4);
                    C38420b bVar6 = this.f101074g;
                    if (bVar6 != null) {
                        bVar6.mo38776a(afVar2);
                    }
                    this.f101086s.mo99950a(list);
                    bVar5.mo38823b(this.f101072e);
                    bVar5.mo38856j(30);
                    bVar5.mo38803a(0, 1, 0.5f);
                    if (C35563c.f93231M.mo93306b(Property.EnableImportAvSync) != 512) {
                        bVar5.mo38829c(1);
                    } else if (!z || !this.f101070c) {
                        bVar5.mo38829c(1);
                    } else {
                        bVar5.mo38829c(0);
                    }
                    IVideoConfigService iVideoConfigService = C35563c.f93255r;
                    C7573i.m23582a((Object) iVideoConfigService, "AVEnv.IMPORT_VIDEO_CONFIG_SERVICE");
                    int videoWidth = iVideoConfigService.getVideoWidth();
                    IVideoConfigService iVideoConfigService2 = C35563c.f93255r;
                    C7573i.m23582a((Object) iVideoConfigService2, "AVEnv.IMPORT_VIDEO_CONFIG_SERVICE");
                    bVar5.mo38836d(videoWidth, iVideoConfigService2.getVideoHeight());
                    bVar5.mo38837d(C35563c.f93231M.mo93305a(Property.EnableSlimVECutProcessor));
                    bVar5.mo38868p();
                    C0902i playBoundary = cVar.getPlayBoundary();
                    Long l = (Long) playBoundary.f3154a;
                    if (l == null) {
                        l = Long.valueOf(0);
                    }
                    C7573i.m23582a((Object) l, "boundary.first ?: 0");
                    long longValue = l.longValue();
                    Long l2 = (Long) playBoundary.f3155b;
                    if (l2 == null) {
                        l2 = Long.valueOf(cVar.getMaxCutDuration());
                    }
                    C7573i.m23582a((Object) l2, "boundary.second ?: videoEditView.maxCutDuration");
                    bVar5.mo38812b((int) longValue, (int) l2.longValue());
                    m124274a(list);
                    if (this.f101083p) {
                        C38772i iVar2 = this.f101073f;
                        if (iVar2 != null) {
                            iVar2.mo96865c(this.f101083p);
                        }
                        this.f101083p = false;
                    }
                    if (!z || !this.f101070c) {
                        C38772i iVar3 = this.f101073f;
                        if (iVar3 != null) {
                            iVar3.mo96860a(this.f101082o, SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
                        }
                    }
                    C38931ag agVar = this.f101081n;
                    if (agVar != null) {
                        agVar.mo97225a(this.f101074g);
                    }
                    return true;
                }
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: a */
    public final void mo97206a(int i, int i2) {
        C39210k kVar = this.f101079l;
        VideoEditViewModel videoEditViewModel = this.f101077j;
        if (videoEditViewModel == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        kVar.mo97515a(i, i2, videoEditViewModel.mo97721n());
    }

    /* renamed from: a */
    public final void mo97204a(int i) {
        VideoEditViewModel videoEditViewModel = this.f101077j;
        if (videoEditViewModel == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        VideoSegment e = videoEditViewModel.mo97711e(i);
        if (e != null) {
            this.f101079l.mo97516a(i, e);
            this.f101086s.mo99948a(e);
        }
    }

    /* renamed from: a */
    public final void mo97216a(boolean z, boolean z2) {
        C39210k kVar = this.f101079l;
        VideoEditViewModel videoEditViewModel = this.f101077j;
        if (videoEditViewModel == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        kVar.mo97520a(z, z2, videoEditViewModel.mo97721n());
    }

    /* renamed from: a */
    public final void mo97213a(List<? extends VideoSegment> list, int i, C0902i<Long, Long> iVar, long j) {
        C7573i.m23587b(iVar, "boundary");
        Long l = (Long) iVar.f3154a;
        if (l == null) {
            l = Long.valueOf(0);
        }
        C7573i.m23582a((Object) l, "boundary.first ?: 0");
        long longValue = l.longValue();
        Long l2 = (Long) iVar.f3155b;
        if (l2 == null) {
            l2 = Long.valueOf(j);
        }
        C7573i.m23582a((Object) l2, "boundary.second ?: maxDuration");
        this.f101079l.mo97518a(list, i, longValue, l2.longValue());
    }

    /* renamed from: a */
    public final void mo97214a(List<? extends VideoSegment> list, boolean z) {
        this.f101079l.mo97519a(list, z);
        this.f101086s.mo99950a(list);
    }

    /* renamed from: a */
    public final void mo97210a(C0902i<Long, Long> iVar, long j) {
        long j2;
        C7573i.m23587b(iVar, "boundary");
        if (iVar.f3154a != null) {
            F f = iVar.f3154a;
            if (f == null) {
                C7573i.m23580a();
            }
            j2 = ((Number) f).longValue();
        } else {
            j2 = 0;
        }
        if (iVar.f3155b != null) {
            S s = iVar.f3155b;
            if (s == null) {
                C7573i.m23580a();
            }
            j = ((Number) s).longValue();
        }
        this.f101079l.mo97514a((int) j2, (int) j);
    }

    /* renamed from: a */
    public final void mo97215a(boolean z) {
        this.f101070c = z;
        this.f101079l.f101625c = z;
        C38772i iVar = this.f101073f;
        if (iVar != null) {
            iVar.mo96866d(z);
        }
        this.f101086s.f104453b = z;
    }

    /* renamed from: a */
    private final void m124275a(List<? extends VideoSegment> list, List<String> list2, int[] iArr, int[] iArr2, float[] fArr, int[] iArr3) {
        if (list != null) {
            if (!(!list.isEmpty())) {
                list = null;
            }
            if (list != null) {
                int i = 0;
                for (Object next : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        C7525m.m23465b();
                    }
                    VideoSegment videoSegment = (VideoSegment) next;
                    String a = videoSegment.mo96896a(false);
                    C7573i.m23582a((Object) a, "videoSegment.getPath(false)");
                    list2.add(a);
                    iArr[i] = (int) videoSegment.mo96909h();
                    iArr2[i] = (int) videoSegment.mo96910i();
                    fArr[i] = videoSegment.mo96911j();
                    iArr3[i] = videoSegment.f100769k;
                    i = i2;
                }
                CutVideoEditViewModel cutVideoEditViewModel = this.f101078k;
                if (cutVideoEditViewModel == null) {
                    C7573i.m23583a("cutVideoEditViewModel");
                }
                if (cutVideoEditViewModel.f100834d == 0) {
                    iArr[0] = 0;
                    iArr2[0] = (int) ((VideoSegment) list.get(0)).f100761c;
                    iArr3[0] = 0;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo97207a(Status status) {
        if (this.f101087t) {
            C0173d.m477b().mo370a(C0166a.f384g, status);
        }
    }

    /* renamed from: a */
    public final void mo97211a(Workspace workspace, boolean z, boolean z2, C38747c cVar) {
        C7573i.m23587b(workspace, "workspace");
        C7573i.m23587b(cVar, "listener");
        if (!this.f101084q) {
            C41530am.m132280a("VECutVideo,return compile because of editor not init");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        C38772i iVar = this.f101073f;
        this.f101083p = iVar != null ? iVar.mo96867d() : false;
        VEVideoCutterViewModel vEVideoCutterViewModel = this.f101076i;
        if (vEVideoCutterViewModel == null) {
            C7573i.m23583a("veVideoCutterViewModel");
        }
        vEVideoCutterViewModel.mo97802a(new C39293a(2, true));
        C38772i iVar2 = this.f101073f;
        this.f101082o = iVar2 != null ? iVar2.mo96859a() : 0;
        if (m124280b(z2, z)) {
            cVar.mo96718a(true);
            C41530am.m132280a("VECutVideo,using fastImport strategy");
            cVar.onCompileDone();
            if (m124284g()) {
                m124282e();
            } else {
                mo97220d();
            }
        } else {
            cVar.mo96718a(false);
            C41530am.m132280a("VECutVideo,using normalImport strategy");
            C1592h f = m124283f();
            C38919c cVar2 = new C38919c(this, currentTimeMillis, z, workspace, cVar);
            f.mo6875a((C1591g<TResult, TContinuationResult>) cVar2);
        }
    }

    /* renamed from: a */
    public final Intent mo97203a(Workspace workspace, boolean z, C0902i<Long, Long> iVar, long j) {
        C7573i.m23587b(iVar, "boundary");
        Intent intent = new Intent();
        intent.putExtra("workspace", workspace);
        if (workspace != null) {
            String str = "extra_edit_preview_info";
            EditPreviewInfo a = m124268a(z, workspace, iVar, j);
            if (a != null) {
                intent.putExtra(str, a);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.os.Parcelable");
            }
        }
        intent.putExtra("extra_av_is_fast_import", z);
        intent.putExtra("extra_fast_import_error_code", this.f101068a);
        intent.putExtra("extra_av_enable_fast_import_resolution", C38793q.f100815a.mo96930a());
        if (m124284g() && z) {
            C38420b bVar = this.f101074g;
            VECutVideoFragment.f100416u = bVar != null ? bVar.mo38822b() : -1;
            String str2 = "extra_editor_model";
            C38420b bVar2 = this.f101074g;
            intent.putExtra(str2, bVar2 != null ? bVar2.mo38867o() : null);
        }
        return intent;
    }

    /* renamed from: a */
    public final boolean mo97217a(VideoSegment videoSegment) {
        if (videoSegment != null) {
            return m124277a(videoSegment.f100765g, videoSegment.f100766h, videoSegment.mo96902c());
        }
        return false;
    }

    /* renamed from: a */
    public static void m124276a(C7561a<C7581n> aVar) {
        C1592h.m7855a((Callable<TResult>) new C38918b<TResult>(aVar), C1592h.f5958b);
    }

    /* renamed from: a */
    public final void mo97212a(VideoSegment videoSegment, long j, long j2) {
        this.f101086s.mo99949a(videoSegment, j, j2);
    }

    /* renamed from: e */
    private final void m124282e() {
        C38420b bVar = this.f101074g;
        if (bVar != null) {
            bVar.mo38871q();
        }
        C38420b bVar2 = this.f101074g;
        if (bVar2 != null) {
            bVar2.mo38875s();
        }
        this.f101084q = false;
    }

    /* renamed from: f */
    private final C1592h<Integer> m124283f() {
        C1592h<Integer> a = C1592h.m7853a((Callable<TResult>) new C38925e<TResult>(this));
        C7573i.m23582a((Object) a, "Task.callInBackground {\n…s\n            }\n        }");
        return a;
    }

    /* renamed from: b */
    public final long mo97218b() {
        C38772i iVar = this.f101073f;
        if (iVar != null) {
            return iVar.mo96859a();
        }
        return 0;
    }

    /* renamed from: c */
    public final boolean mo97219c() {
        C38772i iVar = this.f101073f;
        if (iVar != null) {
            return iVar.mo96862b();
        }
        return false;
    }

    /* renamed from: g */
    private final boolean m124284g() {
        boolean z = false;
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            Boolean enableReuseEditorForFastimport = a.getEnableReuseEditorForFastimport();
            C7573i.m23582a((Object) enableReuseEditorForFastimport, "SettingsReader.get().ena…eReuseEditorForFastimport");
            if (enableReuseEditorForFastimport.booleanValue()) {
                CutVideoEditViewModel cutVideoEditViewModel = this.f101078k;
                if (cutVideoEditViewModel == null) {
                    C7573i.m23583a("cutVideoEditViewModel");
                }
                if (cutVideoEditViewModel.f100834d == 0 && !this.f101088u) {
                    z = true;
                }
            }
            return z;
        } catch (NullValueException unused) {
            return false;
        }
    }

    /* renamed from: d */
    public final void mo97220d() {
        if (this.f101084q) {
            this.f101084q = false;
            C38420b bVar = this.f101074g;
            if (bVar != null) {
                bVar.mo38876t();
            }
            C38931ag agVar = this.f101081n;
            if (agVar != null) {
                agVar.bL_();
            }
            if (this.f101073f != null) {
                if (this.f101073f == null) {
                    C7573i.m23580a();
                }
                this.f101073f = null;
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ VEVideoCutterViewModel m124267a(C38916af afVar) {
        VEVideoCutterViewModel vEVideoCutterViewModel = afVar.f101076i;
        if (vEVideoCutterViewModel == null) {
            C7573i.m23583a("veVideoCutterViewModel");
        }
        return vEVideoCutterViewModel;
    }

    /* renamed from: b */
    public static final /* synthetic */ VideoEditViewModel m124279b(C38916af afVar) {
        VideoEditViewModel videoEditViewModel = afVar.f101077j;
        if (videoEditViewModel == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        return videoEditViewModel;
    }

    /* renamed from: c */
    public static final /* synthetic */ CutVideoEditViewModel m124281c(C38916af afVar) {
        CutVideoEditViewModel cutVideoEditViewModel = afVar.f101078k;
        if (cutVideoEditViewModel == null) {
            C7573i.m23583a("cutVideoEditViewModel");
        }
        return cutVideoEditViewModel;
    }

    /* renamed from: a */
    private final void m124271a(C0043i iVar) {
        VEVideoCutterViewModel vEVideoCutterViewModel = this.f101076i;
        if (vEVideoCutterViewModel == null) {
            C7573i.m23583a("veVideoCutterViewModel");
        }
        vEVideoCutterViewModel.mo97801a().observe(iVar, new C38917a(this));
    }

    /* renamed from: a */
    private final void m124274a(List<? extends VideoSegment> list) {
        if (list != null && (!list.isEmpty())) {
            VideoSegment videoSegment = (VideoSegment) list.get(0);
            CutVideoEditViewModel cutVideoEditViewModel = this.f101078k;
            if (cutVideoEditViewModel == null) {
                C7573i.m23583a("cutVideoEditViewModel");
            }
            if (cutVideoEditViewModel.f100834d == 0 && videoSegment.f100769k > 0) {
                this.f101079l.mo97521a((float) videoSegment.f100769k, videoSegment.f100770l, videoSegment.f100771m, 0, 0);
            }
        }
    }

    /* renamed from: a */
    public final void mo97205a(int i, float f) {
        this.f101079l.mo97523b(i, f);
    }

    /* renamed from: b */
    private final boolean m124280b(boolean z, boolean z2) {
        C38930h hVar = new C38930h(this);
        if (z) {
            this.f101068a = -11008;
            return false;
        } else if (z2) {
            return false;
        } else {
            if (C35563c.f93231M.mo93305a(Property.EnableVEFastImport)) {
                CutVideoEditViewModel cutVideoEditViewModel = this.f101078k;
                if (cutVideoEditViewModel == null) {
                    C7573i.m23583a("cutVideoEditViewModel");
                }
                if (cutVideoEditViewModel.f100834d == 0) {
                    return hVar.mo97224a();
                }
                if (C35563c.f93231M.mo93305a(Property.EnableMultiFastImport)) {
                    return hVar.mo97224a();
                }
                this.f101068a = -11007;
                return false;
            }
            this.f101068a = -2;
            return false;
        }
    }

    /* renamed from: a */
    private final EditPreviewInfo m124268a(boolean z, Workspace workspace, C0902i<Long, Long> iVar, long j) {
        C38924d dVar = new C38924d(this, iVar, j);
        if (z) {
            C38931ag agVar = this.f101081n;
            if (agVar != null) {
                agVar.bN_();
            }
            List arrayList = new ArrayList();
            long[] jArr = new long[2];
            Iterable<VideoSegment> a = dVar.invoke(jArr);
            Collection arrayList2 = new ArrayList(C7525m.m23469a(a, 10));
            for (VideoSegment a2 : a) {
                arrayList2.add(C39526e.m126245a(a2));
            }
            List list = (List) arrayList2;
            if (!(!list.isEmpty())) {
                list = null;
            }
            if (list != null) {
                arrayList.addAll(list);
            }
            long[] jArr2 = {jArr[0], jArr[1]};
            long j2 = jArr2[0];
            long j3 = jArr2[1];
            if (j2 >= 0) {
                VideoCutInfo videoCutInfo = ((EditVideoSegment) arrayList.get(0)).getVideoCutInfo();
                if (videoCutInfo != null) {
                    EditVideoSegment editVideoSegment = (EditVideoSegment) arrayList.get(0);
                    VideoCutInfo videoCutInfo2 = new VideoCutInfo(videoCutInfo.getStart() + j2, videoCutInfo.getEnd(), videoCutInfo.getSpeed(), videoCutInfo.getRotate());
                    arrayList.set(0, EditVideoSegment.copy$default(editVideoSegment, null, null, null, videoCutInfo2, 7, null));
                }
            }
            if (j3 >= 0) {
                VideoCutInfo videoCutInfo3 = ((EditVideoSegment) arrayList.get(arrayList.size() - 1)).getVideoCutInfo();
                if (videoCutInfo3 != null) {
                    int size = arrayList.size() - 1;
                    EditVideoSegment editVideoSegment2 = (EditVideoSegment) arrayList.get(arrayList.size() - 1);
                    VideoCutInfo videoCutInfo4 = new VideoCutInfo(videoCutInfo3.getStart(), videoCutInfo3.getEnd() - j3, videoCutInfo3.getSpeed(), videoCutInfo3.getRotate());
                    arrayList.set(size, EditVideoSegment.copy$default(editVideoSegment2, null, null, null, videoCutInfo4, 7, null));
                }
            }
            IVideoConfigService iVideoConfigService = C35563c.f93255r;
            C7573i.m23582a((Object) iVideoConfigService, "AVEnv.IMPORT_VIDEO_CONFIG_SERVICE");
            int videoWidth = iVideoConfigService.getVideoWidth();
            IVideoConfigService iVideoConfigService2 = C35563c.f93255r;
            C7573i.m23582a((Object) iVideoConfigService2, "AVEnv.IMPORT_VIDEO_CONFIG_SERVICE");
            C39693b bVar = new C39693b(videoWidth, iVideoConfigService2.getVideoHeight(), 0, 0, 12, null);
            return bVar.mo99056a(arrayList);
        }
        C39695d dVar2 = new C39695d(0, 0, 0, 0, 15, null);
        File c = workspace.mo96314c();
        C7573i.m23582a((Object) c, "workspace.concatVideoFile");
        String path = c.getPath();
        C7573i.m23582a((Object) path, "workspace.concatVideoFile.path");
        File d = workspace.mo96315d();
        C7573i.m23582a((Object) d, "workspace.concatAudioFile");
        String path2 = d.getPath();
        File c2 = workspace.mo96314c();
        C7573i.m23582a((Object) c2, "workspace.concatVideoFile");
        String path3 = c2.getPath();
        C7573i.m23582a((Object) path3, "workspace.concatVideoFile.path");
        return dVar2.mo99058a(new EditVideoSegment(path, path2, C39526e.m126246a(path3)));
    }

    /* renamed from: a */
    public static void m124270a(int i, long j, long j2, C38748d dVar, int i2, String str) {
        C6893q.m21444a("av_ve_import_compile", i, C42131a.m134091a(C7507ae.m23393a((Pair<? extends K, ? extends V>[]) new Pair[]{C7579l.m23633a("fps_time", String.valueOf(j)), C7579l.m23633a("compile_time", String.valueOf(j2)), C7579l.m23633a("is_hard_encode", String.valueOf(dVar.f100697g)), C7579l.m23633a("fps", String.valueOf(dVar.f100696f)), C7579l.m23633a("errorCode", String.valueOf(i2)), C7579l.m23633a("error_message", str)})));
    }

    /* renamed from: a */
    private void m124269a(int i, float f, boolean z, float f2, float f3, int i2, int i3) {
        this.f101071d = f;
        if (z) {
            this.f101079l.mo97521a(f, f2, f3, i2, i3);
        } else {
            this.f101079l.mo97522a(i, f);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m124272a(C38916af afVar, int i, float f, boolean z, float f2, float f3, int i2, int i3, int i4, Object obj) {
        boolean z2;
        float f4;
        float f5;
        int i5;
        int i6;
        if ((i4 & 4) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        if ((i4 & 8) != 0) {
            f4 = 1.0f;
        } else {
            f4 = f2;
        }
        if ((i4 & 16) != 0) {
            f5 = 1.0f;
        } else {
            f5 = f3;
        }
        if ((i4 & 32) != 0) {
            i5 = 0;
        } else {
            i5 = i2;
        }
        if ((i4 & 64) != 0) {
            i6 = 0;
        } else {
            i6 = i3;
        }
        afVar.m124269a(i, f, z2, f4, f5, i5, i6);
    }
}
