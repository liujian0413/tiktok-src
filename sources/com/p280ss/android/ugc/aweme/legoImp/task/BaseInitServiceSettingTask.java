package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import bolts.C1592h;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.aweme.ttsetting.C10969a;
import com.bytedance.ies.ugc.aweme.ttsetting.C10975b;
import com.bytedance.ies.ugc.aweme.ttsetting.FetchTTSettingTask;
import com.p280ss.android.newmedia.C19943j;
import com.p280ss.android.ugc.aweme.antiaddic.p1011b.C22561c;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.lego.C7121a.C7132f;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.setting.AsyncSettingsExperiment;
import com.p280ss.android.ugc.aweme.setting.model.VerifyActionManager;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.update.UpdateHelper;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.BaseInitServiceSettingTask */
public class BaseInitServiceSettingTask implements LegoTask {

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.BaseInitServiceSettingTask$a */
    public static final class C32362a implements C10975b {

        /* renamed from: a */
        final /* synthetic */ BaseInitServiceSettingTask f84474a;

        /* renamed from: com.ss.android.ugc.aweme.legoImp.task.BaseInitServiceSettingTask$a$a */
        static final class C32363a<V> implements Callable<C7581n> {

            /* renamed from: a */
            final /* synthetic */ C32362a f84475a;

            /* renamed from: b */
            final /* synthetic */ JSONObject f84476b;

            C32363a(C32362a aVar, JSONObject jSONObject) {
                this.f84475a = aVar;
                this.f84476b = jSONObject;
            }

            public final /* synthetic */ Object call() {
                m104928a();
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m104928a() {
                UpdateHelper b = UpdateHelper.m135755b();
                if (b != null) {
                    b.mo104391a(this.f84476b);
                }
                this.f84475a.f84474a.handleConfig(this.f84476b);
            }
        }

        C32362a(BaseInitServiceSettingTask baseInitServiceSettingTask) {
            this.f84474a = baseInitServiceSettingTask;
        }

        /* renamed from: a */
        public final void mo26469a(Throwable th) {
            C7573i.m23587b(th, "throwable");
            C42961az.m136381b(new C22561c());
        }

        /* renamed from: a */
        public final void mo26470a(JSONObject jSONObject) {
            if (C6384b.m19835a().mo15292a(AsyncSettingsExperiment.class, true, "is_async_setting", C6384b.m19835a().mo15295d().is_async_setting, true)) {
                C1592h.m7855a((Callable<TResult>) new C32363a<TResult>(this, jSONObject), (Executor) C7258h.m22730c());
            } else {
                UpdateHelper b = UpdateHelper.m135755b();
                if (b != null) {
                    b.mo104391a(jSONObject);
                }
                this.f84474a.handleConfig(jSONObject);
            }
            C42961az.m136381b(new C22561c());
        }
    }

    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.BACKGROUND;
    }

    public void run(Context context) {
        C7573i.m23587b(context, "context");
        C7132f b = C7121a.m22248b();
        String str = Api.f60502b;
        C7573i.m23582a((Object) str, "Api.API_URL_PREFIX_SI");
        b.mo18559a(new FetchTTSettingTask(str)).mo18560a();
        C10969a.m32155a((C10975b) new C32362a(this));
    }

    /* access modifiers changed from: protected */
    public void handleConfig(JSONObject jSONObject) {
        if (jSONObject != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("aweme_uniqueid_settings");
            VerifyActionManager.INSTANCE.saveVerifyAction(jSONObject.optJSONObject("user_badge_click_settings"));
            JSONObject optJSONObject2 = jSONObject.optJSONObject("aweme_music_ailab");
            if (optJSONObject2 != null) {
                ((IAVService) ServiceManager.get().getService(IAVService.class)).initAIMusicSettings(optJSONObject2.toString());
            } else {
                ((IAVService) ServiceManager.get().getService(IAVService.class)).initAIMusicSettings("");
            }
            if (optJSONObject != null) {
                boolean z = true;
                if (optJSONObject.optInt("enable_push_deduplication", 1) <= 0) {
                    z = false;
                }
                C19943j.m65778a(z);
            }
        }
    }
}
