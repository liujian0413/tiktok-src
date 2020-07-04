package com.p280ss.android.ugc.aweme.tools.mvtemplate;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.ContextWrapper;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.view.ViewPager.C0935e;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout.LayoutParams;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtLoadingLayout;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.uikit.textview.AlwaysMarqueeTextView;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.aweme.tools.mvtemplate.MvTemplateSelectEvent.Producer;
import com.p280ss.android.ugc.aweme.tools.mvtemplate.MvTemplateSelectEvent.SelectState;
import com.p280ss.android.ugc.aweme.tools.mvtemplate.choosemedia.C42534c;
import com.p280ss.android.ugc.aweme.tools.mvtemplate.p1675a.C42496a;
import com.p280ss.android.ugc.aweme.tools.mvtemplate.p1675a.C42507h;
import com.p280ss.android.ugc.aweme.tools.mvtemplate.p1676b.C42515a;
import com.p280ss.android.ugc.aweme.tools.mvtemplate.thumbnail.MvThumbnailRecyclerView;
import com.p280ss.android.ugc.aweme.tools.mvtemplate.thumbnail.MvThumbnailRvAdapter;
import com.p280ss.android.ugc.aweme.tools.mvtemplate.thumbnail.MvThumbnailRvAdapter.C42554b;
import com.p280ss.android.ugc.aweme.tools.mvtemplate.view.MvThemeListViewPager;
import com.p280ss.android.ugc.aweme.tools.mvtemplate.view.MvThemeListViewPager.C42558a;
import com.p280ss.android.ugc.aweme.tools.mvtemplate.view.circleanimate.C42563b;
import com.p280ss.android.ugc.aweme.tools.mvtemplate.view.circleanimate.CircularAnimateButton;
import com.p280ss.android.ugc.aweme.tools.mvtemplate.viewpager.MvItemFragment;
import com.p280ss.android.ugc.aweme.tools.mvtemplate.viewpager.MvThemeViewPagerAdapter;
import com.p280ss.android.ugc.aweme.tools.mvtemplate.viewpager.ScaleAlphaPageTransformer;
import com.p280ss.android.ugc.aweme.utils.C42939as;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.playerkit.videoview.C44933a;
import com.p280ss.android.vesdk.filterparam.VETransitionFilterParam;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.MvTemplateView */
public class MvTemplateView extends FrameLayout {

    /* renamed from: A */
    private int f110457A;

    /* renamed from: B */
    private Producer f110458B;

    /* renamed from: a */
    public AlwaysMarqueeTextView f110459a;

    /* renamed from: b */
    public AlwaysMarqueeTextView f110460b;

    /* renamed from: c */
    public MvThumbnailRecyclerView f110461c;

    /* renamed from: d */
    public int f110462d;

    /* renamed from: e */
    public int f110463e;

    /* renamed from: f */
    public boolean f110464f;

    /* renamed from: g */
    public C42515a f110465g;

    /* renamed from: h */
    public MvThemeViewPagerAdapter f110466h;

    /* renamed from: i */
    public int f110467i;

    /* renamed from: j */
    public MvThumbnailRvAdapter f110468j;

    /* renamed from: k */
    public C42495a f110469k;

    /* renamed from: l */
    public boolean f110470l;

    /* renamed from: m */
    public boolean f110471m;

    /* renamed from: n */
    private DmtTextView f110472n;

    /* renamed from: o */
    private ViewGroup f110473o;

    /* renamed from: p */
    private View f110474p;

    /* renamed from: q */
    private View f110475q;

    /* renamed from: r */
    private CircularAnimateButton f110476r;

    /* renamed from: s */
    private View f110477s;

    /* renamed from: t */
    private DmtLoadingLayout f110478t;

    /* renamed from: u */
    private View f110479u;

    /* renamed from: v */
    private int f110480v;

    /* renamed from: w */
    private int f110481w;

    /* renamed from: x */
    private MvThemeListViewPager f110482x;

    /* renamed from: y */
    private FragmentActivity f110483y;

    /* renamed from: z */
    private ScaleAlphaPageTransformer f110484z;

    public View getCloseView() {
        return this.f110479u;
    }

