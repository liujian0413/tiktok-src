package com.p280ss.android.ugc.aweme.dynamicfeature;

import android.content.Context;
import android.os.Build.VERSION;
import com.bytedance.common.utility.p254b.C6304f;
import com.bytedance.ies.abmock.C6384b;
import com.p280ss.android.ugc.aweme.app.p1034f.C22975a;
import com.p280ss.android.ugc.aweme.experiment.DfDummyExperiment;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.p1168df.base.C26220a.C26221a;
import com.p280ss.android.ugc.aweme.p1168df.base.C26227d;

/* renamed from: com.ss.android.ugc.aweme.dynamicfeature.DfDummyInitTask */
public class DfDummyInitTask implements LegoTask {
    boolean isDeferredInstall;

    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.BOOT_FINISH;
    }

    private void deferredInitDfDummy() {
        if (VERSION.SDK_INT >= 21) {
            C26227d.m86226a("com.ss.android.ugc.i18n.df_dummy");
        }
    }

    public DfDummyInitTask(boolean z) {
        this.isDeferredInstall = z;
    }

    private void initDfDummy(Context context) {
        C6304f.submitRunnable(new C27323a(this, context));
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$initDfDummy$0$DfDummyInitTask(Context context) {
        try {
            final C22975a aVar = new C22975a(context);
            if (C22975a.m86193f()) {
                aVar.mo67782d();
                aVar.f69118c = new C26221a() {
                    /* renamed from: a */
                    public final void mo16973a() {
                        aVar.mo67783e();
                    }

                    /* renamed from: b */
                    public final void mo16974b() {
                        aVar.mo67783e();
                    }
                };
                aVar.mo67781c();
            }
        } catch (Throwable unused) {
        }
    }

    public void run(Context context) {
        if (C6384b.m19835a().mo15292a(DfDummyExperiment.class, true, "enable_df_dummy", C6384b.m19835a().mo15295d().enable_df_dummy, false)) {
            if (this.isDeferredInstall) {
                deferredInitDfDummy();
                return;
            }
            initDfDummy(context);
        }
    }
}
