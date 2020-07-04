package android.support.p022v4.p027os;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import android.support.p022v4.p027os.IResultReceiver.Stub;

/* renamed from: android.support.v4.os.ResultReceiver */
public class ResultReceiver implements Parcelable {
    public static final Creator<ResultReceiver> CREATOR = new Creator<ResultReceiver>() {
        /* renamed from: a */
        private static ResultReceiver[] m3738a(int i) {
            return new ResultReceiver[i];
        }

        /* renamed from: a */
        private static ResultReceiver m3737a(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m3737a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m3738a(i);
        }
    };

    /* renamed from: a */
    final boolean f3094a;

    /* renamed from: b */
    final Handler f3095b;

    /* renamed from: c */
    IResultReceiver f3096c;

    /* renamed from: android.support.v4.os.ResultReceiver$a */
    class C0876a extends Stub {
        C0876a() {
        }

        /* renamed from: a */
        public final void mo3267a(int i, Bundle bundle) {
            if (ResultReceiver.this.f3095b != null) {
                ResultReceiver.this.f3095b.post(new C0877b(i, bundle));
            } else {
                ResultReceiver.this.mo2983a(i, bundle);
            }
        }
    }

    /* renamed from: android.support.v4.os.ResultReceiver$b */
    class C0877b implements Runnable {

        /* renamed from: a */
        final int f3098a;

        /* renamed from: b */
        final Bundle f3099b;

        public final void run() {
            ResultReceiver.this.mo2983a(this.f3098a, this.f3099b);
        }

        C0877b(int i, Bundle bundle) {
            this.f3098a = i;
            this.f3099b = bundle;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2983a(int i, Bundle bundle) {
    }

    public int describeContents() {
        return 0;
    }

    ResultReceiver(Parcel parcel) {
        this.f3096c = Stub.m3733a(parcel.readStrongBinder());
    }

    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.f3096c == null) {
                this.f3096c = new C0876a();
            }
            parcel.writeStrongBinder(this.f3096c.asBinder());
        }
    }

    /* renamed from: b */
    public final void mo3271b(int i, Bundle bundle) {
        if (!this.f3094a) {
            if (this.f3096c != null) {
                try {
                    this.f3096c.mo3267a(i, bundle);
                } catch (RemoteException unused) {
                }
            }
        } else if (this.f3095b != null) {
            this.f3095b.post(new C0877b(i, bundle));
        } else {
            mo2983a(i, bundle);
        }
    }
}
