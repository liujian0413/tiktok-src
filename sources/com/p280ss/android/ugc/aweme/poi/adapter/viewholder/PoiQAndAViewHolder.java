package com.p280ss.android.ugc.aweme.poi.adapter.viewholder;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.Guideline;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.C1642a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.feed.C28290d;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.PoiSetting;
import com.p280ss.android.ugc.aweme.music.p1409c.C33786f;
import com.p280ss.android.ugc.aweme.music.p1409c.C33786f.C33787a;
import com.p280ss.android.ugc.aweme.poi.PoiSimpleBundle;
import com.p280ss.android.ugc.aweme.poi.bean.C35069a;
import com.p280ss.android.ugc.aweme.poi.experiment.PoiQuestionPosExperiment;
import com.p280ss.android.ugc.aweme.poi.model.PoiAnswer;
import com.p280ss.android.ugc.aweme.poi.model.PoiQuestion;
import com.p280ss.android.ugc.aweme.poi.p1462b.C35061a;
import com.p280ss.android.ugc.aweme.poi.utils.C35454m;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetProxyTimeoutExperiment;
import com.taobao.android.dexposed.ClassUtils;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiQAndAViewHolder */
public final class PoiQAndAViewHolder extends C1293v {

    /* renamed from: c */
    public static final C35035a f91575c = new C35035a(null);

    /* renamed from: a */
    public final Context f91576a;

    /* renamed from: b */
    public final Guideline f91577b;

    /* renamed from: d */
    private final View f91578d;

    /* renamed from: e */
    private final DmtTextView f91579e;

    /* renamed from: f */
    private final ImageView f91580f;

    /* renamed from: g */
    private final ConstraintLayout f91581g;

    /* renamed from: h */
    private final DmtTextView f91582h;

    /* renamed from: i */
    private final DmtTextView f91583i;

    /* renamed from: j */
    private final DmtTextView f91584j;

    /* renamed from: k */
    private final DmtTextView f91585k;

    /* renamed from: l */
    private final ImageView f91586l;

    /* renamed from: m */
    private final ImageView f91587m;

    /* renamed from: n */
    private final LinearLayout f91588n;

    /* renamed from: o */
    private PoiQuestion f91589o;

    /* renamed from: p */
    private PoiSimpleBundle f91590p;

    /* renamed from: q */
    private long f91591q;

    /* renamed from: r */
    private C35061a f91592r;

    /* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiQAndAViewHolder$a */
    public static final class C35035a {
        private C35035a() {
        }

        public /* synthetic */ C35035a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiQAndAViewHolder$b */
    static final class C35036b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PoiQAndAViewHolder f91593a;

