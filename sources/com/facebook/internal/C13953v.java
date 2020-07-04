package com.facebook.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.C13499h;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.login.DefaultAudience;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.internal.v */
public final class C13953v {

    /* renamed from: a */
    public static final List<C13959e> f36921a = m41176c();

    /* renamed from: b */
    public static final AtomicBoolean f36922b = new AtomicBoolean(false);

    /* renamed from: c */
    private static final String f36923c = "com.facebook.internal.v";

    /* renamed from: d */
    private static final List<C13959e> f36924d = m41177d();

    /* renamed from: e */
    private static final Map<String, List<C13959e>> f36925e = m41180e();

    /* renamed from: f */
    private static final List<Integer> f36926f = Arrays.asList(new Integer[]{Integer.valueOf(20170417), Integer.valueOf(20160327), Integer.valueOf(20141218), Integer.valueOf(20141107), Integer.valueOf(20141028), Integer.valueOf(20141001), Integer.valueOf(20140701), Integer.valueOf(20140324), Integer.valueOf(20140204), Integer.valueOf(20131107), Integer.valueOf(20130618), Integer.valueOf(20130502), Integer.valueOf(20121101)});

    /* renamed from: com.facebook.internal.v$a */
    static class C13955a extends C13959e {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final String mo33606a() {
            return "com.facebook.arstudio.player";
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final String mo33607b() {
            return null;
        }

        private C13955a() {
            super();
        }
    }

    /* renamed from: com.facebook.internal.v$b */
    static class C13956b extends C13959e {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final String mo33606a() {
            return "com.facebook.lite";
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final String mo33607b() {
            return "com.facebook.lite.platform.LoginGDPDialogActivity";
        }

        private C13956b() {
            super();
        }
    }

    /* renamed from: com.facebook.internal.v$c */
    static class C13957c extends C13959e {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final String mo33606a() {
            return "com.facebook.katana";
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final String mo33607b() {
            return "com.facebook.katana.ProxyAuth";
        }

        private C13957c() {
            super();
        }
    }

    /* renamed from: com.facebook.internal.v$d */
    static class C13958d extends C13959e {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final String mo33606a() {
            return "com.facebook.orca";
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final String mo33607b() {
            return null;
        }

        private C13958d() {
            super();
        }
    }

    /* renamed from: com.facebook.internal.v$e */
    static abstract class C13959e {

        /* renamed from: a */
        private TreeSet<Integer> f36927a;

        private C13959e() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract String mo33606a();

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract String mo33607b();

        /* renamed from: c */
        public final TreeSet<Integer> mo33609c() {
            if (this.f36927a == null || this.f36927a.isEmpty()) {
                mo33608a(false);
            }
            return this.f36927a;
        }

        /* renamed from: a */
        public final synchronized void mo33608a(boolean z) {
            if (!z) {
                try {
                    if (this.f36927a != null) {
                        if (this.f36927a.isEmpty()) {
                        }
                    }
                } finally {
                }
            }
            this.f36927a = C13953v.m41165a(this);
        }
    }

    /* renamed from: com.facebook.internal.v$f */
    public static class C13960f {

        /* renamed from: a */
        public C13959e f36928a;

        /* renamed from: b */
        public int f36929b;

        private C13960f() {
        }

        /* renamed from: a */
        public static C13960f m41195a() {
            C13960f fVar = new C13960f();
            fVar.f36929b = -1;
            return fVar;
        }

        /* renamed from: a */
        public static C13960f m41196a(C13959e eVar, int i) {
            C13960f fVar = new C13960f();
            fVar.f36928a = eVar;
            fVar.f36929b = i;
            return fVar;
        }
    }

    /* renamed from: com.facebook.internal.v$g */
    static class C13961g extends C13959e {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final String mo33606a() {
            return "com.facebook.wakizashi";
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final String mo33607b() {
            return "com.facebook.katana.ProxyAuth";
        }

        private C13961g() {
            super();
        }
    }

