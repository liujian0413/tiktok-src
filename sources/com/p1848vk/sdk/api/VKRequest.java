package com.p1848vk.sdk.api;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import com.C1642a;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.p1848vk.sdk.C47106a;
import com.p1848vk.sdk.C47217c;
import com.p1848vk.sdk.C47218d;
import com.p1848vk.sdk.VKSdk;
import com.p1848vk.sdk.VKServiceActivity;
import com.p1848vk.sdk.VKServiceActivity.VKServiceType;
import com.p1848vk.sdk.api.httpClient.C47135a;
import com.p1848vk.sdk.api.httpClient.C47135a.C47139a;
import com.p1848vk.sdk.api.httpClient.C47145e;
import com.p1848vk.sdk.api.httpClient.C47151g;
import com.p1848vk.sdk.api.httpClient.C47151g.C47152a;
import com.p1848vk.sdk.api.httpClient.C47153h;
import com.p1848vk.sdk.api.httpClient.VKAbstractOperation;
import com.p1848vk.sdk.api.httpClient.VKAbstractOperation.C47133a;
import com.p1848vk.sdk.api.model.VKApiModel;
import com.p1848vk.sdk.p1849a.C47108b;
import com.p1848vk.sdk.p1849a.C47109c;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.VKRequest */
public class VKRequest extends C47217c {

    /* renamed from: a */
    public final Context f120892a;

    /* renamed from: b */
    public final String f120893b;

    /* renamed from: c */
    public final VKParameters f120894c;

    /* renamed from: d */
    public VKAbstractOperation f120895d;

    /* renamed from: e */
    public int f120896e;

    /* renamed from: f */
    public ArrayList<VKRequest> f120897f;

    /* renamed from: g */
    public boolean f120898g;

    /* renamed from: h */
    public C47115a f120899h;

    /* renamed from: i */
    public boolean f120900i;

    /* renamed from: j */
    public int f120901j;

    /* renamed from: k */
    public boolean f120902k;

    /* renamed from: l */
    public boolean f120903l;

    /* renamed from: m */
    public boolean f120904m;

    /* renamed from: n */
    public WeakReference<C47123e> f120905n;

    /* renamed from: o */
    private VKParameters f120906o;

    /* renamed from: p */
    private Class<? extends VKApiModel> f120907p;

    /* renamed from: q */
    private C47122d f120908q;

    /* renamed from: r */
    private String f120909r;

    /* renamed from: s */
    private Looper f120910s;

    /* renamed from: com.vk.sdk.api.VKRequest$HttpMethod */
    public enum HttpMethod {
        GET,
        POST
    }

    /* renamed from: com.vk.sdk.api.VKRequest$VKProgressType */
    public enum VKProgressType {
        Download,
        Upload
    }

    /* renamed from: com.vk.sdk.api.VKRequest$a */
    public static abstract class C47115a {
        /* renamed from: a */
        public void mo118376a(C47121c cVar) {
        }

        /* renamed from: a */
        public void mo118377a(C47123e eVar) {
        }
    }

    /* renamed from: h */
    private C47139a mo118418h() {
        return C47135a.m147378a(this);
    }

