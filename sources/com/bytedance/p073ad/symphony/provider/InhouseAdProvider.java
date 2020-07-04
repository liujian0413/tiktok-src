package com.bytedance.p073ad.symphony.provider;

import android.content.Context;
import com.bytedance.p073ad.symphony.p074a.p075a.C2087d;
import com.bytedance.p073ad.symphony.p074a.p075a.C2090f;
import com.bytedance.p073ad.symphony.p076b.C2113d;
import com.bytedance.p073ad.symphony.p081e.p082a.C2142a;
import com.bytedance.p073ad.symphony.p081e.p082a.C2143b;
import com.bytedance.p073ad.symphony.p084g.C2157b.C2158a;
import com.bytedance.p073ad.symphony.p085h.C2159a;

/* renamed from: com.bytedance.ad.symphony.provider.InhouseAdProvider */
public class InhouseAdProvider extends AbsNativeAdProvider {
    private static C2090f sInhouseAdPlaceholder = new C2090f();

    /* access modifiers changed from: protected */
    public String getTag() {
        return "InhouseAdProvider";
    }

    public boolean hasValidAd(String str) {
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean needPreload(String str) {
        return true;
    }

    public C2087d getNextAd(String str) {
        return sInhouseAdPlaceholder;
    }

    public InhouseAdProvider(Context context, C2142a aVar, C2113d dVar) {
        super(context, aVar, dVar);
    }

    /* access modifiers changed from: protected */
    public void loadAdAsync(String str, C2143b bVar, C2159a aVar, final C2158a aVar2) {
        runOnAdThread(new Runnable() {
            public final void run() {
                if (aVar2 != null) {
                    aVar2.mo7839a("", "Fake Inhouse Failed");
                }
            }
        });
    }
}
