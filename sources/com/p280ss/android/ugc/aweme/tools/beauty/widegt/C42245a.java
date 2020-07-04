package com.p280ss.android.ugc.aweme.tools.beauty.widegt;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.beauty.C23543l;
import com.p280ss.android.ugc.aweme.beauty.C23544m;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.i18n.C30538p;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.shortvideo.C38511bc;
import com.p280ss.android.ugc.aweme.shortvideo.beauty.C38520d;
import com.p280ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import com.p280ss.android.ugc.aweme.tools.beauty.C42176d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.C7581n;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.widegt.a */
public final class C42245a extends FrameLayout implements OnClickListener, C38520d {

    /* renamed from: a */
    public C7561a<C7581n> f109900a;

    /* renamed from: b */
    public C42176d f109901b;

    /* renamed from: c */
    public boolean f109902c;

    /* renamed from: d */
    private View f109903d;

    /* renamed from: e */
    private View f109904e;

    /* renamed from: f */
    private AVDmtImageTextView f109905f;

    /* renamed from: g */
    private AVDmtImageTextView f109906g;

    /* renamed from: h */
    private AVDmtImageTextView f109907h;

    /* renamed from: i */
    private AVDmtImageTextView f109908i;

    /* renamed from: j */
    private AVDmtImageTextView f109909j;

    /* renamed from: k */
    private View f109910k;

    /* renamed from: l */
    private SeekBar f109911l;

    /* renamed from: m */
    private RelativeLayout f109912m;

    /* renamed from: n */
    private C23543l f109913n;

    /* renamed from: o */
    private boolean f109914o;

    /* renamed from: p */
    private AVETParameter f109915p;

    /* renamed from: q */
    private int f109916q;

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.widegt.a$a */
    public static class C42248a {

        /* renamed from: a */
        private final Context f109919a;

        /* renamed from: b */
        private C42176d f109920b;

        /* renamed from: c */
        private C23543l f109921c;

        /* renamed from: d */
        private AVETParameter f109922d;

        /* renamed from: a */
        public final C42245a mo103694a() {
            C42245a aVar = new C42245a(this.f109919a, this.f109921c, this.f109922d, C23544m.m77321a("2", "3"));
            aVar.f109901b = this.f109920b;
            return aVar;
        }

        /* renamed from: a */
        public final C42248a mo103692a(AVETParameter aVETParameter) {
            this.f109922d = aVETParameter;
            return this;
        }

        public C42248a(Context context) {
            this.f109919a = context;
        }

        /* renamed from: a */
        public final C42248a mo103693a(C42176d dVar) {
            this.f109920b = dVar;
            return this;
        }

        /* renamed from: a */
        public final C42248a mo103691a(C23543l lVar) {
            if (lVar == null) {
                lVar = new C23543l();
            }
            this.f109921c = lVar;
            return this;
        }
    }

    public final View getContainerView() {
        return this.f109904e;
    }

    public final C7561a<C7581n> getOutsideClickListener() {
        return this.f109900a;
    }

    /* renamed from: a */
    public final void mo96514a() {
        this.f109903d.setVisibility(0);
        this.f109912m.setVisibility(0);
    }

    /* renamed from: b */
    public final void mo96515b() {
        this.f109903d.setVisibility(8);
        this.f109912m.setVisibility(8);
        m134387e();
    }

    public final View getBeautyLayout() {
        return this.f109904e.findViewById(R.id.kx);
    }

    /* renamed from: d */
    private void m134386d() {
        this.f109905f.mo103501a(false);
        this.f109906g.mo103501a(false);
        this.f109907h.mo103501a(false);
        this.f109908i.mo103501a(false);
        this.f109909j.mo103501a(false);
    }

    /* renamed from: e */
    private void m134387e() {
        if (this.f109902c) {
            this.f109902c = false;
            C6907h.m21524a("select_beautify", (Map) C38511bc.m123103a().mo96485a("creation_id", this.f109915p.getCreationId()).mo96485a("shoot_way", this.f109915p.getShootWay()).mo96485a("tab_name", C23543l.f62133a[this.f109916q]).mo96483a("beautify_value", this.f109913n.f62136c[this.f109916q]).mo96485a("content_source", this.f109915p.getContentSource()).mo96485a("content_type", this.f109915p.getContentType()).mo96485a("enter_from", "video_shoot_page").f100112a);
        }
    }

