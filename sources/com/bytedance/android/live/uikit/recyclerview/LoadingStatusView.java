package com.bytedance.android.live.uikit.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.github.rahatarmanahmed.cpv.CircularProgressView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

public class LoadingStatusView extends FrameLayout {

    /* renamed from: a */
    List<View> f10593a;

    /* renamed from: b */
    private final String f10594b;

    /* renamed from: c */
    private int f10595c;

    /* renamed from: com.bytedance.android.live.uikit.recyclerview.LoadingStatusView$a */
    public static class C3555a {

        /* renamed from: a */
        Context f10596a;

        /* renamed from: b */
        View f10597b;

        /* renamed from: c */
        View f10598c;

        /* renamed from: d */
        View f10599d;

        /* renamed from: a */
        private CircularProgressView m13076a() {
            return (CircularProgressView) LayoutInflater.from(this.f10596a).inflate(R.layout.acx, null);
        }

        /* renamed from: a */
        public final C3555a mo10836a(View view) {
            this.f10597b = view;
            return this;
        }

        /* renamed from: b */
        public final C3555a mo10838b(View view) {
            this.f10598c = view;
            return this;
        }

        /* renamed from: c */
        public final C3555a mo10839c(View view) {
            this.f10599d = view;
            return this;
        }

        public C3555a(Context context) {
            if (context != null) {
                this.f10596a = context;
                return;
            }
            throw new IllegalArgumentException("LoadingStatusView.Builder:Context can not be null");
        }

        /* renamed from: c */
        private C3555a m13077c(int i) {
            return mo10836a(m13078d(R.string.c49));
        }

        /* renamed from: a */
        public static C3555a m13075a(Context context) {
            return new C3555a(context).mo10837b((int) R.string.c47).m13077c((int) R.string.c49).mo10835a(R.string.c48, null);
        }

        /* renamed from: d */
        private View m13078d(int i) {
            TextView textView = (TextView) LayoutInflater.from(this.f10596a).inflate(R.layout.aco, null);
            textView.setText(i);
            return textView;
        }

        /* renamed from: b */
        public final C3555a mo10837b(int i) {
            TextView textView = (TextView) LayoutInflater.from(this.f10596a).inflate(R.layout.acy, null);
            textView.setText(i);
            return mo10838b((View) textView);
        }

        /* renamed from: a */
        public final C3555a mo10834a(int i) {
            CircularProgressView a = m13076a();
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            layoutParams.height = i;
            layoutParams.width = i;
            layoutParams.gravity = 17;
            a.setLayoutParams(layoutParams);
            return mo10836a((View) a);
        }

        /* renamed from: a */
        public final C3555a mo10835a(int i, OnClickListener onClickListener) {
            View d = m13078d(i);
            d.setOnClickListener(onClickListener);
            return mo10839c(d);
        }
    }

    /* renamed from: c */
    public final void mo10830c() {
        setStatus(0);
    }

    /* renamed from: d */
    public final void mo10831d() {
        setStatus(1);
    }

    /* renamed from: e */
    public final void mo10832e() {
        setStatus(2);
    }

    /* renamed from: b */
    public final boolean mo10829b() {
        if (this.f10595c == -1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo10828a() {
        if (this.f10595c != -1) {
            ((View) this.f10593a.get(this.f10595c)).setVisibility(4);
            this.f10595c = -1;
        }
    }

    public LoadingStatusView(Context context) {
        this(context, null);
    }

    private void setStatus(int i) {
        if (this.f10595c != i) {
            if (this.f10595c >= 0) {
                ((View) this.f10593a.get(this.f10595c)).setVisibility(4);
            }
            if (((View) this.f10593a.get(i)) != null) {
                ((View) this.f10593a.get(i)).setVisibility(0);
                this.f10595c = i;
            }
        }
    }

    public void setBuilder(C3555a aVar) {
        if (aVar == null) {
            aVar = C3555a.m13075a(getContext());
        }
        this.f10593a.clear();
        this.f10593a.add(aVar.f10597b);
        this.f10593a.add(aVar.f10598c);
        this.f10593a.add(aVar.f10599d);
        removeAllViews();
        for (int i = 0; i < this.f10593a.size(); i++) {
            View view = (View) this.f10593a.get(i);
            if (view != null) {
                view.setVisibility(4);
                if (view.getParent() != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
                addView(view);
            }
        }
    }

    public LoadingStatusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LoadingStatusView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10594b = LoadingStatusView.class.getSimpleName();
        this.f10593a = new ArrayList(3);
        this.f10595c = -1;
        setBuilder(null);
    }
}
