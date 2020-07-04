package com.p280ss.android.ugc.aweme.shortvideo.edit;

import bolts.C1592h;
import bolts.C1606i;
import com.p280ss.android.ugc.asve.p754b.C15387b;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.aweme.shortvideo.cut.C38789o.C38790a;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.p280ss.android.vesdk.C45255af;
import com.p280ss.android.vesdk.VEListener.C45216l;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.x */
public final class C39787x implements C39782s {

    /* renamed from: a */
    public C1606i<Boolean> f103422a = new C1606i<>();

    /* renamed from: b */
    public boolean f103423b;

    /* renamed from: c */
    private C15389d f103424c;

    /* renamed from: d */
    private final C15389d f103425d;

    /* renamed from: e */
    private final EditPreviewInfo f103426e;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.x$a */
    public static final class C39788a implements C45216l {

        /* renamed from: a */
        final /* synthetic */ C39787x f103427a;

        C39788a(C39787x xVar) {
            this.f103427a = xVar;
        }

        /* renamed from: a */
        public final void mo99223a(int i) {
            boolean z;
            C39787x xVar = this.f103427a;
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            xVar.f103423b = z;
            this.f103427a.f103422a.mo6900a(Boolean.valueOf(this.f103427a.f103423b));
        }
    }

    /* renamed from: c */
    public final String[] mo70484c() {
        return this.f103425d.mo38855i();
    }

    /* renamed from: d */
    public final String[] mo70485d() {
        return this.f103425d.mo38859k();
    }

    /* renamed from: e */
    public final String[] mo70486e() {
        return this.f103425d.mo38857j();
    }

    /* renamed from: b */
    public final boolean mo70483b() {
        if (mo70484c() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private final int[] m127399g() {
        if (this.f103426e.getSceneIn() > 0 || this.f103426e.getSceneOut() > 0) {
            return new int[]{(int) this.f103426e.getSceneIn(), (int) this.f103426e.getSceneOut()};
        }
        return new int[]{0, this.f103425d.mo38860l()};
    }

    /* renamed from: a */
    public final C1592h<Boolean> mo70482a() {
        if (mo70484c() != null) {
            this.f103423b = true;
            this.f103422a.mo6900a(Boolean.valueOf(this.f103423b));
        } else if (this.f103424c == null) {
            int[] g = m127399g();
            this.f103424c = C15387b.m44886a(this.f103425d.mo38796a(), m127398f(), g[0], g[1], new C39788a(this));
        }
        C1592h<TResult> hVar = this.f103422a.f6010a;
        C7573i.m23582a((Object) hVar, "prepareTask.task");
        return hVar;
    }

    /* renamed from: f */
    private final C45255af m127398f() {
        String[] strArr = new String[this.f103426e.getVideoList().size()];
        int i = 0;
        int i2 = 0;
        for (Object next : this.f103426e.getVideoList()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C7525m.m23465b();
            }
            strArr[i2] = ((EditVideoSegment) next).getVideoPath();
            i2 = i3;
        }
        C45255af afVar = new C45255af(strArr);
        for (Object next2 : this.f103426e.getVideoList()) {
            int i4 = i + 1;
            if (i < 0) {
                C7525m.m23465b();
            }
            VideoCutInfo videoCutInfo = ((EditVideoSegment) next2).getVideoCutInfo();
            if (videoCutInfo != null) {
                afVar.f116440e[i] = (int) videoCutInfo.getStart();
                afVar.f116441f[i] = (int) videoCutInfo.getEnd();
                afVar.f116444i[i] = (double) videoCutInfo.getSpeed();
                afVar.f116446k[i] = C38790a.m123896a(videoCutInfo.getRotate());
            }
            i = i4;
        }
        return afVar;
    }

    public C39787x(C15389d dVar, EditPreviewInfo editPreviewInfo) {
        C7573i.m23587b(dVar, "srcVEEditor");
        C7573i.m23587b(editPreviewInfo, "editPreviewInfo");
        this.f103425d = dVar;
        this.f103426e = editPreviewInfo;
    }
}
