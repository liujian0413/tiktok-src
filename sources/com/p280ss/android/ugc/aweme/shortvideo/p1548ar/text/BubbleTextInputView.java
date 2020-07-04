package com.p280ss.android.ugc.aweme.shortvideo.p1548ar.text;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout.LayoutParams;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.shortvideo.C39804em;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ar.text.BubbleTextInputView */
public final class BubbleTextInputView extends EffectTextInputView {

    /* renamed from: j */
    private LayoutParams f100040j;

    /* renamed from: k */
    private View f100041k;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ar.text.BubbleTextInputView$a */
    public static final class C38472a implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ BubbleTextInputView f100042a;

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C7573i.m23587b(charSequence, "s");
        }

        C38472a(BubbleTextInputView bubbleTextInputView) {
            this.f100042a = bubbleTextInputView;
        }

        public final void afterTextChanged(Editable editable) {
            if (editable == null) {
                return;
            }
            if ((this.f100042a.f100052i.length() <= this.f100042a.f100051h || this.f100042a.f100051h <= 0) && this.f100042a.f100049f != null) {
                this.f100042a.f100049f.mo96434a(editable.toString());
            }
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C7573i.m23587b(charSequence, "s");
            this.f100042a.f100052i = charSequence.toString();
            if (this.f100042a.f100052i == null) {
                this.f100042a.f100052i = "";
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ar.text.BubbleTextInputView$b */
    public static final class C38473b extends LengthFilter {

        /* renamed from: a */
        final /* synthetic */ BubbleTextInputView f100043a;

        C38473b(BubbleTextInputView bubbleTextInputView, int i) {
            this.f100043a = bubbleTextInputView;
            super(i);
        }

        public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            C7573i.m23587b(charSequence, "source");
            C7573i.m23587b(spanned, "dest");
            CharSequence filter = super.filter(charSequence, i, i2, spanned, i3, i4);
            if (this.f100043a.f100051h - (spanned.length() - (i4 - i3)) < i2 - i) {
                EditText editText = this.f100043a.f100044a;
                C7573i.m23582a((Object) editText, "editView");
                C10761a.m31410e(editText.getContext(), this.f100043a.f100050g).mo25750a();
            }
            return filter;
        }
    }

    public BubbleTextInputView(Context context) {
        this(context, null, 2, null);
    }

    /* access modifiers changed from: protected */
    public final int getLayout() {
        return R.layout.a8i;
    }

    public final LayoutParams getParams() {
        return this.f100040j;
    }

    public final TextWatcher getTextWatcher() {
        return new C38472a(this);
    }

    /* renamed from: a */
    public final void mo96416a() {
        super.mo96416a();
        this.f100049f.mo96435b(this.f100052i);
    }

    public final void setParams(LayoutParams layoutParams) {
        C7573i.m23587b(layoutParams, "<set-?>");
        this.f100040j = layoutParams;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo96417a(Context context) {
        super.mo96417a(context);
        this.f100041k = this.f100046c.findViewById(R.id.a1x);
    }

    public final void setMaxTextCount(int i) {
        super.setMaxTextCount(i);
        EditText editText = this.f100044a;
        C7573i.m23582a((Object) editText, "editView");
        editText.setFilters((InputFilter[]) new C38473b[]{new C38473b(this, this.f100051h)});
    }

    /* renamed from: a */
    public final void mo96405a(int i) {
        ViewGroup.LayoutParams layoutParams;
        View view = this.f100041k;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            layoutParams2.bottomMargin = i;
            View view2 = this.f100041k;
            if (view2 != null) {
                view2.setLayoutParams(layoutParams2);
            }
            if (C39805en.m127445a()) {
                View view3 = this.f100047d;
                C7573i.m23582a((Object) view3, "titleLayout");
                ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                if (layoutParams3 != null) {
                    LayoutParams layoutParams4 = (LayoutParams) layoutParams3;
                    layoutParams4.topMargin = C39805en.m127450c(getContext()) - C39804em.m127438b(getContext(), C39804em.m127428a(getContext()));
                    int i2 = layoutParams4.topMargin;
                    C39804em.m127428a(getContext());
                    View view4 = this.f100047d;
                    C7573i.m23582a((Object) view4, "titleLayout");
                    view4.setLayoutParams(layoutParams4);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
    }

    public BubbleTextInputView(Context context, AttributeSet attributeSet) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet);
        EditText editText = this.f100044a;
        C7573i.m23582a((Object) editText, "editView");
        ViewGroup.LayoutParams layoutParams = editText.getLayoutParams();
        if (layoutParams != null) {
            this.f100040j = (LayoutParams) layoutParams;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
    }

    private /* synthetic */ BubbleTextInputView(Context context, AttributeSet attributeSet, int i, C7571f fVar) {
        this(context, null);
    }
}
