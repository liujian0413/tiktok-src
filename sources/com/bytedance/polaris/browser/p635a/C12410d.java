package com.bytedance.polaris.browser.p635a;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;
import android.os.Message;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.app.AlertDialog;
import android.support.p029v7.app.AlertDialog.C1081a;
import android.util.Base64;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.WebView;
import com.bytedance.common.utility.C6312h;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.polaris.base.C12375a;
import com.bytedance.polaris.base.C12376b;
import com.bytedance.polaris.browser.PolarisBrowserActivity;
import com.bytedance.polaris.browser.p635a.p636a.C12396c;
import com.bytedance.polaris.browser.p635a.p636a.C12396c.C12397a;
import com.bytedance.polaris.depend.C12424e;
import com.bytedance.polaris.depend.C12428i;
import com.bytedance.polaris.p634b.C12364o;
import com.bytedance.polaris.p634b.C12370u;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.polaris.browser.a.d */
public final class C12410d implements C6310a, C12389a, C12397a {

    /* renamed from: d */
    private static final List<String> f32956d;

    /* renamed from: a */
    protected final WeakReference<FragmentActivity> f32957a;

    /* renamed from: b */
    public final C12396c f32958b;

    /* renamed from: c */
    protected C6309f f32959c = new C6309f(this);

    /* renamed from: e */
    private final WeakReference<C12375a> f32960e;

    /* renamed from: f */
    private WebView f32961f;

    /* renamed from: g */
    private WeakReference<AlertDialog> f32962g;

    /* renamed from: b */
    public final void mo30253b() {
        this.f32958b.mo30271c();
    }

    /* renamed from: c */
    public final void mo30256c() {
        this.f32958b.mo30269b();
    }

    /* renamed from: d */
    public final void mo30258d() {
        this.f32958b.mo30263a();
    }

    /* renamed from: e */
    private Activity m36089e() {
        if (this.f32957a != null) {
            return (FragmentActivity) this.f32957a.get();
        }
        return null;
    }

