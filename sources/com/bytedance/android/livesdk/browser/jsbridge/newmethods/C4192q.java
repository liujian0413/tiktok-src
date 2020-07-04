package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Environment;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.android.live.C2317a;
import com.bytedance.android.live.base.model.user.C2377i;
import com.bytedance.android.live.core.network.p150b.C3176a;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3364ai;
import com.bytedance.android.live.network.api.INetworkService;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.TTLiveFileProvider;
import com.bytedance.android.livesdk.browser.p195e.C3992d;
import com.bytedance.android.livesdk.log.C8444d;
import com.bytedance.android.livesdk.p410o.C8735f;
import com.bytedance.android.livesdk.p410o.p412b.C8721d;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.utils.C9020a;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.android.livesdkapi.p457i.C9477e;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.bytedance.ies.web.jsbridge2.C11152c;
import com.bytedance.ies.web.jsbridge2.CallContext;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedFile;
import com.google.gson.p276a.C6593c;
import com.google.gson.p277b.C6597a;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetProxyTimeoutExperiment;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p346io.reactivex.C47557ad;
import p346io.reactivex.C47870u;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7495v;
import p346io.reactivex.C7496w;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7323a;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.q */
public final class C4192q extends C11152c<JSONObject, C4203b> {

    /* renamed from: a */
    public C7321c f12261a;

    /* renamed from: b */
    public Fragment f12262b;

    /* renamed from: c */
    public int f12263c;

    /* renamed from: d */
    public String f12264d;

    /* renamed from: e */
    public JSONObject f12265e;

    /* renamed from: f */
    private final String f12266f;

    /* renamed from: g */
    private ProgressDialog f12267g;

    /* renamed from: h */
    private CallContext f12268h;

    /* renamed from: i */
    private String f12269i;

    /* renamed from: j */
    private String f12270j = "upload_photo";

    /* renamed from: k */
    private int f12271k;

    /* renamed from: l */
    private int f12272l;

    /* renamed from: m */
    private int f12273m;

    /* renamed from: n */
    private int f12274n;

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.q$a */
    static final class C4202a {
        @C6593c(mo15949a = "uri")

        /* renamed from: a */
        String f12293a;
        @C6593c(mo15949a = "local_url")

        /* renamed from: b */
        String f12294b;
        @C6593c(mo15949a = "local_img")

        /* renamed from: c */
        String f12295c;

