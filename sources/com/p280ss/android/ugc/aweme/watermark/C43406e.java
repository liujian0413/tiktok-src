package com.p280ss.android.ugc.aweme.watermark;

import android.content.res.TypedArray;
import com.bytedance.common.utility.C6311g;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.shortvideo.festival.C39880m;
import com.p280ss.android.ugc.aweme.shortvideo.festival.C39882o;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.watermark.e */
public final class C43406e {
    /* renamed from: a */
    public static String[] m137745a(C43403c[] cVarArr, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < cVarArr.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(i);
            sb.append(".png");
            String path = new File(str, sb.toString()).getPath();
            if (cVarArr[i].mo105312a(path)) {
                arrayList.add(path);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: a */
    public static C43403c[] m137743a(int i, int i2, String str, boolean z, boolean z2, boolean z3, C43404d dVar) {
        String str2;
        boolean z4;
        String str3 = str;
        List a = C39882o.m127634a(dVar.f112418b);
        if (C6311g.m19573a(a)) {
            return m137746b(i, i2, str, z, z2, z3, dVar);
        }
        StringBuilder sb = new StringBuilder("@");
        sb.append(str3);
        String sb2 = sb.toString();
        if (C6399b.m19947w()) {
            StringBuilder sb3 = new StringBuilder("ID:");
            sb3.append(str3);
            str2 = sb3.toString();
        } else {
            str2 = sb2;
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < a.size(); i3++) {
            C43403c cVar = new C43403c();
            String str4 = ((C39880m) a.get(i3)).f103624b;
            if (!z2 || C35563c.f93247j.mo83118c() != 0) {
                z4 = false;
            } else {
                z4 = true;
            }
            cVar.mo105310a(i, i2, str2, str4, z, z4, z3, dVar);
            arrayList.add(cVar);
        }
        return (C43403c[]) arrayList.toArray(new C43403c[arrayList.size()]);
    }

    /* renamed from: b */
    private static C43403c[] m137746b(int i, int i2, String str, boolean z, boolean z2, boolean z3, C43404d dVar) {
        boolean z4;
        String str2 = str;
        TypedArray obtainTypedArray = C35563c.f93238a.getResources().obtainTypedArray(R.array.ax);
        int length = obtainTypedArray.length();
        int[] iArr = new int[length];
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder("@");
        sb.append(str2);
        String sb2 = sb.toString();
        if (C6399b.m19947w()) {
            StringBuilder sb3 = new StringBuilder("ID:");
            sb3.append(str2);
            sb2 = sb3.toString();
        }
        int i3 = 0;
        int i4 = 0;
        while (i4 < length) {
            C43403c cVar = new C43403c();
            iArr[i4] = obtainTypedArray.getResourceId(i4, i3);
            int i5 = iArr[i4];
            if (!z2 || C35563c.f93247j.mo83118c() != 0) {
                z4 = false;
            } else {
                z4 = true;
            }
            C43403c cVar2 = cVar;
            cVar.mo105309a(i, i2, sb2, i5, z, z4, z3, dVar);
            arrayList.add(cVar2);
            i4++;
            i3 = 0;
        }
        obtainTypedArray.recycle();
        return (C43403c[]) arrayList.toArray(new C43403c[arrayList.size()]);
    }

    /* renamed from: a */
    public static String[] m137744a(int i, int i2, String str, String str2, String str3, boolean z, boolean z2, boolean z3, C43404d dVar) {
        return m137745a(m137743a(i, i2, str, z, z2, z3, dVar), str2, str3);
    }
}
