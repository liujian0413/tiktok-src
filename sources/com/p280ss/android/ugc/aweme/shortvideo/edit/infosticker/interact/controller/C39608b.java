package com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.p022v4.app.FragmentActivity;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import bolts.C1592h;
import com.bytedance.common.utility.C6311g;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39774n;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.C39560al;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C39601a;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C39604b;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p1566a.C39602a;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p1566a.C39603b;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poi.PoiStickerView;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.BorderLineView;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.InteractStickerBaseView;
import com.p280ss.android.ugc.aweme.shortvideo.gesture.p1575a.C39947b;
import com.p280ss.android.ugc.aweme.shortvideo.gesture.p1575a.C39949c;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40379ai;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.StickerHintTextViewModel;
import com.p280ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p280ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.C42060b;
import com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.C42061c;
import com.p280ss.android.ugc.gamora.editor.C44295cr;
import com.p280ss.android.ugc.gamora.editor.EditViewModel;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.vesdk.VESize;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.b */
public abstract class C39608b implements C39774n {

    /* renamed from: a */
    protected C42061c f102886a;

    /* renamed from: b */
    protected FrameLayout f102887b;

    /* renamed from: c */
    public boolean f102888c = true;

    /* renamed from: d */
    public C44295cr f102889d;

    /* renamed from: e */
    protected Rect f102890e;

    /* renamed from: f */
    protected int f102891f;

    /* renamed from: g */
    protected int f102892g;

    /* renamed from: h */
    protected C15389d f102893h;

    /* renamed from: i */
    public InteractStickerBaseView f102894i;

    /* renamed from: j */
    protected List<InteractStickerBaseView> f102895j = new ArrayList();

    /* renamed from: k */
    public C39602a f102896k;

    /* renamed from: l */
    protected BorderLineView f102897l;

    /* renamed from: m */
    public VESize f102898m;

    /* renamed from: n */
    public C39610a f102899n;

    /* renamed from: o */
    public boolean f102900o = true;

    /* renamed from: p */
    public boolean f102901p;

    /* renamed from: q */
    protected Context f102902q;

    /* renamed from: r */
    public boolean f102903r = false;

    /* renamed from: s */
    public Runnable f102904s;

    /* renamed from: t */
    private View f102905t;

    /* renamed from: u */
    private C39607a f102906u;

    /* renamed from: v */
    private String f102907v;

    /* renamed from: w */
    private boolean f102908w = true;

    /* renamed from: x */
    private StickerHintTextViewModel f102909x;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.b$a */
    public class C39610a extends C42060b {
        public C39610a() {
        }