        C4202a() {
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.q$b */
    static final class C4203b {
        @C6593c(mo15949a = "code")

        /* renamed from: a */
        int f12296a;
        @C6593c(mo15949a = "status")

        /* renamed from: b */
        int f12297b;
        @C6593c(mo15949a = "status_msg")

        /* renamed from: c */
        String f12298c;
        @C6593c(mo15949a = "data")

        /* renamed from: d */
        C4202a f12299d;

        private C4203b(int i, int i2, String str, C4202a aVar) {
            this.f12296a = i;
            this.f12297b = i2;
            this.f12298c = str;
            this.f12299d = aVar;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.q$c */
    static class C4204c {

        /* renamed from: a */
        public C3479d<C2377i> f12300a;

        /* renamed from: b */
        public String f12301b;

        public C4204c(String str, C3479d<C2377i> dVar) {
            this.f12300a = dVar;
            this.f12301b = str;
        }
    }

    /* renamed from: a */
    public final void mo11732a(int i, int i2, Intent intent) {
        String str;
        int i3 = i;
        int i4 = i2;
        if (9001 == i3 || 9002 == i3) {
            if (-1 != i4) {
                C4203b bVar = new C4203b(2, C3358ac.m12515a((int) R.string.ej0), new C4202a());
                finishWithResult(bVar);
            } else if (intent == null || intent.getData() == null) {
                mo11731a();
            } else {
                FragmentActivity activity = this.f12262b.getActivity();
                if (activity == null) {
                    mo11731a();
                    return;
                }
                Uri data = intent.getData();
                if (TextUtils.equals(C38347c.f99553h, data.getScheme())) {
                    str = C3364ai.m12544a((Context) this.f12262b.getActivity(), data);
                } else {
                    str = intent.getData().getPath();
                }
                if (TextUtils.isEmpty(str)) {
                    mo11731a();
                    return;
                }
                final File file = new File(str);
                if (!file.exists()) {
                    mo11731a();
                    return;
                }
                this.f12267g = ProgressDialog.show(activity, C3358ac.m12515a((int) R.string.f29), C3358ac.m12515a((int) R.string.f28), true, false);
                if (!file.exists()) {
                    mo11731a();
                    return;
                }
                C8735f.m26105a(this.f12262b.getActivity()).mo21743a(new C8721d() {
                    /* renamed from: b */
                    public final void mo9568b(String... strArr) {
                    }

                    /* renamed from: a */
                    public final void mo9567a(String... strArr) {
                        C4192q.this.mo11735a(file);
                    }
                }, "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE");
            }
        } else if (i3 == 40003) {
            if (-1 != i4) {
                C4203b bVar2 = new C4203b(2, C3358ac.m12515a((int) R.string.ej0), new C4202a());
                finishWithResult(bVar2);
            } else if (intent == null || intent.getData() == null) {
                mo11737b();
            } else {
                FragmentActivity activity2 = this.f12262b.getActivity();
                if (activity2 == null) {
                    mo11737b();
                    return;
                }
                Uri data2 = intent.getData();
                String a = C9020a.m26950a((Context) activity2, data2);
                if (C6319n.m19593a(a)) {
                    C9738o.m28694a((Context) activity2, (int) R.drawable.bzp, (int) R.string.f_b);
                    mo11737b();
                } else if (!new File(a).exists()) {
                    C9738o.m28694a((Context) activity2, (int) R.drawable.bzp, (int) R.string.f_b);
                    mo11737b();
                } else {
                    m14292a(data2, false);
                }
            }
        } else if (i3 != 40004) {
            if (i3 == 40002) {
                if (-1 != i4) {
                    C4203b bVar3 = new C4203b(2, C3358ac.m12515a((int) R.string.ej0), new C4202a());
                    finishWithResult(bVar3);
                    return;
                }
                FragmentActivity activity3 = this.f12262b.getActivity();
                if (activity3 == null) {
                    mo11737b();
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(this.f12266f);
                sb.append("/");
                sb.append(m14301f());
                File file2 = new File(sb.toString());
                if (!file2.exists()) {
                    C9738o.m28694a((Context) activity3, (int) R.drawable.bzp, (int) R.string.f_b);
                    mo11737b();
                } else if (!m14295a(file2.getAbsolutePath(), this.f12272l, this.f12271k)) {
                    C9020a.m26953a((Activity) activity3, this.f12262b, 40003);
                } else {
                    m14293a(file2.getAbsolutePath());
                }
            }
        } else if (-1 != i4) {
            C4203b bVar4 = new C4203b(2, C3358ac.m12515a((int) R.string.ej0), new C4202a());
            finishWithResult(bVar4);
        } else {
            try {
                m14292a(m14299d(), true);
            } catch (Exception e) {
                C8444d.m25673b();
                C8444d.m11969a(6, e.getStackTrace());
            }
        }
    }

    /* renamed from: a */
    public final void mo11735a(final File file) {
        final String absolutePath = file.getAbsolutePath();
        C7492s.m23282a((C7495v<T>) new C4205r<T>(this, absolutePath)).mo19290a((C7327h<? super T, ? extends C7496w<? extends R>>) new C7327h<String, C7496w<C4204c>>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public C7496w<C4204c> apply(String str) throws Exception {
                return C7492s.m23282a((C7495v<T>) new C4207t<T>(this, file, str));
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ void mo11738a(File file, String str, C47870u uVar) throws Exception {
                uVar.mo19239a((Object) new C4204c(str, C4192q.this.mo11730a(C4192q.this.f12264d, file, C4192q.this.f12265e)));
            }
        }).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19281a((C7326g<? super T>) new C7326g<C4204c>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void accept(C4204c cVar) throws Exception {
                C4192q.this.mo11734a((C2377i) cVar.f12300a.data, absolutePath, cVar.f12301b);
            }
        }, (C7326g<? super Throwable>) new C7326g<Throwable>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                if (C4192q.this.f12262b != null) {
                    Context context = C4192q.this.f12262b.getContext();
                    if (context != null) {
                        C3176a.m12015a(context, th);
                    }
                }
                C4192q.this.mo11731a();
            }
        }, (C7323a) new C7323a() {
            /* renamed from: a */
            public final void mo8975a() throws Exception {
            }
        });
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11736a(String str, C47870u uVar) throws Exception {
        String str2;
        String str3;
        try {
            str3 = "";
            if (BitmapUtils.saveBitmapToSD(m14297c(str), this.f12266f, "firstFrame.temp")) {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f12266f);
                    sb.append(File.separator);
                    sb.append("firstFrame.temp");
                    str2 = sb.toString();
                } catch (Exception unused) {
                }
                uVar.mo19239a((Object) str2);
            }
        } catch (Exception unused2) {
            str3 = null;
        }
        str2 = str3;
        uVar.mo19239a((Object) str2);
    }

