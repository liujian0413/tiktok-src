package com.p280ss.android.ugc.aweme.shortvideo.videocategory.repository.p1623a;

import com.bytedance.ies.abmock.C10292j;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.keva.Keva;
import com.p280ss.android.ugc.aweme.draft.model.VideoCategoryParam;
import com.p280ss.android.ugc.aweme.setting.CategoryVersion;
import com.p280ss.android.ugc.aweme.shortvideo.videocategory.repository.p1623a.p1625b.C41604b;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.repository.a.b */
public final class C41601b extends C41604b<List<? extends VideoCategoryParam>> {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f108104a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C41601b.class), "mRepo", "getMRepo()Lcom/bytedance/keva/Keva;"))};

    /* renamed from: b */
    public static final C41602a f108105b = new C41602a(null);

    /* renamed from: d */
    private final C7541d f108106d = C7546e.m23570a(Keva.getRepoFromSp(C6399b.m19921a(), "VideoCategoryCache", 0));

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.repository.a.b$a */
    public static final class C41602a {
        private C41602a() {
        }

        public /* synthetic */ C41602a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: d */
    private final Keva m132461d() {
        return (Keva) this.f108106d.getValue();
    }

    /* renamed from: e */
    private static List<VideoCategoryParam> m132462e() {
        return C41597a.m132444a();
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo102231b() {
        return m132462e();
    }

    public C41601b() {
        super("VideoCategoryCache", false, 2, null);
    }

    /* renamed from: a */
    public final boolean mo102230a() {
        if (C10292j.m30480a().mo25012a(CategoryVersion.class, "category_version", C6384b.m19835a().mo15294c().getCategoryVersion()) > m132461d().getInt("key_local_category_version", -1)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo102229a(List<VideoCategoryParam> list) {
        C7573i.m23587b(list, "newCache");
        super.mo102229a(list);
        m132461d().storeInt("key_local_category_version", C10292j.m30480a().mo25012a(CategoryVersion.class, "category_version", C6384b.m19835a().mo15294c().getCategoryVersion()));
    }
}
