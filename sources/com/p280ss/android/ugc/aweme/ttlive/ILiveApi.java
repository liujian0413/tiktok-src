package com.p280ss.android.ugc.aweme.ttlive;

import com.bytedance.retrofit2.C12466b;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p264b.C6447a;
import com.bytedance.retrofit2.p264b.C6451b;
import com.bytedance.retrofit2.p264b.C6453d;
import com.bytedance.retrofit2.p264b.C6463n;
import java.util.Map;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7734j;
import retrofit2.p363b.C7739o;
import retrofit2.p363b.C7747w;
import retrofit2.p363b.C7748x;

/* renamed from: com.ss.android.ugc.aweme.ttlive.ILiveApi */
public interface ILiveApi {
    @C7730f
    @C7747w
    C12466b<TypedInput> downloadFile(@C6447a boolean z, @C6463n int i, @C7748x String str, @C7734j Map<String, String> map, @C6453d Object obj);

    @C7730f
    C12466b<TypedInput> get(@C7748x String str, @C7734j Map<String, String> map);

    @C7739o
    C12466b<TypedInput> post(@C7748x String str, @C6451b TypedByteArray typedByteArray, @C7734j Map<String, String> map);

    @C7739o
    C12466b<TypedInput> postMultiPart(@C6463n int i, @C7748x String str, @C7734j Map<String, String> map, @C6451b TypedOutput typedOutput);
}
