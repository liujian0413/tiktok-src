package com.p280ss.android.ugc.aweme.p313im.sdk.chat.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View.OnKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.bytedance.ies.dmt.p262ui.common.C10773a;
import com.bytedance.ies.dmt.p262ui.widget.DmtEditText;
import com.p280ss.android.ugc.aweme.emoji.smallemoji.p1208a.C27606a;
import com.p280ss.android.ugc.aweme.emoji.smallemoji.p1208a.C27606a.C27607a;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.Range;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C7519g;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.view.MentionEditText */
public class MentionEditText extends DmtEditText {

    /* renamed from: b */
    public static final C31003a f81166b = new C31003a(null);

    /* renamed from: a */
    public OnKeyListener f81167a;

    /* renamed from: c */
    private C31007e f81168c;

    /* renamed from: d */
    private final C27606a f81169d;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.view.MentionEditText$a */
    public static final class C31003a {
        private C31003a() {
        }

        public /* synthetic */ C31003a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.view.MentionEditText$b */
    final class C31004b extends InputConnectionWrapper {

        /* renamed from: a */
        public final MentionEditText f81170a;

        /* renamed from: b */
        final /* synthetic */ MentionEditText f81171b;

        public final boolean sendKeyEvent(KeyEvent keyEvent) {
            boolean z;
            C7573i.m23587b(keyEvent, "event");
            if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 67) {
                z = this.f81170a.mo81400a();
                if (z) {
                    OnKeyListener onKeyListener = this.f81171b.f81167a;
                    if (onKeyListener != null) {
                        onKeyListener.onKey(this.f81170a, keyEvent.getKeyCode(), keyEvent);
                    }
                }
            } else {
                z = false;
            }
            if (z || super.sendKeyEvent(keyEvent)) {
                return true;
            }
            return false;
        }

        public final boolean deleteSurroundingText(int i, int i2) {
            boolean z;
            if (i == 1 && i2 == 0) {
                z = this.f81170a.mo81400a();
            } else {
                z = false;
            }
            if (z || super.deleteSurroundingText(i, i2)) {
                return true;
            }
            return false;
        }

        public C31004b(MentionEditText mentionEditText, InputConnection inputConnection, boolean z, MentionEditText mentionEditText2) {
            C7573i.m23587b(inputConnection, "target");
            C7573i.m23587b(mentionEditText2, "editText");
            this.f81171b = mentionEditText;
            super(inputConnection, true);
            this.f81170a = mentionEditText2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.view.MentionEditText$c */
    public final class C31005c {

        /* renamed from: a */
        public int f81172a;

        /* renamed from: b */
        public String f81173b;

        /* renamed from: c */
        public String f81174c;

        /* renamed from: d */
        public Range f81175d;

        public final int hashCode() {
            int i;
            int i2;
            String str = this.f81173b;
            int i3 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i4 = i * 31;
            String str2 = this.f81174c;
            if (str2 != null) {
                i2 = str2.hashCode();
            } else {
                i2 = 0;
            }
            int i5 = (((i4 + i2) * 31) + this.f81172a) * 31;
            Range range = this.f81175d;
            if (range != null) {
                i3 = range.hashCode();
            }
            return i5 + i3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C31005c)) {
                return false;
            }
            C31005c cVar = (C31005c) obj;
            if (this.f81172a != cVar.f81172a || !C7573i.m23585a((Object) this.f81174c, (Object) cVar.f81174c) || !C7573i.m23585a((Object) this.f81173b, (Object) cVar.f81173b) || !C7573i.m23585a((Object) this.f81175d, (Object) cVar.f81175d)) {
                return false;
            }
            return true;
        }

