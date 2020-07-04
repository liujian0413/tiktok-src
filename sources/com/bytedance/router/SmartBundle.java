package com.bytedance.router;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;

public class SmartBundle {
    private Bundle mBundle;

    public Bundle getBundle() {
        return this.mBundle;
    }

    public void clear() {
        this.mBundle.clear();
    }

    public ClassLoader getClassLoader() {
        return this.mBundle.getClassLoader();
    }

    public boolean hasFileDescriptors() {
        return this.mBundle.hasFileDescriptors();
    }

    public boolean isEmpty() {
        return this.mBundle.isEmpty();
    }

    public Set<String> keySet() {
        return this.mBundle.keySet();
    }

    public int size() {
        return this.mBundle.size();
    }

    public synchronized String toString() {
        return this.mBundle.toString();
    }

    public boolean containsKey(String str) {
        return this.mBundle.containsKey(str);
    }

    public Object get(String str) {
        return this.mBundle.get(str);
    }

    public boolean getBoolean(String str) {
        return getBoolean(str, false);
    }

    public boolean[] getBooleanArray(String str) {
        return this.mBundle.getBooleanArray(str);
    }

    public Bundle getBundle(String str) {
        return this.mBundle.getBundle(str);
    }

    public byte[] getByteArray(String str) {
        return this.mBundle.getByteArray(str);
    }

    public char getChar(String str) {
        return getChar(str, 0);
    }

    public char[] getCharArray(String str) {
        return this.mBundle.getCharArray(str);
    }

    public CharSequence getCharSequence(String str) {
        return this.mBundle.getCharSequence(str);
    }

    public CharSequence[] getCharSequenceArray(String str) {
        return this.mBundle.getCharSequenceArray(str);
    }

    public ArrayList<CharSequence> getCharSequenceArrayList(String str) {
        return this.mBundle.getCharSequenceArrayList(str);
    }

    public double getDouble(String str) {
        return getDouble(str, 0.0d);
    }

    public double[] getDoubleArray(String str) {
        return this.mBundle.getDoubleArray(str);
    }

    public float getFloat(String str) {
        return getFloat(str, 0.0f);
    }

    public float[] getFloatArray(String str) {
        return this.mBundle.getFloatArray(str);
    }

    public int getInt(String str) {
        return getInt(str, 0);
    }

    public int[] getIntArray(String str) {
        return this.mBundle.getIntArray(str);
    }

    public ArrayList<Integer> getIntegerArrayList(String str) {
        return this.mBundle.getIntegerArrayList(str);
    }

    public long getLong(String str) {
        return getLong(str, 0);
    }

    public long[] getLongArray(String str) {
        return this.mBundle.getLongArray(str);
    }

    public <T extends Parcelable> T getParcelable(String str) {
        return this.mBundle.getParcelable(str);
    }

    public Parcelable[] getParcelableArray(String str) {
        return this.mBundle.getParcelableArray(str);
    }

    public <T extends Parcelable> ArrayList<T> getParcelableArrayList(String str) {
        return this.mBundle.getParcelableArrayList(str);
    }

    public Serializable getSerializable(String str) {
        return this.mBundle.getSerializable(str);
    }

    public short getShort(String str) {
        return getShort(str, 0);
    }

    public short[] getShortArray(String str) {
        return this.mBundle.getShortArray(str);
    }

    public <T extends Parcelable> SparseArray<T> getSparseParcelableArray(String str) {
        return this.mBundle.getSparseParcelableArray(str);
    }

    public String getString(String str) {
        return this.mBundle.getString(str);
    }

    public String[] getStringArray(String str) {
        return this.mBundle.getStringArray(str);
    }

    public ArrayList<String> getStringArrayList(String str) {
        return this.mBundle.getStringArrayList(str);
    }

    public void putAll(Bundle bundle) {
        this.mBundle.putAll(bundle);
    }

    public void remove(String str) {
        this.mBundle.remove(str);
    }

    public void setClassLoader(ClassLoader classLoader) {
        this.mBundle.setClassLoader(classLoader);
    }

    SmartBundle(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.mBundle = bundle;
    }

    public byte getByte(String str) {
        return getByte(str, 0).byteValue();
    }

    public void putBoolean(String str, boolean z) {
        this.mBundle.putBoolean(str, z);
    }

    public void putBooleanArray(String str, boolean[] zArr) {
        this.mBundle.putBooleanArray(str, zArr);
    }

    public void putBundle(String str, Bundle bundle) {
        this.mBundle.putBundle(str, bundle);
    }

    public void putByte(String str, byte b) {
        this.mBundle.putByte(str, b);
    }

    public void putByteArray(String str, byte[] bArr) {
        this.mBundle.putByteArray(str, bArr);
    }

