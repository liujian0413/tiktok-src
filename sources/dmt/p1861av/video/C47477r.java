package dmt.p1861av.video;

import com.google.common.base.C17434j;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: dmt.av.video.r */
public final class C47477r {

    /* renamed from: d */
    public static final C47478a f121905d = new C47478a(null);

    /* renamed from: a */
    public CharSequence f121906a;

    /* renamed from: b */
    public long f121907b;

    /* renamed from: c */
    public final int f121908c;

    /* renamed from: dmt.av.video.r$a */
    public static final class C47478a {
        private C47478a() {
        }

        public /* synthetic */ C47478a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static C47477r m148201a(CharSequence charSequence, long j) {
            C47477r rVar = new C47477r(0, null);
            if (charSequence == null) {
                charSequence = "";
            }
            rVar.mo119599a(charSequence);
            rVar.f121907b = 2000;
            return rVar;
        }
    }

    public final int hashCode() {
        return C17434j.m57954a(Integer.valueOf(this.f121908c), this.f121906a, Long.valueOf(this.f121907b));
    }

    /* renamed from: a */
    public final void mo119599a(CharSequence charSequence) {
        C7573i.m23587b(charSequence, "<set-?>");
        this.f121906a = charSequence;
    }

    private C47477r(int i) {
        this.f121908c = i;
        this.f121906a = "";
    }

    public /* synthetic */ C47477r(int i, C7571f fVar) {
        this(0);
    }
}
