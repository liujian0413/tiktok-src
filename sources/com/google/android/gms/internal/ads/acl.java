package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager.RunningTaskInfo;
import android.app.AlertDialog.Builder;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Debug;
import android.os.Debug.MemoryInfo;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import com.C1642a;
import com.google.android.gms.ads.internal.C14793ay;
import com.google.android.gms.common.p749d.C15176d;
import com.google.android.gms.common.util.C15324g;
import com.google.android.gms.common.util.C15329l;
import com.google.android.gms.common.util.C15333p;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C6505uv
public final class acl {

    /* renamed from: a */
    public static final Handler f40003a = new ace(Looper.getMainLooper());

    /* renamed from: b */
    private AtomicReference<Pattern> f40004b = new AtomicReference<>(null);

    /* renamed from: c */
    private AtomicReference<Pattern> f40005c = new AtomicReference<>(null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f40006d = true;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Object f40007e = new Object();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f40008f;

    /* renamed from: g */
    private boolean f40009g = false;

    /* renamed from: h */
    private boolean f40010h = false;

    /* renamed from: a */
    public final void mo39173a(Context context, String str, boolean z, HttpURLConnection httpURLConnection) {
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(60000);
        acm.m45587a(httpURLConnection, "User-Agent", mo39176b(context, str));
        httpURLConnection.setUseCaches(false);
    }

    /* renamed from: a */
    public static boolean m45534a(Context context) {
        boolean z;
        Context a = C16178xv.m52403a(context);
        Intent intent = new Intent();
        intent.setClassName(a, "com.google.android.gms.ads.AdActivity");
        boolean z2 = false;
        try {
            ResolveInfo resolveActivity = a.getPackageManager().resolveActivity(intent, 65536);
            if (resolveActivity == null || resolveActivity.activityInfo == null) {
                acd.m45783e("Could not find com.google.android.gms.ads.AdActivity, please make sure it is declared in AndroidManifest.xml.");
            } else {
                String str = "com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".";
                if ((resolveActivity.activityInfo.configChanges & 16) == 0) {
                    acd.m45783e(C1642a.m8034a(str, new Object[]{"keyboard"}));
                    z = false;
                } else {
                    z = true;
                }
                if ((resolveActivity.activityInfo.configChanges & 32) == 0) {
                    acd.m45783e(C1642a.m8034a(str, new Object[]{"keyboardHidden"}));
                    z = false;
                }
                if ((resolveActivity.activityInfo.configChanges & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) == 0) {
                    acd.m45783e(C1642a.m8034a(str, new Object[]{"orientation"}));
                    z = false;
                }
                if ((resolveActivity.activityInfo.configChanges & 256) == 0) {
                    acd.m45783e(C1642a.m8034a(str, new Object[]{"screenLayout"}));
                    z = false;
                }
                if ((resolveActivity.activityInfo.configChanges & 512) == 0) {
                    acd.m45783e(C1642a.m8034a(str, new Object[]{"uiMode"}));
                    z = false;
                }
                if ((resolveActivity.activityInfo.configChanges & PreloadTask.BYTE_UNIT_NUMBER) == 0) {
                    acd.m45783e(C1642a.m8034a(str, new Object[]{"screenSize"}));
                    z = false;
                }
                if ((resolveActivity.activityInfo.configChanges & 2048) == 0) {
                    acd.m45783e(C1642a.m8034a(str, new Object[]{"smallestScreenSize"}));
                } else {
                    z2 = z;
                }
            }
            return z2;
        } catch (Exception e) {
            acd.m45780c("Could not verify that com.google.android.gms.ads.AdActivity is declared in AndroidManifest.xml", e);
            C14793ay.m42898d().mo39089a((Throwable) e, "AdUtil.hasAdActivity");
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m45535a(Context context, String str) {
        Context a = C16178xv.m52403a(context);
        return C15176d.m44159a(a).mo38461a(str, a.getPackageName()) == 0;
    }

    /* renamed from: a */
    public static void m45529a(Context context, String str, List<String> list) {
        for (String aep : list) {
            new aep(context, str, aep).mo39128c();
        }
    }

    /* renamed from: a */
    public static void m45528a(Context context, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        m45529a(context, str, (List<String>) arrayList);
    }

    /* renamed from: a */
    public final void mo39174a(Context context, List<String> list) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (!TextUtils.isEmpty(bct.m48438a(activity))) {
                if (list == null) {
                    acd.m45438a("Cannot ping urls: empty list.");
                } else if (!C15610cu.m50382a(context)) {
                    acd.m45438a("Cannot ping url because custom tabs is not supported");
                } else {
                    C15610cu cuVar = new C15610cu();
                    cuVar.f44237a = new acq(this, list, cuVar, context);
                    cuVar.mo41471b(activity);
                }
            }
        }
    }

    /* renamed from: a */
    public static String m45521a(InputStreamReader inputStreamReader) throws IOException {
        StringBuilder sb = new StringBuilder(VideoCacheReadBuffersizeExperiment.DEFAULT);
        char[] cArr = new char[2048];
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (read == -1) {
                return sb.toString();
            }
            sb.append(cArr, 0, read);
        }
    }

