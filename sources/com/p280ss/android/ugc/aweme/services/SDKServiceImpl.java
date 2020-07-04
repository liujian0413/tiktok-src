package com.p280ss.android.ugc.aweme.services;

import android.arch.lifecycle.C0052o;
import com.p280ss.android.medialib.FFMpegManager;
import com.p280ss.android.medialib.FFMpegManager.C19611a;
import com.p280ss.android.ugc.aweme.services.ISDKService.VideoSplitMessage;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.shortvideo.videoprocess.C41639c;
import com.p280ss.android.vesdk.VEEditor;
import com.p280ss.android.vesdk.VEEditor.VIDEO_RATIO;
import com.p280ss.android.vesdk.VEException;
import com.p280ss.android.vesdk.VEListener.C45215k;
import com.p280ss.android.vesdk.VEVideoEncodeSettings.C45244a;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.services.SDKServiceImpl */
public final class SDKServiceImpl implements ISDKService {
    public final int uninitVideoToGraph() {
        return FFMpegManager.m64569a().mo51829b();
    }

    public final int checkAudioFile(String str) {
        C7573i.m23587b(str, "path");
        return C41639c.m132544a(str);
    }

    public final int[] initVideoToGraph(String str) {
        C7573i.m23587b(str, "videoPath");
        int[] a = FFMpegManager.m64569a().mo51828a(str);
        C7573i.m23582a((Object) a, "FFMpegManager.getInstanc…itVideoToGraph(videoPath)");
        return a;
    }

    public final void split(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, C0052o<VideoSplitMessage> oVar) {
        C7573i.m23587b(str, "workspace");
        C7573i.m23587b(oVar, "splitResult");
        try {
            VEEditor vEEditor = new VEEditor(str);
            vEEditor.mo107906a(new String[]{str2}, (String[]) null, (String[]) null, VIDEO_RATIO.VIDEO_OUT_RATIO_ORIGINAL);
            vEEditor.mo107966j();
            if (vEEditor.mo107993w() < i4) {
                oVar.postValue(new VideoSplitMessage(-1));
            }
            vEEditor.mo107917a(str4, str3, new C45244a(2).mo108149a(i, i2).mo108148a(i3).mo108162a(), (C45215k) new SDKServiceImpl$split$1(oVar));
        } catch (VEException e) {
            oVar.postValue(new VideoSplitMessage(-1));
            StringBuilder sb = new StringBuilder("VEEditor compile failed, ret = ");
            sb.append(e.getRetCd());
            sb.append(", e: ");
            sb.append(e.getMsgDes());
            C41530am.m132283b(sb.toString());
        }
    }

    public final int rencodeAndSplitFile(String str, String str2, String str3, int i, int i2, int i3, long j, long j2, int i4, int i5, boolean z) {
        C7573i.m23587b(str, "inVideo");
        C7573i.m23587b(str2, "outVideo");
        C7573i.m23587b(str3, "outWAV");
        C19611a aVar = new C19611a();
        aVar.f53052a = str;
        aVar.f53053b = str2;
        aVar.f53054c = str3;
        aVar.f53066o = i;
        aVar.f53067p = i2;
        aVar.f53057f = i3;
        aVar.f53055d = j;
        aVar.f53056e = j2;
        aVar.f53061j = i4;
        aVar.f53065n = i5;
        aVar.f53072u = z;
        return FFMpegManager.m64569a().mo51824a(aVar);
    }
}
