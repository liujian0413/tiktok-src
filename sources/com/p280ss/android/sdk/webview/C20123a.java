package com.p280ss.android.sdk.webview;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.uikit.dialog.C11029b;
import com.bytedance.ies.uikit.dialog.C11029b.C11030a;
import com.bytedance.ies.web.p582a.C11093e;
import com.bytedance.ies.web.p582a.C11094f;
import com.bytedance.ies.web.p582a.C11095g;
import com.bytedance.ies.web.p582a.C11097i;
import com.p280ss.android.common.p288d.C19282c;
import com.p280ss.android.sdk.webview.C20146m.C20148a;
import com.p280ss.android.sdk.webview.p901b.C20128a;
import com.p280ss.android.sdk.webview.p901b.C20128a.C20129a;
import com.p280ss.android.sdk.webview.p901b.C20130b;
import com.p280ss.android.sdk.webview.p901b.C20131c;
import com.p280ss.android.sdk.webview.p901b.C20132d;
import com.p280ss.android.sdk.webview.p901b.C20133e;
import com.p280ss.android.sdk.webview.p901b.C20134f;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.sdk.webview.a */
public abstract class C20123a implements C6310a, C11095g, C20129a, C20148a {

    /* renamed from: a */
    protected DMTJsBridge f54477a;

    /* renamed from: b */
    protected WeakReference<C11029b> f54478b;

    /* renamed from: c */
    protected WeakReference<Context> f54479c;

    /* renamed from: d */
    protected List<String> f54480d;

    /* renamed from: e */
    protected C11094f f54481e;

    /* renamed from: f */
    protected List<String> f54482f;

    /* renamed from: g */
    protected long f54483g;

    /* renamed from: h */
    protected String f54484h;

    /* renamed from: i */
    protected int f54485i;

    /* renamed from: j */
    protected String f54486j;

    /* renamed from: k */
    protected String f54487k;

    /* renamed from: l */
    public String f54488l;

    /* renamed from: m */
    public String f54489m;

    /* renamed from: n */
    public long f54490n;

    /* renamed from: o */
    protected String f54491o;

    /* renamed from: p */
    protected String f54492p;

    /* renamed from: q */
    public Boolean f54493q = Boolean.valueOf(true);

    /* renamed from: r */
    private C20132d f54494r;

    /* renamed from: s */
    private Handler f54495s = new C6309f(this);

    /* renamed from: t */
    private String f54496t;

    /* renamed from: u */
    private C11097i f54497u;

    /* renamed from: v */
    private C20150o f54498v = null;

    /* renamed from: w */
    private JSONArray f54499w = new JSONArray();

    /* renamed from: a */
    public static String m66336a() {
        return "bytedance";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo53873b(DMTJsBridge dMTJsBridge, C20136d dVar);

    /* renamed from: a */
    public final boolean mo27072a(C11097i iVar) {
        return "call".equals(iVar.f30168a) && "config".equals(iVar.f30170c) && !C6319n.m19593a(iVar.f30169b);
    }

    /* renamed from: a */
    public final void mo53868a(final String str, final Callback callback) {
        if (this.f54493q.booleanValue() && !C6319n.m19593a(str) && callback != null) {
            Activity d = mo53877d();
            if (d != null) {
                C11029b bVar = this.f54478b != null ? (C11029b) this.f54478b.get() : null;
                if (bVar != null && bVar.isShowing()) {
                    bVar.dismiss();
                }
                C11030a aVar = new C11030a(d);
                aVar.mo26634a((int) R.string.bb0);
                aVar.mo26647b((CharSequence) d.getString(R.string.baz, new Object[]{str}));
                C201241 r0 = new OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
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
                };
                aVar.mo26646b((int) R.string.bay, (OnClickListener) r0);
                aVar.mo26635a((int) R.string.bax, (OnClickListener) r0);
                aVar.mo26642a(false);
                this.f54478b = new WeakReference<>(aVar.mo26649b());
            }
        }
    }

    /* renamed from: a */
    public final void mo53870a(String str, JSONObject jSONObject) {
        if (this.f54477a != null) {
            this.f54477a.mo53857a(str, jSONObject);
        }
    }

