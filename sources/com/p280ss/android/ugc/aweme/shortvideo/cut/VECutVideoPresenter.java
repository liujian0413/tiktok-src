package com.p280ss.android.ugc.aweme.shortvideo.cut;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.content.Intent;
import android.p013ss.com.vboost.C0166a;
import android.p013ss.com.vboost.C0173d;
import android.p013ss.com.vboost.Status;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.util.C0902i;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.ies.NullValueException;
import com.p280ss.android.ugc.asve.p754b.C15391f;
import com.p280ss.android.ugc.asve.p754b.C15392g;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.services.video.IVideoConfigService;
import com.p280ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.CutVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C39182e;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C39210k;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.adapter.C39144d;
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

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter */
public final class VECutVideoPresenter implements C0042h {

    /* renamed from: a */
    public int f100497a = -1;

    /* renamed from: b */
    public boolean f100498b = true;

    /* renamed from: c */
    public boolean f100499c = C39182e.m125105i();

    /* renamed from: d */
    public float f100500d;

    /* renamed from: e */
    public int f100501e = C42111b.f109618a.mo103542a(true, false, false, false, false);

    /* renamed from: f */
    public C38772i f100502f;

    /* renamed from: g */
    public C38420b f100503g;

    /* renamed from: h */
    public C45329l f100504h;

    /* renamed from: i */
    public VEVideoCutterViewModel f100505i;

    /* renamed from: j */
    public VideoEditViewModel f100506j;

    /* renamed from: k */
    public C39210k f100507k = new C39210k();

    /* renamed from: l */
    public C45219o f100508l;

    /* renamed from: m */
    public final C38776l f100509m;

    /* renamed from: n */
    private long f100510n;

    /* renamed from: o */
    private boolean f100511o;

    /* renamed from: p */
    private boolean f100512p;

    /* renamed from: q */
    private CutMultiVideoViewModel f100513q;

    /* renamed from: r */
    private C40178f f100514r = new C40178f();

    /* renamed from: s */
    private final boolean f100515s = C35563c.f93231M.mo93305a(Property.EnableVboostOpt);

    /* renamed from: t */
    private boolean f100516t;

    /* renamed from: u */
    private final String f100517u;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter$a */
    static final class C38679a<T> implements C0053p<C39293a> {

        /* renamed from: a */
        final /* synthetic */ VECutVideoPresenter f100518a;

