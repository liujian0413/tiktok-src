package com.google.android.gms.internal.ads;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class bhl {

    /* renamed from: a */
    public final String f42012a;

    /* renamed from: b */
    public final long f42013b;

    /* renamed from: c */
    public final int f42014c;

    /* renamed from: d */
    public final int f42015d;

    /* renamed from: e */
    public final float f42016e;

    /* renamed from: f */
    public final List<byte[]> f42017f;

    /* renamed from: g */
    private final int f42018g;

    /* renamed from: h */
    private final int f42019h;

    /* renamed from: i */
    private final int f42020i;

    /* renamed from: j */
    private int f42021j;

    /* renamed from: k */
    private int f42022k;

    /* renamed from: l */
    private int f42023l;

    /* renamed from: m */
    private MediaFormat f42024m;

    /* renamed from: a */
    public static bhl m48807a(MediaFormat mediaFormat) {
        return new bhl(mediaFormat);
    }

    /* renamed from: a */
    public static bhl m48810a(String str, int i, long j, int i2, int i3, List<byte[]> list) {
        return m48809a(str, -1, j, i2, i3, 1.0f, list);
    }

    /* renamed from: a */
    public static bhl m48809a(String str, int i, long j, int i2, int i3, float f, List<byte[]> list) {
        bhl bhl = new bhl(str, -1, j, i2, i3, f, -1, -1, list);
        return bhl;
    }

    /* renamed from: a */
    public static bhl m48808a(String str, int i, int i2, int i3, List<byte[]> list) {
        return m48812b(str, -1, -1, i2, i3, list);
    }

    /* renamed from: b */
    public static bhl m48812b(String str, int i, long j, int i2, int i3, List<byte[]> list) {
        bhl bhl = new bhl(str, i, j, -1, -1, -1.0f, i2, i3, list);
        return bhl;
    }

    /* renamed from: a */
    public static bhl m48806a() {
        bhl bhl = new bhl("application/ttml+xml", -1, -1, -1, -1, -1.0f, -1, -1, null);
        return bhl;
    }

    private bhl(MediaFormat mediaFormat) {
        this.f42024m = mediaFormat;
        this.f42012a = mediaFormat.getString("mime");
        this.f42018g = m48805a(mediaFormat, "max-input-size");
        this.f42014c = m48805a(mediaFormat, "width");
        this.f42015d = m48805a(mediaFormat, "height");
        this.f42019h = m48805a(mediaFormat, "channel-count");
        this.f42020i = m48805a(mediaFormat, "sample-rate");
        String str = "com.google.android.videos.pixelWidthHeightRatio";
        this.f42016e = mediaFormat.containsKey(str) ? mediaFormat.getFloat(str) : -1.0f;
        this.f42017f = new ArrayList();
        int i = 0;
        while (true) {
            StringBuilder sb = new StringBuilder(15);
            sb.append("csd-");
            sb.append(i);
            if (!mediaFormat.containsKey(sb.toString())) {
                break;
            }
            StringBuilder sb2 = new StringBuilder(15);
            sb2.append("csd-");
            sb2.append(i);
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer(sb2.toString());
            byte[] bArr = new byte[byteBuffer.limit()];
            byteBuffer.get(bArr);
            this.f42017f.add(bArr);
            byteBuffer.flip();
            i++;
        }
        this.f42013b = mediaFormat.containsKey("durationUs") ? mediaFormat.getLong("durationUs") : -1;
        this.f42021j = -1;
        this.f42022k = -1;
    }

    private bhl(String str, int i, long j, int i2, int i3, float f, int i4, int i5, List<byte[]> list) {
        this.f42012a = str;
        this.f42018g = i;
        this.f42013b = j;
        this.f42014c = i2;
        this.f42015d = i3;
        this.f42016e = f;
        this.f42019h = i4;
        this.f42020i = i5;
        if (list == null) {
            list = Collections.emptyList();
        }
        this.f42017f = list;
        this.f42021j = -1;
        this.f42022k = -1;
    }

    public final int hashCode() {
        if (this.f42023l == 0) {
            int hashCode = (((((((((((((((((((this.f42012a == null ? 0 : this.f42012a.hashCode()) + 527) * 31) + this.f42018g) * 31) + this.f42014c) * 31) + this.f42015d) * 31) + Float.floatToRawIntBits(this.f42016e)) * 31) + ((int) this.f42013b)) * 31) + this.f42021j) * 31) + this.f42022k) * 31) + this.f42019h) * 31) + this.f42020i;
            for (int i = 0; i < this.f42017f.size(); i++) {
                hashCode = (hashCode * 31) + Arrays.hashCode((byte[]) this.f42017f.get(i));
            }
            this.f42023l = hashCode;
        }
        return this.f42023l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bhl bhl = (bhl) obj;
        if (this.f42018g != bhl.f42018g || this.f42014c != bhl.f42014c || this.f42015d != bhl.f42015d || this.f42016e != bhl.f42016e || this.f42021j != bhl.f42021j || this.f42022k != bhl.f42022k || this.f42019h != bhl.f42019h || this.f42020i != bhl.f42020i || !bkn.m49088a((Object) this.f42012a, (Object) bhl.f42012a) || this.f42017f.size() != bhl.f42017f.size()) {
            return false;
        }
        for (int i = 0; i < this.f42017f.size(); i++) {
            if (!Arrays.equals((byte[]) this.f42017f.get(i), (byte[]) bhl.f42017f.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        String str = this.f42012a;
        int i = this.f42018g;
        int i2 = this.f42014c;
        int i3 = this.f42015d;
        float f = this.f42016e;
        int i4 = this.f42019h;
        int i5 = this.f42020i;
        long j = this.f42013b;
        int i6 = this.f42021j;
        int i7 = this.f42022k;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 143);
        sb.append("MediaFormat(");
        sb.append(str);
        sb.append(", ");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(f);
        sb.append(", ");
        sb.append(i4);
        sb.append(", ");
        sb.append(i5);
        sb.append(", ");
        sb.append(j);
        sb.append(", ");
        sb.append(i6);
        sb.append(", ");
        sb.append(i7);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: b */
    public final MediaFormat mo40691b() {
        if (this.f42024m == null) {
            MediaFormat mediaFormat = new MediaFormat();
            mediaFormat.setString("mime", this.f42012a);
            m48811a(mediaFormat, "max-input-size", this.f42018g);
            m48811a(mediaFormat, "width", this.f42014c);
            m48811a(mediaFormat, "height", this.f42015d);
            m48811a(mediaFormat, "channel-count", this.f42019h);
            m48811a(mediaFormat, "sample-rate", this.f42020i);
            String str = "com.google.android.videos.pixelWidthHeightRatio";
            float f = this.f42016e;
            if (f != -1.0f) {
                mediaFormat.setFloat(str, f);
            }
            for (int i = 0; i < this.f42017f.size(); i++) {
                StringBuilder sb = new StringBuilder(15);
                sb.append("csd-");
                sb.append(i);
                mediaFormat.setByteBuffer(sb.toString(), ByteBuffer.wrap((byte[]) this.f42017f.get(i)));
            }
            if (this.f42013b != -1) {
                mediaFormat.setLong("durationUs", this.f42013b);
            }
            m48811a(mediaFormat, "max-width", this.f42021j);
            m48811a(mediaFormat, "max-height", this.f42022k);
            this.f42024m = mediaFormat;
        }
        return this.f42024m;
    }

    /* renamed from: a */
    private static final void m48811a(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    /* renamed from: a */
    private static final int m48805a(MediaFormat mediaFormat, String str) {
        if (mediaFormat.containsKey(str)) {
            return mediaFormat.getInteger(str);
        }
        return -1;
    }
}
