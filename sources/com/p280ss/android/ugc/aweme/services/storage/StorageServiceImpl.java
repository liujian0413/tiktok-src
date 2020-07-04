package com.p280ss.android.ugc.aweme.services.storage;

import bolts.C1592h;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.storage.C41891a;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.services.storage.StorageServiceImpl */
public final class StorageServiceImpl implements IAVStorageService {
    public final void checkStorageClean() {
        if (C41891a.m133230a()) {
            C41530am.m132285d("av storage clean not finished last time!!!! effect resources maybe not intact");
            C1592h.m7853a((Callable<TResult>) StorageServiceImpl$checkStorageClean$1.INSTANCE);
        }
    }

    public final Set<String> getPrefixWhiteList() {
        return C35574k.m114859a().mo70094i().mo102931b().mo102969a();
    }

    public final boolean isMonitorEnabled() {
        return C35574k.m114859a().mo70094i().mo102929a().mo102962a();
    }

    public final void setMonitorLocalSwitch(boolean z) {
        C35574k.m114859a().mo70094i().mo102929a().mo102961a(z);
    }
}