    /* renamed from: a */
    public final void mo11734a(C2377i iVar, String str, String str2) {
        m14298c();
        try {
            C4202a aVar = new C4202a();
            aVar.f12293a = iVar.f7827a;
            C9178j.m27302j().mo22375d().mo22384d();
            aVar.f12294b = C3992d.m13988a(str);
            C9178j.m27302j().mo22375d().mo22384d();
            aVar.f12295c = C3992d.m13988a(str2);
            C4203b bVar = new C4203b(0, C3358ac.m12515a((int) R.string.ej3), aVar);
            this.f12268h.mo27138a("H5_uploadVideoStatus", bVar);
            finishWithResult(bVar);
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    private Uri m14300e() {
        return m14296b(m14301f());
    }

    public final void onTerminate() {
        if (this.f12261a != null) {
            this.f12261a.dispose();
        }
        this.f12262b = null;
        this.f12268h = null;
    }

    /* renamed from: c */
    private void m14298c() {
        if (this.f12267g != null && this.f12267g.isShowing()) {
            this.f12267g.dismiss();
        }
    }

    /* renamed from: f */
    private String m14301f() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f12270j);
        sb.append("_");
        sb.append(this.f12269i);
        sb.append("crop");
        return sb.toString();
    }

    /* renamed from: g */
    private String m14302g() {
        StringBuilder sb = new StringBuilder();
        sb.append(m14303h());
        sb.append(".jpeg");
        return sb.toString();
    }

    /* renamed from: h */
    private String m14303h() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f12270j);
        sb.append("_");
        sb.append(this.f12269i);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo11731a() {
        m14298c();
        C4203b bVar = new C4203b(1, C3358ac.m12515a((int) R.string.ej1), new C4202a());
        finishWithResult(bVar);
    }

    /* renamed from: b */
    public final void mo11737b() {
        m14298c();
        C4203b bVar = new C4203b(1, C3358ac.m12515a((int) R.string.ej1), new C4202a());
        finishWithResult(bVar);
    }

