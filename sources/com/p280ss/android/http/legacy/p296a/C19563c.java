package com.p280ss.android.http.legacy.p296a;

import com.p280ss.android.http.legacy.C19568b;
import com.p280ss.android.http.legacy.C19572d;
import com.p280ss.android.http.legacy.ParseException;
import com.p280ss.android.http.legacy.p876c.C19570a;
import com.p280ss.android.http.legacy.p877d.C19574b;
import java.util.ArrayList;

/* renamed from: com.ss.android.http.legacy.a.c */
public final class C19563c implements C19566g {

    /* renamed from: a */
    public static final C19563c f52936a = new C19563c();

    /* renamed from: b */
    private static final char[] f52937b = {';', ','};

    /* renamed from: d */
    private C19572d m64461d(C19574b bVar, C19567h hVar) {
        return m64455a(bVar, hVar, f52937b);
    }

    /* renamed from: a */
    private static C19572d m64456a(String str, String str2) {
        return new C19565e(str, str2);
    }

    /* renamed from: a */
    private static boolean m64457a(char c, char[] cArr) {
        if (cArr != null) {
            for (char c2 : cArr) {
                if (c == c2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static final C19568b[] m64458a(String str, C19566g gVar) throws ParseException {
        if (str != null) {
            C19563c cVar = f52936a;
            C19574b bVar = new C19574b(str.length());
            bVar.mo51739a(str);
            return cVar.mo51720a(bVar, new C19567h(0, str.length()));
        }
        throw new IllegalArgumentException("Value to parse may not be null");
    }

    /* renamed from: b */
    private C19568b m64459b(C19574b bVar, C19567h hVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("Char array buffer may not be null");
        } else if (hVar != null) {
            C19572d d = m64461d(bVar, hVar);
            C19572d[] dVarArr = null;
            if (!hVar.mo51729a() && bVar.mo51734a(hVar.f52943c - 1) != ',') {
                dVarArr = m64460c(bVar, hVar);
            }
            return m64454a(d.mo51722a(), d.mo51723b(), dVarArr);
        } else {
            throw new IllegalArgumentException("Parser cursor may not be null");
        }
    }

    /* renamed from: c */
    private C19572d[] m64460c(C19574b bVar, C19567h hVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("Char array buffer may not be null");
        } else if (hVar != null) {
            int i = hVar.f52943c;
            int i2 = hVar.f52942b;
            while (i < i2 && C19570a.m64475a(bVar.mo51734a(i))) {
                i++;
            }
            hVar.mo51728a(i);
            if (hVar.mo51729a()) {
                return new C19572d[0];
            }
            ArrayList arrayList = new ArrayList();
            while (!hVar.mo51729a()) {
                arrayList.add(m64461d(bVar, hVar));
                if (bVar.mo51734a(hVar.f52943c - 1) == ',') {
                    break;
                }
            }
            return (C19572d[]) arrayList.toArray(new C19572d[arrayList.size()]);
        } else {
            throw new IllegalArgumentException("Parser cursor may not be null");
        }
    }

    /* renamed from: a */
    public final C19568b[] mo51720a(C19574b bVar, C19567h hVar) {
        ArrayList arrayList = new ArrayList();
        while (!hVar.mo51729a()) {
            C19568b b = m64459b(bVar, hVar);
            if (b.mo51713a().length() != 0 || b.mo51714b() != null) {
                arrayList.add(b);
            }
        }
        return (C19568b[]) arrayList.toArray(new C19568b[arrayList.size()]);
    }

    /* renamed from: a */
    private static C19568b m64454a(String str, String str2, C19572d[] dVarArr) {
        return new C19562b(str, str2, dVarArr);
    }

    /* renamed from: a */
    private C19572d m64455a(C19574b bVar, C19567h hVar, char[] cArr) {
        boolean z;
        boolean z2;
        String str;
        if (bVar == null) {
            throw new IllegalArgumentException("Char array buffer may not be null");
        } else if (hVar != null) {
            int i = hVar.f52943c;
            int i2 = hVar.f52943c;
            int i3 = hVar.f52942b;
            while (true) {
                z = true;
                if (i >= i3) {
                    break;
                }
                char a = bVar.mo51734a(i);
                if (a == '=') {
                    break;
                } else if (m64457a(a, cArr)) {
                    z2 = true;
                    break;
                } else {
                    i++;
                }
            }
            z2 = false;
            if (i == i3) {
                str = bVar.mo51740b(i2, i3);
                z2 = true;
            } else {
                str = bVar.mo51740b(i2, i);
                i++;
            }
            if (z2) {
                hVar.mo51728a(i);
                return m64456a(str, (String) null);
            }
            int i4 = i;
            boolean z3 = false;
            boolean z4 = false;
            while (true) {
                if (i4 >= i3) {
                    z = z2;
                    break;
                }
                char a2 = bVar.mo51734a(i4);
                if (a2 == '\"' && !z3) {
                    z4 = !z4;
                }
                if (!z4 && !z3 && m64457a(a2, cArr)) {
                    break;
                }
                if (z3 || !z4 || a2 != '\\') {
                    z3 = false;
                } else {
                    z3 = true;
                }
                i4++;
            }
            while (i < i4 && C19570a.m64475a(bVar.mo51734a(i))) {
                i++;
            }
            int i5 = i4;
            while (i5 > i && C19570a.m64475a(bVar.mo51734a(i5 - 1))) {
                i5--;
            }
            if (i5 - i >= 2 && bVar.mo51734a(i) == '\"' && bVar.mo51734a(i5 - 1) == '\"') {
                i++;
                i5--;
            }
            String a3 = bVar.mo51735a(i, i5);
            if (z) {
                i4++;
            }
            hVar.mo51728a(i4);
            return m64456a(str, a3);
        } else {
            throw new IllegalArgumentException("Parser cursor may not be null");
        }
    }
}
