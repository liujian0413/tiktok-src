package com.bytedance.frameworks.baselib.network.http.retrofit;

import com.bytedance.frameworks.baselib.network.dispatcher.C10094a;
import com.bytedance.frameworks.baselib.network.dispatcher.C10096c;
import com.bytedance.frameworks.baselib.network.dispatcher.C10100e;
import com.bytedance.frameworks.baselib.network.dispatcher.IRequest.Priority;
import com.bytedance.retrofit2.C12535u;
import java.util.concurrent.Executor;

/* renamed from: com.bytedance.frameworks.baselib.network.http.retrofit.c */
public final class C10180c implements Executor {

    /* renamed from: a */
    private static volatile C10096c f27712a;

    public final void execute(Runnable runnable) {
        int i;
        Priority priority;
        Priority priority2;
        if (runnable != null) {
            Priority priority3 = Priority.NORMAL;
            boolean z = false;
            if (runnable instanceof C12535u) {
                C12535u uVar = (C12535u) runnable;
                int a = uVar.mo30428a();
                if (a == 0) {
                    priority2 = Priority.LOW;
                } else {
                    if (1 != a) {
                        if (2 == a) {
                            priority2 = Priority.HIGH;
                        } else if (3 == a) {
                            priority2 = Priority.IMMEDIATE;
                        }
                    }
                    priority2 = Priority.NORMAL;
                }
                z = uVar.mo30429b();
                i = uVar.mo30430c();
                priority = priority2;
            } else {
                priority = priority3;
                i = 0;
            }
            if (f27712a == null) {
                f27712a = C10100e.m29991b();
            }
            C10094a aVar = new C10094a("NetExecutor", priority, i, runnable, z);
            if (z) {
                f27712a.mo24750a(aVar);
                return;
            }
            f27712a.mo24751b(aVar);
        }
    }
}
