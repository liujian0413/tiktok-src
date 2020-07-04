package com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed;

import com.bytedance.apm.util.C6292i;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p280ss.android.vesdk.clipparam.VEClipAlgorithmParam;
import com.p280ss.android.vesdk.filterparam.VEBaseFilterParam;
import com.p280ss.android.vesdk.filterparam.VEImageTransformFilterParam;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.f */
public final class C40178f {

    /* renamed from: c */
    public static final C40179a f104451c = new C40179a(null);

    /* renamed from: a */
    public C15389d f104452a;

    /* renamed from: b */
    public boolean f104453b;

    /* renamed from: d */
    private List<Integer> f104454d = new ArrayList();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.f$a */
    public static final class C40179a {
        private C40179a() {
        }

        public /* synthetic */ C40179a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    private final void m128374a() {
        if (this.f104452a != null && !C6292i.m19525a(this.f104454d)) {
            int[] iArr = new int[this.f104454d.size()];
            int length = iArr.length;
            for (int i = 0; i < length; i++) {
                iArr[i] = ((Number) this.f104454d.get(i)).intValue();
            }
            this.f104454d.clear();
            C15389d dVar = this.f104452a;
            if (dVar == null) {
                C7573i.m23580a();
            }
            dVar.mo38791a(iArr);
        }
    }

    /* renamed from: a */
    private static VEImageTransformFilterParam m128373a(int i) {
        VEImageTransformFilterParam vEImageTransformFilterParam = new VEImageTransformFilterParam();
        if (i == VEClipAlgorithmParam.BINGO_EFFECT_ZOOMIN) {
            vEImageTransformFilterParam.beginScale = 1.0f;
            vEImageTransformFilterParam.endScale = 1.1f;
            return vEImageTransformFilterParam;
        } else if (i != VEClipAlgorithmParam.BINGO_EFFECT_ZOOMOUT) {
            return null;
        } else {
            vEImageTransformFilterParam.beginScale = 1.1f;
            vEImageTransformFilterParam.endScale = 1.0f;
            return vEImageTransformFilterParam;
        }
    }

    /* renamed from: b */
    private static boolean m128375b(List<? extends VideoSegment> list) {
        if (C6292i.m19525a(list)) {
            return false;
        }
        if (list == null) {
            C7573i.m23580a();
        }
        for (VideoSegment videoSegment : list) {
            if (!videoSegment.f100768j) {
                String a = videoSegment.mo96896a(false);
                C7573i.m23582a((Object) a, "videoSegment.getPath(false)");
                if (!C40173d.m128357b(a)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo99948a(VideoSegment videoSegment) {
        if (C40173d.m128359d() && this.f104452a != null && videoSegment != null) {
            m128374a();
            if (this.f104453b) {
                String a = videoSegment.mo96896a(false);
                C7573i.m23582a((Object) a, "videoSegment.getPath(false)");
                if (C40173d.m128357b(a)) {
                    VEImageTransformFilterParam a2 = m128373a(videoSegment.f100777s);
                    if (a2 != null) {
                        C15389d dVar = this.f104452a;
                        if (dVar == null) {
                            C7573i.m23580a();
                        }
                        VEBaseFilterParam vEBaseFilterParam = a2;
                        int a3 = dVar.mo38757a(0, 0, vEBaseFilterParam, (int) videoSegment.mo96909h(), (int) (videoSegment.mo96910i() - videoSegment.mo96909h()));
                        C15389d dVar2 = this.f104452a;
                        if (dVar2 == null) {
                            C7573i.m23580a();
                        }
                        dVar2.mo38765a(a3, vEBaseFilterParam);
                        this.f104454d.add(Integer.valueOf(a3));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo99950a(List<? extends VideoSegment> list) {
        if (C40173d.m128359d() && this.f104452a != null && !C6292i.m19525a(list)) {
            m128374a();
            if (this.f104453b) {
                if (list == null) {
                    C7573i.m23580a();
                }
                if (!m128375b(list)) {
                    for (VideoSegment videoSegment : list) {
                        videoSegment.f100777s = VEClipAlgorithmParam.BINGO_EFFECT_NULL;
                    }
                    return;
                }
                int i = VEClipAlgorithmParam.BINGO_EFFECT_ZOOMIN;
                long j = 0;
                for (VideoSegment videoSegment2 : list) {
                    long i2 = videoSegment2.mo96910i() - videoSegment2.mo96909h();
                    if (!videoSegment2.f100768j) {
                        String a = videoSegment2.mo96896a(false);
                        C7573i.m23582a((Object) a, "segment.getPath(false)");
                        if (C40173d.m128357b(a)) {
                            videoSegment2.f100777s = i;
                            VEImageTransformFilterParam a2 = m128373a(i);
                            if (a2 != null) {
                                C15389d dVar = this.f104452a;
                                if (dVar == null) {
                                    C7573i.m23580a();
                                }
                                VEBaseFilterParam vEBaseFilterParam = a2;
                                int a3 = dVar.mo38757a(0, 0, vEBaseFilterParam, (int) j, (int) (j + i2));
                                C15389d dVar2 = this.f104452a;
                                if (dVar2 == null) {
                                    C7573i.m23580a();
                                }
                                dVar2.mo38765a(a3, vEBaseFilterParam);
                                this.f104454d.add(Integer.valueOf(a3));
                            }
                        } else if (i == VEClipAlgorithmParam.BINGO_EFFECT_ZOOMOUT) {
                            i = VEClipAlgorithmParam.BINGO_EFFECT_ZOOMIN;
                        } else {
                            i = VEClipAlgorithmParam.BINGO_EFFECT_ZOOMOUT;
                        }
                        j += i2;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo99949a(VideoSegment videoSegment, long j, long j2) {
        if (C40173d.m128359d() && this.f104452a != null && videoSegment != null) {
            m128374a();
            if (this.f104453b) {
                String a = videoSegment.mo96896a(false);
                C7573i.m23582a((Object) a, "videoSegment.getPath(false)");
                if (C40173d.m128357b(a)) {
                    VEImageTransformFilterParam a2 = m128373a(videoSegment.f100777s);
                    if (a2 != null) {
                        C15389d dVar = this.f104452a;
                        if (dVar == null) {
                            C7573i.m23580a();
                        }
                        VEBaseFilterParam vEBaseFilterParam = a2;
                        int a3 = dVar.mo38757a(0, 0, vEBaseFilterParam, (int) j, (int) j2);
                        C15389d dVar2 = this.f104452a;
                        if (dVar2 == null) {
                            C7573i.m23580a();
                        }
                        dVar2.mo38765a(a3, vEBaseFilterParam);
                        this.f104454d.add(Integer.valueOf(a3));
                    }
                }
            }
        }
    }
}
