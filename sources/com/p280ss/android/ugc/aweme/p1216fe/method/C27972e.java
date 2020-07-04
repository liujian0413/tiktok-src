package com.p280ss.android.ugc.aweme.p1216fe.method;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.p029v7.widget.C1362as;
import android.text.TextUtils;
import android.util.SparseArray;
import bolts.C1592h;
import com.aweme.storage.C1921e;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.web.p582a.C11087a;
import com.bytedance.ies.web.p582a.C11093e;
import com.bytedance.ies.web.p582a.C11097i;
import com.p280ss.android.newmedia.C19929d;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.activity.C23255b;
import com.p280ss.android.ugc.aweme.base.activity.C23257d;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feedback.C29119x;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p1216fe.method.upload.C28038b;
import com.p280ss.android.ugc.aweme.p1216fe.method.upload.ImageChooseUploadActivity;
import com.p280ss.android.ugc.aweme.p999aj.C22477b;
import com.p280ss.android.ugc.aweme.photo.C34729c;
import com.p280ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p280ss.android.ugc.aweme.profile.p1487ui.CropActivity.C36133a;
import com.p280ss.android.ugc.aweme.sensitiveserver.C37422a;
import com.p280ss.android.ugc.aweme.sensitiveserver.C37422a.C37423a;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.utils.C42973bg;
import com.zhihu.matisse.C47321a;
import com.zhihu.matisse.MimeType;
import com.zhihu.matisse.internal.entity.C47336b;
import com.zhihu.matisse.internal.entity.Item;
import com.zhihu.matisse.p1853a.C47322a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.C7581n;
import kotlin.jvm.p357a.C7561a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.e */
public final class C27972e implements C11093e, C23255b, C28038b {

    /* renamed from: a */
    protected WeakReference<Context> f73673a;

    /* renamed from: b */
    protected C11087a f73674b;

    /* renamed from: c */
    public long f73675c;

    /* renamed from: d */
    private String f73676d = "";

    /* renamed from: e */
    private String f73677e;

    /* renamed from: f */
    private boolean f73678f;

    /* renamed from: g */
    private int f73679g;

    /* renamed from: h */
    private boolean f73680h;

    /* renamed from: i */
    private boolean f73681i;

    /* renamed from: j */
    private boolean f73682j;

    /* renamed from: k */
    private SparseArray<AvatarUri> f73683k;

    /* renamed from: l */
    private List<String> f73684l;

    /* renamed from: m */
    private AtomicInteger f73685m;

    /* renamed from: n */
    private AtomicInteger f73686n;

    /* renamed from: o */
    private C7561a<C7581n> f73687o;

    /* renamed from: p */
    private List<C6310a> f73688p;

    /* renamed from: q */
    private boolean f73689q;

    /* renamed from: r */
    private int f73690r;

    /* renamed from: s */
    private String f73691s;

    /* renamed from: t */
    private boolean f73692t;

    /* renamed from: u */
    private float f73693u = 1.0f;

    /* renamed from: v */
    private int f73694v;

    /* renamed from: w */
    private int f73695w;

