package com.p280ss.android.ugc.aweme.shortvideo.p1551c;

import com.p280ss.android.ugc.aweme.beauty.C23534e;
import com.p280ss.android.ugc.aweme.beauty.C23536f;
import com.p280ss.android.ugc.aweme.filter.C29296g;
import com.p280ss.android.ugc.aweme.filter.C29341z;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.c.c */
public class C38556c implements C38555b {
    /* renamed from: a */
    public Property mo96543a() {
        return Property.BackCameraFilter;
    }

    /* renamed from: b */
    public Property mo96545b() {
        return Property.FrontCameraFilter;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0034 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0035  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo96542a(int r4) {
        /*
            r3 = this;
            r0 = -1
            if (r4 != 0) goto L_0x001c
            com.ss.android.ugc.aweme.property.AVSettings r1 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L
            com.ss.android.ugc.aweme.property.AVSettings$Property r2 = r3.mo96543a()
            boolean r1 = r1.mo93347f(r2)
            if (r1 == 0) goto L_0x001a
            com.ss.android.ugc.aweme.property.AVSettings r1 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L
            com.ss.android.ugc.aweme.property.AVSettings$Property r2 = r3.mo96543a()
            int r1 = r1.mo93343b(r2)
            goto L_0x0032
        L_0x001a:
            r1 = -1
            goto L_0x0032
        L_0x001c:
            com.ss.android.ugc.aweme.property.AVSettings r1 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L
            com.ss.android.ugc.aweme.property.AVSettings$Property r2 = r3.mo96545b()
            boolean r1 = r1.mo93347f(r2)
            if (r1 == 0) goto L_0x001a
            com.ss.android.ugc.aweme.property.AVSettings r1 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L
            com.ss.android.ugc.aweme.property.AVSettings$Property r2 = r3.mo96545b()
            int r1 = r1.mo93343b(r2)
        L_0x0032:
            if (r1 == r0) goto L_0x0035
            return r1
        L_0x0035:
            int r4 = r3.mo96546b(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.p1551c.C38556c.mo96542a(int):int");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo96546b(int i) {
        C29296g gVar;
        Map map = (Map) C35563c.m114837d().mo74824b().getValue();
        C29296g gVar2 = null;
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            gVar = null;
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Entry entry = (Entry) it.next();
                if (i2 != 0) {
                    if (i2 == 1 && entry != null && entry.getValue() != null && !((List) entry.getValue()).isEmpty()) {
                        gVar2 = (C29296g) ((List) entry.getValue()).get(0);
                        break;
                    }
                } else if (!(entry == null || entry.getValue() == null || ((List) entry.getValue()).isEmpty())) {
                    gVar = (C29296g) ((List) entry.getValue()).get(0);
                }
                i2++;
            }
        } else {
            gVar = null;
        }
        if (gVar2 != null && i == 0 && C29341z.m96266c(gVar2)) {
            return gVar2.f77270e;
        }
        if (gVar == null || i != 1 || !C29341z.m96266c(gVar)) {
            return 0;
        }
        return gVar.f77270e;
    }

    /* renamed from: a */
    public final void mo96544a(int i, int i2) {
        if (i == 0) {
            C35563c.f93230L.mo93338a(mo96543a(), i2);
        } else {
            C35563c.f93230L.mo93338a(mo96545b(), i2);
        }
        if (C23536f.m77298a()) {
            C35574k.m114859a().mo70099n().mo61326a(new C23534e("EFFECT_ID_TYPE_FILTER", 2), true);
        }
    }
}