        C35036b(PoiQAndAViewHolder poiQAndAViewHolder) {
            this.f91593a = poiQAndAViewHolder;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            try {
                this.f91593a.mo88826a();
            } catch (NullValueException unused) {
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiQAndAViewHolder$c */
    static final class C35037c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LinearLayout f91594a;

        /* renamed from: b */
        final /* synthetic */ PoiQAndAViewHolder f91595b;

        /* renamed from: c */
        final /* synthetic */ PoiAnswer f91596c;

        /* renamed from: d */
        final /* synthetic */ String f91597d;

        C35037c(LinearLayout linearLayout, PoiQAndAViewHolder poiQAndAViewHolder, PoiAnswer poiAnswer, String str) {
            this.f91594a = linearLayout;
            this.f91595b = poiQAndAViewHolder;
            this.f91596c = poiAnswer;
            this.f91597d = str;
        }

        public final void run() {
            this.f91595b.f91577b.setGuidelineEnd((int) (((float) this.f91594a.getWidth()) + C9738o.m28708b(this.f91595b.f91576a, 12.0f)));
        }
    }

    /* renamed from: a */
    public final void mo88827a(C35069a aVar, PoiSimpleBundle poiSimpleBundle) {
        C7573i.m23587b(aVar, "poiDetailQuestion");
        if (this.f91589o == null) {
            this.f91590p = poiSimpleBundle;
            this.f91589o = aVar.f91720a;
            this.f91591q = aVar.f91721b;
            m113125c();
            if (this.f91591q <= 0 || this.f91589o == null) {
                m113129g();
            } else {
                m113126d();
            }
            this.itemView.setOnClickListener(new C35036b(this));
        }
    }

    /* renamed from: a */
    public final void mo88826a() throws NullValueException {
        PoiSimpleBundle poiSimpleBundle = this.f91590p;
        if (poiSimpleBundle != null) {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            PoiSetting poiSetting = a.getPoiSetting();
            C7573i.m23582a((Object) poiSetting, "SettingsReader.get().poiSetting");
            String poiQaListUrl = poiSetting.getPoiQaListUrl();
            boolean z = false;
            if (!TextUtils.isEmpty(poiSimpleBundle.getPoiCity())) {
                z = C7634n.m23717a(poiSimpleBundle.getPoiCity(), C28290d.m93043d(), true);
            }
            C7573i.m23582a((Object) poiQaListUrl, "qaListUrl");
            C33787a a2 = C33786f.m108941a(poiQaListUrl);
            String str = "poi_id";
            String poiId = poiSimpleBundle.getPoiId();
            if (poiId == null) {
                poiId = "";
            }
            C33787a a3 = a2.mo86195a(str, poiId).mo86195a("enter_from", "poi_page");
            String str2 = "group_id";
            String awemeId = poiSimpleBundle.getAwemeId();
            if (awemeId == null) {
                awemeId = "";
            }
            C33787a a4 = a3.mo86195a(str2, awemeId);
            String str3 = "poi_city";
            String poiCity = poiSimpleBundle.getPoiCity();
            if (poiCity == null) {
                poiCity = "";
            }
            C33787a a5 = a4.mo86195a(str3, poiCity).mo86195a("poi_device_samecity", z ? "1" : "0");
            String str4 = "poi_backend_type";
            String backendType = poiSimpleBundle.getBackendType();
            if (backendType == null) {
                backendType = "";
            }
            String uri = a5.mo86195a(str4, backendType).mo86194a().toString();
            C7573i.m23582a((Object) uri, "RnSchemeHelper.parseRnSc…      .build().toString()");
            C7195s.m22438a().mo18682a(uri);
        }
    }

    /* renamed from: g */
    private final void m113129g() {
        this.f91588n.setVisibility(0);
        this.f91581g.setVisibility(8);
        this.f91579e.setVisibility(8);
        this.f91580f.setVisibility(8);
    }

    /* renamed from: c */
    private final void m113125c() {
        if (C6384b.m19835a().mo15287a(PoiQuestionPosExperiment.class, true, "poi_question_answering_position", C6384b.m19835a().mo15295d().poi_question_answering_position, 0) == 0) {
            this.f91578d.setVisibility(8);
        } else {
            this.f91578d.setVisibility(0);
        }
    }

    /* renamed from: f */
    private final void m113128f() {
        this.f91587m.setVisibility(4);
        this.f91583i.setVisibility(8);
        this.f91585k.setVisibility(0);
        this.f91585k.setText(this.f91576a.getString(R.string.czb));
        View view = this.itemView;
        C7573i.m23582a((Object) view, "itemView");
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.bls);
        C7573i.m23582a((Object) linearLayout, "itemView.like_container");
        linearLayout.setVisibility(8);
    }

    /* renamed from: h */
    private final String m113130h() {
        List list;
        if (this.f91591q <= 0) {
            return "no_question";
        }
        PoiQuestion poiQuestion = this.f91589o;
        if (poiQuestion != null) {
            list = poiQuestion.getAnswers();
        } else {
            list = null;
        }
        if (C6307b.m19566a((Collection<T>) list)) {
            return "q_without_a";
        }
        return "q_with_a";
    }

    /* renamed from: d */
    private final void m113126d() {
        int i;
        PoiQuestion poiQuestion = this.f91589o;
        if (poiQuestion != null) {
            this.f91581g.setVisibility(0);
            this.f91588n.setVisibility(8);
            this.f91579e.setVisibility(0);
            this.f91580f.setVisibility(0);
            this.f91586l.setVisibility(0);
            this.f91582h.setVisibility(0);
            m113127e();
            this.f91582h.setText(poiQuestion.getContent());
            Integer followCount = poiQuestion.getFollowCount();
            if (followCount != null) {
                i = followCount.intValue();
            } else {
                i = -1;
            }
            m113120a(i);
            List answers = poiQuestion.getAnswers();
            if (poiQuestion.getAnswerAmounts() <= 0 || C6307b.m19566a((Collection<T>) answers)) {
                m113128f();
                return;
            }
            m113123a(poiQuestion, (PoiAnswer) answers.get(0));
        }
    }

