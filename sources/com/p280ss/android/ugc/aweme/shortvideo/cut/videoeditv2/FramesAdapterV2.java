package com.p280ss.android.ugc.aweme.shortvideo.cut.videoeditv2;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import com.bytedance.common.utility.C6311g;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.p1878b.C47891a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.FramesAdapterV2 */
public final class FramesAdapterV2 extends C1262a<FrameViewHolder> {

    /* renamed from: a */
    public float f101881a;

    /* renamed from: b */
    public List<Pair<Integer, Integer>> f101882b = new ArrayList();

    /* renamed from: c */
    public List<VideoSegment> f101883c = new ArrayList();

    /* renamed from: d */
    public int f101884d;

    /* renamed from: e */
    public int f101885e;

    /* renamed from: f */
    public float f101886f;

    /* renamed from: g */
    public Context f101887g;

    /* renamed from: h */
    public VEMediaParserProviderV2 f101888h;

    /* renamed from: i */
    public int f101889i;

    /* renamed from: j */
    private int f101890j;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.FramesAdapterV2$FrameViewHolder */
    public final class FrameViewHolder extends C1293v {

        /* renamed from: a */
        public ImageView f101891a;

        /* renamed from: b */
        public Bitmap f101892b;

        /* renamed from: c */
        final /* synthetic */ FramesAdapterV2 f101893c;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.FramesAdapterV2$FrameViewHolder$a */
        public static final class C39265a implements C39277a {

            /* renamed from: a */
            final /* synthetic */ FrameViewHolder f101894a;

            /* renamed from: b */
            final /* synthetic */ FrameViewHolder f101895b;

            /* renamed from: c */
            final /* synthetic */ String f101896c;

            /* renamed from: a */
            public final void mo97750a(Bitmap bitmap) {
                C7573i.m23587b(bitmap, "bitmap");
                if (C7573i.m23585a(this.f101895b.f101891a.getTag(), (Object) this.f101896c)) {
                    this.f101894a.f101891a.setImageBitmap(bitmap);
                    Bitmap bitmap2 = this.f101894a.f101892b;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    this.f101894a.f101892b = null;
                    this.f101894a.f101892b = bitmap;
                }
            }

            C39265a(FrameViewHolder frameViewHolder, FrameViewHolder frameViewHolder2, String str) {
                this.f101894a = frameViewHolder;
                this.f101895b = frameViewHolder2;
                this.f101896c = str;
            }
        }

        /* renamed from: a */
        public final void mo97748a() {
            this.f101891a.setImageBitmap(null);
            Bitmap bitmap = this.f101892b;
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.f101892b = null;
        }

        /* renamed from: a */
        private final void m125444a(ImageView imageView) {
            if (this.f101893c.f101889i == 1) {
                imageView.setBackground(this.f101893c.f101887g.getResources().getDrawable(R.drawable.fn));
            } else {
                imageView.setBackground(this.f101893c.f101887g.getResources().getDrawable(R.drawable.fq));
            }
        }

