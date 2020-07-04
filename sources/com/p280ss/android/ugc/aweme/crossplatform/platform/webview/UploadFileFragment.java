package com.p280ss.android.ugc.aweme.crossplatform.platform.webview;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.os.Parcelable;
import android.support.p022v4.app.Fragment;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient.FileChooserParams;
import android.webkit.WebView;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.p280ss.android.newmedia.C19929d;
import com.p280ss.android.ugc.aweme.p999aj.C22477b;
import com.p280ss.android.ugc.aweme.p999aj.C22477b.C22480b;
import com.p280ss.android.ugc.aweme.utils.permission.C43162f;
import java.io.File;
import java.util.HashMap;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.UploadFileFragment */
public final class UploadFileFragment extends Fragment {

    /* renamed from: e */
    public static final C25958a f68653e = new C25958a(null);

    /* renamed from: a */
    public ValueCallback<Uri> f68654a;

    /* renamed from: b */
    public ValueCallback<Uri[]> f68655b;

    /* renamed from: c */
    public String f68656c;

    /* renamed from: d */
    public boolean f68657d;

    /* renamed from: f */
    private HashMap f68658f;

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.UploadFileFragment$a */
    public static final class C25958a {
        private C25958a() {
        }

        public /* synthetic */ C25958a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.UploadFileFragment$b */
    static final class C25959b implements C22480b {

        /* renamed from: a */
        final /* synthetic */ UploadFileFragment f68659a;

        /* renamed from: b */
        final /* synthetic */ ValueCallback f68660b;

        /* renamed from: c */
        final /* synthetic */ FileChooserParams f68661c;

        C25959b(UploadFileFragment uploadFileFragment, ValueCallback valueCallback, FileChooserParams fileChooserParams) {
            this.f68659a = uploadFileFragment;
            this.f68660b = valueCallback;
            this.f68661c = fileChooserParams;
        }

        /* renamed from: a */
        public final void mo53549a(String[] strArr, int[] iArr) {
            boolean z;
            String str;
            C7573i.m23582a((Object) iArr, "grantResults");
            int length = iArr.length;
            int i = 0;
            while (i < length && iArr[i] == 0) {
                this.f68659a.f68655b = this.f68660b;
                UploadFileFragment uploadFileFragment = this.f68659a;
                String[] acceptTypes = this.f68661c.getAcceptTypes();
                C7573i.m23582a((Object) acceptTypes, "fileChooserParams.acceptTypes");
                if (acceptTypes.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    str = this.f68661c.getAcceptTypes()[0];
                } else {
                    str = "";
                }
                uploadFileFragment.mo67415a(str, "");
                i++;
            }
        }
    }

    /* renamed from: e */
    private void m85275e() {
        if (this.f68658f != null) {
            this.f68658f.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m85275e();
    }

    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        FragmentInstrumentation.onHiddenChanged(this, z);
    }

    public final void onPause() {
        super.onPause();
        FragmentInstrumentation.onPause(this);
    }

    public final void onResume() {
        super.onResume();
        FragmentInstrumentation.onResume(this);
    }

    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        FragmentInstrumentation.setUserVisibleHint(this, z);
    }

    /* renamed from: c */
    private static Intent m85273c() {
        return new Intent("android.media.action.VIDEO_CAPTURE");
    }

    /* renamed from: d */
    private static Intent m85274d() {
        return new Intent("android.provider.MediaStore.RECORD_SOUND");
    }

