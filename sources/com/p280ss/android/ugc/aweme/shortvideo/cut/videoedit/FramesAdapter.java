package com.p280ss.android.ugc.aweme.shortvideo.cut.videoedit;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0052o;
import android.content.Context;
import android.graphics.Bitmap;
import android.support.p022v4.util.C0902i;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.support.p029v7.widget.RecyclerView.LayoutParams;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.common.utility.C6311g;
import com.facebook.common.references.C13326a;
import com.facebook.imagepipeline.p720g.C13644b;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.aweme.shortvideo.cut.VEMediaParserFrameProviderImpl;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.C38787f;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.cover.C40154a;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.cover.C40161f;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.shortvideo.widget.C41674a;
import com.p280ss.android.ugc.aweme.shortvideo.widget.C41706n;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.FramesAdapter */
public class FramesAdapter extends C1262a<C1293v> {

    /* renamed from: a */
    public int f101732a;

    /* renamed from: b */
    public Context f101733b;

    /* renamed from: c */
    public HashMap<String, Float> f101734c = new HashMap<>();

    /* renamed from: d */
    public List<C0902i<String, C0902i<Integer, Integer>>> f101735d;

    /* renamed from: e */
    public C38787f f101736e;

    /* renamed from: f */
    public List<VideoSegment> f101737f = new ArrayList();

    /* renamed from: g */
    public List<VideoSegment> f101738g;

    /* renamed from: h */
    public C0052o<Bitmap> f101739h;

    /* renamed from: i */
    public C0052o<Boolean> f101740i;

    /* renamed from: j */
    public int f101741j;

    /* renamed from: k */
    public int f101742k;

    /* renamed from: l */
    public List<Bitmap> f101743l = new ArrayList();

    /* renamed from: m */
    public boolean f101744m;

    /* renamed from: n */
    public C15389d f101745n;

    /* renamed from: o */
    private int f101746o;

    /* renamed from: p */
    private C41706n f101747p;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.FramesAdapter$a */
    class C39240a extends C1293v {

        /* renamed from: a */
        ImageView f101748a = ((ImageView) this.itemView.findViewById(R.id.bd1));

        /* renamed from: b */
        C13326a<C13644b> f101749b;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo97591a() {
            C13326a.m39001c(this.f101749b);
        }

        /* renamed from: a */
        private void m125266a(C13326a<C13644b> aVar) {
            Bitmap d = ((C13644b) aVar.mo32609a()).mo33265d();
            if (d != null && !d.isRecycled() && this.f101748a != null) {
                mo97591a();
                this.f101749b = aVar;
                this.f101748a.setImageBitmap(d);
            }
        }