    public void putChar(String str, char c) {
        this.mBundle.putChar(str, c);
    }

    public void putCharArray(String str, char[] cArr) {
        this.mBundle.putCharArray(str, cArr);
    }

    public void putCharSequence(String str, CharSequence charSequence) {
        this.mBundle.putCharSequence(str, charSequence);
    }

    public void putCharSequenceArray(String str, CharSequence[] charSequenceArr) {
        this.mBundle.putCharSequenceArray(str, charSequenceArr);
    }

    public void putCharSequenceArrayList(String str, ArrayList<CharSequence> arrayList) {
        this.mBundle.putCharSequenceArrayList(str, arrayList);
    }

    public void putDouble(String str, double d) {
        this.mBundle.putDouble(str, d);
    }

    public void putDoubleArray(String str, double[] dArr) {
        this.mBundle.putDoubleArray(str, dArr);
    }

    public void putFloat(String str, float f) {
        this.mBundle.putFloat(str, f);
    }

    public void putFloatArray(String str, float[] fArr) {
        this.mBundle.putFloatArray(str, fArr);
    }

    public void putInt(String str, int i) {
        this.mBundle.putInt(str, i);
    }

    public void putIntArray(String str, int[] iArr) {
        this.mBundle.putIntArray(str, iArr);
    }

    public void putIntegerArrayList(String str, ArrayList<Integer> arrayList) {
        this.mBundle.putIntegerArrayList(str, arrayList);
    }

    public void putLong(String str, long j) {
        this.mBundle.putLong(str, j);
    }

    public void putLongArray(String str, long[] jArr) {
        this.mBundle.putLongArray(str, jArr);
    }

    public void putParcelable(String str, Parcelable parcelable) {
        this.mBundle.putParcelable(str, parcelable);
    }

    public void putParcelableArray(String str, Parcelable[] parcelableArr) {
        this.mBundle.putParcelableArray(str, parcelableArr);
    }

    public void putParcelableArrayList(String str, ArrayList<? extends Parcelable> arrayList) {
        this.mBundle.putParcelableArrayList(str, arrayList);
    }

    public void putSerializable(String str, Serializable serializable) {
        this.mBundle.putSerializable(str, serializable);
    }

    public void putShort(String str, short s) {
        this.mBundle.putShort(str, s);
    }

    public void putShortArray(String str, short[] sArr) {
        this.mBundle.putShortArray(str, sArr);
    }

    public void putSparseParcelableArray(String str, SparseArray<? extends Parcelable> sparseArray) {
        this.mBundle.putSparseParcelableArray(str, sparseArray);
    }

    public void putString(String str, String str2) {
        this.mBundle.putString(str, str2);
    }

    public void putStringArray(String str, String[] strArr) {
        this.mBundle.putStringArray(str, strArr);
    }

    public void putStringArrayList(String str, ArrayList<String> arrayList) {
        this.mBundle.putStringArrayList(str, arrayList);
    }

    public void writeToParcel(Parcel parcel, int i) {
        this.mBundle.writeToParcel(parcel, i);
    }

    public CharSequence getCharSequence(String str, CharSequence charSequence) {
        return this.mBundle.getCharSequence(str, charSequence);
    }

    public String getString(String str, String str2) {
        return this.mBundle.getString(str, str2);
    }

    public boolean getBoolean(String str, boolean z) {
        Bundle bundle = this.mBundle;
        if (bundle == null) {
            return z;
        }
        Object obj = bundle.get(str);
        if (obj == null) {
            return z;
        }
        if (obj instanceof String) {
            try {
                return Boolean.parseBoolean((String) obj);
            } catch (NumberFormatException e) {
                String str2 = str;
                typeWarning(str2, obj, "Boolean", Boolean.valueOf(z), e);
                return z;
            }
        } else {
            try {
                return ((Boolean) obj).booleanValue();
            } catch (ClassCastException e2) {
                String str3 = str;
                typeWarning(str3, obj, "Boolean", Boolean.valueOf(z), e2);
                return z;
            }
        }
    }

    public double getDouble(String str, double d) {
        Bundle bundle = this.mBundle;
        if (bundle == null) {
            return d;
        }
        Object obj = bundle.get(str);
        if (obj == null) {
            return d;
        }
        if (obj instanceof String) {
            try {
                return Double.parseDouble((String) obj);
            } catch (NumberFormatException e) {
                String str2 = str;
                typeWarning(str2, obj, "Double", Double.valueOf(d), e);
                return d;
            }
        } else {
            try {
                return ((Double) obj).doubleValue();
            } catch (ClassCastException e2) {
                String str3 = str;
                typeWarning(str3, obj, "Double", Double.valueOf(d), e2);
                return d;
            }
        }
    }