    /* renamed from: a */
    public static boolean m41168a(int i) {
        return f36926f.contains(Integer.valueOf(i)) && i >= 20140701;
    }

    /* renamed from: a */
    public static void m41167a(Intent intent, String str, String str2, int i, Bundle bundle) {
        String k = C13499h.m39725k();
        String l = C13499h.m39726l();
        intent.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", i).putExtra("com.facebook.platform.protocol.PROTOCOL_ACTION", str2).putExtra("com.facebook.platform.extra.APPLICATION_ID", k);
        if (m41168a(i)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("action_id", str);
            C13967z.m41237a(bundle2, "app_name", l);
            intent.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
            if (bundle == null) {
                bundle = new Bundle();
            }
            intent.putExtra("com.facebook.platform.protocol.METHOD_ARGS", bundle);
            return;
        }
        intent.putExtra("com.facebook.platform.protocol.CALL_ID", str);
        if (!C13967z.m41249a(l)) {
            intent.putExtra("com.facebook.platform.extra.APPLICATION_NAME", l);
        }
        intent.putExtras(bundle);
    }

    /* renamed from: a */
    public static UUID m41166a(Intent intent) {
        String str;
        UUID uuid;
        if (intent == null) {
            return null;
        }
        if (m41168a(m41181f(intent))) {
            Bundle bundleExtra = intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
            str = bundleExtra != null ? bundleExtra.getString("action_id") : null;
        } else {
            str = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
        }
        if (str != null) {
            try {
                uuid = UUID.fromString(str);
            } catch (IllegalArgumentException unused) {
            }
            return uuid;
        }
        uuid = null;
        return uuid;
    }

    /* renamed from: a */
    public static FacebookException m41162a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String string = bundle.getString("error_type");
        if (string == null) {
            string = bundle.getString("com.facebook.platform.status.ERROR_TYPE");
        }
        String string2 = bundle.getString("error_description");
        if (string2 == null) {
            string2 = bundle.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
        }
        if (string == null || !string.equalsIgnoreCase("UserCanceled")) {
            return new FacebookException(string2);
        }
        return new FacebookOperationCanceledException(string2);
    }

