package com.p280ss.android.ugc.aweme.bullet.bridge.common;

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
import com.bytedance.ies.bullet.core.model.p542a.C10403b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.newmedia.C19929d;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.activity.C23255b;
import com.p280ss.android.ugc.aweme.base.activity.C23257d;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.aweme.bullet.bridge.BaseBridge;
import com.p280ss.android.ugc.aweme.bullet.bridge.BaseBridge.C23565a;
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

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.UploadFileMethod */
public class UploadFileMethod extends BaseBridge implements C23255b, C28038b {

    /* renamed from: c */
    public long f62207c;

    /* renamed from: d */
    private String f62208d = "";

    /* renamed from: e */
    private String f62209e;

    /* renamed from: f */
    private boolean f62210f;

    /* renamed from: g */
    private int f62211g;

    /* renamed from: h */
    private boolean f62212h;

    /* renamed from: i */
    private boolean f62213i;

    /* renamed from: j */
    private boolean f62214j;

    /* renamed from: k */
    private SparseArray<AvatarUri> f62215k;

    /* renamed from: l */
    private List<String> f62216l;

    /* renamed from: m */
    private AtomicInteger f62217m;

    /* renamed from: n */
    private AtomicInteger f62218n;

    /* renamed from: o */
    private C7561a<C7581n> f62219o;

    /* renamed from: p */
    private List<C6310a> f62220p;

    /* renamed from: q */
    private boolean f62221q;

    /* renamed from: r */
    private int f62222r;

    /* renamed from: s */
    private String f62223s;

    /* renamed from: t */
    private boolean f62224t;

    /* renamed from: u */
    private float f62225u = 1.0f;

    /* renamed from: v */
    private int f62226v;

    /* renamed from: w */
    private int f62227w;

    /* renamed from: c */
    public final String mo25127c() {
        return "uploadFile";
    }

    /* renamed from: f */
    public final void mo61510f() {
        this.f62219o = null;
    }

