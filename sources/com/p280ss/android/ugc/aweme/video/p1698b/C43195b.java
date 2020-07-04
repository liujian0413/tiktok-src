package com.p280ss.android.ugc.aweme.video.p1698b;

import com.p280ss.android.ugc.aweme.video.experiment.C43220a;
import com.p280ss.android.ugc.aweme.video.p1699c.C43201a;
import com.p280ss.android.ugc.aweme.video.p1699c.C43202b;
import com.p280ss.android.ugc.aweme.video.p1699c.C43203c;
import com.p280ss.android.ugc.aweme.video.p1699c.C43204d;
import com.p280ss.android.ugc.aweme.video.p1699c.C43205e;
import com.p280ss.android.ugc.aweme.video.preload.C43305j;
import com.p280ss.android.ugc.playerkit.session.C44926b;
import com.p280ss.android.ugc.playerkit.videoview.p1753b.C44940c;
import com.p280ss.android.ugc.playerkit.videoview.p1755d.C44949c;
import com.p280ss.android.ugc.playerkit.videoview.p1755d.C44953g;
import com.p280ss.android.ugc.playerkit.videoview.p1755d.C44957i;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.video.b.b */
public final class C43195b implements C44940c {

    /* renamed from: a */
    private ArrayList<C44953g> f111835a = new ArrayList<>();

    /* renamed from: b */
    private volatile C44953g f111836b;

    public C43195b() {
        this.f111835a.add(new C43203c());
        this.f111835a.add(new C43204d());
        this.f111835a.add(C43202b.f111848a);
    }

    /* renamed from: a */
    private void m136958a() {
        boolean z;
        if (this.f111836b == null) {
            synchronized (this) {
                if (this.f111836b == null) {
                    if (C43220a.m137073b() == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        this.f111836b = new C43205e(C43305j.m137386g());
                    } else {
                        this.f111836b = new C43201a();
                    }
                    this.f111835a.add(this.f111836b);
                }
            }
        }
    }

    /* renamed from: a */
    public final C44949c mo104828a(C44926b bVar) {
        m136958a();
        return new C44957i(this.f111835a, C43220a.m137077f());
    }
}
