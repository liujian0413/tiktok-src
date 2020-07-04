package com.p280ss.android.ugc.aweme.shortvideo.subtitle;

import android.app.Activity;
import android.graphics.Color;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.jedi.arch.JediViewModel;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.shortvideo.C38511bc;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39500av;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41541au;
import com.p280ss.android.ugc.gamora.editor.EditViewModel;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.vesdk.VEEditor.SET_RANGE_MODE;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleEditAdapter */
public final class SubtitleEditAdapter extends C1262a<SubtitleEditViewHolder> {

    /* renamed from: a */
    public View f106739a;

    /* renamed from: b */
    public final ArrayList<UtteranceWithWords> f106740b = new ArrayList<>();

    /* renamed from: c */
    public String f106741c = "";

    /* renamed from: d */
    public final FragmentActivity f106742d;

    /* renamed from: e */
    public final C15389d f106743e;

    /* renamed from: f */
    public final VideoPublishEditModel f106744f;

    /* renamed from: g */
    public final SubtitleModule f106745g;

    /* renamed from: h */
    public ArrayList<UtteranceWithWords> f106746h;

    /* renamed from: i */
    public ArrayList<UtteranceWithWords> f106747i;

    /* renamed from: j */
    public int f106748j = 0;

    /* renamed from: k */
    private final EditViewModel f106749k;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleEditAdapter$SubtitleEditViewHolder */
    public final class SubtitleEditViewHolder extends C1293v {

        /* renamed from: a */
        public final EditText f106750a;

        /* renamed from: b */
        public final ImageView f106751b;

        /* renamed from: c */
        final /* synthetic */ SubtitleEditAdapter f106752c;

        public SubtitleEditViewHolder(SubtitleEditAdapter subtitleEditAdapter, View view) {
            C7573i.m23587b(view, "itemView");
            this.f106752c = subtitleEditAdapter;
            super(view);
            View findViewById = view.findViewById(R.id.dd_);
            C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.….subtitle_item_edit_text)");
            this.f106750a = (EditText) findViewById;
            View findViewById2 = view.findViewById(R.id.dda);
            C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.subtitle_item_play)");
            this.f106751b = (ImageView) findViewById2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleEditAdapter$a */
    static final class C41023a implements OnFocusChangeListener {

        /* renamed from: a */
        final /* synthetic */ SubtitleEditAdapter f106753a;

        /* renamed from: b */
        final /* synthetic */ SubtitleEditViewHolder f106754b;

        C41023a(SubtitleEditAdapter subtitleEditAdapter, SubtitleEditViewHolder subtitleEditViewHolder) {
            this.f106753a = subtitleEditAdapter;
            this.f106754b = subtitleEditViewHolder;
        }

