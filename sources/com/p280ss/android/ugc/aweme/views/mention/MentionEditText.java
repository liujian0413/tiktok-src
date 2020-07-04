package com.p280ss.android.ugc.aweme.views.mention;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View.BaseSavedState;
import android.view.View.OnKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import android.widget.TextView.BufferType;
import com.bytedance.ies.dmt.p262ui.widget.DmtEditText;
import com.p280ss.android.ugc.aweme.model.TextExtraStruct;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.views.mention.MentionEditText */
public class MentionEditText extends DmtEditText {

    /* renamed from: a */
    private Runnable f112349a;

    /* renamed from: c */
    protected int f112350c;

    /* renamed from: d */
    protected int f112351d;

    /* renamed from: e */
    public boolean f112352e;

    /* renamed from: f */
    public C43385b f112353f;

    /* renamed from: g */
    protected List<C43385b> f112354g;

    /* renamed from: h */
    public C43382c f112355h;

    /* renamed from: i */
    protected List<TextWatcher> f112356i = new ArrayList();

    /* renamed from: j */
    public Set<String> f112357j = new HashSet();

    /* renamed from: k */
    public OnKeyListener f112358k;

    /* renamed from: com.ss.android.ugc.aweme.views.mention.MentionEditText$MentionSavedState */
    public static class MentionSavedState extends BaseSavedState {
        public static final Creator<MentionSavedState> CREATOR = new Creator<MentionSavedState>() {
            /* renamed from: a */
            private static MentionSavedState[] m137674a(int i) {
                return new MentionSavedState[i];
            }

            /* renamed from: a */
            private static MentionSavedState m137673a(Parcel parcel) {
                try {
                    return new MentionSavedState(parcel);
                } catch (Exception unused) {
                    return null;
                }
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m137673a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m137674a(i);
            }
        };

        /* renamed from: a */
        public String f112359a;

        /* renamed from: b */
        public int f112360b;

        /* renamed from: c */
        public List<TextExtraStruct> f112361c;

        public MentionSavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private MentionSavedState(Parcel parcel) {
            super(parcel);
            this.f112359a = parcel.readString();
            this.f112360b = parcel.readInt();
            Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
            if (readBundle != null) {
                this.f112361c = readBundle.getParcelableArrayList("text_extra_struct");
            }
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f112359a);
            parcel.writeInt(this.f112360b);
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("text_extra_struct", (ArrayList) this.f112361c);
            parcel.writeBundle(bundle);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.views.mention.MentionEditText$MentionSpan */
    public static class MentionSpan extends ForegroundColorSpan {
        public static final Creator<MentionSpan> CREATOR = new Creator<MentionSpan>() {
            /* renamed from: a */
            private static MentionSpan[] m137678a(int i) {
                return new MentionSpan[i];
            }

            /* renamed from: a */
            private static MentionSpan m137677a(Parcel parcel) {
                return new MentionSpan(parcel);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m137677a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m137678a(i);
            }
        };

        /* renamed from: a */
        public String f112362a;

        /* renamed from: b */
        public String f112363b;

        /* renamed from: c */
        public int f112364c;

        /* renamed from: d */
        public TextExtraStruct f112365d;

        /* renamed from: e */
        public String f112366e = "";

        public int describeContents() {
            return 0;
        }

        public int hashCode() {
            int i;
            int i2;
            int i3 = 0;
            if (this.f112362a != null) {
                i = this.f112362a.hashCode();
            } else {
                i = 0;
            }
            int i4 = i * 31;
            if (this.f112363b != null) {
                i2 = this.f112363b.hashCode();
            } else {
                i2 = 0;
            }
            int i5 = (((i4 + i2) * 31) + this.f112364c) * 31;
            if (this.f112365d != null) {
                i3 = this.f112365d.hashCode();
            }
            return i5 + i3;
        }

        /* renamed from: a */
        public final void mo105274a(String str) {
            this.f112366e = str;
            this.f112365d.setAwemeId(str);
        }

        /* renamed from: a */
        public final void mo105275a(boolean z) {
            this.f112365d.setStarAtlasTag(z);
        }

