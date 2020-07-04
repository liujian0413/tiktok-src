package com.p280ss.android.ugc.aweme.filter;

import android.net.Uri;
import android.text.TextUtils;
import bolts.C1592h;
import com.bytedance.common.utility.C6311g;
import com.p280ss.android.ugc.aweme.common.p1145f.C25682d;
import com.p280ss.android.ugc.aweme.effect.p1197c.C27400a;
import com.p280ss.android.ugc.aweme.filter.p1243b.C29237a;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.port.internal.C35622l;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41525ah;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.filter.z */
public final class C29341z {
    /* renamed from: a */
    public static void m96257a() {
        m96258a(false);
    }

    /* renamed from: c */
    private static void m96265c() {
        C41525ah.m132266a();
        C35622l lVar = (C35622l) C25682d.m84426a(C35574k.m114861b(), C35622l.class);
        int h = C35574k.m114859a().mo70102q().mo83141h();
        if (h != lVar.mo60357a()) {
            C41525ah.m132267a(true);
            lVar.mo60359a(h);
        }
    }

    /* renamed from: b */
    public static void m96263b() {
        C35574k.m114859a().mo70097l().mo74954g();
        C35574k.m114859a().mo70097l().mo74951d().mo74832e();
        FilterManager.m95700a().mo74728l();
        ((C35622l) C25682d.m84426a(C35574k.m114861b(), C35622l.class)).mo60359a(-1);
        C35574k.m114859a().mo70091f().mo93341a(Property.UlikeBeautyCopied, false);
        C35574k.m114859a().mo70091f().mo93341a(Property.ContourModelCopied, false);
        C35574k.m114859a().mo70091f().mo93341a(Property.ReshapeModelCopied, false);
    }

    /* renamed from: f */
    private static C29296g m96271f(int i) {
        return C29196ab.m95826a(i);
    }

    /* renamed from: a */
    public static String m96253a(int i) {
        String str = "";
        C29296g f = m96271f(i);
        if (f != null) {
            return f.f77267b;
        }
        return str;
    }

    /* renamed from: b */
    public static String m96259b(int i) {
        String str = "";
        C29296g f = m96271f(i);
        if (f != null) {
            return f.f77268c;
        }
        return str;
    }

    /* renamed from: c */
    public static String m96264c(int i) {
        String str = "";
        C29296g f = m96271f(i);
        if (f != null) {
            return f.f77273h;
        }
        return str;
    }

    /* renamed from: d */
    public static String m96267d(int i) {
        String str = "";
        C29296g f = m96271f(i);
        if (f != null) {
            return f.mo74978b();
        }
        return str;
    }

    /* renamed from: e */
    public static Uri m96269e(int i) {
        Uri parse = Uri.parse("");
        C29296g f = m96271f(i);
        if (f != null) {
            return f.f77271f;
        }
        return parse;
    }

    /* renamed from: a */
    public static void m96258a(boolean z) {
        m96265c();
        C1592h.m7853a((Callable<TResult>) new C29195aa<TResult>(z));
    }

    /* renamed from: b */
    public static String m96260b(C29296g gVar) {
        return C29340y.m96241a().mo75017d(gVar.f77266a);
    }

