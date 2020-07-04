package com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p1554a;

import android.content.Intent;
import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.apm.util.C6292i;
import com.p280ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p280ss.android.ugc.aweme.shortvideo.cut.C39239u;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.adapter.StickPointVideoSegmentAdapter;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p1556c.C39172j;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointVideoSegView;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.f */
public final class C39138f extends C39108a implements C39172j {

    /* renamed from: b */
    private StickPointVideoSegView f101484b;

    /* renamed from: c */
    private C39172j f101485c;

    /* renamed from: d */
    private StickPointVideoSegmentAdapter f101486d;

    /* renamed from: a */
    public final View mo97369a() {
        return this.f101484b;
    }

    /* renamed from: d */
    public final void mo97425d() {
        StickPointVideoSegmentAdapter stickPointVideoSegmentAdapter = this.f101486d;
        if (stickPointVideoSegmentAdapter != null) {
            stickPointVideoSegmentAdapter.notifyDataSetChanged();
        }
    }

    /* renamed from: b */
    public final ArrayList<String> mo97422b() {
        if (this.f101486d == null) {
            return null;
        }
        StickPointVideoSegmentAdapter stickPointVideoSegmentAdapter = this.f101486d;
        if (stickPointVideoSegmentAdapter == null) {
            C7573i.m23580a();
        }
        return stickPointVideoSegmentAdapter.mo96807b();
    }

    /* renamed from: c */
    public final long mo97424c() {
        if (this.f101486d == null) {
            return 0;
        }
        StickPointVideoSegmentAdapter stickPointVideoSegmentAdapter = this.f101486d;
        if (stickPointVideoSegmentAdapter == null) {
            C7573i.m23580a();
        }
        return stickPointVideoSegmentAdapter.mo96810c();
    }

    /* renamed from: e */
    private final List<C39239u> m124940e() {
        if (this.f101486d != null) {
            StickPointVideoSegmentAdapter stickPointVideoSegmentAdapter = this.f101486d;
            if (stickPointVideoSegmentAdapter == null) {
                C7573i.m23580a();
            }
            if (!C6292i.m19525a(stickPointVideoSegmentAdapter.mo97431d())) {
                ArrayList arrayList = new ArrayList();
                StickPointVideoSegmentAdapter stickPointVideoSegmentAdapter2 = this.f101486d;
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

    /* renamed from: d */
    public final void mo97426d(View view) {
        this.f101484b = (StickPointVideoSegView) view;
    }

    /* renamed from: a */
    public final void mo96997a(View view) {
        C39172j jVar = this.f101485c;
        if (jVar != null) {
            jVar.mo96997a(view);
        }
    }

    /* renamed from: b */
    public final void mo96999b(View view) {
        C39172j jVar = this.f101485c;
        if (jVar != null) {
            jVar.mo96999b(view);
        }
    }

    /* renamed from: c */
    public final void mo97000c(View view) {
        C39172j jVar = this.f101485c;
        if (jVar != null) {
            jVar.mo97000c(view);
        }
    }

    /* renamed from: a */
    public final void mo97420a(RecyclerView recyclerView) {
        if (recyclerView != null && (recyclerView.getAdapter() instanceof StickPointVideoSegmentAdapter)) {
            this.f101486d = (StickPointVideoSegmentAdapter) recyclerView.getAdapter();
        }
        StickPointVideoSegmentAdapter stickPointVideoSegmentAdapter = this.f101486d;
        if (stickPointVideoSegmentAdapter != null) {
            stickPointVideoSegmentAdapter.f101487g = this;
        }
    }

    /* renamed from: d */
    public final void mo97427d(boolean z) {
        StickPointVideoSegmentAdapter stickPointVideoSegmentAdapter = this.f101486d;
        if (stickPointVideoSegmentAdapter != null) {
            stickPointVideoSegmentAdapter.mo97429a(z);
        }
    }

    /* renamed from: b */
    public final void mo97423b(List<? extends VideoSegment> list) {
        StickPointVideoSegmentAdapter stickPointVideoSegmentAdapter = this.f101486d;
        if (stickPointVideoSegmentAdapter != null) {
            stickPointVideoSegmentAdapter.mo96809b(list);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo97372c(boolean z) {
        super.mo97372c(z);
        StickPointVideoSegView stickPointVideoSegView = this.f101484b;
        if (stickPointVideoSegView != null) {
            stickPointVideoSegView.setButtonClickable(z);
        }
    }

    /* renamed from: e */
    public final void mo97428e(boolean z) {
        VideoSegment videoSegment;
        List<C39239u> e = m124940e();
        if (!C6292i.m19525a(e)) {
            if (e == null) {
                C7573i.m23580a();
            }
            for (C39239u uVar : e) {
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
    public final void mo97421a(C39172j jVar) {
        this.f101485c = jVar;
        StickPointVideoSegView stickPointVideoSegView = this.f101484b;
        if (stickPointVideoSegView != null) {
            stickPointVideoSegView.setStickPointVideoSegListener(this);
        }
    }

    /* renamed from: b */
    public final void mo97371b(boolean z) {
        if (z) {
            StickPointVideoSegView stickPointVideoSegView = this.f101484b;
            if (stickPointVideoSegView != null) {
                stickPointVideoSegView.setButtonClickable(false);
            }
        }
        super.mo97371b(z);
    }

    /* renamed from: a */
    public final void mo96998a(List<? extends MediaModel> list) {
        C39172j jVar = this.f101485c;
        if (jVar != null) {
            jVar.mo96998a(list);
        }
    }

    /* renamed from: a */
    public final void mo97370a(boolean z) {
        if (z) {
            StickPointVideoSegView stickPointVideoSegView = this.f101484b;
            if (stickPointVideoSegView != null) {
                stickPointVideoSegView.setButtonClickable(false);
            }
        }
        super.mo97370a(z);
    }

    /* renamed from: a */
    public final void mo97419a(int i, int i2, Intent intent) {
        if (i == 1001) {
            if (i2 != -1 || intent == null) {
                C39172j jVar = this.f101485c;
                if (jVar != null) {
                    jVar.mo96998a(null);
                    return;
                }
                return;
            }
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
            C39172j jVar2 = this.f101485c;
            if (jVar2 != null) {
                jVar2.mo96998a((List<? extends MediaModel>) parcelableArrayListExtra);
            }
        }
    }
}
