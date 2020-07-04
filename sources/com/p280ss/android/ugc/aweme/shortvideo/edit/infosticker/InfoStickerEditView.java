package com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.bytedance.common.utility.C6311g;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C6892b;
import com.p280ss.android.ugc.aweme.infosticker.InfoStickerModel;
import com.p280ss.android.ugc.aweme.infosticker.StickerItemModel;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.shortvideo.C39804em;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.C39591h.C39597b;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.C39591h.C39598c;
import com.p280ss.android.ugc.aweme.shortvideo.edit.p1563c.C39515a;
import com.p280ss.android.ugc.aweme.shortvideo.edit.p1564d.C39517a;
import com.p280ss.android.ugc.aweme.shortvideo.gesture.p1575a.C39947b;
import com.p280ss.android.ugc.aweme.shortvideo.gesture.p1575a.C39949c;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1600b.C40480c;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1600b.C40485e;
import com.p280ss.android.ugc.aweme.shortvideo.subtitle.C41108b;
import com.p280ss.android.ugc.aweme.shortvideo.subtitle.UtteranceWithWords;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.C42060b;
import com.p280ss.android.ugc.aweme.utils.C42962b;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.ugc.gamora.editor.EditInfoStickerViewModel;
import com.p280ss.android.ugc.gamora.editor.EditLyricStickerViewModel;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.vesdk.VEException;
import com.p280ss.android.vesdk.VESize;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView */
public class InfoStickerEditView extends View {

    /* renamed from: F */
    private static int f102613F = 3000;

    /* renamed from: i */
    public static int f102614i = 1;

    /* renamed from: j */
    public static int f102615j = 2;

    /* renamed from: A */
    public boolean f102616A = false;

    /* renamed from: B */
    public boolean f102617B = C35563c.f93231M.mo93305a(Property.EnableStickerFunctionalities);

    /* renamed from: C */
    public C40480c f102618C = new C40480c(this, new C39540a());

    /* renamed from: D */
    public PointF f102619D = new PointF();

    /* renamed from: E */
    Runnable f102620E = new Runnable() {
        public final void run() {
            if (!(InfoStickerEditView.this.f102641f == null || InfoStickerEditView.this.f102644k == null || InfoStickerEditView.this.f102644k.f102666a == null || !InfoStickerEditView.this.f102644k.f102666a.f102709d)) {
                InfoStickerEditView.this.f102659z = false;
                InfoStickerEditView.this.f102644k.f102666a.f102709d = false;
                InfoStickerEditView.this.f102641f.mo98600c();
                if (InfoStickerEditView.this.f102617B) {
                    InfoStickerEditView.this.f102618C.mo100524a();
                }
                InfoStickerEditView.this.invalidate();
            }
        }
    };

    /* renamed from: G */
    private Point f102621G;

    /* renamed from: H */
    private SafeHandler f102622H;

    /* renamed from: I */
    private VideoPublishEditModel f102623I;

    /* renamed from: J */
    private C6892b<C39558aj> f102624J;

    /* renamed from: K */
    private C6892b<C39558aj> f102625K;

    /* renamed from: L */
    private C39566b f102626L;

    /* renamed from: M */
    private C39597b f102627M;

    /* renamed from: N */
    private Context f102628N;

    /* renamed from: O */
    private boolean f102629O;

    /* renamed from: P */
    private C39542c f102630P;

    /* renamed from: Q */
    private View f102631Q;

    /* renamed from: R */
    private EditInfoStickerViewModel f102632R;

    /* renamed from: S */
    private EditLyricStickerViewModel f102633S;

    /* renamed from: T */
    private InfoStickerViewModel f102634T;

    /* renamed from: U */
    private C39517a f102635U;

    /* renamed from: a */
    public int f102636a;

    /* renamed from: b */
    public int f102637b;

    /* renamed from: c */
    public int f102638c;

    /* renamed from: d */
    public int f102639d;

    /* renamed from: e */
    public C15389d f102640e;

    /* renamed from: f */
    public C39586c f102641f;

    /* renamed from: g */
    public boolean f102642g = true;

    /* renamed from: h */
    public int f102643h;

    /* renamed from: k */
    public C39543d f102644k = new C39543d();

    /* renamed from: l */
    public int f102645l;

    /* renamed from: m */
    public boolean f102646m;

    /* renamed from: n */
    public long f102647n;

    /* renamed from: o */
    public boolean f102648o;

    /* renamed from: p */
    public boolean f102649p;

    /* renamed from: q */
    public float f102650q;

    /* renamed from: r */
    public float f102651r;

    /* renamed from: s */
    public float f102652s;

    /* renamed from: t */
    public float f102653t;

    /* renamed from: u */
    public C39598c f102654u;

    /* renamed from: v */
    public boolean f102655v = true;

    /* renamed from: w */
    public boolean f102656w = true;

    /* renamed from: x */
    public boolean f102657x;

    /* renamed from: y */
    public boolean f102658y;

    /* renamed from: z */
    public boolean f102659z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView$a */
    class C39540a implements C40485e {
        /* renamed from: a */
        public final void mo98454a() {
            InfoStickerEditView.this.mo98431k();
        }

        /* renamed from: b */
        public final void mo98455b() {
            InfoStickerEditView.this.mo98429i();
        }

        /* renamed from: c */
        public final void mo98456c() {
            InfoStickerEditView.this.mo98430j();
        }

        private C39540a() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView$b */
    public interface C39541b {
        /* renamed from: a */
        float mo98457a(float f);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView$c */
    class C39542c extends C42060b {
        private C39542c() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public final /* synthetic */ float mo98461d(float f) {
            return InfoStickerEditView.this.f102654u.mo98685a(f).floatValue();
        }

