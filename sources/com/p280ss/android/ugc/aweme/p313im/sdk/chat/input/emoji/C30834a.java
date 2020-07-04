package com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.emoji;

import android.content.Context;
import android.support.p022v4.view.ViewPager.SimpleOnPageChangeListener;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.emoji.base.C27522f;
import com.p280ss.android.ugc.aweme.emoji.base.C27523g;
import com.p280ss.android.ugc.aweme.emoji.emojichoose.C27586e;
import com.p280ss.android.ugc.aweme.emoji.emojichoose.C27598m;
import com.p280ss.android.ugc.aweme.emoji.emojichoose.TabIndicatorAdapter;
import com.p280ss.android.ugc.aweme.emoji.emojichoose.indicator.C27594b;
import com.p280ss.android.ugc.aweme.emoji.emojichoose.model.Resources;
import com.p280ss.android.ugc.aweme.emoji.model.Emoji;
import com.p280ss.android.ugc.aweme.emoji.p1202b.C27503a;
import com.p280ss.android.ugc.aweme.emoji.p1202b.C27515h;
import com.p280ss.android.ugc.aweme.emoji.p1202b.C27516i;
import com.p280ss.android.ugc.aweme.emoji.p1206d.C27535a;
import com.p280ss.android.ugc.aweme.emoji.p1206d.C27536b;
import com.p280ss.android.ugc.aweme.emoji.p1207e.C27554a;
import com.p280ss.android.ugc.aweme.emoji.p1207e.C27563g;
import com.p280ss.android.ugc.aweme.emoji.p1207e.C27564h;
import com.p280ss.android.ugc.aweme.emoji.utils.C27633d;
import com.p280ss.android.ugc.aweme.emoji.views.SwipeControlledViewPager;
import com.p280ss.android.ugc.aweme.p313im.sdk.abtest.C30570e;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.C30758a;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.C30803b;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.C30872j;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.a */
public final class C30834a extends C30758a<C30803b, C27586e> implements C27516i, C27523g, C27535a, C27564h {

    /* renamed from: d */
    public Button f80751d;

    /* renamed from: e */
    public C27598m f80752e;

    /* renamed from: f */
    public C30803b f80753f;

    /* renamed from: h */
    private SwipeControlledViewPager f80754h;

    /* renamed from: i */
    private RecyclerView f80755i;

    /* renamed from: j */
    private RecyclerView f80756j;

    /* renamed from: k */
    private C27594b f80757k;

    /* renamed from: l */
    private EmojiPageAdapter f80758l;

    /* renamed from: m */
    private TabIndicatorAdapter f80759m;

    /* renamed from: n */
    private LinearLayoutManager f80760n;

    /* renamed from: o */
    private int f80761o;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.a$a */
    public static class C30837a {

        /* renamed from: a */
        private C30803b f80764a;

        /* renamed from: b */
        private ViewGroup f80765b;

        /* renamed from: c */
        private C27586e f80766c = new C27586e();

        /* renamed from: e */
        public final C30834a mo80724e() {
            return new C30834a(this.f80764a, this.f80766c, this.f80765b);
        }

        /* renamed from: a */
        public final C30837a mo80720a() {
            this.f80766c.f72688a = true;
            this.f80766c.f72692e.add(Integer.valueOf(1));
            return this;
        }

        /* renamed from: b */
        public final C30837a mo80721b() {
            this.f80766c.f72689b = true;
            this.f80766c.f72692e.add(Integer.valueOf(3));
            return this;
        }

        /* renamed from: c */
        public final C30837a mo80722c() {
            this.f80766c.f72690c = true;
            this.f80766c.f72692e.add(Integer.valueOf(4));
            return this;
        }

        /* renamed from: d */
        public final C30837a mo80723d() {
            this.f80766c.f72691d = true;
            this.f80766c.f72692e.add(Integer.valueOf(2));
            return this;
        }

        public C30837a(C30803b bVar, ViewGroup viewGroup) {
            this.f80764a = bVar;
            this.f80765b = viewGroup;
        }
    }

    /* renamed from: d */
    public final int mo80550d() {
        return R.layout.m3;
    }

    /* renamed from: f */
    public final C27598m mo70743f() {
        return this.f80752e;
    }

