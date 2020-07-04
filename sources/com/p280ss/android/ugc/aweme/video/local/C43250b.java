package com.p280ss.android.ugc.aweme.video.local;

import com.aweme.storage.C1913c;
import com.p280ss.android.ugc.aweme.feedback.runtime.behavior.C29096c.C29097a;
import com.p280ss.android.ugc.aweme.legacy.download.C32331a;
import com.p280ss.android.ugc.aweme.video.local.LocalVideoPlayerManager.C43246a;
import com.p280ss.android.ugc.iesdownload.C44854e;
import com.p280ss.android.ugc.iesdownload.p1745b.C44849d;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.video.local.b */
public class C43250b {

    /* renamed from: a */
    private static final String f111971a = "b";

    /* renamed from: a */
    public static void m137222a(String str, final C44854e eVar, final C44849d dVar) {
        if (!LocalVideoPlayerManager.m137195a().mo104995a(str, eVar.f115343c, (C43246a) new C43246a() {
            /* renamed from: a */
            public final void mo100065a() {
                C32331a.m104891a(eVar, dVar);
            }

            /* renamed from: a */
            public final void mo100066a(String str) {
                File file = new File(str);
                C29097a.m95452a().mo74527a("download_success");
                dVar.mo59408a(100, file.length(), file.length());
                dVar.mo59412a(str);
            }
        })) {
            C1913c.m8857a("duet");
            C32331a.m104891a(eVar, dVar);
        }
    }
}
