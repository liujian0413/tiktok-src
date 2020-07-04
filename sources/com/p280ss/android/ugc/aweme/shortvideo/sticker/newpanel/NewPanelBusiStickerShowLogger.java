package com.p280ss.android.ugc.aweme.shortvideo.sticker.newpanel;

import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1278j;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.StickerWrapper;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.NewPanelBusiStickerShowLogger */
public final class NewPanelBusiStickerShowLogger extends C1281m implements C1278j, OnAttachStateChangeListener {

    /* renamed from: a */
    private final Map<String, Boolean> f106189a = new LinkedHashMap();

    /* renamed from: b */
    private final List<String> f106190b = new ArrayList();

    /* renamed from: c */
    private final C40851a f106191c;

    /* renamed from: d */
    private final RecyclerView f106192d;

    /* renamed from: e */
    private final NewPanelStickerAdapter f106193e;

    /* renamed from: b */
    public final void mo5815b(View view) {
        C7573i.m23587b(view, "view");
    }

    /* renamed from: b */
    public final void mo101099b() {
        this.f106192d.mo5545b((C1281m) this);
        this.f106192d.removeOnAttachStateChangeListener(this);
        this.f106192d.mo5543b((C1278j) this);
    }

    /* renamed from: d */
    private final void m130491d() {
        for (String put : this.f106189a.keySet()) {
            this.f106189a.put(put, Boolean.valueOf(false));
        }
    }

