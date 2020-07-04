package com.p280ss.android.ugc.aweme.base.p308ui.p1065a;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.base.ui.a.o */
public final class C23459o extends C23443b {

    /* renamed from: a */
    public final Activity f61908a;

    /* renamed from: b */
    public final String f61909b;

    /* renamed from: a */
    public final void mo59065a() {
    }

    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct] */
    /* JADX WARNING: type inference failed for: r3v10, types: [com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct] */
    /* JADX WARNING: type inference failed for: r3v11, types: [com.ss.android.ugc.aweme.feed.model.WikipediaInfo] */
    /* JADX WARNING: type inference failed for: r3v23, types: [com.ss.android.ugc.aweme.feed.model.WikipediaInfo] */
    /* JADX WARNING: type inference failed for: r3v24 */
    /* JADX WARNING: type inference failed for: r3v25 */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a3, code lost:
        if (r5 == null) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b4, code lost:
        if (r5 == null) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0136, code lost:
        if (r5 == null) goto L_0x0138;
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v0
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], com.ss.android.ugc.aweme.feed.model.WikipediaInfo, com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct]
      uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct, com.ss.android.ugc.aweme.feed.model.WikipediaInfo]
      mth insns count: 145
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e0  */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m77031e() {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f61858j
            r1 = 0
            if (r0 == 0) goto L_0x0016
            com.ss.android.ugc.aweme.feed.model.Anchor r0 = r0.getAnchor()
            if (r0 == 0) goto L_0x0016
            java.lang.Integer r0 = r0.getBusinessType()
            if (r0 == 0) goto L_0x0016
            int r0 = r0.intValue()
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            com.ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType r2 = com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType.WIKIPEDIA
            int r2 = r2.getTYPE()
            r3 = 0
            if (r0 != r2) goto L_0x00e0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f61858j
            if (r0 == 0) goto L_0x002e
            com.ss.android.ugc.aweme.feed.model.Anchor r0 = r0.getAnchor()
            if (r0 == 0) goto L_0x002e
            com.ss.android.ugc.aweme.feed.model.WikipediaInfo r3 = r0.getWikipediaInfo()
        L_0x002e:
            if (r3 == 0) goto L_0x00df
            java.lang.String r0 = r3.getLang()
            java.lang.String r2 = r3.getKeyword()
            r3 = r0
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x00de
            r3 = r2
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x004c
            goto L_0x00de
        L_0x004c:
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r3 = com.p280ss.android.ugc.aweme.global.config.settings.C30199h.m98861a()
            java.lang.String r4 = "SettingsReader.get()"
            kotlin.jvm.internal.C7573i.m23582a(r3, r4)
            java.lang.String r3 = r3.getWikipediaAnchorUrlPlaceholder()
            java.lang.String r4 = "SettingsReader.get().wikipediaAnchorUrlPlaceholder"
            kotlin.jvm.internal.C7573i.m23582a(r3, r4)
            r4 = 2
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r1] = r0
            r1 = 1
            r5[r1] = r2
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r5, r4)
            java.lang.String r1 = com.C1642a.m8034a(r3, r1)
            java.lang.String r3 = "java.lang.String.format(format, *args)"
            kotlin.jvm.internal.C7573i.m23582a(r1, r3)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.Map r3 = (java.util.Map) r3
            java.lang.String r4 = "title"
            if (r2 != 0) goto L_0x0081
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0081:
            r3.put(r4, r2)
            java.lang.String r4 = "close"
            java.lang.String r5 = "false"
            r3.put(r4, r5)
            java.lang.String r4 = "back"
            java.lang.String r5 = "true"
            r3.put(r4, r5)
            java.lang.String r4 = "hide_nav_bar"
            java.lang.String r5 = "false"
            r3.put(r4, r5)
            java.lang.String r4 = "author_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r6.f61858j
            if (r5 == 0) goto L_0x00a5
            java.lang.String r5 = r5.getAuthorUid()
            if (r5 != 0) goto L_0x00a7
        L_0x00a5:
            java.lang.String r5 = ""
        L_0x00a7:
            r3.put(r4, r5)
            java.lang.String r4 = "group_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r6.f61858j
            if (r5 == 0) goto L_0x00b6
            java.lang.String r5 = r5.getAid()
            if (r5 != 0) goto L_0x00b8
        L_0x00b6:
            java.lang.String r5 = ""
        L_0x00b8:
            r3.put(r4, r5)
            java.lang.String r4 = "wiki_entry"
            r3.put(r4, r2)
            java.lang.String r2 = "language"
            if (r0 != 0) goto L_0x00c7
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x00c7:
            r3.put(r2, r0)
            java.lang.String r0 = "enter_from"
            java.lang.String r2 = r6.f61909b
            if (r2 != 0) goto L_0x00d2
            java.lang.String r2 = ""
        L_0x00d2:
            r3.put(r0, r2)
            android.app.Activity r0 = r6.f61908a
            android.content.Context r0 = (android.content.Context) r0
            com.p280ss.android.ugc.aweme.wiki.AddWikiActivity.C43558a.m138079a(r0, r1, r3)
            goto L_0x016d
        L_0x00de:
            return
        L_0x00df:
            return
        L_0x00e0:
            com.ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType r1 = com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType.YELP
            int r1 = r1.getTYPE()
            if (r0 == r1) goto L_0x00f0
            com.ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType r1 = com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType.TRIP_ADVISOR
            int r1 = r1.getTYPE()
            if (r0 != r1) goto L_0x016d
        L_0x00f0:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r6.f61858j
            if (r1 == 0) goto L_0x00fe
            com.ss.android.ugc.aweme.feed.model.Anchor r1 = r1.getAnchor()
            if (r1 == 0) goto L_0x00fe
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r3 = r1.getAnchorInfo()
        L_0x00fe:
            if (r3 == 0) goto L_0x016d
            java.lang.String r1 = r3.getUrl()
            java.lang.String r2 = r3.getKeyword()
            r3 = r1
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x016c
            r3 = r2
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x011b
            goto L_0x016c
        L_0x011b:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.Map r3 = (java.util.Map) r3
            java.lang.String r4 = "title"
            if (r2 != 0) goto L_0x0129
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0129:
            r3.put(r4, r2)
            java.lang.String r4 = "author_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r6.f61858j
            if (r5 == 0) goto L_0x0138
            java.lang.String r5 = r5.getAuthorUid()
            if (r5 != 0) goto L_0x013a
        L_0x0138:
            java.lang.String r5 = ""
        L_0x013a:
            r3.put(r4, r5)
            java.lang.String r4 = "enter_from"
            java.lang.String r5 = r6.f61909b
            if (r5 != 0) goto L_0x0145
            java.lang.String r5 = ""
        L_0x0145:
            r3.put(r4, r5)
            java.lang.String r4 = "anchor_entry"
            r3.put(r4, r2)
            com.ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType r2 = com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType.YELP
            int r2 = r2.getTYPE()
            if (r0 != r2) goto L_0x0158
            java.lang.String r0 = "Yelp"
            goto L_0x015a
        L_0x0158:
            java.lang.String r0 = "TripAdvisor"
        L_0x015a:
            java.lang.String r2 = "anchor_type"
            r3.put(r2, r0)
            android.app.Activity r0 = r6.f61908a
            android.content.Context r0 = (android.content.Context) r0
            if (r1 != 0) goto L_0x0168
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0168:
            com.p280ss.android.ugc.aweme.wiki.AddWikiActivity.C43558a.m138079a(r0, r1, r3)
            return
        L_0x016c:
            return
        L_0x016d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.base.p308ui.p1065a.C23459o.m77031e():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0086 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a9  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo59068b() {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f61858j
            if (r0 == 0) goto L_0x0015
            com.ss.android.ugc.aweme.feed.model.Anchor r0 = r0.getAnchor()
            if (r0 == 0) goto L_0x0015
            java.lang.Integer r0 = r0.getBusinessType()
            if (r0 == 0) goto L_0x0015
            int r0 = r0.intValue()
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            com.ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType r1 = com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType.WIKIPEDIA
            int r1 = r1.getTYPE()
            r2 = 0
            if (r0 != r1) goto L_0x0087
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f61858j
            if (r0 == 0) goto L_0x002e
            com.ss.android.ugc.aweme.feed.model.Anchor r0 = r0.getAnchor()
            if (r0 == 0) goto L_0x002e
            com.ss.android.ugc.aweme.feed.model.WikipediaInfo r0 = r0.getWikipediaInfo()
            goto L_0x002f
        L_0x002e:
            r0 = r2
        L_0x002f:
            if (r0 == 0) goto L_0x0086
            java.lang.String r1 = r0.getLang()
            java.lang.String r0 = r0.getKeyword()
            java.lang.String r3 = "enter_wiki_detail"
            com.ss.android.ugc.aweme.app.g.d r4 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r5 = "enter_from"
            java.lang.String r6 = r7.f61909b
            if (r6 != 0) goto L_0x0047
            java.lang.String r6 = ""
        L_0x0047:
            com.ss.android.ugc.aweme.app.g.d r4 = r4.mo59973a(r5, r6)
            java.lang.String r5 = "language"
            com.ss.android.ugc.aweme.app.g.d r1 = r4.mo59973a(r5, r1)
            java.lang.String r4 = "wiki_entry"
            com.ss.android.ugc.aweme.app.g.d r0 = r1.mo59973a(r4, r0)
            java.lang.String r1 = "author_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r7.f61858j
            if (r4 == 0) goto L_0x0062
            java.lang.String r4 = r4.getAuthorUid()
            goto L_0x0063
        L_0x0062:
            r4 = r2
        L_0x0063:
            if (r4 != 0) goto L_0x0068
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0068:
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r1, r4)
            java.lang.String r1 = "group_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r7.f61858j
            if (r4 == 0) goto L_0x0076
            java.lang.String r2 = r4.getAid()
        L_0x0076:
            if (r2 != 0) goto L_0x007b
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x007b:
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r3, r0)
            goto L_0x0106
        L_0x0086:
            return
        L_0x0087:
            com.ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType r1 = com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType.YELP
            int r1 = r1.getTYPE()
            if (r0 == r1) goto L_0x0097
            com.ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType r1 = com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType.TRIP_ADVISOR
            int r1 = r1.getTYPE()
            if (r0 != r1) goto L_0x0106
        L_0x0097:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f61858j
            if (r1 == 0) goto L_0x00a6
            com.ss.android.ugc.aweme.feed.model.Anchor r1 = r1.getAnchor()
            if (r1 == 0) goto L_0x00a6
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r1 = r1.getAnchorInfo()
            goto L_0x00a7
        L_0x00a6:
            r1 = r2
        L_0x00a7:
            if (r1 == 0) goto L_0x0106
            java.lang.String r1 = r1.getKeyword()
            com.ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType r3 = com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType.YELP
            int r3 = r3.getTYPE()
            if (r0 != r3) goto L_0x00b8
            java.lang.String r0 = "Yelp"
            goto L_0x00ba
        L_0x00b8:
            java.lang.String r0 = "TripAdvisor"
        L_0x00ba:
            java.lang.String r3 = "enter_anchor_detail"
            com.ss.android.ugc.aweme.app.g.d r4 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r5 = "enter_from"
            java.lang.String r6 = r7.f61909b
            if (r6 != 0) goto L_0x00c8
            java.lang.String r6 = ""
        L_0x00c8:
            com.ss.android.ugc.aweme.app.g.d r4 = r4.mo59973a(r5, r6)
            java.lang.String r5 = "anchor_type"
            com.ss.android.ugc.aweme.app.g.d r0 = r4.mo59973a(r5, r0)
            java.lang.String r4 = "anchor_entry"
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r4, r1)
            java.lang.String r1 = "author_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r7.f61858j
            if (r4 == 0) goto L_0x00e3
            java.lang.String r4 = r4.getAuthorUid()
            goto L_0x00e4
        L_0x00e3:
            r4 = r2
        L_0x00e4:
            if (r4 != 0) goto L_0x00e9
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x00e9:
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r1, r4)
            java.lang.String r1 = "group_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r7.f61858j
            if (r4 == 0) goto L_0x00f7
            java.lang.String r2 = r4.getAid()
        L_0x00f7:
            if (r2 != 0) goto L_0x00fc
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x00fc:
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r3, r0)
            return
        L_0x0106:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.base.p308ui.p1065a.C23459o.mo59068b():void");
    }

    /* renamed from: a */
    public final void mo59066a(View view) {
        super.mo59066a(view);
        m77031e();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0042  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo59067a(com.p280ss.android.ugc.aweme.feed.model.Aweme r3, org.json.JSONObject r4) {
        /*
            r2 = this;
            super.mo59067a(r3, r4)
            if (r3 == 0) goto L_0x0016
            com.ss.android.ugc.aweme.feed.model.Anchor r4 = r3.getAnchor()
            if (r4 == 0) goto L_0x0016
            java.lang.Integer r4 = r4.getBusinessType()
            if (r4 == 0) goto L_0x0016
            int r4 = r4.intValue()
            goto L_0x0017
        L_0x0016:
            r4 = 0
        L_0x0017:
            com.ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType r0 = com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType.WIKIPEDIA
            int r0 = r0.getTYPE()
            r1 = 0
            if (r4 != r0) goto L_0x0042
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r4 = r2.f61851c
            r0 = 2131231810(0x7f080442, float:1.8079712E38)
            r4.setImageResource(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = r2.f61852d
            if (r3 == 0) goto L_0x003c
            com.ss.android.ugc.aweme.feed.model.Anchor r3 = r3.getAnchor()
            if (r3 == 0) goto L_0x003c
            com.ss.android.ugc.aweme.feed.model.WikipediaInfo r3 = r3.getWikipediaInfo()
            if (r3 == 0) goto L_0x003c
            java.lang.String r1 = r3.getKeyword()
        L_0x003c:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r4.setText(r1)
            return
        L_0x0042:
            com.ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType r0 = com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType.YELP
            int r0 = r0.getTYPE()
            if (r4 != r0) goto L_0x006c
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r4 = r2.f61851c
            r0 = 2131231812(0x7f080444, float:1.8079716E38)
            r4.setImageResource(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = r2.f61852d
            if (r3 == 0) goto L_0x0066
            com.ss.android.ugc.aweme.feed.model.Anchor r3 = r3.getAnchor()
            if (r3 == 0) goto L_0x0066
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r3 = r3.getAnchorInfo()
            if (r3 == 0) goto L_0x0066
            java.lang.String r1 = r3.getKeyword()
        L_0x0066:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r4.setText(r1)
            return
        L_0x006c:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r4 = r2.f61851c
            r0 = 2131231808(0x7f080440, float:1.8079707E38)
            r4.setImageResource(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = r2.f61852d
            if (r3 == 0) goto L_0x0088
            com.ss.android.ugc.aweme.feed.model.Anchor r3 = r3.getAnchor()
            if (r3 == 0) goto L_0x0088
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r3 = r3.getAnchorInfo()
            if (r3 == 0) goto L_0x0088
            java.lang.String r1 = r3.getKeyword()
        L_0x0088:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r4.setText(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.base.p308ui.p1065a.C23459o.mo59067a(com.ss.android.ugc.aweme.feed.model.Aweme, org.json.JSONObject):void");
    }

    public C23459o(ViewGroup viewGroup, Activity activity, String str) {
        C7573i.m23587b(viewGroup, "parent");
        C7573i.m23587b(activity, "activity");
        super(viewGroup);
        this.f61908a = activity;
        this.f61909b = str;
    }
}
