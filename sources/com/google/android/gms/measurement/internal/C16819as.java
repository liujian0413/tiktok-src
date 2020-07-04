package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.support.p022v4.util.ArrayMap;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.util.C15322e;
import com.google.android.gms.internal.measurement.C16486dv;
import com.google.android.gms.internal.measurement.C16487dw;
import com.google.android.gms.internal.measurement.C16488dx;
import com.google.android.gms.internal.measurement.C16490dz;
import com.google.android.gms.internal.measurement.C16493eb;
import com.google.android.gms.internal.measurement.C16494ec;
import com.google.android.gms.internal.measurement.C16495ed;
import com.google.android.gms.internal.measurement.C16676km;
import com.google.android.gms.internal.measurement.C16678ko;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.as */
public final class C16819as extends C16911ec implements C16932ew {

    /* renamed from: b */
    private static int f46970b = 65535;

    /* renamed from: c */
    private static int f46971c = 2;

    /* renamed from: d */
    private final Map<String, Map<String, String>> f46972d = new ArrayMap();

    /* renamed from: e */
    private final Map<String, Map<String, Boolean>> f46973e = new ArrayMap();

    /* renamed from: f */
    private final Map<String, Map<String, Boolean>> f46974f = new ArrayMap();

    /* renamed from: g */
    private final Map<String, C16494ec> f46975g = new ArrayMap();

    /* renamed from: h */
    private final Map<String, Map<String, Integer>> f46976h = new ArrayMap();

    /* renamed from: i */
    private final Map<String, String> f46977i = new ArrayMap();

