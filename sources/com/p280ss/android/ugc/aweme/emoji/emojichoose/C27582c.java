package com.p280ss.android.ugc.aweme.emoji.emojichoose;

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
import com.p280ss.android.ugc.aweme.emoji.base.C27517a;
import com.p280ss.android.ugc.aweme.emoji.base.C27519c;
import com.p280ss.android.ugc.aweme.emoji.base.C27522f;
import com.p280ss.android.ugc.aweme.emoji.base.C27523g;
import com.p280ss.android.ugc.aweme.emoji.base.C27524h;
import com.p280ss.android.ugc.aweme.emoji.emojichoose.indicator.C27594b;
import com.p280ss.android.ugc.aweme.emoji.model.Emoji;
import com.p280ss.android.ugc.aweme.emoji.p1202b.C27503a;
import com.p280ss.android.ugc.aweme.emoji.p1202b.C27515h;
import com.p280ss.android.ugc.aweme.emoji.p1202b.C27516i;
import com.p280ss.android.ugc.aweme.emoji.p1206d.C27535a;
import com.p280ss.android.ugc.aweme.emoji.p1206d.C27536b;
import com.p280ss.android.ugc.aweme.emoji.utils.C27633d;
import com.p280ss.android.ugc.aweme.emoji.utils.C27634e;
import com.p280ss.android.ugc.aweme.emoji.views.SwipeControlledViewPager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.c */
public final class C27582c extends C27519c<C27524h, C27586e> implements C27516i, C27523g, C27535a {

    /* renamed from: d */
    public C27598m f72672d;

    /* renamed from: g */
    private SwipeControlledViewPager f72673g;

    /* renamed from: h */
    private RecyclerView f72674h;

    /* renamed from: i */
    private Button f72675i;

    /* renamed from: j */
    private RecyclerView f72676j;

    /* renamed from: k */
    private C27594b f72677k;

    /* renamed from: l */
    private EmojiPageAdapter f72678l;

    /* renamed from: m */
    private TabIndicatorAdapter f72679m;

    /* renamed from: n */
    private LinearLayoutManager f72680n;

    /* renamed from: o */
    private int f72681o;

    /* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.c$a */
    public static class C27584a {

        /* renamed from: a */
        private C27524h f72683a;

        /* renamed from: b */
        private ViewGroup f72684b;

        /* renamed from: c */
        private C27586e f72685c = new C27586e();

        /* renamed from: d */
        public final C27582c mo70825d() {
            return new C27582c(this.f72683a, this.f72685c, this.f72684b);
        }

        /* renamed from: a */
        public final C27584a mo70822a() {
            this.f72685c.f72688a = true;
            this.f72685c.f72692e.add(Integer.valueOf(1));
            return this;
        }

        /* renamed from: b */
        public final C27584a mo70823b() {
            this.f72685c.f72689b = true;
            this.f72685c.f72692e.add(Integer.valueOf(3));
            return this;
        }

        /* renamed from: c */
        public final C27584a mo70824c() {
            this.f72685c.f72690c = true;
            this.f72685c.f72692e.add(Integer.valueOf(4));
            return this;
        }

        public C27584a(C27524h hVar, ViewGroup viewGroup) {
            this.f72683a = hVar;
            this.f72684b = viewGroup;
        }
    }

    /* renamed from: d */
    public final int mo70738d() {
        return R.layout.m3;
    }

    /* renamed from: f */
    public final C27598m mo70743f() {
        return this.f72672d;
    }

    /* renamed from: c */
    public final void mo70737c() {
        mo71039a(this.f72675i);
    }

    /* renamed from: l */
    private void m90380l() {
        this.f72678l.notifyDataSetChanged();
        this.f72673g.setCurrentItem(this.f72672d.mo70846b(), false);
    }

    /* renamed from: e */
    public final void mo70739e() {
        super.mo70739e();
        if (((C27586e) this.f72562b).f72690c) {
            C27503a.m90145a().mo70707b((C27516i) this);
        }
        if (((C27586e) this.f72562b).f72689b) {
            C27536b.m90251a().mo70767b((C27535a) this);
        }
    }

    /* renamed from: k */
    public final void mo70821k() {
        if (this.f72672d.f72741a.mo70721i() == 3 && this.f72672d.f72741a.mo70734j() == 0) {
            this.f72674h.setVisibility(4);
            return;
        }
        this.f72677k.mo70839a(this.f72672d.mo70849c(), this.f72672d.mo70852d(), this.f72672d.f72741a.mo70721i());
        this.f72674h.setVisibility(0);
    }

