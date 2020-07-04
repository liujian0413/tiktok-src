package com.p280ss.android.ugc.aweme.feed.p1238ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.experiment.CaptionEnableSeeMoreExperiment;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28511z;
import com.p280ss.android.ugc.aweme.model.TextExtraStruct;
import com.p280ss.android.ugc.aweme.shortvideo.view.C41656f;
import com.p280ss.android.ugc.aweme.translation.C42616a;
import com.p280ss.android.ugc.aweme.translation.p1680a.C42618b;
import com.p280ss.android.ugc.aweme.translation.p1680a.C42620c;
import com.p280ss.android.ugc.aweme.translation.p1680a.C42621d;
import com.p280ss.android.ugc.aweme.translation.p1681b.C42622a;
import com.p280ss.android.ugc.aweme.translation.p1682ui.C42628a;
import com.p280ss.android.ugc.aweme.translation.p1682ui.TranslationStatusView;
import com.p280ss.android.ugc.aweme.translation.p1682ui.TranslationStatusView.C42626a;
import com.p280ss.android.ugc.aweme.views.MentionTextView;
import com.p280ss.android.ugc.aweme.views.MentionTextView.C43346d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.aw */
public final class C28818aw implements C42626a, C42628a {

    /* renamed from: a */
    public TranslationStatusView f75972a;

    /* renamed from: b */
    public MentionTextView f75973b;

    /* renamed from: c */
    public Aweme f75974c;

    /* renamed from: d */
    public C42622a f75975d;

    /* renamed from: e */
    public Context f75976e;

    /* renamed from: f */
    public String f75977f;

    /* renamed from: g */
    public int f75978g;

    /* renamed from: h */
    public int f75979h = -1;

    /* renamed from: i */
    public TextView f75980i;

    /* renamed from: j */
    public int f75981j;

    /* renamed from: k */
    public int f75982k;

    /* renamed from: l */
    public boolean f75983l = false;

    /* renamed from: m */
    private List<String> f75984m = new ArrayList();

