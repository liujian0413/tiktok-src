package com.p280ss.android.ugc.aweme.flow.manager.impl;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.frameworks.baselib.network.http.retrofit.C10180c;
import com.bytedance.frameworks.baselib.network.http.retrofit.p514a.p515a.C10176a;
import com.bytedance.retrofit2.C12466b;
import com.bytedance.retrofit2.C12474e;
import com.bytedance.retrofit2.C12475f.C12476a;
import com.bytedance.retrofit2.C12516p;
import com.bytedance.retrofit2.C12516p.C12518a;
import com.bytedance.retrofit2.C12534t;
import com.bytedance.retrofit2.p637a.C12459a;
import com.bytedance.retrofit2.p637a.C12459a.C12460a;
import com.bytedance.ttnet.retrofit.C12991b;
import com.google.common.util.concurrent.C18245g;
import com.google.common.util.concurrent.C18246h;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.common.p288d.C6759a;
import com.p280ss.android.common.util.NetworkUtils;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.common.net.C25710e;
import java.util.HashMap;
import java.util.concurrent.Executor;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.flow.manager.impl.d */
public class C21735d implements C6310a {

    /* renamed from: a */
    protected static final String f58221a = "d";

    /* renamed from: c */
    public static boolean f58222c;

    /* renamed from: b */
    protected final String f58223b = "CMCC_PASS_CODE";

    /* renamed from: d */
    protected String f58224d = "";

    /* renamed from: e */
    protected C12516p f58225e;

    /* renamed from: f */
    protected IMobileFlowApi f58226f;

    /* renamed from: g */
    protected int f58227g;

    /* renamed from: h */
    protected Context f58228h = AwemeApplication.m21341a();

    /* renamed from: i */
    protected C6309f f58229i = new C6309f(Looper.getMainLooper(), this);

    /* renamed from: j */
    protected final String f58230j = "CMCC_SIM";

    /* renamed from: k */
    private int f58231k = 1000;

    /* renamed from: b */
    private boolean m72670b() {
        return false;
    }

    /* renamed from: c */
    private boolean m72671c() {
        return NetworkUtils.isMobile(this.f58228h);
    }

    /* renamed from: e */
    private static String m72673e() {
        return (String) SharePrefCache.inst().getLastUploadPassCode().mo59877d();
    }

    /* renamed from: a */
    public final void mo58027a() {
        SharePrefCache.inst().getLastUploadPassCode().mo59871a(m72676h());
    }

    /* renamed from: g */
    private boolean m72675g() {
        if (f58222c || (m72674f() && m72671c() && m72670b())) {
            return true;
        }
        return false;
    }

    private C21735d() {
    }

    /* renamed from: f */
    private static boolean m72674f() {
        String lowerCase = Build.BRAND.toLowerCase();
        String str = Build.MODEL;
        if (!TextUtils.equals(lowerCase, "coolpad") || !str.contains("A8-932") || VERSION.SDK_INT != 21) {
            return ((Boolean) SharePrefCache.inst().getEnableUploadPC().mo59877d()).booleanValue();
        }
        return false;
    }

    /* renamed from: h */
    private String m72676h() {
        StringBuilder sb = new StringBuilder();
        sb.append(C21115b.m71197a().getCurUserId());
        sb.append("#");
        sb.append(C21739e.m72682a(this.f58228h));
        sb.append("#");
        sb.append(AppLog.getServerDeviceId());
        return sb.toString();
    }

    /* renamed from: d */
    private void m72672d() {
        String str;
        String str2;
        if (m72675g()) {
            String e = m72673e();
            if (TextUtils.isEmpty(e) || !TextUtils.equals(m72676h(), e)) {
                if (this.f58225e == null) {
                    C217361 r0 = new C12460a() {
                        /* renamed from: a */
                        public final C12459a mo10453a() {
                            return new C12991b();
                        }
                    };
                    C12518a aVar = new C12518a();
                    if (f58222c) {
                        str2 = "http://121.15.167.251:30030";
                    } else {
                        str2 = "http://wap.cmpassport.com";
                    }
                    this.f58225e = aVar.mo30502a(str2).mo30498a((C12460a) r0).mo30503a((Executor) new C10180c()).mo30501a((C12476a) C10176a.m30237a()).mo30504a();
                }
                if (this.f58226f == null) {
                    this.f58226f = (IMobileFlowApi) this.f58225e.mo30492a(IMobileFlowApi.class);
                }
                if (f58222c) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("expandParams", "phoneNum=15710066003");
                    str = C21734c.m72667a("/umcopenapi/wabpGetUseInfo?", hashMap);
                } else {
                    str = C21734c.m72667a("/openapi/wabpGetUseInfo?", null);
                }
                this.f58226f.getPassCode(str).enqueue(new C12474e<C21732a>() {
                    /* renamed from: a */
                    public final void mo26464a(C12466b<C21732a> bVar, Throwable th) {
                    }

                    /* renamed from: a */
                    public final void mo26463a(C12466b<C21732a> bVar, C12534t<C21732a> tVar) {
                        if (tVar != null) {
                            C21732a aVar = (C21732a) tVar.f33302b;
                            if (aVar != null && aVar.f58213d == 0) {
                                Bundle bundle = new Bundle();
                                bundle.putString("cmccCertify", aVar.toString());
                                C6759a.m20909a("getPassCodeFromServerSuccess", bundle);
                                C21735d.this.f58224d = aVar.f58212c;
                                C18246h.m60213a(UpdateMobilePassCodeApiManager.m72661a(aVar.f58212c), new C18245g<BaseResponse>() {
                                    public final void onFailure(Throwable th) {
                                    }

                                    /* access modifiers changed from: private */
                                    /* renamed from: a */
                                    public void onSuccess(BaseResponse baseResponse) {
                                        C21735d.this.mo58027a();
                                    }
                                });
                                C21735d.this.f58227g = 0;
                                C21735d.this.f58229i.sendEmptyMessage(1);
                            }
                        }
                    }
                });
            }
        }
    }

    public void handleMsg(Message message) {
        if (message.what == 4) {
            this.f58229i.removeMessages(4);
            m72672d();
        }
    }

    @C7709l
    public void onEvent(C25710e eVar) {
        if (this.f58231k != eVar.f67655a) {
            this.f58231k = eVar.f67655a;
            if (eVar.f67655a == 1 && m72675g()) {
                this.f58229i.removeMessages(4);
                this.f58229i.removeMessages(1);
                this.f58229i.sendEmptyMessage(4);
            }
        }
    }
}
