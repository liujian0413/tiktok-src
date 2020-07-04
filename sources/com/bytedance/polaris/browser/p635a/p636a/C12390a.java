package com.bytedance.polaris.browser.p635a.p636a;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.C6306c;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.polaris.base.C12375a;
import com.bytedance.polaris.browser.p635a.C12408b;
import com.bytedance.polaris.browser.p635a.C12409c;
import com.bytedance.polaris.depend.C12428i;
import com.bytedance.polaris.model.C12435a;
import com.bytedance.polaris.p634b.C12340a;
import com.bytedance.polaris.p634b.C12349f;
import com.bytedance.polaris.p634b.C12364o;
import com.bytedance.polaris.p634b.C12370u;
import com.taobao.android.dexposed.ClassUtils;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.polaris.browser.a.a.a */
public final class C12390a implements C6310a, C12408b {

    /* renamed from: a */
    private final WeakReference<Activity> f32903a;

    /* renamed from: b */
    private final C12396c f32904b;

    /* renamed from: c */
    private WeakReference<C12375a> f32905c;

    /* renamed from: d */
    private int f32906d;

    /* renamed from: e */
    private Handler f32907e = new C6309f(Looper.getMainLooper(), this);

    /* renamed from: f */
    private C12401g f32908f = new C12401g() {
    };

    /* renamed from: g */
    private C12401g f32909g = new C12401g() {
    };

    /* renamed from: com.bytedance.polaris.browser.a.a.a$a */
    static class C12393a extends AsyncTask<Void, Void, Void> {

        /* renamed from: a */
        final C12435a f32912a;

        /* renamed from: b */
        final Handler f32913b;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            try {
                String str = this.f32912a.f33018f;
                if (C12370u.m35938d(str)) {
                    String substring = str.substring(str.lastIndexOf(ClassUtils.PACKAGE_SEPARATOR) + 1);
                    C12340a aVar = new C12340a(C12428i.m36153c());
                    String a = C6306c.m19561a(str);
                    String b = aVar.mo30183b(a, substring);
                    String a2 = C12340a.m35833a(a, substring);
                    String a3 = aVar.mo30182a(a2);
                    boolean a4 = C12349f.m35867a().mo30188a(str);
                    if (a4) {
                        for (int i = 1; i < 4; i++) {
                            Thread.sleep((long) (i * 1000));
                            a4 = C12349f.m35867a().mo30188a(str);
                            if (!a4) {
                                break;
                            }
                        }
                    }
                    if (a4) {
                        this.f32913b.sendMessage(this.f32913b.obtainMessage(13, this.f32912a));
                        return null;
                    }
                    if (C12340a.m35834a() && !new File(b).isFile() && C12428i.m36159i() != null) {
                        C12428i.m36159i().mo30322a(str, 5120000, a3, a2);
                    }
                    this.f32912a.f33027o = b;
                }
            } catch (Throwable unused) {
            }
            this.f32913b.sendMessage(this.f32913b.obtainMessage(13, this.f32912a));
            return null;
        }

