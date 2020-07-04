package com.toutiao.proxyserver.net;

import com.bytedance.retrofit2.C12466b;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.p264b.C6449ab;
import com.bytedance.retrofit2.p264b.C6450ac;
import com.bytedance.retrofit2.p264b.C6453d;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6458i;
import com.bytedance.retrofit2.p264b.C6461l;
import com.bytedance.retrofit2.p264b.C6475z;
import com.bytedance.retrofit2.p637a.C12461b;
import java.util.List;
import java.util.Map;

public interface INetApi {
    @C6449ab
    @C6457h
    C12466b<TypedInput> get(@C6450ac String str, @C6475z Map<String, String> map, @C6461l List<C12461b> list, @C6453d Object obj);

    @C6458i
    C12466b<Void> head(@C6450ac String str, @C6475z Map<String, String> map, @C6461l List<C12461b> list, @C6453d Object obj);
}
