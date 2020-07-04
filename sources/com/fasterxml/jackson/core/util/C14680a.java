package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType;
import com.p280ss.android.vesdk.filterparam.VETransitionFilterParam;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.fasterxml.jackson.core.util.a */
public final class C14680a extends OutputStream {

    /* renamed from: c */
    private static final byte[] f37966c = new byte[0];

    /* renamed from: a */
    public byte[] f37967a;

    /* renamed from: b */
    public int f37968b;

    /* renamed from: d */
    private final BufferRecycler f37969d;

    /* renamed from: e */
    private final LinkedList<byte[]> f37970e;

    /* renamed from: f */
    private int f37971f;

    public final void close() {
    }

    public final void flush() {
    }

    public C14680a() {
        this(null);
    }

    /* renamed from: a */
    public final byte[] mo37257a() {
        m42474c();
        return this.f37967a;
    }

    /* renamed from: b */
    public final byte[] mo37258b() {
        m42476e();
        return this.f37967a;
    }

    /* renamed from: c */
    private void m42474c() {
        this.f37971f = 0;
        this.f37968b = 0;
        if (!this.f37970e.isEmpty()) {
            this.f37970e.clear();
        }
    }

    /* renamed from: e */
    private void m42476e() {
        this.f37971f += this.f37967a.length;
        int max = Math.max(this.f37971f >> 1, 1000);
        if (max > 262144) {
            max = 262144;
        }
        this.f37970e.add(this.f37967a);
        this.f37967a = new byte[max];
        this.f37968b = 0;
    }

    /* renamed from: d */
    private byte[] m42475d() {
        int i = this.f37971f + this.f37968b;
        if (i == 0) {
            return f37966c;
        }
        byte[] bArr = new byte[i];
        Iterator it = this.f37970e.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i2, length);
            i2 += length;
        }
        System.arraycopy(this.f37967a, 0, bArr, i2, this.f37968b);
        int i3 = i2 + this.f37968b;
        if (i3 == i) {
            if (!this.f37970e.isEmpty()) {
                m42474c();
            }
            return bArr;
        }
        StringBuilder sb = new StringBuilder("Internal error: total len assumed to be ");
        sb.append(i);
        sb.append(", copied ");
        sb.append(i3);
        sb.append(" bytes");
        throw new RuntimeException(sb.toString());
    }

    public final void write(int i) {
        mo37256a(i);
    }

    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public C14680a(BufferRecycler bufferRecycler) {
        this(null, VETransitionFilterParam.TransitionDuration_DEFAULT);
    }

    /* renamed from: b */
    public final byte[] mo37259b(int i) {
        this.f37968b = i;
        return m42475d();
    }

    /* renamed from: a */
    public final void mo37256a(int i) {
        if (this.f37968b >= this.f37967a.length) {
            m42476e();
        }
        byte[] bArr = this.f37967a;
        int i2 = this.f37968b;
        this.f37968b = i2 + 1;
        bArr[i2] = (byte) i;
    }

    private C14680a(BufferRecycler bufferRecycler, int i) {
        this.f37970e = new LinkedList<>();
        this.f37969d = bufferRecycler;
        if (bufferRecycler == null) {
            this.f37967a = new byte[VETransitionFilterParam.TransitionDuration_DEFAULT];
        } else {
            this.f37967a = bufferRecycler.mo37227a(ByteBufferType.WRITE_CONCAT_BUFFER);
        }
    }

    public final void write(byte[] bArr, int i, int i2) {
        while (true) {
            int min = Math.min(this.f37967a.length - this.f37968b, i2);
            if (min > 0) {
                System.arraycopy(bArr, i, this.f37967a, this.f37968b, min);
                i += min;
                this.f37968b += min;
                i2 -= min;
            }
            if (i2 > 0) {
                m42476e();
            } else {
                return;
            }
        }
    }
}
