package com.p280ss.android.ugc.aweme.notice.api.p1430ws;

import android.app.Application;
import bolts.C1592h;
import com.bytedance.common.wschannel.C9747a.C9748a;
import com.bytedance.common.wschannel.C9758c;
import com.bytedance.common.wschannel.app.C9752a;
import com.bytedance.common.wschannel.event.C9818a;
import com.bytedance.common.wschannel.event.ConnectionState;
import com.bytedance.common.wschannel.model.SocketState;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.common.wschannel.model.WsChannelMsg.C9826a;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.common.applog.NetUtil;
import com.p280ss.android.common.util.NetworkUtils;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.language.C7120e;
import com.p280ss.android.ugc.aweme.language.I18nManagerService;
import com.p280ss.android.ugc.aweme.notice.api.helper.WSHelper;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.websocket.p344ws.C45441a;
import com.p280ss.android.websocket.p344ws.WebSocketStatus.ConnectState;
import com.p280ss.android.websocket.p344ws.output.C45455a;
import com.p280ss.android.websocket.p344ws.output.C45456b;
import com.p280ss.android.websocket.p344ws.output.C45457c;
import com.p280ss.android.websocket.p344ws.output.C45458d;
import com.p280ss.android.websocket.p344ws.output.C45460f;
import com.p280ss.android.websocket.p344ws.output.WSHandShakeState;
import com.p280ss.android.websocket.p344ws.p1781a.C45443a;
import com.p280ss.android.websocket.p344ws.p1781a.C45444b;
import com.p280ss.android.websocket.p344ws.p1781a.C45446d;
import com.p280ss.android.websocket.p344ws.p1781a.C45447e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.greenrobot.eventbus.C7709l;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.notice.api.ws.j */
public final class C34337j {

    /* renamed from: e */
    public static final boolean f89494e = C6384b.m19835a().mo15292a(WSopenAB.class, true, "async_ws_open", C6384b.m19835a().mo15295d().async_ws_open, true);

    /* renamed from: f */
    public static C34337j f89495f;

    /* renamed from: g */
    public static final C34338a f89496g = new C34338a(null);

    /* renamed from: a */
    public final boolean f89497a;

    /* renamed from: b */
    public final C34332f f89498b;

    /* renamed from: c */
    public String f89499c;

    /* renamed from: d */
    public final List<C9752a> f89500d;

    /* renamed from: h */
    private final C9752a f89501h;

    /* renamed from: com.ss.android.ugc.aweme.notice.api.ws.j$a */
    public static final class C34338a {
        private C34338a() {
        }

        /* renamed from: b */
        private static C34337j m111051b() {
            if (C34337j.f89495f == null) {
                C34337j.f89495f = new C34337j(null);
            }
            return C34337j.f89495f;
        }

        /* renamed from: a */
        public final synchronized C34337j mo87193a() {
            C34337j b;
            b = m111051b();
            if (b == null) {
                C7573i.m23580a();
            }
            return b;
        }

        public /* synthetic */ C34338a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notice.api.ws.j$b */
    public static final class C34339b implements C9752a {

        /* renamed from: a */
        final /* synthetic */ C34337j f89502a;

        C34339b(C34337j jVar) {
            this.f89502a = jVar;
        }

        /* renamed from: a */
        public final void mo24157a(WsChannelMsg wsChannelMsg) {
            if (wsChannelMsg != null) {
                C45457c cVar = new C45457c(this.f89502a.f89499c, wsChannelMsg.mo24357a(), this.f89502a.f89498b.mo18093a(new C34343l(wsChannelMsg)));
                cVar.f117067d = wsChannelMsg.f26770e;
                cVar.mo108845a(Integer.valueOf(wsChannelMsg.f26769d));
                C34337j.m111045a((Object) cVar);
            }
            for (C9752a a : this.f89502a.f89500d) {
                a.mo24157a(wsChannelMsg);
            }
        }

