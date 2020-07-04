package com.bytedance.polaris.widget.webview;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.FileChooserParams;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.bytedance.polaris.depend.C12427h;
import com.bytedance.polaris.depend.C12428i;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.polaris.widget.webview.c */
public class C12443c extends WebChromeClient {

    /* renamed from: a */
    private ValueCallback<Uri> f33045a;

    /* renamed from: b */
    ValueCallback<Uri[]> f33046b;

    /* renamed from: c */
    boolean f33047c;

    /* renamed from: d */
    private WeakReference<Fragment> f33048d;

    /* renamed from: e */
    private WeakReference<Activity> f33049e;

    /* renamed from: f */
    private String f33050f;

    /* renamed from: c */
    static Intent m36199c() {
        return new Intent("android.media.action.VIDEO_CAPTURE");
    }

    /* renamed from: d */
    static Intent m36200d() {
        return new Intent("android.provider.MediaStore.RECORD_SOUND");
    }

    /* renamed from: e */
    private Context m36201e() {
        if (this.f33048d != null && this.f33048d.get() != null) {
            return ((Fragment) this.f33048d.get()).getActivity();
        }
        if (this.f33049e == null || this.f33049e.get() == null) {
            return null;
        }
        return (Context) this.f33049e.get();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Intent mo30393a() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        Intent a = m36197a(mo30396b(), m36199c(), m36200d());
        a.putExtra("android.intent.extra.INTENT", intent);
        return a;
    }

    public View getVideoLoadingProgressView() {
        Context e = m36201e();
        if (e == null) {
            return null;
        }
        FrameLayout frameLayout = new FrameLayout(e);
        frameLayout.setLayoutParams(new LayoutParams(-1, -1));
        ProgressBar progressBar = new ProgressBar(e);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        frameLayout.addView(progressBar, layoutParams);
        return frameLayout;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final Intent mo30396b() {
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
        this.f33050f = sb2.toString();
        intent.putExtra("output", Uri.fromFile(new File(this.f33050f)));
        return intent;
    }

    /* renamed from: a */
    static Intent m36196a(String str) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(str);
        return intent;
    }

    public C12443c(Fragment fragment) {
        this.f33048d = new WeakReference<>(fragment);
        if (fragment.getActivity() != null) {
            this.f33049e = new WeakReference<>(fragment.getActivity());
        }
    }

