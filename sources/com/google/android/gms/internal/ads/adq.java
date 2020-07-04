package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Date;

public final class adq extends bci {

    /* renamed from: a */
    public long f40050a;

    /* renamed from: b */
    public long f40051b;

    /* renamed from: d */
    private Date f40052d;

    /* renamed from: e */
    private Date f40053e;

    /* renamed from: f */
    private double f40054f = 1.0d;

    /* renamed from: g */
    private float f40055g = 1.0f;

    /* renamed from: h */
    private bcs f40056h = bcs.f41468a;

    /* renamed from: i */
    private long f40057i;

    /* renamed from: j */
    private int f40058j;

    /* renamed from: k */
    private int f40059k;

    /* renamed from: l */
    private int f40060l;

    /* renamed from: m */
    private int f40061m;

    /* renamed from: n */
    private int f40062n;

    /* renamed from: o */
    private int f40063o;

    public adq() {
        super("mvhd");
    }

    /* renamed from: a */
    public final void mo39227a(ByteBuffer byteBuffer) {
        mo40493b(byteBuffer);
        if (mo40494c() == 1) {
            this.f40052d = bcn.m48433a(C16223zm.m52631c(byteBuffer));
            this.f40053e = bcn.m48433a(C16223zm.m52631c(byteBuffer));
            this.f40050a = C16223zm.m52629a(byteBuffer);
            this.f40051b = C16223zm.m52631c(byteBuffer);
        } else {
            this.f40052d = bcn.m48433a(C16223zm.m52629a(byteBuffer));
            this.f40053e = bcn.m48433a(C16223zm.m52629a(byteBuffer));
            this.f40050a = C16223zm.m52629a(byteBuffer);
            this.f40051b = C16223zm.m52629a(byteBuffer);
        }
        this.f40054f = C16223zm.m52632d(byteBuffer);
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        this.f40055g = ((float) ((short) ((bArr[1] & 255) | ((short) (0 | ((bArr[0] << 8) & 65280)))))) / 256.0f;
        C16223zm.m52630b(byteBuffer);
        C16223zm.m52629a(byteBuffer);
        C16223zm.m52629a(byteBuffer);
        this.f40056h = bcs.m48437a(byteBuffer);
        this.f40058j = byteBuffer.getInt();
        this.f40059k = byteBuffer.getInt();
        this.f40060l = byteBuffer.getInt();
        this.f40061m = byteBuffer.getInt();
        this.f40062n = byteBuffer.getInt();
        this.f40063o = byteBuffer.getInt();
        this.f40057i = C16223zm.m52629a(byteBuffer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MovieHeaderBox[");
        sb.append("creationTime=");
        sb.append(this.f40052d);
        sb.append(";");
        sb.append("modificationTime=");
        sb.append(this.f40053e);
        sb.append(";");
        sb.append("timescale=");
        sb.append(this.f40050a);
        sb.append(";");
        sb.append("duration=");
        sb.append(this.f40051b);
        sb.append(";");
        sb.append("rate=");
        sb.append(this.f40054f);
        sb.append(";");
        sb.append("volume=");
        sb.append(this.f40055g);
        sb.append(";");
        sb.append("matrix=");
        sb.append(this.f40056h);
        sb.append(";");
        sb.append("nextTrackId=");
        sb.append(this.f40057i);
        sb.append("]");
        return sb.toString();
    }
}
