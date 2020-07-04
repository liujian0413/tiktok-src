package com.p280ss.android.ugc.aweme.p1216fe.method;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import bolts.C1592h;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.web.p582a.C11087a;
import com.bytedance.ies.web.p582a.C11093e;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.base.activity.C23255b;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p999aj.C22477b;
import com.p280ss.android.ugc.aweme.p999aj.C22477b.C22480b;
import com.p280ss.android.ugc.aweme.photo.C34729c;
import com.p280ss.android.ugc.aweme.poi.enterprise.UploadBusinessLicenseActivity.C35077a;
import com.p280ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p280ss.android.ugc.aweme.sensitiveserver.C37422a;
import com.p280ss.android.ugc.aweme.sensitiveserver.C37422a.C37423a;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.photo.IPhotoService;
import com.p280ss.android.ugc.aweme.utils.C42969bc;
import com.p280ss.android.ugc.aweme.utils.C42973bg;
import com.p280ss.android.ugc.aweme.utils.permission.C43162f;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.vesdk.filterparam.VETransitionFilterParam;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.collections.C7519g;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.text.C7634n;
import org.json.JSONException;
import org.json.JSONObject;
import p346io.reactivex.C7492s;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.fe.method.p */
public final class C27999p implements C6310a, C11093e, C23255b {

    /* renamed from: c */
    public static final C28000a f73733c = new C28000a(null);

    /* renamed from: a */
    public String f73734a;

    /* renamed from: b */
    public C47562b f73735b;

    /* renamed from: d */
    private String f73736d = "";

    /* renamed from: e */
    private String f73737e = "";

    /* renamed from: f */
    private String f73738f = "";

    /* renamed from: g */
    private boolean f73739g;

    /* renamed from: h */
    private int f73740h;

    /* renamed from: i */
    private boolean f73741i;

    /* renamed from: j */
    private boolean f73742j;

    /* renamed from: k */
    private boolean f73743k;

    /* renamed from: l */
    private int f73744l;

    /* renamed from: m */
    private String f73745m = "";

    /* renamed from: n */
    private String f73746n = "";

    /* renamed from: o */
    private String f73747o = "";

    /* renamed from: p */
    private String f73748p = "";

    /* renamed from: q */
    private String f73749q = "";

    /* renamed from: r */
    private String f73750r = "";

    /* renamed from: s */
    private String f73751s = "";

    /* renamed from: t */
    private boolean f73752t = true;

    /* renamed from: u */
    private WeakReference<Context> f73753u;

    /* renamed from: v */
    private C11087a f73754v;

    /* renamed from: com.ss.android.ugc.aweme.fe.method.p$a */
    public static final class C28000a {
        private C28000a() {
        }

        public /* synthetic */ C28000a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.p$b */
    static final class C28001b implements C22480b {

        /* renamed from: a */
        final /* synthetic */ C27999p f73755a;

        /* renamed from: b */
        final /* synthetic */ Activity f73756b;

        C28001b(C27999p pVar, Activity activity) {
            this.f73755a = pVar;
            this.f73756b = activity;
        }

