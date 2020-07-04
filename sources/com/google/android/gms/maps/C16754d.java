package com.google.android.gms.maps;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode.ThreadPolicy.Builder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.dynamic.C15343a;
import com.google.android.gms.dynamic.C15349d;
import com.google.android.gms.dynamic.C15350e;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.p764a.C16725d;
import com.google.android.gms.maps.p764a.C16728g;
import com.google.android.gms.maps.p764a.C16735n;
import com.google.android.gms.maps.p764a.C16744w;
import com.google.android.gms.maps.p764a.C16745x;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.maps.d */
public final class C16754d extends FrameLayout {

    /* renamed from: a */
    private final C16756b f46747a;

    /* renamed from: com.google.android.gms.maps.d$a */
    static class C16755a implements C16728g {

        /* renamed from: a */
        private final ViewGroup f46748a;

        /* renamed from: b */
        private final C16725d f46749b;

        /* renamed from: c */
        private View f46750c;

        public C16755a(ViewGroup viewGroup, C16725d dVar) {
            this.f46749b = (C16725d) C15267r.m44384a(dVar);
            this.f46748a = (ViewGroup) C15267r.m44384a(viewGroup);
        }

        /* renamed from: a */
        public final View mo38705a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            throw new UnsupportedOperationException("onCreateView not allowed on MapViewDelegate");
        }

        /* renamed from: a */
        public final void mo38706a() {
            try {
                this.f46749b.mo43339f();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: a */
        public final void mo38707a(Activity activity, Bundle bundle, Bundle bundle2) {
            throw new UnsupportedOperationException("onInflate not allowed on MapViewDelegate");
        }

        /* renamed from: a */
        public final void mo38708a(Bundle bundle) {
            try {
                Bundle bundle2 = new Bundle();
                C16744w.m55235a(bundle, bundle2);
                this.f46749b.mo43332a(bundle2);
                C16744w.m55235a(bundle2, bundle);
                this.f46750c = (View) C15349d.m44669a(this.f46749b.mo43338e());
                this.f46748a.removeAllViews();
                this.f46748a.addView(this.f46750c);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: a */
        public final void mo43385a(C16758f fVar) {
            try {
                this.f46749b.mo43333a((C16735n) new C16762j(this, fVar));
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: b */
        public final void mo38709b() {
            try {
                this.f46749b.mo43331N_();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: b */
        public final void mo38710b(Bundle bundle) {
            try {
                Bundle bundle2 = new Bundle();
                C16744w.m55235a(bundle, bundle2);
                this.f46749b.mo43335b(bundle2);
                C16744w.m55235a(bundle2, bundle);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: c */
        public final void mo38711c() {
            try {
                this.f46749b.mo43334b();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: d */
        public final void mo38712d() {
            try {
                this.f46749b.mo43340g();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: e */
        public final void mo38713e() {
            throw new UnsupportedOperationException("onDestroyView not allowed on MapViewDelegate");
        }

        /* renamed from: f */
        public final void mo38714f() {
            try {
                this.f46749b.mo43336c();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: g */
        public final void mo38715g() {
            try {
                this.f46749b.mo43337d();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    /* renamed from: com.google.android.gms.maps.d$b */
    static class C16756b extends C15343a<C16755a> {

        /* renamed from: b */
        private final ViewGroup f46751b;

        /* renamed from: c */
        private final Context f46752c;

        /* renamed from: d */
        private C15350e<C16755a> f46753d;

        /* renamed from: e */
        private final GoogleMapOptions f46754e;

        /* renamed from: f */
        private final List<C16758f> f46755f = new ArrayList();

        C16756b(ViewGroup viewGroup, Context context, GoogleMapOptions googleMapOptions) {
            this.f46751b = viewGroup;
            this.f46752c = context;
            this.f46754e = null;
        }

        /* renamed from: a */
        public final void mo38695a(C15350e<C16755a> eVar) {
            this.f46753d = eVar;
            if (this.f46753d != null && this.f39626a == null) {
                try {
                    C16757e.m55294a(this.f46752c);
                    C16725d a = C16745x.m55237a(this.f46752c).mo43360a(C15349d.m44668a(this.f46752c), this.f46754e);
                    if (a != null) {
                        this.f46753d.mo38716a(new C16755a(this.f46751b, a));
                        for (C16758f a2 : this.f46755f) {
                            ((C16755a) this.f39626a).mo43385a(a2);
                        }
                        this.f46755f.clear();
                    }
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                } catch (GooglePlayServicesNotAvailableException unused) {
                }
            }
        }

        /* renamed from: a */
        public final void mo43386a(C16758f fVar) {
            if (this.f39626a != null) {
                ((C16755a) this.f39626a).mo43385a(fVar);
            } else {
                this.f46755f.add(fVar);
            }
        }
    }

    public C16754d(Context context) {
        super(context);
        this.f46747a = new C16756b(this, context, null);
        setClickable(true);
    }

    /* renamed from: a */
    public final void mo43376a() {
        this.f46747a.mo38696b();
    }

    /* renamed from: a */
    public final void mo43377a(Bundle bundle) {
        ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new Builder(threadPolicy).permitAll().build());
        try {
            this.f46747a.mo38694a(bundle);
            if (this.f46747a.f39626a == null) {
                C15343a.m44639a((FrameLayout) this);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* renamed from: a */
    public final void mo43378a(C16758f fVar) {
        C15267r.m44393b("getMapAsync() must be called on the main thread");
        this.f46747a.mo43386a(fVar);
    }

    /* renamed from: b */
    public final void mo43379b() {
        this.f46747a.mo38698c();
    }

    /* renamed from: b */
    public final void mo43380b(Bundle bundle) {
        this.f46747a.mo38697b(bundle);
    }

    /* renamed from: c */
    public final void mo43381c() {
        this.f46747a.mo38692a();
    }

    /* renamed from: d */
    public final void mo43382d() {
        this.f46747a.mo38699d();
    }

    /* renamed from: e */
    public final void mo43383e() {
        this.f46747a.mo38701f();
    }

    /* renamed from: f */
    public final void mo43384f() {
        this.f46747a.mo38702g();
    }
}
