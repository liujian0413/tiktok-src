package dmt.p1861av.video.p1862a;

import android.content.Context;
import android.text.TextUtils;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.asve.p754b.C15390e;
import com.p280ss.android.ugc.asve.p754b.C15393h;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import dmt.p1861av.video.C47515u;
import dmt.p1861av.video.VEPreviewMusicParams;
import dmt.p1861av.video.VEPreviewParams;
import kotlin.jvm.internal.C7573i;

/* renamed from: dmt.av.video.a.l */
public final class C47411l extends C47398a {
    /* renamed from: a */
    public final boolean mo119545a(VEPreviewMusicParams vEPreviewMusicParams) {
        C7573i.m23587b(vEPreviewMusicParams, "params");
        return false;
    }

    /* renamed from: a */
    public final boolean mo119544a(VEVolumeChangeOp vEVolumeChangeOp) {
        C7573i.m23587b(vEVolumeChangeOp, "op");
        return this.f121692e.mo38803a(this.f121692e.mo38842f(), 1, vEVolumeChangeOp.mVolume);
    }

    /* renamed from: a */
    public final boolean mo119547a(C47515u uVar) {
        C7573i.m23587b(uVar, "op");
        if (this.f121692e.mo38754a(this.f121692e.mo38842f(), uVar.f121977a, uVar.f121977a + uVar.f121978b, C35563c.f93231M.mo93305a(Property.RearMusicAutoLoop)) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final int mo119531a(Context context, C15389d dVar, VEPreviewParams vEPreviewParams) {
        C7573i.m23587b(dVar, "editor");
        C7573i.m23587b(vEPreviewParams, "params");
        super.mo119531a(context, dVar, vEPreviewParams);
        MvCreateVideoData mvCreateVideoData = vEPreviewParams.mvCreateVideoData;
        int i = 0;
        if (mvCreateVideoData != null && C23477d.m77083b(mvCreateVideoData.selectMediaList) && !TextUtils.isEmpty(mvCreateVideoData.mvResZipPath)) {
            int size = mvCreateVideoData.selectMediaList.size();
            String[] strArr = new String[size];
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = mvCreateVideoData.selectMediaList.get(i2);
                C7573i.m23582a(obj, "data.selectMediaList[it]");
                strArr[i2] = (String) obj;
            }
            int size2 = mvCreateVideoData.selectMediaList.size();
            String[] strArr2 = new String[size2];
            for (int i3 = 0; i3 < size2; i3++) {
                strArr2[i3] = "img";
            }
            if (this.f121692e != null) {
                if (vEPreviewParams.mPageType == 3 || vEPreviewParams.mPageType == 2 || vEPreviewParams.mIsFromDraft) {
                    C15389d dVar2 = this.f121692e;
                    String str = mvCreateVideoData.mvResUnzipPath;
                    C7573i.m23582a((Object) str, "data.mvResUnzipPath");
                    C15393h hVar = new C15393h(str, strArr, strArr2, vEPreviewParams.mMusicPath, vEPreviewParams.mMusicInPoint, vEPreviewParams.mMusicOutPoint);
                    i = dVar2.mo38772a((C15390e) hVar);
                } else {
                    C15389d dVar3 = this.f121692e;
                    String str2 = mvCreateVideoData.mvResZipPath;
                    C7573i.m23582a((Object) str2, "data.mvResZipPath");
                    C15393h hVar2 = new C15393h(str2, strArr, strArr2, null, 0, 0, 56, null);
                    i = dVar3.mo38772a((C15390e) hVar2);
                }
            }
            this.f121698k = mvCreateVideoData.musicIds;
        }
        return i;
    }
}