    /* renamed from: a */
    public final void mo30249a() {
        AlertDialog alertDialog;
        if (this.f32962g != null) {
            alertDialog = (AlertDialog) this.f32962g.get();
        } else {
            alertDialog = null;
        }
        if (alertDialog != null && alertDialog.isShowing()) {
            alertDialog.dismiss();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        f32956d = arrayList;
        arrayList.add("dispatch_message");
        f32956d.add("private");
        f32956d.add("domReady");
        f32956d.add("log_event_v3");
        f32956d.add("close_current_page");
        f32956d.add("disable_swipe");
    }

    /* renamed from: a */
    private static boolean m36086a(Context context) {
        return context instanceof PolarisBrowserActivity;
    }

    /* renamed from: a */
    public final void mo30250a(String str) {
        if (str != null && str.startsWith("bytedance://")) {
            m36090e(str);
        }
    }

    /* renamed from: a */
    private void m36084a(C12409c cVar) throws Exception {
        if (cVar != null) {
            JSONObject jSONObject = new JSONObject();
            if (this.f32958b.mo30266a(cVar, jSONObject)) {
                if (!jSONObject.has("code")) {
                    jSONObject.put("code", 1);
                }
                mo30296a(cVar.f32952b, jSONObject);
            }
        }
    }

    /* renamed from: b */
    private void m36087b(JSONObject jSONObject) {
        if (this.f32961f != null) {
            StringBuilder sb = new StringBuilder("javascript:ToutiaoJSBridge._handleMessageFromToutiao(");
            sb.append(jSONObject.toString());
            sb.append(")");
            C12412e.m36103a(this.f32961f, sb.toString());
        }
    }

    /* renamed from: e */
    private void m36090e(String str) {
        if (!C6319n.m19593a(str)) {
            try {
                Uri parse = Uri.parse(str);
                if (mo30252a(parse)) {
                    Message obtainMessage = this.f32959c.obtainMessage(10);
                    obtainMessage.obj = parse;
                    this.f32959c.sendMessage(obtainMessage);
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void handleMsg(Message message) {
        if (message != null) {
            switch (message.what) {
                case 10:
                    Uri uri = null;
                    try {
                        if (message.obj instanceof Uri) {
                            uri = (Uri) message.obj;
                        }
                        if (uri != null) {
                            mo30254b(uri);
                        }
                        return;
                    } catch (Exception unused) {
                        break;
                    }
                case 11:
                    if (message.obj instanceof C12409c) {
                        try {
                            m36084a((C12409c) message.obj);
                        } catch (Exception unused2) {
                        }
                        return;
                    }
                    break;
            }
        }
    }

    /* renamed from: a */
    private void m36085a(JSONObject jSONObject) {
        FragmentActivity fragmentActivity;
        if (this.f32957a != null) {
            fragmentActivity = (FragmentActivity) this.f32957a.get();
        } else {
            fragmentActivity = null;
        }
        if (fragmentActivity != null && this.f32960e != null && C12364o.m35912a((C12375a) this.f32960e.get()) && m36086a((Context) fragmentActivity)) {
            try {
                fragmentActivity.finish();
            } catch (Exception e) {
                C6312h.m19577a((Throwable) e);
            }
        }
    }

    /* renamed from: d */
    private void m36088d(String str) {
        try {
            JSONArray jSONArray = new JSONArray(new String(Base64.decode(str, 2)));
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                C12409c cVar = new C12409c();
                cVar.f32951a = jSONObject.getString("__msg_type");
                cVar.f32952b = jSONObject.optString("__callback_id", null);
                cVar.f32953c = jSONObject.optString("func");
                cVar.f32954d = jSONObject.optJSONObject("params");
                cVar.f32955e = jSONObject.optInt("JSSDK");
                if (!C6319n.m19593a(cVar.f32951a) && !C6319n.m19593a(cVar.f32953c)) {
                    Message obtainMessage = this.f32959c.obtainMessage(11);
                    obtainMessage.obj = cVar;
                    this.f32959c.sendMessage(obtainMessage);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    public final void mo30257c(String str) {
        if (str != null && str.startsWith("bytedance://")) {
            String str2 = "bytedance://private/setresult/";
            try {
                if (str.equals("bytedance://dispatch_message/")) {
                    if (this.f32961f != null) {
                        C12412e.m36103a(this.f32961f, "javascript:ToutiaoJSBridge._fetchQueue()");
                    }
                } else if (str.startsWith(str2)) {
                    int length = str2.length();
                    int indexOf = str.indexOf(38, length);
                    if (indexOf > 0) {
                        String substring = str.substring(length, indexOf);
                        String substring2 = str.substring(indexOf + 1);
                        if (substring.equals("SCENE_FETCHQUEUE") && substring2.length() > 0) {
                            m36088d(substring2);
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public final void mo30254b(Uri uri) {
        String str;
        boolean z;
        try {
            String host = uri.getHost();
            if (C6319n.m19594a("log_event_v3", host)) {
                String queryParameter = uri.getQueryParameter("event");
                String queryParameter2 = uri.getQueryParameter("params");
                String queryParameter3 = uri.getQueryParameter("is_double_sending");
                if (!C6319n.m19593a(queryParameter) && !C6319n.m19593a(queryParameter2)) {
                    String decode = URLDecoder.decode(queryParameter, "UTF-8");
                    String decode2 = URLDecoder.decode(queryParameter2, "UTF-8");
                    if (C6319n.m19593a(queryParameter3)) {
                        str = "0";
                    } else {
                        str = URLDecoder.decode(queryParameter3, "UTF-8");
                    }
                    JSONObject jSONObject = new JSONObject(decode2);
                    if (Integer.parseInt(str) == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        C12424e i = C12428i.m36159i();
                        if (i != null) {
                            i.mo30319a(decode, jSONObject);
                        }
                    } else {
                        jSONObject.put("_staging_flag", 1);
                        C12424e i2 = C12428i.m36159i();
                        if (i2 != null) {
                            i2.mo30319a(decode, jSONObject);
                        }
                    }
                }
            }
            FragmentActivity fragmentActivity = null;
            if ("disable_swipe".equals(host)) {
                if (this.f32957a != null) {
                    fragmentActivity = (FragmentActivity) this.f32957a.get();
                }
                if (fragmentActivity instanceof C12376b) {
                    ((C12376b) fragmentActivity).mo30215a();
                }
            } else if ("enable_swipe".equals(host)) {
                if (this.f32957a != null) {
                    fragmentActivity = (FragmentActivity) this.f32957a.get();
                }
                if (fragmentActivity instanceof C12376b) {
                    ((C12376b) fragmentActivity).mo30216g();
                }
            } else if ("close_current_page".equals(host)) {
                m36085a((JSONObject) null);
            } else if ("private".equals(host) || "dispatch_message".equals(host)) {
                mo30257c(uri.toString());
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public final boolean mo30255b(String str) {
        if (str != null && str.startsWith("file:///android_asset/article/")) {
            return true;
        }
        if (!C12370u.m35938d(str)) {
            return false;
        }
        try {
            if (Uri.parse(str).getHost() == null) {
                return false;
            }
            C12428i.m36155e();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo30252a(Uri uri) {
        if (uri == null) {
            return false;
        }
        try {
            if (!"bytedance".equals(uri.getScheme())) {
                return false;
            }
            if (f32956d.contains(uri.getHost())) {
                return true;
            }
            return false;
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public final void mo30297b(String str, JSONObject jSONObject) {
        try {
            if (!C6319n.m19593a(str)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("__msg_type", "event");
                jSONObject2.put("__event_id", str);
                if (jSONObject != null) {
                    jSONObject2.put("__params", jSONObject);
                }
                m36087b(jSONObject2);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo30251a(final String str, final Callback callback) {
        AlertDialog alertDialog;
        if (!C6319n.m19593a(str) && callback != null) {
            Activity e = m36089e();
            if (e != null) {
                if (this.f32962g != null) {
                    alertDialog = (AlertDialog) this.f32962g.get();
                } else {
                    alertDialog = null;
                }
                if (alertDialog != null && alertDialog.isShowing()) {
                    alertDialog.dismiss();
                }
                C1081a aVar = new C1081a(e);
                aVar.mo4225a((int) R.string.d1w);
                aVar.mo4240b((CharSequence) e.getString(R.string.d1v, new Object[]{str}));
                C124111 r0 = new OnClickListener() {
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
                aVar.mo4238b((int) R.string.d1u, (OnClickListener) r0);
                aVar.mo4226a((int) R.string.d1t, (OnClickListener) r0);
                aVar.mo4235a(false);
                this.f32962g = new WeakReference<>(aVar.mo4245c());
            }
        }
    }

    /* renamed from: a */
    public final void mo30296a(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("__msg_type", "callback");
            jSONObject2.put("__callback_id", str);
            if (jSONObject != null) {
                jSONObject2.put("__params", jSONObject);
            }
            m36087b(jSONObject2);
        } catch (Exception unused) {
        }
    }

    public C12410d(Fragment fragment, C12375a aVar, WebView webView) {
        this.f32961f = webView;
        this.f32957a = new WeakReference<>(fragment.getActivity());
        this.f32960e = new WeakReference<>(aVar);
        this.f32958b = new C12396c(fragment.getActivity(), aVar, this);
    }
}
