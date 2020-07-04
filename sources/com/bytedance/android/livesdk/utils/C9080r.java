package com.bytedance.android.livesdk.utils;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Environment;
import android.support.p022v4.app.Fragment;
import android.support.p029v7.app.AlertDialog.C1081a;
import android.text.TextUtils;
import android.widget.Toast;
import com.bytedance.android.live.room.C3484c;
import com.bytedance.android.live.room.C3484c.C3485a;
import com.bytedance.android.livesdk.TTLiveFileProvider;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.utils.r */
public final class C9080r implements C3484c {

    /* renamed from: n */
    private static SimpleDateFormat f24735n;

    /* renamed from: a */
    private Activity f24736a;

    /* renamed from: b */
    private final Resources f24737b;

    /* renamed from: c */
    private final Fragment f24738c;

    /* renamed from: d */
    private final String f24739d;

    /* renamed from: e */
    private final String f24740e;

    /* renamed from: f */
    private String f24741f;

    /* renamed from: g */
    private final C3485a f24742g;

    /* renamed from: h */
    private final int f24743h;

    /* renamed from: i */
    private final int f24744i;

    /* renamed from: j */
    private final int f24745j;

    /* renamed from: k */
    private final int f24746k;

    /* renamed from: l */
    private final String f24747l;

    /* renamed from: m */
    private final Map<String, String> f24748m;

    /* renamed from: o */
    private ProgressDialog f24749o;

    /* renamed from: f */
    private Uri m27111f() {
        return m27103a(m27112g());
    }

    /* renamed from: b */
    public final void mo10472b() {
        if (this.f24749o != null) {
            this.f24749o.dismiss();
        }
    }

    /* renamed from: d */
    private String m27109d() {
        StringBuilder sb = new StringBuilder();
        sb.append(m27113h());
        sb.append(".jpeg");
        return sb.toString();
    }

