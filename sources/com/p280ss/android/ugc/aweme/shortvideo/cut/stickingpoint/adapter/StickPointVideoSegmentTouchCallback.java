package com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.adapter;

import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1293v;
import com.p280ss.android.ugc.aweme.shortvideo.cut.C38773j;
import com.p280ss.android.ugc.aweme.shortvideo.cut.VECutMultiVideoSegmentTouchCallback;
import com.p280ss.android.ugc.aweme.shortvideo.cut.VideoSegmentAdapter.AddVideoViewHolder;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.adapter.StickPointVideoSegmentAdapter.StickPointAutoViewHolder;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.adapter.StickPointVideoSegmentTouchCallback */
public final class StickPointVideoSegmentTouchCallback extends VECutMultiVideoSegmentTouchCallback {
    public StickPointVideoSegmentTouchCallback(C38773j jVar) {
        C7573i.m23587b(jVar, "adapter");
        super(jVar);
    }

    /* renamed from: a */
    public final int mo6512a(RecyclerView recyclerView, C1293v vVar) {
        C7573i.m23587b(recyclerView, "recyclerView");
        C7573i.m23587b(vVar, "viewHolder");
        if (!(vVar instanceof AddVideoViewHolder) && !(vVar instanceof StickPointAutoViewHolder)) {
            return super.mo6512a(recyclerView, vVar);
        }
        return 0;
    }

    /* renamed from: a */
    public final boolean mo6516a(RecyclerView recyclerView, C1293v vVar, C1293v vVar2) {
        C7573i.m23587b(recyclerView, "recyclerView");
        C7573i.m23587b(vVar, "source");
        C7573i.m23587b(vVar2, "target");
        if (!(vVar2 instanceof AddVideoViewHolder) && !(vVar2 instanceof StickPointAutoViewHolder)) {
            return super.mo6516a(recyclerView, vVar, vVar2);
        }
        return false;
    }
}
