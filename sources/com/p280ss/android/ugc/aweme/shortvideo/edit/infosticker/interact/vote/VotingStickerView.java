package com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.aweme.base.utils.C23483k;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.shortvideo.widget.C41695h.C41697b;
import com.p280ss.android.ugc.aweme.sticker.data.VoteStruct;
import com.p280ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean;
import com.p280ss.android.ugc.aweme.story.shootvideo.textfont.C42039d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerView */
public final class VotingStickerView extends FrameLayout {

    /* renamed from: a */
    public static final C39637a f103073a = new C39637a(null);

    /* renamed from: b */
    private final int f103074b = C23486n.m77122a(73.0d);

    /* renamed from: c */
    private LinearLayout f103075c;

    /* renamed from: d */
    private HashMap f103076d;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerView$a */
    public static final class C39637a {
        private C39637a() {
        }

        public /* synthetic */ C39637a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerView$b */
    public static final class C39638b implements TextWatcher {

        /* renamed from: a */
        private final EditText f103077a;

        /* renamed from: b */
        private final EditText f103078b;

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void afterTextChanged(Editable editable) {
            C39654e.m126973a(this.f103077a, 1);
            String valueOf = String.valueOf(editable);
            CharSequence charSequence = valueOf;
            if (C7634n.m23726a(charSequence, 13, 0, false, 6, (Object) null) >= 0 || C7634n.m23726a(charSequence, 10, 0, false, 6, (Object) null) >= 0) {
                this.f103077a.setText(C7634n.m23711a(C7634n.m23711a(valueOf, "\r", "", false), "\n", "", false));
                this.f103077a.setSelection(this.f103077a.getText().length());
                C39654e.m126975b(this.f103078b);
            }
        }

        public C39638b(EditText editText, EditText editText2) {
            C7573i.m23587b(editText, "editText");
            this.f103077a = editText;
            this.f103078b = editText2;
        }

