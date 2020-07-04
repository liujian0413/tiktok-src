package com.p280ss.android.ugc.aweme.legoImp.service;

import android.content.Context;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.common.C25665d;
import com.p280ss.android.ugc.aweme.common.C25665d.C25667b;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.lego.LegoService;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.main.C32904bi;
import com.p280ss.android.ugc.aweme.services.IAVService;

/* renamed from: com.ss.android.ugc.aweme.legoImp.service.DouDouService */
public class DouDouService implements LegoService {
    private C25665d douDetector;
    public C32351a listener;
    private C25667b onDouListener;

    /* renamed from: com.ss.android.ugc.aweme.legoImp.service.DouDouService$EnsureDouDetectorTask */
    class EnsureDouDetectorTask implements LegoTask {
        public ProcessType process() {
            return C32337d.m104906a(this);
        }

        public WorkType type() {
            return WorkType.BACKGROUND;
        }

        EnsureDouDetectorTask() {
        }

        public void run(Context context) {
            C6921a.m21555a("EnsureDouDetectorTask");
            if (DouDouService.this.switchDouDetectorBySetting(context)) {
                DouDouService.this.onResume();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.service.DouDouService$a */
    public interface C32351a {
        /* renamed from: a */
        boolean mo83567a();
    }

    public void init(Context context) {
    }

    public WorkType type() {
        return WorkType.BACKGROUND;
    }

    public void onDestroy() {
        if (this.listener != null) {
            this.listener = null;
        }
        if (this.onDouListener != null) {
            this.onDouListener = null;
        }
    }

    public void onPause() {
        if (this.douDetector != null) {
            this.douDetector.mo66552b();
        }
    }

    public void onResume() {
        if (this.douDetector != null) {
            this.douDetector.mo66551a();
        }
    }

    public void ensureDouDetector() {
        C7121a.m22248b().mo18559a(new EnsureDouDetectorTask()).mo18560a();
    }

    public void setDouDouListener(C32351a aVar) {
        this.listener = aVar;
    }

    public void enableDouDetection(boolean z) {
        if (this.douDetector != null) {
            this.douDetector.f67591a = z;
        }
    }

    private void initDouDetectorAndActivityMonitor(final Context context) {
        if (this.onDouListener == null) {
            this.onDouListener = new C25667b() {
                /* renamed from: b */
                public final void mo66557b() {
                    DouDouService.this.switchDouDetectorBySetting(context);
                }

                /* renamed from: a */
                public final boolean mo66556a() {
                    if (!DouDouService.this.switchDouDetectorBySetting(context) || DouDouService.this.listener == null) {
                        return false;
                    }
                    return DouDouService.this.listener.mo83567a();
                }
            };
        }
        this.douDetector = new C25665d(context, this.onDouListener);
    }

    public boolean switchDouDetectorBySetting(Context context) {
        if (((IAVService) ServiceManager.get().getService(IAVService.class)).storySettingService().getStorySettingDoudouSwitch() && !C32904bi.m106498c()) {
            TimeLockRuler.isTeenModeON();
        }
        if (this.douDetector != null) {
            this.douDetector.mo66552b();
            this.douDetector = null;
        }
        return false;
    }
}
