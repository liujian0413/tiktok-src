package dmt.p1861av.video.p1862a;

import android.content.Context;
import android.util.Pair;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import com.bytedance.apm.util.C6292i;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.p1567a.C39701c;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.p1567a.C39702d;
import com.p280ss.android.ugc.aweme.utils.C43021cp;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.vesdk.VEEditor.SCALE_MODE;
import com.p280ss.android.vesdk.VEEditor.SEEK_MODE;
import com.p280ss.android.vesdk.VERecordData;
import com.p280ss.android.vesdk.VESize;
import dmt.p1861av.video.VEPreviewMusicParams;
import dmt.p1861av.video.VEPreviewParams;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: dmt.av.video.a.k */
public final class C47409k extends C47398a {

    /* renamed from: r */
    private boolean f121724r;

    /* renamed from: dmt.av.video.a.k$a */
    public static final class C47410a implements Callback {

        /* renamed from: a */
        final /* synthetic */ C47409k f121725a;

        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            C7573i.m23587b(surfaceHolder, "holder");
        }

        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            C7573i.m23587b(surfaceHolder, "holder");
        }

        C47410a(C47409k kVar) {
            this.f121725a = kVar;
        }

        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            C7573i.m23587b(surfaceHolder, "holder");
            VESize a = this.f121725a.f121692e.mo38795a(i2, i3);
            C39701c.m127048b(i2, i3, a.f116385a, a.f116386b);
            C15389d dVar = this.f121725a.f121692e;
            C7573i.m23582a((Object) dVar, "mVEEditor");
            C47409k.m148053a(dVar);
            C15389d dVar2 = this.f121725a.f121692e;
            C7573i.m23582a((Object) dVar2, "mVEEditor");
            C47409k.m148057b(dVar2);
        }
    }

    /* renamed from: a */
    public final boolean mo119545a(VEPreviewMusicParams vEPreviewMusicParams) {
        if (!this.f121724r) {
            return super.mo119545a(vEPreviewMusicParams);
        }
        this.f121724r = false;
        return true;
    }

    /* renamed from: a */
    public static void m148053a(C15389d dVar) {
        dVar.mo38773a(SCALE_MODE.SCALE_MODE_CENTER_INSIDE_WITH_2DENGINE);
        if (C39701c.f103207a.mo99072k()) {
            dVar.mo38830c(C39701c.m127051e(), C39701c.m127052f());
        }
    }

    /* renamed from: b */
    public static void m148057b(C15389d dVar) {
        boolean z;
        if (C39701c.m127053g() <= 0 || C39701c.m127054h() <= 0 || C39701c.m127055i() <= 0 || C39701c.m127056j() <= 0) {
            z = false;
        } else {
            z = true;
        }
        if (C39701c.f103207a.mo99073l() && z) {
            dVar.mo38797a(((float) C39701c.m127049c()) / ((float) C39701c.m127055i()), ((float) C39701c.m127050d()) / ((float) C39701c.m127056j()), 0.0f, -(((C39701c.m127053g() / 2) - (C39701c.m127049c() / 2)) - C39701c.m127044a()), ((C39701c.m127054h() / 2) - (C39701c.m127050d() / 2)) - C39701c.m127047b());
        }
    }

    /* renamed from: a */
    public final void mo119536a(SurfaceView surfaceView) {
        super.mo119536a(surfaceView);
        if (surfaceView != null) {
            surfaceView.getHolder().addCallback(new C47410a(this));
        }
    }

    /* renamed from: a */
    private final void m148054a(C15389d dVar, MultiEditVideoRecordData multiEditVideoRecordData) {
        if (multiEditVideoRecordData != null && C7276d.m22812b(multiEditVideoRecordData.musicPath)) {
            if (multiEditVideoRecordData.musicDuration <= 0) {
                multiEditVideoRecordData.musicDuration = C43021cp.m136536a(multiEditVideoRecordData.musicPath, true);
            }
            String str = multiEditVideoRecordData.musicPath;
            C7573i.m23582a((Object) str, "recordData.musicPath");
            int a = dVar.mo38783a(str, multiEditVideoRecordData.musicTrimIn, multiEditVideoRecordData.musicDuration, C35563c.f93231M.mo93305a(Property.RearMusicAutoLoop));
            dVar.mo38803a(a, 1, multiEditVideoRecordData.musicVolume);
            multiEditVideoRecordData.musicIndex = a;
            this.f121694g = a;
        }
    }

    /* renamed from: a */
    private final void m148055a(C15389d dVar, MultiEditVideoRecordData multiEditVideoRecordData, int i) {
        Pair playInOutTime = multiEditVideoRecordData.getPlayInOutTime();
        Integer num = (Integer) playInOutTime.first;
        Integer num2 = (Integer) playInOutTime.second;
        List<MultiEditVideoSegmentRecordData> list = multiEditVideoRecordData.segmentDataList;
        C7573i.m23582a((Object) list, "editVideoRecordData.segmentDataList");
        int i2 = 0;
        int i3 = 0;
        for (Object next : list) {
            int i4 = i2 + 1;
            if (i2 < 0) {
                C7525m.m23465b();
            }
            MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = (MultiEditVideoSegmentRecordData) next;
            if (i2 < i) {
                i3 += (int) (multiEditVideoSegmentRecordData.endTime - multiEditVideoSegmentRecordData.startTime);
            }
            i2 = i4;
        }
        VERecordData convertData = multiEditVideoRecordData.convertData();
        convertData.mo108048a(((long) num.intValue()) * 1000, ((long) num2.intValue()) * 1000);
        dVar.mo38775a(convertData, false);
        m148054a(dVar, multiEditVideoRecordData);
        dVar.mo38832c(true);
        m148053a(dVar);
        dVar.mo38868p();
        m148057b(dVar);
        dVar.mo38763a(i3, SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
    }

    /* renamed from: b */
    private final void m148058b(C15389d dVar, MultiEditVideoRecordData multiEditVideoRecordData, int i) {
        if (!C6292i.m19525a(multiEditVideoRecordData.segmentDataList)) {
            MultiEditVideoRecordData a = C39702d.m127059a(multiEditVideoRecordData, (MultiEditVideoRecordData) null);
            a.resetTimeData();
            MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = (MultiEditVideoSegmentRecordData) a.segmentDataList.get(i);
            a.segmentDataList.clear();
            a.segmentDataList.add(multiEditVideoSegmentRecordData);
            List<MultiEditVideoSegmentRecordData> list = multiEditVideoRecordData.segmentDataList;
            C7573i.m23582a((Object) list, "multiEditVideoRecordData.segmentDataList");
            int i2 = 0;
            int i3 = 0;
            for (Object next : list) {
                int i4 = i2 + 1;
                if (i2 < 0) {
                    C7525m.m23465b();
                }
                MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData2 = (MultiEditVideoSegmentRecordData) next;
                if (i2 < i) {
                    i3 += (int) (multiEditVideoSegmentRecordData2.endTime - multiEditVideoSegmentRecordData2.startTime);
                }
                i2 = i4;
            }
            long j = ((MultiEditVideoSegmentRecordData) multiEditVideoRecordData.segmentDataList.get(i)).startTime;
            long j2 = ((MultiEditVideoSegmentRecordData) multiEditVideoRecordData.segmentDataList.get(i)).endTime;
            dVar.mo38873r();
            dVar.mo38775a(a.convertData(), false);
            if (multiEditVideoRecordData.isPlaySingleSegmentMusic()) {
                m148054a(dVar, multiEditVideoRecordData);
                m148056a(dVar, multiEditVideoRecordData, i3, (int) (j2 - j));
            }
            dVar.mo38832c(true);
            m148053a(dVar);
            dVar.mo38868p();
            m148057b(dVar);
            int i5 = (int) j;
            dVar.mo38812b(i5, (int) j2);
            dVar.mo38763a(i5, SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
        }
    }

    /* renamed from: a */
    public final int mo119531a(Context context, C15389d dVar, VEPreviewParams vEPreviewParams) {
        C7573i.m23587b(dVar, "editor");
        C7573i.m23587b(vEPreviewParams, "params");
        super.mo119531a(context, dVar, vEPreviewParams);
        if (vEPreviewParams.recordData.isMultiEditRetake) {
            if (vEPreviewParams.recordData.segmentSizeChange) {
                MultiEditVideoRecordData multiEditVideoRecordData = vEPreviewParams.recordData.curMultiEditVideoRecordData;
                C7573i.m23582a((Object) multiEditVideoRecordData, "params.recordData.curMultiEditVideoRecordData");
                m148055a(dVar, multiEditVideoRecordData, vEPreviewParams.recordData.currentEditIndex);
            } else {
                MultiEditVideoRecordData multiEditVideoRecordData2 = vEPreviewParams.recordData.curMultiEditVideoRecordData;
                C7573i.m23582a((Object) multiEditVideoRecordData2, "params.recordData.curMultiEditVideoRecordData");
                m148058b(dVar, multiEditVideoRecordData2, vEPreviewParams.recordData.currentEditIndex);
            }
            if (vEPreviewParams.recordData.curMultiEditVideoRecordData.musicIndex != -1) {
                this.f121724r = true;
            }
            return 0;
        }
        MultiEditVideoRecordData multiEditVideoRecordData3 = vEPreviewParams.recordData.curMultiEditVideoRecordData;
        C7573i.m23582a((Object) multiEditVideoRecordData3, "params.recordData.curMultiEditVideoRecordData");
        Pair playInOutTime = multiEditVideoRecordData3.getPlayInOutTime();
        Integer num = (Integer) playInOutTime.first;
        Integer num2 = (Integer) playInOutTime.second;
        VERecordData convertData = vEPreviewParams.recordData.curMultiEditVideoRecordData.convertData();
        convertData.mo108048a(((long) num.intValue()) * 1000, ((long) num2.intValue()) * 1000);
        return dVar.mo38775a(convertData, false);
    }

    /* renamed from: a */
    private static void m148056a(C15389d dVar, MultiEditVideoRecordData multiEditVideoRecordData, int i, int i2) {
        if (multiEditVideoRecordData != null && multiEditVideoRecordData.musicIndex != -1) {
            int i3 = i + multiEditVideoRecordData.musicTrimIn;
            if (i3 > multiEditVideoRecordData.musicDuration) {
                i3 %= multiEditVideoRecordData.musicDuration;
            }
            dVar.mo38754a(multiEditVideoRecordData.musicIndex, i3, i2 + i3, C35563c.f93231M.mo93305a(Property.RearMusicAutoLoop));
        }
    }
}
