package com.p280ss.android.ugc.aweme.shortvideo.cover;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Matrix;
import com.p280ss.android.medialib.jni.EffectThumb;
import com.p280ss.android.medialib.model.CoverInfo;
import com.p280ss.android.medialib.player.EffectConfig;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.effect.C27429h;
import com.p280ss.android.ugc.aweme.effect.EffectPointModel;
import com.p280ss.android.ugc.aweme.shortvideo.cover.C38632c.C38633a;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.C39692a;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import dmt.p1861av.video.C47440an;
import java.util.List;
import kotlin.Triple;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cover.EffectVideoCoverGeneratorImpl */
public class EffectVideoCoverGeneratorImpl implements C0042h, C38632c {

    /* renamed from: a */
    private int f100324a;

    /* renamed from: b */
    private EffectThumb f100325b;

    /* renamed from: c */
    private List<EffectPointModel> f100326c;

    /* renamed from: d */
    private String f100327d;

    /* renamed from: e */
    private float f100328e;

    /* renamed from: f */
    private boolean f100329f;

    /* renamed from: g */
    private long f100330g;

    /* renamed from: h */
    private EditPreviewInfo f100331h;

    /* renamed from: a */
    public final int mo88418a() {
        return this.f100324a;
    }

    /* access modifiers changed from: 0000 */
    @C0054q(mo125a = Event.ON_DESTROY)
    public void onDestroy() {
        if (this.f100325b != null) {
            this.f100325b.stopRender();
        }
    }

    /* renamed from: a */
    private static long[] m123394a(long j, int i) {
        long[] jArr = new long[i];
        long j2 = j / ((long) i);
        for (int i2 = 0; i2 < i; i2++) {
            jArr[i2] = ((long) i2) * j2;
        }
        return jArr;
    }

    /* renamed from: a */
    public final void mo88419a(int i, int i2, C38633a aVar) {
        for (int i3 = 0; i3 < this.f100324a; i3++) {
            m123392a(i3, i, i2, aVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo96629a(EditVideoSegment editVideoSegment, int i, C38633a aVar) {
        int i2;
        if (editVideoSegment.getVideoCutInfo() == null || editVideoSegment.getVideoCutInfo().getRotate() <= 0) {
            i2 = 0;
        } else {
            i2 = C47440an.m148113e(editVideoSegment.getVideoPath());
            if (editVideoSegment.getVideoCutInfo() != null) {
                i2 += editVideoSegment.getVideoCutInfo().getRotate();
            }
        }
        CoverInfo thumb = this.f100325b.getThumb(i);
        Bitmap bitmap = null;
        if (!(thumb == null || thumb.getData() == null)) {
            Bitmap createBitmap = Bitmap.createBitmap(thumb.getData(), thumb.getWidth(), thumb.getHeight(), Config.ARGB_8888);
            if (i2 > 0) {
                Matrix matrix = new Matrix();
                matrix.postRotate((float) i2);
                bitmap = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, true);
            } else {
                bitmap = createBitmap;
            }
        }
        C6726a.m20844b(new C38631b(aVar, i, bitmap));
    }

    /* renamed from: a */
    private void m123392a(int i, int i2, int i3, C38633a aVar) {
        Triple a = C39692a.m127023a(this.f100331h, this.f100329f, (long) i);
        EditVideoSegment editVideoSegment = (EditVideoSegment) a.getFirst();
        if (this.f100325b == null) {
            this.f100325b = new C38634d();
            if (this.f100325b.init(editVideoSegment.getVideoPath()) < 0) {
                this.f100325b = null;
                return;
            }
            this.f100330g = this.f100325b.getDuration();
            EffectConfig filter = C27429h.m89873a(this.f100326c, editVideoSegment.getVideoCutInfo(), this.f100329f, (long[]) a.getThird()).setFilter(this.f100327d);
            filter.setFilterIntensity(this.f100328e);
            this.f100325b.renderVideo(m123394a(this.f100330g, this.f100324a), filter, i2, i3);
        }
        C6726a.m20842a(new C38630a(this, editVideoSegment, i, aVar));
    }

    public EffectVideoCoverGeneratorImpl(C0043i iVar, List<EffectPointModel> list, String str, float f, int i, boolean z, EditPreviewInfo editPreviewInfo) {
        iVar.getLifecycle().mo55a(this);
        this.f100324a = i;
        this.f100326c = list;
        this.f100327d = str;
        this.f100328e = f;
        this.f100329f = z;
        this.f100331h = editPreviewInfo;
    }
}
