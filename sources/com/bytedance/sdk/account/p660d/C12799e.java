package com.bytedance.sdk.account.p660d;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.collection.C6308d;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.common.utility.p481c.C9721b;
import com.bytedance.sdk.account.p645a.C12705a;
import com.bytedance.sdk.account.p645a.C12723c;
import com.bytedance.sdk.account.p645a.C12728d;
import com.bytedance.sdk.account.p645a.C12738g;
import com.bytedance.sdk.account.p645a.p646a.C12706a;
import com.bytedance.sdk.account.p645a.p646a.C12707b;
import com.bytedance.sdk.account.p645a.p646a.C12710e;
import com.bytedance.sdk.account.p645a.p646a.C12712g;
import com.bytedance.sdk.account.p645a.p647b.C12719c;
import com.bytedance.sdk.account.p645a.p648c.C12724a;
import com.bytedance.sdk.account.p645a.p649d.C12731c;
import com.bytedance.sdk.account.p645a.p649d.C12732d;
import com.bytedance.sdk.account.p662f.p663a.C12826i;
import com.bytedance.sdk.account.p668i.C12898b;
import com.facebook.ads.AdError;
import com.p280ss.android.account.C18895c;
import com.p280ss.android.account.p816b.C18894a;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.d.e */
class C12799e implements C6310a, C12723c {

    /* renamed from: B */
    private static final C18894a[] f33847B = {f33850a, f33851b, f33852c, f33853d, f33854e, f33855f, f33856g, f33857h, f33858i, f33859j, f33860k, f33861l, f33862m, f33863n, f33864o, f33865p, f33866q, f33867r, f33868s, f33869t, f33870u, f33871v, f33872w, f33873x, f33874y};

    /* renamed from: M */
    private static volatile C12723c f33848M;

    /* renamed from: N */
    private static List<C12801a> f33849N = new ArrayList();

    /* renamed from: a */
    static final C18894a f33850a = new C18894a("sina_weibo", R.string.dx_);

    /* renamed from: b */
    static final C18894a f33851b = new C18894a("qq_weibo", R.string.dx6);

    /* renamed from: c */
    static final C18894a f33852c = new C18894a("renren_sns", R.string.dx4);

    /* renamed from: d */
    static final C18894a f33853d = new C18894a("kaixin_sns", R.string.dwz);

    /* renamed from: e */
    static final C18894a f33854e = new C18894a("qzone_sns", R.string.dx3);

    /* renamed from: f */
    static final C18894a f33855f = new C18894a("mobile", R.string.dx2);

    /* renamed from: g */
    static final C18894a f33856g = new C18894a("weixin", R.string.dxa);

    /* renamed from: h */
    static final C18894a f33857h = new C18894a("flyme", R.string.dwt);

    /* renamed from: i */
    static final C18894a f33858i = new C18894a("huawei", R.string.dww);

    /* renamed from: j */
    static final C18894a f33859j = new C18894a("telecom", R.string.dx5);

    /* renamed from: k */
    static final C18894a f33860k = new C18894a("xiaomi", R.string.dxb);

    /* renamed from: l */
    static final C18894a f33861l = new C18894a("email", R.string.dwq);

    /* renamed from: m */
    static final C18894a f33862m = new C18894a("live_stream", R.string.dwx);

    /* renamed from: n */
    static final C18894a f33863n = new C18894a("aweme", R.string.dwp);

    /* renamed from: o */
    static final C18894a f33864o = new C18894a("google", R.string.dwv);

    /* renamed from: p */
    static final C18894a f33865p = new C18894a("facebook", R.string.dwr);

    /* renamed from: q */
    static final C18894a f33866q = new C18894a("twitter", R.string.dx8);

    /* renamed from: r */
    static final C18894a f33867r = new C18894a("instagram", R.string.dwy);

    /* renamed from: s */
    static final C18894a f33868s = new C18894a("line", R.string.dx1);

    /* renamed from: t */
    static final C18894a f33869t = new C18894a("kakaotalk", R.string.dx0);

    /* renamed from: u */
    static final C18894a f33870u = new C18894a("vk", R.string.dx9);

    /* renamed from: v */
    static final C18894a f33871v = new C18894a("toutiao", R.string.dx7);

