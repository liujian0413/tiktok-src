package com.p280ss.android.ugc.aweme.services.storage;

import com.p280ss.android.ugc.aweme.storage.p1647e.C41936a;
import com.p280ss.android.ugc.aweme.storage.p1647e.C41938b;
import com.p280ss.android.ugc.aweme.storage.p1647e.C41940c;
import com.p280ss.android.ugc.aweme.storage.p1647e.C41941d;
import com.p280ss.android.ugc.aweme.storage.p1647e.C41943f;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.services.storage.AVStorageManagerImpl */
public final class AVStorageManagerImpl implements C41936a {
    static final /* synthetic */ C7595j[] $$delegatedProperties = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(AVStorageManagerImpl.class), "monitor", "getMonitor()Lcom/ss/android/ugc/aweme/storage/services/IAVStorageMonitor;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(AVStorageManagerImpl.class), "whiteListService", "getWhiteListService()Lcom/ss/android/ugc/aweme/storage/services/IStorageWhiteListService;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(AVStorageManagerImpl.class), "fileProvider", "getFileProvider()Lcom/ss/android/ugc/aweme/storage/services/IFileProvider;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(AVStorageManagerImpl.class), "persistedWhiteListManager", "getPersistedWhiteListManager()Lcom/ss/android/ugc/aweme/storage/services/IPersistedWhiteListManager;"))};
    private final C7541d fileProvider$delegate = C7546e.m23569a(AVStorageManagerImpl$fileProvider$2.INSTANCE);
    private final C7541d monitor$delegate = C7546e.m23569a(AVStorageManagerImpl$monitor$2.INSTANCE);
    private final C7541d persistedWhiteListManager$delegate = C7546e.m23569a(AVStorageManagerImpl$persistedWhiteListManager$2.INSTANCE);
    private final C7541d whiteListService$delegate = C7546e.m23569a(AVStorageManagerImpl$whiteListService$2.INSTANCE);

    public final C41940c getFileProvider() {
        return (C41940c) this.fileProvider$delegate.getValue();
    }

    public final C41938b getMonitor() {
        return (C41938b) this.monitor$delegate.getValue();
    }

    public final C41941d getPersistedWhiteListManager() {
        return (C41941d) this.persistedWhiteListManager$delegate.getValue();
    }

    public final C41943f getWhiteListService() {
        return (C41943f) this.whiteListService$delegate.getValue();
    }
}
