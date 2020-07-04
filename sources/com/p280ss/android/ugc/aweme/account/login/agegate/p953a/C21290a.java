package com.p280ss.android.ugc.aweme.account.login.agegate.p953a;

import android.os.Message;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.sdk.account.p645a.C12714b.C12715a;
import com.google.gson.C6600e;
import com.p280ss.android.common.util.C19290j;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.account.bean.AgeGateResponse;
import com.p280ss.android.ugc.aweme.account.login.agegate.C21297b;
import com.p280ss.android.ugc.aweme.account.network.C22208c;
import com.p280ss.android.ugc.aweme.account.p950k.C21227b;
import com.p280ss.android.ugc.aweme.account.util.C22331j;
import com.p280ss.android.ugc.aweme.account.util.C22338o;
import com.p280ss.android.ugc.aweme.account.util.C22345t;
import com.p280ss.android.ugc.aweme.account.util.C22352y;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.main.p1385g.C33014a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.C43173w;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.account.login.agegate.a.a */
public final class C21290a extends C25640a<AgeGateResponse> {

    /* renamed from: a */
    private int f57201a;

    /* renamed from: b */
    private int f57202b;

    /* renamed from: c */
    private int f57203c;

    public final boolean checkParams(Object... objArr) {
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final String mo57286b() {
        if (this.mData == null) {
            return "";
        }
        if (((AgeGateResponse) this.mData).getStatus_msg() != null) {
            return ((AgeGateResponse) this.mData).getStatus_msg();
        }
        return "";
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo57283a() {
        if (this.mData == null || !((AgeGateResponse) this.mData).is_eligible()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final String mo57287c() {
        String str;
        String str2;
        String valueOf = String.valueOf(this.f57201a);
        if (this.f57202b < 10) {
            StringBuilder sb = new StringBuilder("0");
            sb.append(String.valueOf(this.f57202b));
            str = sb.toString();
        } else {
            str = String.valueOf(this.f57202b);
        }
        if (this.f57203c < 10) {
            StringBuilder sb2 = new StringBuilder("0");
            sb2.append(String.valueOf(this.f57203c));
            str2 = sb2.toString();
        } else {
            str2 = String.valueOf(this.f57203c);
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(valueOf);
        sb3.append("-");
        sb3.append(str);
        sb3.append("-");
        sb3.append(str2);
        return sb3.toString();
    }

    public final void handleMsg(Message message) {
        super.handleMsg(message);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(AgeGateResponse ageGateResponse) {
        super.handleData(ageGateResponse);
        C22345t.m73974f(ageGateResponse.is_eligible());
        C22345t.m73975g(ageGateResponse.is_prompt());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ AgeGateResponse mo57280a(C1592h hVar) throws Exception {
        if (!C43173w.m136926a(hVar)) {
            return null;
        }
        C21671bd.m72529a((User) hVar.mo6890e());
        return (AgeGateResponse) getData();
    }

    public final boolean sendRequest(Object... objArr) {
        boolean sendRequest = super.sendRequest(objArr);
        if (sendRequest) {
            String valueOf = String.valueOf(objArr[0]);
            boolean z = true;
            if (C21671bd.m72520a().isLogin() && (objArr.length <= 1 || !objArr[1].booleanValue())) {
                z = false;
            }
            if (z || !C22352y.m74025f()) {
                C1592h.m7853a((Callable<TResult>) new C21294e<TResult>(this, valueOf, z)).mo6875a((C1591g<TResult, TContinuationResult>) new C22331j<TResult,TContinuationResult>(this.mHandler, 0));
            } else {
                C1592h.m7853a((Callable<TResult>) new C21291b<TResult>(this, valueOf, false)).mo6885c((C1591g<TResult, TContinuationResult>) new C21292c<TResult,TContinuationResult>(this)).mo6886c(new C21293d(this), C1592h.f5958b).mo6875a((C1591g<TResult, TContinuationResult>) new C22331j<TResult,TContinuationResult>(this.mHandler, 0));
            }
        }
        return sendRequest;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ User mo57285b(C1592h hVar) throws Exception {
        String str;
        if (!C43173w.m136926a(hVar)) {
            return null;
        }
        handleData((AgeGateResponse) hVar.mo6890e());
        if (((AgeGateResponse) hVar.mo6890e()).getStatus_code() == 0) {
            User queryUser = C21671bd.m72520a().queryUser(((C33014a) C21671bd.m72521a(C33014a.class)).mo59997a(), false);
            if (((AgeGateResponse) hVar.mo6890e()).is_eligible()) {
                queryUser.setUserMode(1);
            } else {
                queryUser.setUserMode(2);
            }
            C22345t.m73960a(queryUser.getUid(), queryUser.getUserMode());
            m71655a(0, -1);
            return queryUser;
        }
        m71655a(1, ((AgeGateResponse) hVar.mo6890e()).getStatus_code());
        int status_code = ((AgeGateResponse) hVar.mo6890e()).getStatus_code();
        Integer valueOf = Integer.valueOf(status_code);
        if (((AgeGateResponse) hVar.mo6890e()).getStatus_msg() != null) {
            str = ((AgeGateResponse) hVar.mo6890e()).getStatus_msg();
        } else {
            str = "";
        }
        throw new ApiServerException(status_code).setErrorMsg(C22338o.m73946a(valueOf, str));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ AgeGateResponse mo57281a(String str, boolean z) throws Exception {
        return m71657c(str, z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ AgeGateResponse mo57284b(String str, boolean z) throws Exception {
        return m71657c(str, z);
    }

    /* renamed from: a */
    private static void m71655a(int i, int i2) {
        String str;
        C6869c a = C6869c.m21381a();
        C6869c a2 = a.mo16885a("status", Integer.valueOf(i));
        String str2 = "type";
        if (C21297b.m71680c()) {
            str = "/aweme/v1/register/verification/age/";
        } else {
            str = "/aweme/v2/verification/age/";
        }
        a2.mo16887a(str2, str);
        if (i == 1) {
            a.mo16885a("error_message", Integer.valueOf(i2));
        }
        C21227b.m71451a("compliance_api_status", "", a.mo16888b());
    }

    /* renamed from: c */
    private static AgeGateResponse m71657c(String str, boolean z) throws Exception {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(C12715a.f33723a);
        if (C21297b.m71680c()) {
            str2 = "api2.musical.ly/aweme/v1/register/verification/age/";
        } else {
            str2 = "api2.musical.ly/aweme/v2/verification/age/";
        }
        sb.append(str2);
        C19290j jVar = new C19290j(sb.toString());
        jVar.mo51188a("birthday", str);
        if (z) {
            jVar.mo51186a("session_registered", 1);
        } else {
            jVar.mo51186a("session_registered", 2);
        }
        return (AgeGateResponse) new C6600e().mo15974a(C22208c.f59306b.mo58583a(Integer.MAX_VALUE, jVar.toString()), AgeGateResponse.class);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo57282a(int i, int i2, int i3) {
        this.f57201a = i;
        this.f57202b = i2;
        this.f57203c = i3;
    }
}
