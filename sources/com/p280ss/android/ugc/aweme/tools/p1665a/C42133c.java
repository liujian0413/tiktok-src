package com.p280ss.android.ugc.aweme.tools.p1665a;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.shortvideo.cut.C38789o.C38790a;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p280ss.android.ugc.aweme.tools.RecordingSpeed;
import com.p280ss.android.ugc.aweme.utils.C43142i;
import com.p280ss.android.ugc.aweme.utils.MediaType;
import com.p280ss.android.vesdk.C45255af;
import com.p280ss.android.vesdk.ROTATE_DEGREE;
import com.p280ss.android.vesdk.VEUtils;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.tools.a.c */
public final class C42133c {
    /* renamed from: a */
    public static final int m134093a(String str, int[] iArr) {
        C7573i.m23587b(str, "strInVideo");
        C7573i.m23587b(iArr, "outInfo");
        C35574k.m114859a().mo70100o();
        int videoFileInfo = VEUtils.getVideoFileInfo(C43142i.m136842a(str, MediaType.VIDEO), iArr);
        if (videoFileInfo == 0 && iArr[2] % NormalGiftView.ALPHA_180 != 0) {
            int i = iArr[1];
            iArr[1] = iArr[0];
            iArr[0] = i;
        }
        return videoFileInfo;
    }

    /* renamed from: b */
    public static final void m134098b(C45255af afVar, List<? extends VideoSegment> list) {
        C7573i.m23587b(afVar, "$this$addVideoSegment");
        if (!C23477d.m77081a((Collection<T>) list)) {
            int length = afVar.f116440e.length;
            if (list == null) {
                C7573i.m23580a();
            }
            int size = list.size() + length;
            afVar.f116440e = Arrays.copyOf(afVar.f116440e, size);
            afVar.f116441f = Arrays.copyOf(afVar.f116441f, size);
            afVar.f116444i = Arrays.copyOf(afVar.f116444i, size);
            afVar.f116445j = Arrays.copyOf(afVar.f116445j, size);
            afVar.f116446k = (ROTATE_DEGREE[]) Arrays.copyOf(afVar.f116446k, size);
            afVar.f116436a = (String[]) Arrays.copyOf(afVar.f116436a, size);
            afVar.f116437b = Arrays.copyOf(afVar.f116437b, size);
            int i = 0;
            for (Object next : list) {
                int i2 = i + 1;
                if (i < 0) {
                    C7525m.m23465b();
                }
                VideoSegment videoSegment = (VideoSegment) next;
                int i3 = i + length;
                afVar.f116440e[i3] = (int) videoSegment.mo96909h();
                afVar.f116441f[i3] = (int) videoSegment.mo96910i();
                afVar.f116444i[i3] = (double) RecordingSpeed.NORMAL.value();
                afVar.f116445j[i3] = true;
                afVar.f116446k[i3] = ROTATE_DEGREE.ROTATE_NONE;
                afVar.f116436a[i3] = videoSegment.mo96896a(false);
                afVar.f116437b[i3] = videoSegment.f100759a;
                i = i2;
            }
        }
    }

    /* renamed from: a */
    public static final void m134096a(C45255af afVar, List<? extends VideoSegment> list) {
        C7573i.m23587b(afVar, "$this$unselectAll");
        if (list != null) {
            int i = 0;
            for (Object next : list) {
                int i2 = i + 1;
                if (i < 0) {
                    C7525m.m23465b();
                }
                VideoSegment videoSegment = (VideoSegment) next;
                afVar.f116440e[i] = (int) videoSegment.mo96909h();
                afVar.f116441f[i] = (int) videoSegment.mo96910i();
                afVar.f116446k[i] = C38790a.m123896a(videoSegment.f100769k);
                afVar.f116444i[i] = (double) videoSegment.mo96911j();
                afVar.f116445j[i] = !videoSegment.f100768j;
                i = i2;
            }
        }
    }

    /* renamed from: a */
    public static final void m134094a(C45255af afVar, int i, VideoSegment videoSegment) {
        boolean z;
        C7573i.m23587b(afVar, "$this$selectSegment");
        C7573i.m23587b(videoSegment, "segment");
        boolean[] zArr = afVar.f116445j;
        C7573i.m23582a((Object) zArr, "enable");
        int length = zArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = i3 + 1;
            boolean[] zArr2 = afVar.f116445j;
            if (i == i3) {
                z = true;
            } else {
                z = false;
            }
            zArr2[i3] = z;
            i2++;
            i3 = i4;
        }
        afVar.f116444i[i] = (double) videoSegment.mo96911j();
        afVar.f116440e[i] = 0;
        afVar.f116441f[i] = (int) videoSegment.f100761c;
        afVar.f116446k[i] = C38790a.m123896a(videoSegment.f100769k);
    }

    /* renamed from: a */
    public static final void m134095a(C45255af afVar, int i, VideoSegment videoSegment, List<? extends VideoSegment> list) {
        C7573i.m23587b(afVar, "$this$unselect");
        C7573i.m23587b(videoSegment, "preSelectSegment");
        afVar.f116444i[i] = (double) videoSegment.mo96911j();
        afVar.f116440e[i] = (int) videoSegment.mo96909h();
        afVar.f116441f[i] = (int) videoSegment.mo96910i();
        afVar.f116446k[i] = C38790a.m123896a(videoSegment.f100769k);
        if (list != null) {
            int i2 = 0;
            for (Object next : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    C7525m.m23465b();
                }
                afVar.f116445j[i2] = !((VideoSegment) next).f100768j;
                i2 = i3;
            }
        }
    }

    /* renamed from: a */
    public static final void m134097a(C45255af afVar, List<? extends VideoSegment> list, int[] iArr, int[] iArr2, float[] fArr, int[] iArr3) {
        C7573i.m23587b(afVar, "$this$update");
        C7573i.m23587b(iArr, "vTrimInArray");
        C7573i.m23587b(iArr2, "vTrimOutArray");
        C7573i.m23587b(fArr, "speedArray");
        C7573i.m23587b(iArr3, "rotateArray");
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
                    afVar.f116445j[i] = !((VideoSegment) next).f100768j;
                    afVar.f116440e[i] = iArr[i];
                    afVar.f116441f[i] = iArr2[i];
                    afVar.f116444i[i] = (double) fArr[i];
                    afVar.f116446k[i] = C38790a.m123896a(iArr3[i]);
                    i = i2;
                }
            }
        }
    }
}
