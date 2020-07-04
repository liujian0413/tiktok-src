package com.p280ss.android.ugc.gamora.recorder.status;

import com.p280ss.android.ugc.effectmanager.common.model.UrlModel;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.gamora.recorder.status.a */
public final class C44737a {

    /* renamed from: c */
    public static final C44738a f115131c = new C44738a(null);

    /* renamed from: a */
    public String f115132a;

    /* renamed from: b */
    public Effect f115133b;

    /* renamed from: com.ss.android.ugc.gamora.recorder.status.a$a */
    public static final class C44738a {
        private C44738a() {
        }

        public /* synthetic */ C44738a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public final UrlModel mo107155a() {
        Effect effect = this.f115133b;
        if (effect != null) {
            return effect.getIconUrl();
        }
        return null;
    }

    public C44737a(Effect effect) {
        C7573i.m23587b(effect, "effect");
        this.f115133b = effect;
    }

    public C44737a(String str) {
        C7573i.m23587b(str, "path");
        this.f115132a = str;
    }
}
