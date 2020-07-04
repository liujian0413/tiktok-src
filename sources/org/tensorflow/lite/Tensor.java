package org.tensorflow.lite;

import com.C1642a;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

public final class Tensor {

    /* renamed from: a */
    public final DataType f123501a;

    /* renamed from: b */
    public int[] f123502b;

    /* renamed from: c */
    private long f123503c;

    static {
        TensorFlowLite.m150041a();
    }

    private static native ByteBuffer buffer(long j);

    private static native long create(long j, int i);

    private static native void delete(long j);

    private static native int dtype(long j);

    private static native boolean hasDelegateBufferHandle(long j);

    private static native int index(long j);

    private static native int numBytes(long j);

    private static native void readMultiDimensionalArray(long j, Object obj);

    private static native int[] shape(long j);

    private static native void writeDirectBuffer(long j, ByteBuffer byteBuffer);

    private static native void writeMultiDimensionalArray(long j, Object obj);

    /* renamed from: c */
    private int m150027c() {
        return numBytes(this.f123503c);
    }

    /* renamed from: d */
    private ByteBuffer m150028d() {
        return buffer(this.f123503c).order(ByteOrder.nativeOrder());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo122249b() {
        this.f123502b = shape(this.f123503c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo122246a() {
        delete(this.f123503c);
        this.f123503c = 0;
    }

    /* renamed from: j */
    private static boolean m150035j(Object obj) {
        return obj instanceof ByteBuffer;
    }

    /* renamed from: g */
    private void m150032g(Object obj) {
        m150033h(obj);
        m150034i(obj);
    }

    /* renamed from: e */
    private static int[] m150030e(Object obj) {
        int[] iArr = new int[m150031f(obj)];
        m150026a(obj, 0, iArr);
        return iArr;
    }

    private Tensor(long j) {
        this.f123503c = j;
        this.f123501a = DataType.fromC(dtype(j));
        this.f123502b = shape(j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final int[] mo122250c(Object obj) {
        if (obj == null || m150035j(obj)) {
            return null;
        }
        m150033h(obj);
        int[] e = m150030e(obj);
        if (Arrays.equals(this.f123502b, e)) {
            return null;
        }
        return e;
    }

    /* renamed from: f */
    private static int m150031f(Object obj) {
        if (obj == null || !obj.getClass().isArray()) {
            return 0;
        }
        if (Array.getLength(obj) != 0) {
            return m150031f(Array.get(obj, 0)) + 1;
        }
        throw new IllegalArgumentException("Array lengths cannot be 0.");
    }

    /* renamed from: h */
    private void m150033h(Object obj) {
        if (!m150035j(obj)) {
            DataType d = m150029d(obj);
            if (d != this.f123501a) {
                throw new IllegalArgumentException(C1642a.m8034a("Cannot convert between a TensorFlowLite tensor with type %s and a Java object of type %s (which is compatible with the TensorFlowLite type %s).", new Object[]{this.f123501a, obj.getClass().getName(), d}));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final Object mo122248b(Object obj) {
        if (obj != null) {
            m150032g(obj);
            if (obj instanceof ByteBuffer) {
                ((ByteBuffer) obj).put(m150028d());
                return obj;
            }
            readMultiDimensionalArray(this.f123503c, obj);
            return obj;
        } else if (hasDelegateBufferHandle(this.f123503c)) {
            return obj;
        } else {
            throw new IllegalArgumentException("Null outputs are allowed only if the Tensor is bound to a buffer handle.");
        }
    }

    /* renamed from: d */
    private static DataType m150029d(Object obj) {
        if (obj != null) {
            Class cls = obj.getClass();
            while (cls.isArray()) {
                cls = cls.getComponentType();
            }
            if (Float.TYPE.equals(cls)) {
                return DataType.FLOAT32;
            }
            if (Integer.TYPE.equals(cls)) {
                return DataType.INT32;
            }
            if (Byte.TYPE.equals(cls)) {
                return DataType.UINT8;
            }
            if (Long.TYPE.equals(cls)) {
                return DataType.INT64;
            }
            if (String.class.equals(cls)) {
                return DataType.STRING;
            }
        }
        StringBuilder sb = new StringBuilder("DataType error: cannot resolve DataType of ");
        sb.append(obj.getClass().getName());
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: i */
    private void m150034i(Object obj) {
        if (m150035j(obj)) {
            ByteBuffer byteBuffer = (ByteBuffer) obj;
            if (byteBuffer.capacity() != m150027c()) {
                throw new IllegalArgumentException(C1642a.m8034a("Cannot convert between a TensorFlowLite buffer with %d bytes and a ByteBuffer with %d bytes.", new Object[]{Integer.valueOf(m150027c()), Integer.valueOf(byteBuffer.capacity())}));
            }
            return;
        }
        int[] e = m150030e(obj);
        if (!Arrays.equals(e, this.f123502b)) {
            throw new IllegalArgumentException(C1642a.m8034a("Cannot copy between a TensorFlowLite tensor with shape %s and a Java object with shape %s.", new Object[]{Arrays.toString(this.f123502b), Arrays.toString(e)}));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo122247a(Object obj) {
        if (obj != null) {
            m150032g(obj);
            if (m150035j(obj)) {
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                if (!byteBuffer.isDirect() || byteBuffer.order() != ByteOrder.nativeOrder()) {
                    m150028d().put(byteBuffer);
                } else {
                    writeDirectBuffer(this.f123503c, byteBuffer);
                }
            } else {
                writeMultiDimensionalArray(this.f123503c, obj);
            }
        } else if (!hasDelegateBufferHandle(this.f123503c)) {
            throw new IllegalArgumentException("Null inputs are allowed only if the Tensor is bound to a buffer handle.");
        }
    }

    /* renamed from: a */
    static Tensor m150025a(long j, int i) {
        return new Tensor(create(j, i));
    }

    /* renamed from: a */
    private static void m150026a(Object obj, int i, int[] iArr) {
        if (iArr != null && i != iArr.length) {
            int length = Array.getLength(obj);
            if (iArr[i] == 0) {
                iArr[i] = length;
            } else if (iArr[i] != length) {
                throw new IllegalArgumentException(C1642a.m8034a("Mismatched lengths (%d and %d) in dimension %d", new Object[]{Integer.valueOf(iArr[i]), Integer.valueOf(length), Integer.valueOf(i)}));
            }
            for (int i2 = 0; i2 < length; i2++) {
                m150026a(Array.get(obj, i2), i + 1, iArr);
            }
        }
    }
}
