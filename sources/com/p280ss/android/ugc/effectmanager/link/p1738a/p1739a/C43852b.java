package com.p280ss.android.ugc.effectmanager.link.p1738a.p1739a;

import com.p280ss.android.ugc.effectmanager.common.p1729d.C43725b;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.link.model.host.HostStatus;

/* renamed from: com.ss.android.ugc.effectmanager.link.a.a.b */
public final class C43852b extends C43725b {

    /* renamed from: b */
    public HostStatus f113620b;

    /* renamed from: c */
    public C43726c f113621c = null;

    public final String toString() {
        StringBuilder sb = new StringBuilder("HostStatusUpdateResult{mHostStatus=");
        sb.append(this.f113620b);
        sb.append(", mExceptionResult=");
        sb.append(this.f113621c);
        sb.append('}');
        return sb.toString();
    }

    public C43852b(HostStatus hostStatus, C43726c cVar) {
        this.f113620b = hostStatus;
    }
}