    /* renamed from: a */
    public final void mo104020a(final List<MvThemeData> list) {
        if (!C23477d.m77081a((Collection<T>) list)) {
            if (this.f110470l) {
                if (this.f110464f) {
                    this.f110468j.f110630a.clear();
                    this.f110468j.f110633d = true;
                    this.f110467i = 0;
                }
                this.f110471m = false;
                final int size = this.f110468j.f110630a.size();
                this.f110468j.f110630a.addAll(list);
                if (this.f110461c.mo5606i()) {
                    this.f110461c.post(new Runnable() {
                        public final void run() {
                            if (size == 0) {
                                MvTemplateView.this.f110468j.notifyDataSetChanged();
                            } else {
                                MvTemplateView.this.f110468j.notifyItemRangeInserted(size + 1, list.size());
                            }
                        }
                    });
                } else if (size == 0) {
                    this.f110468j.notifyDataSetChanged();
                } else {
                    this.f110468j.notifyItemRangeInserted(size + 1, list.size());
                }
            }
            if (getDataCount() == 0 || this.f110464f) {
                this.f110482x.setOffscreenPageLimit(list.size());
                this.f110482x.setAdapter(this.f110466h);
                this.f110466h.mo104168a(list);
                if (this.f110472n != null && !C23477d.m77081a((Collection<T>) list)) {
                    DmtTextView dmtTextView = this.f110472n;
                    StringBuilder sb = new StringBuilder("1/");
                    sb.append(list.size());
                    dmtTextView.setText(sb.toString());
                    MvThemeData mvThemeData = (MvThemeData) list.get(0);
                    if (mvThemeData != null) {
                        if (!TextUtils.isEmpty(mvThemeData.mo104053h())) {
                            this.f110459a.setText(mvThemeData.mo104053h());
                        }
                        if (!TextUtils.isEmpty(mvThemeData.mo104055j())) {
                            this.f110460b.setText(mvThemeData.mo104055j());
                        }
                    }
                }
            } else {
                this.f110466h.mo104170b(list);
            }
        }
    }

