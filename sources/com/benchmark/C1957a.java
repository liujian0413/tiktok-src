package com.benchmark;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.text.TextUtils;
import com.benchmark.p061a.C1958a;
import com.benchmark.p061a.C1959b;
import com.benchmark.p061a.C1960c;
import com.benchmark.p061a.C1961d;
import com.benchmark.p061a.C1962e;
import com.benchmark.p061a.C1963f;
import com.benchmark.p061a.C1964g;
import com.benchmark.p061a.C1965h;
import com.benchmark.p061a.C1966i;
import com.benchmark.p061a.C1967j;
import com.benchmark.p061a.C1968k;
import com.benchmark.p061a.C1969l;
import com.benchmark.p061a.C1970m;
import com.benchmark.p061a.C1971n;
import com.benchmark.p061a.C1972o;
import com.benchmark.p061a.C1973p;
import com.benchmark.p061a.C1974q;
import com.bytedance.p066a.p067a.p070b.p072b.C2077a;
import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import com.p280ss.android.common.util.NetworkUtils;
import com.p280ss.android.ugc.effectmanager.common.p1730e.C43734f;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Scanner;

/* renamed from: com.benchmark.a */
public final class C1957a {
    /* renamed from: a */
    public static void m8943a(Throwable th) {
        C2077a.m9161a(th, "benchmark test");
    }

    /* renamed from: a */
    public static float m8939a(float f) {
        return ((float) Math.floor((double) (f * 100.0f))) / 100.0f;
    }

    /* renamed from: a */
    public static float m8940a(boolean z) {
        return ((float) m8947b(z)) / ((float) m8950c(z));
    }

    /* renamed from: b */
    public static String m8949b(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        C6497a.m20180a(th, new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: b */
    public static long m8947b(boolean z) {
        File externalStorageDirectory;
        if (z) {
            externalStorageDirectory = Environment.getDataDirectory();
        } else {
            externalStorageDirectory = Environment.getExternalStorageDirectory();
        }
        StatFs statFs = new StatFs(externalStorageDirectory.getPath());
        if (VERSION.SDK_INT >= 18) {
            return statFs.getAvailableBytes();
        }
        return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
    }

    /* renamed from: c */
    private static long m8950c(boolean z) {
        File externalStorageDirectory;
        if (z) {
            externalStorageDirectory = Environment.getDataDirectory();
        } else {
            externalStorageDirectory = Environment.getExternalStorageDirectory();
        }
        StatFs statFs = new StatFs(externalStorageDirectory.getPath());
        if (VERSION.SDK_INT >= 18) {
            return statFs.getTotalBytes();
        }
        return ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
    }

    /* renamed from: a */
    public static boolean m8944a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        if (file.exists()) {
            return file.delete();
        }
        return true;
    }

    /* renamed from: b */
    public static String m8948b(String str) throws IOException {
        Throwable th;
        File file = new File(str);
        StringBuilder sb = new StringBuilder((int) file.length());
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(scanner.nextLine());
                sb2.append("\n");
                sb.append(sb2.toString());
            } catch (Throwable th2) {
                C6497a.m20181a(th, th2);
            }
        }
        String sb3 = sb.toString();
        scanner.close();
        return sb3;
        throw th;
    }

    /* renamed from: a */
    public static int m8941a(C1971n nVar, long[] jArr) {
        int i = 0;
        int i2 = 0;
        while (i < jArr.length) {
            long uptimeMillis = SystemClock.uptimeMillis();
            int a = nVar.mo7609a();
            if (a != 0) {
                return a;
            }
            jArr[i] = SystemClock.uptimeMillis() - uptimeMillis;
            i++;
            i2 = a;
        }
        return i2;
    }

    /* renamed from: a */
    public static C2006j m8942a(Context context, Benchmark benchmark) {
        switch (benchmark.f6993id) {
            case 1:
                return new C1964g(benchmark);
            case 2:
                return new C1960c(benchmark);
            case 3:
                return new C1963f(benchmark);
            case 4:
                return new C1966i(benchmark);
            case 5:
                return new C1969l(benchmark);
            case 6:
                return new C1972o(benchmark);
            case 7:
                return new C1958a(benchmark);
            case 8:
                return new C1959b(benchmark);
            case 9:
                return new C1962e(benchmark);
            case 10:
                return new C1965h(benchmark);
            case 11:
                return new C1973p(benchmark);
            case 12:
                return new C1970m(context, benchmark, true);
            case 13:
                return new C1970m(context, benchmark, false);
            case 14:
                return new C1967j(benchmark);
            case 15:
                return new C1961d(benchmark);
            case 16:
                return new C1968k(benchmark);
            default:
                return new C1974q(benchmark);
        }
    }

    /* renamed from: a */
    public static boolean m8945a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        File file = new File(str);
        if (!file.exists()) {
            return false;
        }
        int indexOf = str2.indexOf("?");
        if (indexOf == -1) {
            return false;
        }
        String substring = str2.substring(indexOf + 1);
        if (TextUtils.isEmpty(substring) || !substring.equalsIgnoreCase(C43734f.m138604a(file))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m8946a(String str, String str2, String str3) {
        try {
            return NetworkUtils.downloadFile(-1, str, str2, null, str3, null, null, null, null, null, null);
        } catch (Exception unused) {
            return false;
        }
    }
}
