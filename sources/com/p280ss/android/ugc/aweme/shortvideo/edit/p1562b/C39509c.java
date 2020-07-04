package com.p280ss.android.ugc.aweme.shortvideo.edit.p1562b;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0053p;
import android.content.Context;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.scene.C12629j;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.b.c */
public final class C39509c {

    /* renamed from: e */
    public static final C39510a f102561e = new C39510a(null);

    /* renamed from: a */
    public C0052o<C39508b> f102562a;

    /* renamed from: b */
    public C12629j f102563b;

    /* renamed from: c */
    public VideoPublishEditModel f102564c;

    /* renamed from: d */
    public boolean f102565d;

    /* renamed from: f */
    private C0052o<Boolean> f102566f;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.b.c$a */
    public static final class C39510a {
        private C39510a() {
        }

        public /* synthetic */ C39510a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m126204a(Context context, String str) {
            Context context2;
            C7573i.m23587b(str, "logString");
            if (C6399b.m19928c()) {
                if (context != null) {
                    context2 = context.getApplicationContext();
                } else {
                    context2 = null;
                }
                C10761a.m31396b(context2, str, 1).mo25750a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.b.c$b */
    static final class C39511b<T> implements C0053p<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C39509c f102567a;

        C39511b(C39509c cVar) {
            this.f102567a = cVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            int i;
            String str;
            if (this.f102567a.f102564c.autoEnhanceType == 0 && bool != null) {
                VideoPublishEditModel videoPublishEditModel = this.f102567a.f102564c;
                if (bool.booleanValue()) {
                    i = 1;
                } else {
                    i = 2;
                }
                videoPublishEditModel.autoEnhanceType = i;
                C0052o<C39508b> oVar = this.f102567a.f102562a;
                if (oVar != null) {
                    C39508b bVar = new C39508b(this.f102567a.f102564c.autoEnhanceOn, this.f102567a.f102564c.autoEnhanceType, false, 4, null);
                    oVar.postValue(bVar);
                }
                Context s = this.f102567a.f102563b.mo31011s();
                StringBuilder sb = new StringBuilder("receive light detect value,  ");
                if (bool.booleanValue()) {
                    str = "is dark light ";
                } else {
                    str = "is not dark light";
                }
                sb.append(str);
                C39510a.m126204a(s, sb.toString());
            }
        }
    }

    /* renamed from: a */
    public static final void m126200a(Context context, String str) {
        C39510a.m126204a(context, str);
    }

    /* renamed from: a */
    private final C0053p<Boolean> m126199a() {
        return new C39511b<>(this);
    }

    /* renamed from: a */
    public final void mo98361a(C0052o<Boolean> oVar) {
        C7573i.m23587b(oVar, "lightDetectData");
        this.f102566f = oVar;
        if (this.f102565d) {
            C0052o<Boolean> oVar2 = this.f102566f;
            if (oVar2 != null) {
                oVar2.observe(this.f102563b, m126199a());
            }
        }
    }

    /* renamed from: a */
    public final void mo98362a(boolean z) {
        this.f102564c.autoEnhanceOn = z;
        C0052o<C39508b> oVar = this.f102562a;
        if (oVar != null) {
            C39508b bVar = new C39508b(this.f102564c.autoEnhanceOn, this.f102564c.autoEnhanceType, false, 4, null);
            oVar.postValue(bVar);
        }
    }

    /* renamed from: b */
    public final void mo98363b(C0052o<C39508b> oVar) {
        C7573i.m23587b(oVar, "autoEnhanceData");
        this.f102562a = oVar;
        if (!this.f102565d) {
            C0052o<C39508b> oVar2 = this.f102562a;
            if (oVar2 != null) {
                C39508b bVar = new C39508b(this.f102564c.autoEnhanceOn, this.f102564c.autoEnhanceType, false, 4, null);
                oVar2.postValue(bVar);
            }
        }
    }

    public C39509c(C12629j jVar, VideoPublishEditModel videoPublishEditModel, boolean z) {
        C7573i.m23587b(jVar, "scene");
        C7573i.m23587b(videoPublishEditModel, "model");
        this.f102563b = jVar;
        this.f102564c = videoPublishEditModel;
        this.f102565d = z;
    }
}
