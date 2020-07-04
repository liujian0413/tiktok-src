package com.p280ss.android.ugc.aweme.notice.api.p1430ws;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.common.utility.C6319n;
import com.bytedance.framwork.core.monitor.C6379c;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.geckoclient.C10873f;
import com.bytedance.ies.geckoclient.model.C10913l;
import com.bytedance.ies.geckoclient.p571e.C10871g;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.common.util.NetworkUtils;
import com.p280ss.android.common.util.NetworkUtils.NetworkType;
import com.p280ss.android.ugc.aweme.C7162m;
import com.p280ss.android.ugc.aweme.base.utils.C6900g;
import com.p280ss.android.ugc.aweme.common.net.C25706a;
import com.p280ss.android.ugc.aweme.framework.services.IUserService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.language.I18nManagerService;
import com.p280ss.android.ugc.aweme.notice.api.bean.C34308b;
import com.p280ss.android.ugc.aweme.notice.api.bean.MessageType;
import com.p280ss.android.ugc.aweme.notice.api.helper.WSHelper;
import com.p280ss.android.ugc.aweme.notice.api.p1425a.C34297a;
import com.p280ss.android.ugc.aweme.notice.api.p1429sp.C34320a;
import com.p280ss.android.ugc.aweme.notice.api.p1429sp.C34323d;
import com.p280ss.android.ugc.aweme.p313im.service.C7101f;
import com.p280ss.android.ugc.aweme.p313im.service.IIMService;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43171v;
import com.p280ss.android.websocket.p344ws.C45441a;
import com.p280ss.android.websocket.p344ws.WebSocketStatus.ConnectState;
import com.p280ss.android.websocket.p344ws.output.C45455a;
import com.p280ss.android.websocket.p344ws.output.C45456b;
import com.p280ss.android.websocket.p344ws.output.C45457c;
import com.p280ss.android.websocket.p344ws.output.C45458d;
import com.p280ss.android.websocket.p344ws.output.C45460f;
import com.p280ss.android.websocket.p344ws.p1781a.C45443a;
import com.p280ss.android.websocket.p344ws.p1781a.C45444b;
import com.p280ss.android.websocket.p344ws.p1781a.C45445c;
import com.p280ss.android.websocket.p344ws.p1781a.C45446d;
import com.p280ss.android.websocket.p344ws.p1781a.C45447e;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import okio.ByteString;
import org.greenrobot.eventbus.C7709l;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.notice.api.ws.h */
public class C34334h implements C7162m {

    /* renamed from: c */
    private static final String f89483c = "com.ss.android.ugc.aweme.notice.api.ws.h";

    /* renamed from: j */
    private static C34334h f89484j = new C34334h();

    /* renamed from: a */
    public String f89485a = "";

    /* renamed from: b */
    public boolean f89486b;

    /* renamed from: d */
    private String f89487d;

    /* renamed from: e */
    private boolean f89488e;

    /* renamed from: f */
    private boolean f89489f;

    /* renamed from: g */
    private boolean f89490g;

    /* renamed from: h */
    private long f89491h;

    /* renamed from: i */
    private final HashMap<MessageType, Set<C34297a>> f89492i = new HashMap<>();

    /* renamed from: d */
    public static C34334h m111033d() {
        return f89484j;
    }

    /* renamed from: a */
    public final void mo18611a() {
        m111036i();
    }

    /* renamed from: b */
    public final void mo18612b() {
        m111036i();
    }

    /* renamed from: c */
    public final void mo18613c() {
    }

    @C7709l
    public void onEvent(C45455a aVar) {
    }

    private C34334h() {
    }

    /* renamed from: g */
    public static int m111034g() {
        if (((WSHelper) ServiceManager.get().getService(WSHelper.class)).isAppBackground()) {
            return 1;
        }
        return 0;
    }

    /* renamed from: e */
    public final String mo87179e() {
        if (C34337j.f89496g.mo87193a().f89497a) {
            return C34337j.f89496g.mo87193a().f89499c;
        }
        return this.f89487d;
    }

    /* renamed from: i */
    private void m111036i() {
        HashMap hashMap = new HashMap();
        hashMap.put("IsBackground", String.valueOf(m111034g()));
        C45447e eVar = new C45447e(this.f89487d, 9000, 0, 0, 4, new byte[]{0}, "", "", hashMap);
        C42961az.m136380a(new C45446d(this.f89487d, eVar));
    }