    /* renamed from: a */
    static Intent m36197a(Intent... intentArr) {
        Intent intent = new Intent("android.intent.action.CHOOSER");
        intent.putExtra("android.intent.extra.INITIAL_INTENTS", intentArr);
        return intent;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo30395a(Intent intent) {
        if (this.f33048d == null || this.f33048d.get() == null) {
            if (!(this.f33049e == null || this.f33049e.get() == null)) {
                ((Activity) this.f33049e.get()).startActivityForResult(intent, 2048);
            }
            return;
        }
        ((Fragment) this.f33048d.get()).startActivityForResult(intent, 2048);
    }

    /* renamed from: a */
    private void m36198a(String[] strArr, String str) {
        final String str2 = "filesystem";
        try {
            final String str3 = strArr[0];
            if (!TextUtils.isEmpty(str)) {
                str2 = str;
            }
            if (str.equals("filesystem")) {
                String str4 = str2;
                for (String split : strArr) {
                    String[] split2 = split.split("=");
                    if (split2.length == 2 && "capture".equals(split2[0])) {
                        str4 = split2[1];
                    }
                }
                str2 = str4;
            }
            this.f33050f = null;
            if (!str3.equals("image/*") && !str3.equals("video/*")) {
                if (!str3.equals("audio/*")) {
                    mo30395a(mo30393a());
                    return;
                }
            }
            C12428i.m36159i().mo30318a((Activity) this.f33049e.get(), new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"}, (C12427h) new C12427h() {
                /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
                    r4.f33053c.f33047c = true;
                    r4.f33053c.mo30395a(r4.f33053c.mo30393a());
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c7, code lost:
                    return;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c8, code lost:
                    return;
                 */
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x00b8 */
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void mo30331a() {
                    /*
                        r4 = this;
                        r0 = 1
                        java.lang.String r1 = r2     // Catch:{ ActivityNotFoundException -> 0x00b8 }
                        java.lang.String r2 = "image/*"
                        boolean r1 = r1.equals(r2)     // Catch:{ ActivityNotFoundException -> 0x00b8 }
                        r2 = 0
                        if (r1 == 0) goto L_0x0041
                        java.lang.String r1 = r0     // Catch:{ ActivityNotFoundException -> 0x00b8 }
                        java.lang.String r3 = "camera"
                        boolean r1 = r1.equals(r3)     // Catch:{ ActivityNotFoundException -> 0x00b8 }
                        if (r1 == 0) goto L_0x0022
                        com.bytedance.polaris.widget.webview.c r1 = com.bytedance.polaris.widget.webview.C12443c.this     // Catch:{ ActivityNotFoundException -> 0x00b8 }
                        com.bytedance.polaris.widget.webview.c r2 = com.bytedance.polaris.widget.webview.C12443c.this     // Catch:{ ActivityNotFoundException -> 0x00b8 }
                        android.content.Intent r2 = r2.mo30396b()     // Catch:{ ActivityNotFoundException -> 0x00b8 }
                        r1.mo30395a(r2)     // Catch:{ ActivityNotFoundException -> 0x00b8 }
                        return
                    L_0x0022:
                        android.content.Intent[] r1 = new android.content.Intent[r0]     // Catch:{ ActivityNotFoundException -> 0x00b8 }
                        com.bytedance.polaris.widget.webview.c r3 = com.bytedance.polaris.widget.webview.C12443c.this     // Catch:{ ActivityNotFoundException -> 0x00b8 }
                        android.content.Intent r3 = r3.mo30396b()     // Catch:{ ActivityNotFoundException -> 0x00b8 }
                        r1[r2] = r3     // Catch:{ ActivityNotFoundException -> 0x00b8 }
                        android.content.Intent r1 = com.bytedance.polaris.widget.webview.C12443c.m36197a(r1)     // Catch:{ ActivityNotFoundException -> 0x00b8 }
                        java.lang.String r2 = "android.intent.extra.INTENT"
                        java.lang.String r3 = "image/*"
                        android.content.Intent r3 = com.bytedance.polaris.widget.webview.C12443c.m36196a(r3)     // Catch:{ ActivityNotFoundException -> 0x00b8 }
                        r1.putExtra(r2, r3)     // Catch:{ ActivityNotFoundException -> 0x00b8 }
                        com.bytedance.polaris.widget.webview.c r2 = com.bytedance.polaris.widget.webview.C12443c.this     // Catch:{ ActivityNotFoundException -> 0x00b8 }
                        r2.mo30395a(r1)     // Catch:{ ActivityNotFoundException -> 0x00b8 }
                        return
                    L_0x0041:
                        java.lang.String r1 = r2     // Catch:{ ActivityNotFoundException -> 0x00b8 }
                        java.lang.String r3 = "video/*"
                        boolean r1 = r1.equals(r3)     // Catch:{ ActivityNotFoundException -> 0x00b8 }
                        if (r1 == 0) goto L_0x007c
                        java.lang.String r1 = r0     // Catch:{ ActivityNotFoundException -> 0x00b8 }
                        java.lang.String r3 = "camcorder"
                        boolean r1 = r1.equals(r3)     // Catch:{ ActivityNotFoundException -> 0x00b8 }
                        if (r1 == 0) goto L_0x005f
                        com.bytedance.polaris.widget.webview.c r1 = com.bytedance.polaris.widget.webview.C12443c.this     // Catch:{ ActivityNotFoundException -> 0x00b8 }
                        android.content.Intent r2 = com.bytedance.polaris.widget.webview.C12443c.m36199c()     // Catch:{ ActivityNotFoundException -> 0x00b8 }
                        r1.mo30395a(r2)     // Catch:{ ActivityNotFoundException -> 0x00b8 }
                        return
                    L_0x005f:
                        android.content.Intent[] r1 = new android.content.Intent[r0]     // Catch:{ ActivityNotFoundException -> 0x00b8 }
                        android.content.Intent r3 = com.bytedance.polaris.widget.webview.C12443c.m36199c()     // Catch:{ ActivityNotFoundException -> 0x00b8 }
                        r1[r2] = r3     // Catch:{ ActivityNotFoundException -> 0x00b8 }
                        android.content.Intent r1 = com.bytedance.polaris.widget.webview.C12443c.m36197a(r1)     // Catch:{ ActivityNotFoundException -> 0x00b8 }
                        java.lang.String r2 = "android.intent.extra.INTENT"
                        java.lang.String r3 = "video/*"
                        android.content.Intent r3 = com.bytedance.polaris.widget.webview.C12443c.m36196a(r3)     // Catch:{ ActivityNotFoundException -> 0x00b8 }
                        r1.putExtra(r2, r3)     // Catch:{ ActivityNotFoundException -> 0x00b8 }
                        com.bytedance.polaris.widget.webview.c r2 = com.bytedance.polaris.widget.webview.C12443c.this     // Catch:{ ActivityNotFoundException -> 0x00b8 }
                        r2.mo30395a(r1)     // Catch:{ ActivityNotFoundException -> 0x00b8 }
                        return
                    L_0x007c:
                        java.lang.String r1 = r2     // Catch:{ ActivityNotFoundException -> 0x00b8 }
                        java.lang.String r3 = "audio/*"
                        boolean r1 = r1.equals(r3)     // Catch:{ ActivityNotFoundException -> 0x00b8 }
                        if (r1 == 0) goto L_0x00b7
                        java.lang.String r1 = r0     // Catch:{ ActivityNotFoundException -> 0x00b8 }
                        java.lang.String r3 = "microphone"
                        boolean r1 = r1.equals(r3)     // Catch:{ ActivityNotFoundException -> 0x00b8 }
                        if (r1 == 0) goto L_0x009a
                        com.bytedance.polaris.widget.webview.c r1 = com.bytedance.polaris.widget.webview.C12443c.this     // Catch:{ ActivityNotFoundException -> 0x00b8 }
                        android.content.Intent r2 = com.bytedance.polaris.widget.webview.C12443c.m36200d()     // Catch:{ ActivityNotFoundException -> 0x00b8 }
                        r1.mo30395a(r2)     // Catch:{ ActivityNotFoundException -> 0x00b8 }
                        return
                    L_0x009a:
                        android.content.Intent[] r1 = new android.content.Intent[r0]     // Catch:{ ActivityNotFoundException -> 0x00b8 }
                        android.content.Intent r3 = com.bytedance.polaris.widget.webview.C12443c.m36200d()     // Catch:{ ActivityNotFoundException -> 0x00b8 }
                        r1[r2] = r3     // Catch:{ ActivityNotFoundException -> 0x00b8 }
                        android.content.Intent r1 = com.bytedance.polaris.widget.webview.C12443c.m36197a(r1)     // Catch:{ ActivityNotFoundException -> 0x00b8 }
                        java.lang.String r2 = "android.intent.extra.INTENT"
                        java.lang.String r3 = "audio/*"
                        android.content.Intent r3 = com.bytedance.polaris.widget.webview.C12443c.m36196a(r3)     // Catch:{ ActivityNotFoundException -> 0x00b8 }
                        r1.putExtra(r2, r3)     // Catch:{ ActivityNotFoundException -> 0x00b8 }
                        com.bytedance.polaris.widget.webview.c r2 = com.bytedance.polaris.widget.webview.C12443c.this     // Catch:{ ActivityNotFoundException -> 0x00b8 }
                        r2.mo30395a(r1)     // Catch:{ ActivityNotFoundException -> 0x00b8 }
                        return
                    L_0x00b7:
                        return
                    L_0x00b8:
                        com.bytedance.polaris.widget.webview.c r1 = com.bytedance.polaris.widget.webview.C12443c.this     // Catch:{ ActivityNotFoundException -> 0x00c8 }
                        r1.f33047c = r0     // Catch:{ ActivityNotFoundException -> 0x00c8 }
                        com.bytedance.polaris.widget.webview.c r0 = com.bytedance.polaris.widget.webview.C12443c.this     // Catch:{ ActivityNotFoundException -> 0x00c8 }
                        com.bytedance.polaris.widget.webview.c r1 = com.bytedance.polaris.widget.webview.C12443c.this     // Catch:{ ActivityNotFoundException -> 0x00c8 }
                        android.content.Intent r1 = r1.mo30393a()     // Catch:{ ActivityNotFoundException -> 0x00c8 }
                        r0.mo30395a(r1)     // Catch:{ ActivityNotFoundException -> 0x00c8 }
                        return
                    L_0x00c8:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.polaris.widget.webview.C12443c.C124441.mo30331a():void");
                }

                /* renamed from: a */
                public final void mo30332a(String str) {
                    if (C12443c.this.f33046b != null) {
                        C12443c.this.f33046b.onReceiveValue(null);
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, FileChooserParams fileChooserParams) {
        if (VERSION.SDK_INT < 21) {
            return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
        }
        this.f33046b = valueCallback;
        m36198a(fileChooserParams.getAcceptTypes(), "");
        return true;
    }

    /* renamed from: a */
    public final void mo30394a(int i, int i2, Intent intent) {
        Uri uri;
        if (i == 2048) {
            if (i2 != 0 || !this.f33047c) {
                if (VERSION.SDK_INT >= 21 && this.f33046b != null) {
                    Uri[] parseResult = FileChooserParams.parseResult(i2, intent);
                    if (parseResult == null) {
                        File file = new File(this.f33050f);
                        if (file.exists()) {
                            Uri fromFile = Uri.fromFile(file);
                            m36201e().sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", fromFile));
                            parseResult = new Uri[]{fromFile};
                        }
                    }
                    this.f33046b.onReceiveValue(parseResult);
                    this.f33046b = null;
                } else if (this.f33045a != null) {
                    if (intent == null || i2 != -1) {
                        uri = null;
                    } else {
                        uri = intent.getData();
                    }
                    if (uri == null && intent == null && i2 == -1) {
                        File file2 = new File(this.f33050f);
                        if (file2.exists()) {
                            uri = Uri.fromFile(file2);
                            m36201e().sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", uri));
                        }
                    }
                    this.f33045a.onReceiveValue(uri);
                    this.f33045a = null;
                }
                this.f33047c = false;
            } else {
                this.f33047c = false;
            }
        }
    }
}
