package com.p280ss.android.ugc.aweme.common.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.common.widget.LoadingStatusView */
public class LoadingStatusView extends FrameLayout {

    /* renamed from: a */
    List<View> f67767a;

    /* renamed from: b */
    private final String f67768b;

    /* renamed from: c */
    private int f67769c;

    /* renamed from: com.ss.android.ugc.aweme.common.widget.LoadingStatusView$a */
    public static class C25732a {

        /* renamed from: a */
        Context f67770a;

        /* renamed from: b */
        View f67771b;

        /* renamed from: c */
        View f67772c;

        /* renamed from: d */
        View f67773d;

        /* renamed from: e */
        int f67774e;

        /* renamed from: a */
        private TextView m84515a() {
            TextView textView = (TextView) LayoutInflater.from(this.f67770a).inflate(R.layout.b2x, null);
            textView.setGravity(1);
            textView.setPadding(0, (int) C9738o.m28708b(this.f67770a, 100.0f), 0, 0);
            if (this.f67774e != 0) {
                textView.setTextColor(this.f67774e);
            }
            return textView;
        }

        /* renamed from: c */
        private C25732a m84524c(View view) {
            this.f67773d = view;
            return this;
        }

        /* renamed from: a */
        public final C25732a mo66680a(int i) {
            this.f67774e = i;
            return this;
        }

        private C25732a(Context context) {
            if (context != null) {
                this.f67770a = context;
                return;
            }
            throw new IllegalArgumentException("LoadingStatusView.Builder:Context can not be null");
        }

        /* renamed from: b */
        private C25732a m84522b(View view) {
            this.f67772c = view;
            this.f67772c.setLayoutParams(new LayoutParams(-1, -1));
            return this;
        }

        /* renamed from: a */
        private C25732a m84520a(View view) {
            this.f67771b = view;
            this.f67771b.setLayoutParams(new LayoutParams(-1, -1));
            return this;
        }

        /* renamed from: d */
        private TextView m84525d(int i) {
            TextView textView = (TextView) LayoutInflater.from(this.f67770a).inflate(R.layout.ad0, null);
            textView.setText(i);
            if (this.f67774e != 0) {
                textView.setTextColor(this.f67774e);
            }
            return textView;
        }

        /* renamed from: b */
        private C25732a m84521b(int i) {
            if (this.f67771b instanceof LoadLayout) {
                ((LoadLayout) this.f67771b).setLoadingText((int) R.string.c49);
            } else if (this.f67771b instanceof TextView) {
                ((TextView) this.f67771b).setText(R.string.c49);
            } else {
                m84516a((int) R.string.c49, -1);
            }
            return this;
        }

        /* renamed from: c */
        private C25732a m84523c(int i) {
            if (this.f67772c == null || !(this.f67772c instanceof TextView)) {
                TextView a = m84515a();
                a.setText(R.string.c47);
                return m84522b((View) a);
            }
            ((TextView) this.f67772c).setText(R.string.c47);
            return this;
        }

        /* renamed from: a */
        public static C25732a m84519a(Context context) {
            return new C25732a(context).m84523c((int) R.string.c47).m84518a((int) C9738o.m28708b(context, 15.0f), true).m84521b((int) R.string.c49).m84517a((int) R.string.c48, (OnClickListener) null);
        }

        /* renamed from: a */
        private C25732a m84516a(int i, int i2) {
            return m84520a((View) m84525d(i));
        }

        /* renamed from: a */
        private C25732a m84517a(int i, OnClickListener onClickListener) {
            if (this.f67773d == null || !(this.f67773d instanceof TextView)) {
                TextView d = m84525d(R.string.c48);
                d.setOnClickListener(null);
                return m84524c((View) d);
            }
            TextView textView = (TextView) this.f67773d;
            textView.setText(R.string.c48);
            textView.setOnClickListener(null);
            return this;
        }

        /* renamed from: a */
        private C25732a m84518a(int i, boolean z) {
            LoadLayout loadLayout;
            if (this.f67771b == null || !(this.f67771b instanceof LoadLayout)) {
                loadLayout = (LoadLayout) LayoutInflater.from(this.f67770a).inflate(R.layout.ad1, null);
            } else {
                loadLayout = (LoadLayout) this.f67771b;
            }
            TextView textView = (TextView) loadLayout.findViewById(R.id.bu3);
            if (this.f67774e != 0) {
                textView.setTextColor(this.f67774e);
            }
            if (i >= 0) {
                loadLayout.setLoadingViewSize(i);
            }
            textView.setTextSize(13.0f);
            return m84520a((View) loadLayout);
        }
    }

    /* renamed from: b */
    public final void mo66677b() {
        setStatus(2);
    }

    /* renamed from: a */
    public final void mo66676a() {
        if (this.f67769c != -1) {
            ((View) this.f67767a.get(this.f67769c)).setVisibility(4);
            this.f67769c = -1;
        }
    }

    public LoadingStatusView(Context context) {
        this(context, null);
    }

    public void setStatus(int i) {
        if (this.f67769c != i) {
            if (this.f67769c >= 0) {
                ((View) this.f67767a.get(this.f67769c)).setVisibility(4);
            }
            if (i >= 0) {
                View view = (View) this.f67767a.get(i);
                if (view != null) {
                    view.setVisibility(0);
                }
            }
            this.f67769c = i;
        }
    }

    public void setBuilder(C25732a aVar) {
        if (aVar == null) {
            aVar = C25732a.m84519a(getContext());
        }
        this.f67767a.clear();
        this.f67767a.add(aVar.f67771b);
        this.f67767a.add(aVar.f67772c);
        this.f67767a.add(aVar.f67773d);
        removeAllViews();
        for (int i = 0; i < this.f67767a.size(); i++) {
            View view = (View) this.f67767a.get(i);
            if (view != null) {
                view.setVisibility(4);
                addView(view);
            }
        }
    }

    public LoadingStatusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LoadingStatusView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f67768b = LoadingStatusView.class.getSimpleName();
        this.f67767a = new ArrayList(3);
        this.f67769c = -1;
        setBuilder(null);
    }
}
