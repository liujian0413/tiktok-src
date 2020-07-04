package com.bytedance.android.livesdk.browser.p191a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.support.p022v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.FileChooserParams;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.bytedance.android.livesdk.p410o.C8735f;
import com.bytedance.android.livesdk.p410o.p412b.C8721d;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.android.livesdk.browser.a.b */
public class C3949b extends WebChromeClient {

    /* renamed from: a */
    public ValueCallback<Uri[]> f11789a;

    /* renamed from: b */
    private ValueCallback<Uri> f11790b;

    /* renamed from: c */
    private WeakReference<Fragment> f11791c;

    /* renamed from: d */
    private WeakReference<Activity> f11792d;

    /* renamed from: e */
    private String f11793e;

    /* renamed from: f */
    private boolean f11794f;

    /* renamed from: e */
    private static Intent m13866e() {
        return new Intent("android.media.action.VIDEO_CAPTURE");
    }

    /* renamed from: f */
    private static Intent m13867f() {
        return new Intent("android.provider.MediaStore.RECORD_SOUND");
    }

    /* renamed from: a */
    private Activity m13859a() {
        if (this.f11792d != null) {
            Activity activity = (Activity) this.f11792d.get();
            if (activity != null) {
                return activity;
            }
        }
        if (this.f11791c == null) {
            return null;
        }
        Fragment fragment = (Fragment) this.f11791c.get();
        if (fragment == null) {
            return null;
        }
        return fragment.getActivity();
    }

    /* renamed from: b */
    private Context m13863b() {
        if (this.f11791c != null && this.f11791c.get() != null) {
            return ((Fragment) this.f11791c.get()).getActivity();
        }
        if (this.f11792d == null || this.f11792d.get() == null) {
            return null;
        }
        return (Context) this.f11792d.get();
    }