        /* renamed from: a */
        public final void mo24156a(C9818a aVar, JSONObject jSONObject) {
            if (aVar != null && jSONObject != null) {
                SocketState a = SocketState.m28961a(jSONObject);
                String jSONObject2 = jSONObject.toString();
                C7573i.m23582a((Object) jSONObject2, "connectJson.toString()");
                ConnectState connectState = null;
                ConnectionState connectionState = aVar.f26734b;
                if (connectionState != null) {
                    switch (C34342k.f89505a[connectionState.ordinal()]) {
                        case 1:
                            C34337j jVar = this.f89502a;
                            String str = a.f26739c;
                            C7573i.m23582a((Object) str, "socketState.connectionUrl");
                            jVar.f89499c = str;
                            connectState = ConnectState.CONNECTED;
                            C34337j.m111045a((Object) new C45456b(a.f26739c, jSONObject2));
                            break;
                        case 2:
                            connectState = ConnectState.CLOSED;
                            C34337j.m111045a((Object) new C45455a(-1, a.f26739c, jSONObject2));
                            break;
                        case 3:
                            C34337j.m111045a((Object) new C45458d(a.f26739c, WSHandShakeState.INTERNAL_ERROR));
                            break;
                        case 4:
                            connectState = ConnectState.OPENING;
                            break;
                    }
                }
                if (connectState != null) {
                    C34337j.m111045a((Object) new C45460f(a.f26739c, connectState));
                }
                for (C9752a a2 : this.f89502a.f89500d) {
                    a2.mo24156a(aVar, jSONObject);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notice.api.ws.j$c */
    static final class C34340c<V> implements Callable<Object> {

        /* renamed from: a */
        final /* synthetic */ C34337j f89503a;

        C34340c(C34337j jVar) {
            this.f89503a = jVar;
        }

        /* renamed from: a */
        private void m111055a() {
            this.f89503a.mo87188a();
        }

        public final /* synthetic */ Object call() {
            m111055a();
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notice.api.ws.j$d */
    static final class C34341d<V> implements Callable<Object> {

        /* renamed from: a */
        final /* synthetic */ Object f89504a;

        C34341d(Object obj) {
            this.f89504a = obj;
        }

        /* renamed from: a */
        private void m111056a() {
            C42961az.m136380a(this.f89504a);
        }

        public final /* synthetic */ Object call() {
            m111056a();
            return C7581n.f20898a;
        }
    }

    /* renamed from: b */
    private static int m111046b() {
        return C34334h.m111029a(NetworkUtils.getNetworkType(C6399b.m19921a()));
    }

    /* renamed from: c */
    private final void m111047c() {
        if (f89494e) {
            C1592h.m7855a((Callable<TResult>) new C34340c<TResult>(this), (Executor) C7258h.m22730c());
        } else {
            mo87188a();
        }
    }

    /* renamed from: d */
    private final void m111048d() {
        m111045a((Object) new C45460f(this.f89499c, ConnectState.CLOSING));
        C9758c.m28775a(1239108);
    }

    private C34337j() {
        boolean z = false;
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            Integer wsUseNewSdk = a.getWsUseNewSdk();
            if (wsUseNewSdk != null) {
                if (wsUseNewSdk.intValue() == 1) {
                    z = true;
                }
            }
        } catch (Exception unused) {
        }
        this.f89497a = z;
        this.f89498b = new C34332f();
        this.f89499c = "";
        this.f89501h = new C34339b(this);
        this.f89500d = Collections.synchronizedList(new ArrayList());
    }

    /* renamed from: a */
    public final void mo87188a() {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (!C6399b.m19944t()) {
            String providerString = ((WSHelper) ServiceManager.get().getService(WSHelper.class)).getProviderString();
            CharSequence charSequence = providerString;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                try {
                    JSONArray jSONArray = new JSONArray(providerString);
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        arrayList.add(jSONArray.getString(i));
                    }
                } catch (JSONException unused) {
                }
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add("wss://frontier.musical.ly/ws/v2");
        }
        Map hashMap = new HashMap();
        NetUtil.putCommonParams(hashMap, false);
        hashMap.put("ne", String.valueOf(m111046b()));
        hashMap.put("is_background", String.valueOf(C34334h.m111034g()));
        if (C6399b.m19944t()) {
            C7120e currentI18nItem = ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getCurrentI18nItem(C6399b.m19921a());
            C7573i.m23582a((Object) currentI18nItem, "ServiceManager.get().get….getApplicationContext())");
            String b = currentI18nItem.mo18531b();
            C7573i.m23582a((Object) b, "ServiceManager.get().get…cationContext()).language");
            hashMap.put("language", b);
        }
        C9758c.m28779a(C9748a.m28742a(1239108).mo24130a("e1bd35ec9db7b8d846de66ed140b1ad9").mo24134b(9).mo24136c(AppLog.getAppId()).mo24138d(((WSHelper) ServiceManager.get().getService(WSHelper.class)).getAppVersionCode()).mo24135b(AppLog.getServerDeviceId()).mo24137c(AppLog.getInstallId()).mo24131a((List<String>) arrayList).mo24132a(hashMap).mo24133a(), AppLog.getSessionKey());
    }

    public /* synthetic */ C34337j(C7571f fVar) {
        this();
    }

    /* renamed from: a */
    public static void m111045a(Object obj) {
        C1592h.m7855a((Callable<TResult>) new C34341d<TResult>(obj), C1592h.f5958b);
    }

    @C7709l
    public final void onCloseWs(C45443a aVar) {
        C7573i.m23587b(aVar, "event");
        m111048d();
    }

    @C7709l
    public final void onOpenWs(C45444b bVar) {
        C7573i.m23587b(bVar, "event");
        m111047c();
    }

    /* renamed from: a */
    public final void mo87189a(Application application) {
        C7573i.m23587b(application, "context");
        if (this.f89497a) {
            C9758c.m28776a(application, this.f89501h);
            synchronized (this) {
                C42961az.m136382c(this);
            }
            return;
        }
        C45441a.m143654a(application).mo108834a();
    }

    @C7709l
    public final void onSendWs(C45446d dVar) {
        C7573i.m23587b(dVar, "event");
        if (dVar.f117044b != null) {
            C9826a a = C9826a.m28999a(1239108);
            C45447e eVar = dVar.f117044b;
            C7573i.m23582a((Object) eVar, "event.wsMsgHolder");
            C9826a a2 = a.mo24368a(eVar.f117048d);
            C45447e eVar2 = dVar.f117044b;
            C7573i.m23582a((Object) eVar2, "event.wsMsgHolder");
            C9826a b = a2.mo24374b(eVar2.f117047c);
            C45447e eVar3 = dVar.f117044b;
            C7573i.m23582a((Object) eVar3, "event.wsMsgHolder");
            C9826a c = b.mo24376c(eVar3.f117050f);
            C45447e eVar4 = dVar.f117044b;
            C7573i.m23582a((Object) eVar4, "event.wsMsgHolder");
            C9826a b2 = c.mo24373b(eVar4.f117049e);
            C45447e eVar5 = dVar.f117044b;
            C7573i.m23582a((Object) eVar5, "event.wsMsgHolder");
            C9826a a3 = b2.mo24371a(eVar5.f117046b);
            C45447e eVar6 = dVar.f117044b;
            C7573i.m23582a((Object) eVar6, "event.wsMsgHolder");
            C9826a a4 = a3.mo24369a(eVar6.f117051g);
            C45447e eVar7 = dVar.f117044b;
            C7573i.m23582a((Object) eVar7, "event.wsMsgHolder");
            C9826a b3 = a4.mo24375b(eVar7.f117052h);
            C45447e eVar8 = dVar.f117044b;
            C7573i.m23582a((Object) eVar8, "event.wsMsgHolder");
            Map a5 = eVar8.mo108841a();
            if (a5 != null) {
                for (Entry entry : a5.entrySet()) {
                    b3.mo24370a((String) entry.getKey(), (String) entry.getValue());
                }
            }
            C9758c.m28780a(b3.mo24372a());
        }
    }
}