    /* renamed from: f */
    public final void mo61510f() {
        this.f73687o = null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo71442a(Activity activity, String[] strArr, int[] iArr) {
        if (iArr != null && iArr.length > 0) {
            if (iArr[0] == 0) {
                Intent intent = new Intent(activity, ImageChooseUploadActivity.class);
                intent.putExtra("shouldWithCamera", this.f73681i);
                intent.putExtra("maxSelectNum", this.f73679g);
                intent.putExtra("enter_from", this.f73691s);
                activity.startActivity(intent);
                C6907h.m21524a("enter_image_choose", (Map) new C22984d().mo59973a("enter_from", this.f73691s).f60753a);
                ImageChooseUploadActivity.f73816i = this;
                return;
            }
            C10761a.m31410e((Context) activity, activity.getString(R.string.ct5)).mo25750a();
            m91555a("image", "0");
        }
    }

    /* renamed from: a */
    public final boolean mo60523a(int i, int i2, Intent intent) {
        Uri uri;
        if (i == 10003) {
            if (i2 == 0 || intent == null) {
                m91555a("image", "1");
                return true;
            }
            Context context = (Context) this.f73673a.get();
            if (context == null) {
                return true;
            }
            List a = C47321a.m147751a(intent);
            if (a == null || a.isEmpty()) {
                uri = intent.getData();
            } else {
                uri = (Uri) a.get(0);
            }
            String a2 = C19929d.m65756a(context, uri);
            if (C6319n.m19593a(a2)) {
                C9738o.m28694a(context, (int) R.drawable.wt, (int) R.string.cty);
                return true;
            }
            File file = new File(a2);
            if (!file.exists()) {
                C9738o.m28694a(context, (int) R.drawable.wt, (int) R.string.cty);
                return true;
            } else if (this.f73692t) {
                if (context instanceof Activity) {
                    String str = a2;
                    C36133a.m116558a((Activity) context, str, false, this.f73693u, (int) C9738o.m28708b(context, 16.0f), 10004, this.f73694v, this.f73695w);
                }
                return true;
            } else {
                this.f73677e = a2;
                if (this.f73682j) {
                    m91558b(file);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(Api.f60503c);
                    sb.append("?uid=");
                    sb.append(C21115b.m71197a().getCurUserId());
                    String sb2 = sb.toString();
                    if (!TextUtils.isEmpty(this.f73676d)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(sb2);
                        sb3.append("&source=");
                        sb3.append(this.f73676d);
                        sb2 = sb3.toString();
                    }
                    C6861a.m21332a().userService().uploadAvatar(new C6309f(this), sb2, 4194304, a2, null);
                }
                return true;
            }
        } else if (i != 10004) {
            return true;
        } else {
            if (i2 == 0 || intent == null) {
                m91555a("image", "1");
                return true;
            }
            Context context2 = (Context) this.f73673a.get();
            if (context2 == null) {
                return true;
            }
            String a3 = C19929d.m65756a(context2, intent.getData());
            if (C6319n.m19593a(a3)) {
                C9738o.m28694a(context2, (int) R.drawable.wt, (int) R.string.cty);
                return true;
            }
            File file2 = new File(a3);
            if (!file2.exists()) {
                C9738o.m28694a(context2, (int) R.drawable.wt, (int) R.string.cty);
                return true;
            }
            this.f73677e = a3;
            if (this.f73682j) {
                m91558b(file2);
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(Api.f60503c);
                sb4.append("?uid=");
                sb4.append(C21115b.m71197a().getCurUserId());
                String sb5 = sb4.toString();
                if (!TextUtils.isEmpty(this.f73676d)) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(sb5);
                    sb6.append("&source=");
                    sb6.append(this.f73676d);
                    sb5 = sb6.toString();
                }
                C6861a.m21332a().userService().uploadAvatar(new C6309f(this), sb5, 4194304, a3, null);
            }
            return true;
        }
    }

