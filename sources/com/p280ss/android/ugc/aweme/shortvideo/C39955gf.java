package com.p280ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import android.content.Intent;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.content.C0683b;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Selection;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.common.base.C17439m;
import com.p1843tt.appbrandimpl.C46580d;
import com.p280ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p280ss.android.ugc.aweme.imported.C32066b;
import com.p280ss.android.ugc.aweme.imported.C32069e;
import com.p280ss.android.ugc.aweme.imported.C32071f;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.shortvideo.edit.MicroAppModel;
import com.p280ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import com.p280ss.android.ugc.aweme.shortvideo.p1579j.C40017a;
import com.p280ss.android.ugc.aweme.shortvideo.p1588r.C40257j;
import com.p280ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText;
import com.p280ss.android.ugc.aweme.utils.KeyBoardMonitor;
import com.p280ss.android.ugc.aweme.utils.KeyBoardMonitor.C42902a;
import com.p280ss.android.ugc.aweme.video.hashtag.C43226a;
import com.p280ss.android.ugc.aweme.video.hashtag.C43230c;
import com.p280ss.android.ugc.aweme.views.mention.MentionEditText.C43382c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.gf */
public final class C39955gf {

    /* renamed from: a */
    final Fragment f103765a;

    /* renamed from: b */
    public final HashTagMentionEditText f103766b;

    /* renamed from: c */
    final View f103767c;

    /* renamed from: d */
    final View f103768d;

    /* renamed from: e */
    final int f103769e;

    /* renamed from: f */
    final int f103770f;

    /* renamed from: g */
    public String f103771g = "";

    /* renamed from: h */
    public int f103772h;

    /* renamed from: i */
    final ArrayList<C38581cj> f103773i = new ArrayList<>();

    /* renamed from: j */
    private C32069e f103774j;

