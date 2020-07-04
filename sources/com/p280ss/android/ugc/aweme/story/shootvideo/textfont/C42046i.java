package com.p280ss.android.ugc.aweme.story.shootvideo.textfont;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.common.utility.C6311g;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.google.gson.C6600e;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.aweme.base.p1059d.p1060a.C23318a;
import com.p280ss.android.ugc.aweme.base.p1059d.p1060a.C23319b;
import com.p280ss.android.ugc.aweme.infosticker.StickerItemModel;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39774n;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.C39560al;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C39601a;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.C39613e;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.C39620l;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.TextStickerCompileResult;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.BorderLineView;
import com.p280ss.android.ugc.aweme.shortvideo.gesture.p1575a.C39947b;
import com.p280ss.android.ugc.aweme.shortvideo.gesture.p1575a.C39949c;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40379ai;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.StickerHintTextViewModel;
import com.p280ss.android.ugc.aweme.story.shootvideo.C42014c;
import com.p280ss.android.ugc.aweme.story.shootvideo.p1658c.C42015a;
import com.p280ss.android.ugc.aweme.story.shootvideo.p1658c.C42016b;
import com.p280ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerData;
import com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.C42060b;
import com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.C42061c;
import com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.view.AssistLineView;
import com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.view.C42078c;
import com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.view.C42078c.C42080a;
import com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.view.C42088k;
import com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.view.C42088k.C42092c;
import com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout;
import com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.view.p1663b.C42077a;
import com.p280ss.android.ugc.gamora.editor.C44295cr;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.vesdk.VESize;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textfont.i */
public final class C42046i implements C39774n, C42080a {

    /* renamed from: A */
    private C15389d f109209A;

    /* renamed from: B */
    private int f109210B;

    /* renamed from: C */
    private TextStickerInputLayout f109211C;

    /* renamed from: D */
    private boolean f109212D;

    /* renamed from: E */
    private C42078c f109213E;

    /* renamed from: F */
    private C39620l f109214F;

    /* renamed from: G */
    private TextStickerViewModel f109215G;

    /* renamed from: H */
    private StickerHintTextViewModel f109216H;

    /* renamed from: a */
    public AppCompatActivity f109217a;

    /* renamed from: b */
    public List<C42088k> f109218b = new ArrayList();

    /* renamed from: c */
    public FrameLayout f109219c;

    /* renamed from: d */
    public View f109220d;

    /* renamed from: e */
    public C42049a f109221e;

    /* renamed from: f */
    public C44295cr f109222f;

    /* renamed from: g */
    public C42088k f109223g;

    /* renamed from: h */
    public C42015a f109224h;

    /* renamed from: i */
    public Rect f109225i;

    /* renamed from: j */
    public boolean f109226j = true;

    /* renamed from: k */
    public C42050b f109227k;

    /* renamed from: l */
    public boolean f109228l;

    /* renamed from: m */
    public AssistLineView f109229m;

    /* renamed from: n */
    public long f109230n;

    /* renamed from: o */
    protected BorderLineView f109231o;

    /* renamed from: p */
    public C23319b<C42088k> f109232p;

    /* renamed from: q */
    public boolean f109233q;

    /* renamed from: r */
    public boolean f109234r;

    /* renamed from: s */
    protected C42016b f109235s;

    /* renamed from: t */
    public boolean f109236t = false;

    /* renamed from: u */
    public Runnable f109237u;

    /* renamed from: v */
    public C23318a<C42088k, C42088k> f109238v;

    /* renamed from: w */
    private C42061c f109239w;

    /* renamed from: x */
    private int f109240x;

    /* renamed from: y */
    private int f109241y;

    /* renamed from: z */
    private SafeHandler f109242z;

    /* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textfont.i$a */
    public interface C42049a {
        /* renamed from: a */
        void mo103279a(C42088k kVar);

        /* renamed from: a */
        void mo103280a(C42088k kVar, int i, int i2, boolean z, boolean z2, boolean z3);

        /* renamed from: b */
        void mo103281b(C42088k kVar);

