package com.p280ss.android.ugc.aweme.commercialize.splash;

import com.bytedance.retrofit2.C12466b;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p264b.C6448aa;
import com.bytedance.retrofit2.p264b.C6450ac;
import com.bytedance.retrofit2.p264b.C6451b;
import com.bytedance.retrofit2.p264b.C6455f;
import com.bytedance.retrofit2.p264b.C6456g;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6460k;
import com.bytedance.retrofit2.p264b.C6463n;
import com.bytedance.retrofit2.p264b.C6468s;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.commercialize.splash.SplashAdApi */
public interface SplashAdApi {
    @C6457h
    C12466b<String> executeGet(@C6463n int i, @C6450ac String str);

    @C6457h
    @C6448aa(mo15735a = "vas_ad_track")
    C12466b<String> executeGet(@C6463n int i, @C6450ac String str, @C6460k(mo15745a = "User-Agent") String str2);

    @C6468s
    C12466b<String> executePost(@C6463n int i, @C6450ac String str, @C6451b TypedOutput typedOutput);

    @C6456g
    @C6468s
    C12466b<String> executePost(@C6463n int i, @C6450ac String str, @C6455f Map<String, String> map);
}
