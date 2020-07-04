package com.p280ss.android.ugc.aweme.shortvideo.edit;

import bolts.C1592h;
import bolts.C1606i;
import com.p280ss.android.ugc.asve.p754b.C15387b;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.p280ss.android.vesdk.VEListener.C45216l;
import com.p280ss.android.vesdk.VERecordData;
import com.p280ss.android.vesdk.runtime.C45345b;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.o */
public final class C39775o implements C39782s {

    /* renamed from: a */
    public C1606i<Boolean> f103396a = new C1606i<>();

    /* renamed from: b */
    public boolean f103397b;

    /* renamed from: c */
    private C15389d f103398c;

    /* renamed from: d */
    private final C15389d f103399d;

    /* renamed from: e */
    private final MultiEditVideoRecordData f103400e;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.o$a */
    public static final class C39776a implements C45216l {

        /* renamed from: a */
        final /* synthetic */ C39775o f103401a;

        C39776a(C39775o oVar) {
            this.f103401a = oVar;
        }

        /* renamed from: a */
        public final void mo99223a(int i) {
            boolean z;
            C39775o oVar = this.f103401a;
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            oVar.f103397b = z;
            this.f103401a.f103396a.mo6900a(Boolean.valueOf(this.f103401a.f103397b));
        }
    }

    /* renamed from: c */
    public final String[] mo70484c() {
        return this.f103399d.mo38855i();
    }

    /* renamed from: d */
    public final String[] mo70485d() {
        return this.f103399d.mo38859k();
    }

    /* renamed from: e */
    public final String[] mo70486e() {
        return this.f103399d.mo38857j();
    }

    /* renamed from: b */
    public final boolean mo70483b() {
        if (mo70484c() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final C1592h<Boolean> mo70482a() {
        if (mo70484c() != null) {
            this.f103397b = true;
            this.f103396a.mo6900a(Boolean.valueOf(this.f103397b));
        } else {
            C45345b a = this.f103399d.mo38796a();
            VERecordData convertData = this.f103400e.convertData();
            C7573i.m23582a((Object) convertData, "recordData.convertData()");
            this.f103398c = C15387b.m44885a(a, convertData, new C39776a(this));
        }
        C1592h<TResult> hVar = this.f103396a.f6010a;
        C7573i.m23582a((Object) hVar, "prepareTask.task");
        return hVar;
    }

    public C39775o(C15389d dVar, MultiEditVideoRecordData multiEditVideoRecordData) {
        C7573i.m23587b(dVar, "srcVEEditor");
        C7573i.m23587b(multiEditVideoRecordData, "recordData");
        this.f103399d = dVar;
        this.f103400e = multiEditVideoRecordData;
    }
}
