package com.p280ss.android.ugc.aweme.setting.commentfilter.viewholder;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27009an;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.setting.commentfilter.viewholder.KeywordViewHolder */
public final class KeywordViewHolder extends C1293v {

    /* renamed from: a */
    public long f98079a;

    /* renamed from: b */
    public final ImageView f98080b;

    /* renamed from: c */
    public final EditText f98081c;

    /* renamed from: d */
    public final TextView f98082d;

    /* renamed from: e */
    public int f98083e = -1;

    /* renamed from: f */
    public final View f98084f;

    /* renamed from: g */
    public final View f98085g;

    /* renamed from: h */
    public final C37617a f98086h;

    /* renamed from: com.ss.android.ugc.aweme.setting.commentfilter.viewholder.KeywordViewHolder$a */
    static final class C37616a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ KeywordViewHolder f98091a;

        C37616a(KeywordViewHolder keywordViewHolder) {
            this.f98091a = keywordViewHolder;
        }

        public final void run() {
            this.f98091a.f98081c.requestFocus();
            this.f98091a.f98081c.setSelection(this.f98091a.f98081c.getText().length());
            Object systemService = this.f98091a.f98081c.getContext().getSystemService("input_method");
            if (systemService != null) {
                ((InputMethodManager) systemService).showSoftInput(this.f98091a.f98081c, 0);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        }
    }

    /* renamed from: a */
    public final void mo94925a() {
        if (!this.f98086h.mo94915a(this.f98083e)) {
            AnimationSet animationSet = new AnimationSet(true);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(300);
            animationSet.addAnimation(alphaAnimation);
            TranslateAnimation translateAnimation = new TranslateAnimation(-((float) C23486n.m77122a(16.0d)), 0.0f, 0.0f, 0.0f);
            translateAnimation.setDuration(300);
            animationSet.addAnimation(translateAnimation);
            this.f98081c.setText(this.f98082d.getText());
            if (C7573i.m23585a((Object) this.f98082d.getText().toString(), (Object) this.f98082d.getContext().getString(R.string.fsp))) {
                this.f98081c.setText("");
            }
            this.f98080b.setVisibility(0);
            this.f98081c.setVisibility(0);
            this.f98082d.setVisibility(8);
            EditText editText = this.f98081c;
            TranslateAnimation translateAnimation2 = new TranslateAnimation(-((float) C23486n.m77122a(24.0d)), 0.0f, 0.0f, 0.0f);
            translateAnimation2.setDuration(300);
            editText.startAnimation(translateAnimation2);
            TextView textView = this.f98082d;
            TranslateAnimation translateAnimation3 = new TranslateAnimation(0.0f, (float) C23486n.m77122a(24.0d), 0.0f, 0.0f);
            translateAnimation3.setDuration(300);
            textView.startAnimation(translateAnimation3);
            this.f98080b.startAnimation(animationSet);
            this.f98081c.postDelayed(new C37616a(this), 300);
            this.f98086h.mo94913a(this.f98083e, (View) this.f98081c);
        }
    }

    /* renamed from: a */
    public final void mo94926a(int i, String str) {
        C7573i.m23587b(str, "s");
        this.f98083e = i;
        CharSequence charSequence = str;
        this.f98082d.setText(charSequence);
        if (C7573i.m23585a((Object) C7634n.m23774c(charSequence).toString(), (Object) "")) {
            TextView textView = this.f98082d;
            Context context = this.f98082d.getContext();
            C7573i.m23582a((Object) context, "textView.context");
            textView.setTextColor(context.getResources().getColor(R.color.af));
            this.f98082d.setText(this.f98082d.getContext().getString(R.string.fsp));
        } else {
            TextView textView2 = this.f98082d;
            Context context2 = this.f98082d.getContext();
            C7573i.m23582a((Object) context2, "textView.context");
            textView2.setTextColor(context2.getResources().getColor(R.color.ab2));
        }
        this.f98081c.setText(charSequence);
    }

