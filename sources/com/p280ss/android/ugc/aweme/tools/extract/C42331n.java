package com.p280ss.android.ugc.aweme.tools.extract;

import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.p280ss.android.ugc.aweme.tools.extract.C42320g.C42321a;
import com.p280ss.android.vesdk.VEUtils;
import com.p280ss.android.vesdk.filterparam.VETransitionFilterParam;
import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.tools.extract.n */
public final class C42331n extends C42312a {

    /* renamed from: e */
    private int f110108e;

    /* renamed from: f */
    private EditPreviewInfo f110109f;

    /* renamed from: a */
    public final void mo103790a() {
        super.mo103790a();
    }

    /* renamed from: f */
    public final String mo103802f() {
        return "extract_upload";
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final /* synthetic */ Void mo103814g() throws Exception {
        if (this.f110109f == null || this.f110109f.getVideoList().isEmpty()) {
            return null;
        }
        String str = this.f110077c.f110088a;
        if (!str.endsWith(File.separator)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(File.separator);
            str = sb.toString();
        }
        int i = 0;
        for (EditVideoSegment editVideoSegment : this.f110109f.getVideoList()) {
            String videoPath = editVideoSegment.getVideoPath();
            int[] a = m134619a(editVideoSegment);
            int i2 = C42319f.f110087a[0];
            StringBuilder sb2 = new StringBuilder();
            int i3 = i + 1;
            sb2.append(i);
            sb2.append("extract_frame");
            VEUtils.saveVideoFrames(videoPath, a, i2, -1, false, str, sb2.toString(), 1);
            i = i3;
        }
        File[] listFiles = new File(str).listFiles();
        if (listFiles != null && listFiles.length > 0) {
            for (File absolutePath : listFiles) {
                this.f110075a.addFrameAtLastSegment(absolutePath.getAbsolutePath());
            }
        }
        return null;
    }

    public C42331n(EditPreviewInfo editPreviewInfo) {
        this.f110109f = editPreviewInfo;
    }

    /* renamed from: a */
    public final void mo103792a(C42321a aVar) {
        super.mo103792a(aVar);
        if (m134573b()) {
            C1592h.m7853a((Callable<TResult>) new C42332o<TResult>(this)).mo6875a((C1591g<TResult, TContinuationResult>) new C42333p<TResult,TContinuationResult>(this, aVar));
        }
    }

    /* renamed from: a */
    private int[] m134619a(EditVideoSegment editVideoSegment) {
        int[] iArr;
        int i = 0;
        if (editVideoSegment.getVideoCutInfo() != null) {
            VideoCutInfo videoCutInfo = editVideoSegment.getVideoCutInfo();
            this.f110108e = ((int) (videoCutInfo.getEnd() - videoCutInfo.getStart())) / VETransitionFilterParam.TransitionDuration_DEFAULT;
            iArr = new int[this.f110108e];
            while (i < this.f110108e) {
                iArr[i] = (int) (videoCutInfo.getStart() + ((long) (i * VETransitionFilterParam.TransitionDuration_DEFAULT)));
                i++;
            }
        } else {
            this.f110108e = (int) (editVideoSegment.getVideoFileInfo().getDuration() / 500);
            iArr = new int[this.f110108e];
            while (i < this.f110108e) {
                iArr[i] = i * VETransitionFilterParam.TransitionDuration_DEFAULT;
                i++;
            }
        }
        return iArr;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo103813a(C42321a aVar, C1592h hVar) throws Exception {
        aVar.mo96560a(hVar.mo6882b());
        mo103794a(true);
        mo103790a();
        return null;
    }
}
