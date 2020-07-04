package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.ads.internal.C14793ay;
import com.google.android.gms.common.util.C15333p;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@C6505uv
public final class bux extends Thread {

    /* renamed from: a */
    public boolean f43664a;

    /* renamed from: b */
    private boolean f43665b;

    /* renamed from: c */
    private final Object f43666c;

    /* renamed from: d */
    private final bus f43667d;

    /* renamed from: e */
    private final int f43668e;

    /* renamed from: f */
    private final int f43669f;

    /* renamed from: g */
    private final int f43670g;

    /* renamed from: h */
    private final int f43671h;

    /* renamed from: i */
    private final int f43672i;

    /* renamed from: j */
    private final int f43673j;

    /* renamed from: k */
    private final int f43674k;

    /* renamed from: l */
    private final int f43675l;

    /* renamed from: m */
    private final String f43676m;

    /* renamed from: n */
    private final boolean f43677n;

    public bux() {
        this(new bus());
    }

    private bux(bus bus) {
        this.f43667d = bus;
        this.f43666c = new Object();
        this.f43669f = ((Integer) bym.m50299d().mo41272a(C15585bw.f43744R)).intValue();
        this.f43670g = ((Integer) bym.m50299d().mo41272a(C15585bw.f43745S)).intValue();
        this.f43671h = ((Integer) bym.m50299d().mo41272a(C15585bw.f43746T)).intValue();
        this.f43672i = ((Integer) bym.m50299d().mo41272a(C15585bw.f43747U)).intValue();
        this.f43673j = ((Integer) bym.m50299d().mo41272a(C15585bw.f43749W)).intValue();
        this.f43674k = ((Integer) bym.m50299d().mo41272a(C15585bw.f43750X)).intValue();
        this.f43675l = ((Integer) bym.m50299d().mo41272a(C15585bw.f43751Y)).intValue();
        this.f43668e = ((Integer) bym.m50299d().mo41272a(C15585bw.f43748V)).intValue();
        this.f43676m = (String) bym.m50299d().mo41272a(C15585bw.f43780aa);
        this.f43677n = ((Boolean) bym.m50299d().mo41272a(C15585bw.f43781ab)).booleanValue();
        setName("ContentFetchTask");
    }

