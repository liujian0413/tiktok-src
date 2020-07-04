package com.p280ss.android.ugc.aweme.photo.setfilter;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C6311g;
import com.p280ss.android.ugc.aweme.filter.C29244bf;
import com.p280ss.android.ugc.aweme.filter.C29250bj;
import com.p280ss.android.ugc.aweme.filter.C29296g;
import com.p280ss.android.ugc.aweme.filter.CenterLayoutManager;
import com.p280ss.android.ugc.aweme.filter.base.SpaceItemDecoration;
import com.p280ss.android.ugc.aweme.framework.p1276e.C29961b;
import com.p280ss.android.ugc.aweme.photo.PhotoContext;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.photo.setfilter.SetFilterLayout */
public class SetFilterLayout extends FrameLayout implements OnClickListener, OnSeekBarChangeListener {

    /* renamed from: a */
    public C29244bf f90778a;

    /* renamed from: b */
    public RelativeLayout f90779b;

    /* renamed from: c */
    public int f90780c;

    /* renamed from: d */
    public float f90781d;

    /* renamed from: e */
    public C34817l f90782e;

    /* renamed from: f */
    public PhotoContext f90783f;

    /* renamed from: g */
    private RecyclerView f90784g;

    /* renamed from: h */
    private ImageView f90785h;

    /* renamed from: i */
    private ImageView f90786i;

    /* renamed from: j */
    private FilterRateSeekBar f90787j;

    /* renamed from: k */
    private TextView f90788k;

    /* renamed from: l */
    private TextView f90789l;

    /* renamed from: m */
    private int f90790m;

    /* renamed from: n */
    private float f90791n;