        C39240a(ViewGroup viewGroup) {
            super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.za, viewGroup, false));
        }

        /* renamed from: a */
        private int m125265a(String str, int i) {
            int i2 = 0;
            int i3 = 0;
            while (i2 < FramesAdapter.this.f101738g.size() && !str.equals(((VideoSegment) FramesAdapter.this.f101738g.get(i2)).mo96908g())) {
                i3 = (int) (((long) i3) + ((VideoSegment) FramesAdapter.this.f101738g.get(i2)).f100761c);
                i2++;
            }
            return i3 + i;
        }

        /* renamed from: a */
        public final void mo97592a(int i, C39240a aVar) {
            int min;
            float f;
            int i2 = i;
            C39240a aVar2 = aVar;
            FramesAdapter.this.mo97580a();
            int a = FramesAdapter.this.mo97579a(i2);
            if (a >= 0) {
                C0902i iVar = (C0902i) ((C0902i) FramesAdapter.this.f101735d.get(a)).f3155b;
                if (FramesAdapter.this.f101732a == 1) {
                    min = (int) Math.min((((float) (i2 - ((Integer) iVar.f3154a).intValue())) * ((Float) FramesAdapter.this.f101734c.get(((VideoSegment) FramesAdapter.this.f101737f.get(a)).mo96908g())).floatValue()) + ((float) ((VideoSegment) FramesAdapter.this.f101737f.get(a)).mo96909h()), (float) ((VideoSegment) FramesAdapter.this.f101737f.get(a)).mo96910i());
                } else {
                    min = (int) Math.min(((float) (i2 - ((Integer) iVar.f3154a).intValue())) * ((Float) FramesAdapter.this.f101734c.get(((VideoSegment) FramesAdapter.this.f101737f.get(a)).mo96908g())).floatValue(), (float) ((VideoSegment) FramesAdapter.this.f101737f.get(a)).f100761c);
                }
                int i3 = min;
                StringBuilder sb = new StringBuilder();
                sb.append(a);
                sb.append("-");
                sb.append(i3);
                String sb2 = sb.toString();
                aVar2.f101748a.setTag(sb2);
                LayoutParams layoutParams = (LayoutParams) aVar2.f101748a.getLayoutParams();
                layoutParams.height = FramesAdapter.this.f101742k;
                layoutParams.width = FramesAdapter.this.f101741j;
                if (i2 == ((Integer) iVar.f3155b).intValue()) {
                    if (FramesAdapter.this.f101732a == 1) {
                        f = ((float) (((VideoSegment) FramesAdapter.this.f101737f.get(a)).mo96910i() - ((VideoSegment) FramesAdapter.this.f101737f.get(a)).mo96909h())) % ((Float) FramesAdapter.this.f101734c.get(((VideoSegment) FramesAdapter.this.f101737f.get(a)).mo96908g())).floatValue();
                    } else {
                        f = ((float) ((VideoSegment) FramesAdapter.this.f101737f.get(a)).f100761c) % ((Float) FramesAdapter.this.f101734c.get(((VideoSegment) FramesAdapter.this.f101737f.get(a)).mo96908g())).floatValue();
                    }
                    double d = (double) f;
                    Double.isNaN(d);
                    double d2 = d * 1.0d;
                    double floatValue = (double) ((Float) FramesAdapter.this.f101734c.get(((VideoSegment) FramesAdapter.this.f101737f.get(a)).mo96908g())).floatValue();
                    Double.isNaN(floatValue);
                    double d3 = d2 / (floatValue * 1.0d);
                    double d4 = (double) FramesAdapter.this.f101741j;
                    Double.isNaN(d4);
                    layoutParams.width = (int) (d3 * d4);
                }
                aVar2.f101748a.setLayoutParams(layoutParams);
                aVar2.f101748a.setImageBitmap(null);
                aVar2.f101748a.setBackgroundColor(FramesAdapter.this.f101733b.getResources().getColor(R.color.ew));
                if (FramesAdapter.this.f101744m) {
                    aVar2.f101748a.setImageBitmap((Bitmap) FramesAdapter.this.f101743l.get(i2));
                    return;
                }
                if (FramesAdapter.this.f101736e != null) {
                    String a2 = ((VideoSegment) FramesAdapter.this.f101737f.get(a)).mo96896a(false);
                    C38787f fVar = FramesAdapter.this.f101736e;
                    int a3 = m125265a(((VideoSegment) FramesAdapter.this.f101737f.get(a)).mo96908g(), i3);
                    C39251b bVar = new C39251b(this, aVar, sb2, i, iVar, a2);
                    fVar.mo96756a(i, a2, a3, i3, bVar);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo97593a(C39240a aVar, String str, int i, C0902i iVar, String str2, C13326a aVar2) {
            if (aVar.f101748a != null && aVar.f101748a.getTag().equals(str)) {
                m125266a(aVar2);
            }
            if (i == ((Integer) iVar.f3155b).intValue()) {
                FramesAdapter.this.f101736e.mo96758a(str2);
            }
        }
    }

    /* renamed from: a */
    public final void mo97587a(boolean z) {
        if (this.f101736e instanceof VEMediaParserFrameProviderImpl) {
            ((VEMediaParserFrameProviderImpl) this.f101736e).f100559b = z;
        }
    }

    /* renamed from: a */
    public final void mo97586a(List<VideoSegment> list) {
        this.f101737f = new ArrayList(list);
        mo97580a();
        m125251c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo97588b() {
        if (this.f101736e != null) {
            this.f101736e.mo96759b();
        }
    }

    /* renamed from: c */
    private void m125251c() {
        if (this.f101744m) {
            new C40154a().mo99898a(this.f101741j, this.f101742k).mo99907b(this.f101740i).mo99899a(this.f101739h).mo99904a(this.f101733b, this.f101745n, m125248a((int) ((VideoSegment) this.f101737f.get(0)).f100761c, ((VideoSegment) this.f101737f.get(0)).mo96908g()), (C40161f) new C39250a(this));
        }
        notifyDataSetChanged();
    }

    public int getItemCount() {
        int i;
        if (this.f101744m) {
            return this.f101743l.size();
        }
        if (this.f101747p != null) {
            return this.f101747p.f108561a;
        }
        if (C6311g.m19573a(this.f101737f)) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f101737f.size(); i3++) {
            if (this.f101732a == 1) {
                i = m125248a((int) (((VideoSegment) this.f101737f.get(i3)).f100763e - ((VideoSegment) this.f101737f.get(i3)).f100762d), ((VideoSegment) this.f101737f.get(i3)).mo96908g());
            } else {
                i = m125248a((int) ((VideoSegment) this.f101737f.get(i3)).f100761c, ((VideoSegment) this.f101737f.get(i3)).mo96908g());
            }
            i2 += i;
        }
        return i2;
    }

    /* renamed from: a */
    public final void mo97580a() {
        int i;
        if (this.f101735d == null) {
            this.f101735d = new ArrayList();
        } else {
            this.f101735d.clear();
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f101737f.size(); i3++) {
            VideoSegment videoSegment = (VideoSegment) this.f101737f.get(i3);
            if (this.f101732a == 1) {
                i = m125248a((int) (videoSegment.mo96910i() - videoSegment.mo96909h()), videoSegment.mo96908g());
            } else {
                i = m125248a((int) videoSegment.f100761c, videoSegment.mo96908g());
            }
            Integer valueOf = Integer.valueOf(i2);
            i2 += i;
            this.f101735d.add(C0902i.m3837a(videoSegment.mo96908g(), C0902i.m3837a(valueOf, Integer.valueOf(i2 - 1))));
        }
    }

    public void onViewRecycled(C1293v vVar) {
        super.onViewRecycled(vVar);
        if (vVar instanceof C39240a) {
            ((C39240a) vVar).mo97591a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void mo97590b(List<Bitmap> list) {
        if (!C23477d.m77081a((Collection<T>) list)) {
            this.f101743l.clear();
            this.f101743l.addAll(list);
            notifyDataSetChanged();
        }
    }

    /* renamed from: b */
    private void m125250b(HashMap<String, Float> hashMap) {
        for (String str : hashMap.keySet()) {
            this.f101734c.put(str, Float.valueOf(((Float) hashMap.get(str)).floatValue() * ((float) this.f101741j)));
        }
    }

    /* renamed from: a */
    public final int mo97579a(int i) {
        for (int i2 = 0; i2 < this.f101735d.size(); i2++) {
            C0902i iVar = (C0902i) ((C0902i) this.f101735d.get(i2)).f3155b;
            if (i >= ((Integer) iVar.f3154a).intValue() && i <= ((Integer) iVar.f3155b).intValue()) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo97585a(HashMap<String, Float> hashMap) {
        m125250b(hashMap);
        if (this.f101736e != null) {
            this.f101736e.mo96759b();
        }
        mo97580a();
        m125251c();
    }

    public C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C39240a(viewGroup);
    }

    public void onBindViewHolder(C1293v vVar, int i) {
        if (vVar instanceof C39240a) {
            C39240a aVar = (C39240a) vVar;
            aVar.mo97592a(i, aVar);
        }
    }

    /* renamed from: a */
    private int m125248a(int i, String str) {
        float f;
        if (this.f101734c.get(str) != null) {
            f = ((Float) this.f101734c.get(str)).floatValue();
        } else {
            f = -1.0f;
        }
        if (f <= 0.0f) {
            StringBuilder sb = new StringBuilder("duration: ");
            sb.append(i);
            sb.append(" oneFrameDurMap");
            sb.append(this.f101734c.get(str));
            sb.append(" path: ");
            sb.append(str);
            C41530am.m132284c(sb.toString());
        }
        return (int) Math.ceil((double) (((float) i) / f));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo97581a(C0043i iVar, VideoSegment videoSegment, HashMap<String, Float> hashMap) {
        if (!C6311g.m19573a(this.f101737f)) {
            this.f101737f.remove(videoSegment);
            mo97585a(hashMap);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo97589b(C0043i iVar, List<VideoSegment> list, HashMap<String, Float> hashMap) {
        this.f101737f.clear();
        this.f101737f.addAll(list);
        mo97585a(hashMap);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo97584a(C0043i iVar, List<VideoSegment> list, HashMap<String, Float> hashMap) {
        this.f101737f.addAll(list);
        mo97585a(hashMap);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo97582a(C0043i iVar, HashMap<String, Float> hashMap, int i, boolean z) {
        mo97585a(hashMap);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo97583a(C0043i iVar, HashMap<String, Float> hashMap, VideoSegment videoSegment, boolean z) {
        this.f101737f.clear();
        this.f101737f.add(videoSegment);
        mo97585a(hashMap);
    }

    /* renamed from: a */
    private void m125249a(Context context, List<VideoSegment> list, HashMap<String, Float> hashMap, int i, RecyclerView recyclerView) {
        this.f101733b = context;
        this.f101732a = i;
        int i2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            VideoSegment videoSegment = (VideoSegment) list.get(i3);
            this.f101734c.put(videoSegment.mo96908g(), Float.valueOf(((Float) hashMap.get(videoSegment.mo96908g())).floatValue() * ((float) this.f101741j)));
            i2 += m125248a((int) ((VideoSegment) list.get(i3)).f100761c, videoSegment.mo96908g());
        }
        this.f101746o = i2;
        this.f101738g = list;
    }

    public FramesAdapter(Context context, int[] iArr, List<VideoSegment> list, HashMap<String, Float> hashMap, int i, RecyclerView recyclerView) {
        this.f101741j = iArr[0];
        this.f101742k = iArr[1];
        m125249a(context, list, hashMap, i, recyclerView);
        this.f101736e = new VEMediaParserFrameProviderImpl(context);
    }

    public FramesAdapter(Context context, int[] iArr, List<VideoSegment> list, HashMap<String, Float> hashMap, int i, RecyclerView recyclerView, C41706n nVar) {
        this.f101741j = iArr[0];
        this.f101742k = iArr[1];
        this.f101747p = nVar;
        m125249a(context, list, hashMap, i, recyclerView);
        this.f101736e = new C41674a(nVar);
    }
}
