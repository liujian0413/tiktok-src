package com.facebook.appevents.codeless;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.view.View;
import com.C1642a;
import com.facebook.AccessToken;
import com.facebook.C13499h;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.C13090b;
import com.facebook.GraphResponse;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.internal.C13173c;
import com.facebook.internal.C13949t;
import com.facebook.internal.C13967z;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.appevents.codeless.e */
public class C13137e {

    /* renamed from: a */
    public static final String f34803a = C13137e.class.getCanonicalName();

    /* renamed from: f */
    private static C13137e f34804f;

    /* renamed from: b */
    public final Handler f34805b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public WeakReference<Activity> f34806c;

    /* renamed from: d */
    public Timer f34807d;

    /* renamed from: e */
    public String f34808e = null;

    /* renamed from: com.facebook.appevents.codeless.e$a */
    static class C13142a implements Callable<String> {

        /* renamed from: a */
        private WeakReference<View> f34814a;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public String call() {
            View view = (View) this.f34814a.get();
            if (view == null || view.getWidth() == 0 || view.getHeight() == 0) {
                return "";
            }
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Config.RGB_565);
            view.draw(new Canvas(createBitmap));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            createBitmap.compress(CompressFormat.JPEG, 10, byteArrayOutputStream);
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
        }

        C13142a(View view) {
            this.f34814a = new WeakReference<>(view);
        }
    }

    /* renamed from: a */
    public final void mo32311a() {
        final C131381 r0 = new TimerTask() {
            /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
            /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0071 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r7 = this;
                    com.facebook.appevents.codeless.e r0 = com.facebook.appevents.codeless.C13137e.this     // Catch:{ Exception -> 0x007b }
                    java.lang.ref.WeakReference<android.app.Activity> r0 = r0.f34806c     // Catch:{ Exception -> 0x007b }
                    java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x007b }
                    android.app.Activity r0 = (android.app.Activity) r0     // Catch:{ Exception -> 0x007b }
                    if (r0 != 0) goto L_0x000d
                    return
                L_0x000d:
                    java.lang.Class r1 = r0.getClass()     // Catch:{ Exception -> 0x007b }
                    java.lang.String r1 = r1.getSimpleName()     // Catch:{ Exception -> 0x007b }
                    android.view.Window r0 = r0.getWindow()     // Catch:{ Exception -> 0x007b }
                    android.view.View r0 = r0.getDecorView()     // Catch:{ Exception -> 0x007b }
                    android.view.View r0 = r0.getRootView()     // Catch:{ Exception -> 0x007b }
                    boolean r2 = com.facebook.appevents.codeless.C13127b.m38387d()     // Catch:{ Exception -> 0x007b }
                    if (r2 != 0) goto L_0x0028
                    return
                L_0x0028:
                    boolean r2 = com.facebook.internal.C13946r.m41124b()     // Catch:{ Exception -> 0x007b }
                    if (r2 == 0) goto L_0x0032
                    com.facebook.appevents.codeless.internal.C13147c.m38425a()     // Catch:{ Exception -> 0x007b }
                    return
                L_0x0032:
                    java.util.concurrent.FutureTask r2 = new java.util.concurrent.FutureTask     // Catch:{ Exception -> 0x007b }
                    com.facebook.appevents.codeless.e$a r3 = new com.facebook.appevents.codeless.e$a     // Catch:{ Exception -> 0x007b }
                    r3.<init>(r0)     // Catch:{ Exception -> 0x007b }
                    r2.<init>(r3)     // Catch:{ Exception -> 0x007b }
                    com.facebook.appevents.codeless.e r3 = com.facebook.appevents.codeless.C13137e.this     // Catch:{ Exception -> 0x007b }
                    android.os.Handler r3 = r3.f34805b     // Catch:{ Exception -> 0x007b }
                    r3.post(r2)     // Catch:{ Exception -> 0x007b }
                    java.lang.String r3 = ""
                    r4 = 1
                    java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ Exception -> 0x0050 }
                    java.lang.Object r2 = r2.get(r4, r6)     // Catch:{ Exception -> 0x0050 }
                    java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0050 }
                    goto L_0x0051
                L_0x0050:
                    r2 = r3
                L_0x0051:
                    org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x007b }
                    r3.<init>()     // Catch:{ Exception -> 0x007b }
                    java.lang.String r4 = "screenname"
                    r3.put(r4, r1)     // Catch:{ JSONException -> 0x0071 }
                    java.lang.String r1 = "screenshot"
                    r3.put(r1, r2)     // Catch:{ JSONException -> 0x0071 }
                    org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0071 }
                    r1.<init>()     // Catch:{ JSONException -> 0x0071 }
                    org.json.JSONObject r0 = com.facebook.appevents.codeless.internal.C13148d.m38429a(r0)     // Catch:{ JSONException -> 0x0071 }
                    r1.put(r0)     // Catch:{ JSONException -> 0x0071 }
                    java.lang.String r0 = "view"
                    r3.put(r0, r1)     // Catch:{ JSONException -> 0x0071 }
                L_0x0071:
                    java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x007b }
                    com.facebook.appevents.codeless.e r1 = com.facebook.appevents.codeless.C13137e.this     // Catch:{ Exception -> 0x007b }
                    r1.mo32312a(r0)     // Catch:{ Exception -> 0x007b }
                    return
                L_0x007b:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.codeless.C13137e.C131381.run():void");
            }
        };
        C13499h.m39719e().execute(new Runnable() {
            public final void run() {
                try {
                    if (C13137e.this.f34807d != null) {
                        C13137e.this.f34807d.cancel();
                    }
                    C13137e.this.f34808e = null;
                    C13137e.this.f34807d = new Timer();
                    C13137e.this.f34807d.scheduleAtFixedRate(r0, 0, 1000);
                } catch (Exception unused) {
                }
            }
        });
    }

    /* renamed from: b */
    public final void mo32313b() {
        if (!(((Activity) this.f34806c.get()) == null || this.f34807d == null)) {
            try {
                this.f34807d.cancel();
                this.f34807d = null;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo32312a(final String str) {
        C13499h.m39719e().execute(new Runnable() {
            public final void run() {
                String b = C13967z.m41252b(str);
                AccessToken a = AccessToken.m38225a();
                if (b == null || !b.equals(C13137e.this.f34808e)) {
                    GraphRequest a2 = C13137e.m38407a(str, a, C13499h.m39725k(), "app_indexing");
                    if (a2 != null) {
                        try {
                            JSONObject jSONObject = a2.mo31788a().f34702b;
                            if (jSONObject != null) {
                                if ("true".equals(jSONObject.optString("success"))) {
                                    C13949t.m41130a(LoggingBehavior.APP_EVENTS, C13137e.f34803a, "Successfully send UI component tree to server");
                                    C13137e.this.f34808e = b;
                                }
                                if (jSONObject.has("is_app_indexing_enabled")) {
                                    C13127b.m38381a(Boolean.valueOf(jSONObject.getBoolean("is_app_indexing_enabled")));
                                }
                            }
                        } catch (JSONException unused) {
                        }
                    }
                }
            }
        });
    }

    public C13137e(Activity activity) {
        this.f34806c = new WeakReference<>(activity);
        f34804f = this;
    }

    /* renamed from: a */
    public static GraphRequest m38407a(String str, AccessToken accessToken, String str2, String str3) {
        if (str == null) {
            return null;
        }
        GraphRequest a = GraphRequest.m38253a(accessToken, C1642a.m8035a(Locale.US, "%s/app_indexing", new Object[]{str2}), (JSONObject) null, (C13090b) null);
        Bundle bundle = a.f34680j;
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString("tree", str);
        bundle.putString("app_version", C13173c.m38495b());
        bundle.putString("platform", "android");
        bundle.putString("request_type", str3);
        if (str3.equals("app_indexing")) {
            bundle.putString("device_session_id", C13127b.m38385c());
        }
        a.f34680j = bundle;
        a.mo31789a((C13090b) new C13090b() {
            /* renamed from: a */
            public final void mo31792a(GraphResponse graphResponse) {
                C13949t.m41130a(LoggingBehavior.APP_EVENTS, C13137e.f34803a, "App index sent to FB!");
            }
        });
        return a;
    }
}
