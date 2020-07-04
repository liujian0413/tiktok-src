package com.p280ss.android.ugc.aweme.crossplatform.activity;

import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.abmock.p260a.C6381a;
import com.bytedance.ies.abmock.p260a.C6382b;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@C6381a(mo15284a = "webview_cache_pool_switch")
/* renamed from: com.ss.android.ugc.aweme.crossplatform.activity.WebViewPoolExperiment */
public interface WebViewPoolExperiment {
    @C6382b(mo15285a = true)
    public static final String[] URLS = null;

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.activity.WebViewPoolExperiment$a */
    public static class C25815a {
        /* renamed from: a */
        public static List<String> m84915a() {
            try {
                String[] strArr = (String[]) C6384b.m19835a().mo15289a(WebViewPoolExperiment.class, true, "webview_cache_pool_switch", (Object) C6384b.m19835a().mo15295d().webview_cache_pool_switch);
                if (strArr != null) {
                    return Arrays.asList(strArr);
                }
            } catch (Throwable unused) {
            }
            return Collections.emptyList();
        }
    }
}
