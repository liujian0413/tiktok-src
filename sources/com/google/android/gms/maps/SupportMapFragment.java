package com.google.android.gms.maps;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode.ThreadPolicy.Builder;
import android.support.p022v4.app.Fragment;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.dynamic.C15343a;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.dynamic.C15349d;
import com.google.android.gms.dynamic.C15350e;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.p764a.C16724c;
import com.google.android.gms.maps.p764a.C16728g;
import com.google.android.gms.maps.p764a.C16735n;
import com.google.android.gms.maps.p764a.C16744w;
import com.google.android.gms.maps.p764a.C16745x;
import java.util.ArrayList;
import java.util.List;

public class SupportMapFragment extends Fragment {

    /* renamed from: a */
    private final C16713b f46727a = new C16713b(this);

    /* renamed from: com.google.android.gms.maps.SupportMapFragment$a */
    static class C16712a implements C16728g {

        /* renamed from: a */
        private final Fragment f46728a;

        /* renamed from: b */
        private final C16724c f46729b;

        public C16712a(Fragment fragment, C16724c cVar) {
            this.f46729b = (C16724c) C15267r.m44384a(cVar);
            this.f46728a = (Fragment) C15267r.m44384a(fragment);
        }

        /* renamed from: a */
        public final View mo38705a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            try {
                Bundle bundle2 = new Bundle();
                C16744w.m55235a(bundle, bundle2);
                C15345b a = this.f46729b.mo43320a(C15349d.m44668a(layoutInflater), C15349d.m44668a(viewGroup), bundle2);
                C16744w.m55235a(bundle2, bundle);
                return (View) C15349d.m44669a(a);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: a */
        public final void mo38706a() {
            try {
                this.f46729b.mo43329f();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: a */
        public final void mo38707a(Activity activity, Bundle bundle, Bundle bundle2) {
            GoogleMapOptions googleMapOptions = (GoogleMapOptions) bundle.getParcelable("MapOptions");
            try {
                Bundle bundle3 = new Bundle();
                C16744w.m55235a(bundle2, bundle3);
                this.f46729b.mo43322a(C15349d.m44668a(activity), googleMapOptions, bundle3);
                C16744w.m55235a(bundle3, bundle2);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: a */
        public final void mo38708a(Bundle bundle) {
            try {
                Bundle bundle2 = new Bundle();
                C16744w.m55235a(bundle, bundle2);
                Bundle arguments = this.f46728a.getArguments();
                if (arguments != null && arguments.containsKey("MapOptions")) {
                    C16744w.m55236a(bundle2, "MapOptions", arguments.getParcelable("MapOptions"));
                }
                this.f46729b.mo43321a(bundle2);
                C16744w.m55235a(bundle2, bundle);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: a */
        public final void mo43305a(C16758f fVar) {
            try {
                this.f46729b.mo43323a((C16735n) new C16764l(this, fVar));
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: b */
        public final void mo38709b() {
            try {
                this.f46729b.mo43319M_();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: b */
        public final void mo38710b(Bundle bundle) {
            try {
                Bundle bundle2 = new Bundle();
                C16744w.m55235a(bundle, bundle2);
                this.f46729b.mo43325b(bundle2);
                C16744w.m55235a(bundle2, bundle);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: c */
        public final void mo38711c() {
            try {
                this.f46729b.mo43324b();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: d */
        public final void mo38712d() {
            try {
                this.f46729b.mo43330g();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: e */
        public final void mo38713e() {
            try {
                this.f46729b.mo43326c();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: f */
        public final void mo38714f() {
            try {
                this.f46729b.mo43327d();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: g */
        public final void mo38715g() {
            try {
                this.f46729b.mo43328e();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    /* renamed from: com.google.android.gms.maps.SupportMapFragment$b */
    static class C16713b extends C15343a<C16712a> {

        /* renamed from: b */
        private final Fragment f46730b;

        /* renamed from: c */
        private C15350e<C16712a> f46731c;

        /* renamed from: d */
        private Activity f46732d;

        /* renamed from: e */
        private final List<C16758f> f46733e = new ArrayList();

        C16713b(Fragment fragment) {
            this.f46730b = fragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m55111a(Activity activity) {
            this.f46732d = activity;
            m55113h();
        }

        /* renamed from: h */
        private final void m55113h() {
            if (!(this.f46732d == null || this.f46731c == null || this.f39626a != null)) {
                try {
                    C16757e.m55294a(this.f46732d);
                    C16724c a = C16745x.m55237a((Context) this.f46732d).mo43359a(C15349d.m44668a(this.f46732d));
                    if (a != null) {
                        this.f46731c.mo38716a(new C16712a(this.f46730b, a));
                        for (C16758f a2 : this.f46733e) {
                            ((C16712a) this.f39626a).mo43305a(a2);
                        }
                        this.f46733e.clear();
                    }
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                } catch (GooglePlayServicesNotAvailableException unused) {
                }
            }
        }

        /* renamed from: a */
        public final void mo38695a(C15350e<C16712a> eVar) {
            this.f46731c = eVar;
            m55113h();
        }
    }

    public void onActivityCreated(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(SupportMapFragment.class.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f46727a.m55111a(activity);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f46727a.mo38694a(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = this.f46727a.mo38691a(layoutInflater, viewGroup, bundle);
        a.setClickable(true);
        return a;
    }

    public void onDestroy() {
        this.f46727a.mo38701f();
        super.onDestroy();
    }

    public void onDestroyView() {
        this.f46727a.mo38700e();
        super.onDestroyView();
    }

    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new Builder(threadPolicy).permitAll().build());
        try {
            super.onInflate(activity, attributeSet, bundle);
            this.f46727a.m55111a(activity);
            GoogleMapOptions a = GoogleMapOptions.m55082a(activity, attributeSet);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("MapOptions", a);
            this.f46727a.mo38693a(activity, bundle2, bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void onLowMemory() {
        this.f46727a.mo38702g();
        super.onLowMemory();
    }

    public void onPause() {
        this.f46727a.mo38698c();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.f46727a.mo38696b();
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(SupportMapFragment.class.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        this.f46727a.mo38697b(bundle);
    }

    public void onStart() {
        super.onStart();
        this.f46727a.mo38692a();
    }

    public void onStop() {
        this.f46727a.mo38699d();
        super.onStop();
    }

    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }
}
