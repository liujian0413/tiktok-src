package com.google.android.gms.maps;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.internal.p763e.C16377j;
import com.google.android.gms.maps.model.C16771c;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.p764a.C16719ab;
import com.google.android.gms.maps.p764a.C16723b;
import com.google.android.gms.maps.p764a.C16731j;
import com.google.android.gms.maps.p764a.C16733l;
import com.google.android.gms.maps.p764a.C16737p;

/* renamed from: com.google.android.gms.maps.c */
public final class C16749c {

    /* renamed from: a */
    private final C16723b f46746a;

    /* renamed from: com.google.android.gms.maps.c$a */
    public interface C16750a {
        /* renamed from: a */
        View mo43371a(C16771c cVar);

        /* renamed from: b */
        View mo43372b(C16771c cVar);
    }

    /* renamed from: com.google.android.gms.maps.c$b */
    public interface C16751b {
        /* renamed from: a */
        void mo43373a(C16771c cVar);
    }

    /* renamed from: com.google.android.gms.maps.c$c */
    public interface C16752c {
        /* renamed from: a */
        void mo43374a(LatLng latLng);
    }

    /* renamed from: com.google.android.gms.maps.c$d */
    public interface C16753d {
        /* renamed from: b */
        boolean mo43375b(C16771c cVar);
    }

    public C16749c(C16723b bVar) {
        this.f46746a = (C16723b) C15267r.m44384a(bVar);
    }

    /* renamed from: a */
    public final C16771c mo43364a(MarkerOptions markerOptions) {
        try {
            C16377j a = this.f46746a.mo43310a(markerOptions);
            if (a != null) {
                return new C16771c(a);
            }
            return null;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: a */
    public final void mo43365a(C16716a aVar) {
        try {
            this.f46746a.mo43311a(aVar.f46741a);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: a */
    public final void mo43366a(C16750a aVar) {
        try {
            this.f46746a.mo43312a((C16719ab) new C16796p(this, aVar));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: a */
    public final void mo43367a(C16751b bVar) {
        if (bVar == null) {
            try {
                this.f46746a.mo43313a((C16731j) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f46746a.mo43313a((C16731j) new C16795o(this, bVar));
        }
    }

    /* renamed from: a */
    public final void mo43368a(C16752c cVar) {
        if (cVar == null) {
            try {
                this.f46746a.mo43314a((C16733l) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f46746a.mo43314a((C16733l) new C16797q(this, cVar));
        }
    }

    /* renamed from: a */
    public final void mo43369a(C16753d dVar) {
        if (dVar == null) {
            try {
                this.f46746a.mo43315a((C16737p) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f46746a.mo43315a((C16737p) new C16794n(this, dVar));
        }
    }

    /* renamed from: b */
    public final void mo43370b(C16716a aVar) {
        try {
            this.f46746a.mo43316b(aVar.f46741a);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
