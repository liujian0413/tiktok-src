package com.bytedance.android.livesdk.browser.jsbridge;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.android.live.C2317a;
import com.bytedance.android.live.core.utils.C3384d;
import com.bytedance.android.live.uikit.dialog.C3533b;
import com.bytedance.android.live.uikit.dialog.C3533b.C3534a;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4085a;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4087aa;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4091ab;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4096ae;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4097af;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4098ag;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4099ah;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4106am;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4107an;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4110ap;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4111aq;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4124aw;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4159bo;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4161bp;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4165e;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4166f;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4168g;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4170h;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4175l;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4214y;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4215z;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.OpenCashVerifyMethod;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.ResetHostVerifyMethod;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.SendRedEnvelopSuccessMethod;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.ToastMethod;
import com.bytedance.android.livesdk.browser.jsbridge.p201c.C4041a;
import com.bytedance.android.livesdk.browser.jsbridge.p201c.C4045d;
import com.bytedance.android.livesdk.browser.jsbridge.p201c.C4049f;
import com.bytedance.android.livesdk.browser.jsbridge.p201c.C4055h;
import com.bytedance.android.livesdk.browser.jsbridge.p201c.C4057i;
import com.bytedance.android.livesdk.browser.jsbridge.p201c.C4058j;
import com.bytedance.android.livesdk.browser.jsbridge.p201c.C4060l;
import com.bytedance.android.livesdk.browser.p193c.C3971a;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.web.jsbridge2.C11155d;
import com.bytedance.ies.web.jsbridge2.C11167k;
import com.bytedance.ies.web.jsbridge2.C11174p;
import com.bytedance.ies.web.jsbridge2.C11176q;
import com.bytedance.ies.web.p582a.C11093e;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.b */
public final class C4037b implements C3971a {

    /* renamed from: a */
    private static List<String> f12016a;

    /* renamed from: b */
    private static List<String> f12017b;

    /* renamed from: c */
    private C11174p f12018c;

    /* renamed from: d */
    private C11176q f12019d;

    /* renamed from: e */
    private WeakReference<Context> f12020e;

    /* renamed from: f */
    private WeakReference<C3533b> f12021f;

    /* renamed from: g */
    private Activity f12022g;

    /* renamed from: a */
    public final C11174p mo11529a() {
        return this.f12018c;
    }

    /* renamed from: c */
    public final C11176q mo11657c() {
        return this.f12019d;
    }

    /* renamed from: b */
    public final void mo11530b() {
        this.f12018c.mo27205a();
        this.f12019d.mo27212a();
    }

    /* renamed from: d */
    public final void mo11658d() {
        C3533b bVar;
        if (this.f12021f != null) {
            bVar = (C3533b) this.f12021f.get();
        } else {
            bVar = null;
        }
        if (bVar != null && bVar.isShowing()) {
            bVar.dismiss();
        }
    }

    /* renamed from: g */
    private static List<String> m14098g() {
        if (f12017b != null) {
            return f12017b;
        }
        ArrayList arrayList = new ArrayList();
        f12017b = arrayList;
        arrayList.add("config");
        f12017b.add("appInfo");
        f12017b.add("login");
        f12017b.add("logout");
        f12017b.add("close");
        f12017b.add("gallery");
        f12017b.add("toggleGalleryBars");
        f12017b.add("slideShow");
        f12017b.add("relatedShow");
        f12017b.add("toast");
        f12017b.add("slideDownload");
        f12017b.add("requestChangeOrientation");
        f12017b.add("adInfo");
        return f12017b;
    }

