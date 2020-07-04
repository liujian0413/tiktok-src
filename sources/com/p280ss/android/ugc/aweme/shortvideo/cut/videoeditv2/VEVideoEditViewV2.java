package com.p280ss.android.ugc.aweme.shortvideo.cut.videoeditv2;

import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.util.C0902i;
import android.util.AttributeSet;
import com.p280ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p280ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.C38785d;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEVideoEditViewV2 */
public class VEVideoEditViewV2 extends VideoEditViewV2 {

    /* renamed from: K */
    private long f101931K;

    /* renamed from: L */
    private long f101932L;

    /* renamed from: M */
    private Map<String, Boolean> f101933M;

    /* renamed from: a */
    public final void mo97624a(C0902i<Float, Float> iVar, boolean z) {
    }

    /* renamed from: a */
    public final void mo97628a(boolean z, C0902i<Float, Float> iVar) {
    }

    /* renamed from: a */
    public final boolean mo97634a(FragmentActivity fragmentActivity, CutMultiVideoViewModel cutMultiVideoViewModel, List<MediaModel> list, boolean z) {
        return false;
    }

    /* renamed from: e */
    public final void mo97603e() {
    }

    /* renamed from: f */
    public final boolean mo97642f() {
        return false;
    }

    public int getEditState() {
        return this.f101983r;
    }

    public long getLeftSeekingValue() {
        return this.f101989x;
    }

    public long getMultiSeekTime() {
        return this.f101989x;
    }

    public long getRightSeekingValue() {
        return this.f101990y;
    }

    public long getSingleSeekTime() {
        return this.f101989x;
    }

    public C0902i<Float, Float> getSlideX() {
        return null;
    }

    public void setCanEdit(boolean z) {
    }

    /* renamed from: a */
    public final void mo97600a(boolean z) {
        if (!this.f101940G.booleanValue() && z) {
            this.f101931K = this.f101991z;
            this.f101932L = this.f101989x;
            if (getRecyclerView().f101880M) {
                mo97790k();
            }
        }
        this.f101940G = Boolean.valueOf(z);
        if (z) {
            this.f101968c.setImageResource(R.drawable.coc);
            this.f101967b.setImageResource(R.drawable.cob);
            m125484q();
        } else {
            this.f101968c.setImageResource(R.drawable.co7);
            this.f101967b.setImageResource(R.drawable.co6);
            m125485r();
        }
        setFocusOnMode(false);
    }

    public long getMultiPlayingPosition() {
        return getPlayingPosition();
    }

    public long getSinglePlayingPosition() {
        return getPlayingPosition();
    }

