package com.bytedance.ies.bullet.p551ui.common.params;

import com.bytedance.ies.bullet.core.kit.C10354a;
import com.bytedance.ies.bullet.core.params.C10459b;
import com.bytedance.ies.bullet.core.params.C10463f;
import com.bytedance.ies.bullet.core.params.C10467j;
import com.bytedance.ies.bullet.core.params.C10469l;
import java.util.Map;
import kotlin.collections.C7525m;

/* renamed from: com.bytedance.ies.bullet.ui.common.params.a */
public class C10697a extends C10354a {

    /* renamed from: A */
    public final C10463f<Boolean> f28574A;

    /* renamed from: b */
    private final C10463f<String> f28575b;

    /* renamed from: c */
    private final Map<String, C10463f<?>> f28576c;

    /* renamed from: j */
    public final C10463f<Boolean> f28577j = new C10459b("no_hw", false, 2, null);

    /* renamed from: k */
    public final C10463f<Boolean> f28578k = new C10459b("status_font_dark", false, 2, null);

    /* renamed from: l */
    public final C10463f<C10699c> f28579l;

    /* renamed from: m */
    public final C10463f<Boolean> f28580m;

    /* renamed from: n */
    public final C10463f<Boolean> f28581n;

    /* renamed from: o */
    public final C10463f<Boolean> f28582o;

    /* renamed from: p */
    public final C10463f<Boolean> f28583p;

    /* renamed from: q */
    public final C10463f<C10699c> f28584q;

    /* renamed from: r */
    public final C10463f<Boolean> f28585r;

    /* renamed from: s */
    public final C10463f<Boolean> f28586s;

    /* renamed from: t */
    public final C10463f<Boolean> f28587t;

    /* renamed from: u */
    public final C10463f<C10699c> f28588u;

    /* renamed from: v */
    public final C10463f<C10699c> f28589v;

    /* renamed from: w */
    public final C10463f<String> f28590w;

    /* renamed from: x */
    public final C10463f<C10699c> f28591x;

    /* renamed from: y */
    public final C10463f<C10699c> f28592y;

    /* renamed from: z */
    public final C10463f<Boolean> f28593z;

    /* renamed from: a */
    public Map<String, C10463f<?>> mo25105a() {
        return this.f28576c;
    }

    public C10697a() {
        C10467j jVar = new C10467j("loading_bgcolor", C10700d.m31251a(), null, 4, null);
        this.f28579l = jVar;
        this.f28580m = new C10459b("need_bottom_out", false, 2, null);
        this.f28581n = new C10459b("should_full_screen", false, 2, null);
        this.f28582o = new C10459b("hide_loading", false, 2, null);
        this.f28583p = new C10459b("hide_status_bar", false, 2, null);
        C10467j jVar2 = new C10467j("status_bar_color", C10700d.m31251a(), null, 4, null);
        this.f28584q = jVar2;
        this.f28585r = new C10459b("hide_nav_bar", false, 2, null);
        this.f28586s = new C10459b("status_bar_padding", false, 2, null);
        this.f28587t = new C10459b("show_debug_title", false, 2, null);
        C10467j jVar3 = new C10467j("bg_color", C10700d.m31251a(), null, 4, null);
        this.f28588u = jVar3;
        C10467j jVar4 = new C10467j("container_bgcolor", C10700d.m31251a(), null, 4, null);
        this.f28589v = jVar4;
        C10467j jVar5 = new C10467j("title", C10469l.m30845f(), null, 4, null);
        this.f28590w = jVar5;
        C10467j jVar6 = new C10467j("nav_bar_color", C10700d.m31251a(), null, 4, null);
        this.f28591x = jVar6;
        C10467j jVar7 = new C10467j("title_color", C10700d.m31251a(), null, 4, null);
        this.f28592y = jVar7;
        this.f28593z = new C10459b("show_closeall", false, 2, null);
        this.f28574A = new C10459b("is_adjust_pan", false, 2, null);
        C10467j jVar8 = new C10467j("disable_pop_gesture", C10469l.m30845f(), null, 4, null);
        this.f28575b = jVar8;
        Map<String, C10463f<?>> a = super.mo25105a();
        for (C10463f fVar : C7525m.m23464b((T[]) new C10463f[]{this.f28577j, this.f28578k, this.f28579l, this.f28580m, this.f28581n, this.f28582o, this.f28583p, this.f28584q, this.f28585r, this.f28586s, this.f28587t, this.f28588u, this.f28589v, this.f28590w, this.f28591x, this.f28592y, this.f28593z, this.f28574A, this.f28575b})) {
            a.put(fVar.mo25248a(), fVar);
        }
        this.f28576c = a;
    }
}
