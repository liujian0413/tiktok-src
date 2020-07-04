package com.p280ss.android.ugc.aweme.location;

import android.app.Activity;
import android.content.Context;
import android.location.LocationManager;
import android.os.Build.VERSION;
import android.os.Message;
import android.provider.Settings.Secure;
import android.provider.Settings.SettingNotFoundException;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.ugc.aweme.model.TextExtraStruct;
import com.p280ss.android.ugc.aweme.utils.permission.C43152a;
import com.p280ss.android.ugc.aweme.utils.permission.C43152a.C43154a;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Vector;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.location.g */
public final class C32625g implements C6310a, C32638o {

    /* renamed from: b */
    public static final C32626a f85058b = new C32626a(null);

    /* renamed from: a */
    public C32633j f85059a;

    /* renamed from: c */
    private final Vector<WeakReference<C32624f>> f85060c = new Vector<>();

    /* renamed from: d */
    private C6309f f85061d;

    /* renamed from: e */
    private WeakReference<C32624f> f85062e;

    /* renamed from: f */
    private final Context f85063f;

    /* renamed from: g */
    private final C32620c f85064g;

    /* renamed from: com.ss.android.ugc.aweme.location.g$a */
    public static final class C32626a {

        /* renamed from: com.ss.android.ugc.aweme.location.g$a$a */
        public static final class C32627a implements C43154a {

            /* renamed from: a */
            final /* synthetic */ C43154a f85065a;

            /* renamed from: a */
            public final void mo71375a() {
                C43154a aVar = this.f85065a;
                if (aVar != null) {
                    aVar.mo71375a();
                }
            }

            /* renamed from: b */
            public final void mo71376b() {
                C43154a aVar = this.f85065a;
                if (aVar != null) {
                    aVar.mo71376b();
                }
            }

            C32627a(C43154a aVar) {
                this.f85065a = aVar;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.location.g$a$b */
        public static final class C32628b implements C43154a {

            /* renamed from: a */
            final /* synthetic */ C43154a f85066a;

            /* renamed from: a */
            public final void mo71375a() {
                C43154a aVar = this.f85066a;
                if (aVar != null) {
                    aVar.mo71375a();
                }
            }

            /* renamed from: b */
            public final void mo71376b() {
                C43154a aVar = this.f85066a;
                if (aVar != null) {
                    aVar.mo71376b();
                }
            }

            C32628b(C43154a aVar) {
                this.f85066a = aVar;
            }
        }

        private C32626a() {
        }

        /* renamed from: a */
        private static String[] m105686a() {
            return new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};
        }

        public /* synthetic */ C32626a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public final boolean mo84010a(Context context) {
            if (context != null) {
                return C43152a.m136871a(context, m105686a());
            }
            return false;
        }

