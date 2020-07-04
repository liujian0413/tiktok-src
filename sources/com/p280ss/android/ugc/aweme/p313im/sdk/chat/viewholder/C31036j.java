package com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p022v4.app.FragmentActivity;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.C30732b;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.C30916k;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.C30916k.C30917a;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.C31052w;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.ReadStateViewModel.C30723a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.j */
public final class C31036j implements OnAttachStateChangeListener, C30916k {

    /* renamed from: b */
    public static final C31038a f81466b = new C31038a(null);

    /* renamed from: a */
    public C31052w f81467a;

    /* renamed from: c */
    private Message f81468c;

    /* renamed from: d */
    private final DmtTextView f81469d;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.j$a */
    public static final class C31038a {
        private C31038a() {
        }

        public /* synthetic */ C31038a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.j$b */
    static final class C31039b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DmtTextView f81471a;

        C31039b(DmtTextView dmtTextView) {
            this.f81471a = dmtTextView;
        }

        public final void run() {
            this.f81471a.setVisibility(0);
        }
    }

    /* renamed from: a */
    private final FragmentActivity m101286a() {
        Activity e = C23487o.m77158e(this.f81469d);
        if (!(e instanceof FragmentActivity)) {
            e = null;
        }
        return (FragmentActivity) e;
    }

