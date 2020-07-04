package com.bytedance.android.livesdk.gift.dialog.viewmodel;

import com.bytedance.android.livesdk.gift.model.C8151f;
import com.bytedance.android.livesdk.gift.model.C8158m;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.model.p390a.C8135b;
import com.bytedance.android.livesdk.gift.model.p390a.C8141h;
import com.bytedance.common.utility.C6311g;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.gift.dialog.viewmodel.b */
public final class C7939b {

    /* renamed from: a */
    public int f21493a;

    /* renamed from: b */
    public C8135b f21494b;

    /* renamed from: c */
    public final List<GiftPage> f21495c = new ArrayList();

    /* renamed from: d */
    public final List<C8151f> f21496d = new ArrayList();

    /* renamed from: e */
    public Map<GiftPage, List<C8135b>> f21497e;

    /* renamed from: f */
    public int f21498f = 1;

    /* renamed from: g */
    public C8151f f21499g;

    /* renamed from: h */
    public long f21500h;

    /* renamed from: i */
    public long f21501i;

    /* renamed from: j */
    public boolean f21502j;

    /* renamed from: k */
    public C8158m f21503k;

    /* renamed from: l */
    public boolean f21504l;

    /* renamed from: m */
    private final List<C8141h> f21505m = new ArrayList();

    /* renamed from: c */
    public final GiftPage mo20807c() {
        for (GiftPage giftPage : this.f21495c) {
            if (giftPage.pageType == this.f21498f) {
                return giftPage;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final int mo20809d() {
        if (this.f21499g == null || this.f21499g.f22261a <= 0) {
            return 1;
        }
        return this.f21499g.f22261a;
    }

    /* renamed from: b */
    public final List<? extends C8135b> mo20805b() {
        if (this.f21498f == 5) {
            return this.f21505m;
        }
        for (GiftPage giftPage : this.f21495c) {
            if (giftPage != null && this.f21498f == giftPage.pageType) {
                return (List) this.f21497e.get(giftPage);
            }
        }
        return null;
    }

    /* renamed from: a */
    public final boolean mo20804a() {
        if (!C6311g.m19573a(this.f21505m)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo20803a(List<GiftPage> list) {
        this.f21495c.clear();
        this.f21495c.addAll(list);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo20806b(List<C8141h> list) {
        this.f21505m.clear();
        this.f21505m.addAll(list);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo20808c(List<C8151f> list) {
        this.f21496d.clear();
        this.f21496d.addAll(list);
        m24362a(0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo20801a(C8135b bVar) {
        if (this.f21494b != null) {
            this.f21494b.f22204b = false;
        }
        this.f21494b = bVar;
        if (this.f21494b != null) {
            this.f21494b.f22204b = true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo20802a(C8151f fVar) {
        if (fVar != null) {
            if (this.f21499g != null) {
                this.f21499g.f22263c = false;
            }
            this.f21499g = fVar;
            this.f21499g.f22263c = true;
        }
    }

    /* renamed from: a */
    private void m24362a(int i) {
        if (!C6311g.m19573a(this.f21496d)) {
            if (this.f21499g != null) {
                for (C8151f fVar : this.f21496d) {
                    if (this.f21499g.equals(fVar)) {
                        this.f21499g = fVar;
                        this.f21499g.f22263c = true;
                        return;
                    }
                }
            } else if (this.f21496d.size() > 0) {
                this.f21499g = (C8151f) this.f21496d.get(0);
                this.f21499g.f22263c = true;
            }
        }
    }
}
