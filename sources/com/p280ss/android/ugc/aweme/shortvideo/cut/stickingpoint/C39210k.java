package com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint;

import com.bytedance.apm.util.C6292i;
import com.p280ss.android.ugc.aweme.shortvideo.cut.C38748d;
import com.p280ss.android.ugc.aweme.shortvideo.cut.C38770h;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p280ss.android.vesdk.VEListener.C45215k;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.k */
public final class C39210k {

    /* renamed from: a */
    public C38770h f101623a;

    /* renamed from: b */
    public C38770h f101624b;

    /* renamed from: c */
    public boolean f101625c;

    /* renamed from: a */
    public final boolean mo97522a(int i, float f) {
        if (this.f101623a == null) {
            return false;
        }
        C38770h hVar = this.f101623a;
        if (hVar == null) {
            C7573i.m23580a();
        }
        return hVar.mo96856a(i, f);
    }

    /* renamed from: a */
    public final boolean mo97521a(float f, float f2, float f3, int i, int i2) {
        if (this.f101623a == null) {
            return false;
        }
        C38770h hVar = this.f101623a;
        if (hVar == null) {
            C7573i.m23580a();
        }
        return hVar.mo96855a(f, f2, f3, i, i2);
    }

    /* renamed from: b */
    public final void mo97523b(int i, float f) {
        C38770h hVar = this.f101623a;
        if (hVar != null) {
            hVar.mo96857b(i, f);
        }
    }

    /* renamed from: a */
    public final void mo97514a(int i, int i2) {
        if (this.f101625c) {
            C38770h hVar = this.f101624b;
            if (hVar != null) {
                hVar.mo96858b(i, i2);
            }
        } else {
            C38770h hVar2 = this.f101623a;
            if (hVar2 != null) {
                hVar2.mo96858b(i, i2);
            }
        }
    }

    /* renamed from: a */
    public final void mo97516a(int i, VideoSegment videoSegment) {
        if (videoSegment != null) {
            if (this.f101625c) {
                C38770h hVar = this.f101624b;
                if (hVar != null) {
                    hVar.mo96849a(i, videoSegment);
                }
            } else {
                C38770h hVar2 = this.f101623a;
                if (hVar2 != null) {
                    hVar2.mo96849a(i, videoSegment);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo97517a(C38748d dVar, C45215k kVar) {
        C7573i.m23587b(dVar, "settings");
        C7573i.m23587b(kVar, "listener");
        C38770h hVar = this.f101623a;
        if (hVar != null) {
            hVar.mo96850a(dVar, kVar);
        }
    }

    /* renamed from: a */
    public final void mo97519a(List<? extends VideoSegment> list, boolean z) {
        if (this.f101625c) {
            C38770h hVar = this.f101624b;
            if (hVar != null) {
                hVar.mo96853a(list, z);
            }
        } else {
            C38770h hVar2 = this.f101623a;
            if (hVar2 != null) {
                hVar2.mo96853a(list, z);
            }
        }
    }

    /* renamed from: a */
    public final void mo97515a(int i, int i2, List<? extends VideoSegment> list) {
        if (i != i2 && !C6292i.m19525a(list)) {
            C38770h hVar = this.f101624b;
            if (hVar != null) {
                if (list == null) {
                    C7573i.m23580a();
                }
                hVar.mo96848a(i, i2, list);
            }
            C38770h hVar2 = this.f101623a;
            if (hVar2 != null) {
                if (list == null) {
                    C7573i.m23580a();
                }
                hVar2.mo96848a(i, i2, list);
            }
            if (this.f101625c) {
                C38770h hVar3 = this.f101624b;
                if (hVar3 != null) {
                    hVar3.mo96847a(i, i2);
                }
            } else {
                C38770h hVar4 = this.f101623a;
                if (hVar4 != null) {
                    hVar4.mo96847a(i, i2);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo97520a(boolean z, boolean z2, List<? extends VideoSegment> list) {
        if (this.f101625c) {
            C38770h hVar = this.f101624b;
            if (hVar != null) {
                hVar.mo96854a(z, z2, list);
            }
        } else {
            C38770h hVar2 = this.f101623a;
            if (hVar2 != null) {
                hVar2.mo96854a(z, z2, list);
            }
        }
    }

    /* renamed from: a */
    public final void mo97518a(List<? extends VideoSegment> list, int i, long j, long j2) {
        C38770h hVar = this.f101624b;
        if (hVar != null) {
            hVar.mo96851a(list, i);
        }
        C38770h hVar2 = this.f101623a;
        if (hVar2 != null) {
            hVar2.mo96851a(list, i);
        }
        if (this.f101625c) {
            C38770h hVar3 = this.f101624b;
            if (hVar3 != null) {
                hVar3.mo96852a(list, i, j, j2);
            }
        } else {
            C38770h hVar4 = this.f101623a;
            if (hVar4 != null) {
                hVar4.mo96852a(list, i, j, j2);
            }
        }
    }
}
