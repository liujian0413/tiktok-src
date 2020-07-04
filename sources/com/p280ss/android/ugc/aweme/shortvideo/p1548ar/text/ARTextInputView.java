package com.p280ss.android.ugc.aweme.shortvideo.p1548ar.text;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.shortvideo.C39804em;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ar.text.ARTextInputView */
public final class ARTextInputView extends EffectTextInputView {

    /* renamed from: j */
    private LayoutParams f100036j;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ar.text.ARTextInputView$a */
    public static final class C38471a implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ ARTextInputView f100037a;

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C7573i.m23587b(charSequence, "s");
        }

        C38471a(ARTextInputView aRTextInputView) {
            this.f100037a = aRTextInputView;
        }

        public final void afterTextChanged(Editable editable) {
            if (editable != null) {
                EditText editText = this.f100037a.f100044a;
                C7573i.m23582a((Object) editText, "editView");
                int selectionStart = editText.getSelectionStart();
                EditText editText2 = this.f100037a.f100044a;
                C7573i.m23582a((Object) editText2, "editView");
                int selectionEnd = editText2.getSelectionEnd();
                if (this.f100037a.f100052i.length() > this.f100037a.f100051h && this.f100037a.f100051h > 0) {
                    editable.delete(selectionStart - 1, selectionEnd);
                    EditText editText3 = this.f100037a.f100044a;
                    C7573i.m23582a((Object) editText3, "editView");
                    editText3.setText(editable);
                    this.f100037a.f100044a.setSelection(editable.toString().length());
                    EditText editText4 = this.f100037a.f100044a;
                    C7573i.m23582a((Object) editText4, "editView");
                    C10761a.m31410e(editText4.getContext(), this.f100037a.f100050g).mo25750a();
                } else if (this.f100037a.f100049f != null) {
                    this.f100037a.f100049f.mo96434a(editable.toString());
                }
            }
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C7573i.m23587b(charSequence, "s");
            this.f100037a.f100052i = charSequence.toString();
            if (this.f100037a.f100052i == null) {
                this.f100037a.f100052i = "";
            }
        }
    }

    public ARTextInputView(Context context) {
        this(context, null, 2, null);
    }

    /* access modifiers changed from: protected */
    public final int getLayout() {
        return R.layout.a_7;
    }

    public final LayoutParams getParams() {
        return this.f100036j;
    }

    public final TextWatcher getTextWatcher() {
        return new C38471a(this);
    }

    public final void setParams(LayoutParams layoutParams) {
        C7573i.m23587b(layoutParams, "<set-?>");
        this.f100036j = layoutParams;
    }

    public final void setHintText(String str) {
        if (this.f100044a != null) {
            CharSequence charSequence = str;
            if (!TextUtils.isEmpty(charSequence)) {
                EditText editText = this.f100044a;
                C7573i.m23582a((Object) editText, "editView");
                editText.setHint(charSequence);
            }
        }
    }

    /* renamed from: a */
    public final void mo96405a(int i) {
        if (this.f100044a != null) {
            LayoutParams layoutParams = this.f100036j;
            float f = (float) i;
            EditText editText = this.f100044a;
            C7573i.m23582a((Object) editText, "editView");
            layoutParams.bottomMargin = (int) (f + C9738o.m28708b(editText.getContext(), 16.0f));
            EditText editText2 = this.f100044a;
            C7573i.m23582a((Object) editText2, "editView");
            editText2.setLayoutParams(this.f100036j);
        }
        if (C39805en.m127445a()) {
            View view = this.f100047d;
            C7573i.m23582a((Object) view, "titleLayout");
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 != null) {
                LayoutParams layoutParams3 = (LayoutParams) layoutParams2;
                layoutParams3.topMargin = C39805en.m127450c(getContext()) - C39804em.m127438b(getContext(), C39804em.m127428a(getContext()));
                int i2 = layoutParams3.topMargin;
                C39804em.m127428a(getContext());
                View view2 = this.f100047d;
                C7573i.m23582a((Object) view2, "titleLayout");
                view2.setLayoutParams(layoutParams3);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
    }

    public ARTextInputView(Context context, AttributeSet attributeSet) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet);
        EditText editText = this.f100044a;
        C7573i.m23582a((Object) editText, "editView");
        ViewGroup.LayoutParams layoutParams = editText.getLayoutParams();
        if (layoutParams != null) {
            this.f100036j = (LayoutParams) layoutParams;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    private /* synthetic */ ARTextInputView(Context context, AttributeSet attributeSet, int i, C7571f fVar) {
        this(context, null);
    }
}
