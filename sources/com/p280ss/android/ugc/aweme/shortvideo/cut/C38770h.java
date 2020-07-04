package com.p280ss.android.ugc.aweme.shortvideo.cut;

import com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p280ss.android.vesdk.VEListener.C45215k;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.h */
public interface C38770h {

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.h$a */
    public static final class C38771a {
        /* renamed from: a */
        public static /* synthetic */ boolean m123797a(C38770h hVar, float f, float f2, float f3, int i, int i2, int i3, Object obj) {
            float f4;
            float f5;
            if ((i3 & 2) != 0) {
                f4 = 1.0f;
            } else {
                f4 = f2;
            }
            if ((i3 & 4) != 0) {
                f5 = 1.0f;
            } else {
                f5 = f3;
            }
            return hVar.mo96855a(f, f4, f5, 0, 0);
        }
    }

    /* renamed from: a */
    void mo96847a(int i, int i2);

    /* renamed from: a */
    void mo96848a(int i, int i2, List<? extends VideoSegment> list);

    /* renamed from: a */
    void mo96849a(int i, VideoSegment videoSegment);

    /* renamed from: a */
    void mo96850a(C38748d dVar, C45215k kVar);

    /* renamed from: a */
    void mo96851a(List<? extends VideoSegment> list, int i);

    /* renamed from: a */
    void mo96852a(List<? extends VideoSegment> list, int i, long j, long j2);

    /* renamed from: a */
    void mo96853a(List<? extends VideoSegment> list, boolean z);

    /* renamed from: a */
    void mo96854a(boolean z, boolean z2, List<? extends VideoSegment> list);

    /* renamed from: a */
    boolean mo96855a(float f, float f2, float f3, int i, int i2);

    /* renamed from: a */
    boolean mo96856a(int i, float f);

    /* renamed from: b */
    void mo96857b(int i, float f);

    /* renamed from: b */
    void mo96858b(int i, int i2);
}
