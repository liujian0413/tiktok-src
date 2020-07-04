package com.p280ss.android.ugc.aweme.longvideo.view;

import android.content.Context;
import android.os.Message;
import android.support.p022v4.util.C0902i;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.p280ss.android.ugc.aweme.common.widget.DiggLayout;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.longvideo.view.DoubleClickDiggFrameLayout */
public final class DoubleClickDiggFrameLayout extends DiggLayout implements C6310a {

    /* renamed from: e */
    private final int f85398e;

    /* renamed from: f */
    private final int f85399f;

    /* renamed from: g */
    private float f85400g;

    /* renamed from: h */
    private float f85401h;

    /* renamed from: i */
    private int f85402i;

    /* renamed from: j */
    private int f85403j;

    /* renamed from: k */
    private int f85404k;

    /* renamed from: l */
    private int f85405l;

    /* renamed from: m */
    private boolean f85406m;

    /* renamed from: n */
    private boolean f85407n;

    /* renamed from: o */
    private boolean f85408o;

    /* renamed from: p */
    private MotionEvent f85409p;

    /* renamed from: q */
    private MotionEvent f85410q;

    /* renamed from: r */
    private C6309f f85411r;

    /* renamed from: s */
    private C32757a f85412s;

    /* renamed from: com.ss.android.ugc.aweme.longvideo.view.DoubleClickDiggFrameLayout$a */
    public interface C32757a {
        /* renamed from: a */
        void mo64984a();

        /* renamed from: b */
        void mo64985b();
    }

    public final C6309f getMHandler() {
        return this.f85411r;
    }

    public final int getMSG_AUTO_CLEAN() {
        return this.f85399f;
    }

    public final int getMSG_TAP() {
        return this.f85398e;
    }

    public final void setMHandler(C6309f fVar) {
        this.f85411r = fVar;
    }

    public DoubleClickDiggFrameLayout(Context context) {
        this(context, null);
    }

    public final void setOnDiggListener(C32757a aVar) {
        C7573i.m23587b(aVar, "listener");
        this.f85412s = aVar;
    }

    /* renamed from: b */
    private final void m106028b(MotionEvent motionEvent) {
        if (motionEvent != null) {
            mo66634a(motionEvent.getX(), motionEvent.getY());
            C32757a aVar = this.f85412s;
            if (aVar != null) {
                aVar.mo64984a();
            }
        }
    }

    public final void handleMsg(Message message) {
        Integer num;
        if (message != null) {
            num = Integer.valueOf(message.what);
        } else {
            num = null;
        }
        int i = this.f85398e;
        if (num != null && num.intValue() == i) {
            C32757a aVar = this.f85412s;
            if (aVar != null) {
                aVar.mo64985b();
            }
            C6309f fVar = this.f85411r;
            if (fVar != null) {
                fVar.removeMessages(this.f85399f);
            }
        } else {
            int i2 = this.f85399f;
            if (num != null && num.intValue() == i2) {
                C6309f fVar2 = this.f85411r;
                if (fVar2 != null) {
                    fVar2.removeMessages(this.f85399f);
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo84250a(MotionEvent motionEvent) {
        Message message;
        if (motionEvent == null) {
            return super.onTouchEvent(motionEvent);
        }
        switch (motionEvent.getAction()) {
            case 0:
                C6309f fVar = this.f85411r;
                if (fVar != null && fVar.hasMessages(this.f85398e)) {
                    C6309f fVar2 = this.f85411r;
                    if (fVar2 != null) {
                        fVar2.removeMessages(this.f85398e);
                    }
                }
                C6309f fVar3 = this.f85411r;
                if (fVar3 != null && fVar3.hasMessages(this.f85399f)) {
                    C6309f fVar4 = this.f85411r;
                    if (fVar4 != null) {
                        fVar4.removeMessages(this.f85399f);
                    }
                }
                this.f85408o = false;
                if (m106027a(this.f85409p, this.f85410q, motionEvent)) {
                    this.f85408o = true;
                    m106028b(this.f85409p);
                }
                MotionEvent motionEvent2 = this.f85409p;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                this.f85409p = MotionEvent.obtain(motionEvent);
                this.f85407n = true;
                this.f85406m = true;
                this.f85400g = motionEvent.getX();
                this.f85401h = motionEvent.getY();
                break;
            case 1:
                if (this.f85407n) {
                    if (!this.f85408o && m106026a(this.f85409p, motionEvent)) {
                        C6309f fVar5 = this.f85411r;
                        if (fVar5 != null) {
                            C6309f fVar6 = this.f85411r;
                            if (fVar6 != null) {
                                message = fVar6.obtainMessage(this.f85398e, new C0902i(Float.valueOf(this.f85400g), Float.valueOf(this.f85401h)));
                            } else {
                                message = null;
                            }
                            long doubleTapTimeout = ((long) ViewConfiguration.getDoubleTapTimeout()) - motionEvent.getEventTime();
                            MotionEvent motionEvent3 = this.f85409p;
                            if (motionEvent3 == null) {
                                C7573i.m23580a();
                            }
                            fVar5.sendMessageDelayed(message, doubleTapTimeout + motionEvent3.getEventTime());
                        }
                    }
                    MotionEvent motionEvent4 = this.f85410q;
                    if (motionEvent4 != null) {
                        motionEvent4.recycle();
                    }
                    this.f85410q = MotionEvent.obtain(motionEvent);
                    break;
                }
                break;
            case 2:
                int x = (int) (motionEvent.getX() - this.f85400g);
                int y = (int) (motionEvent.getY() - this.f85401h);
                int i = (x * x) + (y * y);
                if (i > this.f85404k || Math.abs(x) >= this.f85403j) {
                    this.f85407n = false;
                    C6309f fVar7 = this.f85411r;
                    if (fVar7 != null) {
                        fVar7.removeMessages(this.f85398e);
                    }
                }
                if (i > this.f85405l) {
                    this.f85406m = false;
                    break;
                }
                break;
        }
        return true;
    }

    public DoubleClickDiggFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private final boolean m106026a(MotionEvent motionEvent, MotionEvent motionEvent2) {
        if (motionEvent == null || motionEvent2 == null || !this.f85407n) {
            return false;
        }
        return true;
    }

    public DoubleClickDiggFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f85399f = 1;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        C7573i.m23582a((Object) viewConfiguration, "ViewConfiguration.get(context)");
        this.f85402i = viewConfiguration.getScaledDoubleTapSlop();
        ViewConfiguration viewConfiguration2 = ViewConfiguration.get(getContext());
        C7573i.m23582a((Object) viewConfiguration2, "ViewConfiguration.get(context)");
        this.f85403j = viewConfiguration2.getScaledTouchSlop() * 3;
        this.f85404k = this.f85403j * this.f85403j;
        this.f85405l = this.f85402i * this.f85402i;
        this.f85411r = new C6309f(this);
    }

    /* renamed from: a */
    private final boolean m106027a(MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3) {
        if (motionEvent == null || motionEvent2 == null || motionEvent3 == null || !this.f85406m) {
            return false;
        }
        long eventTime = motionEvent3.getEventTime() - motionEvent2.getEventTime();
        if (eventTime > ((long) ViewConfiguration.getDoubleTapTimeout()) || eventTime < 40) {
            return false;
        }
        int x = ((int) motionEvent.getX()) - ((int) motionEvent3.getX());
        int y = ((int) motionEvent.getY()) - ((int) motionEvent3.getY());
        if ((x * x) + (y * y) < this.f85405l) {
            return true;
        }
        return false;
    }
}
