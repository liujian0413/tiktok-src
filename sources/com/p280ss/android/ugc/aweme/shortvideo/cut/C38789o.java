package com.p280ss.android.ugc.aweme.shortvideo.cut;

import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.shortvideo.cut.C38770h.C38771a;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39526e;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p280ss.android.ugc.aweme.shortvideo.p1551c.C38566l;
import com.p280ss.android.ugc.aweme.shortvideo.p1551c.C38566l.C38567a;
import com.p280ss.android.ugc.aweme.tools.RecordingSpeed;
import com.p280ss.android.ugc.aweme.tools.p1665a.C42133c;
import com.p280ss.android.vesdk.C45255af;
import com.p280ss.android.vesdk.ROTATE_DEGREE;
import com.p280ss.android.vesdk.VEEditor.SEEK_MODE;
import com.p280ss.android.vesdk.VEListener.C45215k;
import com.p280ss.android.vesdk.VEVideoEncodeSettings;
import com.p280ss.android.vesdk.VEVideoEncodeSettings.C45244a;
import com.p280ss.android.vesdk.VEVideoEncodeSettings.COMPILE_TYPE;
import com.p280ss.android.vesdk.clipparam.VEClipSourceParam;
import com.p280ss.android.vesdk.clipparam.VEClipTimelineParam;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.o */
public final class C38789o implements C38770h {

    /* renamed from: a */
    public static final C38790a f100803a = new C38790a(null);

    /* renamed from: b */
    private int f100804b;

    /* renamed from: c */
    private VideoSegment f100805c;

    /* renamed from: d */
    private final C15389d f100806d;

    /* renamed from: e */
    private C45255af f100807e;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.o$a */
    public static final class C38790a {
        private C38790a() {
        }

        public /* synthetic */ C38790a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static ROTATE_DEGREE m123896a(int i) {
            if (i == 90) {
                return ROTATE_DEGREE.ROTATE_90;
            }
            if (i == 180) {
                return ROTATE_DEGREE.ROTATE_180;
            }
            if (i != 270) {
                return ROTATE_DEGREE.ROTATE_NONE;
            }
            return ROTATE_DEGREE.ROTATE_270;
        }