    /* renamed from: f */
    private static List<String> m14097f() {
        if (f12016a != null) {
            return f12016a;
        }
        ArrayList arrayList = new ArrayList();
        f12016a = arrayList;
        arrayList.add("snssdk.com");
        f12016a.add("toutiao.com");
        f12016a.add("neihanshequ.com");
        f12016a.add("youdianyisi.com");
        f12016a.add("admin.bytedance.com");
        f12016a.add("bytecdn.cn");
        f12016a.add("fe.byted.org");
        f12016a.add("jinritemai.com");
        f12016a.add("chengzijianzhan.com");
        f12016a.add("bytedance.net");
        f12016a.add("amemv.com");
        f12016a.add("live.bytedance.com");
        f12016a.add("test-live.bytedance.com");
        f12016a.add("live.juliangyinqing.com");
        f12016a.add("huoshan.com");
        f12016a.add("ixigua.com");
        f12016a.add("musical.ly");
        f12016a.add("tiktokv.com");
        f12016a.add("hypstar.com");
        f12016a.add("pstatp.com");
        f12016a.add("bytedance.net");
        f12016a.add("tiktok.com");
        f12016a.add("boe-gateway.byted.org");
        f12016a.add("s16a.tiktokcdn.com");
        List<String> list = (List) LiveConfigSettingKeys.LIVE_JS_WHITE_LIST.mo10240a();
        if (!C6311g.m19573a(list)) {
            for (String str : list) {
                if (!f12016a.contains(str)) {
                    f12016a.add(str);
                }
            }
        }
        f12016a.addAll(TTLiveSDKContext.getHostService().mo22368i().mo23271a());
        return f12016a;
    }

    /* renamed from: e */
    private void m14096e() {
        C4057i iVar = new C4057i(this.f12020e);
        this.f12018c.mo27202a((C11170n) this.f12019d).mo27204a("appInfo", (C11155d<?, ?>) new C4166f<Object,Object>()).mo27204a("getXTtToken", (C11155d<?, ?>) new C4214y<Object,Object>()).mo27204a("userInfo", (C11155d<?, ?>) new C4159bo<Object,Object>()).mo27204a("apiParam", (C11155d<?, ?>) new C4165e<Object,Object>()).mo27204a("toast", (C11155d<?, ?>) new ToastMethod<Object,Object>()).mo27204a("sendRedEnvelopSuccess", (C11155d<?, ?>) new SendRedEnvelopSuccessMethod<Object,Object>()).mo27204a("sendLogV3", (C11155d<?, ?>) new C4110ap<Object,Object>()).mo27204a("sendLogV1", (C11155d<?, ?>) new C4111aq<Object,Object>()).mo27204a("sendMonitor", (C11155d<?, ?>) new C4096ae<Object,Object>()).mo27204a("setBannerVisibility", (C11155d<?, ?>) new C4168g<Object,Object>()).mo27204a("baseInfo", (C11155d<?, ?>) new C4170h<Object,Object>()).mo27204a("close", (C11155d<?, ?>) new C4175l<Object,Object>(this.f12022g)).mo27204a("isTeenMode", (C11155d<?, ?>) new C4215z<Object,Object>()).mo27204a("sendPokemon", (C11155d<?, ?>) new C4091ab<Object,Object>()).mo27204a("statusNotification", (C11155d<?, ?>) new C4097af<Object,Object>()).mo27203a("sendGift", C4063d.f12052a).mo27204a("payPanel", (C11155d<?, ?>) new C4099ah<Object,Object>()).mo27204a("registerMessage", (C11155d<?, ?>) new C4106am<Object,Object>()).mo27203a("download", C4070k.f12059a).mo27203a("cashdesk", C4071l.f12060a).mo27203a("liveLoading", C4072m.f12061a).mo27203a("userAction", C4073n.f12062a).mo27203a("fetch", C4216o.f12321a).mo27203a("fetchPb", C4217p.f12322a).mo27203a("app.showModal", C4218q.f12323a).mo27203a("login", C4219r.f12324a).mo27203a("setFansStatus", C4064e.f12053a).mo27203a("verifyZhimaCredit", C4065f.f12054a).mo27203a("portalAction", C4066g.f12055a).mo27203a("lotteryAction", C4067h.f12056a).mo27203a("dialog", C4068i.f12057a).mo27203a("comment", C4069j.f12058a).mo27204a("resetHostVerify", (C11155d<?, ?>) new ResetHostVerifyMethod<Object,Object>()).mo27204a("saveLocalData", (C11155d<?, ?>) new C4107an<Object,Object>()).mo27204a("openCashVerify", (C11155d<?, ?>) new OpenCashVerifyMethod<Object,Object>()).mo27204a("showDouPlusDialog", (C11155d<?, ?>) new C4124aw<Object,Object>()).mo27204a("openKoiRedpacket", (C11155d<?, ?>) new C4098ag<Object,Object>()).mo27204a("addRedDot", (C11155d<?, ?>) new C4085a<Object,Object>()).mo27204a("webviewNavigation", (C11155d<?, ?>) new C4161bp<Object,Object>(this.f12018c.f30324d));
        C4087aa.m14168a(this.f12018c);
        this.f12019d.mo27210a("openHotsoon", (C11093e) iVar).mo27210a("openLive", (C11093e) iVar).mo27210a("userStatusChange", (C11093e) new C4060l()).mo27210a("livePay", (C11093e) new C4049f(this.f12020e)).mo27210a("liveCashVerify", (C11093e) new C4045d(this.f12020e, this.f12019d)).mo27210a("openLiveRecharge", (C11093e) new C4058j()).mo27210a("copyToClipboard", (C11093e) new C4041a((Context) this.f12020e.get()));
        this.f12019d.mo27210a("openBindPhone", (C11093e) new C4055h(this.f12020e));
    }