    /* renamed from: a */
    private final Intent m85269a() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        Intent a = m85271a(m85272b(), m85273c(), m85274d());
        a.putExtra("android.intent.extra.INTENT", intent);
        return a;
    }

    /* renamed from: b */
    private final Intent m85272b() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
        StringBuilder sb = new StringBuilder();
        C7573i.m23582a((Object) externalStoragePublicDirectory, "externalDataDir");
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
        this.f68656c = sb2.toString();
        String str = "output";
        Context context = getContext();
        String str2 = this.f68656c;
        if (str2 == null) {
            C7573i.m23580a();
        }
        intent.putExtra(str, C19929d.m65754a(context, new File(str2)));
        return intent;
    }

    /* renamed from: a */
    private static Intent m85270a(String str) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(str);
        return intent;
    }

    /* renamed from: a */
    private static Intent m85271a(Intent... intentArr) {
        Intent intent = new Intent("android.intent.action.CHOOSER");
        intent.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) intentArr);
        return intent;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:87:0x01a5 */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d4 A[Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x00e9 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo67415a(java.lang.String r10, java.lang.String r11) {
        /*
            r9 = this;
            java.lang.String r0 = "capture"
            kotlin.jvm.internal.C7573i.m23587b(r11, r0)
            r0 = 2048(0x800, float:2.87E-42)
            r1 = 1
            if (r10 != 0) goto L_0x000c
            java.lang.String r10 = ""
        L_0x000c:
            java.lang.String r2 = "filesystem"
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            java.lang.String r3 = ";"
            kotlin.text.Regex r4 = new kotlin.text.Regex     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            r4.<init>(r3)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            r3 = 0
            java.util.List r10 = r4.split(r10, r3)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            boolean r4 = r10.isEmpty()     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            if (r4 != 0) goto L_0x004f
            int r4 = r10.size()     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            java.util.ListIterator r4 = r10.listIterator(r4)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
        L_0x002a:
            boolean r5 = r4.hasPrevious()     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            if (r5 == 0) goto L_0x004f
            java.lang.Object r5 = r4.previous()     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            int r5 = r5.length()     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            if (r5 != 0) goto L_0x0040
            r5 = 1
            goto L_0x0041
        L_0x0040:
            r5 = 0
        L_0x0041:
            if (r5 != 0) goto L_0x002a
            java.lang.Iterable r10 = (java.lang.Iterable) r10     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            int r4 = r4.nextIndex()     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            int r4 = r4 + r1
            java.util.List r10 = kotlin.collections.C7525m.m23505c(r10, r4)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            goto L_0x0053
        L_0x004f:
            java.util.List r10 = kotlin.collections.C7525m.m23461a()     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
        L_0x0053:
            java.util.Collection r10 = (java.util.Collection) r10     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            java.lang.Object[] r10 = r10.toArray(r4)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            if (r10 == 0) goto L_0x019c
            java.lang.String[] r10 = (java.lang.String[]) r10     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            int r4 = r10.length     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            if (r4 != 0) goto L_0x0064
            r4 = 1
            goto L_0x0065
        L_0x0064:
            r4 = 0
        L_0x0065:
            r4 = r4 ^ r1
            if (r4 == 0) goto L_0x006b
            r4 = r10[r3]     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            goto L_0x006d
        L_0x006b:
            java.lang.String r4 = ""
        L_0x006d:
            r5 = r11
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            if (r5 != 0) goto L_0x0077
            r2 = r11
        L_0x0077:
            java.lang.String r5 = "filesystem"
            boolean r11 = kotlin.jvm.internal.C7573i.m23585a(r11, r5)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            if (r11 == 0) goto L_0x00f2
            int r11 = r10.length     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            r5 = r2
            r2 = 0
        L_0x0082:
            if (r2 >= r11) goto L_0x00f1
            r6 = r10[r2]     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            java.lang.String r7 = "="
            kotlin.text.Regex r8 = new kotlin.text.Regex     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            r8.<init>(r7)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            java.util.List r6 = r8.split(r6, r3)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            boolean r7 = r6.isEmpty()     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            if (r7 != 0) goto L_0x00c6
            int r7 = r6.size()     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            java.util.ListIterator r7 = r6.listIterator(r7)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
        L_0x00a1:
            boolean r8 = r7.hasPrevious()     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            if (r8 == 0) goto L_0x00c6
            java.lang.Object r8 = r7.previous()     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            int r8 = r8.length()     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            if (r8 != 0) goto L_0x00b7
            r8 = 1
            goto L_0x00b8
        L_0x00b7:
            r8 = 0
        L_0x00b8:
            if (r8 != 0) goto L_0x00a1
            java.lang.Iterable r6 = (java.lang.Iterable) r6     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            int r7 = r7.nextIndex()     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            int r7 = r7 + r1
            java.util.List r6 = kotlin.collections.C7525m.m23505c(r6, r7)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            goto L_0x00ca
        L_0x00c6:
            java.util.List r6 = kotlin.collections.C7525m.m23461a()     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
        L_0x00ca:
            java.util.Collection r6 = (java.util.Collection) r6     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            java.lang.String[] r7 = new java.lang.String[r3]     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            java.lang.Object[] r6 = r6.toArray(r7)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            if (r6 == 0) goto L_0x00e9
            java.lang.String[] r6 = (java.lang.String[]) r6     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            int r7 = r6.length     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            r8 = 2
            if (r7 != r8) goto L_0x00e6
            java.lang.String r7 = "capture"
            r8 = r6[r3]     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            boolean r7 = kotlin.jvm.internal.C7573i.m23585a(r7, r8)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            if (r7 == 0) goto L_0x00e6
            r5 = r6[r1]     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
        L_0x00e6:
            int r2 = r2 + 1
            goto L_0x0082
        L_0x00e9:
            kotlin.TypeCastException r10 = new kotlin.TypeCastException     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            java.lang.String r11 = "null cannot be cast to non-null type kotlin.Array<T>"
            r10.<init>(r11)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            throw r10     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
        L_0x00f1:
            r2 = r5
        L_0x00f2:
            r10 = 0
            r9.f68656c = r10     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            java.lang.String r10 = "image/*"
            boolean r10 = kotlin.jvm.internal.C7573i.m23585a(r4, r10)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            if (r10 == 0) goto L_0x012a
            java.lang.String r10 = "camera"
            boolean r10 = kotlin.jvm.internal.C7573i.m23585a(r2, r10)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            if (r10 == 0) goto L_0x010d
            android.content.Intent r10 = r9.m85272b()     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            r9.startActivityForResult(r10, r0)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            return
        L_0x010d:
            android.content.Intent[] r10 = new android.content.Intent[r1]     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            android.content.Intent r11 = r9.m85272b()     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            r10[r3] = r11     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            android.content.Intent r10 = m85271a(r10)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            java.lang.String r11 = "android.intent.extra.INTENT"
            java.lang.String r2 = "image/*"
            android.content.Intent r2 = m85270a(r2)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            android.os.Parcelable r2 = (android.os.Parcelable) r2     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            r10.putExtra(r11, r2)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            r9.startActivityForResult(r10, r0)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            return
        L_0x012a:
            java.lang.String r10 = "video/*"
            boolean r10 = kotlin.jvm.internal.C7573i.m23585a(r4, r10)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            if (r10 == 0) goto L_0x015f
            java.lang.String r10 = "camcorder"
            boolean r10 = kotlin.jvm.internal.C7573i.m23585a(r2, r10)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            if (r10 == 0) goto L_0x0142
            android.content.Intent r10 = m85273c()     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            r9.startActivityForResult(r10, r0)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            return
        L_0x0142:
            android.content.Intent[] r10 = new android.content.Intent[r1]     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            android.content.Intent r11 = m85273c()     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            r10[r3] = r11     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            android.content.Intent r10 = m85271a(r10)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            java.lang.String r11 = "android.intent.extra.INTENT"
            java.lang.String r2 = "video/*"
            android.content.Intent r2 = m85270a(r2)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            android.os.Parcelable r2 = (android.os.Parcelable) r2     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            r10.putExtra(r11, r2)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            r9.startActivityForResult(r10, r0)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            return
        L_0x015f:
            java.lang.String r10 = "audio/*"
            boolean r10 = kotlin.jvm.internal.C7573i.m23585a(r4, r10)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            if (r10 == 0) goto L_0x0194
            java.lang.String r10 = "microphone"
            boolean r10 = kotlin.jvm.internal.C7573i.m23585a(r2, r10)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            if (r10 == 0) goto L_0x0177
            android.content.Intent r10 = m85274d()     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            r9.startActivityForResult(r10, r0)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            return
        L_0x0177:
            android.content.Intent[] r10 = new android.content.Intent[r1]     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            android.content.Intent r11 = m85274d()     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            r10[r3] = r11     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            android.content.Intent r10 = m85271a(r10)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            java.lang.String r11 = "android.intent.extra.INTENT"
            java.lang.String r2 = "audio/*"
            android.content.Intent r2 = m85270a(r2)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            android.os.Parcelable r2 = (android.os.Parcelable) r2     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            r10.putExtra(r11, r2)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            r9.startActivityForResult(r10, r0)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            return
        L_0x0194:
            android.content.Intent r10 = r9.m85269a()     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            r9.startActivityForResult(r10, r0)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            return
        L_0x019c:
            kotlin.TypeCastException r10 = new kotlin.TypeCastException     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            java.lang.String r11 = "null cannot be cast to non-null type kotlin.Array<T>"
            r10.<init>(r11)     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
            throw r10     // Catch:{ ActivityNotFoundException -> 0x01a5, Exception -> 0x01a4 }
        L_0x01a4:
            return
        L_0x01a5:
            r9.f68657d = r1     // Catch:{ ActivityNotFoundException -> 0x01af }
            android.content.Intent r10 = r9.m85269a()     // Catch:{ ActivityNotFoundException -> 0x01af }
            r9.startActivityForResult(r10, r0)     // Catch:{ ActivityNotFoundException -> 0x01af }
            return
        L_0x01af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.crossplatform.platform.webview.UploadFileFragment.mo67415a(java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public final boolean mo67416a(WebView webView, ValueCallback<Uri[]> valueCallback, FileChooserParams fileChooserParams) {
        Context context;
        boolean z;
        String str;
        if (fileChooserParams == null) {
            return false;
        }
        Context context2 = null;
        if (webView != null) {
            context = webView.getContext();
        } else {
            context = null;
        }
        if (C43162f.m136885a(context) == 0) {
            if (webView != null) {
                context2 = webView.getContext();
            }
            if (C43162f.m136888c(context2) == 0) {
                this.f68655b = valueCallback;
                String[] acceptTypes = fileChooserParams.getAcceptTypes();
                C7573i.m23582a((Object) acceptTypes, "fileChooserParams.acceptTypes");
                if (acceptTypes.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    str = fileChooserParams.getAcceptTypes()[0];
                } else {
                    str = "";
                }
                mo67415a(str, "");
                return true;
            }
        }
        C22477b.m74364a(getActivity(), new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"}, new C25959b(this, valueCallback, fileChooserParams));
        return false;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        Uri uri;
        if (i == 2048 && !(this.f68654a == null && this.f68655b == null)) {
            if (i2 != 0 || !this.f68657d) {
                if (intent == null || i2 != -1) {
                    uri = null;
                } else {
                    uri = intent.getData();
                }
                if (uri == null && intent == null && i2 == -1) {
                    String str = this.f68656c;
                    if (str == null) {
                        C7573i.m23580a();
                    }
                    File file = new File(str);
                    if (file.exists()) {
                        uri = Uri.fromFile(file);
                        Context context = getContext();
                        if (context != null) {
                            context.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", uri));
                        }
                    }
                }
                if (this.f68654a != null) {
                    ValueCallback<Uri> valueCallback = this.f68654a;
                    if (valueCallback == null) {
                        C7573i.m23580a();
                    }
                    valueCallback.onReceiveValue(uri);
                    this.f68654a = null;
                }
                if (this.f68655b != null) {
                    ValueCallback<Uri[]> valueCallback2 = this.f68655b;
                    if (valueCallback2 == null) {
                        C7573i.m23580a();
                    }
                    valueCallback2.onReceiveValue(uri == null ? null : new Uri[]{uri});
                    this.f68655b = null;
                }
                this.f68657d = false;
            } else {
                this.f68657d = false;
            }
        }
    }
}
