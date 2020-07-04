package com.bytedance.apm.impl;

import com.bytedance.retrofit2.C12466b;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p264b.C6450ac;
import com.bytedance.retrofit2.p264b.C6451b;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6461l;
import com.bytedance.retrofit2.p264b.C6468s;
import com.bytedance.retrofit2.p264b.C6475z;
import com.bytedance.retrofit2.p637a.C12461b;
import java.util.List;
import java.util.Map;

public interface RetrofitMonitorService {
    @C6457h
    C12466b<TypedInput> fetch(@C6450ac String str, @C6475z Map<String, String> map);

    @C6468s
    C12466b<TypedInput> report(@C6450ac String str, @C6451b TypedOutput typedOutput, @C6461l List<C12461b> list);
}