        /* renamed from: a */
        public final void mo53549a(String[] strArr, int[] iArr) {
            boolean z;
            if (iArr != null) {
                if (iArr.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    if (C7519g.m23430a(iArr, -1)) {
                        new C10741a(this.f73756b).mo25657b((int) R.string.l_).mo25650a((int) R.string.afp, (OnClickListener) new OnClickListener(this) {

                            /* renamed from: a */
                            final /* synthetic */ C28001b f73757a;

                            {
                                this.f73757a = r1;
                            }

                            public final void onClick(DialogInterface dialogInterface, int i) {
                                C42969bc.m136401a(this.f73757a.f73756b);
                                dialogInterface.dismiss();
                            }
                        }).mo25658b((int) R.string.w_, (OnClickListener) C280032.f73758a).mo25656a().mo25637a();
                        this.f73755a.mo71454a();
                        return;
                    }
                    this.f73755a.mo71455a(this.f73756b);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.p$c */
    static final class C28004c<T, R> implements C7327h<T, R> {

        /* renamed from: a */
        final /* synthetic */ C27999p f73759a;

        /* renamed from: b */
        final /* synthetic */ String f73760b;

        C28004c(C27999p pVar, String str) {
            this.f73759a = pVar;
            this.f73760b = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Bitmap apply(String str) {
            C7573i.m23587b(str, "it");
            return C27999p.m91600a(C27999p.m91601a(new File(str), 1080), this.f73760b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.p$d */
    static final class C28005d<T, R> implements C7327h<T, R> {

        /* renamed from: a */
        final /* synthetic */ C27999p f73761a;

        /* renamed from: b */
        final /* synthetic */ long f73762b;

        /* renamed from: c */
        final /* synthetic */ String f73763c;

        C28005d(C27999p pVar, long j, String str) {
            this.f73761a = pVar;
            this.f73762b = j;
            this.f73763c = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            m91616a((Bitmap) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m91616a(Bitmap bitmap) {
            CharSequence charSequence;
            C7573i.m23587b(bitmap, "it");
            int a = C27999p.m91599a(this.f73762b);
            String str = this.f73763c;
            if (str != null) {
                charSequence = str.subSequence(C7634n.m23757b((CharSequence) this.f73763c, '/', C7634n.m23780f(this.f73763c), false) + 1, C7634n.m23757b((CharSequence) this.f73763c, '.', C7634n.m23780f(this.f73763c), false));
            } else {
                charSequence = null;
            }
            File createTempFile = File.createTempFile(String.valueOf(charSequence), ".jpg", C7276d.m22813c());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            bitmap.compress(CompressFormat.JPEG, a, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            C27999p pVar = this.f73761a;
            C7573i.m23582a((Object) createTempFile, "file");
            pVar.f73734a = createTempFile.getAbsolutePath();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.p$e */
    static final class C28006e<T> implements C7326g<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C27999p f73764a;

        C28006e(C27999p pVar) {
            this.f73764a = pVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C7581n nVar) {
            this.f73764a.mo71456a(new File(this.f73764a.f73734a));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.p$f */
    static final class C28007f<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C27999p f73765a;

        /* renamed from: b */
        final /* synthetic */ Context f73766b;

        C28007f(C27999p pVar, Context context) {
            this.f73765a = pVar;
            this.f73766b = context;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) {
            String.valueOf(th.getMessage());
            C10761a.m31400c(this.f73766b, (int) R.string.b22, (int) VETransitionFilterParam.TransitionDuration_DEFAULT).mo25750a();
            this.f73765a.mo71457a("image", "1");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.p$g */
    static final class C28008g extends Lambda implements C7561a {

        /* renamed from: a */
        final /* synthetic */ C27999p f73767a;

        /* renamed from: b */
        final /* synthetic */ File f73768b;

        C28008g(C27999p pVar, File file) {
            this.f73767a = pVar;
            this.f73768b = file;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void invoke() {
            C37422a.m120062a(this.f73768b, "1", "qualification_photo", "1", new C37423a(this) {

                /* renamed from: a */
                final /* synthetic */ C28008g f73769a;

                /* renamed from: com.ss.android.ugc.aweme.fe.method.p$g$1$a */
                static final class C28010a implements Runnable {

                    /* renamed from: a */
                    final /* synthetic */ C280091 f73770a;

                    /* renamed from: b */
                    final /* synthetic */ String f73771b;

                    /* renamed from: c */
                    final /* synthetic */ String f73772c;

                    C28010a(C280091 r1, String str, String str2) {
                        this.f73770a = r1;
                        this.f73771b = str;
                        this.f73772c = str2;
                    }

                    public final void run() {
                        JSONObject a = this.f73770a.f73769a.f73767a.mo71453a(1, "", "");
                        try {
                            a.put("file_id", this.f73771b);
                            a.put("url", this.f73772c);
                        } catch (JSONException unused) {
                        }
                        this.f73770a.f73769a.f73767a.mo71458a("image", a);
                    }
                }

                /* renamed from: a */
                public final void mo61512a() {
                    this.f73769a.f73767a.mo71458a("image", this.f73769a.f73767a.mo71453a(0, "", ""));
                }

                {
                    this.f73769a = r1;
                }

                /* renamed from: a */
                public final void mo61513a(String str, String str2) {
                    C7573i.m23587b(str, "filedId");
                    C7573i.m23587b(str2, "ticketUrl");
                    C47562b bVar = this.f73769a.f73767a.f73735b;
                    if (bVar == null || !bVar.isDisposed()) {
                        C47562b bVar2 = this.f73769a.f73767a.f73735b;
                        if (bVar2 != null) {
                            bVar2.dispose();
                        }
                        new Handler(Looper.getMainLooper()).post(new C28010a(this, str, str2));
                    }
                }
            });
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.p$h */
    static final class C28011h<T> implements C7326g<Long> {

        /* renamed from: a */
        final /* synthetic */ C27999p f73773a;

        C28011h(C27999p pVar) {
            this.f73773a = pVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Long l) {
            this.f73773a.mo71459b("image", "");
            C47562b bVar = this.f73773a.f73735b;
            if (bVar != null && !bVar.isDisposed()) {
                C47562b bVar2 = this.f73773a.f73735b;
                if (bVar2 != null) {
                    bVar2.dispose();
                }
            }
        }
    }

    /* renamed from: a */
    public static int m91599a(long j) {
        if (10485761 <= j && 15728640 >= j) {
            return 90;
        }
        return (15728641 <= j && 20971520 >= j) ? 85 : 100;
    }

    /* renamed from: a */
    public final boolean mo60523a(int i, int i2, Intent intent) {
        if (i != 1024) {
            return true;
        }
        if (i2 == 0 || intent == null) {
            mo71457a("image", "1");
            return true;
        }
        WeakReference<Context> weakReference = this.f73753u;
        if (weakReference == null) {
            C7573i.m23580a();
        }
        Context context = (Context) weakReference.get();
        if (context == null) {
            return true;
        }
        C7573i.m23582a((Object) context, "mContextRef!!.get() ?: return true");
        String stringExtra = intent.getStringExtra("photo_path");
        if (C6319n.m19593a(stringExtra)) {
            C9738o.m28694a(context, (int) R.drawable.wt, (int) R.string.cty);
            return true;
        }
        File file = new File(stringExtra);
        if (!file.exists()) {
            C9738o.m28694a(context, (int) R.drawable.wt, (int) R.string.cty);
            return true;
        }
        if (intent.getBooleanExtra("need_compress", false)) {
            m91602a(file.length(), stringExtra, context);
        } else {
            this.f73734a = stringExtra;
            mo71456a(file);
        }
        return true;
    }

    /* renamed from: a */
    public final void mo71458a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("type", str);
            jSONObject2.put("args", jSONObject);
            jSONObject2.put("msg", "H5_uploadBusinessLicense");
        } catch (JSONException unused) {
        }
        C11087a aVar = this.f73754v;
        if (aVar != null) {
            aVar.mo27034b("H5_uploadBusinessLicense", jSONObject2);
        }
    }

    /* renamed from: a */
    public final void mo71457a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("reason", str2);
            jSONObject.put("code", 1);
            jSONObject2.put("type", str);
            jSONObject2.put("args", jSONObject);
            jSONObject2.put("msg", "H5_uploadBusinessLicenseCancel");
        } catch (JSONException unused) {
        }
        C11087a aVar = this.f73754v;
        if (aVar != null) {
            aVar.mo27034b("H5_uploadBusinessLicenseCancel", jSONObject2);
        }
    }

    /* renamed from: a */
    public final void mo71454a() {
        mo71457a("image", "1");
        this.f73743k = true;
    }

    /* renamed from: b */
    private final void m91604b(File file) {
        C1592h.m7853a((Callable) new C28008g(this, file));
    }

    /* renamed from: b */
    private final void m91603b(Activity activity) {
        boolean z;
        Context context = activity;
        int c = C43162f.m136888c(context);
        int a = C43162f.m136885a(context);
        if (c == 0 && a == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            m91605c(activity);
        } else {
            mo71455a(activity);
        }
    }

    /* renamed from: c */
    private final void m91605c(Activity activity) {
        C22477b.m74364a(activity, new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"}, new C28001b(this, activity));
    }

    public final void handleMsg(Message message) {
        JSONObject jSONObject;
        C7573i.m23587b(message, "msg");
        C47562b bVar = this.f73735b;
        if (bVar == null || !bVar.isDisposed()) {
            C47562b bVar2 = this.f73735b;
            if (bVar2 != null) {
                bVar2.dispose();
            }
            WeakReference<Context> weakReference = this.f73753u;
            if (weakReference == null) {
                C7573i.m23580a();
            }
            Context context = (Context) weakReference.get();
            if (context != null) {
                if (message.obj instanceof ApiServerException) {
                    Object obj = message.obj;
                    if (obj != null) {
                        ((ApiServerException) obj).getErrorMsg();
                        C10761a.m31403c(context, context.getString(R.string.b2_)).mo25750a();
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException");
                    }
                } else if (message.obj instanceof AvatarUri) {
                    Object obj2 = message.obj;
                    if (obj2 != null) {
                        AvatarUri avatarUri = (AvatarUri) obj2;
                        if (!C6307b.m19566a((Collection<T>) avatarUri.urlList)) {
                            String str = (String) avatarUri.urlList.get(0);
                            C7573i.m23582a((Object) str, "url");
                            String str2 = avatarUri.uri;
                            C7573i.m23582a((Object) str2, "uri.uri");
                            jSONObject = mo71453a(1, str, str2);
                        } else {
                            jSONObject = mo71453a(0, "", "");
                        }
                        mo71458a("image", jSONObject);
                    }
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.AvatarUri");
                }
                jSONObject = mo71453a(0, "", "");
                mo71458a("image", jSONObject);
            }
        }
    }

    /* renamed from: a */
    public final void mo71455a(Activity activity) {
        int i;
        Bundle bundle = new Bundle();
        bundle.putString("enter_from", this.f73748p);
        bundle.putString("tips_text", this.f73745m);
        bundle.putString("link_url", this.f73747o);
        bundle.putString("upload_page_name", this.f73736d);
        bundle.putString("camera_page_name", this.f73737e);
        bundle.putString("title", this.f73749q);
        bundle.putString("camera_tips_vertical", this.f73751s);
        bundle.putString("camera_tips_horizontal", this.f73750r);
        String str = "show_national_emblem";
        if (this.f73752t) {
            i = 0;
        } else {
            i = 4;
        }
        bundle.putInt(str, i);
        C35077a.m113206a(activity, bundle);
    }

    /* renamed from: a */
    public final void mo71456a(File file) {
        C7321c f = C7492s.m23295b(5, TimeUnit.SECONDS).mo19294a(C47549a.m148327a()).mo19325f((C7326g<? super T>) new C28011h<Object>(this));
        C47562b bVar = this.f73735b;
        if (bVar != null) {
            bVar.mo119661a(f);
        }
        if (this.f73742j) {
            m91604b(file);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Api.f60503c);
        sb.append("?uid=");
        IAccountUserService a = C21115b.m71197a();
        C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
        sb.append(a.getCurUserId());
        String sb2 = sb.toString();
        if (!TextUtils.isEmpty(this.f73738f)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append("&source=");
            sb3.append(this.f73738f);
            sb2 = sb3.toString();
        }
        C6861a.m21332a().userService().uploadAvatar(new C6309f(this), sb2, 20971520, this.f73734a, null);
    }

    /* renamed from: a */
    public static Bitmap m91600a(Bitmap bitmap, String str) {
        Bitmap rotateBitmap = BitmapUtils.rotateBitmap(bitmap, BitmapUtils.readPictureDegree(str));
        C7573i.m23582a((Object) rotateBitmap, "BitmapUtils.rotateBitmap(bitmap, degree)");
        return rotateBitmap;
    }

    public C27999p(WeakReference<Context> weakReference, C11087a aVar) {
        this.f73753u = weakReference;
        this.f73754v = aVar;
    }

    /* renamed from: b */
    public final void mo71459b(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("reason", str2);
            jSONObject.put("code", 2);
            jSONObject2.put("type", str);
            jSONObject2.put("args", jSONObject);
            jSONObject2.put("msg", "H5_uploadFileTimeOut");
        } catch (JSONException unused) {
        }
        C11087a aVar = this.f73754v;
        if (aVar != null) {
            aVar.mo27034b("H5_uploadFileTimeOut", jSONObject2);
        }
    }

    /* renamed from: a */
    public static Bitmap m91601a(File file, int i) {
        Bitmap bitmap;
        try {
            Options options = new Options();
            options.inJustDecodeBounds = true;
            FileInputStream fileInputStream = new FileInputStream(file);
            BitmapFactory.decodeStream(fileInputStream, null, options);
            fileInputStream.close();
            if (options.outWidth > 0) {
                if (options.outHeight > 0) {
                    int i2 = 1;
                    while (options.outWidth >= 1080) {
                        options.outWidth /= 2;
                        options.outHeight /= 2;
                        i2 *= 2;
                    }
                    Options options2 = new Options();
                    options2.inSampleSize = i2;
                    options2.inPurgeable = true;
                    options2.inPreferredConfig = Config.RGB_565;
                    FileInputStream fileInputStream2 = new FileInputStream(file);
                    bitmap = BitmapFactory.decodeStream(fileInputStream2, null, options2);
                    try {
                        fileInputStream2.close();
                        if (bitmap == null) {
                            file.delete();
                        }
                    } catch (Exception unused) {
                    }
                    return bitmap;
                }
            }
            file.delete();
            return null;
        } catch (Exception unused2) {
            bitmap = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void call(com.bytedance.ies.web.p582a.C11097i r13, org.json.JSONObject r14) throws java.lang.Exception {
        /*
            r12 = this;
            java.lang.String r0 = "msg"
            kotlin.jvm.internal.C7573i.m23587b(r13, r0)
            java.lang.String r0 = "res"
            kotlin.jvm.internal.C7573i.m23587b(r14, r0)
            org.json.JSONObject r0 = r13.f30171d
            java.lang.String r1 = "type"
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r1 = ""
            r12.f73738f = r1
            java.lang.String r1 = "image"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L_0x01d5
            java.lang.ref.WeakReference<android.content.Context> r0 = r12.f73753u
            r1 = 0
            if (r0 == 0) goto L_0x002e
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            goto L_0x002f
        L_0x002e:
            r0 = r1
        L_0x002f:
            org.json.JSONObject r2 = r13.f30171d
            java.lang.String r3 = "source"
            java.lang.String r2 = r2.optString(r3)
            java.lang.String r3 = "msg.params.optString(\"source\")"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            r12.f73738f = r2
            org.json.JSONObject r2 = r13.f30171d
            java.lang.String r3 = "skip_img_base64"
            r4 = 0
            boolean r2 = r2.optBoolean(r3, r4)
            r12.f73739g = r2
            org.json.JSONObject r2 = r13.f30171d
            java.lang.String r3 = "maxSelectNum"
            r5 = 1
            int r2 = r2.optInt(r3, r5)
            r12.f73740h = r2
            org.json.JSONObject r2 = r13.f30171d
            java.lang.String r3 = "skip_img_base64"
            boolean r2 = r2.optBoolean(r3, r4)
            r12.f73741i = r2
            org.json.JSONObject r2 = r13.f30171d
            java.lang.String r3 = "use_sensitive_server"
            boolean r2 = r2.optBoolean(r3, r4)
            r12.f73742j = r2
            org.json.JSONObject r2 = r13.f30171d
            java.lang.String r3 = "image_width"
            r6 = -1
            int r2 = r2.optInt(r3, r6)
            r12.f73744l = r2
            org.json.JSONObject r2 = r13.f30171d
            java.lang.String r3 = "enter_from"
            java.lang.String r6 = ""
            java.lang.String r2 = r2.optString(r3, r6)
            java.lang.String r3 = "msg.params.optString(Mob.Label.ENTER_FROM, \"\")"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            r12.f73748p = r2
            org.json.JSONObject r2 = r13.f30171d
            java.lang.String r3 = "tips_text"
            java.lang.String r6 = ""
            java.lang.String r2 = r2.optString(r3, r6)
            java.lang.String r3 = "msg.params.optString(TIPS_TEXT, \"\")"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            r12.f73745m = r2
            org.json.JSONObject r2 = r13.f30171d
            java.lang.String r3 = "tap_text"
            if (r0 == 0) goto L_0x00a9
            android.content.res.Resources r6 = r0.getResources()
            if (r6 == 0) goto L_0x00a9
            r7 = 2131829419(0x7f1122ab, float:1.9291807E38)
            java.lang.String r6 = r6.getString(r7)
            goto L_0x00aa
        L_0x00a9:
            r6 = r1
        L_0x00aa:
            java.lang.String r2 = r2.optString(r3, r6)
            java.lang.String r3 = "msg.params.optString(TAP…g(R.string.view_example))"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            r12.f73746n = r2
            org.json.JSONObject r2 = r13.f30171d
            java.lang.String r3 = "link_url"
            java.lang.String r6 = ""
            java.lang.String r2 = r2.optString(r3, r6)
            java.lang.String r3 = "msg.params.optString(LINK_URL, \"\")"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            r12.f73747o = r2
            org.json.JSONObject r2 = r13.f30171d
            java.lang.String r3 = "camera_page_name"
            java.lang.String r6 = ""
            java.lang.String r2 = r2.optString(r3, r6)
            java.lang.String r3 = "msg.params.optString(CAMERA_PAGE_NAME, \"\")"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            r12.f73737e = r2
            org.json.JSONObject r2 = r13.f30171d
            java.lang.String r3 = "upload_page_name"
            java.lang.String r6 = ""
            java.lang.String r2 = r2.optString(r3, r6)
            java.lang.String r3 = "msg.params.optString(UPLOAD_PAGE_NAME, \"\")"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            r12.f73736d = r2
            org.json.JSONObject r2 = r13.f30171d
            java.lang.String r3 = "title"
            if (r0 == 0) goto L_0x00fc
            android.content.res.Resources r6 = r0.getResources()
            if (r6 == 0) goto L_0x00fc
            r7 = 2131829222(0x7f1121e6, float:1.9291407E38)
            java.lang.String r6 = r6.getString(r7)
            goto L_0x00fd
        L_0x00fc:
            r6 = r1
        L_0x00fd:
            java.lang.String r2 = r2.optString(r3, r6)
            java.lang.String r3 = "msg.params.optString(TIT…upload_business_license))"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            r12.f73749q = r2
            org.json.JSONObject r2 = r13.f30171d
            java.lang.String r3 = "camera_tips_horizontal"
            java.lang.String r6 = "%s\n%s"
            r7 = 2
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r9 = 2131821356(0x7f11032c, float:1.9275453E38)
            if (r0 == 0) goto L_0x0121
            android.content.res.Resources r10 = r0.getResources()
            if (r10 == 0) goto L_0x0121
            java.lang.String r10 = r10.getString(r9)
            goto L_0x0122
        L_0x0121:
            r10 = r1
        L_0x0122:
            r8[r4] = r10
            if (r0 == 0) goto L_0x0134
            android.content.res.Resources r10 = r0.getResources()
            if (r10 == 0) goto L_0x0134
            r11 = 2131821357(0x7f11032d, float:1.9275455E38)
            java.lang.String r10 = r10.getString(r11)
            goto L_0x0135
        L_0x0134:
            r10 = r1
        L_0x0135:
            r8[r5] = r10
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r7)
            java.lang.String r6 = com.C1642a.m8034a(r6, r8)
            java.lang.String r8 = "java.lang.String.format(format, *args)"
            kotlin.jvm.internal.C7573i.m23582a(r6, r8)
            java.lang.String r2 = r2.optString(r3, r6)
            java.lang.String r3 = "msg.params.optString(CAM…_license_camera_hint_2)))"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            r12.f73750r = r2
            org.json.JSONObject r2 = r13.f30171d
            java.lang.String r3 = "camera_tips_vertical"
            java.lang.String r6 = "%s\n%s"
            java.lang.Object[] r8 = new java.lang.Object[r7]
            if (r0 == 0) goto L_0x0164
            android.content.res.Resources r10 = r0.getResources()
            if (r10 == 0) goto L_0x0164
            java.lang.String r9 = r10.getString(r9)
            goto L_0x0165
        L_0x0164:
            r9 = r1
        L_0x0165:
            r8[r4] = r9
            if (r0 == 0) goto L_0x0176
            android.content.res.Resources r9 = r0.getResources()
            if (r9 == 0) goto L_0x0176
            r1 = 2131821358(0x7f11032e, float:1.9275457E38)
            java.lang.String r1 = r9.getString(r1)
        L_0x0176:
            r8[r5] = r1
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r8, r7)
            java.lang.String r1 = com.C1642a.m8034a(r6, r1)
            java.lang.String r6 = "java.lang.String.format(format, *args)"
            kotlin.jvm.internal.C7573i.m23582a(r1, r6)
            java.lang.String r1 = r2.optString(r3, r1)
            java.lang.String r2 = "msg.params.optString(CAM…_license_camera_hint_3)))"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            r12.f73751s = r1
            org.json.JSONObject r13 = r13.f30171d
            java.lang.String r1 = "show_national_emblem"
            boolean r13 = r13.optBoolean(r1, r5)
            r12.f73752t = r13
            boolean r13 = r0 instanceof com.p280ss.android.ugc.aweme.base.activity.C23257d
            if (r13 == 0) goto L_0x01a8
            r13 = r0
            com.ss.android.ugc.aweme.base.activity.d r13 = (com.p280ss.android.ugc.aweme.base.activity.C23257d) r13
            r1 = r12
            com.ss.android.ugc.aweme.base.activity.b r1 = (com.p280ss.android.ugc.aweme.base.activity.C23255b) r1
            r13.mo60524a(r1)
            goto L_0x01bf
        L_0x01a8:
            boolean r13 = r0 instanceof android.support.p029v7.widget.C1362as
            if (r13 == 0) goto L_0x01d4
            android.support.v7.widget.as r0 = (android.support.p029v7.widget.C1362as) r0
            android.content.Context r0 = r0.getBaseContext()
            boolean r13 = r0 instanceof com.p280ss.android.ugc.aweme.base.activity.C23257d
            if (r13 == 0) goto L_0x01d3
            r13 = r0
            com.ss.android.ugc.aweme.base.activity.d r13 = (com.p280ss.android.ugc.aweme.base.activity.C23257d) r13
            r1 = r12
            com.ss.android.ugc.aweme.base.activity.b r1 = (com.p280ss.android.ugc.aweme.base.activity.C23255b) r1
            r13.mo60524a(r1)
        L_0x01bf:
            java.lang.String r13 = "code"
            r14.put(r13, r5)
            r12.f73743k = r4
            io.reactivex.b.b r13 = new io.reactivex.b.b
            r13.<init>()
            r12.f73735b = r13
            android.app.Activity r0 = (android.app.Activity) r0
            r12.m91603b(r0)
            goto L_0x01d5
        L_0x01d3:
            return
        L_0x01d4:
            return
        L_0x01d5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p1216fe.method.C27999p.call(com.bytedance.ies.web.a.i, org.json.JSONObject):void");
    }

    /* renamed from: a */
    private final void m91602a(long j, String str, Context context) {
        C7321c a = C7492s.m23301b(str).mo19304b(C7333a.m23044b()).mo19317d((C7327h<? super T, ? extends R>) new C28004c<Object,Object>(this, str)).mo19317d((C7327h<? super T, ? extends R>) new C28005d<Object,Object>(this, j, str)).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C28006e<Object>(this), (C7326g<? super Throwable>) new C28007f<Object>(this, context));
        C47562b bVar = this.f73735b;
        if (bVar != null) {
            bVar.mo119661a(a);
        }
    }

    /* renamed from: a */
    public final JSONObject mo71453a(int i, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        String str3 = "";
        try {
            if (!this.f73739g && C42973bg.m136427a(this.f73734a)) {
                IPhotoService photoService = ((IAVService) ServiceManager.get().getService(IAVService.class)).photoService();
                String str4 = this.f73734a;
                if (str4 == null) {
                    C7573i.m23580a();
                }
                String b = C42973bg.m136430b(photoService.compress(str4, new C34729c()).mPhotoLocalPath);
                C7573i.m23582a((Object) b, "FileUtils.encodeFileToBa…oContext.mPhotoLocalPath)");
                str3 = b;
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.f73739g = false;
            this.f73734a = "";
            throw th;
        }
        this.f73739g = false;
        this.f73734a = "";
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
