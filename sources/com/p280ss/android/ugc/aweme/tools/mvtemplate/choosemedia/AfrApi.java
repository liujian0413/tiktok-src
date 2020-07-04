package com.p280ss.android.ugc.aweme.tools.mvtemplate.choosemedia;

import com.bytedance.retrofit2.mime.TypedFile;
import com.bytedance.retrofit2.p264b.C6465p;
import com.bytedance.retrofit2.p264b.C6468s;
import com.bytedance.retrofit2.p264b.C6470u;
import com.bytedance.retrofit2.p264b.C6474y;
import com.bytedance.retrofit2.p264b.C6475z;
import java.util.Map;
import p346io.reactivex.C7492s;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.choosemedia.AfrApi */
public interface AfrApi {

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.choosemedia.AfrApi$a */
    public static final class C42523a {
    }

    @C6465p
    @C6468s(mo15750a = "/media/api/pic/afr")
    C7492s<AfrApiResponse> getAfrMask(@C6474y(mo15757a = "algorithms") String str, @C6474y(mo15757a = "key") String str2, @C6470u(mo15752a = "file") TypedFile typedFile, @C6475z Map<String, String> map);
}