    public KeywordViewHolder(View view, C37617a aVar) {
        C7573i.m23587b(view, "view");
        C7573i.m23587b(aVar, "listener");
        super(view);
        this.f98085g = view;
        this.f98086h = aVar;
        View findViewById = this.f98085g.findViewById(R.id.ax9);
        C7573i.m23582a((Object) findViewById, "view.findViewById(R.id.icon)");
        this.f98080b = (ImageView) findViewById;
        View findViewById2 = this.f98085g.findViewById(R.id.text);
        C7573i.m23582a((Object) findViewById2, "view.findViewById(R.id.text)");
        this.f98081c = (EditText) findViewById2;
        View findViewById3 = this.f98085g.findViewById(R.id.die);
        C7573i.m23582a((Object) findViewById3, "view.findViewById(R.id.text_view)");
        this.f98082d = (TextView) findViewById3;
        View findViewById4 = this.f98085g.findViewById(R.id.a9n);
        C7573i.m23582a((Object) findViewById4, "view.findViewById(R.id.div)");
        this.f98084f = findViewById4;
        View view2 = this.f98084f;
        Context context = this.f98085g.getContext();
        C7573i.m23582a((Object) context, "view.context");
        view2.setBackgroundColor(context.getResources().getColor(R.color.le));
        this.f98080b.setImageResource(R.drawable.as9);
        this.f98081c.addTextChangedListener(new TextWatcher(this) {

            /* renamed from: a */
            final /* synthetic */ KeywordViewHolder f98087a;

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            {
                this.f98087a = r1;
            }

            public final void afterTextChanged(Editable editable) {
                this.f98087a.f98086h.mo94914a(this.f98087a.f98083e, String.valueOf(editable));
            }
        });
        this.f98081c.setOnFocusChangeListener(new OnFocusChangeListener(this) {

            /* renamed from: a */
            final /* synthetic */ KeywordViewHolder f98088a;

            {
                this.f98088a = r1;
            }

            public final void onFocusChange(View view, boolean z) {
                if (!z) {
                    this.f98088a.f98086h.mo94914a(this.f98088a.f98083e, this.f98088a.f98081c.getText().toString());
                    this.f98088a.f98081c.setSelection(0);
                    AnimationSet animationSet = new AnimationSet(true);
                    AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                    alphaAnimation.setDuration(300);
                    animationSet.addAnimation(alphaAnimation);
                    TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, -((float) C23486n.m77122a(16.0d)), 0.0f, 0.0f);
                    translateAnimation.setDuration(300);
                    animationSet.addAnimation(translateAnimation);
                    this.f98088a.f98082d.setText(this.f98088a.f98081c.getText());
                    String obj = this.f98088a.f98081c.getText().toString();
                    if (obj != null) {
                        if (C7573i.m23585a((Object) C7634n.m23774c(obj).toString(), (Object) "")) {
                            TextView textView = this.f98088a.f98082d;
                            Context context = this.f98088a.f98082d.getContext();
                            C7573i.m23582a((Object) context, "textView.context");
                            textView.setTextColor(context.getResources().getColor(R.color.af));
                            this.f98088a.f98082d.setText(this.f98088a.f98082d.getContext().getString(R.string.fsp));
                        } else {
                            TextView textView2 = this.f98088a.f98082d;
                            Context context2 = this.f98088a.f98082d.getContext();
                            C7573i.m23582a((Object) context2, "textView.context");
                            textView2.setTextColor(context2.getResources().getColor(R.color.ab2));
                        }
                        this.f98088a.f98080b.setVisibility(8);
                        this.f98088a.f98081c.setVisibility(8);
                        this.f98088a.f98082d.setVisibility(0);
                        EditText editText = this.f98088a.f98081c;
                        TranslateAnimation translateAnimation2 = new TranslateAnimation(0.0f, -((float) C23486n.m77122a(24.0d)), 0.0f, 0.0f);
                        translateAnimation2.setDuration(300);
                        editText.startAnimation(translateAnimation2);
                        TextView textView3 = this.f98088a.f98082d;
                        TranslateAnimation translateAnimation3 = new TranslateAnimation((float) C23486n.m77122a(24.0d), 0.0f, 0.0f, 0.0f);
                        translateAnimation3.setDuration(300);
                        textView3.startAnimation(translateAnimation3);
                        this.f98088a.f98080b.startAnimation(animationSet);
                        this.f98088a.f98086h.mo94912a();
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                }
            }
        });
        this.f98085g.setOnTouchListener(new C27009an(this) {

            /* renamed from: a */
            final /* synthetic */ KeywordViewHolder f98089a;

            {
                this.f98089a = r1;
            }

            /* renamed from: b */
            public final void mo67959b(View view, MotionEvent motionEvent) {
                C7573i.m23587b(view, "view");
                C7573i.m23587b(motionEvent, "event");
                if (System.currentTimeMillis() - this.f98089a.f98079a >= 500) {
                    this.f98089a.f98079a = System.currentTimeMillis();
                    this.f98089a.mo94925a();
                }
            }
        });
        this.f98080b.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ KeywordViewHolder f98090a;

            {
                this.f98090a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                this.f98090a.f98081c.clearFocus();
                Object systemService = this.f98090a.f98081c.getContext().getSystemService("input_method");
                if (systemService != null) {
                    ((InputMethodManager) systemService).hideSoftInputFromWindow(this.f98090a.f98085g.getWindowToken(), 0);
                    this.f98090a.f98086h.mo94916b(this.f98090a.f98083e);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            }
        });
    }
}