    /* renamed from: a */
    public final void mo61491a(JSONObject jSONObject, C23565a aVar) throws JSONException {
        String optString = jSONObject.optString("type");
        JSONObject optJSONObject = jSONObject.optJSONObject("res");
        this.f62208d = "";
        if (TextUtils.equals("image", optString)) {
            this.f62208d = jSONObject.optString("source");
            this.f62210f = jSONObject.optBoolean("skip_img_base64", false);
            this.f62211g = jSONObject.optInt("maxSelectNum", 1);
            this.f62212h = jSONObject.optBoolean("isMultiSelect", false);
            this.f62213i = jSONObject.optBoolean("skip_img_base64", false);
            this.f62214j = jSONObject.optBoolean("use_sensitive_server", false);
            this.f62222r = jSONObject.optInt("image_width", -1);
            this.f62223s = jSONObject.optString("from", "");
            this.f62207c = jSONObject.optLong("maxFileSize", 0);
            this.f62224t = jSONObject.optBoolean("isNeedCut", false);
            this.f62226v = jSONObject.optInt("minImageWidth");
            this.f62227w = jSONObject.optInt("minImageHeight");
            int optInt = jSONObject.optInt("cropRatioWidth", 0);
            int optInt2 = jSONObject.optInt("cropRatioHeight", 0);
            if (optInt * optInt2 != 0) {
                this.f62225u = (((float) optInt2) * 1.0f) / ((float) optInt);
            }
            Context context = this.f28552b;
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
            if (optJSONObject != null) {
                optJSONObject.put("code", 1);
            }
            this.f62221q = false;
            if (this.f62212h) {
                m77427b((Activity) context);
                return;
            }
            m77423a((Activity) context);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo61505a(Activity activity, String[] strArr, int[] iArr) {
        if (iArr != null && iArr.length > 0) {
            if (iArr[0] == 0) {
                Intent intent = new Intent(activity, ImageChooseUploadActivity.class);
                intent.putExtra("shouldWithCamera", this.f62213i);
                intent.putExtra("maxSelectNum", this.f62211g);
                intent.putExtra("enter_from", this.f62223s);
                activity.startActivity(intent);
                C6907h.m21524a("enter_image_choose", (Map) new C22984d().mo59973a("enter_from", this.f62223s).f60753a);
                ImageChooseUploadActivity.f73816i = this;
                return;
            }
            C10761a.m31410e((Context) activity, activity.getString(R.string.ct5)).mo25750a();
            m77425a("image", "0");
        }
    }

    /* renamed from: a */
    public final boolean mo60523a(int i, int i2, Intent intent) {
        Uri uri;
        if (i == 10003) {
            if (i2 == 0 || intent == null) {
                m77425a("image", "1");
                return true;
            }
            Context context = this.f28552b;
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
            } else if (this.f62224t) {
                if (context instanceof Activity) {
                    String str = a2;
                    C36133a.m116558a((Activity) context, str, false, this.f62225u, (int) C9738o.m28708b(context, 16.0f), 10004, this.f62226v, this.f62227w);
                }
                return true;
            } else {
                this.f62209e = a2;
                if (this.f62214j) {
                    m77428b(file);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(Api.f60503c);
                    sb.append("?uid=");
                    sb.append(C21115b.m71197a().getCurUserId());
                    String sb2 = sb.toString();
                    if (!TextUtils.isEmpty(this.f62208d)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(sb2);
                        sb3.append("&source=");
                        sb3.append(this.f62208d);
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
                m77425a("image", "1");
                return true;
            }
            Context context2 = this.f28552b;
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
            this.f62209e = a3;
            if (this.f62214j) {
                m77428b(file2);
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(Api.f60503c);
                sb4.append("?uid=");
                sb4.append(C21115b.m71197a().getCurUserId());
                String sb5 = sb4.toString();
                if (!TextUtils.isEmpty(this.f62208d)) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(sb5);
                    sb6.append("&source=");
                    sb6.append(this.f62208d);
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
            this.f62219o = aVar;
            this.f62217m = new AtomicInteger(0);
            this.f62218n = new AtomicInteger(0);
            this.f62216l = list;
            this.f62215k = new SparseArray<>();
            m77422a(this.f62216l.size());
            for (int i = 0; i < list.size(); i++) {
                String str = (String) list.get(i);
                if (C6319n.m19593a(str)) {
                    this.f62215k.put(i, new AvatarUri());
                    this.f62218n.incrementAndGet();
                } else {
                    File file = new File(str);
                    if (!file.exists()) {
                        this.f62215k.put(i, new AvatarUri());
                        this.f62218n.incrementAndGet();
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append(Api.f60503c);
                        sb.append("?uid=");
                        sb.append(C21115b.m71197a().getCurUserId());
                        String sb2 = sb.toString();
                        if (!TextUtils.isEmpty(this.f62208d)) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(sb2);
                            sb3.append("&source=");
                            sb3.append(this.f62208d);
                            sb2 = sb3.toString();
                        }
                        C6861a.m21332a().userService().uploadAvatar(new C6309f((C6310a) this.f62220p.get(i)), sb2, 4194304, C29119x.f76867a.mo74562a(str, file, this.f62222r), null);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo61504a(int i, Message message) {
        if (this.f62215k != null && this.f62218n != null && this.f62217m != null && this.f62216l != null && this.f28552b != null && !this.f62221q) {
            if (message.obj instanceof ApiServerException) {
                Context context = this.f28552b;
                if (context != null) {
                    C10761a.m31403c(context, ((ApiServerException) message.obj).getErrorMsg()).mo25750a();
                }
                this.f62215k.put(i, new AvatarUri());
                this.f62218n.incrementAndGet();
            } else if (message.obj instanceof AvatarUri) {
                AvatarUri avatarUri = (AvatarUri) message.obj;
                if (C23477d.m77083b(avatarUri.urlList)) {
                    this.f62215k.put(i, avatarUri);
                    this.f62217m.incrementAndGet();
                } else {
                    this.f62215k.put(i, new AvatarUri());
                    this.f62218n.incrementAndGet();
                }
            } else {
                this.f62215k.put(i, new AvatarUri());
                this.f62218n.incrementAndGet();
            }
            if (this.f62218n.get() + this.f62217m.get() == this.f62216l.size()) {
                if (this.f62218n.get() == this.f62216l.size()) {
                    mo61508b("image", mo61503a(0, "", ""));
                } else {
                    m77426a("image", m77421a(this.f62215k));
                }
                if (this.f62219o != null) {
                    this.f62219o.invoke();
                }
                C29119x.f76867a.mo74563a(this.f62222r);
            }
        }
    }

    /* renamed from: e */
    public final void mo61509e() {
        m77425a("image", "1");
        this.f62221q = true;
    }

    public UploadFileMethod(C10403b bVar) {
        super(bVar);
    }

    /* renamed from: b */
    private void m77428b(File file) {
        C1592h.m7853a((Callable<TResult>) new C23586d<TResult>(this, file));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Void mo61502a(File file) throws Exception {
        C37422a.m120062a(file, "1", "qualification_photo", "1", new C37423a() {
            /* renamed from: a */
            public final void mo61512a() {
                UploadFileMethod.this.mo61508b("image", UploadFileMethod.this.mo61503a(0, "", ""));
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public final /* synthetic */ void mo61514b(String str, String str2) {
                JSONObject a = UploadFileMethod.this.mo61503a(1, "", "");
                try {
                    a.put("file_id", str);
                    a.put("url", str2);
                } catch (JSONException unused) {
                }
                UploadFileMethod.this.mo61508b("image", a);
            }

            /* renamed from: a */
            public final void mo61513a(String str, String str2) {
                new Handler(Looper.getMainLooper()).post(new C23587e(this, str, str2));
            }
        });
        return null;
    }

    /* renamed from: a */
    private void m77422a(int i) {
        this.f62220p = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            this.f62220p.add(new C23585c(this, i2));
        }
    }

    /* renamed from: b */
    private void m77427b(Activity activity) {
        C22477b.m74364a(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C23584b(this, activity));
    }

    /* renamed from: a */
    private void m77423a(Activity activity) {
        C22477b.m74364a(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C23583a(this, activity));
    }

    /* renamed from: a */
    private static JSONArray m77421a(SparseArray<AvatarUri> sparseArray) {
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

    public void handleMsg(Message message) {
        JSONObject jSONObject;
        Context context = this.f28552b;
        if (context != null) {
            if (message.obj instanceof ApiServerException) {
                C10761a.m31403c(context, ((ApiServerException) message.obj).getErrorMsg()).mo25750a();
            } else if (message.obj instanceof AvatarUri) {
                AvatarUri avatarUri = (AvatarUri) message.obj;
                if (avatarUri.urlList == null || avatarUri.urlList.isEmpty()) {
                    jSONObject = mo61503a(0, "", "");
                } else {
                    jSONObject = mo61503a(1, (String) avatarUri.urlList.get(0), avatarUri.uri);
                }
                mo61508b("image", jSONObject);
            }
            jSONObject = mo61503a(0, "", "");
            mo61508b("image", jSONObject);
        }
    }

    /* renamed from: b */
    public final void mo61508b(String str, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("type", str);
            jSONObject2.put("args", jSONObject);
            jSONObject2.put("msg", "H5_uploadFile");
        } catch (JSONException unused) {
        }
        mo61490a("H5_uploadFile", jSONObject2);
    }

    /* renamed from: a */
    private void m77424a(Activity activity, int i) {
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
                    if (UploadFileMethod.this.f62207c == 0 || C1921e.m8887a(file) <= UploadFileMethod.this.f62207c) {
                        return null;
                    }
                    return new C47336b(1, context.getString(R.string.ctv, new Object[]{String.valueOf((int) (UploadFileMethod.this.f62207c / 1048576))}));
                }
            }).mo119342e(10003);
        } catch (Exception e) {
            C6921a.m21554a(e);
            C19929d.m65758a(activity, null, 10003);
        }
    }

    /* renamed from: a */
    private void m77425a(String str, String str2) {
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
        mo61490a("H5_uploadFileCancel", jSONObject2);
    }

    /* renamed from: a */
    private void m77426a(String str, JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", str);
            jSONObject.put("args", jSONArray);
            jSONObject.put("msg", "H5_uploadFile");
        } catch (JSONException unused) {
        }
        mo61490a("H5_uploadFile", jSONObject);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo61507b(Activity activity, String[] strArr, int[] iArr) {
        if (iArr != null && iArr.length > 0) {
            if (iArr[0] == 0) {
                m77424a(activity, 10003);
            } else {
                C10761a.m31410e((Context) activity, activity.getString(R.string.ct5)).mo25750a();
                mo61509e();
            }
        }
    }

    /* renamed from: a */
    public final JSONObject mo61503a(int i, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        String str3 = "";
        try {
            if (!this.f62210f && C42973bg.m136427a(this.f62209e)) {
                str3 = C42973bg.m136430b(((IAVService) ServiceManager.get().getService(IAVService.class)).photoService().compress(this.f62209e, new C34729c(), 216, 384).mPhotoLocalPath);
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.f62210f = false;
            this.f62209e = "";
            throw th;
        }
        this.f62210f = false;
        this.f62209e = "";
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
