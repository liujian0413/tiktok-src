package com.p280ss.android.sdk.app;

import android.app.Application;
import android.content.Context;
import com.bytedance.dataplatform.C10046i;
import com.bytedance.dataplatform.C10047j;
import com.bytedance.dataplatform.C6324d;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.retrofit2.p264b.C6450ac;
import com.bytedance.retrofit2.p264b.C6457h;
import com.google.common.util.concurrent.C18253l;
import com.google.gson.C6600e;
import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.setting.C7212bb;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.sdk.app.AbTestSdkInitTask */
public class AbTestSdkInitTask implements LegoTask {

    /* renamed from: com.ss.android.sdk.app.AbTestSdkInitTask$AbTestApi */
    interface AbTestApi {
        @C6457h
        C18253l<String> doGet(@C6450ac String str);
    }

    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.BACKGROUND;
    }

    static final /* synthetic */ String lambda$run$0$AbTestSdkInitTask(String str) {
        try {
            return (String) ((AbTestApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C19223b.f51890e).mo26430a().mo26435a(AbTestApi.class)).doGet(str).get();
        } catch (Exception unused) {
            return null;
        }
    }

    public void run(Context context) {
        String str;
        C6921a.m21555a("AbTestSdkInitTask");
        if (!C6399b.m19944t()) {
            str = "https://abtest-ch.snssdk.com/common";
        } else if (C6399b.m19946v()) {
            str = "https://abtest-va-tiktok.byteoversea.com/common";
        } else {
            str = "https://abtest-sg-tiktok.byteoversea.com/common";
        }
        C6324d.m19635a((Application) context, str.trim(), false, new C10047j() {
            /* renamed from: a */
            public final <T> T mo24695a(String str, Type type, T t) {
                return new C22903bl(str, type, null).mo59876c();
            }
        }, new C10046i() {

            /* renamed from: b */
            private C6600e f54436b = new C6600e();

            /* renamed from: a */
            public final <T> T mo24694a(String str, Type type) {
                return this.f54436b.mo15975a(str, type);
            }
        }, C20110a.f54437a, C20111b.f54438a);
        if (C6399b.m19944t()) {
            C7212bb.m22492a(context);
        }
    }
}