    /* renamed from: a */
    public static Bundle m41161a(FacebookException facebookException) {
        if (facebookException == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("error_description", facebookException.toString());
        if (facebookException instanceof FacebookOperationCanceledException) {
            bundle.putString("error_type", "UserCanceled");
        }
        return bundle;
    }

    /* renamed from: a */
    public static C13960f m41163a(String str, int[] iArr) {
        return m41164a((List) f36925e.get(str), iArr);
    }

    /* renamed from: a */
    private static C13960f m41164a(List<C13959e> list, int[] iArr) {
        m41174b();
        if (list == null) {
            return C13960f.m41195a();
        }
        for (C13959e eVar : list) {
            int a = m41154a(eVar.mo33609c(), m41153a(), iArr);
            if (a != -1) {
                return C13960f.m41196a(eVar, a);
            }
        }
        return C13960f.m41195a();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static TreeSet<Integer> m41165a(C13959e eVar) {
        ProviderInfo providerInfo;
        TreeSet<Integer> treeSet = new TreeSet<>();
        ContentResolver contentResolver = C13499h.m39721g().getContentResolver();
        String[] strArr = {C38347c.f99551f};
        Uri b = m41172b(eVar);
        Cursor cursor = null;
        try {
            PackageManager packageManager = C13499h.m39721g().getPackageManager();
            StringBuilder sb = new StringBuilder();
            sb.append(eVar.mo33606a());
            sb.append(".provider.PlatformProvider");
            try {
                providerInfo = packageManager.resolveContentProvider(sb.toString(), 0);
            } catch (RuntimeException unused) {
                providerInfo = null;
            }
            if (providerInfo != null) {
                try {
                    cursor = contentResolver.query(b, strArr, null, null, null);
                } catch (IllegalArgumentException | NullPointerException | SecurityException unused2) {
                }
                if (cursor != null) {
                    while (cursor.moveToNext()) {
                        treeSet.add(Integer.valueOf(cursor.getInt(cursor.getColumnIndex(C38347c.f99551f))));
                    }
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return treeSet;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public static final int m41153a() {
        return ((Integer) f36926f.get(0)).intValue();
    }

    /* renamed from: d */
    private static List<C13959e> m41177d() {
        ArrayList arrayList = new ArrayList(m41176c());
        arrayList.add(0, new C13955a());
        return arrayList;
    }

    /* renamed from: c */
    private static List<C13959e> m41176c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C13957c());
        arrayList.add(new C13961g());
        return arrayList;
    }

    /* renamed from: e */
    private static Map<String, List<C13959e>> m41180e() {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C13958d());
        hashMap.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", f36921a);
        hashMap.put("com.facebook.platform.action.request.FEED_DIALOG", f36921a);
        hashMap.put("com.facebook.platform.action.request.LIKE_DIALOG", f36921a);
        hashMap.put("com.facebook.platform.action.request.APPINVITES_DIALOG", f36921a);
        hashMap.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList);
        hashMap.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList);
        hashMap.put("com.facebook.platform.action.request.CAMERA_EFFECT", f36924d);
        hashMap.put("com.facebook.platform.action.request.SHARE_STORY", f36921a);
        return hashMap;
    }

    /* renamed from: b */
    public static void m41174b() {
        if (f36922b.compareAndSet(false, true)) {
            C13499h.m39719e().execute(new Runnable() {
                public final void run() {
                    try {
                        for (C13959e a : C13953v.f36921a) {
                            a.mo33608a(true);
                        }
                    } finally {
                        C13953v.f36922b.set(false);
                    }
                }
            });
        }
    }

    /* renamed from: f */
    private static int m41181f(Intent intent) {
        return intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
    }

    /* renamed from: b */
    public static int m41169b(int i) {
        return m41164a(f36921a, new int[]{i}).f36929b;
    }

    /* renamed from: c */
    public static Bundle m41175c(Intent intent) {
        int f = m41181f(intent);
        Bundle extras = intent.getExtras();
        if (!m41168a(f) || extras == null) {
            return extras;
        }
        return extras.getBundle("com.facebook.platform.protocol.RESULT_ARGS");
    }

    /* renamed from: e */
    public static Bundle m41179e(Intent intent) {
        if (!m41178d(intent)) {
            return null;
        }
        Bundle g = m41182g(intent);
        if (g != null) {
            return g.getBundle("error");
        }
        return intent.getExtras();
    }

    /* renamed from: g */
    private static Bundle m41182g(Intent intent) {
        if (!m41168a(m41181f(intent))) {
            return null;
        }
        return intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
    }

    /* renamed from: d */
    public static boolean m41178d(Intent intent) {
        Bundle g = m41182g(intent);
        if (g != null) {
            return g.containsKey("error");
        }
        return intent.hasExtra("com.facebook.platform.status.ERROR_TYPE");
    }

    /* renamed from: a */
    public static Intent m41155a(Context context) {
        for (C13959e eVar : f36921a) {
            Intent b = m41170b(context, new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(eVar.mo33606a()).addCategory("android.intent.category.DEFAULT"), eVar);
            if (b != null) {
                return b;
            }
        }
        return null;
    }

    /* renamed from: b */
    private static Uri m41172b(C13959e eVar) {
        StringBuilder sb = new StringBuilder("content://");
        sb.append(eVar.mo33606a());
        sb.append(".provider.PlatformProvider/versions");
        return Uri.parse(sb.toString());
    }

    /* renamed from: b */
    public static Bundle m41173b(Intent intent) {
        if (!m41168a(m41181f(intent))) {
            return intent.getExtras();
        }
        return intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
    }

    /* renamed from: a */
    private static Intent m41156a(Context context, Intent intent, C13959e eVar) {
        if (intent == null) {
            return null;
        }
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 0);
        if (resolveActivity != null && C13916j.m41080a(context, resolveActivity.activityInfo.packageName)) {
            return intent;
        }
        return null;
    }

