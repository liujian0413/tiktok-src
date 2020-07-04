package com.p280ss.android.ugc.aweme.account.p945h;

import android.content.Context;
import android.content.Intent;
import android.support.p022v4.content.C0688e;
import android.text.TextUtils;
import android.util.Log;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.sdk.account.p645a.C12728d;
import com.bytedance.sdk.account.p645a.p646a.C12706a;
import com.bytedance.sdk.account.p645a.p646a.C12707b;
import com.bytedance.sdk.account.p645a.p646a.C12708c;
import com.bytedance.sdk.account.p660d.C12798d;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.sdk.p899a.C20098b;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.login.C21579s;
import com.p280ss.android.ugc.aweme.account.network.C22208c;
import com.p280ss.android.ugc.aweme.account.p950k.C21227b;
import com.p280ss.android.ugc.aweme.account.p950k.C21233e;
import com.p280ss.android.ugc.aweme.account.util.C22338o;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p346io.reactivex.C47556ac;
import p346io.reactivex.C47557ad;
import p346io.reactivex.C47558ae;
import p346io.reactivex.C7319aa;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.account.h.b */
public class C21208b {

    /* renamed from: b */
    private static volatile C21208b f56997b;

    /* renamed from: a */
    public IAccountUserService f56998a = C21671bd.m72520a();

    /* renamed from: c */
    private C12728d f56999c;

    private C21208b() {
    }

    /* renamed from: a */
    public static C21208b m71392a() {
        if (f56997b == null) {
            synchronized (C21208b.class) {
                if (f56997b == null) {
                    f56997b = new C21208b();
                }
            }
        }
        return f56997b;
    }

    /* renamed from: b */
    private C12728d m71395b() {
        if (this.f56999c == null) {
            this.f56999c = C12798d.m37186a(C21671bd.m72532b());
        }
        return this.f56999c;
    }

    /* renamed from: b */
    private void m71396b(String str) {
        C7319aa.m22925a((C47558ae<T>) new C21212d<T>(str)).mo19135b(C7333a.m23044b()).mo19137b((C47557ad<? super T>) new C47557ad<String>() {
            public final void onSubscribe(C7321c cVar) {
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onSuccess(String str) {
                try {
                    C21208b.this.mo57133a(str);
                } catch (Exception unused) {
                }
            }

            public final void onError(Throwable th) {
                if (th instanceof ApiServerException) {
                    ApiServerException apiServerException = (ApiServerException) th;
                    int errorCode = apiServerException.getErrorCode();
                    if (errorCode != 14) {
                        switch (errorCode) {
                            case 9:
                                C21208b.this.f56998a.setUserBanned();
                                break;
                        }
                    } else {
                        C21208b.this.f56998a.setUserLogicDelete(apiServerException.getErrorMsg());
                    }
                    C21233e.m71479a(1, "checkout", errorCode, apiServerException.getErrorMsg());
                    C21671bd.m72530a(false);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo57133a(String str) {
        m71395b().mo31212a(str, (Map) null, (C12706a<C12708c>) new C12706a<C12708c>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onResponse(C12708c cVar) {
                if (cVar.f33701a) {
                    if (C21208b.this.f56998a.isChildrenMode() && C21208b.this.f56998a.allUidList().size() > 1) {
                        C7319aa logoutAllBackgroundUser = C21208b.this.f56998a.logoutAllBackgroundUser();
                        logoutAllBackgroundUser.getClass();
                        logoutAllBackgroundUser.mo19128a();
                    }
                    AppLog.setUserId(0);
                    AppLog.setSessionKey(C21208b.this.f56998a.getSessionKey());
                    C20098b.m66270a().mo53817a((Context) C21671bd.m72532b());
                    C0688e.m2941a((Context) C21671bd.m72532b()).mo2839a(new Intent("session_expire"));
                    C21208b.this.f56998a.clear("logout");
                    if (C21208b.this.f56998a.allUidList().size() <= 0 || !C21671bd.m72540h().isEnableMultiAccountLogin()) {
                        C21233e.m71479a(0, "", 0, "");
                        C21671bd.m72541i();
                        C21671bd.m72530a(true);
                        C21671bd.m72537e().mo56858c(C42914ab.m136242a().mo104633a("previous_uid", C21203a.f56983b).f111445a);
                        C21203a.f56983b = "";
                        return;
                    }
                    C21203a.m71382b();
                    return;
                }
                C21233e.m71479a(1, "passport logout", cVar.f33702b, cVar.f33703c);
                C21671bd.m72530a(false);
                C10761a.m31403c((Context) C21671bd.m72532b(), C22338o.m73945a((C12707b) cVar)).mo25750a();
            }
        });
    }

    /* renamed from: a */
    static final /* synthetic */ void m71394a(String str, C47556ac acVar) throws Exception {
        C22208c.f59306b.mo58583a(Integer.MAX_VALUE, "https://api2.musical.ly/aweme/v1/check/out/");
        acVar.mo119654a(str);
    }

    /* renamed from: a */
    public final void mo57134a(String str, String str2) {
        String str3;
        if (this.f56998a.isLogin()) {
            C21579s.m72304a().mo6885c((C1591g<TResult, TContinuationResult>) new C21211c<TResult,TContinuationResult>(System.currentTimeMillis(), this.f56998a.getCurUser()));
        }
        try {
            JSONObject jSONObject = new JSONObject();
            String str4 = "type";
            if (TextUtils.isEmpty(str)) {
                str3 = "other";
            } else {
                str3 = str2;
            }
            jSONObject.put(str4, str3);
            jSONObject.put("exception", Log.getStackTraceString(new Exception()));
            C21227b.m71451a("aweme_user_logout", "", jSONObject);
        } catch (Exception unused) {
        }
        C21203a.f56983b = this.f56998a.getCurUserId();
        m71396b(str2);
    }

    /* renamed from: a */
    static final /* synthetic */ List m71393a(long j, User user, C1592h hVar) throws Exception {
        C21579s.m72310a(C21671bd.m72536d(), j);
        C21579s.m72309a(user);
        return (List) hVar.mo6890e();
    }
}
