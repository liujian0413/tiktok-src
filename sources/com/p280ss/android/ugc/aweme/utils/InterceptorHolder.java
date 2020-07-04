package com.p280ss.android.ugc.aweme.utils;

import com.bytedance.retrofit2.p638c.C12469a;
import com.p280ss.android.ugc.aweme.lancet.ssretrofitchain.VerifyInterceptor;
import com.p280ss.android.ugc.aweme.net.InterceptorProvider;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.utils.InterceptorHolder */
public class InterceptorHolder implements InterceptorProvider {
    public List<C12469a> getInterceptors() {
        return Arrays.asList(new C12469a[]{new VerifyInterceptor()});
    }
}
