package com.p280ss.android.ugc.aweme.mix;

import com.bytedance.jedi.model.p602d.C11789a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.mix.MixDetailApi.C33479a;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;

/* renamed from: com.ss.android.ugc.aweme.mix.s */
public final class C33565s extends C11789a<C33568u, List<? extends Aweme>, C33568u, MixList> {

    /* renamed from: a */
    public static final C33566a f87660a = new C33566a(null);

    /* renamed from: b */
    private final MixDetailApi f87661b = C33479a.m108258a();

    /* renamed from: com.ss.android.ugc.aweme.mix.s$a */
    public static final class C33566a {
        private C33566a() {
        }

        public /* synthetic */ C33566a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    private static C33568u m108442a(C33568u uVar) {
        C7573i.m23587b(uVar, "req");
        return uVar;
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo29352b(Object obj) {
        return m108442a((C33568u) obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C7492s<MixList> mo29350a(C33568u uVar) {
        C7573i.m23587b(uVar, "req");
        return this.f87661b.getMixListAweme(uVar.f87664a, uVar.f87665b, uVar.f87666c, uVar.f87667d);
    }

    /* renamed from: a */
    private static List<Aweme> m108443a(C33568u uVar, MixList mixList) {
        C7573i.m23587b(uVar, "req");
        C7573i.m23587b(mixList, "resp");
        List<Aweme> list = mixList.awemeList;
        if (list == null) {
            return C7525m.m23461a();
        }
        return list;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo29351a(Object obj, Object obj2) {
        return m108443a((C33568u) obj, (MixList) obj2);
    }
}
