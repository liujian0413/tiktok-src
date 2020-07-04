package com.p280ss.android.ugc.aweme.map.p1389a;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.bytedane.aweme.map.api.C13045a;
import com.bytedane.aweme.map.api.C13048c;
import com.bytedane.aweme.map.api.C13049d;
import com.bytedane.aweme.map.api.C13051e;
import com.bytedane.aweme.map.api.C13052f;
import com.bytedane.aweme.map.api.data.C13050a;
import com.google.android.gms.maps.C16748b;
import com.google.android.gms.maps.C16749c;
import com.google.android.gms.maps.C16749c.C16750a;
import com.google.android.gms.maps.C16749c.C16751b;
import com.google.android.gms.maps.C16749c.C16752c;
import com.google.android.gms.maps.C16749c.C16753d;
import com.google.android.gms.maps.C16754d;
import com.google.android.gms.maps.C16758f;
import com.google.android.gms.maps.model.C16770b;
import com.google.android.gms.maps.model.C16771c;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.LatLngBounds.C16767a;
import com.google.android.gms.maps.model.MarkerOptions;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.map.a.a */
public final class C33116a implements C13045a, C16751b, C16752c, C16753d, C16758f {

    /* renamed from: b */
    public static final C33117a f86137b = new C33117a(null);

    /* renamed from: c */
    private C16754d f86138c;

    /* renamed from: d */
    private C16749c f86139d;

    /* renamed from: e */
    private C13049d f86140e;

    /* renamed from: f */
    private C16771c f86141f;

    /* renamed from: g */
    private C16771c f86142g;

    /* renamed from: h */
    private double f86143h;

    /* renamed from: i */
    private double f86144i;

    /* renamed from: j */
    private C13051e f86145j;

    /* renamed from: k */
    private C13048c f86146k;

    /* renamed from: l */
    private final FrameLayout f86147l;

    /* renamed from: com.ss.android.ugc.aweme.map.a.a$a */
    public static final class C33117a {
        private C33117a() {
        }

        public /* synthetic */ C33117a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.map.a.a$b */
    public static final class C33118b implements C16750a {

        /* renamed from: a */
        final /* synthetic */ View f86148a;

        C33118b(View view) {
            this.f86148a = view;
        }

        /* renamed from: a */
        public final View mo43371a(C16771c cVar) {
            View view = this.f86148a;
            if (view == null) {
                C7573i.m23580a();
            }
            return view;
        }

        /* renamed from: b */
        public final View mo43372b(C16771c cVar) {
            View view = this.f86148a;
            if (view == null) {
                C7573i.m23580a();
            }
            return view;
        }
    }

    /* renamed from: b */
    private static double m106861b(double d) {
        return (d * 3.141592653589793d) / 180.0d;
    }

    /* renamed from: a */
    public final void mo43387a(C16749c cVar) {
        this.f86139d = cVar;
        C16749c cVar2 = this.f86139d;
        if (cVar2 != null) {
            cVar2.mo43369a((C16753d) this);
        }
        C16749c cVar3 = this.f86139d;
        if (cVar3 != null) {
            cVar3.mo43367a((C16751b) this);
        }
        C16749c cVar4 = this.f86139d;
        if (cVar4 != null) {
            cVar4.mo43368a((C16752c) this);
        }
        C13051e eVar = this.f86145j;
        if (eVar != null) {
            eVar.mo31633a();
        }
    }

    /* renamed from: a */
    public final void mo31624a(View view, C13050a aVar, Bitmap bitmap, C13049d dVar) {
        this.f86140e = dVar;
        if (this.f86142g != null) {
            C16771c cVar = this.f86142g;
            if (cVar != null) {
                cVar.mo43458a();
            }
            this.f86142g = null;
        }
        this.f86142g = m106860a(bitmap, aVar.f34502a, aVar.f34503b, (C13052f) null);
        C16749c cVar2 = this.f86139d;
        if (cVar2 != null) {
            cVar2.mo43366a((C16750a) new C33118b(view));
        }
        C16771c cVar3 = this.f86142g;
        if (cVar3 != null) {
            cVar3.mo43459b();
        }
    }

