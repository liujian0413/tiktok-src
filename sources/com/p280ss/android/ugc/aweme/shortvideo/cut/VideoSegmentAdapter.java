package com.p280ss.android.ugc.aweme.shortvideo.cut;

import android.graphics.Color;
import android.graphics.Rect;
import android.net.Uri;
import android.support.p022v4.util.C0902i;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.C1642a;
import com.bytedance.apm.util.C6292i;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.drawee.backends.pipeline.C13382e;
import com.facebook.drawee.generic.C13438a;
import com.facebook.imagepipeline.common.C13596d;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.imported.C32068d;
import com.p280ss.android.ugc.aweme.shortvideo.C38501ax;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.C38786e;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.DmtPlusView;
import com.p280ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C40173d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VideoSegmentAdapter */
public class VideoSegmentAdapter extends C1262a<C1293v> implements C38773j {

    /* renamed from: a */
    public List<C39239u> f100639a = new ArrayList();

    /* renamed from: b */
    public int f100640b = 0;

    /* renamed from: c */
    public C38727a f100641c;

    /* renamed from: d */
    public boolean f100642d = true;

    /* renamed from: e */
    protected VideoEditViewModel f100643e;

    /* renamed from: f */
    protected CutMultiVideoViewModel f100644f;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VideoSegmentAdapter$AddVideoViewHolder */
    public class AddVideoViewHolder extends C1293v {
        /* renamed from: a */
        public final void mo96811a() {
            this.itemView.setOnClickListener(new C38796s(this));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo96812a(View view) {
            VideoSegmentAdapter.this.mo96803a(view);
        }

        public AddVideoViewHolder(ViewGroup viewGroup) {
            super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a3i, viewGroup, false));
            DmtPlusView dmtPlusView = (DmtPlusView) this.itemView.findViewById(R.id.ec);
            dmtPlusView.setBgColor(Color.parseColor("#FFFFFF"));
            dmtPlusView.setAlpha(0.25f);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VideoSegmentAdapter$VideoSegmentViewHolder */
    public class VideoSegmentViewHolder extends C1293v {

        /* renamed from: a */
        public RemoteImageView f100646a = ((RemoteImageView) this.itemView.findViewById(R.id.eaf));

        /* renamed from: b */
        public VideoSegment f100647b;

        /* renamed from: d */
        private RelativeLayout f100649d = ((RelativeLayout) this.itemView.findViewById(R.id.cws));

        /* renamed from: e */
        private TextView f100650e;

        /* renamed from: a */
        public final void mo96813a() {
            if (this.f100649d != null) {
                this.f100649d.setScaleX(1.25f);
                this.f100649d.setScaleY(1.25f);
            }
        }

