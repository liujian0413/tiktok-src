package com.p280ss.android.ugc.aweme.p1216fe.method;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Message;
import android.support.p029v7.widget.C1362as;
import android.text.TextUtils;
import android.util.SparseArray;
import com.aweme.storage.C1921e;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.facebook.react.bridge.ReactContext;
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
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import com.p280ss.android.ugc.aweme.p1216fe.method.upload.C28038b;
import com.p280ss.android.ugc.aweme.p1216fe.method.upload.ImageChooseUploadActivity;
import com.p280ss.android.ugc.aweme.p999aj.C22477b;
import com.p280ss.android.ugc.aweme.p999aj.C22477b.C22480b;
import com.p280ss.android.ugc.aweme.photo.C34729c;
import com.p280ss.android.ugc.aweme.photo.PhotoContext;
import com.p280ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p280ss.android.ugc.aweme.profile.p1487ui.CropActivity.C36133a;
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
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.C7581n;
import kotlin.jvm.p357a.C7561a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.RnUploadFileMethod */
public class RnUploadFileMethod extends BaseCommonJavaMethod implements C23255b, C28038b {

    /* renamed from: a */
    protected WeakReference<Context> f73542a;

    /* renamed from: b */
    public int f73543b;

    /* renamed from: c */
    public boolean f73544c;

    /* renamed from: d */
    public C27876a f73545d;

    /* renamed from: i */
    public SparseArray<AvatarUri> f73546i;

    /* renamed from: j */
    public List<String> f73547j;

    /* renamed from: k */
    public AtomicInteger f73548k;

    /* renamed from: l */
    public AtomicInteger f73549l;

    /* renamed from: m */
    public C7561a<C7581n> f73550m;

    /* renamed from: n */
    public boolean f73551n;

    /* renamed from: o */
    public int f73552o;

    /* renamed from: p */
    public String f73553p;

    /* renamed from: q */
    public long f73554q;

    /* renamed from: r */
    private String f73555r = "";

    /* renamed from: s */
    private String f73556s;

    /* renamed from: t */
    private boolean f73557t;

    /* renamed from: u */
    private boolean f73558u;

    /* renamed from: v */
    private List<C6310a> f73559v;

    /* renamed from: w */
    private boolean f73560w;

    /* renamed from: x */
    private float f73561x = 1.0f;

    /* renamed from: y */
    private int f73562y;

    /* renamed from: z */
    private int f73563z;

    /* renamed from: f */
    public final void mo61510f() {
        this.f73550m = null;
    }

