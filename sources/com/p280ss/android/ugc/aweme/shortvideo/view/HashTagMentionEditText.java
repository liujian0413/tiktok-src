package com.p280ss.android.ugc.aweme.shortvideo.view;

import android.content.Context;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.model.TextExtraStruct;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import com.p280ss.android.ugc.aweme.shortvideo.p1587q.C40244a;
import com.p280ss.android.ugc.aweme.shortvideo.p1587q.C40245b;
import com.p280ss.android.ugc.aweme.shortvideo.p1588r.C40256i;
import com.p280ss.android.ugc.aweme.video.hashtag.C43226a;
import com.p280ss.android.ugc.aweme.video.hashtag.C43226a.C43227a;
import com.p280ss.android.ugc.aweme.video.hashtag.C43230c;
import com.p280ss.android.ugc.aweme.views.mention.C43385b;
import com.p280ss.android.ugc.aweme.views.mention.MentionEditText;
import com.p280ss.android.ugc.aweme.views.mention.MentionEditText.MentionSpan;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText */
public class HashTagMentionEditText extends MentionEditText implements C40245b {

    /* renamed from: a */
    public int f108219a;

    /* renamed from: b */
    public C40244a f108220b;

    /* renamed from: l */
    private String f108221l = "";

    /* renamed from: m */
    private boolean f108222m;

    /* renamed from: n */
    private int f108223n;

    /* renamed from: o */
    private int f108224o;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText$a */
    class C41646a implements TextWatcher {
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo102282a() {
            HashTagMentionEditText.this.mo102272a(false);
        }

        private C41646a() {
        }

        public final void afterTextChanged(Editable editable) {
            HashTagMentionEditText.this.post(new C41658h(this));
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (C6399b.m19944t() && HashTagMentionEditText.this.f108219a != 0 && HashTagMentionEditText.this.f108220b != null) {
                Editable text = HashTagMentionEditText.this.getText();
                int i4 = 0;
                C40244a[] aVarArr = (C40244a[]) text.getSpans(0, text.length(), C40244a.class);
                if (aVarArr != null) {
                    i4 = aVarArr.length;
                }
                if (HashTagMentionEditText.this.f108219a == 1 && i4 == 0) {
                    HashTagMentionEditText.this.mo102271a();
                }
                HashTagMentionEditText.this.f108219a = i4;
            }
        }
    }

    public String getCreationId() {
        return this.f108221l;
    }

    public int getHookAtMaxWidth() {
        return this.f108223n;
    }

    public int getVideoType() {
        return this.f108224o;
    }

    public List<TextExtraStruct> getCompatTextExtraStructList() {
        return getTextExtraStructListWithHashTag();
    }

    /* renamed from: f */
    private void m132564f() {
        if (!C35563c.f93260w.mo57088a()) {
            addTextChangedListener(new C41646a());
        }
    }

    /* renamed from: g */
    private void m132565g() {
        if (C6399b.m19944t() && this.f108220b != null) {
            Editable text = getText();
            if (text.length() != 0 && !m132562a(text)) {
                text.removeSpan(this.f108220b);
                this.f108220b = null;
                mo102271a();
            }
        }
    }

    /* renamed from: a */
    public final void mo102271a() {
        if (!this.f108222m) {
            if (getVideoType() == 1) {
                C6907h.m21524a("caption_delete", (Map) C22984d.m75611a().mo59973a("creation_id", this.f108221l).mo59973a("caption_type", "duet").f60753a);
            } else if (getVideoType() == 2) {
                C6907h.m21524a("caption_delete", (Map) C22984d.m75611a().mo59973a("creation_id", this.f108221l).mo59973a("caption_type", "react").f60753a);
            }
            this.f108222m = true;
        }
    }

