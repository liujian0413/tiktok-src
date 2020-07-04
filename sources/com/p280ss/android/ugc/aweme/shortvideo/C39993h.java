package com.p280ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordNewActivity;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.backgroundvideo.C40413c;
import com.p280ss.android.ugc.aweme.sticker.model.BackgroundVideo;
import com.p280ss.android.ugc.aweme.tools.C42135ab;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42156aw;
import com.p280ss.android.ugc.aweme.tools.C42159az;
import com.p280ss.android.ugc.aweme.tools.C42161ba;
import com.p280ss.android.ugc.aweme.tools.C42250d;
import java.lang.reflect.Type;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.h */
public final class C39993h implements C42161ba {

    /* renamed from: a */
    private final long f103892a = C35563c.f93230L.mo93344c(Property.LongVideoThreshold);

    /* renamed from: b */
    private final long f103893b = C40413c.f105051b;

    /* renamed from: c */
    private final VideoRecordNewActivity f103894c;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.h$a */
    public static final class C39994a implements C42159az<T> {

        /* renamed from: a */
        final /* synthetic */ C39993h f103895a;

        C39994a(C39993h hVar) {
            this.f103895a = hVar;
        }

        /* renamed from: a */
        public final void mo96096a(Object obj, T t) {
            if (this.f103895a.mo99449a() > 0) {
                this.f103895a.mo99450a(this.f103895a.mo99449a());
            }
        }
    }

    /* renamed from: b */
    private final ShortVideoContext m127876b() {
        C0063u a = C0069x.m159a((FragmentActivity) this.f103894c).mo147a(ShortVideoContextViewModel.class);
        C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…extViewModel::class.java)");
        return ((ShortVideoContextViewModel) a).f99791a;
    }

    /* renamed from: a */
    public final long mo99449a() {
        BackgroundVideo backgroundVideo;
        ShortVideoContext b = m127876b();
        if (b != null) {
            backgroundVideo = b.f99782r;
        } else {
            backgroundVideo = null;
        }
        if (backgroundVideo != null) {
            return backgroundVideo.getMaxDuration();
        }
        return 0;
    }

    public C39993h(VideoRecordNewActivity videoRecordNewActivity) {
        C7573i.m23587b(videoRecordNewActivity, "activity");
        this.f103894c = videoRecordNewActivity;
    }

    /* renamed from: a */
    public final void mo99450a(long j) {
        long j2;
        long j3;
        ShortVideoContext b = m127876b();
        if (b != null) {
            if (b.f99745af) {
                j2 = this.f103892a;
            } else {
                j2 = this.f103893b;
            }
            AVMusic b2 = C39360dw.m125725a().mo97931b();
            String str = b.f99769e;
            if (b2 == null || TextUtils.isEmpty(str)) {
                j3 = j2 - b.f99777m;
            } else {
                C7573i.m23582a((Object) str, "musicLocalPath");
                j3 = Math.min(j2, C38580ci.m123273a(b2, str)) - b.f99777m;
            }
            if (j > 0) {
                j3 = Math.min(j3, j);
            }
            long j4 = b.f99777m + j3;
            b.f99767c = j4;
            C42155av abVar = new C42135ab(j4);
            this.f103894c.mo97896J().mo103594a((Object) this, abVar);
            C39382ed edVar = this.f103894c.f107267H;
            C7573i.m23582a((Object) edVar, "activity.plan");
            C42156aw J = edVar.mo97896J();
            if (J == null) {
                C7573i.m23580a();
            }
            J.mo103594a((Object) this, abVar);
        }
    }

    /* renamed from: a */
    public final <T extends C42155av> C42159az<T> mo96095a(C42156aw awVar, Type type) {
        if (type != C42250d.class) {
            return null;
        }
        return new C39994a<>(this);
    }
}
