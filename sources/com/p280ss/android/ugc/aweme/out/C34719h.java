package com.p280ss.android.ugc.aweme.out;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.common.base.C17454q;
import com.p280ss.android.ttve.nativePort.TENativeLibsLoader;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.IPreloadVESo;
import com.p280ss.android.ugc.aweme.services.PreloadVESoStatus;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.ugc.aweme.out.h */
public final class C34719h implements IPreloadVESo {

    /* renamed from: a */
    private volatile PreloadVESoStatus f90517a = PreloadVESoStatus.UNLOAD;

    /* renamed from: b */
    private volatile long f90518b = -1;

    /* renamed from: c */
    private final C17454q f90519c = C17454q.m58001a();

    public final long getPreLoadVESoCostTime() {
        return this.f90518b;
    }

    public final PreloadVESoStatus getPreLoadVESoStatus() {
        return this.f90517a;
    }

    public final void preLoadVESo() {
        this.f90519c.mo44942c();
        this.f90517a = PreloadVESoStatus.LOADING;
        if (C35563c.f93231M.mo93305a(Property.OpenCameraFrameOptimizePreLoadSo)) {
            TENativeLibsLoader.m67984a(true);
            if (C6399b.m19944t()) {
                TENativeLibsLoader.m67982a(((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().getLibraryLoader(C35563c.f93238a));
            }
            TENativeLibsLoader.m67987d();
            C35563c.m114839f();
        }
        this.f90517a = PreloadVESoStatus.LOADED;
        this.f90519c.mo44943d();
        this.f90518b = this.f90519c.mo44941a(TimeUnit.MILLISECONDS);
        this.f90519c.mo44944e();
    }
}
