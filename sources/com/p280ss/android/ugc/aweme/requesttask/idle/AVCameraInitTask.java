package com.p280ss.android.ugc.aweme.requesttask.idle;

import android.content.Context;
import com.bytedance.ies.abmock.C6384b;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.requesttask.idle.AVCameraInitTask */
public final class AVCameraInitTask implements LegoTask {
    public static final C37235a Companion = new C37235a(null);
    public static boolean initialized;

    /* renamed from: com.ss.android.ugc.aweme.requesttask.idle.AVCameraInitTask$a */
    public static final class C37235a {
        private C37235a() {
        }

        public /* synthetic */ C37235a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m119679a(int i, boolean z) {
            if (!AVCameraInitTask.initialized) {
                switch (C6384b.m19835a().mo15287a(PreLoadAVCameraAB.class, true, "preload_vesdk_task", C6384b.m19835a().mo15295d().preload_vesdk_task, 0)) {
                    case 0:
                        AVCameraInitTask.initialized = true;
                        C7121a.m22248b().mo18559a(new AVCameraInitTask()).mo18560a();
                        break;
                    case 1:
                        if (i == 3) {
                            AVCameraInitTask.initialized = true;
                            C7121a.m22248b().mo18559a(new AVCameraInitTask()).mo18560a();
                            return;
                        }
                        break;
                    case 2:
                        if (z) {
                            AVCameraInitTask.initialized = true;
                            C7121a.m22248b().mo18559a(new AVCameraInitTask()).mo18560a();
                            return;
                        }
                        break;
                }
            }
        }
    }

    public static final void init(int i, boolean z) {
        C37235a.m119679a(i, z);
    }

    public final ProcessType process() {
        return C32337d.m104906a(this);
    }

    public final WorkType type() {
        return WorkType.BOOT_FINISH;
    }

    public final void run(Context context) {
        C7573i.m23587b(context, "context");
        C41530am.m132285d("camera preLoad so start");
        Object service = ServiceManager.get().getService(IAVServiceProxy.class);
        C7573i.m23582a(service, "ServiceManager.get()\n   …ServiceProxy::class.java)");
        ((IAVServiceProxy) service).getShortVideoPluginService();
        ((IAVService) ServiceManager.get().getService(IAVService.class)).providePreloadVESo().preLoadVESo();
        C41530am.m132285d("camera preLoad so end");
    }
}
