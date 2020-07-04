package com.p280ss.android.ugc.aweme.share.improve;

import com.p280ss.android.ugc.aweme.share.C37981am;
import com.p280ss.android.ugc.aweme.utils.C43101el;
import kotlin.C7581n;
import kotlin.coroutines.C47919b;
import kotlin.coroutines.intrinsics.C47948a;
import kotlin.coroutines.jvm.internal.C7540d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.p357a.C7563m;
import kotlinx.coroutines.C48056ad;
import kotlinx.coroutines.C48093bb;
import kotlinx.coroutines.C48100bi;
import kotlinx.coroutines.C48132cg;

/* renamed from: com.ss.android.ugc.aweme.share.improve.c */
public final class C38152c {

    /* renamed from: a */
    public static final C38152c f99264a = new C38152c();

    @C7540d(mo19421b = "UrlShorter.kt", mo19422c = {25}, mo19423d = "invokeSuspend", mo19424e = "com.ss.android.ugc.aweme.share.improve.UrlShorter$fetchShortenUrl$1")
    /* renamed from: com.ss.android.ugc.aweme.share.improve.c$a */
    static final class C38153a extends SuspendLambda implements C7563m<C48056ad, C47919b<? super C7581n>, Object> {

        /* renamed from: a */
        Object f99265a;

        /* renamed from: b */
        int f99266b;

        /* renamed from: c */
        final /* synthetic */ ObjectRef f99267c;

        /* renamed from: d */
        final /* synthetic */ String f99268d;

        /* renamed from: e */
        final /* synthetic */ String f99269e;

        /* renamed from: f */
        final /* synthetic */ boolean f99270f;

        /* renamed from: g */
        private C48056ad f99271g;

        @C7540d(mo19421b = "UrlShorter.kt", mo19422c = {29}, mo19423d = "invokeSuspend", mo19424e = "com.ss.android.ugc.aweme.share.improve.UrlShorter$fetchShortenUrl$1$1")
        /* renamed from: com.ss.android.ugc.aweme.share.improve.c$a$1 */
        static final class C381541 extends SuspendLambda implements C7563m<C48056ad, C47919b<? super C7581n>, Object> {

            /* renamed from: a */
            Object f99272a;

            /* renamed from: b */
            Object f99273b;

            /* renamed from: c */
            int f99274c;

            /* renamed from: d */
            final /* synthetic */ C38153a f99275d;

            /* renamed from: e */
            private C48056ad f99276e;

            @C7540d(mo19421b = "UrlShorter.kt", mo19422c = {}, mo19423d = "invokeSuspend", mo19424e = "com.ss.android.ugc.aweme.share.improve.UrlShorter$fetchShortenUrl$1$1$job$1")
            /* renamed from: com.ss.android.ugc.aweme.share.improve.c$a$1$a */
            static final class C38155a extends SuspendLambda implements C7563m<C48056ad, C47919b<? super C7581n>, Object> {

                /* renamed from: a */
                int f99277a;

                /* renamed from: b */
                final /* synthetic */ C381541 f99278b;

                /* renamed from: c */
                private C48056ad f99279c;

                C38155a(C381541 r1, C47919b bVar) {
                    this.f99278b = r1;
                    super(2, bVar);
                }

                public final C47919b<C7581n> create(Object obj, C47919b<?> bVar) {
                    C7573i.m23587b(bVar, "completion");
                    C38155a aVar = new C38155a(this.f99278b, bVar);
                    aVar.f99279c = (C48056ad) obj;
                    return aVar;
                }

                public final Object invoke(Object obj, Object obj2) {
                    return ((C38155a) create(obj, (C47919b) obj2)).invokeSuspend(C7581n.f20898a);
                }

                public final Object invokeSuspend(Object obj) {
                    if (this.f99277a == 0) {
                        ObjectRef objectRef = this.f99278b.f99275d.f99267c;
                        T a = C37981am.m121295a(this.f99278b.f99275d.f99268d, this.f99278b.f99275d.f99269e, this.f99278b.f99275d.f99270f);
                        C7573i.m23582a((Object) a, "ShareHelper.getGroupShar…rl, channel, boolPersist)");
                        objectRef.element = a;
                        return C7581n.f20898a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            {
                this.f99275d = r1;
            }

            public final C47919b<C7581n> create(Object obj, C47919b<?> bVar) {
                C7573i.m23587b(bVar, "completion");
                C381541 r0 = new C381541(this.f99275d, bVar);
                r0.f99276e = (C48056ad) obj;
                return r0;
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C381541) create(obj, (C47919b) obj2)).invokeSuspend(C7581n.f20898a);
            }

            public final Object invokeSuspend(Object obj) {
                Object a = C47948a.m148881a();
                switch (this.f99274c) {
                    case 0:
                        C48056ad adVar = this.f99276e;
                        C48100bi b = C48145g.m149385a(C48093bb.f122957a, null, null, new C38155a(this, null), 3, null);
                        this.f99272a = adVar;
                        this.f99273b = b;
                        this.f99274c = 1;
                        if (b.mo120326b((C47919b<? super C7581n>) this) == a) {
                            return a;
                        }
                        break;
                    case 1:
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C7581n.f20898a;
            }
        }

        C38153a(ObjectRef objectRef, String str, String str2, boolean z, C47919b bVar) {
            this.f99267c = objectRef;
            this.f99268d = str;
            this.f99269e = str2;
            this.f99270f = z;
            super(2, bVar);
        }

        public final C47919b<C7581n> create(Object obj, C47919b<?> bVar) {
            C7573i.m23587b(bVar, "completion");
            C38153a aVar = new C38153a(this.f99267c, this.f99268d, this.f99269e, this.f99270f, bVar);
            aVar.f99271g = (C48056ad) obj;
            return aVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C38153a) create(obj, (C47919b) obj2)).invokeSuspend(C7581n.f20898a);
        }

        public final Object invokeSuspend(Object obj) {
            Object a = C47948a.m148881a();
            switch (this.f99266b) {
                case 0:
                    C48056ad adVar = this.f99271g;
                    try {
                        C7563m r3 = new C381541(this, null);
                        this.f99265a = adVar;
                        this.f99266b = 1;
                        if (C48132cg.m149259a(3000, r3, this) == a) {
                            return a;
                        }
                    } catch (Exception unused) {
                        break;
                    }
                    break;
                case 1:
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C7581n.f20898a;
        }
    }

    private C38152c() {
    }

    /* renamed from: a */
    public static String m121901a(String str, String str2, boolean z) {
        boolean z2;
        C7573i.m23587b(str2, "channel");
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (str == null) {
                str = "";
            }
            return str;
        }
        ObjectRef objectRef = new ObjectRef();
        objectRef.element = "";
        C38153a aVar = new C38153a(objectRef, str, str2, z, null);
        String str3 = null;
        C48144f.m149382a(null, aVar, 1, null);
        String str4 = (String) objectRef.element;
        if (C43101el.m136718a(str4)) {
            str3 = str4;
        }
        if (str3 != null) {
            str = str3;
        }
        return str;
    }
}