    /* renamed from: w */
    static final C18894a f33872w = new C18894a("toutiao_v2", R.string.dx7);

    /* renamed from: x */
    static final C18894a f33873x = new C18894a("flipchat", R.string.dws);

    /* renamed from: y */
    static final C18894a f33874y = new C18894a("gogokid", R.string.dwu);

    /* renamed from: A */
    public final C6309f f33875A = new C6309f(Looper.getMainLooper(), this);

    /* renamed from: C */
    private boolean f33876C;

    /* renamed from: D */
    private long f33877D;

    /* renamed from: E */
    private String f33878E = "";

    /* renamed from: F */
    private final int f33879F = AdError.SERVER_ERROR_CODE;

    /* renamed from: G */
    private final C18894a[] f33880G;

    /* renamed from: H */
    private boolean f33881H;

    /* renamed from: I */
    private C6308d<Object> f33882I = new C6308d<>();

    /* renamed from: J */
    private C6308d<Object> f33883J = new C6308d<>();

    /* renamed from: K */
    private C12728d f33884K;

    /* renamed from: L */
    private long f33885L = 0;

    /* renamed from: z */
    final Context f33886z;

    /* renamed from: com.bytedance.sdk.account.d.e$a */
    interface C12801a {
        /* renamed from: a */
        void mo31356a(C12707b bVar);
    }

    /* renamed from: com.bytedance.sdk.account.d.e$b */
    static class C12802b implements C12801a {
        private C12802b() {
        }

        /* renamed from: a */
        public final void mo31356a(C12707b bVar) {
            if (bVar.f33706f == 10001 && bVar.f33701a) {
                C12723c a = C12798d.m37185a();
                a.mo31172a(false);
                C12799e.m37193a(a);
            }
        }
    }

    /* renamed from: com.bytedance.sdk.account.d.e$c */
    static class C12803c implements C12801a {
        private C12803c() {
        }

        /* renamed from: a */
        public final void mo31356a(C12707b bVar) {
            if (bVar instanceof C12712g) {
                C12898b bVar2 = ((C12712g) bVar).f33711g;
                if (bVar2 != null && (bVar2 instanceof C12898b)) {
                    C12798d.m37185a().mo31171a(bVar2);
                }
            } else if (bVar instanceof C12710e) {
                T t = ((C12710e) bVar).f33709g;
                if (t instanceof C12826i) {
                    C12798d.m37185a().mo31171a(((C12826i) t).mo31218b());
                }
            } else if (bVar instanceof C12732d) {
                C12898b bVar3 = ((C12732d) bVar).f33729g;
                if (bVar3 != null && (bVar3 instanceof C12898b)) {
                    C12798d.m37185a().mo31171a(bVar3);
                }
            } else {
                if (bVar instanceof C12731c) {
                    C12798d.m37185a().mo31170a((C12731c) bVar);
                }
            }
        }
    }

    /* renamed from: a */
    public final String mo31168a() {
        return this.f33878E;
    }

    /* renamed from: a */
    public final void mo31172a(boolean z) {
        this.f33876C = false;
        this.f33877D = 0;
        this.f33878E = "";
        AppLog.setUserId(this.f33877D);
        AppLog.setSessionKey(this.f33878E);
        for (C18894a a : this.f33880G) {
            a.mo50254a();
        }
        m37189a(this.f33886z);
    }

    /* renamed from: a */
    public final void mo31171a(C12898b bVar) {
        if (bVar != null) {
            this.f33885L = System.currentTimeMillis();
            long j = bVar.f34078a;
            boolean z = false;
            if (j > 0) {
                if (!this.f33876C) {
                    this.f33876C = true;
                    try {
                        CookieSyncManager.getInstance().sync();
                    } catch (Throwable unused) {
                    }
                    z = true;
                }
                "1".equals(bVar.f34084g.optString("new_platform"));
                if (this.f33877D != j) {
                    this.f33877D = j;
                    AppLog.setUserId(this.f33877D);
                    z = true;
                }
                if (!C6319n.m19594a(this.f33878E, bVar.f34082e)) {
                    this.f33878E = bVar.f34082e;
                    AppLog.setSessionKey(this.f33878E);
                    z = true;
                }
                if (m37197b(bVar)) {
                    z = true;
                }
                this.f33876C = true;
            } else if (this.f33876C) {
                this.f33876C = false;
                this.f33877D = 0;
                this.f33878E = "";
                z = true;
            }
            if (z) {
                m37189a(this.f33886z);
                m37199d();
            }
        }
    }

