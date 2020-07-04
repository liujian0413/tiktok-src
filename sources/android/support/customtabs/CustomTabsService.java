package android.support.customtabs;

import android.app.Service;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.RemoteException;
import android.support.customtabs.C0229h.C0230a;
import android.support.p022v4.util.ArrayMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public abstract class CustomTabsService extends Service {

    /* renamed from: a */
    final Map<IBinder, DeathRecipient> f827a = new ArrayMap();

    /* renamed from: b */
    private C0230a f828b = new C0230a() {
        /* renamed from: a */
        public final boolean mo619a(long j) {
            return CustomTabsService.this.mo610a(j);
        }

        /* renamed from: a */
        public final boolean mo620a(C0226g gVar) {
            final C0224f fVar = new C0224f(gVar);
            try {
                C02091 r2 = new DeathRecipient() {
                    public final void binderDied() {
                        CustomTabsService.this.mo611a(fVar);
                    }
                };
                synchronized (CustomTabsService.this.f827a) {
                    gVar.asBinder().linkToDeath(r2, 0);
                    CustomTabsService.this.f827a.put(gVar.asBinder(), r2);
                }
                return CustomTabsService.this.mo616b(fVar);
            } catch (RemoteException unused) {
                return false;
            }
        }

        /* renamed from: a */
        public final Bundle mo618a(String str, Bundle bundle) {
            return CustomTabsService.this.mo609a(str, bundle);
        }

        /* renamed from: a */
        public final boolean mo622a(C0226g gVar, Uri uri) {
            return CustomTabsService.this.mo613a(new C0224f(gVar), uri);
        }

        /* renamed from: a */
        public final boolean mo624a(C0226g gVar, Bundle bundle) {
            return CustomTabsService.this.mo615a(new C0224f(gVar), bundle);
        }

        /* renamed from: a */
        public final int mo617a(C0226g gVar, String str, Bundle bundle) {
            return CustomTabsService.this.mo608a(new C0224f(gVar), str, bundle);
        }

        /* renamed from: a */
        public final boolean mo621a(C0226g gVar, int i, Uri uri, Bundle bundle) {
            return CustomTabsService.this.mo612a(new C0224f(gVar), i, uri, bundle);
        }

        /* renamed from: a */
        public final boolean mo623a(C0226g gVar, Uri uri, Bundle bundle, List<Bundle> list) {
            return CustomTabsService.this.mo614a(new C0224f(gVar), uri, bundle, list);
        }
    };

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo608a(C0224f fVar, String str, Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Bundle mo609a(String str, Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo610a(long j);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo612a(C0224f fVar, int i, Uri uri, Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo613a(C0224f fVar, Uri uri);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo614a(C0224f fVar, Uri uri, Bundle bundle, List<Bundle> list);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo615a(C0224f fVar, Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo616b(C0224f fVar);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo611a(C0224f fVar) {
        try {
            synchronized (this.f827a) {
                IBinder a = fVar.mo653a();
                a.unlinkToDeath((DeathRecipient) this.f827a.get(a), 0);
                this.f827a.remove(a);
            }
            return true;
        } catch (NoSuchElementException unused) {
            return false;
        }
    }
}