    /* renamed from: b */
    private final void m101288b() {
        int i;
        C31052w wVar = this.f81467a;
        if (wVar == null || this.f81468c == null || (!C7573i.m23585a((Object) this.f81468c, (Object) wVar.f81503d))) {
            m101287a(false);
            return;
        }
        switch (wVar.f81502c) {
            case 0:
            case 3:
                DmtTextView dmtTextView = this.f81469d;
                if (dmtTextView != null) {
                    dmtTextView.setText(dmtTextView.getContext().getString(R.string.bob));
                    m101287a(true);
                    dmtTextView.setEnabled(false);
                    break;
                } else {
                    return;
                }
            case 1:
                if (wVar.mo81524a().size() <= 2) {
                    m101289d(wVar);
                } else if (wVar.f81501b) {
                    mo81505b(wVar);
                } else {
                    mo81506c(wVar);
                }
                m101287a(true);
                return;
            case 2:
                DmtTextView dmtTextView2 = this.f81469d;
                if (dmtTextView2 != null) {
                    Context context = dmtTextView2.getContext();
                    if (wVar.f81504e.isGroupChat()) {
                        i = R.string.bo9;
                    } else {
                        i = R.string.boa;
                    }
                    dmtTextView2.setText(context.getString(i));
                    m101287a(true);
                    dmtTextView2.setEnabled(false);
                    break;
                } else {
                    return;
                }
            default:
                m101287a(false);
                break;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void onChanged(C31052w wVar) {
        C30917a.m100654a(this, wVar);
    }

    public C31036j(DmtTextView dmtTextView) {
        this.f81469d = dmtTextView;
        DmtTextView dmtTextView2 = this.f81469d;
        if (dmtTextView2 != null) {
            dmtTextView2.addOnAttachStateChangeListener(this);
        }
        DmtTextView dmtTextView3 = this.f81469d;
        if (dmtTextView3 != null) {
            dmtTextView3.setOnClickListener(new OnClickListener(this) {

                /* renamed from: a */
                final /* synthetic */ C31036j f81470a;

                {
                    this.f81470a = r1;
                }

                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    C31052w wVar = this.f81470a.f81467a;
                    if (wVar != null) {
                        wVar.f81501b = !wVar.f81501b;
                        if (wVar.f81501b) {
                            this.f81470a.mo81505b(wVar);
                        } else {
                            this.f81470a.mo81506c(wVar);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private final void m101287a(boolean z) {
        DmtTextView dmtTextView = this.f81469d;
        if (dmtTextView != null) {
            if (!z) {
                dmtTextView.setVisibility(8);
            } else {
                dmtTextView.postDelayed(new C31039b(dmtTextView), 50);
            }
        }
    }

    public final void onViewAttachedToWindow(View view) {
        FragmentActivity a = m101286a();
        if (a != null) {
            C30723a.m100092a(a).mo80472a(a, this, true);
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        FragmentActivity a = m101286a();
        if (a != null) {
            C30723a.m100092a(a).mo80474a((C30916k) this);
        }
    }

    /* renamed from: a */
    public final void mo81504a(Message message) {
        C7573i.m23587b(message, "message");
        if (this.f81469d != null && message.isSelf() && !C7573i.m23585a((Object) message, (Object) this.f81468c)) {
            this.f81468c = message;
            m101287a(false);
            FragmentActivity a = m101286a();
            if (a != null) {
                this.f81467a = C30723a.m100092a(a).mo80476b();
                m101288b();
            }
        }
    }

    /* renamed from: d */
    private final void m101289d(C31052w wVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i = 0;
        for (Object next : wVar.mo81524a()) {
            int i2 = i + 1;
            if (i < 0) {
                C7525m.m23465b();
            }
            spannableStringBuilder.append((String) next);
            if (i < wVar.mo81524a().size() - 1) {
                spannableStringBuilder.append("、");
            }
            i = i2;
        }
        DmtTextView dmtTextView = this.f81469d;
        if (dmtTextView == null) {
            C7573i.m23580a();
        }
        Context context = dmtTextView.getContext();
        C7573i.m23582a((Object) context, "context");
        spannableStringBuilder.append(context.getResources().getString(R.string.boa));
        dmtTextView.setText(spannableStringBuilder);
        dmtTextView.setEnabled(false);
    }

    /* renamed from: a */
    public final void mo80844a(C31052w wVar) {
        Long l;
        StringBuilder sb = new StringBuilder("onSpotReadStateChanged: ");
        Message message = this.f81468c;
        if (message != null) {
            l = Long.valueOf(message.getMsgId());
        } else {
            l = null;
        }
        sb.append(l);
        sb.append(", ");
        sb.append(wVar);
        this.f81467a = wVar;
        m101288b();
    }

    /* renamed from: b */
    public final void mo81505b(C31052w wVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (String append : wVar.mo81524a()) {
            spannableStringBuilder.append(append).append("、");
        }
        DmtTextView dmtTextView = this.f81469d;
        if (dmtTextView == null) {
            C7573i.m23580a();
        }
        Context context = dmtTextView.getContext();
        C7573i.m23582a((Object) context, "context");
        Drawable drawable = context.getResources().getDrawable(R.drawable.b31);
        drawable.setBounds(0, 0, (int) C9738o.m28708b(dmtTextView.getContext(), 12.0f), (int) C9738o.m28708b(dmtTextView.getContext(), 12.0f));
        C7573i.m23582a((Object) drawable, "drawable");
        spannableStringBuilder.setSpan(new C30732b(drawable), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 17);
        dmtTextView.setText(spannableStringBuilder);
        dmtTextView.setEnabled(true);
    }

    /* renamed from: c */
    public final void mo81506c(C31052w wVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        DmtTextView dmtTextView = this.f81469d;
        if (dmtTextView == null) {
            C7573i.m23580a();
        }
        Context context = dmtTextView.getContext();
        C7573i.m23582a((Object) context, "context");
        spannableStringBuilder.append(context.getResources().getString(R.string.bo_, new Object[]{wVar.mo81524a().get(0), wVar.mo81524a().get(1), Integer.valueOf(wVar.mo81524a().size())}));
        spannableStringBuilder.append(" ");
        Context context2 = dmtTextView.getContext();
        C7573i.m23582a((Object) context2, "context");
        Drawable drawable = context2.getResources().getDrawable(R.drawable.b30);
        drawable.setBounds(0, 0, (int) C9738o.m28708b(dmtTextView.getContext(), 12.0f), (int) C9738o.m28708b(dmtTextView.getContext(), 12.0f));
        C7573i.m23582a((Object) drawable, "drawable");
        spannableStringBuilder.setSpan(new C30732b(drawable), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 17);
        dmtTextView.setText(spannableStringBuilder);
        dmtTextView.setEnabled(true);
    }
}
