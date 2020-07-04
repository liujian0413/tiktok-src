package com.p280ss.android.ugc.aweme.longvideonew.widget;

import android.app.Activity;
import android.arch.lifecycle.C0053p;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.comment.param.C24201b.C24202a;
import com.p280ss.android.ugc.aweme.commercialize.views.CommerceLikeLayout;
import com.p280ss.android.ugc.aweme.feed.C28297e;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.longvideo.DiggView;
import com.p280ss.android.ugc.aweme.longvideo.DiggView.C32699a;
import com.p280ss.android.ugc.aweme.longvideo.p1374a.C32716a;
import com.p280ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView;
import com.p280ss.android.ugc.aweme.longvideonew.C32772a;
import com.p280ss.android.ugc.aweme.longvideonew.C32778b;
import com.p280ss.android.ugc.aweme.longvideonew.C32779c.C32780a;
import com.p280ss.android.ugc.aweme.metrics.C33283y;
import com.p280ss.android.ugc.aweme.poi.utils.C35452k;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.GenericWidget;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.longvideonew.widget.VideoOperationWidget */
public final class VideoOperationWidget extends GenericWidget implements C0053p<C23083a>, OnClickListener {

    /* renamed from: a */
    public ViewGroup f85594a;

    /* renamed from: i */
    public C32772a f85595i;

    /* renamed from: j */
    public final Aweme f85596j;

    /* renamed from: k */
    public final String f85597k;

    /* renamed from: l */
    public final int f85598l;

    /* renamed from: m */
    public final String f85599m;

    /* renamed from: n */
    public final C32778b f85600n;

    /* renamed from: o */
    public final C28297e f85601o;

    /* renamed from: p */
    private DiggView f85602p;

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.widget.VideoOperationWidget$a */
    public static final class C32809a implements C32699a {

        /* renamed from: a */
        final /* synthetic */ VideoOperationWidget f85603a;

        /* renamed from: a */
        public final void mo84155a() {
            long j;
            C33283y c = new C33283y().mo85380d(this.f85603a.f85597k).mo85381e(this.f85603a.f85597k).mo85376b(this.f85603a.f85598l).mo85071g(this.f85603a.f85596j).mo85378c(1);
            C32778b bVar = this.f85603a.f85600n;
            if (bVar != null) {
                j = bVar.mo84278a();
            } else {
                j = 0;
            }
            c.mo85373a(j).mo85252e();
        }

        C32809a(VideoOperationWidget videoOperationWidget) {
            this.f85603a = videoOperationWidget;
        }
    }

    public final void onCreate() {
        super.onCreate();
        C0053p pVar = this;
        this.f60922e.mo60132a("action_is_landscape_mode", pVar).mo60132a("action_container_on_double_click_digg", pVar);
    }