    /* renamed from: a */
    public final void mo99384a(List<AVChallenge> list) {
        if (!C6307b.m19566a((Collection<T>) list)) {
            this.f103766b.f112357j.clear();
            for (AVChallenge aVChallenge : list) {
                if (aVChallenge != null) {
                    String obj = this.f103766b.getText().toString();
                    StringBuilder sb = new StringBuilder("#");
                    sb.append(aVChallenge.getChallengeName());
                    sb.append(" ");
                    if (!obj.contains(sb.toString())) {
                        Set set = this.f103766b.f112357j;
                        StringBuilder sb2 = new StringBuilder("#");
                        sb2.append(aVChallenge.getChallengeName());
                        set.add(sb2.toString());
                        C43226a a = C43230c.m137136a(this.f103766b.getText().toString(), aVChallenge.getChallengeName());
                        if (a.f111898b <= m127825g()) {
                            this.f103766b.getText().insert(a.f111897a, a.f111899c);
                        }
                        this.f103766b.mo102272a(true);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo99385a(User user) {
        String str;
        if (!C6399b.m19946v()) {
            return this.f103766b.mo105248a(0, user.getNickname(), user.getUid());
        }
        HashTagMentionEditText hashTagMentionEditText = this.f103766b;
        if (TextUtils.isEmpty(user.getUniqueId())) {
            str = user.getShortId();
        } else {
            str = user.getUniqueId();
        }
        return hashTagMentionEditText.mo105248a(0, str, user.getUid());
    }

    /* renamed from: c */
    public final void mo99388c() {
        this.f103766b.mo105255e();
    }

    /* renamed from: d */
    public final String mo99390d() {
        return this.f103766b.getText().toString();
    }

    /* renamed from: e */
    public final List<AVTextExtraStruct> mo99391e() {
        return C40257j.m128619a(this.f103766b.getTextExtraStructListWithHashTag());
    }

    /* renamed from: b */
    public static void m127824b() {
        new C40017a().mo99455a("click_tag_button").mo99456a();
    }

    /* renamed from: g */
    public static int m127825g() {
        if (!C6399b.m19944t()) {
            return 55;
        }
        if (C35563c.f93247j.mo83123h() == 1) {
            return NormalGiftView.MASK_TRANSLATE_VALUE;
        }
        return 100;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final void mo99392f() {
        for (int i = 0; i < this.f103773i.size(); i++) {
            ((C38581cj) this.f103773i.get(i)).mo88367a(this);
        }
    }

    /* renamed from: a */
    public final void mo99377a() {
        int i;
        this.f103774j = new C32069e();
        this.f103774j.mo83034a((EditText) this.f103766b);
        if (this.f103767c != null) {
            if (C35563c.f93260w.mo57088a()) {
                this.f103767c.setVisibility(8);
            } else {
                this.f103767c.setVisibility(0);
            }
        }
        HashTagMentionEditText hashTagMentionEditText = this.f103766b;
        Context context = this.f103766b.getContext();
        if (C35563c.f93260w.mo57088a()) {
            i = R.color.a4z;
        } else {
            i = R.color.a4p;
        }
        hashTagMentionEditText.setMentionTextColor(C0683b.m2912c(context, i));
        this.f103766b.setOnMentionInputListener(new C43382c() {
            /* renamed from: a */
            public final void mo63208a() {
                if (!C35563c.f93260w.mo57088a()) {
                    C35563c.f93243f.mo83242a(C39955gf.this.f103765a, 3, "", C39955gf.this.f103769e);
                }
            }
        });
        if (this.f103767c != null && !C35563c.f93260w.mo57088a()) {
            this.f103767c.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    KeyboardUtils.m77056b(C39955gf.this.f103766b);
                    Editable text = C39955gf.this.f103766b.getText();
                    if (text.length() <= C39955gf.m127825g()) {
                        int selectionStart = Selection.getSelectionStart(text);
                        C39955gf.m127824b();
                        text.insert(selectionStart, "#");
                    }
                }
            });
        }
        if (this.f103768d != null) {
            this.f103768d.setOnClickListener(new OnClickListener() {
                /* JADX WARNING: type inference failed for: r0v0 */
                /* JADX WARNING: type inference failed for: r0v1, types: [org.json.JSONObject] */
                /* JADX WARNING: type inference failed for: r0v3, types: [org.json.JSONObject] */
                /* JADX WARNING: type inference failed for: r0v5, types: [android.os.Bundle] */
                /* JADX WARNING: type inference failed for: r0v6 */
                /* JADX WARNING: type inference failed for: r5v2, types: [android.os.Bundle] */
                /* JADX WARNING: type inference failed for: r0v7 */
                /* JADX WARNING: type inference failed for: r0v8 */
                /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v0
                  assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], android.os.Bundle, org.json.JSONObject]
                  uses: [org.json.JSONObject, ?[OBJECT, ARRAY]]
                  mth insns count: 44
                	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
                	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
                	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
                	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
                	at jadx.core.ProcessClass.process(ProcessClass.java:30)
                	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
                	at jadx.core.ProcessClass.process(ProcessClass.java:35)
                	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
                	at jadx.api.JavaClass.decompile(JavaClass.java:62)
                	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
                 */
                /* JADX WARNING: Unknown variable types count: 4 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void onClick(android.view.View r8) {
                    /*
                        r7 = this;
                        com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r8)
                        com.ss.android.ugc.aweme.account.d r8 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93260w
                        boolean r8 = r8.mo57090c()
                        r0 = 0
                        if (r8 != 0) goto L_0x003b
                        com.ss.android.ugc.aweme.shortvideo.gf r8 = com.p280ss.android.ugc.aweme.shortvideo.C39955gf.this
                        android.support.v4.app.Fragment r8 = r8.f103765a
                        r1 = 2131825773(0x7f11146d, float:1.9284412E38)
                        java.lang.String r8 = r8.getString(r1)
                        com.ss.android.ugc.aweme.account.d r1 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93260w
                        com.ss.android.ugc.aweme.shortvideo.gf r2 = com.p280ss.android.ugc.aweme.shortvideo.C39955gf.this
                        android.support.v4.app.Fragment r2 = r2.f103765a
                        java.lang.String r3 = ""
                        java.lang.String r4 = "click_at_friend"
                        boolean r5 = com.p280ss.android.ugc.aweme.i18n.C30538p.m99745a()
                        if (r5 == 0) goto L_0x0029
                    L_0x0027:
                        r5 = r0
                        goto L_0x0036
                    L_0x0029:
                        com.ss.android.ugc.aweme.utils.ab r0 = com.p280ss.android.ugc.aweme.utils.C42914ab.m136242a()
                        java.lang.String r5 = "login_title"
                        com.ss.android.ugc.aweme.utils.ab r8 = r0.mo104633a(r5, r8)
                        android.os.Bundle r0 = r8.f111445a
                        goto L_0x0027
                    L_0x0036:
                        r6 = 0
                        r1.mo57086a(r2, r3, r4, r5, r6)
                        return
                    L_0x003b:
                        com.ss.android.ugc.aweme.port.in.ap r8 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93243f
                        com.ss.android.ugc.aweme.shortvideo.gf r1 = com.p280ss.android.ugc.aweme.shortvideo.C39955gf.this
                        android.support.v4.app.Fragment r1 = r1.f103765a
                        r2 = 3
                        r8.mo83241a(r1, r2)
                        com.ss.android.ugc.aweme.shortvideo.gf r8 = com.p280ss.android.ugc.aweme.shortvideo.C39955gf.this
                        int r8 = r8.f103770f
                        if (r8 == 0) goto L_0x005c
                        com.ss.android.ugc.aweme.common.j r8 = new com.ss.android.ugc.aweme.common.j
                        r8.<init>()
                        java.lang.String r0 = "is_photo"
                        java.lang.String r1 = "1"
                        com.ss.android.ugc.aweme.common.j r8 = r8.mo16966a(r0, r1)
                        org.json.JSONObject r0 = r8.mo16967a()
                    L_0x005c:
                        com.ss.android.ugc.aweme.common.MobClick r8 = com.p280ss.android.ugc.aweme.common.MobClick.obtain()
                        java.lang.String r1 = "notify_friend"
                        com.ss.android.ugc.aweme.common.MobClick r8 = r8.setEventName(r1)
                        java.lang.String r1 = "edit_page"
                        com.ss.android.ugc.aweme.common.MobClick r8 = r8.setLabelName(r1)
                        com.ss.android.ugc.aweme.common.MobClick r8 = r8.setJsonObject(r0)
                        com.p280ss.android.ugc.aweme.common.C6907h.onEvent(r8)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.C39955gf.C399583.onClick(android.view.View):void");
                }
            });
        }
        this.f103766b.setFilters(new InputFilter[]{new C32066b(m127825g())});
        this.f103766b.addTextChangedListener(new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                int length = editable.length();
                if (length > 0) {
                    int i = length - 1;
                    if (editable.charAt(i) == 10) {
                        editable.delete(i, length);
                    }
                }
                C39955gf.this.mo99392f();
                Editable text = C39955gf.this.f103766b.getText();
                if (text.length() > C39955gf.m127825g()) {
                    int selectionEnd = Selection.getSelectionEnd(text);
                    C39955gf.this.f103766b.setText(text.toString().substring(0, C39955gf.m127825g()));
                    Editable text2 = C39955gf.this.f103766b.getText();
                    if (selectionEnd > text2.length()) {
                        selectionEnd = text2.length();
                    }
                    Selection.setSelection(text2, selectionEnd);
                    C10761a.m31409e(C39955gf.this.f103765a.getContext(), (int) R.string.fsq).mo25750a();
                }
            }
        });
    }

    /* renamed from: b */
    public final void mo99386b(String str) {
        this.f103766b.setText(str);
    }

    /* renamed from: c */
    public final void mo99389c(String str) {
        this.f103774j.mo83036b(str);
    }

    /* renamed from: a */
    public final void mo99378a(int i) {
        this.f103772h = i;
        if (this.f103766b != null) {
            this.f103766b.setVideoType(i);
        }
    }

    /* renamed from: a */
    public final void mo99379a(Intent intent) {
        User a = C35563c.f93243f.mo83240a(intent);
        if (a != null) {
            this.f103766b.mo105248a(0, C32071f.m104104a(a), a.getUid());
        }
    }

    /* renamed from: a */
    public final void mo99380a(C38581cj cjVar) {
        this.f103773i.add(C17439m.m57962a(cjVar));
    }

    /* renamed from: b */
    public final void mo99387b(List<AVTextExtraStruct> list) {
        this.f103766b.setAVTextExtraList(list);
        if (!C6311g.m19573a(list)) {
            for (AVTextExtraStruct aVTextExtraStruct : list) {
                StringBuilder sb = new StringBuilder("#");
                sb.append(aVTextExtraStruct.getHashTagName());
                String trim = sb.toString().trim();
                if (!C43230c.m137141b(trim, C6399b.m19944t())) {
                    this.f103766b.f112357j.add(trim);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo99381a(MicroAppModel microAppModel) {
        this.f103766b.f112357j.clear();
        if (microAppModel != null && !TextUtils.isEmpty(microAppModel.getExtra())) {
            C46580d dVar = (C46580d) C35563c.f93239b.mo15974a(microAppModel.getExtra(), C46580d.class);
            if (dVar != null && !C6307b.m19566a((Collection<T>) dVar.f120064a)) {
                for (String str : dVar.f120064a) {
                    Set set = this.f103766b.f112357j;
                    StringBuilder sb = new StringBuilder("#");
                    sb.append(str);
                    set.add(sb.toString());
                    C43226a a = C43230c.m137136a(this.f103766b.getText().toString(), str);
                    if (a.f111898b <= m127825g()) {
                        this.f103766b.getText().insert(a.f111897a, a.f111899c);
                    }
                    this.f103766b.mo102272a(true);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo99382a(C42902a aVar) {
        new KeyBoardMonitor(this.f103765a).mo104608a(this.f103766b, aVar);
    }

    /* renamed from: a */
    public final void mo99383a(String str) {
        this.f103771g = str;
        if (this.f103766b != null) {
            this.f103766b.setCreationId(str);
        }
    }

    /* renamed from: a */
    public static C39955gf m127822a(Fragment fragment, HashTagMentionEditText hashTagMentionEditText, View view, View view2, int i) {
        C39955gf gfVar = new C39955gf(fragment, hashTagMentionEditText, view, view2, 0, 0);
        return gfVar;
    }

    /* renamed from: b */
    public static C39955gf m127823b(Fragment fragment, HashTagMentionEditText hashTagMentionEditText, View view, View view2, int i) {
        C39955gf gfVar = new C39955gf(fragment, hashTagMentionEditText, view, view2, 0, 1);
        return gfVar;
    }

    private C39955gf(Fragment fragment, HashTagMentionEditText hashTagMentionEditText, View view, View view2, int i, int i2) {
        this.f103765a = fragment;
        this.f103766b = hashTagMentionEditText;
        this.f103767c = view;
        this.f103768d = view2;
        this.f103769e = i;
        this.f103770f = i2;
    }
}
