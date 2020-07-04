package com.bytedance.p073ad.symphony.provider;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.p073ad.symphony.p074a.C2092b;
import com.bytedance.p073ad.symphony.p074a.p075a.C2087d;
import com.bytedance.p073ad.symphony.p076b.C2095a;
import com.bytedance.p073ad.symphony.p081e.p082a.C2142a;
import com.bytedance.p073ad.symphony.p081e.p082a.C2143b;
import com.bytedance.p073ad.symphony.p084g.C2157b.C2158a;
import com.bytedance.p073ad.symphony.p085h.C2159a;
import com.bytedance.p073ad.symphony.util.C2199b;
import com.bytedance.p073ad.symphony.util.C2205h;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.ad.symphony.provider.a */
public abstract class C2192a<AD extends C2092b, AM extends C2095a<? extends AD>> implements C2195b<AD> {
    public C2142a mAdConfig;
    protected AM mAdManager;
    public Map<String, AD> mAdPool = new ConcurrentHashMap();
    public Context mContext;
    protected Handler mHandler = new Handler(C2199b.m9506b());
    public Map<String, Runnable> mRunnableMap = new ConcurrentHashMap();

    /* renamed from: com.bytedance.ad.symphony.provider.a$a */
    public static class C2194a {

        /* renamed from: a */
        public int f7435a;

        /* renamed from: b */
        public String f7436b;

        /* renamed from: c */
        public String f7437c;

        public C2194a(int i, String str, String str2) {
            this.f7435a = i;
            this.f7436b = str;
            this.f7437c = str2;
        }
    }

    public static boolean isInvalidAdProvider(int i) {
        return i == -1;
    }

    /* access modifiers changed from: protected */
    public abstract String getTag();

    /* access modifiers changed from: protected */
    public abstract void loadAdAsync(String str, C2143b bVar, C2159a aVar, C2158a aVar2);

    /* access modifiers changed from: protected */
    public void onAdFill(AD ad) {
    }

    public int getProviderId() {
        if (this.mAdConfig == null) {
            return 0;
        }
        return this.mAdConfig.f7276a;
    }

    public String toString() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(getTag());
            sb.append(":");
            sb.append(this.mAdPool);
            return sb.toString();
        } catch (Exception unused) {
            getTag();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getTag());
            sb2.append(":error");
            return sb2.toString();
        }
    }

    public static int getRealProviderId(int i) {
        return i / 1000;
    }

    public void setAdConfig(C2142a aVar) {
        if (aVar != null) {
            this.mAdConfig = aVar;
        }
    }

    public String getPlacementId(String str) {
        C2143b a = this.mAdConfig.mo7824a(str);
        if (a == null) {
            return null;
        }
        return a.f7284a;
    }

    /* access modifiers changed from: protected */
    public boolean needPreload(String str) {
        C2205h.m9518a();
        if (!hasValidAd(str)) {
            return true;
        }
        return false;
    }

    public void cancelTimeoutCheck(String str) {
        Runnable runnable = (Runnable) this.mRunnableMap.get(str);
        if (runnable != null) {
            this.mHandler.removeCallbacks(runnable);
            this.mRunnableMap.remove(runnable);
        }
    }

    public AD getNextAd(String str) {
        AD ad = (C2092b) this.mAdPool.get(str);
        if (ad != null) {
            this.mAdPool.remove(str);
            if (!ad.mo7750a()) {
                onAdFill(ad);
                return ad;
            }
        }
        return null;
    }

    public AD getNextAdWithoutFill(String str) {
        AD ad = (C2092b) this.mAdPool.get(str);
        if (ad == null || ad.mo7750a()) {
            return null;
        }
        return ad;
    }

    public boolean hasValidAd(String str) {
        C2092b bVar = (C2092b) this.mAdPool.get(str);
        if (bVar == null || bVar.mo7750a()) {
            return false;
        }
        return true;
    }

    public void runOnAdThread(Runnable runnable) {
        if (Looper.myLooper() == C2199b.m9506b()) {
            runnable.run();
        } else {
            this.mHandler.post(runnable);
        }
    }

    /* access modifiers changed from: protected */
    public void printAdMap(List<C2087d> list) {
        int i = 0;
        for (C2087d dVar : list) {
            getTag();
            StringBuilder sb = new StringBuilder("list[");
            int i2 = i + 1;
            sb.append(i);
            sb.append("]:");
            sb.append(dVar);
            i = i2;
        }
    }

    public void addToPool(String str, AD ad) {
        C2205h.m9518a();
        if (ad != null) {
            this.mAdPool.put(str, ad);
        }
    }

    /* access modifiers changed from: protected */
    public void startTimeoutCheck(final String str, final C2158a aVar) {
        C21931 r0 = new Runnable() {
            public final void run() {
                if (aVar != null) {
                    C2205h.m9518a();
                    C2192a.this.getTag();
                    String str = "";
                    C2143b a = C2192a.this.mAdConfig.mo7824a(str);
                    if (a != null) {
                        str = a.f7284a;
                    }
                    aVar.mo7839a(str, "Request Timeout");
                    C2192a.this.mRunnableMap.remove(str);
                }
            }
        };
        this.mRunnableMap.put(str, r0);
        long j = this.mAdConfig.f7278c;
        if (j <= 0) {
            j = 3000;
        }
        this.mHandler.postDelayed(r0, j);
    }

    public C2192a(Context context, C2142a aVar, AM am) {
        this.mContext = context;
        this.mAdConfig = aVar;
        this.mAdManager = am;
    }

    public void tryPreloadAd(String str, C2159a aVar, C2158a aVar2) {
        getTag();
        new StringBuilder("config:").append(this.mAdConfig.toString());
        if (this.mAdConfig == null) {
            getTag();
            new StringBuilder("tryPreloadAdAsync, config is not valid, type:").append(str);
            if (aVar2 != null) {
                aVar2.mo7839a(null, "Config Invalid");
            }
        } else if (!needPreload(str)) {
            getTag();
            StringBuilder sb = new StringBuilder("tryPreloadAdAsync, type-->");
            sb.append(str);
            sb.append(", needPreload false");
            if (aVar2 != null) {
                aVar2.mo7845d(str);
            }
        } else {
            C2143b a = this.mAdConfig.mo7824a(str);
            if (a == null || !a.mo7826a()) {
                getTag();
                new StringBuilder("tryPreloadAdAsync, placementId invalid, type-->").append(str);
                if (aVar2 != null) {
                    aVar2.mo7839a(null, "Placement Invalid");
                }
                return;
            }
            getTag();
            StringBuilder sb2 = new StringBuilder("loadAdAsync start,placement type:");
            sb2.append(str);
            sb2.append(",placement config:");
            sb2.append(a.toString());
            loadAdAsync(str, a, aVar, aVar2);
        }
    }
}
