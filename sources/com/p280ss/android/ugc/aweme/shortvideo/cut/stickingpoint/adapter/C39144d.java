package com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.adapter;

import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.aweme.shortvideo.cut.C38770h.C38771a;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p280ss.android.ugc.aweme.tools.p1665a.C42133c;
import com.p280ss.android.vesdk.C45255af;
import com.p280ss.android.vesdk.VEEditor.SEEK_MODE;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.adapter.d */
public final class C39144d extends C39143c {

    /* renamed from: a */
    private int f101494a;

    /* renamed from: b */
    private VideoSegment f101495b;

    /* renamed from: c */
    private final C15389d f101496c;

    /* renamed from: d */
    private C45255af f101497d;

    /* renamed from: a */
    public final void mo96854a(boolean z, boolean z2, List<? extends VideoSegment> list) {
    }

    /* renamed from: b */
    public final void mo96858b(int i, int i2) {
        this.f101496c.mo38812b(i, i2);
    }

    /* renamed from: a */
    public final void mo96851a(List<? extends VideoSegment> list, int i) {
        if (!C23477d.m77081a((Collection<T>) list)) {
            C42133c.m134098b(this.f101497d, list);
        }
    }

    public C39144d(C15389d dVar, C45255af afVar) {
        C7573i.m23587b(dVar, "veEditor");
        C7573i.m23587b(afVar, "timelineParams");
        this.f101496c = dVar;
        this.f101497d = afVar;
    }

    /* renamed from: a */
    public final void mo96849a(int i, VideoSegment videoSegment) {
        C7573i.m23587b(videoSegment, "segment");
        this.f101495b = videoSegment;
        this.f101494a = i;
        int i2 = videoSegment.f100769k;
        videoSegment.f100769k = 0;
        C42133c.m134094a(this.f101497d, i, videoSegment);
        this.f101496c.mo38777a(this.f101497d, (int) videoSegment.mo96909h(), (int) videoSegment.mo96910i());
        videoSegment.f100769k = i2;
        C38771a.m123797a(this, (float) videoSegment.f100769k, videoSegment.f100770l, videoSegment.f100771m, 0, 0, 24, null);
    }

    /* renamed from: a */
    public final void mo96853a(List<? extends VideoSegment> list, boolean z) {
        C42133c.m134096a(this.f101497d, list);
        this.f101496c.mo38776a(this.f101497d);
        if (z) {
            this.f101496c.mo38763a(0, SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
        }
        C38771a.m123797a(this, 0.0f, 0.0f, 0.0f, 0, 0, 30, null);
    }

    /* renamed from: a */
    public final void mo96848a(int i, int i2, List<? extends VideoSegment> list) {
        List<? extends VideoSegment> list2;
        C7573i.m23587b(list, "videoList");
        int size = list.size();
        String[] strArr = new String[size];
        int[] iArr = new int[size];
        int[] iArr2 = new int[size];
        float[] fArr = new float[size];
        int[] iArr3 = new int[size];
        if (!list.isEmpty()) {
            list2 = list;
        } else {
            list2 = null;
        }
        int i3 = 0;
        if (list2 != null) {
            int i4 = 0;
            for (Object next : list2) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    C7525m.m23465b();
                }
                VideoSegment videoSegment = (VideoSegment) next;
                strArr[i4] = videoSegment.mo96896a(false);
                iArr[i4] = (int) videoSegment.mo96909h();
                iArr2[i4] = (int) videoSegment.mo96910i();
                fArr[i4] = videoSegment.mo96911j();
                iArr3[i4] = videoSegment.f100769k;
                i4 = i5;
            }
        }
        C45255af afVar = new C45255af(strArr);
        C42133c.m134097a(afVar, list, iArr, iArr2, fArr, iArr3);
        this.f101497d = afVar;
        for (Object next2 : list) {
            int i6 = i3 + 1;
            if (i3 < 0) {
                C7525m.m23465b();
            }
            this.f101497d.f116437b[i3] = ((VideoSegment) next2).f100759a;
            i3 = i6;
        }
    }
}