    /* renamed from: e */
    private final void m113127e() {
        if (this.f91591q > 10000) {
            DmtTextView dmtTextView = this.f91579e;
            String string = this.f91576a.getString(R.string.czn);
            C7573i.m23582a((Object) string, "mContext.getString(R.string.poi_question_more)");
            String a = C1642a.m8034a(string, Arrays.copyOf(new Object[]{m113119a(this.f91591q, (int) VideoCacheTTnetProxyTimeoutExperiment.DEFAULT)}, 1));
            C7573i.m23582a((Object) a, "java.lang.String.format(format, *args)");
            dmtTextView.setText(a);
            return;
        }
        DmtTextView dmtTextView2 = this.f91579e;
        String string2 = this.f91576a.getString(R.string.czk);
        C7573i.m23582a((Object) string2, "mContext.getString(R.string.poi_question)");
        String a2 = C1642a.m8034a(string2, Arrays.copyOf(new Object[]{String.valueOf(this.f91591q)}, 1));
        C7573i.m23582a((Object) a2, "java.lang.String.format(format, *args)");
        dmtTextView2.setText(a2);
    }

    /* renamed from: b */
    public final void mo88828b() {
        String str;
        PoiSimpleBundle poiSimpleBundle = this.f91590p;
        String str2 = "poi_question_section_show";
        C22984d a = C22984d.m75611a().mo59973a("enter_from", "poi_page").mo59973a("content_type", m113130h());
        String str3 = "poi_id";
        PoiSimpleBundle poiSimpleBundle2 = this.f91590p;
        if (poiSimpleBundle2 != null) {
            str = poiSimpleBundle2.getPoiId();
        } else {
            str = null;
        }
        C35454m.m114523a(poiSimpleBundle, str2, a.mo59973a(str3, str));
        PoiQuestion poiQuestion = this.f91589o;
        if (poiQuestion != null) {
            if (this.f91591q > 0) {
                m113122a(poiQuestion);
            }
            if (poiQuestion.getAnswerAmounts() > 0 && !C6307b.m19566a((Collection<T>) poiQuestion.getAnswers())) {
                m113124a(poiQuestion, ((PoiAnswer) poiQuestion.getAnswers().get(0)).getAnswerId());
            }
        }
    }

    /* renamed from: a */
    private void m113122a(PoiQuestion poiQuestion) {
        String str;
        C7573i.m23587b(poiQuestion, "question");
        PoiSimpleBundle poiSimpleBundle = this.f91590p;
        String str2 = "poi_question_show";
        C22984d a = C22984d.m75611a().mo59973a("enter_from", "poi_page").mo59973a("author_id", poiQuestion.getUserId()).mo59973a("question_id", poiQuestion.getQuestionId());
        String str3 = "poi_id";
        PoiSimpleBundle poiSimpleBundle2 = this.f91590p;
        if (poiSimpleBundle2 != null) {
            str = poiSimpleBundle2.getPoiId();
        } else {
            str = null;
        }
        C35454m.m114523a(poiSimpleBundle, str2, a.mo59973a(str3, str));
    }

