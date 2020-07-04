package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.C1642a;
import com.google.android.gms.common.C15167c;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C15033b;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C15260o.C15261a;
import com.google.android.gms.internal.p761c.C16359d;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.common.internal.d */
public abstract class C15231d<T extends IInterface> {

    /* renamed from: a */
    private static final Feature[] f39375a = new Feature[0];

    /* renamed from: h */
    public static final String[] f39376h = {"service_esmobile", "service_googleme"};

    /* renamed from: A */
    private final String f39377A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public ConnectionResult f39378B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public boolean f39379C;

    /* renamed from: b */
    public final Context f39380b;

    /* renamed from: c */
    public final Looper f39381c;

    /* renamed from: d */
    final Handler f39382d;

    /* renamed from: e */
    protected C15234c f39383e;

    /* renamed from: f */
    public volatile zzb f39384f;

    /* renamed from: g */
    protected AtomicInteger f39385g;

    /* renamed from: i */
    private int f39386i;

    /* renamed from: j */
    private long f39387j;

    /* renamed from: k */
    private long f39388k;

    /* renamed from: l */
    private int f39389l;

    /* renamed from: m */
    private long f39390m;

    /* renamed from: n */
    private C15218aj f39391n;

    /* renamed from: o */
    private final C15252j f39392o;

    /* renamed from: p */
    private final C15167c f39393p;

    /* renamed from: q */
    private final Object f39394q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final Object f39395r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C15262p f39396s;

    /* renamed from: t */
    private T f39397t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public final ArrayList<C15239h<?>> f39398u;

    /* renamed from: v */
    private C15241j f39399v;

    /* renamed from: w */
    private int f39400w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public final C15232a f39401x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public final C15233b f39402y;

    /* renamed from: z */
    private final int f39403z;

    /* renamed from: com.google.android.gms.common.internal.d$a */
    public interface C15232a {
        /* renamed from: a */
        void mo38570a(int i);

        /* renamed from: a */
        void mo38571a(Bundle bundle);
    }

    /* renamed from: com.google.android.gms.common.internal.d$b */
    public interface C15233b {
        /* renamed from: a */
        void mo38572a(ConnectionResult connectionResult);
    }

    /* renamed from: com.google.android.gms.common.internal.d$c */
    public interface C15234c {
        /* renamed from: a */
        void mo38286a(ConnectionResult connectionResult);
    }

    /* renamed from: com.google.android.gms.common.internal.d$d */
    public class C15235d implements C15234c {
        public C15235d() {
        }

        /* renamed from: a */
        public final void mo38286a(ConnectionResult connectionResult) {
            if (connectionResult.mo38154b()) {
                C15231d.this.mo38557a((C15256m) null, C15231d.this.mo38569p());
                return;
            }
            if (C15231d.this.f39402y != null) {
                C15231d.this.f39402y.mo38572a(connectionResult);
            }
        }
    }

    /* renamed from: com.google.android.gms.common.internal.d$e */
    public interface C15236e {
        /* renamed from: a */
        void mo38343a();
    }

    /* renamed from: com.google.android.gms.common.internal.d$f */
    abstract class C15237f extends C15239h<Boolean> {

        /* renamed from: a */
        private final int f39405a;

        /* renamed from: b */
        private final Bundle f39406b;

        protected C15237f(int i, Bundle bundle) {
            super(Boolean.valueOf(true));
            this.f39405a = i;
            this.f39406b = bundle;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo38573a(ConnectionResult connectionResult);

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract boolean mo38575a();

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final /* synthetic */ void mo38574a(Object obj) {
            PendingIntent pendingIntent = null;
            if (((Boolean) obj) == null) {
                C15231d.this.m44257a(1, null);
                return;
            }
            int i = this.f39405a;
            if (i != 0) {
                if (i != 10) {
                    C15231d.this.m44257a(1, null);
                    if (this.f39406b != null) {
                        pendingIntent = (PendingIntent) this.f39406b.getParcelable("pendingIntent");
                    }
                    mo38573a(new ConnectionResult(this.f39405a, pendingIntent));
                } else {
                    C15231d.this.m44257a(1, null);
                    throw new IllegalStateException(C1642a.m8034a("A fatal developer error has occurred. Class name: %s. Start service action: %s. Service Descriptor: %s. ", new Object[]{getClass().getSimpleName(), C15231d.this.mo38130a(), C15231d.this.mo38131b()}));
                }
            } else if (!mo38575a()) {
                C15231d.this.m44257a(1, null);
                mo38573a(new ConnectionResult(8, null));
            }
        }
    }

