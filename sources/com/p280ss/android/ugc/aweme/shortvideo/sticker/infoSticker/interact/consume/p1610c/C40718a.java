package com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p1610c;

import android.app.Activity;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.C40732b;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p1611d.C40719a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p1611d.C40722d;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p1611d.C40724f;
import com.p280ss.android.ugc.aweme.sticker.C41850e;
import com.p280ss.android.ugc.aweme.sticker.p1633a.C41841a;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.c.a */
public final class C40718a implements OnTouchListener, C6310a {

    /* renamed from: a */
    public int f105855a;

    /* renamed from: b */
    public float f105856b;

    /* renamed from: c */
    public float f105857c;

    /* renamed from: d */
    public int f105858d;

    /* renamed from: e */
    public int f105859e;

    /* renamed from: f */
    public int f105860f = (this.f105859e * this.f105859e);

    /* renamed from: g */
    public int f105861g = (this.f105858d * this.f105858d);

    /* renamed from: h */
    public boolean f105862h;

    /* renamed from: i */
    public boolean f105863i;

    /* renamed from: j */
    public boolean f105864j;

    /* renamed from: k */
    public MotionEvent f105865k;

    /* renamed from: l */
    public MotionEvent f105866l;

    /* renamed from: m */
    public int f105867m = -1;

    /* renamed from: n */
    public C6309f f105868n = new C6309f(this);

    /* renamed from: o */
    public final Activity f105869o;

    /* renamed from: p */
    public List<C40732b> f105870p;

    /* renamed from: q */
    public C41850e f105871q;

    /* renamed from: r */
    public C40724f f105872r;

    /* renamed from: s */
    public final C40719a f105873s;

    /* renamed from: a */
    public final void mo100889a(List<C40732b> list) {
        C7573i.m23587b(list, "interactStickers");
        this.f105870p = list;
    }

    public final void handleMsg(Message message) {
        Integer num;
        long j;
        if (message != null) {
            num = Integer.valueOf(message.what);
        } else {
            num = null;
        }
        int i = this.f105855a;
        if (num != null && num.intValue() == i) {
            C40719a aVar = this.f105873s;
            C40724f fVar = this.f105872r;
            if (fVar != null) {
                j = fVar.mo71677ai();
            } else {
                j = 0;
            }
            Object obj = message.obj;
            if (obj != null) {
                aVar.mo100892a(j, (MotionEvent) obj);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.MotionEvent");
            }
        }
    }

