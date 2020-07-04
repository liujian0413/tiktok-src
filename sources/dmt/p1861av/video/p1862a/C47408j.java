package dmt.p1861av.video.p1862a;

import android.content.Context;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.asve.p754b.C15390e;
import com.p280ss.android.ugc.asve.p754b.C15391f;
import com.p280ss.android.ugc.asve.p754b.C15394i;
import com.p280ss.android.ugc.aweme.shortvideo.cut.C38789o.C38790a;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.vesdk.ROTATE_DEGREE;
import com.p280ss.android.vesdk.VEEditor.VIDEO_RATIO;
import dmt.p1861av.video.VEPreviewParams;

/* renamed from: dmt.av.video.a.j */
public class C47408j extends C47398a {
    /* renamed from: a */
    public final int mo119531a(Context context, C15389d dVar, VEPreviewParams vEPreviewParams) {
        super.mo119531a(context, dVar, vEPreviewParams);
        if (vEPreviewParams.editorHandler > 0 && vEPreviewParams.editorModel != null) {
            int a = dVar.mo38772a((C15390e) new C15394i(vEPreviewParams.editorModel, vEPreviewParams.timelineParams));
            C41530am.m132280a("initVEEditor with editorModel");
            return a;
        } else if (vEPreviewParams.mVTrimIn == null || vEPreviewParams.mVTrimOut == null) {
            C15391f fVar = new C15391f(vEPreviewParams.mVideoPaths);
            fVar.mo38887a(VIDEO_RATIO.VIDEO_OUT_RATIO_ORIGINAL);
            fVar.f39686d = vEPreviewParams.mAudioPaths;
            return this.f121692e.mo38772a((C15390e) fVar);
        } else {
            ROTATE_DEGREE[] rotate_degreeArr = null;
            if (vEPreviewParams.rotateArray != null) {
                rotate_degreeArr = new ROTATE_DEGREE[vEPreviewParams.rotateArray.length];
                for (int i = 0; i < rotate_degreeArr.length; i++) {
                    rotate_degreeArr[i] = C38790a.m123896a(vEPreviewParams.rotateArray[i]);
                }
            }
            C15391f fVar2 = new C15391f(vEPreviewParams.mVideoPaths);
            fVar2.f39683a = vEPreviewParams.mVTrimIn;
            fVar2.f39684b = vEPreviewParams.mVTrimOut;
            fVar2.f39686d = vEPreviewParams.mAudioPaths;
            fVar2.f39689g = vEPreviewParams.speedArray;
            fVar2.f39690h = rotate_degreeArr;
            fVar2.mo38887a(VIDEO_RATIO.VIDEO_OUT_RATIO_ORIGINAL);
            return this.f121692e.mo38772a((C15390e) fVar2);
        }
    }
}
