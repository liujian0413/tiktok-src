package com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint;

import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.apm.util.C6292i;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.cut.C38789o.C38790a;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.StickPointVideoSegment;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p1556c.C39170h;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C40173d;
import com.p280ss.android.ugc.aweme.tools.RecordingSpeed;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.vesdk.VEEditor.SEEK_MODE;
import com.p280ss.android.vesdk.VEEditor.VEState;
import com.p280ss.android.vesdk.clipparam.VEAlgorithmPath;
import com.p280ss.android.vesdk.clipparam.VEClipAlgorithmParam;
import com.p280ss.android.vesdk.clipparam.VEClipSourceParam;
import com.p280ss.android.vesdk.clipparam.VEClipTimelineParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.i */
public final class C39195i {

    /* renamed from: g */
    public static final C39197a f101583g = new C39197a(null);

    /* renamed from: a */
    public C15389d f101584a;

    /* renamed from: b */
    public AVMusic f101585b;

    /* renamed from: c */
    public C39198b f101586c;

    /* renamed from: d */
    public int f101587d = -1;

    /* renamed from: e */
    public int f101588e;

    /* renamed from: f */
    public final C39106a f101589f = new C39106a();

    /* renamed from: h */
    private final HashMap<String, List<StickPointVideoSegment>> f101590h = new HashMap<>();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.i$a */
    public static final class C39197a {
        private C39197a() {
        }

        public /* synthetic */ C39197a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.i$b */
    public interface C39198b {
        /* renamed from: a */
        void mo97289a(int i);

        /* renamed from: a */
        boolean mo97290a();

        /* renamed from: b */
        List<VideoSegment> mo97291b();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.i$c */
    static final class C39199c<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C39195i f101592a;

        /* renamed from: b */
        final /* synthetic */ int f101593b;

        /* renamed from: c */
        final /* synthetic */ List f101594c;

        C39199c(C39195i iVar, int i, List list) {
            this.f101592a = iVar;
            this.f101593b = i;
            this.f101594c = list;
        }

        public final /* synthetic */ Object call() {
            return Integer.valueOf(m125186a());
        }

