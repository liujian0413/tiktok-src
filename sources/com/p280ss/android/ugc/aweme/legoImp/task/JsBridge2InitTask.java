package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.web.jsbridge2.C11174p;
import com.bytedance.ies.web.jsbridge2.IBridgePermissionConfigurator;
import com.bytedance.ies.web.jsbridge2.IBridgePermissionConfigurator.C11147a;
import com.bytedance.ies.web.jsbridge2.IBridgePermissionConfigurator.C11147a.C11148a;
import com.bytedance.ies.web.jsbridge2.IBridgePermissionConfigurator.C11149b;
import com.bytedance.ies.web.jsbridge2.IBridgePermissionConfigurator.RegionConfig;
import com.bytedance.keva.Keva;
import com.bytedance.retrofit2.C12466b;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p264b.C6450ac;
import com.bytedance.retrofit2.p264b.C6451b;
import com.bytedance.retrofit2.p264b.C6461l;
import com.bytedance.retrofit2.p264b.C6468s;
import com.bytedance.retrofit2.p637a.C12461b;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.web.C43447i;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.JsBridge2InitTask */
public class JsBridge2InitTask implements LegoTask {

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.JsBridge2InitTask$NetRequest */
    interface NetRequest {
        @C6468s
        C12466b<String> postBody(@C6450ac String str, @C6451b TypedOutput typedOutput, @C6461l List<C12461b> list);
    }

    static final /* synthetic */ void lambda$enablePermissionCheck$0$JsBridge2InitTask() {
    }

    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.BOOT_FINISH;
    }

    private void enablePermissionCheck() {
        final ExecutorService d = C7258h.m22731d();
        C11174p.m32712a((IBridgePermissionConfigurator) new IBridgePermissionConfigurator() {
            /* renamed from: a */
            public final RegionConfig mo27139a() {
                return RegionConfig.CN;
            }

            /* renamed from: g */
            public final Executor mo27146g() {
                return d;
            }

            /* renamed from: b */
            public final int mo27141b() {
                return C6399b.m19935k();
            }

            /* renamed from: c */
            public final String mo27142c() {
                return C6399b.m19934j();
            }

            /* renamed from: d */
            public final String mo27143d() {
                return AppLog.getServerDeviceId();
            }

            /* renamed from: f */
            public final C11147a mo27145f() {
                return new C11147a() {
                    /* renamed from: a */
                    public final void mo27148a(String str, String str2) {
                        Keva.getRepo("jsbridge2-permission", 1).storeString(str, str2);
                    }

                    /* renamed from: a */
                    public final void mo27147a(String str, C11148a aVar) {
                        aVar.mo27149a(Keva.getRepo("jsbridge2-permission", 1).getString(str, ""));
                    }
                };
            }

            /* renamed from: e */
            public final String mo27144e() {
                return C43447i.m137872c().mo105382g();
            }

            /* renamed from: a */
            public final void mo27140a(String str, Map<String, String> map, String str2, byte[] bArr, C11149b bVar) {
                try {
                    NetRequest netRequest = (NetRequest) RetrofitUtils.m37898a(str, NetRequest.class);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new C12461b("ContentType", str2));
                    bVar.mo27151a((String) netRequest.postBody(str, new TypedByteArray(null, bArr, new String[0]), arrayList).execute().f33302b);
                } catch (Exception e) {
                    bVar.mo27150a(e);
                }
            }
        }, C32409n.f84526a);
    }

    public void run(Context context) {
        init(context);
    }

    private void init(Context context) {
        boolean z;
        try {
            z = C30199h.m98861a().getUseBridgeEngineV2().booleanValue();
        } catch (NullValueException unused) {
            z = false;
        }
        if (z) {
            enablePermissionCheck();
        }
    }
}
