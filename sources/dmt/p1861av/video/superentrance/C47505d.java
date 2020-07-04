package dmt.p1861av.video.superentrance;

import android.content.Context;
import android.text.TextUtils;
import com.google.common.base.C17457s;
import com.p280ss.android.ugc.aweme.effectplatform.C27481e;
import com.p280ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.effect.IEffectService;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43760j;
import kotlin.jvm.internal.C7573i;

/* renamed from: dmt.av.video.superentrance.d */
public final class C47505d {

    /* renamed from: a */
    public final Context f121958a;

    /* renamed from: b */
    private C27481e f121959b;

    /* renamed from: c */
    private final C47506a f121960c = new C47506a();

    /* renamed from: dmt.av.video.superentrance.d$a */
    public static final class C47506a implements C17457s<IEffectService> {

        /* renamed from: a */
        public IEffectService f121961a;

        C47506a() {
        }

        /* renamed from: b */
        public final IEffectService mo44946a() {
            if (this.f121961a == null) {
                this.f121961a = ((IAVService) ServiceManager.get().getService(IAVService.class)).effectService();
            }
            return this.f121961a;
        }
    }

    public C47505d(Context context) {
        C7573i.m23587b(context, "context");
        this.f121958a = context;
    }

    /* renamed from: a */
    public final void mo119625a(String str, C43760j jVar) {
        C7573i.m23587b(str, "sticker");
        C7573i.m23587b(jVar, "listener");
        if (!TextUtils.isEmpty(str)) {
            EffectPlatform effectPlatform = new EffectPlatform(C35563c.f93238a, C35563c.f93245h.mo83209c(), C35563c.f93220B.getOKHttpClient());
            C35563c.m114838e();
            this.f121959b = effectPlatform;
            IEffectService b = this.f121960c.mo44946a();
            if (b != null) {
                b.fetchEffectWithMusicBind(this.f121959b, str, "", jVar);
            }
        }
    }
}
