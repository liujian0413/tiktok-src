package com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.app.Activity;
import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.util.C0902i;
import android.text.TextUtils;
import android.view.View;
import bolts.C1592h;
import com.bytedance.common.utility.C6311g;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.base.p1059d.p1060a.C23319b;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.infosticker.InfoStickerModel;
import com.p280ss.android.ugc.aweme.infosticker.StickerItemModel;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.scene.C37299a;
import com.p280ss.android.ugc.aweme.shortvideo.C38527bf;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView.C39541b;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.StickerHintTextViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.subtitle.C41108b;
import com.p280ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule;
import com.p280ss.android.ugc.aweme.shortvideo.subtitle.UtteranceWithWords;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.story.shootvideo.p1658c.C42015a;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.vesdk.VEException;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import kotlin.C7581n;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.c */
public final class C39586c {

    /* renamed from: a */
    public List<C39558aj> f102807a = new ArrayList();

    /* renamed from: b */
    public C39558aj f102808b;

    /* renamed from: c */
    public int f102809c;

    /* renamed from: d */
    public C39544a f102810d;

    /* renamed from: e */
    public C42015a f102811e;

    /* renamed from: f */
    public C41108b f102812f;

    /* renamed from: g */
    public float[] f102813g;

    /* renamed from: h */
    public C23319b<C39558aj> f102814h;

    /* renamed from: i */
    private final float f102815i = 0.5f;

    /* renamed from: j */
    private final float f102816j = 0.5f;

    /* renamed from: k */
    private final float f102817k = 0.5f;

    /* renamed from: l */
    private final float f102818l = 0.75f;

    /* renamed from: m */
    private InfoStickerEditView f102819m;

    /* renamed from: n */
    private C15389d f102820n;

    /* renamed from: o */
    private StickerHintTextViewModel f102821o;