    /* renamed from: a */
    public final void mo41374a() {
        synchronized (this.f43666c) {
            if (this.f43665b) {
                acd.m45777b("Content hash thread already started, quiting...");
                return;
            }
            this.f43665b = true;
            start();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        com.google.android.gms.ads.internal.C14793ay.m42898d().mo39089a((java.lang.Throwable) r0, "ContentFetchTask.extractContent");
        com.google.android.gms.internal.ads.acd.m45777b("Failed getting root view of activity. Content not extracted.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007b, code lost:
        com.google.android.gms.internal.ads.acd.m45778b("Error in ContentFetchTask", r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0083 */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007a A[ExcHandler: InterruptedException (r0v1 'e' java.lang.InterruptedException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0083 A[LOOP:1: B:29:0x0083->B:41:0x0083, LOOP_START, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
        L_0x0000:
            boolean r0 = m50142d()     // Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
            if (r0 == 0) goto L_0x0059
            com.google.android.gms.internal.ads.but r0 = com.google.android.gms.ads.internal.C14793ay.m42897c()     // Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
            android.app.Activity r0 = r0.mo41360a()     // Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
            if (r0 != 0) goto L_0x0019
            java.lang.String r0 = "ContentFetchThread: no activity. Sleeping."
            com.google.android.gms.internal.ads.acd.m45777b(r0)     // Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
            r4.m50143e()     // Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
            goto L_0x0061
        L_0x0019:
            if (r0 == 0) goto L_0x0061
            r1 = 0
            android.view.Window r2 = r0.getWindow()     // Catch:{ Exception -> 0x003d, InterruptedException -> 0x007a }
            if (r2 == 0) goto L_0x004c
            android.view.Window r2 = r0.getWindow()     // Catch:{ Exception -> 0x003d, InterruptedException -> 0x007a }
            android.view.View r2 = r2.getDecorView()     // Catch:{ Exception -> 0x003d, InterruptedException -> 0x007a }
            if (r2 == 0) goto L_0x004c
            android.view.Window r0 = r0.getWindow()     // Catch:{ Exception -> 0x003d, InterruptedException -> 0x007a }
            android.view.View r0 = r0.getDecorView()     // Catch:{ Exception -> 0x003d, InterruptedException -> 0x007a }
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r2)     // Catch:{ Exception -> 0x003d, InterruptedException -> 0x007a }
            r1 = r0
            goto L_0x004c
        L_0x003d:
            r0 = move-exception
            com.google.android.gms.internal.ads.abp r2 = com.google.android.gms.ads.internal.C14793ay.m42898d()     // Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
            java.lang.String r3 = "ContentFetchTask.extractContent"
            r2.mo39089a(r0, r3)     // Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
            java.lang.String r0 = "Failed getting root view of activity. Content not extracted."
            com.google.android.gms.internal.ads.acd.m45777b(r0)     // Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
        L_0x004c:
            if (r1 == 0) goto L_0x0061
            if (r1 == 0) goto L_0x0061
            com.google.android.gms.internal.ads.buy r0 = new com.google.android.gms.internal.ads.buy     // Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
            r0.<init>(r4, r1)     // Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
            r1.post(r0)     // Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
            goto L_0x0061
        L_0x0059:
            java.lang.String r0 = "ContentFetchTask: sleeping"
            com.google.android.gms.internal.ads.acd.m45777b(r0)     // Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
            r4.m50143e()     // Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
        L_0x0061:
            int r0 = r4.f43668e     // Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
            int r0 = r0 * 1000
            long r0 = (long) r0     // Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
            goto L_0x0080
        L_0x006a:
            r0 = move-exception
            java.lang.String r1 = "Error in ContentFetchTask"
            com.google.android.gms.internal.ads.acd.m45778b(r1, r0)
            com.google.android.gms.internal.ads.abp r1 = com.google.android.gms.ads.internal.C14793ay.m42898d()
            java.lang.String r2 = "ContentFetchTask.run"
            r1.mo39089a(r0, r2)
            goto L_0x0080
        L_0x007a:
            r0 = move-exception
            java.lang.String r1 = "Error in ContentFetchTask"
            com.google.android.gms.internal.ads.acd.m45778b(r1, r0)
        L_0x0080:
            java.lang.Object r0 = r4.f43666c
            monitor-enter(r0)
        L_0x0083:
            boolean r1 = r4.f43664a     // Catch:{ all -> 0x0095 }
            if (r1 == 0) goto L_0x0092
            java.lang.String r1 = "ContentFetchTask: waiting"
            com.google.android.gms.internal.ads.acd.m45777b(r1)     // Catch:{ InterruptedException -> 0x0083 }
            java.lang.Object r1 = r4.f43666c     // Catch:{ InterruptedException -> 0x0083 }
            r1.wait()     // Catch:{ InterruptedException -> 0x0083 }
            goto L_0x0083
        L_0x0092:
            monitor-exit(r0)     // Catch:{ all -> 0x0095 }
            goto L_0x0000
        L_0x0095:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0095 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bux.run():void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo41375a(View view) {
        try {
            bur bur = new bur(this.f43669f, this.f43670g, this.f43671h, this.f43672i, this.f43673j, this.f43674k, this.f43675l);
            Context b = C14793ay.m42897c().mo41363b();
            if (b != null && !TextUtils.isEmpty(this.f43676m)) {
                String str = (String) view.getTag(b.getResources().getIdentifier((String) bym.m50299d().mo41272a(C15585bw.f43752Z), "id", b.getPackageName()));
                if (str != null && str.equals(this.f43676m)) {
                    return;
                }
            }
            bvb a = m50141a(view, bur);
            bur.mo41352e();
            if (a.f43688a != 0 || a.f43689b != 0) {
                if (a.f43689b != 0 || bur.f43631a != 0) {
                    if (a.f43689b != 0 || !this.f43667d.mo41357a(bur)) {
                        this.f43667d.mo41359c(bur);
                    }
                }
            }
        } catch (Exception e) {
            acd.m45778b("Exception in fetchContentOnUIThread", e);
            C14793ay.m42898d().mo39089a((Throwable) e, "ContentFetchTask.fetchContent");
        }
    }

    /* renamed from: d */
    private static boolean m50142d() {
        boolean z;
        try {
            Context b = C14793ay.m42897c().mo41363b();
            if (b == null) {
                return false;
            }
            ActivityManager activityManager = (ActivityManager) b.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) b.getSystemService("keyguard");
            if (activityManager != null) {
                if (keyguardManager != null) {
                    List runningAppProcesses = activityManager.getRunningAppProcesses();
                    if (runningAppProcesses == null) {
                        return false;
                    }
                    Iterator it = runningAppProcesses.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        RunningAppProcessInfo runningAppProcessInfo = (RunningAppProcessInfo) it.next();
                        if (Process.myPid() == runningAppProcessInfo.pid) {
                            if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode()) {
                                PowerManager powerManager = (PowerManager) b.getSystemService("power");
                                if (powerManager == null) {
                                    z = false;
                                } else {
                                    z = powerManager.isScreenOn();
                                }
                                if (z) {
                                    return true;
                                }
                            }
                        }
                    }
                    return false;
                }
            }
            return false;
        } catch (Throwable th) {
            C14793ay.m42898d().mo39089a(th, "ContentFetchTask.isInForeground");
            return false;
        }
    }

    /* renamed from: a */
    private final bvb m50141a(View view, bur bur) {
        boolean z;
        if (view == null) {
            return new bvb(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new bvb(this, 0, 0);
            }
            bur.mo41349b(text.toString(), globalVisibleRect, view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
            return new bvb(this, 1, 0);
        } else if ((view instanceof WebView) && !(view instanceof ami)) {
            bur.mo41351d();
            WebView webView = (WebView) view;
            if (!C15333p.m44598e()) {
                z = false;
            } else {
                bur.mo41351d();
                webView.post(new buz(this, bur, webView, globalVisibleRect));
                z = true;
            }
            if (z) {
                return new bvb(this, 0, 1);
            }
            return new bvb(this, 0, 0);
        } else if (!(view instanceof ViewGroup)) {
            return new bvb(this, 0, 0);
        } else {
            ViewGroup viewGroup = (ViewGroup) view;
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                bvb a = m50141a(viewGroup.getChildAt(i3), bur);
                i += a.f43688a;
                i2 += a.f43689b;
            }
            return new bvb(this, i, i2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo41376a(bur bur, WebView webView, String str, boolean z) {
        bur.mo41350c();
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (this.f43677n || TextUtils.isEmpty(webView.getTitle())) {
                    bur.mo41346a(optString, z, webView.getX(), webView.getY(), (float) webView.getWidth(), (float) webView.getHeight());
                } else {
                    String title = webView.getTitle();
                    StringBuilder sb = new StringBuilder(String.valueOf(title).length() + 1 + String.valueOf(optString).length());
                    sb.append(title);
                    sb.append("\n");
                    sb.append(optString);
                    bur.mo41346a(sb.toString(), z, webView.getX(), webView.getY(), (float) webView.getWidth(), (float) webView.getHeight());
                }
            }
            if (bur.mo41347a()) {
                this.f43667d.mo41358b(bur);
            }
        } catch (JSONException unused) {
            acd.m45777b("Json string may be malformed.");
        } catch (Throwable th) {
            acd.m45775a("Failed to get webview content.", th);
            C14793ay.m42898d().mo39089a(th, "ContentFetchTask.processWebViewContent");
        }
    }

    /* renamed from: b */
    public final bur mo41377b() {
        return this.f43667d.mo41356a();
    }

    /* renamed from: c */
    public final void mo41378c() {
        synchronized (this.f43666c) {
            this.f43664a = false;
            this.f43666c.notifyAll();
            acd.m45777b("ContentFetchThread: wakeup");
        }
    }

    /* renamed from: e */
    private final void m50143e() {
        synchronized (this.f43666c) {
            this.f43664a = true;
            boolean z = this.f43664a;
            StringBuilder sb = new StringBuilder(42);
            sb.append("ContentFetchThread: paused, mPause = ");
            sb.append(z);
            acd.m45777b(sb.toString());
        }
    }
}
