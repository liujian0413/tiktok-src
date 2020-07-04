package com.p280ss.android.ugc.aweme.shortvideo.cut.scene;

import android.content.Intent;
import android.view.View;
import com.bytedance.apm.util.C6292i;
import com.p280ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p280ss.android.ugc.aweme.shortvideo.cut.C39239u;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.adapter.StickPointVideoSegmentAdapter;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p1556c.C39172j;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.be */
public final class C39035be implements C39054bn {

    /* renamed from: a */
    public C39172j f101329a;

    /* renamed from: b */
    private StickPointVideoSegmentAdapter f101330b;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.be$a */
    public static final class C39036a implements C39172j {

        /* renamed from: a */
        final /* synthetic */ C39035be f101331a;

        C39036a(C39035be beVar) {
            this.f101331a = beVar;
        }

        /* renamed from: a */
        public final void mo96997a(View view) {
            C39172j jVar = this.f101331a.f101329a;
            if (jVar != null) {
                jVar.mo96997a(view);
            }
        }

        /* renamed from: b */
        public final void mo96999b(View view) {
            C39172j jVar = this.f101331a.f101329a;
            if (jVar != null) {
                jVar.mo96999b(view);
            }
        }

        /* renamed from: c */
        public final void mo97000c(View view) {
            C39172j jVar = this.f101331a.f101329a;
            if (jVar != null) {
                jVar.mo97000c(view);
            }
        }

        /* renamed from: a */
        public final void mo96998a(List<? extends MediaModel> list) {
            C39172j jVar = this.f101331a.f101329a;
            if (jVar != null) {
                jVar.mo96998a(list);
            }
        }
    }

    /* renamed from: c */
    public final void mo97352c() {
        StickPointVideoSegmentAdapter stickPointVideoSegmentAdapter = this.f101330b;
        if (stickPointVideoSegmentAdapter != null) {
            stickPointVideoSegmentAdapter.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final ArrayList<String> mo97344a() {
        if (this.f101330b == null) {
            return null;
        }
        StickPointVideoSegmentAdapter stickPointVideoSegmentAdapter = this.f101330b;
        if (stickPointVideoSegmentAdapter == null) {
            C7573i.m23580a();
        }
        return stickPointVideoSegmentAdapter.mo96807b();
    }

    /* renamed from: b */
    public final long mo97350b() {
        if (this.f101330b == null) {
            return 0;
        }
        StickPointVideoSegmentAdapter stickPointVideoSegmentAdapter = this.f101330b;
        if (stickPointVideoSegmentAdapter == null) {
            C7573i.m23580a();
        }
        return stickPointVideoSegmentAdapter.mo96810c();
    }

    /* renamed from: d */
    private final List<C39239u> m124684d() {
        if (this.f101330b != null) {
            StickPointVideoSegmentAdapter stickPointVideoSegmentAdapter = this.f101330b;
            if (stickPointVideoSegmentAdapter == null) {
                C7573i.m23580a();
            }
            if (!C6292i.m19525a(stickPointVideoSegmentAdapter.mo97431d())) {
                ArrayList arrayList = new ArrayList();
                StickPointVideoSegmentAdapter stickPointVideoSegmentAdapter2 = this.f101330b;
                if (stickPointVideoSegmentAdapter2 == null) {
                    C7573i.m23580a();
                }
                for (C39239u uVar : stickPointVideoSegmentAdapter2.mo97431d()) {
                    if (!uVar.f101731b.f100768j) {
                        arrayList.add(uVar);
                    }
                }
                return arrayList;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo97347a(C39172j jVar) {
        this.f101329a = jVar;
    }

    /* renamed from: a */
    public final void mo97348a(List<? extends VideoSegment> list) {
        StickPointVideoSegmentAdapter stickPointVideoSegmentAdapter = this.f101330b;
        if (stickPointVideoSegmentAdapter != null) {
            stickPointVideoSegmentAdapter.mo96809b(list);
        }
    }

    /* renamed from: b */
    public final void mo97351b(boolean z) {
        VideoSegment videoSegment;
        List<C39239u> d = m124684d();
        if (!C6292i.m19525a(d)) {
            if (d == null) {
                C7573i.m23580a();
            }
            for (C39239u uVar : d) {
                if (uVar != null) {
                    videoSegment = uVar.f101731b;
                } else {
                    videoSegment = null;
                }
                C7573i.m23582a((Object) videoSegment, "item?.seg");
                videoSegment.f100775q = z;
            }
        }
    }

    /* renamed from: a */
    public final void mo97346a(StickPointVideoSegmentAdapter stickPointVideoSegmentAdapter) {
        this.f101330b = stickPointVideoSegmentAdapter;
        StickPointVideoSegmentAdapter stickPointVideoSegmentAdapter2 = this.f101330b;
        if (stickPointVideoSegmentAdapter2 != null) {
            stickPointVideoSegmentAdapter2.f101487g = new C39036a(this);
        }
    }

    /* renamed from: a */
    public final void mo97349a(boolean z) {
        StickPointVideoSegmentAdapter stickPointVideoSegmentAdapter = this.f101330b;
        if (stickPointVideoSegmentAdapter != null) {
            stickPointVideoSegmentAdapter.mo97429a(z);
        }
    }

    /* renamed from: a */
    public final void mo97345a(int i, int i2, Intent intent) {
        if (i == 1001) {
            if (i2 != -1 || intent == null) {
                C39172j jVar = this.f101329a;
                if (jVar != null) {
                    jVar.mo96998a(null);
                    return;
                }
                return;
            }
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
            C39172j jVar2 = this.f101329a;
            if (jVar2 != null) {
                jVar2.mo96998a((List<? extends MediaModel>) parcelableArrayListExtra);
            }
        }
    }
}
