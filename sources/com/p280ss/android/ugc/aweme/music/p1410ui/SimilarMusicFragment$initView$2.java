package com.p280ss.android.ugc.aweme.music.p1410ui;

import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1280l;
import android.view.MotionEvent;
import com.p280ss.android.ugc.aweme.music.p1410ui.p1414d.C33952a.C33953a;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.music.ui.SimilarMusicFragment$initView$2 */
public final class SimilarMusicFragment$initView$2 implements C1280l {

    /* renamed from: a */
    final /* synthetic */ SimilarMusicFragment f88499a;

    /* renamed from: a */
    public final void mo5689a(boolean z) {
    }

    /* renamed from: b */
    public final void mo5691b(RecyclerView recyclerView, MotionEvent motionEvent) {
        C7573i.m23587b(recyclerView, "p0");
        C7573i.m23587b(motionEvent, "p1");
    }

    SimilarMusicFragment$initView$2(SimilarMusicFragment similarMusicFragment) {
        this.f88499a = similarMusicFragment;
    }

    /* renamed from: a */
    public final boolean mo5690a(RecyclerView recyclerView, MotionEvent motionEvent) {
        C7573i.m23587b(recyclerView, "p0");
        C7573i.m23587b(motionEvent, "event");
        switch (motionEvent.getAction()) {
            case 0:
                this.f88499a.f88463m = motionEvent.getY();
                break;
            case 1:
                this.f88499a.f88463m = motionEvent.getY() - this.f88499a.f88463m;
                if (this.f88499a.f88463m <= 10.0f) {
                    if (this.f88499a.f88463m < -10.0f) {
                        C33953a.m109415a(this.f88499a.f88460j, true);
                        break;
                    }
                } else {
                    C33953a.m109415a(this.f88499a.f88460j, false);
                    break;
                }
                break;
        }
        return false;
    }
}
