package android.support.p022v4.app;

import android.app.Person;
import android.app.Person.Builder;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.support.p022v4.graphics.drawable.IconCompat;

/* renamed from: android.support.v4.app.ac */
public final class C0588ac {

    /* renamed from: a */
    public CharSequence f2337a;

    /* renamed from: b */
    public IconCompat f2338b;

    /* renamed from: c */
    public String f2339c;

    /* renamed from: d */
    public String f2340d;

    /* renamed from: e */
    public boolean f2341e;

    /* renamed from: f */
    public boolean f2342f;

    /* renamed from: android.support.v4.app.ac$a */
    public static class C0589a {

        /* renamed from: a */
        CharSequence f2343a;

        /* renamed from: b */
        IconCompat f2344b;

        /* renamed from: c */
        String f2345c;

        /* renamed from: d */
        String f2346d;

        /* renamed from: e */
        boolean f2347e;

        /* renamed from: f */
        boolean f2348f;

        /* renamed from: a */
        public final C0588ac mo2574a() {
            return new C0588ac(this);
        }

        /* renamed from: a */
        public final C0589a mo2573a(CharSequence charSequence) {
            this.f2343a = charSequence;
            return this;
        }
    }

    /* renamed from: a */
    public final Bundle mo2571a() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("name", this.f2337a);
        String str = "icon";
        if (this.f2338b != null) {
            bundle = this.f2338b.mo2886b();
        } else {
            bundle = null;
        }
        bundle2.putBundle(str, bundle);
        bundle2.putString("uri", this.f2339c);
        bundle2.putString("key", this.f2340d);
        bundle2.putBoolean("isBot", this.f2341e);
        bundle2.putBoolean("isImportant", this.f2342f);
        return bundle2;
    }

    /* renamed from: b */
    public final Person mo2572b() {
        Icon icon;
        Builder name = new Builder().setName(this.f2337a);
        if (this.f2338b != null) {
            icon = this.f2338b.mo2884a();
        } else {
            icon = null;
        }
        return name.setIcon(icon).setUri(this.f2339c).setKey(this.f2340d).setBot(this.f2341e).setImportant(this.f2342f).build();
    }

    C0588ac(C0589a aVar) {
        this.f2337a = aVar.f2343a;
        this.f2338b = aVar.f2344b;
        this.f2339c = aVar.f2345c;
        this.f2340d = aVar.f2346d;
        this.f2341e = aVar.f2347e;
        this.f2342f = aVar.f2348f;
    }
}
