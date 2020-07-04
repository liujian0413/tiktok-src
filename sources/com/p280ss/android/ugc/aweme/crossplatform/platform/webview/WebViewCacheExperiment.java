package com.p280ss.android.ugc.aweme.crossplatform.platform.webview;

import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.abmock.p260a.C6381a;
import com.bytedance.ies.abmock.p260a.C6382b;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@C6381a(mo15284a = "webview_cache_urls")
/* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.WebViewCacheExperiment */
public interface WebViewCacheExperiment {
    @C6382b(mo15285a = true)
    public static final String[] CACHE_URLS = null;

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.WebViewCacheExperiment$a */
    public static class C25960a {
        /* renamed from: a */
        public static List<String> m85279a() {
            try {
                String[] strArr = (String[]) C6384b.m19835a().mo15289a(WebViewCacheExperiment.class, true, "webview_cache_urls", (Object) C6384b.m19835a().mo15295d().webview_cache_urls);
                if (strArr != null) {
                    return Arrays.asList(strArr);
                }
            } catch (Throwable unused) {
            }
            return Collections.emptyList();
        }
    }
}
