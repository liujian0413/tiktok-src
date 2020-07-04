package com.google.android.gms.common.data;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

public class BitmapTeleporter extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<BitmapTeleporter> CREATOR = new C15178a();

    /* renamed from: a */
    private final int f39253a;

    /* renamed from: b */
    private ParcelFileDescriptor f39254b;

    /* renamed from: c */
    private final int f39255c;

    /* renamed from: d */
    private Bitmap f39256d;

    /* renamed from: e */
    private File f39257e;

    BitmapTeleporter(int i, ParcelFileDescriptor parcelFileDescriptor, int i2) {
        this.f39253a = i;
        this.f39254b = parcelFileDescriptor;
        this.f39255c = i2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (this.f39254b == null) {
            Bitmap bitmap = this.f39256d;
            ByteBuffer allocate = ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight());
            bitmap.copyPixelsToBuffer(allocate);
            byte[] array = allocate.array();
            DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(m44161a()));
            try {
                dataOutputStream.writeInt(array.length);
                dataOutputStream.writeInt(bitmap.getWidth());
                dataOutputStream.writeInt(bitmap.getHeight());
                dataOutputStream.writeUTF(bitmap.getConfig().toString());
                dataOutputStream.write(array);
                m44162a(dataOutputStream);
            } catch (IOException e) {
                throw new IllegalStateException("Could not write into unlinked file", e);
            } catch (Throwable th) {
                m44162a(dataOutputStream);
                throw th;
            }
        }
        int i2 = i | 1;
        int a = C15269a.m44442a(parcel);
        C15269a.m44447a(parcel, 1, this.f39253a);
        C15269a.m44452a(parcel, 2, (Parcelable) this.f39254b, i2, false);
        C15269a.m44447a(parcel, 3, this.f39255c);
        C15269a.m44443a(parcel, a);
        this.f39254b = null;
    }

    /* renamed from: a */
    private final FileOutputStream m44161a() {
        if (this.f39257e != null) {
            try {
                File createTempFile = File.createTempFile("teleporter", ".tmp", this.f39257e);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                    this.f39254b = ParcelFileDescriptor.open(createTempFile, 268435456);
                    createTempFile.delete();
                    return fileOutputStream;
                } catch (FileNotFoundException unused) {
                    throw new IllegalStateException("Temporary file is somehow already deleted");
                }
            } catch (IOException e) {
                throw new IllegalStateException("Could not create temporary file", e);
            }
        } else {
            throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
        }
    }

    /* renamed from: a */
    private static void m44162a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }
}