        /* renamed from: b */
        public final void mo96818b() {
            if (this.f100649d != null) {
                this.f100649d.setScaleY(1.0f);
                this.f100649d.setScaleX(1.0f);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo96814a(VideoSegmentViewHolder videoSegmentViewHolder) {
            this.itemView.setOnClickListener(new C39238t(this, videoSegmentViewHolder));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo96815a(VideoSegmentViewHolder videoSegmentViewHolder, View view) {
            if (VideoSegmentAdapter.this.f100642d) {
                int adapterPosition = videoSegmentViewHolder.getAdapterPosition();
                if (adapterPosition <= VideoSegmentAdapter.this.f100639a.size() && adapterPosition >= 0) {
                    VideoSegmentAdapter.this.f100641c.mo96785a(view, adapterPosition, ((C39239u) VideoSegmentAdapter.this.f100639a.get(adapterPosition)).f101731b.mo96908g());
                }
            }
        }

        public VideoSegmentViewHolder(ViewGroup viewGroup) {
            super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a3z, viewGroup, false));
            C38774k.m123818a((View) this.f100646a);
            this.f100650e = (TextView) this.itemView.findViewById(R.id.d24);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo96816a(VideoSegmentViewHolder videoSegmentViewHolder, String str) {
            StringBuilder sb = new StringBuilder("file://");
            sb.append(str);
            videoSegmentViewHolder.f100646a.setController(((C13382e) ((C13382e) C13380c.m39166a().mo32729b(videoSegmentViewHolder.f100646a.getController())).mo32748b(ImageRequestBuilder.m40865a(Uri.parse(sb.toString())).mo33468a(new C13596d(C23486n.m77122a(48.0d), C23486n.m77122a(48.0d))).mo33476b())).mo32730f());
            ((C13438a) videoSegmentViewHolder.f100646a.getHierarchy()).mo32900b(C38501ax.m123066a(637534207, 637534207, 0, 0));
        }

        /* renamed from: a */
        public final void mo96817a(C39239u uVar, int i, VideoSegmentViewHolder videoSegmentViewHolder) {
            String str;
            this.f100647b = uVar.f101731b;
            if (TextUtils.isEmpty(uVar.f101731b.f100767i)) {
                str = uVar.f101731b.mo96896a(false);
            } else {
                str = uVar.f101731b.f100767i;
            }
            mo96816a(videoSegmentViewHolder, str);
            StringBuilder sb = new StringBuilder();
            sb.append(C1642a.m8035a(Locale.getDefault(), "%.1f", new Object[]{Float.valueOf(((float) (uVar.f101731b.mo96910i() - uVar.f101731b.mo96909h())) / (uVar.f101731b.mo96911j() * 1000.0f))}));
            sb.append("s");
            videoSegmentViewHolder.f100650e.setText(sb.toString());
            videoSegmentViewHolder.f100650e.setShadowLayer(6.0f, 0.0f, 4.0f, this.itemView.getContext().getResources().getColor(R.color.a7q));
            mo96814a(videoSegmentViewHolder);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VideoSegmentAdapter$a */
    public interface C38727a {
        /* renamed from: a */
        void mo96785a(View view, int i, String str);
    }

    /* renamed from: a */
    public final void mo96805a(List<VideoSegment> list) {
        this.f100639a.clear();
        for (VideoSegment videoSegment : list) {
            this.f100639a.add(new C39239u(videoSegment.f100759a, videoSegment));
        }
    }

    /* renamed from: a */
    public final void mo96804a(VideoSegment videoSegment) {
        for (int i = 0; i < this.f100639a.size(); i++) {
            if (((C39239u) this.f100639a.get(i)).f101731b.mo96908g().equals(videoSegment.mo96908g())) {
                ((C39239u) this.f100639a.get(i)).f101731b = videoSegment;
                notifyItemChanged(i);
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo96803a(View view) {
        if (this.f100641c != null) {
            this.f100641c.mo96785a(view, 10003, null);
        }
    }

    /* renamed from: a */
    public final int mo96795a() {
        return mo96807b().size();
    }

    public int getItemCount() {
        if (this.f100639a == null) {
            return 0;
        }
        return this.f100639a.size() + 1;
    }

    /* renamed from: c */
    public final long mo96810c() {
        long j = 0;
        if (C6292i.m19525a(this.f100639a)) {
            return 0;
        }
        for (C39239u uVar : this.f100639a) {
            if (uVar != null && !uVar.f101731b.f100768j) {
                j += uVar.f101731b.f100761c;
            }
        }
        return j;
    }

    /* renamed from: b */
    public final ArrayList<String> mo96807b() {
        ArrayList<String> arrayList = new ArrayList<>();
        if (C6292i.m19525a(this.f100639a)) {
            return arrayList;
        }
        for (C39239u uVar : this.f100639a) {
            if (uVar != null && !uVar.f101731b.f100768j) {
                if (C40173d.m128357b(uVar.f101731b.mo96896a(false))) {
                    arrayList.add(uVar.f101731b.f100767i);
                } else {
                    arrayList.add(uVar.f101731b.mo96896a(false));
                }
            }
        }
        return arrayList;
    }

    public int getItemViewType(int i) {
        if (i < this.f100639a.size()) {
            return 10002;
        }
        return 10003;
    }

    /* renamed from: a */
    public final ViewPropertyAnimator mo96797a(C1293v vVar) {
        return vVar.itemView.animate().scaleX(1.0f).scaleY(1.0f);
    }

    public long getItemId(int i) {
        if (getItemViewType(i) == 10003) {
            return 10003;
        }
        return (long) ((C39239u) this.f100639a.get(i)).f101730a;
    }

    /* renamed from: b */
    public void mo96808b(VideoSegment videoSegment) {
        int i = 0;
        while (true) {
            if (i >= this.f100639a.size()) {
                break;
            } else if (((C39239u) this.f100639a.get(i)).f101731b.mo96908g().equals(videoSegment.mo96908g())) {
                this.f100639a.remove(i);
                break;
            } else {
                i++;
            }
        }
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public C39239u mo96798a(int i) {
        if (getItemViewType(i) != 10002) {
            return null;
        }
        return (C39239u) this.f100639a.get(i);
    }

    /* renamed from: b */
    public final void mo96809b(List<VideoSegment> list) {
        if (!C6292i.m19525a(list)) {
            if (this.f100639a == null) {
                this.f100639a = new ArrayList();
            }
            for (VideoSegment videoSegment : list) {
                this.f100639a.add(new C39239u(videoSegment.f100759a, videoSegment));
            }
            notifyDataSetChanged();
        }
    }

    public C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 10003) {
            return new AddVideoViewHolder(viewGroup);
        }
        return new VideoSegmentViewHolder(viewGroup);
    }

    public void onBindViewHolder(C1293v vVar, int i) {
        if (vVar instanceof VideoSegmentViewHolder) {
            VideoSegmentViewHolder videoSegmentViewHolder = (VideoSegmentViewHolder) vVar;
            videoSegmentViewHolder.mo96817a(mo96798a(i), i, videoSegmentViewHolder);
            return;
        }
        if (vVar instanceof AddVideoViewHolder) {
            ((AddVideoViewHolder) vVar).mo96811a();
        }
    }

    /* renamed from: a */
    public int mo96796a(RecyclerView recyclerView, int i) {
        C0902i a = C32068d.m104096a(recyclerView);
        if (i >= ((Integer) a.f3154a).intValue() && i <= ((Integer) a.f3155b).intValue() && i < getItemCount() && i >= 0) {
            C1293v f = recyclerView.mo5575f(i);
            if (f != null) {
                int[] iArr = new int[2];
                f.itemView.getLocationOnScreen(iArr);
                return iArr[0] + C23486n.m77122a(23.5d);
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final Rect mo96806b(RecyclerView recyclerView, int i) {
        C0902i a = C32068d.m104096a(recyclerView);
        if (i >= ((Integer) a.f3154a).intValue() && i <= ((Integer) a.f3155b).intValue() && i < getItemCount() && i >= 0) {
            C1293v f = recyclerView.mo5575f(i);
            if (!(f == null || f.itemView == null)) {
                int[] iArr = new int[2];
                f.itemView.getLocationInWindow(iArr);
                return new Rect(iArr[0], iArr[1], iArr[0] + f.itemView.getWidth(), iArr[1] + f.itemView.getHeight());
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo96799a(int i, int i2) {
        this.f100643e.mo97721n().add(i2, (VideoSegment) this.f100643e.mo97721n().remove(i));
        int i3 = 0;
        for (VideoSegment videoSegment : this.f100643e.mo97721n()) {
            videoSegment.f100759a = i3;
            i3++;
        }
    }

    /* renamed from: a */
    public void mo96800a(C1293v vVar, int i) {
        if (vVar instanceof VideoSegmentViewHolder) {
            VideoSegmentViewHolder videoSegmentViewHolder = (VideoSegmentViewHolder) vVar;
            videoSegmentViewHolder.mo96813a();
            this.f100644f.mo96668a(new C38786e(0, videoSegmentViewHolder.f100647b.f100759a, -1));
        }
    }

    /* renamed from: a */
    public void mo96801a(C1293v vVar, C1293v vVar2) {
        int adapterPosition = vVar.getAdapterPosition();
        int adapterPosition2 = vVar2.getAdapterPosition();
        if (adapterPosition < this.f100639a.size() && adapterPosition2 < this.f100639a.size()) {
            int i = ((VideoSegmentViewHolder) vVar).f100647b.f100759a;
            int i2 = ((VideoSegmentViewHolder) vVar2).f100647b.f100759a;
            this.f100639a.add(adapterPosition2, (C39239u) this.f100639a.remove(adapterPosition));
            mo96799a(i, i2);
            notifyItemMoved(adapterPosition, adapterPosition2);
            this.f100644f.mo96668a(new C38786e(1, i, i2));
        }
    }

    /* renamed from: a */
    public void mo96802a(C1293v vVar, boolean z) {
        if (vVar instanceof VideoSegmentViewHolder) {
            VideoSegmentViewHolder videoSegmentViewHolder = (VideoSegmentViewHolder) vVar;
            videoSegmentViewHolder.mo96818b();
            C38786e eVar = new C38786e(2, -1, videoSegmentViewHolder.f100647b.f100759a);
            eVar.f100799a = z;
            this.f100644f.mo96668a(eVar);
        }
    }

    public VideoSegmentAdapter(VideoEditViewModel videoEditViewModel, CutMultiVideoViewModel cutMultiVideoViewModel, List<VideoSegment> list) {
        this.f100643e = videoEditViewModel;
        this.f100644f = cutMultiVideoViewModel;
        mo96805a(list);
        setHasStableIds(true);
    }
}
