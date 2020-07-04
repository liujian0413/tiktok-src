package com.p1848vk.sdk.api.photo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.C1642a;
import com.p1848vk.sdk.C47217c;
import com.p1848vk.sdk.C47218d;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: com.vk.sdk.api.photo.VKUploadImage */
public class VKUploadImage extends C47217c implements Parcelable {
    public static final Creator<VKUploadImage> CREATOR = new Creator<VKUploadImage>() {
        /* renamed from: a */
        private static VKUploadImage[] m147664a(int i) {
            return new VKUploadImage[i];
        }

        /* renamed from: a */
        private static VKUploadImage m147663a(Parcel parcel) {
            return new VKUploadImage(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m147663a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m147664a(i);
        }
    };

    /* renamed from: a */
    public final Bitmap f121348a;

    /* renamed from: b */
    public final VKImageParameters f121349b;

    public int describeContents() {
        return 0;
    }

    /* renamed from: c */
    public final File mo118678c() {
        File file;
        Context a = C47218d.m147673a();
        if (a != null) {
            File externalCacheDir = a.getExternalCacheDir();
            if (externalCacheDir == null || !externalCacheDir.canWrite()) {
                file = a.getCacheDir();
            } else {
                file = externalCacheDir;
            }
        } else {
            file = null;
        }
        try {
            File createTempFile = File.createTempFile("tmpImg", C1642a.m8034a(".%s", new Object[]{this.f121349b.mo118673c()}), file);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                if (this.f121349b.f121342a == C47212a.Png) {
                    this.f121348a.compress(CompressFormat.PNG, 100, fileOutputStream);
                } else {
                    this.f121348a.compress(CompressFormat.JPEG, (int) (this.f121349b.f121343b * 100.0f), fileOutputStream);
                }
                fileOutputStream.close();
                return createTempFile;
            } catch (IOException unused) {
                return createTempFile;
            }
        } catch (IOException unused2) {
            return null;
        }
    }

    private VKUploadImage(Parcel parcel) {
        this.f121348a = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.f121349b = (VKImageParameters) parcel.readParcelable(VKImageParameters.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f121348a, 0);
        parcel.writeParcelable(this.f121349b, 0);
    }
}