    /* renamed from: a */
    public final void mo101098a() {
        this.f106192d.mo5528a((C1281m) this);
        this.f106192d.addOnAttachStateChangeListener(this);
        this.f106192d.mo5526a((C1278j) this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        if (r5 == null) goto L_0x0043;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m130490c() {
        /*
            r7 = this;
            android.support.v7.widget.RecyclerView r0 = r7.f106192d
            android.support.v7.widget.RecyclerView$i r0 = r0.getLayoutManager()
            boolean r1 = r0 instanceof android.support.p029v7.widget.LinearLayoutManager
            r2 = 0
            if (r1 != 0) goto L_0x000c
            r0 = r2
        L_0x000c:
            android.support.v7.widget.LinearLayoutManager r0 = (android.support.p029v7.widget.LinearLayoutManager) r0
            if (r0 != 0) goto L_0x0011
            return
        L_0x0011:
            int r1 = r0.mo5445j()
            int r0 = r0.mo5447l()
            java.util.List<java.lang.String> r3 = r7.f106190b
            r3.clear()
        L_0x001e:
            r3 = 0
            if (r1 >= r0) goto L_0x0070
            com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.NewPanelStickerAdapter r4 = r7.f106193e
            java.util.List r4 = r4.mo62312a()
            if (r4 == 0) goto L_0x0030
            java.lang.Object r4 = r4.get(r1)
            com.ss.android.ugc.aweme.shortvideo.sticker.StickerWrapper r4 = (com.p280ss.android.ugc.aweme.shortvideo.sticker.StickerWrapper) r4
            goto L_0x0031
        L_0x0030:
            r4 = r2
        L_0x0031:
            boolean r5 = m130489a(r4)
            if (r5 == 0) goto L_0x006d
            if (r4 == 0) goto L_0x0043
            com.ss.android.ugc.effectmanager.effect.model.Effect r5 = r4.f104908a
            if (r5 == 0) goto L_0x0043
            java.lang.String r5 = r5.getEffectId()
            if (r5 != 0) goto L_0x0045
        L_0x0043:
            java.lang.String r5 = ""
        L_0x0045:
            java.util.Map<java.lang.String, java.lang.Boolean> r6 = r7.f106189a
            java.lang.Object r6 = r6.get(r5)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            if (r6 == 0) goto L_0x0053
            boolean r3 = r6.booleanValue()
        L_0x0053:
            if (r3 != 0) goto L_0x005e
            if (r4 == 0) goto L_0x005a
            com.ss.android.ugc.effectmanager.effect.model.Effect r3 = r4.f104908a
            goto L_0x005b
        L_0x005a:
            r3 = r2
        L_0x005b:
            com.p280ss.android.ugc.aweme.utils.C43058dj.m136606b(r3)
        L_0x005e:
            java.util.Map<java.lang.String, java.lang.Boolean> r3 = r7.f106189a
            r4 = 1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r3.put(r5, r4)
            java.util.List<java.lang.String> r3 = r7.f106190b
            r3.add(r5)
        L_0x006d:
            int r1 = r1 + 1
            goto L_0x001e
        L_0x0070:
            java.util.Map<java.lang.String, java.lang.Boolean> r0 = r7.f106189a
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x007a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0098
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.List<java.lang.String> r2 = r7.f106190b
            boolean r2 = r2.contains(r1)
            if (r2 != 0) goto L_0x007a
            java.util.Map<java.lang.String, java.lang.Boolean> r2 = r7.f106189a
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            r2.put(r1, r4)
            goto L_0x007a
        L_0x0098:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.sticker.newpanel.NewPanelBusiStickerShowLogger.m130490c():void");
    }

    public final void onViewDetachedFromWindow(View view) {
        m130491d();
    }

    public final void onViewAttachedToWindow(View view) {
        if (this.f106191c.f106319l) {
            m130490c();
        }
    }

    /* renamed from: a */
    private static boolean m130489a(StickerWrapper stickerWrapper) {
        if (!(stickerWrapper == null || stickerWrapper.f104908a == null)) {
            Effect effect = stickerWrapper.f104908a;
            C7573i.m23582a((Object) effect, "stickerWrapper.effect");
            if (!TextUtils.isEmpty(effect.getAdRawData())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r0 == null) goto L_0x0033;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5814a(android.view.View r5) {
        /*
            r4 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.C7573i.m23587b(r5, r0)
            com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.a r0 = r4.f106191c
            boolean r0 = r0.f106319l
            if (r0 == 0) goto L_0x0057
            int r5 = android.support.p029v7.widget.RecyclerView.m5892f(r5)
            com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.NewPanelStickerAdapter r0 = r4.f106193e
            java.util.List r0 = r0.mo62312a()
            r1 = 0
            if (r0 == 0) goto L_0x001f
            java.lang.Object r5 = r0.get(r5)
            com.ss.android.ugc.aweme.shortvideo.sticker.StickerWrapper r5 = (com.p280ss.android.ugc.aweme.shortvideo.sticker.StickerWrapper) r5
            goto L_0x0020
        L_0x001f:
            r5 = r1
        L_0x0020:
            boolean r0 = m130489a(r5)
            if (r0 != 0) goto L_0x0027
            return
        L_0x0027:
            if (r5 == 0) goto L_0x0033
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r5.f104908a
            if (r0 == 0) goto L_0x0033
            java.lang.String r0 = r0.getEffectId()
            if (r0 != 0) goto L_0x0035
        L_0x0033:
            java.lang.String r0 = ""
        L_0x0035:
            r2 = 0
            java.util.Map<java.lang.String, java.lang.Boolean> r3 = r4.f106189a
            java.lang.Object r3 = r3.get(r0)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            if (r3 == 0) goto L_0x0044
            boolean r2 = r3.booleanValue()
        L_0x0044:
            if (r2 != 0) goto L_0x004d
            if (r5 == 0) goto L_0x004a
            com.ss.android.ugc.effectmanager.effect.model.Effect r1 = r5.f104908a
        L_0x004a:
            com.p280ss.android.ugc.aweme.utils.C43058dj.m136606b(r1)
        L_0x004d:
            java.util.Map<java.lang.String, java.lang.Boolean> r5 = r4.f106189a
            r1 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r5.put(r0, r1)
        L_0x0057:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.sticker.newpanel.NewPanelBusiStickerShowLogger.mo5814a(android.view.View):void");
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        C7573i.m23587b(recyclerView, "recyclerView");
        this.f106192d.mo5543b((C1278j) this);
        if (i == 0) {
            m130490c();
        }
    }

    public NewPanelBusiStickerShowLogger(C40851a aVar, RecyclerView recyclerView, NewPanelStickerAdapter newPanelStickerAdapter) {
        C7573i.m23587b(aVar, "mHost");
        C7573i.m23587b(recyclerView, "mRecyclerView");
        C7573i.m23587b(newPanelStickerAdapter, "mStickerAdapter");
        this.f106191c = aVar;
        this.f106192d = recyclerView;
        this.f106193e = newPanelStickerAdapter;
    }
}