    /* renamed from: c */
    private void m134385c() {
        this.f109904e = LayoutInflater.from(getContext()).inflate(R.layout.h_, this, true);
        this.f109903d = this.f109904e.findViewById(R.id.i4);
        this.f109905f = (AVDmtImageTextView) this.f109903d.findViewById(R.id.ib);
        this.f109906g = (AVDmtImageTextView) this.f109903d.findViewById(R.id.ia);
        this.f109907h = (AVDmtImageTextView) this.f109903d.findViewById(R.id.i8);
        this.f109908i = (AVDmtImageTextView) this.f109903d.findViewById(R.id.i9);
        this.f109909j = (AVDmtImageTextView) this.f109903d.findViewById(R.id.i6);
        this.f109910k = this.f109904e.findViewById(R.id.l4);
        this.f109910k.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (C42245a.this.f109900a != null) {
                    C42245a.this.f109900a.invoke();
                }
            }
        });
        if (this.f109914o) {
            this.f109908i.setVisibility(0);
            this.f109909j.setVisibility(0);
        }
        TextView textView = (TextView) this.f109904e.findViewById(R.id.i_);
        if (C30538p.m99745a()) {
            textView.setText("");
            textView.setPadding((int) C9738o.m28708b(this.f109904e.getContext(), 18.0f), 0, 0, 0);
            textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.gd, 0, 0, 0);
        }
        this.f109911l = (SeekBar) this.f109904e.findViewById(R.id.i5);
        this.f109912m = (RelativeLayout) this.f109904e.findViewById(R.id.i7);
        this.f109905f.mo103501a(true);
        this.f109911l.setProgress(this.f109913n.f62136c[this.f109916q]);
        this.f109905f.setOnClickListener(this);
        this.f109906g.setOnClickListener(this);
        this.f109907h.setOnClickListener(this);
        this.f109908i.setOnClickListener(this);
        this.f109909j.setOnClickListener(this);
        textView.setOnClickListener(this);
        this.f109911l.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
            public final void onStartTrackingTouch(SeekBar seekBar) {
            }

            public final void onStopTrackingTouch(SeekBar seekBar) {
                C42245a.this.f109902c = true;
            }

            public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                C42245a.this.mo103684a(i, z);
            }
        });
    }

    public final void setOutsideClickListener(C7561a<C7581n> aVar) {
        this.f109900a = aVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == R.id.i_) {
            this.f109911l.setProgress((int) ((C23543l.f62134b[this.f109916q] / C23543l.f62135d[this.f109916q]) * 100.0f));
            return;
        }
        m134387e();
        m134386d();
        if (id == R.id.ib) {
            this.f109905f.mo103501a(true);
            this.f109916q = 0;
        } else if (id == R.id.ia) {
            this.f109906g.mo103501a(true);
            this.f109916q = 1;
        } else if (id == R.id.i8) {
            this.f109907h.mo103501a(true);
            this.f109916q = 2;
        } else if (id == R.id.i9) {
            this.f109908i.mo103501a(true);
            this.f109916q = 3;
        } else if (id == R.id.i6) {
            this.f109909j.mo103501a(true);
            this.f109916q = 4;
        }
        if (this.f109915p != null) {
            C6907h.m21524a("click_beautify_tab", (Map) C38511bc.m123103a().mo96485a("creation_id", this.f109915p.getCreationId()).mo96485a("shoot_way", this.f109915p.getShootWay()).mo96485a("tab_name", C23543l.f62133a[this.f109916q]).mo96485a("content_source", this.f109915p.getContentSource()).mo96485a("content_type", this.f109915p.getContentType()).mo96485a("enter_from", "video_shoot_page").f100112a);
        }
        this.f109911l.setProgress(this.f109913n.f62136c[this.f109916q]);
    }

    /* renamed from: a */
    public final void mo103684a(int i, boolean z) {
        this.f109913n.f62136c[this.f109916q] = i;
        if (this.f109901b != null) {
            if (this.f109916q == 0) {
                C35563c.f93230L.mo93341a(Property.UserChangeSkinLevel, z | C35563c.f93230L.mo93342a(Property.UserChangeSkinLevel));
                this.f109901b.mo103609a(i);
            } else if (this.f109916q == 1) {
                C35563c.f93230L.mo93341a(Property.UserChangeShapeLevel, z | C35563c.f93230L.mo93342a(Property.UserChangeShapeLevel));
                this.f109901b.mo103614b(i);
            } else if (this.f109916q == 2) {
                C35563c.f93230L.mo93341a(Property.UserChangeBigEyeLevel, z | C35563c.f93230L.mo93342a(Property.UserChangeBigEyeLevel));
                this.f109901b.mo103615c(i);
            } else if (this.f109916q == 3) {
                C35563c.f93230L.mo93341a(Property.UserChangeLipLevel, z | C35563c.f93230L.mo93342a(Property.UserChangeLipLevel));
                this.f109901b.mo103616d(i);
            } else {
                if (this.f109916q == 4) {
                    C35563c.f93230L.mo93341a(Property.UserChangeBlushLevel, z | C35563c.f93230L.mo93342a(Property.UserChangeBlushLevel));
                    this.f109901b.mo103617e(i);
                }
            }
        }
    }

    C42245a(Context context, C23543l lVar, AVETParameter aVETParameter, boolean z) {
        super(context);
        this.f109913n = lVar;
        this.f109915p = aVETParameter;
        this.f109914o = z;
        m134385c();
    }
}
