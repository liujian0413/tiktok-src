package com.p280ss.android.ugc.aweme.share;

import com.p280ss.android.ugc.aweme.legacy.download.C32331a;
import com.p280ss.android.ugc.iesdownload.C44854e.C44856a;
import com.p280ss.android.ugc.iesdownload.p1745b.C44849d;
import java.io.File;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.j */
public final class C38238j {

    /* renamed from: a */
    private C44849d f99395a;

    /* renamed from: a */
    public final void mo95822a(C44849d dVar) {
        C7573i.m23587b(dVar, "downloadListener");
        this.f99395a = dVar;
    }

    /* renamed from: a */
    public final void mo95823a(String str, String str2, boolean z) {
        C7573i.m23587b(str, "url");
        C7573i.m23587b(str2, "filePath");
        if (!new File(str2).getParentFile().exists()) {
            new File(str2).getParentFile().mkdir();
        }
        C32331a.m104891a(new C44856a().mo107294a(str).mo107298b(str2).mo107297a(), this.f99395a);
    }
}
