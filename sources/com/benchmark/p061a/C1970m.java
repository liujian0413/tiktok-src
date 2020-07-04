package com.benchmark.p061a;

import android.content.Context;
import android.os.Environment;
import android.support.p022v4.content.C0683b;
import com.benchmark.Benchmark;
import com.benchmark.BenchmarkResult;
import com.benchmark.C1957a;
import com.benchmark.C2006j;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetProxyTimeoutExperiment;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* renamed from: com.benchmark.a.m */
public final class C1970m implements C2006j {

    /* renamed from: a */
    public static Random f7007a = new Random();

    /* renamed from: b */
    private Context f7008b;

    /* renamed from: c */
    private boolean f7009c;

    /* renamed from: d */
    private Benchmark f7010d;

    /* renamed from: e */
    private String f7011e;

    /* renamed from: c */
    public final void mo7606c() {
        C1957a.m8944a(this.f7011e);
    }

    /* renamed from: d */
    private static boolean m8989d() {
        if ("mounted".equals(Environment.getExternalStorageState())) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final int mo7605b() {
        boolean z;
        if (!this.f7009c && !m8989d()) {
            return 10003;
        }
        if (!this.f7009c && C0683b.m2909b(this.f7008b, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            return 10004;
        }
        if (C1957a.m8947b(this.f7009c) >= ((long) (this.f7010d.blockSize * 10 * this.f7010d.blockNum))) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return 0;
        }
        return 10002;
    }

    /* renamed from: a */
    public final BenchmarkResult mo7608a() {
        String str;
        String str2 = "";
        HashMap hashMap = new HashMap();
        int i = 0;
        try {
            float a = m8987a(this.f7010d.blockSize, this.f7010d.blockNum, true, this.f7011e);
            C1957a.m8944a(this.f7011e);
            float a2 = m8987a(this.f7010d.blockSize, this.f7010d.blockNum, false, this.f7011e);
            float b = m8988b(this.f7010d.blockSize, this.f7010d.blockNum, true, this.f7011e);
            float b2 = m8988b(this.f7010d.blockSize, this.f7010d.blockNum, false, this.f7011e);
            if (this.f7009c) {
                str = "inter_";
            } else {
                str = "exter_";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("random_write");
            hashMap.put(sb.toString(), Float.valueOf(C1957a.m8939a(a)));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("random_read");
            hashMap.put(sb2.toString(), Float.valueOf(C1957a.m8939a(b)));
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append("sequential_write");
            hashMap.put(sb3.toString(), Float.valueOf(C1957a.m8939a(a2)));
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            sb4.append("sequential_read");
            hashMap.put(sb4.toString(), Float.valueOf(C1957a.m8939a(b2)));
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str);
            sb5.append("avail_percent");
            hashMap.put(sb5.toString(), Float.valueOf(C1957a.m8939a(C1957a.m8940a(this.f7009c))));
        } catch (Throwable th) {
            i = VideoCacheTTnetProxyTimeoutExperiment.DEFAULT;
            str2 = C1957a.m8949b(th);
        }
        return new BenchmarkResult(this.f7010d, i, str2, (Map<String, String>) hashMap);
    }

    public C1970m(Context context, Benchmark benchmark, boolean z) {
        this.f7008b = context;
        this.f7010d = benchmark;
        this.f7009c = z;
        StringBuilder sb = new StringBuilder();
        sb.append(context.getCacheDir().getPath());
        sb.append(File.separator);
        sb.append("test.file");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(context.getExternalCacheDir().getPath());
        sb3.append(File.separator);
        sb3.append("test.file");
        String sb4 = sb3.toString();
        if (this.f7009c) {
            sb4 = sb2;
        }
        this.f7011e = sb4;
    }

    /* renamed from: b */
    private static float m8988b(int i, int i2, boolean z, String str) throws IOException {
        int i3;
        long j;
        File file = new File(str);
        byte[] bArr = new byte[i];
        if (z) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            j = System.nanoTime();
            int i4 = 0;
            i3 = 0;
            while (i4 < i2) {
                try {
                    randomAccessFile.seek((long) (f7007a.nextInt(i2 - 1) * i));
                    randomAccessFile.readFully(bArr, 0, i);
                    i3 += i;
                    i4++;
                } catch (IOException e) {
                    throw e;
                } catch (Throwable th) {
                    randomAccessFile.close();
                    throw th;
                }
            }
            randomAccessFile.close();
        } else {
            FileInputStream fileInputStream = new FileInputStream(file);
            j = System.nanoTime();
            int i5 = 0;
            int i6 = 0;
            while (i5 < i2) {
                try {
                    fileInputStream.read(bArr, 0, i);
                    i6 = i3 + i;
                    i5++;
                } catch (IOException e2) {
                    throw e2;
                } catch (Throwable th2) {
                    fileInputStream.close();
                    throw th2;
                }
            }
            fileInputStream.close();
        }
        return (((float) i3) / ((float) (System.nanoTime() - j))) * 1000.0f;
    }

    /* renamed from: a */
    private static float m8987a(int i, int i2, boolean z, String str) throws IOException {
        int i3;
        long j;
        byte[] bArr = new byte[i];
        for (int i4 = 0; i4 < i; i4++) {
            bArr[i4] = -16;
        }
        File file = new File(str);
        if (!file.exists()) {
            File parentFile = file.getParentFile();
            if (!parentFile.exists()) {
                parentFile.mkdirs();
            }
            file.createNewFile();
        }
        if (z) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            j = System.nanoTime();
            int i5 = 0;
            i3 = 0;
            while (i5 < i2) {
                try {
                    randomAccessFile.seek((long) (f7007a.nextInt(i2 - 1) * i));
                    randomAccessFile.write(bArr, 0, i);
                    i3 += i;
                    i5++;
                } catch (IOException e) {
                    throw e;
                } catch (Throwable th) {
                    randomAccessFile.close();
                    throw th;
                }
            }
            randomAccessFile.close();
        } else {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            j = System.nanoTime();
            int i6 = 0;
            int i7 = 0;
            while (i6 < i2) {
                try {
                    fileOutputStream.write(bArr, 0, i);
                    i7 = i3 + i;
                    i6++;
                } catch (IOException e2) {
                    throw e2;
                } catch (Throwable th2) {
                    fileOutputStream.close();
                    throw th2;
                }
            }
            fileOutputStream.close();
        }
        return (((float) i3) / ((float) (System.nanoTime() - j))) * 1000.0f;
    }
}
