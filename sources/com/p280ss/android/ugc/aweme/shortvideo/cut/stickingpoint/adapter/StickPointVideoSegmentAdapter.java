package com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.adapter;

import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.shortvideo.cut.C39239u;
import com.p280ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.cut.VideoSegmentAdapter;
import com.p280ss.android.ugc.aweme.shortvideo.cut.VideoSegmentAdapter.C38727a;
import com.p280ss.android.ugc.aweme.shortvideo.cut.VideoSegmentAdapter.VideoSegmentViewHolder;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.C38786e;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C39182e;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p1556c.C39172j;
import com.p280ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.adapter.StickPointVideoSegmentAdapter */
public final class StickPointVideoSegmentAdapter extends VideoSegmentAdapter {

    /* renamed from: g */
    public C39172j f101487g;

    /* renamed from: h */
    private boolean f101488h;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.adapter.StickPointVideoSegmentAdapter$StickPointAutoViewHolder */
    public final class StickPointAutoViewHolder extends C1293v {

        /* renamed from: a */
        final /* synthetic */ StickPointVideoSegmentAdapter f101489a;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.adapter.StickPointVideoSegmentAdapter$StickPointAutoViewHolder$a */
        static final class C39139a implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ StickPointAutoViewHolder f101490a;

            C39139a(StickPointAutoViewHolder stickPointAutoViewHolder) {
                this.f101490a = stickPointAutoViewHolder;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C39172j jVar = this.f101490a.f101489a.f101487g;
                if (jVar != null) {
                    jVar.mo96999b(view);
                }
            }
        }

        /* renamed from: a */
        public final void mo97432a() {
            this.itemView.setOnClickListener(new C39139a(this));
        }