    /* renamed from: a */
    public final void mo104019a(Boolean bool) {
        int b = (int) C9738o.m28708b(getContext(), 16.0f);
        if (this.f110476r != null) {
            LayoutParams layoutParams = (LayoutParams) this.f110476r.getLayoutParams();
            layoutParams.bottomMargin = (int) (bool.booleanValue() ? ((float) b) + C9738o.m28708b(getContext(), 65.0f) : C9738o.m28708b(getContext(), 65.0f));
            this.f110476r.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: i */
    public static void m135008i() {
        C44933a.m141791a().mo107443c();
    }

    public int getDataCount() {
        return this.f110466h.getCount();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public final /* synthetic */ void mo104036l() {
        setVisibility(8);
    }

    /* renamed from: p */
    private void m135012p() {
        MvItemFragment c = m135007c(this.f110463e);
        if (c != null) {
            c.mo104165g();
        }
    }

    /* renamed from: b */
    public final void mo104022b() {
        this.f110478t.setVisibility(0);
        this.f110477s.setVisibility(4);
        m135011o();
    }

    /* renamed from: g */
    public final void mo104029g() {
        MvItemFragment c = m135007c(this.f110463e);
        if (c != null) {
            c.mo104163e();
        }
    }

    /* renamed from: h */
    public final void mo104032h() {
        MvItemFragment c = m135007c(this.f110463e);
        if (c != null) {
            c.mo104164f();
        }
    }

    private int getItemWidth() {
        if (this.f110467i <= 0) {
            MvItemFragment a = this.f110466h.getItem(0);
            if (a != null) {
                this.f110467i = a.mo104160b();
            }
        }
        return this.f110467i;
    }

    /* renamed from: e */
    public final boolean mo104027e() {
        MvThemeData b = this.f110466h.mo104169b(this.f110463e);
        if (this.f110465g == null || !this.f110465g.mo104093a(b, this.f110463e)) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    private void m135009m() {
        this.f110473o.setVisibility(0);
        this.f110468j = new MvThumbnailRvAdapter();
        this.f110468j.f110631b = new C42495a() {
            /* renamed from: a */
            public final void mo104039a() {
                MvTemplateView.this.f110469k.mo104039a();
                MvTemplateView.this.f110471m = true;
            }
        };
        this.f110468j.f110632c = new C42554b() {
            /* renamed from: a */
            public final void mo104040a(int i, View view) {
                C42961az.m136380a(new MvTemplateSelectEvent(SelectState.START, Producer.ICON_LIST));
                MvTemplateView.this.f110461c.mo104132a(i, 0.0f, true);
            }
        };
        this.f110461c.setAdapter(this.f110468j);
    }

    /* renamed from: o */
    private void m135011o() {
        this.f110476r.setText(this.f110476r.getContext().getResources().getString(R.string.dcz));
        this.f110476r.setBackgroundColor(this.f110481w);
        this.f110476r.setClickable(false);
    }

    public void dismiss() {
        if (getVisibility() != 8) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f110474p, "alpha", new float[]{1.0f, 0.0f});
            ofFloat.setDuration(300);
            ofFloat.start();
            this.f110476r.mo104147a((C42563b) new C42546i(this));
            m135012p();
        }
    }

    /* renamed from: f */
    public final void mo104028f() {
        m135005a(false);
        MvThemeData b = this.f110466h.mo104169b(this.f110463e);
        if (b != null) {
            new C42496a(b).mo104072a(getContext(), (C42507h) new C42547j(this), this.f110463e);
        }
    }

    /* renamed from: j */
    public final void mo104034j() {
        if (this.f110479u != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f110479u.getLayoutParams();
            layoutParams.topMargin = (int) (((float) C39805en.m127450c(getContext())) + C9738o.m28708b(getContext(), 24.5f));
            this.f110479u.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: k */
    public final void mo104035k() {
        this.f110468j.f110634e = false;
        View childAt = this.f110461c.getChildAt(this.f110461c.getChildCount() - 1);
        if (childAt != null) {
            View findViewById = childAt.findViewById(R.id.bu9);
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
        }
    }

    /* renamed from: q */
    private void m135013q() {
        if (this.f110470l) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f110474p.getLayoutParams();
            layoutParams.topMargin = (int) (((float) C39805en.m127450c(getContext())) + C9738o.m28708b(getContext(), 32.0f));
            this.f110474p.setLayoutParams(layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f110474p.getLayoutParams();
        layoutParams2.topMargin = (int) (((float) C39805en.m127450c(getContext())) + C9738o.m28708b(getContext(), 68.5f));
        this.f110474p.setLayoutParams(layoutParams2);
    }

    /* renamed from: c */
    public final void mo104023c() {
        this.f110478t.setVisibility(8);
        this.f110477s.setVisibility(0);
        this.f110460b.setVisibility(0);
        this.f110459a.setVisibility(0);
        if (!this.f110470l) {
            this.f110472n.setVisibility(0);
        }
        this.f110482x.setNoScroll(false);
        if (this.f110466h != null) {
            m135004a(this.f110466h.mo104169b(this.f110463e));
        } else {
            m135005a(true);
        }
        this.f110476r.mo104148b(null);
        this.f110464f = false;
        if (this.f110465g != null) {
            this.f110465g.mo104086a(this.f110466h.mo104169b(0));
        }
    }

    /* renamed from: d */
    public final void mo104024d() {
        this.f110478t.setVisibility(8);
        this.f110477s.setVisibility(0);
        this.f110460b.setVisibility(8);
        this.f110459a.setVisibility(8);
        this.f110482x.setNoScroll(true);
        this.f110472n.setVisibility(8);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            MvThemeData mvThemeData = new MvThemeData();
            mvThemeData.f110504j = true;
            arrayList.add(mvThemeData);
        }
        mo104020a((List<MvThemeData>) arrayList);
        m135011o();
        if (this.f110470l) {
            this.f110468j.f110633d = false;
            mo104035k();
        }
        this.f110464f = true;
        this.f110476r.mo104148b(null);
    }

    /* renamed from: n */
    private void m135010n() {
        float f;
        this.f110482x = (MvThemeListViewPager) findViewById(R.id.edp);
        C42534c cVar = new C42534c(this.f110482x.getContext());
        cVar.mo104123a(this.f110482x);
        cVar.f110606a = VETransitionFilterParam.TransitionDuration_DEFAULT;
        if (this.f110470l) {
            f = 0.0f;
        } else {
            f = 0.6f;
        }
        this.f110484z = new ScaleAlphaPageTransformer(f);
        this.f110457A = (int) C9738o.m28708b((Context) this.f110483y, 16.0f);
        this.f110482x.setPageMargin(this.f110457A);
        this.f110482x.setPageTransformer(true, this.f110484z);
        this.f110482x.setBounceScrollListener(new C42558a() {
            /* renamed from: a */
            public final void mo104041a() {
                MvTemplateView.this.f110459a.setAlpha(1.0f);
                MvTemplateView.this.f110460b.setAlpha(1.0f);
            }

            /* renamed from: a */
            public final void mo104042a(float f) {
                if (MvTemplateView.this.f110467i == 0) {
                    MvItemFragment a = MvTemplateView.this.f110466h.getItem(0);
                    if (a != null) {
                        MvTemplateView.this.f110467i = a.mo104160b();
                    }
                }
                if (MvTemplateView.this.f110467i > 0 && f < 0.0f) {
                    float abs = 1.0f - ((Math.abs(f) / ((float) MvTemplateView.this.f110467i)) * 2.0f);
                    MvTemplateView.this.f110459a.setAlpha(abs);
                    MvTemplateView.this.f110460b.setAlpha(abs);
                }
            }
        });
        this.f110466h = new MvThemeViewPagerAdapter(this.f110483y.getSupportFragmentManager());
        this.f110482x.setAdapter(this.f110466h);
        this.f110482x.addOnPageChangeListener(new C0935e() {
            public final void onPageScrollStateChanged(int i) {
            }

            public final void onPageSelected(int i) {
                MvThemeData b = MvTemplateView.this.f110466h.mo104169b(i);
                if (b != null) {
                    if (MvTemplateView.this.f110462d != i) {
                        MvTemplateView.this.mo104018a(b, MvTemplateView.this.f110462d, i);
                    }
                    MvTemplateView.this.f110462d = i;
                }
                MvTemplateView.this.f110463e = i;
                if (MvTemplateView.this.f110470l && MvTemplateView.this.f110471m) {
                    MvTemplateView.this.f110469k.mo104039a();
                }
            }

            public final void onPageScrolled(int i, float f, int i2) {
                C42961az.m136380a(new MvTemplateSelectEvent(SelectState.SCROLL, Producer.MAIN_TEMPLATE, i, f));
            }
        });
        this.f110482x.setHandleClickChange(!this.f110470l);
        this.f110475q.setOnTouchListener(new C42545h(this));
    }

    /* renamed from: a */
    public final void mo104016a() {
        setVisibility(0);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f110474p, "alpha", new float[]{0.0f, 1.0f});
        ofFloat.setDuration(300);
        ofFloat.start();
        mo104029g();
    }

    public void setMoreDataFetcher(C42495a aVar) {
        this.f110469k = aVar;
    }

    public void setMvThemeClickListener(C42515a aVar) {
        this.f110465g = aVar;
    }

    public MvTemplateView(Context context) {
        this(context, null);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() >= 2) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: a */
    private void m135002a(int i) {
        MvItemFragment c = m135007c(i);
        if (c != null && this.f110466h.mo104169b(i) != null) {
            c.mo104161c();
        }
    }

    /* renamed from: b */
    private void m135006b(int i) {
        MvItemFragment c = m135007c(i);
        if (c != null && this.f110466h.mo104169b(i) != null) {
            c.mo104165g();
        }
    }

    /* renamed from: c */
    private MvItemFragment m135007c(int i) {
        MvItemFragment mvItemFragment = null;
        if (this.f110466h.getCount() <= 0) {
            return null;
        }
        if (i >= 0 && i < this.f110466h.getCount()) {
            mvItemFragment = this.f110466h.getItem(i);
        }
        return mvItemFragment;
    }

    /* renamed from: a */
    private void m135004a(MvThemeData mvThemeData) {
        if (mvThemeData == null) {
            m135005a(true);
        } else if (mvThemeData.mo104058m() == 3) {
            m135005a(false);
        } else {
            m135005a(true);
        }
    }

    /* renamed from: a */
    private void m135005a(boolean z) {
        if (z) {
            this.f110476r.setText(this.f110476r.getContext().getResources().getString(R.string.dcz));
            this.f110476r.setBackgroundColor(this.f110480v);
            this.f110476r.setClickable(true);
            return;
        }
        this.f110476r.setText(this.f110476r.getContext().getResources().getString(R.string.dcx));
        this.f110476r.setBackgroundColor(this.f110481w);
        this.f110476r.setClickable(false);
    }

    /* renamed from: a */
    private void m135003a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.a9c, this);
        this.f110459a = (AlwaysMarqueeTextView) findViewById(R.id.dim);
        this.f110460b = (AlwaysMarqueeTextView) findViewById(R.id.dil);
        this.f110472n = (DmtTextView) findViewById(R.id.a3n);
        this.f110461c = (MvThumbnailRecyclerView) findViewById(R.id.cxq);
        this.f110473o = (ViewGroup) findViewById(R.id.bkf);
        this.f110476r = (CircularAnimateButton) findViewById(R.id.d_w);
        this.f110477s = findViewById(R.id.a24);
        this.f110478t = (DmtLoadingLayout) findViewById(R.id.btv);
        this.f110474p = findViewById(R.id.c_c);
        this.f110475q = findViewById(R.id.edq);
        this.f110476r.setOnClickListener(new C42939as() {
            /* renamed from: a */
            public final void mo70606a(View view) {
                if (MvTemplateView.this.mo104027e()) {
                    MvTemplateView.this.mo104028f();
                }
            }
        });
        this.f110479u = findViewById(R.id.c2e);
        this.f110479u.setOnClickListener(new C42939as() {
            /* renamed from: a */
            public final void mo70606a(View view) {
                if (MvTemplateView.this.f110465g != null) {
                    MvTemplateView.this.f110465g.mo104087a(MvTemplateView.this.f110466h.mo104169b(MvTemplateView.this.f110463e), 2, MvTemplateView.this.f110463e);
                }
            }
        });
        m135013q();
        m135010n();
        if (this.f110470l) {
            m135009m();
        }
    }

    @C7709l
    public void handleSelectEvent(MvTemplateSelectEvent mvTemplateSelectEvent) {
        if (mvTemplateSelectEvent.f110453a == SelectState.START) {
            this.f110458B = mvTemplateSelectEvent.f110454b;
        } else if (!(this.f110458B == null || mvTemplateSelectEvent.f110454b == this.f110458B)) {
            return;
        }
        switch (mvTemplateSelectEvent.f110454b) {
            case ICON_LIST:
                if (mvTemplateSelectEvent.f110453a == SelectState.SCROLL) {
                    float f = mvTemplateSelectEvent.f110456d;
                    this.f110482x.scrollTo((int) ((((float) mvTemplateSelectEvent.f110455c) + f) * ((float) (getItemWidth() + this.f110457A))), 0);
                    if (mvTemplateSelectEvent.f110455c != this.f110482x.getCurrentItem() && ((double) f) < 0.01d) {
                        this.f110482x.setCurrentItem(mvTemplateSelectEvent.f110455c);
                    }
                    MvItemFragment a = this.f110466h.getItem(mvTemplateSelectEvent.f110455c);
                    if (a != null) {
                        this.f110484z.mo3622a(a.getView(), f);
                        int i = mvTemplateSelectEvent.f110455c + 1;
                        if (i < this.f110466h.getCount()) {
                            this.f110484z.mo3622a(this.f110466h.getItem(i).getView(), 1.0f - f);
                        }
                        return;
                    }
                    return;
                }
                break;
            case MAIN_TEMPLATE:
                if (mvTemplateSelectEvent.f110453a == SelectState.SCROLL) {
                    this.f110461c.mo104131a(mvTemplateSelectEvent.f110455c, mvTemplateSelectEvent.f110456d);
                    break;
                }
                break;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ boolean mo104021a(View view, MotionEvent motionEvent) {
        return this.f110482x.dispatchTouchEvent(motionEvent);
    }

    public MvTemplateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                break;
            } else if (context instanceof FragmentActivity) {
                this.f110483y = (FragmentActivity) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        this.f110480v = context.getResources().getColor(R.color.a8k);
        this.f110481w = context.getResources().getColor(R.color.a7e);
        this.f110470l = C35563c.f93231M.mo93305a(Property.UseNewMvStruct);
        m135003a(context);
    }

    /* renamed from: a */
    public final void mo104018a(MvThemeData mvThemeData, int i, int i2) {
        this.f110459a.setText(mvThemeData.mo104053h());
        this.f110460b.setText(mvThemeData.mo104055j());
        DmtTextView dmtTextView = this.f110472n;
        StringBuilder sb = new StringBuilder();
        sb.append(i2 + 1);
        sb.append("/");
        sb.append(this.f110466h.getCount());
        dmtTextView.setText(sb.toString());
        m135006b(i);
        m135002a(i2);
        m135004a(mvThemeData);
        if (this.f110465g != null) {
            this.f110465g.mo104087a(mvThemeData, 3, i2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo104017a(int i, int i2, int i3, String str) {
        MvItemFragment c = m135007c(i2);
        if (i == -1) {
            if (i2 == this.f110463e) {
                m135005a(true);
            }
            if (c != null) {
                c.mo104162d();
            }
        } else if (i == 1) {
            if (i2 == this.f110463e) {
                m135005a(true);
                if (this.f110465g != null) {
                    this.f110465g.mo104087a(this.f110466h.mo104169b(this.f110463e), 1, this.f110463e);
                }
            }
            if (c != null) {
                c.mo104162d();
            }
        } else if (i == 3) {
            if (c != null) {
                c.mo104158a(i3);
            }
        } else if (i == 2) {
            m135005a(false);
        }
    }
}