    /* renamed from: a */
    public final C39558aj mo98578a(String str, String str2, String str3, int i, boolean z, boolean z2) {
        String str4 = str2;
        String str5 = str3;
        boolean z3 = z2;
        if (this.f102808b != null && this.f102808b.f102709d) {
            this.f102808b.f102709d = false;
        }
        int a = this.f102820n.mo38788a(str4, TextUtils.isEmpty(str3) ? null : new String[]{str5});
        StringBuilder sb = new StringBuilder("addInfoSticker1 id = ");
        sb.append(a);
        C41530am.m132285d(sb.toString());
        if (a < 0) {
            boolean b = C7276d.m22812b(str2);
            long length = b ? new File(str4).length() : 0;
            StringBuilder sb2 = new StringBuilder("add infoSticker failed: ");
            sb2.append(a);
            C6921a.m21555a(sb2.toString());
            StringBuilder sb3 = new StringBuilder("addFailed: ");
            sb3.append(a);
            StringBuilder sb4 = new StringBuilder("path: ");
            sb4.append(str4);
            sb4.append(" file exist ");
            sb4.append(b);
            sb4.append(" size: ");
            sb4.append(length);
            sb4.append(" extra: ");
            sb4.append(str5);
            C6893q.m21447a("info_sticker", C6869c.m21381a().mo16887a("event", sb3.toString()).mo16887a("user_info", sb4.toString()).mo16888b());
            return null;
        }
        StickerItemModel a2 = m126520a(a, str, str2, str3, i, z ? C39559ak.m126370d() : C39559ak.m126369c());
        if (a2 == null) {
            return null;
        }
        C39558aj ajVar = new C39558aj(this.f102819m.getContext(), a2, this);
        ajVar.mo98490a(this.f102819m.f102638c, this.f102819m.f102639d, this.f102819m.f102636a, this.f102819m.f102637b, 0.5f, 0.5f);
        this.f102820n.mo38749a(a2.f83875id, a2.currentOffsetX, a2.currentOffsetY);
        this.f102820n.mo38838e(a2.f83875id, ajVar.f102708c.layerWeight);
        this.f102808b = ajVar;
        this.f102808b.f102709d = false;
        this.f102807a.add(ajVar);
        if (this.f102810d != null) {
            this.f102810d.mo98466a(a2);
        }
        if (z3 || (C35563c.f93231M.mo93305a(Property.EnableStickerFunctionalities) && this.f102821o != null)) {
            this.f102819m.postDelayed(new C39587d(this, z3, ajVar, a), 500);
        }
        return ajVar;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0075 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo98592a(boolean r12, com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.C39558aj r13, int r14) {
        /*
            r11 = this;
            r0 = 3
            r1 = 1073741824(0x40000000, float:2.0)
            r2 = 0
            r3 = 0
            r4 = 1
            if (r12 == 0) goto L_0x005f
            r5 = 2
            float[] r5 = new float[r5]
            com.ss.android.ugc.asve.b.d r6 = r11.f102820n
            com.ss.android.ugc.aweme.infosticker.StickerItemModel r7 = r13.f102708c
            int r7 = r7.f83875id
            r6.mo38770a(r7, r5)
            com.ss.android.ugc.asve.b.d r6 = r11.f102820n     // Catch:{ VEException -> 0x0034 }
            float[] r14 = r6.mo38849g(r14)     // Catch:{ VEException -> 0x0034 }
            r6 = r5[r3]     // Catch:{ VEException -> 0x0034 }
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView r7 = r11.f102819m     // Catch:{ VEException -> 0x0034 }
            int r7 = r7.f102638c     // Catch:{ VEException -> 0x0034 }
            float r7 = (float) r7
            float r6 = r6 * r7
            r5 = r5[r4]     // Catch:{ VEException -> 0x0035 }
            r7 = r14[r4]     // Catch:{ VEException -> 0x0035 }
            r14 = r14[r0]     // Catch:{ VEException -> 0x0035 }
            float r7 = r7 - r14
            float r7 = r7 / r1
            float r5 = r5 - r7
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView r14 = r11.f102819m     // Catch:{ VEException -> 0x0035 }
            int r14 = r14.f102639d     // Catch:{ VEException -> 0x0035 }
            float r14 = (float) r14
            float r2 = r5 * r14
            goto L_0x0070
        L_0x0034:
            r6 = 0
        L_0x0035:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r1 = "getInfoStickerBoundingBox error in infoStickerHint, index is "
            r14.<init>(r1)
            com.ss.android.ugc.aweme.infosticker.StickerItemModel r1 = r13.f102708c
            int r1 = r1.f83875id
            r14.append(r1)
            java.lang.String r1 = " veState is "
            r14.append(r1)
            com.ss.android.ugc.asve.b.d r1 = r11.f102820n
            com.ss.android.vesdk.VEEditor$VEState r1 = r1.mo38850h()
            int r1 = r1.getValue()
            r14.append(r1)
            java.lang.String r14 = r14.toString()
            com.p280ss.android.ugc.aweme.shortvideo.util.C41530am.m132283b(r14)
            r4 = 0
            r7 = 0
            goto L_0x0071
        L_0x005f:
            android.graphics.RectF r14 = r13.f102711f
            float r14 = r14.left
            android.graphics.RectF r2 = r13.f102711f
            float r2 = r2.width()
            float r2 = r2 / r1
            float r6 = r14 + r2
            android.graphics.RectF r14 = r13.f102711f
            float r2 = r14.top
        L_0x0070:
            r7 = r2
        L_0x0071:
            boolean r13 = r13.f102719o
            if (r13 != 0) goto L_0x009b
            if (r4 == 0) goto L_0x009b
            com.ss.android.ugc.aweme.shortvideo.sticker.StickerHintTextViewModel r13 = r11.f102821o
            android.arch.lifecycle.o r13 = r13.mo100248b()
            com.ss.android.ugc.aweme.shortvideo.sticker.ai r14 = new com.ss.android.ugc.aweme.shortvideo.sticker.ai
            if (r12 == 0) goto L_0x0088
            r1 = 2131822312(0x7f1106e8, float:1.9277392E38)
            r8 = 2131822312(0x7f1106e8, float:1.9277392E38)
            goto L_0x008e
        L_0x0088:
            r1 = 2131822319(0x7f1106ef, float:1.9277406E38)
            r8 = 2131822319(0x7f1106ef, float:1.9277406E38)
        L_0x008e:
            if (r12 == 0) goto L_0x0092
            r9 = 3
            goto L_0x0093
        L_0x0092:
            r9 = 0
        L_0x0093:
            r5 = r14
            r10 = r12
            r5.<init>(r6, r7, r8, r9, r10)
            r13.postValue(r14)
        L_0x009b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.C39586c.mo98592a(boolean, com.ss.android.ugc.aweme.shortvideo.edit.infosticker.aj, int):void");
    }

    /* renamed from: a */
    public final C39558aj mo98579a(String str, String str2, String str3, String str4, int i, String str5) {
        C39558aj a = mo98578a(str, str2, str4, 3, true, true);
        if (a != null) {
            this.f102820n.mo38758a(a.f102708c.f83875id, i, str5);
            if (!TextUtils.isEmpty(str3)) {
                this.f102820n.mo38815b(a.f102708c.f83875id, str3);
            }
        }
        return a;
    }

    /* renamed from: a */
    public final void mo98581a(int i) {
        this.f102820n.mo38838e(i, C39559ak.m126370d());
    }

    /* renamed from: a */
    public final void mo98590a(List<UtteranceWithWords> list) {
        float f;
        float f2;
        if (SubtitleModule.m131124ab().size() == 1) {
            ConcurrentHashMap ab = SubtitleModule.m131124ab();
            Iterator it = ab.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                StickerItemModel stickerItemModel = (StickerItemModel) ab.get(Integer.valueOf(((Integer) it.next()).intValue()));
                if (stickerItemModel != null && stickerItemModel.isSubtitleRule()) {
                    f2 = stickerItemModel.scale;
                    f = stickerItemModel.currentOffsetY;
                    break;
                }
            }
        }
        f2 = 1.0f;
        f = 0.75f;
        int i = 0;
        while (i < list.size()) {
            int y = this.f102820n.mo38882y();
            this.f102820n.mo38813b(y, ((UtteranceWithWords) list.get(i)).getStartTime(), ((UtteranceWithWords) list.get(i)).getEndTime());
            int i2 = y;
            StickerItemModel a = m126519a(i2, ((UtteranceWithWords) list.get(i)).getStartTime(), ((UtteranceWithWords) list.get(i)).getEndTime(), ((UtteranceWithWords) list.get(i)).getInitWidth(), ((UtteranceWithWords) list.get(i)).getInitHeight(), "subtitle", ((UtteranceWithWords) list.get(i)).getText(), f2, f);
            if (a != null) {
                m126521a(y, a);
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final void mo98583a(InfoStickerModel infoStickerModel) {
        if (infoStickerModel != null && !C6311g.m19573a(infoStickerModel.stickers)) {
            ArrayList<StickerItemModel> arrayList = null;
            for (StickerItemModel stickerItemModel : infoStickerModel.stickers) {
                C39559ak.m126367a(stickerItemModel.layerWeight);
                if (stickerItemModel.isInfoSticker()) {
                    if (!m126523a(infoStickerModel.infoStickerDraftDir, stickerItemModel)) {
                        if (arrayList == null) {
                            arrayList = new ArrayList<>();
                        }
                        arrayList.add(stickerItemModel);
                    } else {
                        C39558aj ajVar = new C39558aj(this.f102819m.getContext(), stickerItemModel, this);
                        if (stickerItemModel.isSubtitle() || stickerItemModel.isSubtitleRule()) {
                            ajVar.f102719o = true;
                            ajVar.mo98490a(this.f102819m.f102638c, this.f102819m.f102639d, this.f102819m.f102636a, this.f102819m.f102637b, 0.5f, 0.75f);
                            ajVar.mo98492b(stickerItemModel.scale);
                            ajVar.mo98486a((stickerItemModel.currentOffsetX - 0.5f) * ((float) this.f102819m.f102638c), (stickerItemModel.currentOffsetY - 0.75f) * ((float) this.f102819m.f102639d));
                            this.f102807a.add(ajVar);
                        } else {
                            ajVar.mo98490a(this.f102819m.f102638c, this.f102819m.f102639d, this.f102819m.f102636a, this.f102819m.f102637b, 0.5f, 0.5f);
                            ajVar.mo98492b(stickerItemModel.scale);
                            ajVar.mo98486a((stickerItemModel.currentOffsetX - 0.5f) * ((float) this.f102819m.f102638c), (stickerItemModel.currentOffsetY - 0.5f) * ((float) this.f102819m.f102639d));
                            this.f102807a.add(ajVar);
                        }
                        if (stickerItemModel.isLyric()) {
                            this.f102820n.mo38758a(stickerItemModel.f83875id, 0, stickerItemModel.mLyricInfo);
                            if (!TextUtils.isEmpty(stickerItemModel.mLyricFontPath)) {
                                this.f102820n.mo38815b(stickerItemModel.f83875id, stickerItemModel.mLyricFontPath);
                            }
                            this.f102820n.mo38846g(stickerItemModel.f83875id, stickerItemModel.mLyricColor);
                            this.f102819m.setLyricItem(ajVar);
                            this.f102819m.setDefaultColor(stickerItemModel.mLyricColor);
                        }
                    }
                }
            }
            if (C6311g.m19574b(arrayList)) {
                StringBuilder sb = new StringBuilder("restore info stickers error: ");
                sb.append(arrayList.size());
                C41530am.m132283b(sb.toString());
                for (StickerItemModel stickerItemModel2 : arrayList) {
                    StringBuilder sb2 = new StringBuilder("remove error sticker ");
                    sb2.append(stickerItemModel2.f83875id);
                    C41530am.m132283b(sb2.toString());
                    infoStickerModel.removeSticker(stickerItemModel2);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo98580a() {
        if (C35563c.f93231M.mo93305a(Property.EnableStickerFunctionalities) && this.f102821o != null) {
            this.f102821o.mo100247a().postValue(Boolean.valueOf(true));
        }
    }

    /* renamed from: a */
    public final void mo98584a(C39558aj ajVar) {
        ajVar.f102709d = false;
        mo98600c();
        C39559ak.m126368b().setValue(Integer.valueOf(0));
    }

    /* renamed from: a */
    public final void mo98587a(C39558aj ajVar, float f, float f2, C39541b bVar) {
        C0902i a = ajVar.mo98484a(f, f2, bVar);
        mo98597b(ajVar, ((Float) a.f3154a).floatValue());
        mo98585a(ajVar, ((Float) a.f3155b).floatValue());
    }

    /* renamed from: a */
    public final void mo98585a(C39558aj ajVar, float f) {
        if (!ajVar.f102719o && f != 0.0f) {
            ajVar.f102708c.rotateAngle += f;
            this.f102820n.mo38748a(ajVar.f102708c.f83875id, -ajVar.f102708c.rotateAngle);
            ajVar.mo98485a(f);
        }
    }

    /* renamed from: a */
    public final void mo98586a(C39558aj ajVar, float f, float f2) {
        if (ajVar.f102719o) {
            if (!ajVar.f102708c.isSubtitleRule()) {
                for (C39558aj ajVar2 : this.f102807a) {
                    if (ajVar2.f102719o) {
                        ajVar2.f102708c.currentOffsetY += f2 / ((float) this.f102819m.f102639d);
                        this.f102820n.mo38749a(ajVar2.f102708c.f83875id, ajVar2.f102708c.currentOffsetX, ajVar2.f102708c.currentOffsetY);
                        ajVar2.mo98486a(0.0f, f2);
                    }
                }
            }
        } else if (ajVar.f102708c.isLyric()) {
            float f3 = f / ((float) this.f102819m.f102638c);
            float f4 = f2 / ((float) this.f102819m.f102639d);
            float[] fArr = new float[2];
            this.f102820n.mo38816b(ajVar.f102708c.f83875id, fArr);
            ajVar.f102708c.currentOffsetX = fArr[0];
            ajVar.f102708c.currentOffsetY = fArr[1];
            this.f102820n.mo38811b(ajVar.f102708c.f83875id, ajVar.f102708c.currentOffsetX, ajVar.f102708c.currentOffsetY);
            float[] fArr2 = this.f102813g;
            fArr2[0] = fArr2[0] + f3;
            float[] fArr3 = this.f102813g;
            fArr3[1] = fArr3[1] + f4;
            this.f102820n.mo38749a(ajVar.f102708c.f83875id, this.f102813g[0], this.f102813g[1]);
            ajVar.mo98486a(f, f2);
        } else {
            ajVar.f102708c.currentOffsetX += f / ((float) this.f102819m.f102638c);
            ajVar.f102708c.currentOffsetY += f2 / ((float) this.f102819m.f102639d);
            this.f102820n.mo38749a(ajVar.f102708c.f83875id, ajVar.f102708c.currentOffsetX, ajVar.f102708c.currentOffsetY);
            ajVar.mo98486a(f, f2);
        }
    }

    /* renamed from: a */
    public final void mo98589a(C39558aj ajVar, boolean z) {
        ajVar.f102709d = ajVar.mo98489a();
        this.f102808b = ajVar;
    }

    /* renamed from: a */
    public final void mo98588a(C39558aj ajVar, int i, int i2) {
        if (ajVar != null) {
            m126525b(ajVar, i, i2);
        }
    }

    /* renamed from: a */
    public final boolean mo98594a(C39558aj ajVar, int i) {
        return ajVar.f102719o ? i >= ajVar.f102708c.startTime && i <= ajVar.f102708c.endTime : (i >= ajVar.f102708c.startTime && i <= ajVar.f102708c.endTime) || ajVar.equals(this.f102808b);
    }

    /* renamed from: a */
    public final void mo98593a(boolean z, boolean z2) {
        if (!C6311g.m19573a(this.f102807a)) {
            Iterator it = this.f102807a.iterator();
            while (it.hasNext()) {
                C39558aj ajVar = (C39558aj) it.next();
                if (z || !ajVar.f102708c.isLyric()) {
                    this.f102820n.mo38843f(ajVar.f102708c.f83875id);
                    it.remove();
                    if (this.f102810d != null && z2) {
                        this.f102810d.mo98467b(ajVar.f102708c);
                    }
                }
            }
            this.f102808b = null;
        }
    }

    /* renamed from: a */
    public final void mo98591a(boolean z) {
        if (!C6311g.m19573a(this.f102807a)) {
            Iterator it = this.f102807a.iterator();
            while (it.hasNext()) {
                C39558aj ajVar = (C39558aj) it.next();
                if ((z && ajVar.f102719o) || (!z && ajVar.f102708c.isSubtitle())) {
                    this.f102820n.mo38843f(ajVar.f102708c.f83875id);
                    SubtitleModule.m131124ab().remove(Integer.valueOf(ajVar.f102708c.f83875id));
                    it.remove();
                    if (this.f102810d != null) {
                        this.f102810d.mo98467b(ajVar.f102708c);
                    }
                }
            }
            this.f102808b = null;
        }
    }

    /* renamed from: d */
    public final void mo98603d() {
        for (C39558aj ajVar : this.f102807a) {
            this.f102820n.mo38825c(ajVar.f102708c.f83875id, 0.3137255f);
        }
    }

    /* renamed from: f */
    public final void mo98608f() {
        for (C39558aj ajVar : this.f102807a) {
            this.f102820n.mo38825c(ajVar.f102708c.f83875id, 1.0f);
        }
    }

    /* renamed from: c */
    public final void mo98600c() {
        if (this.f102808b != null) {
            if (!this.f102808b.f102719o) {
                this.f102820n.mo38813b(this.f102808b.f102708c.f83875id, this.f102808b.mo98491b(), this.f102808b.mo98494c());
                this.f102808b.f102709d = false;
            }
            this.f102808b = null;
        }
    }

    /* renamed from: e */
    public final void mo98606e() {
        for (C39558aj ajVar : this.f102807a) {
            if (!ajVar.f102719o) {
                this.f102820n.mo38825c(ajVar.f102708c.f83875id, 0.3137255f);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo98598b() {
        boolean z;
        if (this.f102808b != null) {
            z = true;
        } else {
            z = false;
        }
        mo98600c();
        return z;
    }

    /* renamed from: b */
    public static void m126524b(C39558aj ajVar) {
        ajVar.f102709d = false;
    }

    /* renamed from: b */
    public final void mo98596b(int i) {
        this.f102820n.mo38838e(i, C39559ak.m126371e());
    }

    /* renamed from: f */
    public final void mo98609f(C39558aj ajVar) {
        if (ajVar != null && !ajVar.f102708c.isSubtitleRule()) {
            m126526k(ajVar);
        }
    }

    /* renamed from: h */
    public final void mo98611h(C39558aj ajVar) {
        this.f102820n.mo38825c(ajVar.f102708c.f83875id, 0.3137255f);
    }

    /* renamed from: i */
    public final void mo98612i(C39558aj ajVar) {
        this.f102820n.mo38825c(ajVar.f102708c.f83875id, 1.0f);
    }

    /* renamed from: a */
    private void m126522a(View view) {
        Activity a = C37299a.m119788a(view.getContext());
        if (a != null) {
            this.f102821o = (StickerHintTextViewModel) C0069x.m159a((FragmentActivity) a).mo147a(StickerHintTextViewModel.class);
        }
    }

    /* renamed from: e */
    public final void mo98607e(C39558aj ajVar) {
        if (ajVar != null && this.f102807a.contains(ajVar) && !ajVar.f102719o) {
            this.f102820n.mo38813b(ajVar.f102708c.f83875id, ajVar.mo98491b(), ajVar.mo98494c());
        }
    }

    /* renamed from: j */
    public final boolean mo98613j(C39558aj ajVar) {
        if (!ajVar.f102708c.isPin() || this.f102820n.mo38877t(ajVar.f102708c.f83875id)) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    private void m126526k(C39558aj ajVar) {
        if (ajVar.f102708c.layerWeight != C39559ak.m126370d()) {
            ajVar.f102708c.updateLayerWeight(C39559ak.m126369c());
            this.f102820n.mo38838e(ajVar.f102708c.f83875id, ajVar.f102708c.layerWeight);
            if (this.f102814h != null) {
                this.f102814h.accept(ajVar);
            }
        }
    }

    /* renamed from: a */
    public final int mo98576a(StickerItemModel stickerItemModel) {
        if (stickerItemModel == null) {
            return -1;
        }
        int y = this.f102820n.mo38882y();
        this.f102820n.mo38813b(y, stickerItemModel.startTime, stickerItemModel.endTime);
        stickerItemModel.f83875id = y;
        m126521a(y, stickerItemModel);
        return y;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ C7581n mo98595b(StickerItemModel stickerItemModel) throws Exception {
        ByteBuffer a = C39561am.m126376a(stickerItemModel.pinAlgorithmFile);
        if (a != null) {
            this.f102820n.mo38768a(stickerItemModel.f83875id, a);
        }
        return C7581n.f20898a;
    }

    /* renamed from: d */
    public final void mo98604d(int i) {
        C39558aj ajVar = null;
        for (C39558aj ajVar2 : this.f102807a) {
            if (ajVar2.f102708c.f83875id == i) {
                ajVar = ajVar2;
            }
        }
        if (ajVar != null) {
            mo98602c(ajVar);
        }
    }

    /* renamed from: c */
    public final void mo98601c(int i) {
        if (i != -1) {
            this.f102820n.mo38843f(i);
            SubtitleModule.m131124ab().remove(Integer.valueOf(i));
            C39558aj ajVar = null;
            for (C39558aj ajVar2 : this.f102807a) {
                if (ajVar2.f102708c.f83875id == i) {
                    ajVar = ajVar2;
                }
            }
            if (ajVar != null) {
                this.f102807a.remove(ajVar);
                this.f102808b = null;
                if (this.f102810d != null) {
                    this.f102810d.mo98467b(ajVar.f102708c);
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo98605d(C39558aj ajVar) {
        if (ajVar != null && !ajVar.f102719o) {
            this.f102820n.mo38813b(ajVar.f102708c.f83875id, 0, this.f102809c);
        }
    }

    /* renamed from: g */
    public final void mo98610g(C39558aj ajVar) {
        if (!ajVar.f102708c.isLyric()) {
            if (ajVar.f102719o) {
                if (this.f102812f != null && !ajVar.f102708c.isSubtitleRule()) {
                    this.f102812f.mo101512a(ajVar.f102708c.f83875id);
                }
                return;
            }
            if (this.f102811e != null) {
                this.f102811e.mo103186a(false);
            }
            if (this.f102808b != ajVar) {
                mo98600c();
                this.f102808b = ajVar;
            }
            this.f102808b.f102709d = this.f102808b.mo98489a();
            this.f102820n.mo38813b(this.f102808b.f102708c.f83875id, 0, this.f102809c);
        }
    }

    /* renamed from: c */
    public final void mo98602c(C39558aj ajVar) {
        if (!ajVar.f102719o) {
            this.f102820n.mo38843f(ajVar.f102708c.f83875id);
            this.f102807a.remove(ajVar);
            this.f102808b = null;
            if (this.f102810d != null) {
                this.f102810d.mo98467b(ajVar.f102708c);
            }
        } else if (!ajVar.f102708c.isSubtitleRule()) {
            mo98591a(true);
        }
    }

    /* renamed from: a */
    public final int mo98577a(UtteranceWithWords utteranceWithWords) {
        int y = this.f102820n.mo38882y();
        this.f102820n.mo38813b(y, utteranceWithWords.getStartTime(), utteranceWithWords.getEndTime());
        StickerItemModel a = m126519a(y, utteranceWithWords.getStartTime(), utteranceWithWords.getEndTime(), utteranceWithWords.getInitWidth(), utteranceWithWords.getInitHeight(), "subtitle_rule", utteranceWithWords.getText(), 1.0f, 0.75f);
        if (a == null) {
            return -1;
        }
        return this.f102807a.indexOf(m126521a(y, a));
    }

    /* renamed from: a */
    public final void mo98582a(int i, int i2) {
        this.f102820n.mo38846g(i, i2);
    }

    /* renamed from: a */
    public static int m126518a(C39558aj ajVar, C39558aj ajVar2) {
        return ajVar.f102708c.layerWeight - ajVar2.f102708c.layerWeight;
    }

    /* renamed from: a */
    private C39558aj m126521a(int i, StickerItemModel stickerItemModel) {
        C39558aj ajVar = new C39558aj(this.f102819m.getContext(), stickerItemModel, this);
        ajVar.f102719o = true;
        ajVar.mo98490a(this.f102819m.f102638c, this.f102819m.f102639d, this.f102819m.f102636a, this.f102819m.f102637b, stickerItemModel.currentOffsetX, stickerItemModel.currentOffsetY);
        this.f102820n.mo38749a(i, stickerItemModel.currentOffsetX, stickerItemModel.currentOffsetY);
        this.f102820n.mo38838e(i, stickerItemModel.layerWeight);
        this.f102820n.mo38810b(i, stickerItemModel.scale);
        this.f102820n.mo38748a(i, -stickerItemModel.rotateAngle);
        this.f102808b = ajVar;
        this.f102808b.f102709d = false;
        this.f102807a.add(ajVar);
        if (this.f102810d != null) {
            this.f102810d.mo98466a(stickerItemModel);
        }
        SubtitleModule.m131124ab().put(Integer.valueOf(i), stickerItemModel);
        return ajVar;
    }

    /* renamed from: b */
    public final void mo98597b(C39558aj ajVar, float f) {
        if (!ajVar.f102719o) {
            float f2 = ajVar.f102708c.scale * f;
            if (f2 >= ajVar.f102706a || f >= 1.0f) {
                this.f102820n.mo38810b(ajVar.f102708c.f83875id, f);
                ajVar.f102708c.scale = f2;
                ajVar.mo98492b(f);
            }
        } else if (!ajVar.f102708c.isSubtitleRule()) {
            for (C39558aj ajVar2 : this.f102807a) {
                if (ajVar2.f102719o) {
                    float f3 = ajVar2.f102708c.scale * f;
                    if (f3 < ajVar2.f102706a && f < 1.0f) {
                        return;
                    }
                    if (f3 <= ajVar2.f102707b || f <= 1.0f) {
                        this.f102820n.mo38810b(ajVar2.f102708c.f83875id, f);
                        ajVar2.f102708c.scale = f3;
                        ajVar2.mo98492b(f);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final boolean mo98599b(int i, int i2) {
        if (this.f102807a == null || this.f102807a.size() == 0) {
            return false;
        }
        for (C39558aj ajVar : this.f102807a) {
            if (ajVar.f102711f.contains((float) i, (float) i2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m126523a(String str, StickerItemModel stickerItemModel) {
        if (stickerItemModel.isSubtitle() || stickerItemModel.isSubtitleRule()) {
            stickerItemModel.f83875id = this.f102820n.mo38882y();
            StringBuilder sb = new StringBuilder("veAddInfoSticker subtitle id = ");
            sb.append(stickerItemModel.f83875id);
            C41530am.m132285d(sb.toString());
            if (stickerItemModel.f83875id < 0) {
                StringBuilder sb2 = new StringBuilder("restore subtitle failed: ");
                sb2.append(stickerItemModel.f83875id);
                C6921a.m21555a(sb2.toString());
                return false;
            }
            this.f102820n.mo38749a(stickerItemModel.f83875id, stickerItemModel.currentOffsetX, stickerItemModel.currentOffsetY);
            this.f102820n.mo38810b(stickerItemModel.f83875id, stickerItemModel.scale);
            this.f102820n.mo38748a(stickerItemModel.f83875id, -stickerItemModel.rotateAngle);
            this.f102820n.mo38813b(stickerItemModel.f83875id, stickerItemModel.startTime, stickerItemModel.endTime);
            this.f102820n.mo38838e(stickerItemModel.f83875id, stickerItemModel.layerWeight);
            return true;
        }
        String str2 = stickerItemModel.path;
        if (!C7276d.m22812b(str2)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(File.separator);
            sb3.append(new File(str2).getName());
            str2 = sb3.toString();
        }
        if (C7276d.m22812b(str2)) {
            stickerItemModel.f83875id = this.f102820n.mo38788a(str2, TextUtils.isEmpty(stickerItemModel.extra) ? null : new String[]{stickerItemModel.extra});
            StringBuilder sb4 = new StringBuilder("veAddInfoSticker id = ");
            sb4.append(stickerItemModel.f83875id);
            C41530am.m132285d(sb4.toString());
            if (stickerItemModel.f83875id < 0) {
                StringBuilder sb5 = new StringBuilder("restore infoSticker failed: ");
                sb5.append(stickerItemModel.f83875id);
                C6921a.m21555a(sb5.toString());
                StringBuilder sb6 = new StringBuilder("restore_failed: ");
                sb6.append(stickerItemModel.f83875id);
                StringBuilder sb7 = new StringBuilder("path: ");
                sb7.append(str2);
                sb7.append(" extra: ");
                sb7.append(stickerItemModel.extra);
                C6893q.m21447a("info_sticker", C6869c.m21381a().mo16887a("event", sb6.toString()).mo16887a("user_info", sb7.toString()).mo16888b());
                return false;
            }
            if (!stickerItemModel.isPin() || !C38527bf.m123172a(stickerItemModel.pinAlgorithmFile)) {
                this.f102820n.mo38748a(stickerItemModel.f83875id, -stickerItemModel.rotateAngle);
                this.f102820n.mo38810b(stickerItemModel.f83875id, stickerItemModel.scale);
                this.f102820n.mo38749a(stickerItemModel.f83875id, stickerItemModel.currentOffsetX, stickerItemModel.currentOffsetY);
            } else {
                C1592h.m7855a((Callable<TResult>) new C39588e<TResult>(this, stickerItemModel), (Executor) C1592h.f5957a);
            }
            this.f102820n.mo38813b(stickerItemModel.f83875id, stickerItemModel.startTime, stickerItemModel.endTime);
            this.f102820n.mo38838e(stickerItemModel.f83875id, stickerItemModel.layerWeight);
            return true;
        } else if (!C7163a.m22363a()) {
            C6921a.m21559a((Throwable) new Exception("infoSticker not exist in edit"));
            return false;
        } else {
            StringBuilder sb8 = new StringBuilder("infoSticker not exist in edit ");
            sb8.append(stickerItemModel);
            throw new IllegalStateException(sb8.toString());
        }
    }

    /* renamed from: b */
    private void m126525b(C39558aj ajVar, int i, int i2) {
        ajVar.f102708c.startTime = i;
        ajVar.f102708c.endTime = i2;
        this.f102820n.mo38813b(ajVar.f102708c.f83875id, i, i2);
    }

    C39586c(InfoStickerEditView infoStickerEditView, C15389d dVar, View view) {
        this.f102819m = infoStickerEditView;
        this.f102820n = dVar;
        this.f102809c = this.f102820n.mo38860l();
        m126522a(view);
    }

    /* renamed from: a */
    private StickerItemModel m126520a(int i, String str, String str2, String str3, int i2, int i3) {
        try {
            StickerItemModel stickerItemModel = new StickerItemModel(str, str2, str3, i3, this.f102820n.mo38841e(i), 0, this.f102809c);
            float[] fArr = new float[2];
            this.f102820n.mo38816b(i, fArr);
            stickerItemModel.currentOffsetX = fArr[0];
            stickerItemModel.currentOffsetY = fArr[1];
            this.f102820n.mo38811b(i, fArr[0], fArr[1]);
            stickerItemModel.f83875id = i;
            stickerItemModel.type = i2;
            float[] g = this.f102820n.mo38849g(i);
            stickerItemModel.initWidth = (g[2] - g[0]) * ((float) this.f102819m.f102638c);
            stickerItemModel.initHeight = (g[1] - g[3]) * ((float) this.f102819m.f102639d);
            return stickerItemModel;
        } catch (VEException e) {
            StringBuilder sb = new StringBuilder("add info sticker failed: ");
            sb.append(str);
            C6921a.m21559a((Throwable) new RuntimeException(sb.toString(), e));
            StringBuilder sb2 = new StringBuilder("initSticker failed : ");
            sb2.append(str);
            StringBuilder sb3 = new StringBuilder("initSticker size : ");
            sb3.append(this.f102807a.size());
            C6893q.m21447a("info_sticker", C6869c.m21381a().mo16887a("event", sb2.toString()).mo16887a("user_info", sb3.toString()).mo16888b());
            return null;
        }
    }

    /* renamed from: a */
    private StickerItemModel m126519a(int i, int i2, int i3, int i4, int i5, String str, String str2, float f, float f2) {
        int i6 = i;
        try {
            StickerItemModel stickerItemModel = new StickerItemModel("", str2, str, C39559ak.m126369c(), false, i2, i3);
            stickerItemModel.currentOffsetX = 0.5f;
            stickerItemModel.currentOffsetY = f2;
            stickerItemModel.scale = f;
            stickerItemModel.f83875id = i6;
            stickerItemModel.initWidth = (float) i4;
            stickerItemModel.initHeight = (float) i5;
            if (C7163a.m22363a()) {
                if (stickerItemModel.initWidth == 0.0f || stickerItemModel.initHeight == 0.0f) {
                    StringBuilder sb = new StringBuilder("add subtitle infoSticker error: surface w*h = ");
                    sb.append(this.f102819m.f102638c);
                    sb.append(" * ");
                    sb.append(this.f102819m.f102639d);
                    throw new IllegalStateException(sb.toString());
                }
            }
            return stickerItemModel;
        } catch (VEException e) {
            StringBuilder sb2 = new StringBuilder("add subtitle info sticker failed: ");
            sb2.append(i);
            C6921a.m21559a((Throwable) new RuntimeException(sb2.toString(), e));
            StringBuilder sb3 = new StringBuilder("subtitle initSticker failed : ");
            sb3.append(i);
            StringBuilder sb4 = new StringBuilder("initSticker size : ");
            sb4.append(this.f102807a.size());
            C6893q.m21447a("info_sticker", C6869c.m21381a().mo16887a("event", sb3.toString()).mo16887a("user_info", sb4.toString()).mo16888b());
            return null;
        }
    }
}