    /* renamed from: b */
    public final boolean mo39178b(Context context) {
        if (this.f40009g) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.getApplicationContext().registerReceiver(new acu(this, null), intentFilter);
        this.f40009g = true;
        return true;
    }

    /* renamed from: c */
    public final boolean mo39179c(Context context) {
        if (this.f40010h) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        context.getApplicationContext().registerReceiver(new act(this, null), intentFilter);
        this.f40010h = true;
        return true;
    }

    /* renamed from: a */
    public final void mo39171a(Context context, String str, WebSettings webSettings) {
        webSettings.setUserAgentString(mo39176b(context, str));
    }

    /* renamed from: d */
    private static String m45553d() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        if (VERSION.RELEASE != null) {
            sb.append(" ");
            sb.append(VERSION.RELEASE);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        if (Build.DEVICE != null) {
            sb.append("; ");
            sb.append(Build.DEVICE);
            if (Build.DISPLAY != null) {
                sb.append(" Build/");
                sb.append(Build.DISPLAY);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0038, code lost:
        continue;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x001d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0042 */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0025 A[Catch:{ Exception -> 0x00b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0056 A[Catch:{ Exception -> 0x00b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005b A[Catch:{ Exception -> 0x00b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a4 A[Catch:{ Exception -> 0x00b3 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo39176b(android.content.Context r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f40007e
            monitor-enter(r0)
            java.lang.String r1 = r4.f40008f     // Catch:{ all -> 0x00cf }
            if (r1 == 0) goto L_0x000b
            java.lang.String r5 = r4.f40008f     // Catch:{ all -> 0x00cf }
            monitor-exit(r0)     // Catch:{ all -> 0x00cf }
            return r5
        L_0x000b:
            if (r6 != 0) goto L_0x0013
            java.lang.String r5 = m45553d()     // Catch:{ all -> 0x00cf }
            monitor-exit(r0)     // Catch:{ all -> 0x00cf }
            return r5
        L_0x0013:
            com.google.android.gms.internal.ads.acv r1 = com.google.android.gms.ads.internal.C14793ay.m42896b()     // Catch:{ Exception -> 0x001d }
            java.lang.String r1 = r1.mo39195a(r5)     // Catch:{ Exception -> 0x001d }
            r4.f40008f = r1     // Catch:{ Exception -> 0x001d }
        L_0x001d:
            java.lang.String r1 = r4.f40008f     // Catch:{ all -> 0x00cf }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x00cf }
            if (r1 == 0) goto L_0x006b
            boolean r1 = com.google.android.gms.internal.ads.afb.m45734b()     // Catch:{ all -> 0x00cf }
            if (r1 != 0) goto L_0x0065
            r1 = 0
            r4.f40008f = r1     // Catch:{ all -> 0x00cf }
            android.os.Handler r1 = f40003a     // Catch:{ all -> 0x00cf }
            com.google.android.gms.internal.ads.acr r2 = new com.google.android.gms.internal.ads.acr     // Catch:{ all -> 0x00cf }
            r2.<init>(r4, r5)     // Catch:{ all -> 0x00cf }
            r1.post(r2)     // Catch:{ all -> 0x00cf }
        L_0x0038:
            java.lang.String r1 = r4.f40008f     // Catch:{ all -> 0x00cf }
            if (r1 != 0) goto L_0x006b
            java.lang.Object r1 = r4.f40007e     // Catch:{ InterruptedException -> 0x0042 }
            r1.wait()     // Catch:{ InterruptedException -> 0x0042 }
            goto L_0x0038
        L_0x0042:
            java.lang.String r1 = m45553d()     // Catch:{ all -> 0x00cf }
            r4.f40008f = r1     // Catch:{ all -> 0x00cf }
            java.lang.String r1 = "Interrupted, use default user agent: "
            java.lang.String r2 = r4.f40008f     // Catch:{ all -> 0x00cf }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x00cf }
            int r3 = r2.length()     // Catch:{ all -> 0x00cf }
            if (r3 == 0) goto L_0x005b
            java.lang.String r1 = r1.concat(r2)     // Catch:{ all -> 0x00cf }
            goto L_0x0061
        L_0x005b:
            java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x00cf }
            r2.<init>(r1)     // Catch:{ all -> 0x00cf }
            r1 = r2
        L_0x0061:
            com.google.android.gms.internal.ads.acd.m45783e(r1)     // Catch:{ all -> 0x00cf }
            goto L_0x0038
        L_0x0065:
            java.lang.String r1 = m45554d(r5)     // Catch:{ all -> 0x00cf }
            r4.f40008f = r1     // Catch:{ all -> 0x00cf }
        L_0x006b:
            java.lang.String r1 = r4.f40008f     // Catch:{ all -> 0x00cf }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00cf }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00cf }
            int r2 = r2.length()     // Catch:{ all -> 0x00cf }
            int r2 = r2 + 10
            java.lang.String r3 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x00cf }
            int r3 = r3.length()     // Catch:{ all -> 0x00cf }
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00cf }
            r3.<init>(r2)     // Catch:{ all -> 0x00cf }
            r3.append(r1)     // Catch:{ all -> 0x00cf }
            java.lang.String r1 = " (Mobile; "
            r3.append(r1)     // Catch:{ all -> 0x00cf }
            r3.append(r6)     // Catch:{ all -> 0x00cf }
            java.lang.String r6 = r3.toString()     // Catch:{ all -> 0x00cf }
            r4.f40008f = r6     // Catch:{ all -> 0x00cf }
            com.google.android.gms.common.d.b r5 = com.google.android.gms.common.p749d.C15176d.m44159a(r5)     // Catch:{ Exception -> 0x00b3 }
            boolean r5 = r5.mo38464a()     // Catch:{ Exception -> 0x00b3 }
            if (r5 == 0) goto L_0x00bd
            java.lang.String r5 = r4.f40008f     // Catch:{ Exception -> 0x00b3 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x00b3 }
            java.lang.String r6 = ";aia"
            java.lang.String r5 = r5.concat(r6)     // Catch:{ Exception -> 0x00b3 }
            r4.f40008f = r5     // Catch:{ Exception -> 0x00b3 }
            goto L_0x00bd
        L_0x00b3:
            r5 = move-exception
            com.google.android.gms.internal.ads.abp r6 = com.google.android.gms.ads.internal.C14793ay.m42898d()     // Catch:{ all -> 0x00cf }
            java.lang.String r1 = "AdUtil.getUserAgent"
            r6.mo39089a(r5, r1)     // Catch:{ all -> 0x00cf }
        L_0x00bd:
            java.lang.String r5 = r4.f40008f     // Catch:{ all -> 0x00cf }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x00cf }
            java.lang.String r6 = ")"
            java.lang.String r5 = r5.concat(r6)     // Catch:{ all -> 0x00cf }
            r4.f40008f = r5     // Catch:{ all -> 0x00cf }
            java.lang.String r5 = r4.f40008f     // Catch:{ all -> 0x00cf }
            monitor-exit(r0)     // Catch:{ all -> 0x00cf }
            return r5
        L_0x00cf:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00cf }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.acl.mo39176b(android.content.Context, java.lang.String):java.lang.String");
    }

    /* renamed from: d */
    protected static String m45554d(Context context) {
        try {
            return new WebView(context).getSettings().getUserAgentString();
        } catch (Throwable unused) {
            return m45553d();
        }
    }

    /* renamed from: a */
    public static String m45522a(String str) {
        return Uri.parse(str).buildUpon().query(null).build().toString();
    }

    /* renamed from: a */
    public final JSONObject mo39170a(Map<String, ?> map) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                m45533a(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e) {
            String str2 = "Could not convert map to JSON: ";
            String valueOf = String.valueOf(e.getMessage());
            throw new JSONException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
    }

    /* renamed from: a */
    public final JSONObject mo39169a(Bundle bundle, JSONObject jSONObject) {
        if (bundle == null) {
            return null;
        }
        try {
            return m45525a(bundle);
        } catch (JSONException e) {
            acd.m45778b("Error converting Bundle to JSON", e);
            return null;
        }
    }

    /* renamed from: a */
    private final JSONObject m45525a(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            m45533a(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    /* renamed from: a */
    private final JSONArray m45524a(Collection<?> collection) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (Object a : collection) {
            m45532a(jSONArray, a);
        }
        return jSONArray;
    }

    /* renamed from: a */
    private final void m45532a(JSONArray jSONArray, Object obj) throws JSONException {
        if (obj instanceof Bundle) {
            jSONArray.put(m45525a((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONArray.put(mo39170a((Map) obj));
        } else if (obj instanceof Collection) {
            jSONArray.put(m45524a((Collection) obj));
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            JSONArray jSONArray2 = new JSONArray();
            for (Object a : objArr) {
                m45532a(jSONArray2, a);
            }
            jSONArray.put(jSONArray2);
        } else {
            jSONArray.put(obj);
        }
    }

    /* renamed from: a */
    private final void m45533a(JSONObject jSONObject, String str, Object obj) throws JSONException {
        if (obj instanceof Bundle) {
            jSONObject.put(str, m45525a((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONObject.put(str, mo39170a((Map) obj));
        } else if (obj instanceof Collection) {
            if (str == null) {
                str = TEVideoRecorder.FACE_BEAUTY_NULL;
            }
            jSONObject.put(str, m45524a((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONObject.put(str, m45524a((Collection<?>) Arrays.asList((Object[]) obj)));
        } else {
            jSONObject.put(str, obj);
        }
    }

    /* renamed from: a */
    private static int m45511a(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'A' && c <= 'F') {
            return (c - 'A') + 10;
        }
        if (c >= 'a' && c <= 'f') {
            return (c - 'a') + 10;
        }
        throw new IllegalArgumentException("Invalid Hex.");
    }

    /* renamed from: a */
    public static Map<String, String> m45523a(Uri uri) {
        if (!((Boolean) bym.m50299d().mo41272a(C15585bw.f43943de)).booleanValue()) {
            if (uri == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            for (String str : uri.getQueryParameterNames()) {
                hashMap.put(str, uri.getQueryParameter(str));
            }
            return hashMap;
        } else if (uri == null) {
            return null;
        } else {
            HashMap hashMap2 = new HashMap(20);
            String encodedQuery = uri.getEncodedQuery();
            if (encodedQuery == null) {
                return hashMap2;
            }
            int length = encodedQuery.length();
            StringBuilder sb = new StringBuilder(100);
            StringBuilder sb2 = new StringBuilder(length);
            StringBuilder sb3 = sb;
            int i = 0;
            while (i < length) {
                char charAt = encodedQuery.charAt(i);
                if (charAt == '+') {
                    sb3.append(' ');
                } else if (charAt != '=') {
                    switch (charAt) {
                        case '%':
                            byte[] bArr = new byte[((length - i) / 3)];
                            int i2 = 0;
                            while (i < length - 2 && charAt == '%') {
                                try {
                                    bArr[i2] = (byte) ((m45511a(encodedQuery.charAt(i + 1)) << 4) + m45511a(encodedQuery.charAt(i + 2)));
                                    i2++;
                                } catch (IllegalArgumentException unused) {
                                }
                                i += 3;
                                if (i < length) {
                                    charAt = encodedQuery.charAt(i);
                                }
                            }
                            try {
                                sb3.append(new String(bArr, 0, i2, "UTF-8"));
                            } catch (UnsupportedEncodingException unused2) {
                            }
                            if (charAt == '%') {
                                break;
                            } else {
                                sb3.append(charAt);
                                break;
                            }
                            break;
                        case '&':
                            if (sb.length() > 0 && sb3 != sb) {
                                hashMap2.put(sb.toString(), sb2.toString());
                                sb.setLength(0);
                                sb2.setLength(0);
                            }
                            sb3 = sb;
                            break;
                        default:
                            sb3.append(charAt);
                            break;
                    }
                } else if (sb3 != sb2) {
                    sb3 = sb2;
                } else {
                    sb3.append(charAt);
                }
                i++;
            }
            if (sb.length() > 0 && sb3 != sb) {
                hashMap2.put(sb.toString(), sb2.toString());
            }
            return hashMap2;
        }
    }

    /* renamed from: a */
    public static String m45518a() {
        return UUID.randomUUID().toString();
    }

    /* renamed from: b */
    public static int m45540b(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
            sb.append("Could not parse value:");
            sb.append(valueOf);
            acd.m45783e(sb.toString());
            return 0;
        }
    }

    /* renamed from: b */
    public static String m45542b() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: e */
    private static int[] m45557e() {
        return new int[]{0, 0};
    }

    /* renamed from: a */
    public static int[] m45539a(Activity activity) {
        Window window = activity.getWindow();
        if (window != null) {
            View findViewById = window.findViewById(16908290);
            if (findViewById != null) {
                return new int[]{findViewById.getWidth(), findViewById.getHeight()};
            }
        }
        return m45557e();
    }

    /* renamed from: b */
    public static int[] m45545b(Activity activity) {
        int[] a = m45539a(activity);
        return new int[]{afb.m45731b((Context) activity, a[0]), afb.m45731b((Context) activity, a[1])};
    }

    /* renamed from: c */
    public static int[] m45551c(Activity activity) {
        int[] iArr;
        Window window = activity.getWindow();
        if (window != null) {
            View findViewById = window.findViewById(16908290);
            if (findViewById != null) {
                iArr = new int[]{findViewById.getTop(), findViewById.getBottom()};
                return new int[]{afb.m45731b((Context) activity, iArr[0]), afb.m45731b((Context) activity, iArr[1])};
            }
        }
        iArr = m45557e();
        return new int[]{afb.m45731b((Context) activity, iArr[0]), afb.m45731b((Context) activity, iArr[1])};
    }

    /* renamed from: c */
    public static boolean m45550c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)");
    }

    /* renamed from: a */
    public static DisplayMetrics m45514a(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    /* renamed from: e */
    public static Builder m45555e(Context context) {
        return new Builder(context);
    }

    /* renamed from: f */
    public static C15569bh m45559f(Context context) {
        return new C15569bh(context);
    }

    /* renamed from: a */
    public static Bitmap m45512a(View view) {
        view.setDrawingCacheEnabled(true);
        Bitmap createBitmap = Bitmap.createBitmap(view.getDrawingCache());
        view.setDrawingCacheEnabled(false);
        return createBitmap;
    }

    /* renamed from: a */
    public static PopupWindow m45516a(View view, int i, int i2, boolean z) {
        return new PopupWindow(view, i, i2, false);
    }

    /* renamed from: p */
    private static String m45568p(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null) {
                return null;
            }
            List runningTasks = activityManager.getRunningTasks(1);
            if (runningTasks != null && !runningTasks.isEmpty()) {
                RunningTaskInfo runningTaskInfo = (RunningTaskInfo) runningTasks.get(0);
                if (!(runningTaskInfo == null || runningTaskInfo.topActivity == null)) {
                    return runningTaskInfo.topActivity.getClassName();
                }
            }
            return null;
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static String m45519a(Context context, View view, zzyz zzyz) {
        if (!((Boolean) bym.m50299d().mo41272a(C15585bw.f43784ae)).booleanValue()) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", zzyz.f45802e);
            jSONObject2.put("height", zzyz.f45799b);
            jSONObject.put("size", jSONObject2);
            jSONObject.put("activity", m45568p(context));
            if (!zzyz.f45801d) {
                JSONArray jSONArray = new JSONArray();
                while (view != null) {
                    ViewParent parent = view.getParent();
                    if (parent != null) {
                        int i = -1;
                        if (parent instanceof ViewGroup) {
                            i = ((ViewGroup) parent).indexOfChild(view);
                        }
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("type", parent.getClass().getName());
                        jSONObject3.put("index_of_child", i);
                        jSONArray.put(jSONObject3);
                    }
                    view = (parent == null || !(parent instanceof View)) ? null : (View) parent;
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put("parents", jSONArray);
                }
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            acd.m45780c("Fail to get view hierarchy json", e);
            return null;
        }
    }

    /* renamed from: g */
    public static boolean m45561g(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
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
                            if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && m45569q(context)) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: h */
    public static boolean m45562h(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
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
                            if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && m45569q(context)) {
                                return false;
                            }
                        }
                    }
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: q */
    private static boolean m45569q(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            return false;
        }
        return powerManager.isScreenOn();
    }

    /* renamed from: a */
    public final void mo39172a(Context context, String str, String str2, Bundle bundle, boolean z) {
        if (z) {
            bundle.putString("device", m45542b());
            bundle.putString("eids", TextUtils.join(",", C15585bw.m50187a()));
        }
        afb.m45727a(context, str, str2, bundle, z, new acs(this, context, str));
    }

    /* renamed from: b */
    public final void mo39177b(Context context, String str, String str2, Bundle bundle, boolean z) {
        if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43844bl)).booleanValue()) {
            mo39172a(context, str, str2, bundle, z);
        }
    }

    /* renamed from: a */
    public static void m45531a(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            runnable.run();
        } else {
            acj.m45508a(runnable);
        }
    }

    /* renamed from: b */
    public static Bitmap m45541b(View view) {
        if (view == null) {
            return null;
        }
        Bitmap f = m45558f(view);
        if (f == null) {
            f = m45556e(view);
        }
        return f;
    }

    /* renamed from: e */
    private static Bitmap m45556e(View view) {
        try {
            int width = view.getWidth();
            int height = view.getHeight();
            if (width != 0) {
                if (height != 0) {
                    Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Config.RGB_565);
                    Canvas canvas = new Canvas(createBitmap);
                    view.layout(0, 0, width, height);
                    view.draw(canvas);
                    return createBitmap;
                }
            }
            acd.m45783e("Width or height of view is zero");
            return null;
        } catch (RuntimeException e) {
            acd.m45778b("Fail to capture the webview", e);
            return null;
        }
    }

    /* renamed from: f */
    private static Bitmap m45558f(View view) {
        Bitmap bitmap = null;
        try {
            boolean isDrawingCacheEnabled = view.isDrawingCacheEnabled();
            view.setDrawingCacheEnabled(true);
            Bitmap drawingCache = view.getDrawingCache();
            if (drawingCache != null) {
                bitmap = Bitmap.createBitmap(drawingCache);
            }
            view.setDrawingCacheEnabled(isDrawingCacheEnabled);
        } catch (RuntimeException e) {
            acd.m45778b("Fail to capture the web view", e);
        }
        return bitmap;
    }

    /* renamed from: i */
    public static Bitmap m45563i(Context context) {
        Bitmap bitmap = null;
        if (!(context instanceof Activity)) {
            return null;
        }
        try {
            Window window = ((Activity) context).getWindow();
            if (window != null) {
                bitmap = m45558f(window.getDecorView().getRootView());
            }
        } catch (RuntimeException e) {
            acd.m45778b("Fail to capture screen shot", e);
        }
        return bitmap;
    }

    /* renamed from: a */
    public static void m45526a(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    /* renamed from: j */
    public static int m45564j(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null) {
            return 0;
        }
        return applicationInfo.targetSdkVersion;
    }

    /* renamed from: a */
    public final boolean mo39175a(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        return m45536a(view, applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null, m45570r(context));
    }

    /* renamed from: r */
    private static KeyguardManager m45570r(Context context) {
        Object systemService = context.getSystemService("keyguard");
        if (systemService == null || !(systemService instanceof KeyguardManager)) {
            return null;
        }
        return (KeyguardManager) systemService;
    }

    /* renamed from: a */
    public static boolean m45536a(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z;
        boolean z2;
        if (!C14793ay.m42895a().f40006d) {
            if (keyguardManager == null) {
                z2 = false;
            } else {
                z2 = keyguardManager.inKeyguardRestrictedInputMode();
            }
            if (z2 && !m45549c(view)) {
                z = false;
                if (view.getVisibility() == 0 && view.isShown()) {
                    if ((powerManager != null || powerManager.isScreenOn()) && z) {
                        if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43838bf)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) {
                            return true;
                        }
                    }
                }
                return false;
            }
        }
        z = true;
        if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43838bf)).booleanValue()) {
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m45549c(android.view.View r2) {
        /*
            android.view.View r2 = r2.getRootView()
            r0 = 0
            if (r2 == 0) goto L_0x0012
            android.content.Context r2 = r2.getContext()
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0012
            android.app.Activity r2 = (android.app.Activity) r2
            goto L_0x0013
        L_0x0012:
            r2 = r0
        L_0x0013:
            r1 = 0
            if (r2 != 0) goto L_0x0017
            return r1
        L_0x0017:
            android.view.Window r2 = r2.getWindow()
            if (r2 != 0) goto L_0x001e
            goto L_0x0022
        L_0x001e:
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
        L_0x0022:
            if (r0 == 0) goto L_0x002d
            int r2 = r0.flags
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x002d
            r2 = 1
            return r2
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.acl.m45549c(android.view.View):boolean");
    }

    /* renamed from: k */
    public static boolean m45565k(Context context) {
        if (context == null || !C15333p.m44595b()) {
            return false;
        }
        KeyguardManager r = m45570r(context);
        if (r == null || !r.isKeyguardLocked()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static int m45552d(View view) {
        if (view == null) {
            return -1;
        }
        ViewParent parent = view.getParent();
        while (parent != null && !(parent instanceof AdapterView)) {
            parent = parent.getParent();
        }
        if (parent == null) {
            return -1;
        }
        return ((AdapterView) parent).getPositionForView(view);
    }

    /* renamed from: l */
    public static boolean m45566l(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            acd.m45778b("Error loading class.", th);
            C14793ay.m42898d().mo39089a(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    /* renamed from: c */
    public static Bundle m45546c() {
        Bundle bundle = new Bundle();
        try {
            if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43732F)).booleanValue()) {
                MemoryInfo memoryInfo = new MemoryInfo();
                Debug.getMemoryInfo(memoryInfo);
                bundle.putParcelable("debug_memory_info", memoryInfo);
            }
            Runtime runtime = Runtime.getRuntime();
            bundle.putLong("runtime_free_memory", runtime.freeMemory());
            bundle.putLong("runtime_max_memory", runtime.maxMemory());
            bundle.putLong("runtime_total_memory", runtime.totalMemory());
            bundle.putInt("web_view_count", C14793ay.m42898d().mo39099i());
        } catch (Exception e) {
            acd.m45780c("Unable to gather memory stats", e);
        }
        return bundle;
    }

    /* renamed from: a */
    public static void m45527a(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            m45543b(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            String uri2 = uri.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(uri2).length() + 26);
            sb.append("Opening ");
            sb.append(uri2);
            sb.append(" in a new browser.");
            acd.m45777b(sb.toString());
        } catch (ActivityNotFoundException e) {
            acd.m45778b("No browser is found.", e);
        }
    }

    /* renamed from: b */
    public static void m45543b(Context context, Intent intent) {
        if (intent != null && C15333p.m44597d()) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            extras.putBinder("android.support.customtabs.extra.SESSION", null);
            extras.putString("com.android.browser.application_id", context.getPackageName());
            intent.putExtras(extras);
        }
    }

    /* renamed from: b */
    public static void m45544b(Context context, String str, String str2) {
        try {
            FileOutputStream openFileOutput = context.openFileOutput(str, 0);
            openFileOutput.write(str2.getBytes("UTF-8"));
            openFileOutput.close();
        } catch (Exception e) {
            acd.m45778b("Error writing to file in internal storage.", e);
        }
    }

    /* renamed from: c */
    public static String m45548c(Context context, String str) {
        try {
            return new String(C15329l.m44590a(context.openFileInput(str), true), "UTF-8");
        } catch (IOException unused) {
            acd.m45777b("Error reading from internal storage.");
            return "";
        }
    }

    /* renamed from: d */
    public final boolean mo39180d(String str) {
        return m45538a(str, this.f40004b, (String) bym.m50299d().mo41272a(C15585bw.f43786ag));
    }

    /* renamed from: e */
    public final boolean mo39181e(String str) {
        return m45538a(str, this.f40005c, (String) bym.m50299d().mo41272a(C15585bw.f43787ah));
    }

    /* renamed from: a */
    private static boolean m45538a(String str, AtomicReference<Pattern> atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern pattern = (Pattern) atomicReference.get();
            if (pattern == null || !str2.equals(pattern.pattern())) {
                pattern = Pattern.compile(str2);
                atomicReference.set(pattern);
            }
            return pattern.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static Bundle m45513a(bux bux) {
        String str;
        String str2;
        String str3;
        if (bux == null) {
            return null;
        }
        if (C14793ay.m42898d().mo39100j().mo39146c() && C14793ay.m42898d().mo39100j().mo39150e()) {
            return null;
        }
        if (bux.f43664a) {
            bux.mo41378c();
        }
        bur b = bux.mo41377b();
        if (b != null) {
            str3 = b.f43634d;
            str2 = b.f43635e;
            str = b.f43636f;
            if (str3 != null) {
                C14793ay.m42898d().mo39100j().mo39136a(str3);
            }
            if (str != null) {
                C14793ay.m42898d().mo39100j().mo39141b(str);
            }
        } else {
            str3 = C14793ay.m42898d().mo39100j().mo39147d();
            str = C14793ay.m42898d().mo39100j().mo39152f();
            str2 = null;
        }
        Bundle bundle = new Bundle(1);
        if (str != null && !C14793ay.m42898d().mo39100j().mo39150e()) {
            bundle.putString("v_fp_vertical", str);
        }
        if (str3 != null && !C14793ay.m42898d().mo39100j().mo39146c()) {
            bundle.putString("fingerprint", str3);
            if (!str3.equals(str2)) {
                bundle.putString("v_fp", str2);
            }
        }
        if (!bundle.isEmpty()) {
            return bundle;
        }
        return null;
    }

    /* renamed from: c */
    public static WebResourceResponse m45547c(Context context, String str, String str2) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("User-Agent", C14793ay.m42895a().mo39176b(context, str));
            hashMap.put("Cache-Control", "max-stale=3600");
            String str3 = (String) new aea(context).mo39247a(str2, (Map<String, String>) hashMap).get(60, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes("UTF-8")));
            }
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e) {
            acd.m45780c("Could not fetch MRAID JS.", e);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0079  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.webkit.WebResourceResponse m45515a(java.net.HttpURLConnection r10) throws java.io.IOException {
        /*
            java.lang.String r0 = r10.getContentType()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r1 == 0) goto L_0x000f
            java.lang.String r0 = ""
        L_0x000d:
            r4 = r0
            goto L_0x001c
        L_0x000f:
            java.lang.String r1 = ";"
            java.lang.String[] r0 = r0.split(r1)
            r0 = r0[r2]
            java.lang.String r0 = r0.trim()
            goto L_0x000d
        L_0x001c:
            java.lang.String r0 = r10.getContentType()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x005b
            java.lang.String r1 = ";"
            java.lang.String[] r0 = r0.split(r1)
            int r1 = r0.length
            r3 = 1
            if (r1 == r3) goto L_0x005b
            r1 = 1
        L_0x0031:
            int r5 = r0.length
            if (r1 >= r5) goto L_0x005b
            r5 = r0[r1]
            java.lang.String r5 = r5.trim()
            java.lang.String r6 = "charset"
            boolean r5 = r5.startsWith(r6)
            if (r5 == 0) goto L_0x0058
            r5 = r0[r1]
            java.lang.String r5 = r5.trim()
            java.lang.String r6 = "="
            java.lang.String[] r5 = r5.split(r6)
            int r6 = r5.length
            if (r6 <= r3) goto L_0x0058
            r0 = r5[r3]
            java.lang.String r0 = r0.trim()
            goto L_0x005d
        L_0x0058:
            int r1 = r1 + 1
            goto L_0x0031
        L_0x005b:
            java.lang.String r0 = ""
        L_0x005d:
            r5 = r0
            java.util.Map r0 = r10.getHeaderFields()
            java.util.HashMap r8 = new java.util.HashMap
            int r1 = r0.size()
            r8.<init>(r1)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0073:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00ad
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r1.getKey()
            if (r3 == 0) goto L_0x0073
            java.lang.Object r3 = r1.getValue()
            if (r3 == 0) goto L_0x0073
            java.lang.Object r3 = r1.getValue()
            java.util.List r3 = (java.util.List) r3
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x0073
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            r8.put(r3, r1)
            goto L_0x0073
        L_0x00ad:
            com.google.android.gms.internal.ads.acv r3 = com.google.android.gms.ads.internal.C14793ay.m42896b()
            int r6 = r10.getResponseCode()
            java.lang.String r7 = r10.getResponseMessage()
            java.io.InputStream r9 = com.google.android.gms.internal.ads.acm.m45586a(r10)
            android.webkit.WebResourceResponse r10 = r3.mo39193a(r4, r5, r6, r7, r8, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.acl.m45515a(java.net.HttpURLConnection):android.webkit.WebResourceResponse");
    }

    /* renamed from: a */
    public static void m45530a(Context context, Throwable th) {
        if (context != null) {
            boolean z = false;
            try {
                z = ((Boolean) bym.m50299d().mo41272a(C15585bw.f44016f)).booleanValue();
            } catch (IllegalStateException unused) {
            }
            if (z) {
                C15324g.m44572a(context, th);
            }
        }
    }

    /* renamed from: m */
    public final String mo39182m(Context context) {
        if (!((Boolean) bym.m50299d().mo41272a(C15585bw.f43939da)).booleanValue()) {
            return "";
        }
        try {
            return (String) acj.m45509a((Callable<T>) new acn<T>(this, context)).get();
        } catch (InterruptedException unused) {
            Thread.interrupted();
            return "";
        } catch (ExecutionException unused2) {
            return "";
        }
    }

    /* renamed from: n */
    public final Bundle mo39183n(Context context) {
        if (!((Boolean) bym.m50299d().mo41272a(C15585bw.f43940db)).booleanValue()) {
            return null;
        }
        try {
            return (Bundle) acj.m45509a((Callable<T>) new aco<T>(this, context)).get();
        } catch (InterruptedException unused) {
            Thread.interrupted();
            return null;
        } catch (ExecutionException unused2) {
            return null;
        }
    }

    /* renamed from: o */
    public static boolean m45567o(Context context) {
        if (!(context instanceof Activity)) {
            return false;
        }
        Window window = ((Activity) context).getWindow();
        if (window == null || window.getDecorView() == null) {
            return false;
        }
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        window.getDecorView().getGlobalVisibleRect(rect, null);
        window.getDecorView().getWindowVisibleDisplayFrame(rect2);
        if (rect.bottom == 0 || rect2.bottom == 0 || rect.top != rect2.top) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static boolean m45560f(String str) {
        if (!afg.m45762c()) {
            return false;
        }
        if (!((Boolean) bym.m50299d().mo41272a(C15585bw.f43869cJ)).booleanValue()) {
            return false;
        }
        String str2 = (String) bym.m50299d().mo41272a(C15585bw.f43871cL);
        if (!str2.isEmpty()) {
            for (String equals : str2.split(";")) {
                if (equals.equals(str)) {
                    return false;
                }
            }
        }
        String str3 = (String) bym.m50299d().mo41272a(C15585bw.f43870cK);
        if (str3.isEmpty()) {
            return true;
        }
        for (String equals2 : str3.split(";")) {
            if (equals2.equals(str)) {
                return true;
            }
        }
        return false;
    }
}