    /* renamed from: a */
    public final void mo53869a(String str, C20150o oVar, String str2) {
        if (str != null && str.equals(this.f54496t) && this.f54497u != null) {
            WebView webView = this.f54477a != null ? this.f54477a.f54458e : null;
            String url = webView != null ? webView.getUrl() : null;
            if (!C6319n.m19593a(url) && m66340e(url)) {
                try {
                    String host = Uri.parse(url).getHost();
                    if (host != null && host.equals(str2)) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", oVar != null ? 1 : 0);
                        List list = oVar != null ? oVar.f54531e : null;
                        if (this.f54481e != null) {
                            this.f54481e.mo27032a(list, this.f54497u, jSONObject);
                        }
                        this.f54498v = oVar;
                        this.f54496t = null;
                        this.f54497u = null;
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public void mo53871a(JSONObject jSONObject) throws Exception {
        if (!TextUtils.equals(this.f54491o, "1") || TextUtils.isEmpty(this.f54492p)) {
            jSONObject.put("cid", this.f54483g);
            jSONObject.put("group_id", this.f54490n);
            jSONObject.put("ad_type", this.f54485i);
            jSONObject.put("log_extra", this.f54486j);
            jSONObject.put("download_url", this.f54487k);
            jSONObject.put("package_name", this.f54488l);
            jSONObject.put("app_name", this.f54489m);
            jSONObject.put("code", this.f54483g == 0 ? 0 : 1);
        } else {
            JSONObject jSONObject2 = new JSONObject(this.f54492p);
            Iterator keys = jSONObject2.keys();
            while (keys.hasNext()) {
                try {
                    String str = (String) keys.next();
                    jSONObject.put(str, jSONObject2.opt(str));
                } catch (Exception unused) {
                    return;
                }
            }
        }
    }

    /* renamed from: f */
    public final void mo53880f() {
        this.f54494r.mo53891a();
    }

    /* renamed from: c */
    public List<String> mo53875c() {
        if (this.f54482f == null) {
            this.f54482f = new ArrayList();
        }
        return this.f54482f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Activity mo53877d() {
        Context context;
        if (this.f54479c != null) {
            context = (Context) this.f54479c.get();
        } else {
            context = null;
        }
        if (context != null && (context instanceof Activity)) {
            return (Activity) context;
        }
        return null;
    }

    /* renamed from: g */
    public final void mo53881g() {
        this.f54479c = null;
        if (this.f54477a != null) {
            this.f54477a.mo53861b();
            this.f54477a = null;
        }
        C20146m.m66392a().mo53923b(this);
        this.f54481e = null;
    }

    /* renamed from: e */
    public final void mo53879e() {
        C11029b bVar;
        if (this.f54478b != null) {
            bVar = (C11029b) this.f54478b.get();
        } else {
            bVar = null;
        }
        if (bVar != null && bVar.isShowing()) {
            bVar.dismiss();
        }
    }

    /* renamed from: b */
    public List<String> mo53872b() {
        if (this.f54480d == null) {
            this.f54480d = new ArrayList();
        }
        this.f54480d.add("config");
        this.f54480d.add("appInfo");
        this.f54480d.add("login");
        this.f54480d.add("close");
        this.f54480d.add("gallery");
        this.f54480d.add("toggleGalleryBars");
        this.f54480d.add("slideShow");
        this.f54480d.add("relatedShow");
        this.f54480d.add("toast");
        this.f54480d.add("slideDownload");
        this.f54480d.add("requestChangeOrientation");
        this.f54480d.add("adInfo");
        return this.f54480d;
    }

    /* renamed from: b */
    public final void mo53874b(String str) {
        m66339a("onGameComplete", str);
    }

    /* renamed from: d */
    public final void mo53878d(String str) {
        if (str != null && str.startsWith("bytedance://")) {
            reportLocalEvent(str);
        }
    }

    /* renamed from: e */
    private static boolean m66340e(String str) {
        if (C6319n.m19593a(str)) {
            return false;
        }
        if (str.startsWith("http://") || str.startsWith("https://")) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo53876c(String str) {
        if (this.f54477a != null) {
            return this.f54477a.mo53859a(str);
        }
        return false;
    }

    public C20123a(Context context) {
        this.f54479c = new WeakReference<>(context);
        C20146m.m66392a().mo53921a(this);
    }

    @JavascriptInterface
    public boolean reportLocalEvent(String str) {
        if (C6319n.m19593a(str)) {
            return false;
        }
        boolean z = true;
        try {
            Uri parse = Uri.parse(str);
            if (!"log_event".equals(parse.getHost())) {
                return false;
            }
            try {
                Message obtainMessage = this.f54495s.obtainMessage(1);
                obtainMessage.obj = parse;
                this.f54495s.sendMessage(obtainMessage);
            } catch (Exception unused) {
            }
            return z;
        } catch (Exception unused2) {
            z = false;
        }
    }

    /* renamed from: a */
    private void m66338a(DMTJsBridge dMTJsBridge) {
        this.f54494r = new C20132d(dMTJsBridge.f54455b, mo53877d());
        dMTJsBridge.mo53855a("isAppInstalled", (C11093e) new C20130b(this.f54479c)).mo53855a("open", (C11093e) new C20133e(this.f54479c)).mo53855a("login", (C11093e) this.f54494r).mo53855a("copyToClipboard", (C11093e) new C20131c(mo53877d())).mo53855a("adInfo", (C11093e) new C20128a(this)).mo53855a("openThirdApp", (C11093e) new C20134f(mo53877d()));
    }

    public void handleMsg(Message message) {
        long j;
        long j2;
        JSONObject jSONObject;
        if (message.what == 1) {
            try {
                if (message.obj instanceof Uri) {
                    Uri uri = (Uri) message.obj;
                    if ("log_event".equals(uri.getHost())) {
                        String queryParameter = uri.getQueryParameter("category");
                        String queryParameter2 = uri.getQueryParameter("tag");
                        String queryParameter3 = uri.getQueryParameter("label");
                        try {
                            j = Long.parseLong(uri.getQueryParameter("value"));
                        } catch (Exception unused) {
                            j = 0;
                        }
                        try {
                            j2 = Long.parseLong(uri.getQueryParameter("ext_value"));
                        } catch (Exception unused2) {
                            j2 = 0;
                        }
                        String queryParameter4 = uri.getQueryParameter("extra");
                        if (!C6319n.m19593a(queryParameter4)) {
                            try {
                                jSONObject = new JSONObject(queryParameter4);
                            } catch (Exception unused3) {
                            }
                            C19282c.m63185a((Context) this.f54479c.get(), queryParameter, queryParameter2, queryParameter3, j, j2, jSONObject);
                        }
                        jSONObject = null;
                        C19282c.m63185a((Context) this.f54479c.get(), queryParameter, queryParameter2, queryParameter3, j, j2, jSONObject);
                    }
                }
            } catch (Exception unused4) {
            }
        }
    }

    /* renamed from: a */
    public final void mo53866a(String str) {
        m66339a("onGameStart", str);
    }

    /* renamed from: a */
    private void m66339a(String str, String... strArr) {
        if (this.f54477a != null) {
            this.f54477a.mo53858a(str, strArr);
        }
    }

    /* renamed from: a */
    public final void mo53865a(DMTJsBridge dMTJsBridge, C20136d dVar) {
        this.f54477a = dMTJsBridge;
        if (this.f54477a != null) {
            m66338a(this.f54477a);
            mo53873b(this.f54477a, dVar);
        }
    }

    /* renamed from: a */
    public final void mo53867a(String str, int i) {
        m66339a("onGameProgress", str, String.valueOf(i));
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a4  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m66337a(com.bytedance.ies.web.p582a.C11097i r7, org.json.JSONObject r8, java.lang.String r9) throws java.lang.Exception {
        /*
            r6 = this;
            org.json.JSONObject r0 = r7.f30171d
            r1 = 0
            r6.f54496t = r1
            r6.f54497u = r1
            if (r0 == 0) goto L_0x001f
            java.lang.String r2 = "client_id"
            boolean r2 = r0.has(r2)
            if (r2 == 0) goto L_0x0018
            java.lang.String r2 = "client_id"
            java.lang.String r0 = r0.optString(r2)
            goto L_0x0020
        L_0x0018:
            java.lang.String r2 = "clientID"
            java.lang.String r0 = r0.optString(r2)
            goto L_0x0020
        L_0x001f:
            r0 = r1
        L_0x0020:
            boolean r2 = com.bytedance.common.utility.C6319n.m19593a(r0)
            r3 = 0
            if (r2 == 0) goto L_0x0032
            java.lang.String r9 = "code"
            r8.put(r9, r3)
            com.bytedance.ies.web.a.f r9 = r6.f54481e
            r9.mo27032a(r1, r7, r8)
            return
        L_0x0032:
            boolean r2 = com.bytedance.common.utility.C6319n.m19593a(r9)
            if (r2 == 0) goto L_0x0043
            java.lang.String r9 = "code"
            r8.put(r9, r3)
            com.bytedance.ies.web.a.f r9 = r6.f54481e
            r9.mo27032a(r1, r7, r8)
            return
        L_0x0043:
            android.net.Uri r2 = android.net.Uri.parse(r9)     // Catch:{ Exception -> 0x004c }
            java.lang.String r2 = r2.getHost()     // Catch:{ Exception -> 0x004c }
            goto L_0x004d
        L_0x004c:
            r2 = r1
        L_0x004d:
            boolean r4 = r6.mo53876c(r9)
            r5 = 1
            if (r4 == 0) goto L_0x005f
            java.lang.String r9 = "code"
            r8.put(r9, r5)
            com.bytedance.ies.web.a.f r9 = r6.f54481e
            r9.mo27032a(r1, r7, r8)
            return
        L_0x005f:
            boolean r9 = m66340e(r9)
            if (r9 != 0) goto L_0x0066
            return
        L_0x0066:
            java.lang.ref.WeakReference<android.content.Context> r9 = r6.f54479c
            if (r9 == 0) goto L_0x007d
            java.lang.ref.WeakReference<android.content.Context> r9 = r6.f54479c
            java.lang.Object r9 = r9.get()
            android.content.Context r9 = (android.content.Context) r9
            if (r9 == 0) goto L_0x007d
            com.ss.android.sdk.webview.m r4 = com.p280ss.android.sdk.webview.C20146m.m66392a()
            com.ss.android.sdk.webview.o r9 = r4.mo53919a(r9, r2, r0)
            goto L_0x007e
        L_0x007d:
            r9 = r1
        L_0x007e:
            if (r9 != 0) goto L_0x0095
            android.app.Activity r4 = r6.mo53877d()
            boolean r4 = com.p280ss.android.sdk.webview.C20127b.m66364a(r4)
            if (r4 != 0) goto L_0x0095
            java.lang.String r9 = "code"
            r8.put(r9, r3)
            com.bytedance.ies.web.a.f r9 = r6.f54481e
            r9.mo27032a(r1, r7, r8)
            return
        L_0x0095:
            if (r9 == 0) goto L_0x00a4
            java.lang.String r0 = "code"
            r8.put(r0, r5)
            com.bytedance.ies.web.a.f r0 = r6.f54481e
            java.util.List<java.lang.String> r9 = r9.f54531e
            r0.mo27032a(r9, r7, r8)
            return
        L_0x00a4:
            java.lang.String r8 = com.p280ss.android.sdk.webview.C20150o.m66405a(r2, r0)
            r6.f54496t = r8
            r6.f54497u = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.sdk.webview.C20123a.m66337a(com.bytedance.ies.web.a.i, org.json.JSONObject, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo27071a(C11097i iVar, JSONObject jSONObject, String str, C11094f fVar) {
        try {
            this.f54481e = fVar;
            if (this.f54481e != null) {
                m66337a(iVar, jSONObject, str);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo53864a(long j, String str, int i, String str2, String str3, String str4, String str5) {
        this.f54483g = j;
        this.f54484h = str;
        this.f54485i = i;
        this.f54486j = str2;
        this.f54487k = str3;
        this.f54491o = str4;
        this.f54492p = str5;
    }
}
