package com.appsflyer;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.os.Process;
import android.support.p022v4.app.ActivityCompat;
import android.text.TextUtils;
import com.C1642a;
import com.appsflyer.OneLinkHttpTask.HttpsUrlConnectionProvider;
import com.appsflyer.cache.CacheManager;
import com.appsflyer.cache.RequestCacheData;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.android.gms.common.GoogleApiAvailability;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import com.p280ss.android.ugc.aweme.lancet.p327a.C7108b;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.taobao.android.dexposed.ClassUtils;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.NetworkInterface;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AppsFlyerLib implements C1864a {

    /* renamed from: ʻ */
    private static String f6688;

    /* renamed from: ʼ */
    private static String f6689;

    /* renamed from: ʼॱ */
    private static AppsFlyerLib f6690 = new AppsFlyerLib();
    /* access modifiers changed from: private */

    /* renamed from: ˊॱ */
    public static final List<String> f6691 = Arrays.asList(new String[]{"googleplay", "playstore", "googleplaystore"});

    /* renamed from: ˋ */
    static AppsFlyerInAppPurchaseValidatorListener f6692 = null;

    /* renamed from: ˋॱ */
    private static final List<String> f6693 = Arrays.asList(new String[]{"is_cache"});

    /* renamed from: ˎ */
    static final String f6694;
    /* access modifiers changed from: private */

    /* renamed from: ˏॱ */
    public static AppsFlyerConversionListener f6695 = null;

    /* renamed from: ॱ */
    static final String f6696 = "4.8.20".substring(0, "4.8.20".indexOf(ClassUtils.PACKAGE_SEPARATOR));

    /* renamed from: ॱॱ */
    private static String f6697;

    /* renamed from: ᐝ */
    private static final String f6698;

    /* renamed from: ᐝॱ */
    private static AppsFlyerTrackingRequestListener f6699 = null;
    protected Uri latestDeepLink = null;
    /* access modifiers changed from: private */

    /* renamed from: ʻॱ */
    public long f6700;

    /* renamed from: ʽ */
    private long f6701 = -1;
    /* access modifiers changed from: private */

    /* renamed from: ʽॱ */
    public ScheduledExecutorService f6702 = null;

    /* renamed from: ʾ */
    private long f6703;

    /* renamed from: ʿ */
    private C1889a f6704;

    /* renamed from: ˈ */
    private long f6705;

    /* renamed from: ˉ */
    private String f6706;

    /* renamed from: ˊ */
    String f6707;

    /* renamed from: ˊˋ */
    private boolean f6708 = false;

    /* renamed from: ˊᐝ */
    private long f6709;

    /* renamed from: ˋˊ */
    private boolean f6710 = false;

    /* renamed from: ˋˋ */
    private C1893p f6711 = new C1893p();

    /* renamed from: ˋᐝ */
    private boolean f6712;

    /* renamed from: ˌ */
    private boolean f6713;

    /* renamed from: ˍ */
    public boolean f6714 = false;

    /* renamed from: ˎˎ */
    private boolean f6715 = false;

    /* renamed from: ˏ */
    String f6716;

    /* renamed from: ͺ */
    private long f6717 = -1;

    /* renamed from: ॱˊ */
    private long f6718 = TimeUnit.SECONDS.toMillis(5);
    /* access modifiers changed from: private */

    /* renamed from: ॱˋ */
    public boolean f6719 = false;

    /* renamed from: ॱˎ */
    private C1871d f6720 = null;
    /* access modifiers changed from: private */

    /* renamed from: ॱᐝ */
    public Map<String, String> f6721;

    class _lancet {
        /* renamed from: com_ss_android_ugc_aweme_lancet_lanch_AwemeMetaDataLancet_getApplicationInfo */
        static ApplicationInfo m8717x89c42dc8(PackageManager packageManager, String str, int i) throws NameNotFoundException {
            if (!TextUtils.equals(str, C6399b.m19921a().getPackageName()) || i != 128) {
                return packageManager.getApplicationInfo(str, i);
            }
            if (C7108b.f19972a == null) {
                C7108b.f19972a = packageManager.getApplicationInfo(str, i);
            }
            return C7108b.f19972a;
        }
    }

    /* renamed from: com.appsflyer.AppsFlyerLib$a */
    class C1859a implements Runnable {

        /* renamed from: ˊ */
        private boolean f6726;

        /* renamed from: ˋ */
        private Map<String, Object> f6727;

        /* renamed from: ˎ */
        private String f6728;

        /* renamed from: ˏ */
        private int f6729;

        /* renamed from: ॱ */
        private WeakReference<Context> f6730;

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x005d, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x005e, code lost:
            r9 = r1;
            r1 = r0;
            r0 = r9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0062, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0063, code lost:
            com.appsflyer.AFLogger.afErrorLog(r0.getMessage(), r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x006a, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0062 A[ExcHandler: Throwable (r0v8 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:11:0x003a] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r10 = this;
                com.appsflyer.AppsFlyerLib r0 = com.appsflyer.AppsFlyerLib.this
                boolean r0 = r0.f6714
                if (r0 == 0) goto L_0x0007
                return
            L_0x0007:
                r0 = 0
                boolean r1 = r10.f6726
                if (r1 == 0) goto L_0x0026
                int r1 = r10.f6729
                r2 = 2
                if (r1 > r2) goto L_0x0026
                com.appsflyer.AppsFlyerLib r1 = com.appsflyer.AppsFlyerLib.this
                boolean r1 = com.appsflyer.AppsFlyerLib.m8684(r1)
                if (r1 == 0) goto L_0x0026
                java.util.Map<java.lang.String, java.lang.Object> r1 = r10.f6727
                java.lang.String r2 = "rfr"
                com.appsflyer.AppsFlyerLib r3 = com.appsflyer.AppsFlyerLib.this
                java.util.Map r3 = r3.f6721
                r1.put(r2, r3)
            L_0x0026:
                java.util.Map<java.lang.String, java.lang.Object> r1 = r10.f6727
                com.appsflyer.c$a r2 = new com.appsflyer.c$a
                java.util.Map<java.lang.String, java.lang.Object> r3 = r10.f6727
                java.lang.ref.WeakReference<android.content.Context> r4 = r10.f6730
                java.lang.Object r4 = r4.get()
                android.content.Context r4 = (android.content.Context) r4
                r2.<init>(r3, r4)
                r1.putAll(r2)
                java.util.Map<java.lang.String, java.lang.Object> r1 = r10.f6727     // Catch:{ IOException -> 0x006b, Throwable -> 0x0062 }
                java.lang.String r2 = "appsflyerKey"
                java.lang.Object r1 = r1.get(r2)     // Catch:{ IOException -> 0x006b, Throwable -> 0x0062 }
                r5 = r1
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x006b, Throwable -> 0x0062 }
                java.util.Map<java.lang.String, java.lang.Object> r1 = r10.f6727     // Catch:{ IOException -> 0x006b, Throwable -> 0x0062 }
                org.json.JSONObject r1 = com.appsflyer.AFHelper.convertToJsonObject(r1)     // Catch:{ IOException -> 0x006b, Throwable -> 0x0062 }
                java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x006b, Throwable -> 0x0062 }
                com.appsflyer.AppsFlyerLib r2 = com.appsflyer.AppsFlyerLib.this     // Catch:{ IOException -> 0x005d, Throwable -> 0x0062 }
                java.lang.String r3 = r10.f6728     // Catch:{ IOException -> 0x005d, Throwable -> 0x0062 }
                java.lang.ref.WeakReference<android.content.Context> r6 = r10.f6730     // Catch:{ IOException -> 0x005d, Throwable -> 0x0062 }
                r7 = 0
                boolean r8 = r10.f6726     // Catch:{ IOException -> 0x005d, Throwable -> 0x0062 }
                r4 = r1
                com.appsflyer.AppsFlyerLib.m8667(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ IOException -> 0x005d, Throwable -> 0x0062 }
                return
            L_0x005d:
                r0 = move-exception
                r9 = r1
                r1 = r0
                r0 = r9
                goto L_0x006c
            L_0x0062:
                r0 = move-exception
                java.lang.String r1 = r0.getMessage()
                com.appsflyer.AFLogger.afErrorLog(r1, r0)
                return
            L_0x006b:
                r1 = move-exception
            L_0x006c:
                java.lang.String r2 = "Exception while sending request to server. "
                com.appsflyer.AFLogger.afErrorLog(r2, r1)
                if (r0 == 0) goto L_0x00a0
                java.lang.ref.WeakReference<android.content.Context> r2 = r10.f6730
                if (r2 == 0) goto L_0x00a0
                java.lang.String r2 = r10.f6728
                java.lang.String r3 = "&isCachedRequest=true&timeincache="
                boolean r2 = r2.contains(r3)
                if (r2 != 0) goto L_0x00a0
                com.appsflyer.cache.CacheManager r2 = com.appsflyer.cache.CacheManager.getInstance()
                com.appsflyer.cache.RequestCacheData r3 = new com.appsflyer.cache.RequestCacheData
                java.lang.String r4 = r10.f6728
                java.lang.String r5 = "4.8.20"
                r3.<init>(r4, r0, r5)
                java.lang.ref.WeakReference<android.content.Context> r0 = r10.f6730
                java.lang.Object r0 = r0.get()
                android.content.Context r0 = (android.content.Context) r0
                r2.cacheRequest(r3, r0)
                java.lang.String r0 = r1.getMessage()
                com.appsflyer.AFLogger.afErrorLog(r0, r1)
            L_0x00a0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLib.C1859a.run():void");
        }

        private C1859a(String str, Map<String, Object> map, Context context, boolean z, int i) {
            this.f6728 = str;
            this.f6727 = map;
            this.f6730 = new WeakReference<>(context);
            this.f6726 = z;
            this.f6729 = i;
        }

        /* synthetic */ C1859a(AppsFlyerLib appsFlyerLib, String str, Map map, Context context, boolean z, int i, byte b) {
            this(str, map, context, z, i);
        }
    }

    /* renamed from: com.appsflyer.AppsFlyerLib$b */
    abstract class C1860b implements Runnable {

        /* renamed from: ˋ */
        private ScheduledExecutorService f6733;

        /* renamed from: ˎ */
        private String f6734;

        /* renamed from: ˏ */
        WeakReference<Context> f6735;

        /* renamed from: ॱ */
        private AtomicInteger f6736 = new AtomicInteger(0);

        /* renamed from: ˎ */
        public abstract String mo7428();

        /* access modifiers changed from: protected */
        /* renamed from: ˎ */
        public abstract void mo7429(String str, int i);

        /* access modifiers changed from: protected */
        /* renamed from: ˎ */
        public abstract void mo7430(Map<String, String> map);

        /* JADX WARNING: Removed duplicated region for block: B:74:0x022d A[Catch:{ all -> 0x0223 }] */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x0242  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x0252  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r11 = this;
                java.lang.String r0 = r11.f6734
                if (r0 == 0) goto L_0x0256
                java.lang.String r0 = r11.f6734
                int r0 = r0.length()
                if (r0 != 0) goto L_0x000e
                goto L_0x0256
            L_0x000e:
                com.appsflyer.AppsFlyerLib r0 = com.appsflyer.AppsFlyerLib.this
                boolean r0 = r0.f6714
                if (r0 == 0) goto L_0x0015
                return
            L_0x0015:
                java.util.concurrent.atomic.AtomicInteger r0 = r11.f6736
                r0.incrementAndGet()
                r0 = 0
                r1 = 0
                java.lang.ref.WeakReference<android.content.Context> r2 = r11.f6735     // Catch:{ Throwable -> 0x0226 }
                java.lang.Object r2 = r2.get()     // Catch:{ Throwable -> 0x0226 }
                android.content.Context r2 = (android.content.Context) r2     // Catch:{ Throwable -> 0x0226 }
                if (r2 != 0) goto L_0x002c
                java.util.concurrent.atomic.AtomicInteger r0 = r11.f6736
                r0.decrementAndGet()
                return
            L_0x002c:
                long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x0226 }
                java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference     // Catch:{ Throwable -> 0x0226 }
                r5.<init>(r2)     // Catch:{ Throwable -> 0x0226 }
                java.lang.String r5 = com.appsflyer.AppsFlyerLib.m8691(r5)     // Catch:{ Throwable -> 0x0226 }
                java.lang.String r5 = com.appsflyer.AppsFlyerLib.m8704(r2, r5)     // Catch:{ Throwable -> 0x0226 }
                java.lang.String r6 = ""
                r7 = 1
                if (r5 == 0) goto L_0x0068
                java.util.List r8 = com.appsflyer.AppsFlyerLib.f6691     // Catch:{ Throwable -> 0x0226 }
                java.lang.String r9 = r5.toLowerCase()     // Catch:{ Throwable -> 0x0226 }
                boolean r8 = r8.contains(r9)     // Catch:{ Throwable -> 0x0226 }
                if (r8 != 0) goto L_0x005b
                java.lang.String r6 = "-"
                java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Throwable -> 0x0226 }
                java.lang.String r6 = r6.concat(r5)     // Catch:{ Throwable -> 0x0226 }
                goto L_0x0068
            L_0x005b:
                java.lang.String r8 = "AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix."
                java.lang.Object[] r9 = new java.lang.Object[r7]     // Catch:{ Throwable -> 0x0226 }
                r9[r1] = r5     // Catch:{ Throwable -> 0x0226 }
                java.lang.String r5 = com.C1642a.m8034a(r8, r9)     // Catch:{ Throwable -> 0x0226 }
                com.appsflyer.AFLogger.afWarnLog(r5)     // Catch:{ Throwable -> 0x0226 }
            L_0x0068:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0226 }
                r5.<init>()     // Catch:{ Throwable -> 0x0226 }
                java.lang.String r8 = r11.mo7428()     // Catch:{ Throwable -> 0x0226 }
                r5.append(r8)     // Catch:{ Throwable -> 0x0226 }
                java.lang.String r8 = r2.getPackageName()     // Catch:{ Throwable -> 0x0226 }
                r5.append(r8)     // Catch:{ Throwable -> 0x0226 }
                r5.append(r6)     // Catch:{ Throwable -> 0x0226 }
                java.lang.String r6 = "?devkey="
                r5.append(r6)     // Catch:{ Throwable -> 0x0226 }
                java.lang.String r6 = r11.f6734     // Catch:{ Throwable -> 0x0226 }
                r5.append(r6)     // Catch:{ Throwable -> 0x0226 }
                java.lang.String r6 = "&device_id="
                r5.append(r6)     // Catch:{ Throwable -> 0x0226 }
                java.lang.ref.WeakReference r6 = new java.lang.ref.WeakReference     // Catch:{ Throwable -> 0x0226 }
                r6.<init>(r2)     // Catch:{ Throwable -> 0x0226 }
                java.lang.String r6 = com.appsflyer.C1900t.m8826(r6)     // Catch:{ Throwable -> 0x0226 }
                r5.append(r6)     // Catch:{ Throwable -> 0x0226 }
                com.appsflyer.s r6 = com.appsflyer.C1899s.m8812()     // Catch:{ Throwable -> 0x0226 }
                java.lang.String r8 = r5.toString()     // Catch:{ Throwable -> 0x0226 }
                java.lang.String r9 = ""
                r6.mo7517(r8, r9)     // Catch:{ Throwable -> 0x0226 }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0226 }
                java.lang.String r8 = "Calling server for attribution url: "
                r6.<init>(r8)     // Catch:{ Throwable -> 0x0226 }
                java.lang.String r8 = r5.toString()     // Catch:{ Throwable -> 0x0226 }
                r6.append(r8)     // Catch:{ Throwable -> 0x0226 }
                java.lang.String r6 = r6.toString()     // Catch:{ Throwable -> 0x0226 }
                com.appsflyer.C1873f.C18754.m8758(r6)     // Catch:{ Throwable -> 0x0226 }
                java.net.URL r6 = new java.net.URL     // Catch:{ Throwable -> 0x0226 }
                java.lang.String r8 = r5.toString()     // Catch:{ Throwable -> 0x0226 }
                r6.<init>(r8)     // Catch:{ Throwable -> 0x0226 }
                java.net.URLConnection r6 = r6.openConnection()     // Catch:{ Throwable -> 0x0226 }
                java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ Throwable -> 0x0226 }
                java.lang.String r0 = "GET"
                r6.setRequestMethod(r0)     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                r0 = 10000(0x2710, float:1.4013E-41)
                r6.setConnectTimeout(r0)     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                java.lang.String r0 = "Connection"
                java.lang.String r8 = "close"
                r6.setRequestProperty(r0, r8)     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                r6.connect()     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                int r0 = r6.getResponseCode()     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                java.lang.String r8 = com.appsflyer.AppsFlyerLib.m8674(r6)     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                com.appsflyer.s r9 = com.appsflyer.C1899s.m8812()     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                java.lang.String r10 = r5.toString()     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                r9.mo7516(r10, r0, r8)     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                r9 = 200(0xc8, float:2.8E-43)
                if (r0 != r9) goto L_0x01e7
                long r9 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                java.lang.String r0 = "appsflyerGetConversionDataTiming"
                r5 = 0
                long r9 = r9 - r3
                com.appsflyer.AppsFlyerLib.m8694(r2, r0, r9)     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                java.lang.String r0 = "Attribution data: "
                java.lang.String r3 = java.lang.String.valueOf(r8)     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                java.lang.String r0 = r0.concat(r3)     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                com.appsflyer.C1873f.C18754.m8758(r0)     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                int r0 = r8.length()     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                if (r0 <= 0) goto L_0x0213
                if (r2 == 0) goto L_0x0213
                java.util.Map r0 = com.appsflyer.AppsFlyerLib.m8701(r8)     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                java.lang.String r3 = "iscache"
                java.lang.Object r3 = r0.get(r3)     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                java.lang.String r3 = (java.lang.String) r3     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                if (r3 == 0) goto L_0x0136
                java.lang.String r4 = java.lang.Boolean.toString(r1)     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                boolean r4 = r4.equals(r3)     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                if (r4 == 0) goto L_0x0136
                java.lang.String r4 = "appsflyerConversionDataCacheExpiration"
                long r9 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                com.appsflyer.AppsFlyerLib.m8694(r2, r4, r9)     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
            L_0x0136:
                java.lang.String r4 = "af_siteid"
                boolean r4 = r0.containsKey(r4)     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                if (r4 == 0) goto L_0x0173
                java.lang.String r4 = "af_channel"
                boolean r4 = r0.containsKey(r4)     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                if (r4 == 0) goto L_0x0160
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                java.lang.String r5 = "[Invite] Detected App-Invite via channel: "
                r4.<init>(r5)     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                java.lang.String r5 = "af_channel"
                java.lang.Object r5 = r0.get(r5)     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                r4.append(r5)     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                com.appsflyer.AFLogger.afDebugLog(r4)     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                goto L_0x0173
            L_0x0160:
                java.lang.String r4 = "[CrossPromotion] App was installed via %s's Cross Promotion"
                java.lang.Object[] r5 = new java.lang.Object[r7]     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                java.lang.String r9 = "af_siteid"
                java.lang.Object r9 = r0.get(r9)     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                r5[r1] = r9     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                java.lang.String r4 = com.C1642a.m8034a(r4, r5)     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                com.appsflyer.AFLogger.afDebugLog(r4)     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
            L_0x0173:
                java.lang.String r4 = "af_siteid"
                boolean r4 = r0.containsKey(r4)     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                if (r4 == 0) goto L_0x0194
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                java.lang.String r5 = "[Invite] Detected App-Invite via channel: "
                r4.<init>(r5)     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                java.lang.String r5 = "af_channel"
                java.lang.Object r5 = r0.get(r5)     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                r4.append(r5)     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                com.appsflyer.AFLogger.afDebugLog(r4)     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
            L_0x0194:
                java.lang.String r4 = "is_first_launch"
                java.lang.String r5 = java.lang.Boolean.toString(r1)     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                r0.put(r4, r5)     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                r4.<init>(r0)     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                if (r4 == 0) goto L_0x01ae
                java.lang.String r5 = "attributionId"
                com.appsflyer.AppsFlyerLib.m8695(r2, r5, r4)     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                goto L_0x01b3
            L_0x01ae:
                java.lang.String r4 = "attributionId"
                com.appsflyer.AppsFlyerLib.m8695(r2, r4, r8)     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
            L_0x01b3:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                java.lang.String r5 = "iscache="
                r4.<init>(r5)     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                r4.append(r3)     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                java.lang.String r3 = " caching conversion data"
                r4.append(r3)     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                java.lang.String r3 = r4.toString()     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                com.appsflyer.AFLogger.afDebugLog(r3)     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                com.appsflyer.AppsFlyerConversionListener r3 = com.appsflyer.AppsFlyerLib.f6695     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                if (r3 == 0) goto L_0x0213
                java.util.concurrent.atomic.AtomicInteger r3 = r11.f6736     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                int r3 = r3.intValue()     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                if (r3 > r7) goto L_0x0213
                java.util.Map r2 = com.appsflyer.AppsFlyerLib.m8699(r2)     // Catch:{ m -> 0x01dd }
                r0 = r2
                goto L_0x01e3
            L_0x01dd:
                r2 = move-exception
                java.lang.String r3 = "Exception while trying to fetch attribution data. "
                com.appsflyer.AFLogger.afErrorLog(r3, r2)     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
            L_0x01e3:
                r11.mo7430(r0)     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                goto L_0x0213
            L_0x01e7:
                com.appsflyer.AppsFlyerConversionListener r2 = com.appsflyer.AppsFlyerLib.f6695     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                if (r2 == 0) goto L_0x01fa
                java.lang.String r2 = "Error connection to server: "
                java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                java.lang.String r2 = r2.concat(r3)     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                r11.mo7429(r2, r0)     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
            L_0x01fa:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                java.lang.String r3 = "AttributionIdFetcher response code: "
                r2.<init>(r3)     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                r2.append(r0)     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                java.lang.String r0 = "  url: "
                r2.append(r0)     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                r2.append(r5)     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                java.lang.String r0 = r2.toString()     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
                com.appsflyer.C1873f.C18754.m8758(r0)     // Catch:{ Throwable -> 0x0220, all -> 0x021e }
            L_0x0213:
                java.util.concurrent.atomic.AtomicInteger r0 = r11.f6736
                r0.decrementAndGet()
                if (r6 == 0) goto L_0x0245
                r6.disconnect()
                goto L_0x0245
            L_0x021e:
                r1 = move-exception
                goto L_0x024b
            L_0x0220:
                r2 = move-exception
                r0 = r6
                goto L_0x0227
            L_0x0223:
                r1 = move-exception
                r6 = r0
                goto L_0x024b
            L_0x0226:
                r2 = move-exception
            L_0x0227:
                com.appsflyer.AppsFlyerConversionListener r3 = com.appsflyer.AppsFlyerLib.f6695     // Catch:{ all -> 0x0223 }
                if (r3 == 0) goto L_0x0234
                java.lang.String r3 = r2.getMessage()     // Catch:{ all -> 0x0223 }
                r11.mo7429(r3, r1)     // Catch:{ all -> 0x0223 }
            L_0x0234:
                java.lang.String r1 = r2.getMessage()     // Catch:{ all -> 0x0223 }
                com.appsflyer.AFLogger.afErrorLog(r1, r2)     // Catch:{ all -> 0x0223 }
                java.util.concurrent.atomic.AtomicInteger r1 = r11.f6736
                r1.decrementAndGet()
                if (r0 == 0) goto L_0x0245
                r0.disconnect()
            L_0x0245:
                java.util.concurrent.ScheduledExecutorService r0 = r11.f6733
                r0.shutdown()
                return
            L_0x024b:
                java.util.concurrent.atomic.AtomicInteger r0 = r11.f6736
                r0.decrementAndGet()
                if (r6 == 0) goto L_0x0255
                r6.disconnect()
            L_0x0255:
                throw r1
            L_0x0256:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLib.C1860b.run():void");
        }

        C1860b(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
            this.f6735 = new WeakReference<>(context);
            this.f6734 = str;
            if (scheduledExecutorService == null) {
                this.f6733 = AFExecutor.getInstance().mo7382();
            } else {
                this.f6733 = scheduledExecutorService;
            }
        }
    }

    /* renamed from: com.appsflyer.AppsFlyerLib$c */
    class C1861c implements Runnable {

        /* renamed from: ʼ */
        private String f6738;

        /* renamed from: ʽ */
        private boolean f6739;

        /* renamed from: ˊ */
        private String f6740;

        /* renamed from: ˋ */
        private WeakReference<Context> f6741;

        /* renamed from: ˎ */
        private String f6742;

        /* renamed from: ˏ */
        private final Intent f6743;

        /* renamed from: ॱ */
        private final String f6744;

        /* renamed from: ॱॱ */
        private boolean f6745;

        /* renamed from: ᐝ */
        private String f6746;

        public final void run() {
            AppsFlyerLib.m8658(AppsFlyerLib.this, (Context) this.f6741.get(), this.f6740, this.f6742, this.f6746, this.f6738, this.f6739, this.f6745, this.f6743, this.f6744);
        }

        private C1861c(WeakReference<Context> weakReference, String str, String str2, String str3, String str4, boolean z, Intent intent, String str5) {
            this.f6741 = weakReference;
            this.f6740 = str;
            this.f6742 = str2;
            this.f6746 = str3;
            this.f6738 = str4;
            this.f6739 = true;
            this.f6745 = z;
            this.f6743 = intent;
            this.f6744 = str5;
        }

        /* synthetic */ C1861c(AppsFlyerLib appsFlyerLib, WeakReference weakReference, String str, String str2, String str3, String str4, boolean z, Intent intent, String str5, byte b) {
            this(weakReference, str, str2, str3, str4, z, intent, str5);
        }
    }

    /* renamed from: com.appsflyer.AppsFlyerLib$d */
    class C1862d implements Runnable {

        /* renamed from: ॱ */
        private WeakReference<Context> f6748;

        public final void run() {
            if (!AppsFlyerLib.this.f6719) {
                AppsFlyerLib.this.f6700 = System.currentTimeMillis();
                if (this.f6748 != null) {
                    AppsFlyerLib.this.f6719 = true;
                    try {
                        String r1 = AppsFlyerProperties.getInstance().getString("AppsFlyerKey");
                        synchronized (this.f6748) {
                            for (RequestCacheData requestCacheData : CacheManager.getInstance().getCachedRequests((Context) this.f6748.get())) {
                                StringBuilder sb = new StringBuilder("resending request: ");
                                sb.append(requestCacheData.f6781);
                                AFLogger.afInfoLog(sb.toString());
                                try {
                                    long currentTimeMillis = System.currentTimeMillis();
                                    long parseLong = Long.parseLong(requestCacheData.f6779, 10);
                                    AppsFlyerLib appsFlyerLib = AppsFlyerLib.this;
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(requestCacheData.f6781);
                                    sb2.append("&isCachedRequest=true&timeincache=");
                                    sb2.append(Long.toString((currentTimeMillis - parseLong) / 1000));
                                    AppsFlyerLib.m8667(appsFlyerLib, sb2.toString(), requestCacheData.f6780, r1, (WeakReference) this.f6748, requestCacheData.f6779, false);
                                } catch (Exception e) {
                                    AFLogger.afErrorLog("Failed to resend cached request", e);
                                }
                            }
                        }
                    } catch (Exception e2) {
                        try {
                            AFLogger.afErrorLog("failed to check cache. ", e2);
                        } catch (Throwable th) {
                            AppsFlyerLib.this.f6719 = false;
                            throw th;
                        }
                    }
                    AppsFlyerLib.this.f6719 = false;
                    AppsFlyerLib.this.f6702.shutdown();
                    AppsFlyerLib.this.f6702 = null;
                }
            }
        }

        public C1862d(Context context) {
            this.f6748 = new WeakReference<>(context);
        }
    }

    /* renamed from: com.appsflyer.AppsFlyerLib$e */
    class C1863e extends C1860b {
        /* renamed from: ˎ */
        public final String mo7428() {
            return ServerConfigHandler.getUrl("https://%sapi.%s/install_data/v3/");
        }

        /* access modifiers changed from: protected */
        /* renamed from: ˎ */
        public final void mo7430(Map<String, String> map) {
            map.put("is_first_launch", Boolean.toString(true));
            AppsFlyerLib.f6695.onInstallConversionDataLoaded(map);
            AppsFlyerLib.m8678((Context) this.f6735.get(), "appsflyerConversionDataRequestRetries", 0);
        }

        /* access modifiers changed from: protected */
        /* renamed from: ˎ */
        public final void mo7429(String str, int i) {
            AppsFlyerLib.f6695.onInstallConversionFailure(str);
            if (i >= 400 && i < 500) {
                AppsFlyerLib.m8678((Context) this.f6735.get(), "appsflyerConversionDataRequestRetries", AppsFlyerLib.m8686((Context) this.f6735.get()).getInt("appsflyerConversionDataRequestRetries", 0) + 1);
            }
        }

        public C1863e(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
            super(context, str, scheduledExecutorService);
        }
    }

    public static AppsFlyerLib getInstance() {
        return f6690;
    }

    /* renamed from: ˎ */
    static /* synthetic */ void m8681(Map map) {
        if (f6695 != null) {
            try {
                f6695.onAppOpenAttribution(map);
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getLocalizedMessage(), th);
            }
        }
    }

    /* renamed from: ˎ */
    static /* synthetic */ boolean m8684(AppsFlyerLib appsFlyerLib) {
        return appsFlyerLib.f6721 != null && appsFlyerLib.f6721.size() > 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˋ */
    public final void mo7417(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("shouldMonitor");
        if (stringExtra != null) {
            AFLogger.afInfoLog("Turning on monitoring.");
            AppsFlyerProperties.getInstance().set("shouldMonitor", stringExtra.equals("true"));
            m8696(context, null, "START_TRACKING", context.getPackageName());
            return;
        }
        AFLogger.afInfoLog("****** onReceive called *******");
        AppsFlyerProperties.getInstance().setOnReceiveCalled();
        String stringExtra2 = intent.getStringExtra("referrer");
        AFLogger.afInfoLog("Play store referrer: ".concat(String.valueOf(stringExtra2)));
        if (stringExtra2 != null) {
            if ("AppsFlyer_Test".equals(intent.getStringExtra("TestIntegrationMode"))) {
                Editor edit = C7285c.m22838a(context, "appsflyer-data", 0).edit();
                edit.clear();
                if (VERSION.SDK_INT >= 9) {
                    edit.apply();
                } else {
                    edit.commit();
                }
                AppsFlyerProperties.getInstance().f6754 = false;
                AFLogger.afInfoLog("Test mode started..");
                this.f6709 = System.currentTimeMillis();
            }
            Editor edit2 = C7285c.m22838a(context, "appsflyer-data", 0).edit();
            edit2.putString("referrer", stringExtra2);
            if (VERSION.SDK_INT >= 9) {
                edit2.apply();
            } else {
                edit2.commit();
            }
            AppsFlyerProperties.getInstance().setReferrer(stringExtra2);
            if (AppsFlyerProperties.getInstance().f6754) {
                AFLogger.afInfoLog("onReceive: isLaunchCalled");
                if (stringExtra2 != null && stringExtra2.length() > 5) {
                    ScheduledThreadPoolExecutor r0 = AFExecutor.getInstance().mo7382();
                    C1861c cVar = new C1861c(this, new WeakReference(context.getApplicationContext()), null, null, null, stringExtra2, true, intent, null, 0);
                    m8669(r0, cVar, 5, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    /* renamed from: ˎ */
    private static void m8682(JSONObject jSONObject) {
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator keys = jSONObject.keys();
        while (true) {
            if (!keys.hasNext()) {
                break;
            }
            try {
                JSONArray jSONArray = new JSONArray((String) jSONObject.get((String) keys.next()));
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(Long.valueOf(jSONArray.getLong(i)));
                }
            } catch (JSONException unused) {
            }
        }
        Collections.sort(arrayList);
        Iterator keys2 = jSONObject.keys();
        loop2:
        while (true) {
            str = null;
            while (keys2.hasNext() && str == null) {
                String str2 = (String) keys2.next();
                try {
                    JSONArray jSONArray2 = new JSONArray((String) jSONObject.get(str2));
                    String str3 = str;
                    int i2 = 0;
                    while (i2 < jSONArray2.length()) {
                        try {
                            if (jSONArray2.getLong(i2) != ((Long) arrayList.get(0)).longValue() && jSONArray2.getLong(i2) != ((Long) arrayList.get(1)).longValue() && jSONArray2.getLong(i2) != ((Long) arrayList.get(arrayList.size() - 1)).longValue()) {
                                i2++;
                                str3 = str2;
                            }
                        } catch (JSONException unused2) {
                        }
                    }
                    str = str3;
                } catch (JSONException unused3) {
                }
            }
        }
        if (str != null) {
            jSONObject.remove(str);
        }
    }

    /* renamed from: ˎ */
    private static boolean m8683(Context context) {
        if (m8654(C7285c.m22838a(context, "appsflyer-data", 0), "appsFlyerCount", false) > 2) {
            AFLogger.afRDLog("Install referrer will not load, the counter > 2, ");
            return false;
        }
        try {
            Class.forName("com.android.a.a.a");
            if (C18741.m8756(context, "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE")) {
                AFLogger.afDebugLog("Install referrer is allowed");
                return true;
            }
            AFLogger.afDebugLog("Install referrer is not allowed");
            return false;
        } catch (ClassNotFoundException unused) {
            AFLogger.afRDLog("Class com.android.installreferrer.api.InstallReferrerClient not found");
            return false;
        } catch (Throwable th) {
            AFLogger.afErrorLog("An error occurred while trying to verify manifest : com.android.installreferrer.api.InstallReferrerClient", th);
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˏ */
    public final void mo7419(Context context, String str, Map<String, Object> map) {
        String str2;
        Intent intent;
        Object obj;
        String str3 = "";
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            Intent intent2 = activity.getIntent();
            AFDeepLinkManager.getInstance().currentActivityHash = System.identityHashCode(activity);
            try {
                obj = ActivityCompat.m2245c(activity);
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getLocalizedMessage(), th);
                obj = null;
            }
            if (obj != null) {
                str3 = obj.toString();
            }
            str2 = str3;
            intent = intent2;
        } else {
            str2 = str3;
            intent = null;
        }
        if (AppsFlyerProperties.getInstance().getString("AppsFlyerKey") == null) {
            AFLogger.afWarnLog("[TrackEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey.");
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        JSONObject jSONObject = new JSONObject(map);
        String referrer = AppsFlyerProperties.getInstance().getReferrer(context);
        String jSONObject2 = jSONObject.toString();
        if (referrer == null) {
            referrer = "";
        }
        m8666(context, (String) null, str, jSONObject2, referrer, intent, str2);
    }

    /* renamed from: ˏ */
    private static void m8696(Context context, String str, String str2, String str3) {
        if (AppsFlyerProperties.getInstance().getBoolean("shouldMonitor", false)) {
            Intent intent = new Intent("com.appsflyer.MonitorBroadcast");
            intent.setPackage("com.appsflyer.nightvision");
            intent.putExtra("message", str2);
            intent.putExtra("value", str3);
            intent.putExtra("packageName", "true");
            intent.putExtra("pid", new Integer(Process.myPid()));
            intent.putExtra("eventIdentifier", str);
            intent.putExtra("sdk", "4.8.20");
            context.sendBroadcast(intent);
        }
    }

    /* renamed from: ˋ */
    private boolean m8670() {
        if (this.f6701 > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.f6701;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS Z", Locale.US);
            long j = this.f6701;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            String format = simpleDateFormat.format(new Date(j));
            long j2 = this.f6717;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            String format2 = simpleDateFormat.format(new Date(j2));
            if (currentTimeMillis < this.f6718 && !this.f6714) {
                AFLogger.afInfoLog(C1642a.m8035a(Locale.US, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", new Object[]{format, format2, Long.valueOf(currentTimeMillis), Long.valueOf(this.f6718)}));
                return true;
            } else if (!this.f6714) {
                AFLogger.afInfoLog(C1642a.m8035a(Locale.US, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)", new Object[]{format, format2, Long.valueOf(currentTimeMillis)}));
            }
        } else if (!this.f6714) {
            AFLogger.afInfoLog("Sending first launch for this session!");
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x03b3 A[Catch:{ Exception -> 0x00aa, Throwable -> 0x0b7e }] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x03c7 A[Catch:{ Exception -> 0x00aa, Throwable -> 0x0b7e }] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x03d3 A[Catch:{ Exception -> 0x00aa, Throwable -> 0x0b7e }] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x03db A[Catch:{ Exception -> 0x00aa, Throwable -> 0x0b7e }] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x03e7 A[Catch:{ Exception -> 0x00aa, Throwable -> 0x0b7e }] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x03ef A[Catch:{ Exception -> 0x00aa, Throwable -> 0x0b7e }] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x03fb A[Catch:{ Exception -> 0x00aa, Throwable -> 0x0b7e }] */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x040a A[Catch:{ Exception -> 0x00aa, Throwable -> 0x0b7e }] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x040b A[Catch:{ Exception -> 0x00aa, Throwable -> 0x0b7e }] */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x0545 A[Catch:{ Exception -> 0x00aa, Throwable -> 0x0b7e }] */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0557 A[Catch:{ Exception -> 0x00aa, Throwable -> 0x0b7e }] */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x0560 A[Catch:{ Exception -> 0x00aa, Throwable -> 0x0b7e }] */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x05f8 A[Catch:{ Exception -> 0x00aa, Throwable -> 0x0b7e }] */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x0603 A[Catch:{ Exception -> 0x00aa, Throwable -> 0x0b7e }] */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x061c A[Catch:{ Exception -> 0x00aa, Throwable -> 0x0b7e }] */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x0668 A[Catch:{ Exception -> 0x00aa, Throwable -> 0x0b7e }] */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x066e A[Catch:{ Exception -> 0x00aa, Throwable -> 0x0b7e }] */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x0679 A[Catch:{ Exception -> 0x00aa, Throwable -> 0x0b7e }] */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x0689 A[Catch:{ Exception -> 0x068f }] */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x0743 A[Catch:{ Throwable -> 0x07dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x07a3 A[Catch:{ Throwable -> 0x07dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:349:0x07ed A[Catch:{ Exception -> 0x00aa, Throwable -> 0x0b7e }] */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x07fd A[Catch:{ Exception -> 0x00aa, Throwable -> 0x0b7e }] */
    /* JADX WARNING: Removed duplicated region for block: B:355:0x080e A[Catch:{ Exception -> 0x00aa, Throwable -> 0x0b7e }] */
    /* JADX WARNING: Removed duplicated region for block: B:358:0x0836 A[Catch:{ Exception -> 0x00aa, Throwable -> 0x0b7e }] */
    /* JADX WARNING: Removed duplicated region for block: B:361:0x0841 A[Catch:{ Exception -> 0x00aa, Throwable -> 0x0b7e }] */
    /* JADX WARNING: Removed duplicated region for block: B:367:0x0873 A[Catch:{ Exception -> 0x00aa, Throwable -> 0x0b7e }] */
    /* JADX WARNING: Removed duplicated region for block: B:370:0x08a1 A[ADDED_TO_REGION, Catch:{ Exception -> 0x00aa, Throwable -> 0x0b7e }] */
    /* JADX WARNING: Removed duplicated region for block: B:376:0x08b0 A[Catch:{ Exception -> 0x00aa, Throwable -> 0x0b7e }] */
    /* JADX WARNING: Removed duplicated region for block: B:379:0x08dd A[Catch:{ Exception -> 0x00aa, Throwable -> 0x0b7e }] */
    /* JADX WARNING: Removed duplicated region for block: B:385:0x0905 A[Catch:{ Exception -> 0x00aa, Throwable -> 0x0b7e }] */
    /* JADX WARNING: Removed duplicated region for block: B:395:0x0965 A[Catch:{ Exception -> 0x00aa, Throwable -> 0x0b7e }] */
    /* JADX WARNING: Removed duplicated region for block: B:396:0x0967 A[Catch:{ Exception -> 0x00aa, Throwable -> 0x0b7e }] */
    /* JADX WARNING: Removed duplicated region for block: B:403:0x098e A[Catch:{ Exception -> 0x00aa, Throwable -> 0x0b7e }] */
    /* JADX WARNING: Removed duplicated region for block: B:406:0x09d6 A[Catch:{ Exception -> 0x00aa, Throwable -> 0x0b7e }] */
    /* JADX WARNING: Removed duplicated region for block: B:424:0x0b3a A[Catch:{ Exception -> 0x00aa, Throwable -> 0x0b7e }] */
    /* JADX WARNING: Removed duplicated region for block: B:427:0x0b56 A[Catch:{ Exception -> 0x00aa, Throwable -> 0x0b7e }] */
    /* renamed from: ˏ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.String, java.lang.Object> mo7418(android.content.Context r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, boolean r25, android.content.SharedPreferences r26, boolean r27, android.content.Intent r28, java.lang.String r29) {
        /*
            r19 = this;
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r26
            r7 = r27
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            com.appsflyer.C1885l.m8777(r2, r8)
            java.util.Date r9 = new java.util.Date
            r9.<init>()
            long r9 = r9.getTime()
            java.lang.String r11 = "af_timestamp"
            java.lang.String r12 = java.lang.Long.toString(r9)
            r8.put(r11, r12)
            java.lang.String r9 = com.appsflyer.C1868c.m8732(r2, r9)
            if (r9 == 0) goto L_0x0033
            java.lang.String r10 = "cksm_v1"
            r8.put(r10, r9)
        L_0x0033:
            boolean r9 = r1.f6714     // Catch:{ Throwable -> 0x0b7e }
            if (r9 != 0) goto L_0x004f
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r10 = "******* sendTrackingWithEvent: "
            r9.<init>(r10)     // Catch:{ Throwable -> 0x0b7e }
            if (r7 == 0) goto L_0x0043
            java.lang.String r10 = "Launch"
            goto L_0x0044
        L_0x0043:
            r10 = r4
        L_0x0044:
            r9.append(r10)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r9 = r9.toString()     // Catch:{ Throwable -> 0x0b7e }
            com.appsflyer.AFLogger.afInfoLog(r9)     // Catch:{ Throwable -> 0x0b7e }
            goto L_0x0054
        L_0x004f:
            java.lang.String r9 = "SDK tracking has been stopped"
            com.appsflyer.AFLogger.afInfoLog(r9)     // Catch:{ Throwable -> 0x0b7e }
        L_0x0054:
            java.lang.String r9 = "AppsFlyer_4.8.20"
            java.lang.String r10 = "EVENT_CREATED_WITH_NAME"
            if (r7 == 0) goto L_0x005d
            java.lang.String r11 = "Launch"
            goto L_0x005e
        L_0x005d:
            r11 = r4
        L_0x005e:
            m8696(r2, r9, r10, r11)     // Catch:{ Throwable -> 0x0b7e }
            com.appsflyer.cache.CacheManager r9 = com.appsflyer.cache.CacheManager.getInstance()     // Catch:{ Throwable -> 0x0b7e }
            r9.init(r2)     // Catch:{ Throwable -> 0x0b7e }
            r9 = 0
            android.content.pm.PackageManager r10 = r20.getPackageManager()     // Catch:{ Exception -> 0x00aa }
            java.lang.String r11 = r20.getPackageName()     // Catch:{ Exception -> 0x00aa }
            r12 = 4096(0x1000, float:5.74E-42)
            android.content.pm.PackageInfo r10 = r10.getPackageInfo(r11, r12)     // Catch:{ Exception -> 0x00aa }
            java.lang.String[] r10 = r10.requestedPermissions     // Catch:{ Exception -> 0x00aa }
            java.util.List r10 = java.util.Arrays.asList(r10)     // Catch:{ Exception -> 0x00aa }
            java.lang.String r11 = "android.permission.INTERNET"
            boolean r11 = r10.contains(r11)     // Catch:{ Exception -> 0x00aa }
            if (r11 != 0) goto L_0x008f
            java.lang.String r11 = "Permission android.permission.INTERNET is missing in the AndroidManifest.xml"
            com.appsflyer.AFLogger.afWarnLog(r11)     // Catch:{ Exception -> 0x00aa }
            java.lang.String r11 = "PERMISSION_INTERNET_MISSING"
            m8696(r2, r9, r11, r9)     // Catch:{ Exception -> 0x00aa }
        L_0x008f:
            java.lang.String r11 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r11 = r10.contains(r11)     // Catch:{ Exception -> 0x00aa }
            if (r11 != 0) goto L_0x009c
            java.lang.String r11 = "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml"
            com.appsflyer.AFLogger.afWarnLog(r11)     // Catch:{ Exception -> 0x00aa }
        L_0x009c:
            java.lang.String r11 = "android.permission.ACCESS_WIFI_STATE"
            boolean r10 = r10.contains(r11)     // Catch:{ Exception -> 0x00aa }
            if (r10 != 0) goto L_0x00b1
            java.lang.String r10 = "Permission android.permission.ACCESS_WIFI_STATE is missing in the AndroidManifest.xml"
            com.appsflyer.AFLogger.afWarnLog(r10)     // Catch:{ Exception -> 0x00aa }
            goto L_0x00b1
        L_0x00aa:
            r0 = move-exception
            r10 = r0
            java.lang.String r11 = "Exception while validation permissions. "
            com.appsflyer.AFLogger.afErrorLog(r11, r10)     // Catch:{ Throwable -> 0x0b7e }
        L_0x00b1:
            if (r25 == 0) goto L_0x00ba
            java.lang.String r10 = "af_events_api"
            java.lang.String r11 = "1"
            r8.put(r10, r11)     // Catch:{ Throwable -> 0x0b7e }
        L_0x00ba:
            java.lang.String r10 = "brand"
            java.lang.String r11 = android.os.Build.BRAND     // Catch:{ Throwable -> 0x0b7e }
            r8.put(r10, r11)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r10 = "device"
            java.lang.String r11 = android.os.Build.DEVICE     // Catch:{ Throwable -> 0x0b7e }
            r8.put(r10, r11)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r10 = "product"
            java.lang.String r11 = android.os.Build.PRODUCT     // Catch:{ Throwable -> 0x0b7e }
            r8.put(r10, r11)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r10 = "sdk"
            int r11 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r11 = java.lang.Integer.toString(r11)     // Catch:{ Throwable -> 0x0b7e }
            r8.put(r10, r11)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r10 = "model"
            java.lang.String r11 = android.os.Build.MODEL     // Catch:{ Throwable -> 0x0b7e }
            r8.put(r10, r11)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r10 = "deviceType"
            java.lang.String r11 = android.os.Build.TYPE     // Catch:{ Throwable -> 0x0b7e }
            r8.put(r10, r11)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r10 = "deviceRm"
            java.lang.String r11 = android.os.Build.DISPLAY     // Catch:{ Throwable -> 0x0b7e }
            r8.put(r10, r11)     // Catch:{ Throwable -> 0x0b7e }
            r13 = 0
            r15 = 1
            r11 = 0
            if (r7 == 0) goto L_0x021e
            java.lang.String r12 = "appsflyer-data"
            android.content.SharedPreferences r12 = com.p280ss.android.ugc.aweme.p340x.C7285c.m22838a(r2, r12, r11)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r9 = "appsFlyerCount"
            boolean r9 = r12.contains(r9)     // Catch:{ Throwable -> 0x0b7e }
            r9 = r9 ^ r15
            if (r9 == 0) goto L_0x01a9
            com.appsflyer.AppsFlyerProperties r9 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ Throwable -> 0x0b7e }
            boolean r9 = r9.isOtherSdkStringDisabled()     // Catch:{ Throwable -> 0x0b7e }
            if (r9 != 0) goto L_0x011b
            float r9 = m8703(r20)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r12 = "batteryLevel"
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ Throwable -> 0x0b7e }
            r8.put(r12, r9)     // Catch:{ Throwable -> 0x0b7e }
        L_0x011b:
            java.lang.String r12 = "OPPO"
            java.lang.String r9 = android.os.Build.BRAND     // Catch:{ Throwable -> 0x0b7e }
            boolean r9 = r12.equals(r9)     // Catch:{ Throwable -> 0x0b7e }
            if (r9 == 0) goto L_0x012d
            r9 = 23
            java.lang.String r12 = "OPPO device found"
            com.appsflyer.AFLogger.afRDLog(r12)     // Catch:{ Throwable -> 0x0b7e }
            goto L_0x012f
        L_0x012d:
            r9 = 18
        L_0x012f:
            int r12 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x0b7e }
            if (r12 < r9) goto L_0x0191
            java.lang.String r9 = "keyPropDisableAFKeystore"
            com.appsflyer.AppsFlyerProperties r12 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ Throwable -> 0x0b7e }
            boolean r9 = r12.getBoolean(r9, r11)     // Catch:{ Throwable -> 0x0b7e }
            if (r9 != 0) goto L_0x0191
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r12 = "OS SDK is="
            r9.<init>(r12)     // Catch:{ Throwable -> 0x0b7e }
            int r12 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x0b7e }
            r9.append(r12)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r12 = "; use KeyStore"
            r9.append(r12)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r9 = r9.toString()     // Catch:{ Throwable -> 0x0b7e }
            com.appsflyer.AFLogger.afRDLog(r9)     // Catch:{ Throwable -> 0x0b7e }
            com.appsflyer.AFKeystoreWrapper r9 = new com.appsflyer.AFKeystoreWrapper     // Catch:{ Throwable -> 0x0b7e }
            r9.<init>(r2)     // Catch:{ Throwable -> 0x0b7e }
            boolean r12 = r9.mo7385()     // Catch:{ Throwable -> 0x0b7e }
            if (r12 != 0) goto L_0x016f
            java.lang.ref.WeakReference r12 = new java.lang.ref.WeakReference     // Catch:{ Throwable -> 0x0b7e }
            r12.<init>(r2)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r12 = com.appsflyer.C1900t.m8826(r12)     // Catch:{ Throwable -> 0x0b7e }
            r9.mo7384(r12)     // Catch:{ Throwable -> 0x0b7e }
            goto L_0x0172
        L_0x016f:
            r9.mo7387()     // Catch:{ Throwable -> 0x0b7e }
        L_0x0172:
            java.lang.String r12 = "KSAppsFlyerId"
            java.lang.String r15 = r9.mo7388()     // Catch:{ Throwable -> 0x0b7e }
            com.appsflyer.AppsFlyerProperties r10 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ Throwable -> 0x0b7e }
            r10.set(r12, r15)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r10 = "KSAppsFlyerRICounter"
            int r9 = r9.mo7386()     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ Throwable -> 0x0b7e }
            com.appsflyer.AppsFlyerProperties r12 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ Throwable -> 0x0b7e }
            r12.set(r10, r9)     // Catch:{ Throwable -> 0x0b7e }
            goto L_0x01a9
        L_0x0191:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r10 = "OS SDK is="
            r9.<init>(r10)     // Catch:{ Throwable -> 0x0b7e }
            int r10 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x0b7e }
            r9.append(r10)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r10 = "; no KeyStore usage"
            r9.append(r10)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r9 = r9.toString()     // Catch:{ Throwable -> 0x0b7e }
            com.appsflyer.AFLogger.afRDLog(r9)     // Catch:{ Throwable -> 0x0b7e }
        L_0x01a9:
            java.lang.String r9 = "timepassedsincelastlaunch"
            java.lang.String r10 = "appsflyer-data"
            android.content.SharedPreferences r10 = com.p280ss.android.ugc.aweme.p340x.C7285c.m22838a(r2, r10, r11)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r12 = "AppsFlyerTimePassedSincePrevLaunch"
            long r17 = r10.getLong(r12, r13)     // Catch:{ Throwable -> 0x0b7e }
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r10 = "AppsFlyerTimePassedSincePrevLaunch"
            m8694(r2, r10, r11)     // Catch:{ Throwable -> 0x0b7e }
            int r10 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r10 <= 0) goto L_0x01ca
            long r11 = r11 - r17
            r15 = 1000(0x3e8, double:4.94E-321)
            long r11 = r11 / r15
            goto L_0x01cc
        L_0x01ca:
            r11 = -1
        L_0x01cc:
            java.lang.String r10 = java.lang.Long.toString(r11)     // Catch:{ Throwable -> 0x0b7e }
            r8.put(r9, r10)     // Catch:{ Throwable -> 0x0b7e }
            com.appsflyer.AppsFlyerProperties r9 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r10 = "oneLinkSlug"
            java.lang.String r9 = r9.getString(r10)     // Catch:{ Throwable -> 0x0b7e }
            if (r9 == 0) goto L_0x01f3
            java.lang.String r10 = "onelink_id"
            r8.put(r10, r9)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r9 = "ol_ver"
            com.appsflyer.AppsFlyerProperties r10 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r11 = "onelinkVersion"
            java.lang.String r10 = r10.getString(r11)     // Catch:{ Throwable -> 0x0b7e }
            r8.put(r9, r10)     // Catch:{ Throwable -> 0x0b7e }
        L_0x01f3:
            java.lang.String r9 = "appsflyerGetConversionDataTiming"
            long r9 = r6.getLong(r9, r13)     // Catch:{ Throwable -> 0x0b7e }
            int r11 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r11 <= 0) goto L_0x0292
            java.lang.String r11 = "gcd_timing"
            java.lang.String r9 = java.lang.Long.toString(r9)     // Catch:{ Throwable -> 0x0b7e }
            r8.put(r11, r9)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r9 = "appsflyerGetConversionDataTiming"
            android.content.SharedPreferences$Editor r10 = r26.edit()     // Catch:{ Throwable -> 0x0b7e }
            r10.putLong(r9, r13)     // Catch:{ Throwable -> 0x0b7e }
            int r9 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x0b7e }
            r11 = 9
            if (r9 < r11) goto L_0x021a
            r10.apply()     // Catch:{ Throwable -> 0x0b7e }
            goto L_0x0292
        L_0x021a:
            r10.commit()     // Catch:{ Throwable -> 0x0b7e }
            goto L_0x0292
        L_0x021e:
            java.lang.String r9 = "appsflyer-data"
            r10 = 0
            android.content.SharedPreferences r9 = com.p280ss.android.ugc.aweme.p340x.C7285c.m22838a(r2, r9, r10)     // Catch:{ Throwable -> 0x0b7e }
            android.content.SharedPreferences$Editor r10 = r9.edit()     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r11 = "prev_event_name"
            r12 = 0
            java.lang.String r11 = r9.getString(r11, r12)     // Catch:{ Exception -> 0x028b }
            if (r11 == 0) goto L_0x026a
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ Exception -> 0x028b }
            r12.<init>()     // Catch:{ Exception -> 0x028b }
            java.lang.String r15 = "prev_event_timestamp"
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x028b }
            r13.<init>()     // Catch:{ Exception -> 0x028b }
            java.lang.String r14 = "prev_event_timestamp"
            r6 = -1
            long r6 = r9.getLong(r14, r6)     // Catch:{ Exception -> 0x028b }
            r13.append(r6)     // Catch:{ Exception -> 0x028b }
            java.lang.String r6 = r13.toString()     // Catch:{ Exception -> 0x028b }
            r12.put(r15, r6)     // Catch:{ Exception -> 0x028b }
            java.lang.String r6 = "prev_event_value"
            java.lang.String r7 = "prev_event_value"
            r13 = 0
            java.lang.String r7 = r9.getString(r7, r13)     // Catch:{ Exception -> 0x028b }
            r12.put(r6, r7)     // Catch:{ Exception -> 0x028b }
            java.lang.String r6 = "prev_event_name"
            r12.put(r6, r11)     // Catch:{ Exception -> 0x028b }
            java.lang.String r6 = "prev_event"
            java.lang.String r7 = r12.toString()     // Catch:{ Exception -> 0x028b }
            r8.put(r6, r7)     // Catch:{ Exception -> 0x028b }
        L_0x026a:
            java.lang.String r6 = "prev_event_name"
            r10.putString(r6, r4)     // Catch:{ Exception -> 0x028b }
            java.lang.String r6 = "prev_event_value"
            r10.putString(r6, r5)     // Catch:{ Exception -> 0x028b }
            java.lang.String r6 = "prev_event_timestamp"
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x028b }
            r10.putLong(r6, r11)     // Catch:{ Exception -> 0x028b }
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x028b }
            r7 = 9
            if (r6 < r7) goto L_0x0287
            r10.apply()     // Catch:{ Exception -> 0x028b }
            goto L_0x0292
        L_0x0287:
            r10.commit()     // Catch:{ Exception -> 0x028b }
            goto L_0x0292
        L_0x028b:
            r0 = move-exception
            r6 = r0
            java.lang.String r7 = "Error while processing previous event."
            com.appsflyer.AFLogger.afErrorLog(r7, r6)     // Catch:{ Throwable -> 0x0b7e }
        L_0x0292:
            java.lang.String r6 = "KSAppsFlyerId"
            com.appsflyer.AppsFlyerProperties r7 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r6 = r7.getString(r6)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r7 = "KSAppsFlyerRICounter"
            com.appsflyer.AppsFlyerProperties r9 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r7 = r9.getString(r7)     // Catch:{ Throwable -> 0x0b7e }
            if (r6 == 0) goto L_0x02be
            if (r7 == 0) goto L_0x02be
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)     // Catch:{ Throwable -> 0x0b7e }
            int r9 = r9.intValue()     // Catch:{ Throwable -> 0x0b7e }
            if (r9 <= 0) goto L_0x02be
            java.lang.String r9 = "reinstallCounter"
            r8.put(r9, r7)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r7 = "originalAppsflyerId"
            r8.put(r7, r6)     // Catch:{ Throwable -> 0x0b7e }
        L_0x02be:
            java.lang.String r6 = "additionalCustomData"
            com.appsflyer.AppsFlyerProperties r7 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r6 = r7.getString(r6)     // Catch:{ Throwable -> 0x0b7e }
            if (r6 == 0) goto L_0x02cf
            java.lang.String r7 = "customData"
            r8.put(r7, r6)     // Catch:{ Throwable -> 0x0b7e }
        L_0x02cf:
            android.content.pm.PackageManager r6 = r20.getPackageManager()     // Catch:{ Exception -> 0x02e3 }
            java.lang.String r7 = r20.getPackageName()     // Catch:{ Exception -> 0x02e3 }
            java.lang.String r6 = r6.getInstallerPackageName(r7)     // Catch:{ Exception -> 0x02e3 }
            if (r6 == 0) goto L_0x02ea
            java.lang.String r7 = "installer_package"
            r8.put(r7, r6)     // Catch:{ Exception -> 0x02e3 }
            goto L_0x02ea
        L_0x02e3:
            r0 = move-exception
            r6 = r0
            java.lang.String r7 = "Exception while getting the app's installer package. "
            com.appsflyer.AFLogger.afErrorLog(r7, r6)     // Catch:{ Throwable -> 0x0b7e }
        L_0x02ea:
            com.appsflyer.AppsFlyerProperties r6 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r7 = "sdkExtension"
            java.lang.String r6 = r6.getString(r7)     // Catch:{ Throwable -> 0x0b7e }
            if (r6 == 0) goto L_0x0301
            int r7 = r6.length()     // Catch:{ Throwable -> 0x0b7e }
            if (r7 <= 0) goto L_0x0301
            java.lang.String r7 = "sdkExtension"
            r8.put(r7, r6)     // Catch:{ Throwable -> 0x0b7e }
        L_0x0301:
            java.lang.ref.WeakReference r6 = new java.lang.ref.WeakReference     // Catch:{ Throwable -> 0x0b7e }
            r6.<init>(r2)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r6 = m8691(r6)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r7 = m8704(r2, r6)     // Catch:{ Throwable -> 0x0b7e }
            if (r7 == 0) goto L_0x0315
            java.lang.String r9 = "channel"
            r8.put(r9, r7)     // Catch:{ Throwable -> 0x0b7e }
        L_0x0315:
            if (r7 == 0) goto L_0x031d
            boolean r9 = r7.equals(r6)     // Catch:{ Throwable -> 0x0b7e }
            if (r9 == 0) goto L_0x0321
        L_0x031d:
            if (r7 != 0) goto L_0x0326
            if (r6 == 0) goto L_0x0326
        L_0x0321:
            java.lang.String r7 = "af_latestchannel"
            r8.put(r7, r6)     // Catch:{ Throwable -> 0x0b7e }
        L_0x0326:
            java.lang.String r6 = "appsflyer-data"
            r7 = 0
            android.content.SharedPreferences r6 = com.p280ss.android.ugc.aweme.p340x.C7285c.m22838a(r2, r6, r7)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r7 = "INSTALL_STORE"
            boolean r7 = r6.contains(r7)     // Catch:{ Throwable -> 0x0b7e }
            if (r7 == 0) goto L_0x033d
            java.lang.String r7 = "INSTALL_STORE"
            r9 = 0
            java.lang.String r6 = r6.getString(r7, r9)     // Catch:{ Throwable -> 0x0b7e }
            goto L_0x035a
        L_0x033d:
            java.lang.String r6 = "appsflyer-data"
            r7 = 0
            android.content.SharedPreferences r6 = com.p280ss.android.ugc.aweme.p340x.C7285c.m22838a(r2, r6, r7)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r7 = "appsFlyerCount"
            boolean r6 = r6.contains(r7)     // Catch:{ Throwable -> 0x0b7e }
            r7 = 1
            r6 = r6 ^ r7
            if (r6 == 0) goto L_0x0354
            java.lang.String r9 = m8652(r20)     // Catch:{ Throwable -> 0x0b7e }
            r6 = r9
            goto L_0x0355
        L_0x0354:
            r6 = 0
        L_0x0355:
            java.lang.String r7 = "INSTALL_STORE"
            m8695(r2, r7, r6)     // Catch:{ Throwable -> 0x0b7e }
        L_0x035a:
            if (r6 == 0) goto L_0x0365
            java.lang.String r7 = "af_installstore"
            java.lang.String r6 = r6.toLowerCase()     // Catch:{ Throwable -> 0x0b7e }
            r8.put(r7, r6)     // Catch:{ Throwable -> 0x0b7e }
        L_0x0365:
            java.lang.String r6 = "appsflyer-data"
            r7 = 0
            android.content.SharedPreferences r6 = com.p280ss.android.ugc.aweme.p340x.C7285c.m22838a(r2, r6, r7)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r7 = "preInstallName"
            com.appsflyer.AppsFlyerProperties r9 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r7 = r9.getString(r7)     // Catch:{ Throwable -> 0x0b7e }
            if (r7 != 0) goto L_0x0428
            java.lang.String r9 = "preInstallName"
            boolean r9 = r6.contains(r9)     // Catch:{ Throwable -> 0x0b7e }
            if (r9 == 0) goto L_0x038a
            java.lang.String r7 = "preInstallName"
            r9 = 0
            java.lang.String r6 = r6.getString(r7, r9)     // Catch:{ Throwable -> 0x0b7e }
            r7 = r6
            goto L_0x041d
        L_0x038a:
            java.lang.String r6 = "appsflyer-data"
            r9 = 0
            android.content.SharedPreferences r6 = com.p280ss.android.ugc.aweme.p340x.C7285c.m22838a(r2, r6, r9)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r9 = "appsFlyerCount"
            boolean r6 = r6.contains(r9)     // Catch:{ Throwable -> 0x0b7e }
            r9 = 1
            r6 = r6 ^ r9
            if (r6 == 0) goto L_0x0416
            java.lang.String r6 = "ro.appsflyer.preinstall.path"
            java.lang.String r6 = m8655(r6)     // Catch:{ Throwable -> 0x0b7e }
            java.io.File r6 = m8672(r6)     // Catch:{ Throwable -> 0x0b7e }
            if (r6 == 0) goto L_0x03b0
            boolean r7 = r6.exists()     // Catch:{ Throwable -> 0x0b7e }
            if (r7 != 0) goto L_0x03ae
            goto L_0x03b0
        L_0x03ae:
            r7 = 0
            goto L_0x03b1
        L_0x03b0:
            r7 = 1
        L_0x03b1:
            if (r7 == 0) goto L_0x03c5
            java.lang.String r6 = "AF_PRE_INSTALL_PATH"
            android.content.pm.PackageManager r7 = r20.getPackageManager()     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r9 = r20.getPackageName()     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r6 = m8661(r6, r7, r9)     // Catch:{ Throwable -> 0x0b7e }
            java.io.File r6 = m8672(r6)     // Catch:{ Throwable -> 0x0b7e }
        L_0x03c5:
            if (r6 == 0) goto L_0x03d0
            boolean r7 = r6.exists()     // Catch:{ Throwable -> 0x0b7e }
            if (r7 != 0) goto L_0x03ce
            goto L_0x03d0
        L_0x03ce:
            r7 = 0
            goto L_0x03d1
        L_0x03d0:
            r7 = 1
        L_0x03d1:
            if (r7 == 0) goto L_0x03d9
            java.lang.String r6 = "/data/local/tmp/pre_install.appsflyer"
            java.io.File r6 = m8672(r6)     // Catch:{ Throwable -> 0x0b7e }
        L_0x03d9:
            if (r6 == 0) goto L_0x03e4
            boolean r7 = r6.exists()     // Catch:{ Throwable -> 0x0b7e }
            if (r7 != 0) goto L_0x03e2
            goto L_0x03e4
        L_0x03e2:
            r7 = 0
            goto L_0x03e5
        L_0x03e4:
            r7 = 1
        L_0x03e5:
            if (r7 == 0) goto L_0x03ed
            java.lang.String r6 = "/etc/pre_install.appsflyer"
            java.io.File r6 = m8672(r6)     // Catch:{ Throwable -> 0x0b7e }
        L_0x03ed:
            if (r6 == 0) goto L_0x03f8
            boolean r7 = r6.exists()     // Catch:{ Throwable -> 0x0b7e }
            if (r7 != 0) goto L_0x03f6
            goto L_0x03f8
        L_0x03f6:
            r7 = 0
            goto L_0x03f9
        L_0x03f8:
            r7 = 1
        L_0x03f9:
            if (r7 != 0) goto L_0x0407
            java.lang.String r7 = r20.getPackageName()     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r9 = m8689(r6, r7)     // Catch:{ Throwable -> 0x0b7e }
            if (r9 == 0) goto L_0x0407
            r7 = r9
            goto L_0x0408
        L_0x0407:
            r7 = 0
        L_0x0408:
            if (r7 == 0) goto L_0x040b
            goto L_0x0416
        L_0x040b:
            java.lang.ref.WeakReference r6 = new java.lang.ref.WeakReference     // Catch:{ Throwable -> 0x0b7e }
            r6.<init>(r2)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r7 = "AF_PRE_INSTALL_NAME"
            java.lang.String r7 = m8698(r6, r7)     // Catch:{ Throwable -> 0x0b7e }
        L_0x0416:
            if (r7 == 0) goto L_0x041d
            java.lang.String r6 = "preInstallName"
            m8695(r2, r6, r7)     // Catch:{ Throwable -> 0x0b7e }
        L_0x041d:
            if (r7 == 0) goto L_0x0428
            java.lang.String r6 = "preInstallName"
            com.appsflyer.AppsFlyerProperties r9 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ Throwable -> 0x0b7e }
            r9.set(r6, r7)     // Catch:{ Throwable -> 0x0b7e }
        L_0x0428:
            if (r7 == 0) goto L_0x0433
            java.lang.String r6 = "af_preinstall_name"
            java.lang.String r7 = r7.toLowerCase()     // Catch:{ Throwable -> 0x0b7e }
            r8.put(r6, r7)     // Catch:{ Throwable -> 0x0b7e }
        L_0x0433:
            java.lang.String r6 = m8652(r20)     // Catch:{ Throwable -> 0x0b7e }
            if (r6 == 0) goto L_0x0442
            java.lang.String r7 = "af_currentstore"
            java.lang.String r6 = r6.toLowerCase()     // Catch:{ Throwable -> 0x0b7e }
            r8.put(r7, r6)     // Catch:{ Throwable -> 0x0b7e }
        L_0x0442:
            if (r3 == 0) goto L_0x0450
            int r6 = r21.length()     // Catch:{ Throwable -> 0x0b7e }
            if (r6 < 0) goto L_0x0450
            java.lang.String r6 = "appsflyerKey"
            r8.put(r6, r3)     // Catch:{ Throwable -> 0x0b7e }
            goto L_0x0467
        L_0x0450:
            java.lang.String r3 = "AppsFlyerKey"
            com.appsflyer.AppsFlyerProperties r6 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r3 = r6.getString(r3)     // Catch:{ Throwable -> 0x0b7e }
            if (r3 == 0) goto L_0x0b6b
            int r6 = r3.length()     // Catch:{ Throwable -> 0x0b7e }
            if (r6 < 0) goto L_0x0b6b
            java.lang.String r6 = "appsflyerKey"
            r8.put(r6, r3)     // Catch:{ Throwable -> 0x0b7e }
        L_0x0467:
            java.lang.String r3 = "AppUserId"
            com.appsflyer.AppsFlyerProperties r6 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r3 = r6.getString(r3)     // Catch:{ Throwable -> 0x0b7e }
            if (r3 == 0) goto L_0x0478
            java.lang.String r6 = "appUserId"
            r8.put(r6, r3)     // Catch:{ Throwable -> 0x0b7e }
        L_0x0478:
            com.appsflyer.AppsFlyerProperties r3 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r6 = "userEmails"
            java.lang.String r3 = r3.getString(r6)     // Catch:{ Throwable -> 0x0b7e }
            if (r3 == 0) goto L_0x048a
            java.lang.String r6 = "user_emails"
            r8.put(r6, r3)     // Catch:{ Throwable -> 0x0b7e }
            goto L_0x049f
        L_0x048a:
            java.lang.String r3 = "userEmail"
            com.appsflyer.AppsFlyerProperties r6 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r3 = r6.getString(r3)     // Catch:{ Throwable -> 0x0b7e }
            if (r3 == 0) goto L_0x049f
            java.lang.String r6 = "sha1_el"
            java.lang.String r3 = com.appsflyer.C1898r.m8805(r3)     // Catch:{ Throwable -> 0x0b7e }
            r8.put(r6, r3)     // Catch:{ Throwable -> 0x0b7e }
        L_0x049f:
            if (r4 == 0) goto L_0x04ad
            java.lang.String r3 = "eventName"
            r8.put(r3, r4)     // Catch:{ Throwable -> 0x0b7e }
            if (r5 == 0) goto L_0x04ad
            java.lang.String r3 = "eventValue"
            r8.put(r3, r5)     // Catch:{ Throwable -> 0x0b7e }
        L_0x04ad:
            java.lang.String r3 = "appid"
            com.appsflyer.AppsFlyerProperties r5 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r3 = r5.getString(r3)     // Catch:{ Throwable -> 0x0b7e }
            if (r3 == 0) goto L_0x04c8
            java.lang.String r3 = "appid"
            java.lang.String r5 = "appid"
            com.appsflyer.AppsFlyerProperties r6 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r5 = r6.getString(r5)     // Catch:{ Throwable -> 0x0b7e }
            r8.put(r3, r5)     // Catch:{ Throwable -> 0x0b7e }
        L_0x04c8:
            java.lang.String r3 = "currencyCode"
            com.appsflyer.AppsFlyerProperties r5 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r3 = r5.getString(r3)     // Catch:{ Throwable -> 0x0b7e }
            r5 = 3
            if (r3 == 0) goto L_0x04f6
            int r6 = r3.length()     // Catch:{ Throwable -> 0x0b7e }
            if (r6 == r5) goto L_0x04f1
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r7 = "WARNING: currency code should be 3 characters!!! '"
            r6.<init>(r7)     // Catch:{ Throwable -> 0x0b7e }
            r6.append(r3)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r7 = "' is not a legal value."
            r6.append(r7)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r6 = r6.toString()     // Catch:{ Throwable -> 0x0b7e }
            com.appsflyer.AFLogger.afWarnLog(r6)     // Catch:{ Throwable -> 0x0b7e }
        L_0x04f1:
            java.lang.String r6 = "currency"
            r8.put(r6, r3)     // Catch:{ Throwable -> 0x0b7e }
        L_0x04f6:
            java.lang.String r3 = "IS_UPDATE"
            com.appsflyer.AppsFlyerProperties r6 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r3 = r6.getString(r3)     // Catch:{ Throwable -> 0x0b7e }
            if (r3 == 0) goto L_0x0507
            java.lang.String r6 = "isUpdate"
            r8.put(r6, r3)     // Catch:{ Throwable -> 0x0b7e }
        L_0x0507:
            boolean r3 = r19.isPreInstalledApp(r20)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r6 = "af_preinstalled"
            java.lang.String r3 = java.lang.Boolean.toString(r3)     // Catch:{ Throwable -> 0x0b7e }
            r8.put(r6, r3)     // Catch:{ Throwable -> 0x0b7e }
            com.appsflyer.AppsFlyerProperties r3 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r6 = "collectFacebookAttrId"
            r7 = 1
            boolean r3 = r3.getBoolean(r6, r7)     // Catch:{ Throwable -> 0x0b7e }
            if (r3 == 0) goto L_0x054a
            android.content.pm.PackageManager r3 = r20.getPackageManager()     // Catch:{ NameNotFoundException -> 0x053d, Throwable -> 0x0534 }
            java.lang.String r6 = "com.facebook.katana"
            r7 = 0
            com.appsflyer.AppsFlyerLib._lancet.m8717x89c42dc8(r3, r6, r7)     // Catch:{ NameNotFoundException -> 0x053d, Throwable -> 0x0534 }
            android.content.ContentResolver r3 = r20.getContentResolver()     // Catch:{ NameNotFoundException -> 0x053d, Throwable -> 0x0534 }
            java.lang.String r9 = r1.getAttributionId(r3)     // Catch:{ NameNotFoundException -> 0x053d, Throwable -> 0x0534 }
            goto L_0x0543
        L_0x0534:
            r0 = move-exception
            r3 = r0
            java.lang.String r6 = "Exception while collecting facebook's attribution ID. "
            com.appsflyer.AFLogger.afErrorLog(r6, r3)     // Catch:{ Throwable -> 0x0b7e }
        L_0x053b:
            r9 = 0
            goto L_0x0543
        L_0x053d:
            java.lang.String r3 = "Exception while collecting facebook's attribution ID. "
            com.appsflyer.AFLogger.afWarnLog(r3)     // Catch:{ Throwable -> 0x0b7e }
            goto L_0x053b
        L_0x0543:
            if (r9 == 0) goto L_0x054a
            java.lang.String r3 = "fb"
            r8.put(r3, r9)     // Catch:{ Throwable -> 0x0b7e }
        L_0x054a:
            com.appsflyer.AppsFlyerProperties r3 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r6 = "deviceTrackingDisabled"
            r7 = 0
            boolean r3 = r3.getBoolean(r6, r7)     // Catch:{ Throwable -> 0x0b7e }
            if (r3 == 0) goto L_0x0560
            java.lang.String r3 = "deviceTrackingDisabled"
            java.lang.String r6 = "true"
            r8.put(r3, r6)     // Catch:{ Throwable -> 0x0b7e }
            goto L_0x067e
        L_0x0560:
            java.lang.String r3 = "appsflyer-data"
            r6 = 0
            android.content.SharedPreferences r3 = com.p280ss.android.ugc.aweme.p340x.C7285c.m22838a(r2, r3, r6)     // Catch:{ Throwable -> 0x0b7e }
            com.appsflyer.AppsFlyerProperties r6 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r7 = "collectIMEI"
            r9 = 1
            boolean r6 = r6.getBoolean(r7, r9)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r7 = "imeiCached"
            r9 = 0
            java.lang.String r7 = r3.getString(r7, r9)     // Catch:{ Throwable -> 0x0b7e }
            if (r6 == 0) goto L_0x05ee
            java.lang.String r6 = r1.f6707     // Catch:{ Throwable -> 0x0b7e }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Throwable -> 0x0b7e }
            if (r6 == 0) goto L_0x05ee
            boolean r6 = m8653(r20)     // Catch:{ Throwable -> 0x0b7e }
            if (r6 == 0) goto L_0x05f5
            java.lang.String r6 = "phone"
            java.lang.Object r6 = r2.getSystemService(r6)     // Catch:{ InvocationTargetException -> 0x05d5, Exception -> 0x05bb }
            android.telephony.TelephonyManager r6 = (android.telephony.TelephonyManager) r6     // Catch:{ InvocationTargetException -> 0x05d5, Exception -> 0x05bb }
            java.lang.Class r9 = r6.getClass()     // Catch:{ InvocationTargetException -> 0x05d5, Exception -> 0x05bb }
            java.lang.String r10 = "getDeviceId"
            r11 = 0
            java.lang.Class[] r12 = new java.lang.Class[r11]     // Catch:{ InvocationTargetException -> 0x05d5, Exception -> 0x05bb }
            java.lang.reflect.Method r9 = r9.getMethod(r10, r12)     // Catch:{ InvocationTargetException -> 0x05d5, Exception -> 0x05bb }
            java.lang.Object[] r10 = new java.lang.Object[r11]     // Catch:{ InvocationTargetException -> 0x05d5, Exception -> 0x05bb }
            java.lang.Object r6 = r9.invoke(r6, r10)     // Catch:{ InvocationTargetException -> 0x05d5, Exception -> 0x05bb }
            r9 = r6
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ InvocationTargetException -> 0x05d5, Exception -> 0x05bb }
            if (r9 == 0) goto L_0x05aa
            goto L_0x05f6
        L_0x05aa:
            if (r7 == 0) goto L_0x05f5
            java.lang.String r6 = "use cached IMEI: "
            java.lang.String r9 = java.lang.String.valueOf(r7)     // Catch:{ InvocationTargetException -> 0x05d5, Exception -> 0x05bb }
            java.lang.String r6 = r6.concat(r9)     // Catch:{ InvocationTargetException -> 0x05d5, Exception -> 0x05bb }
            com.appsflyer.AFLogger.afDebugLog(r6)     // Catch:{ InvocationTargetException -> 0x05d5, Exception -> 0x05bb }
            r9 = r7
            goto L_0x05f6
        L_0x05bb:
            r0 = move-exception
            r6 = r0
            if (r7 == 0) goto L_0x05ce
            java.lang.String r9 = "use cached IMEI: "
            java.lang.String r10 = java.lang.String.valueOf(r7)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r9 = r9.concat(r10)     // Catch:{ Throwable -> 0x0b7e }
            com.appsflyer.AFLogger.afDebugLog(r9)     // Catch:{ Throwable -> 0x0b7e }
            r9 = r7
            goto L_0x05cf
        L_0x05ce:
            r9 = 0
        L_0x05cf:
            java.lang.String r7 = "WARNING: other reason: "
            com.appsflyer.AFLogger.afErrorLog(r7, r6)     // Catch:{ Throwable -> 0x0b7e }
            goto L_0x05f6
        L_0x05d5:
            if (r7 == 0) goto L_0x05e7
            java.lang.String r6 = "use cached IMEI: "
            java.lang.String r9 = java.lang.String.valueOf(r7)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r6 = r6.concat(r9)     // Catch:{ Throwable -> 0x0b7e }
            com.appsflyer.AFLogger.afDebugLog(r6)     // Catch:{ Throwable -> 0x0b7e }
            r9 = r7
            goto L_0x05e8
        L_0x05e7:
            r9 = 0
        L_0x05e8:
            java.lang.String r6 = "WARNING: READ_PHONE_STATE is missing."
            com.appsflyer.AFLogger.afWarnLog(r6)     // Catch:{ Throwable -> 0x0b7e }
            goto L_0x05f6
        L_0x05ee:
            java.lang.String r6 = r1.f6707     // Catch:{ Throwable -> 0x0b7e }
            if (r6 == 0) goto L_0x05f5
            java.lang.String r9 = r1.f6707     // Catch:{ Throwable -> 0x0b7e }
            goto L_0x05f6
        L_0x05f5:
            r9 = 0
        L_0x05f6:
            if (r9 == 0) goto L_0x0603
            java.lang.String r6 = "imeiCached"
            m8695(r2, r6, r9)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r6 = "imei"
            r8.put(r6, r9)     // Catch:{ Throwable -> 0x0b7e }
            goto L_0x0608
        L_0x0603:
            java.lang.String r6 = "IMEI was not collected."
            com.appsflyer.AFLogger.afInfoLog(r6)     // Catch:{ Throwable -> 0x0b7e }
        L_0x0608:
            com.appsflyer.AppsFlyerProperties r6 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r7 = "collectAndroidId"
            r9 = 1
            boolean r6 = r6.getBoolean(r7, r9)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r7 = "androidIdCached"
            r9 = 0
            java.lang.String r3 = r3.getString(r7, r9)     // Catch:{ Throwable -> 0x0b7e }
            if (r6 == 0) goto L_0x0664
            java.lang.String r6 = r1.f6716     // Catch:{ Throwable -> 0x0b7e }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Throwable -> 0x0b7e }
            if (r6 == 0) goto L_0x0664
            boolean r6 = m8653(r20)     // Catch:{ Throwable -> 0x0b7e }
            if (r6 == 0) goto L_0x066b
            android.content.ContentResolver r6 = r20.getContentResolver()     // Catch:{ Exception -> 0x0648 }
            java.lang.String r7 = "android_id"
            java.lang.String r9 = android.provider.Settings.Secure.getString(r6, r7)     // Catch:{ Exception -> 0x0648 }
            if (r9 == 0) goto L_0x0637
            goto L_0x066c
        L_0x0637:
            if (r3 == 0) goto L_0x066b
            java.lang.String r6 = "use cached AndroidId: "
            java.lang.String r7 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x0648 }
            java.lang.String r6 = r6.concat(r7)     // Catch:{ Exception -> 0x0648 }
            com.appsflyer.AFLogger.afDebugLog(r6)     // Catch:{ Exception -> 0x0648 }
            r9 = r3
            goto L_0x066c
        L_0x0648:
            r0 = move-exception
            r6 = r0
            if (r3 == 0) goto L_0x065b
            java.lang.String r7 = "use cached AndroidId: "
            java.lang.String r9 = java.lang.String.valueOf(r3)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r7 = r7.concat(r9)     // Catch:{ Throwable -> 0x0b7e }
            com.appsflyer.AFLogger.afDebugLog(r7)     // Catch:{ Throwable -> 0x0b7e }
            r9 = r3
            goto L_0x065c
        L_0x065b:
            r9 = 0
        L_0x065c:
            java.lang.String r3 = r6.getMessage()     // Catch:{ Throwable -> 0x0b7e }
            com.appsflyer.AFLogger.afErrorLog(r3, r6)     // Catch:{ Throwable -> 0x0b7e }
            goto L_0x066c
        L_0x0664:
            java.lang.String r3 = r1.f6716     // Catch:{ Throwable -> 0x0b7e }
            if (r3 == 0) goto L_0x066b
            java.lang.String r9 = r1.f6716     // Catch:{ Throwable -> 0x0b7e }
            goto L_0x066c
        L_0x066b:
            r9 = 0
        L_0x066c:
            if (r9 == 0) goto L_0x0679
            java.lang.String r3 = "androidIdCached"
            m8695(r2, r3, r9)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r3 = "android_id"
            r8.put(r3, r9)     // Catch:{ Throwable -> 0x0b7e }
            goto L_0x067e
        L_0x0679:
            java.lang.String r3 = "Android ID was not collected."
            com.appsflyer.AFLogger.afInfoLog(r3)     // Catch:{ Throwable -> 0x0b7e }
        L_0x067e:
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference     // Catch:{ Exception -> 0x068f }
            r3.<init>(r2)     // Catch:{ Exception -> 0x068f }
            java.lang.String r3 = com.appsflyer.C1900t.m8826(r3)     // Catch:{ Exception -> 0x068f }
            if (r3 == 0) goto L_0x06a6
            java.lang.String r6 = "uid"
            r8.put(r6, r3)     // Catch:{ Exception -> 0x068f }
            goto L_0x06a6
        L_0x068f:
            r0 = move-exception
            r3 = r0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r7 = "ERROR: could not get uid "
            r6.<init>(r7)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r7 = r3.getMessage()     // Catch:{ Throwable -> 0x0b7e }
            r6.append(r7)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r6 = r6.toString()     // Catch:{ Throwable -> 0x0b7e }
            com.appsflyer.AFLogger.afErrorLog(r6, r3)     // Catch:{ Throwable -> 0x0b7e }
        L_0x06a6:
            java.lang.String r3 = "lang"
            java.util.Locale r6 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x06b4 }
            java.lang.String r6 = r6.getDisplayLanguage()     // Catch:{ Exception -> 0x06b4 }
            r8.put(r3, r6)     // Catch:{ Exception -> 0x06b4 }
            goto L_0x06bb
        L_0x06b4:
            r0 = move-exception
            r3 = r0
            java.lang.String r6 = "Exception while collecting display language name. "
            com.appsflyer.AFLogger.afErrorLog(r6, r3)     // Catch:{ Throwable -> 0x0b7e }
        L_0x06bb:
            java.lang.String r3 = "lang_code"
            java.util.Locale r6 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x06c9 }
            java.lang.String r6 = r6.getLanguage()     // Catch:{ Exception -> 0x06c9 }
            r8.put(r3, r6)     // Catch:{ Exception -> 0x06c9 }
            goto L_0x06d0
        L_0x06c9:
            r0 = move-exception
            r3 = r0
            java.lang.String r6 = "Exception while collecting display language code. "
            com.appsflyer.AFLogger.afErrorLog(r6, r3)     // Catch:{ Throwable -> 0x0b7e }
        L_0x06d0:
            java.lang.String r3 = "country"
            java.util.Locale r6 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x06de }
            java.lang.String r6 = r6.getCountry()     // Catch:{ Exception -> 0x06de }
            r8.put(r3, r6)     // Catch:{ Exception -> 0x06de }
            goto L_0x06e5
        L_0x06de:
            r0 = move-exception
            r3 = r0
            java.lang.String r6 = "Exception while collecting country name. "
            com.appsflyer.AFLogger.afErrorLog(r6, r3)     // Catch:{ Throwable -> 0x0b7e }
        L_0x06e5:
            java.lang.String r3 = "platformextension"
            com.appsflyer.p r6 = r1.f6711     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r6 = r6.mo7506()     // Catch:{ Throwable -> 0x0b7e }
            r8.put(r3, r6)     // Catch:{ Throwable -> 0x0b7e }
            m8680(r2, r8)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r3 = "yyyy-MM-dd_HHmmssZ"
            java.text.SimpleDateFormat r6 = new java.text.SimpleDateFormat     // Catch:{ Throwable -> 0x0b7e }
            java.util.Locale r7 = java.util.Locale.US     // Catch:{ Throwable -> 0x0b7e }
            r6.<init>(r3, r7)     // Catch:{ Throwable -> 0x0b7e }
            android.content.pm.PackageManager r3 = r20.getPackageManager()     // Catch:{ Exception -> 0x0723 }
            java.lang.String r7 = r20.getPackageName()     // Catch:{ Exception -> 0x0723 }
            r9 = 0
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r7, r9)     // Catch:{ Exception -> 0x0723 }
            long r9 = r3.firstInstallTime     // Catch:{ Exception -> 0x0723 }
            java.lang.String r3 = "installDate"
            java.lang.String r7 = "UTC"
            java.util.TimeZone r7 = java.util.TimeZone.getTimeZone(r7)     // Catch:{ Exception -> 0x0723 }
            r6.setTimeZone(r7)     // Catch:{ Exception -> 0x0723 }
            java.util.Date r7 = new java.util.Date     // Catch:{ Exception -> 0x0723 }
            r7.<init>(r9)     // Catch:{ Exception -> 0x0723 }
            java.lang.String r7 = r6.format(r7)     // Catch:{ Exception -> 0x0723 }
            r8.put(r3, r7)     // Catch:{ Exception -> 0x0723 }
            goto L_0x072a
        L_0x0723:
            r0 = move-exception
            r3 = r0
            java.lang.String r7 = "Exception while collecting install date. "
            com.appsflyer.AFLogger.afErrorLog(r7, r3)     // Catch:{ Throwable -> 0x0b7e }
        L_0x072a:
            android.content.pm.PackageManager r3 = r20.getPackageManager()     // Catch:{ Throwable -> 0x07de }
            java.lang.String r7 = r20.getPackageName()     // Catch:{ Throwable -> 0x07de }
            r9 = 0
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r7, r9)     // Catch:{ Throwable -> 0x07de }
            java.lang.String r7 = "versionCode"
            r10 = r26
            int r7 = r10.getInt(r7, r9)     // Catch:{ Throwable -> 0x07dc }
            int r11 = r3.versionCode     // Catch:{ Throwable -> 0x07dc }
            if (r11 <= r7) goto L_0x074f
            java.lang.String r7 = "appsflyerConversionDataRequestRetries"
            m8678(r2, r7, r9)     // Catch:{ Throwable -> 0x07dc }
            java.lang.String r7 = "versionCode"
            int r9 = r3.versionCode     // Catch:{ Throwable -> 0x07dc }
            m8678(r2, r7, r9)     // Catch:{ Throwable -> 0x07dc }
        L_0x074f:
            java.lang.String r7 = "app_version_code"
            int r9 = r3.versionCode     // Catch:{ Throwable -> 0x07dc }
            java.lang.String r9 = java.lang.Integer.toString(r9)     // Catch:{ Throwable -> 0x07dc }
            r8.put(r7, r9)     // Catch:{ Throwable -> 0x07dc }
            java.lang.String r7 = "app_version_name"
            java.lang.String r9 = r3.versionName     // Catch:{ Throwable -> 0x07dc }
            r8.put(r7, r9)     // Catch:{ Throwable -> 0x07dc }
            long r11 = r3.firstInstallTime     // Catch:{ Throwable -> 0x07dc }
            long r13 = r3.lastUpdateTime     // Catch:{ Throwable -> 0x07dc }
            java.lang.String r3 = "date1"
            java.lang.String r7 = "UTC"
            java.util.TimeZone r7 = java.util.TimeZone.getTimeZone(r7)     // Catch:{ Throwable -> 0x07dc }
            r6.setTimeZone(r7)     // Catch:{ Throwable -> 0x07dc }
            java.util.Date r7 = new java.util.Date     // Catch:{ Throwable -> 0x07dc }
            r7.<init>(r11)     // Catch:{ Throwable -> 0x07dc }
            java.lang.String r7 = r6.format(r7)     // Catch:{ Throwable -> 0x07dc }
            r8.put(r3, r7)     // Catch:{ Throwable -> 0x07dc }
            java.lang.String r3 = "date2"
            java.lang.String r7 = "UTC"
            java.util.TimeZone r7 = java.util.TimeZone.getTimeZone(r7)     // Catch:{ Throwable -> 0x07dc }
            r6.setTimeZone(r7)     // Catch:{ Throwable -> 0x07dc }
            java.util.Date r7 = new java.util.Date     // Catch:{ Throwable -> 0x07dc }
            r7.<init>(r13)     // Catch:{ Throwable -> 0x07dc }
            java.lang.String r7 = r6.format(r7)     // Catch:{ Throwable -> 0x07dc }
            r8.put(r3, r7)     // Catch:{ Throwable -> 0x07dc }
            java.lang.String r3 = "appsflyer-data"
            r7 = 0
            android.content.SharedPreferences r3 = com.p280ss.android.ugc.aweme.p340x.C7285c.m22838a(r2, r3, r7)     // Catch:{ Throwable -> 0x07dc }
            java.lang.String r9 = "appsFlyerFirstInstall"
            r11 = 0
            java.lang.String r3 = r3.getString(r9, r11)     // Catch:{ Throwable -> 0x07dc }
            if (r3 != 0) goto L_0x07c9
            java.lang.String r3 = "appsflyer-data"
            android.content.SharedPreferences r3 = com.p280ss.android.ugc.aweme.p340x.C7285c.m22838a(r2, r3, r7)     // Catch:{ Throwable -> 0x07dc }
            java.lang.String r7 = "appsFlyerCount"
            boolean r3 = r3.contains(r7)     // Catch:{ Throwable -> 0x07dc }
            r7 = 1
            r3 = r3 ^ r7
            if (r3 == 0) goto L_0x07c2
            java.lang.String r3 = "AppsFlyer: first launch detected"
            com.appsflyer.AFLogger.afDebugLog(r3)     // Catch:{ Throwable -> 0x07dc }
            java.util.Date r3 = new java.util.Date     // Catch:{ Throwable -> 0x07dc }
            r3.<init>()     // Catch:{ Throwable -> 0x07dc }
            java.lang.String r3 = r6.format(r3)     // Catch:{ Throwable -> 0x07dc }
            goto L_0x07c4
        L_0x07c2:
            java.lang.String r3 = ""
        L_0x07c4:
            java.lang.String r6 = "appsFlyerFirstInstall"
            m8695(r2, r6, r3)     // Catch:{ Throwable -> 0x07dc }
        L_0x07c9:
            java.lang.String r6 = "AppsFlyer: first launch date: "
            java.lang.String r7 = java.lang.String.valueOf(r3)     // Catch:{ Throwable -> 0x07dc }
            java.lang.String r6 = r6.concat(r7)     // Catch:{ Throwable -> 0x07dc }
            com.appsflyer.AFLogger.afInfoLog(r6)     // Catch:{ Throwable -> 0x07dc }
            java.lang.String r6 = "firstLaunchDate"
            r8.put(r6, r3)     // Catch:{ Throwable -> 0x07dc }
            goto L_0x07e7
        L_0x07dc:
            r0 = move-exception
            goto L_0x07e1
        L_0x07de:
            r0 = move-exception
            r10 = r26
        L_0x07e1:
            r3 = r0
            java.lang.String r6 = "Exception while collecting app version data "
            com.appsflyer.AFLogger.afErrorLog(r6, r3)     // Catch:{ Throwable -> 0x0b7e }
        L_0x07e7:
            int r3 = r24.length()     // Catch:{ Throwable -> 0x0b7e }
            if (r3 <= 0) goto L_0x07f4
            java.lang.String r3 = "referrer"
            r6 = r24
            r8.put(r3, r6)     // Catch:{ Throwable -> 0x0b7e }
        L_0x07f4:
            java.lang.String r3 = "extraReferrers"
            r6 = 0
            java.lang.String r3 = r10.getString(r3, r6)     // Catch:{ Throwable -> 0x0b7e }
            if (r3 == 0) goto L_0x0802
            java.lang.String r6 = "extraReferrers"
            r8.put(r6, r3)     // Catch:{ Throwable -> 0x0b7e }
        L_0x0802:
            java.lang.String r3 = "afUninstallToken"
            com.appsflyer.AppsFlyerProperties r6 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r3 = r6.getString(r3)     // Catch:{ Throwable -> 0x0b7e }
            if (r3 == 0) goto L_0x0819
            com.appsflyer.c$a$c r3 = com.appsflyer.C1868c.C1869a.C1870c.m8745(r3)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r6 = "af_gcm_token"
            java.lang.String r3 = r3.f6777     // Catch:{ Throwable -> 0x0b7e }
            r8.put(r6, r3)     // Catch:{ Throwable -> 0x0b7e }
        L_0x0819:
            boolean r3 = com.appsflyer.C1901u.m8829(r20)     // Catch:{ Throwable -> 0x0b7e }
            r1.f6712 = r3     // Catch:{ Throwable -> 0x0b7e }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r6 = "didConfigureTokenRefreshService="
            r3.<init>(r6)     // Catch:{ Throwable -> 0x0b7e }
            boolean r6 = r1.f6712     // Catch:{ Throwable -> 0x0b7e }
            r3.append(r6)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r3 = r3.toString()     // Catch:{ Throwable -> 0x0b7e }
            com.appsflyer.AFLogger.afDebugLog(r3)     // Catch:{ Throwable -> 0x0b7e }
            boolean r3 = r1.f6712     // Catch:{ Throwable -> 0x0b7e }
            if (r3 != 0) goto L_0x083d
            java.lang.String r3 = "tokenRefreshConfigured"
            java.lang.Boolean r6 = java.lang.Boolean.FALSE     // Catch:{ Throwable -> 0x0b7e }
            r8.put(r3, r6)     // Catch:{ Throwable -> 0x0b7e }
        L_0x083d:
            r3 = r27
            if (r3 == 0) goto L_0x086f
            com.appsflyer.AFDeepLinkManager r6 = com.appsflyer.AFDeepLinkManager.getInstance()     // Catch:{ Throwable -> 0x0b7e }
            r7 = r28
            r6.processIntentForDeepLink(r7, r2, r8)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r6 = r1.f6706     // Catch:{ Throwable -> 0x0b7e }
            if (r6 == 0) goto L_0x0865
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r7 = r1.f6706     // Catch:{ Throwable -> 0x0b7e }
            r6.<init>(r7)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r7 = "isPush"
            java.lang.String r9 = "true"
            r6.put(r7, r9)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r7 = "af_deeplink"
            java.lang.String r6 = r6.toString()     // Catch:{ Throwable -> 0x0b7e }
            r8.put(r7, r6)     // Catch:{ Throwable -> 0x0b7e }
        L_0x0865:
            r6 = 0
            r1.f6706 = r6     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r6 = "open_referrer"
            r7 = r29
            r8.put(r6, r7)     // Catch:{ Throwable -> 0x0b7e }
        L_0x086f:
            boolean r6 = r1.f6710     // Catch:{ Throwable -> 0x0b7e }
            if (r6 == 0) goto L_0x088b
            java.lang.String r6 = "testAppMode_retargeting"
            java.lang.String r7 = "true"
            r8.put(r6, r7)     // Catch:{ Throwable -> 0x0b7e }
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0b7e }
            r6.<init>(r8)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r6 = r6.toString()     // Catch:{ Throwable -> 0x0b7e }
            m8677(r2, r6)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r6 = "Sent retargeting params to test app"
            com.appsflyer.AFLogger.afInfoLog(r6)     // Catch:{ Throwable -> 0x0b7e }
        L_0x088b:
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x0b7e }
            long r11 = r1.f6709     // Catch:{ Throwable -> 0x0b7e }
            r9 = 0
            long r6 = r6 - r11
            com.appsflyer.AppsFlyerProperties r9 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r9 = r9.getReferrer(r2)     // Catch:{ Throwable -> 0x0b7e }
            r11 = 30000(0x7530, double:1.4822E-319)
            int r13 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r13 > 0) goto L_0x08ad
            if (r9 == 0) goto L_0x08ad
            java.lang.String r6 = "AppsFlyer_Test"
            boolean r6 = r9.contains(r6)     // Catch:{ Throwable -> 0x0b7e }
            if (r6 == 0) goto L_0x08ad
            r6 = 1
            goto L_0x08ae
        L_0x08ad:
            r6 = 0
        L_0x08ae:
            if (r6 == 0) goto L_0x08d1
            java.lang.String r6 = "testAppMode"
            java.lang.String r7 = "true"
            r8.put(r6, r7)     // Catch:{ Throwable -> 0x0b7e }
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0b7e }
            r6.<init>(r8)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r6 = r6.toString()     // Catch:{ Throwable -> 0x0b7e }
            m8677(r2, r6)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r6 = "Sent params to test app"
            com.appsflyer.AFLogger.afInfoLog(r6)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r6 = "Test mode ended!"
            com.appsflyer.AFLogger.afInfoLog(r6)     // Catch:{ Throwable -> 0x0b7e }
            r6 = 0
            r1.f6709 = r6     // Catch:{ Throwable -> 0x0b7e }
        L_0x08d1:
            java.lang.String r6 = "advertiserId"
            com.appsflyer.AppsFlyerProperties r7 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r6 = r7.getString(r6)     // Catch:{ Throwable -> 0x0b7e }
            if (r6 != 0) goto L_0x08fb
            com.appsflyer.C1885l.m8777(r2, r8)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r6 = "advertiserId"
            com.appsflyer.AppsFlyerProperties r7 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r6 = r7.getString(r6)     // Catch:{ Throwable -> 0x0b7e }
            if (r6 == 0) goto L_0x08f4
            java.lang.String r6 = "GAID_retry"
            java.lang.String r7 = "true"
            r8.put(r6, r7)     // Catch:{ Throwable -> 0x0b7e }
            goto L_0x08fb
        L_0x08f4:
            java.lang.String r6 = "GAID_retry"
            java.lang.String r7 = "false"
            r8.put(r6, r7)     // Catch:{ Throwable -> 0x0b7e }
        L_0x08fb:
            android.content.ContentResolver r6 = r20.getContentResolver()     // Catch:{ Throwable -> 0x0b7e }
            com.appsflyer.o r6 = com.appsflyer.C1885l.m8778(r6)     // Catch:{ Throwable -> 0x0b7e }
            if (r6 == 0) goto L_0x0917
            java.lang.String r7 = "amazon_aid"
            java.lang.String r9 = r6.f6837     // Catch:{ Throwable -> 0x0b7e }
            r8.put(r7, r9)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r7 = "amazon_aid_limit"
            boolean r6 = r6.f6835     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Throwable -> 0x0b7e }
            r8.put(r7, r6)     // Catch:{ Throwable -> 0x0b7e }
        L_0x0917:
            com.appsflyer.AppsFlyerProperties r6 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r6 = r6.getReferrer(r2)     // Catch:{ Throwable -> 0x0b7e }
            if (r6 == 0) goto L_0x0934
            int r7 = r6.length()     // Catch:{ Throwable -> 0x0b7e }
            if (r7 <= 0) goto L_0x0934
            java.lang.String r7 = "referrer"
            java.lang.Object r7 = r8.get(r7)     // Catch:{ Throwable -> 0x0b7e }
            if (r7 != 0) goto L_0x0934
            java.lang.String r7 = "referrer"
            r8.put(r7, r6)     // Catch:{ Throwable -> 0x0b7e }
        L_0x0934:
            java.lang.String r6 = "true"
            java.lang.String r7 = "sentSuccessfully"
            java.lang.String r9 = ""
            java.lang.String r7 = r10.getString(r7, r9)     // Catch:{ Throwable -> 0x0b7e }
            boolean r6 = r6.equals(r7)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r7 = "sentRegisterRequestToAF"
            r9 = 0
            boolean r7 = r10.getBoolean(r7, r9)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r9 = "registeredUninstall"
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ Throwable -> 0x0b7e }
            r8.put(r9, r7)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r7 = "appsFlyerCount"
            int r7 = m8654(r10, r7, r3)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r9 = "counter"
            java.lang.String r11 = java.lang.Integer.toString(r7)     // Catch:{ Throwable -> 0x0b7e }
            r8.put(r9, r11)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r9 = "iaecounter"
            if (r4 == 0) goto L_0x0967
            r4 = 1
            goto L_0x0968
        L_0x0967:
            r4 = 0
        L_0x0968:
            java.lang.String r11 = "appsFlyerInAppEventCount"
            int r4 = m8654(r10, r11, r4)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ Throwable -> 0x0b7e }
            r8.put(r9, r4)     // Catch:{ Throwable -> 0x0b7e }
            if (r3 == 0) goto L_0x0998
            r4 = 1
            if (r7 != r4) goto L_0x0998
            com.appsflyer.AppsFlyerProperties r4 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ Throwable -> 0x0b7e }
            r4.setFirstLaunchCalled()     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r4 = "waitForCustomerId"
            com.appsflyer.AppsFlyerProperties r9 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ Throwable -> 0x0b7e }
            r11 = 0
            boolean r4 = r9.getBoolean(r4, r11)     // Catch:{ Throwable -> 0x0b7e }
            if (r4 == 0) goto L_0x0998
            java.lang.String r4 = "wait_cid"
            r9 = 1
            java.lang.String r11 = java.lang.Boolean.toString(r9)     // Catch:{ Throwable -> 0x0b7e }
            r8.put(r4, r11)     // Catch:{ Throwable -> 0x0b7e }
        L_0x0998:
            java.lang.String r4 = "isFirstCall"
            r9 = 1
            r6 = r6 ^ r9
            java.lang.String r6 = java.lang.Boolean.toString(r6)     // Catch:{ Throwable -> 0x0b7e }
            r8.put(r4, r6)     // Catch:{ Throwable -> 0x0b7e }
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ Throwable -> 0x0b7e }
            r4.<init>()     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r6 = "cpu_abi"
            java.lang.String r9 = "ro.product.cpu.abi"
            java.lang.String r9 = m8655(r9)     // Catch:{ Throwable -> 0x0b7e }
            r4.put(r6, r9)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r6 = "cpu_abi2"
            java.lang.String r9 = "ro.product.cpu.abi2"
            java.lang.String r9 = m8655(r9)     // Catch:{ Throwable -> 0x0b7e }
            r4.put(r6, r9)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r6 = "arch"
            java.lang.String r9 = "os.arch"
            java.lang.String r9 = m8655(r9)     // Catch:{ Throwable -> 0x0b7e }
            r4.put(r6, r9)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r6 = "build_display_id"
            java.lang.String r9 = "ro.build.display.id"
            java.lang.String r9 = m8655(r9)     // Catch:{ Throwable -> 0x0b7e }
            r4.put(r6, r9)     // Catch:{ Throwable -> 0x0b7e }
            if (r3 == 0) goto L_0x0a49
            boolean r3 = r1.f6708     // Catch:{ Throwable -> 0x0b7e }
            if (r3 == 0) goto L_0x0a17
            android.location.Location r3 = com.appsflyer.C1872e.m8750(r20)     // Catch:{ Throwable -> 0x0b7e }
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ Throwable -> 0x0b7e }
            r6.<init>(r5)     // Catch:{ Throwable -> 0x0b7e }
            if (r3 == 0) goto L_0x0a0c
            java.lang.String r5 = "lat"
            double r11 = r3.getLatitude()     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r9 = java.lang.String.valueOf(r11)     // Catch:{ Throwable -> 0x0b7e }
            r6.put(r5, r9)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r5 = "lon"
            double r11 = r3.getLongitude()     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r9 = java.lang.String.valueOf(r11)     // Catch:{ Throwable -> 0x0b7e }
            r6.put(r5, r9)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r5 = "ts"
            long r11 = r3.getTime()     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r3 = java.lang.String.valueOf(r11)     // Catch:{ Throwable -> 0x0b7e }
            r6.put(r5, r3)     // Catch:{ Throwable -> 0x0b7e }
        L_0x0a0c:
            boolean r3 = r6.isEmpty()     // Catch:{ Throwable -> 0x0b7e }
            if (r3 != 0) goto L_0x0a17
            java.lang.String r3 = "loc"
            r4.put(r3, r6)     // Catch:{ Throwable -> 0x0b7e }
        L_0x0a17:
            com.appsflyer.b r3 = com.appsflyer.C1865b.C1866a.f6762     // Catch:{ Throwable -> 0x0b7e }
            com.appsflyer.b$c r3 = r3.mo7461(r2)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r5 = "btl"
            float r6 = r3.f6764     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r6 = java.lang.Float.toString(r6)     // Catch:{ Throwable -> 0x0b7e }
            r4.put(r5, r6)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r5 = r3.f6763     // Catch:{ Throwable -> 0x0b7e }
            if (r5 == 0) goto L_0x0a33
            java.lang.String r5 = "btch"
            java.lang.String r3 = r3.f6763     // Catch:{ Throwable -> 0x0b7e }
            r4.put(r5, r3)     // Catch:{ Throwable -> 0x0b7e }
        L_0x0a33:
            r3 = 2
            if (r3 < r7) goto L_0x0a49
            com.appsflyer.f r3 = com.appsflyer.C1873f.m8751(r20)     // Catch:{ Throwable -> 0x0b7e }
            java.util.List r3 = r3.mo7469()     // Catch:{ Throwable -> 0x0b7e }
            boolean r5 = r3.isEmpty()     // Catch:{ Throwable -> 0x0b7e }
            if (r5 != 0) goto L_0x0a49
            java.lang.String r5 = "sensors"
            r4.put(r5, r3)     // Catch:{ Throwable -> 0x0b7e }
        L_0x0a49:
            java.util.Map r3 = com.appsflyer.AFScreenManager.getScreenMetrics(r20)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r5 = "dim"
            r4.put(r5, r3)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r3 = "deviceData"
            r8.put(r3, r4)     // Catch:{ Throwable -> 0x0b7e }
            com.appsflyer.r r3 = new com.appsflyer.r     // Catch:{ Throwable -> 0x0b7e }
            r3.<init>()     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r3 = "appsflyerKey"
            java.lang.Object r3 = r8.get(r3)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r4 = "af_timestamp"
            java.lang.Object r4 = r8.get(r4)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r5 = "uid"
            java.lang.Object r5 = r8.get(r5)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Throwable -> 0x0b7e }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0b7e }
            r6.<init>()     // Catch:{ Throwable -> 0x0b7e }
            r7 = 7
            r9 = 0
            java.lang.String r3 = r3.substring(r9, r7)     // Catch:{ Throwable -> 0x0b7e }
            r6.append(r3)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r3 = r5.substring(r9, r7)     // Catch:{ Throwable -> 0x0b7e }
            r6.append(r3)     // Catch:{ Throwable -> 0x0b7e }
            int r3 = r4.length()     // Catch:{ Throwable -> 0x0b7e }
            int r3 = r3 - r7
            java.lang.String r3 = r4.substring(r3)     // Catch:{ Throwable -> 0x0b7e }
            r6.append(r3)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r3 = r6.toString()     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r3 = com.appsflyer.C1898r.m8805(r3)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r4 = "af_v"
            r8.put(r4, r3)     // Catch:{ Throwable -> 0x0b7e }
            com.appsflyer.r r3 = new com.appsflyer.r     // Catch:{ Throwable -> 0x0b7e }
            r3.<init>()     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r3 = "appsflyerKey"
            java.lang.Object r3 = r8.get(r3)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Throwable -> 0x0b7e }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0b7e }
            r4.<init>()     // Catch:{ Throwable -> 0x0b7e }
            r4.append(r3)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r3 = "af_timestamp"
            java.lang.Object r3 = r8.get(r3)     // Catch:{ Throwable -> 0x0b7e }
            r4.append(r3)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r3 = r4.toString()     // Catch:{ Throwable -> 0x0b7e }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0b7e }
            r4.<init>()     // Catch:{ Throwable -> 0x0b7e }
            r4.append(r3)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r3 = "uid"
            java.lang.Object r3 = r8.get(r3)     // Catch:{ Throwable -> 0x0b7e }
            r4.append(r3)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r3 = r4.toString()     // Catch:{ Throwable -> 0x0b7e }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0b7e }
            r4.<init>()     // Catch:{ Throwable -> 0x0b7e }
            r4.append(r3)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r3 = "installDate"
            java.lang.Object r3 = r8.get(r3)     // Catch:{ Throwable -> 0x0b7e }
            r4.append(r3)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r3 = r4.toString()     // Catch:{ Throwable -> 0x0b7e }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0b7e }
            r4.<init>()     // Catch:{ Throwable -> 0x0b7e }
            r4.append(r3)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r3 = "counter"
            java.lang.Object r3 = r8.get(r3)     // Catch:{ Throwable -> 0x0b7e }
            r4.append(r3)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r3 = r4.toString()     // Catch:{ Throwable -> 0x0b7e }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0b7e }
            r4.<init>()     // Catch:{ Throwable -> 0x0b7e }
            r4.append(r3)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r3 = "iaecounter"
            java.lang.Object r3 = r8.get(r3)     // Catch:{ Throwable -> 0x0b7e }
            r4.append(r3)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r3 = r4.toString()     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r3 = com.appsflyer.C1898r.m8804(r3)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r3 = com.appsflyer.C1898r.m8805(r3)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r4 = "af_v2"
            r8.put(r4, r3)     // Catch:{ Throwable -> 0x0b7e }
            boolean r2 = m8702(r20)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r3 = "ivc"
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ Throwable -> 0x0b7e }
            r8.put(r3, r2)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r2 = "is_stop_tracking_used"
            boolean r2 = r10.contains(r2)     // Catch:{ Throwable -> 0x0b7e }
            if (r2 == 0) goto L_0x0b4a
            java.lang.String r2 = "istu"
            java.lang.String r3 = "is_stop_tracking_used"
            r4 = 0
            boolean r3 = r10.getBoolean(r3, r4)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Throwable -> 0x0b7e }
            r8.put(r2, r3)     // Catch:{ Throwable -> 0x0b7e }
        L_0x0b4a:
            com.appsflyer.AppsFlyerProperties r2 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r3 = "consumeAfDeepLink"
            java.lang.Object r2 = r2.getObject(r3)     // Catch:{ Throwable -> 0x0b7e }
            if (r2 == 0) goto L_0x0b87
            com.appsflyer.AppsFlyerProperties r2 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r3 = "consumeAfDeepLink"
            r4 = 0
            boolean r2 = r2.getBoolean(r3, r4)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r3 = "is_dp_api"
            r8.put(r3, r2)     // Catch:{ Throwable -> 0x0b7e }
            goto L_0x0b87
        L_0x0b6b:
            java.lang.String r3 = "AppsFlyer dev key is missing!!! Please use  AppsFlyerLib.getInstance().setAppsFlyerKey(...) to set it. "
            com.appsflyer.AFLogger.afInfoLog(r3)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r3 = "AppsFlyer_4.8.20"
            java.lang.String r4 = "DEV_KEY_MISSING"
            r5 = 0
            m8696(r2, r3, r4, r5)     // Catch:{ Throwable -> 0x0b7e }
            java.lang.String r2 = "AppsFlyer will not track this event."
            com.appsflyer.AFLogger.afInfoLog(r2)     // Catch:{ Throwable -> 0x0b7e }
            return r5
        L_0x0b7e:
            r0 = move-exception
            r2 = r0
            java.lang.String r3 = r2.getLocalizedMessage()
            com.appsflyer.AFLogger.afErrorLog(r3, r2)
        L_0x0b87:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLib.mo7418(android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, android.content.SharedPreferences, boolean, android.content.Intent, java.lang.String):java.util.Map");
    }

    /* renamed from: ˋ */
    private static boolean m8671(Context context) {
        try {
            if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0) {
                return true;
            }
        } catch (Throwable th) {
            AFLogger.afErrorLog("WARNING:  Google play services is unavailable. ", th);
        }
        try {
            context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            return true;
        } catch (NameNotFoundException e) {
            AFLogger.afErrorLog("WARNING:  Google Play Services is unavailable. ", e);
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ˏ */
    public static void m8695(Context context, String str, String str2) {
        Editor edit = C7285c.m22838a(context, "appsflyer-data", 0).edit();
        edit.putString(str, str2);
        if (VERSION.SDK_INT >= 9) {
            edit.apply();
        } else {
            edit.commit();
        }
    }

    public String getHostName() {
        String string = AppsFlyerProperties.getInstance().getString("custom_host");
        if (string != null) {
            return string;
        }
        return "appsflyer.com";
    }

    public String getHostPrefix() {
        String string = AppsFlyerProperties.getInstance().getString("custom_host_prefix");
        if (string != null) {
            return string;
        }
        return "";
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ॱ */
    public final void mo7420() {
        this.f6705 = System.currentTimeMillis();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˊ */
    public final void mo7415() {
        this.f6703 = System.currentTimeMillis();
    }

    private AppsFlyerLib() {
        AFVersionDeclaration.init();
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(f6696);
        sb.append("/androidevent?buildnumber=4.8.20&app_id=");
        f6698 = sb.toString();
        StringBuilder sb2 = new StringBuilder("https://%sattr.%s/api/v");
        sb2.append(f6698);
        f6697 = sb2.toString();
        StringBuilder sb3 = new StringBuilder("https://%st.%s/api/v");
        sb3.append(f6698);
        f6688 = sb3.toString();
        StringBuilder sb4 = new StringBuilder("https://%sevents.%s/api/v");
        sb4.append(f6698);
        f6689 = sb4.toString();
        StringBuilder sb5 = new StringBuilder("https://%sregister.%s/api/v");
        sb5.append(f6698);
        f6694 = sb5.toString();
    }

    public void onHandleReferrer(Map<String, String> map) {
        this.f6721 = map;
    }

    /* renamed from: ˏ */
    static int m8685(SharedPreferences sharedPreferences) {
        return m8654(sharedPreferences, "appsFlyerCount", false);
    }

    /* renamed from: ˏ */
    static SharedPreferences m8686(Context context) {
        return C7285c.m22838a(context, "appsflyer-data", 0);
    }

    public void startTracking(Application application) {
        if (!this.f6713) {
            AFLogger.afWarnLog("ERROR: AppsFlyer SDK is not initialized! The API call 'startTracking(Application)' must be called after the 'init(String, AppsFlyerConversionListener)' API method, which should be called on the Application's onCreate.");
        } else {
            startTracking(application, null);
        }
    }

    /* renamed from: ʻ */
    private static String m8652(Context context) {
        String string = AppsFlyerProperties.getInstance().getString("api_store_value");
        if (string != null) {
            return string;
        }
        String r2 = m8698(new WeakReference<>(context), "AF_STORE");
        if (r2 != null) {
            return r2;
        }
        return null;
    }

    /* renamed from: ˎ */
    private static File m8672(String str) {
        if (str != null) {
            try {
                if (str.trim().length() > 0) {
                    return new File(str.trim());
                }
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getMessage(), th);
            }
        }
        return null;
    }

    public boolean isPreInstalledApp(Context context) {
        try {
            if ((_lancet.m8717x89c42dc8(context.getPackageManager(), context.getPackageName(), 0).flags & 1) != 0) {
                return true;
            }
            return false;
        } catch (NameNotFoundException e) {
            AFLogger.afErrorLog("Could not check if app is pre installed", e);
        }
    }

    public void setAndroidIdData(String str) {
        C1899s.m8812().mo7512("setAndroidIdData", str);
        this.f6716 = str;
    }

    /* renamed from: ʼ */
    private static boolean m8653(Context context) {
        boolean z;
        if (AppsFlyerProperties.getInstance().getBoolean("collectAndroidIdForceByUser", false) || AppsFlyerProperties.getInstance().getBoolean("collectIMEIForceByUser", false)) {
            z = true;
        } else {
            z = false;
        }
        if (z || !m8671(context)) {
            return true;
        }
        return false;
    }

    /* renamed from: ᐝ */
    private static float m8703(Context context) {
        float f;
        try {
            Intent registerReceiver = context.getApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = registerReceiver.getIntExtra("level", -1);
            int intExtra2 = registerReceiver.getIntExtra("scale", -1);
            if (intExtra == -1 || intExtra2 == -1) {
                return 50.0f;
            }
            f = (((float) intExtra) / ((float) intExtra2)) * 100.0f;
            return f;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            f = 1.0f;
        }
    }

    public void setCollectIMEI(boolean z) {
        C1899s.m8812().mo7512("setCollectIMEI", String.valueOf(z));
        String bool = Boolean.toString(z);
        AppsFlyerProperties.getInstance().set("collectIMEI", bool);
        String bool2 = Boolean.toString(z);
        AppsFlyerProperties.getInstance().set("collectIMEIForceByUser", bool2);
    }

    public void setCustomerUserId(String str) {
        C1899s.m8812().mo7512("setCustomerUserId", str);
        AFLogger.afInfoLog("setCustomerUserId = ".concat(String.valueOf(str)));
        AppsFlyerProperties.getInstance().set("AppUserId", str);
    }

    public void setOutOfStore(String str) {
        if (str != null) {
            String lowerCase = str.toLowerCase();
            AppsFlyerProperties.getInstance().set("api_store_value", lowerCase);
            AFLogger.afInfoLog("Store API set with value: ".concat(String.valueOf(lowerCase)), true);
            return;
        }
        AFLogger.m8648("Cannot set setOutOfStore with null");
    }

    /* renamed from: ˊ */
    private static String m8655(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class}).invoke(null, new Object[]{str});
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return null;
        }
    }

    /* renamed from: ˎ */
    private void m8676(Application application) {
        AppsFlyerProperties.getInstance().loadProperties(application.getApplicationContext());
        if (VERSION.SDK_INT < 14) {
            AFLogger.afInfoLog("SDK<14 call trackEvent manually");
            AFLogger.afInfoLog("onBecameForeground");
            getInstance().f6703 = System.currentTimeMillis();
            getInstance().mo7419((Context) application, (String) null, null);
            AFLogger.resetDeltaTime();
        } else if (VERSION.SDK_INT >= 14 && this.f6704 == null) {
            C1888n.m8779();
            this.f6704 = new C1889a() {
                /* renamed from: ˊ */
                public final void mo7422(WeakReference<Context> weakReference) {
                    C1878b.m8760((Context) weakReference.get());
                    C1873f r2 = C1873f.m8751((Context) weakReference.get());
                    r2.f6792.post(r2.f6797);
                }

                /* renamed from: ॱ */
                public final void mo7423(Activity activity) {
                    if (2 > AppsFlyerLib.m8685(AppsFlyerLib.m8686((Context) activity))) {
                        C1873f r0 = C1873f.m8751(activity);
                        r0.f6792.post(r0.f6797);
                        r0.f6792.post(r0.f6789);
                    }
                    AFLogger.afInfoLog("onBecameForeground");
                    AppsFlyerLib.getInstance().mo7415();
                    AppsFlyerLib.getInstance().mo7419((Context) activity, (String) null, null);
                    AFLogger.resetDeltaTime();
                }
            };
            C1888n.m8781().mo7501(application, this.f6704);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ॱ */
    public static Map<String, String> m8699(Context context) throws C1887m {
        String string = C7285c.m22838a(context, "appsflyer-data", 0).getString("attributionId", null);
        if (string != null && string.length() > 0) {
            return m8701(string);
        }
        throw new C1887m();
    }

    /* renamed from: ॱॱ */
    private static boolean m8702(Context context) {
        if (context != null) {
            if (VERSION.SDK_INT >= 23) {
                try {
                    ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                    for (Network networkCapabilities : connectivityManager.getAllNetworks()) {
                        NetworkCapabilities networkCapabilities2 = connectivityManager.getNetworkCapabilities(networkCapabilities);
                        if (networkCapabilities2.hasTransport(4) && !networkCapabilities2.hasCapability(15)) {
                            return true;
                        }
                    }
                    return false;
                } catch (Exception e) {
                    AFLogger.afErrorLog("Failed collecting ivc data", e);
                }
            } else if (VERSION.SDK_INT >= 16) {
                ArrayList arrayList = new ArrayList();
                try {
                    Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
                    while (it.hasNext()) {
                        NetworkInterface networkInterface = (NetworkInterface) it.next();
                        if (networkInterface.isUp()) {
                            arrayList.add(networkInterface.getName());
                        }
                    }
                    return arrayList.contains("tun0");
                } catch (Exception e2) {
                    AFLogger.afErrorLog("Failed collecting ivc data", e2);
                }
            }
        }
        return false;
    }

    public String getAttributionId(ContentResolver contentResolver) {
        ContentResolver contentResolver2 = contentResolver;
        Cursor query = contentResolver2.query(Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider"), new String[]{"aid"}, null, null, null);
        String str = null;
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    String string = query.getString(query.getColumnIndex("aid"));
                    if (query != null) {
                        try {
                            query.close();
                        } catch (Exception e) {
                            AFLogger.afErrorLog(e.getMessage(), e);
                        }
                    }
                    str = string;
                    return str;
                }
            } catch (Exception e2) {
                AFLogger.afErrorLog("Could not collect cursor attribution. ", e2);
                if (query != null) {
                    try {
                        query.close();
                    } catch (Exception e3) {
                        AFLogger.afErrorLog(e3.getMessage(), e3);
                    }
                }
            } finally {
                if (query != null) {
                    try {
                        query.close();
                    } catch (Exception e4) {
                        AFLogger.afErrorLog(e4.getMessage(), e4);
                    }
                }
            }
        }
        if (query != null) {
            try {
                query.close();
            } catch (Exception e5) {
                AFLogger.afErrorLog(e5.getMessage(), e5);
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005d, code lost:
        if (r3 != null) goto L_0x002c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005a A[SYNTHETIC, Splitter:B:27:0x005a] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0086 A[SYNTHETIC, Splitter:B:45:0x0086] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008b A[Catch:{ Throwable -> 0x008e }] */
    /* renamed from: ˎ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String m8674(java.net.HttpURLConnection r7) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            java.io.InputStream r2 = r7.getErrorStream()     // Catch:{ Throwable -> 0x003d, all -> 0x003a }
            if (r2 != 0) goto L_0x0010
            java.io.InputStream r2 = r7.getInputStream()     // Catch:{ Throwable -> 0x003d, all -> 0x003a }
        L_0x0010:
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Throwable -> 0x003d, all -> 0x003a }
            r3.<init>(r2)     // Catch:{ Throwable -> 0x003d, all -> 0x003a }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x0038 }
            r2.<init>(r3)     // Catch:{ Throwable -> 0x0038 }
        L_0x001a:
            java.lang.String r1 = r2.readLine()     // Catch:{ Throwable -> 0x0033, all -> 0x0030 }
            if (r1 == 0) goto L_0x0029
            r0.append(r1)     // Catch:{ Throwable -> 0x0033, all -> 0x0030 }
            r1 = 10
            r0.append(r1)     // Catch:{ Throwable -> 0x0033, all -> 0x0030 }
            goto L_0x001a
        L_0x0029:
            r2.close()     // Catch:{ Throwable -> 0x0060 }
        L_0x002c:
            r3.close()     // Catch:{ Throwable -> 0x0060 }
            goto L_0x0060
        L_0x0030:
            r7 = move-exception
            r1 = r2
            goto L_0x0084
        L_0x0033:
            r1 = move-exception
            r6 = r2
            r2 = r1
            r1 = r6
            goto L_0x003f
        L_0x0038:
            r2 = move-exception
            goto L_0x003f
        L_0x003a:
            r7 = move-exception
            r3 = r1
            goto L_0x0084
        L_0x003d:
            r2 = move-exception
            r3 = r1
        L_0x003f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0083 }
            java.lang.String r5 = "Could not read connection response from: "
            r4.<init>(r5)     // Catch:{ all -> 0x0083 }
            java.net.URL r7 = r7.getURL()     // Catch:{ all -> 0x0083 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0083 }
            r4.append(r7)     // Catch:{ all -> 0x0083 }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x0083 }
            com.appsflyer.AFLogger.afErrorLog(r7, r2)     // Catch:{ all -> 0x0083 }
            if (r1 == 0) goto L_0x005d
            r1.close()     // Catch:{ Throwable -> 0x0060 }
        L_0x005d:
            if (r3 == 0) goto L_0x0060
            goto L_0x002c
        L_0x0060:
            java.lang.String r7 = r0.toString()
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x006a }
            r0.<init>(r7)     // Catch:{ JSONException -> 0x006a }
            return r7
        L_0x006a:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "string_response"
            r0.put(r1, r7)     // Catch:{ JSONException -> 0x0079 }
            java.lang.String r7 = r0.toString()     // Catch:{ JSONException -> 0x0079 }
            return r7
        L_0x0079:
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
            java.lang.String r7 = r7.toString()
            return r7
        L_0x0083:
            r7 = move-exception
        L_0x0084:
            if (r1 == 0) goto L_0x0089
            r1.close()     // Catch:{ Throwable -> 0x008e }
        L_0x0089:
            if (r3 == 0) goto L_0x008e
            r3.close()     // Catch:{ Throwable -> 0x008e }
        L_0x008e:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLib.m8674(java.net.HttpURLConnection):java.lang.String");
    }

    /* access modifiers changed from: private */
    /* renamed from: ˏ */
    public static String m8691(WeakReference<Context> weakReference) {
        String string = AppsFlyerProperties.getInstance().getString("channel");
        if (string == null) {
            string = m8698(weakReference, "CHANNEL");
        }
        if (string == null || !string.equals("")) {
            return string;
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: ॱ */
    public static Map<String, String> m8701(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str2 = (String) keys.next();
                if (!f6693.contains(str2)) {
                    String string = jSONObject.getString(str2);
                    if (!TextUtils.isEmpty(string) && !TEVideoRecorder.FACE_BEAUTY_NULL.equals(string)) {
                        hashMap.put(str2, string);
                    }
                }
            }
            return hashMap;
        } catch (JSONException e) {
            AFLogger.afErrorLog(e.getMessage(), e);
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˊ */
    public final void mo7416(WeakReference<Context> weakReference) {
        if (weakReference.get() != null) {
            AFLogger.afInfoLog("app went to background");
            SharedPreferences a = C7285c.m22838a((Context) weakReference.get(), "appsflyer-data", 0);
            AppsFlyerProperties.getInstance().saveProperties(a);
            long j = this.f6705 - this.f6703;
            HashMap hashMap = new HashMap();
            String string = AppsFlyerProperties.getInstance().getString("AppsFlyerKey");
            if (string == null) {
                AFLogger.afWarnLog("[callStats] AppsFlyer's SDK cannot send any event without providing DevKey.");
                return;
            }
            String string2 = AppsFlyerProperties.getInstance().getString("KSAppsFlyerId");
            if (AppsFlyerProperties.getInstance().getBoolean("deviceTrackingDisabled", false)) {
                hashMap.put("deviceTrackingDisabled", "true");
            }
            C1891o r7 = C1885l.m8778(((Context) weakReference.get()).getContentResolver());
            if (r7 != null) {
                hashMap.put("amazon_aid", r7.f6837);
                hashMap.put("amazon_aid_limit", String.valueOf(r7.f6835));
            }
            String string3 = AppsFlyerProperties.getInstance().getString("advertiserId");
            if (string3 != null) {
                hashMap.put("advertiserId", string3);
            }
            hashMap.put("app_id", ((Context) weakReference.get()).getPackageName());
            hashMap.put("devkey", string);
            hashMap.put("uid", C1900t.m8826(weakReference));
            hashMap.put("time_in_app", String.valueOf(j / 1000));
            hashMap.put("statType", "user_closed_app");
            hashMap.put("platform", "Android");
            hashMap.put("launch_counter", Integer.toString(m8654(a, "appsFlyerCount", false)));
            hashMap.put("channel", m8691(weakReference));
            String str = "originalAppsflyerId";
            if (string2 == null) {
                string2 = "";
            }
            hashMap.put(str, string2);
            if (this.f6715) {
                try {
                    C1884k kVar = new C1884k(null, this.f6714);
                    kVar.f6823 = hashMap;
                    if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                        AFLogger.afDebugLog("Main thread detected. Running callStats task in a new thread.");
                        kVar.execute(new String[]{ServerConfigHandler.getUrl("https://%sstats.%s/stats")});
                        return;
                    }
                    StringBuilder sb = new StringBuilder("Running callStats task (on current thread: ");
                    sb.append(Thread.currentThread().toString());
                    sb.append(" )");
                    AFLogger.afDebugLog(sb.toString());
                    kVar.onPreExecute();
                    kVar.onPostExecute(kVar.doInBackground(ServerConfigHandler.getUrl("https://%sstats.%s/stats")));
                } catch (Throwable th) {
                    AFLogger.afErrorLog("Could not send callStats request", th);
                }
            } else {
                AFLogger.afDebugLog("Stats call is disabled, ignore ...");
            }
        }
    }

    public void startTracking(Application application, String str) {
        startTracking(application, str, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: ᐝ */
    public static String m8704(Context context, String str) throws NameNotFoundException {
        SharedPreferences a = C7285c.m22838a(context, "appsflyer-data", 0);
        if (a.contains("CACHED_CHANNEL")) {
            return a.getString("CACHED_CHANNEL", null);
        }
        m8695(context, "CACHED_CHANNEL", str);
        return str;
    }

    /* renamed from: ˎ */
    private static void m8677(Context context, String str) {
        Intent intent = new Intent("com.appsflyer.testIntgrationBroadcast");
        intent.putExtra("params", str);
        if (VERSION.SDK_INT >= 26) {
            if (context.getPackageManager().queryBroadcastReceivers(intent, 0).toString().contains("com.appsflyer.referrerSender")) {
                Intent intent2 = new Intent(intent);
                intent2.setComponent(new ComponentName("com.appsflyer.referrerSender", "com.appsflyer.referrerSender.Receiver"));
                context.sendBroadcast(intent2);
            }
            return;
        }
        context.sendBroadcast(intent);
    }

    /* renamed from: ॱ */
    private static String m8698(WeakReference<Context> weakReference, String str) {
        if (weakReference.get() == null) {
            return null;
        }
        return m8661(str, ((Context) weakReference.get()).getPackageManager(), ((Context) weakReference.get()).getPackageName());
    }

    public AppsFlyerLib init(String str, AppsFlyerConversionListener appsFlyerConversionListener) {
        String str2;
        C1899s r0 = C1899s.m8812();
        String str3 = "init";
        String[] strArr = new String[2];
        strArr[0] = str;
        if (appsFlyerConversionListener == null) {
            str2 = TEVideoRecorder.FACE_BEAUTY_NULL;
        } else {
            str2 = "conversionDataListener";
        }
        strArr[1] = str2;
        r0.mo7512(str3, strArr);
        AFLogger.m8650(C1642a.m8034a("Initializing AppsFlyer SDK: (v%s.%s)", new Object[]{"4.8.20", "170"}));
        this.f6713 = true;
        AppsFlyerProperties.getInstance().set("AppsFlyerKey", str);
        C18754.m8757(str);
        f6695 = appsFlyerConversionListener;
        return this;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0042 */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0034 A[SYNTHETIC, Splitter:B:18:0x0034] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0060 A[SYNTHETIC, Splitter:B:32:0x0060] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:24:0x0042=Splitter:B:24:0x0042, B:15:0x002b=Splitter:B:15:0x002b} */
    /* renamed from: ˏ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m8689(java.io.File r4, java.lang.String r5) {
        /*
            r0 = 0
            java.util.Properties r1 = new java.util.Properties     // Catch:{ FileNotFoundException -> 0x0041, Throwable -> 0x0029, all -> 0x0026 }
            r1.<init>()     // Catch:{ FileNotFoundException -> 0x0041, Throwable -> 0x0029, all -> 0x0026 }
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ FileNotFoundException -> 0x0041, Throwable -> 0x0029, all -> 0x0026 }
            r2.<init>(r4)     // Catch:{ FileNotFoundException -> 0x0041, Throwable -> 0x0029, all -> 0x0026 }
            r1.load(r2)     // Catch:{ FileNotFoundException -> 0x0042, Throwable -> 0x0024 }
            java.lang.String r3 = "Found PreInstall property!"
            com.appsflyer.AFLogger.afInfoLog(r3)     // Catch:{ FileNotFoundException -> 0x0042, Throwable -> 0x0024 }
            java.lang.String r5 = r1.getProperty(r5)     // Catch:{ FileNotFoundException -> 0x0042, Throwable -> 0x0024 }
            r2.close()     // Catch:{ Throwable -> 0x001b }
            goto L_0x0023
        L_0x001b:
            r4 = move-exception
            java.lang.String r0 = r4.getMessage()
            com.appsflyer.AFLogger.afErrorLog(r0, r4)
        L_0x0023:
            return r5
        L_0x0024:
            r4 = move-exception
            goto L_0x002b
        L_0x0026:
            r4 = move-exception
            r2 = r0
            goto L_0x005e
        L_0x0029:
            r4 = move-exception
            r2 = r0
        L_0x002b:
            java.lang.String r5 = r4.getMessage()     // Catch:{ all -> 0x005d }
            com.appsflyer.AFLogger.afErrorLog(r5, r4)     // Catch:{ all -> 0x005d }
            if (r2 == 0) goto L_0x005c
            r2.close()     // Catch:{ Throwable -> 0x0038 }
            goto L_0x005c
        L_0x0038:
            r4 = move-exception
            java.lang.String r5 = r4.getMessage()
            com.appsflyer.AFLogger.afErrorLog(r5, r4)
            goto L_0x005c
        L_0x0041:
            r2 = r0
        L_0x0042:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x005d }
            java.lang.String r1 = "PreInstall file wasn't found: "
            r5.<init>(r1)     // Catch:{ all -> 0x005d }
            java.lang.String r4 = r4.getAbsolutePath()     // Catch:{ all -> 0x005d }
            r5.append(r4)     // Catch:{ all -> 0x005d }
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x005d }
            com.appsflyer.AFLogger.afDebugLog(r4)     // Catch:{ all -> 0x005d }
            if (r2 == 0) goto L_0x005c
            r2.close()     // Catch:{ Throwable -> 0x0038 }
        L_0x005c:
            return r0
        L_0x005d:
            r4 = move-exception
        L_0x005e:
            if (r2 == 0) goto L_0x006c
            r2.close()     // Catch:{ Throwable -> 0x0064 }
            goto L_0x006c
        L_0x0064:
            r5 = move-exception
            java.lang.String r0 = r5.getMessage()
            com.appsflyer.AFLogger.afErrorLog(r0, r5)
        L_0x006c:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLib.m8689(java.io.File, java.lang.String):java.lang.String");
    }

    /* renamed from: ˊ */
    private static Map<String, String> m8657(Context context, String str) {
        String[] split;
        String str2;
        String str3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean z = false;
        for (String str4 : str.split("&")) {
            int indexOf = str4.indexOf("=");
            if (indexOf > 0) {
                str2 = str4.substring(0, indexOf);
            } else {
                str2 = str4;
            }
            if (!linkedHashMap.containsKey(str2)) {
                if (str2.equals("c")) {
                    str2 = "campaign";
                } else if (str2.equals("pid")) {
                    str2 = "media_source";
                } else if (str2.equals("af_prt")) {
                    str2 = "agency";
                    z = true;
                }
                linkedHashMap.put(str2, "");
            }
            if (indexOf > 0) {
                int i = indexOf + 1;
                if (str4.length() > i) {
                    str3 = str4.substring(i);
                    linkedHashMap.put(str2, str3);
                }
            }
            str3 = null;
            linkedHashMap.put(str2, str3);
        }
        try {
            if (!linkedHashMap.containsKey("install_time")) {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
                long j = packageInfo.firstInstallTime;
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                linkedHashMap.put("install_time", simpleDateFormat.format(new Date(j)));
            }
        } catch (Exception e) {
            AFLogger.afErrorLog("Could not fetch install time. ", e);
        }
        if (!linkedHashMap.containsKey("af_status")) {
            linkedHashMap.put("af_status", "Non-organic");
        }
        if (z) {
            linkedHashMap.remove("media_source");
        }
        return linkedHashMap;
    }

    /* renamed from: ˋ */
    static void m8664(Context context, String str) {
        JSONObject jSONObject;
        JSONArray jSONArray;
        AFLogger.afDebugLog("received a new (extra) referrer: ".concat(String.valueOf(str)));
        try {
            long currentTimeMillis = System.currentTimeMillis();
            String string = C7285c.m22838a(context, "appsflyer-data", 0).getString("extraReferrers", null);
            if (string == null) {
                JSONObject jSONObject2 = new JSONObject();
                JSONArray jSONArray2 = new JSONArray();
                jSONObject = jSONObject2;
                jSONArray = jSONArray2;
            } else {
                jSONObject = new JSONObject(string);
                if (jSONObject.has(str)) {
                    jSONArray = new JSONArray((String) jSONObject.get(str));
                } else {
                    jSONArray = new JSONArray();
                }
            }
            if (((long) jSONArray.length()) < 5) {
                jSONArray.put(currentTimeMillis);
            }
            if (((long) jSONObject.length()) >= 4) {
                m8682(jSONObject);
            }
            jSONObject.put(str, jSONArray.toString());
            String jSONObject3 = jSONObject.toString();
            Editor edit = C7285c.m22838a(context, "appsflyer-data", 0).edit();
            edit.putString("extraReferrers", jSONObject3);
            if (VERSION.SDK_INT >= 9) {
                edit.apply();
            } else {
                edit.commit();
            }
        } catch (JSONException unused) {
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Couldn't save referrer - ");
            sb.append(str);
            sb.append(": ");
            AFLogger.afErrorLog(sb.toString(), th);
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* renamed from: ॱ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7421(android.content.Context r11, java.lang.String r12) {
        /*
            r10 = this;
            java.lang.String r0 = "waitForCustomerId"
            com.appsflyer.AppsFlyerProperties r1 = com.appsflyer.AppsFlyerProperties.getInstance()
            r2 = 0
            boolean r0 = r1.getBoolean(r0, r2)
            r1 = 1
            if (r0 == 0) goto L_0x001c
            java.lang.String r0 = "AppUserId"
            com.appsflyer.AppsFlyerProperties r3 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r0 = r3.getString(r0)
            if (r0 != 0) goto L_0x001c
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            if (r0 == 0) goto L_0x0025
            java.lang.String r11 = "CustomerUserId not set, Tracking is disabled"
            com.appsflyer.AFLogger.afInfoLog(r11, r1)
            return
        L_0x0025:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r3 = "AppsFlyerKey"
            com.appsflyer.AppsFlyerProperties r4 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r3 = r4.getString(r3)
            if (r3 != 0) goto L_0x003c
            java.lang.String r11 = "[registerUninstall] AppsFlyer's SDK cannot send any event without providing DevKey."
            com.appsflyer.AFLogger.afWarnLog(r11)
            return
        L_0x003c:
            android.content.pm.PackageManager r4 = r11.getPackageManager()
            java.lang.String r5 = r11.getPackageName()
            android.content.pm.PackageInfo r6 = r4.getPackageInfo(r5, r2)     // Catch:{ Throwable -> 0x008c }
            java.lang.String r7 = "app_version_code"
            int r8 = r6.versionCode     // Catch:{ Throwable -> 0x008c }
            java.lang.String r8 = java.lang.Integer.toString(r8)     // Catch:{ Throwable -> 0x008c }
            r0.put(r7, r8)     // Catch:{ Throwable -> 0x008c }
            java.lang.String r7 = "app_version_name"
            java.lang.String r8 = r6.versionName     // Catch:{ Throwable -> 0x008c }
            r0.put(r7, r8)     // Catch:{ Throwable -> 0x008c }
            android.content.pm.ApplicationInfo r7 = r6.applicationInfo     // Catch:{ Throwable -> 0x008c }
            java.lang.CharSequence r4 = r4.getApplicationLabel(r7)     // Catch:{ Throwable -> 0x008c }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x008c }
            java.lang.String r7 = "app_name"
            r0.put(r7, r4)     // Catch:{ Throwable -> 0x008c }
            long r6 = r6.firstInstallTime     // Catch:{ Throwable -> 0x008c }
            java.lang.String r4 = "yyyy-MM-dd_HHmmssZ"
            java.text.SimpleDateFormat r8 = new java.text.SimpleDateFormat     // Catch:{ Throwable -> 0x008c }
            java.util.Locale r9 = java.util.Locale.US     // Catch:{ Throwable -> 0x008c }
            r8.<init>(r4, r9)     // Catch:{ Throwable -> 0x008c }
            java.lang.String r4 = "installDate"
            java.lang.String r9 = "UTC"
            java.util.TimeZone r9 = java.util.TimeZone.getTimeZone(r9)     // Catch:{ Throwable -> 0x008c }
            r8.setTimeZone(r9)     // Catch:{ Throwable -> 0x008c }
            java.util.Date r9 = new java.util.Date     // Catch:{ Throwable -> 0x008c }
            r9.<init>(r6)     // Catch:{ Throwable -> 0x008c }
            java.lang.String r6 = r8.format(r9)     // Catch:{ Throwable -> 0x008c }
            r0.put(r4, r6)     // Catch:{ Throwable -> 0x008c }
            goto L_0x0092
        L_0x008c:
            r4 = move-exception
            java.lang.String r6 = "Exception while collecting application version info."
            com.appsflyer.AFLogger.afErrorLog(r6, r4)
        L_0x0092:
            m8680(r11, r0)
            java.lang.String r4 = "AppUserId"
            com.appsflyer.AppsFlyerProperties r6 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r4 = r6.getString(r4)
            if (r4 == 0) goto L_0x00a6
            java.lang.String r6 = "appUserId"
            r0.put(r6, r4)
        L_0x00a6:
            java.lang.String r4 = "model"
            java.lang.String r6 = android.os.Build.MODEL     // Catch:{ Throwable -> 0x00b5 }
            r0.put(r4, r6)     // Catch:{ Throwable -> 0x00b5 }
            java.lang.String r4 = "brand"
            java.lang.String r6 = android.os.Build.BRAND     // Catch:{ Throwable -> 0x00b5 }
            r0.put(r4, r6)     // Catch:{ Throwable -> 0x00b5 }
            goto L_0x00bb
        L_0x00b5:
            r4 = move-exception
            java.lang.String r6 = "Exception while collecting device brand and model."
            com.appsflyer.AFLogger.afErrorLog(r6, r4)
        L_0x00bb:
            com.appsflyer.AppsFlyerProperties r4 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r6 = "deviceTrackingDisabled"
            boolean r4 = r4.getBoolean(r6, r2)
            if (r4 == 0) goto L_0x00ce
            java.lang.String r4 = "deviceTrackingDisabled"
            java.lang.String r6 = "true"
            r0.put(r4, r6)
        L_0x00ce:
            android.content.ContentResolver r4 = r11.getContentResolver()
            com.appsflyer.o r4 = com.appsflyer.C1885l.m8778(r4)
            if (r4 == 0) goto L_0x00ea
            java.lang.String r6 = "amazon_aid"
            java.lang.String r7 = r4.f6837
            r0.put(r6, r7)
            java.lang.String r6 = "amazon_aid_limit"
            boolean r4 = r4.f6835
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r0.put(r6, r4)
        L_0x00ea:
            com.appsflyer.AppsFlyerProperties r4 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r6 = "advertiserId"
            java.lang.String r4 = r4.getString(r6)
            if (r4 == 0) goto L_0x00fb
            java.lang.String r6 = "advertiserId"
            r0.put(r6, r4)
        L_0x00fb:
            java.lang.String r4 = "devkey"
            r0.put(r4, r3)
            java.lang.String r3 = "uid"
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r11)
            java.lang.String r4 = com.appsflyer.C1900t.m8826(r4)
            r0.put(r3, r4)
            java.lang.String r3 = "af_gcm_token"
            r0.put(r3, r12)
            java.lang.String r12 = "appsflyer-data"
            android.content.SharedPreferences r12 = com.p280ss.android.ugc.aweme.p340x.C7285c.m22838a(r11, r12, r2)
            java.lang.String r3 = "appsFlyerCount"
            int r12 = m8654(r12, r3, r2)
            java.lang.String r3 = "launch_counter"
            java.lang.String r12 = java.lang.Integer.toString(r12)
            r0.put(r3, r12)
            java.lang.String r12 = "sdk"
            int r3 = android.os.Build.VERSION.SDK_INT
            java.lang.String r3 = java.lang.Integer.toString(r3)
            r0.put(r12, r3)
            java.lang.ref.WeakReference r12 = new java.lang.ref.WeakReference
            r12.<init>(r11)
            java.lang.String r12 = m8691(r12)
            if (r12 == 0) goto L_0x0143
            java.lang.String r3 = "channel"
            r0.put(r3, r12)
        L_0x0143:
            com.appsflyer.k r12 = new com.appsflyer.k     // Catch:{ Throwable -> 0x0169 }
            boolean r3 = r10.f6714     // Catch:{ Throwable -> 0x0169 }
            r12.<init>(r11, r3)     // Catch:{ Throwable -> 0x0169 }
            r12.f6823 = r0     // Catch:{ Throwable -> 0x0169 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0169 }
            r11.<init>()     // Catch:{ Throwable -> 0x0169 }
            java.lang.String r0 = f6694     // Catch:{ Throwable -> 0x0169 }
            java.lang.String r0 = com.appsflyer.ServerConfigHandler.getUrl(r0)     // Catch:{ Throwable -> 0x0169 }
            r11.append(r0)     // Catch:{ Throwable -> 0x0169 }
            r11.append(r5)     // Catch:{ Throwable -> 0x0169 }
            java.lang.String r11 = r11.toString()     // Catch:{ Throwable -> 0x0169 }
            java.lang.String[] r0 = new java.lang.String[r1]     // Catch:{ Throwable -> 0x0169 }
            r0[r2] = r11     // Catch:{ Throwable -> 0x0169 }
            r12.execute(r0)     // Catch:{ Throwable -> 0x0169 }
            return
        L_0x0169:
            r11 = move-exception
            java.lang.String r12 = r11.getMessage()
            com.appsflyer.AFLogger.afErrorLog(r12, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLib.mo7421(android.content.Context, java.lang.String):void");
    }

    /* renamed from: ˎ */
    private static void m8680(Context context, Map<String, ? super String> map) {
        C1878b r2 = C1877g.m8759(context);
        map.put("network", r2.f6804);
        if (r2.f6803 != null) {
            map.put("operator", r2.f6803);
        }
        if (r2.f6805 != null) {
            map.put("carrier", r2.f6805);
        }
    }

    /* renamed from: ˊ */
    private static int m8654(SharedPreferences sharedPreferences, String str, boolean z) {
        int i = sharedPreferences.getInt(str, 0);
        if (z) {
            i++;
            Editor edit = sharedPreferences.edit();
            edit.putInt(str, i);
            if (VERSION.SDK_INT >= 9) {
                edit.apply();
            } else {
                edit.commit();
            }
        }
        if (C1899s.m8812().f6875) {
            C1899s.m8812().mo7515(String.valueOf(i));
        }
        return i;
    }

    /* renamed from: ˋ */
    private static String m8661(String str, PackageManager packageManager, String str2) {
        try {
            Bundle bundle = _lancet.m8717x89c42dc8(packageManager, str2, PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH).metaData;
            if (bundle == null) {
                return null;
            }
            Object obj = bundle.get(str);
            if (obj != null) {
                return obj.toString();
            }
            return null;
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Could not find ");
            sb.append(str);
            sb.append(" value in the manifest");
            AFLogger.afErrorLog(sb.toString(), th);
            return null;
        }
    }

    public void trackEvent(Context context, String str, Map<String, Object> map) {
        Map<String, Object> map2;
        if (map == null) {
            map2 = new HashMap<>();
        } else {
            map2 = map;
        }
        C1899s.m8812().mo7512("trackEvent", str, new JSONObject(map2).toString());
        mo7419(context, str, map);
    }

    public AppsFlyerLib init(String str, AppsFlyerConversionListener appsFlyerConversionListener, Context context) {
        if (context == null) {
            AFLogger.afWarnLog("init :: context is null, Google Install Referrer will be not initialized!");
        } else if (m8683(context)) {
            if (this.f6720 == null) {
                this.f6720 = new C1871d();
                this.f6720.mo7468(context, this);
            } else {
                AFLogger.afWarnLog("AFInstallReferrer instance already created");
            }
        }
        return init(str, appsFlyerConversionListener);
    }

    public void setPreinstallAttribution(String str, String str2, String str3) {
        AFLogger.afDebugLog("setPreinstallAttribution API called");
        JSONObject jSONObject = new JSONObject();
        if (str != null) {
            try {
                jSONObject.put("pid", str);
            } catch (JSONException e) {
                AFLogger.afErrorLog(e.getMessage(), e);
            }
        }
        if (str2 != null) {
            jSONObject.put("c", str2);
        }
        if (str3 != null) {
            jSONObject.put("af_siteid", str3);
        }
        if (jSONObject.has("pid")) {
            String jSONObject2 = jSONObject.toString();
            AppsFlyerProperties.getInstance().set("preInstallName", jSONObject2);
            return;
        }
        AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
    }

    public void startTracking(Application application, String str, AppsFlyerTrackingRequestListener appsFlyerTrackingRequestListener) {
        C1899s.m8812().mo7512("startTracking", str);
        AFLogger.afInfoLog(C1642a.m8034a("Starting AppsFlyer Tracking: (v%s.%s)", new Object[]{"4.8.20", "170"}));
        AFLogger.afInfoLog("Build Number: 170");
        AppsFlyerProperties.getInstance().loadProperties(application.getApplicationContext());
        if (!TextUtils.isEmpty(str)) {
            AppsFlyerProperties.getInstance().set("AppsFlyerKey", str);
            C18754.m8757(str);
        } else {
            if (TextUtils.isEmpty(AppsFlyerProperties.getInstance().getString("AppsFlyerKey"))) {
                AFLogger.afWarnLog("ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the startTracking API method (should be called on Activity's onCreate).");
                return;
            }
        }
        if (appsFlyerTrackingRequestListener != null) {
            f6699 = appsFlyerTrackingRequestListener;
        }
        m8676(application);
    }

    /* access modifiers changed from: protected */
    public void handleDeepLinkCallback(Context context, Map<String, Object> map, Uri uri) {
        final Map map2;
        boolean z;
        map.put("af_deeplink", uri.toString());
        if (uri.getQueryParameter("af_deeplink") != null) {
            String queryParameter = uri.getQueryParameter("media_source");
            String queryParameter2 = uri.getQueryParameter("is_retargeting");
            if (!"AppsFlyer_Test".equals(queryParameter) || !Boolean.parseBoolean(queryParameter2)) {
                z = false;
            } else {
                z = true;
            }
            this.f6710 = z;
            map2 = m8657(context, uri.getQuery());
            String str = "path";
            String path = uri.getPath();
            if (path != null) {
                map2.put(str, path);
            }
            String str2 = "scheme";
            String scheme = uri.getScheme();
            if (scheme != null) {
                map2.put(str2, scheme);
            }
            String str3 = "host";
            String host = uri.getHost();
            if (host != null) {
                map2.put(str3, host);
            }
        } else {
            map2 = new HashMap();
            map2.put("link", uri.toString());
        }
        final WeakReference weakReference = new WeakReference(context);
        C1896q qVar = new C1896q(uri, this);
        qVar.f6760 = new HttpsUrlConnectionProvider();
        if (qVar.mo7507()) {
            qVar.f6854 = new C1897e() {
                /* renamed from: ˎ */
                private void m8714(Map<String, String> map) {
                    if (weakReference.get() != null) {
                        AppsFlyerLib.m8695((Context) weakReference.get(), "deeplinkAttribution", new JSONObject(map).toString());
                    }
                }

                /* renamed from: ˋ */
                public final void mo7424(String str) {
                    if (AppsFlyerLib.f6695 != null) {
                        m8714(map2);
                        AppsFlyerLib.f6695.onAttributionFailure(str);
                    }
                }

                /* renamed from: ॱ */
                public final void mo7425(Map<String, String> map) {
                    for (String str : map.keySet()) {
                        map2.put(str, map.get(str));
                    }
                    m8714(map2);
                    AppsFlyerLib.m8681(map2);
                }
            };
            AFExecutor.getInstance().getThreadPoolExecutor().execute(qVar);
            return;
        }
        if (f6695 != null) {
            try {
                f6695.onAppOpenAttribution(map2);
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getLocalizedMessage(), th);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ˎ */
    public static void m8678(Context context, String str, int i) {
        Editor edit = C7285c.m22838a(context, "appsflyer-data", 0).edit();
        edit.putInt(str, i);
        if (VERSION.SDK_INT >= 9) {
            edit.apply();
        } else {
            edit.commit();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ˏ */
    public static void m8694(Context context, String str, long j) {
        Editor edit = C7285c.m22838a(context, "appsflyer-data", 0).edit();
        edit.putLong(str, j);
        if (VERSION.SDK_INT >= 9) {
            edit.apply();
        } else {
            edit.commit();
        }
    }

    /* renamed from: ˋ */
    private static void m8669(ScheduledExecutorService scheduledExecutorService, Runnable runnable, long j, TimeUnit timeUnit) {
        if (scheduledExecutorService != null) {
            try {
                if (!scheduledExecutorService.isShutdown() && !scheduledExecutorService.isTerminated()) {
                    scheduledExecutorService.schedule(runnable, j, timeUnit);
                    return;
                }
            } catch (RejectedExecutionException e) {
                AFLogger.afErrorLog("scheduleJob failed with RejectedExecutionException Exception", e);
                return;
            } catch (Throwable th) {
                AFLogger.afErrorLog("scheduleJob failed with Exception", th);
                return;
            }
        }
        AFLogger.afWarnLog("scheduler is null, shut downed or terminated");
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x022a A[Catch:{ m -> 0x0209, all -> 0x022e }] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x021e A[SYNTHETIC, Splitter:B:99:0x021e] */
    /* renamed from: ˋ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m8668(java.net.URL r18, java.lang.String r19, java.lang.String r20, java.lang.ref.WeakReference<android.content.Context> r21, java.lang.String r22, boolean r23) throws java.io.IOException {
        /*
            r17 = this;
            r1 = r17
            r0 = r19
            r2 = r20
            r3 = r22
            java.lang.Object r5 = r21.get()
            android.content.Context r5 = (android.content.Context) r5
            r6 = 1
            r7 = 0
            if (r23 == 0) goto L_0x0018
            com.appsflyer.AppsFlyerConversionListener r8 = f6695
            if (r8 == 0) goto L_0x0018
            r8 = 1
            goto L_0x0019
        L_0x0018:
            r8 = 0
        L_0x0019:
            r9 = 0
            com.appsflyer.s r10 = com.appsflyer.C1899s.m8812()     // Catch:{ all -> 0x0230 }
            java.lang.String r11 = r18.toString()     // Catch:{ all -> 0x0230 }
            r10.mo7517(r11, r0)     // Catch:{ all -> 0x0230 }
            java.net.URLConnection r10 = r18.openConnection()     // Catch:{ all -> 0x0230 }
            java.net.HttpURLConnection r10 = (java.net.HttpURLConnection) r10     // Catch:{ all -> 0x0230 }
            java.lang.String r11 = "POST"
            r10.setRequestMethod(r11)     // Catch:{ all -> 0x022e }
            byte[] r11 = r19.getBytes()     // Catch:{ all -> 0x022e }
            int r11 = r11.length     // Catch:{ all -> 0x022e }
            java.lang.String r12 = "Content-Length"
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x022e }
            r10.setRequestProperty(r12, r11)     // Catch:{ all -> 0x022e }
            java.lang.String r11 = "Content-Type"
            java.lang.String r12 = "application/json"
            r10.setRequestProperty(r11, r12)     // Catch:{ all -> 0x022e }
            r11 = 10000(0x2710, float:1.4013E-41)
            r10.setConnectTimeout(r11)     // Catch:{ all -> 0x022e }
            r10.setDoOutput(r6)     // Catch:{ all -> 0x022e }
            java.io.OutputStreamWriter r11 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x021b }
            java.io.OutputStream r12 = r10.getOutputStream()     // Catch:{ all -> 0x021b }
            java.lang.String r13 = "UTF-8"
            r11.<init>(r12, r13)     // Catch:{ all -> 0x021b }
            r11.write(r0)     // Catch:{ all -> 0x0218 }
            r11.close()     // Catch:{ all -> 0x022e }
            int r0 = r10.getResponseCode()     // Catch:{ all -> 0x022e }
            java.lang.String r11 = m8674(r10)     // Catch:{ all -> 0x022e }
            com.appsflyer.s r12 = com.appsflyer.C1899s.m8812()     // Catch:{ all -> 0x022e }
            java.lang.String r13 = r18.toString()     // Catch:{ all -> 0x022e }
            r12.mo7516(r13, r0, r11)     // Catch:{ all -> 0x022e }
            java.lang.String r12 = "response code: "
            java.lang.String r13 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x022e }
            java.lang.String r12 = r12.concat(r13)     // Catch:{ all -> 0x022e }
            com.appsflyer.AFLogger.afInfoLog(r12)     // Catch:{ all -> 0x022e }
            java.lang.String r12 = "AppsFlyer_4.8.20"
            java.lang.String r13 = "SERVER_RESPONSE_CODE"
            java.lang.String r14 = java.lang.Integer.toString(r0)     // Catch:{ all -> 0x022e }
            m8696(r5, r12, r13, r14)     // Catch:{ all -> 0x022e }
            java.lang.String r12 = "appsflyer-data"
            android.content.SharedPreferences r12 = com.p280ss.android.ugc.aweme.p340x.C7285c.m22838a(r5, r12, r7)     // Catch:{ all -> 0x022e }
            r13 = 200(0xc8, float:2.8E-43)
            if (r0 != r13) goto L_0x015b
            java.lang.Object r0 = r21.get()     // Catch:{ all -> 0x022e }
            if (r0 == 0) goto L_0x00aa
            if (r23 == 0) goto L_0x00aa
            long r13 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x022e }
            r1.f6717 = r13     // Catch:{ all -> 0x022e }
            com.appsflyer.AppsFlyerTrackingRequestListener r0 = f6699     // Catch:{ all -> 0x022e }
            if (r0 == 0) goto L_0x00aa
            com.appsflyer.AppsFlyerTrackingRequestListener r0 = f6699     // Catch:{ all -> 0x022e }
            r0.onTrackingRequestSuccess()     // Catch:{ all -> 0x022e }
        L_0x00aa:
            java.lang.String r0 = "afUninstallToken"
            com.appsflyer.AppsFlyerProperties r4 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x022e }
            java.lang.String r0 = r4.getString(r0)     // Catch:{ all -> 0x022e }
            if (r0 == 0) goto L_0x00e1
            java.lang.String r4 = "Uninstall Token exists: "
            java.lang.String r13 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x022e }
            java.lang.String r4 = r4.concat(r13)     // Catch:{ all -> 0x022e }
            com.appsflyer.AFLogger.afDebugLog(r4)     // Catch:{ all -> 0x022e }
            java.lang.String r4 = "sentRegisterRequestToAF"
            boolean r4 = r12.getBoolean(r4, r7)     // Catch:{ all -> 0x022e }
            if (r4 != 0) goto L_0x0101
            java.lang.String r4 = "Resending Uninstall token to AF servers: "
            java.lang.String r13 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x022e }
            java.lang.String r4 = r4.concat(r13)     // Catch:{ all -> 0x022e }
            com.appsflyer.AFLogger.afDebugLog(r4)     // Catch:{ all -> 0x022e }
            com.appsflyer.c$a$c r4 = new com.appsflyer.c$a$c     // Catch:{ all -> 0x022e }
            r4.<init>(r0)     // Catch:{ all -> 0x022e }
            com.appsflyer.C1901u.m8832(r5, r4)     // Catch:{ all -> 0x022e }
            goto L_0x0101
        L_0x00e1:
            java.lang.String r0 = "gcmProjectNumber"
            com.appsflyer.AppsFlyerProperties r4 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x022e }
            java.lang.String r0 = r4.getString(r0)     // Catch:{ all -> 0x022e }
            if (r0 == 0) goto L_0x0101
            java.lang.String r0 = "GCM Project number exists. Fetching token and sending to AF servers"
            com.appsflyer.AFLogger.afDebugLog(r0)     // Catch:{ all -> 0x022e }
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x022e }
            r0.<init>(r5)     // Catch:{ all -> 0x022e }
            com.appsflyer.u$a r4 = new com.appsflyer.u$a     // Catch:{ all -> 0x022e }
            r4.<init>(r0)     // Catch:{ all -> 0x022e }
            java.lang.Void[] r0 = new java.lang.Void[r7]     // Catch:{ all -> 0x022e }
            r4.execute(r0)     // Catch:{ all -> 0x022e }
        L_0x0101:
            android.net.Uri r0 = r1.latestDeepLink     // Catch:{ all -> 0x022e }
            if (r0 == 0) goto L_0x0107
            r1.latestDeepLink = r9     // Catch:{ all -> 0x022e }
        L_0x0107:
            if (r3 == 0) goto L_0x0110
            com.appsflyer.cache.CacheManager r0 = com.appsflyer.cache.CacheManager.getInstance()     // Catch:{ all -> 0x022e }
            r0.deleteRequest(r3, r5)     // Catch:{ all -> 0x022e }
        L_0x0110:
            java.lang.Object r0 = r21.get()     // Catch:{ all -> 0x022e }
            if (r0 == 0) goto L_0x014e
            if (r3 != 0) goto L_0x014e
            java.lang.String r0 = "sentSuccessfully"
            java.lang.String r3 = "true"
            m8695(r5, r0, r3)     // Catch:{ all -> 0x022e }
            boolean r0 = r1.f6719     // Catch:{ all -> 0x022e }
            if (r0 != 0) goto L_0x014e
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x022e }
            long r13 = r1.f6700     // Catch:{ all -> 0x022e }
            r0 = 0
            long r3 = r3 - r13
            r13 = 15000(0x3a98, double:7.411E-320)
            int r0 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x0132
            goto L_0x014e
        L_0x0132:
            java.util.concurrent.ScheduledExecutorService r0 = r1.f6702     // Catch:{ all -> 0x022e }
            if (r0 != 0) goto L_0x014e
            com.appsflyer.AFExecutor r0 = com.appsflyer.AFExecutor.getInstance()     // Catch:{ all -> 0x022e }
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = r0.mo7382()     // Catch:{ all -> 0x022e }
            r1.f6702 = r0     // Catch:{ all -> 0x022e }
            com.appsflyer.AppsFlyerLib$d r0 = new com.appsflyer.AppsFlyerLib$d     // Catch:{ all -> 0x022e }
            r0.<init>(r5)     // Catch:{ all -> 0x022e }
            java.util.concurrent.ScheduledExecutorService r3 = r1.f6702     // Catch:{ all -> 0x022e }
            r13 = 1
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x022e }
            m8669(r3, r0, r13, r4)     // Catch:{ all -> 0x022e }
        L_0x014e:
            org.json.JSONObject r0 = com.appsflyer.ServerConfigHandler.m8729(r11)     // Catch:{ all -> 0x022e }
            java.lang.String r3 = "send_background"
            boolean r0 = r0.optBoolean(r3, r7)     // Catch:{ all -> 0x022e }
            r1.f6715 = r0     // Catch:{ all -> 0x022e }
            goto L_0x016e
        L_0x015b:
            com.appsflyer.AppsFlyerTrackingRequestListener r3 = f6699     // Catch:{ all -> 0x022e }
            if (r3 == 0) goto L_0x016e
            java.lang.String r3 = "Failure: "
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x022e }
            java.lang.String r0 = r3.concat(r0)     // Catch:{ all -> 0x022e }
            com.appsflyer.AppsFlyerTrackingRequestListener r3 = f6699     // Catch:{ all -> 0x022e }
            r3.onTrackingRequestFailure(r0)     // Catch:{ all -> 0x022e }
        L_0x016e:
            java.lang.String r0 = "appsflyerConversionDataRequestRetries"
            int r0 = r12.getInt(r0, r7)     // Catch:{ all -> 0x022e }
            java.lang.String r3 = "appsflyerConversionDataCacheExpiration"
            r13 = 0
            long r3 = r12.getLong(r3, r13)     // Catch:{ all -> 0x022e }
            int r11 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r11 == 0) goto L_0x0199
            long r15 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x022e }
            r11 = 0
            long r15 = r15 - r3
            r3 = 5184000000(0x134fd9000, double:2.561236308E-314)
            int r11 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r11 <= 0) goto L_0x0199
            java.lang.String r3 = "attributionId"
            m8695(r5, r3, r9)     // Catch:{ all -> 0x022e }
            java.lang.String r3 = "appsflyerConversionDataCacheExpiration"
            m8694(r5, r3, r13)     // Catch:{ all -> 0x022e }
        L_0x0199:
            java.lang.String r3 = "attributionId"
            java.lang.String r3 = r12.getString(r3, r9)     // Catch:{ all -> 0x022e }
            if (r3 != 0) goto L_0x01c5
            if (r2 == 0) goto L_0x01c5
            if (r8 == 0) goto L_0x01c5
            com.appsflyer.AppsFlyerConversionListener r3 = f6695     // Catch:{ all -> 0x022e }
            if (r3 == 0) goto L_0x01c5
            r3 = 5
            if (r0 > r3) goto L_0x01c5
            com.appsflyer.AFExecutor r0 = com.appsflyer.AFExecutor.getInstance()     // Catch:{ all -> 0x022e }
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = r0.mo7382()     // Catch:{ all -> 0x022e }
            com.appsflyer.AppsFlyerLib$e r3 = new com.appsflyer.AppsFlyerLib$e     // Catch:{ all -> 0x022e }
            android.content.Context r4 = r5.getApplicationContext()     // Catch:{ all -> 0x022e }
            r3.<init>(r4, r2, r0)     // Catch:{ all -> 0x022e }
            r4 = 10
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x022e }
            m8669(r0, r3, r4, r2)     // Catch:{ all -> 0x022e }
            goto L_0x0211
        L_0x01c5:
            if (r2 != 0) goto L_0x01cd
            java.lang.String r0 = "AppsFlyer dev key is missing."
            com.appsflyer.AFLogger.afWarnLog(r0)     // Catch:{ all -> 0x022e }
            goto L_0x0211
        L_0x01cd:
            if (r8 == 0) goto L_0x0211
            com.appsflyer.AppsFlyerConversionListener r0 = f6695     // Catch:{ all -> 0x022e }
            if (r0 == 0) goto L_0x0211
            java.lang.String r0 = "attributionId"
            java.lang.String r0 = r12.getString(r0, r9)     // Catch:{ all -> 0x022e }
            if (r0 == 0) goto L_0x0211
            java.lang.String r0 = "appsFlyerCount"
            int r0 = m8654(r12, r0, r7)     // Catch:{ all -> 0x022e }
            if (r0 <= r6) goto L_0x0211
            java.util.Map r0 = m8699(r5)     // Catch:{ m -> 0x0209 }
            if (r0 == 0) goto L_0x0211
            java.lang.String r2 = "is_first_launch"
            boolean r2 = r0.containsKey(r2)     // Catch:{ Throwable -> 0x0200 }
            if (r2 != 0) goto L_0x01fa
            java.lang.String r2 = "is_first_launch"
            java.lang.String r3 = java.lang.Boolean.toString(r7)     // Catch:{ Throwable -> 0x0200 }
            r0.put(r2, r3)     // Catch:{ Throwable -> 0x0200 }
        L_0x01fa:
            com.appsflyer.AppsFlyerConversionListener r2 = f6695     // Catch:{ Throwable -> 0x0200 }
            r2.onInstallConversionDataLoaded(r0)     // Catch:{ Throwable -> 0x0200 }
            goto L_0x0211
        L_0x0200:
            r0 = move-exception
            java.lang.String r2 = r0.getLocalizedMessage()     // Catch:{ m -> 0x0209 }
            com.appsflyer.AFLogger.afErrorLog(r2, r0)     // Catch:{ m -> 0x0209 }
            goto L_0x0211
        L_0x0209:
            r0 = move-exception
            java.lang.String r2 = r0.getMessage()     // Catch:{ all -> 0x022e }
            com.appsflyer.AFLogger.afErrorLog(r2, r0)     // Catch:{ all -> 0x022e }
        L_0x0211:
            if (r10 == 0) goto L_0x0217
            r10.disconnect()
            return
        L_0x0217:
            return
        L_0x0218:
            r0 = move-exception
            r9 = r11
            goto L_0x021c
        L_0x021b:
            r0 = move-exception
        L_0x021c:
            if (r9 != 0) goto L_0x022a
            com.appsflyer.AppsFlyerTrackingRequestListener r2 = f6699     // Catch:{ all -> 0x022e }
            if (r2 == 0) goto L_0x022d
            com.appsflyer.AppsFlyerTrackingRequestListener r2 = f6699     // Catch:{ all -> 0x022e }
            java.lang.String r3 = "No Connectivity"
            r2.onTrackingRequestFailure(r3)     // Catch:{ all -> 0x022e }
            goto L_0x022d
        L_0x022a:
            r9.close()     // Catch:{ all -> 0x022e }
        L_0x022d:
            throw r0     // Catch:{ all -> 0x022e }
        L_0x022e:
            r0 = move-exception
            goto L_0x0232
        L_0x0230:
            r0 = move-exception
            r10 = r9
        L_0x0232:
            if (r10 == 0) goto L_0x0237
            r10.disconnect()
        L_0x0237:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLib.m8668(java.net.URL, java.lang.String, java.lang.String, java.lang.ref.WeakReference, java.lang.String, boolean):void");
    }

    /* renamed from: ˋ */
    private void m8666(Context context, String str, String str2, String str3, String str4, Intent intent, String str5) {
        boolean z;
        Context applicationContext = context.getApplicationContext();
        boolean z2 = false;
        if (str2 == null) {
            z = true;
        } else {
            z = false;
        }
        if (AppsFlyerProperties.getInstance().getBoolean("waitForCustomerId", false)) {
            if (AppsFlyerProperties.getInstance().getString("AppUserId") == null) {
                z2 = true;
            }
        }
        if (z2) {
            AFLogger.afInfoLog("CustomerUserId not set, Tracking is disabled", true);
            return;
        }
        if (z) {
            if (!AppsFlyerProperties.getInstance().getBoolean("launchProtectEnabled", true)) {
                AFLogger.afInfoLog("Allowing multiple launches within a 5 second time window.");
            } else if (m8670()) {
                return;
            }
            this.f6701 = System.currentTimeMillis();
        }
        ScheduledThreadPoolExecutor r1 = AFExecutor.getInstance().mo7382();
        C1861c cVar = new C1861c(this, new WeakReference(applicationContext), str, str2, str3, str4, false, intent, str5, 0);
        m8669(r1, cVar, 150, TimeUnit.MILLISECONDS);
    }

    /* renamed from: ˋ */
    static /* synthetic */ void m8667(AppsFlyerLib appsFlyerLib, String str, String str2, String str3, WeakReference weakReference, String str4, boolean z) throws IOException {
        URL url = new URL(str);
        StringBuilder sb = new StringBuilder("url: ");
        sb.append(url.toString());
        AFLogger.afInfoLog(sb.toString());
        C18754.m8758("data: ".concat(String.valueOf(str2)));
        m8696((Context) weakReference.get(), "AppsFlyer_4.8.20", "EVENT_DATA", str2);
        try {
            appsFlyerLib.m8668(url, str2, str3, weakReference, str4, z);
        } catch (IOException e) {
            AFLogger.afErrorLog("Exception in sendRequestToServer. ", e);
            if (AppsFlyerProperties.getInstance().getBoolean("useHttpFallback", false)) {
                appsFlyerLib.m8668(new URL(str.replace("https:", "http:")), str2, str3, weakReference, str4, z);
                return;
            }
            StringBuilder sb2 = new StringBuilder("failed to send requeset to server. ");
            sb2.append(e.getLocalizedMessage());
            AFLogger.afInfoLog(sb2.toString());
            m8696((Context) weakReference.get(), "AppsFlyer_4.8.20", "ERROR", e.getLocalizedMessage());
            throw e;
        }
    }

    /* renamed from: ˊ */
    static /* synthetic */ void m8658(AppsFlyerLib appsFlyerLib, Context context, String str, String str2, String str3, String str4, boolean z, boolean z2, Intent intent, String str5) {
        boolean z3;
        String str6;
        boolean z4;
        AppsFlyerLib appsFlyerLib2 = appsFlyerLib;
        Context context2 = context;
        if (context2 == null) {
            AFLogger.afDebugLog("sendTrackingWithEvent - got null context. skipping event/launch.");
            return;
        }
        boolean z5 = false;
        SharedPreferences a = C7285c.m22838a(context2, "appsflyer-data", 0);
        AppsFlyerProperties.getInstance().saveProperties(a);
        if (!appsFlyerLib2.f6714) {
            StringBuilder sb = new StringBuilder("sendTrackingWithEvent from activity: ");
            sb.append(context.getClass().getName());
            AFLogger.afInfoLog(sb.toString());
        }
        if (str2 == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        Map r1 = appsFlyerLib.mo7418(context, str, str2, str3, str4, z, a, z3, intent, str5);
        String str7 = (String) r1.get("appsflyerKey");
        if (str7 == null || str7.length() == 0) {
            AFLogger.afDebugLog("Not sending data yet, waiting for dev key");
            return;
        }
        if (!appsFlyerLib2.f6714) {
            AFLogger.afInfoLog("AppsFlyerLib.sendTrackingWithEvent");
        }
        if (!z3) {
            str6 = f6689;
        } else if (z2) {
            str6 = f6697;
        } else {
            str6 = f6688;
        }
        String url = ServerConfigHandler.getUrl(str6);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(url);
        sb2.append(context.getPackageName());
        String obj = sb2.toString();
        int r3 = m8654(a, "appsFlyerCount", false);
        if (AppsFlyerProperties.getInstance().getBoolean("collectAndroidIdForceByUser", false) || AppsFlyerProperties.getInstance().getBoolean("collectIMEIForceByUser", false)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4 && r1.get("advertiserId") != null) {
            try {
                if (TextUtils.isEmpty(appsFlyerLib2.f6716) && r1.remove("android_id") != null) {
                    AFLogger.afInfoLog("validateGaidAndIMEI :: removing: android_id");
                }
                if (TextUtils.isEmpty(appsFlyerLib2.f6707) && r1.remove("imei") != null) {
                    AFLogger.afInfoLog("validateGaidAndIMEI :: removing: imei");
                }
            } catch (Exception e) {
                AFLogger.afErrorLog("failed to remove IMEI or AndroidID key from params; ", e);
            }
        }
        C1859a aVar = new C1859a(appsFlyerLib, obj, r1, context.getApplicationContext(), z3, r3, 0);
        if (z3 && m8683(context)) {
            if (appsFlyerLib2.f6721 != null && appsFlyerLib2.f6721.size() > 0) {
                z5 = true;
            }
            if (!z5) {
                AFLogger.afDebugLog("Failed to get new referrer, wait ...");
                m8669(AFExecutor.getInstance().mo7382(), aVar, 500, TimeUnit.MILLISECONDS);
                return;
            }
        }
        aVar.run();
    }
}