        public StickPointAutoViewHolder(StickPointVideoSegmentAdapter stickPointVideoSegmentAdapter, ViewGroup viewGroup) {
            C7573i.m23587b(viewGroup, "parent");
            this.f101489a = stickPointVideoSegmentAdapter;
            super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a3j, viewGroup, false));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.adapter.StickPointVideoSegmentAdapter$StickPointVideoSegViewHolder */
    public final class StickPointVideoSegViewHolder extends VideoSegmentViewHolder {

        /* renamed from: d */
        final /* synthetic */ StickPointVideoSegmentAdapter f101491d;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.adapter.StickPointVideoSegmentAdapter$StickPointVideoSegViewHolder$a */
        static final class C39140a implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ StickPointVideoSegViewHolder f101492a;

            /* renamed from: b */
            final /* synthetic */ VideoSegmentViewHolder f101493b;

            C39140a(StickPointVideoSegViewHolder stickPointVideoSegViewHolder, VideoSegmentViewHolder videoSegmentViewHolder) {
                this.f101492a = stickPointVideoSegViewHolder;
                this.f101493b = videoSegmentViewHolder;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (this.f101492a.f101491d.f100642d) {
                    int b = this.f101492a.f101491d.mo97430b(this.f101493b.getAdapterPosition());
                    if (b >= 0 && b < this.f101492a.f101491d.f100639a.size()) {
                        C38727a aVar = this.f101492a.f101491d.f100641c;
                        VideoSegment videoSegment = ((C39239u) this.f101492a.f101491d.f100639a.get(b)).f101731b;
                        C7573i.m23582a((Object) videoSegment, "items[adapterPosition].seg");
                        aVar.mo96785a(view, b, videoSegment.mo96908g());
                    }
                }
            }
        }

        /* renamed from: a */
        public final void mo96814a(VideoSegmentViewHolder videoSegmentViewHolder) {
            C7573i.m23587b(videoSegmentViewHolder, "holder");
            this.itemView.setOnClickListener(new C39140a(this, videoSegmentViewHolder));
        }

        public StickPointVideoSegViewHolder(StickPointVideoSegmentAdapter stickPointVideoSegmentAdapter, ViewGroup viewGroup) {
            C7573i.m23587b(viewGroup, "parent");
            this.f101491d = stickPointVideoSegmentAdapter;
            super(viewGroup);
        }
    }

    /* renamed from: d */
    public final List<C39239u> mo97431d() {
        List<C39239u> list = this.f100639a;
        C7573i.m23582a((Object) list, "items");
        return list;
    }

    /* renamed from: e */
    private final boolean m124959e() {
        if (!C39182e.m125102e() || !this.f101488h) {
            return false;
        }
        return true;
    }

    public final int getItemCount() {
        if (m124959e()) {
            return super.getItemCount() + 1;
        }
        return super.getItemCount();
    }

    /* renamed from: a */
    public final void mo97429a(boolean z) {
        this.f101488h = z;
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public final void mo96803a(View view) {
        C7573i.m23587b(view, "itemView");
        C39172j jVar = this.f101487g;
        if (jVar != null) {
            jVar.mo97000c(view);
        }
    }

    /* renamed from: b */
    public final int mo97430b(int i) {
        if (m124959e()) {
            return i - 1;
        }
        return i;
    }

    /* renamed from: a */
    public final C39239u mo96798a(int i) {
        if (!m124959e()) {
            return super.mo96798a(i);
        }
        if (getItemViewType(i) != 10002) {
            return null;
        }
        return (C39239u) this.f100639a.get(mo97430b(i));
    }

    public final long getItemId(int i) {
        if (!m124959e()) {
            return super.getItemId(i);
        }
        if (getItemViewType(i) == 10001) {
            return 10001;
        }
        if (getItemViewType(i) == 10003) {
            return 10003;
        }
        return (long) ((C39239u) this.f100639a.get(mo97430b(i))).f101730a;
    }

    public final int getItemViewType(int i) {
        if (!m124959e()) {
            return super.getItemViewType(i);
        }
        if (i == 0) {
            return 10001;
        }
        if (mo97430b(i) < this.f100639a.size()) {
            return 10002;
        }
        return 10003;
    }

    /* renamed from: a */
    public final int mo96796a(RecyclerView recyclerView, int i) {
        C7573i.m23587b(recyclerView, "recyclerView");
        if (m124959e()) {
            i++;
        }
        return super.mo96796a(recyclerView, i);
    }

    public final void onBindViewHolder(C1293v vVar, int i) {
        C7573i.m23587b(vVar, "holder");
        if (vVar instanceof StickPointAutoViewHolder) {
            ((StickPointAutoViewHolder) vVar).mo97432a();
        } else if (vVar instanceof StickPointVideoSegViewHolder) {
            ((StickPointVideoSegViewHolder) vVar).mo96817a(mo96798a(i), i, (VideoSegmentViewHolder) vVar);
        }
        super.onBindViewHolder(vVar, i);
    }

    public final C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        if (i == 10001) {
            return new StickPointAutoViewHolder(this, viewGroup);
        }
        if (i == 10002) {
            return new StickPointVideoSegViewHolder(this, viewGroup);
        }
        C1293v onCreateViewHolder = super.onCreateViewHolder(viewGroup, i);
        C7573i.m23582a((Object) onCreateViewHolder, "super.onCreateViewHolder(parent, viewType)");
        return onCreateViewHolder;
    }

    /* renamed from: a */
    public final void mo96801a(C1293v vVar, C1293v vVar2) {
        C7573i.m23587b(vVar, "sourceHolder");
        C7573i.m23587b(vVar2, "targetHolder");
        if (!m124959e()) {
            super.mo96801a(vVar, vVar2);
            return;
        }
        int b = mo97430b(vVar.getAdapterPosition());
        int b2 = mo97430b(vVar2.getAdapterPosition());
        if (b < this.f100639a.size() && b2 < this.f100639a.size()) {
            int i = ((VideoSegmentViewHolder) vVar).f100647b.f100759a;
            int i2 = ((VideoSegmentViewHolder) vVar2).f100647b.f100759a;
            mo96799a(i, i2);
            this.f100639a.add(b2, (C39239u) this.f100639a.remove(b));
            notifyItemMoved(vVar.getAdapterPosition(), vVar2.getAdapterPosition());
            this.f100644f.mo96668a(new C38786e(1, i, i2));
        }
    }

    public StickPointVideoSegmentAdapter(VideoEditViewModel videoEditViewModel, CutMultiVideoViewModel cutMultiVideoViewModel, List<? extends VideoSegment> list) {
        C7573i.m23587b(videoEditViewModel, "videoEditViewModel");
        C7573i.m23587b(cutMultiVideoViewModel, "cutMultiVideoViewModel");
        C7573i.m23587b(list, "videoSegments");
        super(videoEditViewModel, cutMultiVideoViewModel, list);
    }
}
