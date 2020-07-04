package dmt.p1861av.video;

import com.p280ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: dmt.av.video.l */
public final class C47466l {

    /* renamed from: h */
    public static final C47467a f121868h = new C47467a(null);

    /* renamed from: a */
    public AtomicInteger f121869a;

    /* renamed from: b */
    public AtomicInteger f121870b;

    /* renamed from: c */
    public AtomicInteger f121871c;

    /* renamed from: d */
    public final String f121872d;

    /* renamed from: e */
    public final boolean f121873e;

    /* renamed from: f */
    public final boolean f121874f;

    /* renamed from: g */
    public final AudioEffectParam f121875g;

    /* renamed from: dmt.av.video.l$a */
    public static final class C47467a {
        private C47467a() {
        }

        public /* synthetic */ C47467a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static C47466l m148182a(boolean z, boolean z2) {
            C47466l lVar = new C47466l("clear", true, z2, null, 8, null);
            return lVar;
        }

        /* renamed from: a */
        public static C47466l m148183a(boolean z, boolean z2, AudioEffectParam audioEffectParam) {
            C47466l lVar = new C47466l("apply", z, z2, audioEffectParam, null);
            return lVar;
        }
    }

    /* renamed from: a */
    public static final C47466l m148179a(boolean z, boolean z2, AudioEffectParam audioEffectParam) {
        return C47467a.m148183a(true, z2, audioEffectParam);
    }

    /* renamed from: b */
    public final void mo119590b(AtomicInteger atomicInteger) {
        C7573i.m23587b(atomicInteger, "<set-?>");
        this.f121870b = atomicInteger;
    }

    /* renamed from: a */
    public final void mo119589a(AtomicInteger atomicInteger) {
        C7573i.m23587b(atomicInteger, "<set-?>");
        this.f121869a = atomicInteger;
    }

    private C47466l(String str, boolean z, boolean z2, AudioEffectParam audioEffectParam) {
        this.f121872d = str;
        this.f121873e = z;
        this.f121874f = z2;
        this.f121875g = audioEffectParam;
        this.f121869a = new AtomicInteger(-1);
        this.f121870b = new AtomicInteger(-1);
        this.f121871c = new AtomicInteger(-1);
    }

    public /* synthetic */ C47466l(String str, boolean z, boolean z2, AudioEffectParam audioEffectParam, C7571f fVar) {
        this(str, z, z2, audioEffectParam);
    }

    /* synthetic */ C47466l(String str, boolean z, boolean z2, AudioEffectParam audioEffectParam, int i, C7571f fVar) {
        this(str, z, z2, null);
    }
}