        public C31005c(String str, String str2, int i) {
            this.f81173b = str2;
            this.f81174c = str;
            this.f81172a = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.view.MentionEditText$d */
    final class C31006d implements TextWatcher {
        public final void afterTextChanged(Editable editable) {
            C7573i.m23587b(editable, "editable");
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C7573i.m23587b(charSequence, "charSequence");
        }

        public C31006d() {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C7573i.m23587b(charSequence, "charSequence");
            if (i3 == 1 && !TextUtils.isEmpty(charSequence) && '@' == charSequence.toString().charAt(i)) {
                C31007e mOnMentionInputListener = MentionEditText.this.getMOnMentionInputListener();
                if (mOnMentionInputListener != null) {
                    mOnMentionInputListener.mo80401a();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.view.MentionEditText$e */
    public interface C31007e {
        /* renamed from: a */
        void mo80401a();
    }

    public MentionEditText(Context context) {
        this(context, null, 0, 6, null);
    }

    public MentionEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final C31007e getMOnMentionInputListener() {
        return this.f81168c;
    }

    private final List<C31005c> getMentionSpans() {
        Editable text = getText();
        List<C31005c> list = null;
        if (text != null) {
            C31005c[] cVarArr = (C31005c[]) text.getSpans(0, text.length(), C31005c.class);
            if (cVarArr != null) {
                list = C7519g.m23447d((T[]) cVarArr);
            }
            if (list != null) {
                for (C31005c cVar : list) {
                    cVar.f81175d = new Range(text.getSpanStart(cVar), text.getSpanEnd(cVar));
                }
            }
        }
        return list;
    }

    public final List<String> getMentionIds() {
        List mentionSpans = getMentionSpans();
        if (mentionSpans == null) {
            return null;
        }
        Iterable<C31005c> iterable = mentionSpans;
        Collection arrayList = new ArrayList();
        for (C31005c cVar : iterable) {
            String str = cVar.f81173b;
            if (str != null) {
                arrayList.add(str);
            }
        }
        return (List) arrayList;
    }

    /* renamed from: b */
    private void m100870b() {
        if (m100868a(getContext())) {
            if (VERSION.SDK_INT >= 17) {
                setTextAlignment(5);
            }
            setGravity(getGravity() | 8388611);
        }
        addTextChangedListener(new C31006d());
    }

    /* renamed from: a */
    public final boolean mo81400a() {
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        if (selectionEnd != selectionStart) {
            return false;
        }
        C31005c a = m100866a(selectionStart, selectionEnd);
        if (a == null) {
            return false;
        }
        Range range = a.f81175d;
        if (range != null) {
            Editable text = getText();
            if (text != null) {
                text.delete(range.getFrom(), range.getTo());
            }
        }
        return true;
    }

    public final void setMOnMentionInputListener(C31007e eVar) {
        this.f81168c = eVar;
    }

    public void setOnKeyListener(OnKeyListener onKeyListener) {
        this.f81167a = onKeyListener;
        super.setOnKeyListener(onKeyListener);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C7573i.m23582a((Object) onCreateInputConnection, "super.onCreateInputConnection(outAttrs)");
        return new C31004b(this, onCreateInputConnection, true, this);
    }

    /* renamed from: a */
    private static boolean m100868a(Context context) {
        if (context == null || VERSION.SDK_INT < 17) {
            return false;
        }
        Resources resources = context.getResources();
        C7573i.m23582a((Object) resources, "resources");
        Configuration configuration = resources.getConfiguration();
        C7573i.m23582a((Object) configuration, "configuration");
        if (configuration.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo81401a(String str) {
        C7573i.m23587b(str, "emojiText");
        if (getEditableText() == null) {
            return false;
        }
        int selectionStart = getSelectionStart();
        SpannableString spannableString = new SpannableString(str);
        Drawable a = this.f81169d.mo70930a(getContext(), str);
        if (a != null) {
            int lineHeight = getLineHeight();
            a.setBounds(0, 0, (int) ((((float) lineHeight) * ((((float) a.getIntrinsicWidth()) + 0.0f) / ((float) a.getIntrinsicHeight()))) + 0.5f), lineHeight);
            spannableString.setSpan(new C10773a(a), 0, spannableString.length(), 33);
        }
        Editable text = getText();
        if (text != null) {
            text.insert(selectionStart, spannableString);
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo81402a(String str, String str2) {
        C7573i.m23587b(str, "nickname");
        C7573i.m23587b(str2, "uid");
        return m100867a(0, str, str2);
    }

    /* renamed from: a */
    private final C31005c m100866a(int i, int i2) {
        List<C31005c> mentionSpans = getMentionSpans();
        if (mentionSpans != null) {
            for (C31005c cVar : mentionSpans) {
                Range range = cVar.f81175d;
                if (range != null && range.contains(i, i2)) {
                    return cVar;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    private final C31005c m100869b(int i, int i2) {
        List<C31005c> mentionSpans = getMentionSpans();
        if (mentionSpans != null) {
            for (C31005c cVar : mentionSpans) {
                Range range = cVar.f81175d;
                if (range != null && range.isWrappedBy(i, i2)) {
                    return cVar;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        C31005c b = m100869b(i, i2);
        if (b != null) {
            Range range = b.f81175d;
            if (range != null) {
                if (i == i2) {
                    try {
                        setSelection(range.getAnchorPosition(i));
                    } catch (Exception unused) {
                        return;
                    }
                } else {
                    if (i2 < range.getTo()) {
                        setSelection(i, range.getTo());
                    }
                    if (i > range.getFrom()) {
                        setSelection(range.getFrom(), i2);
                    }
                }
            }
        }
        if (i == i2) {
            setSelection(i);
        }
    }

    public MentionEditText(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f81169d = C27607a.m90499a(context);
        m100870b();
    }

    /* renamed from: a */
    private final boolean m100867a(int i, String str, String str2) {
        boolean z = false;
        if (getEditableText() == null) {
            return false;
        }
        int selectionStart = getSelectionStart();
        String str3 = "@";
        StringBuilder sb = new StringBuilder();
        sb.append(str3);
        sb.append(str);
        sb.append(' ');
        SpannableString spannableString = new SpannableString(sb.toString());
        spannableString.setSpan(new C31005c(spannableString.toString(), str2, 0), 0, spannableString.length(), 33);
        Editable editableText = getEditableText();
        C7573i.m23582a((Object) editableText, "editableText");
        if (editableText.length() > 0) {
            z = true;
        }
        if (z) {
            int length = getEditableText().length();
            if (selectionStart > 0 && length >= selectionStart) {
                int i2 = selectionStart - 1;
                if (TextUtils.equals(getEditableText().subSequence(i2, selectionStart), str3)) {
                    Editable text = getText();
                    if (text != null) {
                        text.delete(i2, selectionStart);
                    }
                    selectionStart--;
                }
            }
        }
        Editable text2 = getText();
        if (text2 != null) {
            text2.insert(selectionStart, spannableString);
        }
        return true;
    }

    public /* synthetic */ MentionEditText(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