    private Map<String, Boolean> getSingleEditFirstMap() {
        if (this.f101933M == null) {
            this.f101933M = new HashMap(8);
        }
        return this.f101933M;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo97773g() {
        super.mo97773g();
        m125480m();
        this.f101931K = this.f101991z;
        this.f101932L = this.f101989x;
    }

    public C0902i<Long, Long> getPlayBoundary() {
        if (this.f101983r == 1) {
            return getMultiVideoPlayDur();
        }
        return getSingleVideoPlayDur();
    }

    /* renamed from: q */
    private void m125484q() {
        this.f101968c.setOnTouchListener(null);
        this.f101967b.setOnTouchListener(null);
        this.f101969d.setOnTouchListener(null);
    }

    public int getCurrentRotate() {
        if (this.f101983r == 2 || this.f101983r == 0) {
            return this.f101985t.f100797c;
        }
        return 0;
    }

    public float getCurrentSpeed() {
        if (this.f101983r == 2 || this.f101983r == 0) {
            return this.f101985t.f100798d;
        }
        return this.f101977l.mo97722o();
    }

    public long getMaxCutDuration() {
        if (this.f101983r == 1) {
            return m125479d(this.f101975j);
        }
        return (long) (((float) this.f101975j) * this.f101985t.f100798d);
    }

    public C0902i<Long, Long> getMultiVideoPlayDur() {
        return C0902i.m3837a(Long.valueOf(m125479d(this.f101989x)), Long.valueOf(m125479d(this.f101990y)));
    }

    public long getPlayingPosition() {
        return (long) ((((this.f101969d.getStartX() - this.f101968c.getStartX()) - ((float) C39280c.f102001c)) * this.f101979n.f101994a) + ((float) this.f101989x));
    }

    public float getSelectedTime() {
        long j;
        if (this.f101940G.booleanValue()) {
            j = this.f101939F;
        } else {
            j = this.f101991z;
            if (this.f101991z > this.f101975j) {
                j = this.f101975j;
            }
        }
        return ((float) j) / 1000.0f;
    }

    /* renamed from: n */
    private void m125481n() {
        if (this.f101985t != null) {
            this.f101985t.f100797c += 90;
            if (this.f101985t.f100797c >= 360) {
                this.f101985t.f100797c = 0;
            }
            if (this.f101983r == 0) {
                this.f101977l.mo97696a(this.f101985t, 0);
            }
        }
    }

    /* renamed from: r */
    private void m125485r() {
        this.f101968c.setOnTouchListener(this);
        this.f101968c.setTag("startSlide");
        this.f101967b.setOnTouchListener(this);
        this.f101967b.setTag("endSlide");
        this.f101969d.setOnTouchListener(this);
        this.f101969d.setTag("curPoint");
    }

    /* renamed from: s */
    private void m125486s() {
        this.f101968c.setOnTouchListener(this);
        this.f101968c.setTag("startSlide");
        this.f101967b.setOnTouchListener(this);
        this.f101967b.setTag("endSlide");
        this.f101969d.setOnTouchListener(null);
        this.f101969d.setTag("curPoint");
    }

    public C0902i<Long, Long> getSingleVideoPlayDur() {
        return C0902i.m3837a(Long.valueOf((long) (((float) this.f101989x) * this.f101985t.f100798d)), Long.valueOf((long) (((float) this.f101990y) * this.f101985t.f100798d)));
    }

    /* renamed from: m */
    private void m125480m() {
        this.f101978m.f100396c.observe(this.f101976k, new C39282e(this));
        this.f101978m.f100397d.observe(this.f101976k, new C39283f(this));
        this.f101978m.f100398e.observe(this.f101976k, new C39284g(this));
        this.f101978m.f100399f.observe(this.f101976k, new C39285h(this));
        this.f101978m.f100400g.observe(this.f101976k, new C39286i(this));
        this.f101978m.f100401h.observe(this.f101976k, new C39287j(this));
        this.f101978m.f100402i.observe(this.f101976k, new C39288k(this));
    }

    /* renamed from: o */
    private void m125482o() {
        this.f101983r = 1;
        this.f101977l.mo97691a(1);
        this.f101974i = C39280c.m125555c();
        this.f101988w = C39278b.m125544a(this.f101977l.mo97721n(), this.f101977l.mo97722o());
        mo97780a(this.f101934A, this.f101935B, this.f101988w);
        this.f101979n.f101995b = this.f101991z;
        this.f101979n.mo97798b(this.f101988w, this.f101977l.mo97722o());
        this.f101971f.setVisibility(8);
        if (!this.f101940G.booleanValue()) {
            this.f101970e.setVisibility(0);
        }
        this.f101977l.mo97717j();
        if (this.f101985t != null) {
            this.f101985t.mo96925a();
        }
        mo97789j();
        this.f101942I.mo97758c();
    }

    /* renamed from: p */
    private void m125483p() {
        m125472a((VideoSegment) this.f101977l.mo97721n().get(this.f101984s), true);
        this.f101983r = 1;
        this.f101977l.mo97691a(1);
        this.f101985t.f100795a = (long) (((float) this.f101989x) * this.f101985t.f100798d);
        this.f101985t.f100796b = (long) (((float) this.f101990y) * this.f101985t.f100798d);
        this.f101977l.mo97696a(this.f101985t, this.f101984s);
        this.f101974i = C39280c.m125555c();
        this.f101988w = C39278b.m125544a(this.f101977l.mo97721n(), this.f101977l.mo97722o());
        this.f101991z = mo97782b(Math.min(this.f101988w, 60000));
        this.f101979n.f101995b = this.f101991z;
        this.f101989x = 0;
        this.f101990y = this.f101991z;
        this.f101979n.mo97798b(this.f101988w, this.f101977l.mo97722o());
        this.f101971f.setVisibility(8);
        if (!this.f101940G.booleanValue()) {
            this.f101970e.setVisibility(0);
        }
        this.f101970e.mo5541b(0);
        this.f101980o.mo97740a(this.f101979n.f101994a);
        this.f101977l.mo97718k();
        if (this.f101985t != null) {
            this.f101985t.mo96925a();
        }
        mo97789j();
        this.f101942I.mo97758c();
    }

    /* renamed from: a */
    public final void mo97620a() {
        if (this.f101977l != null) {
            if (this.f101983r == 0) {
                if (this.f101981p != null) {
                    this.f101981p.mo97744a(this.f101977l.mo97721n());
                }
            } else if (this.f101980o != null) {
                this.f101980o.mo97744a(this.f101977l.mo97721n());
            }
        }
    }

    /* renamed from: c */
    public final void mo97640c() {
        this.f101991z = mo97782b(Math.min(this.f101988w, 60000));
        this.f101979n.f101995b = this.f101991z;
        this.f101989x = 0;
        this.f101990y = this.f101989x + this.f101991z;
        if (this.f101940G.booleanValue()) {
            this.f101932L = 0;
            this.f101931K = this.f101991z;
        }
        this.f101979n.mo97798b(this.f101988w, this.f101977l.mo97722o());
        this.f101970e.mo5541b(0);
        this.f101977l.mo97690a(this.f101982q);
        ArrayList arrayList = new ArrayList();
        for (VideoSegment videoSegment : this.f101977l.mo97721n()) {
            if (!videoSegment.f100768j) {
                arrayList.add(videoSegment);
            }
        }
        this.f101980o.mo97745a((List<? extends VideoSegment>) arrayList, this.f101979n.f101994a);
        mo97790k();
        mo97789j();
    }

    /* renamed from: d */
    public final void mo97602d() {
        if (this.f101940G.booleanValue()) {
            this.f101970e.setVisibility(8);
        } else {
            this.f101988w = C39278b.m125544a(this.f101977l.mo97721n(), this.f101977l.mo97722o());
            this.f101989x = this.f101932L;
            this.f101991z = this.f101931K;
            this.f101990y = this.f101989x + this.f101991z;
            this.f101979n.f101995b = this.f101991z;
            this.f101979n.mo97798b(this.f101988w, this.f101977l.mo97722o());
            this.f101971f.setVisibility(8);
            this.f101970e.setVisibility(0);
            this.f101968c.setStartX((float) this.f101987v);
            this.f101967b.setStartX((float) ((this.f101973h - this.f101987v) - C39280c.f102001c));
            mo97777a(this.f101968c.getStartX() + ((float) C39280c.f102001c), false);
            mo97779a((int) this.f101968c.getStartX(), (int) this.f101967b.getStartX());
        }
        ArrayList arrayList = new ArrayList();
        for (VideoSegment videoSegment : this.f101977l.mo97721n()) {
            if (!videoSegment.f100768j) {
                arrayList.add(videoSegment);
            }
        }
        this.f101980o.mo97745a((List<? extends VideoSegment>) arrayList, this.f101979n.f101994a);
        mo97787h();
        this.f101977l.mo97706c();
        this.f101977l.mo97709d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo97771b(Void voidR) {
        m125482o();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo97772c(Void voidR) {
        m125481n();
    }

    public void setExtractFramesInRoughMode(boolean z) {
        this.f101936C = z;
    }

    public void setLoadThumbnailDirectly(boolean z) {
        this.f101986u = z;
    }

    public void setMaxVideoLength(long j) {
        this.f101975j = j;
    }

    public void setMinVideoLength(long j) {
        this.f101974i = j;
    }

    public VEVideoEditViewV2(Context context) {
        this(context, null);
    }

    /* renamed from: c */
    private long m125477c(int i) {
        VideoSegment videoSegment = (VideoSegment) this.f101977l.mo97721n().get(i);
        long i2 = (long) (((float) (videoSegment.mo96910i() - videoSegment.mo96909h())) / videoSegment.mo96911j());
        Boolean bool = (Boolean) getSingleEditFirstMap().get(videoSegment.mo96896a(false));
        if (bool == null || !bool.booleanValue()) {
            return Math.min(i2, 60000);
        }
        return i2;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo97766a(float f) {
        switch (this.f101983r) {
            case 0:
                m125471a(0, f);
                mo97635b();
                break;
            case 1:
                this.f101977l.mo97707c(f);
                this.f101979n.mo97798b(this.f101988w, this.f101977l.mo97722o());
                this.f101980o.mo97740a(this.f101979n.f101994a);
                this.f101970e.mo5541b(0);
                break;
            case 2:
                m125471a(this.f101984s, f);
                break;
        }
        mo97789j();
        this.f101977l.mo97701b(f);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void mo97767a(long j) {
        if (!this.f101937D && !this.f101938E && j != -1 && j != 1) {
            mo97777a(this.f101968c.getStartX() + ((float) C39280c.f102001c) + (((float) (j - this.f101989x)) / this.f101979n.f101994a), false);
        }
    }

    /* renamed from: d */
    private long m125479d(long j) {
        long j2 = 0;
        if (this.f101977l.mo97721n() == null || this.f101977l.mo97721n().isEmpty()) {
            return 0;
        }
        for (VideoSegment videoSegment : this.f101977l.mo97721n()) {
            if (!videoSegment.f100768j) {
                float i = ((float) (videoSegment.mo96910i() - videoSegment.mo96909h())) / videoSegment.mo96911j();
                float f = (float) j;
                if (f < i) {
                    return (long) (((float) j2) + (f * videoSegment.mo96911j()));
                }
                j2 += videoSegment.mo96910i() - videoSegment.mo96909h();
                j = (long) (f - i);
            }
        }
        return j2;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo97769a(VideoSegment videoSegment) {
        m125472a(videoSegment, false);
        this.f101983r = 1;
        this.f101977l.mo97691a(1);
        this.f101977l.mo97703b(videoSegment.mo96908g());
        this.f101974i = C39280c.m125555c();
        this.f101988w = C39278b.m125544a(this.f101977l.mo97721n(), this.f101977l.mo97722o());
        this.f101991z = mo97782b(Math.min(this.f101988w, 60000));
        this.f101979n.f101995b = this.f101991z;
        this.f101979n.mo97798b(this.f101988w, this.f101977l.mo97722o());
        this.f101971f.setVisibility(8);
        if (!this.f101940G.booleanValue()) {
            this.f101970e.setVisibility(0);
        }
        mo97780a(0, this.f101991z, this.f101988w);
        if (this.f101940G.booleanValue()) {
            this.f101932L = 0;
            this.f101931K = mo97782b(this.f101988w);
        }
        this.f101970e.mo5541b(0);
        this.f101980o.mo97743a(videoSegment, this.f101979n.f101994a);
        this.f101977l.mo97695a(videoSegment);
        if (this.f101985t != null) {
            this.f101985t.mo96925a();
        }
        mo97789j();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo97768a(C0902i<Integer, Integer> iVar) {
        this.f101983r = 2;
        this.f101977l.mo97691a(2);
        this.f101984s = ((Integer) iVar.f3155b).intValue();
        this.f101974i = 500;
        VideoSegment videoSegment = (VideoSegment) this.f101977l.mo97721n().get(this.f101984s);
        if (this.f101985t == null) {
            this.f101985t = new C38785d(videoSegment);
        } else {
            this.f101985t.mo96926a(videoSegment);
        }
        this.f101934A = this.f101989x;
        this.f101935B = this.f101990y;
        this.f101988w = (long) (((float) videoSegment.f100761c) / videoSegment.mo96911j());
        if (this.f101940G.booleanValue()) {
            this.f101939F = videoSegment.mo96910i() - videoSegment.mo96909h();
            this.f101991z = videoSegment.mo96910i() - videoSegment.mo96909h();
            if (this.f101991z <= 1000) {
                this.f101991z = 1000;
                m125486s();
                m125476b(true);
                this.f101979n.f101995b = this.f101991z;
                this.f101979n.mo97797a(videoSegment.f100761c, videoSegment.mo96911j());
                this.f101989x = (long) (((float) videoSegment.mo96909h()) / videoSegment.mo96911j());
                this.f101990y = this.f101989x + this.f101939F;
            } else {
                m125484q();
                m125476b(false);
                this.f101979n.f101995b = this.f101991z;
                this.f101979n.mo97797a(videoSegment.f100761c, videoSegment.mo96911j());
                this.f101989x = (long) (((float) videoSegment.mo96909h()) / videoSegment.mo96911j());
                this.f101990y = this.f101989x + this.f101991z;
            }
        } else {
            this.f101991z = mo97782b(m125477c(this.f101984s));
            this.f101979n.f101995b = this.f101991z;
            this.f101979n.mo97797a(videoSegment.f100761c, videoSegment.mo96911j());
            this.f101989x = (long) (((float) videoSegment.mo96909h()) / videoSegment.mo96911j());
            this.f101990y = this.f101989x + this.f101991z;
        }
        mo97635b();
        this.f101970e.setVisibility(8);
        this.f101971f.setVisibility(0);
        this.f101971f.mo5541b(0);
        this.f101981p.mo97742a(this.f101979n.f101994a, videoSegment);
        mo97787h();
        this.f101977l.mo97694a(iVar);
    }

    /* renamed from: b */
    private void m125476b(boolean z) {
        if (z) {
            this.f101968c.setStartX((float) this.f101987v);
            double d = (double) this.f101939F;
            Double.isNaN(d);
            double d2 = d * 1.0d;
            double d3 = (double) this.f101991z;
            Double.isNaN(d3);
            double d4 = d2 / d3;
            double d5 = (double) this.f101982q;
            Double.isNaN(d5);
            this.f101941H = (float) (d4 * d5);
            this.f101967b.setStartX(this.f101968c.getStartX() + ((float) C39280c.f102001c) + this.f101941H);
        } else {
            this.f101968c.setStartX((float) this.f101987v);
            this.f101967b.setStartX((float) ((this.f101973h - this.f101987v) - C39280c.f102001c));
        }
        mo97779a((int) this.f101968c.getStartX(), (int) this.f101967b.getStartX());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo97770a(Void voidR) {
        m125483p();
    }

    /* renamed from: a */
    public final void mo97599a(List<VideoSegment> list) {
        this.f101983r = 1;
        this.f101977l.mo97704b(list);
        this.f101974i = C39280c.m125555c();
        this.f101988w = C39278b.m125544a(this.f101977l.mo97721n(), this.f101977l.mo97722o());
        this.f101991z = mo97782b(Math.min(this.f101988w, 60000));
        this.f101979n.f101995b = this.f101991z;
        this.f101979n.mo97798b(this.f101988w, this.f101977l.mo97722o());
        this.f101989x = 0;
        this.f101990y = this.f101989x + this.f101991z;
        this.f101971f.setVisibility(8);
        this.f101970e.setVisibility(0);
        this.f101970e.mo5541b(0);
        this.f101980o.mo97747b(list, this.f101979n.f101994a);
        this.f101977l.mo97690a(0.0f);
        mo97789j();
    }

    public VEVideoEditViewV2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m125472a(VideoSegment videoSegment, boolean z) {
        if (!this.f101940G.booleanValue() && this.f101983r == 2) {
            if (z) {
                getSingleEditFirstMap().put(videoSegment.mo96896a(false), Boolean.valueOf(true));
            } else {
                getSingleEditFirstMap().remove(videoSegment.mo96896a(false));
            }
        }
    }

    /* renamed from: a */
    private void m125471a(int i, float f) {
        float f2 = this.f101985t.f100798d;
        this.f101985t.f100798d = f;
        VideoSegment videoSegment = (VideoSegment) this.f101977l.mo97721n().get(i);
        this.f101988w = (long) (((float) videoSegment.f100761c) / f);
        this.f101991z = mo97782b(C39289l.m125558a(this.f101991z, f2, f, this.f101974i));
        this.f101979n.f101995b = this.f101991z;
        this.f101979n.mo97797a(videoSegment.f100761c, this.f101985t.f100798d);
        this.f101981p.mo97741a(this.f101979n.f101994a, f);
        mo97788i();
        this.f101989x = (long) (((float) this.f101985t.f100795a) / f);
        this.f101990y = this.f101989x + this.f101991z;
    }

    public VEVideoEditViewV2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