        protected MentionSpan(Parcel parcel) {
            super(parcel);
            this.f112362a = parcel.readString();
            this.f112363b = parcel.readString();
            this.f112364c = parcel.readInt();
            this.f112365d = (TextExtraStruct) parcel.readParcelable(TextExtraStruct.class.getClassLoader());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MentionSpan)) {
                return false;
            }
            MentionSpan mentionSpan = (MentionSpan) obj;
            if (this.f112364c != mentionSpan.f112364c) {
                return false;
            }
            if (this.f112362a == null ? mentionSpan.f112362a != null : !this.f112362a.equals(mentionSpan.f112362a)) {
                return false;
            }
            if (this.f112363b == null ? mentionSpan.f112363b != null : !this.f112363b.equals(mentionSpan.f112363b)) {
                return false;
            }
            if (this.f112365d != null) {
                return this.f112365d.equals(mentionSpan.f112365d);
            }
            if (mentionSpan.f112365d == null) {
                return true;
            }
            return false;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f112362a);
            parcel.writeString(this.f112363b);
            parcel.writeInt(this.f112364c);
            parcel.writeParcelable(this.f112365d, i);
        }

        public MentionSpan(int i, String str, String str2, int i2, String str3) {
            super(i);
            this.f112362a = str2;
            this.f112363b = str;
            this.f112364c = i2;
            this.f112365d = new TextExtraStruct();
            this.f112365d.setUserId(str2);
            this.f112365d.setType(i2);
            this.f112365d.setAtUserType(str3);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.views.mention.MentionEditText$a */
    class C43380a extends InputConnectionWrapper {

        /* renamed from: b */
        private EditText f112368b;

        public final boolean sendKeyEvent(KeyEvent keyEvent) {
            if (MentionEditText.this.f112358k != null) {
                return MentionEditText.this.f112358k.onKey(MentionEditText.this, keyEvent.getKeyCode(), keyEvent);
            }
            if (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 67) {
                return super.sendKeyEvent(keyEvent);
            }
            int selectionStart = this.f112368b.getSelectionStart();
            C43385b a = MentionEditText.this.mo105247a(selectionStart, this.f112368b.getSelectionEnd());
            if (a == null) {
                MentionEditText.this.f112352e = false;
                return super.sendKeyEvent(keyEvent);
            } else if (MentionEditText.this.f112352e || selectionStart == a.f112372a) {
                MentionEditText.this.f112352e = false;
                return super.sendKeyEvent(keyEvent);
            } else {
                MentionEditText.this.f112352e = true;
                MentionEditText.this.f112353f = a;
                if (VERSION.SDK_INT >= 25) {
                    setSelection(a.f112372a, a.f112373b);
                } else {
                    setSelection(a.f112373b, a.f112372a);
                }
                return true;
            }
        }

        public final boolean commitText(CharSequence charSequence, int i) {
            try {
                return super.commitText(charSequence, i);
            } catch (NullPointerException unused) {
                return true;
            }
        }

        public final boolean deleteSurroundingText(int i, int i2) {
            if (i == 1 && i2 == 0) {
                Editable text = MentionEditText.this.getText();
                if (text != null && text.length() > 0) {
                    int[] a = MentionEditText.this.mo105250a(text, i, i2);
                    int i3 = a[0];
                    int i4 = a[1];
                    if (i3 <= i4) {
                        int i5 = i3;
                        i3 = i4;
                        i4 = i5;
                    }
                    text.delete(i4, i3);
                }
                return false;
            }
            if (i < 0) {
                int i6 = -i2;
                i2 = -i;
                i = i6;
            }
            return super.deleteSurroundingText(i, i2);
        }

        C43380a(InputConnection inputConnection, boolean z, MentionEditText mentionEditText) {
            super(inputConnection, true);
            this.f112368b = mentionEditText;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.views.mention.MentionEditText$b */
    class C43381b implements TextWatcher {
        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        private C43381b() {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (i3 == 1 && !TextUtils.isEmpty(charSequence) && '@' == charSequence.toString().charAt(i) && MentionEditText.this.f112355h != null) {
                MentionEditText.this.f112355h.mo63208a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.views.mention.MentionEditText$c */
    public interface C43382c {
        /* renamed from: a */
        void mo63208a();
    }

    /* renamed from: com.ss.android.ugc.aweme.views.mention.MentionEditText$d */
    static class C43383d implements Runnable {

        /* renamed from: a */
        private WeakReference<MentionEditText> f112370a;

        public final void run() {
            MentionEditText mentionEditText = (MentionEditText) this.f112370a.get();
            if (mentionEditText != null) {
                mentionEditText.setSelection(mentionEditText.getText().length());
            }
        }

        public C43383d(MentionEditText mentionEditText) {
            this.f112370a = new WeakReference<>(mentionEditText);
        }
    }

    /* access modifiers changed from: protected */
    public List<TextExtraStruct> getCompatTextExtraStructList() {
        return getTextExtraStructList();
    }

    public int getMentionTextCount() {
        MentionSpan[] mentionText = getMentionText();
        if (mentionText == null) {
            return 0;
        }
        return mentionText.length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo105253c() {
        for (TextWatcher addTextChangedListener : this.f112356i) {
            super.addTextChangedListener(addTextChangedListener);
        }
    }

    /* renamed from: a */
    private void mo102271a() {
        this.f112354g = new ArrayList(5);
        this.f112350c = -65536;
        addTextChangedListener(new C43381b());
        if (m137662a(getContext())) {
            if (VERSION.SDK_INT >= 17) {
                setTextAlignment(5);
            }
            setGravity(getGravity() | 8388611);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo105252b() {
        for (TextWatcher removeTextChangedListener : this.f112356i) {
            super.removeTextChangedListener(removeTextChangedListener);
        }
    }

    /* renamed from: e */
    public final void mo105255e() {
        Editable text = getText();
        String obj = text.toString();
        int length = obj.length();
        int i = 0;
        while (i < length && obj.charAt(i) <= ' ') {
            i++;
        }
        int i2 = length;
        while (i2 > i && obj.charAt(i2 - 1) <= ' ') {
            i2--;
        }
        if (i < i2) {
            int i3 = i2 + 1;
            if (i3 < length) {
                text.delete(i3, length);
            }
            text.delete(0, i);
            return;
        }
        setText("");
    }

    public MentionSpan[] getMentionText() {
        Editable text = getText();
        if (text == null || TextUtils.isEmpty(text.toString())) {
            return null;
        }
        MentionSpan[] mentionSpanArr = (MentionSpan[]) text.getSpans(0, text.length(), MentionSpan.class);
        Arrays.sort(mentionSpanArr, new C43384a(text));
        return mentionSpanArr;
    }

    public Parcelable onSaveInstanceState() {
        MentionSavedState mentionSavedState = new MentionSavedState(super.onSaveInstanceState());
        mentionSavedState.f112359a = getText().toString();
        mentionSavedState.f112360b = Math.max(getSelectionEnd(), 0);
        mentionSavedState.f112361c = getCompatTextExtraStructList();
        return mentionSavedState;
    }

    /* renamed from: f */
    private void m137664f() {
        MentionSpan[] mentionText;
        this.f112352e = false;
        if (this.f112354g != null) {
            this.f112354g.clear();
        }
        Editable text = getText();
        if (text != null && !TextUtils.isEmpty(text.toString())) {
            for (MentionSpan mentionSpan : getMentionText()) {
                C43385b bVar = new C43385b(text.getSpanStart(mentionSpan), text.getSpanEnd(mentionSpan));
                if (!TextUtils.equals(text.subSequence(bVar.f112372a, bVar.f112373b).toString(), mentionSpan.f112363b)) {
                    text.removeSpan(mentionSpan);
                } else if (mentionSpan.f112364c == 0) {
                    this.f112354g.add(bVar);
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo105254d() {
        if (getStarAtlasExtraList() != null && getText() != null) {
            Iterator it = getStarAtlasExtraList().iterator();
            while (it.hasNext()) {
                TextExtraStruct textExtraStruct = (TextExtraStruct) it.next();
                if (textExtraStruct.isStarAtlasTag()) {
                    if (getText().charAt(textExtraStruct.getEnd()) == ' ') {
                        setText(getText().replace(textExtraStruct.getStart(), textExtraStruct.getEnd() + 1, ""));
                    } else {
                        setText(getText().replace(textExtraStruct.getStart(), textExtraStruct.getEnd(), ""));
                    }
                }
            }
        }
    }

    public ArrayList<TextExtraStruct> getStarAtlasExtraList() {
        MentionSpan[] mentionText;
        Editable text = getText();
        if (text == null || TextUtils.isEmpty(text.toString())) {
            return null;
        }
        ArrayList<TextExtraStruct> arrayList = new ArrayList<>();
        for (MentionSpan mentionSpan : getMentionText()) {
            if (mentionSpan.f112365d.isStarAtlasTag()) {
                mentionSpan.f112365d.setStart(text.getSpanStart(mentionSpan));
                mentionSpan.f112365d.setEnd(text.getSpanEnd(mentionSpan));
                arrayList.add(mentionSpan.f112365d);
            }
        }
        return arrayList;
    }

    public ArrayList<TextExtraStruct> getTextExtraStructList() {
        MentionSpan[] mentionText;
        Editable text = getText();
        if (text == null || TextUtils.isEmpty(text.toString())) {
            return null;
        }
        ArrayList<TextExtraStruct> arrayList = new ArrayList<>();
        for (MentionSpan mentionSpan : getMentionText()) {
            if (mentionSpan.f112364c == 0) {
                mentionSpan.f112365d.setStart(text.getSpanStart(mentionSpan));
                mentionSpan.f112365d.setEnd(text.getSpanEnd(mentionSpan));
                arrayList.add(mentionSpan.f112365d);
            }
        }
        return arrayList;
    }

    public void setMentionTextColor(int i) {
        this.f112350c = i;
    }

    public void setOnMentionInputListener(C43382c cVar) {
        this.f112355h = cVar;
    }

    public void setStarAtlasMentionTextColor(int i) {
        this.f112351d = i;
    }

    public void setOnKeyListener(OnKeyListener onKeyListener) {
        this.f112358k = onKeyListener;
        super.setOnKeyListener(onKeyListener);
    }

    private void setClip(String str) {
        ((ClipboardManager) getContext().getSystemService("clipboard")).setText(str);
    }

    public void addTextChangedListener(TextWatcher textWatcher) {
        super.addTextChangedListener(textWatcher);
        if (this.f112356i != null && textWatcher != null) {
            this.f112356i.add(textWatcher);
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null) {
            return null;
        }
        return new C43380a(onCreateInputConnection, true, this);
    }

    public void removeTextChangedListener(TextWatcher textWatcher) {
        super.removeTextChangedListener(textWatcher);
        if (this.f112356i != null && textWatcher != null) {
            this.f112356i.remove(textWatcher);
        }
    }

    public MentionEditText(Context context) {
        super(context);
        mo102271a();
    }

    /* renamed from: a */
    private static boolean m137662a(Context context) {
        if (context == null || VERSION.SDK_INT < 17 || context.getResources().getConfiguration().getLayoutDirection() != 1) {
            return false;
        }
        return true;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof MentionSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        MentionSavedState mentionSavedState = (MentionSavedState) parcelable;
        super.onRestoreInstanceState(mentionSavedState.getSuperState());
        setText(mentionSavedState.f112359a);
        int min = Math.min(mentionSavedState.f112360b, getText().length());
        if (min >= 0) {
            setSelection(min);
        }
        setTextExtraList(mentionSavedState.f112361c);
    }

    public boolean onTextContextMenuItem(int i) {
        String str = "";
        if (i == 16908320 || i == 16908321) {
            int length = getText().length();
            int i2 = 0;
            if (isFocused()) {
                int selectionStart = getSelectionStart();
                int selectionEnd = getSelectionEnd();
                int max = Math.max(0, Math.min(selectionStart, selectionEnd));
                length = Math.max(0, Math.max(selectionStart, selectionEnd));
                i2 = max;
            }
            str = getText().subSequence(i2, length).toString();
        }
        boolean onTextContextMenuItem = super.onTextContextMenuItem(i);
        if (i == 16908320 || i == 16908321) {
            setClip(str);
        }
        return onTextContextMenuItem;
    }

    public void setTextExtraList(List<TextExtraStruct> list) {
        int i;
        this.f112352e = false;
        if (this.f112354g != null) {
            this.f112354g.clear();
        }
        if (list != null && !list.isEmpty()) {
            Editable text = getText();
            if (text != null && !TextUtils.isEmpty(text.toString())) {
                int length = text.length();
                for (TextExtraStruct textExtraStruct : list) {
                    if (textExtraStruct.isStarAtlasTag()) {
                        i = this.f112351d;
                    } else {
                        i = this.f112350c;
                    }
                    int i2 = i;
                    if (textExtraStruct.getType() == 0 && textExtraStruct.getStart() <= length && textExtraStruct.getEnd() <= length && textExtraStruct.getStart() <= textExtraStruct.getEnd()) {
                        MentionSpan mentionSpan = new MentionSpan(i2, text.subSequence(textExtraStruct.getStart(), textExtraStruct.getEnd()).toString(), textExtraStruct.getUserId(), textExtraStruct.getType(), textExtraStruct.getAtUserType());
                        mentionSpan.mo105275a(textExtraStruct.isStarAtlasTag());
                        if (!TextUtils.isEmpty(textExtraStruct.getAwemeId())) {
                            mentionSpan.mo105274a(textExtraStruct.getAwemeId());
                        }
                        text.setSpan(mentionSpan, textExtraStruct.getStart(), textExtraStruct.getEnd(), 33);
                        this.f112354g.add(new C43385b(textExtraStruct.getStart(), textExtraStruct.getEnd()));
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private C43385b m137663b(int i, int i2) {
        if (this.f112354g == null) {
            return null;
        }
        for (C43385b bVar : this.f112354g) {
            if (bVar.mo105291a(i, i2)) {
                return bVar;
            }
        }
        return null;
    }

    public void setText(CharSequence charSequence, BufferType bufferType) {
        try {
            super.setText(charSequence, bufferType);
        } catch (Exception unused) {
        }
        if (this.f112349a == null) {
            this.f112349a = new C43383d(this);
        }
        post(this.f112349a);
    }

    public MentionEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo102271a();
    }

    /* renamed from: a */
    public final C43385b mo105247a(int i, int i2) {
        if (this.f112354g == null) {
            return null;
        }
        for (C43385b bVar : this.f112354g) {
            if (bVar.mo105292b(i, i2)) {
                return bVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onSelectionChanged(int i, int i2) {
        int i3;
        int i4;
        super.onSelectionChanged(i, i2);
        if (getStarAtlasExtraList() != null && !TextUtils.isEmpty(getText())) {
            Iterator it = getStarAtlasExtraList().iterator();
            while (it.hasNext()) {
                TextExtraStruct textExtraStruct = (TextExtraStruct) it.next();
                if (i < textExtraStruct.getEnd() + 1) {
                    i3 = textExtraStruct.getEnd() + 1;
                } else {
                    i3 = i;
                }
                if (i2 < textExtraStruct.getEnd() + 1) {
                    i4 = textExtraStruct.getEnd() + 1;
                } else {
                    i4 = i2;
                }
                if (i3 > getText().length()) {
                    i3 = getText().length();
                }
                if (i4 > getText().length()) {
                    i4 = getText().length();
                }
                setSelection(i3, i4);
            }
        }
        if (this.f112353f == null || !this.f112353f.mo105293c(i, i2)) {
            C43385b a = mo105247a(i, i2);
            if (a != null && a.f112373b == i2) {
                this.f112352e = false;
            }
            C43385b b = m137663b(i, i2);
            if (b != null) {
                if (i == i2) {
                    try {
                        setSelection(b.mo105290a(i));
                    } catch (IndexOutOfBoundsException unused) {
                    }
                    return;
                }
                if (i2 < b.f112373b) {
                    setSelection(i, b.f112373b);
                }
                if (i > b.f112372a) {
                    setSelection(b.f112372a, i2);
                }
            }
        }
    }

    /* renamed from: a */
    static final /* synthetic */ int m137659a(Editable editable, MentionSpan mentionSpan, MentionSpan mentionSpan2) {
        return editable.getSpanStart(mentionSpan) - editable.getSpanStart(mentionSpan2);
    }

    public MentionEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo102271a();
    }

    /* renamed from: a */
    public final boolean mo105248a(int i, String str, String str2) {
        return m137661a(0, str, str2, "", false);
    }

    /* renamed from: a */
    public final int[] mo105250a(Editable editable, int i, int i2) {
        CharacterStyle[] characterStyleArr;
        int length = editable.length();
        int max = Math.max(getSelectionStart() - i, 0);
        int min = Math.min(getSelectionEnd() + i2, length);
        int i3 = min;
        int i4 = max;
        boolean z = false;
        boolean z2 = false;
        for (CharacterStyle characterStyle : (CharacterStyle[]) editable.getSpans(0, length, CharacterStyle.class)) {
            if (!(characterStyle instanceof MentionSpan) || ((MentionSpan) characterStyle).f112364c != 1) {
                int spanStart = editable.getSpanStart(characterStyle);
                int spanEnd = editable.getSpanEnd(characterStyle);
                if (!z && spanStart <= max && spanEnd > max) {
                    i4 = spanStart;
                    z = true;
                }
                if (!z2 && spanStart < min && spanEnd >= min) {
                    i3 = spanEnd;
                    z2 = true;
                }
                if (z && z2) {
                    break;
                }
            }
        }
        return new int[]{i4, i3};
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        m137664f();
    }

    /* renamed from: a */
    public final boolean mo105249a(int i, String str, String str2, boolean z) {
        return m137661a(1, str, str2, "", true);
    }

    /* renamed from: a */
    private boolean m137661a(int i, String str, String str2, String str3, boolean z) {
        int i2;
        String str4;
        int i3;
        int i4;
        int i5 = i;
        boolean z2 = z;
        if (z2) {
            i2 = 0;
        } else {
            i2 = getSelectionStart();
        }
        Editable text = getText();
        if (text == null) {
            return false;
        }
        if (i5 == 0) {
            str4 = "@";
        } else if (i5 == 1) {
            str4 = "#";
        } else {
            str4 = "";
        }
        String str5 = str4;
        StringBuilder sb = new StringBuilder();
        sb.append(str5);
        sb.append(str);
        SpannableString spannableString = new SpannableString(sb.toString());
        if (z2) {
            i3 = this.f112351d;
        } else {
            i3 = this.f112350c;
        }
        MentionSpan mentionSpan = new MentionSpan(i3, spannableString.toString(), str2, i, str3);
        spannableString.setSpan(mentionSpan, 0, spannableString.length(), 33);
        mentionSpan.mo105275a(z2);
        MentionSpan[] mentionText = getMentionText();
        if (!z2 && mentionText != null && Arrays.asList(mentionText).contains(mentionSpan)) {
            return false;
        }
        if (TextUtils.isEmpty(text)) {
            text.insert(0, spannableString);
            text.append(" ");
            return true;
        }
        int length = text.length();
        if (z2) {
            if (text.length() + spannableString.length() + 1 > 100) {
                if (spannableString.length() + 1 > text.length()) {
                    i4 = text.length();
                } else {
                    i4 = spannableString.length() + 1;
                }
                text.delete(0, i4);
            }
            text.insert(i2, " ");
            text.insert(i2, spannableString);
        } else if (i2 <= length && i2 >= 0) {
            if (i2 > 0) {
                int i6 = i2 - 1;
                if (TextUtils.equals(text.subSequence(i6, i2), str5)) {
                    text.delete(i6, i2);
                    i2--;
                    length--;
                }
            }
            int min = Math.min(length, Math.max(0, i2));
            text.insert(min, spannableString);
            text.insert(Math.min(min + spannableString.length(), text.length()), " ");
        }
        return true;
    }
}
