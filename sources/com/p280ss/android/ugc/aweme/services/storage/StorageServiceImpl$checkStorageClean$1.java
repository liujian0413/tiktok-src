package com.p280ss.android.ugc.aweme.services.storage;

import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.effect.IEffectService;
import com.p280ss.android.ugc.aweme.utils.C42973bg;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.services.storage.StorageServiceImpl$checkStorageClean$1 */
final class StorageServiceImpl$checkStorageClean$1<V> implements Callable<TResult> {
    public static final StorageServiceImpl$checkStorageClean$1 INSTANCE = new StorageServiceImpl$checkStorageClean$1();

    StorageServiceImpl$checkStorageClean$1() {
    }

    public final void call() {
        IEffectService effectService = ((IAVService) ServiceManager.get().getService(IAVService.class)).effectService();
        C7573i.m23582a((Object) effectService, "ServiceManager.get().get…         .effectService()");
        C42973bg.m136431c(effectService.getCacheDir());
    }
}