        public /* synthetic */ C39638b(EditText editText, EditText editText2, int i, C7571f fVar) {
            this(editText, null);
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C39654e.m126972a(this.f103077a, 20.0d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerView$c */
    public static final class C39639c implements TextWatcher {

        /* renamed from: a */
        private final EditText f103079a;

        /* renamed from: b */
        private final EditText f103080b;

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void afterTextChanged(Editable editable) {
            C39654e.m126973a(this.f103079a, C39654e.f103122e);
            C39654e.f103123f = C39654e.m126971a(this.f103079a);
        }

        public C39639c(EditText editText, EditText editText2) {
            C7573i.m23587b(editText, "editText");
            this.f103079a = editText;
            this.f103080b = editText2;
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C39654e.m126972a(this.f103079a, 10.0d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerView$d */
    static final class C39640d implements OnKeyListener {

        /* renamed from: a */
        public static final C39640d f103081a = new C39640d();

        C39640d() {
        }

        public final boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (66 == i) {
                C7573i.m23582a((Object) keyEvent, "event");
                if (keyEvent.getAction() == 0 && C39654e.f103123f >= C39654e.f103122e) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: b */
    public final View mo98911b(int i) {
        if (this.f103076d == null) {
            this.f103076d = new HashMap();
        }
        View view = (View) this.f103076d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f103076d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final void mo98908a() {
        setEditTextFocusable(0);
    }

    /* renamed from: c */
    public final void mo98913c() {
        VoteEditText voteEditText = (VoteEditText) mo98911b(R.id.agt);
        C7573i.m23582a((Object) voteEditText, "et_voting_sticker_title");
        voteEditText.setVisibility(0);
        Space space = (Space) mo98911b(R.id.bjs);
        C7573i.m23582a((Object) space, "layout_space");
        space.setVisibility(0);
    }

    /* renamed from: d */
    private final void m126931d() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.b5k, this, false);
        if (inflate != null) {
            this.f103075c = (LinearLayout) inflate;
            LinearLayout linearLayout = this.f103075c;
            if (linearLayout == null) {
                C7573i.m23583a("container");
            }
            addView(linearLayout);
            C39654e.f103118a = Math.max(C23482j.m77105f(getContext()) / 4, this.f103074b);
            m126932e();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout");
    }

    public final VoteStruct getVoteStruct() {
        VoteStruct voteStruct = new VoteStruct();
        VoteEditText voteEditText = (VoteEditText) mo98911b(R.id.agt);
        C7573i.m23582a((Object) voteEditText, "et_voting_sticker_title");
        voteStruct.setQuestion(String.valueOf(voteEditText.getText()));
        List arrayList = new ArrayList();
        OptionsBean optionsBean = new OptionsBean();
        VoteEditText voteEditText2 = (VoteEditText) mo98911b(R.id.agr);
        C7573i.m23582a((Object) voteEditText2, "et_voting_sticker_option_1");
        optionsBean.setPostOption(String.valueOf(voteEditText2.getText()));
        arrayList.add(optionsBean);
        OptionsBean optionsBean2 = new OptionsBean();
        VoteEditText voteEditText3 = (VoteEditText) mo98911b(R.id.ags);
        C7573i.m23582a((Object) voteEditText3, "et_voting_sticker_option_2");
        optionsBean2.setPostOption(String.valueOf(voteEditText3.getText()));
        arrayList.add(optionsBean2);
        voteStruct.setOptions(arrayList);
        return voteStruct;
    }

    /* renamed from: b */
    public final void mo98912b() {
        boolean z;
        VoteEditText voteEditText = (VoteEditText) mo98911b(R.id.agt);
        C7573i.m23582a((Object) voteEditText, "et_voting_sticker_title");
        voteEditText.setVisibility(8);
        Space space = (Space) mo98911b(R.id.bjs);
        C7573i.m23582a((Object) space, "layout_space");
        space.setVisibility(8);
        VoteEditText voteEditText2 = (VoteEditText) mo98911b(R.id.agt);
        C7573i.m23582a((Object) voteEditText2, "et_voting_sticker_title");
        if (!C23483k.m77110a(String.valueOf(voteEditText2.getText()))) {
            VoteEditText voteEditText3 = (VoteEditText) mo98911b(R.id.agt);
            C7573i.m23582a((Object) voteEditText3, "et_voting_sticker_title");
            voteEditText3.setVisibility(0);
            Space space2 = (Space) mo98911b(R.id.bjs);
            C7573i.m23582a((Object) space2, "layout_space");
            space2.setVisibility(0);
        }
        VoteEditText voteEditText4 = (VoteEditText) mo98911b(R.id.agr);
        C7573i.m23582a((Object) voteEditText4, "et_voting_sticker_option_1");
        CharSequence text = voteEditText4.getText();
        boolean z2 = true;
        if (text == null || text.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ((VoteEditText) mo98911b(R.id.agr)).setText(R.string.fqe);
        }
        VoteEditText voteEditText5 = (VoteEditText) mo98911b(R.id.ags);
        C7573i.m23582a((Object) voteEditText5, "et_voting_sticker_option_2");
        CharSequence text2 = voteEditText5.getText();
        if (!(text2 == null || text2.length() == 0)) {
            z2 = false;
        }
        if (z2) {
            ((VoteEditText) mo98911b(R.id.ags)).setText(R.string.fqf);
        }
    }

    public final int getLastTouchedIndex() {
        if (((VoteEditText) mo98911b(R.id.agt)).f103049a > ((VoteEditText) mo98911b(R.id.agr)).f103049a) {
            if (((VoteEditText) mo98911b(R.id.agt)).f103049a < ((VoteEditText) mo98911b(R.id.ags)).f103049a && System.currentTimeMillis() - ((VoteEditText) mo98911b(R.id.ags)).f103049a < 1000) {
                return 2;
            }
        } else if (((VoteEditText) mo98911b(R.id.agr)).f103049a > ((VoteEditText) mo98911b(R.id.ags)).f103049a) {
            if (System.currentTimeMillis() - ((VoteEditText) mo98911b(R.id.agr)).f103049a < 1000) {
                return 1;
            }
        } else if (System.currentTimeMillis() - ((VoteEditText) mo98911b(R.id.ags)).f103049a < 1000) {
            return 2;
        }
        return 0;
    }

    /* renamed from: e */
    private final void m126932e() {
        VoteEditText voteEditText = (VoteEditText) mo98911b(R.id.agt);
        VoteEditText voteEditText2 = (VoteEditText) mo98911b(R.id.agt);
        C7573i.m23582a((Object) voteEditText2, "et_voting_sticker_title");
        voteEditText.addTextChangedListener(new C39639c(voteEditText2, (VoteEditText) mo98911b(R.id.agr)));
        VoteEditText voteEditText3 = (VoteEditText) mo98911b(R.id.agr);
        VoteEditText voteEditText4 = (VoteEditText) mo98911b(R.id.agr);
        C7573i.m23582a((Object) voteEditText4, "et_voting_sticker_option_1");
        voteEditText3.addTextChangedListener(new C39638b(voteEditText4, (VoteEditText) mo98911b(R.id.ags)));
        VoteEditText voteEditText5 = (VoteEditText) mo98911b(R.id.ags);
        VoteEditText voteEditText6 = (VoteEditText) mo98911b(R.id.ags);
        C7573i.m23582a((Object) voteEditText6, "et_voting_sticker_option_2");
        voteEditText5.addTextChangedListener(new C39638b(voteEditText6, null, 2, null));
        Typeface c = C42039d.m133620a().mo103231c("方正兰亭特黑简体");
        if (c != null) {
            VoteEditText voteEditText7 = (VoteEditText) mo98911b(R.id.agt);
            C7573i.m23582a((Object) voteEditText7, "et_voting_sticker_title");
            voteEditText7.setTypeface(c);
        }
        C39654e.m126972a((EditText) (VoteEditText) mo98911b(R.id.agt), 10.0d);
        C39654e.m126972a((EditText) (VoteEditText) mo98911b(R.id.agr), 20.0d);
        C39654e.m126972a((EditText) (VoteEditText) mo98911b(R.id.ags), 20.0d);
        ((VoteEditText) mo98911b(R.id.agr)).setLayerType(1, null);
        ((VoteEditText) mo98911b(R.id.ags)).setLayerType(1, null);
        VoteEditText voteEditText8 = (VoteEditText) mo98911b(R.id.agr);
        C7573i.m23582a((Object) voteEditText8, "et_voting_sticker_option_1");
        C41697b.m132804a(voteEditText8, Color.parseColor("#ffffff"), C23486n.m77122a(22.0d), Color.parseColor("#3d000000"), C23486n.m77122a(4.0d), 0, 0);
        VoteEditText voteEditText9 = (VoteEditText) mo98911b(R.id.ags);
        C7573i.m23582a((Object) voteEditText9, "et_voting_sticker_option_2");
        C41697b.m132804a(voteEditText9, Color.parseColor("#ffffff"), C23486n.m77122a(22.0d), Color.parseColor("#3d000000"), C23486n.m77122a(4.0d), 0, 0);
        ((VoteEditText) mo98911b(R.id.agt)).setOnKeyListener(C39640d.f103081a);
    }

    public VotingStickerView(Context context) {
        C7573i.m23587b(context, "context");
        super(context);
        m126931d();
    }

    /* renamed from: a */
    public final void mo98909a(int i) {
        C39654e.f103122e = i;
        VoteEditText voteEditText = (VoteEditText) mo98911b(R.id.agt);
        C7573i.m23582a((Object) voteEditText, "et_voting_sticker_title");
        voteEditText.setMaxLines(C39654e.f103122e);
    }

    public final void setEditEnable(boolean z) {
        VoteEditText voteEditText = (VoteEditText) mo98911b(R.id.agt);
        C7573i.m23582a((Object) voteEditText, "et_voting_sticker_title");
        voteEditText.setEnabled(z);
        VoteEditText voteEditText2 = (VoteEditText) mo98911b(R.id.agr);
        C7573i.m23582a((Object) voteEditText2, "et_voting_sticker_option_1");
        voteEditText2.setEnabled(z);
        VoteEditText voteEditText3 = (VoteEditText) mo98911b(R.id.ags);
        C7573i.m23582a((Object) voteEditText3, "et_voting_sticker_option_2");
        voteEditText3.setEnabled(z);
    }

    public final void setTouchEnable(boolean z) {
        ((VoteEditText) mo98911b(R.id.agt)).setMode(z);
        ((VoteEditText) mo98911b(R.id.agr)).setMode(z);
        ((VoteEditText) mo98911b(R.id.ags)).setMode(z);
    }

    /* renamed from: a */
    public final void mo98910a(VoteStruct voteStruct) {
        C7573i.m23587b(voteStruct, "voteStruct");
        ((VoteEditText) mo98911b(R.id.agt)).setText(voteStruct.getQuestion());
        VoteEditText voteEditText = (VoteEditText) mo98911b(R.id.agr);
        Object obj = voteStruct.getOptions().get(0);
        C7573i.m23582a(obj, "voteStruct.options[0]");
        voteEditText.setText(((OptionsBean) obj).getPostOption());
        VoteEditText voteEditText2 = (VoteEditText) mo98911b(R.id.ags);
        Object obj2 = voteStruct.getOptions().get(1);
        C7573i.m23582a(obj2, "voteStruct.options[1]");
        voteEditText2.setText(((OptionsBean) obj2).getPostOption());
    }

    public final void setEditTextFocusable(int i) {
        VoteEditText voteEditText = (VoteEditText) mo98911b(R.id.agt);
        C7573i.m23582a((Object) voteEditText, "et_voting_sticker_title");
        voteEditText.setVisibility(0);
        Space space = (Space) mo98911b(R.id.bjs);
        C7573i.m23582a((Object) space, "layout_space");
        space.setVisibility(0);
        switch (i) {
            case 0:
                C39654e.m126975b((VoteEditText) mo98911b(R.id.agt));
                return;
            case 1:
                C39654e.m126975b((VoteEditText) mo98911b(R.id.agr));
                return;
            case 2:
                C39654e.m126975b((VoteEditText) mo98911b(R.id.ags));
                break;
        }
    }

    public VotingStickerView(Context context, AttributeSet attributeSet) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(attributeSet, "attr");
        super(context, attributeSet);
        m126931d();
    }

    public VotingStickerView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(attributeSet, "attr");
        super(context, attributeSet, i);
        m126931d();
    }
}
