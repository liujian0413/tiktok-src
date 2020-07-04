package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.ParcelFileDescriptor.AutoCloseOutputStream;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.C14793ay;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.C15329l;
import java.io.DataInputStream;
import java.io.IOException;

@C6505uv
public final class zzaxu extends AbstractSafeParcelable {
    public static final Creator<zzaxu> CREATOR = new C16138wi();

    /* renamed from: a */
    private ParcelFileDescriptor f45652a;

    /* renamed from: b */
    private Parcelable f45653b;

    /* renamed from: c */
    private boolean f45654c;

    public zzaxu(ParcelFileDescriptor parcelFileDescriptor) {
        this.f45652a = parcelFileDescriptor;
        this.f45654c = true;
    }

    public zzaxu(SafeParcelable safeParcelable) {
        this.f45653b = safeParcelable;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final <T extends SafeParcelable> T mo42176a(Creator<T> creator) {
        if (this.f45654c) {
            if (this.f45652a == null) {
                acd.m45779c("File descriptor is empty, returning null.");
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(new AutoCloseInputStream(this.f45652a));
            try {
                byte[] bArr = new byte[dataInputStream.readInt()];
                dataInputStream.readFully(bArr, 0, bArr.length);
                C15329l.m44589a(dataInputStream);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.unmarshall(bArr, 0, bArr.length);
                    obtain.setDataPosition(0);
                    this.f45653b = (SafeParcelable) creator.createFromParcel(obtain);
                    obtain.recycle();
                    this.f45654c = false;
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            } catch (IOException e) {
                acd.m45778b("Could not read from parcel file descriptor", e);
                C15329l.m44589a(dataInputStream);
                return null;
            } catch (Throwable th2) {
                C15329l.m44589a(dataInputStream);
                throw th2;
            }
        }
        return (SafeParcelable) this.f45653b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        m52667a();
        int a = C15269a.m44442a(parcel);
        C15269a.m44452a(parcel, 2, (Parcelable) this.f45652a, i, false);
        C15269a.m44443a(parcel, a);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private final ParcelFileDescriptor m52667a() {
        if (this.f45652a == null) {
            Parcel obtain = Parcel.obtain();
            try {
                this.f45653b.writeToParcel(obtain, 0);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                this.f45652a = m52668a(marshall);
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        }
        return this.f45652a;
    }

    /* renamed from: a */
    private final <T> ParcelFileDescriptor m52668a(byte[] bArr) {
        AutoCloseOutputStream autoCloseOutputStream;
        try {
            ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
            autoCloseOutputStream = new AutoCloseOutputStream(createPipe[1]);
            try {
                new Thread(new C16137wh(this, autoCloseOutputStream, bArr)).start();
                return createPipe[0];
            } catch (IOException e) {
                e = e;
                acd.m45778b("Error transporting the ad response", e);
                C14793ay.m42898d().mo39089a((Throwable) e, "LargeParcelTeleporter.pipeData.2");
                C15329l.m44589a(autoCloseOutputStream);
                return null;
            }
        } catch (IOException e2) {
            e = e2;
            autoCloseOutputStream = null;
            acd.m45778b("Error transporting the ad response", e);
            C14793ay.m42898d().mo39089a((Throwable) e, "LargeParcelTeleporter.pipeData.2");
            C15329l.m44589a(autoCloseOutputStream);
            return null;
        }
    }
}
