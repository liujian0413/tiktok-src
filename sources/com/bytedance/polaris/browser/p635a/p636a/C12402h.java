package com.bytedance.polaris.browser.p635a.p636a;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.polaris.base.C12375a;
import com.bytedance.polaris.browser.p635a.C12408b;
import com.bytedance.polaris.browser.p635a.C12409c;
import com.bytedance.polaris.depend.C12428i;
import com.bytedance.polaris.model.C12435a;
import com.bytedance.polaris.p634b.C12364o;
import com.bytedance.polaris.p634b.C12370u;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.polaris.browser.a.a.h */
public final class C12402h implements C6310a, C12408b {

    /* renamed from: a */
    protected Handler f32934a = new C6309f(Looper.getMainLooper(), this);

    /* renamed from: b */
    private final WeakReference<Activity> f32935b;

    /* renamed from: c */
    private final C12396c f32936c;

    /* renamed from: d */
    private WeakReference<C12375a> f32937d;

    /* renamed from: e */
    private int f32938e;

    /* renamed from: f */
    private C12401g f32939f = new C12401g() {
    };

    /* renamed from: g */
    private C12401g f32940g = new C12401g() {
    };

    /* renamed from: com.bytedance.polaris.browser.a.a.h$a */
    static class C12405a extends AsyncTask<Void, Void, Void> {

        /* renamed from: a */
        final C12435a f32943a;