    /* renamed from: g */
    public final void mo70817g() {
        int i;
        int currentItem = this.f72673g.getCurrentItem();
        int a = C27634e.m90603a(this.f72672d, currentItem);
        if (a == 4) {
            List<C27517a> d = this.f72672d.mo70853d(currentItem);
            if (d != null && !d.isEmpty()) {
                C27515h hVar = (C27515h) this.f72672d.f72741a;
                for (C27517a aVar : d) {
                    if (aVar != null) {
                        Emoji emoji = aVar.f72559d;
                        if (!(emoji == null || (emoji.getStaticUrl() == null && emoji.getAnimateUrl() == null))) {
                            List<Emoji> list = hVar.f72555b;
                            if (list == null) {
                                i = -1;
                            } else {
                                i = list.indexOf(emoji);
                            }
                            ((C27524h) this.f72561a).mo63242a(aVar, a, i);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: h */
    public final void mo70818h() {
        C27522f fVar = this.f72672d.f72741a;
        if (fVar.mo70721i() == 4 && C27503a.m90145a().f72538a == 3 && C27633d.m90594a().mo71032c() && ((C27515h) fVar).mo70718d(this.f72672d.mo70852d())) {
            C10761a.m31383a(C6399b.m19921a(), (int) R.string.b09).mo25750a();
            C27633d.m90594a().mo71030a(false);
        }
    }

    /* renamed from: i */
    public final void mo70819i() {
        int i = this.f72672d.f72741a.mo70721i();
        if (i == 3 && C27536b.m90251a().f72589a == 1) {
            C10761a.m31399c(C6399b.m19921a(), (int) R.string.b07).mo25750a();
            return;
        }
        if (i == 4 && C27503a.m90145a().f72538a == 1 && ((C27515h) this.f72672d.f72741a).mo70718d(this.f72672d.mo70852d())) {
            C10761a.m31399c(C6399b.m19921a(), (int) R.string.b07).mo25750a();
        }
    }

    /* renamed from: b */
    public final void mo70736b() {
        int i;
        this.f72672d = new C27598m((C27586e) this.f72562b);
        this.f72673g = (SwipeControlledViewPager) this.f72563c.findViewById(R.id.ae0);
        this.f72676j = (RecyclerView) this.f72563c.findViewById(R.id.ae6);
        this.f72674h = (RecyclerView) this.f72563c.findViewById(R.id.adw);
        this.f72675i = (Button) this.f72563c.findViewById(R.id.ae3);
        this.f72678l = new EmojiPageAdapter((C27524h) this.f72561a, this, this.f72673g);
        this.f72673g.setAdapter(this.f72678l);
        int i2 = 0;
        this.f72680n = new LinearLayoutManager(this.f72676j.getContext(), 0, false);
        this.f72676j.setLayoutManager(this.f72680n);
        this.f72679m = new TabIndicatorAdapter(this);
        this.f72676j.setAdapter(this.f72679m);
        View findViewById = this.f72563c.findViewById(R.id.ecn);
        View findViewById2 = this.f72563c.findViewById(R.id.bhd);
        boolean z = true;
        if (((C27586e) this.f72562b).f72692e.size() <= 1) {
            z = false;
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        findViewById.setVisibility(i);
        if (!z) {
            i2 = 8;
        }
        findViewById2.setVisibility(i2);
        this.f72677k = new C27594b(this.f72674h);
        mo70821k();
        this.f72673g.addOnPageChangeListener(new SimpleOnPageChangeListener() {
            public final void onPageSelected(int i) {
                C27582c.this.f72672d.mo70847b(i);
                C27582c.this.mo70821k();
                C27582c.this.mo70820j();
                C27582c.this.mo70819i();
                C27582c.this.mo70818h();
                C27582c.this.mo70817g();
            }
        });
        this.f72678l.notifyDataSetChanged();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004b, code lost:
        if (r4.f72680n.mo5432c(r4.f72680n.mo5445j()).getLeft() < 0) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0089, code lost:
        if (r4.f72680n.mo5432c(r4.f72680n.mo5447l()).getRight() > r4.f72676j.getWidth()) goto L_0x004d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008e  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo70820j() {
        /*
            r4 = this;
            int r0 = r4.f72681o
            com.ss.android.ugc.aweme.emoji.emojichoose.m r1 = r4.f72672d
            int r1 = r1.f72743c
            if (r0 == r1) goto L_0x009d
            com.ss.android.ugc.aweme.emoji.emojichoose.TabIndicatorAdapter r0 = r4.f72679m
            r0.notifyDataSetChanged()
            r0 = 0
            com.ss.android.ugc.aweme.emoji.emojichoose.m r1 = r4.f72672d
            int r1 = r1.f72743c
            int r2 = r4.f72681o
            r3 = 1
            if (r1 >= r2) goto L_0x004f
            android.support.v7.widget.LinearLayoutManager r1 = r4.f72680n
            int r1 = r1.mo5445j()
            int r2 = r4.f72681o
            if (r1 != r2) goto L_0x0022
            r0 = 1
        L_0x0022:
            android.support.v7.widget.LinearLayoutManager r1 = r4.f72680n
            int r1 = r1.mo5445j()
            int r2 = r4.f72681o
            int r2 = r2 - r3
            if (r1 != r2) goto L_0x008c
            android.support.v7.widget.LinearLayoutManager r1 = r4.f72680n
            android.support.v7.widget.LinearLayoutManager r2 = r4.f72680n
            int r2 = r2.mo5445j()
            android.view.View r1 = r1.mo5432c(r2)
            if (r1 == 0) goto L_0x008c
            android.support.v7.widget.LinearLayoutManager r1 = r4.f72680n
            android.support.v7.widget.LinearLayoutManager r2 = r4.f72680n
            int r2 = r2.mo5445j()
            android.view.View r1 = r1.mo5432c(r2)
            int r1 = r1.getLeft()
            if (r1 >= 0) goto L_0x008c
        L_0x004d:
            r0 = 1
            goto L_0x008c
        L_0x004f:
            android.support.v7.widget.LinearLayoutManager r1 = r4.f72680n
            int r1 = r1.mo5447l()
            int r2 = r4.f72681o
            if (r1 != r2) goto L_0x005a
            r0 = 1
        L_0x005a:
            android.support.v7.widget.LinearLayoutManager r1 = r4.f72680n
            int r1 = r1.mo5447l()
            int r2 = r4.f72681o
            int r2 = r2 + r3
            if (r1 != r2) goto L_0x008c
            android.support.v7.widget.LinearLayoutManager r1 = r4.f72680n
            android.support.v7.widget.LinearLayoutManager r2 = r4.f72680n
            int r2 = r2.mo5447l()
            android.view.View r1 = r1.mo5432c(r2)
            if (r1 == 0) goto L_0x008c
            android.support.v7.widget.LinearLayoutManager r1 = r4.f72680n
            android.support.v7.widget.LinearLayoutManager r2 = r4.f72680n
            int r2 = r2.mo5447l()
            android.view.View r1 = r1.mo5432c(r2)
            int r1 = r1.getRight()
            android.support.v7.widget.RecyclerView r2 = r4.f72676j
            int r2 = r2.getWidth()
            if (r1 <= r2) goto L_0x008c
            goto L_0x004d
        L_0x008c:
            if (r0 == 0) goto L_0x0097
            android.support.v7.widget.RecyclerView r0 = r4.f72676j
            com.ss.android.ugc.aweme.emoji.emojichoose.m r1 = r4.f72672d
            int r1 = r1.f72743c
            r0.mo5541b(r1)
        L_0x0097:
            com.ss.android.ugc.aweme.emoji.emojichoose.m r0 = r4.f72672d
            int r0 = r0.f72743c
            r4.f72681o = r0
        L_0x009d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.emoji.emojichoose.C27582c.mo70820j():void");
    }

    /* renamed from: a */
    public final void mo63139a(List<Emoji> list) {
        m90379c(list);
    }

    /* renamed from: a */
    public final void mo70742a(int i) {
        if (this.f72672d != null) {
            this.f72672d.mo70844a(i);
            this.f72673g.setCurrentItem(this.f72672d.mo70846b(), false);
        }
    }

    /* renamed from: b */
    public final void mo70708b(List<Emoji> list) {
        C27503a.m90145a();
        C27503a.m90148d().mo6876a((C1591g<TResult, TContinuationResult>) new C27585d<TResult,TContinuationResult>(this, list), C1592h.f5958b);
        this.f72672d.mo70851c(list);
    }

    /* renamed from: c */
    private void m90379c(List<Emoji> list) {
        ArrayList arrayList = new ArrayList();
        if (!C6307b.m19566a((Collection<T>) list) && C30199h.m98861a().getEnableCommentCreateSticker().booleanValue()) {
            arrayList.add(null);
        }
        arrayList.addAll(list);
        C27536b.m90251a();
        this.f72672d.mo70845a(C27536b.m90255b((List<Emoji>) arrayList));
        m90380l();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Void mo70816a(List list, C1592h hVar) throws Exception {
        ArrayList arrayList = new ArrayList((Collection) hVar.mo6890e());
        arrayList.add(null);
        arrayList.addAll(list);
        C27503a.m90145a();
        this.f72672d.mo70848b(C27503a.m90146a((List<Emoji>) arrayList));
        m90380l();
        return null;
    }

    /* renamed from: b */
    public final void mo63142b(List<Emoji> list, boolean z, String str) {
        if (z) {
            m90379c(list);
        }
    }

    /* renamed from: a */
    public final void mo63141a(List<Emoji> list, boolean z, String str) {
        if (z) {
            m90379c(list);
        }
    }

    private C27582c(C27524h hVar, C27586e eVar, ViewGroup viewGroup) {
        super(hVar, eVar, viewGroup);
        if (((C27586e) this.f72562b).f72689b) {
            C27536b.m90251a().mo70757a((C27535a) this);
            C27536b.m90251a().mo70769c();
        }
        if (((C27586e) this.f72562b).f72690c) {
            C27503a.m90145a().mo70704a((C27516i) this);
            C27503a.m90145a().mo70710c();
        }
    }

    /* renamed from: a */
    public final void mo63140a(List<Emoji> list, Emoji emoji, boolean z, String str) {
        if (z) {
            m90379c(list);
        }
    }
}
