package com.p280ss.android.ugc.aweme.shortvideo.cut.videoedit;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0063u;
import android.support.p022v4.util.C0902i;
import com.bytedance.apm.util.C6292i;
import com.bytedance.common.utility.C6311g;
import com.p280ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.C38785d;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.CutVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p280ss.android.ugc.aweme.tools.RecordingSpeed;
import com.p280ss.android.ugc.aweme.tools.p1665a.C42133c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel */
public class VideoEditViewModel extends C0063u {

    /* renamed from: a */
    public C0052o<Integer> f101836a = new C0052o<>();

    /* renamed from: b */
    public C0052o<Boolean> f101837b = new C0052o<>();

    /* renamed from: c */
    public C0052o<Float> f101838c = new C0052o<>();

    /* renamed from: d */
    public C0052o<Long> f101839d = new C0052o<>();

    /* renamed from: e */
    public C0052o<Void> f101840e = new C0052o<>();

    /* renamed from: f */
    public C0052o<Void> f101841f = new C0052o<>();

    /* renamed from: g */
    public C0052o<Void> f101842g = new C0052o<>();

    /* renamed from: h */
    public C0052o<Void> f101843h = new C0052o<>();

    /* renamed from: i */
    public C0052o<Void> f101844i = new C0052o<>();

    /* renamed from: j */
    public C0052o<Void> f101845j = new C0052o<>();

    /* renamed from: k */
    public C0052o<Void> f101846k = new C0052o<>();

    /* renamed from: l */
    public C0052o<Void> f101847l = new C0052o<>();

    /* renamed from: m */
    public C0052o<Float> f101848m = new C0052o<>();

    /* renamed from: n */
    public C0052o<C0902i<Integer, Integer>> f101849n = new C0052o<>();

    /* renamed from: o */
    public C0052o<Void> f101850o = new C0052o<>();

    /* renamed from: p */
    public C0052o<Void> f101851p = new C0052o<>();

    /* renamed from: q */
    public C0052o<VideoSegment> f101852q = new C0052o<>();

    /* renamed from: r */
    public C0052o<Boolean> f101853r = new C0052o<>();

    /* renamed from: s */
    public C0052o<Void> f101854s = new C0052o<>();

    /* renamed from: t */
    public C0052o<CutVideoContext> f101855t = new C0052o<>();

    /* renamed from: u */
    public C39249a f101856u;

    /* renamed from: v */
    private HashMap<String, Integer> f101857v = new HashMap<>();

    /* renamed from: w */
    private HashMap<String, Integer> f101858w = new HashMap<>();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel$a */
    public interface C39249a {
        /* renamed from: a */
        void mo96777a(VideoSegment videoSegment);

        /* renamed from: b */
        void mo96778b(VideoSegment videoSegment);
    }

    /* renamed from: a */
    public final void mo97698a(boolean z) {
        this.f101837b.setValue(Boolean.valueOf(z));
    }

    /* renamed from: a */
    public final void mo97695a(VideoSegment videoSegment) {
        this.f101852q.setValue(videoSegment);
    }

    /* renamed from: a */
    public final void mo97697a(List<MediaModel> list) {
        ArrayList arrayList = new ArrayList();
        if (C6311g.m19574b(list)) {
            int i = 0;
            if (list.size() == 1) {
                arrayList.add(m125367a((MediaModel) list.get(0)));
            } else {
                for (MediaModel videoSegment : list) {
                    VideoSegment videoSegment2 = new VideoSegment(videoSegment);
                    videoSegment2.f100759a = i;
                    arrayList.add(videoSegment2);
                    i++;
                }
            }
        }
        CutVideoContext cutVideoContext = new CutVideoContext();
        cutVideoContext.setVideoSegmentList(arrayList);
        cutVideoContext.totalSpeed = RecordingSpeed.NORMAL.value();
        m125368a(cutVideoContext);
    }

    /* renamed from: a */
    public final void mo97696a(C38785d dVar, int i) {
        VideoSegment videoSegment = (VideoSegment) ((CutVideoContext) this.f101855t.getValue()).getVideoSegmentList().get(i);
        videoSegment.mo96897a(dVar.f100798d);
        videoSegment.mo96898a(dVar.f100795a);
        videoSegment.mo96901b(dVar.f100796b);
        videoSegment.f100769k = dVar.f100797c;
        if (this.f101856u != null) {
            this.f101856u.mo96777a(videoSegment);
        }
    }

    /* renamed from: b */
    public final void mo97700b() {
        this.f101840e.setValue(null);
    }

    /* renamed from: c */
    public final void mo97706c() {
        this.f101842g.setValue(null);
    }

    /* renamed from: d */
    public final void mo97709d() {
        this.f101845j.setValue(null);
    }

    /* renamed from: e */
    public final void mo97712e() {
        this.f101854s.setValue(null);
    }

    /* renamed from: f */
    public final void mo97713f() {
        this.f101843h.setValue(null);
    }

    /* renamed from: g */
    public final void mo97714g() {
        this.f101844i.setValue(null);
    }

    /* renamed from: h */
    public final void mo97715h() {
        this.f101846k.setValue(null);
    }

    /* renamed from: i */
    public final void mo97716i() {
        this.f101847l.setValue(null);
    }

    /* renamed from: j */
    public final void mo97717j() {
        this.f101850o.setValue(null);
    }

    /* renamed from: k */
    public final void mo97718k() {
        this.f101851p.setValue(null);
    }

    /* renamed from: l */
    public final void mo97719l() {
        this.f101858w.clear();
    }

    /* renamed from: a */
    public final void mo97689a() {
        this.f101841f.setValue(null);
    }

    /* renamed from: m */
    public final List<VideoSegment> mo97720m() {
        return ((CutVideoContext) this.f101855t.getValue()).getVideoSegmentList();
    }

