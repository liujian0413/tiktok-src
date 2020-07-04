package com.p280ss.android.ugc.aweme.account.network;

import com.bytedance.retrofit2.C12466b;
import com.bytedance.retrofit2.p264b.C6450ac;
import com.bytedance.retrofit2.p264b.C6455f;
import com.bytedance.retrofit2.p264b.C6456g;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6463n;
import com.bytedance.retrofit2.p264b.C6468s;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.account.network.IAccountNetworkApi */
public interface IAccountNetworkApi {
    @C6457h
    C12466b<String> getResponse(@C6450ac String str, @C6463n int i);

    @C6456g
    @C6468s
    C12466b<String> getResponse(@C6450ac String str, @C6455f Map<String, String> map, @C6463n int i);
}
