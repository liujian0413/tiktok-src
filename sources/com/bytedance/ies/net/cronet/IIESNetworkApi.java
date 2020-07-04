package com.bytedance.ies.net.cronet;

import com.bytedance.retrofit2.C12466b;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p264b.C6447a;
import com.bytedance.retrofit2.p264b.C6449ab;
import com.bytedance.retrofit2.p264b.C6450ac;
import com.bytedance.retrofit2.p264b.C6451b;
import com.bytedance.retrofit2.p264b.C6452c;
import com.bytedance.retrofit2.p264b.C6453d;
import com.bytedance.retrofit2.p264b.C6455f;
import com.bytedance.retrofit2.p264b.C6456g;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6461l;
import com.bytedance.retrofit2.p264b.C6463n;
import com.bytedance.retrofit2.p264b.C6465p;
import com.bytedance.retrofit2.p264b.C6468s;
import com.bytedance.retrofit2.p264b.C6469t;
import com.bytedance.retrofit2.p264b.C6471v;
import com.bytedance.retrofit2.p264b.C6475z;
import com.bytedance.retrofit2.p637a.C12461b;
import java.util.List;
import java.util.Map;

public interface IIESNetworkApi {
    @C6452c
    C12466b<String> doDetete(@C6463n int i, @C6450ac String str, @C6475z Map<String, String> map, @C6461l List<C12461b> list, @C6453d Object obj);

    @C6457h
    C12466b<String> doGet(@C6447a boolean z, @C6463n int i, @C6450ac String str, @C6475z(mo15759a = true) Map<String, String> map, @C6461l List<C12461b> list, @C6453d Object obj);

    @C6456g
    @C6468s
    C12466b<String> doPost(@C6463n int i, @C6450ac String str, @C6475z Map<String, String> map, @C6455f(mo15739a = true) Map<String, String> map2, @C6461l List<C12461b> list, @C6453d Object obj);

    @C6469t
    @C6456g
    C12466b<String> doPut(@C6463n int i, @C6450ac String str, @C6475z Map<String, String> map, @C6455f(mo15739a = true) Map<String, String> map2, @C6461l List<C12461b> list, @C6453d Object obj);

    @C6449ab
    @C6457h
    C12466b<TypedInput> downloadFile(@C6447a boolean z, @C6463n int i, @C6450ac String str, @C6475z(mo15759a = true) Map<String, String> map);

    @C6449ab
    @C6457h
    C12466b<TypedInput> downloadFile(@C6447a boolean z, @C6463n int i, @C6450ac String str, @C6475z(mo15759a = true) Map<String, String> map, @C6461l List<C12461b> list);

    @C6449ab
    @C6457h
    C12466b<TypedInput> downloadFile(@C6447a boolean z, @C6463n int i, @C6450ac String str, @C6475z(mo15759a = true) Map<String, String> map, @C6461l List<C12461b> list, @C6453d Object obj);

    @C6468s
    C12466b<String> postBody(@C6463n int i, @C6450ac String str, @C6475z(mo15759a = true) Map<String, String> map, @C6451b TypedOutput typedOutput, @C6461l List<C12461b> list, @C6453d Object obj);

    @C6465p
    @C6468s
    C12466b<String> postMultiPart(@C6463n int i, @C6450ac String str, @C6475z(mo15759a = true) Map<String, String> map, @C6471v Map<String, TypedOutput> map2, @C6461l List<C12461b> list, @C6453d Object obj);

    @C6469t
    C12466b<String> putBody(@C6463n int i, @C6450ac String str, @C6475z(mo15759a = true) Map<String, String> map, @C6451b TypedOutput typedOutput, @C6461l List<C12461b> list, @C6453d Object obj);
}
