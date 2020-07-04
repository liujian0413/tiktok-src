package com.zhihu.matisse;

import android.app.Activity;
import android.content.Intent;
import android.support.p022v4.app.Fragment;
import com.zhihu.matisse.internal.entity.C47338d;
import com.zhihu.matisse.p1853a.C47322a;
import com.zhihu.matisse.p1857ui.MatisseActivity;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: com.zhihu.matisse.b */
public final class C47323b {

    /* renamed from: a */
    private final C47321a f121420a;

    /* renamed from: b */
    private final C47338d f121421b = C47338d.m147804b();

    /* renamed from: a */
    public final C47323b mo119333a(float f) {
        this.f121421b.f121459o = 0.85f;
        return this;
    }

    /* renamed from: b */
    public final C47323b mo119338b(boolean z) {
        this.f121421b.f121450f = z;
        return this;
    }

    /* renamed from: c */
    public final C47323b mo119339c(int i) {
        this.f121421b.f121449e = -1;
        return this;
    }

    /* renamed from: d */
    public final C47323b mo119341d(int i) {
        this.f121421b.f121458n = i;
        return this;
    }

    /* renamed from: a */
    public final C47323b mo119334a(int i) {
        this.f121421b.f121448d = R.style.gv;
        return this;
    }

    /* renamed from: c */
    public final C47323b mo119340c(boolean z) {
        this.f121421b.f121455k = false;
        return this;
    }

    /* renamed from: a */
    public final C47323b mo119335a(C47322a aVar) {
        if (this.f121421b.f121454j == null) {
            this.f121421b.f121454j = new ArrayList();
        }
        this.f121421b.f121454j.add(aVar);
        return this;
    }

    /* renamed from: e */
    public final void mo119342e(int i) {
        Activity a = this.f121420a.mo119330a();
        if (a != null) {
            Intent intent = new Intent(a, MatisseActivity.class);
            Fragment b = this.f121420a.mo119332b();
            if (b != null) {
                b.startActivityForResult(intent, i);
            } else {
                a.startActivityForResult(intent, i);
            }
        }
    }

    /* renamed from: a */
    public final C47323b mo119336a(boolean z) {
        this.f121421b.f121447c = true;
        return this;
    }

    /* renamed from: b */
    public final C47323b mo119337b(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSelectable must be greater than or equal to one");
        } else if (this.f121421b.f121452h > 0 || this.f121421b.f121453i > 0) {
            throw new IllegalStateException("already set maxImageSelectable and maxVideoSelectable");
        } else {
            this.f121421b.f121451g = i;
            return this;
        }
    }

    C47323b(C47321a aVar, Set<MimeType> set, boolean z) {
        this.f121420a = aVar;
        this.f121421b.f121445a = set;
        this.f121421b.f121446b = z;
        this.f121421b.f121449e = -1;
    }
}
