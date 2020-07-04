package com.bytedance.android.live.wallet;

import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import com.bytedance.android.live.wallet.api.C3634i;
import com.bytedance.android.live.wallet.api.C3634i.C3640f;
import com.bytedance.android.livesdkapi.LiveActivityProxy;
import java.util.HashMap;

public class LiveBillingActivityProxy extends LiveActivityProxy {

    /* renamed from: a */
    private static C3598a f10779a;

    /* renamed from: com.bytedance.android.live.wallet.LiveBillingActivityProxy$a */
    public interface C3598a {
        /* renamed from: a */
        void mo11024a(int i, int i2, String str);
    }

    public void onCreate() {
        super.onCreate();
        HashMap hashMap = new HashMap();
        if (mo22769b() != null) {
            Bundle extras = mo22769b().getExtras();
            if (extras != null) {
                for (String str : extras.keySet()) {
                    String string = extras.getString(str);
                    if (string == null) {
                        string = "";
                    }
                    hashMap.put(str, string);
                }
            }
        }
        C3634i iVar = (C3634i) C3642b.m13238a(C3634i.class);
        if (iVar != null) {
            iVar.mo11045a(this.f25465b, "GOOGLE_PAY", hashMap, 111, new Bundle());
        }
    }

    public LiveBillingActivityProxy(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    /* renamed from: a */
    public static void m13177a(C3598a aVar) {
        f10779a = aVar;
    }

    /* renamed from: a */
    public final void mo11023a(int i, int i2, Intent intent) {
        super.mo11023a(i, i2, intent);
        if (i == 111) {
            int i3 = -1;
            if (i2 == -1 && f10779a != null) {
                int i4 = 1;
                String str = null;
                if (!(intent == null || intent.getExtras() == null)) {
                    i4 = intent.getExtras().getInt(C3640f.f10860a);
                    Bundle bundleExtra = intent.getBundleExtra(C3640f.f10861b);
                    int i5 = bundleExtra.getInt(C3640f.f10862c);
                    str = bundleExtra.getString(C3640f.f10863d);
                    i3 = i5;
                }
                f10779a.mo11024a(i4, i3, str);
            }
        }
    }
}
