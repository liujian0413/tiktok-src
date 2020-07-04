package com.p280ss.android.ugc.trill.share;

import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.trill.app.TrillApplication;
import java.io.File;

/* renamed from: com.ss.android.ugc.trill.share.a */
public final class C45077a {
    /* renamed from: a */
    public static void m142190a(String str, String str2, boolean z) {
        if (C45082b.m142198a(TrillApplication.m21341a())) {
            C6877n.m21447a("aweme_share_monitor", C6869c.m21381a().mo16887a("filePath", str2).mo16887a("share_platform", str).mo16887a("fileLength", String.valueOf(new File(str2).length())).mo16887a("fileExist", String.valueOf(z)).mo16888b());
        }
    }
}
