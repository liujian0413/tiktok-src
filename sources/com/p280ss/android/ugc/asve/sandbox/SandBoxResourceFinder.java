package com.p280ss.android.ugc.asve.sandbox;

import android.content.res.AssetManager;
import android.text.TextUtils;
import com.bef.effectsdk.AssetResourceFinder;
import com.bef.effectsdk.C1942b;
import com.bytedance.p255e.C6326a;
import com.p280ss.android.ugc.asve.C15395c;
import com.p280ss.android.ugc.asve.C6855a;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.sandbox.SandBoxResourceFinder */
public final class SandBoxResourceFinder implements C1942b {
    public static final C20826a Companion = new C20826a(null);
    private final AssetResourceFinder assetResourceFinder;
    private final HashSet<Long> initialledHandler;
    private final C21044m remoteFinder;
    private final HashMap<String, String> urlMap;

    /* renamed from: com.ss.android.ugc.asve.sandbox.SandBoxResourceFinder$a */
    public static final class C20826a {
        private C20826a() {
        }

        public /* synthetic */ C20826a(C7571f fVar) {
            this();
        }
    }

    public final native long createResourceFinder(long j);

    public final native String nativeGetResourceUrl(long j, long j2, String str, String str2);

    public final native void releaseResourceFinder(long j);

    static {
        C6326a.m19642a("asve", C6855a.m21308b());
    }

    public final long createNativeResourceFinder(long j) {
        this.assetResourceFinder.createNativeResourceFinder(j);
        return createResourceFinder(j);
    }

    public final void release(long j) {
        this.assetResourceFinder.release(j);
        this.remoteFinder.mo56352b(j);
        releaseResourceFinder(j);
    }

    public final void releaseLoacl(long j) {
        this.assetResourceFinder.release(j);
        releaseResourceFinder(j);
    }

    public SandBoxResourceFinder(C21044m mVar) {
        C7573i.m23587b(mVar, "remoteFinder");
        AssetManager assets = C6855a.m21308b().getAssets();
        C7573i.m23582a((Object) assets, "AS.applicationContext.assets");
        this(mVar, assets, "");
    }

    public SandBoxResourceFinder(C21044m mVar, AssetManager assetManager, String str) {
        C7573i.m23587b(mVar, "remoteFinder");
        C7573i.m23587b(assetManager, "assetManager");
        C7573i.m23587b(str, "downloadPath");
        this.remoteFinder = mVar;
        this.urlMap = new HashMap<>(16);
        this.initialledHandler = new HashSet<>(8);
        this.assetResourceFinder = new AssetResourceFinder(assetManager, str);
    }

    public final String getResourceUrl(long j, String str, String str2) {
        C7573i.m23587b(str, "dir");
        C7573i.m23587b(str2, "path");
        C15395c b = C6855a.m21306a().mo38945b();
        StringBuilder sb = new StringBuilder("getResourceUrl before:  dir:");
        sb.append(str);
        sb.append("// path ");
        sb.append(str2);
        b.mo38742c(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.valueOf(j));
        sb2.append(str);
        sb2.append(str2);
        String sb3 = sb2.toString();
        String str3 = (String) this.urlMap.get(sb3);
        if (!TextUtils.isEmpty(str3)) {
            C15395c b2 = C6855a.m21306a().mo38945b();
            StringBuilder sb4 = new StringBuilder("getResourceUrl cache: ");
            if (str3 == null) {
                C7573i.m23580a();
            }
            sb4.append(str3);
            b2.mo38742c(sb4.toString());
            return str3;
        }
        if (!this.initialledHandler.contains(Long.valueOf(j))) {
            this.remoteFinder.mo56350a(j);
            this.initialledHandler.add(Long.valueOf(j));
        }
        C6855a.m21306a().mo38945b().mo38742c("getResourceUrl invoke native function  nativePtr ");
        String a = this.remoteFinder.mo56351a(j, str, str2);
        if (a == null) {
            C6855a.m21306a().mo38945b().mo38741b("path is null ,check !!!");
            return "";
        }
        this.urlMap.put(sb3, a);
        C15395c b3 = C6855a.m21306a().mo38945b();
        StringBuilder sb5 = new StringBuilder("getResourceUrl after: ");
        sb5.append(a);
        b3.mo38742c(sb5.toString());
        return a;
    }
}
