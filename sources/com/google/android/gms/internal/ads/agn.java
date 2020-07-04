package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public interface agn extends ExecutorService {
    /* renamed from: a */
    agj<?> mo39292a(Runnable runnable);

    /* renamed from: a */
    <T> agj<T> mo39293a(Callable<T> callable);
}