    /* renamed from: a */
    public final void mo61506a(List<String> list, C7561a<C7581n> aVar) {
        if (!C23477d.m77081a((Collection<T>) list)) {
            this.f73687o = aVar;
            this.f73685m = new AtomicInteger(0);
            this.f73686n = new AtomicInteger(0);
            this.f73684l = list;
            this.f73683k = new SparseArray<>();
            m91552a(this.f73684l.size());
            for (int i = 0; i < list.size(); i++) {
                String str = (String) list.get(i);
                if (C6319n.m19593a(str)) {
                    this.f73683k.put(i, new AvatarUri());
                    this.f73686n.incrementAndGet();
                } else {
                    File file = new File(str);
                    if (!file.exists()) {
                        this.f73683k.put(i, new AvatarUri());
                        this.f73686n.incrementAndGet();
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append(Api.f60503c);
                        sb.append("?uid=");
                        sb.append(C21115b.m71197a().getCurUserId());
                        String sb2 = sb.toString();
                        if (!TextUtils.isEmpty(this.f73676d)) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(sb2);
                            sb3.append("&source=");
                            sb3.append(this.f73676d);
                            sb2 = sb3.toString();
                        }
                        C6861a.m21332a().userService().uploadAvatar(new C6309f((C6310a) this.f73688p.get(i)), sb2, 4194304, C29119x.f76867a.mo74562a(str, file, this.f73690r), null);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo71441a(int i, Message message) {
        if (this.f73683k != null && this.f73686n != null && this.f73685m != null && this.f73684l != null && this.f73673a != null && !this.f73689q) {
            if (message.obj instanceof ApiServerException) {
                Context context = (Context) this.f73673a.get();
                if (context != null) {
                    C10761a.m31403c(context, ((ApiServerException) message.obj).getErrorMsg()).mo25750a();
                }
                this.f73683k.put(i, new AvatarUri());
                this.f73686n.incrementAndGet();
            } else if (message.obj instanceof AvatarUri) {
                AvatarUri avatarUri = (AvatarUri) message.obj;
                if (C23477d.m77083b(avatarUri.urlList)) {
                    this.f73683k.put(i, avatarUri);
                    this.f73685m.incrementAndGet();
                } else {
                    this.f73683k.put(i, new AvatarUri());
                    this.f73686n.incrementAndGet();
                }
            } else {
                this.f73683k.put(i, new AvatarUri());
                this.f73686n.incrementAndGet();
            }
            if (this.f73686n.get() + this.f73685m.get() == this.f73684l.size()) {
                if (this.f73686n.get() == this.f73684l.size()) {
                    mo71443a("image", mo71440a(0, "", ""));
                } else {
                    m91556a("image", m91551a(this.f73683k));
                }
                if (this.f73687o != null) {
                    this.f73687o.invoke();
                }
                C29119x.f76867a.mo74563a(this.f73690r);
            }
        }
    }

    /* renamed from: a */
    public final void mo71443a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("type", str);
            jSONObject2.put("args", jSONObject);
            jSONObject2.put("msg", "H5_uploadFile");
        } catch (JSONException unused) {
        }
        if (this.f73674b != null) {
            this.f73674b.mo27034b("H5_uploadFile", jSONObject2);
        }
    }

    /* renamed from: e */
    public final void mo61509e() {
        m91555a("image", "1");
        this.f73689q = true;
    }

    /* renamed from: b */
    private void m91558b(File file) {
        C1592h.m7853a((Callable<TResult>) new C27992i<TResult>(this, file));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Void mo71439a(File file) throws Exception {
        C37422a.m120062a(file, "1", "qualification_photo", "1", new C37423a() {
            /* renamed from: a */
            public final void mo61512a() {
                C27972e.this.mo71443a("image", C27972e.this.mo71440a(0, "", ""));
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public final /* synthetic */ void mo71445b(String str, String str2) {
                JSONObject a = C27972e.this.mo71440a(1, "", "");
                try {
                    a.put("file_id", str);
                    a.put("url", str2);
                } catch (JSONException unused) {
                }
                C27972e.this.mo71443a("image", a);
            }

            /* renamed from: a */
            public final void mo61513a(String str, String str2) {
                new Handler(Looper.getMainLooper()).post(new C27993j(this, str, str2));
            }
        });
        return null;
    }

    /* renamed from: a */
    private void m91552a(int i) {
        this.f73688p = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            this.f73688p.add(new C27991h(this, i2));
        }
    }

    /* renamed from: b */
    private void m91557b(Activity activity) {
        C22477b.m74364a(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C27990g(this, activity));
    }

    /* renamed from: a */
    private void m91553a(Activity activity) {
        C22477b.m74364a(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C27975f(this, activity));
    }

    /* renamed from: a */
    private static JSONArray m91551a(SparseArray<AvatarUri> sparseArray) {
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            JSONObject jSONObject = new JSONObject();
            String str = "";
            String str2 = "";
            if (sparseArray.get(i) != null && C23477d.m77083b(((AvatarUri) sparseArray.get(i)).urlList)) {
                str = ((AvatarUri) sparseArray.get(i)).uri;
                str2 = (String) ((AvatarUri) sparseArray.get(i)).urlList.get(0);
            }
            try {
                jSONObject.put("url", str2);
                jSONObject.put("uri", str);
                jSONArray.put(jSONObject);
            } catch (JSONException unused) {
            }
        }
        return jSONArray;
    }

    public final void handleMsg(Message message) {
        JSONObject jSONObject;
        Context context = (Context) this.f73673a.get();
        if (context != null) {
            if (message.obj instanceof ApiServerException) {
                C10761a.m31403c(context, ((ApiServerException) message.obj).getErrorMsg()).mo25750a();
            } else if (message.obj instanceof AvatarUri) {
                AvatarUri avatarUri = (AvatarUri) message.obj;
                if (avatarUri.urlList == null || avatarUri.urlList.isEmpty()) {
                    jSONObject = mo71440a(0, "", "");
                } else {
                    jSONObject = mo71440a(1, (String) avatarUri.urlList.get(0), avatarUri.uri);
                }
                mo71443a("image", jSONObject);
            }
            jSONObject = mo71440a(0, "", "");
            mo71443a("image", jSONObject);
        }
    }

    public C27972e(WeakReference<Context> weakReference, C11087a aVar) {
        this.f73673a = weakReference;
        this.f73674b = aVar;
    }

    /* renamed from: a */
    private void m91554a(Activity activity, int i) {
        try {
            C47321a.m147748a(activity).mo119331a(MimeType.ofImage()).mo119336a(true).mo119338b(false).mo119337b(1).mo119339c(-1).mo119334a((int) R.style.gv).mo119335a((C47322a) new C47322a() {
                /* renamed from: a */
                public final C47336b mo61511a(Context context, Item item) {
                    String a = C19929d.m65756a(context, item.f121436c);
                    if (C6319n.m19593a(a)) {
                        return new C47336b(1, context.getString(R.string.cu2));
                    }
                    File file = new File(a);
                    if (!file.exists()) {
                        return new C47336b(1, context.getString(R.string.cu2));
                    }
                    if (C27972e.this.f73675c == 0 || C1921e.m8887a(file) <= C27972e.this.f73675c) {
                        return null;
                    }
                    return new C47336b(1, context.getString(R.string.ctv, new Object[]{String.valueOf((int) (C27972e.this.f73675c / 1048576))}));
                }
            }).mo119342e(10003);
        } catch (Exception e) {
            C6921a.m21554a(e);
            C19929d.m65758a(activity, null, 10003);
        }
    }

    public final void call(C11097i iVar, JSONObject jSONObject) throws Exception {
        Context context;
        String string = iVar.f30171d.getString("type");
        this.f73676d = "";
        if (TextUtils.equals("image", string)) {
            this.f73676d = iVar.f30171d.optString("source");
            this.f73678f = iVar.f30171d.optBoolean("skip_img_base64", false);
            this.f73679g = iVar.f30171d.optInt("maxSelectNum", 1);
            this.f73680h = iVar.f30171d.optBoolean("isMultiSelect", false);
            this.f73681i = iVar.f30171d.optBoolean("skip_img_base64", false);
            this.f73682j = iVar.f30171d.optBoolean("use_sensitive_server", false);
            this.f73690r = iVar.f30171d.optInt("image_width", -1);
            this.f73691s = iVar.f30171d.optString("from", "");
            this.f73675c = iVar.f30171d.optLong("maxFileSize", 0);
            this.f73692t = iVar.f30171d.optBoolean("isNeedCut", false);
            this.f73694v = iVar.f30171d.optInt("minImageWidth");
            this.f73695w = iVar.f30171d.optInt("minImageHeight");
            int optInt = iVar.f30171d.optInt("cropRatioWidth", 0);
            int optInt2 = iVar.f30171d.optInt("cropRatioHeight", 0);
            if (optInt * optInt2 != 0) {
                this.f73693u = (((float) optInt2) * 1.0f) / ((float) optInt);
            }
            if (this.f73673a != null) {
                context = (Context) this.f73673a.get();
            } else {
                context = null;
            }
            if (context instanceof C23257d) {
                ((C23257d) context).mo60524a(this);
            } else if (context instanceof C1362as) {
                context = ((C1362as) context).getBaseContext();
                if (context instanceof C23257d) {
                    ((C23257d) context).mo60524a(this);
                } else {
                    return;
                }
            } else {
                return;
            }
            jSONObject.put("code", 1);
            this.f73689q = false;
            if (this.f73680h) {
                m91557b((Activity) context);
                return;
            }
            m91553a((Activity) context);
        }
    }

    /* renamed from: a */
    private void m91555a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("reason", str2);
            jSONObject.put("code", 1);
            jSONObject2.put("type", str);
            jSONObject2.put("args", jSONObject);
            jSONObject2.put("msg", "H5_uploadFileCancel");
        } catch (JSONException unused) {
        }
        if (this.f73674b != null) {
            this.f73674b.mo27034b("H5_uploadFileCancel", jSONObject2);
        }
    }

