package dmt.p1861av.video.p1862a;

import android.content.Context;
import android.text.TextUtils;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.asve.p754b.C15390e;
import com.p280ss.android.ugc.asve.p754b.C15393h;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.p280ss.android.ugc.aweme.status.StatusCreateVideoData;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetProxyTimeoutExperiment;
import dmt.p1861av.video.VEPreviewMusicParams;
import dmt.p1861av.video.VEPreviewParams;
import java.util.ArrayList;
import kotlin.jvm.internal.C7573i;

/* renamed from: dmt.av.video.a.n */
public final class C47413n extends C47398a {

    /* renamed from: r */
    private int f121727r = -1;

    /* renamed from: s */
    private String f121728s;

    /* renamed from: a */
    public final boolean mo119544a(VEVolumeChangeOp vEVolumeChangeOp) {
        C7573i.m23587b(vEVolumeChangeOp, "op");
        if (vEVolumeChangeOp.mType == 0) {
            this.f121692e.mo38803a(0, 0, vEVolumeChangeOp.mVolume);
        } else if (vEVolumeChangeOp.mType == 1) {
            if (this.f121694g != -1) {
                this.f121692e.mo38803a(this.f121694g, 1, vEVolumeChangeOp.mVolume);
            } else {
                this.f121727r = this.f121692e.mo38842f();
                if (this.f121727r != -1) {
                    this.f121692e.mo38803a(this.f121727r, 1, vEVolumeChangeOp.mVolume);
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo119545a(VEPreviewMusicParams vEPreviewMusicParams) {
        C7573i.m23587b(vEPreviewMusicParams, "params");
        if (this.f121694g != -1) {
            this.f121692e.mo38833d(this.f121694g);
            this.f121694g = -1;
        }
        if (!TextUtils.isEmpty(vEPreviewMusicParams.f121606a) || !TextUtils.isEmpty(this.f121728s)) {
            this.f121727r = this.f121692e.mo38842f();
            if (this.f121727r != -1) {
                this.f121692e.mo38803a(this.f121727r, 1, 0.0f);
            }
            if (vEPreviewMusicParams.f121606a == null) {
                vEPreviewMusicParams.f121606a = this.f121728s;
                vEPreviewMusicParams.f121608c = VideoCacheTTnetProxyTimeoutExperiment.DEFAULT;
            }
            if (!C35563c.f93231M.mo93305a(Property.EnableRemove15sCapMusic) || vEPreviewMusicParams.f121609d <= 0 || Math.abs(vEPreviewMusicParams.f121608c - vEPreviewMusicParams.f121609d) < 1000) {
                C15389d dVar = this.f121692e;
                String str = vEPreviewMusicParams.f121606a;
                C7573i.m23582a((Object) str, "params.mPath");
                this.f121694g = dVar.mo38783a(str, vEPreviewMusicParams.f121607b, vEPreviewMusicParams.f121607b + vEPreviewMusicParams.f121608c, C35563c.f93231M.mo93305a(Property.RearMusicAutoLoop));
            } else {
                C15389d dVar2 = this.f121692e;
                String str2 = vEPreviewMusicParams.f121606a;
                C7573i.m23582a((Object) str2, "params.mPath");
                this.f121694g = dVar2.mo38783a(str2, vEPreviewMusicParams.f121607b, vEPreviewMusicParams.f121607b + vEPreviewMusicParams.f121609d, C35563c.f93231M.mo93305a(Property.RearMusicAutoLoop));
            }
            this.f121692e.mo38803a(this.f121694g, 1, vEPreviewMusicParams.f121610e);
        } else if (vEPreviewMusicParams.mo119477a()) {
            this.f121692e.mo38803a(this.f121727r, 1, vEPreviewMusicParams.f121610e);
        } else {
            this.f121692e.mo38803a(0, 1, vEPreviewMusicParams.f121610e);
        }
        return false;
    }

    /* renamed from: a */
    public final int mo119531a(Context context, C15389d dVar, VEPreviewParams vEPreviewParams) {
        StatusCreateVideoData statusCreateVideoData;
        super.mo119531a(context, dVar, vEPreviewParams);
        if (vEPreviewParams != null) {
            statusCreateVideoData = vEPreviewParams.statusCreateVideoData;
        } else {
            statusCreateVideoData = null;
        }
        int i = 0;
        if (statusCreateVideoData != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (!TextUtils.isEmpty(statusCreateVideoData.getBgPath())) {
                arrayList.add(statusCreateVideoData.getBgPath());
                arrayList2.add("bgimg");
            }
            int size = arrayList.size();
            String[] strArr = new String[size];
            for (int i2 = 0; i2 < size; i2++) {
                strArr[i2] = (String) arrayList.get(i2);
            }
            int size2 = arrayList2.size();
            String[] strArr2 = new String[size2];
            while (i < size2) {
                strArr2[i] = (String) arrayList2.get(i);
                i++;
            }
            if (!TextUtils.isEmpty(statusCreateVideoData.getMusicPath())) {
                C15389d dVar2 = this.f121692e;
                C15393h hVar = new C15393h(statusCreateVideoData.getEffectPath(), strArr, strArr2, statusCreateVideoData.getMusicPath(), 0, 1000);
                i = dVar2.mo38772a((C15390e) hVar);
            } else {
                C15389d dVar3 = this.f121692e;
                C15393h hVar2 = new C15393h(statusCreateVideoData.getEffectPath(), strArr, strArr2, null, 0, 0, 56, null);
                i = dVar3.mo38772a((C15390e) hVar2);
            }
            this.f121698k = statusCreateVideoData.getMusicIds();
            this.f121728s = statusCreateVideoData.getMusicPath();
        }
        return i;
    }
}
