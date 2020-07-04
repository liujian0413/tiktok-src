package com.p280ss.android.deviceregister;

import android.app.ActivityManager;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.util.Pair;
import com.bytedance.common.utility.C6319n;
import com.p280ss.android.deviceregister.p290b.p291a.C6784a;
import com.p280ss.android.deviceregister.p855c.C19319c;
import com.p280ss.android.deviceregister.p855c.C19323f;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.deviceregister.h */
final class C19325h {

    /* renamed from: a */
    private static int f52231a;

    /* renamed from: b */
    private static String[] f52232b = {"goldfish"};

    /* renamed from: c */
    private static String[] f52233c = {"/dev/socket/qemud", "/dev/qemu_pipe", "/dev/qemu_trace"};

    /* renamed from: d */
    private static final String[] f52234d = {"000000000000000", "012345678912345"};

    /* renamed from: a */
    private static boolean m63391a() {
        return m63394a("/sys/class/thermal/thermal_zone0");
    }

    /* renamed from: c */
    private static boolean m63397c() {
        boolean isUserAMonkey = ActivityManager.isUserAMonkey();
        if (VERSION.SDK_INT < 11) {
            return isUserAMonkey;
        }
        if (isUserAMonkey || ActivityManager.isRunningInTestHarness()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static Boolean m63396b() {
        String str;
        File file = new File("/proc/tty/drivers");
        if (!file.exists() || !file.canRead()) {
            StringBuilder sb = new StringBuilder("can not read file /proc/tty/drivers ，because");
            if (file.exists()) {
                str = "not exist";
            } else {
                str = "not readable";
            }
            sb.append(str);
        } else {
            byte[] bArr = new byte[PreloadTask.BYTE_UNIT_NUMBER];
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                fileInputStream.read(bArr);
                fileInputStream.close();
            } catch (Exception unused) {
            }
            String str2 = new String(bArr);
            for (String contains : f52232b) {
                if (str2.contains(contains)) {
                    return Boolean.valueOf(true);
                }
            }
        }
        return Boolean.valueOf(false);
    }

    /* renamed from: a */
    private static boolean m63392a(Context context) {
        for (Sensor type : ((SensorManager) context.getSystemService("sensor")).getSensorList(-1)) {
            if (type.getType() == 9) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static int m63389a(C19323f fVar) {
        int i;
        int i2;
        String[] strArr = {"/system/bin/qemu_props", "/system/bin/androVM-prop", "/system/bin/microvirt-prop", "/system/lib/libdroid4x.so", "/system/bin/windroyed", "/system/bin/microvirtd", "/system/bin/nox-prop", "/system/bin/ttVM-prop", "/system/bin/droid4x-prop", "/data/.bluestacks.prop"};
        String[] strArr2 = {"init.svc.vbox86-setup", "init.svc.droid4x", "init.svc.qemud", "init.svc.su_kpbs_daemon", "init.svc.noxd", "init.svc.ttVM_x86-setup", "init.svc.xxkmsg", "init.svc.microvirtd", "ro.kernel.android.qemud", "androVM.vbox_dpi", "androVM.vbox_graph_mode"};
        int i3 = 0;
        for (int i4 = 0; i4 < 10; i4++) {
            if (m63394a(strArr[i4])) {
                i2 = 1 << i4;
            } else {
                i2 = 0;
            }
            i3 |= i2;
            m63394a(strArr[i4]);
        }
        int i5 = 10;
        for (int i6 = 0; i6 < 11; i6++) {
            String str = strArr2[i6];
            if (C6319n.m19593a(fVar.mo51220a(str))) {
                i = 0;
            } else {
                i = 1 << i5;
            }
            i3 |= i;
            C6319n.m19593a(fVar.mo51220a(str));
            i5++;
        }
        Pair pair = new Pair("ro.product.manufacturer", "Genymotion");
        String a = fVar.mo51220a((String) pair.first);
        if (C6319n.m19593a(a) || !a.contains((CharSequence) pair.second)) {
            return i3;
        }
        return i3 | (1 << i5);
    }

    /* renamed from: a */
    private static boolean m63394a(String str) {
        if (C6319n.m19593a(str)) {
            return false;
        }
        File file = new File(str);
        if (file.exists()) {
            return true;
        }
        try {
            new FileInputStream(file);
            return true;
        } catch (FileNotFoundException e) {
            if (!e.getMessage().contains("No such file or directory")) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public static void m63390a(Context context, JSONObject jSONObject) throws JSONException {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        int i5;
        int i6;
        int i7;
        if (jSONObject != null) {
            try {
                if (!C6319n.m19593a(C19319c.m63369m())) {
                    jSONObject.put("kernel", C19319c.m63369m());
                }
            } catch (Exception unused) {
            }
            jSONObject.put("gravity", m63392a(context));
            jSONObject.put("battery_temp", C19319c.m63364j(context));
            jSONObject.put("battery_volt", C19319c.m63368l(context));
            jSONObject.put("gps", C19319c.m63366k(context));
            jSONObject.put("cpu_freq", C19319c.m63344a(C19319c.m63367l()));
            C19323f fVar = new C19323f();
            boolean booleanValue = m63396b().booleanValue();
            int i8 = f52231a;
            int i9 = 0;
            if (booleanValue) {
                i = 2;
            } else {
                i = 0;
            }
            f52231a = i8 | i;
            int a = m63389a(fVar);
            int i10 = f52231a;
            if (a > 0) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            f52231a = i10 | i2;
            C6784a a2 = C6792f.m21098a(context);
            boolean a3 = m63393a(context, a2.mo16579d(), a2.mo16578c(), C19319c.m63362i(context));
            int i11 = f52231a;
            if (a3) {
                i3 = 8;
            } else {
                i3 = 0;
            }
            f52231a = i11 | i3;
            boolean a4 = m63395a(Build.BRAND, Build.DEVICE, Build.HARDWARE, Build.HOST);
            int i12 = f52231a;
            if (a4) {
                i4 = 16;
            } else {
                i4 = 0;
            }
            f52231a = i12 | i4;
            HashMap hashMap = new HashMap(6);
            hashMap.put("ro.hardware", "goldfish");
            hashMap.put("ro.product.device", "generic");
            hashMap.put("ro.product.model", "sdk");
            hashMap.put("ro.product.name", "sdk");
            hashMap.put("init.svc.vbox86-setup", "stopped");
            hashMap.put("init.svc.vbox86-setup", "running");
            Iterator it = hashMap.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                String str = (String) it.next();
                if (C6319n.m19594a(fVar.mo51220a(str), (String) hashMap.get(str))) {
                    z = true;
                    break;
                }
            }
            int i13 = f52231a;
            if (z) {
                i5 = 32;
            } else {
                i5 = 0;
            }
            f52231a = i13 | i5;
            boolean c = m63397c();
            int i14 = f52231a;
            if (c) {
                i6 = 64;
            } else {
                i6 = 0;
            }
            f52231a = i14 | i6;
            boolean a5 = m63391a();
            int i15 = f52231a;
            if (a5) {
                i7 = 0;
            } else {
                i7 = PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH;
            }
            f52231a = i15 | i7;
            if (booleanValue || a > 0 || a3 || a4 || z || c || !a5) {
                i9 = 1;
            }
            f52231a |= i9;
            jSONObject.put("emulator", f52231a);
            jSONObject.put("emulator_file_flag", a);
        }
    }

    /* renamed from: a */
    private static boolean m63393a(Context context, String str, String[] strArr, String str2) {
        boolean z;
        boolean z2;
        boolean z3;
        String[] strArr2;
        if (context.getPackageManager().checkPermission("android.permission.READ_PHONE_STATE", context.getPackageName()) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            z2 = false;
            for (String str3 : f52234d) {
                if (z2 || C6319n.m19594a(str3, str)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
        } else {
            z2 = false;
        }
        if (strArr != null) {
            for (String a : strArr) {
                if (C6319n.m19594a(a, "310260000000000") || z2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
        }
        if (z2 || C6319n.m19594a(str2, "15552175049")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m63395a(String str, String str2, String str3, String str4) {
        if ((str == null || !str.contains("generic")) && ((str2 == null || !str2.contains("generic")) && ((str3 == null || !str3.contains("goldfish")) && !C6319n.m19594a(str4, "android-test")))) {
            return false;
        }
        return true;
    }
}
