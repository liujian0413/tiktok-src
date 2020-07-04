package com.p280ss.android.ugc.aweme.crossplatform.platform.webview;

import android.webkit.WebResourceResponse;
import com.p280ss.android.ugc.aweme.crossplatform.platform.webview.C25978j.C25979a;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.i */
public final class C25977i {

    /* renamed from: a */
    private final String f68685a;

    public C25977i(String str) {
        C7573i.m23587b(str, "mRef");
        this.f68685a = str;
    }

    /* renamed from: a */
    public final WebResourceResponse mo67428a(String str) {
        C7573i.m23587b(str, "url");
        return C25979a.m85338a().mo67429a(this.f68685a, str);
    }
}