    /* renamed from: a */
    public final void mo43373a(C16771c cVar) {
        C13049d dVar = this.f86140e;
        if (dVar != null) {
            dVar.mo31632a();
        }
    }

    /* renamed from: a */
    public final void mo43374a(LatLng latLng) {
        C16771c cVar = this.f86142g;
        if (cVar != null) {
            cVar.mo43459b();
        }
        C13048c cVar2 = this.f86146k;
        if (cVar2 != null) {
            double d = 0.0d;
            double d2 = latLng != null ? latLng.f46798a : 0.0d;
            if (latLng != null) {
                d = latLng.f46799b;
            }
            cVar2.mo31631a(d2, d);
        }
    }

    /* renamed from: c */
    public final void mo31627c() {
        C16754d dVar = this.f86138c;
        if (dVar == null) {
            C7573i.m23583a("mapView");
        }
        dVar.mo43382d();
    }

    /* renamed from: e */
    public final void mo31629e() {
        C16754d dVar = this.f86138c;
        if (dVar == null) {
            C7573i.m23583a("mapView");
        }
        dVar.mo43381c();
    }

    /* renamed from: f */
    public final void mo31630f() {
        C16754d dVar = this.f86138c;
        if (dVar == null) {
            C7573i.m23583a("mapView");
        }
        dVar.mo43384f();
    }

    /* renamed from: a */
    public final void mo31618a() {
        C16754d dVar = this.f86138c;
        if (dVar == null) {
            C7573i.m23583a("mapView");
        }
        dVar.mo43376a();
    }

    /* renamed from: b */
    public final void mo31626b() {
        C16754d dVar = this.f86138c;
        if (dVar == null) {
            C7573i.m23583a("mapView");
        }
        dVar.mo43379b();
    }

    /* renamed from: d */
    public final void mo31628d() {
        C16749c cVar = this.f86139d;
        if (cVar != null) {
            cVar.mo43369a((C16753d) null);
        }
        C16749c cVar2 = this.f86139d;
        if (cVar2 != null) {
            cVar2.mo43367a((C16751b) null);
        }
        C16749c cVar3 = this.f86139d;
        if (cVar3 != null) {
            cVar3.mo43368a((C16752c) null);
        }
        C16754d dVar = this.f86138c;
        if (dVar == null) {
            C7573i.m23583a("mapView");
        }
        dVar.mo43383e();
    }

    /* renamed from: a */
    public final void mo31625a(C13048c cVar) {
        this.f86146k = cVar;
    }

    public C33116a(FrameLayout frameLayout) {
        C7573i.m23587b(frameLayout, "frameLayout");
        this.f86147l = frameLayout;
    }

    /* renamed from: a */
    private static double m106859a(double d) {
        double sin = Math.sin(d / 2.0d);
        return sin * sin;
    }