    /* renamed from: d */
    private Uri m14299d() {
        String g = m14302g();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f12266f);
        sb.append("/");
        sb.append(g);
        File file = new File(sb.toString());
        if (!file.exists()) {
            try {
                File file2 = new File(this.f12266f);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                file.createNewFile();
            } catch (IOException e) {
                C8444d.m25673b();
                C8444d.m11969a(6, e.getStackTrace());
            }
        }
        FragmentActivity activity = this.f12262b.getActivity();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f12262b.getActivity().getPackageName());
        sb2.append(TTLiveFileProvider.NAME);
        return TTLiveFileProvider.getUri(activity, sb2.toString(), file);
    }

    /* renamed from: c */
    private static Bitmap m14297c(String str) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(str);
        return mediaMetadataRetriever.getFrameAtTime();
    }

    public C4192q(Fragment fragment) {
        this.f12262b = fragment;
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory().getPath());
        sb.append("/DCIM/Camera");
        this.f12266f = sb.toString();
    }

    /* renamed from: b */
    private Uri m14296b(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f12266f);
        sb.append("/");
        sb.append(str);
        File file = new File(sb.toString());
        if (!file.exists()) {
            try {
                File file2 = new File(this.f12266f);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                file.createNewFile();
            } catch (IOException unused) {
                return null;
            }
        }
        return Uri.fromFile(file);
    }

    /* renamed from: a */
    private void m14293a(final String str) {
        final File file = new File(str);
        if (!file.exists()) {
            mo11737b();
            return;
        }
        if (this.f12267g == null) {
            this.f12267g = new ProgressDialog(this.f12262b.getActivity());
            this.f12267g.setMessage(C3358ac.m12515a((int) R.string.cwj));
            this.f12267g.setCancelable(false);
        }
        if (!this.f12267g.isShowing()) {
            this.f12267g.show();
        }
        C7319aa.m22930a(this.f12264d).mo19135b(C7333a.m23044b()).mo19134b((C7327h<? super T, ? extends R>) new C4206s<Object,Object>(this, file)).mo19127a(C47549a.m148327a()).mo19137b((C47557ad<? super T>) new C47557ad<C3479d<C2377i>>() {
            public final void onSubscribe(C7321c cVar) {
                C4192q.this.f12261a = cVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onSuccess(C3479d<C2377i> dVar) {
                ((C2377i) dVar.data).f7828b = str;
                C4192q.this.mo11733a((C2377i) dVar.data, str);
            }

            public final void onError(Throwable th) {
                Context context = C4192q.this.f12262b.getContext();
                if (context != null) {
                    C3176a.m12015a(context, th);
                }
                if (file.length() > 0 || C4192q.this.f12263c >= 10) {
                    C9049ap.m27022a((int) R.string.f_c);
                    C4192q.this.mo11737b();
                }
            }
        });
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C3479d mo11729a(File file, String str) throws Exception {
        return mo11730a(str, file, this.f12265e);
    }

    /* renamed from: a */
    public final void mo11733a(C2377i iVar, String str) {
        m14298c();
        C4202a aVar = new C4202a();
        aVar.f12293a = iVar.f7827a;
        C9178j.m27302j().mo22375d().mo22384d();
        aVar.f12295c = C3992d.m13988a(str);
        C4203b bVar = new C4203b(0, C3358ac.m12515a((int) R.string.ej3), aVar);
        finishWithResult(bVar);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:2|(6:4|5|(1:11)|12|13|14)|15|16|(1:18)|19|20|(1:22)|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0092, code lost:
        com.bytedance.common.utility.C9738o.m28693a(r5.f12262b.getContext(), (int) com.zhiliaoapp.musically.df_live_zego_link.R.string.f_e);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009e, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0085 */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0080 A[Catch:{ Exception -> 0x0085 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0089 A[Catch:{ Exception -> 0x0092 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m14292a(android.net.Uri r6, boolean r7) {
        /*
            r5 = this;
            if (r6 != 0) goto L_0x0003
            return
        L_0x0003:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "com.android.camera.action.CROP"
            r0.<init>(r1)
            r1 = 1
            if (r7 == 0) goto L_0x000e
            goto L_0x0039
        L_0x000e:
            java.lang.String r7 = r6.getLastPathSegment()     // Catch:{ Exception -> 0x0085 }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0085 }
            r3 = 19
            if (r2 < r3) goto L_0x002e
            boolean r2 = com.bytedance.common.utility.C6319n.m19593a(r7)     // Catch:{ Exception -> 0x0085 }
            if (r2 != 0) goto L_0x002e
            java.lang.String r2 = ":"
            boolean r2 = r7.contains(r2)     // Catch:{ Exception -> 0x0085 }
            if (r2 == 0) goto L_0x002e
            java.lang.String r2 = ":"
            java.lang.String[] r7 = r7.split(r2)     // Catch:{ Exception -> 0x0085 }
            r7 = r7[r1]     // Catch:{ Exception -> 0x0085 }
        L_0x002e:
            android.net.Uri r2 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ NumberFormatException -> 0x0039 }
            long r3 = java.lang.Long.parseLong(r7)     // Catch:{ NumberFormatException -> 0x0039 }
            android.net.Uri r7 = android.content.ContentUris.withAppendedId(r2, r3)     // Catch:{ NumberFormatException -> 0x0039 }
            r6 = r7
        L_0x0039:
            r0.addFlags(r1)     // Catch:{ Exception -> 0x0085 }
            r7 = 2
            r0.addFlags(r7)     // Catch:{ Exception -> 0x0085 }
            java.lang.String r7 = "image/*"
            r0.setDataAndType(r6, r7)     // Catch:{ Exception -> 0x0085 }
            java.lang.String r6 = "crop"
            java.lang.String r7 = "true"
            r0.putExtra(r6, r7)     // Catch:{ Exception -> 0x0085 }
            java.lang.String r6 = "scale"
            r0.putExtra(r6, r1)     // Catch:{ Exception -> 0x0085 }
            java.lang.String r6 = "aspectX"
            int r7 = r5.f12273m     // Catch:{ Exception -> 0x0085 }
            r0.putExtra(r6, r7)     // Catch:{ Exception -> 0x0085 }
            java.lang.String r6 = "aspectY"
            int r7 = r5.f12274n     // Catch:{ Exception -> 0x0085 }
            r0.putExtra(r6, r7)     // Catch:{ Exception -> 0x0085 }
            java.lang.String r6 = "return-data"
            r7 = 0
            r0.putExtra(r6, r7)     // Catch:{ Exception -> 0x0085 }
            java.lang.String r6 = "outputFormat"
            android.graphics.Bitmap$CompressFormat r7 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x0085 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0085 }
            r0.putExtra(r6, r7)     // Catch:{ Exception -> 0x0085 }
            java.lang.String r6 = "noFaceDetection"
            r0.putExtra(r6, r1)     // Catch:{ Exception -> 0x0085 }
            java.lang.String r6 = "scaleUpIfNeeded"
            r0.putExtra(r6, r1)     // Catch:{ Exception -> 0x0085 }
            android.net.Uri r6 = r5.m14300e()     // Catch:{ Exception -> 0x0085 }
            if (r6 == 0) goto L_0x0085
            java.lang.String r7 = "output"
            r0.putExtra(r7, r6)     // Catch:{ Exception -> 0x0085 }
        L_0x0085:
            android.support.v4.app.Fragment r6 = r5.f12262b     // Catch:{ Exception -> 0x0092 }
            if (r6 == 0) goto L_0x0091
            android.support.v4.app.Fragment r6 = r5.f12262b     // Catch:{ Exception -> 0x0092 }
            r7 = 40002(0x9c42, float:5.6055E-41)
            r6.startActivityForResult(r0, r7)     // Catch:{ Exception -> 0x0092 }
        L_0x0091:
            return
        L_0x0092:
            android.support.v4.app.Fragment r6 = r5.f12262b
            android.content.Context r6 = r6.getContext()
            r7 = 2131828812(0x7f11204c, float:1.9290575E38)
            com.bytedance.common.utility.C9738o.m28693a(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4192q.m14292a(android.net.Uri, boolean):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void invoke(JSONObject jSONObject, final CallContext callContext) throws Exception {
        this.f12268h = callContext;
        String optString = jSONObject.optString("type");
        final JSONObject jSONObject2 = jSONObject.getJSONObject("args");
        if (jSONObject2 == null) {
            C4203b bVar = new C4203b(4, C3358ac.m12515a((int) R.string.f9g), new C4202a());
            finishWithResult(bVar);
            return;
        }
        int optInt = jSONObject2.optInt("action_type", 0);
        this.f12264d = jSONObject2.optString("url");
        this.f12265e = new JSONObject();
        int i = -1;
        if (jSONObject2.getJSONObject("params") != null) {
            this.f12265e = jSONObject2.getJSONObject("params");
            i = this.f12265e.optInt("encrypt", -1);
        }
        if (TextUtils.isEmpty(this.f12264d) || (!this.f12264d.startsWith(WebKitApi.SCHEME_HTTPS) && i == 1)) {
            C4203b bVar2 = new C4203b(5, C3358ac.m12515a((int) R.string.ej2), new C4202a());
            finishWithResult(bVar2);
            return;
        }
        if (!TextUtils.equals("video", optString) || !(callContext.f30265a instanceof Activity)) {
            if (TextUtils.equals("picture", optString)) {
                this.f12269i = String.valueOf(System.currentTimeMillis());
                this.f12272l = jSONObject2.optInt("min_width");
                this.f12271k = jSONObject2.optInt("min_height");
                this.f12273m = jSONObject2.optInt("aspect_x", 1);
                this.f12274n = jSONObject2.optInt("aspect_y", 1);
                FragmentActivity activity = this.f12262b.getActivity();
                if (optInt == 0) {
                    C9020a.m26954a(activity, this.f12262b, 40004, this.f12266f, m14302g());
                } else if (optInt == 1) {
                    C9020a.m26953a((Activity) activity, this.f12262b, 40003);
                }
            }
        } else if (optInt == 0) {
            C8735f.m26105a((Activity) callContext.f30265a).mo21743a(new C8721d() {
                /* renamed from: b */
                public final void mo9568b(String... strArr) {
                    C9738o.m28694a(callContext.f30265a, (int) R.drawable.bzp, (int) R.string.efv);
                    C4192q.this.finishWithFailure();
                }

                /* renamed from: a */
                public final void mo9567a(String... strArr) {
                    int optInt = jSONObject2.optInt("duration_limit", VideoCacheTTnetProxyTimeoutExperiment.DEFAULT) / 1000;
                    Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
                    intent.putExtra("android.intent.extra.durationLimit", optInt);
                    intent.putExtra("android.intent.extra.videoQuality", 1);
                    if (C4192q.this.f12262b.getActivity() == null) {
                        C4192q.this.finishWithFailure();
                    } else {
                        C4192q.this.f12262b.startActivityForResult(intent, 9001);
                    }
                }
            }, "android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE");
        } else if (optInt == 1) {
            C8735f.m26105a((Activity) callContext.f30265a).mo21743a(new C8721d() {
                /* renamed from: b */
                public final void mo9568b(String... strArr) {
                    C9738o.m28694a(callContext.f30265a, (int) R.drawable.bzp, (int) R.string.efv);
                    C4192q.this.finishWithFailure();
                }

                /* renamed from: a */
                public final void mo9567a(String... strArr) {
                    Intent intent = new Intent("android.intent.action.GET_CONTENT");
                    if (jSONObject2.optInt("duration_limit", -1) != -1) {
                        C4203b bVar = new C4203b(1, C3358ac.m12515a((int) R.string.f64), new C4202a());
                        C4192q.this.finishWithResult(bVar);
                        return;
                    }
                    intent.setType("video/*");
                    if (C4192q.this.f12262b.getActivity() == null) {
                        C4192q.this.finishWithFailure();
                    } else {
                        C4192q.this.f12262b.startActivityForResult(intent, 9002);
                    }
                }
            }, "android.permission.READ_EXTERNAL_STORAGE");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0045 A[SYNTHETIC, Splitter:B:31:0x0045] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x004b A[SYNTHETIC, Splitter:B:37:0x004b] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m14295a(java.lang.String r4, int r5, int r6) {
        /*
            r0 = 1
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0049, all -> 0x0041 }
            r2.<init>(r4)     // Catch:{ FileNotFoundException -> 0x0049, all -> 0x0041 }
            android.graphics.BitmapFactory$Options r4 = new android.graphics.BitmapFactory$Options     // Catch:{ FileNotFoundException -> 0x003f, all -> 0x003d }
            r4.<init>()     // Catch:{ FileNotFoundException -> 0x003f, all -> 0x003d }
            r4.inJustDecodeBounds = r0     // Catch:{ FileNotFoundException -> 0x003f, all -> 0x003d }
            android.graphics.BitmapFactory.decodeStream(r2, r1, r4)     // Catch:{ FileNotFoundException -> 0x003f, all -> 0x003d }
            int r1 = r4.outWidth     // Catch:{ FileNotFoundException -> 0x003f, all -> 0x003d }
            r3 = 0
            if (r5 > r1) goto L_0x0033
            int r5 = r4.outHeight     // Catch:{ FileNotFoundException -> 0x003f, all -> 0x003d }
            if (r6 <= r5) goto L_0x001b
            goto L_0x0033
        L_0x001b:
            int r5 = r4.outWidth     // Catch:{ FileNotFoundException -> 0x003f, all -> 0x003d }
            int r4 = r4.outHeight     // Catch:{ FileNotFoundException -> 0x003f, all -> 0x003d }
            int r5 = r5 * r4
            r4 = 20971520(0x1400000, float:3.526483E-38)
            if (r5 <= r4) goto L_0x002f
            r4 = 2131828813(0x7f11204d, float:1.9290577E38)
            com.bytedance.android.livesdk.utils.C9049ap.m27022a(r4)     // Catch:{ FileNotFoundException -> 0x003f, all -> 0x003d }
            r2.close()     // Catch:{ IOException -> 0x002e }
        L_0x002e:
            return r3
        L_0x002f:
            r2.close()     // Catch:{ IOException -> 0x004e }
            goto L_0x004e
        L_0x0033:
            r4 = 2131828814(0x7f11204e, float:1.929058E38)
            com.bytedance.android.livesdk.utils.C9049ap.m27022a(r4)     // Catch:{ FileNotFoundException -> 0x003f, all -> 0x003d }
            r2.close()     // Catch:{ IOException -> 0x003c }
        L_0x003c:
            return r3
        L_0x003d:
            r4 = move-exception
            goto L_0x0043
        L_0x003f:
            r1 = r2
            goto L_0x0049
        L_0x0041:
            r4 = move-exception
            r2 = r1
        L_0x0043:
            if (r2 == 0) goto L_0x0048
            r2.close()     // Catch:{ IOException -> 0x0048 }
        L_0x0048:
            throw r4
        L_0x0049:
            if (r1 == 0) goto L_0x004e
            r1.close()     // Catch:{ IOException -> 0x004e }
        L_0x004e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4192q.m14295a(java.lang.String, int, int):boolean");
    }

    /* renamed from: a */
    public final C3479d<C2377i> mo11730a(String str, File file, JSONObject jSONObject) throws Exception {
        IHostNetwork iHostNetwork = (IHostNetwork) C3596c.m13172a(INetworkService.class);
        MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
        multipartTypedOutput.addPart("data", new TypedFile("multipart/form-data", file));
        Builder buildUpon = Uri.parse(str).buildUpon();
        if (jSONObject != null) {
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str2 = (String) keys.next();
                buildUpon.appendQueryParameter(str2, String.valueOf(jSONObject.opt(str2)));
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            multipartTypedOutput.writeTo(byteArrayOutputStream);
        } catch (IOException unused) {
        }
        String str3 = new String(((C9477e) iHostNetwork.uploadFile(-1, buildUpon.build().toString(), new ArrayList(1), multipartTypedOutput.mimeType(), byteArrayOutputStream.toByteArray(), multipartTypedOutput.length(), multipartTypedOutput.md5Stub()).mo23512a()).f25947e);
        C3479d<C2377i> dVar = (C3479d) C2317a.m9932a().mo15975a(str3, new C6597a<C3479d<C2377i>>() {
        }.type);
        try {
            if (dVar.statusCode != 0) {
                dVar.error = (RequestError) C2317a.m9932a().mo15974a(new JSONObject(str3).getJSONObject("data").toString(), RequestError.class);
            }
        } catch (JSONException unused2) {
        }
        return dVar;
    }
}
