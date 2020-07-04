package com.google.android.gms.ads.mediation;

import android.os.Bundle;

/* renamed from: com.google.android.gms.ads.mediation.b */
public interface C14883b {

    /* renamed from: com.google.android.gms.ads.mediation.b$a */
    public static class C14884a {

        /* renamed from: a */
        private int f38519a;

        /* renamed from: a */
        public final C14884a mo37907a(int i) {
            this.f38519a = 1;
            return this;
        }

        /* renamed from: a */
        public final Bundle mo37906a() {
            Bundle bundle = new Bundle();
            bundle.putInt("capabilities", this.f38519a);
            return bundle;
        }
    }

    void onDestroy();

    void onPause();

    void onResume();
}