        /* renamed from: a */
        private int m125186a() {
            int i = this.f101593b;
            List list = this.f101594c;
            if (list == null) {
                C7573i.m23580a();
            }
            int size = i - list.size();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (VideoSegment videoSegment : this.f101594c) {
                VEClipSourceParam vEClipSourceParam = new VEClipSourceParam();
                vEClipSourceParam.clipFilePath = videoSegment.mo96896a(false);
                vEClipSourceParam.clipWidth = videoSegment.f100765g;
                vEClipSourceParam.clipHeight = videoSegment.f100766h;
                arrayList.add(vEClipSourceParam);
                VEClipTimelineParam vEClipTimelineParam = new VEClipTimelineParam();
                vEClipTimelineParam.speed = (double) RecordingSpeed.NORMAL.value();
                vEClipTimelineParam.trimIn = 0;
                vEClipTimelineParam.trimOut = (int) videoSegment.f100761c;
                arrayList2.add(vEClipTimelineParam);
            }
            C15389d dVar = this.f101592a.f101584a;
            if (dVar == null) {
                C7573i.m23580a();
            }
            int a = dVar.mo38760a(0, size, arrayList, arrayList2);
            if (a < 0) {
                return a;
            }
            C15389d dVar2 = this.f101592a.f101584a;
            if (dVar2 == null) {
                C7573i.m23580a();
            }
            int C = dVar2.mo38746C();
            if (C < 0) {
                return C;
            }
            C15389d dVar3 = this.f101592a.f101584a;
            if (dVar3 == null) {
                C7573i.m23580a();
            }
            return dVar3.mo38744A();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.i$d */
    static final class C39200d<TTaskResult, TContinuationResult> implements C1591g<Integer, Object> {

        /* renamed from: a */
        final /* synthetic */ C39195i f101595a;

        /* renamed from: b */
        final /* synthetic */ C39170h f101596b;

        /* renamed from: c */
        final /* synthetic */ int f101597c;

        /* renamed from: d */
        final /* synthetic */ List f101598d;

        C39200d(C39195i iVar, C39170h hVar, int i, List list) {
            this.f101595a = iVar;
            this.f101596b = hVar;
            this.f101597c = i;
            this.f101598d = list;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(C1592h<Integer> hVar) {
            if (hVar == null || hVar.mo6890e() == null) {
                C39170h hVar2 = this.f101596b;
                if (hVar2 != null) {
                    hVar2.mo97007a();
                }
            } else if (((Number) hVar.mo6890e()).intValue() == 0) {
                int i = this.f101597c;
                List list = this.f101598d;
                if (list == null) {
                    C7573i.m23580a();
                }
                this.f101595a.mo97492a(1, i - list.size());
                C39170h hVar3 = this.f101596b;
                if (hVar3 != null) {
                    hVar3.mo97008a(((Number) hVar.mo6890e()).intValue());
                }
            } else {
                C39170h hVar4 = this.f101596b;
                if (hVar4 != null) {
                    hVar4.mo97007a();
                }
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.i$e */
    public static final class C39201e implements C39170h {

        /* renamed from: a */
        final /* synthetic */ C39195i f101599a;

        /* renamed from: b */
        final /* synthetic */ C39170h f101600b;

        /* renamed from: c */
        final /* synthetic */ int f101601c;

        /* renamed from: a */
        public final void mo97007a() {
            C39170h hVar = this.f101600b;
            if (hVar != null) {
                hVar.mo97007a();
            }
        }

        /* renamed from: a */
        public final void mo97008a(int i) {
            this.f101599a.mo97495a(this.f101599a.f101585b, this.f101601c, this.f101600b);
        }

        C39201e(C39195i iVar, C39170h hVar, int i) {
            this.f101599a = iVar;
            this.f101600b = hVar;
            this.f101601c = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.i$f */
    static final class C39202f<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C39195i f101602a;

        /* renamed from: b */
        final /* synthetic */ String f101603b;

        /* renamed from: c */
        final /* synthetic */ VEAlgorithmPath f101604c;

        /* renamed from: d */
        final /* synthetic */ int f101605d;

        C39202f(C39195i iVar, String str, VEAlgorithmPath vEAlgorithmPath, int i) {
            this.f101602a = iVar;
            this.f101603b = str;
            this.f101604c = vEAlgorithmPath;
            this.f101605d = i;
        }

        public final /* synthetic */ Object call() {
            return Integer.valueOf(m125190a());
        }

        /* renamed from: a */
        private int m125190a() {
            int a = this.f101602a.f101589f.mo97367a(this.f101603b, this.f101604c);
            if ((this.f101605d != 2 && this.f101605d != 4) || a < 0) {
                return a;
            }
            C15389d dVar = this.f101602a.f101584a;
            if (dVar == null) {
                C7573i.m23580a();
            }
            return dVar.mo38744A();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.i$g */
    static final class C39203g<TTaskResult, TContinuationResult> implements C1591g<Integer, Object> {

        /* renamed from: a */
        final /* synthetic */ C39170h f101606a;

        C39203g(C39170h hVar) {
            this.f101606a = hVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(C1592h<Integer> hVar) {
            if (hVar == null || hVar.mo6890e() == null || C7573i.m23576a(((Number) hVar.mo6890e()).intValue(), 0) < 0) {
                C39170h hVar2 = this.f101606a;
                if (hVar2 != null) {
                    hVar2.mo97007a();
                }
            } else {
                C39170h hVar3 = this.f101606a;
                if (hVar3 != null) {
                    Object e = hVar.mo6890e();
                    C7573i.m23582a(e, "it.result");
                    hVar3.mo97008a(((Number) e).intValue());
                }
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.i$h */
    public static final class C39204h implements C39170h {

        /* renamed from: a */
        final /* synthetic */ C39195i f101607a;

        /* renamed from: b */
        final /* synthetic */ C39170h f101608b;

        /* renamed from: c */
        final /* synthetic */ int f101609c;

        /* renamed from: a */
        public final void mo97007a() {
            this.f101607a.f101587d = -1;
            C39170h hVar = this.f101608b;
            if (hVar != null) {
                hVar.mo97007a();
            }
        }

        /* renamed from: a */
        public final void mo97008a(int i) {
            this.f101607a.f101587d = i;
            if (!C39195i.m125157a(this.f101609c)) {
                this.f101607a.mo97492a(this.f101609c, -1);
            } else {
                if (this.f101607a.f101586c != null) {
                    C39198b bVar = this.f101607a.f101586c;
                    if (bVar == null) {
                        C7573i.m23580a();
                    }
                    bVar.mo97289a(this.f101609c);
                }
                this.f101607a.mo97494a(this.f101607a.mo97501b(this.f101607a.f101588e));
            }
            C39170h hVar = this.f101608b;
            if (hVar != null) {
                hVar.mo97008a(this.f101607a.f101587d);
            }
        }

        C39204h(C39195i iVar, C39170h hVar, int i) {
            this.f101607a = iVar;
            this.f101608b = hVar;
            this.f101609c = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.i$i */
    static final class C39205i<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C39195i f101610a;

        /* renamed from: b */
        final /* synthetic */ int f101611b;

        /* renamed from: c */
        final /* synthetic */ int f101612c;

        C39205i(C39195i iVar, int i, int i2) {
            this.f101610a = iVar;
            this.f101611b = i;
            this.f101612c = i2;
        }

        public final /* synthetic */ Object call() {
            return Integer.valueOf(m125194a());
        }

        /* renamed from: a */
        private int m125194a() {
            C15389d dVar = this.f101610a.f101584a;
            if (dVar == null) {
                C7573i.m23580a();
            }
            int a = dVar.mo38750a(0, this.f101611b, this.f101612c);
            if (a < 0) {
                return a;
            }
            C15389d dVar2 = this.f101610a.f101584a;
            if (dVar2 == null) {
                C7573i.m23580a();
            }
            int C = dVar2.mo38746C();
            if (C < 0) {
                return C;
            }
            C15389d dVar3 = this.f101610a.f101584a;
            if (dVar3 == null) {
                C7573i.m23580a();
            }
            return dVar3.mo38744A();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.i$j */
    static final class C39206j<TTaskResult, TContinuationResult> implements C1591g<Integer, Object> {

        /* renamed from: a */
        final /* synthetic */ C39195i f101613a;

        /* renamed from: b */
        final /* synthetic */ C39170h f101614b;

        /* renamed from: c */
        final /* synthetic */ int f101615c;

        C39206j(C39195i iVar, C39170h hVar, int i) {
            this.f101613a = iVar;
            this.f101614b = hVar;
            this.f101615c = i;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(C1592h<Integer> hVar) {
            if (hVar == null || hVar.mo6890e() == null) {
                C39170h hVar2 = this.f101614b;
                if (hVar2 != null) {
                    hVar2.mo97007a();
                }
            } else {
                Integer num = (Integer) hVar.mo6890e();
                if (num != null && num.intValue() == 0) {
                    this.f101613a.mo97492a(3, this.f101615c);
                    C39170h hVar3 = this.f101614b;
                    if (hVar3 != null) {
                        Object e = hVar.mo6890e();
                        C7573i.m23582a(e, "it.result");
                        hVar3.mo97008a(((Number) e).intValue());
                    }
                } else {
                    C39170h hVar4 = this.f101614b;
                    if (hVar4 != null) {
                        hVar4.mo97007a();
                    }
                }
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.i$k */
    static final class C39207k<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C39195i f101616a;

        /* renamed from: b */
        final /* synthetic */ boolean f101617b;

        C39207k(C39195i iVar, boolean z) {
            this.f101616a = iVar;
            this.f101617b = z;
        }

        public final /* synthetic */ Object call() {
            return Integer.valueOf(m125196a());
        }

        /* renamed from: a */
        private int m125196a() {
            if (this.f101616a.f101584a == null) {
                return -1;
            }
            C15389d dVar = this.f101616a.f101584a;
            if (dVar == null) {
                C7573i.m23580a();
            }
            int C = dVar.mo38746C();
            if (!this.f101617b || C < 0) {
                return C;
            }
            C15389d dVar2 = this.f101616a.f101584a;
            if (dVar2 == null) {
                C7573i.m23580a();
            }
            return dVar2.mo38744A();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.i$l */
    static final class C39208l<TTaskResult, TContinuationResult> implements C1591g<Integer, Object> {

        /* renamed from: a */
        final /* synthetic */ C39170h f101618a;

        C39208l(C39170h hVar) {
            this.f101618a = hVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(C1592h<Integer> hVar) {
            if (hVar == null || hVar.mo6890e() == null) {
                C39170h hVar2 = this.f101618a;
                if (hVar2 != null) {
                    hVar2.mo97007a();
                }
            } else {
                C39170h hVar3 = this.f101618a;
                if (hVar3 != null) {
                    Object e = hVar.mo6890e();
                    C7573i.m23582a(e, "task.result");
                    hVar3.mo97008a(((Number) e).intValue());
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m125157a(int i) {
        return i == 6 || i == 7;
    }

    /* renamed from: d */
    private static boolean m125158d(int i) {
        return i == 1 || i == 4 || i == 3;
    }

    /* renamed from: a */
    public final boolean mo97500a() {
        if (this.f101584a == null) {
            return false;
        }
        try {
            C15389d dVar = this.f101584a;
            if (dVar == null) {
                C7573i.m23580a();
            }
            if (dVar.mo38850h() == VEState.STARTED) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final void mo97498a(List<? extends VideoSegment> list, int i, C39170h hVar) {
        if (this.f101584a == null) {
            hVar.mo97007a();
        } else if (C6292i.m19525a(list)) {
            hVar.mo97007a();
        } else {
            C1592h.m7853a((Callable<TResult>) new C39199c<TResult>(this, i, list)).mo6876a((C1591g<TResult, TContinuationResult>) new C39200d<TResult,TContinuationResult>(this, hVar, i, list), C1592h.f5958b);
        }
    }

    /* renamed from: a */
    public final void mo97496a(C39170h hVar, boolean z) {
        C1592h.m7859b((Callable<TResult>) new C39207k<TResult>(this, z)).mo6876a((C1591g<TResult, TContinuationResult>) new C39208l<TResult,TContinuationResult>(hVar), C1592h.f5958b);
    }

    /* renamed from: a */
    public final void mo97499a(boolean z, boolean z2, C39170h hVar) {
        m125162l();
        int i = z2 ? 4 : z ? 6 : 7;
        if (z2) {
            mo97496a((C39170h) new C39201e(this, hVar, i), true);
        } else if (z) {
            C39198b bVar = this.f101586c;
            if (bVar == null) {
                C7573i.m23580a();
            }
            List<VideoSegment> b = bVar.mo97291b();
            if (!C6292i.m19525a(b)) {
                ArrayList arrayList = new ArrayList();
                for (VideoSegment videoSegment : b) {
                    if (videoSegment.f100774p != null) {
                        arrayList.add(videoSegment.f100774p.clone());
                    }
                }
                if (this.f101585b != null) {
                    Map map = this.f101590h;
                    AVMusic aVMusic = this.f101585b;
                    if (aVMusic == null) {
                        C7573i.m23580a();
                    }
                    String musicId = aVMusic.getMusicId();
                    C7573i.m23582a((Object) musicId, "curSelectMusicModel!!.musicId");
                    map.put(musicId, arrayList);
                }
            }
            mo97495a(this.f101585b, i, hVar);
        } else {
            mo97495a(this.f101585b, i, hVar);
        }
    }

    /* renamed from: j */
    private final boolean m125160j() {
        if (this.f101587d >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    private final boolean m125161k() {
        if (this.f101584a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final void mo97508g() {
        this.f101587d = -1;
        this.f101588e = -1;
    }

    /* renamed from: l */
    private final void m125162l() {
        if (this.f101586c == null) {
            throw new IllegalArgumentException("stickpoint listener not init");
        }
    }

    /* renamed from: b */
    public final void mo97502b() {
        C15389d dVar = this.f101584a;
        if (dVar != null) {
            dVar.mo38880w();
        }
    }

    /* renamed from: c */
    public final void mo97503c() {
        if (!mo97500a()) {
            C15389d dVar = this.f101584a;
            if (dVar != null) {
                dVar.mo38879v();
            }
        }
    }

    /* renamed from: i */
    private final List<VEClipAlgorithmParam> m125159i() {
        if (this.f101584a == null || !m125160j()) {
            return null;
        }
        C15389d dVar = this.f101584a;
        if (dVar == null) {
            C7573i.m23580a();
        }
        return dVar.mo38865n();
    }

    /* renamed from: d */
    public final boolean mo97505d() {
        Integer num;
        C15389d dVar = this.f101584a;
        if (dVar != null) {
            num = Integer.valueOf(dVar.mo38863m(this.f101587d));
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final int mo97506e() {
        if (this.f101584a == null) {
            return 0;
        }
        C15389d dVar = this.f101584a;
        if (dVar == null) {
            C7573i.m23580a();
        }
        return dVar.mo38862m();
    }

    /* renamed from: f */
    public final boolean mo97507f() {
        if (this.f101584a == null || !m125160j()) {
            return false;
        }
        C15389d dVar = this.f101584a;
        if (dVar == null) {
            C7573i.m23580a();
        }
        int B = dVar.mo38745B();
        if (B == 0) {
            mo97492a(5, -1);
        }
        if (B == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final void mo97509h() {
        if (C40173d.m128359d()) {
            C39198b bVar = this.f101586c;
            if (bVar != null) {
                List<VideoSegment> b = bVar.mo97291b();
                if (b != null) {
                    for (VideoSegment videoSegment : b) {
                        String a = videoSegment.mo96896a(false);
                        C7573i.m23582a((Object) a, "it.getPath(false)");
                        if (C40173d.m128357b(a)) {
                            videoSegment.f100761c = 3000;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo97497a(C39198b bVar) {
        C7573i.m23587b(bVar, "listener");
        this.f101586c = bVar;
    }

    /* renamed from: c */
    public final void mo97504c(int i) {
        C15389d dVar = this.f101584a;
        if (dVar != null) {
            dVar.mo38829c(i);
        }
    }

    /* renamed from: a */
    public final Integer mo97491a(VideoSegment videoSegment) {
        if (videoSegment == null) {
            return Integer.valueOf(-201);
        }
        C15389d dVar = this.f101584a;
        if (dVar != null) {
            return Integer.valueOf(dVar.mo38762a(videoSegment.f100759a, C38790a.m123896a(videoSegment.f100769k)));
        }
        return null;
    }

    /* renamed from: b */
    public final long mo97501b(int i) {
        long j = 0;
        if (this.f101586c == null) {
            return 0;
        }
        C39198b bVar = this.f101586c;
        if (bVar == null) {
            C7573i.m23580a();
        }
        List b = bVar.mo97291b();
        if (C6292i.m19525a(b) || i < 0 || i >= b.size()) {
            return 0;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (!((VideoSegment) b.get(i2)).f100768j) {
                j += ((VideoSegment) b.get(i2)).mo96910i() - ((VideoSegment) b.get(i2)).mo96909h();
            }
        }
        return j;
    }

    /* renamed from: a */
    public final void mo97494a(long j) {
        C15389d dVar = this.f101584a;
        if (dVar != null) {
            dVar.mo38763a((int) j, SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
        }
    }

    /* renamed from: a */
    private static void m125155a(VEClipAlgorithmParam vEClipAlgorithmParam, VideoSegment videoSegment) {
        if (vEClipAlgorithmParam != null && videoSegment != null && C40173d.m128359d()) {
            String a = videoSegment.mo96896a(false);
            C7573i.m23582a((Object) a, "videoSegment.getPath(false)");
            if (C40173d.m128357b(a) && vEClipAlgorithmParam.range > 3000) {
                videoSegment.f100761c = (long) vEClipAlgorithmParam.range;
            }
        }
    }

    /* renamed from: a */
    public final void mo97492a(int i, int i2) {
        long j;
        long j2;
        boolean z;
        int i3 = i;
        if (m125160j()) {
            m125162l();
            C39198b bVar = this.f101586c;
            if (bVar == null) {
                C7573i.m23580a();
            }
            List<VideoSegment> b = bVar.mo97291b();
            if (!C6292i.m19525a(b)) {
                List<VEClipAlgorithmParam> i4 = m125159i();
                long j3 = 0;
                if (C6292i.m19525a(i4)) {
                    mo97494a(0);
                    return;
                }
                for (VideoSegment videoSegment : b) {
                    if (i4 == null) {
                        C7573i.m23580a();
                    }
                    for (VEClipAlgorithmParam vEClipAlgorithmParam : i4) {
                        if (vEClipAlgorithmParam.index == videoSegment.f100759a) {
                            m125155a(vEClipAlgorithmParam, videoSegment);
                            if (videoSegment.f100774p == null) {
                                if (i3 == 5) {
                                    j2 = (long) vEClipAlgorithmParam.trimIn;
                                } else {
                                    j2 = j3;
                                }
                                StickPointVideoSegment stickPointVideoSegment = new StickPointVideoSegment(videoSegment.f100759a, j2, (long) vEClipAlgorithmParam.range, videoSegment.f100761c);
                                videoSegment.f100774p = stickPointVideoSegment;
                                if (this.f101586c == null) {
                                    z = false;
                                } else {
                                    C39198b bVar2 = this.f101586c;
                                    if (bVar2 == null) {
                                        C7573i.m23580a();
                                    }
                                    z = bVar2.mo97290a();
                                }
                                videoSegment.f100775q = z;
                            } else if (i3 == 5) {
                                videoSegment.f100774p.resetVideoStartTime((long) vEClipAlgorithmParam.trimIn, (long) vEClipAlgorithmParam.range);
                            } else {
                                if (i3 == 2 || i3 == 6) {
                                    HashMap<String, List<StickPointVideoSegment>> hashMap = this.f101590h;
                                    AVMusic aVMusic = this.f101585b;
                                    if (aVMusic == null) {
                                        C7573i.m23580a();
                                    }
                                    List<StickPointVideoSegment> list = (List) hashMap.get(aVMusic.getMusicId());
                                    if (C6292i.m19525a(list)) {
                                        videoSegment.f100774p.updateVideoStartTime((long) vEClipAlgorithmParam.range);
                                    } else {
                                        StickPointVideoSegment stickPointVideoSegment2 = null;
                                        if (list == null) {
                                            C7573i.m23580a();
                                        }
                                        for (StickPointVideoSegment stickPointVideoSegment3 : list) {
                                            if (stickPointVideoSegment3.getVideoIndex() == videoSegment.f100759a) {
                                                stickPointVideoSegment2 = stickPointVideoSegment3;
                                            }
                                        }
                                        if (stickPointVideoSegment2 != null) {
                                            videoSegment.f100774p.resetVideoStartTime(stickPointVideoSegment2.getVideoStart(), stickPointVideoSegment2.getVideoRange());
                                        } else {
                                            j = 0;
                                            videoSegment.f100774p.resetVideoStartTime(0, (long) vEClipAlgorithmParam.range);
                                        }
                                    }
                                } else if (m125158d(i)) {
                                    videoSegment.f100774p.updateVideoStartTime((long) vEClipAlgorithmParam.range);
                                }
                                j = 0;
                            }
                            j3 = 0;
                        } else {
                            j = j3;
                        }
                        j3 = j;
                    }
                }
                if (this.f101586c != null) {
                    C39198b bVar3 = this.f101586c;
                    if (bVar3 == null) {
                        C7573i.m23580a();
                    }
                    bVar3.mo97289a(i3);
                }
                mo97494a(mo97501b(i2));
            }
        }
    }

    /* renamed from: a */
    public final void mo97493a(int i, int i2, C39170h hVar) {
        if (i != i2 || hVar == null) {
            if (this.f101584a != null && m125160j()) {
                C1592h.m7853a((Callable<TResult>) new C39205i<TResult>(this, i, i2)).mo6876a((C1591g<TResult, TContinuationResult>) new C39206j<TResult,TContinuationResult>(this, hVar, i2), C1592h.f5958b);
            }
            return;
        }
        hVar.mo97007a();
    }

    /* renamed from: a */
    public final void mo97495a(AVMusic aVMusic, int i, C39170h hVar) {
        this.f101585b = aVMusic;
        this.f101589f.f101422b = aVMusic;
        if (m125161k() && aVMusic != null && aVMusic.getStickPointMusicAlg() != null) {
            String c = C39182e.m125100c(aVMusic);
            if (C7276d.m22812b(c)) {
                m125156a(c, i, C39106a.m124819a(aVMusic), new C39204h(this, hVar, i));
            }
        }
    }

    /* renamed from: a */
    private final void m125156a(String str, int i, VEAlgorithmPath vEAlgorithmPath, C39170h hVar) {
        C1592h.m7853a((Callable<TResult>) new C39202f<TResult>(this, str, vEAlgorithmPath, i)).mo6876a((C1591g<TResult, TContinuationResult>) new C39203g<TResult,TContinuationResult>(hVar), C1592h.f5958b);
    }
}