    /* renamed from: com.google.android.gms.common.internal.d$g */
    final class C15238g extends C16359d {
        public C15238g(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            ConnectionResult connectionResult;
            ConnectionResult connectionResult2;
            if (C15231d.this.f39385g.get() != message.arg1) {
                if (m44314b(message)) {
                    m44313a(message);
                }
            } else if ((message.what == 1 || message.what == 7 || message.what == 4 || message.what == 5) && !C15231d.this.mo38561h()) {
                m44313a(message);
            } else {
                PendingIntent pendingIntent = null;
                if (message.what == 4) {
                    C15231d.this.f39378B = new ConnectionResult(message.arg2);
                    if (!C15231d.this.m44278v() || C15231d.this.f39379C) {
                        if (C15231d.this.f39378B != null) {
                            connectionResult2 = C15231d.this.f39378B;
                        } else {
                            connectionResult2 = new ConnectionResult(8);
                        }
                        C15231d.this.f39383e.mo38286a(connectionResult2);
                        C15231d.this.mo38554a(connectionResult2);
                        return;
                    }
                    C15231d.this.m44257a(3, null);
                } else if (message.what == 5) {
                    if (C15231d.this.f39378B != null) {
                        connectionResult = C15231d.this.f39378B;
                    } else {
                        connectionResult = new ConnectionResult(8);
                    }
                    C15231d.this.f39383e.mo38286a(connectionResult);
                    C15231d.this.mo38554a(connectionResult);
                } else if (message.what == 3) {
                    if (message.obj instanceof PendingIntent) {
                        pendingIntent = (PendingIntent) message.obj;
                    }
                    ConnectionResult connectionResult3 = new ConnectionResult(message.arg2, pendingIntent);
                    C15231d.this.f39383e.mo38286a(connectionResult3);
                    C15231d.this.mo38554a(connectionResult3);
                } else if (message.what == 6) {
                    C15231d.this.m44257a(5, null);
                    if (C15231d.this.f39401x != null) {
                        C15231d.this.f39401x.mo38570a(message.arg2);
                    }
                    C15231d.this.mo38551a(message.arg2);
                    C15231d.this.m44263a(5, 1, null);
                } else if (message.what == 2 && !C15231d.this.mo38560g()) {
                    m44313a(message);
                } else if (m44314b(message)) {
                    ((C15239h) message.obj).mo38577b();
                } else {
                    int i = message.what;
                    StringBuilder sb = new StringBuilder(45);
                    sb.append("Don't know how to handle message: ");
                    sb.append(i);
                    Log.wtf("GmsClient", sb.toString(), new Exception());
                }
            }
        }

        /* renamed from: a */
        private static void m44313a(Message message) {
            ((C15239h) message.obj).mo38578c();
        }

        /* renamed from: b */
        private static boolean m44314b(Message message) {
            return message.what == 2 || message.what == 1 || message.what == 7;
        }
    }

    /* renamed from: com.google.android.gms.common.internal.d$h */
    protected abstract class C15239h<TListener> {

        /* renamed from: a */
        private TListener f39409a;

        /* renamed from: b */
        private boolean f39410b;

