package com.p280ss.android.ugc.aweme.commercialize.views.popupwebpage;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p564d.C10789c;
import com.bytedance.ies.dmt.p262ui.widget.AutoRTLImageView;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.crossplatform.params.C25897e;
import com.p280ss.android.ugc.aweme.crossplatform.params.base.C25886b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebTitleBar */
public final class AdPopUpWebTitleBar extends FrameLayout {

    /* renamed from: a */
    private C25621a f67479a;

    /* renamed from: b */
    private C25886b f67480b;

    /* renamed from: c */
    private String f67481c;

    /* renamed from: d */
    private HashMap f67482d;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebTitleBar$a */
    public interface C25621a {
        /* renamed from: a */
        void mo66427a();

        /* renamed from: b */
        void mo66428b();

        /* renamed from: c */
        void mo66429c();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebTitleBar$b */
    static final class C25622b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebTitleBar f67483a;

        C25622b(AdPopUpWebTitleBar adPopUpWebTitleBar) {
            this.f67483a = adPopUpWebTitleBar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C25621a titleBarListener = this.f67483a.getTitleBarListener();
            if (titleBarListener != null) {
                titleBarListener.mo66428b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebTitleBar$c */
    static final class C25623c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebTitleBar f67484a;

        C25623c(AdPopUpWebTitleBar adPopUpWebTitleBar) {
            this.f67484a = adPopUpWebTitleBar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C25621a titleBarListener = this.f67484a.getTitleBarListener();
            if (titleBarListener != null) {
                titleBarListener.mo66429c();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebTitleBar$d */
    static final class C25624d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebTitleBar f67485a;

        C25624d(AdPopUpWebTitleBar adPopUpWebTitleBar) {
            this.f67485a = adPopUpWebTitleBar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C25621a titleBarListener = this.f67485a.getTitleBarListener();
            if (titleBarListener != null) {
                titleBarListener.mo66427a();
            }
        }
    }

    public AdPopUpWebTitleBar(Context context) {
        this(context, null, 0, 6, null);
    }

    public AdPopUpWebTitleBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    private View m84191a(int i) {
        if (this.f67482d == null) {
            this.f67482d = new HashMap();
        }
        View view = (View) this.f67482d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f67482d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final C25886b getCrossPlatformParams() {
        return this.f67480b;
    }

    public final String getDefTitle() {
        return this.f67481c;
    }

    public final C25621a getTitleBarListener() {
        return this.f67479a;
    }

    /* renamed from: a */
    public final void mo66431a() {
        AutoRTLImageView autoRTLImageView = (AutoRTLImageView) m84191a((int) R.id.ci5);
        C7573i.m23582a((Object) autoRTLImageView, "pop_up_web_go_back");
        autoRTLImageView.setVisibility(0);
    }

    /* renamed from: b */
    public final void mo66434b() {
        AutoRTLImageView autoRTLImageView = (AutoRTLImageView) m84191a((int) R.id.ci5);
        C7573i.m23582a((Object) autoRTLImageView, "pop_up_web_go_back");
        autoRTLImageView.setVisibility(8);
    }

    /* renamed from: c */
    private void m84192c() {
        ((AutoRTLImageView) m84191a((int) R.id.ci5)).setOnClickListener(new C25622b(this));
        ((AutoRTLImageView) m84191a((int) R.id.ci_)).setOnClickListener(new C25623c(this));
        ((AutoRTLImageView) m84191a((int) R.id.ci4)).setOnClickListener(new C25624d(this));
    }

    /* renamed from: d */
    private void m84193d() {
        String str;
        C25886b bVar = this.f67480b;
        if (bVar != null) {
            C25897e eVar = bVar.f68476d;
            if (eVar != null) {
                C7573i.m23582a((Object) eVar, "crossPlatformParams?.uiInfo?: return");
                if (TextUtils.isEmpty(eVar.f68509d)) {
                    str = getContext().getString(R.string.dz0);
                } else {
                    str = eVar.f68509d;
                }
                this.f67481c = str;
                DmtTextView dmtTextView = (DmtTextView) m84191a((int) R.id.cia);
                C7573i.m23582a((Object) dmtTextView, "pop_up_web_title");
                dmtTextView.setText(this.f67481c);
            }
        }
    }

    public final void setCrossPlatformParams(C25886b bVar) {
        this.f67480b = bVar;
    }

    public final void setDefTitle(String str) {
        this.f67481c = str;
    }

    public final void setTitleBarListener(C25621a aVar) {
        this.f67479a = aVar;
    }

    /* renamed from: a */
    public final void mo66432a(C25886b bVar) {
        C7573i.m23587b(bVar, "params");
        this.f67480b = bVar;
        m84193d();
        C10789c.m31502a((AutoRTLImageView) m84191a((int) R.id.ci4));
        C10789c.m31502a((AutoRTLImageView) m84191a((int) R.id.ci5));
        C10789c.m31502a((AutoRTLImageView) m84191a((int) R.id.ci_));
        m84192c();
    }

    /* renamed from: a */
    public final void mo66433a(String str) {
        DmtTextView dmtTextView = (DmtTextView) m84191a((int) R.id.cia);
        C7573i.m23582a((Object) dmtTextView, "pop_up_web_title");
        if (str == null) {
            str = this.f67481c;
        }
        CharSequence charSequence = str;
        if (charSequence == null) {
            charSequence = getContext().getString(R.string.dz0);
        }
        dmtTextView.setText(charSequence);
    }

    public AdPopUpWebTitleBar(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.b3w, this, true);
    }

    public /* synthetic */ AdPopUpWebTitleBar(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