    /* renamed from: h */
    private boolean m111035h() {
        String sessionKey = AppLog.getSessionKey();
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService == null || !iUserService.isLogin()) {
            sessionKey = "";
        }
        boolean z = !TextUtils.equals(this.f89485a, sessionKey);
        StringBuilder sb = new StringBuilder("check session key: lastKey=");
        sb.append(this.f89485a);
        sb.append(", curKey=");
        sb.append(sessionKey);
        m111031a(sb.toString());
        if (z) {
            this.f89485a = sessionKey;
            this.f89488e = true;
        }
        return z;
    }

    /* renamed from: f */
    public final void mo87180f() {
        String str;
        if (C6900g.m21454b().mo16943d()) {
            m111031a("start connect ws");
            if (((C34320a) C34323d.m111009a(C34320a.class)).mo60343f()) {
                str = "wss://frontier.musical.ly/ws/v2";
            } else {
                str = "ws://frontier.musical.ly/ws/v2";
            }
            if (!C6399b.m19944t() || ((C34320a) C34323d.m111009a(C34320a.class)).mo60345h()) {
                String providerString = ((WSHelper) ServiceManager.get().getService(WSHelper.class)).getProviderString();
                if (!TextUtils.isEmpty(providerString)) {
                    try {
                        JSONArray jSONArray = new JSONArray(providerString);
                        int i = 0;
                        while (true) {
                            if (i >= jSONArray.length()) {
                                break;
                            }
                            String optString = jSONArray.optString(i);
                            if (!TextUtils.isEmpty(optString) && optString.startsWith("wss:")) {
                                str = optString;
                                break;
                            }
                            i++;
                        }
                    } catch (JSONException unused) {
                    }
                }
            }
            if (C34336i.m111044a(C43171v.m136920a())) {
                str = "ws://10.225.70.181:5998/ws/v2";
            }
            String str2 = this.f89487d;
            this.f89487d = str;
            if ((!C6319n.m19593a(str2) && !C6319n.m19594a(this.f89487d, str2)) || m111035h()) {
                m111031a("start close last connection");
                m111032b(str2);
            }
            m111031a("start connect ws real");
            C45444b bVar = new C45444b(this.f89487d, new C34332f(), new C45445c() {
                /* renamed from: a */
                public final String mo87187a() {
                    StringBuilder sb = new StringBuilder();
                    AppLog.appendCommonParams(sb, false);
                    sb.append("&aid=");
                    sb.append(AppLog.getAppId());
                    sb.append("&device_id=");
                    sb.append(AppLog.getServerDeviceId());
                    sb.append("&access_key=");
                    sb.append(C45441a.m143655a("9", "e1bd35ec9db7b8d846de66ed140b1ad9", AppLog.getServerDeviceId()));
                    sb.append("&fpid=");
                    sb.append(9);
                    sb.append("&iid=");
                    sb.append(AppLog.getInstallId());
                    sb.append("&sid=");
                    sb.append(C34334h.this.f89485a);
                    sb.append("&wid=");
                    sb.append(0);
                    sb.append("&pl=");
                    sb.append(0);
                    sb.append("&ne=");
                    sb.append(C34334h.m111029a(NetworkUtils.getNetworkType(C6399b.m19921a())));
                    if (C6399b.m19944t()) {
                        sb.append("&language=");
                        sb.append(((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getCurrentI18nItem(C6399b.m19921a()).mo18531b());
                    }
                    sb.append("&is_background=");
                    sb.append(C34334h.m111034g());
                    return sb.toString();
                }
            });
            ((WSHelper) ServiceManager.get().getService(WSHelper.class)).registerAppLifecycleObserver(this);
            C42961az.m136380a(bVar);
            synchronized (this) {
                C42961az.m136382c(this);
            }
        }
    }

    /* renamed from: b */
    private static void m111032b(String str) {
        C42961az.m136380a(new C45443a(str));
    }

    /* renamed from: a */
    public static int m111029a(NetworkType networkType) {
        if (networkType == NetworkType.WIFI) {
            return 1;
        }
        if (networkType == NetworkType.MOBILE_2G) {
            return 2;
        }
        if (networkType == NetworkType.MOBILE_3G) {
            return 3;
        }
        if (networkType == NetworkType.MOBILE_4G) {
            return 4;
        }
        return 0;
    }

    /* renamed from: a */
    private void m111030a(C34308b bVar) {
        if (bVar != null) {
            Set<C34297a> set = (Set) this.f89492i.get(bVar.msgType);
            if (set != null) {
                for (C34297a a : set) {
                    a.mo85003a(bVar);
                }
            }
        }
    }

    @C7709l
    public void onEvent(C25706a aVar) {
        if (C6900g.m21454b().mo16943d()) {
            mo87180f();
            return;
        }
        if (!((WSHelper) ServiceManager.get().getService(WSHelper.class)).isAppBackground()) {
            C10761a.m31399c(C6399b.m19921a(), (int) R.string.b1y).mo25750a();
        }
    }

    /* renamed from: a */
    private static void m111031a(String str) {
        IIMService iIMService = (IIMService) ServiceManager.get().getService(IIMService.class);
        if (iIMService != null) {
            C7101f iMErrorMonitor = iIMService.getIMErrorMonitor();
            if (iMErrorMonitor != null) {
                iMErrorMonitor.mo17975a(str);
            }
        }
    }

    @C7709l
    public void onEvent(C45456b bVar) {
        if (this.f89490g) {
            this.f89489f = false;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("total_duration", SystemClock.uptimeMillis() - this.f89491h);
                C6379c.m19823a("aweme_long_connection_error_rate", 0, jSONObject);
            } catch (Exception unused) {
            }
        }
        this.f89490g = false;
    }

    @C7709l
    public void onEvent(C45457c cVar) {
        StringBuilder sb = new StringBuilder("ReceivedMsgEvent receive message method=");
        sb.append(cVar.f117067d);
        sb.append("  service=");
        sb.append(cVar.f117068e);
        sb.append(" url=");
        sb.append(cVar.f117064a);
        Object obj = cVar.f117066c;
        if (obj instanceof C34308b) {
            m111030a((C34308b) obj);
        } else if (!C6399b.m19944t() && cVar.f117067d == 1 && cVar.f117068e == 1004) {
            ((WSHelper) ServiceManager.get().getService(WSHelper.class)).handleWsCloudMessage(cVar);
        } else {
            if (C10871g.m31895a(cVar.f117068e)) {
                byte[] bArr = cVar.f117065b;
                if (bArr != null) {
                    C10913l lVar = new C10913l(cVar.f117067d, ByteString.m23795of(bArr).utf8());
                    C10873f normalGeckoClient = ((WSHelper) ServiceManager.get().getService(WSHelper.class)).getNormalGeckoClient();
                    if (normalGeckoClient != null) {
                        normalGeckoClient.mo26211a(lVar);
                    }
                }
            }
        }
    }

    @C7709l
    public void onEvent(C45458d dVar) {
        if (!this.f89489f && this.f89490g) {
            this.f89489f = true;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("total_duration", SystemClock.uptimeMillis() - this.f89491h);
                jSONObject.put("errorCode", dVar.f117070b.value);
                C6379c.m19823a("aweme_long_connection_error_rate", 1, jSONObject);
            } catch (Exception unused) {
            }
        }
        this.f89490g = false;
    }

    @C7709l
    public void onEvent(C45460f fVar) {
        boolean z = false;
        if ((fVar.f117075b == null || fVar.f117075b == ConnectState.CLOSED) && this.f89488e) {
            this.f89488e = false;
            mo87180f();
        }
        if (fVar.f117075b == ConnectState.OPENING) {
            this.f89491h = SystemClock.uptimeMillis();
            this.f89490g = true;
        }
        if (fVar.f117075b == ConnectState.CONNECTED) {
            z = true;
        }
        this.f89486b = z;
        if (this.f89486b) {
            C10873f normalGeckoClient = ((WSHelper) ServiceManager.get().getService(WSHelper.class)).getNormalGeckoClient();
            if (normalGeckoClient != null) {
                normalGeckoClient.mo26233j();
            }
        }
    }

    /* renamed from: a */
    public final void mo87178a(MessageType messageType, C34297a aVar) {
        Set set = (Set) this.f89492i.get(messageType);
        if (set == null) {
            set = new HashSet();
            this.f89492i.put(messageType, set);
        }
        set.add(aVar);
    }
}