    /* renamed from: o */
    private RelativeLayout f90792o;

    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
    }

    /* renamed from: d */
    private void m112279d() {
        if (this.f90787j != null) {
            this.f90787j.setProgress((int) (this.f90781d * 100.0f));
        }
    }

    /* renamed from: e */
    private void m112280e() {
        mo88296a(this.f90790m, this.f90791n);
        if (this.f90784g != null) {
            this.f90784g.mo5576f();
        }
        if (this.f90782e != null) {
            this.f90782e.mo88249a(this.f90783f, 0);
        }
    }

    /* renamed from: f */
    private void m112281f() {
        mo88296a(this.f90780c, this.f90781d);
        if (this.f90782e != null) {
            this.f90782e.mo88249a(this.f90783f, 1);
        }
    }

    /* renamed from: h */
    private void m112283h() {
        mo88296a(this.f90780c, this.f90781d);
        if (this.f90782e != null) {
            this.f90782e.mo88249a(this.f90783f, 2);
        }
        m112278c();
    }

    /* renamed from: c */
    private void m112278c() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f90779b, "alpha", new float[]{1.0f, 0.0f});
        ofFloat.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                SetFilterLayout.this.f90779b.setVisibility(8);
            }
        });
        ofFloat.setDuration(150);
        ofFloat.start();
    }

    /* renamed from: g */
    private void m112282g() {
        this.f90781d = 0.8f;
        if (this.f90780c == this.f90790m) {
            this.f90781d = this.f90791n;
        }
        mo88296a(this.f90780c, this.f90781d);
        if (this.f90782e != null) {
            this.f90782e.mo88249a(this.f90783f, 3);
        }
        m112278c();
    }

    /* renamed from: a */
    public final void mo88295a() {
        this.f90779b.setVisibility(0);
        ObjectAnimator.ofFloat(this.f90779b, "alpha", new float[]{0.0f, 1.0f}).setDuration(150).start();
        m112279d();
    }

    /* renamed from: b */
    private void m112277b() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.a9p, this, true);
        this.f90792o = (RelativeLayout) inflate.findViewById(R.id.ak7);
        this.f90784g = (RecyclerView) inflate.findViewById(R.id.akm);
        this.f90784g.setLayoutManager(new CenterLayoutManager(getContext(), 0, false));
        this.f90784g.mo5525a((C1272h) new SpaceItemDecoration(getContext(), C29961b.m98232a(getContext(), 16.0f)));
        this.f90785h = (ImageView) inflate.findViewById(R.id.ak4);
        this.f90785h.setOnClickListener(this);
        this.f90786i = (ImageView) inflate.findViewById(R.id.ak6);
        this.f90786i.setOnClickListener(this);
        this.f90779b = (RelativeLayout) inflate.findViewById(R.id.akk);
        this.f90787j = (FilterRateSeekBar) inflate.findViewById(R.id.d22);
        this.f90787j.setOnSeekBarChangeListener(this);
        this.f90788k = (TextView) inflate.findViewById(R.id.aki);
        this.f90788k.setOnClickListener(this);
        this.f90789l = (TextView) inflate.findViewById(R.id.akj);
        this.f90789l.setOnClickListener(this);
        m112276a(C35574k.m114859a().mo70097l().mo74947a(getContext()));
        this.f90779b.setVisibility(8);
    }

    public SetFilterLayout(Context context) {
        this(context, null);
    }

    public void setFilterIndex(int i) {
        this.f90780c = i;
        m112275a(this.f90780c);
    }

    /* renamed from: a */
    private void m112275a(int i) {
        this.f90781d = 0.8f;
        this.f90778a.mo74881a(this.f90780c);
        if (i != 0) {
            mo88296a(i, this.f90781d);
            if (this.f90782e != null) {
                this.f90782e.mo88249a(this.f90783f, 5);
            }
        }
    }

    public void setData(List<C29296g> list) {
        if (!C6311g.m19573a(list)) {
            this.f90778a.mo74880a().mo4536a(list);
        }
    }

    public void setOnFilterChangeListener(C34817l lVar) {
        this.f90782e = lVar;
        if (this.f90778a != null) {
            this.f90778a.mo74882a((C29250bj) new C29250bj() {
                /* renamed from: a */
                public final void mo74705a(C29296g gVar) {
                    if (SetFilterLayout.this.f90780c != gVar.f77270e) {
                        SetFilterLayout.this.f90778a.mo74883a(gVar);
                        SetFilterLayout.this.f90780c = gVar.f77270e;
                        SetFilterLayout.this.f90781d = 0.8f;
                        SetFilterLayout.this.mo88296a(gVar.f77270e, SetFilterLayout.this.f90781d);
                        if (SetFilterLayout.this.f90782e != null) {
                            SetFilterLayout.this.f90782e.mo88249a(SetFilterLayout.this.f90783f, 5);
                        }
                    } else {
                        SetFilterLayout.this.mo88295a();
                    }
                }
            });
        }
    }

    public void setPhotoContext(PhotoContext photoContext) {
        this.f90783f = photoContext;
        if (this.f90783f != null) {
            this.f90790m = this.f90783f.mFilterIndex;
            this.f90791n = this.f90783f.mFilterRate;
        }
    }

    /* renamed from: a */
    private void m112276a(C29244bf bfVar) {
        this.f90778a = bfVar;
        setOnFilterChangeListener(this.f90782e);
        this.f90784g.setAdapter(this.f90778a.mo74880a());
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == R.id.ak4) {
            m112280e();
        } else if (id == R.id.ak6) {
            m112281f();
        } else if (id == R.id.aki) {
            m112282g();
        } else {
            if (id == R.id.akj) {
                m112283h();
            }
        }
    }

    public SetFilterLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo88296a(int i, float f) {
        this.f90783f.mFilterIndex = i;
        C29296g a = C35574k.m114859a().mo70097l().mo74949b().mo74962a(i);
        if (a != null) {
            this.f90783f.mFilterName = a.f77268c;
            this.f90783f.mFilterId = a.f77266a;
        }
        this.f90783f.mFilterRate = f;
    }

    public SetFilterLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f90781d = 0.8f;
        m112277b();
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.f90781d = (((float) i) * 1.0f) / 100.0f;
        mo88296a(this.f90780c, this.f90781d);
        if (this.f90782e != null) {
            this.f90782e.mo88249a(this.f90783f, 4);
        }
    }
}