    C16819as(C16912ed edVar) {
        super(edVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo43637d() {
        return false;
    }

    /* renamed from: h */
    private final void m55439h(String str) {
        mo43843j();
        mo43571c();
        C15267r.m44386a(str);
        if (this.f46975g.get(str) == null) {
            byte[] d = mo43643h().mo44105d(str);
            if (d == null) {
                this.f46972d.put(str, null);
                this.f46973e.put(str, null);
                this.f46974f.put(str, null);
                this.f46975g.put(str, null);
                this.f46977i.put(str, null);
                this.f46976h.put(str, null);
                return;
            }
            C16494ec a = m55436a(str, d);
            this.f46972d.put(str, m55437a(a));
            m55438a(str, a);
            this.f46975g.put(str, a);
            this.f46977i.put(str, null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C16494ec mo43628a(String str) {
        mo43843j();
        mo43571c();
        C15267r.m44386a(str);
        m55439h(str);
        return (C16494ec) this.f46975g.get(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo43631b(String str) {
        mo43571c();
        return (String) this.f46977i.get(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo43633c(String str) {
        mo43571c();
        this.f46977i.put(str, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo43636d(String str) {
        mo43571c();
        this.f46975g.remove(str);
    }

    /* renamed from: a */
    public final String mo43629a(String str, String str2) {
        mo43571c();
        m55439h(str);
        Map map = (Map) this.f46972d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    /* renamed from: a */
    private static Map<String, String> m55437a(C16494ec ecVar) {
        C16495ed[] edVarArr;
        ArrayMap arrayMap = new ArrayMap();
        if (!(ecVar == null || ecVar.f46164c == null)) {
            for (C16495ed edVar : ecVar.f46164c) {
                if (edVar != null) {
                    arrayMap.put(edVar.f46171a, edVar.f46172b);
                }
            }
        }
        return arrayMap;
    }

    /* renamed from: a */
    private final void m55438a(String str, C16494ec ecVar) {
        C16493eb[] ebVarArr;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = new ArrayMap();
        ArrayMap arrayMap3 = new ArrayMap();
        if (!(ecVar == null || ecVar.f46165d == null)) {
            for (C16493eb ebVar : ecVar.f46165d) {
                if (TextUtils.isEmpty(ebVar.f46158a)) {
                    mo43585q().f47490d.mo44160a("EventConfig contained null event name");
                } else {
                    String a = C16851bx.m55590a(ebVar.f46158a);
                    if (!TextUtils.isEmpty(a)) {
                        ebVar.f46158a = a;
                    }
                    arrayMap.put(ebVar.f46158a, ebVar.f46159b);
                    arrayMap2.put(ebVar.f46158a, ebVar.f46160c);
                    if (ebVar.f46161d != null) {
                        if (ebVar.f46161d.intValue() < f46971c || ebVar.f46161d.intValue() > f46970b) {
                            mo43585q().f47490d.mo44162a("Invalid sampling rate. Event name, sample rate", ebVar.f46158a, ebVar.f46161d);
                        } else {
                            arrayMap3.put(ebVar.f46158a, ebVar.f46161d);
                        }
                    }
                }
            }
        }
        this.f46973e.put(str, arrayMap);
        this.f46974f.put(str, arrayMap2);
        this.f46976h.put(str, arrayMap3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo43630a(String str, byte[] bArr, String str2) {
        byte[] bArr2;
        C16487dw[] dwVarArr;
        C16490dz[] dzVarArr;
        C16488dx[] dxVarArr;
        String str3 = str;
        mo43843j();
        mo43571c();
        C15267r.m44386a(str);
        C16494ec a = m55436a(str, bArr);
        m55438a(str3, a);
        this.f46975g.put(str3, a);
        this.f46977i.put(str3, str2);
        this.f46972d.put(str3, m55437a(a));
        C16927er g = mo43641g();
        C16486dv[] dvVarArr = a.f46166e;
        C15267r.m44384a(dvVarArr);
        for (C16486dv dvVar : dvVarArr) {
            for (C16487dw dwVar : dvVar.f46122c) {
                String a2 = C16851bx.m55590a(dwVar.f46127b);
                if (a2 != null) {
                    dwVar.f46127b = a2;
                }
                for (C16488dx dxVar : dwVar.f46128c) {
                    String a3 = C16852by.m55591a(dxVar.f46137d);
                    if (a3 != null) {
                        dxVar.f46137d = a3;
                    }
                }
            }
            for (C16490dz dzVar : dvVar.f46121b) {
                String a4 = C16853bz.m55592a(dzVar.f46145b);
                if (a4 != null) {
                    dzVar.f46145b = a4;
                }
            }
        }
        g.mo43643h().mo44092a(str3, dvVarArr);
        try {
            a.f46166e = null;
            bArr2 = new byte[a.mo43168e()];
            a.mo42655a(C16678ko.m54756a(bArr2, 0, bArr2.length));
        } catch (IOException e) {
            mo43585q().f47490d.mo44162a("Unable to serialize reduced-size config. Storing full config instead. appId", C16953r.m56340a(str), e);
            bArr2 = bArr;
        }
        C16933ex h = mo43643h();
        C15267r.m44386a(str);
        h.mo43571c();
        h.mo43843j();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr2);
        try {
            if (((long) h.mo44115w().update("apps", contentValues, "app_id = ?", new String[]{str3})) == 0) {
                h.mo43585q().f47487a.mo44161a("Failed to update remote config (got 0). appId", C16953r.m56340a(str));
            }
        } catch (SQLiteException e2) {
            h.mo43585q().f47487a.mo44162a("Error storing remote config. appId", C16953r.m56340a(str), e2);
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo43632b(String str, String str2) {
        mo43571c();
        m55439h(str);
        if (mo43640f(str) && C16922em.m55974e(str2)) {
            return true;
        }
        if (mo43642g(str) && C16922em.m55963a(str2)) {
            return true;
        }
        Map map = (Map) this.f46973e.get(str);
        if (map == null) {
            return false;
        }
        Boolean bool = (Boolean) map.get(str2);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final boolean mo43634c(String str, String str2) {
        mo43571c();
        m55439h(str);
        if ("ecommerce_purchase".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f46974f.get(str);
        if (map == null) {
            return false;
        }
        Boolean bool = (Boolean) map.get(str2);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final int mo43635d(String str, String str2) {
        mo43571c();
        m55439h(str);
        Map map = (Map) this.f46976h.get(str);
        if (map == null) {
            return 1;
        }
        Integer num = (Integer) map.get(str2);
        if (num == null) {
            return 1;
        }
        return num.intValue();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final long mo43638e(String str) {
        String a = mo43629a(str, "measurement.account.time_zone_offset_minutes");
        if (!TextUtils.isEmpty(a)) {
            try {
                return Long.parseLong(a);
            } catch (NumberFormatException e) {
                mo43585q().f47490d.mo44162a("Unable to parse timezone offset. appId", C16953r.m56340a(str), e);
            }
        }
        return 0;
    }

    /* renamed from: a */
    private final C16494ec m55436a(String str, byte[] bArr) {
        if (bArr == null) {
            return new C16494ec();
        }
        C16676km a = C16676km.m54726a(bArr, 0, bArr.length);
        C16494ec ecVar = new C16494ec();
        try {
            ecVar.mo42654a(a);
            mo43585q().f47495i.mo44162a("Parsed config. version, gmp_app_id", ecVar.f46162a, ecVar.f46163b);
            return ecVar;
        } catch (IOException e) {
            mo43585q().f47490d.mo44162a("Unable to merge remote config. appId", C16953r.m56340a(str), e);
            return new C16494ec();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final boolean mo43640f(String str) {
        return "1".equals(mo43629a(str, "measurement.upload.blacklist_internal"));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final boolean mo43642g(String str) {
        return "1".equals(mo43629a(str, "measurement.upload.blacklist_public"));
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C16919ej mo43639f() {
        return super.mo43639f();
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ C16927er mo43641g() {
        return super.mo43641g();
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C16933ex mo43643h() {
        return super.mo43643h();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo43566a() {
        super.mo43566a();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo43569b() {
        super.mo43569b();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo43571c() {
        super.mo43571c();
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C16827b mo43579k() {
        return super.mo43579k();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C15322e mo43580l() {
        return super.mo43580l();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ Context mo43581m() {
        return super.mo43581m();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C16951p mo43582n() {
        return super.mo43582n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C16922em mo43583o() {
        return super.mo43583o();
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C16820at mo43584p() {
        return super.mo43584p();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C16953r mo43585q() {
        return super.mo43585q();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C16806af mo43586r() {
        return super.mo43586r();
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C16930eu mo43587s() {
        return super.mo43587s();
    }
}
