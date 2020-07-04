package com.p280ss.android.ugc.aweme.common.keyboard;

import android.content.Context;
import android.graphics.Point;
import android.view.View.MeasureSpec;
import android.view.WindowManager;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.utils.p1695d.C43045c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.common.keyboard.a */
public class C25699a {

    /* renamed from: b */
    private static final String f67630b = "a";

    /* renamed from: a */
    public boolean f67631a;

    /* renamed from: c */
    private int f67632c;

    /* renamed from: d */
    private int f67633d;

    /* renamed from: e */
    private List<C25700b> f67634e;

    /* renamed from: a */
    private boolean m84449a(int i) {
        if (this.f67632c == 0) {
            this.f67632c = i;
            return false;
        } else if (this.f67632c != i) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: b */
    public final void mo66593b(C25700b bVar) {
        if (this.f67634e != null) {
            this.f67634e.remove(bVar);
        }
    }

    /* renamed from: a */
    private static int m84447a(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        Point point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
        return point.y;
    }

    /* renamed from: a */
    public final void mo66592a(C25700b bVar) {
        if (this.f67634e == null) {
            this.f67634e = new ArrayList();
        }
        this.f67634e.add(bVar);
    }

    /* renamed from: b */
    private boolean m84450b(Context context, int i) {
        if (!C43045c.m136574d()) {
            return false;
        }
        int a = m84447a(context);
        if (i <= a && !m84449a(a)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m84448a(boolean z, int i) {
        if (this.f67634e != null) {
            for (C25700b b : this.f67634e) {
                b.mo63163b(z, i);
            }
        }
    }

    /* renamed from: a */
    public final void mo66591a(Context context, int i) {
        int size = MeasureSpec.getSize(i);
        if (!m84450b(context, size)) {
            if (this.f67633d == 0) {
                this.f67633d = size;
            } else if (this.f67633d != size) {
                int i2 = this.f67633d - size;
                if (((float) Math.abs(i2)) >= C9738o.m28708b(context, 80.0f)) {
                    if (i2 > 0) {
                        this.f67631a = true;
                    } else {
                        this.f67631a = false;
                    }
                    m84448a(this.f67631a, Math.abs(i2));
                    this.f67633d = size;
                }
            }
        }
    }
}