    public final void onDestroy() {
        super.onDestroy();
        DiggView diggView = this.f85602p;
        if (diggView != null) {
            diggView.onDestroy();
        }
        C32772a aVar = this.f85595i;
        if (aVar != null) {
            aVar.mo84279a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(C23083a aVar) {
        String str;
        int i;
        if (aVar != null) {
            str = aVar.f60948a;
        } else {
            str = null;
        }
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -338693263) {
                if (hashCode == 929573523 && str.equals("action_is_landscape_mode")) {
                    ViewGroup viewGroup = this.f85594a;
                    if (viewGroup != null) {
                        Object a = aVar.mo60161a();
                        C7573i.m23582a(a, "t.getData()");
                        if (((Boolean) a).booleanValue()) {
                            i = 8;
                        } else {
                            i = 0;
                        }
                        viewGroup.setVisibility(i);
                    }
                }
            } else if (str.equals("action_container_on_double_click_digg")) {
                DiggView diggView = this.f85602p;
                if (diggView != null) {
                    diggView.mo84147a();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo60146a(View view) {
        if (view != null) {
            this.f85594a = (ViewGroup) view;
            TextView textView = null;
            View inflate = LayoutInflater.from(mo60148c()).inflate(R.layout.ac2, null, false);
            if (inflate != null) {
                LinearLayout linearLayout = (LinearLayout) inflate;
                ViewGroup viewGroup = this.f85594a;
                if (viewGroup != null) {
                    viewGroup.addView(linearLayout);
                }
                View findViewById = linearLayout.findViewById(R.id.b_m);
                C7573i.m23582a((Object) findViewById, "operationView.findViewById(R.id.iv_like)");
                LongVideoDiggAnimationView longVideoDiggAnimationView = (LongVideoDiggAnimationView) findViewById;
                View findViewById2 = ((ViewGroup) mo60148c().findViewById(16908290)).findViewById(R.id.a0_);
                C7573i.m23582a((Object) findViewById2, "root.findViewById(R.id.commerce_like_layout)");
                CommerceLikeLayout commerceLikeLayout = (CommerceLikeLayout) findViewById2;
                if (C32780a.m106109a()) {
                    textView = (TextView) linearLayout.findViewById(R.id.dtf);
                    textView.setOnClickListener(this);
                    C7573i.m23582a((Object) textView, "diggCountView");
                    textView.setVisibility(0);
                }
                this.f85602p = new DiggView(longVideoDiggAnimationView, textView, this.f85597k);
                DiggView diggView = this.f85602p;
                if (diggView != null) {
                    Activity c = mo60148c();
                    if (c != null) {
                        diggView.mo84148a((AmeSSActivity) c, this.f85596j, commerceLikeLayout, this.f85597k);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.activity.AmeSSActivity");
                    }
                }
                DiggView diggView2 = this.f85602p;
                if (diggView2 != null) {
                    diggView2.mo84150a((C32699a) new C32809a(this));
                }
                View findViewById3 = linearLayout.findViewById(R.id.b7p);
                C7573i.m23582a((Object) findViewById3, "operationView.findViewById(R.id.iv_comment)");
                OnClickListener onClickListener = this;
                ((ImageView) findViewById3).setOnClickListener(onClickListener);
                View findViewById4 = linearLayout.findViewById(R.id.bc7);
                C7573i.m23582a((Object) findViewById4, "operationView.findViewById(R.id.iv_share)");
                ((ImageView) findViewById4).setOnClickListener(onClickListener);
                if (C32780a.m106109a()) {
                    View findViewById5 = linearLayout.findViewById(R.id.ds6);
                    C7573i.m23582a((Object) findViewById5, "operationView.findViewById(R.id.tv_comment_count)");
                    TextView textView2 = (TextView) findViewById5;
                    textView2.setOnClickListener(onClickListener);
                    this.f85595i = new C32772a(textView2, this.f85596j);
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    public final void onClick(View view) {
        Integer num;
        ClickInstrumentation.onClick(view);
        C42961az.m136380a(new C32716a());
        String str = null;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == R.id.b7p) {
            C28297e eVar = this.f85601o;
            if (eVar != null) {
                eVar.mo62620a(new C24202a(this.f85596j).mo62904a());
            }
        } else if (num != null && num.intValue() == R.id.bc7) {
            C28297e eVar2 = this.f85601o;
            if (eVar2 != null) {
                eVar2.mo71983a(mo60148c(), this.f85596j);
            }
            Aweme aweme = this.f85596j;
            String str2 = "click_more_button";
            C22984d a = C22984d.m75611a().mo59973a("enter_from", this.f85597k).mo59970a("is_long_item", 1);
            String str3 = "group_id";
            Aweme aweme2 = this.f85596j;
            if (aweme2 != null) {
                str = aweme2.getAid();
            }
            C35452k.m114511a(aweme, str2, a.mo59973a(str3, str));
        } else if (num != null && num.intValue() == R.id.dtf) {
            DiggView diggView = this.f85602p;
            if (diggView != null) {
                diggView.mo84151b();
            }
        } else if (num != null && num.intValue() == R.id.ds6) {
            C28297e eVar3 = this.f85601o;
            if (eVar3 != null) {
                eVar3.mo62620a(new C24202a(this.f85596j).mo62904a());
            }
        }
    }

    public VideoOperationWidget(Aweme aweme, String str, int i, String str2, C32778b bVar, C28297e eVar) {
        C7573i.m23587b(str, "mEventType");
        C7573i.m23587b(str2, "mBusinessType");
        this.f85596j = aweme;
        this.f85597k = str;
        this.f85598l = i;
        this.f85599m = str2;
        this.f85600n = bVar;
        this.f85601o = eVar;
    }
}