    /* renamed from: c */
    public static boolean m96266c(C29296g gVar) {
        if (gVar != null && 1 == m96252a(gVar)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static int m96252a(C29296g gVar) {
        if (gVar == null) {
            return 0;
        }
        if (gVar.f77266a < 0) {
            return 1;
        }
        C27400a c = FilterManager.m95700a().mo74720c();
        if (c.mo70506a(gVar) || c.mo70510b(gVar)) {
            return 2;
        }
        if (C29340y.m96241a().mo75019f(gVar.f77266a)) {
            return 1;
        }
        return 0;
    }

    /* renamed from: b */
    public static String m96261b(String str) {
        String str2 = "";
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        File file = new File(str);
        if (file.exists() && file.isFile()) {
            File parentFile = file.getParentFile().getParentFile();
            if (parentFile != null && parentFile.exists() && parentFile.isDirectory()) {
                str2 = parentFile.getAbsolutePath();
            }
        }
        return str2;
    }

    /* renamed from: d */
    public static void m96268d(C29296g gVar) {
        if (gVar != null && !C6311g.m19573a((List) C35574k.m114859a().mo70097l().mo74951d().mo74833f().getValue())) {
            new C29237a((List) C35574k.m114859a().mo70097l().mo74951d().mo74818a().getValue()).mo74855a(gVar);
        }
    }

    /* renamed from: e */
    public static C29296g m96270e(C29296g gVar) {
        if (gVar == null) {
            return null;
        }
        C29296g gVar2 = new C29296g();
        gVar2.f77268c = gVar.f77268c;
        gVar2.f77273h = gVar.f77273h;
        gVar2.mo74977a(gVar.mo74978b());
        gVar2.f77266a = gVar.f77266a;
        gVar2.f77267b = gVar.f77267b;
        gVar2.f77269d = gVar.f77269d;
        gVar2.f77272g = gVar.f77272g;
        gVar2.f77271f = gVar.f77271f;
        gVar2.f77274i = gVar.mo74976a();
        return gVar2;
    }

    /* renamed from: a */
    public static String m96254a(Effect effect) {
        if (effect == null) {
            return null;
        }
        List<String> tags = effect.getTags();
        if (C6311g.m19573a(tags)) {
            return null;
        }
        for (String str : tags) {
            if (str.startsWith("pinyin:")) {
                return str.substring(7);
            }
        }
        return null;
    }

    /* renamed from: b */
    static final /* synthetic */ Void m96262b(boolean z) throws Exception {
        try {
            FilterManager.m95700a().mo74716a(z);
        } catch (Throwable th) {
            C6921a.m21559a(th);
        }
        return null;
    }

    /* renamed from: f */
    private static void m96272f(C29296g gVar) {
        if (gVar != null) {
            String a = C29340y.m96241a().mo75014a(gVar);
            if (TextUtils.isEmpty(gVar.f77273h)) {
                gVar.f77273h = m96255a(a);
            }
            if (TextUtils.isEmpty(gVar.mo74978b())) {
                gVar.mo74977a(m96261b(gVar.f77273h));
            }
            if (TextUtils.isEmpty(gVar.f77272g)) {
                StringBuilder sb = new StringBuilder();
                sb.append(a);
                sb.append("thumbnail.jpg");
                gVar.f77272g = sb.toString();
            }
        }
    }

    /* renamed from: a */
    public static String m96255a(String str) {
        String str2 = "";
        File file = new File(str);
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return str2;
            }
            String str3 = str2;
            for (File file2 : listFiles) {
                if (file2 != null && file2.isDirectory()) {
                    String name = file2.getName();
                    File[] listFiles2 = file2.listFiles();
                    if (listFiles2 != null) {
                        int length = listFiles2.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                break;
                            }
                            File file3 = listFiles2[i];
                            if (file3 != null && file3.isFile()) {
                                String name2 = file3.getName();
                                StringBuilder sb = new StringBuilder();
                                sb.append(name);
                                sb.append(".png");
                                if (name2.equals(sb.toString())) {
                                    str3 = file3.getAbsolutePath();
                                    break;
                                }
                            }
                            i++;
                        }
                    }
                }
            }
            str2 = str3;
        }
        return str2;
    }

    /* renamed from: a */
    public static List<C29296g> m96256a(List<C29296g> list) {
        if (C6311g.m19573a(list)) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C29296g gVar : list) {
            if (m96266c(gVar)) {
                C29296g e = m96270e(gVar);
                m96272f(e);
                m96272f(gVar);
                arrayList.add(e);
            } else {
                arrayList2.add(gVar);
            }
        }
        if (!arrayList.isEmpty()) {
            C35574k.m114859a().mo70097l().mo74951d().mo74831d(arrayList);
        }
        return arrayList2;
    }
}