        /* renamed from: b */
        public final boolean mo84011b(Context context) {
            if (!m105688c(context) || !mo84010a(context)) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        private static boolean m105688c(Context context) {
            if (context == null) {
                return false;
            }
            if (VERSION.SDK_INT >= 28) {
                Object systemService = context.getSystemService("location");
                if (systemService != null) {
                    return ((LocationManager) systemService).isLocationEnabled();
                }
                throw new TypeCastException("null cannot be cast to non-null type android.location.LocationManager");
            } else if (VERSION.SDK_INT >= 19) {
                try {
                    if (Secure.getInt(context.getContentResolver(), "location_mode") != 0) {
                        return true;
                    }
                    return false;
                } catch (SettingNotFoundException unused) {
                    return false;
                }
            } else if (!TextUtils.isEmpty(Secure.getString(context.getContentResolver(), "location_providers_allowed"))) {
                return true;
            } else {
                return false;
            }
        }

        /* renamed from: a */
        public static void m105685a(Activity activity, C43154a aVar) {
            if (activity != null) {
                C43152a.m136867a(activity, (int) TextExtraStruct.TYPE_CUSTOM_COLOR_CLICK_SPAN, m105686a(), (C43154a) new C32627a(aVar));
            }
        }

        /* renamed from: b */
        public static void m105687b(Activity activity, C43154a aVar) {
            if (activity != null) {
                C43152a.m136874b(activity, 1001, m105686a(), new C32628b(aVar));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.location.g$b */
    static final class C32629b extends Lambda implements C7562b<WeakReference<C32624f>, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C32625g f85067a;

        /* renamed from: b */
        final /* synthetic */ C32624f f85068b;

        C32629b(C32625g gVar, C32624f fVar) {
            this.f85067a = gVar;
            this.f85068b = fVar;
            super(1);
        }

        /* renamed from: a */
        private boolean m105695a(WeakReference<C32624f> weakReference) {
            if (((C32624f) weakReference.get()) == this.f85068b) {
                return true;
            }
            return false;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(m105695a((WeakReference) obj));
        }
    }

    /* renamed from: a */
    public static final boolean m105674a(Context context) {
        return f85058b.mo84011b(context);
    }

    /* renamed from: b */
    public final void mo84008b() {
        if (m105677f()) {
            m105676e();
        }
    }

    /* renamed from: c */
    public final void mo84009c() {
        WeakReference<C32624f> weakReference = this.f85062e;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f85062e = null;
    }

    /* renamed from: e */
    private final boolean m105676e() {
        boolean z;
        Context context = this.f85063f;
        if (context == null) {
            return false;
        }
        try {
            z = C6776h.m20951c(context, context.getPackageName());
        } catch (Exception unused) {
            z = false;
        }
        return z;
    }

    /* renamed from: f */
    private final boolean m105677f() {
        boolean z;
        C32620c cVar = this.f85064g;
        if (cVar != null) {
            z = cVar.mo83999c();
        } else {
            z = false;
        }
        if (!z || !f85058b.mo84011b(this.f85063f)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final LocationResult mo84003a() {
        if (m105677f()) {
            C32633j jVar = this.f85059a;
            if (jVar != null) {
                return jVar.mo84015a();
            }
        }
        return null;
    }

    /* renamed from: d */
    private final void m105675d() {
        if (m105677f()) {
            synchronized (this.f85060c) {
                for (WeakReference weakReference : this.f85060c) {
                    C32624f fVar = (C32624f) weakReference.get();
                    if (fVar != null) {
                        fVar.bv_();
                    }
                }
                this.f85060c.clear();
                WeakReference<C32624f> weakReference2 = this.f85062e;
                if (weakReference2 != null) {
                    C32624f fVar2 = (C32624f) weakReference2.get();
                    if (fVar2 != null) {
                        fVar2.bv_();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo84006a(boolean z) {
        m105677f();
    }

    public final void handleMsg(Message message) {
        m105675d();
    }

    /* renamed from: b */
    public final LocationResult mo84007b(C32624f fVar) {
        if (!m105677f()) {
            return null;
        }
        LocationResult a = mo84003a();
        if (a != null) {
            if (!a.isValid()) {
                a = null;
            }
            if (a != null) {
                return a;
            }
        }
        if (fVar != null) {
            synchronized (this.f85060c) {
                this.f85060c.add(new WeakReference(fVar));
                mo84008b();
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo84005a(C32624f fVar) {
        C7573i.m23587b(fVar, "locationCallback");
        if (m105677f()) {
            synchronized (this.f85060c) {
                C7525m.m23480a((List<T>) this.f85060c, (C7562b<? super T, Boolean>) new C32629b<Object,Boolean>(this, fVar));
            }
        }
    }

    public C32625g(Context context, C32620c cVar) {
        this.f85063f = context;
        this.f85064g = cVar;
        if (C6776h.m20947b(this.f85063f)) {
            this.f85061d = new C6309f(this);
        }
    }

    /* renamed from: a */
    public final void mo84004a(int i, C32624f fVar) {
        C7573i.m23587b(fVar, "locationCallback");
        if (m105677f() && this.f85059a != null) {
            this.f85062e = new WeakReference<>(fVar);
        }
    }
}