        public final void onFocusChange(View view, boolean z) {
            if (z) {
                this.f106753a.f106745g.mo101480a(this.f106754b.f106750a);
                if (this.f106754b.getAdapterPosition() == this.f106753a.f106748j) {
                    this.f106754b.f106750a.setTextIsSelectable(true);
                    this.f106754b.f106750a.setCursorVisible(true);
                    this.f106754b.f106750a.setSelection(this.f106754b.f106750a.getText().length());
                    this.f106754b.f106751b.setVisibility(0);
                    this.f106754b.f106750a.setTextColor(this.f106753a.f106742d.getResources().getColor(R.color.az3));
                    this.f106754b.itemView.setBackgroundColor(Color.parseColor("#0fffffff"));
                    return;
                }
                return;
            }
            this.f106754b.f106751b.setVisibility(4);
            this.f106754b.itemView.setBackgroundResource(0);
            this.f106754b.f106750a.setTextColor(this.f106753a.f106742d.getResources().getColor(R.color.aza));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleEditAdapter$b */
    static final class C41024b implements OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ SubtitleEditAdapter f106755a;

        /* renamed from: b */
        final /* synthetic */ SubtitleEditViewHolder f106756b;

        C41024b(SubtitleEditAdapter subtitleEditAdapter, SubtitleEditViewHolder subtitleEditViewHolder) {
            this.f106755a = subtitleEditAdapter;
            this.f106756b = subtitleEditViewHolder;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C7573i.m23582a((Object) motionEvent, "event");
            if (motionEvent.getAction() != 0 || this.f106756b.getAdapterPosition() == -1) {
                return false;
            }
            this.f106755a.f106748j = this.f106756b.getAdapterPosition();
            this.f106756b.f106750a.requestFocus();
            this.f106755a.f106745g.mo101480a(this.f106756b.f106750a);
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleEditAdapter$c */
    static final class C41025c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SubtitleEditAdapter f106757a;

        /* renamed from: b */
        final /* synthetic */ UtteranceWithWords f106758b;

        C41025c(SubtitleEditAdapter subtitleEditAdapter, UtteranceWithWords utteranceWithWords) {
            this.f106757a = subtitleEditAdapter;
            this.f106758b = utteranceWithWords;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C15389d dVar = this.f106757a.f106743e;
            if (dVar != null) {
                dVar.mo38756a(this.f106758b.getStartTime(), this.f106758b.getEndTime(), SET_RANGE_MODE.EDITOR_TIMERANGE_FLAG_BEFORE_SPEED);
            }
            C15389d dVar2 = this.f106757a.f106743e;
            if (dVar2 != null) {
                dVar2.mo38879v();
            }
            C6907h.m21524a("preview_subtitle", (Map) C38511bc.m123103a().mo96485a("enter_from", "video_edit_page").mo96485a("shoot_way", this.f106757a.f106744f.mShootWay).mo96485a("creation_id", this.f106757a.f106744f.creationId).mo96485a("content_source", C39500av.m126142b(this.f106757a.f106744f)).mo96485a("content_type", C39500av.m126133a(this.f106757a.f106744f)).mo96485a("enter_method", this.f106757a.f106741c).f100112a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleEditAdapter$d */
    public static final class C41026d implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ SubtitleEditAdapter f106759a;

        /* renamed from: b */
        final /* synthetic */ SubtitleEditViewHolder f106760b;

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void afterTextChanged(Editable editable) {
            if (editable != null) {
                if (TextUtils.isEmpty(editable.toString())) {
                    int indexOf = this.f106759a.f106747i.indexOf(this.f106759a.f106746h.get(this.f106760b.getAdapterPosition()));
                    this.f106759a.f106740b.add(this.f106759a.f106747i.get(indexOf));
                    int i = indexOf + 1;
                    if (i < this.f106759a.f106747i.size()) {
                        this.f106759a.f106740b.add(this.f106759a.f106747i.get(i));
                    }
                } else if (this.f106760b.getAdapterPosition() != -1) {
                    if (this.f106760b.f106750a.getText().length() > 20) {
                        TextWatcher textWatcher = this;
                        this.f106760b.f106750a.removeTextChangedListener(textWatcher);
                        this.f106760b.f106750a.setText(SubtitleEditAdapter.m131103a(this.f106760b.f106750a.getText().toString(), 0, 20));
                        this.f106760b.f106750a.addTextChangedListener(textWatcher);
                    }
                    ((UtteranceWithWords) this.f106759a.f106746h.get(this.f106760b.getAdapterPosition())).setText(this.f106760b.f106750a.getText().toString());
                    int indexOf2 = this.f106759a.f106747i.indexOf(this.f106759a.f106746h.get(this.f106760b.getAdapterPosition()));
                    this.f106759a.f106740b.remove(this.f106759a.f106747i.get(indexOf2));
                    int i2 = indexOf2 + 1;
                    if (i2 < this.f106759a.f106747i.size()) {
                        this.f106759a.f106740b.remove(this.f106759a.f106747i.get(i2));
                    }
                }
            }
        }

        C41026d(SubtitleEditAdapter subtitleEditAdapter, SubtitleEditViewHolder subtitleEditViewHolder) {
            this.f106759a = subtitleEditAdapter;
            this.f106760b = subtitleEditViewHolder;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleEditAdapter$e */
    static final class C41027e implements OnEditorActionListener {

        /* renamed from: a */
        final /* synthetic */ SubtitleEditAdapter f106761a;

        /* renamed from: b */
        final /* synthetic */ UtteranceWithWords f106762b;

        /* renamed from: c */
        final /* synthetic */ SubtitleEditViewHolder f106763c;

        C41027e(SubtitleEditAdapter subtitleEditAdapter, UtteranceWithWords utteranceWithWords, SubtitleEditViewHolder subtitleEditViewHolder) {
            this.f106761a = subtitleEditAdapter;
            this.f106762b = utteranceWithWords;
            this.f106763c = subtitleEditViewHolder;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i == 4 || i == 6 || (keyEvent != null && keyEvent.getKeyCode() == 66 && keyEvent.getAction() == 0)) {
                C7573i.m23582a((Object) textView, "v");
                int selectionStart = textView.getSelectionStart();
                int length = this.f106762b.getText().length();
                if (selectionStart > 0 && length > selectionStart) {
                    String text = this.f106762b.getText();
                    if (text != null) {
                        String substring = text.substring(selectionStart, length);
                        C7573i.m23582a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        int endTime = this.f106762b.getEndTime();
                        UtteranceWithWords utteranceWithWords = this.f106762b;
                        String text2 = this.f106762b.getText();
                        if (text2 != null) {
                            String substring2 = text2.substring(0, selectionStart);
                            C7573i.m23582a((Object) substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            utteranceWithWords.setText(substring2);
                            this.f106762b.setEndTime(this.f106762b.getStartTime() + (((this.f106762b.getEndTime() - this.f106762b.getStartTime()) * this.f106762b.getText().length()) / length));
                            UtteranceWithWords utteranceWithWords2 = new UtteranceWithWords(this.f106762b.getEndTime() + 1, endTime, substring);
                            this.f106761a.f106746h.add(this.f106763c.getAdapterPosition() + 1, utteranceWithWords2);
                            int indexOf = this.f106761a.f106747i.indexOf(this.f106762b);
                            this.f106761a.f106747i.add(indexOf + 1, new UtteranceWithWords(this.f106762b.getEndTime() + 1, this.f106762b.getEndTime() - 1));
                            this.f106761a.f106747i.add(indexOf + 2, utteranceWithWords2);
                            this.f106761a.f106748j = this.f106763c.getAdapterPosition() + 1;
                            this.f106761a.notifyDataSetChanged();
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: a */
    public final List<UtteranceWithWords> mo101438a() {
        return this.f106740b;
    }

    /* renamed from: c */
    public final List<UtteranceWithWords> mo101442c() {
        return this.f106746h;
    }

    public final int getItemCount() {
        return this.f106746h.size();
    }

    /* renamed from: b */
    public final int mo101441b() {
        if (this.f106748j == -1) {
            return ((UtteranceWithWords) this.f106746h.get(0)).getStartTime();
        }
        return ((UtteranceWithWords) this.f106746h.get(this.f106748j)).getStartTime();
    }

    /* renamed from: a */
    public final void mo101439a(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.f106741c = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public SubtitleEditViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "p0");
        View inflate = LayoutInflater.from(this.f106742d).inflate(R.layout.ajx, viewGroup, false);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(cont…tle_edit_item, p0, false)");
        this.f106739a = inflate;
        View view = this.f106739a;
        if (view == null) {
            C7573i.m23583a("view");
        }
        return new SubtitleEditViewHolder(this, view);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(SubtitleEditViewHolder subtitleEditViewHolder, int i) {
        C7573i.m23587b(subtitleEditViewHolder, "p0");
        subtitleEditViewHolder.f106750a.setVisibility(0);
        subtitleEditViewHolder.f106750a.setText(((UtteranceWithWords) this.f106746h.get(i)).getText());
        subtitleEditViewHolder.f106750a.setOnFocusChangeListener(new C41023a(this, subtitleEditViewHolder));
        subtitleEditViewHolder.f106750a.setOnTouchListener(new C41024b(this, subtitleEditViewHolder));
        if (subtitleEditViewHolder.getAdapterPosition() != this.f106748j) {
            subtitleEditViewHolder.f106751b.setVisibility(4);
            subtitleEditViewHolder.itemView.setBackgroundResource(0);
            subtitleEditViewHolder.f106750a.setTextColor(this.f106742d.getResources().getColor(R.color.aza));
            subtitleEditViewHolder.f106750a.clearFocus();
        } else {
            subtitleEditViewHolder.f106750a.requestFocus();
            this.f106745g.mo101480a(subtitleEditViewHolder.f106750a);
        }
        Object obj = this.f106746h.get(subtitleEditViewHolder.getAdapterPosition());
        C7573i.m23582a(obj, "list.get(p0.adapterPosition)");
        UtteranceWithWords utteranceWithWords = (UtteranceWithWords) obj;
        C41541au.m132303a(subtitleEditViewHolder.f106751b, 0.75f);
        subtitleEditViewHolder.f106751b.setOnClickListener(new C41025c(this, utteranceWithWords));
        subtitleEditViewHolder.f106750a.addTextChangedListener(new C41026d(this, subtitleEditViewHolder));
        subtitleEditViewHolder.f106750a.setOnEditorActionListener(new C41027e(this, utteranceWithWords, subtitleEditViewHolder));
    }

    /* renamed from: a */
    public final void mo101440a(ArrayList<UtteranceWithWords> arrayList, ArrayList<UtteranceWithWords> arrayList2, int i) {
        C7573i.m23587b(arrayList, "list");
        C7573i.m23587b(arrayList2, "result");
        this.f106746h = arrayList;
        this.f106747i = arrayList2;
        this.f106748j = i;
        this.f106740b.clear();
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public static String m131103a(String str, int i, int i2) {
        int i3 = 19;
        if (!Character.isHighSurrogate(str.charAt(19))) {
            i3 = 20;
        }
        int i4 = i3 + 0;
        if (str != null) {
            String substring = str.substring(0, i4);
            C7573i.m23582a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    public SubtitleEditAdapter(SubtitleModule subtitleModule, ArrayList<UtteranceWithWords> arrayList, ArrayList<UtteranceWithWords> arrayList2, int i) {
        C7573i.m23587b(subtitleModule, "module");
        C7573i.m23587b(arrayList, "list");
        C7573i.m23587b(arrayList2, "result");
        this.f106745g = subtitleModule;
        this.f106746h = arrayList;
        this.f106747i = arrayList2;
        Activity activity = this.f106745g.f33526d_;
        if (activity != null) {
            this.f106742d = (FragmentActivity) activity;
            JediViewModel a = C36113b.m116288a(this.f106742d).mo91871a(EditViewModel.class);
            C7573i.m23582a((Object) a, "JediViewModelProviders.o…ditViewModel::class.java)");
            this.f106749k = (EditViewModel) a;
            this.f106743e = (C15389d) this.f106749k.mo106448i().getValue();
            this.f106744f = this.f106749k.mo29069f();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }
}
