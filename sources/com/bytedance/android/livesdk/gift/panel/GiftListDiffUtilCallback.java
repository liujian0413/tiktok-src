package com.bytedance.android.livesdk.gift.panel;

import android.os.Bundle;
import android.support.p029v7.util.C1143a.C1145a;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.user.C3592a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.gift.C8289y;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.gift.model.p390a.C8134a;
import com.bytedance.android.livesdk.gift.model.p390a.C8135b;
import com.bytedance.android.livesdk.gift.model.p390a.C8141h;
import com.bytedance.android.livesdk.gift.model.p390a.C8143j;
import java.util.List;

public class GiftListDiffUtilCallback extends C1145a {

    /* renamed from: a */
    private final List<C8135b> f22357a;

    /* renamed from: b */
    private final List<C8135b> f22358b;

    /* renamed from: c */
    private final boolean f22359c;

    /* renamed from: a */
    public final int mo248a() {
        return this.f22357a.size();
    }

    /* renamed from: b */
    public final int mo250b() {
        return this.f22358b.size();
    }

    /* renamed from: a */
    private static boolean m25037a(ImageModel imageModel, ImageModel imageModel2) {
        if (imageModel == imageModel2) {
            return true;
        }
        if (imageModel == null || imageModel2 == null || !imageModel.getUri().equals(imageModel2.getUri())) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo251b(int i, int i2) {
        if (((C8135b) this.f22357a.get(i)).mo21275p() == ((C8135b) this.f22358b.get(i2)).mo21275p()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private boolean m25038a(C8135b bVar, C8135b bVar2) {
        if (!TextUtils.equals(bVar.mo21269j(), bVar2.mo21269j()) || !TextUtils.equals(bVar.mo21271l(), bVar2.mo21271l()) || !m25037a(bVar.mo21274o(), bVar2.mo21274o()) || !m25037a(bVar.mo21273n(), bVar2.mo21273n())) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final boolean mo252c(int i, int i2) {
        C8135b bVar = (C8135b) this.f22357a.get(i);
        C8135b bVar2 = (C8135b) this.f22358b.get(i2);
        if ((bVar instanceof C8143j) && (bVar2 instanceof C8143j)) {
            return false;
        }
        if (!(bVar instanceof C8141h) || !(bVar2 instanceof C8141h)) {
            if ((bVar instanceof C8134a) && (bVar2 instanceof C8134a) && ((C8134a) bVar).mo21260a() != ((C8134a) bVar2).mo21260a()) {
                return false;
            }
        } else if (((Prop) ((C8141h) bVar).f22206d).count != ((Prop) ((C8141h) bVar2).f22206d).count) {
            return false;
        }
        return m25038a(bVar, bVar2);
    }

    /* renamed from: a */
    public final Object mo249a(int i, int i2) {
        long j;
        C8135b bVar = (C8135b) this.f22357a.get(i);
        C8135b bVar2 = (C8135b) this.f22358b.get(i2);
        if (!m25038a(bVar, bVar2)) {
            return super.mo249a(i, i2);
        }
        if ((bVar instanceof C8143j) && (bVar2 instanceof C8143j)) {
            Bundle bundle = new Bundle();
            if (((C3592a) C3596c.m13172a(C3592a.class)).user().mo22182c()) {
                j = C8289y.m25347a().mo21445b();
            } else {
                j = 0;
            }
            bundle.putString("key_task_gift_count", String.valueOf(j));
            return bundle;
        } else if (!(bVar instanceof C8141h) || !(bVar2 instanceof C8141h)) {
            return super.mo249a(i, i2);
        } else {
            C8141h hVar = (C8141h) bVar;
            C8141h hVar2 = (C8141h) bVar2;
            Bundle bundle2 = new Bundle();
            if (((Prop) hVar.f22206d).count != ((Prop) hVar2.f22206d).count) {
                bundle2.putString("key_prop_count", String.valueOf(((Prop) hVar2.f22206d).count));
                bundle2.putBoolean("key_prop_show_item_combo", this.f22359c);
            }
            return bundle2;
        }
    }

    public GiftListDiffUtilCallback(List<C8135b> list, List<C8135b> list2, boolean z) {
        this.f22357a = list;
        this.f22358b = list2;
        this.f22359c = z;
    }
}
