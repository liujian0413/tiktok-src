package com.p280ss.android.ugc.aweme.shortvideo;

import com.bytedance.retrofit2.C12466b;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p264b.C6447a;
import com.bytedance.retrofit2.p264b.C6450ac;
import com.bytedance.retrofit2.p264b.C6451b;
import com.bytedance.retrofit2.p264b.C6453d;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6461l;
import com.bytedance.retrofit2.p264b.C6463n;
import com.bytedance.retrofit2.p264b.C6468s;
import com.bytedance.retrofit2.p264b.C6469t;
import com.bytedance.retrofit2.p264b.C6475z;
import com.bytedance.retrofit2.p637a.C12461b;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.IUploadFileApi */
public interface IUploadFileApi {
    @C6457h
    C12466b<String> doGet(@C6447a boolean z, @C6463n int i, @C6450ac String str, @C6475z(mo15759a = true) Map<String, String> map, @C6461l List<C12461b> list, @C6453d Object obj);

    @C6469t
    C12466b<String> doPut(@C6463n int i, @C6451b TypedOutput typedOutput, @C6450ac String str, @C6475z(mo15759a = true) Map<String, String> map, @C6461l List<C12461b> list, @C6453d Object obj);

    @C6468s
    C12466b<String> postBody(@C6463n int i, @C6451b TypedOutput typedOutput, @C6450ac String str, @C6475z(mo15759a = true) Map<String, String> map, @C6461l List<C12461b> list, @C6453d Object obj);
}
