package dmt.p1861av.video.p1862a;

import android.content.Context;
import android.text.TextUtils;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.asve.p754b.C15390e;
import com.p280ss.android.ugc.asve.p754b.C15393h;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.aweme.mvtheme.AfrFileBean;
import com.p280ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import dmt.p1861av.video.VEPreviewMusicParams;
import dmt.p1861av.video.VEPreviewParams;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Pair;

/* renamed from: dmt.av.video.a.m */
public final class C47412m extends C47398a {

    /* renamed from: r */
    private int f121726r = -1;

    /* renamed from: b */
    private boolean m148066b(String str) {
        if (!TextUtils.isEmpty(str) && !C23477d.m77081a((Collection<T>) this.f121698k)) {
            return this.f121698k.contains(str);
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo119544a(VEVolumeChangeOp vEVolumeChangeOp) {
        if (vEVolumeChangeOp.mType == 0) {
            this.f121692e.mo38803a(0, 0, vEVolumeChangeOp.mVolume);
        } else if (vEVolumeChangeOp.mType == 1) {
            if (this.f121694g != -1) {
                this.f121692e.mo38803a(this.f121694g, 1, vEVolumeChangeOp.mVolume);
            } else {
                this.f121726r = this.f121692e.mo38842f();
                if (this.f121726r != -1) {
                    this.f121692e.mo38803a(this.f121726r, 1, vEVolumeChangeOp.mVolume);
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo119539a(VEPreviewParams vEPreviewParams) {
        MvCreateVideoData mvCreateVideoData = vEPreviewParams.mvCreateVideoData;
        if (mvCreateVideoData != null) {
            Iterator it = mvCreateVideoData.maskFileData.iterator();
            while (it.hasNext()) {
                AfrFileBean afrFileBean = (AfrFileBean) it.next();
                for (Pair pair : afrFileBean.getMaskFiles()) {
                    this.f121692e.mo38787a(afrFileBean.getPhotonPath(), (String) pair.component1(), (String) pair.component2());
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo119545a(VEPreviewMusicParams vEPreviewMusicParams) {
        if (this.f121694g != -1) {
            this.f121692e.mo38833d(this.f121694g);
            this.f121694g = -1;
        }
        if (!m148066b(vEPreviewMusicParams.f121611f)) {
            this.f121726r = this.f121692e.mo38842f();
            if (this.f121726r != -1) {
                this.f121692e.mo38803a(this.f121726r, 1, 0.0f);
            }
            if (vEPreviewMusicParams.f121606a == null) {
                return false;
            }
            if (!C35563c.f93231M.mo93305a(Property.EnableRemove15sCapMusic) || vEPreviewMusicParams.f121609d <= 0 || Math.abs(vEPreviewMusicParams.f121608c - vEPreviewMusicParams.f121609d) < 1000) {
                this.f121694g = this.f121692e.mo38783a(vEPreviewMusicParams.f121606a, vEPreviewMusicParams.f121607b, vEPreviewMusicParams.f121607b + vEPreviewMusicParams.f121608c, C35563c.f93231M.mo93305a(Property.RearMusicAutoLoop));
            } else {
                this.f121694g = this.f121692e.mo38783a(vEPreviewMusicParams.f121606a, vEPreviewMusicParams.f121607b, vEPreviewMusicParams.f121607b + vEPreviewMusicParams.f121609d, C35563c.f93231M.mo93305a(Property.RearMusicAutoLoop));
            }
            this.f121692e.mo38803a(this.f121694g, 1, vEPreviewMusicParams.f121610e);
        } else if (vEPreviewMusicParams.mo119477a()) {
            this.f121692e.mo38803a(this.f121726r, 1, vEPreviewMusicParams.f121610e);
        } else {
            this.f121692e.mo38803a(0, 1, vEPreviewMusicParams.f121610e);
        }
        return false;
    }

    /* renamed from: a */
    public final int mo119531a(Context context, C15389d dVar, VEPreviewParams vEPreviewParams) {
        super.mo119531a(context, dVar, vEPreviewParams);
        MvCreateVideoData mvCreateVideoData = vEPreviewParams.mvCreateVideoData;
        int i = 0;
        if (mvCreateVideoData != null && !C23477d.m77081a((Collection<T>) mvCreateVideoData.selectMediaList) && !TextUtils.isEmpty(mvCreateVideoData.mvResZipPath)) {
            String[] strArr = new String[mvCreateVideoData.selectMediaList.size()];
            String[] strArr2 = new String[mvCreateVideoData.selectMediaList.size()];
            for (int i2 = 0; i2 < mvCreateVideoData.selectMediaList.size(); i2++) {
                strArr[i2] = (String) mvCreateVideoData.selectMediaList.get(i2);
                strArr2[i2] = "img";
            }
            if (this.f121692e != null) {
                i = this.f121692e.mo38772a((C15390e) new C15393h(mvCreateVideoData.mvResUnzipPath, strArr, strArr2));
            }
            this.f121698k = mvCreateVideoData.musicIds;
        }
        return i;
    }
}
