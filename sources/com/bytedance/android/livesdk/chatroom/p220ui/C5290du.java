package com.bytedance.android.livesdk.chatroom.p220ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnShowListener;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.du */
public final class C5290du extends Dialog {

    /* renamed from: a */
    public C5296b f15465a;

    /* renamed from: b */
    public C5297c f15466b;

    /* renamed from: c */
    private Context f15467c;

    /* renamed from: d */
    private RelativeLayout f15468d;

    /* renamed from: e */
    private LiveRoundImageView f15469e;

    /* renamed from: f */
    private HSImageView f15470f;

    /* renamed from: g */
    private View f15471g;

    /* renamed from: h */
    private TextView f15472h;

    /* renamed from: i */
    private TextView f15473i;

    /* renamed from: j */
    private Button f15474j;

    /* renamed from: k */
    private TextView f15475k;

    /* renamed from: l */
    private LinearLayout f15476l;

    /* renamed from: m */
    private Button f15477m;

    /* renamed from: n */
    private Button f15478n;

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.du$a */
    public static class C5295a {

        /* renamed from: a */
        C5298d f15486a = new C5298d();

        /* renamed from: b */
        public final C5290du mo13577b() {
            C5290du a = mo13573a();
            a.show();
            return a;
        }

        /* renamed from: a */
        public final C5290du mo13573a() {
            return new C5290du(this.f15486a.f15487a, this.f15486a);
        }

        /* renamed from: a */
        public final C5295a mo13568a(int i) {
            this.f15486a.f15489c = R.layout.an9;
            return this;
        }

        /* renamed from: b */
        public final C5295a mo13575b(CharSequence charSequence) {
            this.f15486a.f15492f = charSequence;
            return this;
        }

        /* renamed from: a */
        public final C5295a mo13569a(OnCancelListener onCancelListener) {
            this.f15486a.f15501o = onCancelListener;
            return this;
        }

        /* renamed from: b */
        public final C5295a mo13574b(int i) {
            return mo13570a(this.f15486a.f15487a.getText(i));
        }

        /* renamed from: c */
        public final C5295a mo13578c(int i) {
            return mo13575b(this.f15486a.f15487a.getText(i));
        }

        /* renamed from: a */
        public final C5295a mo13570a(CharSequence charSequence) {
            this.f15486a.f15491e = charSequence;
            return this;
        }

        /* renamed from: a */
        public final C5295a mo13572a(boolean z) {
            this.f15486a.f15504r = z;
            return this;
        }

        public C5295a(Context context, int i) {
            this.f15486a.f15487a = context;
            this.f15486a.f15488b = 2;
        }

        /* renamed from: b */
        public final C5295a mo13576b(CharSequence charSequence, OnClickListener onClickListener) {
            this.f15486a.f15497k = charSequence;
            this.f15486a.f15498l = onClickListener;
            return this;
        }

