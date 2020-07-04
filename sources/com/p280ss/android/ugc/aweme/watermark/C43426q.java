package com.p280ss.android.ugc.aweme.watermark;

import android.content.res.TypedArray;
import com.bytedance.common.utility.C6311g;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.shortvideo.festival.C39880m;
import com.p280ss.android.ugc.aweme.shortvideo.festival.C39882o;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.watermark.q */
public final class C43426q {
    /* renamed from: a */
    public static C43425p[] m137815a(String str, boolean z) {
        TypedArray obtainTypedArray = C35563c.f93238a.getResources().obtainTypedArray(R.array.ax);
        int length = obtainTypedArray.length();
        int[] iArr = new int[length];
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < length; i++) {
            C43425p pVar = new C43425p();
            iArr[i] = obtainTypedArray.getResourceId(i, 0);
            pVar.mo105349a(str, iArr[i], z);
            arrayList.add(pVar);
        }
        obtainTypedArray.recycle();
        return (C43425p[]) arrayList.toArray(new C43425p[arrayList.size()]);
    }

    /* renamed from: a */
    private static C43425p[] m137814a(String str, String str2, boolean z) {
        List a = C39882o.m127634a(str2);
        if (C6311g.m19573a(a)) {
            return m137815a(str, z);
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < a.size(); i++) {
            C43425p pVar = new C43425p();
            pVar.mo105350a(str, ((C39880m) a.get(i)).f103624b, z);
            arrayList.add(pVar);
        }
        return (C43425p[]) arrayList.toArray(new C43425p[arrayList.size()]);
    }

    /* renamed from: a */
    public static String[] m137817a(C43425p[] pVarArr, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < pVarArr.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(i);
            sb.append(".png");
            String path = new File(str, sb.toString()).getPath();
            if (pVarArr[i].mo105351a(path)) {
                arrayList.add(path);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: a */
    public static String[] m137816a(String str, String str2, String str3, String str4, boolean z) {
        return m137817a(m137814a(str, str4, z), str2, str3);
    }
}
