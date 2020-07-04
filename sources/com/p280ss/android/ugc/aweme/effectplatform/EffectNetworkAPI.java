package com.p280ss.android.ugc.aweme.effectplatform;

import com.bytedance.retrofit2.C12466b;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.p264b.C6447a;
import com.bytedance.retrofit2.p264b.C6449ab;
import com.bytedance.retrofit2.p264b.C6450ac;
import com.bytedance.retrofit2.p264b.C6451b;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6463n;
import com.bytedance.retrofit2.p264b.C6468s;
import com.bytedance.retrofit2.p264b.C6475z;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.effectplatform.EffectNetworkAPI */
public interface EffectNetworkAPI {
    @C6449ab
    @C6457h
    C12466b<TypedInput> doGet(@C6447a boolean z, @C6463n int i, @C6450ac String str, @C6475z(mo15759a = true) Map<String, String> map);

    @C6449ab
    @C6468s
    C12466b<TypedInput> doPost(@C6447a boolean z, @C6463n int i, @C6450ac String str, @C6451b Map<String, Object> map);
}
