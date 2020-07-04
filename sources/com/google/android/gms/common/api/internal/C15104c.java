package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.C15017a;
import com.google.android.gms.common.api.C15017a.C15019b;
import com.google.android.gms.common.api.C15017a.C15020c;
import com.google.android.gms.common.api.C15037d;
import com.google.android.gms.common.api.C15044g;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.internal.C15268s;

/* renamed from: com.google.android.gms.common.api.internal.c */
public final class C15104c {

    /* renamed from: com.google.android.gms.common.api.internal.c$a */
    public static abstract class C15105a<R extends C15044g, A extends C15019b> extends BasePendingResult<R> implements C15106b<R> {

        /* renamed from: a */
        public final C15020c<A> f39058a;

        /* renamed from: b */
        public final C15017a<?> f39059b;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo38136a(A a) throws RemoteException;

        protected C15105a(C15017a<?> aVar, C15037d dVar) {
            super((C15037d) C15267r.m44385a(dVar, (Object) "GoogleApiClient must not be null"));
            C15267r.m44385a(aVar, (Object) "Api must not be null");
            this.f39058a = aVar.mo38208b();
            this.f39059b = aVar;
        }

        /* renamed from: b */
        public final void mo38365b(A a) throws DeadObjectException {
            if (a instanceof C15268s) {
                a = ((C15268s) a).f39465a;
            }
            try {
                mo38136a(a);
            } catch (DeadObjectException e) {
                m43823a((RemoteException) e);
                throw e;
            } catch (RemoteException e2) {
                m43823a(e2);
            }
        }

        /* renamed from: b */
        public final void mo38364b(Status status) {
            C15267r.m44395b(!status.mo38201c(), "Failed result must not be success");
            mo38267a(mo38135a(status));
        }

        /* renamed from: a */
        private void m43823a(RemoteException remoteException) {
            mo38364b(new Status(8, remoteException.getLocalizedMessage(), null));
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo38363a(Object obj) {
            super.mo38267a((C15044g) obj);
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.c$b */
    public interface C15106b<R> {
        /* renamed from: a */
        void mo38363a(R r);
    }
}
