package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import com.bytedance.android.live.base.model.user.C2377i;
import com.bytedance.android.live.core.network.p150b.C3176a;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.TTLiveFileProvider;
import com.bytedance.android.livesdk.browser.p195e.C3992d;
import com.bytedance.android.livesdk.chatroom.api.UploadApi;
import com.bytedance.android.livesdk.log.C8444d;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.utils.C9020a;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdk.utils.p426b.C9059d;
import com.bytedance.android.livesdk.utils.p426b.C9060e;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.web.jsbridge2.C11152c;
import com.bytedance.ies.web.jsbridge2.CallContext;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedFile;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.p361a.C7704b;
import p346io.reactivex.C47555ab;
import p346io.reactivex.C47557ad;
import p346io.reactivex.C47559ag;
import p346io.reactivex.C7329e;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7327h;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.bc */
public final class C4139bc extends C11152c<C4141a, C4142b> {

    /* renamed from: a */
    public Fragment f12148a;

    /* renamed from: b */
    public C7321c f12149b;

    /* renamed from: c */
    public int f12150c;

    /* renamed from: d */
    private String f12151d;

    /* renamed from: e */
    private String f12152e = "upload_photo";

    /* renamed from: f */
    private String f12153f;

    /* renamed from: g */
    private ProgressDialog f12154g;

    /* renamed from: h */
    private C4141a f12155h;

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.bc$a */
    static final class C4141a {
        @C6593c(mo15949a = "aspect_x")

        /* renamed from: a */
        int f12159a;
        @C6593c(mo15949a = "aspect_y")

        /* renamed from: b */
        int f12160b;
        @C6593c(mo15949a = "min_width")

        /* renamed from: c */
        int f12161c;
        @C6593c(mo15949a = "min_height")

        /* renamed from: d */
        int f12162d;
        @C6593c(mo15949a = "max_size")

        /* renamed from: e */
        int f12163e;
        @C6593c(mo15949a = "action_type")

        /* renamed from: f */
        int f12164f;

        C4141a() {
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.bc$b */
    static final class C4142b {
        @C6593c(mo15949a = "uri")

        /* renamed from: a */
        String f12165a;
        @C6593c(mo15949a = "url")

        /* renamed from: b */
        String f12166b;
        @C6593c(mo15949a = "image_data")

        /* renamed from: c */
        String f12167c;

        private C4142b(String str, String str2) {
            this.f12165a = str;
            this.f12166b = str2;
        }
    }

    /* renamed from: a */
    public final void mo11702a() {
        m14232b();
        finishWithFailure();
    }

    /* renamed from: d */
    private Uri m14234d() {
        return m14231b(m14235e());
    }

    public final void onTerminate() {
        if (this.f12149b != null) {
            this.f12149b.dispose();
        }
        this.f12148a = null;
        m14232b();
    }

    /* renamed from: b */
    private void m14232b() {
        if (this.f12154g != null && this.f12154g.isShowing()) {
            this.f12154g.dismiss();
        }
    }

    /* renamed from: e */
    private String m14235e() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f12152e);
        sb.append("_");
        sb.append(this.f12153f);
        sb.append("crop");
        return sb.toString();
    }

    /* renamed from: f */
    private String m14236f() {
        StringBuilder sb = new StringBuilder();
        sb.append(m14237g());
        sb.append(".temp");
        return sb.toString();
    }

