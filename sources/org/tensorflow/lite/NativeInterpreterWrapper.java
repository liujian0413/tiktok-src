package org.tensorflow.lite;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.tensorflow.lite.C7721b.C7722a;

final class NativeInterpreterWrapper implements AutoCloseable {

    /* renamed from: a */
    private long f123491a;

    /* renamed from: b */
    private long f123492b;

    /* renamed from: c */
    private long f123493c;

    /* renamed from: d */
    private ByteBuffer f123494d;

    /* renamed from: e */
    private Map<String, Integer> f123495e;

    /* renamed from: f */
    private Map<String, Integer> f123496f;

    /* renamed from: g */
    private Tensor[] f123497g;

    /* renamed from: h */
    private Tensor[] f123498h;

    /* renamed from: i */
    private boolean f123499i;
    private long inferenceDurationNanoseconds = -1;

    /* renamed from: j */
    private final List<C7720a> f123500j = new ArrayList();

    static {
        TensorFlowLite.m150041a();
    }

    private static native long allocateTensors(long j, long j2);

    private static native void allowBufferHandleOutput(long j, boolean z);

    private static native void allowFp16PrecisionForFp32(long j, boolean z);

    private static native void applyDelegate(long j, long j2, long j3);

    private static native long createErrorReporter(int i);

    private static native long createInterpreter(long j, long j2, int i);

    private static native long createModel(String str, long j);

    private static native long createModelWithBuffer(ByteBuffer byteBuffer, long j);

    private static native void delete(long j, long j2, long j3);

    private static native int getInputCount(long j);

    private static native String[] getInputNames(long j);

    private static native int getInputTensorIndex(long j, int i);

    private static native int getOutputCount(long j);

    private static native int getOutputDataType(long j, int i);

    private static native String[] getOutputNames(long j);

    private static native float getOutputQuantizationScale(long j, int i);

    private static native int getOutputQuantizationZeroPoint(long j, int i);

    private static native int getOutputTensorIndex(long j, int i);

    private static native void numThreads(long j, int i);

    private static native boolean resizeInput(long j, long j2, int i, int[] iArr);

    private static native void run(long j, long j2);

    private static native void useNNAPI(long j, boolean z);

    public final void close() {
        for (int i = 0; i < this.f123497g.length; i++) {
            if (this.f123497g[i] != null) {
                this.f123497g[i].mo122246a();
                this.f123497g[i] = null;
            }
        }
        for (int i2 = 0; i2 < this.f123498h.length; i2++) {
            if (this.f123498h[i2] != null) {
                this.f123498h[i2].mo122246a();
                this.f123498h[i2] = null;
            }
        }
        delete(this.f123491a, this.f123493c, this.f123492b);
        this.f123491a = 0;
        this.f123493c = 0;
        this.f123492b = 0;
        this.f123494d = null;
        this.f123495e = null;
        this.f123496f = null;
        this.f123499i = false;
        this.f123500j.clear();
    }

    /* renamed from: a */
    private void m150022a(boolean z) {
        useNNAPI(this.f123492b, z);
    }

    /* renamed from: a */
    private Tensor m150019a(int i) {
        if (i < 0 || i >= this.f123497g.length) {
            StringBuilder sb = new StringBuilder("Invalid input Tensor index: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        Tensor tensor = this.f123497g[i];
        if (tensor != null) {
            return tensor;
        }
        Tensor[] tensorArr = this.f123497g;
        Tensor a = Tensor.m150025a(this.f123492b, getInputTensorIndex(this.f123492b, i));
        tensorArr[i] = a;
        return a;
    }

    /* renamed from: b */
    private Tensor m150023b(int i) {
        if (i < 0 || i >= this.f123498h.length) {
            StringBuilder sb = new StringBuilder("Invalid output Tensor index: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        Tensor tensor = this.f123498h[i];
        if (tensor != null) {
            return tensor;
        }
        Tensor[] tensorArr = this.f123498h;
        Tensor a = Tensor.m150025a(this.f123492b, getOutputTensorIndex(this.f123492b, i));
        tensorArr[i] = a;
        return a;
    }

    /* renamed from: a */
    private void m150020a(int i, int[] iArr) {
        if (resizeInput(this.f123492b, this.f123491a, i, iArr)) {
            this.f123499i = false;
            if (this.f123497g[i] != null) {
                this.f123497g[i].mo122249b();
            }
        }
    }

    NativeInterpreterWrapper(ByteBuffer byteBuffer, C7722a aVar) {
        if (byteBuffer == null || (!(byteBuffer instanceof MappedByteBuffer) && (!byteBuffer.isDirect() || byteBuffer.order() != ByteOrder.nativeOrder()))) {
            throw new IllegalArgumentException("Model ByteBuffer should be either a MappedByteBuffer of the model file, or a direct ByteBuffer using ByteOrder.nativeOrder() which contains bytes of model content.");
        }
        this.f123494d = byteBuffer;
        long createErrorReporter = createErrorReporter(512);
        m150021a(createErrorReporter, createModelWithBuffer(this.f123494d, createErrorReporter), aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo122244a(Object[] objArr, Map<Integer, Object> map) {
        this.inferenceDurationNanoseconds = -1;
        if (objArr == null || objArr.length == 0) {
            throw new IllegalArgumentException("Input error: Inputs should not be null or empty.");
        } else if (map == null || map.isEmpty()) {
            throw new IllegalArgumentException("Input error: Outputs should not be null or empty.");
        } else {
            for (int i = 0; i < objArr.length; i++) {
                int[] c = m150019a(i).mo122250c(objArr[i]);
                if (c != null) {
                    m150020a(i, c);
                }
            }
            boolean z = !this.f123499i;
            if (z) {
                allocateTensors(this.f123492b, this.f123491a);
                this.f123499i = true;
            }
            for (int i2 = 0; i2 < objArr.length; i2++) {
                m150019a(i2).mo122247a(objArr[i2]);
            }
            long nanoTime = System.nanoTime();
            run(this.f123492b, this.f123491a);
            long nanoTime2 = System.nanoTime() - nanoTime;
            if (z) {
                for (int i3 = 0; i3 < this.f123498h.length; i3++) {
                    if (this.f123498h[i3] != null) {
                        this.f123498h[i3].mo122249b();
                    }
                }
            }
            for (Entry entry : map.entrySet()) {
                m150023b(((Integer) entry.getKey()).intValue()).mo122248b(entry.getValue());
            }
            this.inferenceDurationNanoseconds = nanoTime2;
        }
    }

    /* renamed from: a */
    private void m150021a(long j, long j2, C7722a aVar) {
        if (aVar == null) {
            aVar = new C7722a();
        }
        this.f123491a = j;
        this.f123493c = j2;
        this.f123492b = createInterpreter(j2, j, aVar.f20969a);
        this.f123497g = new Tensor[getInputCount(this.f123492b)];
        this.f123498h = new Tensor[getOutputCount(this.f123492b)];
        if (aVar.f20970b != null) {
            m150022a(aVar.f20970b.booleanValue());
        }
        if (aVar.f20971c != null) {
            allowFp16PrecisionForFp32(this.f123492b, aVar.f20971c.booleanValue());
        }
        if (aVar.f20972d != null) {
            allowBufferHandleOutput(this.f123492b, aVar.f20972d.booleanValue());
        }
        for (C7720a aVar2 : aVar.f20973e) {
            applyDelegate(this.f123492b, j, aVar2.mo20406a());
            this.f123500j.add(aVar2);
        }
        allocateTensors(this.f123492b, j);
        this.f123499i = true;
    }
}
