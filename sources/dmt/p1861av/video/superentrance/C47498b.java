package dmt.p1861av.video.superentrance;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: dmt.av.video.superentrance.b */
public final class C47498b {

    /* renamed from: a */
    public static final C47499a f121945a = new C47499a(null);

    /* renamed from: b */
    private final Keva f121946b;

    /* renamed from: dmt.av.video.superentrance.b$a */
    public static final class C47499a {
        private C47499a() {
        }

        public /* synthetic */ C47499a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: d */
    public final boolean mo119618d() {
        return this.f121946b.getBoolean("keva_key_showed_superentrance_tab", false);
    }

    /* renamed from: e */
    public final boolean mo119619e() {
        return this.f121946b.getBoolean("enable_show_super_entrance", true);
    }

    public C47498b() {
        Keva repo = Keva.getRepo("super_entrance_keva");
        C7573i.m23582a((Object) repo, "Keva.getRepo(REPO_NAME)");
        this.f121946b = repo;
    }

    /* renamed from: a */
    public final Effect mo119611a() {
        String string = this.f121946b.getString("super_entrance_effect", "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return (Effect) C35563c.f93239b.mo15974a(string, Effect.class);
    }

    /* renamed from: b */
    public final boolean mo119615b() {
        return this.f121946b.getBoolean("clicked_plus_entracne", false);
    }

    /* renamed from: c */
    public final boolean mo119617c() {
        return this.f121946b.getBoolean("showed_superentrance", false);
    }

    /* renamed from: a */
    public final void mo119613a(boolean z) {
        this.f121946b.storeBoolean("clicked_plus_entracne", z);
    }

    /* renamed from: a */
    public final void mo119612a(Effect effect) {
        this.f121946b.storeString("super_entrance_effect", C35563c.f93239b.mo15979b((Object) effect));
    }

    /* renamed from: b */
    public final void mo119614b(boolean z) {
        this.f121946b.storeBoolean("keva_key_showed_superentrance_tab", true);
    }

    /* renamed from: c */
    public final void mo119616c(boolean z) {
        this.f121946b.storeBoolean("enable_show_super_entrance", false);
    }
}
