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
import com.google.android.gms.maps.p764a.C16727f;
import com.google.android.gms.maps.p764a.C16729h;
import com.google.android.gms.maps.p764a.C16740s;
import com.google.android.gms.maps.p764a.C16744w;
import com.google.android.gms.maps.p764a.C16745x;
import java.util.ArrayList;
import java.util.List;

public class SupportStreetViewPanoramaFragment extends Fragment {

    /* renamed from: a */
    private final C16715b f46734a = new C16715b(this);

    /* renamed from: com.google.android.gms.maps.SupportStreetViewPanoramaFragment$a */
    static class C16714a implements C16729h {

        /* renamed from: a */
        private final Fragment f46735a;

        /* renamed from: b */
        private final C16727f f46736b;

        public C16714a(Fragment fragment, C16727f fVar) {
            this.f46736b = (C16727f) C15267r.m44384a(fVar);
            this.f46735a = (Fragment) C15267r.m44384a(fragment);
        }

        /* renamed from: a */
        public final View mo38705a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            try {
                Bundle bundle2 = new Bundle();
                C16744w.m55235a(bundle, bundle2);
                C15345b a = this.f46736b.mo43342a(C15349d.m44668a(layoutInflater), C15349d.m44668a(viewGroup), bundle2);
                C16744w.m55235a(bundle2, bundle);
                return (View) C15349d.m44669a(a);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: a */
        public final void mo38706a() {
            try {
                this.f46736b.mo43351f();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: a */
        public final void mo38707a(Activity activity, Bundle bundle, Bundle bundle2) {
            try {
                Bundle bundle3 = new Bundle();
                C16744w.m55235a(bundle2, bundle3);
                this.f46736b.mo43344a(C15349d.m44668a(activity), (StreetViewPanoramaOptions) null, bundle3);
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
                Bundle arguments = this.f46735a.getArguments();
                if (arguments != null && arguments.containsKey("StreetViewPanoramaOptions")) {
                    C16744w.m55236a(bundle2, "StreetViewPanoramaOptions", arguments.getParcelable("StreetViewPanoramaOptions"));
                }
                this.f46736b.mo43343a(bundle2);
                C16744w.m55235a(bundle2, bundle);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: a */
        public final void mo43306a(C16759g gVar) {
            try {
                this.f46736b.mo43345a((C16740s) new C16765m(this, gVar));
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: b */
        public final void mo38709b() {
            try {
                this.f46736b.mo43341K_();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: b */
        public final void mo38710b(Bundle bundle) {
            try {
                Bundle bundle2 = new Bundle();
                C16744w.m55235a(bundle, bundle2);
                this.f46736b.mo43347b(bundle2);
                C16744w.m55235a(bundle2, bundle);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: c */
        public final void mo38711c() {
            try {
                this.f46736b.mo43346b();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: d */
        public final void mo38712d() {
            try {
                this.f46736b.mo43352g();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: e */
        public final void mo38713e() {
            try {
                this.f46736b.mo43348c();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: f */
        public final void mo38714f() {
            try {
                this.f46736b.mo43349d();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: g */
        public final void mo38715g() {
            try {
                this.f46736b.mo43350e();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    /* renamed from: com.google.android.gms.maps.SupportStreetViewPanoramaFragment$b */
    static class C16715b extends C15343a<C16714a> {

        /* renamed from: b */
        private final Fragment f46737b;

        /* renamed from: c */
        private C15350e<C16714a> f46738c;

        /* renamed from: d */
        private Activity f46739d;

        /* renamed from: e */
        private final List<C16759g> f46740e = new ArrayList();

        C16715b(Fragment fragment) {
            this.f46737b = fragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m55127a(Activity activity) {
            this.f46739d = activity;
            m55129h();
        }

        /* renamed from: h */
        private final void m55129h() {
            if (!(this.f46739d == null || this.f46738c == null || this.f39626a != null)) {
                try {
                    C16757e.m55294a(this.f46739d);
                    this.f46738c.mo38716a(new C16714a(this.f46737b, C16745x.m55237a((Context) this.f46739d).mo43363b(C15349d.m44668a(this.f46739d))));
                    for (C16759g a : this.f46740e) {
                        ((C16714a) this.f39626a).mo43306a(a);
                    }
                    this.f46740e.clear();
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                } catch (GooglePlayServicesNotAvailableException unused) {
                }
            }
        }

        /* renamed from: a */
        public final void mo38695a(C15350e<C16714a> eVar) {
            this.f46738c = eVar;
            m55129h();
        }
    }

    public void onActivityCreated(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(SupportStreetViewPanoramaFragment.class.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f46734a.m55127a(activity);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f46734a.mo38694a(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f46734a.mo38691a(layoutInflater, viewGroup, bundle);
    }

    public void onDestroy() {
        this.f46734a.mo38701f();
        super.onDestroy();
    }

    public void onDestroyView() {
        this.f46734a.mo38700e();
        super.onDestroyView();
    }

    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new Builder(threadPolicy).permitAll().build());
        try {
            super.onInflate(activity, attributeSet, bundle);
            this.f46734a.m55127a(activity);
            this.f46734a.mo38693a(activity, new Bundle(), bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void onLowMemory() {
        this.f46734a.mo38702g();
        super.onLowMemory();
    }

    public void onPause() {
        this.f46734a.mo38698c();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.f46734a.mo38696b();
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(SupportStreetViewPanoramaFragment.class.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        this.f46734a.mo38697b(bundle);
    }

    public void onStart() {
        super.onStart();
        this.f46734a.mo38692a();
    }

    public void onStop() {
        this.f46734a.mo38699d();
        super.onStop();
    }

    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }
}