    /* renamed from: i */
    private C47152a m147319i() {
        return new C47152a() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo118402a(C47151g gVar, JSONObject jSONObject) {
                Object obj;
                if (jSONObject.has("error")) {
                    try {
                        C47121c cVar = new C47121c(jSONObject.getJSONObject("error"));
                        if (!VKRequest.this.mo118394b(cVar)) {
                            VKRequest.this.mo118391a(cVar);
                        }
                    } catch (JSONException unused) {
                    }
                } else {
                    VKRequest vKRequest = VKRequest.this;
                    if (VKRequest.this.f120895d instanceof C47153h) {
                        obj = ((C47153h) VKRequest.this.f120895d).f120975h;
                    } else {
                        obj = null;
                    }
                    vKRequest.mo118393a(jSONObject, obj);
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo118401a(C47151g gVar, C47121c cVar) {
                if (cVar.f120923d == -102 || cVar.f120923d == -101 || gVar == null || gVar.f120964e == null || gVar.f120964e.f120958a != 200) {
                    if (VKRequest.this.f120901j != 0) {
                        VKRequest vKRequest = VKRequest.this;
                        int i = vKRequest.f120896e + 1;
                        vKRequest.f120896e = i;
                        if (i >= VKRequest.this.f120901j) {
                            VKRequest.this.mo118391a(cVar);
                            return;
                        }
                    }
                    VKRequest.this.mo118392a((Runnable) new Runnable() {
                        public final void run() {
                            VKRequest.this.mo118397e();
                        }
                    }, (int) C34943c.f91128x);
                    return;
                }
                VKRequest.this.mo118393a(gVar.mo118439g(), (Object) null);
            }
        };
    }

    /* renamed from: f */
    public final void mo118398f() {
        this.f120896e = 0;
        this.f120906o = null;
        this.f120895d = null;
        mo118397e();
    }

    /* renamed from: e */
    public final void mo118397e() {
        VKAbstractOperation d = mo118396d();
        this.f120895d = d;
        if (d != null) {
            if (this.f120910s == null) {
                this.f120910s = Looper.myLooper();
            }
            C47135a.m147382a(this.f120895d);
        }
    }

    /* renamed from: g */
    public final void mo118399g() {
        if (this.f120895d != null) {
            this.f120895d.mo118419a();
        } else {
            mo118391a(new C47121c(-102));
        }
    }

    /* renamed from: j */
    private String m147320j() {
        String str = this.f120909r;
        Resources system = Resources.getSystem();
        if (!this.f120903l || system == null) {
            return str;
        }
        String language = system.getConfiguration().locale.getLanguage();
        if (language.equals("uk")) {
            language = "ua";
        }
        if (!Arrays.asList(new String[]{"ru", "en", "ua", "es", "fi", "de", "it"}).contains(language)) {
            return this.f120909r;
        }
        return language;
    }

    /* renamed from: c */
    public final VKParameters mo118395c() {
        if (this.f120906o == null) {
            this.f120906o = new VKParameters(this.f120894c);
            C47106a b = C47106a.m147288b();
            if (b != null) {
                this.f120906o.put("access_token", b.f120883a);
                if (b.f120887e) {
                    this.f120902k = true;
                }
            }
            this.f120906o.put("v", VKSdk.m147271e());
            this.f120906o.put("lang", m147320j());
            if (this.f120902k) {
                this.f120906o.put(WebKitApi.SCHEME_HTTPS, "1");
            }
            if (!(b == null || b.f120886d == null)) {
                this.f120906o.put("sig", m147314a(b));
            }
        }
        return this.f120906o;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public VKAbstractOperation mo118396d() {
        if (this.f120904m) {
            if (this.f120907p != null) {
                this.f120895d = new C47153h(mo118418h(), this.f120907p);
            } else if (this.f120908q != null) {
                this.f120895d = new C47153h(mo118418h(), this.f120908q);
            }
        }
        if (this.f120895d == null) {
            this.f120895d = new C47151g(mo118418h());
        }
        if (this.f120895d instanceof C47145e) {
            ((C47145e) this.f120895d).mo118431a((C47133a<OperationType, ResponseType>) m147319i());
        }
        return this.f120895d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("{");
        sb.append(this.f120893b);
        sb.append(" ");
        VKParameters vKParameters = this.f120894c;
        for (String str : vKParameters.keySet()) {
            sb.append(str);
            sb.append("=");
            sb.append(vKParameters.get(str));
            sb.append(" ");
        }
        sb.append("}");
        return sb.toString();
    }

    public VKRequest(String str) {
        this(str, null);
    }

    /* renamed from: a */
    private void m147316a(Runnable runnable) {
        mo118392a(runnable, 0);
    }

    /* renamed from: b */
    public static VKRequest m147317b(long j) {
        return (VKRequest) m147670a(j);
    }

    /* renamed from: a */
    private void m147315a(Class<? extends VKApiModel> cls) {
        this.f120907p = cls;
        if (this.f120907p != null) {
            this.f120904m = true;
        }
    }

    /* renamed from: a */
    public final void mo118389a(VKParameters vKParameters) {
        this.f120894c.putAll(vKParameters);
    }

    /* renamed from: a */
    private String m147314a(C47106a aVar) {
        String a = C1642a.m8035a(Locale.US, "/method/%s?%s", new Object[]{this.f120893b, C47108b.m147301a(this.f120906o)});
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(aVar.f120886d);
        return C47109c.m147308b(sb.toString());
    }

    /* renamed from: a */
    public final void mo118390a(C47115a aVar) {
        this.f120899h = aVar;
        mo118397e();
    }

    /* renamed from: b */
    public final boolean mo118394b(C47121c cVar) {
        if (cVar.f120923d == -101) {
            C47121c cVar2 = cVar.f120921b;
            VKSdk.m147258a(cVar2);
            if (cVar2.f120923d == 16) {
                C47106a b = C47106a.m147288b();
                if (b != null) {
                    b.f120887e = true;
                    b.mo118388c();
                }
                mo118398f();
                return true;
            } else if (this.f120900i) {
                cVar2.f120922c = this;
                if (cVar.f120921b.f120923d == 14) {
                    this.f120895d = null;
                    VKServiceActivity.m147276a(this.f120892a, cVar2, VKServiceType.Captcha);
                    return true;
                } else if (cVar2.f120923d == 17) {
                    VKServiceActivity.m147276a(this.f120892a, cVar2, VKServiceType.Validation);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo118391a(final C47121c cVar) {
        cVar.f120922c = this;
        final boolean z = this.f120898g;
        if (!z && this.f120899h != null) {
            this.f120899h.mo118376a(cVar);
        }
        m147316a((Runnable) new Runnable() {
            public final void run() {
                if (z && VKRequest.this.f120899h != null) {
                    VKRequest.this.f120899h.mo118376a(cVar);
                }
                if (VKRequest.this.f120897f != null && VKRequest.this.f120897f.size() > 0) {
                    Iterator it = VKRequest.this.f120897f.iterator();
                    while (it.hasNext()) {
                        VKRequest vKRequest = (VKRequest) it.next();
                        if (vKRequest.f120899h != null) {
                            vKRequest.f120899h.mo118376a(cVar);
                        }
                    }
                }
            }
        });
    }

    private VKRequest(String str, VKParameters vKParameters) {
        this(str, null, null);
    }

    /* renamed from: a */
    public final void mo118392a(Runnable runnable, int i) {
        if (this.f120910s == null) {
            this.f120910s = Looper.getMainLooper();
        }
        if (i > 0) {
            new Handler(this.f120910s).postDelayed(runnable, (long) i);
        } else {
            new Handler(this.f120910s).post(runnable);
        }
    }

    /* renamed from: a */
    public final void mo118393a(JSONObject jSONObject, Object obj) {
        final C47123e eVar = new C47123e();
        eVar.f120930a = this;
        eVar.f120931b = jSONObject;
        eVar.f120933d = obj;
        this.f120905n = new WeakReference<>(eVar);
        if (this.f120895d instanceof C47145e) {
            eVar.f120932c = ((C47145e) this.f120895d).mo118435f();
        }
        final boolean z = this.f120898g;
        m147316a((Runnable) new Runnable() {
            public final void run() {
                if (VKRequest.this.f120897f != null && VKRequest.this.f120897f.size() > 0) {
                    Iterator it = VKRequest.this.f120897f.iterator();
                    while (it.hasNext()) {
                        ((VKRequest) it.next()).mo118397e();
                    }
                }
                if (z && VKRequest.this.f120899h != null) {
                    VKRequest.this.f120899h.mo118377a(eVar);
                }
            }
        });
        if (!z && this.f120899h != null) {
            this.f120899h.mo118377a(eVar);
        }
    }

    public VKRequest(String str, VKParameters vKParameters, Class<? extends VKApiModel> cls) {
        this.f120898g = true;
        this.f120892a = C47218d.m147673a();
        this.f120893b = str;
        if (vKParameters == null) {
            vKParameters = new VKParameters();
        }
        this.f120894c = new VKParameters(vKParameters);
        this.f120896e = 0;
        this.f120902k = true;
        this.f120901j = 1;
        this.f120909r = "en";
        this.f120903l = true;
        this.f120900i = true;
        m147315a(cls);
    }
}
