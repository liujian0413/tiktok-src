package com.p280ss.android.ugc.aweme.effect;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.base.p1062f.C23336d;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.legoImp.task.CleanEffectsTask;
import com.p280ss.android.ugc.aweme.main.C32961dd;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.ugc.aweme.effect.EffectJobService */
public class EffectJobService extends Service {
    public void onCreate() {
        String cacheDir = ((IAVService) ServiceManager.get().getService(IAVService.class)).effectService().getCacheDir();
        if (!TextUtils.isEmpty(cacheDir) && new File(cacheDir).list() != null && new File(cacheDir).list().length != 0) {
            C1592h.m7855a((Callable<TResult>) new C27437p<TResult>(cacheDir), (Executor) C7258h.m22730c()).mo6886c(new C27438q(this), C1592h.f5958b);
        }
    }

    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /* renamed from: a */
    static final /* synthetic */ Object m89617a(String str) throws Exception {
        try {
            CleanEffectsTask.cleanCache(new File(str), ((IAVService) ServiceManager.get().getService(IAVService.class)).effectService().getDraftEffectList());
        } catch (Exception unused) {
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo70347a(C1592h hVar) throws Exception {
        C32961dd ddVar = (C32961dd) C23336d.m76560a(this, C32961dd.class);
        ddVar.mo60468e(false);
        ddVar.mo60458b(System.currentTimeMillis());
        stopSelf();
        return null;
    }
}