    public List<TextExtraStruct> getTextExtraStructListWithHashTag() {
        MentionSpan[] mentionText;
        Editable text = getText();
        if (text == null || TextUtils.isEmpty(text.toString())) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (MentionSpan mentionSpan : getMentionText()) {
            if (mentionSpan.f112364c == 0) {
                mentionSpan.f112365d.setStart(text.getSpanStart(mentionSpan));
                mentionSpan.f112365d.setEnd(text.getSpanEnd(mentionSpan));
                arrayList.add(mentionSpan.f112365d);
            }
        }
        List<C43226a> a = m132559a(getText().toString());
        for (C43226a aVar : a) {
            TextExtraStruct textExtraStruct = new TextExtraStruct();
            textExtraStruct.setType(1);
            textExtraStruct.setStarAtlasTag(m132561a(a.indexOf(aVar)));
            textExtraStruct.setHashTagName(aVar.f111899c.toLowerCase().replaceAll("#", ""));
            textExtraStruct.setStart(aVar.f111897a);
            textExtraStruct.setEnd(aVar.f111898b);
            arrayList.add(textExtraStruct);
            C35563c.f93248k.mo83192a(System.currentTimeMillis(), textExtraStruct.getHashTagName());
        }
        return arrayList;
    }

    public void setCreationId(String str) {
        this.f108221l = str;
    }

    public void setVideoType(int i) {
        this.f108224o = i;
    }

    /* renamed from: a */
    private static void m132560a(List<C43385b> list) {
        Collections.sort(list, C41657g.f108256a);
    }

    public void setAVTextExtraList(List<AVTextExtraStruct> list) {
        setTextExtraList(C40256i.m128616a(list));
    }

    public HashTagMentionEditText(Context context) {
        super(context);
        m132564f();
    }

    /* renamed from: a */
    private boolean m132561a(int i) {
        MentionSpan[] mentionText = getMentionText();
        if (i < 0 || i >= mentionText.length) {
            return false;
        }
        return mentionText[i].f112365d.isStarAtlasTag();
    }

