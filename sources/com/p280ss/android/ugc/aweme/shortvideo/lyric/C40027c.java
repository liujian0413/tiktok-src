package com.p280ss.android.ugc.aweme.shortvideo.lyric;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import com.p280ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper;
import com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper.STATUS;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35603z;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43757g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.lyric.c */
public final class C40027c {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f103942a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C40027c.class), "mEffectPlatform", "getMEffectPlatform()Lcom/ss/android/ugc/aweme/effectplatform/EffectPlatform;"))};

    /* renamed from: b */
    public List<Effect> f103943b = new ArrayList();

    /* renamed from: c */
    public List<Effect> f103944c = new ArrayList();

    /* renamed from: d */
    public final LyricEffectViewModel f103945d;

    /* renamed from: e */
    public final FragmentActivity f103946e;

    /* renamed from: f */
    private final C7541d f103947f = C7546e.m23569a(new C40032e(this));

    /* renamed from: g */
    private Map<String, Effect> f103948g = new LinkedHashMap();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.lyric.c$a */
    public static final class C40028a implements C43757g {

        /* renamed from: a */
        final /* synthetic */ C40027c f103949a;

        C40028a(C40027c cVar) {
            this.f103949a = cVar;
        }

        /* renamed from: a */
        public final void mo9274a(C43726c cVar) {
            this.f103949a.mo99466a(false);
        }

        /* renamed from: a */
        public final void mo9275a(EffectChannelResponse effectChannelResponse) {
            C7573i.m23587b(effectChannelResponse, "response");
            this.f103949a.mo99465a(effectChannelResponse);
            this.f103949a.f103945d.f103934a.setValue(LiveDataWrapper.m109596a(STATUS.SUCCESS, effectChannelResponse.allCategoryEffects));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.lyric.c$b */
    public static final class C40029b implements C43757g {

        /* renamed from: a */
        final /* synthetic */ C40027c f103950a;

        C40029b(C40027c cVar) {
            this.f103950a = cVar;
        }

        /* renamed from: a */
        public final void mo9274a(C43726c cVar) {
            this.f103950a.mo99469b(false);
        }

        /* renamed from: a */
        public final void mo9275a(EffectChannelResponse effectChannelResponse) {
            C7573i.m23587b(effectChannelResponse, "response");
            this.f103950a.mo99468b(effectChannelResponse);
            this.f103950a.f103945d.f103935b.setValue(LiveDataWrapper.m109596a(STATUS.SUCCESS, effectChannelResponse.allCategoryEffects));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.lyric.c$c */
    public static final class C40030c implements C43757g {

        /* renamed from: a */
        final /* synthetic */ C40027c f103951a;

        /* renamed from: b */
        final /* synthetic */ boolean f103952b;

        /* renamed from: a */
        public final void mo9275a(EffectChannelResponse effectChannelResponse) {
            C7573i.m23587b(effectChannelResponse, "response");
            this.f103951a.mo99465a(effectChannelResponse);
            this.f103951a.f103945d.f103934a.setValue(LiveDataWrapper.m109596a(STATUS.SUCCESS, effectChannelResponse.allCategoryEffects));
        }

        /* renamed from: a */
        public final void mo9274a(C43726c cVar) {
            C7573i.m23587b(cVar, "e");
            if (this.f103952b) {
                this.f103951a.mo99467b();
            } else {
                this.f103951a.f103945d.f103934a.setValue(LiveDataWrapper.m109598a(STATUS.ERROR, cVar.f113222c));
            }
        }

        C40030c(C40027c cVar, boolean z) {
            this.f103951a = cVar;
            this.f103952b = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.lyric.c$d */
    public static final class C40031d implements C43757g {

        /* renamed from: a */
        final /* synthetic */ C40027c f103953a;

        /* renamed from: b */
        final /* synthetic */ boolean f103954b;

        /* renamed from: a */
        public final void mo9275a(EffectChannelResponse effectChannelResponse) {
            C7573i.m23587b(effectChannelResponse, "response");
            this.f103953a.mo99468b(effectChannelResponse);
            this.f103953a.f103945d.f103935b.setValue(LiveDataWrapper.m109596a(STATUS.SUCCESS, effectChannelResponse.allCategoryEffects));
        }

        /* renamed from: a */
        public final void mo9274a(C43726c cVar) {
            C7573i.m23587b(cVar, "e");
            if (this.f103954b) {
                this.f103953a.mo99467b();
            } else {
                this.f103953a.f103945d.f103935b.setValue(LiveDataWrapper.m109598a(STATUS.ERROR, cVar.f113222c));
            }
        }

        C40031d(C40027c cVar, boolean z) {
            this.f103953a = cVar;
            this.f103954b = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.lyric.c$e */
    static final class C40032e extends Lambda implements C7561a<EffectPlatform> {

        /* renamed from: a */
        final /* synthetic */ C40027c f103955a;

        C40032e(C40027c cVar) {
            this.f103955a = cVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public EffectPlatform invoke() {
            Context context = this.f103955a.f103946e;
            C35603z zVar = C35563c.f93245h;
            C7573i.m23582a((Object) zVar, "AVEnv.LOCATION_SERVICE");
            EffectPlatform effectPlatform = new EffectPlatform(context, zVar.mo83209c(), C35563c.f93220B.getOKHttpClient());
            effectPlatform.mo70619a((C0043i) this.f103955a.f103946e);
            return effectPlatform;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.lyric.c$f */
    public static final class C40033f implements C43757g {

        /* renamed from: a */
        final /* synthetic */ C40027c f103956a;

        /* renamed from: a */
        public final void mo9274a(C43726c cVar) {
        }

        C40033f(C40027c cVar) {
            this.f103956a = cVar;
        }

        /* renamed from: a */
        public final void mo9275a(EffectChannelResponse effectChannelResponse) {
            C7573i.m23587b(effectChannelResponse, "response");
            this.f103956a.mo99465a(effectChannelResponse);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.lyric.c$g */
    public static final class C40034g implements C43757g {

        /* renamed from: a */
        final /* synthetic */ C40027c f103957a;

        /* renamed from: a */
        public final void mo9274a(C43726c cVar) {
        }

        C40034g(C40027c cVar) {
            this.f103957a = cVar;
        }

        /* renamed from: a */
        public final void mo9275a(EffectChannelResponse effectChannelResponse) {
            C7573i.m23587b(effectChannelResponse, "response");
            this.f103957a.mo99468b(effectChannelResponse);
        }
    }

    /* renamed from: d */
    private final EffectPlatform m127945d() {
        return (EffectPlatform) this.f103947f.getValue();
    }

    /* renamed from: c */
    public final Effect mo99470c() {
        if (this.f103943b.size() > 0) {
            return (Effect) this.f103943b.get(0);
        }
        return null;
    }

    /* renamed from: b */
    public final void mo99467b() {
        m127945d().mo70641b("lyricstyle", true, new C40028a(this));
        m127945d().mo70641b("lyricstylefont", true, new C40029b(this));
    }

    /* renamed from: a */
    public final void mo99464a() {
        m127945d().mo70641b("lyricstyle", true, new C40033f(this));
        m127945d().mo70641b("lyricstylefont", true, new C40034g(this));
    }

    /* renamed from: a */
    private static String m127944a(String str) {
        try {
            String string = new JSONObject(str).getString("LinkLyricsStyle");
            C7573i.m23582a((Object) string, "json.getString(\"LinkLyricsStyle\")");
            return string;
        } catch (JSONException unused) {
            return "";
        }
    }

    /* renamed from: b */
    public final void mo99469b(boolean z) {
        EffectPlatform d = m127945d();
        if (d != null) {
            d.mo70623a("lyricstylefont", (C43757g) new C40031d(this, false));
        }
    }

    /* renamed from: a */
    public final Effect mo99463a(Effect effect) {
        boolean z;
        C7573i.m23587b(effect, "lyricEffect");
        String extra = effect.getExtra();
        C7573i.m23582a((Object) extra, "lyricEffect.extra");
        String a = m127944a(extra);
        CharSequence charSequence = a;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return (Effect) this.f103948g.get(a);
        }
        if (this.f103944c.size() > 0) {
            return (Effect) this.f103944c.get(0);
        }
        return null;
    }

    public C40027c(FragmentActivity fragmentActivity) {
        C7573i.m23587b(fragmentActivity, "context");
        this.f103946e = fragmentActivity;
        C0063u a = C0069x.m159a(this.f103946e).mo147a(LyricEffectViewModel.class);
        C7573i.m23582a((Object) a, "ViewModelProviders.of(co…ectViewModel::class.java]");
        this.f103945d = (LyricEffectViewModel) a;
    }

    /* renamed from: b */
    public final void mo99468b(EffectChannelResponse effectChannelResponse) {
        Object obj;
        if (effectChannelResponse != null) {
            obj = effectChannelResponse.allCategoryEffects;
        } else {
            obj = null;
        }
        C7573i.m23582a(obj, "it");
        if (!(!((Collection) obj).isEmpty())) {
            obj = null;
        }
        if (obj != null) {
            this.f103944c = C7525m.m23509d((Collection) obj);
            for (Effect effect : (Iterable) obj) {
                Map<String, Effect> map = this.f103948g;
                C7573i.m23582a((Object) effect, "it");
                String extra = effect.getExtra();
                C7573i.m23582a((Object) extra, "it.extra");
                map.put(m127944a(extra), effect);
            }
            this.f103945d.f103936c.setValue(null);
        }
    }

    /* renamed from: a */
    public final void mo99465a(EffectChannelResponse effectChannelResponse) {
        Object obj;
        if (effectChannelResponse != null) {
            obj = effectChannelResponse.allCategoryEffects;
        } else {
            obj = null;
        }
        C7573i.m23582a(obj, "it");
        if (!(!((Collection) obj).isEmpty())) {
            obj = null;
        }
        if (obj != null) {
            this.f103943b = C7525m.m23509d((Collection) obj);
        }
    }

    /* renamed from: a */
    public final void mo99466a(boolean z) {
        EffectPlatform d = m127945d();
        if (d != null) {
            d.mo70623a("lyricstyle", (C43757g) new C40030c(this, false));
        }
    }
}