        public C15239h(TListener tlistener) {
            this.f39409a = tlistener;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo38574a(TListener tlistener);

        /* renamed from: b */
        public final void mo38577b() {
            TListener tlistener;
            synchronized (this) {
                tlistener = this.f39409a;
            }
            if (tlistener != null) {
                try {
                    mo38574a(tlistener);
                } catch (RuntimeException e) {
                    throw e;
                }
            }
            synchronized (this) {
                this.f39410b = true;
            }
            mo38578c();
        }

        /* renamed from: c */
        public final void mo38578c() {
            mo38579d();
            synchronized (C15231d.this.f39398u) {
                C15231d.this.f39398u.remove(this);
            }
        }

        /* renamed from: d */
        public final void mo38579d() {
            synchronized (this) {
                this.f39409a = null;
            }
        }
    }

    /* renamed from: com.google.android.gms.common.internal.d$i */
    public static final class C15240i extends C15261a {

        /* renamed from: a */
        private C15231d f39412a;

        /* renamed from: b */
        private final int f39413b;

        public C15240i(C15231d dVar, int i) {
            this.f39412a = dVar;
            this.f39413b = i;
        }

        /* renamed from: a */
        public final void mo38545a(int i, Bundle bundle) {
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        }

        /* renamed from: a */
        public final void mo38546a(int i, IBinder iBinder, Bundle bundle) {
            C15267r.m44385a(this.f39412a, (Object) "onPostInitComplete can be called only once per call to getRemoteService");
            this.f39412a.mo38553a(i, iBinder, bundle, this.f39413b);
            this.f39412a = null;
        }

        /* renamed from: a */
        public final void mo38547a(int i, IBinder iBinder, zzb zzb) {
            C15267r.m44385a(this.f39412a, (Object) "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            C15267r.m44384a(zzb);
            this.f39412a.f39384f = zzb;
            mo38546a(i, iBinder, zzb.f39476a);
        }
    }

    /* renamed from: com.google.android.gms.common.internal.d$j */
    public final class C15241j implements ServiceConnection {

        /* renamed from: a */
        private final int f39414a;

        public C15241j(int i) {
            this.f39414a = i;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C15262p pVar;
            if (iBinder == null) {
                C15231d.this.m44267c(16);
                return;
            }
            synchronized (C15231d.this.f39395r) {
                C15231d dVar = C15231d.this;
                if (iBinder == null) {
                    pVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof C15262p)) {
                        pVar = new C15264a(iBinder);
                    } else {
                        pVar = (C15262p) queryLocalInterface;
                    }
                }
                dVar.f39396s = pVar;
            }
            C15231d.this.mo38552a(0, (Bundle) null, this.f39414a);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            synchronized (C15231d.this.f39395r) {
                C15231d.this.f39396s = null;
            }
            C15231d.this.f39382d.sendMessage(C15231d.this.f39382d.obtainMessage(6, this.f39414a, 1));
        }
    }

    /* renamed from: com.google.android.gms.common.internal.d$k */
    protected final class C15242k extends C15237f {

        /* renamed from: a */
        private final IBinder f39416a;

