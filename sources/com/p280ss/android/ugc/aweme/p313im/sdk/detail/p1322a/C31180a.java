package com.p280ss.android.ugc.aweme.p313im.sdk.detail.p1322a;

import android.content.res.Resources;
import android.widget.TextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p263im.core.model.Member;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.group.model.IMMember;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p320b.C31741e;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p320b.C7048a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31915n;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Comparator;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.a.a */
public final class C31180a {

    /* renamed from: a */
    public static final C31180a f81795a = new C31180a();

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.a.a$a */
    static final class C31181a<T> implements Comparator<IMMember> {

        /* renamed from: a */
        public static final C31181a f81796a = new C31181a();

        C31181a() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return m101628a((IMMember) obj, (IMMember) obj2);
        }

        /* renamed from: a */
        private static int m101628a(IMMember iMMember, IMMember iMMember2) {
            IMUser iMUser;
            IMUser iMUser2 = null;
            if (iMMember != null) {
                iMUser = iMMember.getUser();
            } else {
                iMUser = null;
            }
            if (iMMember2 != null) {
                iMUser2 = iMMember2.getUser();
            }
            if (iMUser == null && iMUser2 == null) {
                return 0;
            }
            if (iMUser != null && iMUser2 != null) {
                return Integer.compare(iMUser2.getSearchType(), iMUser.getSearchType());
            }
            if (iMUser == null) {
                return -1;
            }
            return 1;
        }
    }

    private C31180a() {
    }

    /* renamed from: a */
    private static void m101625a(TextView textView, IMMember iMMember) {
        textView.setVisibility(8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01c0, code lost:
        if (com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d.m21668a(r4, r6, r8, r1) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0213, code lost:
        if (com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d.m21671b(r4, r8) == false) goto L_0x0215;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0234, code lost:
        if (com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d.m21668a(r4, r6, r8, r1) != false) goto L_0x0236;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00d9, code lost:
        if (com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d.m21668a(r4, r6, r8, r1) != false) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x014c, code lost:
        if (com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d.m21668a(r4, r6, r8, r1) != false) goto L_0x014e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List<com.p280ss.android.ugc.aweme.p313im.sdk.chat.group.model.IMMember> m101624a(java.util.List<com.p280ss.android.ugc.aweme.p313im.sdk.chat.group.model.IMMember> r7, java.lang.String r8) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = r7
            java.util.Collection r1 = (java.util.Collection) r1
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0015
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r1 = 0
            goto L_0x0016
        L_0x0015:
            r1 = 1
        L_0x0016:
            if (r1 != 0) goto L_0x02a9
            r1 = r8
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            if (r1 == 0) goto L_0x0026
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0024
            goto L_0x0026
        L_0x0024:
            r1 = 0
            goto L_0x0027
        L_0x0026:
            r1 = 1
        L_0x0027:
            if (r1 != 0) goto L_0x02a9
            int r1 = r8.length()
        L_0x002d:
            if (r2 >= r1) goto L_0x0059
            char r4 = r8.charAt(r2)
            boolean r4 = com.p280ss.android.ugc.aweme.p313im.sdk.relations.p320b.C7048a.m21926a(r4)
            if (r4 == 0) goto L_0x0056
            java.lang.String r1 = com.p280ss.android.ugc.aweme.p313im.sdk.relations.p320b.C7048a.m21930c(r8)
            java.lang.String r2 = "CharacterUtil.hanziToPinyin(keyWord)"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            if (r1 == 0) goto L_0x004e
            java.lang.String r1 = r1.toLowerCase()
            java.lang.String r2 = "(this as java.lang.String).toLowerCase()"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            goto L_0x005a
        L_0x004e:
            kotlin.TypeCastException r7 = new kotlin.TypeCastException
            java.lang.String r8 = "null cannot be cast to non-null type java.lang.String"
            r7.<init>(r8)
            throw r7
        L_0x0056:
            int r2 = r2 + 1
            goto L_0x002d
        L_0x0059:
            r1 = r8
        L_0x005a:
            if (r8 == 0) goto L_0x02a1
            java.lang.String r8 = r8.toLowerCase()
            java.lang.String r2 = "(this as java.lang.String).toLowerCase()"
            kotlin.jvm.internal.C7573i.m23582a(r8, r2)
            java.util.Iterator r7 = r7.iterator()
        L_0x0069:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x02a9
            java.lang.Object r2 = r7.next()
            com.ss.android.ugc.aweme.im.sdk.chat.group.model.IMMember r2 = (com.p280ss.android.ugc.aweme.p313im.sdk.chat.group.model.IMMember) r2
            com.ss.android.ugc.aweme.im.service.model.IMUser r4 = r2.getUser()
            r5 = 0
            if (r4 == 0) goto L_0x0081
            java.lang.String r4 = r4.getRemarkName()
            goto L_0x0082
        L_0x0081:
            r4 = r5
        L_0x0082:
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x00e9
            com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d.m21657a()
            com.ss.android.ugc.aweme.im.service.model.IMUser r4 = r2.getUser()
            if (r4 == 0) goto L_0x0098
            java.lang.String r4 = r4.getRemarkName()
            goto L_0x0099
        L_0x0098:
            r4 = r5
        L_0x0099:
            boolean r4 = com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d.m21671b(r4, r8)
            if (r4 != 0) goto L_0x00db
            boolean r4 = com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31915n.m103671a()
            if (r4 != 0) goto L_0x00e9
            com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d.m21657a()
            com.ss.android.ugc.aweme.im.service.model.IMUser r4 = r2.getUser()
            if (r4 == 0) goto L_0x00b3
            java.lang.String r4 = r4.getRemarkInitial()
            goto L_0x00b4
        L_0x00b3:
            r4 = r5
        L_0x00b4:
            boolean r4 = com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d.m21671b(r4, r8)
            if (r4 != 0) goto L_0x00db
            com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d.m21657a()
            com.ss.android.ugc.aweme.im.service.model.IMUser r4 = r2.getUser()
            if (r4 == 0) goto L_0x00c8
            java.lang.String r4 = r4.getRemarkName()
            goto L_0x00c9
        L_0x00c8:
            r4 = r5
        L_0x00c9:
            com.ss.android.ugc.aweme.im.service.model.IMUser r6 = r2.getUser()
            if (r6 == 0) goto L_0x00d4
            java.lang.String r6 = r6.getRemarkPinyin()
            goto L_0x00d5
        L_0x00d4:
            r6 = r5
        L_0x00d5:
            boolean r4 = com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d.m21668a(r4, r6, r8, r1)
            if (r4 == 0) goto L_0x00e9
        L_0x00db:
            com.ss.android.ugc.aweme.im.service.model.IMUser r4 = r2.getUser()
            if (r4 == 0) goto L_0x00e5
            r5 = 5
            r4.setSearchType(r5)
        L_0x00e5:
            r0.add(r2)
            goto L_0x0069
        L_0x00e9:
            com.bytedance.im.core.model.Member r4 = r2.getMember()
            if (r4 == 0) goto L_0x00f4
            java.lang.String r4 = r4.getAlias()
            goto L_0x00f5
        L_0x00f4:
            r4 = r5
        L_0x00f5:
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x015d
            com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d.m21657a()
            com.bytedance.im.core.model.Member r4 = r2.getMember()
            if (r4 == 0) goto L_0x010b
            java.lang.String r4 = r4.getAlias()
            goto L_0x010c
        L_0x010b:
            r4 = r5
        L_0x010c:
            boolean r4 = com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d.m21671b(r4, r8)
            if (r4 != 0) goto L_0x014e
            boolean r4 = com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31915n.m103671a()
            if (r4 != 0) goto L_0x015d
            com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d.m21657a()
            com.bytedance.im.core.model.Member r4 = r2.getMember()
            if (r4 == 0) goto L_0x0126
            java.lang.String r4 = r4.getAlias()
            goto L_0x0127
        L_0x0126:
            r4 = r5
        L_0x0127:
            boolean r4 = com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d.m21671b(r4, r8)
            if (r4 != 0) goto L_0x014e
            com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d.m21657a()
            com.bytedance.im.core.model.Member r4 = r2.getMember()
            if (r4 == 0) goto L_0x013b
            java.lang.String r4 = r4.getAlias()
            goto L_0x013c
        L_0x013b:
            r4 = r5
        L_0x013c:
            com.bytedance.im.core.model.Member r6 = r2.getMember()
            if (r6 == 0) goto L_0x0147
            java.lang.String r6 = r6.getAlias()
            goto L_0x0148
        L_0x0147:
            r6 = r5
        L_0x0148:
            boolean r4 = com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d.m21668a(r4, r6, r8, r1)
            if (r4 == 0) goto L_0x015d
        L_0x014e:
            com.ss.android.ugc.aweme.im.service.model.IMUser r4 = r2.getUser()
            if (r4 == 0) goto L_0x0158
            r5 = 4
            r4.setSearchType(r5)
        L_0x0158:
            r0.add(r2)
            goto L_0x0069
        L_0x015d:
            com.ss.android.ugc.aweme.im.service.model.IMUser r4 = r2.getUser()
            if (r4 == 0) goto L_0x0168
            java.lang.String r4 = r4.getNickName()
            goto L_0x0169
        L_0x0168:
            r4 = r5
        L_0x0169:
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x01d1
            com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d.m21657a()
            com.ss.android.ugc.aweme.im.service.model.IMUser r4 = r2.getUser()
            if (r4 == 0) goto L_0x017f
            java.lang.String r4 = r4.getNickName()
            goto L_0x0180
        L_0x017f:
            r4 = r5
        L_0x0180:
            boolean r4 = com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d.m21671b(r4, r8)
            if (r4 != 0) goto L_0x01c2
            boolean r4 = com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31915n.m103671a()
            if (r4 != 0) goto L_0x01d1
            com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d.m21657a()
            com.ss.android.ugc.aweme.im.service.model.IMUser r4 = r2.getUser()
            if (r4 == 0) goto L_0x019a
            java.lang.String r4 = r4.getNickNameInitial()
            goto L_0x019b
        L_0x019a:
            r4 = r5
        L_0x019b:
            boolean r4 = com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d.m21671b(r4, r8)
            if (r4 != 0) goto L_0x01c2
            com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d.m21657a()
            com.ss.android.ugc.aweme.im.service.model.IMUser r4 = r2.getUser()
            if (r4 == 0) goto L_0x01af
            java.lang.String r4 = r4.getNickName()
            goto L_0x01b0
        L_0x01af:
            r4 = r5
        L_0x01b0:
            com.ss.android.ugc.aweme.im.service.model.IMUser r6 = r2.getUser()
            if (r6 == 0) goto L_0x01bb
            java.lang.String r6 = r6.getNickNamePinyin()
            goto L_0x01bc
        L_0x01bb:
            r6 = r5
        L_0x01bc:
            boolean r4 = com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d.m21668a(r4, r6, r8, r1)
            if (r4 == 0) goto L_0x01d1
        L_0x01c2:
            com.ss.android.ugc.aweme.im.service.model.IMUser r4 = r2.getUser()
            if (r4 == 0) goto L_0x01cc
            r5 = 3
            r4.setSearchType(r5)
        L_0x01cc:
            r0.add(r2)
            goto L_0x0069
        L_0x01d1:
            com.ss.android.ugc.aweme.im.service.model.IMUser r4 = r2.getUser()
            if (r4 == 0) goto L_0x01dc
            java.lang.String r4 = r4.getContactName()
            goto L_0x01dd
        L_0x01dc:
            r4 = r5
        L_0x01dd:
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x0245
            com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d.m21657a()
            com.ss.android.ugc.aweme.im.service.model.IMUser r4 = r2.getUser()
            if (r4 == 0) goto L_0x01f3
            java.lang.String r4 = r4.getContactName()
            goto L_0x01f4
        L_0x01f3:
            r4 = r5
        L_0x01f4:
            boolean r4 = com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d.m21671b(r4, r8)
            if (r4 != 0) goto L_0x0236
            boolean r4 = com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31915n.m103671a()
            if (r4 != 0) goto L_0x0215
            com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d.m21657a()
            com.ss.android.ugc.aweme.im.service.model.IMUser r4 = r2.getUser()
            if (r4 == 0) goto L_0x020e
            java.lang.String r4 = r4.getContactNameInitial()
            goto L_0x020f
        L_0x020e:
            r4 = r5
        L_0x020f:
            boolean r4 = com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d.m21671b(r4, r8)
            if (r4 != 0) goto L_0x0236
        L_0x0215:
            com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d.m21657a()
            com.ss.android.ugc.aweme.im.service.model.IMUser r4 = r2.getUser()
            if (r4 == 0) goto L_0x0223
            java.lang.String r4 = r4.getContactName()
            goto L_0x0224
        L_0x0223:
            r4 = r5
        L_0x0224:
            com.ss.android.ugc.aweme.im.service.model.IMUser r6 = r2.getUser()
            if (r6 == 0) goto L_0x022f
            java.lang.String r6 = r6.getContactNamePinyin()
            goto L_0x0230
        L_0x022f:
            r6 = r5
        L_0x0230:
            boolean r4 = com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d.m21668a(r4, r6, r8, r1)
            if (r4 == 0) goto L_0x0245
        L_0x0236:
            com.ss.android.ugc.aweme.im.service.model.IMUser r4 = r2.getUser()
            if (r4 == 0) goto L_0x0240
            r5 = 2
            r4.setSearchType(r5)
        L_0x0240:
            r0.add(r2)
            goto L_0x0069
        L_0x0245:
            boolean r4 = com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31915n.m103672b()
            if (r4 != 0) goto L_0x0069
            com.ss.android.ugc.aweme.im.service.model.IMUser r4 = r2.getUser()
            if (r4 == 0) goto L_0x0256
            java.lang.String r4 = r4.getUniqueId()
            goto L_0x0257
        L_0x0256:
            r4 = r5
        L_0x0257:
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x0280
            com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d.m21657a()
            com.ss.android.ugc.aweme.im.service.model.IMUser r4 = r2.getUser()
            if (r4 == 0) goto L_0x026c
            java.lang.String r5 = r4.getUniqueId()
        L_0x026c:
            boolean r4 = com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d.m21671b(r5, r8)
            if (r4 == 0) goto L_0x0069
            com.ss.android.ugc.aweme.im.service.model.IMUser r4 = r2.getUser()
            if (r4 == 0) goto L_0x027b
            r4.setSearchType(r3)
        L_0x027b:
            r0.add(r2)
            goto L_0x0069
        L_0x0280:
            com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d.m21657a()
            com.ss.android.ugc.aweme.im.service.model.IMUser r4 = r2.getUser()
            if (r4 == 0) goto L_0x028d
            java.lang.String r5 = r4.getShortId()
        L_0x028d:
            boolean r4 = com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d.m21671b(r5, r8)
            if (r4 == 0) goto L_0x0069
            com.ss.android.ugc.aweme.im.service.model.IMUser r4 = r2.getUser()
            if (r4 == 0) goto L_0x029c
            r4.setSearchType(r3)
        L_0x029c:
            r0.add(r2)
            goto L_0x0069
        L_0x02a1:
            kotlin.TypeCastException r7 = new kotlin.TypeCastException
            java.lang.String r8 = "null cannot be cast to non-null type java.lang.String"
            r7.<init>(r8)
            throw r7
        L_0x02a9:
            boolean r7 = com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31915n.m103672b()
            if (r7 != 0) goto L_0x02c3
            r7 = r0
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r7 = r7.isEmpty()
            r7 = r7 ^ r3
            if (r7 == 0) goto L_0x02c3
            r7 = r0
            java.util.List r7 = (java.util.List) r7
            com.ss.android.ugc.aweme.im.sdk.detail.a.a$a r8 = com.p280ss.android.ugc.aweme.p313im.sdk.detail.p1322a.C31180a.C31181a.f81796a
            java.util.Comparator r8 = (java.util.Comparator) r8
            kotlin.collections.C7525m.m23474a(r7, r8)
        L_0x02c3:
            java.util.List r0 = (java.util.List) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.detail.p1322a.C31180a.m101624a(java.util.List, java.lang.String):java.util.List");
    }

    /* renamed from: a */
    public static void m101626a(TextView textView, IMMember iMMember, String str) {
        boolean z;
        CharSequence charSequence;
        CharSequence charSequence2;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        C7573i.m23587b(textView, "textView");
        C7573i.m23587b(iMMember, "imMember");
        C7573i.m23587b(str, POIService.KEY_KEYWORD);
        CharSequence charSequence3 = str;
        boolean z2 = true;
        if (charSequence3.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            textView.setText(iMMember.getMemberDisplayName());
            return;
        }
        String str8 = null;
        if (!C31915n.m103671a()) {
            IMUser user = iMMember.getUser();
            if (user == null || user.getSearchType() != 5) {
                IMUser user2 = iMMember.getUser();
                if (user2 == null || user2.getSearchType() != 4) {
                    IMUser user3 = iMMember.getUser();
                    if (user3 != null && user3.getSearchType() == 3) {
                        IMUser user4 = iMMember.getUser();
                        if (user4 != null) {
                            str4 = user4.getNickName();
                        } else {
                            str4 = null;
                        }
                        IMUser user5 = iMMember.getUser();
                        if (user5 != null) {
                            str5 = user5.getNickNamePinyin();
                        } else {
                            str5 = null;
                        }
                        IMUser user6 = iMMember.getUser();
                        if (user6 != null) {
                            str8 = user6.getNickNameInitial();
                        }
                        str = C7048a.m21924a(str4, str5, str8, str);
                        C7573i.m23582a((Object) str, "CharacterUtil.convertPin…nitial, highLightKeyword)");
                    }
                } else {
                    Member member = iMMember.getMember();
                    if (member != null) {
                        str8 = member.getAlias();
                    }
                    str = C7048a.m21924a(str8, iMMember.getAliasPinyin(), iMMember.getAliasInitial(), str);
                    C7573i.m23582a((Object) str, "CharacterUtil.convertPin…nitial, highLightKeyword)");
                }
            } else {
                IMUser user7 = iMMember.getUser();
                if (user7 != null) {
                    str6 = user7.getRemarkName();
                } else {
                    str6 = null;
                }
                IMUser user8 = iMMember.getUser();
                if (user8 != null) {
                    str7 = user8.getRemarkPinyin();
                } else {
                    str7 = null;
                }
                IMUser user9 = iMMember.getUser();
                if (user9 != null) {
                    str8 = user9.getRemarkInitial();
                }
                str = C7048a.m21924a(str6, str7, str8, str);
                C7573i.m23582a((Object) str, "CharacterUtil.convertPin…nitial, highLightKeyword)");
            }
        } else {
            IMUser user10 = iMMember.getUser();
            if (user10 != null) {
                charSequence = user10.getNickName();
            } else {
                charSequence = null;
            }
            CharSequence charSequence4 = charSequence;
            if (!(charSequence4 == null || charSequence4.length() == 0)) {
                z2 = false;
            }
            if (!z2) {
                IMUser user11 = iMMember.getUser();
                if (user11 != null) {
                    charSequence2 = user11.getNickName();
                } else {
                    charSequence2 = null;
                }
                if (charSequence2 == null) {
                    C7573i.m23580a();
                }
                if (!C7634n.m23776c(charSequence2, charSequence3, false)) {
                    str = str.toLowerCase();
                    C7573i.m23582a((Object) str, "(this as java.lang.String).toLowerCase()");
                    IMUser user12 = iMMember.getUser();
                    if (user12 != null) {
                        str2 = user12.getNickName();
                    } else {
                        str2 = null;
                    }
                    if (str2 == null) {
                        C7573i.m23580a();
                    }
                    if (str2 != null) {
                        String lowerCase = str2.toLowerCase();
                        C7573i.m23582a((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
                        int a = C7634n.m23730a((CharSequence) lowerCase, str, 0, false, 6, (Object) null);
                        if (a != -1) {
                            int length = str.length() + a;
                            IMUser user13 = iMMember.getUser();
                            if (user13 != null) {
                                str3 = user13.getNickName();
                            } else {
                                str3 = null;
                            }
                            if (str3 == null) {
                                C7573i.m23580a();
                            }
                            int min = Math.min(length, str3.length());
                            IMUser user14 = iMMember.getUser();
                            if (user14 != null) {
                                str8 = user14.getNickName();
                            }
                            if (str8 == null) {
                                C7573i.m23580a();
                            }
                            if (str8 != null) {
                                str = str8.substring(a, min);
                                C7573i.m23582a((Object) str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                            }
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                }
            }
        }
        String memberDisplayName = iMMember.getMemberDisplayName();
        if (memberDisplayName == null) {
            memberDisplayName = "";
        }
        C31741e.m103079a(textView, memberDisplayName, str, 0);
    }

    /* renamed from: b */
    public final void mo81657b(TextView textView, IMMember iMMember, String str) {
        boolean z;
        Object obj;
        String str2;
        String str3;
        CharSequence charSequence;
        boolean z2;
        Object obj2;
        String str4;
        String str5;
        CharSequence charSequence2;
        boolean z3;
        CharSequence charSequence3;
        boolean z4;
        Object obj3;
        C7573i.m23587b(textView, "textView");
        C7573i.m23587b(iMMember, "imMember");
        C7573i.m23587b(str, POIService.KEY_KEYWORD);
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m101625a(textView, iMMember);
            return;
        }
        IMUser user = iMMember.getUser();
        if (user == null || user.getSearchType() != 5) {
            IMUser user2 = iMMember.getUser();
            String str6 = null;
            if (user2 == null || user2.getSearchType() != 4) {
                IMUser user3 = iMMember.getUser();
                if (user3 == null || user3.getSearchType() != 3) {
                    IMUser user4 = iMMember.getUser();
                    if (user4 == null || user4.getSearchType() != 1) {
                        IMUser user5 = iMMember.getUser();
                        if (user5 == null || user5.getSearchType() != 2) {
                            textView.setVisibility(8);
                            return;
                        }
                        Resources resources = C6399b.m19921a().getResources();
                        Object[] objArr = new Object[1];
                        IMUser user6 = iMMember.getUser();
                        if (user6 != null) {
                            obj = user6.getContactName();
                        } else {
                            obj = null;
                        }
                        objArr[0] = obj;
                        String string = resources.getString(R.string.bia, objArr);
                        IMUser user7 = iMMember.getUser();
                        if (user7 != null) {
                            str2 = user7.getContactName();
                        } else {
                            str2 = null;
                        }
                        IMUser user8 = iMMember.getUser();
                        if (user8 != null) {
                            str3 = user8.getContactNamePinyin();
                        } else {
                            str3 = null;
                        }
                        IMUser user9 = iMMember.getUser();
                        if (user9 != null) {
                            str6 = user9.getContactNameInitial();
                        }
                        String a = C7048a.m21924a(str2, str3, str6, str);
                        C7573i.m23582a((Object) a, "CharacterUtil.convertPin…tactNameInitial, keyword)");
                        C7573i.m23582a((Object) string, "str");
                        C31741e.m103079a(textView, string, a, 6);
                        textView.setVisibility(0);
                        return;
                    }
                    IMUser user10 = iMMember.getUser();
                    if (user10 != null) {
                        str6 = user10.getDisplayId();
                    }
                    String c = C7048a.m21930c(str6);
                    C7573i.m23582a((Object) c, "CharacterUtil.hanziToPinyin(id)");
                    if (c != null) {
                        String lowerCase = c.toLowerCase();
                        C7573i.m23582a((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
                        String a2 = C7048a.m21924a(str6, lowerCase, C7048a.m21928b(str6), str);
                        C7573i.m23582a((Object) a2, "CharacterUtil.convertPin…al(id), highLightKeyword)");
                        StringBuilder sb = new StringBuilder();
                        sb.append(C6399b.m19921a().getResources().getString(R.string.bfu));
                        sb.append(str6);
                        C31741e.m103079a(textView, sb.toString(), a2, 4);
                        textView.setVisibility(0);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
                IMUser user11 = iMMember.getUser();
                if (user11 != null) {
                    charSequence = user11.getRemarkName();
                } else {
                    charSequence = null;
                }
                CharSequence charSequence4 = charSequence;
                if (charSequence4 == null || charSequence4.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    Member member = iMMember.getMember();
                    if (member != null) {
                        charSequence2 = member.getAlias();
                    } else {
                        charSequence2 = null;
                    }
                    CharSequence charSequence5 = charSequence2;
                    if (charSequence5 == null || charSequence5.length() == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        m101625a(textView, iMMember);
                        return;
                    }
                }
                Resources resources2 = C6399b.m19921a().getResources();
                Object[] objArr2 = new Object[1];
                IMUser user12 = iMMember.getUser();
                if (user12 != null) {
                    obj2 = user12.getNickName();
                } else {
                    obj2 = null;
                }
                objArr2[0] = obj2;
                String string2 = resources2.getString(R.string.bnj, objArr2);
                IMUser user13 = iMMember.getUser();
                if (user13 != null) {
                    str4 = user13.getNickName();
                } else {
                    str4 = null;
                }
                IMUser user14 = iMMember.getUser();
                if (user14 != null) {
                    str5 = user14.getNickNamePinyin();
                } else {
                    str5 = null;
                }
                IMUser user15 = iMMember.getUser();
                if (user15 != null) {
                    str6 = user15.getNickNameInitial();
                }
                String a3 = C7048a.m21924a(str4, str5, str6, str);
                C7573i.m23582a((Object) a3, "CharacterUtil.convertPin…nitial, highLightKeyword)");
                C7573i.m23582a((Object) string2, "str");
                C31741e.m103079a(textView, string2, a3, 3);
                textView.setVisibility(0);
                return;
            }
            IMUser user16 = iMMember.getUser();
            if (user16 != null) {
                charSequence3 = user16.getRemarkName();
            } else {
                charSequence3 = null;
            }
            CharSequence charSequence6 = charSequence3;
            if (charSequence6 == null || charSequence6.length() == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                m101625a(textView, iMMember);
                return;
            }
            Resources resources3 = C6399b.m19921a().getResources();
            Object[] objArr3 = new Object[1];
            Member member2 = iMMember.getMember();
            if (member2 != null) {
                obj3 = member2.getAlias();
            } else {
                obj3 = null;
            }
            objArr3[0] = obj3;
            String string3 = resources3.getString(R.string.bkz, objArr3);
            Member member3 = iMMember.getMember();
            if (member3 != null) {
                str6 = member3.getAlias();
            }
            String a4 = C7048a.m21924a(str6, iMMember.getAliasPinyin(), iMMember.getAliasInitial(), str);
            C7573i.m23582a((Object) a4, "CharacterUtil.convertPin…nitial, highLightKeyword)");
            C7573i.m23582a((Object) string3, "str");
            C31741e.m103079a(textView, string3, a4, 4);
            textView.setVisibility(0);
            return;
        }
        m101625a(textView, iMMember);
    }
}