        /* renamed from: c */
        void mo103282c(C42088k kVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textfont.i$b */
    public class C42050b extends C42060b {
        public C42050b() {
        }

        /* renamed from: a */
        public final boolean mo96384a(ScaleGestureDetector scaleGestureDetector) {
            if (!C42046i.this.f109226j) {
                return false;
            }
            for (C42088k kVar : C42046i.this.f109218b) {
                if (kVar != null && kVar.mo103409a(scaleGestureDetector)) {
                    C42046i.this.mo103252a(kVar);
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public final boolean mo96387b(float f) {
            if (!C42046i.this.f109226j) {
                return false;
            }
            for (C42088k kVar : C42046i.this.f109218b) {
                if (kVar != null && kVar.mo103405a(f)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        public final boolean mo96393d(MotionEvent motionEvent) {
            if (!C42046i.this.f109226j) {
                return false;
            }
            for (C42088k kVar : C42046i.this.f109218b) {
                if (kVar != null && kVar.mo103417b(motionEvent)) {
                    C42046i.this.mo103258c();
                    if (kVar.mo103427f()) {
                        C42046i.this.f109228l = true;
                    }
                    return true;
                }
            }
            return false;
        }

        /* renamed from: e */
        public final boolean mo98462e(MotionEvent motionEvent) {
            if (C42046i.this.f109228l) {
                C42046i.this.f109228l = false;
                return true;
            }
            for (C42088k kVar : C42046i.this.f109218b) {
                if (kVar != null && kVar.mo103423c(motionEvent)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public final boolean mo98458a(C39947b bVar) {
            if (!C42046i.this.f109226j) {
                return false;
            }
            for (C42088k kVar : C42046i.this.f109218b) {
                if (kVar != null && kVar.mo103410a(bVar)) {
                    C42046i.this.mo103258c();
                    return true;
                }
            }
            return false;
        }

        /* renamed from: c */
        public final boolean mo96392c(MotionEvent motionEvent) {
            C42046i.this.f109236t = false;
            if (!C42046i.this.f109226j) {
                return false;
            }
            for (C42088k h : C42046i.this.f109218b) {
                h.mo103448h();
            }
            for (C42088k kVar : C42046i.this.f109218b) {
                if (kVar != null && kVar.mo103407a(motionEvent)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public final boolean mo96390b(ScaleGestureDetector scaleGestureDetector) {
            if (!C42046i.this.f109226j) {
                return false;
            }
            for (C42088k kVar : C42046i.this.f109218b) {
                if (kVar != null && kVar.mo103419b(scaleGestureDetector)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public final boolean mo96385a(C39949c cVar) {
            if (!C42046i.this.f109226j) {
                return false;
            }
            for (C42088k kVar : C42046i.this.f109218b) {
                if (kVar != null && kVar.mo103412a(cVar)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public final boolean mo98459a(C39947b bVar, float f, float f2) {
            if (!C42046i.this.f109226j) {
                return false;
            }
            for (C42088k kVar : C42046i.this.f109218b) {
                if (kVar != null && kVar.mo103411a(bVar, f, f2)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public final boolean mo96383a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            for (C42088k kVar : C42046i.this.f109218b) {
                if (kVar != null && kVar.mo103418b(motionEvent, motionEvent2, f, f2)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public final boolean mo96389b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            for (C42088k kVar : C42046i.this.f109218b) {
                if (kVar != null && kVar.mo103408a(motionEvent, motionEvent2, f, f2)) {
                    return true;
                }
            }
            if (!C42046i.this.f109236t) {
                return false;
            }
            C42046i.this.f109236t = false;
            return true;
        }
    }

    /* renamed from: a */
    public final void mo103250a(TextStickerInputLayout textStickerInputLayout) {
        this.f109211C = textStickerInputLayout;
        this.f109211C.setTextStickerUpdateListener(new C42051j(this));
    }

    /* renamed from: a */
    public final void mo103249a(TextStickerData textStickerData, boolean z) {
        this.f109211C.setData(textStickerData);
        m133662b(textStickerData, z);
    }

    /* renamed from: a */
    public final void mo103252a(C42088k kVar) {
        if (this.f109219c != null && kVar != null && this.f109231o != null) {
            if (this.f109237u != null) {
                this.f109237u.run();
            }
            if (this.f109239w != null) {
                this.f109239w.setHightLayerListenerToFirst(this.f109227k);
            }
            if (this.f109219c.getChildCount() > 1 && this.f109219c.getChildAt(this.f109219c.getChildCount() - 1) != kVar) {
                this.f109219c.removeView(kVar);
                this.f109219c.addView(kVar);
            }
            if (this.f109218b.size() > 1 && ((C42088k) this.f109218b.get(0)) != kVar) {
                this.f109218b.remove(kVar);
                this.f109218b.add(0, kVar);
            }
            if (this.f109218b.size() > 0) {
                C42088k kVar2 = (C42088k) this.f109218b.get(0);
                if (this.f109238v != null) {
                    this.f109238v.mo60605a(kVar2, kVar);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo103255a(boolean z) {
        mo103270j().mo103210a(true);
    }

    /* renamed from: a */
    public final void mo103247a(C15389d dVar, boolean z) {
        if (dVar != null && this.f109209A == null) {
            VESize c = dVar.mo38828c();
            if (c.f116385a != 0 && c.f116386b != 0) {
                this.f109209A = dVar;
                int[] a = C39560al.m126373a((View) this.f109219c, c.f116385a, c.f116386b, z);
                this.f109240x = a[0];
                this.f109241y = a[1];
                m133667o();
            }
        }
    }

    /* renamed from: a */
    public final void mo103253a(C42088k kVar, int i) {
        if (i == 1) {
            kVar.mo103414b(0.3137255f, false);
        } else if (i == 3) {
            mo103259c(kVar);
            this.f109236t = true;
        } else {
            if (i == 4) {
                kVar.mo103414b(0.3137255f, true);
            }
        }
    }

    /* renamed from: a */
    public final void mo103246a(long j) {
        for (C42088k kVar : this.f109218b) {
            kVar.setPlayPosition(j);
            kVar.mo103449i();
        }
    }

    /* renamed from: a */
    public final void mo103254a(String str, String str2, boolean z, boolean z2) {
        this.f109211C.mo103336a(str, str2, z, z2);
    }

    /* renamed from: a */
    public final boolean mo98644a(RectF rectF) {
        if (C6311g.m19573a(this.f109218b)) {
            return false;
        }
        for (C42088k anglePointList : this.f109218b) {
            RectF a = C39601a.m126687a(anglePointList.getAnglePointList());
            if (a.top >= rectF.top) {
                if (a.bottom > rectF.bottom) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static C6600e m133660b() {
        return C35563c.f93220B.getRetrofitFactoryGson();
    }

    /* renamed from: n */
    private String[] m133666n() {
        return this.f109211C.getTextAry();
    }

    public final void dismiss() {
        if (this.f109211C != null) {
            this.f109211C.dismiss(false);
        }
    }

    /* renamed from: h */
    public final void mo103268h() {
        if (this.f109222f != null) {
            this.f109222f.mo103323b();
        }
    }

    /* renamed from: i */
    public final boolean mo103269i() {
        if (this.f109218b.size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final List<C42088k> mo103271k() {
        if (this.f109218b == null) {
            this.f109218b = new ArrayList();
        }
        return this.f109218b;
    }

    /* renamed from: l */
    private void m133664l() {
        this.f109216H = (StickerHintTextViewModel) C0069x.m159a((FragmentActivity) this.f109217a).mo147a(StickerHintTextViewModel.class);
    }

    /* renamed from: c */
    public final void mo103258c() {
        if (C35563c.f93231M.mo93305a(Property.EnableStickerFunctionalities) && this.f109216H != null) {
            this.f109216H.mo100247a().postValue(Boolean.valueOf(true));
        }
    }

    /* renamed from: d */
    public final boolean mo103262d() {
        return ((TextStickerViewState) mo103270j().mo106825a(this.f109217a)).getInTimeEditView();
    }

    /* renamed from: f */
    public final void mo103266f() {
        if (this.f109239w != null) {
            this.f109222f = this.f109239w.getDeleteView();
        }
        this.f109222f.mo103322a();
    }

    /* renamed from: j */
    public final TextStickerViewModel mo103270j() {
        if (this.f109215G == null) {
            this.f109215G = (TextStickerViewModel) C36113b.m116288a(this.f109217a).mo91871a(TextStickerViewModel.class);
        }
        return this.f109215G;
    }

    /* renamed from: m */
    private void m133665m() {
        String[] n = m133666n();
        if (C42014c.m133558a(n)) {
            m133659a(n);
        } else if (this.f109223g != null) {
            this.f109219c.removeView(this.f109223g);
            this.f109218b.remove(this.f109223g);
        }
        this.f109212D = false;
    }

    /* renamed from: o */
    private void m133667o() {
        LayoutParams layoutParams = this.f109219c.getLayoutParams();
        this.f109225i = new Rect(0, 0, layoutParams.width, layoutParams.height);
        if (this.f109231o != null) {
            this.f109219c.removeView(this.f109231o);
        }
        this.f109231o = BorderLineView.m126816a(this.f109217a, layoutParams.width, layoutParams.height, this.f109240x, this.f109241y);
        this.f109219c.addView(this.f109231o);
    }

    /* renamed from: g */
    public final void mo103267g() {
        Iterator it = this.f109218b.iterator();
        while (it.hasNext()) {
            C42088k kVar = (C42088k) it.next();
            this.f109219c.removeView(kVar);
            it.remove();
            if (this.f109221e != null) {
                this.f109221e.mo103279a(kVar);
            }
        }
    }

    /* renamed from: e */
    public final boolean mo103265e() {
        if (this.f109216H != null) {
            this.f109216H.mo100247a().postValue(Boolean.valueOf(true));
        }
        if (this.f109218b == null || this.f109218b.size() <= 0) {
            return false;
        }
        boolean z = false;
        for (C42088k kVar : this.f109218b) {
            if (kVar.mo103404a()) {
                kVar.setShowHelpBox(false);
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public final void mo103244a() {
        this.f109210B = ((Integer) C35563c.f93252o.mo83237m().mo83238a()).intValue();
        if (this.f109210B == 0) {
            this.f109210B = 30;
        }
        C42039d.m133620a().mo103222a((Context) this.f109217a);
        this.f109229m = AssistLineView.m133773a((Context) this.f109217a);
        this.f109213E = new C42078c(this.f109217a);
        this.f109213E.mo103394a(this);
        this.f109214F = new C39620l();
        this.f109227k = new C42050b();
        this.f109242z = new SafeHandler(this.f109217a);
        m133664l();
    }

    /* renamed from: a */
    public final void mo103251a(C42077a aVar) {
        this.f109211C.setTextStickerInputMobListener(aVar);
    }

    /* renamed from: a */
    public final void mo103248a(C42016b bVar) {
        this.f109235s = bVar;
        this.f109211C.setStoryEditViewShowListener(new C42016b() {
            /* renamed from: a */
            public final void mo103187a() {
                if (C42046i.this.f109235s != null) {
                    C42046i.this.f109235s.mo103187a();
                }
            }

            public final void dismiss() {
                if (C42046i.this.f109223g != null) {
                    C42046i.this.f109223g.mo103420c();
                }
            }
        });
    }

    /* renamed from: c */
    public final void mo96461c(int i) {
        if (this.f109211C.mo103349g()) {
            this.f109211C.mo103338b(i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo103261d(boolean z) {
        this.f109211C.mo103356h();
    }

    /* renamed from: b */
    public final void mo96460b(int i) {
        if (this.f109212D) {
            this.f109211C.dismiss(true);
            m133665m();
            if (this.f109235s != null) {
                this.f109235s.dismiss();
            }
        }
    }

    /* renamed from: b */
    public final void mo103256b(C42088k kVar) {
        this.f109212D = true;
        if (kVar == null) {
            this.f109211C.mo101452a("", 0, -1, 0, "", true);
            this.f109223g = null;
            return;
        }
        this.f109211C.mo103335a(kVar.getText(), kVar.getCurMode(), kVar.getCurColor(), kVar.getCurAlignTxt(), kVar.getCurFontType(), false, kVar.getData().fontSize);
    }

    /* renamed from: c */
    public final void mo103259c(C42088k kVar) {
        this.f109219c.removeView(kVar);
        this.f109218b.remove(kVar);
        if (this.f109221e != null) {
            this.f109221e.mo103279a(kVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo103264e(C42088k kVar) {
        C0052o b = this.f109216H.mo100248b();
        C40379ai aiVar = new C40379ai((kVar.getHelpRect().width() / 2.0f) + kVar.getHelpRect().left, kVar.getHelpRect().top, R.string.akc, 1, false);
        b.postValue(aiVar);
    }

    /* renamed from: c */
    public final void mo103260c(boolean z) {
        this.f109226j = z;
        if (this.f109218b != null && this.f109218b.size() > 0) {
            for (C42088k enableEdit : this.f109218b) {
                enableEdit.setEnableEdit(z);
            }
        }
    }

    /* renamed from: a */
    private void m133659a(String[] strArr) {
        if (strArr != null && strArr.length != 0) {
            if (this.f109223g != null) {
                this.f109223g.setText(strArr);
                this.f109223g.mo103403a(this.f109211C.getCurTxtMode(), this.f109211C.getCurColor(), this.f109211C.getAlignTxt(), C42039d.m133620a().f109198b);
            } else if (this.f109218b.size() >= this.f109210B) {
                C10761a.m31392b(this.f109211C.getContext(), (int) R.string.btt, 0).mo25750a();
            } else {
                TextStickerData textStickerData = new TextStickerData("", this.f109211C.getCurTxtMode(), this.f109211C.getCurColor(), this.f109211C.getAlignTxt(), C42039d.m133620a().f109198b);
                textStickerData.mEditCenterPoint = this.f109211C.getEditInputCenterPoint();
                textStickerData.mTextStrAry = strArr;
                mo103249a(textStickerData, false);
            }
        }
    }

    /* renamed from: b */
    public final void mo103257b(boolean z) {
        if (C39805en.m127445a() && this.f109209A != null) {
            VESize c = this.f109209A.mo38828c();
            if (c.f116385a != 0 && c.f116386b != 0) {
                int[] a = C39560al.m126372a(this.f109219c, c.f116385a, c.f116386b);
                this.f109240x = a[0];
                this.f109241y = a[1];
                m133667o();
            }
        }
    }

    /* renamed from: a */
    public final void mo96459a(int i) {
        if (this.f109212D) {
            if (this.f109223g != null) {
                this.f109223g.mo103424d();
            }
            this.f109211C.mo103348f();
            this.f109211C.mo103332a(i);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ TextStickerCompileResult m133657a(C42088k kVar, C1592h hVar) throws Exception {
        if (hVar.mo6890e() != null) {
            return new TextStickerCompileResult(kVar.mo103428g(), (C39613e) hVar.mo6890e());
        }
        return null;
    }

    /* renamed from: a */
    public static void m133658a(BaseShortVideoContext baseShortVideoContext, JSONArray jSONArray) {
        int i;
        if (baseShortVideoContext instanceof VideoPublishEditModel) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext;
            JSONArray jSONArray2 = new JSONArray();
            if (videoPublishEditModel.hasInfoStickers()) {
                for (StickerItemModel stickerItemModel : videoPublishEditModel.infoStickerModel.stickers) {
                    if (stickerItemModel.type == 2) {
                        jSONArray2.put(C42088k.m133894a(((TextStickerData) m133660b().mo15974a(stickerItemModel.extra, TextStickerData.class)).mTextStrAry));
                    }
                }
            }
            if (jSONArray2.length() > 0) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    String str = "type";
                    if (((VideoPublishEditModel) baseShortVideoContext).isStatusVideoType()) {
                        i = 6;
                    } else {
                        i = 4;
                    }
                    jSONArray.put(jSONObject.put(str, i).put("data", jSONArray2));
                } catch (JSONException unused) {
                }
            }
        }
    }

    /* renamed from: b */
    public static void m133661b(BaseShortVideoContext baseShortVideoContext, JSONArray jSONArray) {
        if (baseShortVideoContext instanceof VideoPublishEditModel) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext;
            JSONArray jSONArray2 = new JSONArray();
            if (videoPublishEditModel.hasInfoStickers()) {
                for (StickerItemModel stickerItemModel : videoPublishEditModel.infoStickerModel.stickers) {
                    if (stickerItemModel.isSubtitle()) {
                        jSONArray2.put(stickerItemModel.getText());
                    }
                }
            }
            if (jSONArray2.length() > 0) {
                try {
                    jSONArray.put(new JSONObject().put("type", 5).put("data", jSONArray2));
                } catch (JSONException unused) {
                }
            }
        }
    }

    /* renamed from: b */
    private void m133662b(TextStickerData textStickerData, boolean z) {
        final C42088k kVar = new C42088k(this.f109217a, this.f109242z, textStickerData, this.f109233q);
        this.f109218b.add(0, kVar);
        kVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f109219c.addView(kVar);
        if (this.f109221e != null) {
            this.f109221e.mo103281b(kVar);
        }
        kVar.setOnEditClickListener(new C42092c() {
            /* renamed from: b */
            public final void mo103278b(C42088k kVar) {
                C42046i.this.mo103259c(kVar);
            }

            /* renamed from: a */
            public final Float mo103274a(float f) {
                if (C42046i.this.f109231o != null) {
                    return BorderLineView.m126817a(f);
                }
                return Float.valueOf(f);
            }

            /* renamed from: a */
            public final void mo103275a(C42088k kVar) {
                C42046i.this.mo103255a(true);
                C42046i.this.mo103265e();
                if (C42046i.this.f109232p != null) {
                    C42046i.this.f109232p.accept(kVar);
                }
            }

            /* renamed from: a */
            public final void mo103277a(C42088k kVar, boolean z) {
                if (!z || C42046i.this.mo103262d()) {
                    if (C42046i.this.f109224h != null) {
                        C42046i.this.f109224h.mo103186a(false);
                        if (kVar != null) {
                            C42046i.this.mo103252a(kVar);
                        }
                    }
                    C42046i.this.mo103265e();
                } else if (System.currentTimeMillis() - C42046i.this.f109230n > 500) {
                    C42046i.this.f109223g = kVar;
                    C42046i.this.mo103256b(kVar);
                    if (C42046i.this.f109221e != null) {
                        C42046i.this.f109221e.mo103282c(kVar);
                    }
                    C42046i.this.f109230n = System.currentTimeMillis();
                }
            }

            /* renamed from: a */
            public final int mo103272a(C42088k kVar, boolean z, boolean z2) {
                if (C42046i.this.f109231o == null) {
                    return -1;
                }
                if (z) {
                    C42046i.this.f109231o.mo98797a();
                } else if (kVar != null) {
                    return C42046i.this.f109231o.mo98794a(kVar.getAnglePointListForBlock(), z2, false);
                }
                return -1;
            }

            /* renamed from: a */
            public final PointF mo103273a(C42088k kVar, float f, float f2) {
                if (C42046i.this.f109231o == null || kVar == null) {
                    return new PointF(0.0f, 0.0f);
                }
                PointF[] anglePointList = kVar.getAnglePointList();
                int length = anglePointList.length;
                for (int i = 0; i < length; i++) {
                    PointF pointF = anglePointList[i];
                    pointF.x += f;
                    pointF.y += f2;
                }
                return C42046i.this.f109231o.mo98796a(anglePointList, f, f2, false);
            }

            /* renamed from: a */
            public final void mo103276a(C42088k kVar, RectF rectF, int i, int i2, boolean z, boolean z2, boolean z3) {
                if (kVar != null) {
                    if (!z) {
                        C42046i.this.mo103252a(kVar);
                    }
                    if (z) {
                        C42046i.this.f109229m.mo103305a(false);
                    }
                    if (!z2 && !z3) {
                        if (z) {
                            kVar.mo103414b(0.3137255f, false);
                        }
                        boolean a = C39601a.m126688a(C42046i.this.f109225i, kVar.getAnglePointList());
                        if (C42046i.this.f109222f != null) {
                            C42046i.this.mo103253a(kVar, C42046i.this.f109222f.mo103321a(i, i2, z, a));
                        }
                    }
                    if (C42046i.this.f109221e != null) {
                        C42046i.this.f109221e.mo103280a(kVar, i, i2, z, z2, z3);
                    }
                }
            }
        });
        kVar.mo103402a(this.f109240x, this.f109241y);
        this.f109211C.mo103347e();
        if (VERSION.SDK_INT < 19) {
            kVar.setShowHelpBox(true);
        }
        if (C35563c.f93231M.mo93305a(Property.EnableStickerFunctionalities) && !z && this.f109216H != null) {
            kVar.postDelayed(new C42052k(this, kVar), 500);
        }
        if (textStickerData.autoSelect) {
            kVar.post(new C42053l(kVar));
        }
    }

    /* renamed from: a */
    public final void mo103245a(float f, boolean z) {
        if (this.f109218b.size() != 0) {
            for (C42088k b : this.f109218b) {
                b.mo103414b(f, z);
            }
        }
    }

    /* renamed from: a */
    public final C1592h<List<TextStickerCompileResult>> mo103243a(String str, int i, int i2, int i3, int i4) {
        mo103265e();
        ArrayList arrayList = new ArrayList();
        for (C42088k kVar : this.f109218b) {
            arrayList.add(this.f109214F.mo98749a(kVar, this.f109219c, str, i, i2, i3, i4).mo6885c((C1591g<TResult, TContinuationResult>) new C42054m<TResult,TContinuationResult>(kVar)));
        }
        return C1592h.m7858b((Collection<? extends C1592h<TResult>>) arrayList);
    }
}