        /* renamed from: a */
        public final C5295a mo13571a(CharSequence charSequence, OnClickListener onClickListener) {
            this.f15486a.f15495i = charSequence;
            this.f15486a.f15496j = onClickListener;
            return this;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.du$b */
    public interface C5296b {
        /* renamed from: a */
        void mo8803a();
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.du$c */
    public interface C5297c {
        /* renamed from: a */
        void mo8804a();
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.du$d */
    static class C5298d {

        /* renamed from: a */
        Context f15487a;

        /* renamed from: b */
        int f15488b;

        /* renamed from: c */
        int f15489c;

        /* renamed from: d */
        Drawable f15490d;

        /* renamed from: e */
        CharSequence f15491e;

        /* renamed from: f */
        CharSequence f15492f;

        /* renamed from: g */
        CharSequence f15493g;

        /* renamed from: h */
        OnClickListener f15494h;

        /* renamed from: i */
        CharSequence f15495i;

        /* renamed from: j */
        OnClickListener f15496j;

        /* renamed from: k */
        CharSequence f15497k;

        /* renamed from: l */
        OnClickListener f15498l;

        /* renamed from: m */
        CharSequence f15499m;

        /* renamed from: n */
        View.OnClickListener f15500n;

        /* renamed from: o */
        OnCancelListener f15501o;

        /* renamed from: p */
        OnDismissListener f15502p;

        /* renamed from: q */
        OnShowListener f15503q;

        /* renamed from: r */
        boolean f15504r;

        private C5298d() {
            this.f15504r = true;
        }
    }

    public final void dismiss() {
        C5299dv.m16968a(this);
    }

    public final void onBackPressed() {
        if (this.f15465a != null) {
            this.f15465a.mo8803a();
        }
        super.onBackPressed();
    }

    public final void show() {
        super.show();
        Window window = getWindow();
        if (window != null) {
            LayoutParams layoutParams = new LayoutParams();
            layoutParams.copyFrom(window.getAttributes());
            layoutParams.width = (int) this.f15467c.getResources().getDimension(R.dimen.sr);
            layoutParams.height = -2;
            window.setAttributes(layoutParams);
        }
    }

    /* renamed from: b */
    public final void mo13559b(CharSequence charSequence) {
        this.f15473i.setText(charSequence);
    }

    /* renamed from: a */
    public final void mo13555a(View.OnClickListener onClickListener) {
        this.f15474j.setOnClickListener(onClickListener);
    }

    /* renamed from: a */
    public final void mo13556a(CharSequence charSequence) {
        this.f15472h.setText(charSequence);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (1 == motionEvent.getAction() && m16949a(getContext(), motionEvent) && this.f15466b != null) {
            this.f15466b.mo8804a();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: a */
    private void m16946a(int i) {
        this.f15468d = (RelativeLayout) this.f15471g.findViewById(R.id.dm7);
        this.f15469e = (LiveRoundImageView) this.f15471g.findViewById(R.id.dm6);
        this.f15470f = (HSImageView) this.f15471g.findViewById(R.id.dlz);
        this.f15472h = (TextView) this.f15471g.findViewById(R.id.cw5);
        this.f15473i = (TextView) this.f15471g.findViewById(R.id.cw4);
        this.f15474j = (Button) this.f15471g.findViewById(R.id.cw0);
        this.f15475k = (TextView) this.f15471g.findViewById(R.id.cvz);
        this.f15476l = (LinearLayout) this.f15471g.findViewById(R.id.cw1);
        this.f15477m = (Button) this.f15471g.findViewById(R.id.cw2);
        this.f15478n = (Button) this.f15471g.findViewById(R.id.cw3);
        if (i == 1) {
            this.f15474j.setVisibility(0);
            this.f15476l.setVisibility(8);
            return;
        }
        if (i == 2) {
            this.f15474j.setVisibility(8);
            this.f15476l.setVisibility(0);
        }
    }

    /* renamed from: a */
    private void m16948a(final C5298d dVar) {
        this.f15472h.setText(dVar.f15491e);
        this.f15473i.setText(dVar.f15492f);
        if (TextUtils.isEmpty(dVar.f15492f)) {
            this.f15473i.setVisibility(8);
        } else {
            this.f15473i.setVisibility(0);
        }
        if (dVar.f15488b == 1) {
            this.f15474j.setVisibility(0);
            this.f15476l.setVisibility(8);
            this.f15474j.setText(dVar.f15493g);
            this.f15474j.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    dVar.f15494h.onClick(C5290du.this, 0);
                }
            });
        } else if (dVar.f15488b == 2) {
            this.f15474j.setVisibility(8);
            this.f15476l.setVisibility(0);
            this.f15477m.setText(dVar.f15495i);
            this.f15478n.setText(dVar.f15497k);
            this.f15477m.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    dVar.f15496j.onClick(C5290du.this, 1);
                }
            });
            this.f15478n.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    dVar.f15498l.onClick(C5290du.this, 2);
                }
            });
        }
        if (dVar.f15490d != null) {
            this.f15468d.setVisibility(0);
            this.f15469e.setImageDrawable(dVar.f15490d);
            this.f15469e.setOnClickListener(dVar.f15500n);
            this.f15470f.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    C5290du.this.dismiss();
                }
            });
        }
        if (!TextUtils.isEmpty(dVar.f15499m)) {
            this.f15475k.setVisibility(0);
            this.f15475k.setText(dVar.f15499m);
            this.f15475k.setOnClickListener(dVar.f15500n);
        }
        setCancelable(dVar.f15504r);
        setOnCancelListener(dVar.f15501o);
        setOnDismissListener(dVar.f15502p);
        setOnShowListener(dVar.f15503q);
    }

    /* renamed from: a */
    public static C5290du m16945a(Context context, int i) {
        return new C5290du(context, 1);
    }

    private C5290du(Context context, int i) {
        super(context, R.style.yw);
        this.f15467c = context;
        this.f15471g = LayoutInflater.from(getContext()).inflate(R.layout.aow, null);
        setContentView(this.f15471g);
        m16946a(i);
    }

    private C5290du(Context context, C5298d dVar) {
        int i;
        super(context, R.style.yw);
        this.f15467c = context;
        if (dVar.f15489c > 0) {
            i = dVar.f15489c;
        } else {
            i = R.layout.aow;
        }
        this.f15471g = LayoutInflater.from(getContext()).inflate(i, null);
        setContentView(this.f15471g);
        m16946a(dVar.f15488b);
        m16948a(dVar);
    }

    /* renamed from: a */
    private boolean m16949a(Context context, MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int scaledWindowTouchSlop = ViewConfiguration.get(context).getScaledWindowTouchSlop();
        if (getWindow() == null || getWindow().getDecorView() == null) {
            return true;
        }
        View decorView = getWindow().getDecorView();
        int i = -scaledWindowTouchSlop;
        if (x < i || y < i || x > decorView.getWidth() + scaledWindowTouchSlop || y > decorView.getHeight() + scaledWindowTouchSlop) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo13558a(boolean z, String str) {
        this.f15474j.setEnabled(z);
        this.f15474j.setText(str);
    }

    /* renamed from: a */
    public final void mo13557a(boolean z, CharSequence charSequence, View.OnClickListener onClickListener) {
        if (z) {
            this.f15475k.setVisibility(0);
            this.f15475k.setText(charSequence);
            this.f15475k.setOnClickListener(onClickListener);
            return;
        }
        this.f15475k.setVisibility(8);
    }
}