        /* renamed from: b */
        public final boolean mo96387b(float f) {
            if (!C39608b.this.f102888c) {
                return false;
            }
            for (InteractStickerBaseView interactStickerBaseView : C39608b.this.f102895j) {
                if (interactStickerBaseView != null && (interactStickerBaseView.mo98823c(f) || interactStickerBaseView.f102975i)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: c */
        public final boolean mo96392c(MotionEvent motionEvent) {
            C39608b.this.f102903r = false;
            if (!C39608b.this.f102888c) {
                return false;
            }
            for (InteractStickerBaseView interactStickerBaseView : C39608b.this.f102895j) {
                if (interactStickerBaseView != null && interactStickerBaseView.mo98812a(motionEvent)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: e */
        public final boolean mo98462e(MotionEvent motionEvent) {
            if (!C39608b.this.f102888c) {
                return false;
            }
            if (C39608b.this.f102901p) {
                C39608b.this.f102901p = false;
                return true;
            }
            for (InteractStickerBaseView interactStickerBaseView : C39608b.this.f102895j) {
                if (interactStickerBaseView != null && interactStickerBaseView.mo98824c(motionEvent)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public final boolean mo96384a(ScaleGestureDetector scaleGestureDetector) {
            if (!C39608b.this.f102888c) {
                return false;
            }
            for (InteractStickerBaseView interactStickerBaseView : C39608b.this.f102895j) {
                if (interactStickerBaseView != null && (interactStickerBaseView.mo98814a(scaleGestureDetector) || interactStickerBaseView.f102975i)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        public final boolean mo96393d(MotionEvent motionEvent) {
            if (!C39608b.this.f102888c) {
                return false;
            }
            for (InteractStickerBaseView interactStickerBaseView : C39608b.this.f102895j) {
                if (interactStickerBaseView != null && interactStickerBaseView.mo98819b(motionEvent)) {
                    C39608b.this.f102901p = interactStickerBaseView.f102976j;
                    C39608b.this.mo98741c();
                    return true;
                }
            }
            if (C39608b.this.f102889d != null) {
                C39608b.this.f102889d.mo103323b();
            }
            if (C39608b.this.f102902q != null && (C39608b.this.f102902q instanceof FragmentActivity)) {
                ((EditViewModel) C36113b.m116288a((FragmentActivity) C39608b.this.f102902q).mo91871a(EditViewModel.class)).mo106443a(true, true);
            }
            return false;
        }

        /* renamed from: a */
        public final boolean mo98458a(C39947b bVar) {
            if (!C39608b.this.f102888c) {
                return false;
            }
            for (InteractStickerBaseView interactStickerBaseView : C39608b.this.f102895j) {
                if (interactStickerBaseView != null && (interactStickerBaseView.mo98815a(bVar) || interactStickerBaseView.f102975i)) {
                    C39608b.this.mo98741c();
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public final boolean mo96390b(ScaleGestureDetector scaleGestureDetector) {
            if (!C39608b.this.f102888c) {
                return false;
            }
            for (InteractStickerBaseView interactStickerBaseView : C39608b.this.f102895j) {
                if (interactStickerBaseView != null && (interactStickerBaseView.mo98821b(scaleGestureDetector) || interactStickerBaseView.f102975i)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public final boolean mo96385a(C39949c cVar) {
            if (!C39608b.this.f102888c) {
                return false;
            }
            for (InteractStickerBaseView interactStickerBaseView : C39608b.this.f102895j) {
                if (interactStickerBaseView != null && (interactStickerBaseView.mo98817a(cVar) || interactStickerBaseView.f102975i)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public final boolean mo98459a(C39947b bVar, float f, float f2) {
            if (!C39608b.this.f102888c) {
                return false;
            }
            for (InteractStickerBaseView interactStickerBaseView : C39608b.this.f102895j) {
                if (interactStickerBaseView != null && (interactStickerBaseView.mo98816a(bVar, f, f2) || interactStickerBaseView.f102975i)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public final boolean mo96383a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (!C39608b.this.f102888c) {
                return false;
            }
            for (InteractStickerBaseView interactStickerBaseView : C39608b.this.f102895j) {
                if (interactStickerBaseView != null && interactStickerBaseView.mo98820b(motionEvent, motionEvent2, f, f2)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public final boolean mo96389b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (!C39608b.this.f102888c) {
                return false;
            }
            for (InteractStickerBaseView interactStickerBaseView : C39608b.this.f102895j) {
                if (interactStickerBaseView != null && interactStickerBaseView.mo98813a(motionEvent, motionEvent2, f, f2)) {
                    return true;
                }
            }
            if (!C39608b.this.f102903r) {
                return false;
            }
            C39608b.this.f102903r = false;
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract InteractStickerBaseView mo98727a(Context context);

    /* renamed from: b */
    public abstract int mo98738b();

    /* renamed from: f */
    public boolean mo98744f() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo98733a(InteractStickerBaseView interactStickerBaseView, boolean z, RectF rectF, float f, float f2) {
        this.f102894i = interactStickerBaseView;
        if (this.f102894i != null) {
            if (z) {
                this.f102894i.setAlpha(1.0f);
            }
            if (z) {
                this.f102908w = true;
            } else if (this.f102908w) {
                mo98729a();
                this.f102908w = false;
            }
            boolean a = C39601a.m126688a(this.f102890e, interactStickerBaseView.getFourAnglePoint());
            PointF a2 = this.f102894i.mo98807a((VESize) null);
            if (this.f102889d != null) {
                m126722a(this.f102894i, this.f102889d.mo103321a((int) (a2.x + ((float) this.f102891f)), (int) (a2.y + ((float) this.f102892g)), z, a));
            }
            if (this.f102896k != null) {
                this.f102896k.mo98711a(z);
            }
        }
    }

    /* renamed from: a */
    public final void mo98736a(boolean z) {
        if (C39805en.m127445a() && this.f102893h != null) {
            VESize c = this.f102893h.mo38828c();
            if (c.f116385a != 0 && c.f116386b != 0) {
                int[] a = C39560al.m126372a(this.f102887b, c.f116385a, c.f116386b);
                this.f102891f = a[0];
                this.f102892g = a[1];
                mo98932l();
            }
        }
    }

    /* renamed from: a */
    public boolean mo98737a(InteractStickerBaseView interactStickerBaseView) {
        if (interactStickerBaseView == null) {
            return false;
        }
        if (interactStickerBaseView.getParent() != null && interactStickerBaseView.getParent() != this.f102887b) {
            return false;
        }
        this.f102887b.removeView(interactStickerBaseView);
        this.f102894i = null;
        if (this.f102896k != null) {
            this.f102896k.mo98712b();
        }
        this.f102895j.remove(interactStickerBaseView);
        this.f102903r = true;
        return true;
    }

    /* renamed from: a */
    public void mo98734a(InteractStickerStruct interactStickerStruct) {
        if (interactStickerStruct != null) {
            NormalTrackTimeStamp a = C39604b.m126708a(interactStickerStruct);
            if (!(a == null || this.f102894i == null)) {
                Point b = m126724b(new PointF(a.getX(), a.getY()));
                PointF a2 = this.f102894i.mo98807a(this.f102898m);
                this.f102894i.mo98809a(((float) b.x) - a2.x, ((float) b.y) - a2.y);
                this.f102894i.mo98822c();
                this.f102894i.mo98808a(-a.getRotation());
                this.f102894i.mo98818b(a.getScale().floatValue());
            }
        }
    }

    /* renamed from: a */
    public final boolean mo98644a(RectF rectF) {
        if (C6311g.m19573a(this.f102895j)) {
            return false;
        }
        for (InteractStickerBaseView fourAnglePoint : this.f102895j) {
            RectF a = C39601a.m126687a(fourAnglePoint.getFourAnglePoint());
            if (a.top >= rectF.top) {
                if (a.bottom > rectF.bottom) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: k */
    private void mo98931k() {
        if (this.f102886a != null) {
            this.f102889d = this.f102886a.getDeleteView();
        }
    }

    /* renamed from: d */
    public final boolean mo98742d() {
        if (this.f102894i == null) {
            return false;
        }
        return this.f102894i.mo98827f();
    }

    /* renamed from: h */
    public void mo98746h() {
        if (this.f102894i != null) {
            mo98737a(this.f102894i);
        }
    }

    /* renamed from: j */
    private void mo98758j() {
        this.f102909x = (StickerHintTextViewModel) C0069x.m159a((FragmentActivity) this.f102902q).mo147a(StickerHintTextViewModel.class);
    }

    /* renamed from: c */
    public final void mo98741c() {
        if (C35563c.f93231M.mo93305a(Property.EnableStickerFunctionalities) && this.f102909x != null) {
            this.f102909x.mo100247a().postValue(Boolean.valueOf(true));
        }
    }

    /* renamed from: e */
    public final void mo98743e() {
        if (this.f102894i != null) {
            this.f102894i.mo98826e();
            if (this.f102909x != null) {
                this.f102909x.mo100247a().postValue(Boolean.valueOf(true));
            }
        }
    }

    /* renamed from: g */
    public final String mo98745g() {
        if (this.f102907v != null) {
            return this.f102907v.replace("interact_sticker.png", "");
        }
        return "";
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final /* synthetic */ void mo98747i() {
        C0052o b = this.f102909x.mo100248b();
        C40379ai aiVar = new C40379ai((((float) this.f102894i.getContentView().getWidth()) / 2.0f) + this.f102894i.getContentView().getX(), this.f102894i.getContentView().getY(), mo98738b(), 2, false);
        b.postValue(aiVar);
    }

    /* renamed from: l */
    private void mo98932l() {
        LayoutParams layoutParams = this.f102887b.getLayoutParams();
        this.f102890e = new Rect(0, 0, layoutParams.width, layoutParams.height);
        if (this.f102894i != null) {
            this.f102894i.mo98810a(this.f102891f, this.f102892g);
        }
        if (this.f102905t != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f102905t.getLayoutParams();
            layoutParams2.width = layoutParams.width;
            layoutParams2.height = layoutParams.height;
            this.f102905t.setLayoutParams(layoutParams2);
        }
        this.f102887b.removeView(this.f102897l);
        this.f102897l = BorderLineView.m126816a(this.f102902q, layoutParams.width, layoutParams.height, this.f102891f, this.f102892g);
        this.f102887b.addView(this.f102897l);
    }

    /* renamed from: a */
    public final void mo98729a() {
        if (this.f102887b != null && this.f102894i != null && this.f102897l != null) {
            if (this.f102904s != null) {
                this.f102904s.run();
            }
            if (this.f102886a != null) {
                this.f102886a.setHightLayerListenerToFirst(this.f102899n);
            }
            if (this.f102887b.getChildCount() > 1 && this.f102887b.getChildAt(this.f102887b.getChildCount() - 1) != this.f102894i) {
                this.f102887b.removeView(this.f102894i);
                this.f102887b.addView(this.f102894i);
            }
            if (this.f102895j.size() > 1 && this.f102895j.get(0) != this.f102894i) {
                this.f102895j.remove(this.f102894i);
                this.f102895j.add(0, this.f102894i);
            }
            if (this.f102897l != null) {
                ViewGroup viewGroup = (ViewGroup) this.f102897l.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(this.f102897l);
                    viewGroup.addView(this.f102897l);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo98735a(String str) {
        this.f102907v = str;
    }

    /* renamed from: a */
    public final void mo98730a(float f) {
        if (this.f102894i != null) {
            this.f102894i.setAlpha(f);
        }
    }

    /* renamed from: b */
    public static float m126723b(float f) {
        return new BigDecimal((double) f).setScale(4, 1).floatValue();
    }

    /* renamed from: a */
    private PointF m126721a(PointF pointF) {
        int i;
        int i2;
        PointF pointF2 = new PointF();
        if (this.f102898m == null) {
            i2 = C39805en.m127447b(this.f102894i.getContext());
            i = C39805en.m127443a(this.f102894i.getContext());
        } else {
            i2 = this.f102898m.f116385a;
            i = this.f102898m.f116386b;
        }
        pointF2.set(m126723b((pointF.x * 1.0f) / ((float) i2)), m126723b((pointF.y * 1.0f) / ((float) i)));
        return pointF2;
    }

    /* renamed from: b */
    private Point m126724b(PointF pointF) {
        int i;
        int i2;
        Point point = new Point();
        if (this.f102898m == null) {
            i2 = C39805en.m127447b(this.f102894i.getContext());
            i = C39805en.m127443a(this.f102894i.getContext());
        } else {
            i2 = this.f102898m.f116385a;
            i = this.f102898m.f116386b;
        }
        point.set((int) (((float) i2) * pointF.x), (int) (((float) i) * pointF.y));
        return point;
    }

    /* renamed from: a */
    public final InteractStickerStruct mo98728a(int i) {
        if (!mo98744f() || this.f102894i == null) {
            return null;
        }
        InteractStickerStruct interactStickerStruct = new InteractStickerStruct();
        interactStickerStruct.setType(i);
        LinkedList linkedList = new LinkedList();
        NormalTrackTimeStamp normalTrackTimeStamp = new NormalTrackTimeStamp();
        normalTrackTimeStamp.setRotation(m126723b(this.f102894i.getRotateAngle()));
        normalTrackTimeStamp.setScale(Float.valueOf(this.f102894i.getScale()));
        PointF a = m126721a(this.f102894i.mo98807a(this.f102898m));
        normalTrackTimeStamp.setX(a.x);
        normalTrackTimeStamp.setY(a.y);
        PointF a2 = m126721a(new PointF((float) this.f102894i.getContentViewWidth(), (float) this.f102894i.getContentViewHeight()));
        normalTrackTimeStamp.setWidth(a2.x);
        normalTrackTimeStamp.setHeight(a2.y);
        linkedList.add(normalTrackTimeStamp);
        C39612d.m126773a(interactStickerStruct, linkedList);
        return interactStickerStruct;
    }

    /* renamed from: b */
    public final void mo98740b(boolean z) {
        if (this.f102894i == null) {
            this.f102894i = mo98727a(this.f102902q);
            this.f102887b.addView(this.f102894i, 0);
            this.f102894i.mo98810a(this.f102891f, this.f102892g);
            this.f102894i.setStickerEditListener(new C39603b() {
                /* renamed from: a */
                public final void mo98718a() {
                    if (C39608b.this.f102896k != null) {
                        C39608b.this.f102896k.mo98710a();
                    }
                }

                /* renamed from: a */
                public final void mo98719a(InteractStickerBaseView interactStickerBaseView) {
                    C39608b.this.mo98737a(interactStickerBaseView);
                }

                /* renamed from: a */
                public final Float mo98717a(float f) {
                    if (C39608b.this.f102897l != null) {
                        return BorderLineView.m126817a(f);
                    }
                    return Float.valueOf(f);
                }

                /* renamed from: b */
                public final boolean mo98722b(float f) {
                    if (C39608b.this.f102897l != null) {
                        return C39608b.this.f102897l.mo98798a(C39608b.this.f102894i.getFourAnglePoint(), f);
                    }
                    return true;
                }

                /* renamed from: c */
                public final boolean mo98724c(float f) {
                    if (C39608b.this.f102897l != null) {
                        return C39608b.this.f102897l.mo98799b(C39608b.this.f102894i.getFourAnglePoint(), f);
                    }
                    return true;
                }

                /* renamed from: a */
                public final void mo98721a(boolean z) {
                    if (C39608b.this.f102896k != null) {
                        C39608b.this.f102896k.mo98713b(z);
                        if (z) {
                            C39608b.this.mo98729a();
                        }
                    }
                }

                /* renamed from: b */
                public final boolean mo98723b(float f, float f2) {
                    if (C39608b.this.f102897l != null) {
                        return C39608b.this.f102897l.mo98800b(C39608b.this.f102894i.getFourAnglePoint(), f, f2);
                    }
                    return true;
                }

                /* renamed from: a */
                public final PointF mo98715a(float f, float f2) {
                    if (C39608b.this.f102897l == null || C39608b.this.f102894i == null) {
                        return new PointF(0.0f, 0.0f);
                    }
                    PointF[] fourAnglePoint = C39608b.this.f102894i.getFourAnglePoint();
                    int length = fourAnglePoint.length;
                    for (int i = 0; i < length; i++) {
                        PointF pointF = fourAnglePoint[i];
                        pointF.x += 0.0f;
                        pointF.y += 0.0f;
                    }
                    return C39608b.this.f102897l.mo98795a(fourAnglePoint, 0.0f, 0.0f);
                }

                /* renamed from: a */
                public final int mo98714a(boolean z, boolean z2, boolean z3) {
                    if (C39608b.this.f102897l != null) {
                        if (z) {
                            C39608b.this.f102897l.mo98797a();
                        } else if (C39608b.this.f102894i != null) {
                            return C39608b.this.f102897l.mo98794a(C39608b.this.f102894i.getFourAnglePoint(), z2, z3);
                        }
                    }
                    return -1;
                }

                /* renamed from: a */
                public final PointF mo98716a(float f, float f2, boolean z) {
                    if (C39608b.this.f102897l == null || C39608b.this.f102894i == null) {
                        return new PointF(0.0f, 0.0f);
                    }
                    PointF[] fourAnglePoint = C39608b.this.f102894i.getFourAnglePoint();
                    int length = fourAnglePoint.length;
                    for (int i = 0; i < length; i++) {
                        PointF pointF = fourAnglePoint[i];
                        pointF.x += f;
                        pointF.y += f2;
                    }
                    return C39608b.this.f102897l.mo98796a(fourAnglePoint, f, f2, z);
                }

                /* renamed from: a */
                public final void mo98720a(InteractStickerBaseView interactStickerBaseView, float f, float f2, RectF rectF, boolean z) {
                    C39608b.this.mo98733a(interactStickerBaseView, z, rectF, f, f2);
                }
            });
            this.f102895j.add(0, this.f102894i);
            if (C35563c.f93231M.mo93305a(Property.EnableStickerFunctionalities) && !z && this.f102909x != null) {
                this.f102894i.postDelayed(new C39611c(this), 500);
            }
        }
    }

    /* renamed from: a */
    private void m126722a(InteractStickerBaseView interactStickerBaseView, int i) {
        if (i == 1) {
            if (interactStickerBaseView instanceof PoiStickerView) {
                interactStickerBaseView.setAlpha(0.3137255f);
            }
        } else if (i == 3) {
            mo98737a(interactStickerBaseView);
        } else if (i == 4 && (interactStickerBaseView instanceof PoiStickerView)) {
            interactStickerBaseView.setAlpha(1.0f);
        }
    }

    /* renamed from: a */
    public void mo98732a(C15389d dVar, boolean z) {
        if (dVar != null && this.f102893h == null) {
            VESize c = dVar.mo38828c();
            if (c.f116385a != 0 && c.f116386b != 0) {
                this.f102893h = dVar;
                int[] a = C39560al.m126373a((View) this.f102887b, c.f116385a, c.f116386b, z);
                this.f102891f = a[0];
                this.f102892g = a[1];
                mo98932l();
            }
        }
    }

    /* renamed from: b */
    public final void mo98739b(Context context, C42061c cVar, FrameLayout frameLayout) {
        this.f102902q = context;
        this.f102887b = frameLayout;
        this.f102886a = null;
        this.f102899n = new C39610a();
        if (this.f102886a != null) {
            this.f102886a.mo103298a(this.f102899n);
        }
        mo98931k();
        mo98758j();
        this.f102906u = new C39607a();
    }

    /* renamed from: a */
    public void mo98731a(Context context, C42061c cVar, FrameLayout frameLayout) {
        this.f102902q = context;
        this.f102887b = frameLayout;
        this.f102886a = cVar;
        this.f102899n = new C39610a();
        if (this.f102886a != null) {
            this.f102886a.mo103299b(this.f102899n);
        }
        mo98931k();
        mo98758j();
        this.f102906u = new C39607a();
    }

    /* renamed from: a */
    public final C1592h<C39613e> mo98726a(String str, int i, int i2, int i3, int i4) {
        if (this.f102894i != null) {
            this.f102894i.mo98826e();
        }
        return this.f102906u.mo98749a(this.f102894i, this.f102887b, str, i, i2, i3, i4);
    }
}
