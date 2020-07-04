package com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.listener;

import android.graphics.Canvas;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.support.p029v7.widget.helper.ItemTouchHelper.C1405a;
import android.view.View;
import com.p280ss.android.ugc.aweme.framework.p1276e.C29960a;
import com.p280ss.android.ugc.aweme.shortvideo.cut.C38774k;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedAdapter;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.listener.VideoImageMixedTouchCallback */
public final class VideoImageMixedTouchCallback extends C1405a {

    /* renamed from: a */
    public final VideoImageMixedAdapter f104455a;

    /* renamed from: b */
    private boolean f104456b;

    /* renamed from: c */
    private boolean f104457c;

    /* renamed from: a */
    public final void mo6515a(C1293v vVar, int i) {
        C7573i.m23587b(vVar, "p0");
    }

    public VideoImageMixedTouchCallback(VideoImageMixedAdapter videoImageMixedAdapter) {
        C7573i.m23587b(videoImageMixedAdapter, "adapter");
        this.f104455a = videoImageMixedAdapter;
    }

    /* renamed from: a */
    public final int mo6512a(RecyclerView recyclerView, C1293v vVar) {
        C7573i.m23587b(recyclerView, "p0");
        C7573i.m23587b(vVar, "p1");
        return C1405a.m6972b(15, 0);
    }

    /* renamed from: b */
    public final void mo6519b(C1293v vVar, int i) {
        if (!(i == 0 || vVar == null)) {
            C38774k.m123817a(C29960a.m98230a(), 100);
            this.f104455a.mo99911a(vVar, i);
        }
        super.mo6519b(vVar, i);
    }

    /* renamed from: d */
    public final void mo6521d(RecyclerView recyclerView, C1293v vVar) {
        C7573i.m23587b(recyclerView, "recyclerView");
        C7573i.m23587b(vVar, "viewHolder");
        this.f104455a.mo99913a(vVar, this.f104456b);
        super.mo6521d(recyclerView, vVar);
        this.f104456b = false;
    }

    /* renamed from: a */
    public final boolean mo6516a(RecyclerView recyclerView, C1293v vVar, C1293v vVar2) {
        C7573i.m23587b(recyclerView, "p0");
        C7573i.m23587b(vVar, "p1");
        C7573i.m23587b(vVar2, "p2");
        C38774k.m123817a(C29960a.m98230a(), 50);
        this.f104455a.mo99912a(vVar, vVar2);
        this.f104456b = true;
        return true;
    }

    /* renamed from: a */
    public final void mo6513a(Canvas canvas, RecyclerView recyclerView, C1293v vVar, float f, float f2, int i, boolean z) {
        float f3;
        float f4;
        RecyclerView recyclerView2 = recyclerView;
        C1293v vVar2 = vVar;
        C7573i.m23587b(canvas, "c");
        C7573i.m23587b(recyclerView2, "recyclerView");
        C7573i.m23587b(vVar2, "viewHolder");
        View view = vVar2.itemView;
        C7573i.m23582a((Object) view, "viewHolder.itemView");
        double height = (double) view.getHeight();
        Double.isNaN(height);
        double d = (height * 0.25d) / 2.0d;
        View view2 = vVar2.itemView;
        C7573i.m23582a((Object) view2, "viewHolder.itemView");
        double top = (double) view2.getTop();
        Double.isNaN(top);
        double d2 = top - d;
        float f5 = f2;
        double d3 = (double) f5;
        Double.isNaN(d3);
        double d4 = d2 + d3;
        View view3 = vVar2.itemView;
        C7573i.m23582a((Object) view3, "viewHolder.itemView");
        double height2 = (double) (((float) view3.getHeight()) * 1.25f);
        Double.isNaN(height2);
        double d5 = height2 + d4;
        if (d4 < 0.0d) {
            View view4 = vVar2.itemView;
            C7573i.m23582a((Object) view4, "viewHolder.itemView");
            double top2 = (double) view4.getTop();
            Double.isNaN(top2);
            f4 = -((float) (top2 - d));
        } else if (d5 > ((double) recyclerView.getHeight())) {
            double bottom = (double) recyclerView.getBottom();
            double bottom2 = (double) view.getBottom();
            Double.isNaN(bottom2);
            double d6 = bottom2 + d;
            Double.isNaN(bottom);
            f4 = (float) (bottom - d6);
        } else {
            f3 = f5;
            if (i == 2 || z) {
                float f6 = f;
                super.mo6513a(canvas, recyclerView, vVar, f, f3, i, z);
                this.f104457c = true;
            } else if (this.f104457c) {
                this.f104457c = false;
                VideoImageMixedAdapter.m128313a(vVar).translationX(0.0f).translationY(0.0f).setDuration(m6968a(recyclerView2, 8, f, f3)).start();
                return;
            }
        }
        f3 = f4;
        if (i == 2) {
        }
        float f62 = f;
        super.mo6513a(canvas, recyclerView, vVar, f, f3, i, z);
        this.f104457c = true;
    }
}