    /* renamed from: c */
    private Intent m13864c() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        Intent a = m13861a(m13865d(), m13866e(), m13867f());
        a.putExtra("android.intent.extra.INTENT", intent);
        return a;
    }

    public View getVideoLoadingProgressView() {
        Context b = m13863b();
        if (b == null) {
            return null;
        }
        FrameLayout frameLayout = new FrameLayout(b);
        frameLayout.setLayoutParams(new LayoutParams(-1, -1));
        ProgressBar progressBar = new ProgressBar(b);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        frameLayout.addView(progressBar, layoutParams);
        return frameLayout;
    }

    /* renamed from: d */
    private Intent m13865d() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
        StringBuilder sb = new StringBuilder();
        sb.append(externalStoragePublicDirectory.getAbsolutePath());
        sb.append(File.separator);
        sb.append("browser-photos");
        File file = new File(sb.toString());
        file.mkdirs();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(file.getAbsolutePath());
        sb2.append(File.separator);
        sb2.append(System.currentTimeMillis());
        sb2.append(".jpg");
        this.f11793e = sb2.toString();
        intent.putExtra("output", Uri.fromFile(new File(this.f11793e)));
        return intent;
    }

    public C3949b(Fragment fragment) {
        this.f11791c = new WeakReference<>(fragment);
    }

    /* renamed from: a */
    private static Intent m13860a(String str) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(str);
        return intent;
    }

    /* renamed from: a */
    private static Intent m13861a(Intent... intentArr) {
        Intent intent = new Intent("android.intent.action.CHOOSER");
        intent.putExtra("android.intent.extra.INITIAL_INTENTS", intentArr);
        return intent;
    }

    /* renamed from: a */
    private void m13862a(Intent intent) {
        if (this.f11791c == null || this.f11791c.get() == null) {
            if (!(this.f11792d == null || this.f11792d.get() == null)) {
                ((Activity) this.f11792d.get()).startActivityForResult(intent, 2048);
            }
            return;
        }
        ((Fragment) this.f11791c.get()).startActivityForResult(intent, 2048);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00e4 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11512a(java.lang.String r9, java.lang.String r10) {
        /*
            r8 = this;
            r0 = 1
            if (r9 != 0) goto L_0x0005
            java.lang.String r9 = ""
        L_0x0005:
            java.lang.String r1 = "filesystem"
            java.lang.String r2 = ";"
            java.lang.String[] r9 = r9.split(r2)     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            r2 = 0
            r3 = r9[r2]     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            boolean r4 = android.text.TextUtils.isEmpty(r10)     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            if (r4 != 0) goto L_0x0017
            r1 = r10
        L_0x0017:
            java.lang.String r4 = "filesystem"
            boolean r10 = r10.equals(r4)     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            if (r10 == 0) goto L_0x0040
            int r10 = r9.length     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            r4 = r1
            r1 = 0
        L_0x0022:
            if (r1 >= r10) goto L_0x003f
            r5 = r9[r1]     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            java.lang.String r6 = "="
            java.lang.String[] r5 = r5.split(r6)     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            int r6 = r5.length     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            r7 = 2
            if (r6 != r7) goto L_0x003c
            java.lang.String r6 = "capture"
            r7 = r5[r2]     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            boolean r6 = r6.equals(r7)     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            if (r6 == 0) goto L_0x003c
            r4 = r5[r0]     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
        L_0x003c:
            int r1 = r1 + 1
            goto L_0x0022
        L_0x003f:
            r1 = r4
        L_0x0040:
            r9 = 0
            r8.f11793e = r9     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            java.lang.String r9 = "image/*"
            boolean r9 = r3.equals(r9)     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            if (r9 == 0) goto L_0x0076
            java.lang.String r9 = "camera"
            boolean r9 = r1.equals(r9)     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            if (r9 == 0) goto L_0x005b
            android.content.Intent r9 = r8.m13865d()     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            r8.m13862a(r9)     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            return
        L_0x005b:
            android.content.Intent[] r9 = new android.content.Intent[r0]     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            android.content.Intent r10 = r8.m13865d()     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            r9[r2] = r10     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            android.content.Intent r9 = m13861a(r9)     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            java.lang.String r10 = "android.intent.extra.INTENT"
            java.lang.String r1 = "image/*"
            android.content.Intent r1 = m13860a(r1)     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            r9.putExtra(r10, r1)     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            r8.m13862a(r9)     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            return
        L_0x0076:
            java.lang.String r9 = "video/*"
            boolean r9 = r3.equals(r9)     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            if (r9 == 0) goto L_0x00a9
            java.lang.String r9 = "camcorder"
            boolean r9 = r1.equals(r9)     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            if (r9 == 0) goto L_0x008e
            android.content.Intent r9 = m13866e()     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            r8.m13862a(r9)     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            return
        L_0x008e:
            android.content.Intent[] r9 = new android.content.Intent[r0]     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            android.content.Intent r10 = m13866e()     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            r9[r2] = r10     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            android.content.Intent r9 = m13861a(r9)     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            java.lang.String r10 = "android.intent.extra.INTENT"
            java.lang.String r1 = "video/*"
            android.content.Intent r1 = m13860a(r1)     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            r9.putExtra(r10, r1)     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            r8.m13862a(r9)     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            return
        L_0x00a9:
            java.lang.String r9 = "audio/*"
            boolean r9 = r3.equals(r9)     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            if (r9 == 0) goto L_0x00dc
            java.lang.String r9 = "microphone"
            boolean r9 = r1.equals(r9)     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            if (r9 == 0) goto L_0x00c1
            android.content.Intent r9 = m13867f()     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            r8.m13862a(r9)     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            return
        L_0x00c1:
            android.content.Intent[] r9 = new android.content.Intent[r0]     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            android.content.Intent r10 = m13867f()     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            r9[r2] = r10     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            android.content.Intent r9 = m13861a(r9)     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            java.lang.String r10 = "android.intent.extra.INTENT"
            java.lang.String r1 = "audio/*"
            android.content.Intent r1 = m13860a(r1)     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            r9.putExtra(r10, r1)     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            r8.m13862a(r9)     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            return
        L_0x00dc:
            android.content.Intent r9 = r8.m13864c()     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            r8.m13862a(r9)     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            return
        L_0x00e4:
            r8.f11794f = r0     // Catch:{ ActivityNotFoundException -> 0x00ee }
            android.content.Intent r9 = r8.m13864c()     // Catch:{ ActivityNotFoundException -> 0x00ee }
            r8.m13862a(r9)     // Catch:{ ActivityNotFoundException -> 0x00ee }
        L_0x00ed:
            return
        L_0x00ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.p191a.C3949b.mo11512a(java.lang.String, java.lang.String):void");
    }

    public boolean onShowFileChooser(WebView webView, final ValueCallback<Uri[]> valueCallback, FileChooserParams fileChooserParams) {
        final String str = "";
        if (fileChooserParams.getAcceptTypes().length > 0) {
            str = fileChooserParams.getAcceptTypes()[0];
        }
        C8735f.m26105a(m13859a()).mo21743a(new C8721d() {
            /* renamed from: a */
            public final void mo9567a(String... strArr) {
                C3949b.this.f11789a = valueCallback;
                C3949b.this.mo11512a(str, "");
            }

            /* renamed from: b */
            public final void mo9568b(String... strArr) {
                valueCallback.onReceiveValue(null);
                C3949b.this.f11789a = null;
            }
        }, "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.CAMERA");
        return true;
    }

    /* renamed from: a */
    public final void mo11511a(int i, int i2, Intent intent) {
        Uri uri;
        if ((i == 2048 && this.f11790b != null) || this.f11789a != null) {
            if (i2 != 0 || !this.f11794f) {
                if (intent == null || i2 != -1) {
                    uri = null;
                } else {
                    uri = intent.getData();
                }
                if (uri == null && intent == null && i2 == -1) {
                    File file = new File(this.f11793e);
                    if (file.exists()) {
                        uri = Uri.fromFile(file);
                        m13863b().sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", uri));
                    }
                }
                if (this.f11790b != null) {
                    this.f11790b.onReceiveValue(uri);
                }
                if (this.f11789a != null) {
                    this.f11789a.onReceiveValue(uri == null ? null : new Uri[]{uri});
                }
                this.f11794f = false;
                this.f11790b = null;
                this.f11789a = null;
            } else {
                this.f11794f = false;
            }
        }
    }
}
