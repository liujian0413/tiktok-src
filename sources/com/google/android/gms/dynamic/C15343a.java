package com.google.android.gms.dynamic;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.internal.C15247f;
import com.google.android.gms.dynamic.C15348c;
import java.util.LinkedList;

/* renamed from: com.google.android.gms.dynamic.a */
public abstract class C15343a<T extends C15348c> {

    /* renamed from: a */
    public T f39626a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Bundle f39627b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public LinkedList<C15344a> f39628c;

    /* renamed from: d */
    private final C15350e<T> f39629d = new C15351f(this);

    /* renamed from: com.google.android.gms.dynamic.a$a */
    interface C15344a {
        /* renamed from: a */
        int mo38703a();

        /* renamed from: a */
        void mo38704a(C15348c cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo38695a(C15350e<T> eVar);

    /* renamed from: a */
    private final void m44637a(int i) {
        while (!this.f39628c.isEmpty() && ((C15344a) this.f39628c.getLast()).mo38703a() >= i) {
            this.f39628c.removeLast();
        }
    }

    /* renamed from: a */
    private final void m44638a(Bundle bundle, C15344a aVar) {
        if (this.f39626a != null) {
            aVar.mo38704a(this.f39626a);
            return;
        }
        if (this.f39628c == null) {
            this.f39628c = new LinkedList<>();
        }
        this.f39628c.add(aVar);
        if (bundle != null) {
            if (this.f39627b == null) {
                this.f39627b = (Bundle) bundle.clone();
            } else {
                this.f39627b.putAll(bundle);
            }
        }
        mo38695a(this.f39629d);
    }

    /* renamed from: a */
    public final void mo38693a(Activity activity, Bundle bundle, Bundle bundle2) {
        m44638a(bundle2, (C15344a) new C15352g(this, activity, bundle, bundle2));
    }

    /* renamed from: a */
    public final void mo38694a(Bundle bundle) {
        m44638a(bundle, (C15344a) new C15353h(this, bundle));
    }

    /* renamed from: a */
    public final View mo38691a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        C15354i iVar = new C15354i(this, frameLayout, layoutInflater, viewGroup, bundle);
        m44638a(bundle, (C15344a) iVar);
        if (this.f39626a == null) {
            m44641b(frameLayout);
        }
        return frameLayout;
    }

    /* renamed from: b */
    private static void m44641b(FrameLayout frameLayout) {
        m44639a(frameLayout);
    }

    /* renamed from: a */
    public static void m44639a(FrameLayout frameLayout) {
        GoogleApiAvailability instance = GoogleApiAvailability.getInstance();
        Context context = frameLayout.getContext();
        int isGooglePlayServicesAvailable = instance.isGooglePlayServicesAvailable(context);
        String c = C15247f.m44340c(context, isGooglePlayServicesAvailable);
        String e = C15247f.m44342e(context, isGooglePlayServicesAvailable);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new LayoutParams(-2, -2));
        textView.setText(c);
        linearLayout.addView(textView);
        Intent errorResolutionIntent = instance.getErrorResolutionIntent(context, isGooglePlayServicesAvailable, null);
        if (errorResolutionIntent != null) {
            Button button = new Button(context);
            button.setId(16908313);
            button.setLayoutParams(new LayoutParams(-2, -2));
            button.setText(e);
            linearLayout.addView(button);
            button.setOnClickListener(new C15355j(context, errorResolutionIntent));
        }
    }

    /* renamed from: a */
    public final void mo38692a() {
        m44638a((Bundle) null, (C15344a) new C15356k(this));
    }

    /* renamed from: b */
    public final void mo38696b() {
        m44638a((Bundle) null, (C15344a) new C15357l(this));
    }

    /* renamed from: c */
    public final void mo38698c() {
        if (this.f39626a != null) {
            this.f39626a.mo38711c();
        } else {
            m44637a(5);
        }
    }

    /* renamed from: d */
    public final void mo38699d() {
        if (this.f39626a != null) {
            this.f39626a.mo38712d();
        } else {
            m44637a(4);
        }
    }

    /* renamed from: e */
    public final void mo38700e() {
        if (this.f39626a != null) {
            this.f39626a.mo38713e();
        } else {
            m44637a(2);
        }
    }

    /* renamed from: f */
    public final void mo38701f() {
        if (this.f39626a != null) {
            this.f39626a.mo38714f();
        } else {
            m44637a(1);
        }
    }

    /* renamed from: b */
    public final void mo38697b(Bundle bundle) {
        if (this.f39626a != null) {
            this.f39626a.mo38710b(bundle);
            return;
        }
        if (this.f39627b != null) {
            bundle.putAll(this.f39627b);
        }
    }

    /* renamed from: g */
    public final void mo38702g() {
        if (this.f39626a != null) {
            this.f39626a.mo38715g();
        }
    }
}
