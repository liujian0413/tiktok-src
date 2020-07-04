package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import android.support.p022v4.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;

public class IconCompatParcelizer {
    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f2732a = versionedParcel.mo6651b(iconCompat.f2732a, 1);
        iconCompat.f2734c = versionedParcel.mo6657b(iconCompat.f2734c, 2);
        iconCompat.f2735d = versionedParcel.mo6652b(iconCompat.f2735d, 3);
        iconCompat.f2736e = versionedParcel.mo6651b(iconCompat.f2736e, 4);
        iconCompat.f2737f = versionedParcel.mo6651b(iconCompat.f2737f, 5);
        iconCompat.f2738g = (ColorStateList) versionedParcel.mo6652b(iconCompat.f2738g, 6);
        iconCompat.f2740j = versionedParcel.mo6655b(iconCompat.f2740j, 7);
        iconCompat.mo2887c();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        iconCompat.mo2885a(false);
        versionedParcel.mo6642a(iconCompat.f2732a, 1);
        versionedParcel.mo6650a(iconCompat.f2734c, 2);
        versionedParcel.mo6644a(iconCompat.f2735d, 3);
        versionedParcel.mo6642a(iconCompat.f2736e, 4);
        versionedParcel.mo6642a(iconCompat.f2737f, 5);
        versionedParcel.mo6644a((Parcelable) iconCompat.f2738g, 6);
        versionedParcel.mo6648a(iconCompat.f2740j, 7);
    }
}
