package com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.adapter;

import android.graphics.Bitmap;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.bytedance.apm.util.C6292i;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.shortvideo.cut.C39239u;
import com.p280ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.cut.VideoSegmentAdapter;
import com.p280ss.android.ugc.aweme.shortvideo.cut.VideoSegmentAdapter.VideoSegmentViewHolder;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.C38786e;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p280ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.p1569c.C39712a;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.p1569c.C39712a.C39715a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.adapter.MultiVideoEditSegmentAdapter */
public final class MultiVideoEditSegmentAdapter extends VideoSegmentAdapter {

    /* renamed from: g */
    public final HashMap<String, Bitmap> f103220g = new HashMap<>();

    /* renamed from: h */
    public final HashMap<String, ImageView> f103221h = new HashMap<>();

    /* renamed from: i */
    public final C39712a f103222i = new C39712a();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.adapter.MultiVideoEditSegmentAdapter$MultiEditVideoSegmentViewHolder */
    public final class MultiEditVideoSegmentViewHolder extends VideoSegmentViewHolder {

        /* renamed from: d */
        final /* synthetic */ MultiVideoEditSegmentAdapter f103223d;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.adapter.MultiVideoEditSegmentAdapter$MultiEditVideoSegmentViewHolder$a */
        static final class C39707a implements C39715a {

            /* renamed from: a */
            final /* synthetic */ MultiEditVideoSegmentViewHolder f103224a;

            /* renamed from: b */
            final /* synthetic */ String f103225b;

            C39707a(MultiEditVideoSegmentViewHolder multiEditVideoSegmentViewHolder, String str) {
                this.f103224a = multiEditVideoSegmentViewHolder;
                this.f103225b = str;
            }

            /* renamed from: a */
            public final void mo99079a(String str, Bitmap bitmap) {
                if (bitmap != null && this.f103224a.f103223d.f103221h.get(this.f103225b) != null) {
                    Object obj = this.f103224a.f103223d.f103221h.get(str);
                    if (obj == null) {
                        C7573i.m23580a();
                    }
                    ((ImageView) obj).setImageBitmap(bitmap);
                    this.f103224a.f103223d.f103220g.put(this.f103225b, bitmap);
                }
            }
        }

        public MultiEditVideoSegmentViewHolder(MultiVideoEditSegmentAdapter multiVideoEditSegmentAdapter, ViewGroup viewGroup) {
            C7573i.m23587b(viewGroup, "parent");
            this.f103223d = multiVideoEditSegmentAdapter;
            super(viewGroup);
        }

        /* renamed from: a */
        public final void mo96816a(VideoSegmentViewHolder videoSegmentViewHolder, String str) {
            C7573i.m23587b(videoSegmentViewHolder, "holder");
            C7573i.m23587b(str, "path");
            RemoteImageView remoteImageView = videoSegmentViewHolder.f100646a;
            C7573i.m23582a((Object) remoteImageView, "holder.videoCover");
            remoteImageView.setScaleType(ScaleType.CENTER_CROP);
            Map map = this.f103223d.f103221h;
            RemoteImageView remoteImageView2 = videoSegmentViewHolder.f100646a;
            C7573i.m23582a((Object) remoteImageView2, "holder.videoCover");
            map.put(str, remoteImageView2);
            if (this.f103223d.f103220g.get(str) == null) {
                this.f103223d.f103222i.mo99095a(str, new C39707a(this, str));
            } else {
                videoSegmentViewHolder.f100646a.setImageBitmap((Bitmap) this.f103223d.f103220g.get(str));
            }
        }
    }

    public final int getItemViewType(int i) {
        return 10002;
    }

    public final int getItemCount() {
        if (this.f100639a == null) {
            return 0;
        }
        return this.f100639a.size();
    }

    /* renamed from: c */
    public final void mo99078c(List<? extends VideoSegment> list) {
        if (!C6292i.m19525a(list)) {
            mo96805a(list);
            notifyDataSetChanged();
        }
    }

    public final long getItemId(int i) {
        return (long) ((C39239u) this.f100639a.get(i)).f101730a;
    }

    /* renamed from: b */
    public final void mo96808b(VideoSegment videoSegment) {
        if (videoSegment != null) {
            List list = this.f100639a;
            C7573i.m23582a((Object) list, "items");
            int size = list.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                } else if (C7573i.m23585a((Object) ((C39239u) this.f100639a.get(i)).f101731b.mo96896a(false), (Object) videoSegment.mo96896a(false))) {
                    this.f100639a.remove(i);
                    break;
                } else {
                    i++;
                }
            }
            notifyDataSetChanged();
        }
    }

    public final C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        return new MultiEditVideoSegmentViewHolder(this, viewGroup);
    }

    /* renamed from: a */
    public final void mo96800a(C1293v vVar, int i) {
        C7573i.m23587b(vVar, "holder");
        if (vVar instanceof MultiEditVideoSegmentViewHolder) {
            ((MultiEditVideoSegmentViewHolder) vVar).mo96813a();
            this.f100644f.mo96668a(new C38786e(0, vVar.getAdapterPosition(), -1));
        }
    }

    /* renamed from: a */
    public final void mo96801a(C1293v vVar, C1293v vVar2) {
        C7573i.m23587b(vVar, "sourceHolder");
        C7573i.m23587b(vVar2, "targetHolder");
        int adapterPosition = vVar.getAdapterPosition();
        int adapterPosition2 = vVar2.getAdapterPosition();
        if (adapterPosition < this.f100639a.size() && adapterPosition2 < this.f100639a.size()) {
            this.f100639a.add(adapterPosition2, (C39239u) this.f100639a.remove(adapterPosition));
            notifyItemMoved(adapterPosition, adapterPosition2);
            this.f100644f.mo96668a(new C38786e(1, adapterPosition, adapterPosition2));
        }
    }

    /* renamed from: a */
    public final void mo96802a(C1293v vVar, boolean z) {
        C7573i.m23587b(vVar, "holder");
        if (vVar instanceof MultiEditVideoSegmentViewHolder) {
            ((MultiEditVideoSegmentViewHolder) vVar).mo96818b();
            C38786e eVar = new C38786e(2, -1, vVar.getAdapterPosition());
            eVar.f100799a = z;
            this.f100644f.mo96668a(eVar);
        }
    }

    public MultiVideoEditSegmentAdapter(VideoEditViewModel videoEditViewModel, CutMultiVideoViewModel cutMultiVideoViewModel, List<? extends VideoSegment> list) {
        C7573i.m23587b(videoEditViewModel, "videoEditViewModel");
        C7573i.m23587b(cutMultiVideoViewModel, "cutMultiVideoViewModel");
        C7573i.m23587b(list, "videoSegments");
        super(videoEditViewModel, cutMultiVideoViewModel, list);
    }
}
