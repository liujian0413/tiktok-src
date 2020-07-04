package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: com.google.android.gms.common.internal.safeparcel.a */
public final class C15269a {
    /* renamed from: b */
    private static void m44465b(Parcel parcel, int i, int i2) {
        if (i2 >= 65535) {
            parcel.writeInt(i | -65536);
            parcel.writeInt(i2);
            return;
        }
        parcel.writeInt(i | (i2 << 16));
    }

    /* renamed from: b */
    private static int m44464b(Parcel parcel, int i) {
        parcel.writeInt(i | -65536);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* renamed from: c */
    private static void m44467c(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        int i2 = dataPosition - i;
        parcel.setDataPosition(i - 4);
        parcel.writeInt(i2);
        parcel.setDataPosition(dataPosition);
    }

    /* renamed from: a */
    public static int m44442a(Parcel parcel) {
        return m44464b(parcel, 20293);
    }

    /* renamed from: a */
    public static void m44443a(Parcel parcel, int i) {
        m44467c(parcel, i);
    }

    /* renamed from: a */
    public static void m44459a(Parcel parcel, int i, boolean z) {
        m44465b(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: a */
    public static void m44444a(Parcel parcel, int i, byte b) {
        m44465b(parcel, i, 4);
        parcel.writeInt(b);
    }

    /* renamed from: a */
    public static void m44447a(Parcel parcel, int i, int i2) {
        m44465b(parcel, i, 4);
        parcel.writeInt(i2);
    }

    /* renamed from: a */
    public static void m44455a(Parcel parcel, int i, Integer num, boolean z) {
        if (num != null) {
            m44465b(parcel, i, 4);
            parcel.writeInt(num.intValue());
        }
    }

    /* renamed from: a */
    public static void m44448a(Parcel parcel, int i, long j) {
        m44465b(parcel, i, 8);
        parcel.writeLong(j);
    }

    /* renamed from: a */
    public static void m44456a(Parcel parcel, int i, Long l, boolean z) {
        if (l != null) {
            m44465b(parcel, i, 8);
            parcel.writeLong(l.longValue());
        }
    }

    /* renamed from: a */
    public static void m44446a(Parcel parcel, int i, float f) {
        m44465b(parcel, i, 4);
        parcel.writeFloat(f);
    }

    /* renamed from: a */
    public static void m44454a(Parcel parcel, int i, Float f, boolean z) {
        if (f != null) {
            m44465b(parcel, i, 4);
            parcel.writeFloat(f.floatValue());
        }
    }

    /* renamed from: a */
    public static void m44445a(Parcel parcel, int i, double d) {
        m44465b(parcel, i, 8);
        parcel.writeDouble(d);
    }

    /* renamed from: a */
    public static void m44453a(Parcel parcel, int i, Double d, boolean z) {
        if (d != null) {
            m44465b(parcel, 8, 8);
            parcel.writeDouble(d.doubleValue());
        }
    }

    /* renamed from: a */
    public static void m44457a(Parcel parcel, int i, String str, boolean z) {
        if (str == null) {
            if (z) {
                m44465b(parcel, i, 0);
            }
            return;
        }
        int b = m44464b(parcel, i);
        parcel.writeString(str);
        m44467c(parcel, b);
    }

    /* renamed from: a */
    public static void m44450a(Parcel parcel, int i, IBinder iBinder, boolean z) {
        if (iBinder != null) {
            int b = m44464b(parcel, i);
            parcel.writeStrongBinder(iBinder);
            m44467c(parcel, b);
        }
    }

    /* renamed from: a */
    public static void m44452a(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable == null) {
            if (z) {
                m44465b(parcel, i, 0);
            }
            return;
        }
        int b = m44464b(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        m44467c(parcel, b);
    }

    /* renamed from: a */
    public static void m44449a(Parcel parcel, int i, Bundle bundle, boolean z) {
        if (bundle != null) {
            int b = m44464b(parcel, i);
            parcel.writeBundle(bundle);
            m44467c(parcel, b);
        }
    }

    /* renamed from: a */
    public static void m44460a(Parcel parcel, int i, byte[] bArr, boolean z) {
        if (bArr == null) {
            if (z) {
                m44465b(parcel, i, 0);
            }
            return;
        }
        int b = m44464b(parcel, i);
        parcel.writeByteArray(bArr);
        m44467c(parcel, b);
    }

    /* renamed from: a */
    public static void m44462a(Parcel parcel, int i, String[] strArr, boolean z) {
        if (strArr != null) {
            int b = m44464b(parcel, i);
            parcel.writeStringArray(strArr);
            m44467c(parcel, b);
        }
    }

    /* renamed from: a */
    public static void m44458a(Parcel parcel, int i, List<Integer> list, boolean z) {
        if (list != null) {
            int b = m44464b(parcel, 53);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(((Integer) list.get(i2)).intValue());
            }
            m44467c(parcel, b);
        }
    }

    /* renamed from: b */
    public static void m44466b(Parcel parcel, int i, List<String> list, boolean z) {
        if (list != null) {
            int b = m44464b(parcel, i);
            parcel.writeStringList(list);
            m44467c(parcel, b);
        }
    }

    /* renamed from: a */
    public static <T extends Parcelable> void m44461a(Parcel parcel, int i, T[] tArr, int i2, boolean z) {
        if (tArr != null) {
            int b = m44464b(parcel, i);
            parcel.writeInt(r7);
            for (T t : tArr) {
                if (t == null) {
                    parcel.writeInt(0);
                } else {
                    m44463a(parcel, t, i2);
                }
            }
            m44467c(parcel, b);
        }
    }

    /* renamed from: c */
    public static <T extends Parcelable> void m44468c(Parcel parcel, int i, List<T> list, boolean z) {
        if (list == null) {
            if (z) {
                m44465b(parcel, i, 0);
            }
            return;
        }
        int b = m44464b(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                m44463a(parcel, (T) parcelable, 0);
            }
        }
        m44467c(parcel, b);
    }

    /* renamed from: a */
    private static <T extends Parcelable> void m44463a(Parcel parcel, T t, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        t.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    /* renamed from: a */
    public static void m44451a(Parcel parcel, int i, Parcel parcel2, boolean z) {
        if (parcel2 != null) {
            int b = m44464b(parcel, 2);
            parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            m44467c(parcel, b);
        }
    }

    /* renamed from: d */
    public static void m44469d(Parcel parcel, int i, List list, boolean z) {
        if (list != null) {
            int b = m44464b(parcel, 3);
            parcel.writeList(list);
            m44467c(parcel, b);
        }
    }
}