    /* renamed from: a */
    private boolean m132562a(Editable editable) {
        if (this.f108220b == null) {
            return false;
        }
        for (MentionSpan mentionSpan : (MentionSpan[]) editable.getSpans(0, editable.length(), MentionSpan.class)) {
            if (!TextUtils.isEmpty(mentionSpan.f112366e)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private List<C43226a> m132559a(String str) {
        boolean z;
        HashSet hashSet = new HashSet();
        int i = 0;
        for (String str2 : C43230c.m137138a(str, C6399b.m19944t())) {
            int indexOf = str.indexOf(str2, i);
            if (indexOf >= 0) {
                Iterator it = this.f112357j.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (indexOf == str.indexOf((String) it.next(), i)) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                int length = str2.length() + indexOf;
                if (!z) {
                    hashSet.add(new C43226a(str2, indexOf, length));
                }
                i = length;
            }
        }
        for (String str3 : this.f112357j) {
            int i2 = 0;
            while (i2 < str.length()) {
                int indexOf2 = str.indexOf(str3, i2);
                if (indexOf2 < 0) {
                    break;
                }
                int length2 = str3.length() + indexOf2;
                hashSet.add(new C43226a(str3, indexOf2, length2));
                i2 = length2;
            }
        }
        ArrayList arrayList = new ArrayList(hashSet);
        Collections.sort(arrayList, new C43227a());
        return arrayList;
    }

    public void setTextExtraList(List<TextExtraStruct> list) {
        int i;
        super.setTextExtraList(list);
        Editable text = getText();
        if (text != null && !TextUtils.isEmpty(text.toString())) {
            int length = text.length();
            if (!C6307b.m19566a((Collection<T>) list)) {
                for (TextExtraStruct textExtraStruct : list) {
                    if (textExtraStruct != null) {
                        if (textExtraStruct.getType() == 1) {
                            if (textExtraStruct.getStart() <= length && textExtraStruct.getEnd() <= length && textExtraStruct.getStart() <= textExtraStruct.getEnd()) {
                                if (textExtraStruct.isStarAtlasTag()) {
                                    i = this.f112351d;
                                } else {
                                    i = this.f112350c;
                                }
                                MentionSpan mentionSpan = new MentionSpan(i, text.subSequence(textExtraStruct.getStart(), textExtraStruct.getEnd()).toString(), textExtraStruct.getUserId(), textExtraStruct.getType(), textExtraStruct.getAtUserType());
                                mentionSpan.mo105275a(textExtraStruct.isStarAtlasTag());
                                text.setSpan(mentionSpan, textExtraStruct.getStart(), textExtraStruct.getEnd(), 33);
                            }
                        }
                        if (C6399b.m19944t() && textExtraStruct.getType() == 0 && !TextUtils.isEmpty(textExtraStruct.getAwemeId()) && textExtraStruct.getStart() <= length && textExtraStruct.getEnd() <= length && textExtraStruct.getStart() <= textExtraStruct.getEnd()) {
                            if (textExtraStruct.getEnd() < length && text.charAt(textExtraStruct.getEnd()) == 160) {
                                text.replace(textExtraStruct.getEnd(), textExtraStruct.getEnd() + 1, " ");
                            }
                            this.f108220b = new C40244a(getContext(), this);
                            text.setSpan(this.f108220b, textExtraStruct.getStart(), textExtraStruct.getEnd(), 33);
                            this.f108219a = 1;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo102272a(boolean z) {
        int i;
        if (getText() != null) {
            System.currentTimeMillis();
            mo105252b();
            ArrayList<C43385b> arrayList = new ArrayList<>();
            String obj = getText().toString();
            for (C43226a aVar : m132559a(obj)) {
                arrayList.add(new C43385b(aVar.f111897a, aVar.f111898b));
            }
            ArrayList<C43385b> arrayList2 = new ArrayList<>(arrayList);
            if (this.f112354g != null && !this.f112354g.isEmpty()) {
                arrayList2.addAll(this.f112354g);
            }
            m132560a((List<C43385b>) arrayList2);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (C43385b bVar : arrayList) {
                if (z || bVar.mo105292b(getSelectionStart() - 1, getSelectionEnd() - 1) || bVar.mo105292b(getSelectionStart() + 1, getSelectionEnd() + 1)) {
                    spannableStringBuilder.append(obj.substring(bVar.f112372a, bVar.f112373b));
                    boolean a = m132561a(arrayList.indexOf(bVar));
                    if (a) {
                        i = this.f112351d;
                    } else {
                        i = this.f112350c;
                    }
                    MentionSpan mentionSpan = new MentionSpan(i, spannableStringBuilder.toString(), "", 1, "");
                    mentionSpan.mo105275a(a);
                    m132563b(bVar.f112372a, bVar.f112373b);
                    getText().setSpan(mentionSpan, bVar.f112372a, bVar.f112373b, 33);
                    spannableStringBuilder.clear();
                }
            }
            int i2 = 0;
            int length = obj.length();
            for (C43385b bVar2 : arrayList2) {
                if (i2 >= 0 && bVar2.f112372a <= length && i2 <= bVar2.f112372a) {
                    m132563b(i2, bVar2.f112372a);
                    i2 = bVar2.f112373b;
                }
            }
            if (i2 <= length) {
                m132563b(i2, length);
            }
            m132565g();
            mo105253c();
            StringBuilder sb = new StringBuilder("full: ");
            sb.append(z);
            sb.append("\n  text: ");
            sb.append(getText().toString());
            sb.append(" and se: ");
            sb.append(getSelectionEnd());
            C6921a.m21562b("MentionEditText", sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        this.f108223n = MeasureSpec.getSize(i);
        super.onMeasure(i, i2);
    }

    public HashTagMentionEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m132564f();
    }

    /* renamed from: b */
    private void m132563b(int i, int i2) {
        if (i < i2 && getText() != null) {
            for (MentionSpan removeSpan : (MentionSpan[]) getText().getSpans(i, i2, MentionSpan.class)) {
                getText().removeSpan(removeSpan);
            }
        }
    }

    public HashTagMentionEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m132564f();
    }
}
