package com.p280ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import com.p280ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordNewActivity;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42156aw;
import com.p280ss.android.ugc.aweme.tools.C42159az;
import com.p280ss.android.ugc.aweme.tools.C42161ba;
import com.p280ss.android.ugc.aweme.tools.C42568n;
import java.io.File;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.z */
public final class C41712z implements C42161ba {

    /* renamed from: a */
    VideoRecordNewActivity f108578a;

    /* renamed from: b */
    ASCameraView f108579b;

    public C41712z(VideoRecordNewActivity videoRecordNewActivity, ASCameraView aSCameraView) {
        this.f108578a = videoRecordNewActivity;
        this.f108579b = aSCameraView;
    }

    /* renamed from: a */
    public final <T extends C42155av> C42159az<T> mo96095a(C42156aw awVar, Type type) {
        if (type != C42568n.class) {
            return null;
        }
        return new C42159az<T>() {
            /* renamed from: a */
            public final void mo96096a(Object obj, T t) {
                C42568n nVar = (C42568n) t;
                AVMusic aVMusic = nVar.f110702a;
                String str = nVar.f110703b;
                boolean c = C41712z.this.f108578a.f107286a.mo96141c();
                C41712z.this.f108579b.mo56289i(true);
                C41712z.this.f108578a.f107286a.f99775k.mo96312a(new File(str));
                C41712z.this.f108578a.f107286a.f99769e = str;
                C41712z.this.f108579b.setMusicPath(str);
                C41712z.this.f108579b.mo56226a(str, 0, 0);
                C41712z.this.f108579b.mo56249d(true);
                C41712z.this.f108578a.f107324j.mo100299a(true);
                if (!c) {
                    C41712z.this.f108579b.mo56233b((Context) C41712z.this.f108578a, C41712z.this.f108578a.f107322h.mo100104a());
                }
                int i = aVMusic.duration;
                if (i > 0) {
                    C41712z.this.f108578a.f107286a.f99771g = i;
                }
                UrlModel urlModel = aVMusic.audioTrack;
                if (urlModel != null) {
                    C41712z.this.f108578a.f107286a.f99768d = urlModel;
                }
                C41712z.this.f108578a.f107286a.f99770f = 0;
                C41712z.this.f108578a.mo101860q();
            }
        };
    }
}