        /* renamed from: a */
        private final int m125443a(int i) {
            int size = this.f101893c.f101882b.size();
            for (int i2 = 0; i2 < size; i2++) {
                Pair pair = (Pair) this.f101893c.f101882b.get(i2);
                if (i >= ((Number) pair.getFirst()).intValue() && i <= ((Number) pair.getSecond()).intValue()) {
                    return i2;
                }
            }
            StringBuilder sb = new StringBuilder("unknow pos = ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }

        public FrameViewHolder(FramesAdapterV2 framesAdapterV2, View view) {
            C7573i.m23587b(view, "itemView");
            this.f101893c = framesAdapterV2;
            super(view);
            this.f101891a = (ImageView) view;
        }

        /* renamed from: a */
        public final void mo97749a(int i, FrameViewHolder frameViewHolder) {
            float f;
            float f2;
            C7573i.m23587b(frameViewHolder, "holder");
            int a = m125443a(i);
            Pair pair = (Pair) this.f101893c.f101882b.get(a);
            VideoSegment videoSegment = (VideoSegment) this.f101893c.f101883c.get(a);
            if (this.f101893c.f101889i == 1) {
                f = Math.min((((float) (i - ((Number) pair.getFirst()).intValue())) * this.f101893c.f101881a * videoSegment.mo96911j()) + ((float) videoSegment.mo96909h()), (float) videoSegment.mo96910i());
            } else {
                f = Math.min(((float) (i - ((Number) pair.getFirst()).intValue())) * this.f101893c.f101881a * this.f101893c.f101886f, (float) videoSegment.f100761c);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            sb.append('-');
            sb.append(f);
            String sb2 = sb.toString();
            frameViewHolder.f101891a.setTag(sb2);
            View view = frameViewHolder.itemView;
            C7573i.m23582a((Object) view, "holder.itemView");
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
                layoutParams2.height = this.f101893c.f101885e;
                layoutParams2.width = this.f101893c.f101884d;
                if (i == ((Number) pair.getSecond()).intValue()) {
                    if (this.f101893c.f101889i == 1) {
                        f2 = (((float) (videoSegment.mo96910i() - videoSegment.mo96909h())) / videoSegment.mo96911j()) - (this.f101893c.f101881a * ((float) (((Number) pair.getSecond()).intValue() - ((Number) pair.getFirst()).intValue())));
                    } else {
                        f2 = (((float) videoSegment.f100761c) / this.f101893c.f101886f) - (this.f101893c.f101881a * ((Number) pair.getSecond()).floatValue());
                    }
                    if (f2 >= 0.0f) {
                        layoutParams2.width = C47891a.m148821a((f2 / this.f101893c.f101881a) * ((float) this.f101893c.f101884d));
                    }
                }
                View view2 = frameViewHolder.itemView;
                C7573i.m23582a((Object) view2, "holder.itemView");
                view2.setLayoutParams(layoutParams2);
                Bitmap bitmap = this.f101892b;
                if (bitmap != null && bitmap.isRecycled()) {
                    m125444a(this.f101891a);
                }
                String a2 = ((VideoSegment) this.f101893c.f101883c.get(a)).mo96896a(false);
                VEMediaParserProviderV2 vEMediaParserProviderV2 = this.f101893c.f101888h;
                C7573i.m23582a((Object) a2, "videoPath");
                vEMediaParserProviderV2.mo97755a(i, a2, (int) f, new C39265a(this, frameViewHolder, sb2));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.RecyclerView.LayoutParams");
        }
    }

    /* renamed from: a */
    public final void mo97746a(boolean z) {
        this.f101888h.f101902b = z;
    }

    /* renamed from: a */
    private final int m125428a() {
        return m125434c(0.0f);
    }

    public final int getItemCount() {
        if (this.f101883c.isEmpty()) {
            return 0;
        }
        return this.f101890j;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onViewRecycled(FrameViewHolder frameViewHolder) {
        C7573i.m23587b(frameViewHolder, "holder");
        super.onViewRecycled(frameViewHolder);
        frameViewHolder.mo97748a();
    }

    /* renamed from: b */
    private final int m125432b(float f) {
        return C47891a.m148821a((float) Math.ceil((double) (f / this.f101881a)));
    }

    /* renamed from: c */
    private final int m125434c(float f) {
        this.f101882b.clear();
        int i = 0;
        if (this.f101889i == 1) {
            for (VideoSegment videoSegment : this.f101883c) {
                int b = m125432b(((float) (videoSegment.mo96910i() - videoSegment.mo96909h())) / videoSegment.mo96911j());
                List<Pair<Integer, Integer>> list = this.f101882b;
                Integer valueOf = Integer.valueOf(i);
                i += b;
                list.add(new Pair(valueOf, Integer.valueOf(i - 1)));
            }
            return i;
        }
        VideoSegment videoSegment2 = (VideoSegment) this.f101883c.get(0);
        this.f101886f = videoSegment2.mo96911j();
        if (f != 0.0f) {
            this.f101886f = f;
        }
        int b2 = m125432b(((float) videoSegment2.f100761c) / this.f101886f);
        this.f101882b.add(new Pair(Integer.valueOf(0), Integer.valueOf(b2 - 1)));
        return b2;
    }

    /* renamed from: a */
    public final void mo97740a(float f) {
        m125433b(f, 0.0f);
    }

    /* renamed from: a */
    public final void mo97744a(List<? extends VideoSegment> list) {
        C7573i.m23587b(list, "data");
        this.f101883c = new ArrayList(list);
        this.f101890j = m125428a();
        this.f101888h.mo97759d();
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public final void mo97741a(float f, float f2) {
        m125433b(f, f2);
    }

    public final /* synthetic */ void onBindViewHolder(C1293v vVar, int i) {
        m125431a((FrameViewHolder) vVar, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public FrameViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        View inflate = LayoutInflater.from(this.f101887g).inflate(R.layout.zb, viewGroup, false);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(cont…_frame_v2, parent, false)");
        return new FrameViewHolder(this, inflate);
    }

    /* renamed from: b */
    private final void m125433b(float f, float f2) {
        this.f101881a = f * ((float) this.f101884d);
        this.f101890j = m125434c(f2);
        this.f101888h.mo97759d();
        notifyDataSetChanged();
    }

    /* renamed from: a */
    private static void m125431a(FrameViewHolder frameViewHolder, int i) {
        C7573i.m23587b(frameViewHolder, "holder");
        frameViewHolder.mo97749a(i, frameViewHolder);
    }

    /* renamed from: b */
    public final void mo97747b(List<? extends VideoSegment> list, float f) {
        C7573i.m23587b(list, "videoSegmentList");
        if (!C6311g.m19573a(list)) {
            this.f101883c.addAll(list);
            m125433b(f, 0.0f);
        }
    }

    /* renamed from: a */
    public final void mo97742a(float f, VideoSegment videoSegment) {
        C7573i.m23587b(videoSegment, "data");
        this.f101883c.clear();
        this.f101883c.add(videoSegment);
        m125433b(f, 0.0f);
    }

    /* renamed from: a */
    public final void mo97743a(VideoSegment videoSegment, float f) {
        C7573i.m23587b(videoSegment, "videoSegment");
        if (!C6311g.m19573a(this.f101883c)) {
            this.f101883c.remove(videoSegment);
            m125433b(f, 0.0f);
        }
    }

    /* renamed from: a */
    public final void mo97745a(List<? extends VideoSegment> list, float f) {
        C7573i.m23587b(list, "data");
        this.f101883c = new ArrayList(list);
        m125433b(f, 0.0f);
    }

    public FramesAdapterV2(Context context, int[] iArr, float f, VEMediaParserProviderV2 vEMediaParserProviderV2, int i) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(iArr, "frameSize");
        C7573i.m23587b(vEMediaParserProviderV2, "mBitmapCache");
        this.f101887g = context;
        this.f101888h = vEMediaParserProviderV2;
        this.f101889i = i;
        this.f101884d = iArr[0];
        this.f101885e = iArr[1];
        this.f101881a = f * ((float) this.f101884d);
    }
}