        /* renamed from: a */
        public final boolean mo96381a(float f) {
            if (!InfoStickerEditView.this.f102642g) {
                return false;
            }
            if (InfoStickerEditView.this.f102644k.f102666a != null && InfoStickerEditView.this.mo98428h() && InfoStickerEditView.this.f102644k.f102666a.f102708c.isLyric()) {
                return false;
            }
            InfoStickerEditView.this.mo98433m();
            return false;
        }

        /* renamed from: b */
        public final void mo98460b(C39947b bVar) {
            if (InfoStickerEditView.this.f102642g) {
                if (InfoStickerEditView.this.f102644k.f102666a == null || !InfoStickerEditView.this.mo98428h() || !InfoStickerEditView.this.f102644k.f102666a.f102708c.isLyric()) {
                    InfoStickerEditView.this.f102654u.mo98683a(InfoStickerEditView.this.f102644k.f102666a, true, false);
                    InfoStickerEditView.this.mo98433m();
                }
            }
        }

        /* renamed from: c */
        public final boolean mo96391c(float f) {
            if (!InfoStickerEditView.this.f102642g) {
                return false;
            }
            if (InfoStickerEditView.this.f102644k.f102666a != null && InfoStickerEditView.this.mo98428h() && InfoStickerEditView.this.f102644k.f102666a.f102708c.isLyric()) {
                return false;
            }
            InfoStickerEditView.this.mo98433m();
            InfoStickerEditView.this.f102654u.mo98683a(InfoStickerEditView.this.f102644k.f102666a, true, true);
            return false;
        }