    /* renamed from: g */
    private String m27112g() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f24740e);
        sb.append("_");
        sb.append(this.f24741f);
        sb.append(this.f24747l);
        return sb.toString();
    }

    /* renamed from: h */
    private String m27113h() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f24740e);
        sb.append("_");
        sb.append(this.f24741f);
        return sb.toString();
    }

    /* renamed from: c */
    public final void mo10473c() {
        this.f24741f = String.valueOf(System.currentTimeMillis());
        String[] stringArray = this.f24737b.getStringArray(R.array.af);
        C1081a aVar = new C1081a(this.f24736a);
        aVar.mo4236a((CharSequence[]) stringArray, (OnClickListener) new C9081s(this));
        aVar.mo4235a(false);
        aVar.mo4245c();
    }

    /* renamed from: e */
    private Uri m27110e() {
        String d = m27109d();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f24739d);
        sb.append("/");
        sb.append(d);
        File file = new File(sb.toString());
        if (!file.exists()) {
            try {
                File file2 = new File(this.f24739d);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                file.createNewFile();
            } catch (IOException unused) {
                return null;
            }
        }
        Activity activity = this.f24736a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f24736a.getPackageName());
        sb2.append(TTLiveFileProvider.NAME);
        return TTLiveFileProvider.getUri(activity, sb2.toString(), file);
    }

    /* renamed from: a */
    public final void mo10470a() {
        if (this.f24749o == null) {
            this.f24749o = new ProgressDialog(this.f24736a);
            this.f24749o.setMessage(this.f24736a.getString(R.string.f58));
            this.f24749o.setIndeterminate(true);
            this.f24749o.setCancelable(true);
        }
        if (!this.f24749o.isShowing()) {
            this.f24749o.show();
        }
    }

    /* renamed from: a */
    private void m27104a(int i) {
        Toast makeText = Toast.makeText(this.f24736a, i, 0);
        makeText.setGravity(49, 0, 0);
        C9082t.m27119a(makeText);
    }

    /* renamed from: a */
    private Uri m27103a(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f24739d);
        sb.append("/");
        sb.append(str);
        File file = new File(sb.toString());
        if (!file.exists()) {
            try {
                File file2 = new File(this.f24739d);
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

    /* renamed from: b */
    private static String m27108b(String str) {
        File file = new File(str);
        if (!file.exists()) {
            return null;
        }
        try {
            String attribute = new ExifInterface(str).getAttribute("DateTime");
            if (!TextUtils.isEmpty(attribute)) {
                if (f24735n == null) {
                    f24735n = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
                }
                return String.valueOf(f24735n.parse(attribute).getTime());
            }
        } catch (IOException | ParseException unused) {
        }
        return String.valueOf(file.lastModified());
    }

    /* renamed from: a */
    private void m27106a(String str, String str2) {
        if (this.f24742g != null) {
            this.f24742g.mo9627a(str, str2);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:2|(6:4|5|(1:11)|12|13|14)|15|16|(1:18)|19|20|(2:22|27)(2:23|24)) */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009e, code lost:
        m27104a((int) com.zhiliaoapp.musically.df_live_zego_link.R.string.f_e);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0040 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x008b */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0086 A[Catch:{ Exception -> 0x008b }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0092 A[Catch:{ Exception -> 0x009e }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0098 A[Catch:{ Exception -> 0x009e }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m27105a(android.net.Uri r7, boolean r8) {
        /*
            r6 = this;
            if (r7 != 0) goto L_0x0003
            return
        L_0x0003:
            java.lang.String r0 = "ttlive_upload_cover_want_crop"
            r1 = 0
            r2 = 0
            com.bytedance.android.live.core.p148d.C3172e.m12002a(r0, r2, r1)
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "com.android.camera.action.CROP"
            r0.<init>(r1)
            r1 = 1
            if (r8 == 0) goto L_0x0015
            goto L_0x0040
        L_0x0015:
            java.lang.String r8 = r7.getLastPathSegment()     // Catch:{ Exception -> 0x008b }
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x008b }
            r4 = 19
            if (r3 < r4) goto L_0x0035
            boolean r3 = com.bytedance.common.utility.C6319n.m19593a(r8)     // Catch:{ Exception -> 0x008b }
            if (r3 != 0) goto L_0x0035
            java.lang.String r3 = ":"
            boolean r3 = r8.contains(r3)     // Catch:{ Exception -> 0x008b }
            if (r3 == 0) goto L_0x0035
            java.lang.String r3 = ":"
            java.lang.String[] r8 = r8.split(r3)     // Catch:{ Exception -> 0x008b }
            r8 = r8[r1]     // Catch:{ Exception -> 0x008b }
        L_0x0035:
            android.net.Uri r3 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ NumberFormatException -> 0x0040 }
            long r4 = java.lang.Long.parseLong(r8)     // Catch:{ NumberFormatException -> 0x0040 }
            android.net.Uri r8 = android.content.ContentUris.withAppendedId(r3, r4)     // Catch:{ NumberFormatException -> 0x0040 }
            r7 = r8
        L_0x0040:
            r0.addFlags(r1)     // Catch:{ Exception -> 0x008b }
            r8 = 2
            r0.addFlags(r8)     // Catch:{ Exception -> 0x008b }
            java.lang.String r8 = "image/*"
            r0.setDataAndType(r7, r8)     // Catch:{ Exception -> 0x008b }
            java.lang.String r7 = "crop"
            java.lang.String r8 = "true"
            r0.putExtra(r7, r8)     // Catch:{ Exception -> 0x008b }
            java.lang.String r7 = "scale"
            r0.putExtra(r7, r1)     // Catch:{ Exception -> 0x008b }
            java.lang.String r7 = "aspectX"
            int r8 = r6.f24743h     // Catch:{ Exception -> 0x008b }
            r0.putExtra(r7, r8)     // Catch:{ Exception -> 0x008b }
            java.lang.String r7 = "aspectY"
            int r8 = r6.f24744i     // Catch:{ Exception -> 0x008b }
            r0.putExtra(r7, r8)     // Catch:{ Exception -> 0x008b }
            java.lang.String r7 = "return-data"
            r0.putExtra(r7, r2)     // Catch:{ Exception -> 0x008b }
            java.lang.String r7 = "outputFormat"
            android.graphics.Bitmap$CompressFormat r8 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x008b }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x008b }
            r0.putExtra(r7, r8)     // Catch:{ Exception -> 0x008b }
            java.lang.String r7 = "noFaceDetection"
            r0.putExtra(r7, r1)     // Catch:{ Exception -> 0x008b }
            java.lang.String r7 = "scaleUpIfNeeded"
            r0.putExtra(r7, r1)     // Catch:{ Exception -> 0x008b }
            android.net.Uri r7 = r6.m27111f()     // Catch:{ Exception -> 0x008b }
            if (r7 == 0) goto L_0x008b
            java.lang.String r8 = "output"
            r0.putExtra(r8, r7)     // Catch:{ Exception -> 0x008b }
        L_0x008b:
            android.support.v4.app.Fragment r7 = r6.f24738c     // Catch:{ Exception -> 0x009e }
            r8 = 40002(0x9c42, float:5.6055E-41)
            if (r7 == 0) goto L_0x0098
            android.support.v4.app.Fragment r7 = r6.f24738c     // Catch:{ Exception -> 0x009e }
            r7.startActivityForResult(r0, r8)     // Catch:{ Exception -> 0x009e }
            goto L_0x00a4
        L_0x0098:
            android.app.Activity r7 = r6.f24736a     // Catch:{ Exception -> 0x009e }
            r7.startActivityForResult(r0, r8)     // Catch:{ Exception -> 0x009e }
            return
        L_0x009e:
            r7 = 2131828812(0x7f11204c, float:1.9290575E38)
            r6.m27104a(r7)
        L_0x00a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.utils.C9080r.m27105a(android.net.Uri, boolean):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo22260a(DialogInterface dialogInterface, int i) {
        switch (i) {
            case 0:
                C9020a.m26953a(this.f24736a, this.f24738c, 40003);
                return;
            case 1:
                C9020a.m26954a(this.f24736a, this.f24738c, 40004, this.f24739d, m27109d());
                return;
            case 2:
                if (this.f24742g != null) {
                    this.f24742g.mo9628f_();
                    break;
                }
                break;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x004a A[SYNTHETIC, Splitter:B:31:0x004a] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0050 A[SYNTHETIC, Splitter:B:37:0x0050] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m27107a(java.lang.String r6, int r7, int r8) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x004e, all -> 0x0046 }
            r2.<init>(r6)     // Catch:{ FileNotFoundException -> 0x004e, all -> 0x0046 }
            android.graphics.BitmapFactory$Options r6 = new android.graphics.BitmapFactory$Options     // Catch:{ FileNotFoundException -> 0x0044, all -> 0x0042 }
            r6.<init>()     // Catch:{ FileNotFoundException -> 0x0044, all -> 0x0042 }
            r6.inJustDecodeBounds = r0     // Catch:{ FileNotFoundException -> 0x0044, all -> 0x0042 }
            android.graphics.BitmapFactory.decodeStream(r2, r1, r6)     // Catch:{ FileNotFoundException -> 0x0044, all -> 0x0042 }
            int r3 = r6.outWidth     // Catch:{ FileNotFoundException -> 0x0044, all -> 0x0042 }
            r4 = 0
            if (r7 > r3) goto L_0x0033
            int r7 = r6.outHeight     // Catch:{ FileNotFoundException -> 0x0044, all -> 0x0042 }
            if (r8 <= r7) goto L_0x001b
            goto L_0x0033
        L_0x001b:
            int r7 = r6.outWidth     // Catch:{ FileNotFoundException -> 0x0044, all -> 0x0042 }
            int r6 = r6.outHeight     // Catch:{ FileNotFoundException -> 0x0044, all -> 0x0042 }
            int r7 = r7 * r6
            r6 = 16777216(0x1000000, float:2.3509887E-38)
            if (r7 <= r6) goto L_0x002f
            r6 = 2131828813(0x7f11204d, float:1.9290577E38)
            r5.m27104a(r6)     // Catch:{ FileNotFoundException -> 0x0044, all -> 0x0042 }
            r2.close()     // Catch:{ IOException -> 0x002e }
        L_0x002e:
            return r4
        L_0x002f:
            r2.close()     // Catch:{ IOException -> 0x0053 }
            goto L_0x0053
        L_0x0033:
            r6 = 2131828814(0x7f11204e, float:1.929058E38)
            r5.m27104a(r6)     // Catch:{ FileNotFoundException -> 0x0044, all -> 0x0042 }
            java.lang.String r6 = "ttlive_upload_cover_small_toast"
            com.bytedance.android.live.core.p148d.C3172e.m12002a(r6, r4, r1)     // Catch:{ FileNotFoundException -> 0x0044, all -> 0x0042 }
            r2.close()     // Catch:{ IOException -> 0x0041 }
        L_0x0041:
            return r4
        L_0x0042:
            r6 = move-exception
            goto L_0x0048
        L_0x0044:
            r1 = r2
            goto L_0x004e
        L_0x0046:
            r6 = move-exception
            r2 = r1
        L_0x0048:
            if (r2 == 0) goto L_0x004d
            r2.close()     // Catch:{ IOException -> 0x004d }
        L_0x004d:
            throw r6
        L_0x004e:
            if (r1 == 0) goto L_0x0053
            r1.close()     // Catch:{ IOException -> 0x0053 }
        L_0x0053:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.utils.C9080r.m27107a(java.lang.String, int, int):boolean");
    }

    /* renamed from: a */
    public final boolean mo10471a(int i, int i2, Intent intent) {
        if (i == 40003) {
            if (i2 == 0) {
                if (this.f24742g != null) {
                    this.f24742g.mo9628f_();
                }
                return false;
            } else if (intent == null) {
                if (this.f24742g != null) {
                    this.f24742g.mo9628f_();
                }
                return false;
            } else {
                Uri data = intent.getData();
                String a = C9020a.m26950a((Context) this.f24736a, data);
                if (C6319n.m19593a(a)) {
                    if (this.f24742g != null) {
                        this.f24742g.mo9628f_();
                    }
                    C9738o.m28694a((Context) this.f24736a, (int) R.drawable.bzp, (int) R.string.f_b);
                    return false;
                } else if (!new File(a).exists()) {
                    if (this.f24742g != null) {
                        this.f24742g.mo9628f_();
                    }
                    C9738o.m28694a((Context) this.f24736a, (int) R.drawable.bzp, (int) R.string.f_b);
                    return false;
                } else {
                    if ("file".equals(data.getScheme())) {
                        data = C9020a.m26949a((Context) this.f24736a, a);
                    }
                    m27105a(data, false);
                    this.f24748m.put(this.f24741f, m27108b(a));
                    return true;
                }
            }
        } else if (i != 40004) {
            if (i == 40002) {
                if (i2 == 0) {
                    if (this.f24742g != null) {
                        this.f24742g.mo9628f_();
                    }
                    return false;
                }
                C8443c.m25663a().mo21606a("livesdk_cover_crop_commit", new HashMap(), new C8438j().mo21603f("click").mo21599b("live").mo21598a("cover_edit"));
                StringBuilder sb = new StringBuilder();
                sb.append(this.f24739d);
                sb.append("/");
                sb.append(m27112g());
                File file = new File(sb.toString());
                if (!file.exists()) {
                    return true;
                }
                if (!m27107a(file.getAbsolutePath(), this.f24745j, this.f24746k)) {
                    C9020a.m26953a(this.f24736a, this.f24738c, 40003);
                    return true;
                }
                m27106a(file.getAbsolutePath(), (String) this.f24748m.remove(this.f24741f));
                return true;
            }
            return false;
        } else if (i2 == 0) {
            if (this.f24742g != null) {
                this.f24742g.mo9628f_();
            }
            return false;
        } else {
            try {
                m27105a(m27110e(), true);
                this.f24748m.put(this.f24741f, String.valueOf(System.currentTimeMillis()));
                return true;
            } catch (Exception unused) {
            }
        }
    }

    public C9080r(Activity activity, Fragment fragment, String str, int i, int i2, int i3, int i4, C3485a aVar) {
        this(activity, fragment, str, i, i2, i3, i4, aVar, "");
    }

    private C9080r(Activity activity, Fragment fragment, String str, int i, int i2, int i3, int i4, C3485a aVar, String str2) {
        this.f24748m = new HashMap();
        this.f24736a = activity;
        this.f24738c = fragment;
        this.f24742g = aVar;
        this.f24743h = i;
        this.f24744i = i2;
        this.f24745j = i3;
        this.f24746k = i4;
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory().getPath());
        sb.append("/DCIM/Camera");
        this.f24739d = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(".data");
        this.f24740e = sb2.toString();
        if (this.f24736a == null && this.f24738c != null) {
            this.f24736a = this.f24738c.getActivity();
        }
        this.f24737b = this.f24736a.getResources();
        this.f24747l = str2;
    }
}