    /* renamed from: a */
    public final boolean mo60523a(int i, int i2, Intent intent) {
        Uri uri;
        if (i == 10003) {
            if (i2 == 0 || intent == null) {
                mo61509e();
                return true;
            }
            Context context = (Context) this.f73542a.get();
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
            } else if (!new File(a2).exists()) {
                C9738o.m28694a(context, (int) R.drawable.wt, (int) R.string.cty);
                return true;
            } else if (this.f73560w) {
                if (context instanceof Activity) {
                    String str = a2;
                    C36133a.m116558a((Activity) context, str, false, this.f73561x, (int) C9738o.m28708b(context, 16.0f), 10004, this.f73562y, this.f73563z);
                }
                return true;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(Api.f60503c);
                sb.append("?uid=");
                sb.append(C21115b.m71197a().getCurUserId());
                String sb2 = sb.toString();
                if (!TextUtils.isEmpty(this.f73555r)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(sb2);
                    sb3.append("&source=");
                    sb3.append(this.f73555r);
                    sb2 = sb3.toString();
                }
                String str2 = sb2;
                this.f73556s = a2;
                C6861a.m21332a().userService().uploadAvatar(new C6309f(this), str2, 4194304, a2, null);
                return true;
            }
        } else if (i != 10004) {
            return true;
        } else {
            if (i2 == 0 || intent == null) {
                mo61509e();
                return true;
            }
            Context context2 = (Context) this.f73542a.get();
            if (context2 == null) {
                return true;
            }
            String a3 = C19929d.m65756a(context2, intent.getData());
            if (C6319n.m19593a(a3)) {
                C9738o.m28694a(context2, (int) R.drawable.wt, (int) R.string.cty);
                return true;
            } else if (!new File(a3).exists()) {
                C9738o.m28694a(context2, (int) R.drawable.wt, (int) R.string.cty);
                return true;
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(Api.f60503c);
                sb4.append("?uid=");
                sb4.append(C21115b.m71197a().getCurUserId());
                String sb5 = sb4.toString();
                if (!TextUtils.isEmpty(this.f73555r)) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(sb5);
                    sb6.append("&source=");
                    sb6.append(this.f73555r);
                    sb5 = sb6.toString();
                }
                String str3 = sb5;
                this.f73556s = a3;
                C6861a.m21332a().userService().uploadAvatar(new C6309f(this), str3, 4194304, a3, null);
                return true;
            }
        }
    }

    /* renamed from: e */
    public final void mo61509e() {
        this.f73545d.mo71362a(0, "H5_uploadFileCancel");
        this.f73551n = true;
    }

    /* renamed from: a */
    private void m91451a(int i) {
        this.f73559v = new ArrayList();
        for (final int i2 = 0; i2 < i; i2++) {
            this.f73559v.add(new C6310a() {
                public final void handleMsg(Message message) {
                    if (RnUploadFileMethod.this.f73546i != null && RnUploadFileMethod.this.f73549l != null && RnUploadFileMethod.this.f73548k != null && RnUploadFileMethod.this.f73547j != null && RnUploadFileMethod.this.f73545d != null && RnUploadFileMethod.this.f73542a != null && !RnUploadFileMethod.this.f73551n) {
                        if (message.obj instanceof ApiServerException) {
                            Context context = (Context) RnUploadFileMethod.this.f73542a.get();
                            if (context != null) {
                                C10761a.m31403c(context, ((ApiServerException) message.obj).getErrorMsg()).mo25750a();
                            }
                            RnUploadFileMethod.this.f73546i.put(i2, new AvatarUri());
                            RnUploadFileMethod.this.f73549l.incrementAndGet();
                        } else if (message.obj instanceof AvatarUri) {
                            AvatarUri avatarUri = (AvatarUri) message.obj;
                            if (C23477d.m77083b(avatarUri.urlList)) {
                                RnUploadFileMethod.this.f73546i.put(i2, avatarUri);
                                RnUploadFileMethod.this.f73548k.incrementAndGet();
                            } else {
                                RnUploadFileMethod.this.f73546i.put(i2, new AvatarUri());
                                RnUploadFileMethod.this.f73549l.incrementAndGet();
                            }
                        } else {
                            RnUploadFileMethod.this.f73546i.put(i2, new AvatarUri());
                            RnUploadFileMethod.this.f73549l.incrementAndGet();
                        }
                        if (RnUploadFileMethod.this.f73549l.get() + RnUploadFileMethod.this.f73548k.get() == RnUploadFileMethod.this.f73547j.size()) {
                            if (RnUploadFileMethod.this.f73549l.get() == RnUploadFileMethod.this.f73547j.size()) {
                                RnUploadFileMethod.m91449a(RnUploadFileMethod.this.f73546i);
                                RnUploadFileMethod.this.f73545d.mo71362a(0, "H5_uploadFileFailed");
                            } else {
                                RnUploadFileMethod.this.f73545d.mo71364a(RnUploadFileMethod.m91449a(RnUploadFileMethod.this.f73546i), 1, "H5_uploadFile");
                            }
                            if (RnUploadFileMethod.this.f73550m != null) {
                                RnUploadFileMethod.this.f73550m.invoke();
                            }
                            C29119x.f76867a.mo74563a(RnUploadFileMethod.this.f73552o);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: b */
    private void m91453b(final Activity activity) {
        C22477b.m74364a(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C22480b() {
            /* renamed from: a */
            public final void mo53549a(String[] strArr, int[] iArr) {
                if (iArr != null && iArr.length > 0) {
                    if (iArr[0] == 0) {
                        Intent intent = new Intent(activity, ImageChooseUploadActivity.class);
                        intent.putExtra("shouldWithCamera", RnUploadFileMethod.this.f73544c);
                        intent.putExtra("maxSelectNum", RnUploadFileMethod.this.f73543b);
                        intent.putExtra("enter_from", RnUploadFileMethod.this.f73553p);
                        activity.startActivity(intent);
                        C6907h.m21524a("enter_image_choose", (Map) new C22984d().mo59973a("enter_from", RnUploadFileMethod.this.f73553p).f60753a);
                        ImageChooseUploadActivity.f73816i = RnUploadFileMethod.this;
                        return;
                    }
                    C10761a.m31410e((Context) activity, activity.getString(R.string.ct5)).mo25750a();
                    RnUploadFileMethod.this.mo61509e();
                }
            }
        });
    }

    /* renamed from: a */
    private void m91452a(final Activity activity) {
        C22477b.m74364a(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C22480b() {
            /* renamed from: a */
            public final void mo53549a(String[] strArr, int[] iArr) {
                if (iArr != null && iArr.length > 0) {
                    if (iArr[0] == 0) {
                        RnUploadFileMethod.this.mo71403a(activity, 10003);
                    } else {
                        C10761a.m31410e((Context) activity, activity.getString(R.string.ct5)).mo25750a();
                        RnUploadFileMethod.this.mo61509e();
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public static JSONArray m91449a(SparseArray<AvatarUri> sparseArray) {
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
        Context context = (Context) this.f73542a.get();
        if (context != null) {
            if (message.obj instanceof ApiServerException) {
                C10761a.m31403c(context, ((ApiServerException) message.obj).getErrorMsg()).mo25750a();
                m91450a(0, "", "");
            } else if (message.obj instanceof AvatarUri) {
                AvatarUri avatarUri = (AvatarUri) message.obj;
                if (avatarUri == null || avatarUri.urlList == null || avatarUri.urlList.isEmpty()) {
                    m91450a(0, "", "");
                    try {
                        this.f73545d.mo71362a(0, "H5_uploadFileFailed");
                    } catch (Exception unused) {
                    }
                } else {
                    try {
                        this.f73545d.mo71364a(m91450a(1, (String) avatarUri.urlList.get(0), avatarUri.uri), 1, "H5_uploadFile");
                    } catch (Exception unused2) {
                    }
                }
            } else {
                m91450a(0, "", "");
                this.f73545d.mo71362a(0, "H5_uploadFileFailed");
            }
        }
    }

    public RnUploadFileMethod(WeakReference<Context> weakReference, ReactContext reactContext) {
        super(reactContext);
        this.f73542a = weakReference;
    }

    /* renamed from: a */
    public final void mo71403a(Activity activity, int i) {
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
                    if (RnUploadFileMethod.this.f73554q == 0 || C1921e.m8887a(file) <= RnUploadFileMethod.this.f73554q) {
                        return null;
                    }
                    return new C47336b(1, context.getString(R.string.ctv, new Object[]{String.valueOf((int) (RnUploadFileMethod.this.f73554q / 1048576))}));
                }
            }).mo119342e(10003);
        } catch (Exception e) {
            C6921a.m21554a(e);
            C19929d.m65758a(activity, null, 10003);
        }
    }

    /* renamed from: a */
    public final void mo61506a(List<String> list, C7561a<C7581n> aVar) {
        if (!C23477d.m77081a((Collection<T>) list)) {
            this.f73550m = aVar;
            this.f73548k = new AtomicInteger(0);
            this.f73549l = new AtomicInteger(0);
            this.f73547j = list;
            this.f73546i = new SparseArray<>();
            m91451a(this.f73547j.size());
            for (int i = 0; i < list.size(); i++) {
                String str = (String) list.get(i);
                if (C6319n.m19593a(str)) {
                    this.f73546i.put(i, new AvatarUri());
                    this.f73549l.incrementAndGet();
                } else {
                    File file = new File(str);
                    if (!file.exists()) {
                        this.f73546i.put(i, new AvatarUri());
                        this.f73549l.incrementAndGet();
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append(Api.f60503c);
                        sb.append("?uid=");
                        sb.append(C21115b.m71197a().getCurUserId());
                        String sb2 = sb.toString();
                        if (!TextUtils.isEmpty(this.f73555r)) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(sb2);
                            sb3.append("&source=");
                            sb3.append(this.f73555r);
                            sb2 = sb3.toString();
                        }
                        C6861a.m21332a().userService().uploadAvatar(new C6309f((C6310a) this.f73559v.get(i)), sb2, 4194304, C29119x.f76867a.mo74562a(str, file, this.f73552o), null);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) {
        Context context;
        this.f73545d = aVar;
        String optString = jSONObject.optString("type");
        this.f73555r = jSONObject.optString("source");
        this.f73557t = jSONObject.optBoolean("skip_img_base64", false);
        this.f73543b = jSONObject.optInt("maxSelectNum", 1);
        this.f73558u = jSONObject.optBoolean("isMultiSelect", false);
        this.f73544c = jSONObject.optBoolean("skip_img_base64", false);
        this.f73552o = jSONObject.optInt("image_width", -1);
        this.f73553p = jSONObject.optString("from", "");
        this.f73554q = jSONObject.optLong("maxFileSize", 0);
        this.f73560w = jSONObject.optBoolean("isNeedCut", false);
        this.f73562y = jSONObject.optInt("minImageWidth");
        this.f73563z = jSONObject.optInt("minImageHeight");
        int optInt = jSONObject.optInt("cropRatioWidth", 0);
        int optInt2 = jSONObject.optInt("cropRatioHeight", 0);
        if (optInt * optInt2 != 0) {
            this.f73561x = (((float) optInt2) * 1.0f) / ((float) optInt);
        }
        if ("image".equals(optString)) {
            if (this.f73542a != null) {
                context = (Context) this.f73542a.get();
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
            this.f73551n = false;
            if (this.f73558u) {
                m91453b((Activity) context);
                return;
            }
            m91452a((Activity) context);
        }
    }

    /* renamed from: a */
    private JSONObject m91450a(int i, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        String str3 = "";
        try {
            if (!this.f73557t && C42973bg.m136427a(this.f73556s)) {
                PhotoContext compress = ((IAVService) ServiceManager.get().getService(IAVService.class)).photoService().compress(this.f73556s, new C34729c(), 216, 384);
                if (compress != null) {
                    str3 = C42973bg.m136430b(compress.mPhotoLocalPath);
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.f73557t = false;
            this.f73556s = "";
            throw th;
        }
        this.f73557t = false;
        this.f73556s = "";
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