    /* renamed from: a */
    private void m91556a(String str, JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", str);
            jSONObject.put("args", jSONArray);
            jSONObject.put("msg", "H5_uploadFile");
        } catch (JSONException unused) {
        }
        if (this.f73674b != null) {
            this.f73674b.mo27034b("H5_uploadFile", jSONObject);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo71444b(Activity activity, String[] strArr, int[] iArr) {
        if (iArr != null && iArr.length > 0) {
            if (iArr[0] == 0) {
                m91554a(activity, 10003);
            } else {
                C10761a.m31410e((Context) activity, activity.getString(R.string.ct5)).mo25750a();
                mo61509e();
            }
        }
    }

    /* renamed from: a */
    public final JSONObject mo71440a(int i, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        String str3 = "";
        try {
            if (!this.f73678f && C42973bg.m136427a(this.f73677e)) {
                str3 = C42973bg.m136430b(((IAVService) ServiceManager.get().getService(IAVService.class)).photoService().compress(this.f73677e, new C34729c(), 216, 384).mPhotoLocalPath);
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.f73678f = false;
            this.f73677e = "";
            throw th;
        }
        this.f73678f = false;
        this.f73677e = "";
        try {
            jSONObject.put("code", i);
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("url", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("uri", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("img_base64", str3);
            }
        } catch (JSONException unused2) {
        }
        return jSONObject;
    }
}