        /* renamed from: a */
        public static void m123897a(List<? extends EditVideoSegment> list, C15389d dVar) {
            C7573i.m23587b(list, "videoList");
            C7573i.m23587b(dVar, "veEditor");
            if (!(!list.isEmpty())) {
                list = null;
            }
            if (list != null) {
                List arrayList = new ArrayList();
                List arrayList2 = new ArrayList();
                List arrayList3 = new ArrayList();
                List arrayList4 = new ArrayList();
                List arrayList5 = new ArrayList();
                for (EditVideoSegment editVideoSegment : list) {
                    String a = C38567a.m123257a(new File(editVideoSegment.getVideoPath()));
                    arrayList2.add(Integer.valueOf((int) editVideoSegment.getVideoFileInfo().getDuration()));
                    arrayList.add(editVideoSegment.getVideoPath());
                    arrayList3.add(Integer.valueOf(editVideoSegment.getVideoFileInfo().getWidth()));
                    arrayList4.add(Integer.valueOf(editVideoSegment.getVideoFileInfo().getHeight()));
                    arrayList5.add(a);
                }
                String a2 = C38566l.m123254a(false, true, C35574k.m114861b(), arrayList, arrayList2, arrayList3, arrayList4, arrayList5, null);
                C7573i.m23582a((Object) a2, "metaInfo");
                dVar.mo38784a("description", a2);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo96856a(int i, float f) {
        return this.f100806d.mo38755a(0, i, C38790a.m123896a((int) f)) == 0;
    }

    /* renamed from: a */
    public final void mo96847a(int i, int i2) {
        this.f100806d.mo38750a(0, i, i2);
    }

    /* renamed from: b */
    public final void mo96858b(int i, int i2) {
        this.f100806d.mo38812b(i, i2);
    }

    /* renamed from: a */
    public final void mo96851a(List<? extends VideoSegment> list, int i) {
        if (!C23477d.m77081a((Collection<T>) list)) {
            C42133c.m134098b(this.f100807e, list);
        }
    }

    /* renamed from: b */
    public final void mo96857b(int i, float f) {
        this.f100807e.f116444i[i] = (double) f;
        this.f100806d.mo38776a(this.f100807e);
    }

    public C38789o(C15389d dVar, C45255af afVar) {
        C7573i.m23587b(dVar, "veEditor");
        C7573i.m23587b(afVar, "timelineParam");
        this.f100806d = dVar;
        this.f100807e = afVar;
    }

    /* renamed from: a */
    public final void mo96849a(int i, VideoSegment videoSegment) {
        C7573i.m23587b(videoSegment, "segment");
        this.f100805c = videoSegment;
        this.f100804b = i;
        int i2 = videoSegment.f100769k;
        videoSegment.f100769k = 0;
        C42133c.m134094a(this.f100807e, i, videoSegment);
        this.f100806d.mo38777a(this.f100807e, (int) videoSegment.mo96909h(), (int) videoSegment.mo96910i());
        videoSegment.f100769k = i2;
        C38771a.m123797a(this, (float) videoSegment.f100769k, videoSegment.f100770l, videoSegment.f100771m, 0, 0, 24, null);
    }

    /* renamed from: a */
    public final void mo96850a(C38748d dVar, C45215k kVar) {
        C7573i.m23587b(dVar, "settings");
        C7573i.m23587b(kVar, "listener");
        VEVideoEncodeSettings a = new C45244a(2).mo108166b(dVar.f100697g).mo108156a(dVar.f100698h).mo108155a(dVar.f100699i).mo108149a(dVar.f100694d, dVar.f100695e).mo108167c(dVar.f100701k).mo108172f(dVar.f100702l).mo108152a(dVar.f100700j).mo108151a(COMPILE_TYPE.COMPILE_TYPE_MP4).mo108148a(dVar.f100696f).mo108171e(dVar.f100703m).mo108162a();
        Iterable<VideoSegment> iterable = dVar.f100691a;
        Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
        for (VideoSegment a2 : iterable) {
            arrayList.add(C39526e.m126245a(a2));
        }
        C38790a.m123897a((List) arrayList, this.f100806d);
        C15389d dVar2 = this.f100806d;
        String str = dVar.f100692b;
        String str2 = dVar.f100693c;
        C7573i.m23582a((Object) a, "encodeSettings");
        dVar2.mo38805a(str, str2, a, kVar);
    }

    /* renamed from: a */
    public final void mo96853a(List<? extends VideoSegment> list, boolean z) {
        C42133c.m134096a(this.f100807e, list);
        this.f100806d.mo38776a(this.f100807e);
        this.f100806d.mo38763a(0, SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
        C38771a.m123797a(this, 0.0f, 0.0f, 0.0f, 0, 0, 30, null);
    }

    /* renamed from: a */
    public final void mo96854a(boolean z, boolean z2, List<? extends VideoSegment> list) {
        VideoSegment videoSegment = this.f100805c;
        if (videoSegment != null) {
            C42133c.m134095a(this.f100807e, this.f100804b, videoSegment, list);
            this.f100806d.mo38776a(this.f100807e);
            C38771a.m123797a(this, 0.0f, 0.0f, 0.0f, 0, 0, 30, null);
        }
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
        this.f100807e = afVar;
        for (Object next2 : list) {
            int i6 = i3 + 1;
            if (i3 < 0) {
                C7525m.m23465b();
            }
            this.f100807e.f116437b[i3] = ((VideoSegment) next2).f100759a;
            i3 = i6;
        }
    }

    /* renamed from: a */
    public final void mo96852a(List<? extends VideoSegment> list, int i, long j, long j2) {
        if (!C23477d.m77081a((Collection<T>) list)) {
            if (list == null) {
                C7573i.m23580a();
            }
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            ArrayList arrayList2 = new ArrayList(size);
            for (VideoSegment videoSegment : list) {
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
            this.f100806d.mo38760a(0, i - list.size(), arrayList, arrayList2);
            this.f100806d.mo38812b((int) j, (int) j2);
        }
    }

    /* renamed from: a */
    public final boolean mo96855a(float f, float f2, float f3, int i, int i2) {
        this.f100806d.mo38797a(f2, f3, f, i, i2);
        return true;
    }
}
