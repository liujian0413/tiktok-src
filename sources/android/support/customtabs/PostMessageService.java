package android.support.customtabs;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.C0232i.C0233a;

public class PostMessageService extends Service {

    /* renamed from: a */
    private C0233a f832a = new C0233a() {
        /* renamed from: a */
        public final void mo627a(C0226g gVar, Bundle bundle) throws RemoteException {
            gVar.mo638a(bundle);
        }

        /* renamed from: a */
        public final void mo628a(C0226g gVar, String str, Bundle bundle) throws RemoteException {
            gVar.mo640b(str, bundle);
        }
    };

    public IBinder onBind(Intent intent) {
        return this.f832a;
    }
}
