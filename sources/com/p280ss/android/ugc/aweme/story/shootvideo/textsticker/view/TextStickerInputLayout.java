package com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.aweme.notification.util.C34626j;
import com.p280ss.android.ugc.aweme.shortvideo.C38501ax;
import com.p280ss.android.ugc.aweme.story.shootvideo.C42007a;
import com.p280ss.android.ugc.aweme.story.shootvideo.p1655a.C42010a;
import com.p280ss.android.ugc.aweme.story.shootvideo.p1658c.C42016b;
import com.p280ss.android.ugc.aweme.story.shootvideo.textfont.C42038c;
import com.p280ss.android.ugc.aweme.story.shootvideo.textfont.C42039d;
import com.p280ss.android.ugc.aweme.story.shootvideo.textfont.TextSelectFontStyleLayout;
import com.p280ss.android.ugc.aweme.story.shootvideo.textrecord.C42056a;
import com.p280ss.android.ugc.aweme.story.shootvideo.textrecord.C42058c;
import com.p280ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerData;
import com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.view.p1663b.C42077a;
import com.p280ss.android.ugc.aweme.tools.R$styleable;
import com.p280ss.android.ugc.aweme.utils.C42939as;
import com.p280ss.android.ugc.aweme.utils.C42962b;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout */
public class TextStickerInputLayout extends FrameLayout {

    /* renamed from: A */
    private View f109321A;

    /* renamed from: B */
    private C42077a f109322B;

    /* renamed from: C */
    private C42068a f109323C;

    /* renamed from: a */
    protected TextStickerEditText f109324a;

    /* renamed from: b */
    protected ColorSelectLayout f109325b;

    /* renamed from: c */
    protected int f109326c;

    /* renamed from: d */
    protected int f109327d;

    /* renamed from: e */
    protected int f109328e;

    /* renamed from: f */
    protected int f109329f;

    /* renamed from: g */
    protected TextSelectFontStyleLayout f109330g;

    /* renamed from: h */
    public String f109331h;

    /* renamed from: i */
    public String f109332i;

    /* renamed from: j */
    public boolean f109333j;

    /* renamed from: k */
    public boolean f109334k;

    /* renamed from: l */
    public boolean f109335l;

    /* renamed from: m */
    protected int f109336m;

    /* renamed from: n */
    private Context f109337n;

    /* renamed from: o */
    private View f109338o;

    /* renamed from: p */
    private ImageView f109339p;

    /* renamed from: q */
    private ImageView f109340q;

    /* renamed from: r */
    private boolean f109341r;

    /* renamed from: s */
    private InputMethodManager f109342s;

    /* renamed from: t */
    private C42016b f109343t;

    /* renamed from: u */
    private C42056a f109344u;

    /* renamed from: v */
    private View f109345v;

    /* renamed from: w */
    private View f109346w;

    /* renamed from: x */
    private View f109347x;

    /* renamed from: y */
    private View f109348y;

    /* renamed from: z */
    private View f109349z;

    /* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout$a */
    public interface C42068a {
        /* renamed from: a */
        void mo103283a(boolean z);
    }

    public int getAlignTxt() {
        return this.f109328e;
    }

    public int getCurColor() {
        return this.f109329f;
    }

    public int getCurTxtMode() {
        return this.f109326c;
    }

