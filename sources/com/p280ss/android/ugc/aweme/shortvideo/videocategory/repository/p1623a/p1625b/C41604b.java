package com.p280ss.android.ugc.aweme.shortvideo.videocategory.repository.p1623a.p1625b;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.keva.Keva;
import com.google.gson.p277b.C6597a;
import com.p280ss.android.ugc.aweme.draft.model.VideoCategoryParam;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.repository.a.b.b */
public abstract class C41604b<T> implements C41603a<T> {

    /* renamed from: c */
    static final /* synthetic */ C7595j[] f108107c = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C41604b.class), "mRepo", "getMRepo()Lcom/bytedance/keva/Keva;"))};

    /* renamed from: a */
    private final C7541d f108108a;

    /* renamed from: b */
    private final String f108109b;

    /* renamed from: d */
    private final boolean f108110d;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.repository.a.b.b$a */
    public static final class C41605a extends C6597a<List<? extends VideoCategoryParam>> {
        C41605a() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.repository.a.b.b$b */
    public static final class C41606b extends C6597a<T> {
        C41606b() {
        }
    }

    /* renamed from: d */
    private final Keva m132470d() {
        return (Keva) this.f108108a.getValue();
    }

    /* renamed from: c */
    public final T mo102232c() {
        try {
            return C35574k.m114859a().mo70085S().mo15975a(m132470d().getString(this.f108109b, ""), new C41605a().type);
        } catch (Exception e) {
            C6921a.m21559a((Throwable) e);
            if (this.f108110d) {
                return mo102231b();
            }
            return null;
        }
    }

    /* renamed from: a */
    public void mo102229a(T t) {
        m132470d().storeString(this.f108109b, C35574k.m114859a().mo70085S().mo15980b(t, new C41606b().type));
    }

    private C41604b(String str, boolean z) {
        C7573i.m23587b(str, "repoName");
        this.f108109b = str;
        this.f108110d = z;
        this.f108108a = C7546e.m23570a(Keva.getRepoFromSp(C6399b.m19921a(), this.f108109b, 0));
    }

    public /* synthetic */ C41604b(String str, boolean z, int i, C7571f fVar) {
        this(str, true);
    }
}
