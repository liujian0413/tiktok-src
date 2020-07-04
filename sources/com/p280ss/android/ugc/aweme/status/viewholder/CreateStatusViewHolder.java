package com.p280ss.android.ugc.aweme.status.viewholder;

import android.arch.lifecycle.C0053p;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.C39221a;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.C39221a.C39222a;
import com.p280ss.android.ugc.aweme.status.RecordStatusViewModel;
import com.p280ss.android.ugc.aweme.status.p1632b.C41809a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.status.viewholder.CreateStatusViewHolder */
public final class CreateStatusViewHolder extends C1293v implements OnClickListener {

    /* renamed from: a */
    public C39221a f108807a;

    /* renamed from: b */
    public int f108808b;

    /* renamed from: c */
    public boolean f108809c;

    /* renamed from: d */
    public int f108810d;

    /* renamed from: e */
    public int f108811e;

    /* renamed from: f */
    public int f108812f;

    /* renamed from: g */
    public View f108813g;

    /* renamed from: h */
    public final RecordStatusViewModel f108814h;

    /* renamed from: i */
    public FragmentActivity f108815i;

    /* renamed from: j */
    public C41809a f108816j;

    /* renamed from: com.ss.android.ugc.aweme.status.viewholder.CreateStatusViewHolder$a */
    static final class C41829a<T> implements C0053p<Integer> {

        /* renamed from: a */
        final /* synthetic */ CreateStatusViewHolder f108818a;

        C41829a(CreateStatusViewHolder createStatusViewHolder) {
            this.f108818a = createStatusViewHolder;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Integer num) {
            if (num != null) {
                CreateStatusViewHolder createStatusViewHolder = this.f108818a;
                C7573i.m23582a((Object) num, "it");
                createStatusViewHolder.f108810d = num.intValue();
                this.f108818a.mo102599a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.status.viewholder.CreateStatusViewHolder$b */
    static final class C41830b<T> implements C0053p<Integer> {

        /* renamed from: a */
        final /* synthetic */ CreateStatusViewHolder f108819a;

        C41830b(CreateStatusViewHolder createStatusViewHolder) {
            this.f108819a = createStatusViewHolder;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Integer num) {
            if (num != null) {
                CreateStatusViewHolder createStatusViewHolder = this.f108819a;
                C7573i.m23582a((Object) num, "it");
                createStatusViewHolder.f108811e = num.intValue();
                this.f108819a.mo102599a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.status.viewholder.CreateStatusViewHolder$c */
    static final class C41831c<T> implements C0053p<Integer> {

        /* renamed from: a */
        final /* synthetic */ CreateStatusViewHolder f108820a;

        C41831c(CreateStatusViewHolder createStatusViewHolder) {
            this.f108820a = createStatusViewHolder;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Integer num) {
            if (num != null) {
                CreateStatusViewHolder createStatusViewHolder = this.f108820a;
                C7573i.m23582a((Object) num, "it");
                createStatusViewHolder.f108812f = num.intValue();
                this.f108820a.mo102599a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.status.viewholder.CreateStatusViewHolder$d */
    public static final class C41832d implements C39222a {

        /* renamed from: a */
        final /* synthetic */ CreateStatusViewHolder f108821a;

        /* renamed from: a */
        public final void mo97462a() {
            this.f108821a.f108814h.mo102537h().setValue(null);
            this.f108821a.f108808b = 0;
            this.f108821a.f108809c = false;
            if (this.f108821a.f108807a != null) {
                C39221a aVar = this.f108821a.f108807a;
                if (aVar == null) {
                    C7573i.m23580a();
                }
                if (aVar.isShowing()) {
                    C39221a aVar2 = this.f108821a.f108807a;
                    if (aVar2 != null) {
                        aVar2.dismiss();
                    }
                    this.f108821a.f108807a = null;
                    this.f108821a.f108810d = 0;
                    this.f108821a.f108812f = 0;
                    this.f108821a.f108811e = 0;
                }
            }
        }

        C41832d(CreateStatusViewHolder createStatusViewHolder) {
            this.f108821a = createStatusViewHolder;
        }
    }

    /* renamed from: b */
    private void m133072b() {
        this.f108814h.mo102536g().setValue(this.f108816j);
        this.f108814h.mo102538i().observe(this.f108815i, new C41829a(this));
        this.f108814h.mo102539j().observe(this.f108815i, new C41830b(this));
        this.f108814h.mo102540k().observe(this.f108815i, new C41831c(this));
    }

    /* renamed from: a */
    public final void mo102599a() {
        if (this.f108807a == null && this.f108809c) {
            this.f108807a = new C39221a(this.f108815i);
            C39221a aVar = this.f108807a;
            if (aVar != null) {
                StringBuilder sb = new StringBuilder("       ");
                sb.append(this.f108815i.getString(R.string.fz));
                sb.append("       ");
                aVar.setMessage(sb.toString());
            }
            C39221a aVar2 = this.f108807a;
            if (aVar2 != null) {
                aVar2.mo97549a(0);
            }
            C39221a aVar3 = this.f108807a;
            if (aVar3 != null) {
                aVar3.setCancelable(false);
            }
            C39221a aVar4 = this.f108807a;
            if (aVar4 != null) {
                aVar4.mo97550a((C39222a) new C41832d(this));
            }
            C39221a aVar5 = this.f108807a;
            if (aVar5 != null) {
                aVar5.show();
            }
        }
        if (this.f108807a != null) {
            int i = this.f108810d + this.f108811e + this.f108812f;
            if (i >= this.f108808b) {
                this.f108808b = i;
                C39221a aVar6 = this.f108807a;
                if (aVar6 == null) {
                    C7573i.m23580a();
                }
                aVar6.mo97549a(this.f108808b);
            }
            if (this.f108808b >= 100) {
                C39221a aVar7 = this.f108807a;
                if (aVar7 == null) {
                    C7573i.m23580a();
                }
                aVar7.mo97549a(100);
                C39221a aVar8 = this.f108807a;
                if (aVar8 == null) {
                    C7573i.m23580a();
                }
                aVar8.dismiss();
                this.f108808b = 0;
                this.f108810d = 0;
                this.f108812f = 0;
                this.f108811e = 0;
                this.f108807a = null;
                this.f108809c = false;
            }
        }
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f108814h.mo102537h().setValue(this.f108816j);
        this.f108809c = true;
    }

    public CreateStatusViewHolder(View view, RecordStatusViewModel recordStatusViewModel, FragmentActivity fragmentActivity, C41809a aVar) {
        C7573i.m23587b(view, "rootView");
        C7573i.m23587b(recordStatusViewModel, "statusViewModel");
        C7573i.m23587b(fragmentActivity, "context");
        C7573i.m23587b(aVar, "effect");
        super(view);
        this.f108813g = view;
        this.f108814h = recordStatusViewModel;
        this.f108815i = fragmentActivity;
        this.f108816j = aVar;
        this.f108813g.post(new Runnable(this) {

            /* renamed from: a */
            final /* synthetic */ CreateStatusViewHolder f108817a;

            {
                this.f108817a = r1;
            }

            public final void run() {
                LayoutParams layoutParams = this.f108817a.f108813g.getLayoutParams();
                layoutParams.height = (this.f108817a.f108813g.getWidth() * 16) / 9;
                this.f108817a.f108813g.setLayoutParams(layoutParams);
            }
        });
        this.f108813g.setOnClickListener(this);
        m133072b();
    }
}