    /* renamed from: a */
    public final void mo74050a(MentionTextView mentionTextView, String str, List<TextExtraStruct> list, int i) {
        final MentionTextView mentionTextView2 = mentionTextView;
        ObjectAnimator duration = ObjectAnimator.ofFloat(mentionTextView, "alpha", new float[]{0.0f}).setDuration(150);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(mentionTextView, "alpha", new float[]{0.0f, 1.0f}).setDuration(150);
        final String str2 = str;
        final List<TextExtraStruct> list2 = list;
        final int i2 = i;
        C288202 r0 = new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                mentionTextView2.setMaxLines(12);
                if (C6903bc.m21487f().mo84746a(C28818aw.this.f75974c)) {
                    C28818aw.this.mo74051a((CharSequence) C6903bc.m21487f().mo84743a(C28818aw.this.f75976e, str2, C28818aw.this.f75974c, C28818aw.this.f75977f, C28818aw.this.f75978g));
                } else {
                    C28818aw.this.mo74051a((CharSequence) str2);
                }
                mentionTextView2.mo105184a(list2, (C43346d) new C41656f(true));
                C28818aw.this.mo74049a(mentionTextView2, i2);
            }
        };
        duration.addListener(r0);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(new Animator[]{duration, duration2});
        animatorSet.start();
    }

    /* renamed from: a */
    public final void mo74051a(CharSequence charSequence) {
        try {
            this.f75973b.setText(charSequence);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo74052a(Exception exc) {
        this.f75972a.setStatus(0);
    }

    /* renamed from: a */
    public final void mo74053a(String str, int i) {
        this.f75977f = str;
        this.f75978g = i;
    }

    /* renamed from: a */
    public static int m94847a() {
        return C28511z.m93721b();
    }

    /* renamed from: b */
    private static boolean m94854b() {
        if (!C6399b.m19944t() || C6384b.m19835a().mo15287a(CaptionEnableSeeMoreExperiment.class, true, "caption_enable_see_more_mt", C6384b.m19835a().mo15295d().caption_enable_see_more_mt, 1) != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo74046a(int i) {
        this.f75979h = i;
    }

    /* renamed from: a */
    private String m94849a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (this.f75974c == null) {
            return "";
        }
        boolean[] zArr = new boolean[str.length()];
        if (this.f75974c.getTextExtra() != null) {
            for (TextExtraStruct textExtraStruct : this.f75974c.getTextExtra()) {
                for (int max = Math.max(0, textExtraStruct.getStart()); max < Math.min(str.length(), textExtraStruct.getEnd()); max++) {
                    zArr[max] = true;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (!zArr[i]) {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString().trim();
    }

    /* renamed from: a */
    public final void mo74048a(C42620c cVar) {
        String str;
        this.f75972a.setStatus(2);
        if (this.f75983l) {
            C6907h.m21524a("see_original_show", (Map) C22984d.m75611a().mo59973a("enter_from", this.f75977f).mo59973a("group_id", this.f75974c.getAid()).f60753a);
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        if (cVar.f110775a == null) {
            str = "";
        } else {
            str = cVar.f110775a;
        }
        sb.append(str);
        sb.append(" ");
        if (this.f75974c.getTextExtra() != null) {
            for (int i = 0; i < this.f75974c.getTextExtra().size(); i++) {
                TextExtraStruct textExtraStruct = (TextExtraStruct) this.f75974c.getTextExtra().get(i);
                String substring = this.f75974c.getDesc().substring(Math.min(Math.max(textExtraStruct.getStart(), 0), this.f75974c.getDesc().length()), Math.min(textExtraStruct.getEnd(), this.f75974c.getDesc().length()));
                TextExtraStruct clone = textExtraStruct.clone();
                clone.setStart(sb.length());
                clone.setEnd(clone.getStart() + substring.length());
                arrayList.add(clone);
                sb.append(substring);
                sb.append(" ");
            }
        }
        C42621d dVar = new C42621d();
        dVar.f110778b = 2;
        dVar.f110777a = sb.toString();
        dVar.f110779c = arrayList;
        C42616a.m135409a().mo104211a(this.f75974c.getAid(), dVar);
        mo74050a(this.f75973b, dVar.f110777a, dVar.f110779c, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x01dd A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01de  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo74047a(com.p280ss.android.ugc.aweme.feed.model.Aweme r20) {
        /*
            r19 = this;
            r6 = r19
            r0 = r20
            r6.f75974c = r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f75974c
            java.lang.String r2 = r0.getAid()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f75974c
            boolean r0 = r0.isAd()
            r1 = 8
            if (r0 != 0) goto L_0x0217
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0217
            boolean r0 = com.p280ss.android.ugc.aweme.utils.C43122ff.m136767b()
            if (r0 == 0) goto L_0x0024
            goto L_0x0217
        L_0x0024:
            com.ss.android.ugc.aweme.translation.ui.TranslationStatusView r0 = r6.f75972a
            r0.mo104220d()
            com.ss.android.ugc.aweme.translation.a r0 = com.p280ss.android.ugc.aweme.translation.C42616a.m135409a()
            com.ss.android.ugc.aweme.translation.a.d r7 = r0.mo104210a(r2)
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.language.I18nManagerService> r3 = com.p280ss.android.ugc.aweme.language.I18nManagerService.class
            java.lang.Object r0 = r0.getService(r3)
            com.ss.android.ugc.aweme.language.I18nManagerService r0 = (com.p280ss.android.ugc.aweme.language.I18nManagerService) r0
            java.lang.String r5 = r0.getAppLanguage()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f75974c
            java.lang.String r0 = r0.getDescLanguage()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0064
            java.lang.String r0 = "un"
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r6.f75974c
            java.lang.String r3 = r3.getDescLanguage()
            boolean r0 = android.text.TextUtils.equals(r0, r3)
            if (r0 == 0) goto L_0x005c
            goto L_0x0064
        L_0x005c:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f75974c
            java.lang.String r0 = r0.getDescLanguage()
        L_0x0062:
            r4 = r0
            goto L_0x007a
        L_0x0064:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f75974c
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            if (r0 != 0) goto L_0x006f
            java.lang.String r0 = ""
            goto L_0x0062
        L_0x006f:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f75974c
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            java.lang.String r0 = r0.getLanguage()
            goto L_0x0062
        L_0x007a:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f75974c
            java.lang.String r0 = r0.getDesc()
            java.lang.String r3 = r6.m94849a(r0)
            com.ss.android.ugc.aweme.app.SharePrefCache r0 = com.p280ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.bl r0 = r0.getUserAddLanguages()
            java.lang.Object r0 = r0.mo59877d()
            java.lang.String r0 = (java.lang.String) r0
            java.util.List<java.lang.String> r8 = r6.f75984m
            r8.clear()
            boolean r8 = android.text.TextUtils.isEmpty(r0)
            if (r8 != 0) goto L_0x00ac
            java.util.List<java.lang.String> r8 = r6.f75984m
            java.lang.String r9 = ","
            java.lang.String[] r0 = r0.split(r9)
            java.util.List r0 = java.util.Arrays.asList(r0)
            r8.addAll(r0)
        L_0x00ac:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r8 = "aid:"
            r0.<init>(r8)
            r0.append(r2)
            java.lang.String r8 = ",status:"
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            boolean r8 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            r9 = 1
            r10 = 0
            if (r8 == 0) goto L_0x00f7
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r6.f75974c
            java.util.List r8 = r8.getTextExtra()
            if (r8 == 0) goto L_0x00f7
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r6.f75974c
            java.util.List r8 = r8.getTextExtra()
            java.util.Iterator r8 = r8.iterator()
        L_0x00d9:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L_0x00f7
            java.lang.Object r11 = r8.next()
            com.ss.android.ugc.aweme.model.TextExtraStruct r11 = (com.p280ss.android.ugc.aweme.model.TextExtraStruct) r11
            int r12 = r11.getType()
            if (r12 != 0) goto L_0x00d9
            java.lang.String r11 = r11.getAwemeId()
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 != 0) goto L_0x00d9
            r8 = 1
            goto L_0x00f8
        L_0x00f7:
            r8 = 0
        L_0x00f8:
            r11 = -1
            r12 = 3
            if (r8 == 0) goto L_0x0118
            r6.f75979h = r11
            java.lang.String r8 = "VideoDescTranslation"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            java.lang.String r0 = "duet GONE"
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21552a(r12, r8, r0)
        L_0x0114:
            r10 = 8
            goto L_0x01d6
        L_0x0118:
            if (r7 != 0) goto L_0x019d
            boolean r8 = android.text.TextUtils.isEmpty(r3)
            if (r8 != 0) goto L_0x0183
            boolean r8 = android.text.TextUtils.isEmpty(r4)
            if (r8 != 0) goto L_0x0183
            boolean r8 = android.text.TextUtils.equals(r5, r4)
            if (r8 != 0) goto L_0x0183
            java.util.List<java.lang.String> r8 = r6.f75984m
            boolean r8 = m94852a(r4, r8)
            if (r8 != 0) goto L_0x0183
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r6.f75974c
            java.lang.String r8 = r8.getAuthorUid()
            com.ss.android.ugc.aweme.IAccountUserService r9 = com.p280ss.android.ugc.aweme.account.C6861a.m21337f()
            java.lang.String r9 = r9.getCurUserId()
            boolean r8 = android.text.TextUtils.equals(r8, r9)
            if (r8 == 0) goto L_0x0149
            goto L_0x0183
        L_0x0149:
            java.lang.String r8 = "VideoDescTranslation"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            java.lang.String r0 = "not trans VISIBLE"
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21552a(r12, r8, r0)
            com.bytedance.ies.abmock.b r13 = com.bytedance.ies.abmock.C6384b.m19835a()
            java.lang.Class<com.ss.android.ugc.aweme.feed.experiment.AutoTranslationExperiment> r14 = com.p280ss.android.ugc.aweme.feed.experiment.AutoTranslationExperiment.class
            r15 = 1
            java.lang.String r16 = "description_auto_translate"
            com.bytedance.ies.abmock.b r0 = com.bytedance.ies.abmock.C6384b.m19835a()
            com.bytedance.ies.abmock.ABModel r0 = r0.mo15295d()
            boolean r0 = r0.description_auto_translate
            r18 = 0
            r17 = r0
            boolean r0 = r13.mo15292a(r14, r15, r16, r17, r18)
            if (r0 != 0) goto L_0x017f
            r6.f75979h = r10
            goto L_0x01d6
        L_0x017f:
            r0 = -2
            r6.f75979h = r0
            goto L_0x01d6
        L_0x0183:
            r6.f75979h = r11
            java.lang.String r8 = "VideoDescTranslation"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            java.lang.String r0 = "not trans but condition true,so GONE"
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21552a(r12, r8, r0)
            goto L_0x0114
        L_0x019d:
            java.lang.String r8 = "VideoDescTranslation"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r0)
            java.lang.String r0 = "already trans VISIBLE"
            r11.append(r0)
            java.lang.String r0 = r11.toString()
            com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21552a(r12, r8, r0)
            com.ss.android.ugc.aweme.translation.ui.TranslationStatusView r0 = r6.f75972a
            int r8 = r7.f110778b
            r0.setStatus(r8)
            int r0 = r7.f110778b
            r6.f75979h = r0
            int r0 = r7.f110778b
            r8 = 2
            if (r0 != r8) goto L_0x01d6
            com.ss.android.ugc.aweme.views.MentionTextView r0 = r6.f75973b
            java.lang.String r8 = r7.f110777a
            r0.setText(r8)
            com.ss.android.ugc.aweme.views.MentionTextView r0 = r6.f75973b
            java.util.List<com.ss.android.ugc.aweme.model.TextExtraStruct> r8 = r7.f110779c
            com.ss.android.ugc.aweme.shortvideo.view.f r11 = new com.ss.android.ugc.aweme.shortvideo.view.f
            r11.<init>(r9)
            r0.mo105184a(r8, r11)
        L_0x01d6:
            com.ss.android.ugc.aweme.translation.ui.TranslationStatusView r0 = r6.f75972a
            r0.setVisibility(r10)
            if (r10 != r1) goto L_0x01de
            return
        L_0x01de:
            com.ss.android.ugc.aweme.translation.ui.TranslationStatusView r0 = r6.f75972a
            com.ss.android.ugc.aweme.feed.ui.ax r1 = new com.ss.android.ugc.aweme.feed.ui.ax
            r1.<init>(r6)
            r0.setmUploadMobListener(r1)
            com.ss.android.ugc.aweme.translation.ui.TranslationStatusView r8 = r6.f75972a
            com.ss.android.ugc.aweme.feed.ui.aw$1 r9 = new com.ss.android.ugc.aweme.feed.ui.aw$1
            r0 = r9
            r1 = r19
            r0.<init>(r2, r3, r4, r5)
            r8.setOnTranslationViewClickListener(r9)
            com.bytedance.ies.abmock.b r10 = com.bytedance.ies.abmock.C6384b.m19835a()
            java.lang.Class<com.ss.android.ugc.aweme.feed.experiment.AutoTranslationExperiment> r11 = com.p280ss.android.ugc.aweme.feed.experiment.AutoTranslationExperiment.class
            r12 = 1
            java.lang.String r13 = "description_auto_translate"
            com.bytedance.ies.abmock.b r0 = com.bytedance.ies.abmock.C6384b.m19835a()
            com.bytedance.ies.abmock.ABModel r0 = r0.mo15295d()
            boolean r14 = r0.description_auto_translate
            r15 = 0
            boolean r0 = r10.mo15292a(r11, r12, r13, r14, r15)
            if (r0 == 0) goto L_0x0216
            if (r7 != 0) goto L_0x0216
            com.ss.android.ugc.aweme.translation.ui.TranslationStatusView r0 = r6.f75972a
            r0.mo104218b()
        L_0x0216:
            return
        L_0x0217:
            com.ss.android.ugc.aweme.translation.ui.TranslationStatusView r0 = r6.f75972a
            r0.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feed.p1238ui.C28818aw.mo74047a(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo74054b(MentionTextView mentionTextView, int i) {
        this.f75982k = mentionTextView.getHeight();
        this.f75981j = (this.f75982k * i) / m94847a();
    }

    /* renamed from: a */
    private static boolean m94852a(String str, List<String> list) {
        return list.contains(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0192 A[SYNTHETIC, Splitter:B:54:0x0192] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x022c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo74049a(com.p280ss.android.ugc.aweme.views.MentionTextView r18, int r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = m94847a()
            r3 = 2131823088(0x7f1109f0, float:1.9278966E38)
            r4 = 4
            r5 = 2
            r6 = 0
            r7 = r19
            if (r7 != r5) goto L_0x004f
            boolean r5 = m94854b()
            if (r5 == 0) goto L_0x0041
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r0.f75974c
            java.lang.String r5 = r5.getDesc()
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r0.f75974c
            java.lang.CharSequence r7 = r7.getEllipsizeDesc()
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L_0x0041
            android.widget.TextView r4 = r0.f75980i
            r4.setVisibility(r6)
            android.widget.TextView r4 = r0.f75980i
            r4.setText(r3)
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r0.f75974c
            java.lang.CharSequence r3 = r3.getEllipsizeDesc()
            r0.mo74051a(r3)
            r1.setLines(r2)
            return
        L_0x0041:
            android.widget.TextView r2 = r0.f75980i
            r2.setVisibility(r4)
            com.ss.android.ugc.aweme.feed.ui.ay r2 = new com.ss.android.ugc.aweme.feed.ui.ay
            r2.<init>(r1)
            r1.post(r2)
            return
        L_0x004f:
            boolean r7 = m94854b()
            if (r7 == 0) goto L_0x0274
            int r7 = r18.getLineCount()
            if (r7 != 0) goto L_0x005d
            r7 = r2
            goto L_0x0061
        L_0x005d:
            int r7 = r18.getLineCount()
        L_0x0061:
            if (r7 <= r2) goto L_0x0266
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r0.f75974c
            java.lang.CharSequence r4 = r4.getTransDesc()
            if (r4 != 0) goto L_0x0243
            java.lang.CharSequence r4 = r18.getText()
            boolean r8 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            if (r8 == 0) goto L_0x008d
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = " "
            r8.<init>(r9)
            android.content.Context r9 = r0.f75976e
            r10 = 2131823087(0x7f1109ef, float:1.9278964E38)
            java.lang.String r9 = r9.getString(r10)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            goto L_0x0096
        L_0x008d:
            android.content.Context r8 = r0.f75976e
            r9 = 2131829399(0x7f112297, float:1.9291766E38)
            java.lang.String r8 = r8.getString(r9)
        L_0x0096:
            int r9 = r18.getHeight()
            r10 = 12
            if (r7 < r10) goto L_0x00b6
            r7 = 11
            android.text.Layout r10 = r18.getLayout()
            if (r10 == 0) goto L_0x00b6
            android.text.Layout r10 = r18.getLayout()
            r12 = 10
            int r10 = r10.getLineEnd(r12)
            java.lang.CharSequence r4 = r4.subSequence(r6, r10)
            r10 = 1
            goto L_0x00b7
        L_0x00b6:
            r10 = 0
        L_0x00b7:
            android.text.TextPaint r12 = r18.getPaint()
            float r8 = r12.measureText(r8)
            r12 = 0
            android.text.Layout r13 = r18.getLayout()
            if (r13 == 0) goto L_0x00e6
            int r12 = r18.getWidth()
            float r12 = (float) r12
            android.text.TextPaint r13 = r18.getPaint()
            android.text.Layout r14 = r18.getLayout()
            int r15 = r7 + -1
            int r14 = r14.getLineStart(r15)
            android.text.Layout r11 = r18.getLayout()
            int r11 = r11.getLineEnd(r15)
            float r11 = r13.measureText(r4, r14, r11)
            float r12 = r12 - r11
        L_0x00e6:
            int r8 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r8 >= 0) goto L_0x00f1
            int r8 = r9 / r7
            int r9 = r9 + r8
            int r7 = r7 + 1
            r8 = 1
            goto L_0x00f2
        L_0x00f1:
            r8 = 0
        L_0x00f2:
            com.ss.android.ugc.aweme.feed.model.Aweme r11 = r0.f75974c
            r11.setTransDescLines(r7)
            int r11 = r2 * r9
            int r11 = r11 / r7
            r0.f75982k = r11
            r0.f75981j = r9
            boolean r9 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            if (r9 == 0) goto L_0x0119
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r11 = "... "
            r9.<init>(r11)
            android.content.Context r11 = r0.f75976e
            java.lang.String r11 = r11.getString(r3)
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            goto L_0x0122
        L_0x0119:
            android.content.Context r9 = r0.f75976e
            r11 = 2131829398(0x7f112296, float:1.9291764E38)
            java.lang.String r9 = r9.getString(r11)
        L_0x0122:
            int r11 = r9.length()
            int r12 = r11 + 1
            android.text.Layout r13 = r18.getLayout()
            if (r13 == 0) goto L_0x0139
            android.text.Layout r5 = r18.getLayout()
            int r13 = r2 + -1
            int r5 = r5.getLineEnd(r13)
            goto L_0x013f
        L_0x0139:
            int r13 = r4.length()
            int r5 = r13 / 2
        L_0x013f:
            if (r5 < r12) goto L_0x0160
            int r12 = r5 - r12
            int r13 = r12 + 2
            java.lang.CharSequence r13 = r4.subSequence(r12, r13)
            java.lang.String r13 = r13.toString()
            boolean r14 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            boolean r13 = com.p280ss.android.ugc.aweme.video.hashtag.C43230c.m137142c(r13, r14)
            if (r13 == 0) goto L_0x0160
            int r5 = java.lang.Math.max(r6, r12)
            java.lang.CharSequence r5 = r4.subSequence(r6, r5)
            goto L_0x0173
        L_0x0160:
            boolean r12 = m94854b()
            if (r12 == 0) goto L_0x016a
            int r11 = r0.m94848a(r4, r9, r11, r5)
        L_0x016a:
            int r5 = r5 - r11
            int r5 = java.lang.Math.max(r6, r5)
            java.lang.CharSequence r5 = r4.subSequence(r6, r5)
        L_0x0173:
            android.text.SpannableStringBuilder r11 = new android.text.SpannableStringBuilder
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r5)
            java.lang.String r5 = "..."
            r12.append(r5)
            java.lang.String r5 = r12.toString()
            r11.<init>(r5)
            r0.mo74051a(r11)
            int r5 = r18.getLineCount()
            if (r5 != r2) goto L_0x021a
            android.text.Layout r5 = r18.getLayout()     // Catch:{ Exception -> 0x020e }
            int r12 = r2 + -1
            int r5 = r5.getLineEnd(r12)     // Catch:{ Exception -> 0x020e }
            int r13 = r18.getWidth()     // Catch:{ Exception -> 0x020e }
            float r13 = (float) r13     // Catch:{ Exception -> 0x020e }
            android.text.TextPaint r14 = r18.getPaint()     // Catch:{ Exception -> 0x020e }
            java.lang.CharSequence r15 = r18.getText()     // Catch:{ Exception -> 0x020e }
            android.text.Layout r3 = r18.getLayout()     // Catch:{ Exception -> 0x020e }
            int r3 = r3.getLineStart(r12)     // Catch:{ Exception -> 0x020e }
            float r3 = r14.measureText(r15, r3, r5)     // Catch:{ Exception -> 0x020e }
            float r13 = r13 - r3
            android.text.TextPaint r3 = r18.getPaint()     // Catch:{ Exception -> 0x020e }
            float r3 = r3.measureText(r9)     // Catch:{ Exception -> 0x020e }
            r14 = r5
            r5 = r11
        L_0x01c0:
            int r13 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r13 >= 0) goto L_0x020c
            int r13 = r9.length()     // Catch:{ Exception -> 0x020c }
            int r14 = r14 - r13
            java.lang.CharSequence r13 = r5.subSequence(r6, r14)     // Catch:{ Exception -> 0x020c }
            android.text.SpannableStringBuilder r5 = new android.text.SpannableStringBuilder     // Catch:{ Exception -> 0x020f }
            r5.<init>(r13)     // Catch:{ Exception -> 0x020f }
            java.lang.String r14 = "..."
            android.text.SpannableStringBuilder r5 = r5.append(r14)     // Catch:{ Exception -> 0x020f }
            r0.mo74051a(r5)     // Catch:{ Exception -> 0x020f }
            int r5 = r18.getLineCount()     // Catch:{ Exception -> 0x020f }
            if (r5 != r2) goto L_0x020f
            android.text.Layout r5 = r18.getLayout()     // Catch:{ Exception -> 0x020f }
            int r14 = r5.getLineEnd(r12)     // Catch:{ Exception -> 0x020f }
            int r5 = r18.getWidth()     // Catch:{ Exception -> 0x020f }
            float r5 = (float) r5     // Catch:{ Exception -> 0x020f }
            android.text.TextPaint r15 = r18.getPaint()     // Catch:{ Exception -> 0x020f }
            java.lang.CharSequence r6 = r18.getText()     // Catch:{ Exception -> 0x020f }
            r16 = r3
            android.text.Layout r3 = r18.getLayout()     // Catch:{ Exception -> 0x020f }
            int r3 = r3.getLineStart(r12)     // Catch:{ Exception -> 0x020f }
            float r3 = r15.measureText(r6, r3, r14)     // Catch:{ Exception -> 0x020f }
            float r3 = r5 - r3
            r5 = r13
            r6 = 0
            r13 = r3
            r3 = r16
            goto L_0x01c0
        L_0x020c:
            r13 = r5
            goto L_0x020f
        L_0x020e:
            r13 = r11
        L_0x020f:
            boolean r3 = r13.equals(r11)
            if (r3 != 0) goto L_0x021a
            android.text.SpannableStringBuilder r11 = new android.text.SpannableStringBuilder
            r11.<init>(r13)
        L_0x021a:
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
            android.text.SpannableString r4 = android.text.SpannableString.valueOf(r4)
            r3.<init>(r4)
            if (r8 == 0) goto L_0x022a
            java.lang.String r4 = "\n"
            r3.append(r4)
        L_0x022a:
            if (r10 == 0) goto L_0x0231
            java.lang.String r4 = "..."
            r3.append(r4)
        L_0x0231:
            r4 = 1
            r0.m94850a(r11, r3, r4)
            r4 = 0
            r0.m94850a(r3, r11, r4)
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r0.f75974c
            r4.setTransDesc(r3)
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r0.f75974c
            r3.setEllipsizeTransDesc(r11)
        L_0x0243:
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r0.f75974c
            java.lang.CharSequence r3 = r3.getEllipsizeTransDesc()
            r0.mo74051a(r3)
            r1.setLines(r2)
            com.ss.android.ugc.aweme.feed.ui.az r2 = new com.ss.android.ugc.aweme.feed.ui.az
            r2.<init>(r0, r1, r7)
            r1.post(r2)
            android.widget.TextView r1 = r0.f75980i
            r2 = 0
            r1.setVisibility(r2)
            android.widget.TextView r1 = r0.f75980i
            r2 = 2131823088(0x7f1109f0, float:1.9278966E38)
            r1.setText(r2)
            goto L_0x027c
        L_0x0266:
            com.ss.android.ugc.aweme.feed.ui.ba r2 = new com.ss.android.ugc.aweme.feed.ui.ba
            r2.<init>(r1)
            r1.post(r2)
            android.widget.TextView r1 = r0.f75980i
            r1.setVisibility(r4)
            return
        L_0x0274:
            android.widget.TextView r3 = r0.f75980i
            r3.setVisibility(r4)
            r1.setMaxLines(r2)
        L_0x027c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feed.p1238ui.C28818aw.mo74049a(com.ss.android.ugc.aweme.views.MentionTextView, int):void");
    }

    /* renamed from: a */
    private void m94850a(SpannableStringBuilder spannableStringBuilder, final SpannableStringBuilder spannableStringBuilder2, final boolean z) {
        spannableStringBuilder.setSpan(new ClickableSpan() {
            public final void updateDrawState(TextPaint textPaint) {
                textPaint.setColor(-1);
                textPaint.setUnderlineText(false);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ void mo74058a(ValueAnimator valueAnimator) {
                C28818aw.this.f75980i.setVisibility(0);
                C28818aw.this.f75980i.setHeight(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public final /* synthetic */ void mo74059b(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (intValue > 0) {
                    C28818aw.this.f75973b.setHeight(intValue);
                }
            }

            public final void onClick(View view) {
                ValueAnimator valueAnimator;
                C28818aw.this.mo74051a((CharSequence) spannableStringBuilder2);
                C28818aw.this.f75980i.setVisibility(0);
                if (z) {
                    valueAnimator = ValueAnimator.ofInt(new int[]{C28818aw.this.f75982k, C28818aw.this.f75981j});
                } else {
                    valueAnimator = ValueAnimator.ofInt(new int[]{C28818aw.this.f75981j, C28818aw.this.f75982k});
                }
                valueAnimator.addUpdateListener(new C28833bb(this));
                valueAnimator.addListener(new AnimatorListenerAdapter() {
                    /* access modifiers changed from: 0000 */
                    /* renamed from: a */
                    public final /* synthetic */ void mo74062a() {
                        C28818aw.this.f75973b.setLines(C28818aw.this.f75973b.getLineCount());
                    }

                    public final void onAnimationStart(Animator animator) {
                        if (z) {
                            C28818aw.this.f75980i.setText(R.string.b52);
                        } else {
                            C28818aw.this.f75980i.setText(R.string.b53);
                        }
                        C28818aw.this.f75980i.setVisibility(4);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        if (!z) {
                            C28818aw.this.f75973b.setLines(C28818aw.m94847a());
                        } else if (C28818aw.this.f75974c.getTransDescLines() != 0) {
                            C28818aw.this.f75973b.setLines(C28818aw.this.f75974c.getTransDescLines());
                        } else {
                            C28818aw.this.f75973b.post(new C28835bd(this));
                        }
                        C28818aw.this.f75980i.setVisibility(0);
                    }
                });
                ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, C28818aw.this.f75980i.getHeight()});
                ofInt.addUpdateListener(new C28834bc(this));
                ofInt.setDuration(100);
                ofInt.setStartDelay(150);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(new Animator[]{valueAnimator, ofInt});
                animatorSet.start();
            }
        }, 0, spannableStringBuilder.length(), 33);
    }

    public C28818aw(Context context, TranslationStatusView translationStatusView, MentionTextView mentionTextView, TextView textView) {
        this.f75976e = context;
        this.f75975d = new C42622a(new C42618b(), this);
        this.f75972a = translationStatusView;
        this.f75973b = mentionTextView;
        this.f75980i = textView;
    }

    /* renamed from: a */
    private int m94848a(CharSequence charSequence, String str, int i, int i2) {
        try {
            float measureText = this.f75973b.getPaint().measureText(str);
            int i3 = i;
            while (i3 >= 3) {
                if (this.f75973b.getPaint().measureText(charSequence, i2 - i3, i2) < measureText) {
                    return i3 + 1;
                }
                i3--;
            }
            return i3 + 1;
        } catch (Exception unused) {
            return i;
        }
    }
}
