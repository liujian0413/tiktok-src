package com.bytedance.apm.util;

import android.app.usage.NetworkStats;
import android.app.usage.NetworkStats.Bucket;
import android.app.usage.NetworkStatsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.os.Process;
import android.support.p022v4.content.C0683b;
import android.text.TextUtils;
import com.bytedance.apm.C6174c;
import com.bytedance.apm.p245h.C9608i;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.apm.util.t */
public final class C9656t {

    /* renamed from: a */
    private static volatile int f26371a = -1;

    /* renamed from: a */
    public static boolean m28554a() {
        if (VERSION.SDK_INT <= 22 || VERSION.SDK_INT >= 28 || C0683b.m2909b(C6174c.m19129a(), "android.permission.READ_PHONE_STATE") != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static C9608i m28555b() {
        if (VERSION.SDK_INT >= 28) {
            return null;
        }
        int myUid = Process.myUid();
        List a = m28553a(new File("/proc/net/xt_qtaguid/stats"), "utf-8");
        if (C6292i.m19525a(a)) {
            return null;
        }
        return m28552a(myUid, a);
    }

    /* renamed from: a */
    private static int m28550a(Context context) {
        if (f26371a == -1) {
            try {
                PackageInfo packageInfo = context.getApplicationContext().getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
                if (packageInfo != null) {
                    f26371a = packageInfo.applicationInfo.uid;
                }
            } catch (NameNotFoundException unused) {
            }
        }
        return f26371a;
    }

    /* renamed from: a */
    private static List<String> m28553a(File file, String str) {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            ArrayList arrayList = new ArrayList();
            int i = 1;
            if (str.trim().length() == 0) {
                bufferedReader = new BufferedReader(new FileReader(file));
            } else {
                bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), str));
            }
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        if (i >= 0) {
                            arrayList.add(readLine);
                        }
                        i++;
                    } else {
                        C9644g.m28534a(bufferedReader);
                        return arrayList;
                    }
                } catch (IOException unused) {
                    C9644g.m28534a(bufferedReader);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    bufferedReader2 = bufferedReader;
                    C9644g.m28534a(bufferedReader2);
                    throw th;
                }
            }
        } catch (IOException unused2) {
            bufferedReader = null;
            C9644g.m28534a(bufferedReader);
            return null;
        } catch (Throwable th2) {
            th = th2;
            C9644g.m28534a(bufferedReader2);
            throw th;
        }
    }

    /* renamed from: a */
    private static C9608i m28552a(int i, List<String> list) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        C9608i iVar = new C9608i();
        Iterator it = list.iterator();
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        while (it.hasNext()) {
            String[] split = ((String) it.next()).split(" ");
            Iterator it2 = it;
            try {
                if (TextUtils.equals(split[3], "uid_tag_int")) {
                    it = it2;
                } else {
                    if (i == Integer.parseInt(split[3])) {
                        try {
                            long parseLong = Long.parseLong(split[5]);
                            long parseLong2 = Long.parseLong(split[7]);
                            if (Long.valueOf(split[4]).longValue() == 0) {
                                j = j10;
                                j15 += parseLong + parseLong2;
                                try {
                                    if (split[1].startsWith("rmnet_data")) {
                                        j7 += parseLong2;
                                        j6 += parseLong;
                                    } else if (split[1].startsWith("wlan")) {
                                        j9 += parseLong2;
                                        j8 += parseLong;
                                    }
                                    j2 = j12;
                                    j3 = j13;
                                } catch (Exception unused) {
                                    j2 = j12;
                                    j3 = j13;
                                    j4 = j15;
                                }
                                j13 = j3;
                                j12 = j2;
                            } else {
                                j = j10;
                                j4 = j15;
                                j14 += parseLong + parseLong2;
                                try {
                                    if (split[1].startsWith("rmnet_data")) {
                                        j11 += parseLong2;
                                        j += parseLong;
                                        j2 = j12;
                                        j3 = j13;
                                        j15 = j4;
                                        j13 = j3;
                                        j12 = j2;
                                    } else {
                                        if (split[1].startsWith("wlan")) {
                                            j13 += parseLong2;
                                            j12 += parseLong;
                                        } else {
                                            long j16 = j12;
                                            long j17 = j13;
                                        }
                                        j15 = j4;
                                    }
                                } catch (Exception unused2) {
                                }
                            }
                        } catch (Exception unused3) {
                            j = j10;
                            j2 = j12;
                            j3 = j13;
                            j5 = j14;
                            j4 = j15;
                            j14 = j5;
                            j15 = j4;
                            j13 = j3;
                            j12 = j2;
                            it = it2;
                            j10 = j;
                        }
                    } else {
                        j = j10;
                        long j18 = j12;
                        long j19 = j13;
                        long j20 = j14;
                        long j21 = j15;
                    }
                    it = it2;
                    j10 = j;
                }
            } catch (Exception unused4) {
                int i2 = i;
                j = j10;
                j2 = j12;
                j3 = j13;
                j5 = j14;
                j4 = j15;
                j14 = j5;
                j15 = j4;
                j13 = j3;
                j12 = j2;
                it = it2;
                j10 = j;
            }
        }
        long j22 = j10;
        long j23 = j12;
        long j24 = j13;
        long j25 = j14;
        long j26 = j15;
        iVar.f26292h = j6;
        iVar.f26291g = j7;
        iVar.f26290f = j8;
        iVar.f26289e = j9;
        iVar.f26288d = j22;
        iVar.f26287c = j11;
        iVar.f26286b = j23;
        iVar.f26285a = j24;
        iVar.f26293i = j25;
        iVar.f26294j = j26;
        return iVar;
    }

    /* renamed from: a */
    public static long m28551a(Context context, long j, long j2, int i) {
        long j3 = 0;
        if (!m28554a()) {
            return 0;
        }
        NetworkStatsManager networkStatsManager = (NetworkStatsManager) context.getApplicationContext().getSystemService("netstats");
        if (networkStatsManager == null) {
            return 0;
        }
        NetworkStats networkStats = null;
        Bucket bucket = new Bucket();
        try {
            networkStats = networkStatsManager.querySummary(i, null, j, j2);
        } catch (Exception unused) {
        }
        long j4 = 0;
        while (networkStats != null && networkStats.hasNextBucket()) {
            networkStats.getNextBucket(bucket);
            if (m28550a(context) == bucket.getUid()) {
                j3 += bucket.getRxBytes();
                j4 += bucket.getTxBytes();
            }
        }
        return j3 + j4;
    }
}