    /* renamed from: o */
    private void m100481o() {
        this.f80758l.notifyDataSetChanged();
    }

    /* renamed from: a */
    public final View mo80546a() {
        return super.mo80546a();
    }

    /* renamed from: m */
    public final void mo80718m() {
        if (((C27586e) this.f80528b).f72690c) {
            C27503a.m90145a().mo70710c();
        }
    }

    /* renamed from: p */
    private void m100482p() {
        this.f80758l.notifyDataSetChanged();
        this.f80754h.setCurrentItem(this.f80752e.mo70846b(), false);
    }

    /* renamed from: c */
    public final void mo80549c() {
        this.f80751d.setOnClickListener(new C30872j() {
            public final void onClick(View view) {
                if (view.equals(C30834a.this.f80751d)) {
                    if (C30834a.this.f80753f == null) {
                        C30834a.this.f80753f = new C30570e((C30803b) C30834a.this.f80527a, view.getContext());
                    }
                    C30834a.this.f80753f.ba_();
                }
            }
        });
        mo82725a(this.f80751d);
    }

    /* renamed from: j */
    public final void mo80715j() {
        if (!C27554a.m90296a().mo70786d()) {
            this.f80752e.mo70843a();
            m100481o();
        }
    }

    /* renamed from: e */
    public final void mo80551e() {
        if (((C27586e) this.f80528b).f72689b) {
            C27536b.m90251a().mo70767b((C27535a) this);
        }
        if (((C27586e) this.f80528b).f72690c) {
            C27503a.m90145a().mo70707b((C27516i) this);
        }
        if (((C27586e) this.f80528b).f72691d) {
            C27554a.m90296a().mo70785b(this);
        }
    }

    /* renamed from: i */
    public final void mo80714i() {
        if (this.f80752e.f72741a.mo70721i() == 2 && !this.f80752e.f72741a.mo70720h()) {
            C27563g gVar = (C27563g) this.f80752e.f72741a;
            C27554a.m90296a();
            C27554a.m90300a(gVar.f72641d, true);
        }
    }

    /* renamed from: l */
    public final void mo80717l() {
        if (this.f80752e.f72741a.mo70721i() == 3 && this.f80752e.f72741a.mo70734j() == 0) {
            this.f80755i.setVisibility(4);
            return;
        }
        this.f80757k.mo70839a(this.f80752e.mo70849c(), this.f80752e.mo70852d(), this.f80752e.f72741a.mo70721i());
        this.f80755i.setVisibility(0);
    }

    /* renamed from: g */
    public final void mo80712g() {
        C27522f fVar = this.f80752e.f72741a;
        if (fVar.mo70721i() == 4 && C27503a.m90145a().f72538a == 3 && C27633d.m90594a().mo71032c() && ((C27515h) fVar).mo70718d(this.f80752e.mo70852d())) {
            C10761a.m31383a(C6399b.m19921a(), (int) R.string.b09).mo25750a();
            C27633d.m90594a().mo71030a(false);
        }
    }

    /* renamed from: h */
    public final void mo80713h() {
        int i = this.f80752e.f72741a.mo70721i();
        if (i == 3 && C27536b.m90251a().f72589a == 1) {
            C10761a.m31399c(C6399b.m19921a(), (int) R.string.b07).mo25750a();
            return;
        }
        if (i == 4 && C27503a.m90145a().f72538a == 1 && ((C27515h) this.f80752e.f72741a).mo70718d(this.f80752e.mo70852d())) {
            C10761a.m31399c(C6399b.m19921a(), (int) R.string.b07).mo25750a();
        }
    }

