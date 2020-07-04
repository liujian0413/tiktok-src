package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public final class SafeParcelReader {

    public static class ParseException extends RuntimeException {
        public ParseException(String str, Parcel parcel) {
            int dataPosition = parcel.dataPosition();
            int dataSize = parcel.dataSize();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 41);
            sb.append(str);
            sb.append(" Parcel: pos=");
            sb.append(dataPosition);
            sb.append(" size=");
            sb.append(dataSize);
            super(sb.toString());
        }
    }

    /* renamed from: a */
    public static int m44407a(int i) {
        return i & 65535;
    }

    /* renamed from: a */
    public static int m44408a(Parcel parcel) {
        return parcel.readInt();
    }

    /* renamed from: E */
    private static int m44406E(Parcel parcel, int i) {
        return (i & -65536) != -65536 ? (i >> 16) & 65535 : parcel.readInt();
    }

    /* renamed from: a */
    public static void m44410a(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + m44406E(parcel, i));
    }

    /* renamed from: a */
    private static void m44411a(Parcel parcel, int i, int i2) {
        int E = m44406E(parcel, i);
        if (E != i2) {
            String hexString = Integer.toHexString(E);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb.append("Expected size ");
            sb.append(i2);
            sb.append(" got ");
            sb.append(E);
            sb.append(" (0x");
            sb.append(hexString);
            sb.append(")");
            throw new ParseException(sb.toString(), parcel);
        }
    }

    /* renamed from: a */
    private static void m44412a(Parcel parcel, int i, int i2, int i3) {
        if (i2 != i3) {
            String hexString = Integer.toHexString(i2);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb.append("Expected size ");
            sb.append(i3);
            sb.append(" got ");
            sb.append(i2);
            sb.append(" (0x");
            sb.append(hexString);
            sb.append(")");
            throw new ParseException(sb.toString(), parcel);
        }
    }

    /* renamed from: b */
    public static int m44414b(Parcel parcel) {
        int a = m44408a(parcel);
        int E = m44406E(parcel, a);
        int dataPosition = parcel.dataPosition();
        if (m44407a(a) != 20293) {
            String str = "Expected object header. Got 0x";
            String valueOf = String.valueOf(Integer.toHexString(a));
            throw new ParseException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), parcel);
        }
        int i = E + dataPosition;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(i);
        throw new ParseException(sb.toString(), parcel);
    }

    /* renamed from: b */
    public static boolean m44415b(Parcel parcel, int i) {
        m44411a(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    /* renamed from: c */
    public static byte m44417c(Parcel parcel, int i) {
        m44411a(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    /* renamed from: d */
    public static int m44419d(Parcel parcel, int i) {
        m44411a(parcel, i, 4);
        return parcel.readInt();
    }

    /* renamed from: e */
    public static Integer m44420e(Parcel parcel, int i) {
        int E = m44406E(parcel, i);
        if (E == 0) {
            return null;
        }
        m44412a(parcel, i, E, 4);
        return Integer.valueOf(parcel.readInt());
    }

    /* renamed from: f */
    public static long m44421f(Parcel parcel, int i) {
        m44411a(parcel, i, 8);
        return parcel.readLong();
    }

    /* renamed from: g */
    public static Long m44422g(Parcel parcel, int i) {
        int E = m44406E(parcel, i);
        if (E == 0) {
            return null;
        }
        m44412a(parcel, i, E, 8);
        return Long.valueOf(parcel.readLong());
    }

    /* renamed from: h */
    public static BigInteger m44423h(Parcel parcel, int i) {
        int E = m44406E(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (E == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + E);
        return new BigInteger(createByteArray);
    }

    /* renamed from: i */
    public static float m44424i(Parcel parcel, int i) {
        m44411a(parcel, i, 4);
        return parcel.readFloat();
    }

    /* renamed from: j */
    public static Float m44425j(Parcel parcel, int i) {
        int E = m44406E(parcel, i);
        if (E == 0) {
            return null;
        }
        m44412a(parcel, i, E, 4);
        return Float.valueOf(parcel.readFloat());
    }

    /* renamed from: k */
    public static double m44426k(Parcel parcel, int i) {
        m44411a(parcel, i, 8);
        return parcel.readDouble();
    }

    /* renamed from: l */
    public static Double m44427l(Parcel parcel, int i) {
        int E = m44406E(parcel, i);
        if (E == 0) {
            return null;
        }
        m44412a(parcel, i, E, 8);
        return Double.valueOf(parcel.readDouble());
    }

    /* renamed from: m */
    public static BigDecimal m44428m(Parcel parcel, int i) {
        int E = m44406E(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (E == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(dataPosition + E);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    /* renamed from: n */
    public static String m44429n(Parcel parcel, int i) {
        int E = m44406E(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (E == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + E);
        return readString;
    }

    /* renamed from: o */
    public static IBinder m44430o(Parcel parcel, int i) {
        int E = m44406E(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (E == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + E);
        return readStrongBinder;
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m44409a(Parcel parcel, int i, Creator<T> creator) {
        int E = m44406E(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (E == 0) {
            return null;
        }
        T t = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + E);
        return t;
    }

    /* renamed from: p */
    public static Bundle m44431p(Parcel parcel, int i) {
        int E = m44406E(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (E == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + E);
        return readBundle;
    }

    /* renamed from: q */
    public static byte[] m44432q(Parcel parcel, int i) {
        int E = m44406E(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (E == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + E);
        return createByteArray;
    }

    /* renamed from: r */
    public static boolean[] m44433r(Parcel parcel, int i) {
        int E = m44406E(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (E == 0) {
            return null;
        }
        boolean[] createBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(dataPosition + E);
        return createBooleanArray;
    }

    /* renamed from: s */
    public static int[] m44434s(Parcel parcel, int i) {
        int E = m44406E(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (E == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + E);
        return createIntArray;
    }

    /* renamed from: t */
    public static long[] m44435t(Parcel parcel, int i) {
        int E = m44406E(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (E == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + E);
        return createLongArray;
    }

    /* renamed from: u */
    public static BigInteger[] m44436u(Parcel parcel, int i) {
        int E = m44406E(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (E == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigInteger[] bigIntegerArr = new BigInteger[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            bigIntegerArr[i2] = new BigInteger(parcel.createByteArray());
        }
        parcel.setDataPosition(dataPosition + E);
        return bigIntegerArr;
    }

    /* renamed from: v */
    public static float[] m44437v(Parcel parcel, int i) {
        int E = m44406E(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (E == 0) {
            return null;
        }
        float[] createFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(dataPosition + E);
        return createFloatArray;
    }

    /* renamed from: w */
    public static double[] m44438w(Parcel parcel, int i) {
        int E = m44406E(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (E == 0) {
            return null;
        }
        double[] createDoubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(dataPosition + E);
        return createDoubleArray;
    }

    /* renamed from: x */
    public static BigDecimal[] m44439x(Parcel parcel, int i) {
        int E = m44406E(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (E == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigDecimal[] bigDecimalArr = new BigDecimal[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            byte[] createByteArray = parcel.createByteArray();
            bigDecimalArr[i2] = new BigDecimal(new BigInteger(createByteArray), parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + E);
        return bigDecimalArr;
    }

    /* renamed from: y */
    public static String[] m44440y(Parcel parcel, int i) {
        int E = m44406E(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (E == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + E);
        return createStringArray;
    }

    /* renamed from: z */
    public static ArrayList<Integer> m44441z(Parcel parcel, int i) {
        int E = m44406E(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (E == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + E);
        return arrayList;
    }

    /* renamed from: A */
    public static ArrayList<String> m44402A(Parcel parcel, int i) {
        int E = m44406E(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (E == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + E);
        return createStringArrayList;
    }

    /* renamed from: b */
    public static <T> T[] m44416b(Parcel parcel, int i, Creator<T> creator) {
        int E = m44406E(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (E == 0) {
            return null;
        }
        T[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + E);
        return createTypedArray;
    }

    /* renamed from: c */
    public static <T> ArrayList<T> m44418c(Parcel parcel, int i, Creator<T> creator) {
        int E = m44406E(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (E == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + E);
        return createTypedArrayList;
    }

    /* renamed from: B */
    public static Parcel m44403B(Parcel parcel, int i) {
        int E = m44406E(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (E == 0) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.appendFrom(parcel, dataPosition, E);
        parcel.setDataPosition(dataPosition + E);
        return obtain;
    }

    /* renamed from: C */
    public static Parcel[] m44404C(Parcel parcel, int i) {
        int E = m44406E(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (E == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        Parcel[] parcelArr = new Parcel[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            int readInt2 = parcel.readInt();
            if (readInt2 != 0) {
                int dataPosition2 = parcel.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, readInt2);
                parcelArr[i2] = obtain;
                parcel.setDataPosition(dataPosition2 + readInt2);
            } else {
                parcelArr[i2] = null;
            }
        }
        parcel.setDataPosition(dataPosition + E);
        return parcelArr;
    }

    /* renamed from: a */
    public static void m44413a(Parcel parcel, int i, List list, ClassLoader classLoader) {
        int E = m44406E(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (E != 0) {
            parcel.readList(list, classLoader);
            parcel.setDataPosition(dataPosition + E);
        }
    }

    /* renamed from: D */
    public static void m44405D(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Overread allowed size end=");
            sb.append(i);
            throw new ParseException(sb.toString(), parcel);
        }
    }
}