    public EditText getEditText() {
        return this.f109324a;
    }

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.ac6;
    }

    /* access modifiers changed from: protected */
    public int getScene() {
        return 0;
    }

    /* renamed from: a */
    public final void mo103336a(String str, String str2, boolean z, boolean z2) {
        this.f109331h = str;
        this.f109332i = str2;
        this.f109333j = z;
        this.f109334k = z2;
    }

    /* renamed from: g */
    public final boolean mo103349g() {
        if (!this.f109341r) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public int getTopMargin() {
        return C23482j.m77101d();
    }

    /* renamed from: m */
    private void m133814m() {
        if (this.f109324a != null && this.f109342s != null) {
            this.f109342s.toggleSoftInput(0, 2);
        }
    }

    /* renamed from: f */
    public final void mo103348f() {
        C42007a.m133552a(this);
        if (this.f109343t != null) {
            this.f109343t.mo103187a();
        }
    }

    /* renamed from: n */
    private void m133815n() {
        int i = 0;
        if (this.f109326c != 1) {
            if (this.f109326c == 2) {
                i = 1;
            } else if (this.f109326c == 3) {
                i = 2;
            }
        }
        if (this.f109322B != null) {
            this.f109322B.mo101460b(i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C42077a mo101450a() {
        return new C42077a() {
            /* renamed from: a */
            public final void mo101456a() {
                C42962b.f111525a.mo104671a("text_complete", C42010a.m133556a(TextStickerInputLayout.this.f109331h, TextStickerInputLayout.this.f109332i, TextStickerInputLayout.this.f109333j, TextStickerInputLayout.this.f109334k, TextStickerInputLayout.this.f109335l).f60753a);
            }

            /* renamed from: b */
            public final void mo101460b(int i) {
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                C42962b.f111525a.mo104671a("select_text_style", C42010a.m133556a(TextStickerInputLayout.this.f109331h, TextStickerInputLayout.this.f109332i, TextStickerInputLayout.this.f109333j, TextStickerInputLayout.this.f109334k, TextStickerInputLayout.this.f109335l).mo59973a("text_style", sb.toString()).mo59970a("is_subtitle", 0).f60753a);
            }

            /* renamed from: a */
            public final void mo101457a(int i) {
                StringBuilder sb = new StringBuilder();
                sb.append(Integer.toHexString(i));
                C42962b.f111525a.mo104671a("select_text_color", C42010a.m133556a(TextStickerInputLayout.this.f109331h, TextStickerInputLayout.this.f109332i, TextStickerInputLayout.this.f109333j, TextStickerInputLayout.this.f109334k, TextStickerInputLayout.this.f109335l).mo59973a("color", sb.toString()).mo59970a("is_subtitle", 0).f60753a);
            }

            /* renamed from: a */
            public final void mo101458a(C42038c cVar) {
                C42962b.f111525a.mo104671a("select_text_font", C42010a.m133556a(TextStickerInputLayout.this.f109331h, TextStickerInputLayout.this.f109332i, TextStickerInputLayout.this.f109333j, TextStickerInputLayout.this.f109334k, TextStickerInputLayout.this.f109335l).mo59973a(" font", cVar.f109186d).mo59970a("is_subtitle", 0).f60753a);
            }

            /* renamed from: a */
            public final void mo101459a(String str) {
                C42962b.f111525a.mo104671a("select_text_paragraph", C42010a.m133556a(TextStickerInputLayout.this.f109331h, TextStickerInputLayout.this.f109332i, TextStickerInputLayout.this.f109333j, TextStickerInputLayout.this.f109334k, TextStickerInputLayout.this.f109335l).mo59973a("paragraph_style", str).f60753a);
            }
        };
    }

    public Point getEditInputCenterPoint() {
        return new Point(C9738o.m28691a(this.f109337n) / 2, ((int) C9738o.m28708b(this.f109337n, 52.0f)) + (this.f109347x.getHeight() / 2));
    }

    /* renamed from: h */
    public final void mo103356h() {
        if (this.f109324a != null && this.f109342s != null) {
            this.f109342s.hideSoftInputFromWindow(this.f109324a.getWindowToken(), 0);
        }
    }

    /* renamed from: i */
    public final void mo103357i() {
        if (this.f109330g != null) {
            this.f109330g.mo103206a(C42039d.m133620a().mo103228b());
        }
    }

    /* renamed from: l */
    private void m133813l() {
        if (this.f109328e == 2) {
            this.f109328e = 1;
        } else if (this.f109328e == 1) {
            this.f109328e = 3;
        } else if (this.f109328e == 3) {
            this.f109328e = 2;
        }
        mo103337b();
        this.f109324a.setAligin(this.f109328e);
        m133816o();
    }

    /* renamed from: o */
    private void m133816o() {
        String str = "center";
        if (this.f109328e == 2) {
            str = "center";
        } else if (this.f109328e == 1) {
            str = "left";
        } else if (this.f109328e == 3) {
            str = "right";
        }
        if (this.f109322B != null) {
            this.f109322B.mo101459a(str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo103337b() {
        if (this.f109328e == 2) {
            this.f109340q.setImageResource(R.drawable.ak6);
        } else if (this.f109328e == 1) {
            this.f109340q.setImageResource(R.drawable.ak9);
        } else {
            if (this.f109328e == 3) {
                this.f109340q.setImageResource(R.drawable.akd);
            }
        }
    }

    /* renamed from: c */
    public final void mo103341c() {
        if (this.f109326c == 1) {
            this.f109326c = 2;
        } else if (this.f109326c == 2) {
            this.f109326c = 3;
        } else if (this.f109326c == 3) {
            this.f109326c = 1;
        }
        mo103344d();
        this.f109324a.mo101544a(this.f109326c, this.f109329f);
        this.f109327d = this.f109326c;
        m133815n();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo103344d() {
        if (this.f109326c == 1) {
            this.f109339p.setImageResource(R.drawable.ak8);
        } else if (this.f109326c == 2) {
            this.f109339p.setImageResource(R.drawable.ak5);
        } else {
            if (this.f109326c == 3) {
                this.f109339p.setImageResource(R.drawable.ake);
            }
        }
    }

    /* renamed from: e */
    public final void mo103347e() {
        this.f109330g.mo103203a();
        this.f109326c = 1;
        this.f109327d = -1;
        this.f109329f = C42058c.m133726a().mo103295c().f109255b;
        this.f109328e = 2;
        this.f109324a.mo101544a(this.f109326c, this.f109329f);
        this.f109324a.setText("");
    }

    public String[] getTextAry() {
        Layout layout = this.f109324a.getLayout();
        String obj = this.f109324a.getText().toString();
        String[] strArr = new String[this.f109324a.getLineCount()];
        int i = 0;
        int i2 = 0;
        while (i < this.f109324a.getLineCount()) {
            int lineEnd = layout.getLineEnd(i);
            strArr[i] = obj.substring(i2, lineEnd);
            layout.getLineBounds(i, new Rect());
            i++;
            i2 = lineEnd;
        }
        return strArr;
    }

    /* renamed from: k */
    private void m133812k() {
        this.f109349z = this.f109338o.findViewById(R.id.ll);
        this.f109348y = this.f109338o.findViewById(R.id.lk);
        this.f109321A = this.f109338o.findViewById(R.id.d2f);
        this.f109321A.setVisibility(8);
        this.f109349z.setBackground(C38501ax.m123066a(-1, 16777215, (int) C9738o.m28708b(getContext(), 2.0f), (int) C9738o.m28708b(getContext(), 4.0f)));
        this.f109348y.setBackground(C38501ax.m123069a(C42058c.m133726a().mo103295c().f109254a));
        this.f109321A.setOnClickListener(new C42087j(this));
        C34626j.m111880c(this.f109321A);
    }

    /* renamed from: j */
    private void m133811j() {
        this.f109338o = LayoutInflater.from(this.f109337n).inflate(getLayoutRes(), null);
        this.f109346w = this.f109338o.findViewById(R.id.a1x);
        this.f109347x = this.f109338o.findViewById(R.id.b1z);
        this.f109324a = (TextStickerEditText) this.f109338o.findViewById(R.id.ag6);
        this.f109339p = (ImageView) this.f109338o.findViewById(R.id.d49);
        LinearLayout linearLayout = (LinearLayout) this.f109338o.findViewById(R.id.aod);
        this.f109330g = TextSelectFontStyleLayout.m133600a(this.f109337n, getScene());
        this.f109330g.mo103206a(C42039d.m133620a().mo103228b());
        linearLayout.addView(this.f109330g);
        this.f109340q = (ImageView) this.f109338o.findViewById(R.id.fe);
        this.f109340q.setOnClickListener(new C42081d(this));
        this.f109325b = (ColorSelectLayout) this.f109338o.findViewById(R.id.y9);
        this.f109325b.setColorChangeListener(new C42082e(this));
        this.f109330g.setClickFontStyleListener(new C42083f(this));
        this.f109339p.setOnClickListener(new C42939as() {
            /* renamed from: a */
            public final void mo70606a(View view) {
                TextStickerInputLayout.this.mo103341c();
            }
        });
        View findViewById = this.f109338o.findViewById(R.id.ddl);
        View findViewById2 = this.f109338o.findViewById(R.id.e2y);
        if (this.f109336m == 0) {
            this.f109345v = findViewById;
            findViewById2.setVisibility(8);
        } else {
            this.f109345v = findViewById2;
            findViewById.setVisibility(8);
        }
        this.f109345v.setOnClickListener(new C42084g(this));
        this.f109338o.setOnClickListener(new C42085h(this));
        this.f109339p.setImageResource(R.drawable.ak5);
        addView(this.f109338o);
        LayoutParams layoutParams = (LayoutParams) this.f109338o.getLayoutParams();
        layoutParams.topMargin = getTopMargin();
        this.f109338o.setLayoutParams(layoutParams);
        findViewById(R.id.c8f).setOnClickListener(C42086i.f109442a);
        m133812k();
        C34626j.m111881d(this.f109339p);
        C34626j.m111879b(this.f109345v);
        C34626j.m111880c(this.f109340q);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo103345d(View view) {
        m133813l();
    }

    public void setBgColorChangeListener(C42056a aVar) {
        this.f109344u = aVar;
    }

    public void setStoryEditViewShowListener(C42016b bVar) {
        this.f109343t = bVar;
    }

    public void setTextStickerUpdateListener(C42068a aVar) {
        this.f109323C = aVar;
    }

    public TextStickerInputLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m133810a(boolean z) {
        if (this.f109341r || z) {
            this.f109341r = false;
            m133814m();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo103339b(View view) {
        if (this.f109323C != null) {
            this.f109323C.mo103283a(false);
        }
    }

    /* renamed from: b */
    public final void mo103338b(int i) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f109346w.getLayoutParams();
        layoutParams.bottomMargin += i;
        this.f109346w.setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo103342c(int i) {
        this.f109324a.mo101544a(this.f109326c, i);
        this.f109329f = i;
        if (this.f109322B != null) {
            this.f109322B.mo101457a(i);
        }
    }

    public void dismiss(boolean z) {
        if (!this.f109341r) {
            C42007a.m133554b(this);
            this.f109341r = true;
            if (this.f109343t != null) {
                this.f109343t.dismiss();
            }
        }
    }

    public void setData(TextStickerData textStickerData) {
        m133809a(textStickerData.mBgMode, textStickerData.mColor, textStickerData.mAlign);
        if (TextUtils.isEmpty(textStickerData.mFontType)) {
            C42039d.m133620a().mo103223a(textStickerData.mFontType, getScene());
        }
    }

    public void setTextStickerInputMobListener(C42077a aVar) {
        if (!C6399b.m19928c() || aVar != null) {
            this.f109322B = aVar;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public final void mo103332a(int i) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f109346w.getLayoutParams();
        layoutParams.bottomMargin = i;
        this.f109346w.setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo103340b(C42038c cVar) {
        if (cVar != null) {
            mo103334a(cVar);
            C42039d.m133620a().mo103223a(cVar.f109191i, getScene());
            this.f109324a.setFontType(C42039d.m133620a().mo103236d(getScene()));
            this.f109324a.mo101544a(this.f109326c, this.f109329f);
            if (this.f109322B != null) {
                this.f109322B.mo101458a(cVar);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo103343c(View view) {
        if (this.f109323C != null) {
            this.f109323C.mo103283a(true);
        }
        if (this.f109322B != null) {
            this.f109322B.mo101456a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo103333a(View view) {
        C42058c.m133726a().mo103294b();
        this.f109348y.setBackground(C38501ax.m123069a(C42058c.m133726a().mo103295c().f109254a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo103334a(C42038c cVar) {
        if (cVar != null) {
            if (!cVar.mo103217a()) {
                this.f109327d = this.f109326c;
                this.f109326c = 1;
                this.f109339p.setAlpha(0.34f);
                this.f109339p.setClickable(false);
                this.f109339p.setTag(Boolean.valueOf(false));
                return;
            }
            if (this.f109327d != -1) {
                this.f109326c = this.f109327d;
            }
            this.f109339p.setAlpha(1.0f);
            this.f109339p.setClickable(true);
            this.f109339p.setTag(Boolean.valueOf(true));
        }
    }

    public TextStickerInputLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f109326c = 1;
        this.f109327d = -1;
        this.f109328e = 2;
        this.f109329f = -1;
        this.f109341r = true;
        this.f109335l = true;
        this.f109322B = mo101450a();
        this.f109337n = context;
        this.f109342s = (InputMethodManager) this.f109337n.getSystemService("input_method");
        mo101451a(context, attributeSet);
        m133811j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo101451a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TextStickerInputLayout);
            this.f109336m = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    private void m133809a(int i, int i2, int i3) {
        this.f109326c = i;
        this.f109329f = i2;
        this.f109328e = i3;
    }

    /* renamed from: a */
    public void mo101452a(String str, int i, int i2, int i3, String str2, boolean z) {
        mo103335a(str, i, i2, i3, str2, z, 28);
    }

    /* renamed from: a */
    public final void mo103335a(String str, int i, int i2, int i3, String str2, boolean z, int i4) {
        this.f109327d = -1;
        m133810a(z);
        mo103357i();
        this.f109324a.requestFocus();
        this.f109324a.setCursorVisible(true);
        this.f109324a.setTextSize((float) i4);
        this.f109325b.mo103313a(z, i2);
        if (z) {
            C42039d.m133620a().mo103229b(getScene());
            mo103347e();
        } else {
            if (!TextUtils.isEmpty(str)) {
                this.f109324a.setText(str);
                this.f109324a.setSelection(str.length());
            }
            this.f109325b.setSelectColorView(i2);
            this.f109326c = i;
            this.f109328e = i3;
            this.f109329f = i2;
            C42039d.m133620a().mo103223a(str2, getScene());
        }
        mo103344d();
        this.f109324a.setFontType(C42039d.m133620a().mo103236d(getScene()));
        this.f109324a.mo101544a(i, i2);
        this.f109324a.setAligin(this.f109328e);
        this.f109330g.mo103203a();
        mo103337b();
        mo103334a(C42039d.m133620a().mo103239f(getScene()));
        if (!this.f109335l) {
            this.f109348y.setBackground(C38501ax.m123069a(C42058c.m133726a().mo103295c().f109254a));
        }
    }
}