    /* renamed from: b */
    public final void mo80548b() {
        Context context = this.f80529c.getContext();
        this.f80752e = new C27598m((C27586e) this.f80528b);
        this.f80751d = (Button) this.f80529c.findViewById(R.id.ae3);
        this.f80754h = (SwipeControlledViewPager) this.f80529c.findViewById(R.id.ae0);
        this.f80755i = (RecyclerView) this.f80529c.findViewById(R.id.adw);
        this.f80756j = (RecyclerView) this.f80529c.findViewById(R.id.ae6);
        this.f80758l = new EmojiPageAdapter((C30803b) this.f80527a, this.f80754h, this);
        this.f80754h.setAdapter(this.f80758l);
        this.f80760n = new LinearLayoutManager(context, 0, false);
        this.f80756j.setLayoutManager(this.f80760n);
        this.f80759m = new TabIndicatorAdapter(this);
        this.f80756j.setAdapter(this.f80759m);
        this.f80757k = new C27594b(this.f80755i);
        mo80717l();
        this.f80754h.addOnPageChangeListener(new SimpleOnPageChangeListener() {
            public final void onPageSelected(int i) {
                C30834a.this.f80752e.mo70847b(i);
                C30834a.this.mo80717l();
                C30834a.this.mo80716k();
                C30834a.this.mo80714i();
                C30834a.this.mo80713h();
                C30834a.this.mo80712g();
            }
        });
        m100481o();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004b, code lost:
        if (r4.f80760n.mo5432c(r4.f80760n.mo5445j()).getLeft() < 0) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0089, code lost:
        if (r4.f80760n.mo5432c(r4.f80760n.mo5447l()).getRight() > r4.f80756j.getWidth()) goto L_0x004d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008e  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80716k() {
        /*
            r4 = this;
            int r0 = r4.f80761o
            com.ss.android.ugc.aweme.emoji.emojichoose.m r1 = r4.f80752e
            int r1 = r1.f72743c
            if (r0 == r1) goto L_0x009d
            com.ss.android.ugc.aweme.emoji.emojichoose.TabIndicatorAdapter r0 = r4.f80759m
            r0.notifyDataSetChanged()
            r0 = 0
            com.ss.android.ugc.aweme.emoji.emojichoose.m r1 = r4.f80752e
            int r1 = r1.f72743c
            int r2 = r4.f80761o
            r3 = 1
            if (r1 >= r2) goto L_0x004f
            android.support.v7.widget.LinearLayoutManager r1 = r4.f80760n
            int r1 = r1.mo5445j()
            int r2 = r4.f80761o
            if (r1 != r2) goto L_0x0022
            r0 = 1
        L_0x0022:
            android.support.v7.widget.LinearLayoutManager r1 = r4.f80760n
            int r1 = r1.mo5445j()
            int r2 = r4.f80761o
            int r2 = r2 - r3
            if (r1 != r2) goto L_0x008c
            android.support.v7.widget.LinearLayoutManager r1 = r4.f80760n
            android.support.v7.widget.LinearLayoutManager r2 = r4.f80760n
            int r2 = r2.mo5445j()
            android.view.View r1 = r1.mo5432c(r2)
            if (r1 == 0) goto L_0x008c
            android.support.v7.widget.LinearLayoutManager r1 = r4.f80760n
            android.support.v7.widget.LinearLayoutManager r2 = r4.f80760n
            int r2 = r2.mo5445j()
            android.view.View r1 = r1.mo5432c(r2)
            int r1 = r1.getLeft()
            if (r1 >= 0) goto L_0x008c
        L_0x004d:
            r0 = 1
            goto L_0x008c
        L_0x004f:
            android.support.v7.widget.LinearLayoutManager r1 = r4.f80760n
            int r1 = r1.mo5447l()
            int r2 = r4.f80761o
            if (r1 != r2) goto L_0x005a
            r0 = 1
        L_0x005a:
            android.support.v7.widget.LinearLayoutManager r1 = r4.f80760n
            int r1 = r1.mo5447l()
            int r2 = r4.f80761o
            int r2 = r2 + r3
            if (r1 != r2) goto L_0x008c
            android.support.v7.widget.LinearLayoutManager r1 = r4.f80760n
            android.support.v7.widget.LinearLayoutManager r2 = r4.f80760n
            int r2 = r2.mo5447l()
            android.view.View r1 = r1.mo5432c(r2)
            if (r1 == 0) goto L_0x008c
            android.support.v7.widget.LinearLayoutManager r1 = r4.f80760n
            android.support.v7.widget.LinearLayoutManager r2 = r4.f80760n
            int r2 = r2.mo5447l()
            android.view.View r1 = r1.mo5432c(r2)
            int r1 = r1.getRight()
            android.support.v7.widget.RecyclerView r2 = r4.f80756j
            int r2 = r2.getWidth()
            if (r1 <= r2) goto L_0x008c
            goto L_0x004d
        L_0x008c:
            if (r0 == 0) goto L_0x0097
            android.support.v7.widget.RecyclerView r0 = r4.f80756j
            com.ss.android.ugc.aweme.emoji.emojichoose.m r1 = r4.f80752e
            int r1 = r1.f72743c
            r0.mo5541b(r1)
        L_0x0097:
            com.ss.android.ugc.aweme.emoji.emojichoose.m r0 = r4.f80752e
            int r0 = r0.f72743c
            r4.f80761o = r0
        L_0x009d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.emoji.C30834a.mo80716k():void");
    }

    /* renamed from: a */
    public final void mo70783a(LinkedHashMap<Resources, List<Emoji>> linkedHashMap) {
        mo80715j();
    }

    /* renamed from: a */
    public final void mo63139a(List<Emoji> list) {
        m100480c(list);
    }

    /* renamed from: b */
    public final void mo70708b(List<Emoji> list) {
        C27503a.m90145a();
        C27503a.m90148d().mo6876a((C1591g<TResult, TContinuationResult>) new C30838b<TResult,TContinuationResult>(this, list), C1592h.f5958b);
    }

    /* renamed from: c */
    private void m100480c(List<Emoji> list) {
        ArrayList arrayList = new ArrayList();
        if (!C6307b.m19566a((Collection<T>) list)) {
            arrayList.add(null);
        }
        arrayList.addAll(list);
        C27536b.m90251a();
        this.f80752e.mo70845a(C27536b.m90255b((List<Emoji>) arrayList));
        m100482p();
    }

    /* renamed from: a */
    public final void mo70742a(int i) {
        if (this.f80752e != null) {
            this.f80752e.mo70844a(i);
            this.f80754h.setCurrentItem(this.f80752e.mo70846b(), false);
        }
    }

    /* renamed from: a */
    public final void mo80547a(boolean z) {
        this.f80751d.setEnabled(z);
        if (z) {
            this.f80751d.setTextColor(this.f80751d.getContext().getResources().getColor(R.color.vi));
        } else {
            this.f80751d.setTextColor(this.f80751d.getContext().getResources().getColor(R.color.ty));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Void mo80711a(List list, C1592h hVar) throws Exception {
        ArrayList arrayList = new ArrayList((Collection) hVar.mo6890e());
        arrayList.addAll(list);
        C27503a.m90145a();
        this.f80752e.mo70848b(C27503a.m90146a((List<Emoji>) arrayList));
        m100482p();
        return null;
    }

    /* renamed from: a */
    public final void mo70782a(Resources resources, List<Emoji> list) {
        if (!C6307b.m19566a((Collection<T>) list)) {
            for (int i = 0; i < this.f80752e.mo70856f(); i++) {
                C27522f f = this.f80752e.mo70857f(i);
                if (f.mo70721i() == 2) {
                    C27563g gVar = (C27563g) f;
                    if (gVar.f72641d.equals(resources)) {
                        gVar.f72640c = list;
                        this.f80752e.mo70844a(this.f80752e.f72743c);
                        m100481o();
                        this.f80754h.setCurrentItem(this.f80752e.mo70846b(), false);
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo63142b(List<Emoji> list, boolean z, String str) {
        if (z) {
            m100480c(list);
        }
    }

    private C30834a(C30803b bVar, C27586e eVar, ViewGroup viewGroup) {
        super(bVar, eVar, viewGroup);
        if (((C27586e) this.f80528b).f72689b) {
            C27536b.m90251a().mo70757a((C27535a) this);
            C27536b.m90251a().mo70769c();
        }
        if (((C27586e) this.f80528b).f72690c) {
            C27503a.m90145a().mo70704a((C27516i) this);
            C27503a.m90145a().mo70710c();
        }
        if (((C27586e) this.f80528b).f72691d) {
            C27554a.m90296a().mo70781a((C27564h) this);
            C27554a.m90296a();
            if (C27554a.m90301b()) {
                C27554a.m90296a();
                C27554a.m90302c();
            }
        }
    }

    /* renamed from: a */
    public final void mo63141a(List<Emoji> list, boolean z, String str) {
        if (z) {
            m100480c(list);
        }
    }

    /* renamed from: a */
    public final void mo63140a(List<Emoji> list, Emoji emoji, boolean z, String str) {
        if (z) {
            m100480c(list);
        }
    }
}
