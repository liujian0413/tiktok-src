package com.p280ss.android.ugc.aweme.filter;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0053p;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetBehavior.C0343a;
import android.support.design.widget.CoordinatorLayout;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.filter.base.SpaceItemDecoration;
import com.p280ss.android.ugc.aweme.framework.p1276e.C29961b;
import com.p280ss.android.ugc.aweme.p1044av.widget.CompatBottomSheetDialog;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.tools.filter.R$styleable;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.filter.FilterDialog */
public class FilterDialog extends CompatBottomSheetDialog {

    /* renamed from: c */
    public C0052o<C29296g> f76970c;

    /* renamed from: d */
    public FilterAdapter f76971d;

    /* renamed from: e */
    C0053p<List<C29296g>> f76972e;

    /* renamed from: f */
    public C29296g f76973f;

    /* renamed from: g */
    public boolean f76974g;

    /* renamed from: h */
    public boolean f76975h;

    /* renamed from: i */
    public boolean f76976i;

    /* renamed from: j */
    public boolean f76977j;

    /* renamed from: k */
    public View f76978k;

    /* renamed from: l */
    public C29250bj f76979l;

    /* renamed from: m */
    private Activity f76980m;

    /* renamed from: n */
    private RecyclerView f76981n;

    /* renamed from: o */
    private CoordinatorLayout f76982o;

    /* renamed from: p */
    private LinearLayout f76983p;

    /* renamed from: q */
    private TextView f76984q;

    /* renamed from: r */
    private TextView f76985r;

    /* renamed from: s */
    private TextView f76986s;

    /* renamed from: t */
    private ImageView f76987t;

    /* renamed from: u */
    private FilterDialogExtContentLayout f76988u;

    /* renamed from: v */
    private FilterDialogExtContentLayout f76989v;

    /* renamed from: w */
    private C29199ad f76990w;

    /* renamed from: x */
    private C0053p<C29296g> f76991x;

    public void cancel() {
        super.cancel();
        m95685i();
    }

    public void dismiss() {
        super.dismiss();
        m95685i();
    }

    /* renamed from: j */
    private void m95686j() {
        if (this.f76973f != null) {
            this.f76971d.mo74669a(this.f76973f);
        }
    }

    public void show() {
        C0052o<C29296g> oVar;
        super.show();
        boolean z = this.f76974g;
        if (this.f76970c == null) {
            oVar = new C0052o<>();
        } else {
            oVar = this.f76970c;
        }
        m95678a(z, oVar);
    }

    /* renamed from: g */
    private void m95683g() {
        if (this.f76974g) {
            this.f76987t.setVisibility(0);
            this.f76983p.setVisibility(8);
        } else {
            this.f76987t.setVisibility(8);
            this.f76983p.setVisibility(0);
        }
        mo74690c();
        m95684h();
    }

    /* renamed from: h */
    private void m95684h() {
        m95685i();
        this.f76971d = new FilterAdapter(getContext());
        this.f76971d.f76935d = new C29250bj() {
            /* renamed from: a */
            public final void mo74705a(C29296g gVar) {
                if (FilterDialog.this.f76979l != null) {
                    FilterDialog.this.f76979l.mo74705a(gVar);
                }
                FilterDialog.this.f76970c.setValue(gVar);
            }
        };
        this.f76981n.setAdapter(this.f76971d);
        this.f76971d.f76936e = this.f76990w;
    }

    /* renamed from: i */
    private void m95685i() {
        C35574k.m114859a().mo70097l().mo74951d().mo74818a().removeObserver(this.f76972e);
        if (this.f76970c != null) {
            this.f76970c.removeObserver(this.f76991x);
        }
    }

    /* renamed from: c */
    public final void mo74690c() {
        m95680c(this.f76981n);
        if (!this.f76974g) {
            m95676a(this.f76984q, true);
            m95676a(this.f76985r, false);
            m95676a(this.f76986s, false);
        }
        this.f76975h = true;
        this.f76976i = false;
        this.f76977j = false;
    }

    /* renamed from: d */
    public final void mo74692d() {
        m95680c(this.f76988u);
        if (!this.f76974g) {
            m95676a(this.f76984q, false);
            m95676a(this.f76985r, true);
            m95676a(this.f76986s, false);
        }
        this.f76975h = false;
        this.f76976i = true;
        this.f76977j = false;
    }

    /* renamed from: e */
    public final void mo74694e() {
        m95680c(this.f76989v);
        if (!this.f76974g) {
            m95676a(this.f76984q, false);
            m95676a(this.f76985r, false);
            m95676a(this.f76986s, true);
        }
        this.f76975h = false;
        this.f76976i = false;
        this.f76977j = true;
    }

