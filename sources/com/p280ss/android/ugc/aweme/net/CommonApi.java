package com.p280ss.android.ugc.aweme.net;

import com.bytedance.retrofit2.C12466b;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p264b.C6450ac;
import com.bytedance.retrofit2.p264b.C6451b;
import com.bytedance.retrofit2.p264b.C6452c;
import com.bytedance.retrofit2.p264b.C6455f;
import com.bytedance.retrofit2.p264b.C6456g;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6461l;
import com.bytedance.retrofit2.p264b.C6463n;
import com.bytedance.retrofit2.p264b.C6468s;
import com.bytedance.retrofit2.p264b.C6469t;
import com.bytedance.retrofit2.p264b.C6475z;
import com.bytedance.retrofit2.p637a.C12461b;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.net.CommonApi */
public interface CommonApi {
    @C6452c
    C12466b<String> doDelete(@C6450ac String str);

    @C6452c
    C12466b<String> doDelete(@C6450ac String str, @C6463n int i, @C6461l List<C12461b> list);

    @C6452c
    C12466b<String> doDelete(@C6450ac String str, @C6461l List<C12461b> list);

    @C6452c
    C12466b<String> doDelete(@C6450ac String str, @C6475z Map<String, String> map);

    @C6457h
    C12466b<String> doGet(@C6450ac String str);

    @C6457h
    C12466b<String> doGet(@C6450ac String str, @C6463n int i);

    @C6457h
    C12466b<String> doGet(@C6450ac String str, @C6463n int i, @C6475z Map<String, String> map);

    @C6457h
    C12466b<String> doGet(@C6450ac String str, @C6475z Map<String, String> map);

    @C6457h
    C12466b<String> doGet(@C6450ac String str, @C6475z Map<String, String> map, @C6461l List<C12461b> list);

    @C6456g
    @C6468s
    C12466b<String> doPost(@C6450ac String str, @C6463n int i, @C6455f Map<String, String> map);

    @C6456g
    @C6468s
    C12466b<String> doPost(@C6450ac String str, @C6463n int i, @C6455f Map<String, String> map, @C6475z Map<String, String> map2);

    @C6456g
    @C6468s
    C12466b<String> doPost(@C6450ac String str, @C6455f Map<String, String> map);

    @C6456g
    @C6468s
    C12466b<String> doPost(@C6450ac String str, @C6455f Map<String, String> map, @C6461l List<C12461b> list);

    @C6468s
    C12466b<String> postBody(@C6450ac String str, @C6451b TypedOutput typedOutput, @C6461l List<C12461b> list);

    @C6469t
    C12466b<String> putBody(@C6450ac String str, @C6451b TypedOutput typedOutput, @C6461l List<C12461b> list);
}
