package com.p280ss.android.ugc.aweme.app.application.task;

import android.content.Context;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.retrofit2.p638c.C12469a;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.p280ss.android.account.token.C18897a;
import com.p280ss.android.account.token.C18898b;
import com.p280ss.android.account.token.C18907h;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.net.C34106x;
import com.p280ss.android.ugc.aweme.net.interceptor.TokenSdkCommonParamsInterceptorTTNet;
import com.p280ss.android.ugc.aweme.notice.repo.TutorialVideoApiManager;
import com.p280ss.android.ugc.aweme.utils.C43115ez;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.app.application.task.TokenSdkTask */
public class TokenSdkTask implements LegoTask {
    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.BACKGROUND;
    }

    private String getAppType() {
        int n = C6399b.m19938n();
        if (n == 2 || n == 4 || n == 3) {
            return "lite";
        }
        return "normal";
    }

    private void doRealTask() {
        if (C6776h.m20947b(C6399b.m19921a())) {
            C18898b a = new C18898b().mo50261a(600000).mo50265a(true).mo50262a((C18907h) new C18907h() {
                /* renamed from: a */
                public final void mo50273a(String str, JSONObject jSONObject) {
                    C6907h.m21525a(str, jSONObject);
                }

                /* renamed from: a */
                public final void mo50274a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
                    if (C43115ez.m136743a()) {
                        C6877n.m21448a(str, (JSONObject) null, jSONObject);
                    }
                }
            });
            List list = null;
            if (!C6399b.m19944t()) {
                a.mo50263a("https://aweme.snssdk.com");
                list = Arrays.asList(new String[]{"amemv.com", "snssdk.com", "juliangyinqing.com", "byted.org", "bytedance.net"});
            } else if (C6399b.m19947w()) {
                a.mo50263a("https://api.tiktokv.com");
                list = Arrays.asList(new String[]{"tiktokv.com", "tiktok.com", "byteoversea.com"});
            } else if (C6399b.m19946v()) {
                a.mo50263a(TutorialVideoApiManager.f89507a);
                list = Arrays.asList(new String[]{"musical.ly", "tiktokv.com", "byteoversea.com", "tiktok.com"});
            }
            if (list != null) {
                a.mo50264a((Collection<String>) list);
            }
            RetrofitUtils.m37902a((C12469a) new TokenSdkCommonParamsInterceptorTTNet(getAppType()));
            C18897a.m61682a(C6399b.m19921a(), a);
            C18897a.m61684a(C34106x.m109782a().booleanValue());
        }
    }

    public void run(Context context) {
        C6921a.m21555a("TokenSdkTask");
        doRealTask();
    }
}