    /* renamed from: b */
    private static Intent m41170b(Context context, Intent intent, C13959e eVar) {
        if (intent == null) {
            return null;
        }
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveService != null && C13916j.m41080a(context, resolveService.serviceInfo.packageName)) {
            return intent;
        }
        return null;
    }

    /* renamed from: a */
    private static int m41154a(TreeSet<Integer> treeSet, int i, int[] iArr) {
        int length = iArr.length - 1;
        Iterator descendingIterator = treeSet.descendingIterator();
        int i2 = length;
        int i3 = -1;
        while (descendingIterator.hasNext()) {
            int intValue = ((Integer) descendingIterator.next()).intValue();
            i3 = Math.max(i3, intValue);
            while (i2 >= 0 && iArr[i2] > intValue) {
                i2--;
            }
            if (i2 < 0) {
                return -1;
            }
            if (iArr[i2] == intValue) {
                if (i2 % 2 == 0) {
                    return Math.min(i3, i);
                }
                return -1;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static Intent m41159a(Intent intent, Bundle bundle, FacebookException facebookException) {
        UUID a = m41166a(intent);
        if (a == null) {
            return null;
        }
        Intent intent2 = new Intent();
        intent2.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", m41181f(intent));
        Bundle bundle2 = new Bundle();
        bundle2.putString("action_id", a.toString());
        if (facebookException != null) {
            bundle2.putBundle("error", m41161a(facebookException));
        }
        intent2.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
        if (bundle != null) {
            intent2.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
        }
        return intent2;
    }

    /* renamed from: a */
    public static Intent m41157a(Context context, String str, String str2, C13960f fVar, Bundle bundle) {
        if (fVar == null) {
            return null;
        }
        C13959e eVar = fVar.f36928a;
        if (eVar == null) {
            return null;
        }
        Intent a = m41156a(context, new Intent().setAction("com.facebook.platform.PLATFORM_ACTIVITY").setPackage(eVar.mo33606a()).addCategory("android.intent.category.DEFAULT"), eVar);
        if (a == null) {
            return null;
        }
        m41167a(a, str, str2, fVar.f36929b, bundle);
        return a;
    }

    /* renamed from: b */
    public static Intent m41171b(Context context, String str, Collection<String> collection, String str2, boolean z, boolean z2, DefaultAudience defaultAudience, String str3, String str4) {
        for (C13959e eVar : f36921a) {
            Context context2 = context;
            Intent a = m41156a(context, m41160a(eVar, str, collection, str2, z, z2, defaultAudience, str3, str4), eVar);
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static Intent m41158a(Context context, String str, Collection<String> collection, String str2, boolean z, boolean z2, DefaultAudience defaultAudience, String str3, String str4) {
        C13956b bVar = new C13956b();
        Context context2 = context;
        return m41156a(context, m41160a((C13959e) bVar, str, collection, str2, z, z2, defaultAudience, str3, str4), (C13959e) bVar);
    }

    /* renamed from: a */
    private static Intent m41160a(C13959e eVar, String str, Collection<String> collection, String str2, boolean z, boolean z2, DefaultAudience defaultAudience, String str3, String str4) {
        String b = eVar.mo33607b();
        if (b == null) {
            return null;
        }
        Intent putExtra = new Intent().setClassName(eVar.mo33606a(), b).putExtra("client_id", str);
        putExtra.putExtra("facebook_sdk_version", C13499h.m39723i());
        if (!C13967z.m41250a(collection)) {
            putExtra.putExtra("scope", TextUtils.join(",", collection));
        }
        if (!C13967z.m41249a(str2)) {
            putExtra.putExtra("e2e", str2);
        }
        putExtra.putExtra("state", str3);
        putExtra.putExtra("response_type", "token,signed_request");
        putExtra.putExtra("return_scopes", "true");
        if (z2) {
            putExtra.putExtra("default_audience", defaultAudience.getNativeProtocolAudience());
        }
        putExtra.putExtra("legacy_override", C13499h.m39722h());
        putExtra.putExtra("auth_type", str4);
        return putExtra;
    }
}