        public C15242k(int i, IBinder iBinder, Bundle bundle) {
            super(i, bundle);
            this.f39416a = iBinder;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo38573a(ConnectionResult connectionResult) {
            if (C15231d.this.f39402y != null) {
                C15231d.this.f39402y.mo38572a(connectionResult);
            }
            C15231d.this.mo38554a(connectionResult);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo38575a() {
            try {
                if (!C15231d.this.mo38131b().equals(this.f39416a.getInterfaceDescriptor())) {
                    return false;
                }
                IInterface a = C15231d.this.mo38129a(this.f39416a);
                if (a == null || (!C15231d.this.m44263a(2, 4, a) && !C15231d.this.m44263a(3, 4, a))) {
                    return false;
                }
                C15231d.this.f39378B = null;
                if (C15231d.this.f39401x != null) {
                    C15231d.this.f39401x.mo38571a((Bundle) null);
                }
                return true;
            } catch (RemoteException unused) {
                return false;
            }
        }
    }

    /* renamed from: com.google.android.gms.common.internal.d$l */
    protected final class C15243l extends C15237f {
        public C15243l(int i, Bundle bundle) {
            super(i, null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo38573a(ConnectionResult connectionResult) {
            C15231d.this.f39383e.mo38286a(connectionResult);
            C15231d.this.mo38554a(connectionResult);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo38575a() {
            C15231d.this.f39383e.mo38286a(ConnectionResult.f38845a);
            return true;
        }
    }

    /* renamed from: q */
    private static String mo39918q() {
        return "com.google.android.gms";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo38129a(IBinder iBinder);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo38130a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract String mo38131b();

    /* renamed from: c */
    public boolean mo38132c() {
        return false;
    }

    /* renamed from: i */
    public boolean mo38562i() {
        return false;
    }

    /* renamed from: m */
    public Account mo38566m() {
        return null;
    }

    protected C15231d(Context context, Looper looper, int i, C15232a aVar, C15233b bVar, String str) {
        this(context, looper, C15252j.m44362a(context), C15167c.getInstance(), i, (C15232a) C15267r.m44384a(aVar), (C15233b) C15267r.m44384a(bVar), null);
    }

    protected C15231d(Context context, Looper looper, C15252j jVar, C15167c cVar, int i, C15232a aVar, C15233b bVar, String str) {
        this.f39394q = new Object();
        this.f39395r = new Object();
        this.f39398u = new ArrayList<>();
        this.f39400w = 1;
        this.f39378B = null;
        this.f39379C = false;
        this.f39384f = null;
        this.f39385g = new AtomicInteger(0);
        this.f39380b = (Context) C15267r.m44385a(context, (Object) "Context must not be null");
        this.f39381c = (Looper) C15267r.m44385a(looper, (Object) "Looper must not be null");
        this.f39392o = (C15252j) C15267r.m44385a(jVar, (Object) "Supervisor must not be null");
        this.f39393p = (C15167c) C15267r.m44385a(cVar, (Object) "API availability must not be null");
        this.f39382d = new C15238g(looper);
        this.f39403z = i;
        this.f39401x = aVar;
        this.f39402y = bVar;
        this.f39377A = str;
    }

    /* renamed from: r */
    private final String mo44185r() {
        return this.f39377A == null ? this.f39380b.getClass().getName() : this.f39377A;
    }

    /* renamed from: k */
    public final Feature[] mo38564k() {
        zzb zzb = this.f39384f;
        if (zzb == null) {
            return null;
        }
        return zzb.f39477b;
    }

    /* renamed from: a */
    private void m44258a(T t) {
        this.f39388k = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo38551a(int i) {
        this.f39386i = i;
        this.f39387j = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo38554a(ConnectionResult connectionResult) {
        this.f39389l = connectionResult.f38846b;
        this.f39390m = System.currentTimeMillis();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m44257a(int i, T t) {
        boolean z = true;
        if ((i == 4) != (t != null)) {
            z = false;
        }
        C15267r.m44394b(z);
        synchronized (this.f39394q) {
            this.f39400w = i;
            this.f39397t = t;
            switch (i) {
                case 1:
                    if (this.f39399v != null) {
                        this.f39392o.mo38601a(mo38130a(), mo39918q(), 129, this.f39399v, mo44185r());
                        this.f39399v = null;
                        break;
                    }
                    break;
                case 2:
                case 3:
                    if (!(this.f39399v == null || this.f39391n == null)) {
                        this.f39392o.mo38601a(this.f39391n.f39367a, this.f39391n.f39368b, this.f39391n.f39369c, this.f39399v, mo44185r());
                        this.f39385g.incrementAndGet();
                    }
                    this.f39399v = new C15241j(this.f39385g.get());
                    this.f39391n = new C15218aj(mo39918q(), mo38130a(), false, 129);
                    if (!this.f39392o.mo38531a(new C15253a(this.f39391n.f39367a, this.f39391n.f39368b, this.f39391n.f39369c), this.f39399v, mo44185r())) {
                        mo38552a(16, (Bundle) null, this.f39385g.get());
                        break;
                    }
                    break;
                case 4:
                    m44258a(t);
                    break;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final boolean m44263a(int i, int i2, T t) {
        synchronized (this.f39394q) {
            if (this.f39400w != i) {
                return false;
            }
            m44257a(i2, t);
            return true;
        }
    }

    /* renamed from: l */
    public final void mo38565l() {
        int isGooglePlayServicesAvailable = this.f39393p.isGooglePlayServicesAvailable(this.f39380b, mo38134e());
        if (isGooglePlayServicesAvailable != 0) {
            m44257a(1, (T) null);
            m44259a((C15234c) new C15235d(), isGooglePlayServicesAvailable, (PendingIntent) null);
            return;
        }
        mo38555a((C15234c) new C15235d());
    }

    /* renamed from: a */
    public final void mo38555a(C15234c cVar) {
        this.f39383e = (C15234c) C15267r.m44385a(cVar, (Object) "Connection progress callbacks cannot be null.");
        m44257a(2, (T) null);
    }

    /* renamed from: g */
    public final boolean mo38560g() {
        boolean z;
        synchronized (this.f39394q) {
            z = this.f39400w == 4;
        }
        return z;
    }

    /* renamed from: h */
    public final boolean mo38561h() {
        boolean z;
        synchronized (this.f39394q) {
            if (this.f39400w != 2) {
                if (this.f39400w != 3) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: s */
    private final boolean m44275s() {
        boolean z;
        synchronized (this.f39394q) {
            z = this.f39400w == 3;
        }
        return z;
    }

    /* renamed from: f */
    public final void mo38559f() {
        this.f39385g.incrementAndGet();
        synchronized (this.f39398u) {
            int size = this.f39398u.size();
            for (int i = 0; i < size; i++) {
                ((C15239h) this.f39398u.get(i)).mo38579d();
            }
            this.f39398u.clear();
        }
        synchronized (this.f39395r) {
            this.f39396s = null;
        }
        m44257a(1, (T) null);
    }

    /* renamed from: b */
    private void m44265b(int i) {
        this.f39382d.sendMessage(this.f39382d.obtainMessage(6, this.f39385g.get(), 1));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m44267c(int i) {
        int i2;
        if (m44275s()) {
            i2 = 5;
            this.f39379C = true;
        } else {
            i2 = 4;
        }
        this.f39382d.sendMessage(this.f39382d.obtainMessage(i2, this.f39385g.get(), 16));
    }

    /* renamed from: a */
    private void m44259a(C15234c cVar, int i, PendingIntent pendingIntent) {
        this.f39383e = (C15234c) C15267r.m44385a(cVar, (Object) "Connection progress callbacks cannot be null.");
        this.f39382d.sendMessage(this.f39382d.obtainMessage(3, this.f39385g.get(), i, null));
    }

    /* renamed from: t */
    private static Feature[] m44276t() {
        return f39375a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public Bundle mo38567n() {
        return new Bundle();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo38553a(int i, IBinder iBinder, Bundle bundle, int i2) {
        this.f39382d.sendMessage(this.f39382d.obtainMessage(1, i2, -1, new C15242k(i, iBinder, bundle)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo38552a(int i, Bundle bundle, int i2) {
        this.f39382d.sendMessage(this.f39382d.obtainMessage(7, i2, -1, new C15243l(i, null)));
    }

    /* renamed from: u */
    private void m44277u() {
        if (!mo38560g()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* renamed from: o */
    public final T mo38568o() throws DeadObjectException {
        T t;
        synchronized (this.f39394q) {
            if (this.f39400w != 5) {
                m44277u();
                C15267r.m44391a(this.f39397t != null, (Object) "Client is connected but service is null");
                t = this.f39397t;
            } else {
                throw new DeadObjectException();
            }
        }
        return t;
    }

    /* renamed from: a */
    public final void mo38557a(C15256m mVar, Set<Scope> set) {
        Bundle n = mo38567n();
        GetServiceRequest getServiceRequest = new GetServiceRequest(this.f39403z);
        getServiceRequest.f39323a = this.f39380b.getPackageName();
        getServiceRequest.f39326d = n;
        if (set != null) {
            getServiceRequest.f39325c = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (mo38562i()) {
            getServiceRequest.f39327e = mo38566m() != null ? mo38566m() : new Account("<<default account>>", "com.google");
            if (mVar != null) {
                getServiceRequest.f39324b = mVar.asBinder();
            }
        }
        getServiceRequest.f39328f = f39375a;
        getServiceRequest.f39329g = m44276t();
        try {
            synchronized (this.f39395r) {
                if (this.f39396s != null) {
                    this.f39396s.mo38608a(new C15240i(this, this.f39385g.get()), getServiceRequest);
                }
            }
        } catch (DeadObjectException unused) {
            m44265b(1);
        } catch (SecurityException e) {
            throw e;
        } catch (RemoteException | RuntimeException unused2) {
            mo38553a(8, (IBinder) null, (Bundle) null, this.f39385g.get());
        }
    }

    /* renamed from: a */
    public final void mo38556a(C15236e eVar) {
        eVar.mo38343a();
    }

    /* renamed from: d */
    public Intent mo38133d() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public Set<Scope> mo38569p() {
        return Collections.EMPTY_SET;
    }

    /* renamed from: a */
    public final void mo38558a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i;
        T t;
        C15262p pVar;
        synchronized (this.f39394q) {
            i = this.f39400w;
            t = this.f39397t;
        }
        synchronized (this.f39395r) {
            pVar = this.f39396s;
        }
        printWriter.append(str).append("mConnectState=");
        switch (i) {
            case 1:
                printWriter.print("DISCONNECTED");
                break;
            case 2:
                printWriter.print("REMOTE_CONNECTING");
                break;
            case 3:
                printWriter.print("LOCAL_CONNECTING");
                break;
            case 4:
                printWriter.print("CONNECTED");
                break;
            case 5:
                printWriter.print("DISCONNECTING");
                break;
            default:
                printWriter.print("UNKNOWN");
                break;
        }
        printWriter.append(" mService=");
        if (t == null) {
            printWriter.append(TEVideoRecorder.FACE_BEAUTY_NULL);
        } else {
            printWriter.append(mo38131b()).append("@").append(Integer.toHexString(System.identityHashCode(t.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (pVar == null) {
            printWriter.println(TEVideoRecorder.FACE_BEAUTY_NULL);
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(pVar.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f39388k > 0) {
            PrintWriter append = printWriter.append(str).append("lastConnectedTime=");
            long j = this.f39388k;
            String format = simpleDateFormat.format(new Date(this.f39388k));
            StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 21);
            sb.append(j);
            sb.append(" ");
            sb.append(format);
            append.println(sb.toString());
        }
        if (this.f39387j > 0) {
            printWriter.append(str).append("lastSuspendedCause=");
            switch (this.f39386i) {
                case 1:
                    printWriter.append("CAUSE_SERVICE_DISCONNECTED");
                    break;
                case 2:
                    printWriter.append("CAUSE_NETWORK_LOST");
                    break;
                default:
                    printWriter.append(String.valueOf(this.f39386i));
                    break;
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j2 = this.f39387j;
            String format2 = simpleDateFormat.format(new Date(this.f39387j));
            StringBuilder sb2 = new StringBuilder(String.valueOf(format2).length() + 21);
            sb2.append(j2);
            sb2.append(" ");
            sb2.append(format2);
            append2.println(sb2.toString());
        }
        if (this.f39390m > 0) {
            printWriter.append(str).append("lastFailedStatus=").append(C15033b.m43574a(this.f39389l));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j3 = this.f39390m;
            String format3 = simpleDateFormat.format(new Date(this.f39390m));
            StringBuilder sb3 = new StringBuilder(String.valueOf(format3).length() + 21);
            sb3.append(j3);
            sb3.append(" ");
            sb3.append(format3);
            append3.println(sb3.toString());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public final boolean m44278v() {
        if (this.f39379C || TextUtils.isEmpty(mo38131b()) || TextUtils.isEmpty(null)) {
            return false;
        }
        try {
            Class.forName(mo38131b());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: j */
    public final String mo38563j() {
        if (mo38560g() && this.f39391n != null) {
            return this.f39391n.f39368b;
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    /* renamed from: e */
    public int mo38134e() {
        return C15167c.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }
}
