package com.p280ss.android.ugc.aweme.filter;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.C1642a;
import com.bytedance.android.live.broadcast.effect.model.FilterModel;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.util.C42880h;
import com.p280ss.android.ugc.aweme.utils.C43136fo;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.filter.y */
public class C29340y {

    /* renamed from: b */
    private static C29340y f77356b;

    /* renamed from: a */
    public String f77357a = new File(C7276d.m22814c((Context) C35574k.m114861b()), "filters").getAbsolutePath();

    private C29340y() {
        C7276d.m22803a(this.f77357a, false);
    }

    /* renamed from: a */
    public static C29340y m96241a() {
        if (f77356b == null) {
            synchronized (C29340y.class) {
                if (f77356b == null) {
                    f77356b = new C29340y();
                }
            }
        }
        return f77356b;
    }

    /* renamed from: b */
    private static C29296g m96243b() {
        List d = FilterManager.m95700a().mo74721d();
        if (C6307b.m19566a((Collection<T>) d)) {
            return null;
        }
        return (C29296g) d.get(0);
    }

    /* renamed from: a */
    public final String mo75014a(C29296g gVar) {
        if (gVar == null) {
            return "";
        }
        return mo75013a(gVar.f77266a);
    }

    /* renamed from: f */
    public final boolean mo75019f(int i) {
        if (i < 0) {
            return true;
        }
        return mo75018e(i);
    }

    /* renamed from: c */
    public static String m96244c(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(".zip");
        return sb.toString();
    }

    /* renamed from: a */
    public final String mo75013a(int i) {
        StringBuilder sb = new StringBuilder();
        String str = this.f77357a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i);
        sb.append(new File(str, sb2.toString()).getAbsolutePath());
        sb.append(File.separator);
        return sb.toString();
    }

    /* renamed from: b */
    public final String mo75015b(int i) {
        StringBuilder sb;
        String str;
        String c = m96244c(i);
        if (this.f77357a.endsWith(File.separator)) {
            sb = new StringBuilder();
            str = this.f77357a;
        } else {
            sb = new StringBuilder();
            sb.append(this.f77357a);
            str = File.separator;
        }
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    /* renamed from: d */
    public final String mo75017d(int i) {
        StringBuilder sb;
        String str;
        if (this.f77357a.endsWith(File.separator)) {
            sb = new StringBuilder();
            str = this.f77357a;
        } else {
            sb = new StringBuilder();
            sb.append(this.f77357a);
            str = File.separator;
        }
        sb.append(str);
        sb.append(i);
        sb.append(File.separator);
        return sb.toString();
    }

    /* renamed from: a */
    static List<C29296g> m96242a(String str) {
        Object obj;
        String[] stringArray = C35574k.m114861b().getResources().getStringArray(R.array.a8);
        String[] stringArray2 = C35574k.m114861b().getResources().getStringArray(R.array.a9);
        ArrayList arrayList = new ArrayList();
        Application b = C35574k.m114861b();
        int i = -1;
        int i2 = 0;
        for (String str2 : stringArray) {
            C29296g gVar = new C29296g();
            gVar.f77266a = i;
            i--;
            gVar.f77270e = i2;
            if (i2 == 0) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add("normal");
                gVar.f77274i = arrayList2;
            }
            gVar.f77267b = str2;
            gVar.f77268c = stringArray2[i2];
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            String str3 = "filter_%s%s/";
            Object[] objArr = new Object[2];
            if (i2 < 10) {
                obj = Integer.valueOf(0);
            } else {
                obj = "";
            }
            objArr[0] = obj;
            objArr[1] = Integer.valueOf(i2);
            sb.append(C1642a.m8034a(str3, objArr));
            gVar.f77273h = C29341z.m96255a(sb.toString());
            gVar.mo74977a(C29341z.m96261b(gVar.f77273h));
            gVar.f77272g = "";
            StringBuilder sb2 = new StringBuilder("res://");
            sb2.append(b.getPackageName());
            sb2.append("/");
            sb2.append(b.getResources().obtainTypedArray(R.array.a_).getResourceId(i2, 0));
            gVar.f77271f = Uri.parse(sb2.toString());
            i2++;
            arrayList.add(gVar);
        }
        return arrayList;
    }

    /* renamed from: e */
    public final boolean mo75018e(int i) {
        StringBuilder sb;
        String str;
        if (this.f77357a.endsWith(File.separator)) {
            sb = new StringBuilder();
            str = this.f77357a;
        } else {
            sb = new StringBuilder();
            sb.append(this.f77357a);
            str = File.separator;
        }
        sb.append(str);
        sb.append(i);
        sb.append(File.separator);
        File file = new File(sb.toString());
        boolean z = false;
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            boolean z2 = false;
            boolean z3 = false;
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    String name = file2.getName();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(file2.getAbsolutePath());
                    sb2.append(File.separator);
                    sb2.append(name);
                    sb2.append(".png");
                    if (new File(sb2.toString()).exists()) {
                        z2 = true;
                    }
                } else if (file2.isFile() && !TextUtils.equals(FilterModel.CONFIG_FILE, file2.getName()) && TextUtils.equals("thumbnail.jpg", file2.getName())) {
                    z3 = true;
                }
            }
            if (z2 && z3) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: b */
    public final void mo75016b(C29296g gVar) {
        String str = this.f77357a;
        StringBuilder sb = new StringBuilder();
        sb.append(gVar.f77266a);
        File file = new File(str, sb.toString());
        if (mo75018e(gVar.f77266a)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(file.getAbsolutePath());
            sb2.append(File.separator);
            String sb3 = sb2.toString();
            gVar.f77273h = C29341z.m96255a(sb3);
            String b = C29341z.m96261b(gVar.f77273h);
            if (TextUtils.isEmpty(b)) {
                b = sb3;
            }
            gVar.mo74977a(b);
            StringBuilder sb4 = new StringBuilder();
            sb4.append(sb3);
            sb4.append("thumbnail.jpg");
            gVar.f77272g = sb4.toString();
            return;
        }
        String b2 = mo75015b(gVar.f77266a);
        File file2 = new File(b2);
        try {
            C7276d.m22810b(file);
            String a = C43136fo.m136824a(file2, file);
            StringBuilder sb5 = new StringBuilder();
            sb5.append(a);
            sb5.append(File.separator);
            gVar.f77273h = C29341z.m96255a(sb5.toString());
            String b3 = C29341z.m96261b(gVar.f77273h);
            if (TextUtils.isEmpty(b3)) {
                b3 = a;
            }
            gVar.mo74977a(b3);
            StringBuilder sb6 = new StringBuilder();
            sb6.append(a);
            sb6.append(File.separator);
            sb6.append("thumbnail.jpg");
            gVar.f77272g = sb6.toString();
        } catch (IOException e) {
            StringBuilder sb7 = new StringBuilder("filter unzip error");
            sb7.append(gVar.f77266a);
            sb7.append(" filterZipFile path ->");
            sb7.append(b2);
            sb7.append(" filterZipFile path exit ->");
            sb7.append(file2.exists());
            C42880h.m136156a(sb7.toString());
            C42880h.m136156a(Log.getStackTraceString(e));
            C29296g b4 = m96243b();
            if (b4 != null) {
                gVar.f77273h = b4.f77273h;
                gVar.mo74977a(b4.mo74978b());
                gVar.f77272g = b4.f77272g;
                gVar.f77271f = b4.f77271f;
            }
        } finally {
            file2.delete();
        }
    }
}
