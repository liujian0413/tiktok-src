package com.p280ss.android.ugc.aweme.shortvideo.edit.audiorecord;

import android.content.Context;
import android.graphics.Color;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.audiorecord.Point;
import com.p280ss.android.ugc.aweme.shortvideo.C38501ax;
import com.p280ss.android.ugc.aweme.utils.C43127fh;
import java.util.Collection;
import java.util.Stack;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.b */
public final class C39472b extends RelativeLayout {

    /* renamed from: a */
    public final ImageView f102460a;

    /* renamed from: b */
    public int f102461b;

    /* renamed from: c */
    public int f102462c = -1;

    /* renamed from: d */
    public int f102463d = -1;

    /* renamed from: e */
    private final C39471a f102464e;

    /* renamed from: f */
    private int f102465f;

    /* renamed from: g */
    private int f102466g;

    /* renamed from: h */
    private int f102467h = -1;

    /* renamed from: i */
    private int f102468i = -1;

    /* renamed from: j */
    private int f102469j = 1;

    /* renamed from: k */
    private C39498d f102470k;

    /* renamed from: l */
    private final int f102471l = 50;

    /* renamed from: m */
    private final C39475c f102472m;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.b$a */
    public static final class C39473a implements OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ C39472b f102473a;

        C39473a(C39472b bVar) {
            this.f102473a = bVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C7573i.m23587b(view, "v");
            C7573i.m23587b(motionEvent, "event");
            switch (motionEvent.getAction()) {
                case 1:
                    this.f102473a.mo98316a(view, motionEvent.getRawX(), true);
                    break;
                case 2:
                    this.f102473a.mo98316a(view, motionEvent.getRawX(), false);
                    break;
                case 3:
                    this.f102473a.mo98316a(view, motionEvent.getRawX(), true);
                    break;
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.b$b */
    static final class C39474b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C39472b f102474a;

        /* renamed from: b */
        final /* synthetic */ float f102475b;

        C39474b(C39472b bVar, float f) {
            this.f102474a = bVar;
            this.f102475b = f;
        }

        public final void run() {
            this.f102474a.mo98312a();
            this.f102474a.mo98314a((int) ((((float) this.f102474a.f102461b) + (((float) (this.f102474a.f102463d - this.f102474a.f102462c)) * this.f102475b)) - ((float) (this.f102474a.f102460a.getWidth() / 2))));
        }
    }

    /* renamed from: b */
    public final void mo98318b() {
        this.f102464e.invalidate();
    }

    /* renamed from: c */
    public final Point mo98320c() {
        if (this.f102464e.getMStack().empty()) {
            return null;
        }
        Point point = (Point) this.f102464e.getMStack().pop();
        mo98318b();
        return point;
    }

    public final Stack<Point> getStack() {
        Stack<Point> stack = new Stack<>();
        stack.addAll(this.f102464e.getMStack());
        return stack;
    }

    /* renamed from: a */
    public final void mo98312a() {
        this.f102462c = this.f102461b;
        this.f102463d = getWidth() - this.f102461b;
        this.f102467h = this.f102462c - (this.f102460a.getWidth() / 2);
        this.f102468i = this.f102463d - (this.f102460a.getWidth() / 2);
    }

    /* renamed from: d */
    private final int m126056d(int i) {
        if (i < this.f102467h) {
            i = this.f102467h;
        }
        if (i > this.f102468i) {
            return this.f102468i;
        }
        return i;
    }

    /* renamed from: a */
    public final void mo98313a(float f) {
        post(new C39474b(this, f));
    }

    /* renamed from: b */
    public final Point mo98317b(int i) {
        Object push = this.f102464e.getMStack().push(new Point(i, i, System.currentTimeMillis()));
        C7573i.m23582a(push, "seekBar.mStack.push(Poin…tem.currentTimeMillis()))");
        return (Point) push;
    }

    /* renamed from: c */
    public final int mo98319c(int i) {
        if (i >= this.f102469j - 1) {
            return i;
        }
        for (Point point : this.f102464e.getMStack()) {
            if (i >= point.getX() && i < point.getY()) {
                return point.getX();
            }
        }
        return -1;
    }

    public final void setStack(Stack<Point> stack) {
        C7573i.m23587b(stack, "s");
        this.f102464e.getMStack().clear();
        Collection collection = stack;
        if (!C6307b.m19566a(collection)) {
            this.f102464e.getMStack().addAll(collection);
        }
        mo98318b();
    }

    /* renamed from: a */
    public final void mo98314a(int i) {
        if (i >= 0) {
            LayoutParams layoutParams = this.f102460a.getLayoutParams();
            if (layoutParams != null) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                if (C43127fh.m136806a(getContext())) {
                    layoutParams2.setMarginEnd(m126056d(i));
                } else {
                    layoutParams2.leftMargin = m126056d(i);
                }
                this.f102460a.setLayoutParams(layoutParams2);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
    }

    public C39472b(Context context, C39475c cVar) {
        C7573i.m23587b(context, "mContext");
        C7573i.m23587b(cVar, "scene");
        super(context);
        this.f102460a = new ImageView(context);
        this.f102464e = new C39471a(context);
        this.f102472m = cVar;
    }

    /* renamed from: a */
    public final int mo98311a(int i, Point point) {
        int i2;
        if (point != null) {
            i2 = point.getX();
        } else {
            i2 = i;
        }
        for (Point point2 : this.f102464e.getMStack()) {
            if (point2.getX() >= i2 && i >= point2.getX() && i <= point2.getY() && (!C7573i.m23585a((Object) point2, (Object) point))) {
                return point2.getX();
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo98316a(View view, float f, boolean z) {
        if (!this.f102472m.f102517n) {
            mo98312a();
            int i = (int) f;
            mo98314a(m126056d(i));
            float d = ((float) ((m126056d(i) + (view.getWidth() / 2)) - this.f102461b)) / ((float) (this.f102463d - this.f102462c));
            if (((double) d) > 0.99d) {
                d = 1.0f;
            }
            if (((double) d) < 0.01d) {
                d = 0.0f;
            }
            C39498d dVar = this.f102470k;
            if (dVar != null) {
                dVar.mo98343a(d, z);
            }
        }
    }

    /* renamed from: a */
    public final void mo98315a(int i, int i2, int i3, int i4, C39498d dVar) {
        this.f102461b = i;
        this.f102465f = i2;
        this.f102466g = i3 * 5;
        this.f102469j = i4;
        this.f102470k = dVar;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.bottomMargin = i2;
        layoutParams.topMargin = i2;
        layoutParams.rightMargin = i;
        layoutParams.leftMargin = i;
        this.f102464e.mo98299a(Color.parseColor("#ccfe2c55"), i4);
        addView(this.f102464e, layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(this.f102466g, -1);
        if (C43127fh.m136806a(getContext())) {
            layoutParams2.addRule(21);
            layoutParams2.setMarginEnd(i - (this.f102466g / 2));
        } else {
            layoutParams2.leftMargin = i - (this.f102466g / 2);
        }
        this.f102460a.setImageDrawable(C38501ax.m123066a(0, -1, 1, (int) C9738o.m28708b(getContext(), 2.0f)));
        this.f102460a.setPadding((int) (((float) this.f102466g) * 0.4f), 0, (int) (((float) this.f102466g) * 0.4f), 0);
        addView(this.f102460a, layoutParams2);
        this.f102460a.setOnTouchListener(new C39473a(this));
    }
}