    /* renamed from: a */
    public final void mo11656a(String str, Callback callback) {
        C3533b bVar;
        if (!C6319n.m19593a(str) && callback != null) {
            Activity a = C3384d.m12589a((Context) this.f12020e.get());
            if (a != null) {
                if (this.f12021f != null) {
                    bVar = (C3533b) this.f12021f.get();
                } else {
                    bVar = null;
                }
                if (bVar != null && bVar.isShowing()) {
                    bVar.dismiss();
                }
                C3534a aVar = new C3534a(a);
                aVar.mo10648a((int) R.string.elv);
                aVar.mo10660b((CharSequence) a.getString(R.string.elu, new Object[]{str}));
                C4040c cVar = new C4040c(callback, str);
                aVar.mo10659b((int) R.string.elt, (OnClickListener) cVar);
                aVar.mo10649a((int) R.string.els, (OnClickListener) cVar);
                aVar.mo10656a(false);
                this.f12021f = new WeakReference<>(aVar.mo10662b());
            }
        }
    }

    private C4037b(Activity activity, C11174p pVar, C11176q qVar) {
        this.f12022g = activity;
        this.f12020e = new WeakReference<>(activity);
        this.f12018c = pVar;
        this.f12019d = qVar;
        m14096e();
    }

    /* renamed from: a */
    static final /* synthetic */ void m14095a(Callback callback, String str, DialogInterface dialogInterface, int i) {
        if (i == -2) {
            callback.invoke(str, false, false);
            dialogInterface.dismiss();
            return;
        }
        if (i == -1) {
            callback.invoke(str, true, true);
            dialogInterface.dismiss();
        }
    }

    /* renamed from: a */
    public static C4037b m14094a(Activity activity, WebView webView, WebViewClient webViewClient, WebChromeClient webChromeClient) {
        C11174p a = C11174p.m32711a(webView).mo27183a((Context) activity).mo27184a((C11167k) new C11167k() {
            /* renamed from: a */
            public final <T> String mo11660a(T t) {
                return C2317a.m9932a().mo15979b((Object) t);
            }

            /* renamed from: a */
            public final <T> T mo11659a(String str, Type type) {
                return C9178j.m27302j().mo22372a().mo15975a(str, type);
            }
        }).mo27190b(false).mo27191c(true).mo27187a((Collection<String>) m14097f()).mo27186a("ToutiaoJSBridge").mo27189a();
        return new C4037b(activity, a, C11176q.m32722a(webView, a).mo27214b("bytedance").mo27209a(webViewClient).mo27208a(webChromeClient).mo27215b(m14097f()).mo27211a(m14098g()));
    }
}