    /* renamed from: a */
    private final boolean m130178a(MotionEvent motionEvent, MotionEvent motionEvent2) {
        if (motionEvent == null || motionEvent2 == null) {
            return false;
        }
        return this.f105863i;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Integer num;
        long j;
        long j2;
        Message message = null;
        if (motionEvent != null) {
            num = Integer.valueOf(motionEvent.getAction());
        } else {
            num = null;
        }
        long j3 = 0;
        if (num != null && num.intValue() == 0) {
            C6309f fVar = this.f105868n;
            if (fVar != null && fVar.hasMessages(this.f105855a)) {
                C6309f fVar2 = this.f105868n;
                if (fVar2 != null) {
                    fVar2.removeMessages(this.f105855a);
                }
            }
            MotionEvent motionEvent2 = this.f105865k;
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            this.f105865k = MotionEvent.obtain(motionEvent);
            this.f105863i = true;
            this.f105862h = true;
            this.f105856b = motionEvent.getX();
            this.f105857c = motionEvent.getY();
            this.f105867m = -1;
            for (C40732b bVar : this.f105870p) {
                C40722d dVar = bVar.f105906d;
                C40724f fVar3 = this.f105872r;
                if (fVar3 != null) {
                    j2 = fVar3.mo71677ai();
                } else {
                    j2 = 0;
                }
                if (dVar.mo100894a(j2, bVar.f105906d.mo100902c(), motionEvent.getX(), motionEvent.getY())) {
                    this.f105867m = bVar.f105906d.mo100902c();
                    C41850e eVar = this.f105871q;
                    if (eVar != null) {
                        C41841a aVar = eVar.f108859l;
                        if (aVar != null) {
                            aVar.mo71721a(bVar.f105906d.mo100902c(), motionEvent);
                        }
                    }
                    return true;
                }
            }
            return false;
        }
        if (num != null && num.intValue() == 2) {
            int x = (int) (motionEvent.getX() - this.f105856b);
            int y = (int) (motionEvent.getY() - this.f105857c);
            int i = (x * x) + (y * y);
            if (i > this.f105860f || Math.abs(x) >= this.f105859e) {
                this.f105863i = false;
                C6309f fVar4 = this.f105868n;
                if (fVar4 != null) {
                    fVar4.removeMessages(this.f105855a);
                }
            }
            if (i > this.f105861g) {
                this.f105862h = false;
            }
        } else {
            if (num != null && num.intValue() == 1 && this.f105863i) {
                this.f105864j = false;
                if (m130179a(this.f105865k, this.f105866l, motionEvent)) {
                    this.f105864j = true;
                    C40719a aVar2 = this.f105873s;
                    C40724f fVar5 = this.f105872r;
                    if (fVar5 != null) {
                        j = fVar5.mo71677ai();
                    } else {
                        j = 0;
                    }
                    aVar2.mo100891a(j, this.f105867m, this.f105865k);
                }
                if (!this.f105864j && m130178a(this.f105865k, motionEvent)) {
                    C6309f fVar6 = this.f105868n;
                    if (fVar6 != null) {
                        message = fVar6.obtainMessage(this.f105855a);
                    }
                    if (message != null) {
                        message.obj = this.f105865k;
                    }
                    C6309f fVar7 = this.f105868n;
                    if (fVar7 != null) {
                        long doubleTapTimeout = ((long) ViewConfiguration.getDoubleTapTimeout()) - motionEvent.getEventTime();
                        MotionEvent motionEvent3 = this.f105865k;
                        if (motionEvent3 != null) {
                            j3 = motionEvent3.getEventTime();
                        }
                        fVar7.sendMessageDelayed(message, doubleTapTimeout + j3);
                    }
                }
                MotionEvent motionEvent4 = this.f105866l;
                if (motionEvent4 != null) {
                    motionEvent4.recycle();
                }
                this.f105866l = MotionEvent.obtain(motionEvent);
            }
            return false;
        }
        return false;
    }

    /* renamed from: a */
    private final boolean m130179a(MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3) {
        if (motionEvent == null || motionEvent2 == null || motionEvent3 == null || !this.f105862h) {
            return false;
        }
        long eventTime = motionEvent3.getEventTime() - motionEvent2.getEventTime();
        if (eventTime > ((long) ViewConfiguration.getDoubleTapTimeout()) || eventTime < 40) {
            return false;
        }
        int x = ((int) motionEvent.getX()) - ((int) motionEvent3.getX());
        int y = ((int) motionEvent.getY()) - ((int) motionEvent3.getY());
        if ((x * x) + (y * y) < this.f105861g) {
            return true;
        }
        return false;
    }

    public C40718a(Activity activity, List<C40732b> list, C41850e eVar, C40724f fVar, C40719a aVar) {
        C7573i.m23587b(activity, "activity");
        C7573i.m23587b(list, "interactStickers");
        C7573i.m23587b(aVar, "clickHandle");
        this.f105869o = activity;
        this.f105870p = list;
        this.f105871q = eVar;
        this.f105872r = fVar;
        this.f105873s = aVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(this.f105869o);
        C7573i.m23582a((Object) viewConfiguration, "ViewConfiguration.get(activity)");
        this.f105858d = viewConfiguration.getScaledDoubleTapSlop();
        ViewConfiguration viewConfiguration2 = ViewConfiguration.get(this.f105869o);
        C7573i.m23582a((Object) viewConfiguration2, "ViewConfiguration.get(activity)");
        this.f105859e = viewConfiguration2.getScaledTouchSlop() * 3;
    }
}
