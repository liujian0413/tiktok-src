package com.p280ss.android.ugc.aweme.crossplatform.view;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.support.graphics.drawable.VectorDrawableCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.AutoRTLImageView;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.crossplatform.base.C25833b;
import com.p280ss.android.ugc.aweme.crossplatform.params.base.C25886b;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformTitleBar */
public final class CrossPlatformTitleBar extends FrameLayout {

    /* renamed from: a */
    private C26004a f68734a;

    /* renamed from: b */
    private C25886b f68735b;

    /* renamed from: c */
    private HashMap f68736c;

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformTitleBar$a */
    public interface C26004a {
        /* renamed from: a */
        void mo67126a();

        /* renamed from: a */
        void mo67127a(View view);

        /* renamed from: b */
        void mo67128b();

        /* renamed from: c */
        void mo67129c();

        /* renamed from: d */
        void mo67130d();
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformTitleBar$b */
    static final class C26005b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CrossPlatformTitleBar f68737a;

        C26005b(CrossPlatformTitleBar crossPlatformTitleBar) {
            this.f68737a = crossPlatformTitleBar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C26004a titleWrap = this.f68737a.getTitleWrap();
            if (titleWrap != null) {
                C7573i.m23582a((Object) view, "it");
                titleWrap.mo67127a(view);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformTitleBar$c */
    static final class C26006c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CrossPlatformTitleBar f68738a;

        C26006c(CrossPlatformTitleBar crossPlatformTitleBar) {
            this.f68738a = crossPlatformTitleBar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C26004a titleWrap = this.f68738a.getTitleWrap();
            if (titleWrap != null) {
                titleWrap.mo67126a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformTitleBar$d */
    static final class C26007d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CrossPlatformTitleBar f68739a;

        C26007d(CrossPlatformTitleBar crossPlatformTitleBar) {
            this.f68739a = crossPlatformTitleBar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C26004a titleWrap = this.f68739a.getTitleWrap();
            if (titleWrap != null) {
                titleWrap.mo67130d();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformTitleBar$e */
    static final class C26008e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CrossPlatformTitleBar f68740a;

        C26008e(CrossPlatformTitleBar crossPlatformTitleBar) {
            this.f68740a = crossPlatformTitleBar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C26004a titleWrap = this.f68740a.getTitleWrap();
            if (titleWrap != null) {
                titleWrap.mo67129c();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformTitleBar$f */
    static final class C26009f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CrossPlatformTitleBar f68741a;

        C26009f(CrossPlatformTitleBar crossPlatformTitleBar) {
            this.f68741a = crossPlatformTitleBar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C26004a titleWrap = this.f68741a.getTitleWrap();
            if (titleWrap != null) {
                titleWrap.mo67128b();
            }
        }
    }

    /* renamed from: a */
    private View m85394a(int i) {
        if (this.f68736c == null) {
            this.f68736c = new HashMap();
        }
        View view = (View) this.f68736c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f68736c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final C25886b getCrossPlatformParams() {
        return this.f68735b;
    }

    public final C26004a getTitleWrap() {
        return this.f68734a;
    }

    /* renamed from: d */
    public final void mo67449d() {
        AutoRTLImageView autoRTLImageView = (AutoRTLImageView) m85394a((int) R.id.xb);
        C7573i.m23582a((Object) autoRTLImageView, "close_all_webpage");
        autoRTLImageView.setVisibility(0);
    }

    /* renamed from: e */
    public final void mo67450e() {
        AutoRTLImageView autoRTLImageView = (AutoRTLImageView) m85394a((int) R.id.xb);
        C7573i.m23582a((Object) autoRTLImageView, "close_all_webpage");
        autoRTLImageView.setVisibility(8);
    }

    /* renamed from: f */
    private final void m85396f() {
        LayoutInflater.from(getContext()).inflate(R.layout.b2v, this, true);
        setBackgroundResource(R.drawable.u5);
        setMinimumHeight((int) getResources().getDimension(R.dimen.nb));
    }

    /* renamed from: c */
    public final void mo67448c() {
        setBackgroundResource(R.drawable.u5);
        View a = m85394a((int) R.id.li);
        C7573i.m23582a((Object) a, "bg_browser_title");
        a.setVisibility(8);
        DmtTextView dmtTextView = (DmtTextView) m85394a((int) R.id.title);
        C7573i.m23582a((Object) dmtTextView, "title");
        dmtTextView.setVisibility(0);
        ((AutoRTLImageView) m85394a((int) R.id.xg)).setImageResource(R.drawable.ana);
        ((AutoRTLImageView) m85394a((int) R.id.xb)).setImageResource(R.drawable.and);
        ((AutoRTLImageView) m85394a((int) R.id.rj)).setImageResource(R.drawable.anj);
        ((AutoRTLImageView) m85394a((int) R.id.cs0)).setImageResource(R.drawable.anh);
        ((AutoRTLImageView) m85394a((int) R.id.ctd)).setImageResource(R.drawable.anf);
    }

    /* renamed from: a */
    public final void mo67446a() {
        setBackgroundColor(0);
        if (C6399b.m19944t()) {
            View a = m85394a((int) R.id.li);
            C7573i.m23582a((Object) a, "bg_browser_title");
            a.setVisibility(0);
        } else {
            View a2 = m85394a((int) R.id.li);
            C7573i.m23582a((Object) a2, "bg_browser_title");
            a2.setVisibility(8);
        }
        DmtTextView dmtTextView = (DmtTextView) m85394a((int) R.id.title);
        C7573i.m23582a((Object) dmtTextView, "title");
        dmtTextView.setVisibility(8);
        ((AutoRTLImageView) m85394a((int) R.id.xg)).setImageResource(R.drawable.an_);
        ((AutoRTLImageView) m85394a((int) R.id.xb)).setImageResource(R.drawable.anc);
        ((AutoRTLImageView) m85394a((int) R.id.rj)).setImageResource(R.drawable.ani);
        ((AutoRTLImageView) m85394a((int) R.id.cs0)).setImageResource(R.drawable.ang);
        ((AutoRTLImageView) m85394a((int) R.id.ctd)).setImageResource(R.drawable.ane);
    }

    /* renamed from: b */
    public final void mo67447b() {
        setBackgroundColor(0);
        View a = m85394a((int) R.id.li);
        C7573i.m23582a((Object) a, "bg_browser_title");
        a.setVisibility(0);
        View a2 = m85394a((int) R.id.li);
        C7573i.m23582a((Object) a2, "bg_browser_title");
        a2.setBackground(getContext().getDrawable(R.drawable.u5));
        DmtTextView dmtTextView = (DmtTextView) m85394a((int) R.id.title);
        C7573i.m23582a((Object) dmtTextView, "title");
        dmtTextView.setVisibility(8);
        ((AutoRTLImageView) m85394a((int) R.id.xg)).setImageResource(R.drawable.an_);
        ((AutoRTLImageView) m85394a((int) R.id.xb)).setImageResource(R.drawable.anc);
        ((AutoRTLImageView) m85394a((int) R.id.rj)).setImageResource(R.drawable.ani);
        ((AutoRTLImageView) m85394a((int) R.id.cs0)).setImageResource(R.drawable.ang);
        ((AutoRTLImageView) m85394a((int) R.id.ctd)).setImageResource(R.drawable.ane);
    }

    public final void setTitleWrap(C26004a aVar) {
        this.f68734a = aVar;
    }

    public final void setCrossPlatformParams(C25886b bVar) {
        this.f68735b = bVar;
        m85395a(this.f68735b);
    }

    public CrossPlatformTitleBar(Context context) {
        C7573i.m23587b(context, "context");
        super(context);
        m85396f();
    }

    public final void setBackgroundAlpha(float f) {
        View a = m85394a((int) R.id.li);
        C7573i.m23582a((Object) a, "bg_browser_title");
        a.setAlpha(f);
    }

    public final void setTitle(CharSequence charSequence) {
        C7573i.m23587b(charSequence, "str");
        DmtTextView dmtTextView = (DmtTextView) m85394a((int) R.id.title);
        C7573i.m23582a((Object) dmtTextView, "title");
        dmtTextView.setText(charSequence);
    }

    /* renamed from: a */
    private final void m85395a(C25886b bVar) {
        String str;
        if (bVar != null) {
            DmtTextView dmtTextView = (DmtTextView) m85394a((int) R.id.title);
            C7573i.m23582a((Object) dmtTextView, "title");
            if (TextUtils.isEmpty(bVar.f68476d.f68509d)) {
                str = getContext().getString(R.string.dz0);
            } else {
                str = bVar.f68476d.f68509d;
            }
            dmtTextView.setText(str);
            ((AutoRTLImageView) m85394a((int) R.id.ctd)).setOnClickListener(new C26005b(this));
            ((AutoRTLImageView) m85394a((int) R.id.xg)).setOnClickListener(new C26006c(this));
            ((AutoRTLImageView) m85394a((int) R.id.xb)).setOnClickListener(new C26007d(this));
            if (bVar.f68476d.f68507b) {
                AutoRTLImageView autoRTLImageView = (AutoRTLImageView) m85394a((int) R.id.ctd);
                C7573i.m23582a((Object) autoRTLImageView, "right_menu");
                autoRTLImageView.setVisibility(8);
            }
            ((AutoRTLImageView) m85394a((int) R.id.rj)).setOnClickListener(new C26008e(this));
            if (bVar.f68476d.f68513h) {
                AutoRTLImageView autoRTLImageView2 = (AutoRTLImageView) m85394a((int) R.id.xg);
                C7573i.m23582a((Object) autoRTLImageView2, "close_custom");
                autoRTLImageView2.setVisibility(0);
            }
            if (bVar.f68476d.f68510e != -2) {
                DmtTextView dmtTextView2 = (DmtTextView) m85394a((int) R.id.title);
                C7573i.m23582a((Object) dmtTextView2, "title");
                dmtTextView2.setBackground(new ColorDrawable(bVar.f68476d.f68510e));
                setBackgroundColor(bVar.f68476d.f68510e);
            }
            if (bVar.f68476d.f68512g != -2) {
                ((DmtTextView) m85394a((int) R.id.title)).setTextColor(bVar.f68476d.f68512g);
                Context context = getContext();
                if (context != null) {
                    VectorDrawableCompat a = VectorDrawableCompat.m1855a(context.getResources(), (int) R.drawable.anb, context.getTheme());
                    if (a != null) {
                        a.setTint(bVar.f68476d.f68512g);
                    }
                    ((AutoRTLImageView) m85394a((int) R.id.xg)).setImageDrawable(a);
                }
            }
            if (bVar.f68476d.f68507b) {
                AutoRTLImageView autoRTLImageView3 = (AutoRTLImageView) m85394a((int) R.id.rj);
                C7573i.m23582a((Object) autoRTLImageView3, "btn_share");
                autoRTLImageView3.setVisibility(8);
            }
            if (bVar.f68476d.f68508c) {
                if (((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).getRawAdAwemeById(bVar.f68473a.f68437j) != null) {
                    AutoRTLImageView autoRTLImageView4 = (AutoRTLImageView) m85394a((int) R.id.cs0);
                    C7573i.m23582a((Object) autoRTLImageView4, "report_ads");
                    autoRTLImageView4.setVisibility(0);
                    ((AutoRTLImageView) m85394a((int) R.id.cs0)).setOnClickListener(new C26009f(this));
                }
                AutoRTLImageView autoRTLImageView5 = (AutoRTLImageView) m85394a((int) R.id.rj);
                C7573i.m23582a((Object) autoRTLImageView5, "btn_share");
                autoRTLImageView5.setVisibility(8);
            }
            if (bVar.f68476d.f68531z == 2) {
                AutoRTLImageView autoRTLImageView6 = (AutoRTLImageView) m85394a((int) R.id.rj);
                C7573i.m23582a((Object) autoRTLImageView6, "btn_share");
                autoRTLImageView6.setVisibility(0);
                AutoRTLImageView autoRTLImageView7 = (AutoRTLImageView) m85394a((int) R.id.cs0);
                C7573i.m23582a((Object) autoRTLImageView7, "report_ads");
                autoRTLImageView7.setVisibility(8);
            } else if (bVar.f68476d.f68531z == 1) {
                AutoRTLImageView autoRTLImageView8 = (AutoRTLImageView) m85394a((int) R.id.rj);
                C7573i.m23582a((Object) autoRTLImageView8, "btn_share");
                autoRTLImageView8.setVisibility(8);
                AutoRTLImageView autoRTLImageView9 = (AutoRTLImageView) m85394a((int) R.id.cs0);
                C7573i.m23582a((Object) autoRTLImageView9, "report_ads");
                autoRTLImageView9.setVisibility(0);
            }
            if (!C6399b.m19944t() && bVar.f68476d.f68514i) {
                C25833b.m84958a((View) (AutoRTLImageView) m85394a((int) R.id.ctd), (int) R.drawable.xr);
            }
        }
    }

    public CrossPlatformTitleBar(Context context, AttributeSet attributeSet) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(attributeSet, "attrs");
        super(context, attributeSet);
        m85396f();
    }

    public CrossPlatformTitleBar(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(attributeSet, "attrs");
        super(context, attributeSet, i);
        m85396f();
    }
}
