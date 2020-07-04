package com.p280ss.android.ugc.aweme.account.ftc.api;

import bolts.C1592h;
import com.bytedance.sdk.account.p645a.C12714b.C12715a;
import com.google.gson.C6600e;
import com.p280ss.android.common.util.C19290j;
import com.p280ss.android.common.util.NetworkUtils;
import com.p280ss.android.ugc.aweme.account.ftc.model.SetEmailResponse;
import java.util.concurrent.Callable;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.account.ftc.api.Api */
public class Api {
    public static C1592h<SetEmailResponse> emailForExportVideo(@C7744t(mo20436a = "email") String str) {
        return C1592h.m7853a((Callable<TResult>) new C21181a<TResult>(str));
    }

    static final /* synthetic */ SetEmailResponse lambda$emailForExportVideo$0$Api(@C7744t(mo20436a = "email") String str) throws Exception {
        StringBuilder sb = new StringBuilder();
        sb.append(C12715a.f33723a);
        sb.append("api2.musical.ly/aweme/v1/ftc/user/email/");
        C19290j jVar = new C19290j(sb.toString());
        jVar.mo51188a("email", str);
        return (SetEmailResponse) new C6600e().mo15974a(NetworkUtils.executeGet(Integer.MAX_VALUE, jVar.toString()), SetEmailResponse.class);
    }
}