    /* renamed from: b */
    public final boolean mo43375b(C16771c cVar) {
        if (C7573i.m23585a((Object) cVar, (Object) this.f86142g)) {
            C16771c cVar2 = this.f86142g;
            if (cVar2 != null) {
                cVar2.mo43459b();
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void mo31622a(Bundle bundle) {
        Bundle bundle2;
        if (bundle != null) {
            bundle2 = bundle.getBundle("MapViewBundleKey");
        } else {
            bundle2 = null;
        }
        if (bundle2 == null) {
            bundle2 = new Bundle();
            if (bundle != null) {
                bundle.putBundle("MapViewBundleKey", bundle2);
            }
        }
        C16754d dVar = this.f86138c;
        if (dVar == null) {
            C7573i.m23583a("mapView");
        }
        dVar.mo43380b(bundle2);
    }

    /* renamed from: a */
    public final void mo31623a(Bundle bundle, C13051e eVar) {
        Bundle bundle2;
        this.f86145j = eVar;
        if (bundle != null) {
            bundle2 = bundle.getBundle("MapViewBundleKey");
        } else {
            bundle2 = null;
        }
        this.f86138c = new C16754d(this.f86147l.getContext());
        C16754d dVar = this.f86138c;
        if (dVar == null) {
            C7573i.m23583a("mapView");
        }
        dVar.mo43377a(bundle2);
        C16754d dVar2 = this.f86138c;
        if (dVar2 == null) {
            C7573i.m23583a("mapView");
        }
        dVar2.mo43378a((C16758f) this);
        FrameLayout frameLayout = this.f86147l;
        C16754d dVar3 = this.f86138c;
        if (dVar3 == null) {
            C7573i.m23583a("mapView");
        }
        frameLayout.addView(dVar3, new LayoutParams(-1, -1));
    }

    /* renamed from: a */
    public final void mo31620a(Bitmap bitmap, double d, double d2) {
        if (this.f86141f != null) {
            C16771c cVar = this.f86141f;
            if (cVar != null) {
                cVar.mo43458a();
            }
            this.f86141f = null;
        }
        this.f86141f = m106860a(bitmap, d, d2, (C13052f) null);
    }

    /* renamed from: a */
    private final C16771c m106860a(Bitmap bitmap, double d, double d2, C13052f fVar) {
        LatLng latLng = new LatLng(d, d2);
        C16749c cVar = this.f86139d;
        if (cVar != null) {
            return cVar.mo43364a(new MarkerOptions().mo43420a(latLng).mo43421a(C16770b.m55320a(bitmap)));
        }
        return null;
    }

    /* renamed from: b */
    private final double m106862b(double d, double d2, double d3, double d4) {
        double b = m106861b(d);
        double b2 = m106861b(d2);
        return Math.asin(Math.sqrt(m106859a(Math.abs(b - m106861b(d3))) + (Math.cos(d) * Math.cos(d3) * m106859a(Math.abs(b2 - m106861b(d4)))))) * 12742.0d;
    }

    /* renamed from: a */
    public final void mo31619a(double d, double d2, double d3, double d4) {
        float f;
        C16767a a = LatLngBounds.m55306a();
        a.mo43417a(new LatLng(d, d2));
        a.mo43417a(new LatLng(d3, d4));
        LatLngBounds a2 = a.mo43418a();
        double b = m106862b(d, d2, d3, d4);
        if (b < 0.10000000149011612d) {
            f = 19.0f;
        } else if (b < 0.20000000298023224d) {
            f = 17.0f;
        } else if (b < 0.5d) {
            f = 16.0f;
        } else if (b < 1.0d) {
            f = 15.0f;
        } else if (b < 2.0d) {
            f = 14.0f;
        } else if (b < 4.0d) {
            f = 13.0f;
        } else if (b < 7.5d) {
            f = 12.0f;
        } else if (b < 15.0d) {
            f = 11.0f;
        } else {
            f = 10.0f;
        }
        C16749c cVar = this.f86139d;
        if (cVar != null) {
            C7573i.m23582a((Object) a2, "bounds");
            cVar.mo43365a(C16748b.m55257a(a2.mo43412b(), f));
        }
    }

    /* renamed from: a */
    public final void mo31621a(Bitmap bitmap, double d, double d2, float f, C13052f fVar) {
        this.f86143h = d;
        this.f86144i = d2;
        if (this.f86142g != null) {
            C16771c cVar = this.f86142g;
            if (cVar != null) {
                cVar.mo43458a();
            }
            this.f86142g = null;
        }
        this.f86142g = m106860a(bitmap, d, d2, fVar);
        C16749c cVar2 = this.f86139d;
        if (cVar2 != null) {
            cVar2.mo43365a(C16748b.m55256a(new LatLng(d, d2)));
        }
        C16749c cVar3 = this.f86139d;
        if (cVar3 != null) {
            cVar3.mo43370b(C16748b.m55255a(13.0f));
        }
    }
}
