package com.squareup.picasso;

import java.io.PrintWriter;

/* renamed from: com.squareup.picasso.x */
public final class C18856x {

    /* renamed from: a */
    public final int f50859a;

    /* renamed from: b */
    public final int f50860b;

    /* renamed from: c */
    public final long f50861c;

    /* renamed from: d */
    public final long f50862d;

    /* renamed from: e */
    public final long f50863e;

    /* renamed from: f */
    public final long f50864f;

    /* renamed from: g */
    public final long f50865g;

    /* renamed from: h */
    public final long f50866h;

    /* renamed from: i */
    public final long f50867i;

    /* renamed from: j */
    public final long f50868j;

    /* renamed from: k */
    public final int f50869k;

    /* renamed from: l */
    public final int f50870l;

    /* renamed from: m */
    public final int f50871m;

    /* renamed from: n */
    public final long f50872n;

    public final String toString() {
        StringBuilder sb = new StringBuilder("StatsSnapshot{maxSize=");
        sb.append(this.f50859a);
        sb.append(", size=");
        sb.append(this.f50860b);
        sb.append(", cacheHits=");
        sb.append(this.f50861c);
        sb.append(", cacheMisses=");
        sb.append(this.f50862d);
        sb.append(", downloadCount=");
        sb.append(this.f50869k);
        sb.append(", totalDownloadSize=");
        sb.append(this.f50863e);
        sb.append(", averageDownloadSize=");
        sb.append(this.f50866h);
        sb.append(", totalOriginalBitmapSize=");
        sb.append(this.f50864f);
        sb.append(", totalTransformedBitmapSize=");
        sb.append(this.f50865g);
        sb.append(", averageOriginalBitmapSize=");
        sb.append(this.f50867i);
        sb.append(", averageTransformedBitmapSize=");
        sb.append(this.f50868j);
        sb.append(", originalBitmapCount=");
        sb.append(this.f50870l);
        sb.append(", transformedBitmapCount=");
        sb.append(this.f50871m);
        sb.append(", timeStamp=");
        sb.append(this.f50872n);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo50113a(PrintWriter printWriter) {
        printWriter.println("===============BEGIN PICASSO STATS ===============");
        printWriter.println("Memory Cache Stats");
        printWriter.print("  Max Cache Size: ");
        printWriter.println(this.f50859a);
        printWriter.print("  Cache Size: ");
        printWriter.println(this.f50860b);
        printWriter.print("  Cache % Full: ");
        printWriter.println((int) Math.ceil((double) ((((float) this.f50860b) / ((float) this.f50859a)) * 100.0f)));
        printWriter.print("  Cache Hits: ");
        printWriter.println(this.f50861c);
        printWriter.print("  Cache Misses: ");
        printWriter.println(this.f50862d);
        printWriter.println("Network Stats");
        printWriter.print("  Download Count: ");
        printWriter.println(this.f50869k);
        printWriter.print("  Total Download Size: ");
        printWriter.println(this.f50863e);
        printWriter.print("  Average Download Size: ");
        printWriter.println(this.f50866h);
        printWriter.println("Bitmap Stats");
        printWriter.print("  Total Bitmaps Decoded: ");
        printWriter.println(this.f50870l);
        printWriter.print("  Total Bitmap Size: ");
        printWriter.println(this.f50864f);
        printWriter.print("  Total Transformed Bitmaps: ");
        printWriter.println(this.f50871m);
        printWriter.print("  Total Transformed Bitmap Size: ");
        printWriter.println(this.f50865g);
        printWriter.print("  Average Bitmap Size: ");
        printWriter.println(this.f50867i);
        printWriter.print("  Average Transformed Bitmap Size: ");
        printWriter.println(this.f50868j);
        printWriter.println("===============END PICASSO STATS ===============");
        printWriter.flush();
    }

    public C18856x(int i, int i2, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, int i3, int i4, int i5, long j9) {
        this.f50859a = i;
        this.f50860b = i2;
        this.f50861c = j;
        this.f50862d = j2;
        this.f50863e = j3;
        this.f50864f = j4;
        this.f50865g = j5;
        this.f50866h = j6;
        this.f50867i = j7;
        this.f50868j = j8;
        this.f50869k = i3;
        this.f50870l = i4;
        this.f50871m = i5;
        this.f50872n = j9;
    }
}
