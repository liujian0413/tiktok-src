package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import com.C1642a;
import com.google.android.gms.ads.internal.C14793ay;
import com.google.android.gms.internal.ads.zzxh.zza.zzb;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@C6505uv
public final class bwl {

    /* renamed from: a */
    private final bwp f44058a;

    /* renamed from: b */
    private final bxn f44059b;

    /* renamed from: c */
    private final boolean f44060c;

    /* renamed from: a */
    public static bwl m50206a() {
        return new bwl();
    }

    public bwl(bwp bwp) {
        this.f44058a = bwp;
        this.f44060c = ((Boolean) bym.m50299d().mo41272a(C15585bw.f43866cG)).booleanValue();
        this.f44059b = new bxn();
        m50207b();
    }

    private bwl() {
        this.f44058a = new bwp();
        this.f44059b = new bxn();
        m50207b();
    }

    /* renamed from: a */
    public final synchronized void mo41410a(zzb zzb) {
        if (this.f44060c) {
            if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43867cH)).booleanValue()) {
                m50209c(zzb);
            } else {
                m50208b(zzb);
            }
        }
    }

    /* renamed from: b */
    private final synchronized void m50208b(zzb zzb) {
        this.f44059b.f44103d = m50210c();
        this.f44058a.mo41411a(bbl.m48381a((bbl) this.f44059b)).mo41414b(zzb.zzac()).mo41413a();
        String str = "Logging Event with event code : ";
        String valueOf = String.valueOf(Integer.toString(zzb.zzac(), 10));
        acd.m45438a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    /* renamed from: c */
    private final synchronized void m50209c(zzb zzb) {
        FileOutputStream fileOutputStream;
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory != null) {
            try {
                fileOutputStream = new FileOutputStream(new File(externalStorageDirectory, "clearcut_events.txt"), true);
                try {
                    fileOutputStream.write(m50211d(zzb).getBytes());
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        acd.m45438a("Could not close Clearcut output stream.");
                    }
                } catch (IOException unused2) {
                    acd.m45438a("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                        acd.m45438a("Could not close Clearcut output stream.");
                    }
                }
            } catch (FileNotFoundException unused4) {
                acd.m45438a("Could not find file for Clearcut");
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused5) {
                    acd.m45438a("Could not close Clearcut output stream.");
                }
                throw th;
            }
        }
    }

    /* renamed from: d */
    private final synchronized String m50211d(zzb zzb) {
        return C1642a.m8034a("id=%s,timestamp=%s,event=%s,data=%s\n", new Object[]{this.f44059b.f44102c, Long.valueOf(C14793ay.m42901g().mo38685b()), Integer.valueOf(zzb.zzac()), Base64.encodeToString(bbl.m48381a((bbl) this.f44059b), 3)});
    }

    /* renamed from: a */
    public final synchronized void mo41409a(bwm bwm) {
        if (this.f44060c) {
            try {
                bwm.mo37637a(this.f44059b);
            } catch (NullPointerException e) {
                C14793ay.m42898d().mo39089a((Throwable) e, "AdMobClearcutLogger.modify");
            }
        }
    }

    /* renamed from: b */
    private final synchronized void m50207b() {
        this.f44059b.f44105f = new bxj();
        this.f44059b.f44105f.f44079d = new bxk();
        this.f44059b.f44104e = new bxl();
    }

    /* renamed from: c */
    private static long[] m50210c() {
        int i;
        List b = C15585bw.m50190b();
        ArrayList arrayList = new ArrayList();
        Iterator it = b.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            String[] split = ((String) it.next()).split(",");
            int length = split.length;
            while (i < length) {
                try {
                    arrayList.add(Long.valueOf(split[i]));
                } catch (NumberFormatException unused) {
                    acd.m45438a("Experiment ID is not a number");
                }
                i++;
            }
        }
        long[] jArr = new long[arrayList.size()];
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i2 = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            jArr[i2] = ((Long) obj).longValue();
            i2++;
        }
        return jArr;
    }
}