    /* renamed from: f */
    private void m95682f() {
        this.f76982o = (CoordinatorLayout) findViewById(R.id.bow);
        this.f76983p = (LinearLayout) findViewById(R.id.dfb);
        this.f76984q = (TextView) findViewById(R.id.dfg);
        this.f76984q.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (!FilterDialog.this.f76975h) {
                    FilterDialog.this.mo74690c();
                }
            }
        });
        this.f76985r = (TextView) findViewById(R.id.dfs);
        this.f76985r.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (!FilterDialog.this.f76976i) {
                    FilterDialog.this.mo74692d();
                }
            }
        });
        this.f76986s = (TextView) findViewById(R.id.dfa);
        this.f76986s.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (!FilterDialog.this.f76977j) {
                    FilterDialog.this.mo74694e();
                }
            }
        });
        this.f76981n = (RecyclerView) findViewById(R.id.akm);
        this.f76981n.setLayoutManager(new CenterLayoutManager(this.f76980m, 0, false));
        this.f76981n.mo5525a((C1272h) new SpaceItemDecoration(this.f76980m, C29961b.m98232a(this.f76980m, 20.0f)));
        this.f76988u = (FilterDialogExtContentLayout) findViewById(R.id.d89);
        this.f76988u.setExtContentType(0);
        this.f76988u.setItemInterceptor(this.f76990w);
        this.f76989v = (FilterDialogExtContentLayout) findViewById(R.id.m_);
        this.f76989v.setExtContentType(1);
        this.f76989v.setItemInterceptor(this.f76990w);
        this.f76987t = (ImageView) findViewById(R.id.dm9);
    }

    /* renamed from: c */
    private void m95680c(View view) {
        m95679b(view);
    }

    /* renamed from: a */
    private void m95677a(boolean z) {
        this.f76974g = z;
        m95683g();
    }

    /* renamed from: a */
    private static int m95674a(Activity activity) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    /* renamed from: d */
    private void m95681d(View view) {
        final BottomSheetBehavior a = BottomSheetBehavior.m1365a((View) view.getParent());
        if (a != null) {
            a.f1347m = new C0343a() {
                /* renamed from: a */
                public final void mo1372a(View view, float f) {
                }

                /* renamed from: a */
                public final void mo1373a(View view, int i) {
                    if (i == 5) {
                        FilterDialog.this.dismiss();
                        a.mo1357b(4);
                    }
                }
            };
        }
    }

    /* renamed from: a */
    private static int m95675a(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: b */
    private void m95679b(final View view) {
        if (this.f76978k != null) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(150);
            alphaAnimation.setAnimationListener(new AnimationListener() {
                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                }

                public final void onAnimationEnd(Animation animation) {
                    FilterDialog.this.f76978k.setVisibility(8);
                    FilterDialog.this.mo74689a(view);
                }
            });
            this.f76978k.startAnimation(alphaAnimation);
            return;
        }
        mo74689a(view);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(PreloadTask.BYTE_UNIT_NUMBER);
        setContentView((int) R.layout.acf);
        m95682f();
        int a = m95674a(this.f76980m) - m95675a(getContext());
        Window window = getWindow();
        if (window != null) {
            if (a == 0) {
                a = -1;
            }
            window.setLayout(-1, a);
            window.setGravity(80);
            LayoutParams attributes = getWindow().getAttributes();
            attributes.gravity = 80;
            getWindow().setAttributes(attributes);
        }
        m95681d(this.f76982o);
        setCanceledOnTouchOutside(true);
    }

    /* renamed from: a */
    public final void mo74689a(final View view) {
        if (view != null) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(150);
            alphaAnimation.setAnimationListener(new AnimationListener() {
                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                }

                public final void onAnimationEnd(Animation animation) {
                    FilterDialog.this.f76978k = view;
                }
            });
            view.setVisibility(0);
            view.startAnimation(alphaAnimation);
        }
    }

    /* renamed from: a */
    private static void m95676a(TextView textView, boolean z) {
        int i;
        TypedArray obtainStyledAttributes = textView.getContext().getTheme().obtainStyledAttributes(R$styleable.Reverse_Color);
        if (z) {
            i = obtainStyledAttributes.getColor(20, 0);
        } else {
            i = obtainStyledAttributes.getColor(9, 0);
        }
        textView.setTextColor(i);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private void m95678a(boolean z, C0052o<C29296g> oVar) {
        super.show();
        m95677a(z);
        C35574k.m114859a().mo70097l().mo74951d().mo74818a().observe((C0043i) this.f76980m, this.f76972e);
        oVar.observe((C0043i) this.f76980m, this.f76991x);
        this.f76970c = oVar;
        m95686j();
    }
}