        /* renamed from: a */
        public final boolean mo96384a(ScaleGestureDetector scaleGestureDetector) {
            if (!InfoStickerEditView.this.f102642g) {
                return false;
            }
            if (InfoStickerEditView.this.f102644k.f102666a != null && InfoStickerEditView.this.mo98428h() && InfoStickerEditView.this.f102644k.f102666a.f102708c.isLyric()) {
                return false;
            }
            InfoStickerEditView.this.mo98403a(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            if (InfoStickerEditView.this.f102644k.f102666a == null) {
                return false;
            }
            InfoStickerEditView.this.f102658y = InfoStickerEditView.this.f102659z;
            InfoStickerEditView.this.f102641f.mo98600c();
            InfoStickerEditView.this.f102641f.mo98589a(InfoStickerEditView.this.f102644k.f102666a, true);
            InfoStickerEditView.this.f102644k.f102666a.f102709d = false;
            InfoStickerEditView.this.f102641f.mo98605d(InfoStickerEditView.this.f102644k.f102666a);
            InfoStickerEditView.this.invalidate();
            return true;
        }

        /* renamed from: b */
        public final boolean mo96387b(float f) {
            if (!InfoStickerEditView.this.f102642g) {
                return false;
            }
            if (InfoStickerEditView.this.f102644k.f102666a != null && InfoStickerEditView.this.mo98428h() && InfoStickerEditView.this.f102644k.f102666a.f102708c.isLyric()) {
                return false;
            }
            if (InfoStickerEditView.this.f102644k.f102666a == null) {
                return super.mo96387b(f);
            }
            InfoStickerEditView.this.f102645l = 2;
            float degrees = (float) Math.toDegrees((double) f);
            if (Math.abs(degrees) > 10.0f) {
                degrees = 0.0f;
            }
            if (4 == InfoStickerEditView.this.f102654u.mo98683a(InfoStickerEditView.this.f102644k.f102666a, false, true)) {
                degrees = InfoStickerEditView.this.f102654u.mo98685a(degrees).floatValue();
            }
            InfoStickerEditView.this.f102641f.mo98585a(InfoStickerEditView.this.f102644k.f102666a, -degrees);
            InfoStickerEditView.this.invalidate();
            return true;
        }

        /* renamed from: e */
        public final boolean mo98462e(MotionEvent motionEvent) {
            int i = 0;
            if (InfoStickerEditView.this.f102648o) {
                InfoStickerEditView.this.f102648o = false;
                return true;
            } else if (InfoStickerEditView.this.f102649p) {
                if (!InfoStickerEditView.this.f102659z) {
                    return false;
                }
                InfoStickerEditView.this.f102659z = false;
                return true;
            } else if (InfoStickerEditView.this.f102641f == null) {
                return false;
            } else {
                float y = motionEvent.getY();
                if (C39805en.m127445a()) {
                    if (C39804em.m127436a()) {
                        i = C39804em.f103459c;
                    }
                    y -= (float) i;
                }
                return InfoStickerEditView.this.f102641f.mo98599b((int) motionEvent.getX(), (int) y);
            }
        }

        /* renamed from: c */
        public final boolean mo96392c(MotionEvent motionEvent) {
            int i;
            InfoStickerEditView.this.f102646m = false;
            float y = motionEvent.getY();
            if (C39805en.m127445a()) {
                if (!C39804em.m127436a()) {
                    i = 0;
                } else {
                    i = C39804em.f103459c;
                }
                y -= (float) i;
            }
            InfoStickerEditView.this.f102650q = motionEvent.getX();
            InfoStickerEditView.this.f102651r = y;
            InfoStickerEditView.this.f102652s = motionEvent.getX();
            InfoStickerEditView.this.f102653t = y;
            InfoStickerEditView.this.f102647n = System.currentTimeMillis();
            InfoStickerEditView.this.f102645l = -1;
            InfoStickerEditView.this.f102644k.mo98463a();
            if (InfoStickerEditView.this.f102642g) {
                InfoStickerEditView.this.mo98413b(motionEvent.getX(), y);
            }
            if ((InfoStickerEditView.this.f102644k.f102666a == null || !InfoStickerEditView.this.mo98428h() || !InfoStickerEditView.this.f102644k.f102666a.f102708c.isLyric()) && InfoStickerEditView.this.f102644k != null && InfoStickerEditView.this.f102644k.f102666a != null && InfoStickerEditView.this.f102644k.f102666a.f102708c.isLyric()) {
                InfoStickerEditView.this.f102640e.mo38769a(InfoStickerEditView.this.f102644k.f102666a.f102708c.f83875id, true);
                InfoStickerEditView.this.f102616A = true;
            }
            return false;
        }

        /* renamed from: a */
        public final boolean mo98458a(C39947b bVar) {
            boolean z;
            boolean z2;
            C39947b bVar2 = bVar;
            if (!InfoStickerEditView.this.f102642g) {
                return false;
            }
            float f = bVar2.f103738h.x;
            float f2 = bVar2.f103738h.y;
            float f3 = InfoStickerEditView.this.f102650q + f;
            float f4 = InfoStickerEditView.this.f102651r + f2;
            float abs = Math.abs(f3 - InfoStickerEditView.this.f102652s);
            float abs2 = Math.abs(f4 - InfoStickerEditView.this.f102653t);
            if ((abs < 5.0f && abs2 < 5.0f) || InfoStickerEditView.this.f102644k.f102666a == null || InfoStickerEditView.this.f102644k.f102666a.f102708c.isSubtitleRule() || ((InfoStickerEditView.this.f102643h == InfoStickerEditView.f102615j && !InfoStickerEditView.this.f102644k.f102666a.f102719o) || ((InfoStickerEditView.this.f102643h == InfoStickerEditView.f102614i && InfoStickerEditView.this.f102644k.f102666a.f102719o) || (InfoStickerEditView.this.mo98428h() && InfoStickerEditView.this.f102644k.f102666a.f102708c.isLyric())))) {
                return false;
            }
            C39590g gVar = null;
            C39598c cVar = InfoStickerEditView.this.f102654u;
            C39558aj ajVar = InfoStickerEditView.this.f102644k.f102666a;
            if (InfoStickerEditView.this.f102644k.f102667b == 3) {
                z = true;
            } else {
                z = false;
            }
            int a = cVar.mo98683a(ajVar, false, z);
            if (3 == a) {
                PointF a2 = InfoStickerEditView.this.f102654u.mo98684a(InfoStickerEditView.this.f102644k.f102666a, f, f2);
                f = a2.x;
                float f5 = a2.y;
                float f6 = InfoStickerEditView.this.f102650q + a2.x;
                float f7 = f6;
                f4 = a2.y + InfoStickerEditView.this.f102651r;
                f2 = f5;
                f3 = f7;
            } else if (4 == a) {
                gVar = new C39590g(this);
            }
            if (InfoStickerEditView.this.f102644k.f102667b == 0 || InfoStickerEditView.this.f102644k.f102667b == 3) {
                if (InfoStickerEditView.this.f102654u != null) {
                    if (InfoStickerEditView.this.f102644k.f102666a.f102709d) {
                        InfoStickerEditView.this.f102658y = true;
                    }
                    C39598c cVar2 = InfoStickerEditView.this.f102654u;
                    C39558aj ajVar2 = InfoStickerEditView.this.f102644k.f102666a;
                    int i = (int) f3;
                    int i2 = (int) f4;
                    if (InfoStickerEditView.this.f102644k.f102667b == 3) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    cVar2.mo98686a(ajVar2, i, i2, false, z2);
                }
                InfoStickerEditView.this.f102650q = f3;
                InfoStickerEditView.this.f102651r = f4;
            }
            InfoStickerEditView.this.f102645l = 2;
            if (InfoStickerEditView.this.f102644k.f102667b == 3) {
                InfoStickerEditView.this.f102641f.mo98587a(InfoStickerEditView.this.f102644k.f102666a, f, f2, gVar);
            } else if (InfoStickerEditView.this.f102644k.f102667b == 0) {
                InfoStickerEditView.this.f102641f.mo98586a(InfoStickerEditView.this.f102644k.f102666a, f, f2);
            }
            InfoStickerEditView.this.f102641f.mo98580a();
            InfoStickerEditView.this.invalidate();
            return true;
        }

        /* renamed from: b */
        public final boolean mo96390b(ScaleGestureDetector scaleGestureDetector) {
            if (!InfoStickerEditView.this.f102642g) {
                return false;
            }
            if (InfoStickerEditView.this.f102644k.f102666a != null && InfoStickerEditView.this.mo98428h() && InfoStickerEditView.this.f102644k.f102666a.f102708c.isLyric()) {
                return false;
            }
            if (InfoStickerEditView.this.f102644k.f102666a == null) {
                return super.mo96390b(scaleGestureDetector);
            }
            InfoStickerEditView.this.f102645l = 2;
            InfoStickerEditView.this.f102641f.mo98597b(InfoStickerEditView.this.f102644k.f102666a, scaleGestureDetector.getScaleFactor());
            InfoStickerEditView.this.invalidate();
            return true;
        }

        /* renamed from: d */
        public final boolean mo96393d(MotionEvent motionEvent) {
            boolean z;
            InfoStickerEditView.this.f102619D.set(motionEvent.getRawX(), motionEvent.getRawY());
            if (!InfoStickerEditView.this.f102642g) {
                return false;
            }
            if (InfoStickerEditView.this.f102644k.f102666a != null && InfoStickerEditView.this.mo98428h() && InfoStickerEditView.this.f102644k.f102666a.f102708c.isLyric()) {
                return false;
            }
            if (InfoStickerEditView.this.f102644k.f102666a != null && InfoStickerEditView.this.f102644k.f102666a.f102708c.isLyric()) {
                InfoStickerEditView.this.f102640e.mo38769a(InfoStickerEditView.this.f102644k.f102666a.f102708c.f83875id, false);
                InfoStickerEditView.this.f102616A = false;
            }
            if (!(InfoStickerEditView.this.f102654u == null || InfoStickerEditView.this.f102644k.f102666a == null || (InfoStickerEditView.this.f102644k.f102667b != 0 && InfoStickerEditView.this.f102644k.f102667b != 3))) {
                C39598c cVar = InfoStickerEditView.this.f102654u;
                C39558aj ajVar = InfoStickerEditView.this.f102644k.f102666a;
                int i = (int) InfoStickerEditView.this.f102650q;
                int i2 = (int) InfoStickerEditView.this.f102651r;
                if (InfoStickerEditView.this.f102644k.f102667b == 3) {
                    z = true;
                } else {
                    z = false;
                }
                cVar.mo98686a(ajVar, i, i2, true, z);
                if ((InfoStickerEditView.this.f102644k.f102666a == null || (InfoStickerEditView.this.f102644k.f102666a != null && !InfoStickerEditView.this.f102644k.f102666a.f102708c.isLyric())) && InfoStickerEditView.this.f102658y) {
                    InfoStickerEditView.this.f102658y = false;
                    if (!InfoStickerEditView.this.f102617B) {
                        InfoStickerEditView.this.setShowHelpBox(true);
                    }
                }
            }
            if (System.currentTimeMillis() - InfoStickerEditView.this.f102647n < 200) {
                if (InfoStickerEditView.this.f102644k.f102666a == null) {
                    InfoStickerEditView.this.f102649p = InfoStickerEditView.this.f102641f.mo98598b();
                    if (InfoStickerEditView.this.f102617B) {
                        InfoStickerEditView.this.f102618C.mo100527b();
                    }
                    InfoStickerEditView.this.invalidate();
                } else {
                    InfoStickerEditView.this.f102649p = false;
                    switch (InfoStickerEditView.this.f102644k.f102667b) {
                        case 0:
                            InfoStickerEditView.this.mo98429i();
                            break;
                        case 1:
                            InfoStickerEditView.this.f102648o = true;
                            InfoStickerEditView.this.f102645l = 1;
                            InfoStickerEditView.this.f102641f.mo98602c(InfoStickerEditView.this.f102644k.f102666a);
                            break;
                        case 2:
                            InfoStickerEditView.this.mo98431k();
                            break;
                    }
                    InfoStickerEditView.this.f102641f.mo98580a();
                    InfoStickerEditView.this.mo98433m();
                    InfoStickerEditView.this.invalidate();
                }
                if (!InfoStickerEditView.this.f102659z) {
                    InfoStickerEditView.this.mo98432l();
                    if (!(InfoStickerEditView.this.f102644k == null || InfoStickerEditView.this.f102644k.f102666a == null)) {
                        InfoStickerEditView.this.f102644k.mo98463a();
                    }
                }
                return true;
            }
            if (!InfoStickerEditView.this.f102659z) {
                InfoStickerEditView.this.mo98432l();
                if (!(InfoStickerEditView.this.f102644k == null || InfoStickerEditView.this.f102644k.f102666a == null)) {
                    InfoStickerEditView.this.f102644k.mo98463a();
                }
            }
            return super.mo96393d(motionEvent);
        }

        /* renamed from: a */
        public final boolean mo96385a(C39949c cVar) {
            if (!InfoStickerEditView.this.f102642g) {
                return false;
            }
            if (InfoStickerEditView.this.f102644k.f102666a != null && InfoStickerEditView.this.mo98428h() && InfoStickerEditView.this.f102644k.f102666a.f102708c.isLyric()) {
                return false;
            }
            InfoStickerEditView.this.mo98403a(cVar.f103743h, cVar.f103744i);
            if (InfoStickerEditView.this.f102644k.f102666a == null) {
                return super.mo96385a(cVar);
            }
            InfoStickerEditView.this.f102658y = InfoStickerEditView.this.f102659z;
            InfoStickerEditView.this.f102641f.mo98600c();
            InfoStickerEditView.this.f102641f.mo98589a(InfoStickerEditView.this.f102644k.f102666a, true);
            InfoStickerEditView.this.f102644k.f102666a.f102709d = false;
            InfoStickerEditView.this.f102641f.mo98605d(InfoStickerEditView.this.f102644k.f102666a);
            InfoStickerEditView.this.invalidate();
            return true;
        }

        /* renamed from: a */
        public final boolean mo98459a(C39947b bVar, float f, float f2) {
            int i;
            if (C39805en.m127445a()) {
                if (!C39804em.m127436a()) {
                    i = 0;
                } else {
                    i = C39804em.f103459c;
                }
                f2 -= (float) i;
            }
            if (!InfoStickerEditView.this.f102642g) {
                return false;
            }
            if (InfoStickerEditView.this.f102644k.f102666a != null && InfoStickerEditView.this.mo98428h() && InfoStickerEditView.this.f102644k.f102666a.f102708c.isLyric()) {
                return false;
            }
            if (InfoStickerEditView.this.f102644k.f102666a == null) {
                InfoStickerEditView.this.mo98403a(f, f2);
            }
            if (InfoStickerEditView.this.f102644k.f102666a == null) {
                return false;
            }
            if (InfoStickerEditView.this.f102644k.f102667b == 3 || InfoStickerEditView.this.f102644k.f102667b == 0) {
                InfoStickerEditView.this.f102658y = InfoStickerEditView.this.f102659z;
                InfoStickerEditView.this.f102641f.mo98600c();
                if (InfoStickerEditView.this.f102617B) {
                    InfoStickerEditView.this.f102618C.mo100527b();
                }
                InfoStickerEditView.this.f102641f.mo98589a(InfoStickerEditView.this.f102644k.f102666a, true);
                InfoStickerEditView.this.f102644k.f102666a.f102709d = false;
                InfoStickerEditView.this.f102641f.mo98605d(InfoStickerEditView.this.f102644k.f102666a);
            }
            InfoStickerEditView.this.invalidate();
            return true;
        }

        /* renamed from: a */
        public final boolean mo96383a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (InfoStickerEditView.this.f102642g && InfoStickerEditView.this.f102644k.f102666a != null) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public final boolean mo96389b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            boolean z;
            if (!InfoStickerEditView.this.f102642g) {
                return false;
            }
            if (InfoStickerEditView.this.f102644k.f102666a != null && InfoStickerEditView.this.mo98428h() && InfoStickerEditView.this.f102644k.f102666a.f102708c.isLyric()) {
                return false;
            }
            StringBuilder sb = new StringBuilder("onFling: ");
            if (InfoStickerEditView.this.f102644k.f102666a == null) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            if (InfoStickerEditView.this.f102646m) {
                InfoStickerEditView.this.f102646m = false;
                return true;
            } else if (InfoStickerEditView.this.f102644k.f102666a != null) {
                return true;
            } else {
                return false;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView$d */
    static class C39543d {

        /* renamed from: a */
        C39558aj f102666a;

        /* renamed from: b */
        int f102667b;

        /* renamed from: c */
        boolean f102668c;

        C39543d() {
        }

        /* renamed from: a */
        public final void mo98463a() {
            this.f102666a = null;
        }
    }

    /* renamed from: b */
    public final void mo98412b() {
        m126270p();
    }

    /* renamed from: c */
    public final void mo98416c() {
        m126270p();
    }

    /* renamed from: d */
    public final void mo98419d() {
        m126270p();
    }

    /* renamed from: e */
    public final void mo98421e() {
        m126270p();
    }

    public C39542c getGestureListener() {
        return this.f102630P;
    }

    public C39517a getPinHelper() {
        return this.f102635U;
    }

    /* renamed from: a */
    public final void mo98406a(FragmentActivity fragmentActivity, SafeHandler safeHandler, C15389d dVar, VideoPublishEditModel videoPublishEditModel, boolean z, View view) {
        this.f102640e = dVar;
        this.f102622H = safeHandler;
        this.f102623I = videoPublishEditModel;
        this.f102628N = fragmentActivity;
        this.f102629O = z;
        this.f102631Q = view;
        this.f102641f = new C39586c(this, this.f102640e, view);
        this.f102630P = new C39542c();
        this.f102632R = (EditInfoStickerViewModel) C36113b.m116288a(fragmentActivity).mo91871a(EditInfoStickerViewModel.class);
        this.f102633S = (EditLyricStickerViewModel) C36113b.m116288a(fragmentActivity).mo91871a(EditLyricStickerViewModel.class);
        this.f102634T = (InfoStickerViewModel) C0069x.m159a(fragmentActivity).mo147a(InfoStickerViewModel.class);
        this.f102618C.f105224g = videoPublishEditModel;
        mo98402a();
    }

    /* renamed from: a */
    public final void mo98410a(boolean z) {
        this.f102642g = z;
        if (!z && this.f102641f.f102808b != null) {
            this.f102641f.mo98600c();
            if (this.f102617B) {
                this.f102618C.mo100527b();
                this.f102641f.mo98580a();
            }
            invalidate();
        }
    }

    /* renamed from: a */
    public final void mo98405a(int i, int i2) {
        this.f102641f.mo98582a(i, i2);
    }

    /* renamed from: a */
    public final void mo98409a(List<UtteranceWithWords> list) {
        this.f102641f.mo98590a(list);
        invalidate();
    }

    /* renamed from: a */
    public final void mo98407a(final InfoStickerModel infoStickerModel) {
        if (this.f102638c == 0 || this.f102639d == 0) {
            getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {

                /* renamed from: a */
                boolean f102660a;

                public final void onGlobalLayout() {
                    InfoStickerEditView.this.mo98402a();
                    if (InfoStickerEditView.this.f102638c > 0 && InfoStickerEditView.this.f102639d > 0 && !this.f102660a) {
                        InfoStickerEditView.this.f102641f.mo98583a(infoStickerModel);
                        this.f102660a = true;
                        InfoStickerEditView.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    }
                }
            });
        } else {
            this.f102641f.mo98583a(infoStickerModel);
        }
    }

    /* renamed from: a */
    public final void mo98408a(C39558aj ajVar, int i, int i2, int i3) {
        this.f102641f.mo98588a(ajVar, i, i2);
    }

    /* renamed from: a */
    public final void mo98411a(boolean z, boolean z2) {
        this.f102641f.mo98593a(z, z2);
    }

    /* renamed from: p */
    private void m126270p() {
        this.f102641f.mo98608f();
        invalidate();
    }

    /* renamed from: g */
    public final void mo98424g() {
        if (this.f102617B) {
            this.f102618C.mo100527b();
        }
    }

    /* renamed from: m */
    public final void mo98433m() {
        this.f102622H.postDelayed(new C39589f(this), 300);
    }

    /* renamed from: n */
    public final void mo98434n() {
        if (this.f102644k != null) {
            this.f102644k.mo98463a();
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f102618C.mo100531f();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f102618C.mo100532g();
    }

    /* renamed from: q */
    private boolean m126271q() {
        if (this.f102634T == null || this.f102634T.f102671c == null) {
            return false;
        }
        return ((Boolean) this.f102634T.f102671c.getValue()).booleanValue();
    }

    /* renamed from: r */
    private boolean m126272r() {
        if (this.f102634T == null || this.f102634T.f102672d == null) {
            return false;
        }
        return ((Boolean) this.f102634T.f102672d.getValue()).booleanValue();
    }

    /* renamed from: s */
    private void m126273s() {
        for (C39558aj ajVar : this.f102641f.f102807a) {
            if (ajVar.f102708c.isPin) {
                m126267a(ajVar);
            }
        }
    }

    /* renamed from: f */
    public final void mo98423f() {
        this.f102659z = false;
        for (C39558aj ajVar : this.f102641f.f102807a) {
            ajVar.f102709d = false;
        }
        invalidate();
    }

    public int getStickNumber() {
        int i = 0;
        for (C39558aj ajVar : this.f102641f.f102807a) {
            if (!ajVar.f102719o) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: h */
    public final boolean mo98428h() {
        if (m126271q() || m126272r()) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final void mo98431k() {
        if (this.f102644k.f102666a == null) {
            setShowHelpBox(false);
            return;
        }
        if (this.f102655v) {
            this.f102645l = 1;
            this.f102641f.mo98584a(this.f102644k.f102666a);
            this.f102641f.mo98603d();
            if (this.f102624J != null) {
                this.f102624J.run(this.f102644k.f102666a);
            }
        }
    }

    /* renamed from: l */
    public final boolean mo98432l() {
        if (this.f102645l == 1) {
            return true;
        }
        if (!(this.f102644k == null || this.f102644k.f102666a == null || this.f102644k.f102667b == 1)) {
            if (this.f102644k.f102668c) {
                this.f102641f.mo98589a(this.f102644k.f102666a, true);
                invalidate();
            } else {
                this.f102641f.mo98607e(this.f102644k.f102666a);
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo98402a() {
        if ((this.f102638c == 0 || this.f102639d == 0) && this.f102640e != null) {
            VESize c = this.f102640e.mo38828c();
            this.f102638c = c.f116385a;
            this.f102639d = c.f116386b;
            this.f102636a = (C39805en.m127447b(getContext()) - this.f102638c) >> 1;
            int i = 0;
            if (C39805en.m127445a()) {
                int f = C39805en.m127453f(this.f102628N);
                if (!C39804em.m127437a(this.f102638c, this.f102639d)) {
                    i = (((C39805en.m127452e(getContext()) - C39804em.m127429a(this.f102628N, f)) - C39804em.m127438b(this.f102628N, f)) - this.f102639d) / 2;
                }
                this.f102637b = i;
                return;
            }
            int e = C39805en.m127452e(getContext());
            if (this.f102629O) {
                i = C39805en.m127450c(this.f102628N);
            }
            this.f102637b = ((e - i) - this.f102639d) >> 1;
        }
    }

    /* renamed from: i */
    public final void mo98429i() {
        boolean z;
        StringBuilder sb = new StringBuilder(" onClickContent");
        boolean z2 = false;
        if (this.f102644k.f102666a == null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        sb.append(" ");
        if (this.f102644k.f102666a == null) {
            z2 = true;
        }
        sb.append(z2);
        sb.append(" ");
        sb.append(!this.f102644k.f102666a.f102708c.isLyric());
        if (this.f102644k.f102666a == null || (!this.f102644k.f102666a.f102708c.isLyric() && !this.f102644k.f102666a.f102719o)) {
            setShowHelpBox(true);
        }
        this.f102645l = 1;
        this.f102641f.mo98610g(this.f102644k.f102666a);
        this.f102632R.mo106247a(this.f102644k.f102666a.f102708c);
    }

    /* renamed from: j */
    public final void mo98430j() {
        if (this.f102644k.f102666a == null) {
            setShowHelpBox(false);
            return;
        }
        this.f102645l = 1;
        C39586c.m126524b(this.f102644k.f102666a);
        this.f102641f.mo98603d();
        if (this.f102625K != null) {
            this.f102625K.run(this.f102644k.f102666a);
        }
        C42962b.f111525a.mo104671a("prop_pin", C22984d.m75611a().mo59973a("enter_from", "video_edit_page").mo59973a("shoot_way", this.f102623I.mShootWay).mo59973a("creation_id", this.f102623I.creationId).mo59973a("content_type", this.f102623I.getAvetParameter().getContentType()).mo59973a("content_source", this.f102623I.getAvetParameter().getContentSource()).mo59973a("prop_id", this.f102644k.f102666a.f102708c.stickerId).f60753a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public final /* synthetic */ void mo98435o() {
        String str;
        String str2;
        C22984d dVar;
        String str3;
        C42962b bVar;
        String str4;
        String str5;
        if (!(this.f102644k == null || this.f102644k.f102666a == null || this.f102645l == -1 || this.f102644k.f102667b == 2)) {
            if (this.f102644k.f102667b == 1) {
                bVar = C42962b.f111525a;
                str3 = "prop_delete";
                C22984d a = C22984d.m75611a().mo59973a("creation_id", this.f102623I.creationId).mo59970a("draft_id", this.f102623I.draftId);
                String str6 = "enter_from";
                if (this.f102657x) {
                    str5 = "edit_post_page";
                } else {
                    str5 = "video_edit_page";
                }
                dVar = a.mo59973a(str6, str5).mo59973a("prop_id", this.f102644k.f102666a.f102708c.stickerId);
                str2 = "shoot_way";
                str = this.f102623I.mShootWay;
            } else if (this.f102645l == 2) {
                bVar = C42962b.f111525a;
                str3 = "prop_adjust";
                C22984d a2 = C22984d.m75611a().mo59973a("creation_id", this.f102623I.creationId).mo59970a("draft_id", this.f102623I.draftId);
                String str7 = "enter_from";
                if (this.f102657x) {
                    str4 = "edit_post_page";
                } else {
                    str4 = "video_edit_page";
                }
                dVar = a2.mo59973a(str7, str4).mo59973a("prop_id", this.f102644k.f102666a.f102708c.stickerId).mo59973a("shoot_way", this.f102623I.mShootWay);
                str2 = "enter_method";
                if (this.f102644k.f102667b == 0) {
                    str = "finger_gesture";
                } else {
                    str = "click_button";
                }
            }
            bVar.mo104671a(str3, dVar.mo59973a(str2, str).f60753a);
        }
    }

    public void setHavePinEdit(boolean z) {
        this.f102656w = z;
    }

    public void setHaveTimeEdit(boolean z) {
        this.f102655v = z;
    }

    public void setITimeEditListener(C39566b bVar) {
        this.f102626L = bVar;
    }

    public void setOnInfoStickerPinEditClick(C6892b<C39558aj> bVar) {
        this.f102625K = bVar;
    }

    public void setOnInfoStickerTimeEdit(C6892b<C39558aj> bVar) {
        this.f102624J = bVar;
    }

    public void setPinHelper(C39517a aVar) {
        this.f102635U = aVar;
    }

    public void setStickerOnMoveListener(C39598c cVar) {
        this.f102654u = cVar;
    }

    public void setStickerOnPlayListener(C39597b bVar) {
        this.f102627M = bVar;
    }

    /* renamed from: a */
    public final int mo98398a(StickerItemModel stickerItemModel) {
        return this.f102641f.mo98576a(stickerItemModel);
    }

    /* renamed from: b */
    public final void mo98414b(int i) {
        this.f102641f.mo98596b(i);
    }

    /* renamed from: c */
    public final void mo98417c(int i) {
        this.f102641f.mo98601c(i);
    }

    /* renamed from: d */
    public final void mo98420d(int i) {
        this.f102641f.mo98604d(i);
    }

    /* renamed from: e */
    public final void mo98422e(int i) {
        this.f102641f.f102809c = i;
    }

    public void setLyricItem(C39558aj ajVar) {
        this.f102633S.mo106270a(ajVar);
    }

    public void setStickerDataChangeListener(C39544a aVar) {
        this.f102641f.f102810d = aVar;
    }

    public void setSubtitleCallBack(C41108b bVar) {
        this.f102641f.f102812f = bVar;
    }

    /* renamed from: a */
    public final int mo98399a(UtteranceWithWords utteranceWithWords) {
        return this.f102641f.mo98577a(utteranceWithWords);
    }

    /* renamed from: b */
    public final void mo98415b(boolean z) {
        if (z) {
            this.f102641f.mo98608f();
        } else {
            this.f102641f.mo98603d();
        }
    }

    /* renamed from: c */
    public final void mo98418c(boolean z) {
        this.f102641f.mo98591a(z);
    }

    public void setDefaultColor(int i) {
        this.f102633S.mo106274b(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (C39558aj ajVar : this.f102641f.f102807a) {
            ajVar.f102717l = this.f102655v;
            ajVar.mo98488a(canvas);
        }
    }

    public InfoStickerEditView(Context context) {
        super(context);
    }

    /* renamed from: a */
    private void m126267a(C39558aj ajVar) {
        float[] g = this.f102640e.mo38849g(ajVar.f102708c.f83875id);
        float f = -this.f102640e.mo38874s(ajVar.f102708c.f83875id);
        float r = this.f102640e.mo38872r(ajVar.f102708c.f83875id);
        if (r > 0.0f) {
            ajVar.f102708c.scale = r;
            ajVar.mo98492b(r / ajVar.f102718m);
        }
        ajVar.f102708c.rotateAngle = f;
        ajVar.mo98485a(f - ajVar.mo98497d());
        RectF rectF = ajVar.f102710e;
        float centerX = (((((g[2] - g[0]) / 2.0f) + g[0]) * ((float) this.f102638c)) + ((float) this.f102636a)) - rectF.centerX();
        float centerY = (((((g[1] - g[3]) / 2.0f) + g[3]) * ((float) this.f102639d)) + ((float) this.f102637b)) - rectF.centerY();
        ajVar.mo98486a(centerX, centerY);
        ajVar.f102708c.currentOffsetX += centerX / ((float) this.f102638c);
        ajVar.f102708c.currentOffsetY += centerY / ((float) this.f102639d);
        this.f102640e.mo38749a(ajVar.f102708c.f83875id, ajVar.f102708c.currentOffsetX, ajVar.f102708c.currentOffsetY);
    }

    public void setShowHelpBox(boolean z) {
        boolean z2;
        this.f102659z = z;
        if (!(this.f102644k == null || this.f102644k.f102666a == null || this.f102644k.f102666a.f102719o)) {
            C39558aj ajVar = this.f102644k.f102666a;
            if (!this.f102644k.f102666a.mo98489a() || !z) {
                z2 = false;
            } else {
                z2 = true;
            }
            ajVar.f102709d = z2;
        }
        if (!(this.f102620E == null || this.f102622H == null)) {
            this.f102622H.removeCallbacks(this.f102620E);
        }
        if (z && this.f102622H != null) {
            this.f102622H.postDelayed(this.f102620E, (long) f102613F);
        }
        if (this.f102617B) {
            if (!z) {
                this.f102618C.mo100527b();
            } else if (this.f102626L != null && !this.f102626L.mo98512a() && !this.f102626L.mo98513b()) {
                this.f102618C.mo100525a(this.f102644k.f102666a.f102711f, (int) this.f102619D.x, (int) this.f102619D.y, this.f102644k.f102666a.mo98497d());
            }
        }
        invalidate();
    }

    /* renamed from: a */
    public final void mo98404a(int i) {
        this.f102641f.mo98581a(i);
    }

    public InfoStickerEditView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: b */
    public final void mo98413b(float f, float f2) {
        if (this.f102643h == f102615j || !C6311g.m19573a(this.f102641f.f102807a)) {
            m126273s();
            int m = this.f102640e.mo38862m();
            for (C39558aj ajVar : this.f102641f.f102807a) {
                if (!ajVar.f102708c.isSubtitleRule() && ((this.f102643h != f102615j || ajVar.f102719o) && ((this.f102643h != f102614i || !ajVar.f102719o) && this.f102641f.mo98594a(ajVar, m) && !this.f102641f.mo98613j(ajVar)))) {
                    if (!this.f102617B) {
                        int b = m126269b(ajVar, f, f2);
                        if (b >= 0 && (this.f102644k.f102666a == null || C39586c.m126518a(ajVar, this.f102644k.f102666a) > 0)) {
                            this.f102644k.f102666a = ajVar;
                            this.f102644k.f102667b = b;
                            this.f102644k.f102668c = true;
                        }
                    }
                    if (m126268a(ajVar, f, f2) && (this.f102644k.f102666a == null || C39586c.m126518a(ajVar, this.f102644k.f102666a) > 0)) {
                        this.f102644k.f102666a = ajVar;
                        this.f102644k.f102667b = 0;
                        this.f102644k.f102668c = ajVar.f102709d;
                    }
                }
            }
            if (!(this.f102644k.f102666a == null || this.f102635U == null)) {
                if (this.f102644k.f102666a.f102708c.isPin) {
                    this.f102635U.mo98366a(this.f102644k.f102666a);
                    m126267a(this.f102644k.f102666a);
                    this.f102644k.f102666a.f102708c.setPin(false);
                    C7276d.m22816c(this.f102644k.f102666a.f102708c.pinAlgorithmFile);
                    this.f102644k.f102666a.f102708c.setPinAlgorithmFile(null);
                } else if (!TextUtils.isEmpty(this.f102644k.f102666a.f102708c.pinAlgorithmFile) && C7276d.m22812b(this.f102644k.f102666a.f102708c.pinAlgorithmFile)) {
                    C7276d.m22816c(this.f102644k.f102666a.f102708c.pinAlgorithmFile);
                    this.f102644k.f102666a.f102708c.setPinAlgorithmFile(null);
                }
            }
            if (this.f102643h == f102615j && this.f102644k.f102666a == null) {
                this.f102627M.mo98476a();
            }
            if (this.f102644k.f102666a == null || !((Boolean) this.f102634T.f102671c.getValue()).booleanValue() || !this.f102644k.f102666a.f102708c.isLyric()) {
                this.f102641f.mo98609f(this.f102644k.f102666a);
            }
        }
    }

    /* renamed from: a */
    public final void mo98403a(float f, float f2) {
        if (!C6311g.m19573a(this.f102641f.f102807a)) {
            int m = this.f102640e.mo38862m();
            for (C39558aj ajVar : this.f102641f.f102807a) {
                if (!ajVar.f102708c.isSubtitleRule() && ((this.f102643h != f102615j || ajVar.f102719o) && ((this.f102643h != f102614i || !ajVar.f102719o) && this.f102641f.mo98594a(ajVar, m) && !this.f102641f.mo98613j(ajVar) && m126268a(ajVar, f, f2)))) {
                    if (this.f102644k.f102666a == null || C39586c.m126518a(ajVar, this.f102644k.f102666a) > 0) {
                        this.f102644k.f102666a = ajVar;
                        this.f102644k.f102667b = 0;
                        this.f102644k.f102668c = ajVar.f102709d;
                    }
                }
            }
            this.f102641f.mo98609f(this.f102644k.f102666a);
        }
    }

    /* renamed from: b */
    private static int m126269b(C39558aj ajVar, float f, float f2) {
        int i = -1;
        if (!ajVar.f102709d) {
            return -1;
        }
        if (ajVar.f102714i.contains(f, f2)) {
            i = 1;
        } else if (ajVar.f102715j.contains(f, f2)) {
            i = 2;
        } else if (ajVar.f102713h.contains(f, f2)) {
            i = 3;
        }
        return i;
    }

    public InfoStickerEditView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    private boolean m126268a(C39558aj ajVar, float f, float f2) {
        C39558aj ajVar2 = ajVar;
        if (ajVar2 == null || ajVar2.f102711f == null) {
            return false;
        }
        if (this.f102621G == null) {
            this.f102621G = new Point(0, 0);
        }
        this.f102621G.set((int) f, (int) f2);
        if (ajVar2.f102708c.isLyric() && !this.f102616A) {
            try {
                float[] h = this.f102640e.mo38852h(ajVar2.f102708c.f83875id);
                VESize c = this.f102640e.mo38828c();
                RectF rectF = new RectF();
                rectF.set(h[0] * ((float) c.f116385a), h[3] * ((float) c.f116386b), h[2] * ((float) c.f116385a), h[1] * ((float) c.f116386b));
                float[] fArr = new float[2];
                this.f102640e.mo38770a(ajVar2.f102708c.f83875id, fArr);
                ajVar.mo98487a(this.f102638c, this.f102639d, this.f102636a, this.f102637b, fArr[0], fArr[1], rectF.width(), rectF.height());
                RectF rectF2 = ajVar2.f102711f;
                rectF2.centerX();
                rectF2.centerY();
                this.f102641f.f102813g = fArr;
            } catch (VEException unused) {
                StringBuilder sb = new StringBuilder("getInfoStickerBoundingBox error in detectInItemContent, index is ");
                sb.append(ajVar2.f102708c.f83875id);
                sb.append(" veState is ");
                sb.append(this.f102640e.mo38850h().getValue());
                C41530am.m132283b(sb.toString());
                return false;
            }
        }
        C39515a.m126214a(this.f102621G, ajVar2.f102711f.centerX(), ajVar2.f102711f.centerY(), -ajVar.mo98497d());
        return ajVar2.f102711f.contains((float) this.f102621G.x, (float) this.f102621G.y);
    }

    /* renamed from: a */
    public final C39558aj mo98400a(String str, String str2, String str3, int i) {
        C39558aj a = this.f102641f.mo98578a(str, str2, str3, i, false, false);
        invalidate();
        return a;
    }

    public InfoStickerEditView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    public final C39558aj mo98401a(String str, String str2, String str3, String str4, int i, String str5) {
        C39558aj a = this.f102641f.mo98579a(str, str2, str3, str4, i, str5);
        invalidate();
        return a;
    }
}
