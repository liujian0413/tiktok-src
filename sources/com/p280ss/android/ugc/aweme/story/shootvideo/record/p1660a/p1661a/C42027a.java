package com.p280ss.android.ugc.aweme.story.shootvideo.record.p1660a.p1661a;

import android.content.SharedPreferences;
import com.p280ss.android.ugc.aweme.framework.p1276e.C29960a;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.record.a.a.a */
public final class C42027a {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f109156a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C42027a.class), "springCacheStrategyImpl", "getSpringCacheStrategyImpl()Lcom/ss/android/ugc/aweme/story/shootvideo/record/festival/effect/EffectCacheStrategy;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C42027a.class), "normalCacheStrategyImpl", "getNormalCacheStrategyImpl()Lcom/ss/android/ugc/aweme/story/shootvideo/record/festival/effect/EffectCacheStrategy;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C42027a.class), "cacheSp", "getCacheSp()Landroid/content/SharedPreferences;"))};

    /* renamed from: b */
    public static final C42027a f109157b = new C42027a();

    /* renamed from: c */
    private static boolean f109158c = true;

    /* renamed from: d */
    private static final C7541d f109159d = C7546e.m23569a(C42030c.f109164a);

    /* renamed from: e */
    private static final C7541d f109160e = C7546e.m23569a(C42029b.f109163a);

    /* renamed from: f */
    private static final C7541d f109161f = C7546e.m23569a(C42028a.f109162a);

    /* renamed from: com.ss.android.ugc.aweme.story.shootvideo.record.a.a.a$a */
    static final class C42028a extends Lambda implements C7561a<SharedPreferences> {

        /* renamed from: a */
        public static final C42028a f109162a = new C42028a();

        C42028a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m133587a();
        }

        /* renamed from: a */
        private static SharedPreferences m133587a() {
            return C7285c.m22838a(C29960a.m98230a(), "effect_cache_settings", 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.shootvideo.record.a.a.a$b */
    static final class C42029b extends Lambda implements C7561a<C42031b> {

        /* renamed from: a */
        public static final C42029b f109163a = new C42029b();

        C42029b() {
            super(0);
        }

        /* renamed from: a */
        private static C42031b m133588a() {
            return new C42031b();
        }

        public final /* synthetic */ Object invoke() {
            return m133588a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.shootvideo.record.a.a.a$c */
    static final class C42030c extends Lambda implements C7561a<C42032c> {

        /* renamed from: a */
        public static final C42030c f109164a = new C42030c();

        C42030c() {
            super(0);
        }

        /* renamed from: a */
        private static C42032c m133589a() {
            return new C42032c();
        }

        public final /* synthetic */ Object invoke() {
            return m133589a();
        }
    }

    private C42027a() {
    }

    /* renamed from: a */
    private final SharedPreferences m133585a() {
        return (SharedPreferences) f109161f.getValue();
    }

    /* renamed from: a */
    public final void mo103192a(String str, long j) {
        C7573i.m23587b(str, "key");
        m133585a().edit().putLong(str, j).apply();
    }
}