        C38679a(VECutVideoPresenter vECutVideoPresenter) {
            this.f100518a = vECutVideoPresenter;
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
                C38772i iVar = this.f100518a.f100502f;
                if (iVar != null) {
                    iVar.mo96861a(aVar.f102022d);
                }
            } else if (num != null && num.intValue() == 2) {
                C38772i iVar2 = this.f100518a.f100502f;
                if (iVar2 != null) {
                    iVar2.mo96863b(aVar.f102022d);
                }
            } else if (num != null && num.intValue() == 3) {
                C38772i iVar3 = this.f100518a.f100502f;
                if (iVar3 != null) {
                    iVar3.mo96860a(aVar.f102020b, aVar.f102019a);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter$b */
    static final class C38680b<V> implements Callable<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C7561a f100519a;

        C38680b(C7561a aVar) {
            this.f100519a = aVar;
        }

        /* renamed from: a */
        private void m123574a() {
            this.f100519a.invoke();
        }

        public final /* synthetic */ Object call() {
            m123574a();
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter$c */
    static final class C38681c<TTaskResult, TContinuationResult> implements C1591g<TResult, TContinuationResult> {

        /* renamed from: a */
        final /* synthetic */ VECutVideoPresenter f100520a;

        /* renamed from: b */
        final /* synthetic */ long f100521b;

        /* renamed from: c */
        final /* synthetic */ boolean f100522c;

        /* renamed from: d */
        final /* synthetic */ Workspace f100523d;

        /* renamed from: e */
        final /* synthetic */ C38747c f100524e;

        C38681c(VECutVideoPresenter vECutVideoPresenter, long j, boolean z, Workspace workspace, C38747c cVar) {
            this.f100520a = vECutVideoPresenter;
            this.f100521b = j;
            this.f100522c = z;
            this.f100523d = workspace;
            this.f100524e = cVar;
        }

        public final /* synthetic */ Object then(C1592h hVar) {
            m123575a(hVar);
            return C7581n.f20898a;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0053  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x005d  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x001c  */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x0032  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m123575a(bolts.C1592h<java.lang.Integer> r7) {
            /*
                r6 = this;
                long r0 = java.lang.System.currentTimeMillis()
                long r2 = r6.f100521b
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
                boolean r2 = r6.f100522c
                if (r2 != 0) goto L_0x0032
                com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter r2 = r6.f100520a
                com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r2 = com.p280ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter.m123548b(r2)
                java.util.List r2 = r2.mo97721n()
                java.lang.String r3 = "videoEditViewModel.originVideoList"
                kotlin.jvm.internal.C7573i.m23582a(r2, r3)
                com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace r3 = r6.f100523d
                com.ss.android.ugc.aweme.shortvideo.cut.d r7 = com.p280ss.android.ugc.aweme.shortvideo.cut.C38749e.m123749a(r2, r3, r7)
                goto L_0x004d
            L_0x0032:
                com.ss.android.ugc.aweme.shortvideo.cut.e r2 = com.p280ss.android.ugc.aweme.shortvideo.cut.C38749e.f100704a
                com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter r3 = r6.f100520a
                com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r3 = com.p280ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter.m123548b(r3)
                java.util.List r3 = r3.mo97721n()
                java.lang.String r4 = "videoEditViewModel.originVideoList"
                kotlin.jvm.internal.C7573i.m23582a(r3, r4)
                com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace r4 = r6.f100523d
                com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter r5 = r6.f100520a
                float r5 = r5.f100500d
                com.ss.android.ugc.aweme.shortvideo.cut.d r7 = r2.mo96833a(r3, r4, r7, r5)
            L_0x004d:
                com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter r2 = r6.f100520a
                com.ss.android.ugc.aweme.shortvideo.a.b r2 = r2.f100503g
                if (r2 == 0) goto L_0x0057
                r3 = 1
                r2.mo38845f(r3)
            L_0x0057:
                com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter r2 = r6.f100520a
                com.ss.android.ugc.aweme.shortvideo.a.b r2 = r2.f100503g
                if (r2 == 0) goto L_0x0061
                r3 = -1
                r2.mo38829c(r3)
            L_0x0061:
                com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter r2 = r6.f100520a
                android.ss.com.vboost.Status r3 = android.p013ss.com.vboost.Status.BEGIN
                r2.mo96736a(r3)
                com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter r2 = r6.f100520a
                com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.k r2 = r2.f100507k
                com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter$c$1 r3 = new com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter$c$1
                r3.<init>(r6, r0, r7)
                com.ss.android.vesdk.VEListener$k r3 = (com.p280ss.android.vesdk.VEListener.C45215k) r3
                r2.mo97517a(r7, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter.C38681c.m123575a(bolts.h):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter$d */
    static final class C38686d<TTaskResult, TContinuationResult> implements C1591g<TResult, TContinuationResult> {

        /* renamed from: a */
        final /* synthetic */ VECutVideoPresenter f100536a;

        /* renamed from: b */
        final /* synthetic */ long f100537b;

        /* renamed from: c */
        final /* synthetic */ String f100538c;

        /* renamed from: d */
        final /* synthetic */ C38747c f100539d;

        C38686d(VECutVideoPresenter vECutVideoPresenter, long j, String str, C38747c cVar) {
            this.f100536a = vECutVideoPresenter;
            this.f100537b = j;
            this.f100538c = str;
            this.f100539d = cVar;
        }

        public final /* synthetic */ Object then(C1592h hVar) {
            m123579a(hVar);
            return C7581n.f20898a;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x005e  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0054  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m123579a(bolts.C1592h<java.lang.Integer> r22) {
            /*
                r21 = this;
                r0 = r21
                long r1 = java.lang.System.currentTimeMillis()
                long r3 = r0.f100537b
                long r1 = r1 - r3
                com.ss.android.ugc.aweme.shortvideo.cut.d r15 = new com.ss.android.ugc.aweme.shortvideo.cut.d
                com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter r3 = r0.f100536a
                com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r3 = com.p280ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter.m123548b(r3)
                java.util.List r4 = r3.mo97721n()
                java.lang.String r3 = "videoEditViewModel.originVideoList"
                kotlin.jvm.internal.C7573i.m23582a(r4, r3)
                java.lang.String r5 = r0.f100538c
                if (r22 == 0) goto L_0x002c
                java.lang.Object r3 = r22.mo6890e()
                java.lang.Integer r3 = (java.lang.Integer) r3
                if (r3 == 0) goto L_0x002c
                int r3 = r3.intValue()
                r9 = r3
                goto L_0x0030
            L_0x002c:
                r3 = 30
                r9 = 30
            L_0x0030:
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r16 = 0
                r17 = 0
                r18 = 8128(0x1fc0, float:1.139E-41)
                r19 = 0
                r6 = 0
                r7 = -1
                r8 = -1
                r3 = r15
                r20 = r15
                r15 = r16
                r16 = r17
                r17 = r18
                r18 = r19
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter r3 = r0.f100536a
                com.ss.android.ugc.aweme.shortvideo.a.b r3 = r3.f100503g
                if (r3 == 0) goto L_0x0058
                r4 = 1
                r3.mo38845f(r4)
            L_0x0058:
                com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter r3 = r0.f100536a
                com.ss.android.ugc.aweme.shortvideo.a.b r3 = r3.f100503g
                if (r3 == 0) goto L_0x0062
                r4 = -1
                r3.mo38829c(r4)
            L_0x0062:
                com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter r3 = r0.f100536a
                android.ss.com.vboost.Status r4 = android.p013ss.com.vboost.Status.BEGIN
                r3.mo96736a(r4)
                com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter r3 = r0.f100536a
                com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.k r3 = r3.f100507k
                com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter$d$1 r4 = new com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter$d$1
                r5 = r20
                r4.<init>(r0, r1, r5)
                com.ss.android.vesdk.VEListener$k r4 = (com.p280ss.android.vesdk.VEListener.C45215k) r4
                r3.mo97517a(r5, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter.C38686d.m123579a(bolts.h):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter$e */
    static final class C38691e extends Lambda implements C7562b<long[], List<? extends VideoSegment>> {

        /* renamed from: a */
        final /* synthetic */ VECutVideoPresenter f100551a;

        C38691e(VECutVideoPresenter vECutVideoPresenter) {
            this.f100551a = vECutVideoPresenter;
            super(1);
        }

        /* renamed from: a */
        public final List<VideoSegment> invoke(long[] jArr) {
            long[] jArr2 = jArr;
            C7573i.m23587b(jArr2, "targetBoundary");
            if (this.f100551a.f100509m.mo96710s() == 0 || (C39182e.f101552a.mo97470h() && this.f100551a.f100499c)) {
                jArr2[0] = -1;
                jArr2[1] = -1;
                List n = VECutVideoPresenter.m123548b(this.f100551a).mo97721n();
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
            C0902i u = this.f100551a.f100509m.mo96712u();
            Long l = (Long) u.f3154a;
            if (l == null) {
                l = Long.valueOf(0);
            }
            C7573i.m23582a((Object) l, "boundary.first ?: 0");
            long longValue = l.longValue();
            Long l2 = (Long) u.f3155b;
            if (l2 == null) {
                l2 = Long.valueOf(this.f100551a.f100509m.mo96711t());
            }
            C7573i.m23582a((Object) l2, "boundary.second ?: viewProvider.maxDuration()");
            long longValue2 = l2.longValue();
            List n2 = VECutVideoPresenter.m123548b(this.f100551a).mo97721n();
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

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter$f */
    static final class C38692f<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ VECutVideoPresenter f100552a;

        C38692f(VECutVideoPresenter vECutVideoPresenter) {
            this.f100552a = vECutVideoPresenter;
        }

        public final /* synthetic */ Object call() {
            return Integer.valueOf(m123584a());
        }

        /* renamed from: a */
        private int m123584a() {
            List<VideoSegment> n = VECutVideoPresenter.m123548b(this.f100552a).mo97721n();
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

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter$g */
    static final class C38693g implements C45329l {

        /* renamed from: a */
        final /* synthetic */ VECutVideoPresenter f100553a;

        C38693g(VECutVideoPresenter vECutVideoPresenter) {
            this.f100553a = vECutVideoPresenter;
        }

        public final void onCallback(int i, int i2, float f, String str) {
            if (i == 4101) {
                VECutVideoPresenter.m123546a((C7561a<C7581n>) new C7561a<C7581n>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C38693g f100554a;

                    {
                        this.f100554a = r1;
                    }

                    public final /* synthetic */ Object invoke() {
                        m123585a();
                        return C7581n.f20898a;
                    }

                    /* renamed from: a */
                    private void m123585a() {
                        VECutVideoPresenter.m123538a(this.f100554a.f100553a).mo97802a(new C39293a(1, false));
                    }
                });
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter$h */
    static final class C38695h implements C45219o {

        /* renamed from: a */
        final /* synthetic */ VECutVideoPresenter f100555a;

        C38695h(VECutVideoPresenter vECutVideoPresenter) {
            this.f100555a = vECutVideoPresenter;
        }

        /* renamed from: a */
        public final void mo38884a() {
            VECutVideoPresenter.m123546a((C7561a<C7581n>) new C7561a<C7581n>(this) {

                /* renamed from: a */
                final /* synthetic */ C38695h f100556a;

                {
                    this.f100556a = r1;
                }

                public final /* synthetic */ Object invoke() {
                    m123587a();
                    return C7581n.f20898a;
                }

                /* renamed from: a */
                private void m123587a() {
                    if (this.f100556a.f100555a.f100498b) {
                        this.f100556a.f100555a.f100509m.mo96709r();
                        this.f100556a.f100555a.f100498b = false;
                    }
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter$i */
    static final class C38697i extends Lambda implements C7561a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ VECutVideoPresenter f100557a;

        C38697i(VECutVideoPresenter vECutVideoPresenter) {
            this.f100557a = vECutVideoPresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(mo96754a());
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
        public final boolean mo96754a() {
            /*
                r13 = this;
                com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter r0 = r13.f100557a
                com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r0 = com.p280ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter.m123548b(r0)
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
                com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter r0 = r13.f100557a
                r1 = -11009(0xffffffffffffd4ff, float:NaN)
                r0.f100497a = r1
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
                com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter r6 = r13.f100557a     // Catch:{ Exception -> 0x00f4 }
                if (r5 != 0) goto L_0x00ee
                r7 = -11004(0xffffffffffffd504, float:NaN)
                goto L_0x00ef
            L_0x00ee:
                r7 = 0
            L_0x00ef:
                r6.f100497a = r7     // Catch:{ Exception -> 0x00f4 }
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
                com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter r0 = r13.f100557a
                r1 = -11005(0xffffffffffffd503, float:NaN)
                r0.f100497a = r1
                return r2
            L_0x0107:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter.C38697i.mo96754a():boolean");
        }
    }

    /* renamed from: a */
    private static boolean m123547a(int i, int i2, int i3) {
        if (i > i2) {
            int i4 = i2;
            i2 = i;
            i = i4;
        }
        return (i < 1080 && i2 < 1920) || (i <= 1080 && i2 <= 1920 && i3 < 35);
    }

    /* renamed from: a */
    public final long mo96731a() {
        C38772i iVar = this.f100502f;
        if (iVar != null) {
            return iVar.mo96864c();
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo96737a(FragmentActivity fragmentActivity) {
        C7573i.m23587b(fragmentActivity, "activity");
        C0063u a = C0069x.m159a(fragmentActivity).mo147a(CutMultiVideoViewModel.class);
        C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…deoViewModel::class.java]");
        this.f100513q = (CutMultiVideoViewModel) a;
        C0063u a2 = C0069x.m159a(fragmentActivity).mo147a(VEVideoCutterViewModel.class);
        C7573i.m23582a((Object) a2, "ViewModelProviders.of(ac…terViewModel::class.java]");
        this.f100505i = (VEVideoCutterViewModel) a2;
        C0063u a3 = C0069x.m159a(fragmentActivity).mo147a(VideoEditViewModel.class);
        C7573i.m23582a((Object) a3, "ViewModelProviders.of(ac…ditViewModel::class.java]");
        this.f100506j = (VideoEditViewModel) a3;
        this.f100516t = C7573i.m23585a((Object) "from_chat", (Object) fragmentActivity.getIntent().getStringExtra("enter_from"));
        m123553g();
    }

    /* renamed from: a */
    public final void mo96735a(int i, int i2) {
        C39210k kVar = this.f100507k;
        VideoEditViewModel videoEditViewModel = this.f100506j;
        if (videoEditViewModel == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        kVar.mo97515a(i, i2, videoEditViewModel.mo97721n());
    }

    /* renamed from: a */
    public final void mo96733a(int i) {
        VideoEditViewModel videoEditViewModel = this.f100506j;
        if (videoEditViewModel == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        VideoSegment e = videoEditViewModel.mo97711e(i);
        if (e != null) {
            this.f100507k.mo97516a(i, e);
            this.f100514r.mo99948a(e);
        }
    }

    /* renamed from: a */
    public final void mo96745a(boolean z, boolean z2) {
        C39210k kVar = this.f100507k;
        VideoEditViewModel videoEditViewModel = this.f100506j;
        if (videoEditViewModel == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        kVar.mo97520a(z, z2, videoEditViewModel.mo97721n());
    }

    /* renamed from: a */
    public final void mo96742a(List<? extends VideoSegment> list, int i) {
        C0902i u = this.f100509m.mo96712u();
        Long l = (Long) u.f3154a;
        if (l == null) {
            l = Long.valueOf(0);
        }
        C7573i.m23582a((Object) l, "boundary.first ?: 0");
        long longValue = l.longValue();
        Long l2 = (Long) u.f3155b;
        if (l2 == null) {
            l2 = Long.valueOf(this.f100509m.mo96711t());
        }
        C7573i.m23582a((Object) l2, "boundary.second ?: viewProvider.maxDuration()");
        this.f100507k.mo97518a(list, i, longValue, l2.longValue());
    }

    /* renamed from: a */
    public final void mo96743a(List<? extends VideoSegment> list, boolean z) {
        this.f100507k.mo97519a(list, z);
        this.f100514r.mo99950a(list);
    }

    /* renamed from: a */
    public final void mo96738a(C0902i<Long, Long> iVar) {
        long j;
        C7573i.m23587b(iVar, "boundary");
        long t = this.f100509m.mo96711t();
        if (iVar.f3154a != null) {
            F f = iVar.f3154a;
            if (f == null) {
                C7573i.m23580a();
            }
            j = ((Number) f).longValue();
        } else {
            j = 0;
        }
        if (iVar.f3155b != null) {
            S s = iVar.f3155b;
            if (s == null) {
                C7573i.m23580a();
            }
            t = ((Number) s).longValue();
        }
        this.f100507k.mo97514a((int) j, (int) t);
    }

    /* renamed from: a */
    public final void mo96744a(boolean z) {
        this.f100499c = z;
        this.f100507k.f101625c = z;
        C38772i iVar = this.f100502f;
        if (iVar != null) {
            iVar.mo96866d(z);
        }
        this.f100514r.f104453b = z;
    }

    /* renamed from: a */
    public final void mo96736a(Status status) {
        if (this.f100515s) {
            C0173d.m477b().mo370a(C0166a.f384g, status);
        }
    }

    /* renamed from: a */
    public final void mo96741a(String str, C38747c cVar) {
        C7573i.m23587b(str, "outputPath");
        C7573i.m23587b(cVar, "listener");
        if (!this.f100512p) {
            C41530am.m132280a("VECutVideo,return compile because of editor not init");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        C38772i iVar = this.f100502f;
        this.f100511o = iVar != null ? iVar.mo96867d() : false;
        VEVideoCutterViewModel vEVideoCutterViewModel = this.f100505i;
        if (vEVideoCutterViewModel == null) {
            C7573i.m23583a("veVideoCutterViewModel");
        }
        vEVideoCutterViewModel.mo97802a(new C39293a(2, true));
        C38772i iVar2 = this.f100502f;
        this.f100510n = iVar2 != null ? iVar2.mo96859a() : 0;
        cVar.mo96718a(false);
        C41530am.m132280a("VECutVideo,using normalImport strategy");
        C1592h h = m123554h();
        C38686d dVar = new C38686d(this, currentTimeMillis, str, cVar);
        h.mo6875a((C1591g<TResult, TContinuationResult>) dVar);
    }

    /* renamed from: a */
    public final void mo96739a(Workspace workspace, boolean z, boolean z2, C38747c cVar) {
        C7573i.m23587b(workspace, "workspace");
        C7573i.m23587b(cVar, "listener");
        if (!this.f100512p) {
            C41530am.m132280a("VECutVideo,return compile because of editor not init");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        C38772i iVar = this.f100502f;
        this.f100511o = iVar != null ? iVar.mo96867d() : false;
        VEVideoCutterViewModel vEVideoCutterViewModel = this.f100505i;
        if (vEVideoCutterViewModel == null) {
            C7573i.m23583a("veVideoCutterViewModel");
        }
        vEVideoCutterViewModel.mo97802a(new C39293a(2, true));
        C38772i iVar2 = this.f100502f;
        this.f100510n = iVar2 != null ? iVar2.mo96859a() : 0;
        if (m123549b(z2, z)) {
            cVar.mo96718a(true);
            C41530am.m132280a("VECutVideo,using fastImport strategy");
            cVar.onCompileDone();
            if (m123550d()) {
                m123551e();
            } else {
                destroy();
            }
        } else {
            cVar.mo96718a(false);
            C41530am.m132280a("VECutVideo,using normalImport strategy");
            C1592h h = m123554h();
            C38681c cVar2 = new C38681c(this, currentTimeMillis, z, workspace, cVar);
            h.mo6875a((C1591g<TResult, TContinuationResult>) cVar2);
        }
    }

    /* renamed from: a */
    public final Intent mo96732a(Workspace workspace, boolean z) {
        Intent intent = new Intent();
        intent.putExtra("workspace", workspace);
        if (workspace != null) {
            String str = "extra_edit_preview_info";
            EditPreviewInfo a = m123539a(z, workspace);
            if (a != null) {
                intent.putExtra(str, a);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.os.Parcelable");
            }
        }
        intent.putExtra("extra_av_is_fast_import", z);
        intent.putExtra("extra_fast_import_error_code", this.f100497a);
        intent.putExtra("extra_av_enable_fast_import_resolution", C38793q.f100815a.mo96930a());
        if (m123550d() && z) {
            C38420b bVar = this.f100503g;
            VECutVideoFragment.f100416u = bVar != null ? bVar.mo38822b() : -1;
            String str2 = "extra_editor_model";
            C38420b bVar2 = this.f100503g;
            intent.putExtra(str2, bVar2 != null ? bVar2.mo38867o() : null);
        }
        return intent;
    }

    /* renamed from: a */
    public final boolean mo96746a(VideoSegment videoSegment) {
        if (videoSegment != null) {
            return m123547a(videoSegment.f100765g, videoSegment.f100766h, videoSegment.mo96902c());
        }
        return false;
    }

    /* renamed from: a */
    public static void m123546a(C7561a<C7581n> aVar) {
        C1592h.m7855a((Callable<TResult>) new C38680b<TResult>(aVar), C1592h.f5958b);
    }

    /* renamed from: a */
    public final void mo96740a(VideoSegment videoSegment, long j, long j2) {
        this.f100514r.mo99949a(videoSegment, j, j2);
    }

    /* renamed from: c */
    public final boolean mo96748c() {
        C38772i iVar = this.f100502f;
        if (iVar != null) {
            return iVar.mo96862b();
        }
        return false;
    }

    @C0054q(mo125a = Event.ON_START)
    public final void performInit() {
        if (!m123552f()) {
            this.f100509m.mo96707p();
        }
    }

    /* renamed from: e */
    private final void m123551e() {
        C38420b bVar = this.f100503g;
        if (bVar != null) {
            bVar.mo38871q();
        }
        C38420b bVar2 = this.f100503g;
        if (bVar2 != null) {
            bVar2.mo38875s();
        }
        this.f100512p = false;
    }

    /* renamed from: h */
    private final C1592h<Integer> m123554h() {
        C1592h<Integer> a = C1592h.m7853a((Callable<TResult>) new C38692f<TResult>(this));
        C7573i.m23582a((Object) a, "Task.callInBackground {\n…s\n            }\n        }");
        return a;
    }

    /* renamed from: b */
    public final long mo96747b() {
        C38772i iVar = this.f100502f;
        if (iVar != null) {
            return iVar.mo96859a();
        }
        return 0;
    }

    /* renamed from: d */
    private final boolean m123550d() {
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            Boolean enableReuseEditorForFastimport = a.getEnableReuseEditorForFastimport();
            C7573i.m23582a((Object) enableReuseEditorForFastimport, "SettingsReader.get().ena…eReuseEditorForFastimport");
            if (!enableReuseEditorForFastimport.booleanValue() || this.f100509m.mo96710s() != 0 || this.f100516t) {
                return false;
            }
            return true;
        } catch (NullValueException unused) {
            return false;
        }
    }

    /* renamed from: g */
    private final void m123553g() {
        this.f100509m.mo96705o().getLifecycle().mo55a(this);
        VEVideoCutterViewModel vEVideoCutterViewModel = this.f100505i;
        if (vEVideoCutterViewModel == null) {
            C7573i.m23583a("veVideoCutterViewModel");
        }
        vEVideoCutterViewModel.mo97801a().observe(this.f100509m.mo96705o(), new C38679a(this));
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public final void destroy() {
        if (this.f100512p) {
            this.f100512p = false;
            C38420b bVar = this.f100503g;
            if (bVar != null) {
                bVar.mo38876t();
            }
            C38776l lVar = this.f100509m;
            if (lVar != null) {
                lVar.mo96708q();
            }
            if (this.f100502f != null) {
                if (this.f100502f == null) {
                    C7573i.m23580a();
                }
                this.f100502f = null;
            }
        }
    }

    /* renamed from: f */
    private final boolean m123552f() {
        int i;
        boolean z;
        int i2;
        if (this.f100512p) {
            return true;
        }
        VideoEditViewModel videoEditViewModel = this.f100506j;
        if (videoEditViewModel == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        C0052o<CutVideoContext> oVar = videoEditViewModel.f101855t;
        C7573i.m23582a((Object) oVar, "videoEditViewModel.cutVideoContext");
        if (oVar.getValue() == null) {
            C41530am.m132283b("VECutVideoPresenter,init error because of null cutVideoContext");
            return false;
        }
        VideoEditViewModel videoEditViewModel2 = this.f100506j;
        if (videoEditViewModel2 == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        List n = videoEditViewModel2.mo97721n();
        if (n != null) {
            i = n.size();
        } else {
            i = 0;
        }
        if (i == 0) {
            return false;
        }
        this.f100512p = true;
        C38420b bVar = new C38420b(this.f100517u, this.f100509m.mo96766K());
        VECutVideoPresenter vECutVideoPresenter = this;
        if (vECutVideoPresenter.f100504h == null) {
            this.f100504h = new C38693g(this);
        }
        C45329l lVar = this.f100504h;
        if (lVar == null) {
            C7573i.m23583a("infoCallback");
        }
        bVar.mo38824b(lVar);
        bVar.mo38773a(SCALE_MODE.SCALE_MODE_CENTER_INSIDE);
        bVar.mo38832c(true);
        if (vECutVideoPresenter.f100508l == null) {
            this.f100508l = new C38695h(this);
        }
        C45219o oVar2 = this.f100508l;
        if (oVar2 == null) {
            C7573i.m23583a("firstFrameListener");
        }
        bVar.mo38800a(oVar2);
        this.f100503g = bVar;
        List arrayList = new ArrayList();
        int[] iArr = new int[i];
        int[] iArr2 = new int[i];
        float[] fArr = new float[i];
        int[] iArr3 = new int[i];
        m123545a(n, arrayList, iArr, iArr2, fArr, iArr3);
        Collection collection = arrayList;
        Object[] array = collection.toArray(new String[0]);
        if (array != null) {
            C45255af afVar = new C45255af((String[]) array);
            C38420b bVar2 = this.f100503g;
            if (bVar2 == null) {
                C7573i.m23580a();
            }
            C38789o oVar3 = new C38789o(bVar2, afVar);
            C38420b bVar3 = this.f100503g;
            if (bVar3 == null) {
                C7573i.m23580a();
            }
            C39144d dVar = new C39144d(bVar3, afVar);
            this.f100507k.f101623a = oVar3;
            this.f100507k.f101624b = dVar;
            this.f100514r.f104452a = this.f100503g;
            Context n2 = this.f100509m.mo96704n();
            C38420b bVar4 = this.f100503g;
            if (bVar4 == null) {
                C7573i.m23580a();
            }
            this.f100502f = new C38791p(n2, bVar4, this.f100509m.mo96766K(), this.f100509m.mo96705o());
            C38420b bVar5 = this.f100503g;
            if (bVar5 != null) {
                if (!C39182e.f101552a.mo97470h() || arrayList.size() <= 1) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    Object[] array2 = collection.toArray(new String[0]);
                    if (array2 != null) {
                        i2 = bVar5.mo38772a(new C15392g((String[]) array2, VIDEO_RATIO.VIDEO_OUT_RATIO_ORIGINAL));
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
                        i2 = bVar5.mo38772a(fVar);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                }
                if (i2 == 0) {
                    List list = n;
                    C42133c.m134097a(afVar, n, iArr, iArr2, fArr, iArr3);
                    C38420b bVar6 = this.f100503g;
                    if (bVar6 != null) {
                        bVar6.mo38776a(afVar);
                    }
                    this.f100514r.mo99950a(list);
                    bVar5.mo38823b(this.f100501e);
                    bVar5.mo38856j(30);
                    bVar5.mo38803a(0, 1, 0.5f);
                    if (C35563c.f93231M.mo93306b(Property.EnableImportAvSync) != 512) {
                        bVar5.mo38829c(1);
                    } else if (!z || !this.f100499c) {
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
                    C0902i u = this.f100509m.mo96712u();
                    Long l = (Long) u.f3154a;
                    if (l == null) {
                        l = Long.valueOf(0);
                    }
                    C7573i.m23582a((Object) l, "boundary.first ?: 0");
                    long longValue = l.longValue();
                    Long l2 = (Long) u.f3155b;
                    if (l2 == null) {
                        l2 = Long.valueOf(this.f100509m.mo96711t());
                    }
                    C7573i.m23582a((Object) l2, "boundary.second ?: viewProvider.maxDuration()");
                    bVar5.mo38812b((int) longValue, (int) l2.longValue());
                    m123544a(list);
                    if (this.f100511o) {
                        C38772i iVar = this.f100502f;
                        if (iVar != null) {
                            iVar.mo96865c(this.f100511o);
                        }
                        this.f100511o = false;
                    }
                    if (!z || !this.f100499c) {
                        C38772i iVar2 = this.f100502f;
                        if (iVar2 != null) {
                            iVar2.mo96860a(this.f100510n, SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
                        }
                    }
                    this.f100509m.mo96691a(this.f100503g);
                    return true;
                }
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: a */
    public static final /* synthetic */ VEVideoCutterViewModel m123538a(VECutVideoPresenter vECutVideoPresenter) {
        VEVideoCutterViewModel vEVideoCutterViewModel = vECutVideoPresenter.f100505i;
        if (vEVideoCutterViewModel == null) {
            C7573i.m23583a("veVideoCutterViewModel");
        }
        return vEVideoCutterViewModel;
    }

    /* renamed from: b */
    public static final /* synthetic */ VideoEditViewModel m123548b(VECutVideoPresenter vECutVideoPresenter) {
        VideoEditViewModel videoEditViewModel = vECutVideoPresenter.f100506j;
        if (videoEditViewModel == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        return videoEditViewModel;
    }

    /* renamed from: a */
    private final void m123544a(List<? extends VideoSegment> list) {
        if (list != null && (!list.isEmpty())) {
            VideoSegment videoSegment = (VideoSegment) list.get(0);
            if (this.f100509m.mo96710s() == 0 && videoSegment.f100769k > 0) {
                this.f100507k.mo97521a((float) videoSegment.f100769k, videoSegment.f100770l, videoSegment.f100771m, 0, 0);
            }
        }
    }

    /* renamed from: a */
    public final void mo96734a(int i, float f) {
        this.f100507k.mo97523b(i, f);
    }

    /* renamed from: b */
    private final boolean m123549b(boolean z, boolean z2) {
        C38697i iVar = new C38697i(this);
        if (z) {
            this.f100497a = -11008;
            return false;
        } else if (z2) {
            return false;
        } else {
            if (!C35563c.f93231M.mo93305a(Property.EnableVEFastImport)) {
                this.f100497a = -2;
                return false;
            } else if (this.f100509m.mo96710s() == 0) {
                return iVar.mo96754a();
            } else {
                if (C35563c.f93231M.mo93305a(Property.EnableMultiFastImport)) {
                    return iVar.mo96754a();
                }
                this.f100497a = -11007;
                return false;
            }
        }
    }

    public VECutVideoPresenter(String str, C38776l lVar) {
        C7573i.m23587b(str, "workspace");
        C7573i.m23587b(lVar, "viewProvider");
        this.f100517u = str;
        this.f100509m = lVar;
    }

    /* renamed from: a */
    private final EditPreviewInfo m123539a(boolean z, Workspace workspace) {
        C38691e eVar = new C38691e(this);
        if (z) {
            this.f100509m.mo96713v();
            List arrayList = new ArrayList();
            long[] jArr = new long[2];
            Iterable<VideoSegment> a = eVar.invoke(jArr);
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
            long j = jArr2[0];
            long j2 = jArr2[1];
            if (j >= 0) {
                VideoCutInfo videoCutInfo = ((EditVideoSegment) arrayList.get(0)).getVideoCutInfo();
                if (videoCutInfo != null) {
                    EditVideoSegment editVideoSegment = (EditVideoSegment) arrayList.get(0);
                    VideoCutInfo videoCutInfo2 = new VideoCutInfo(videoCutInfo.getStart() + j, videoCutInfo.getEnd(), videoCutInfo.getSpeed(), videoCutInfo.getRotate());
                    arrayList.set(0, EditVideoSegment.copy$default(editVideoSegment, null, null, null, videoCutInfo2, 7, null));
                }
            }
            if (j2 >= 0) {
                VideoCutInfo videoCutInfo3 = ((EditVideoSegment) arrayList.get(arrayList.size() - 1)).getVideoCutInfo();
                if (videoCutInfo3 != null) {
                    int size = arrayList.size() - 1;
                    EditVideoSegment editVideoSegment2 = (EditVideoSegment) arrayList.get(arrayList.size() - 1);
                    VideoCutInfo videoCutInfo4 = new VideoCutInfo(videoCutInfo3.getStart(), videoCutInfo3.getEnd() - j2, videoCutInfo3.getSpeed(), videoCutInfo3.getRotate());
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
        C39695d dVar = new C39695d(0, 0, 0, 0, 15, null);
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
        return dVar.mo99058a(new EditVideoSegment(path, path2, C39526e.m126246a(path3)));
    }

    /* renamed from: a */
    public static void m123541a(int i, long j, long j2, C38748d dVar, int i2, String str) {
        C6893q.m21444a("av_ve_import_compile", i, C42131a.m134091a(C7507ae.m23393a((Pair<? extends K, ? extends V>[]) new Pair[]{C7579l.m23633a("fps_time", String.valueOf(j)), C7579l.m23633a("compile_time", String.valueOf(j2)), C7579l.m23633a("is_hard_encode", String.valueOf(dVar.f100697g)), C7579l.m23633a("fps", String.valueOf(dVar.f100696f)), C7579l.m23633a("errorCode", String.valueOf(i2)), C7579l.m23633a("error_message", str)})));
    }

    /* renamed from: a */
    private final void m123545a(List<? extends VideoSegment> list, List<String> list2, int[] iArr, int[] iArr2, float[] fArr, int[] iArr3) {
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
                if (this.f100509m.mo96710s() == 0) {
                    iArr[0] = 0;
                    iArr2[0] = (int) ((VideoSegment) list.get(0)).f100761c;
                    iArr3[0] = 0;
                }
            }
        }
    }

    /* renamed from: a */
    private void m123540a(int i, float f, boolean z, float f2, float f3, int i2, int i3) {
        this.f100500d = f;
        if (z) {
            this.f100507k.mo97521a(f, f2, f3, i2, i3);
        } else {
            this.f100507k.mo97522a(i, f);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m123542a(VECutVideoPresenter vECutVideoPresenter, int i, float f, boolean z, float f2, float f3, int i2, int i3, int i4, Object obj) {
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
        vECutVideoPresenter.m123540a(i, f, z2, f4, f5, i5, i6);
    }
}