        /* renamed from: b */
        final Handler f32944b;

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0029 A[Catch:{ Throwable -> 0x009f }] */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0095 A[Catch:{ Throwable -> 0x009f }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void doInBackground(java.lang.Void... r11) {
            /*
                r10 = this;
                r11 = 0
                com.bytedance.polaris.model.a r0 = r10.f32943a     // Catch:{ Throwable -> 0x009f }
                java.lang.String r0 = r0.f33018f     // Catch:{ Throwable -> 0x009f }
                java.lang.String r1 = "weixin"
                com.bytedance.polaris.model.a r2 = r10.f32943a     // Catch:{ Throwable -> 0x009f }
                java.lang.String r2 = r2.f33014b     // Catch:{ Throwable -> 0x009f }
                boolean r1 = r1.equals(r2)     // Catch:{ Throwable -> 0x009f }
                r2 = 1
                r3 = 0
                if (r1 != 0) goto L_0x0022
                java.lang.String r1 = "weixin_moments"
                com.bytedance.polaris.model.a r4 = r10.f32943a     // Catch:{ Throwable -> 0x009f }
                java.lang.String r4 = r4.f33014b     // Catch:{ Throwable -> 0x009f }
                boolean r1 = r1.equals(r4)     // Catch:{ Throwable -> 0x009f }
                if (r1 == 0) goto L_0x0020
                goto L_0x0022
            L_0x0020:
                r1 = 0
                goto L_0x0023
            L_0x0022:
                r1 = 1
            L_0x0023:
                boolean r4 = com.bytedance.polaris.p634b.C12370u.m35938d(r0)     // Catch:{ Throwable -> 0x009f }
                if (r4 == 0) goto L_0x007e
                com.bytedance.polaris.b.a r4 = new com.bytedance.polaris.b.a     // Catch:{ Throwable -> 0x009f }
                android.app.Application r5 = com.bytedance.polaris.depend.C12428i.m36153c()     // Catch:{ Throwable -> 0x009f }
                r4.<init>(r5)     // Catch:{ Throwable -> 0x009f }
                java.lang.String r5 = com.bytedance.common.utility.C6306c.m19561a(r0)     // Catch:{ Throwable -> 0x009f }
                java.lang.String r6 = r4.mo30184c(r5)     // Catch:{ Throwable -> 0x009f }
                java.lang.String r5 = com.bytedance.polaris.p634b.C12340a.m35835b(r5)     // Catch:{ Throwable -> 0x009f }
                java.lang.String r4 = r4.mo30182a(r5)     // Catch:{ Throwable -> 0x009f }
                boolean r7 = com.bytedance.polaris.p634b.C12340a.m35834a()     // Catch:{ Throwable -> 0x009f }
                if (r7 == 0) goto L_0x006f
                java.io.File r7 = new java.io.File     // Catch:{ Throwable -> 0x009f }
                r7.<init>(r6)     // Catch:{ Throwable -> 0x009f }
                boolean r8 = r7.isFile()     // Catch:{ Throwable -> 0x009f }
                if (r8 != 0) goto L_0x006e
                com.bytedance.polaris.depend.e r8 = com.bytedance.polaris.depend.C12428i.m36159i()     // Catch:{ Throwable -> 0x009f }
                if (r8 == 0) goto L_0x0067
                com.bytedance.polaris.depend.e r8 = com.bytedance.polaris.depend.C12428i.m36159i()     // Catch:{ Throwable -> 0x009f }
                r9 = 512000(0x7d000, float:7.17465E-40)
                boolean r0 = r8.mo30322a(r0, r9, r4, r5)     // Catch:{ Throwable -> 0x009f }
                if (r0 == 0) goto L_0x0067
                r3 = 1
            L_0x0067:
                if (r3 == 0) goto L_0x006f
                boolean r3 = r7.isFile()     // Catch:{ Throwable -> 0x009f }
                goto L_0x006f
            L_0x006e:
                r3 = r8
            L_0x006f:
                if (r3 == 0) goto L_0x007e
                if (r1 == 0) goto L_0x007a
                r0 = 150(0x96, float:2.1E-43)
                android.graphics.Bitmap r0 = com.bytedance.common.utility.BitmapUtils.getBitmapFromSD(r6, r0, r0)     // Catch:{ Throwable -> 0x009f }
                goto L_0x007f
            L_0x007a:
                com.bytedance.polaris.model.a r0 = r10.f32943a     // Catch:{ Throwable -> 0x009f }
                r0.f33027o = r6     // Catch:{ Throwable -> 0x009f }
            L_0x007e:
                r0 = r11
            L_0x007f:
                if (r1 == 0) goto L_0x009f
                if (r0 == 0) goto L_0x009f
                java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ Throwable -> 0x009f }
                r1.<init>()     // Catch:{ Throwable -> 0x009f }
                android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Throwable -> 0x009f }
                r3 = 85
                r0.compress(r2, r3, r1)     // Catch:{ Throwable -> 0x009f }
                byte[] r2 = r1.toByteArray()     // Catch:{ Throwable -> 0x009f }
                if (r2 == 0) goto L_0x0099
                com.bytedance.polaris.model.a r3 = r10.f32943a     // Catch:{ Throwable -> 0x009f }
                r3.f33026n = r2     // Catch:{ Throwable -> 0x009f }
            L_0x0099:
                r1.close()     // Catch:{ Throwable -> 0x009f }
                r0.recycle()     // Catch:{ Throwable -> 0x009f }
            L_0x009f:
                android.os.Handler r0 = r10.f32944b
                r1 = 12
                com.bytedance.polaris.model.a r2 = r10.f32943a
                android.os.Message r0 = r0.obtainMessage(r1, r2)
                android.os.Handler r1 = r10.f32944b
                r1.sendMessage(r0)
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.polaris.browser.p635a.p636a.C12402h.C12405a.doInBackground(java.lang.Void[]):java.lang.Void");
        }

        C12405a(Handler handler, C12435a aVar) {
            this.f32944b = handler;
            this.f32943a = aVar;
        }
    }

    /* renamed from: a */
    public final void mo30259a() {
    }

    /* renamed from: b */
    public final void mo30261b() {
    }

    /* renamed from: c */
    private boolean m36066c() {
        C12375a aVar;
        if (this.f32937d != null) {
            aVar = (C12375a) this.f32937d.get();
        } else {
            aVar = null;
        }
        return C12364o.m35912a(aVar);
    }

    /* renamed from: d */
    private boolean m36067d() {
        if (!(C12428i.m36157g() == null || this.f32935b == null)) {
            this.f32935b.get();
        }
        return false;
    }

    /* renamed from: e */
    private boolean m36068e() {
        if (!(C12428i.m36157g() == null || this.f32935b == null)) {
            this.f32935b.get();
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m36064a(Context context) {
        C12428i.m36157g();
        return false;
    }

    /* renamed from: a */
    private void m36058a(C12435a aVar) {
        String str;
        String str2 = aVar.f33014b;
        String str3 = aVar.f33015c;
        String str4 = aVar.f33016d;
        String str5 = aVar.f33019g;
        String str6 = aVar.f33017e;
        String str7 = aVar.f33020h;
        if (C12370u.m35938d(aVar.f33018f)) {
            str = aVar.f33018f;
        } else {
            str = null;
        }
        String str8 = str;
        byte[] bArr = aVar.f33026n;
        String str9 = aVar.f33027o;
        if ("weixin".equals(str2)) {
            m36063a(false, str3, str4, str5, bArr, str6, aVar, str7);
        } else if ("weixin_moments".equals(str2)) {
            m36063a(true, str3, str4, str5, bArr, str6, aVar, str7);
        } else if ("qzone_sns".equals(str2) || "qzone".equals(str2)) {
            m36062a(true, str3, str4, str8, str9, str5, aVar, str6, str7);
        } else {
            if ("qq".equals(str2)) {
                m36062a(false, str3, str4, str8, str9, str5, aVar, str6, str7);
            }
        }
    }

    public final void handleMsg(Message message) {
        ProgressDialog progressDialog;
        if (message != null && message.what == 12 && (message.obj instanceof C12435a)) {
            C12435a aVar = (C12435a) message.obj;
            if (aVar.f33025m != null) {
                progressDialog = (ProgressDialog) aVar.f33025m.get();
            } else {
                progressDialog = null;
            }
            if (progressDialog != null && progressDialog.isShowing()) {
                progressDialog.dismiss();
            }
            if (m36066c() && aVar.f33013a == this.f32938e) {
                this.f32938e++;
                m36058a(aVar);
            }
        }
    }

    /* renamed from: a */
    private void m36060a(String str, JSONObject jSONObject) {
        if (this.f32936c != null) {
            this.f32936c.mo30265a(str, jSONObject);
        }
    }

    /* renamed from: a */
    private void m36059a(C12435a aVar, boolean z) {
        JSONObject jSONObject;
        if (aVar != null) {
            if (aVar.f33024l == null) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = aVar.f33024l;
            }
            try {
                jSONObject.put("code", z ? 1 : 0);
            } catch (JSONException unused) {
            }
            m36060a(aVar.f33028p, aVar.f33024l);
        }
    }

    /* renamed from: a */
    private boolean m36065a(String str, C12435a aVar) {
        Activity activity;
        if (this.f32935b != null) {
            activity = (Activity) this.f32935b.get();
        } else {
            activity = null;
        }
        if (activity == null) {
            m36059a(aVar, false);
            return false;
        }
        if ("weixin".equals(str) || "weixin_moments".equals(str)) {
            if (!m36067d()) {
                C9738o.m28694a((Context) activity, (int) R.drawable.bdb, (int) R.string.d36);
                m36059a(aVar, false);
                return true;
            } else if (!m36068e()) {
                C9738o.m28694a((Context) activity, (int) R.drawable.bdb, (int) R.string.d35);
                m36059a(aVar, false);
                return true;
            }
        } else if (!"qzone_sns".equals(str) && !"qzone".equals(str) && !"qq".equals(str)) {
            m36059a(aVar, false);
            return false;
        } else if (!m36064a((Context) activity)) {
            C9738o.m28694a((Context) activity, (int) R.drawable.bdb, (int) R.string.d34);
            m36059a(aVar, false);
            return true;
        }
        if (C6319n.m19593a(aVar.f33018f)) {
            m36058a(aVar);
            return true;
        }
        this.f32938e++;
        aVar.f33013a = this.f32938e;
        ProgressDialog progressDialog = new ProgressDialog(activity);
        progressDialog.setMessage(activity.getString(R.string.d30));
        progressDialog.setCancelable(true);
        progressDialog.show();
        aVar.f33025m = new WeakReference<>(progressDialog);
        this.f32934a.sendMessageDelayed(this.f32934a.obtainMessage(12, aVar), 3500);
        new C12405a(this.f32934a, aVar).execute(new Void[0]);
        return true;
    }

    /* renamed from: a */
    public final boolean mo30260a(C12409c cVar, JSONObject jSONObject) {
        try {
            if (m36066c()) {
                jSONObject.put("code", 1);
                m36061a(cVar.f32954d, jSONObject, cVar.f32952b);
                return false;
            }
            jSONObject.put("code", 0);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public C12402h(WeakReference<Activity> weakReference, C12375a aVar, C12396c cVar) {
        this.f32935b = weakReference;
        this.f32937d = new WeakReference<>(aVar);
        this.f32936c = cVar;
    }

    /* renamed from: a */
    private void m36061a(JSONObject jSONObject, JSONObject jSONObject2, String str) throws Exception {
        C12435a aVar = new C12435a();
        aVar.mo30346a(jSONObject);
        aVar.f33024l = jSONObject2;
        aVar.f33028p = str;
        if (C6319n.m19593a(aVar.f33014b)) {
            m36059a(aVar, false);
        } else {
            m36065a(aVar.f33014b, aVar);
        }
    }

    /* renamed from: a */
    private void m36063a(boolean z, String str, String str2, String str3, byte[] bArr, String str4, C12435a aVar, String str5) {
        Activity activity;
        String str6;
        if (this.f32935b != null) {
            activity = (Activity) this.f32935b.get();
        } else {
            activity = null;
        }
        if (activity == null) {
            m36059a(aVar, false);
        } else if (!m36067d()) {
            C9738o.m28694a((Context) activity, (int) R.drawable.bdb, (int) R.string.d36);
            m36059a(aVar, false);
        } else if (!m36068e()) {
            C9738o.m28694a((Context) activity, (int) R.drawable.bdb, (int) R.string.d35);
            m36059a(aVar, false);
        } else if ("system".equals(str5)) {
            Intent intent = new Intent();
            if (z) {
                str6 = "com.tencent.mm.ui.tools.ShareToTimeLineUI";
            } else {
                str6 = "com.tencent.mm.ui.tools.ShareImgUI";
            }
            intent.setComponent(new ComponentName("com.tencent.mm", str6));
            intent.setAction("android.intent.action.SEND");
            intent.addFlags(335577088);
            intent.setType("text/plain");
            if (!TextUtils.isEmpty(str3)) {
                intent.putExtra("android.intent.extra.TEXT", str3);
            } else if (!TextUtils.isEmpty(str4)) {
                intent.putExtra("android.intent.extra.TEXT", str4);
            }
            activity.startActivity(intent);
            m36059a(aVar, true);
        } else {
            C12428i.m36157g();
        }
    }

    /* renamed from: a */
    private void m36062a(boolean z, String str, String str2, String str3, String str4, String str5, C12435a aVar, String str6, String str7) {
        Activity activity;
        if (this.f32935b != null) {
            activity = (Activity) this.f32935b.get();
        } else {
            activity = null;
        }
        if (activity == null) {
            m36059a(aVar, false);
            return;
        }
        Activity activity2 = activity;
        if (!m36064a((Context) activity2)) {
            C9738o.m28694a((Context) activity2, (int) R.drawable.bdb, (int) R.string.d34);
            m36059a(aVar, false);
        } else if ("system".equals(str7)) {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.tencent.mobileqq", "com.tencent.mobileqq.activity.JumpActivity"));
            intent.setAction("android.intent.action.SEND");
            intent.addFlags(335577088);
            intent.setType("text/plain");
            if (!TextUtils.isEmpty(str5)) {
                intent.putExtra("android.intent.extra.TEXT", str5);
            } else if (!TextUtils.isEmpty(str6)) {
                intent.putExtra("android.intent.extra.TEXT", str6);
            }
            activity2.startActivity(intent);
            m36059a(aVar, true);
        } else {
            C12428i.m36157g();
        }
    }
}