        C12393a(Handler handler, C12435a aVar) {
            this.f32913b = handler;
            this.f32912a = aVar;
        }
    }

    /* renamed from: a */
    public final void mo30259a() {
    }

    /* renamed from: b */
    public final void mo30261b() {
    }

    /* renamed from: a */
    public final boolean mo30260a(C12409c cVar, JSONObject jSONObject) {
        try {
            m36030f();
            if (m36027c()) {
                jSONObject.put("code", 1);
                m36019a(cVar.f32954d, jSONObject, cVar.f32952b);
                return false;
            }
            jSONObject.put("code", 0);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: c */
    private boolean m36027c() {
        C12375a aVar;
        if (this.f32905c != null) {
            aVar = (C12375a) this.f32905c.get();
        } else {
            aVar = null;
        }
        return C12364o.m35912a(aVar);
    }

    /* renamed from: d */
    private boolean m36028d() {
        if (!(C12428i.m36157g() == null || this.f32903a == null)) {
            this.f32903a.get();
        }
        return false;
    }

    /* renamed from: e */
    private boolean m36029e() {
        if (!(C12428i.m36157g() == null || this.f32903a == null)) {
            this.f32903a.get();
        }
        return false;
    }

    /* renamed from: f */
    private Activity m36030f() {
        Activity activity;
        if (this.f32903a != null) {
            activity = (Activity) this.f32903a.get();
        } else {
            activity = null;
        }
        if (activity == null) {
            return null;
        }
        return activity;
    }

    /* renamed from: a */
    private static boolean m36023a(Context context) {
        C12428i.m36157g();
        return false;
    }

    /* renamed from: a */
    private void m36016a(C12435a aVar) {
        String str = aVar.f33014b;
        String str2 = aVar.f33027o;
        String str3 = aVar.f33020h;
        String str4 = aVar.f33017e;
        try {
            if (TextUtils.isEmpty(str2)) {
                m36025b(aVar);
                return;
            }
            if (!new File(str2).exists()) {
                m36025b(aVar);
                return;
            }
            if ("weixin".equals(str)) {
                m36026b(false, str2, aVar, str3, str4);
            } else if ("weixin_moments".equals(str)) {
                m36026b(true, str2, aVar, str3, str4);
            } else if ("qzone_sns".equals(str) || "qzone".equals(str)) {
                m36020a(true, str2, aVar, str3, str4);
            } else {
                if ("qq".equals(str)) {
                    m36020a(false, str2, aVar, str3, str4);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    private void m36025b(C12435a aVar) {
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
            m36022a(false, str3, str4, str5, bArr, str6, aVar, str7);
        } else if ("weixin_moments".equals(str2)) {
            m36022a(true, str3, str4, str5, bArr, str6, aVar, str7);
        } else if ("qzone_sns".equals(str2) || "qzone".equals(str2)) {
            m36021a(true, str3, str4, str8, str9, str5, aVar, str6, str7);
        } else {
            if ("qq".equals(str2)) {
                m36021a(false, str3, str4, str8, str9, str5, aVar, str6, str7);
            }
        }
    }

    public final void handleMsg(Message message) {
        ProgressDialog progressDialog;
        if (message.what == 13 && (message.obj instanceof C12435a)) {
            C12435a aVar = (C12435a) message.obj;
            if (aVar.f33025m != null) {
                progressDialog = (ProgressDialog) aVar.f33025m.get();
            } else {
                progressDialog = null;
            }
            if (progressDialog != null && progressDialog.isShowing()) {
                progressDialog.dismiss();
            }
            if (m36027c() && aVar.f33013a == this.f32906d) {
                this.f32906d++;
                if (TextUtils.isEmpty(aVar.f33027o)) {
                    m36025b(aVar);
                    return;
                }
                try {
                    if (new File(aVar.f33027o).exists()) {
                        m36016a(aVar);
                    } else {
                        m36025b(aVar);
                    }
                } catch (Throwable unused) {
                    m36025b(aVar);
                }
            }
        }
    }

    /* renamed from: a */
    private void m36018a(String str, JSONObject jSONObject) {
        if (this.f32904b != null) {
            this.f32904b.mo30265a(str, jSONObject);
        }
    }

    /* renamed from: a */
    private void m36017a(C12435a aVar, boolean z) {
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
            m36018a(aVar.f33028p, aVar.f33024l);
        }
    }

    /* renamed from: a */
    private boolean m36024a(String str, C12435a aVar) {
        Activity activity;
        if (this.f32903a != null) {
            activity = (Activity) this.f32903a.get();
        } else {
            activity = null;
        }
        if (activity == null || activity.isFinishing()) {
            m36017a(aVar, false);
            return false;
        } else if (VERSION.SDK_INT < 17 || !activity.isDestroyed()) {
            if ("weixin".equals(str) || "weixin_moments".equals(str)) {
                if (!m36028d()) {
                    C9738o.m28694a((Context) activity, (int) R.drawable.bdb, (int) R.string.d36);
                    m36017a(aVar, false);
                    return true;
                } else if (!m36029e()) {
                    C9738o.m28694a((Context) activity, (int) R.drawable.bdb, (int) R.string.d35);
                    m36017a(aVar, false);
                    return true;
                }
            } else if (!"qzone_sns".equals(str) && !"qzone".equals(str) && !"qq".equals(str)) {
                m36017a(aVar, false);
                return false;
            } else if (!m36023a((Context) activity)) {
                C9738o.m28694a((Context) activity, (int) R.drawable.bdb, (int) R.string.d34);
                m36017a(aVar, false);
                return true;
            }
            if (C6319n.m19593a(aVar.f33018f)) {
                m36017a(aVar, false);
                return false;
            }
            this.f32906d++;
            aVar.f33013a = this.f32906d;
            ProgressDialog progressDialog = new ProgressDialog(activity);
            progressDialog.setMessage(activity.getString(R.string.d30));
            progressDialog.setCancelable(true);
            progressDialog.show();
            aVar.f33025m = new WeakReference<>(progressDialog);
            new C12393a(this.f32907e, aVar).execute(new Void[0]);
            return true;
        } else {
            m36017a(aVar, false);
            return false;
        }
    }

    public C12390a(WeakReference<Activity> weakReference, C12375a aVar, C12396c cVar) {
        this.f32903a = weakReference;
        this.f32905c = new WeakReference<>(aVar);
        this.f32904b = cVar;
    }

    /* renamed from: a */
    private void m36019a(JSONObject jSONObject, JSONObject jSONObject2, String str) throws Exception {
        C12435a aVar = new C12435a();
        aVar.mo30346a(jSONObject);
        aVar.f33024l = jSONObject2;
        aVar.f33028p = str;
        if (C6319n.m19593a(aVar.f33014b) || C6319n.m19593a(aVar.f33018f)) {
            m36017a(aVar, false);
        } else {
            m36024a(aVar.f33014b, aVar);
        }
    }

    /* renamed from: a */
    private void m36020a(boolean z, String str, C12435a aVar, String str2, String str3) {
        Activity activity;
        if (this.f32903a != null) {
            activity = (Activity) this.f32903a.get();
        } else {
            activity = null;
        }
        if (activity == null) {
            m36017a(aVar, false);
        } else if (!m36023a((Context) activity)) {
            C9738o.m28694a((Context) activity, (int) R.drawable.bdb, (int) R.string.d34);
            m36017a(aVar, false);
        } else {
            File file = new File(str);
            if (!file.exists()) {
                C9738o.m28695a((Context) activity, (int) R.drawable.bdb, "图片不存在");
                m36017a(aVar, false);
            } else if ("system".equals(str2)) {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName("com.tencent.mobileqq", "com.tencent.mobileqq.activity.JumpActivity"));
                intent.setAction("android.intent.action.SEND");
                intent.addFlags(335577088);
                intent.setType("image/*");
                if (new File(str).exists()) {
                    intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                }
                String str4 = "android.intent.extra.TEXT";
                if (str3 == null) {
                    str3 = "";
                }
                intent.putExtra(str4, str3);
                activity.startActivity(intent);
                m36017a(aVar, true);
            } else {
                C12428i.m36157g();
            }
        }
    }

    /* renamed from: b */
    private void m36026b(boolean z, String str, C12435a aVar, String str2, String str3) {
        Activity activity;
        String str4;
        if (this.f32903a != null) {
            activity = (Activity) this.f32903a.get();
        } else {
            activity = null;
        }
        if (activity == null) {
            m36017a(aVar, false);
        } else if (!m36028d()) {
            C9738o.m28694a((Context) activity, (int) R.drawable.bdb, (int) R.string.d36);
            m36017a(aVar, false);
        } else if (!m36029e()) {
            C9738o.m28694a((Context) activity, (int) R.drawable.bdb, (int) R.string.d35);
            m36017a(aVar, false);
        } else {
            File file = new File(str);
            if (!file.exists()) {
                C9738o.m28695a((Context) activity, (int) R.drawable.bdb, "图片不存在");
                m36017a(aVar, false);
            } else if ("system".equals(str2)) {
                Intent intent = new Intent();
                if (z) {
                    str4 = "com.tencent.mm.ui.tools.ShareToTimeLineUI";
                } else {
                    str4 = "com.tencent.mm.ui.tools.ShareImgUI";
                }
                intent.setComponent(new ComponentName("com.tencent.mm", str4));
                intent.setAction("android.intent.action.SEND");
                intent.addFlags(335577088);
                intent.setType("image/*");
                if (new File(str).exists()) {
                    intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                }
                String str5 = "Kdescription";
                if (str3 == null) {
                    str3 = "";
                }
                intent.putExtra(str5, str3);
                activity.startActivity(intent);
                m36017a(aVar, true);
            } else {
                C12428i.m36157g();
            }
        }
    }

    /* renamed from: a */
    private void m36022a(boolean z, String str, String str2, String str3, byte[] bArr, String str4, C12435a aVar, String str5) {
        Activity activity;
        String str6;
        if (this.f32903a != null) {
            activity = (Activity) this.f32903a.get();
        } else {
            activity = null;
        }
        if (activity == null) {
            m36017a(aVar, false);
        } else if (!m36028d()) {
            C9738o.m28694a((Context) activity, (int) R.drawable.bdb, (int) R.string.d36);
            m36017a(aVar, false);
        } else if (!m36029e()) {
            C9738o.m28694a((Context) activity, (int) R.drawable.bdb, (int) R.string.d35);
            m36017a(aVar, false);
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
            m36017a(aVar, true);
        } else {
            C12428i.m36157g();
        }
    }

    /* renamed from: a */
    private void m36021a(boolean z, String str, String str2, String str3, String str4, String str5, C12435a aVar, String str6, String str7) {
        Activity activity;
        if (this.f32903a != null) {
            activity = (Activity) this.f32903a.get();
        } else {
            activity = null;
        }
        if (activity == null) {
            m36017a(aVar, false);
            return;
        }
        Activity activity2 = activity;
        if (!m36023a((Context) activity2)) {
            C9738o.m28694a((Context) activity2, (int) R.drawable.bdb, (int) R.string.d34);
            m36017a(aVar, false);
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
            m36017a(aVar, true);
        } else {
            C12428i.m36157g();
        }
    }
}
