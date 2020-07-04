package android.support.customtabs;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.support.p022v4.app.C0603f;
import android.support.p022v4.content.C0683b;
import java.util.ArrayList;

/* renamed from: android.support.customtabs.c */
public final class C0219c {

    /* renamed from: a */
    public final Intent f855a;

    /* renamed from: b */
    public final Bundle f856b;

    /* renamed from: android.support.customtabs.c$a */
    public static final class C0220a {

        /* renamed from: a */
        private final Intent f857a;

        /* renamed from: b */
        private ArrayList<Bundle> f858b;

        /* renamed from: c */
        private Bundle f859c;

        /* renamed from: d */
        private ArrayList<Bundle> f860d;

        /* renamed from: e */
        private boolean f861e;

        public C0220a() {
            this(null);
        }

        /* renamed from: a */
        public final C0219c mo648a() {
            if (this.f858b != null) {
                this.f857a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", this.f858b);
            }
            if (this.f860d != null) {
                this.f857a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", this.f860d);
            }
            this.f857a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f861e);
            return new C0219c(this.f857a, this.f859c);
        }

        /* renamed from: a */
        public final C0220a mo647a(int i) {
            this.f857a.putExtra("android.support.customtabs.extra.TOOLBAR_COLOR", i);
            return this;
        }

        public C0220a(C0223e eVar) {
            this.f857a = new Intent("android.intent.action.VIEW");
            IBinder iBinder = null;
            this.f858b = null;
            this.f859c = null;
            this.f860d = null;
            this.f861e = true;
            if (eVar != null) {
                this.f857a.setPackage(eVar.f863a.getPackageName());
            }
            Bundle bundle = new Bundle();
            String str = "android.support.customtabs.extra.SESSION";
            if (eVar != null) {
                iBinder = eVar.mo651a();
            }
            C0603f.m2530a(bundle, str, iBinder);
            this.f857a.putExtras(bundle);
        }
    }

    C0219c(Intent intent, Bundle bundle) {
        this.f855a = intent;
        this.f856b = bundle;
    }

    /* renamed from: a */
    public final void mo646a(Context context, Uri uri) {
        this.f855a.setData(uri);
        C0683b.m2905a(context, this.f855a, this.f856b);
    }
}