    public PoiQAndAViewHolder(View view) {
        C7573i.m23587b(view, "itemView");
        super(view);
        Context context = view.getContext();
        C7573i.m23582a((Object) context, "itemView.context");
        this.f91576a = context;
        View findViewById = view.findViewById(R.id.dm2);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.top_divider)");
        this.f91578d = findViewById;
        View findViewById2 = view.findViewById(R.id.cmm);
        C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.question_amounts)");
        this.f91579e = (DmtTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.cmo);
        C7573i.m23582a((Object) findViewById3, "itemView.findViewById(R.id.question_more_arrow)");
        this.f91580f = (ImageView) findViewById3;
        View findViewById4 = view.findViewById(R.id.wd);
        C7573i.m23582a((Object) findViewById4, "itemView.findViewById(R.id.cl_question_answering)");
        this.f91581g = (ConstraintLayout) findViewById4;
        View findViewById5 = view.findViewById(R.id.cfo);
        C7573i.m23582a((Object) findViewById5, "itemView.findViewById(R.id.poi_question)");
        this.f91582h = (DmtTextView) findViewById5;
        View findViewById6 = view.findViewById(R.id.cd1);
        C7573i.m23582a((Object) findViewById6, "itemView.findViewById(R.id.poi_answer)");
        this.f91583i = (DmtTextView) findViewById6;
        View findViewById7 = view.findViewById(R.id.cf1);
        C7573i.m23582a((Object) findViewById7, "itemView.findViewById(R.id.poi_follow_count)");
        this.f91584j = (DmtTextView) findViewById7;
        View findViewById8 = view.findViewById(R.id.cd2);
        C7573i.m23582a((Object) findViewById8, "itemView.findViewById(R.id.poi_answer_more)");
        this.f91585k = (DmtTextView) findViewById8;
        View findViewById9 = view.findViewById(R.id.ax8);
        C7573i.m23582a((Object) findViewById9, "itemView.findViewById(R.id.ic_question)");
        this.f91586l = (ImageView) findViewById9;
        View findViewById10 = view.findViewById(R.id.awx);
        C7573i.m23582a((Object) findViewById10, "itemView.findViewById(R.id.ic_answer)");
        this.f91587m = (ImageView) findViewById10;
        View findViewById11 = view.findViewById(R.id.atr);
        C7573i.m23582a((Object) findViewById11, "itemView.findViewById(R.id.guideline)");
        this.f91577b = (Guideline) findViewById11;
        View findViewById12 = view.findViewById(R.id.c4n);
        C7573i.m23582a((Object) findViewById12, "itemView.findViewById(R.id.no_question_layout)");
        this.f91588n = (LinearLayout) findViewById12;
    }

    /* renamed from: a */
    private final void m113120a(int i) {
        if (i <= 0) {
            this.f91584j.setVisibility(8);
            return;
        }
        this.f91584j.setVisibility(0);
        if (i > 10000) {
            DmtTextView dmtTextView = this.f91584j;
            String string = this.f91576a.getString(R.string.czm);
            C7573i.m23582a((Object) string, "mContext.getString(R.str…poi_question_follow_more)");
            String a = C1642a.m8034a(string, Arrays.copyOf(new Object[]{m113119a((long) i, (int) VideoCacheTTnetProxyTimeoutExperiment.DEFAULT)}, 1));
            C7573i.m23582a((Object) a, "java.lang.String.format(format, *args)");
            dmtTextView.setText(a);
            return;
        }
        DmtTextView dmtTextView2 = this.f91584j;
        String string2 = this.f91576a.getString(R.string.czl);
        C7573i.m23582a((Object) string2, "mContext.getString(R.string.poi_question_follow)");
        String a2 = C1642a.m8034a(string2, Arrays.copyOf(new Object[]{String.valueOf(i)}, 1));
        C7573i.m23582a((Object) a2, "java.lang.String.format(format, *args)");
        dmtTextView2.setText(a2);
    }

    /* renamed from: a */
    private static String m113119a(long j, int i) {
        String a = C1642a.m8034a("%.1f", Arrays.copyOf(new Object[]{Float.valueOf((((float) j) * 1.0f) / 10000.0f)}, 1));
        C7573i.m23582a((Object) a, "java.lang.String.format(format, *args)");
        if (C7634n.m23723c(a, "0", false)) {
            CharSequence charSequence = a;
            if (C7634n.m23730a(charSequence, ClassUtils.PACKAGE_SEPARATOR, 0, false, 6, (Object) null) != -1) {
                int a2 = C7634n.m23730a(charSequence, ClassUtils.PACKAGE_SEPARATOR, 0, false, 6, (Object) null);
                if (a != null) {
                    String substring = a.substring(0, a2);
                    C7573i.m23582a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    return substring;
                }
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (r1 != false) goto L_0x002a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0032  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m113121a(com.p280ss.android.ugc.aweme.poi.model.PoiAnswer r8, java.lang.String r9) {
        /*
            r7 = this;
            java.lang.Integer r0 = r8.getLikeAmounts()
            if (r0 == 0) goto L_0x006c
            r1 = r0
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.Boolean r2 = r8.isUserLike()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x002a
            if (r1 < 0) goto L_0x002a
            if (r1 != 0) goto L_0x0028
            java.lang.Boolean r1 = r8.isUserLike()
            if (r1 == 0) goto L_0x0024
            boolean r1 = r1.booleanValue()
            goto L_0x0025
        L_0x0024:
            r1 = 0
        L_0x0025:
            if (r1 == 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r1 = 0
            goto L_0x002b
        L_0x002a:
            r1 = 1
        L_0x002b:
            r2 = 0
            if (r1 != 0) goto L_0x002f
            goto L_0x0030
        L_0x002f:
            r0 = r2
        L_0x0030:
            if (r0 == 0) goto L_0x006c
            java.lang.Number r0 = (java.lang.Number) r0
            r0.intValue()
            android.view.View r0 = r7.itemView
            r1 = 2131299455(0x7f090c7f, float:1.8216912E38)
            android.view.View r0 = r0.findViewById(r1)
            java.lang.String r1 = "itemView.findViewById(R.id.like_container)"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            com.ss.android.ugc.aweme.poi.b.a r1 = new com.ss.android.ugc.aweme.poi.b.a
            r5 = r0
            android.view.View r5 = (android.view.View) r5
            com.ss.android.ugc.aweme.poi.PoiSimpleBundle r6 = r7.f91590p
            r1.<init>(r5, r8, r9, r6)
            r7.f91592r = r1
            int r1 = r0.getVisibility()
            if (r1 != 0) goto L_0x005a
            goto L_0x005b
        L_0x005a:
            r3 = 0
        L_0x005b:
            if (r3 == 0) goto L_0x005e
            r2 = r0
        L_0x005e:
            if (r2 == 0) goto L_0x006b
            com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiQAndAViewHolder$c r1 = new com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiQAndAViewHolder$c
            r1.<init>(r0, r7, r8, r9)
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r2.post(r1)
            goto L_0x006c
        L_0x006b:
            return
        L_0x006c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.poi.adapter.viewholder.PoiQAndAViewHolder.m113121a(com.ss.android.ugc.aweme.poi.model.PoiAnswer, java.lang.String):void");
    }

    /* renamed from: a */
    private final void m113123a(PoiQuestion poiQuestion, PoiAnswer poiAnswer) {
        this.f91587m.setVisibility(0);
        this.f91583i.setVisibility(0);
        this.f91583i.setText(poiAnswer.getContent());
        m113121a(poiAnswer, poiQuestion.getQuestionId());
        int answerAmounts = poiQuestion.getAnswerAmounts() - 1;
        if (answerAmounts > 0) {
            this.f91585k.setVisibility(0);
            if (answerAmounts > 10000) {
                DmtTextView dmtTextView = this.f91585k;
                String string = this.f91576a.getString(R.string.cxi);
                C7573i.m23582a((Object) string, "mContext.getString(R.string.poi_answer_more)");
                String a = C1642a.m8034a(string, Arrays.copyOf(new Object[]{m113119a((long) answerAmounts, (int) VideoCacheTTnetProxyTimeoutExperiment.DEFAULT)}, 1));
                C7573i.m23582a((Object) a, "java.lang.String.format(format, *args)");
                dmtTextView.setText(a);
                return;
            }
            DmtTextView dmtTextView2 = this.f91585k;
            String string2 = this.f91576a.getString(R.string.cxh);
            C7573i.m23582a((Object) string2, "mContext.getString(R.string.poi_answer)");
            String a2 = C1642a.m8034a(string2, Arrays.copyOf(new Object[]{String.valueOf(answerAmounts)}, 1));
            C7573i.m23582a((Object) a2, "java.lang.String.format(format, *args)");
            dmtTextView2.setText(a2);
        }
    }

    /* renamed from: a */
    private void m113124a(PoiQuestion poiQuestion, String str) {
        String str2;
        C7573i.m23587b(poiQuestion, "question");
        C7573i.m23587b(str, "answerId");
        PoiSimpleBundle poiSimpleBundle = this.f91590p;
        String str3 = "poi_answer_show";
        C22984d a = C22984d.m75611a().mo59973a("enter_from", "poi_page").mo59973a("author_id", poiQuestion.getUserId()).mo59973a("answer_id", str).mo59973a("question_id", poiQuestion.getQuestionId());
        String str4 = "poi_id";
        PoiSimpleBundle poiSimpleBundle2 = this.f91590p;
        if (poiSimpleBundle2 != null) {
            str2 = poiSimpleBundle2.getPoiId();
        } else {
            str2 = null;
        }
        C35454m.m114523a(poiSimpleBundle, str3, a.mo59973a(str4, str2));
    }
}