    /* renamed from: n */
    public final List<VideoSegment> mo97721n() {
        return ((CutVideoContext) this.f101855t.getValue()).getVideoSegmentList();
    }

    /* renamed from: o */
    public final float mo97722o() {
        return ((CutVideoContext) this.f101855t.getValue()).totalSpeed;
    }

    /* renamed from: p */
    public final boolean mo97723p() {
        for (VideoSegment j : ((CutVideoContext) this.f101855t.getValue()).getVideoSegmentList()) {
            if (j.mo96911j() != RecordingSpeed.NORMAL.value()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: q */
    public final boolean mo97724q() {
        if (this.f101855t.getValue() == null || ((CutVideoContext) this.f101855t.getValue()).getVideoSegmentList() == null || ((CutVideoContext) this.f101855t.getValue()).getVideoSegmentList().isEmpty()) {
            return false;
        }
        VideoSegment videoSegment = (VideoSegment) ((CutVideoContext) this.f101855t.getValue()).getVideoSegmentList().get(0);
        if (videoSegment.f100765g <= 0 || videoSegment.f100766h <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m125368a(CutVideoContext cutVideoContext) {
        this.f101855t.setValue(cutVideoContext);
    }

    /* renamed from: b */
    public final void mo97701b(float f) {
        this.f101848m.setValue(Float.valueOf(f));
    }

    /* renamed from: c */
    public final void mo97707c(float f) {
        ((CutVideoContext) this.f101855t.getValue()).totalSpeed = f;
    }

    /* renamed from: a */
    public final void mo97690a(float f) {
        this.f101838c.setValue(Float.valueOf(f));
    }

    /* renamed from: d */
    public final boolean mo97710d(int i) {
        return this.f101858w.containsKey(((VideoSegment) ((CutVideoContext) this.f101855t.getValue()).getVideoSegmentList().get(i)).mo96908g());
    }

    /* renamed from: e */
    public final VideoSegment mo97711e(int i) {
        return (VideoSegment) ((CutVideoContext) this.f101855t.getValue()).getVideoSegmentList().get(i);
    }

    /* renamed from: a */
    private static VideoSegment m125367a(MediaModel mediaModel) {
        VideoSegment videoSegment = new VideoSegment(mediaModel);
        int[] iArr = new int[10];
        if (C42133c.m134093a(mediaModel.f88156b, iArr) == 0) {
            videoSegment.f100765g = iArr[0];
            videoSegment.f100766h = iArr[1];
            videoSegment.f100761c = (long) iArr[3];
            videoSegment.f100778t = iArr[7];
            videoSegment.f100779u = iArr[6];
            videoSegment.f100780v = iArr[9];
            videoSegment.f100781w = iArr[8];
        }
        return videoSegment;
    }

    /* renamed from: b */
    public final int mo97699b(int i) {
        VideoSegment videoSegment = (VideoSegment) ((CutVideoContext) this.f101855t.getValue()).getVideoSegmentList().get(i);
        if (this.f101857v.containsKey(videoSegment.mo96908g())) {
            return ((Integer) this.f101857v.get(videoSegment.mo96908g())).intValue();
        }
        return 0;
    }

    /* renamed from: c */
    public final int mo97705c(int i) {
        VideoSegment videoSegment = (VideoSegment) ((CutVideoContext) this.f101855t.getValue()).getVideoSegmentList().get(i);
        if (this.f101858w.containsKey(videoSegment.mo96908g())) {
            return ((Integer) this.f101858w.get(videoSegment.mo96908g())).intValue();
        }
        return 0;
    }

    /* renamed from: a */
    public final int mo97688a(String str) {
        int i = 0;
        for (VideoSegment g : ((CutVideoContext) this.f101855t.getValue()).getVideoSegmentList()) {
            if (g.mo96908g().equals(str)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: b */
    public final void mo97703b(String str) {
        for (VideoSegment videoSegment : ((CutVideoContext) this.f101855t.getValue()).getVideoSegmentList()) {
            if (videoSegment.mo96908g().equals(str)) {
                videoSegment.f100768j = true;
                return;
            }
        }
    }

    /* renamed from: c */
    public final void mo97708c(String str) {
        for (VideoSegment videoSegment : ((CutVideoContext) this.f101855t.getValue()).getVideoSegmentList()) {
            if (videoSegment.mo96908g().equals(str)) {
                if (this.f101856u != null) {
                    this.f101856u.mo96778b(videoSegment);
                }
                videoSegment.f100768j = true;
                return;
            }
        }
    }

    /* renamed from: a */
    public final void mo97691a(int i) {
        this.f101836a.setValue(Integer.valueOf(i));
    }

    /* renamed from: b */
    public final void mo97704b(List<VideoSegment> list) {
        if (!C6292i.m19525a(list)) {
            ((CutVideoContext) this.f101855t.getValue()).getVideoSegmentList().addAll(list);
        }
    }

    /* renamed from: a */
    public final void mo97693a(long j) {
        this.f101839d.setValue(Long.valueOf(j));
    }

    /* renamed from: a */
    public final void mo97694a(C0902i<Integer, Integer> iVar) {
        this.f101849n.setValue(iVar);
    }

    /* renamed from: b */
    public final void mo97702b(int i, int i2) {
        this.f101858w.put(((VideoSegment) ((CutVideoContext) this.f101855t.getValue()).getVideoSegmentList().get(i)).mo96908g(), Integer.valueOf(i2));
    }

    /* renamed from: a */
    public final void mo97692a(int i, int i2) {
        this.f101857v.put(((VideoSegment) ((CutVideoContext) this.f101855t.getValue()).getVideoSegmentList().get(i)).mo96908g(), Integer.valueOf(i2));
    }
}