    /* renamed from: c */
    private void m37198c() {
        if (this.f33884K != null) {
            this.f33884K.mo31179a((C12719c) new C12719c() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onSuccess(C12731c cVar) {
                    if (C12799e.this.f33875A != null) {
                        long j = 600000;
                        if (C18895c.m61671b() != null) {
                            j = C18895c.m61671b().f51891a;
                        }
                        C12799e.this.f33875A.sendEmptyMessageDelayed(AdError.SERVER_ERROR_CODE, j);
                    }
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onError(C12731c cVar, int i) {
                    if (C12799e.this.f33875A != null) {
                        long j = 600000;
                        if (C18895c.m61671b() != null) {
                            j = C18895c.m61671b().f51891a;
                        }
                        C12799e.this.f33875A.sendEmptyMessageDelayed(AdError.SERVER_ERROR_CODE, j);
                    }
                }
            });
        }
    }

    /* renamed from: d */
    private void m37199d() {
        new C12705a(0);
        Iterator it = this.f33882I.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: b */
    static C12723c m37195b() {
        if (f33848M == null) {
            synchronized (C12799e.class) {
                if (f33848M == null) {
                    f33848M = new C12799e(C18895c.m61668a().mo50930b());
                }
            }
        }
        return f33848M;
    }

    /* renamed from: e */
    private void m37200e() {
        if (!this.f33881H) {
            this.f33881H = true;
            SharedPreferences a = C7285c.m22838a(this.f33886z, "com.bytedance.sdk.account_setting", 0);
            this.f33876C = a.getBoolean("is_login", false);
            this.f33877D = a.getLong("user_id", 0);
            this.f33878E = a.getString("session_key", "");
            if (this.f33876C && this.f33877D <= 0) {
                this.f33876C = false;
                this.f33877D = 0;
            } else if (!this.f33876C && this.f33877D > 0) {
                this.f33877D = 0;
            }
            m37191a(a);
            if (this.f33877D > 0) {
                AppLog.setUserId(this.f33877D);
                AppLog.setSessionKey(this.f33878E);
            }
        }
    }

    /* renamed from: a */
    public static void m37193a(C12723c cVar) {
        cVar.mo31169a(new C12705a(1));
    }

    /* renamed from: b */
    private void m37196b(C12811j jVar) {
        if (jVar.f33904b != null) {
            m37192a((C12707b) jVar.f33904b);
            m37194a(jVar);
        }
    }

    /* renamed from: a */
    private static void m37192a(C12707b bVar) {
        for (C12801a a : f33849N) {
            a.mo31356a(bVar);
        }
    }

    /* renamed from: a */
    private void m37189a(Context context) {
        Editor edit = C7285c.m22838a(context, "com.bytedance.sdk.account_setting", 0).edit();
        m37190a(edit);
        edit.remove("session");
        edit.putBoolean("is_login", this.f33876C);
        edit.putLong("user_id", this.f33877D);
        edit.putString("session_key", this.f33878E);
        C9721b.m28656a(edit);
    }

    public void handleMsg(Message message) {
        if (message.what == 100 && (message.obj instanceof C12811j)) {
            m37196b((C12811j) message.obj);
        }
        if (message.what == 2000) {
            this.f33875A.removeMessages(AdError.SERVER_ERROR_CODE);
            m37198c();
        }
    }

    /* renamed from: a */
    private void m37190a(Editor editor) {
        C18894a[] aVarArr;
        for (C18894a aVar : this.f33880G) {
            if (aVar.f50928d) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("mName", aVar.f50926b);
                    jSONObject.put("mNickname", aVar.f50929e);
                    jSONObject.put("mAvatar", aVar.f50930f);
                    jSONObject.put("mPlatformUid", aVar.f50931g);
                    jSONObject.put("mExpire", aVar.f50933i);
                    jSONObject.put("mExpireIn", aVar.f50934j);
                    jSONObject.put("isLogin", aVar.f50928d);
                    StringBuilder sb = new StringBuilder("_platform_");
                    sb.append(aVar.f50926b);
                    editor.putString(sb.toString(), jSONObject.toString());
                } catch (Exception unused) {
                }
            }
        }
        editor.apply();
    }

    /* renamed from: b */
    private boolean m37197b(C12898b bVar) {
        C18894a[] aVarArr;
        boolean z = false;
        for (C18894a aVar : this.f33880G) {
            aVar.f50928d = false;
            C18894a aVar2 = (C18894a) bVar.mo31366b().get(aVar.f50926b);
            if (aVar2 == null) {
                aVar.mo50254a();
            } else {
                if (!aVar.f50928d) {
                    aVar.f50928d = true;
                    z = true;
                }
                aVar.f50933i = aVar2.f50933i;
                aVar.f50934j = aVar2.f50934j;
                aVar.f50929e = aVar2.f50929e;
                aVar.f50930f = aVar2.f50930f;
                aVar.f50931g = aVar2.f50931g;
            }
        }
        return z;
    }

    private C12799e(Context context) {
        f33849N.add(new C12803c());
        f33849N.add(new C12802b());
        this.f33886z = context.getApplicationContext();
        this.f33881H = false;
        this.f33884K = C12798d.m37186a(this.f33886z);
        this.f33880G = new C18894a[]{f33855f, f33854e, f33850a, f33851b, f33852c, f33853d, f33856g, f33857h, f33858i, f33859j, f33860k, f33861l, f33862m, f33863n, f33868s, f33869t, f33870u, f33871v, f33872w, f33873x};
        m37200e();
    }

    /* renamed from: a */
    private void m37191a(SharedPreferences sharedPreferences) {
        for (int i = 0; i < this.f33880G.length; i++) {
            this.f33880G[i].f50928d = false;
            C18894a aVar = this.f33880G[i];
            try {
                if (!TextUtils.isEmpty(aVar.f50926b)) {
                    StringBuilder sb = new StringBuilder("_platform_");
                    sb.append(aVar.f50926b);
                    String string = sharedPreferences.getString(sb.toString(), null);
                    if (string != null) {
                        JSONObject jSONObject = new JSONObject(string);
                        if (jSONObject.optString("mName", "").equals(aVar.f50926b)) {
                            if (jSONObject.has("mNickname")) {
                                aVar.f50929e = jSONObject.optString("mNickname", null);
                            }
                            if (jSONObject.has("mAvatar")) {
                                aVar.f50930f = jSONObject.optString("mAvatar", null);
                            }
                            if (jSONObject.has("mPlatformUid")) {
                                aVar.f50931g = jSONObject.optString("mPlatformUid", null);
                            }
                            if (jSONObject.has("mExpire")) {
                                aVar.f50933i = jSONObject.optLong("mExpire", aVar.f50933i);
                            }
                            if (jSONObject.has("mExpireIn")) {
                                aVar.f50934j = jSONObject.optLong("mExpireIn", aVar.f50934j);
                            }
                            if (jSONObject.has("isLogin")) {
                                aVar.f50928d = jSONObject.optBoolean("isLogin", false);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    private static void m37194a(C12811j jVar) {
        if (jVar.f33903a != null) {
            Object obj = jVar.f33903a.get();
            if (obj != null && (obj instanceof C12706a)) {
                C12706a aVar = (C12706a) obj;
                aVar.dispatchOnResponse(jVar.f33904b);
                C12724a aVar2 = aVar.mJobController;
                if (aVar2 != null) {
                    aVar2.mo31173a();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo31169a(C12705a aVar) {
        Iterator it = this.f33882I.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: a */
    public final void mo31170a(C12731c cVar) {
        if (cVar != null) {
            C12738g gVar = new C12738g(cVar.f33701a);
            gVar.f33735f = cVar.f33705e;
            if (cVar.f33701a) {
                gVar.f33734e = cVar.f33728h;
            } else {
                gVar.f33731b = cVar.f33702b;
                gVar.f33732c = cVar.f33703c;
                gVar.f33733d = cVar.f33727g;
            }
            synchronized (this.f33883J) {
                Iterator it = this.f33883J.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }
}