    public float getFloat(String str, float f) {
        Bundle bundle = this.mBundle;
        if (bundle == null) {
            return f;
        }
        Object obj = bundle.get(str);
        if (obj == null) {
            return f;
        }
        if (obj instanceof String) {
            try {
                return Float.parseFloat((String) obj);
            } catch (NumberFormatException e) {
                String str2 = str;
                typeWarning(str2, obj, "Float", Float.valueOf(f), e);
                return f;
            }
        } else {
            try {
                return ((Float) obj).floatValue();
            } catch (ClassCastException e2) {
                String str3 = str;
                typeWarning(str3, obj, "Float", Float.valueOf(f), e2);
                return f;
            }
        }
    }

    public int getInt(String str, int i) {
        Bundle bundle = this.mBundle;
        if (bundle == null) {
            return i;
        }
        Object obj = bundle.get(str);
        if (obj == null) {
            return i;
        }
        if (obj instanceof String) {
            try {
                return Integer.parseInt((String) obj);
            } catch (NumberFormatException e) {
                String str2 = str;
                typeWarning(str2, obj, "Integer", Integer.valueOf(i), e);
                return i;
            }
        } else {
            try {
                return ((Integer) obj).intValue();
            } catch (ClassCastException e2) {
                String str3 = str;
                typeWarning(str3, obj, "Integer", Integer.valueOf(i), e2);
                return i;
            }
        }
    }

    public long getLong(String str, long j) {
        Bundle bundle = this.mBundle;
        if (bundle == null) {
            return j;
        }
        Object obj = bundle.get(str);
        if (obj == null) {
            return j;
        }
        if (obj instanceof String) {
            try {
                return Long.parseLong((String) obj);
            } catch (NumberFormatException e) {
                String str2 = str;
                typeWarning(str2, obj, "Long", Long.valueOf(j), e);
                return j;
            }
        } else {
            try {
                return ((Long) obj).longValue();
            } catch (ClassCastException e2) {
                String str3 = str;
                typeWarning(str3, obj, "Long", Long.valueOf(j), e2);
                return j;
            }
        }
    }

    public Byte getByte(String str, byte b) {
        Bundle bundle = this.mBundle;
        if (bundle == null) {
            return Byte.valueOf(b);
        }
        Object obj = bundle.get(str);
        if (obj == null) {
            return Byte.valueOf(b);
        }
        if (obj instanceof String) {
            try {
                return Byte.valueOf(Byte.parseByte((String) obj));
            } catch (NumberFormatException e) {
                NumberFormatException numberFormatException = e;
                typeWarning(str, obj, "Byte", Byte.valueOf(b), numberFormatException);
                return Byte.valueOf(b);
            }
        } else {
            try {
                return (Byte) obj;
            } catch (ClassCastException e2) {
                typeWarning(str, obj, "Byte", Byte.valueOf(b), e2);
                return Byte.valueOf(b);
            }
        }
    }

    public char getChar(String str, char c) {
        Bundle bundle = this.mBundle;
        if (bundle == null) {
            return c;
        }
        Object obj = bundle.get(str);
        if (obj == null) {
            return c;
        }
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (str2.length() == 1) {
                return str2.charAt(0);
            }
            typeWarning(str, obj, "Char", Character.valueOf(c), null);
            return c;
        }
        try {
            return ((Character) obj).charValue();
        } catch (ClassCastException e) {
            String str3 = str;
            typeWarning(str3, obj, "Char", Character.valueOf(c), e);
            return c;
        }
    }

    public short getShort(String str, short s) {
        Bundle bundle = this.mBundle;
        if (bundle == null) {
            return s;
        }
        Object obj = bundle.get(str);
        if (obj == null) {
            return s;
        }
        if (obj instanceof String) {
            try {
                return Short.valueOf(Short.parseShort((String) obj)).shortValue();
            } catch (NumberFormatException e) {
                String str2 = str;
                typeWarning(str2, obj, "Short", Short.valueOf(s), e);
                return s;
            }
        } else {
            try {
                return ((Short) obj).shortValue();
            } catch (ClassCastException e2) {
                String str3 = str;
                typeWarning(str3, obj, "Short", Short.valueOf(s), e2);
                return s;
            }
        }
    }

    private void typeWarning(String str, Object obj, String str2, Object obj2, RuntimeException runtimeException) {
        StringBuilder sb = new StringBuilder();
        sb.append("Key ");
        sb.append(str);
        sb.append(" expected ");
        sb.append(str2);
        sb.append(" but value was a ");
        sb.append(obj.getClass().getName());
        sb.append(".  The default value ");
        sb.append(obj2);
        sb.append(" was returned.");
    }
}
