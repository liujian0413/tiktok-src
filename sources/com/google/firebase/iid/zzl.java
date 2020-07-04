package com.google.firebase.iid;

import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.RemoteException;

public class zzl implements Parcelable {
    public static final Creator<zzl> CREATOR = new C18318ap();

    /* renamed from: a */
    private Messenger f49864a;

    /* renamed from: b */
    private C18327ay f49865b;

    /* renamed from: com.google.firebase.iid.zzl$a */
    public static final class C18357a extends ClassLoader {
        /* access modifiers changed from: protected */
        public final Class<?> loadClass(String str, boolean z) throws ClassNotFoundException {
            if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
                return super.loadClass(str, z);
            }
            FirebaseInstanceId.m60328g();
            return zzl.class;
        }
    }

    public zzl(IBinder iBinder) {
        if (VERSION.SDK_INT >= 21) {
            this.f49864a = new Messenger(iBinder);
        } else {
            this.f49865b = new C18328az(iBinder);
        }
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public final void mo47281a(Message message) throws RemoteException {
        if (this.f49864a != null) {
            this.f49864a.send(message);
        } else {
            this.f49865b.mo47240a(message);
        }
    }

    /* renamed from: a */
    private final IBinder m60496a() {
        return this.f49864a != null ? this.f49864a.getBinder() : this.f49865b.asBinder();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return m60496a().equals(((zzl) obj).m60496a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        return m60496a().hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (this.f49864a != null) {
            parcel.writeStrongBinder(this.f49864a.getBinder());
        } else {
            parcel.writeStrongBinder(this.f49865b.asBinder());
        }
    }
}
