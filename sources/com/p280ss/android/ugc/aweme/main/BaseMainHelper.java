package com.p280ss.android.ugc.aweme.main;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.CookieSyncManager;
import com.p280ss.android.image.C6813b;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.services.BusinessComponentServiceUtils;

/* renamed from: com.ss.android.ugc.aweme.main.BaseMainHelper */
public abstract class BaseMainHelper {

    /* renamed from: a */
    protected Activity f85631a;

    /* renamed from: b */
    protected boolean f85632b;

    /* renamed from: com.ss.android.ugc.aweme.main.BaseMainHelper$1 */
    class C328181 implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BaseMainHelper f85633a;

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f85633a.mo84348a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.main.BaseMainHelper$ClearCacheTask */
    class ClearCacheTask implements LegoTask {
        public ProcessType process() {
            return C32337d.m104906a(this);
        }

        public WorkType type() {
            return WorkType.BOOT_FINISH;
        }

        private ClearCacheTask() {
        }

        public void run(Context context) {
            C6921a.m21555a("ClearCacheTask");
            new C6813b(context).mo16651b();
        }

        /* synthetic */ ClearCacheTask(BaseMainHelper baseMainHelper, C328181 r2) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo84348a() {
        m106207b();
        this.f85632b = true;
        this.f85631a.finish();
    }

    /* renamed from: b */
    private void m106207b() {
        if (this.f85631a != null) {
            BusinessComponentServiceUtils.getMainHelperService().mo84622a();
            try {
                CookieSyncManager.getInstance().sync();
            } catch (Throwable unused) {
            }
        }
    }
}
