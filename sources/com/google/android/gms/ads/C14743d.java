package com.google.android.gms.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.C15499ar;
import com.google.android.gms.internal.ads.C15509as;
import java.util.Date;

/* renamed from: com.google.android.gms.ads.d */
public final class C14743d {

    /* renamed from: a */
    public final C15499ar f38094a;

    /* renamed from: com.google.android.gms.ads.d$a */
    public static final class C14744a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C15509as f38095a = new C15509as();

        public C14744a() {
            this.f38095a.mo39976b("B3EEABB8EE11C2BE770B684D95219ECB");
        }

        /* renamed from: a */
        public final C14744a mo37442a(String str) {
            this.f38095a.mo39973a(str);
            return this;
        }

        /* renamed from: a */
        public final C14744a mo37441a(Class<? extends Object> cls, Bundle bundle) {
            this.f38095a.mo39972a(cls, bundle);
            if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
                this.f38095a.mo39977c("B3EEABB8EE11C2BE770B684D95219ECB");
            }
            return this;
        }

        /* renamed from: b */
        public final C14744a mo37446b(String str) {
            this.f38095a.mo39976b(str);
            return this;
        }

        /* renamed from: a */
        public final C14743d mo37445a() {
            return new C14743d(this);
        }

        /* renamed from: a */
        public final C14744a mo37443a(Date date) {
            this.f38095a.f40974a = date;
            return this;
        }

        /* renamed from: a */
        public final C14744a mo37439a(int i) {
            this.f38095a.f40976c = i;
            return this;
        }

        /* renamed from: a */
        public final C14744a mo37440a(Location location) {
            this.f38095a.f40977d = location;
            return this;
        }

        /* renamed from: a */
        public final C14744a mo37444a(boolean z) {
            this.f38095a.mo39975a(z);
            return this;
        }

        /* renamed from: b */
        public final C14744a mo37447b(boolean z) {
            this.f38095a.f40981h = z;
            return this;
        }
    }

    private C14743d(C14744a aVar) {
        this.f38094a = new C15499ar(aVar.f38095a);
    }
}
