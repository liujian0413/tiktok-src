package com.p280ss.android.ugc.aweme.profile.p1487ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.common.C10778e;
import com.bytedance.ies.dmt.p262ui.common.C6394b;
import com.bytedance.ies.dmt.p262ui.widget.DmtButton;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.p1416n.C34032a;
import com.p280ss.android.ugc.aweme.profile.R$styleable;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.NoticeButtonView */
public final class NoticeButtonView extends LinearLayout implements OnClickListener, C10778e {

    /* renamed from: a */
    public static final C36600a f96041a = new C36600a(null);

    /* renamed from: b */
    private C36601b f96042b;

    /* renamed from: c */
    private int f96043c;

    /* renamed from: d */
    private final Context f96044d;

    /* renamed from: e */
    private final AttributeSet f96045e;

    /* renamed from: f */
    private final int f96046f;

    /* renamed from: g */
    private HashMap f96047g;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.NoticeButtonView$a */
    public static final class C36600a {
        private C36600a() {
        }

        public /* synthetic */ C36600a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.NoticeButtonView$b */
    public interface C36601b {
        /* renamed from: a */
        void mo92855a();

        /* renamed from: b */
        void mo92856b();
    }

    /* renamed from: b */
    private View m118104b(int i) {
        if (this.f96047g == null) {
            this.f96047g = new HashMap();
        }
        View view = (View) this.f96047g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f96047g.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final void mo25766a(int i) {
    }

    public final AttributeSet getAttrs() {
        return this.f96045e;
    }

    public final int getDefStyleAttr() {
        return this.f96046f;
    }

    public final C36601b getMClickListener() {
        return this.f96042b;
    }

    public final int getMColorMode() {
        return this.f96043c;
    }

    public final Context getMContext() {
        return this.f96044d;
    }

    public final TextView getContextTextView() {
        DmtTextView dmtTextView = (DmtTextView) m118104b(R.id.b7w);
        C7573i.m23582a((Object) dmtTextView, "iv_context");
        return dmtTextView;
    }

    public final TextView getTitleTextView() {
        DmtTextView dmtTextView = (DmtTextView) m118104b(R.id.bd2);
        C7573i.m23582a((Object) dmtTextView, "iv_title");
        return dmtTextView;
    }

    public final void setMClickListener(C36601b bVar) {
        this.f96042b = bVar;
    }

    public final void setMColorMode(int i) {
        this.f96043c = i;
    }

    public final void setOnInternalClickListener(C36601b bVar) {
        C7573i.m23587b(bVar, "listener");
        this.f96042b = bVar;
    }

    public NoticeButtonView(Context context) {
        C7573i.m23587b(context, "mContext");
        this(context, null);
    }

    private final void setColorMode(int i) {
        if (this.f96043c != i) {
            this.f96043c = i;
            mo25766a(this.f96043c);
        }
    }

    public final void setCloseImage(int i) {
        ((ImageView) m118104b(R.id.b7g)).setImageResource(i);
    }

    public final void setContextTextColor(int i) {
        ((DmtTextView) m118104b(R.id.b7w)).setTextColor(i);
    }

    public final void setIconImage(int i) {
        ((ImageView) m118104b(R.id.b_a)).setImageResource(i);
    }

    public final void setNoticeBackgroundColor(int i) {
        ((LinearLayout) m118104b(R.id.c5c)).setBackgroundColor(i);
    }

    public final void setCloseImage(Bitmap bitmap) {
        C7573i.m23587b(bitmap, "bitmap");
        ((ImageView) m118104b(R.id.b7g)).setImageBitmap(bitmap);
    }

    public final void setContextText(CharSequence charSequence) {
        C7573i.m23587b(charSequence, "text");
        DmtTextView dmtTextView = (DmtTextView) m118104b(R.id.b7w);
        C7573i.m23582a((Object) dmtTextView, "iv_context");
        dmtTextView.setText(charSequence);
    }

    public final void setIconImage(Bitmap bitmap) {
        C7573i.m23587b(bitmap, "bitmap");
        ((ImageView) m118104b(R.id.b_a)).setImageBitmap(bitmap);
    }

    public final void setItemText(String str) {
        C7573i.m23587b(str, "text");
        DmtButton dmtButton = (DmtButton) m118104b(R.id.b6s);
        C7573i.m23582a((Object) dmtButton, "iv_button");
        dmtButton.setText(str);
    }

    public final void setTitleText(CharSequence charSequence) {
        C7573i.m23587b(charSequence, "text");
        DmtTextView dmtTextView = (DmtTextView) m118104b(R.id.bd2);
        C7573i.m23582a((Object) dmtTextView, "iv_title");
        dmtTextView.setText(charSequence);
    }

    public final void setContextText(int i) {
        DmtTextView dmtTextView = (DmtTextView) m118104b(R.id.b7w);
        C7573i.m23582a((Object) dmtTextView, "iv_context");
        Context context = getContext();
        C7573i.m23582a((Object) context, "context");
        dmtTextView.setText(context.getResources().getText(i));
    }

    public final void setTitleText(int i) {
        DmtTextView dmtTextView = (DmtTextView) m118104b(R.id.bd2);
        C7573i.m23582a((Object) dmtTextView, "iv_title");
        Context context = getContext();
        C7573i.m23582a((Object) context, "context");
        dmtTextView.setText(context.getResources().getText(i));
    }

    public final void setContextText(String str) {
        C7573i.m23587b(str, "text");
        DmtTextView dmtTextView = (DmtTextView) m118104b(R.id.b7w);
        C7573i.m23582a((Object) dmtTextView, "iv_context");
        dmtTextView.setText(str);
    }

    public final void setTitleText(String str) {
        C7573i.m23587b(str, "text");
        DmtTextView dmtTextView = (DmtTextView) m118104b(R.id.bd2);
        C7573i.m23582a((Object) dmtTextView, "iv_title");
        dmtTextView.setText(str);
    }

    public final void onClick(View view) {
        Integer num;
        ClickInstrumentation.onClick(view);
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        DmtButton dmtButton = (DmtButton) m118104b(R.id.b6s);
        C7573i.m23582a((Object) dmtButton, "iv_button");
        int id = dmtButton.getId();
        if (num != null && num.intValue() == id) {
            C36601b bVar = this.f96042b;
            if (bVar != null) {
                bVar.mo92855a();
            }
        } else {
            ImageView imageView = (ImageView) m118104b(R.id.b7g);
            C7573i.m23582a((Object) imageView, "iv_close");
            int id2 = imageView.getId();
            if (num != null && num.intValue() == id2) {
                C36601b bVar2 = this.f96042b;
                if (bVar2 != null) {
                    bVar2.mo92856b();
                }
            } else {
                DmtTextView dmtTextView = (DmtTextView) m118104b(R.id.b7w);
                C7573i.m23582a((Object) dmtTextView, "iv_context");
                int id3 = dmtTextView.getId();
                if (num == null || num.intValue() != id3) {
                    DmtTextView dmtTextView2 = (DmtTextView) m118104b(R.id.bd2);
                    C7573i.m23582a((Object) dmtTextView2, "iv_title");
                    dmtTextView2.getId();
                    if (num != null) {
                        num.intValue();
                    }
                }
            }
        }
    }

    public NoticeButtonView(Context context, AttributeSet attributeSet) {
        C7573i.m23587b(context, "mContext");
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m118103a(Context context, AttributeSet attributeSet) {
        C7573i.m23587b(context, "mContext");
        LinearLayout.inflate(context, R.layout.afd, this);
        OnClickListener onClickListener = this;
        ((DmtButton) m118104b(R.id.b6s)).setOnClickListener(onClickListener);
        ((ImageView) m118104b(R.id.b7g)).setOnClickListener(onClickListener);
        ((DmtTextView) m118104b(R.id.b7w)).setOnClickListener(onClickListener);
        ((DmtTextView) m118104b(R.id.bd2)).setOnClickListener(onClickListener);
        ((DmtButton) m118104b(R.id.b6s)).setOnTouchListener(new C34032a(0.5f, 150, null));
        ((ImageView) m118104b(R.id.b7g)).setOnTouchListener(new C34032a(0.5f, 150, null));
        C6394b a = C6394b.m19903a();
        C7573i.m23582a((Object) a, "ColorModeManager.getInstance()");
        setColorMode(a.f18686a);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NoticeButtonView);
        Drawable drawable = obtainStyledAttributes.getDrawable(3);
        if (drawable != null) {
            ((ImageView) m118104b(R.id.b_a)).setImageDrawable(drawable);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(0);
        if (drawable2 != null) {
            ((ImageView) m118104b(R.id.b7g)).setImageDrawable(drawable2);
        }
        DmtTextView dmtTextView = (DmtTextView) m118104b(R.id.bd2);
        C7573i.m23582a((Object) dmtTextView, "iv_title");
        dmtTextView.setText(obtainStyledAttributes.getString(6));
        ((DmtTextView) m118104b(R.id.bd2)).setTextColor(obtainStyledAttributes.getColor(7, getResources().getColor(R.color.sv)));
        DmtTextView dmtTextView2 = (DmtTextView) m118104b(R.id.b7w);
        C7573i.m23582a((Object) dmtTextView2, "iv_context");
        dmtTextView2.setText(obtainStyledAttributes.getString(1));
        ((DmtTextView) m118104b(R.id.b7w)).setTextColor(obtainStyledAttributes.getColor(2, getResources().getColor(R.color.sv)));
        DmtButton dmtButton = (DmtButton) m118104b(R.id.b6s);
        C7573i.m23582a((Object) dmtButton, "iv_button");
        dmtButton.setText(obtainStyledAttributes.getString(4));
        ((LinearLayout) m118104b(R.id.c5c)).setBackgroundColor(obtainStyledAttributes.getColor(5, getResources().getColor(R.color.az3)));
        obtainStyledAttributes.recycle();
    }

    public NoticeButtonView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "mContext");
        super(context, attributeSet, i);
        this.f96044d = context;
        this.f96045e = attributeSet;
        this.f96046f = i;
        this.f96043c = -1;
        m118103a(this.f96044d, this.f96045e);
    }
}