    /* renamed from: g */
    private String m14237g() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f12152e);
        sb.append("_");
        sb.append(this.f12153f);
        return sb.toString();
    }

    /* renamed from: c */
    private Uri m14233c() {
        String f = m14236f();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f12151d);
        sb.append("/");
        sb.append(f);
        File file = new File(sb.toString());
        if (!file.exists()) {
            try {
                File file2 = new File(this.f12151d);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                file.createNewFile();
            } catch (IOException e) {
                C8444d.m25673b();
                C8444d.m11969a(6, e.getStackTrace());
            }
        }
        FragmentActivity activity = this.f12148a.getActivity();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f12148a.getActivity().getPackageName());
        sb2.append(TTLiveFileProvider.NAME);
        return TTLiveFileProvider.getUri(activity, sb2.toString(), file);
    }

    public C4139bc(Fragment fragment) {
        this.f12148a = fragment;
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory().getPath());
        sb.append("/DCIM/Camera");
        this.f12151d = sb.toString();
    }

    /* renamed from: b */
    private Uri m14231b(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f12151d);
        sb.append("/");
        sb.append(str);
        File file = new File(sb.toString());
        if (!file.exists()) {
            try {
                File file2 = new File(this.f12151d);
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
    private void m14229a(final String str) {
        final File file = new File(str);
        if (!file.exists()) {
            mo11702a();
        } else if (file.length() >= ((long) this.f12155h.f12163e)) {
            C9049ap.m27028a(C3358ac.m12517a((int) R.string.eys, Integer.valueOf((this.f12155h.f12163e / PreloadTask.BYTE_UNIT_NUMBER) / PreloadTask.BYTE_UNIT_NUMBER)));
        } else {
            if (this.f12154g == null) {
                this.f12154g = new ProgressDialog(this.f12148a.getActivity());
                this.f12154g.setMessage(C3358ac.m12515a((int) R.string.f58));
                this.f12154g.setCancelable(false);
            }
            if (!this.f12154g.isShowing()) {
                this.f12154g.show();
            }
            MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
            multipartTypedOutput.addPart("data", new TypedFile("multipart/form-data", file));
            ((C9059d) ((UploadApi) C9178j.m27302j().mo22373b().mo10440a(UploadApi.class)).upload(multipartTypedOutput).mo19124a((C47559ag<? super T, ? extends R>) C3303k.m12366a()).mo19131a((C47555ab<T, ? extends R>) C9060e.m27065a())).mo22252a((C7327h<? super C7329e<Throwable>, ? extends C7704b<?>>) new C4143bd<Object,Object>(this, file)).mo19137b((C47557ad<? super T>) new C47557ad<C3479d<C2377i>>() {
                public final void onSubscribe(C7321c cVar) {
                    C4139bc.this.f12149b = cVar;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onSuccess(C3479d<C2377i> dVar) {
                    ((C2377i) dVar.data).f7828b = str;
                    C4139bc.this.mo11704a((C2377i) dVar.data, str);
                }

                public final void onError(Throwable th) {
                    Context context = C4139bc.this.f12148a.getContext();
                    if (context != null) {
                        C3176a.m12015a(context, th);
                    }
                    if (file.length() > 0 || C4139bc.this.f12150c >= 10) {
                        C9049ap.m27022a((int) R.string.f_c);
                        C4139bc.this.mo11702a();
                    }
                }
            });
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C7704b mo11700a(File file, C7329e eVar) throws Exception {
        return eVar.mo19149a((C7327h<? super T, ? extends C7704b<? extends R>>) new C4144be<Object,Object>(this, file));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C7704b mo11701a(File file, Throwable th) throws Exception {
        if (file.length() <= 0 && this.f12150c <= 10) {
            C7329e.m22965a(500, TimeUnit.MILLISECONDS);
        }
        return C7329e.m22974a(th);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void invoke(C4141a aVar, CallContext callContext) throws Exception {
        this.f12155h = aVar;
        this.f12153f = String.valueOf(System.currentTimeMillis());
        FragmentActivity activity = this.f12148a.getActivity();
        if (aVar.f12164f == 0) {
            C9020a.m26954a(activity, this.f12148a, 40004, this.f12151d, m14236f());
            return;
        }
        if (aVar.f12164f == 1) {
            C9020a.m26953a((Activity) activity, this.f12148a, 40003);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:2|(6:4|5|(1:11)|12|13|14)|15|16|(1:18)|19|20|(1:22)|23) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0089 */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0084 A[Catch:{ Exception -> 0x0089 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008d A[Catch:{ Exception -> 0x0096 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m14227a(android.net.Uri r6, boolean r7) {
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
            java.lang.String r7 = r6.getLastPathSegment()     // Catch:{ Exception -> 0x0089 }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0089 }
            r3 = 19
            if (r2 < r3) goto L_0x002e
            boolean r2 = com.bytedance.common.utility.C6319n.m19593a(r7)     // Catch:{ Exception -> 0x0089 }
            if (r2 != 0) goto L_0x002e
            java.lang.String r2 = ":"
            boolean r2 = r7.contains(r2)     // Catch:{ Exception -> 0x0089 }
            if (r2 == 0) goto L_0x002e
            java.lang.String r2 = ":"
            java.lang.String[] r7 = r7.split(r2)     // Catch:{ Exception -> 0x0089 }
            r7 = r7[r1]     // Catch:{ Exception -> 0x0089 }
        L_0x002e:
            android.net.Uri r2 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ NumberFormatException -> 0x0039 }
            long r3 = java.lang.Long.parseLong(r7)     // Catch:{ NumberFormatException -> 0x0039 }
            android.net.Uri r7 = android.content.ContentUris.withAppendedId(r2, r3)     // Catch:{ NumberFormatException -> 0x0039 }
            r6 = r7
        L_0x0039:
            r0.addFlags(r1)     // Catch:{ Exception -> 0x0089 }
            r7 = 2
            r0.addFlags(r7)     // Catch:{ Exception -> 0x0089 }
            java.lang.String r7 = "image/*"
            r0.setDataAndType(r6, r7)     // Catch:{ Exception -> 0x0089 }
            java.lang.String r6 = "crop"
            java.lang.String r7 = "true"
            r0.putExtra(r6, r7)     // Catch:{ Exception -> 0x0089 }
            java.lang.String r6 = "scale"
            r0.putExtra(r6, r1)     // Catch:{ Exception -> 0x0089 }
            java.lang.String r6 = "aspectX"
            com.bytedance.android.livesdk.browser.jsbridge.newmethods.bc$a r7 = r5.f12155h     // Catch:{ Exception -> 0x0089 }
            int r7 = r7.f12159a     // Catch:{ Exception -> 0x0089 }
            r0.putExtra(r6, r7)     // Catch:{ Exception -> 0x0089 }
            java.lang.String r6 = "aspectY"
            com.bytedance.android.livesdk.browser.jsbridge.newmethods.bc$a r7 = r5.f12155h     // Catch:{ Exception -> 0x0089 }
            int r7 = r7.f12160b     // Catch:{ Exception -> 0x0089 }
            r0.putExtra(r6, r7)     // Catch:{ Exception -> 0x0089 }
            java.lang.String r6 = "return-data"
            r7 = 0
            r0.putExtra(r6, r7)     // Catch:{ Exception -> 0x0089 }
            java.lang.String r6 = "outputFormat"
            android.graphics.Bitmap$CompressFormat r7 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x0089 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0089 }
            r0.putExtra(r6, r7)     // Catch:{ Exception -> 0x0089 }
            java.lang.String r6 = "noFaceDetection"
            r0.putExtra(r6, r1)     // Catch:{ Exception -> 0x0089 }
            java.lang.String r6 = "scaleUpIfNeeded"
            r0.putExtra(r6, r1)     // Catch:{ Exception -> 0x0089 }
            android.net.Uri r6 = r5.m14234d()     // Catch:{ Exception -> 0x0089 }
            if (r6 == 0) goto L_0x0089
            java.lang.String r7 = "output"
            r0.putExtra(r7, r6)     // Catch:{ Exception -> 0x0089 }
        L_0x0089:
            android.support.v4.app.Fragment r6 = r5.f12148a     // Catch:{ Exception -> 0x0096 }
            if (r6 == 0) goto L_0x0095
            android.support.v4.app.Fragment r6 = r5.f12148a     // Catch:{ Exception -> 0x0096 }
            r7 = 40002(0x9c42, float:5.6055E-41)
            r6.startActivityForResult(r0, r7)     // Catch:{ Exception -> 0x0096 }
        L_0x0095:
            return
        L_0x0096:
            android.support.v4.app.Fragment r6 = r5.f12148a
            android.content.Context r6 = r6.getContext()
            r7 = 2131828812(0x7f11204c, float:1.9290575E38)
            com.bytedance.common.utility.C9738o.m28693a(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4139bc.m14227a(android.net.Uri, boolean):void");
    }

    /* renamed from: a */
    public final void mo11704a(C2377i iVar, String str) {
        m14232b();
        String str2 = iVar.f7827a;
        C9178j.m27302j().mo22375d().mo22384d();
        finishWithResult(new C4142b(str2, C3992d.m13988a(str)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0045 A[SYNTHETIC, Splitter:B:31:0x0045] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x004b A[SYNTHETIC, Splitter:B:37:0x004b] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m14230a(java.lang.String r4, int r5, int r6) {
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
            r4 = 16777216(0x1000000, float:2.3509887E-38)
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4139bc.m14230a(java.lang.String, int, int):boolean");
    }

    /* renamed from: a */
    public final void mo11703a(int i, int i2, Intent intent) {
        if (i == 40003) {
            if (i2 != -1 || intent == null || intent.getData() == null) {
                mo11702a();
                return;
            }
            FragmentActivity activity = this.f12148a.getActivity();
            if (activity == null) {
                mo11702a();
                return;
            }
            Uri data = intent.getData();
            String a = C9020a.m26950a((Context) activity, data);
            if (C6319n.m19593a(a)) {
                C9738o.m28694a((Context) activity, (int) R.drawable.bzp, (int) R.string.f_b);
                mo11702a();
            } else if (!new File(a).exists()) {
                C9738o.m28694a((Context) activity, (int) R.drawable.bzp, (int) R.string.f_b);
                mo11702a();
            } else {
                if ("file".equals(data.getScheme())) {
                    data = C9020a.m26949a((Context) activity, a);
                }
                m14227a(data, false);
            }
        } else if (i != 40004) {
            if (i == 40002) {
                if (i2 != -1) {
                    mo11702a();
                    return;
                }
                FragmentActivity activity2 = this.f12148a.getActivity();
                if (activity2 == null) {
                    mo11702a();
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(this.f12151d);
                sb.append("/");
                sb.append(m14235e());
                File file = new File(sb.toString());
                if (!file.exists()) {
                    C9738o.m28694a((Context) activity2, (int) R.drawable.bzp, (int) R.string.f_b);
                    mo11702a();
                } else if (!m14230a(file.getAbsolutePath(), this.f12155h.f12161c, this.f12155h.f12162d)) {
                    C9020a.m26953a((Activity) activity2, this.f12148a, 40003);
                } else {
                    m14229a(file.getAbsolutePath());
                }
            }
        } else if (i2 == -1) {
            try {
                m14227a(m14233c(), true);
            } catch (Exception e) {
                C8444d.m25673b();
                C8444d.m11969a(6, e.getStackTrace());
            }
        }
    }
}
