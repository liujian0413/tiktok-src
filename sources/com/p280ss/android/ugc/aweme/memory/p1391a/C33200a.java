package com.p280ss.android.ugc.aweme.memory.p1391a;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.example.leakinterface.C13074c;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.antiaddic.lock.api.C22592a;
import com.p280ss.android.ugc.aweme.memory.api.CIBuildApi;
import com.p280ss.android.ugc.aweme.memory.api.CIBuildResponse;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.C7581n;
import kotlin.coroutines.C47919b;
import kotlin.coroutines.intrinsics.C47948a;
import kotlin.coroutines.jvm.internal.C7540d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7563m;
import kotlin.text.C7634n;
import kotlinx.coroutines.C48056ad;
import kotlinx.coroutines.C48080as;
import kotlinx.coroutines.C48093bb;

/* renamed from: com.ss.android.ugc.aweme.memory.a.a */
public final class C33200a {

    /* renamed from: a */
    public static final C33200a f86388a = new C33200a();

    /* renamed from: b */
    private static final Pattern f86389b = Pattern.compile("(https|http)://.+?/job/(.+?/.+?)/");

    /* renamed from: c */
    private static String f86390c = m107103d();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final Keva f86391d = Keva.getRepo("repo_mapping_url");

    /* renamed from: e */
    private static volatile String f86392e = "";

    @C7540d(mo19421b = "MappingUrlManager.kt", mo19422c = {63}, mo19423d = "invokeSuspend", mo19424e = "com.ss.android.ugc.aweme.memory.automap.MappingUrlManager$startFindMappingUrl$1")
    /* renamed from: com.ss.android.ugc.aweme.memory.a.a$a */
    static final class C33201a extends SuspendLambda implements C7563m<C48056ad, C47919b<? super C7581n>, Object> {

        /* renamed from: a */
        Object f86393a;

        /* renamed from: b */
        int f86394b;

        /* renamed from: c */
        final /* synthetic */ String f86395c;

        /* renamed from: d */
        private C48056ad f86396d;

        C33201a(String str, C47919b bVar) {
            this.f86395c = str;
            super(2, bVar);
        }

        public final C47919b<C7581n> create(Object obj, C47919b<?> bVar) {
            C7573i.m23587b(bVar, "completion");
            C33201a aVar = new C33201a(this.f86395c, bVar);
            aVar.f86396d = (C48056ad) obj;
            return aVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C33201a) create(obj, (C47919b) obj2)).invokeSuspend(C7581n.f20898a);
        }

        public final Object invokeSuspend(Object obj) {
            Object a = C47948a.m148881a();
            switch (this.f86394b) {
                case 0:
                    C48056ad adVar = this.f86396d;
                    try {
                        C18253l a2 = CIBuildApi.m107105a(this.f86395c);
                        this.f86393a = adVar;
                        this.f86394b = 1;
                        obj = C22592a.m74662a(a2, this);
                        if (obj == a) {
                            return a;
                        }
                    } catch (Throwable unused) {
                        break;
                    }
                case 1:
                    C33200a.m107101a(((CIBuildResponse) obj).getMappingUrl());
                    C33200a.f86391d.storeString("mapping_url", C33200a.m107100a());
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C7581n.f20898a;
        }
    }

    private C33200a() {
    }

    /* renamed from: a */
    public static String m107100a() {
        return f86392e;
    }

    /* renamed from: c */
    private static String m107102c() {
        Matcher matcher = f86389b.matcher(f86390c);
        if (matcher.find()) {
            return matcher.group(2);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003d A[SYNTHETIC, Splitter:B:16:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0045 A[SYNTHETIC, Splitter:B:23:0x0045] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m107103d() {
        /*
            r0 = 0
            android.content.Context r1 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()     // Catch:{ Throwable -> 0x0041, all -> 0x0037 }
            android.content.res.AssetManager r1 = r1.getAssets()     // Catch:{ Throwable -> 0x0041, all -> 0x0037 }
            java.lang.String r2 = "assets-map/aweme.json"
            java.io.InputStream r1 = r1.open(r2)     // Catch:{ Throwable -> 0x0041, all -> 0x0037 }
            int r0 = r1.available()     // Catch:{ Throwable -> 0x0035, all -> 0x0033 }
            byte[] r0 = new byte[r0]     // Catch:{ Throwable -> 0x0035, all -> 0x0033 }
            r1.read(r0)     // Catch:{ Throwable -> 0x0035, all -> 0x0033 }
            r1.close()     // Catch:{ Throwable -> 0x0035, all -> 0x0033 }
            java.lang.String r2 = new java.lang.String     // Catch:{ Throwable -> 0x0035, all -> 0x0033 }
            java.nio.charset.Charset r3 = kotlin.text.C48038d.f122880a     // Catch:{ Throwable -> 0x0035, all -> 0x0033 }
            r2.<init>(r0, r3)     // Catch:{ Throwable -> 0x0035, all -> 0x0033 }
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0035, all -> 0x0033 }
            r0.<init>(r2)     // Catch:{ Throwable -> 0x0035, all -> 0x0033 }
            java.lang.String r2 = "aweme_build_version"
            java.lang.String r0 = r0.optString(r2)     // Catch:{ Throwable -> 0x0035, all -> 0x0033 }
            if (r1 == 0) goto L_0x0032
            r1.close()     // Catch:{ IOException -> 0x0032 }
        L_0x0032:
            return r0
        L_0x0033:
            r0 = move-exception
            goto L_0x003b
        L_0x0035:
            r0 = r1
            goto L_0x0041
        L_0x0037:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L_0x003b:
            if (r1 == 0) goto L_0x0040
            r1.close()     // Catch:{ IOException -> 0x0040 }
        L_0x0040:
            throw r0
        L_0x0041:
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0048
            r0.close()     // Catch:{ IOException -> 0x0048 }
        L_0x0048:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.memory.p1391a.C33200a.m107103d():java.lang.String");
    }

    /* renamed from: b */
    public final void mo84955b() {
        if (C13074c.m38221a() && TextUtils.isEmpty(f86392e) && !TextUtils.isEmpty(f86390c)) {
            String c = m107102c();
            if (c != null) {
                String string = f86391d.getString("mapping_url", "");
                C7573i.m23582a((Object) string, "keva.getString(KEY_MAPPING_URL, \"\")");
                f86392e = string;
                if (TextUtils.isEmpty(string) || !C7634n.m23776c((CharSequence) f86392e, (CharSequence) c, false)) {
                    f86392e = "";
                    C48145g.m149385a(C48093bb.f122957a, C48080as.m149071a(), null, new C33201a(c, null), 2, null);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m107101a(String str) {
        C7573i.m23587b(str, "<set-?>");
        f86392e = str;
    }
}
