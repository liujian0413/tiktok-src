package com.p280ss.android.ugc.aweme.comment.p1101h;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.support.p022v4.content.C0683b;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.comment.abtest.MTNestedCommentsHideExperiment;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.comment.p1101h.C24143c.C24145b;
import com.p280ss.android.ugc.aweme.comment.p1101h.C24143c.C24146c;
import com.p280ss.android.ugc.aweme.comment.services.C24219a.C24220a;
import com.p280ss.android.ugc.aweme.commercialize.model.CommentStruct;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.widget.C29050c;
import com.p280ss.android.ugc.aweme.model.TextExtraStruct;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.utils.C43110ev;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;
import kotlin.text.C7634n;
import kotlin.text.Regex;

/* renamed from: com.ss.android.ugc.aweme.comment.h.e */
public final class C24148e {

    /* renamed from: com.ss.android.ugc.aweme.comment.h.e$a */
    public static final class C24149a extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ C7561a f63818a;

        C24149a(C7561a aVar) {
            this.f63818a = aVar;
        }

        public final void onClick(View view) {
            C7573i.m23587b(view, "widget");
            if (!C27326a.m89578a(view)) {
                this.f63818a.invoke();
            }
        }
    }

    /* renamed from: a */
    public static final String m79332a(Comment comment) {
        return m79338a(comment, false, false, 3, null);
    }

    /* renamed from: a */
    public static final String m79336a(Comment comment, boolean z) {
        return m79338a(comment, z, false, 2, null);
    }

    /* renamed from: f */
    public static final boolean m79352f(Comment comment) {
        C7573i.m23587b(comment, "$this$hasTextExtra");
        return true;
    }

    /* renamed from: g */
    public static final String m79353g(Comment comment) {
        return m79335a(comment, null, 1, null);
    }

    /* renamed from: a */
    public static final boolean m79342a() {
        return !C6399b.m19944t() || C6384b.m19835a().mo15292a(MTNestedCommentsHideExperiment.class, true, "mt_nested_comments_hide", C6384b.m19835a().mo15295d().mt_nested_comments_hide, false);
    }

    /* renamed from: a */
    public static final List<TextExtraStruct> m79341a(CommentStruct commentStruct, C7561a<C7581n> aVar) {
        C7573i.m23587b(commentStruct, "$this$getSearchCommentTextExtra");
        C7573i.m23587b(aVar, "onLinkTagClick");
        ArrayList arrayList = new ArrayList();
        int length = commentStruct.getCommentInfo().length() + 1;
        int i = length + 7;
        C24149a aVar2 = new C24149a(aVar);
        TextExtraStruct textExtraStruct = new TextExtraStruct();
        textExtraStruct.setType(TextExtraStruct.TYPE_CUSTOM);
        textExtraStruct.setCustomSpan(aVar2);
        textExtraStruct.setStart(length);
        textExtraStruct.setEnd(i);
        C29050c cVar = new C29050c(C6399b.m19921a(), commentStruct.getTagText(), "#FFFFFF", R.drawable.aod, "#FFFFFF", "#57161823", 10, 17);
        cVar.f76587a = C9738o.m28708b(C6399b.m19921a(), 0.5f);
        TextExtraStruct textExtraStruct2 = new TextExtraStruct();
        textExtraStruct2.setType(TextExtraStruct.TYPE_CUSTOM);
        textExtraStruct2.setCustomSpan(cVar);
        textExtraStruct2.setStart(length);
        textExtraStruct2.setEnd(i);
        arrayList.add(textExtraStruct);
        arrayList.add(textExtraStruct2);
        int i2 = i + 1;
        int length2 = i + m79347c(commentStruct).length();
        TextExtraStruct textExtraStruct3 = new TextExtraStruct();
        textExtraStruct3.setType(TextExtraStruct.TYPE_CUSTOM);
        textExtraStruct3.setCustomSpan(new C24145b(C23486n.m77122a(13.0d), C6399b.m19921a().getResources().getColor(R.color.lz)));
        textExtraStruct3.setStart(i2);
        textExtraStruct3.setEnd(length2);
        arrayList.add(textExtraStruct3);
        return arrayList;
    }

    /* renamed from: j */
    private static final String m79356j(Comment comment) {
        return m79346c(comment, null, 0);
    }

    /* renamed from: i */
    private static String m79355i(Comment comment) {
        C7573i.m23587b(comment, "$this$getTopTagStr");
        String string = C6399b.m19921a().getResources().getString(R.string.eaa);
        C7573i.m23582a((Object) string, "AppContextManager.getApp…s.getString(R.string.top)");
        return string;
    }

    /* renamed from: c */
    private static String m79347c(CommentStruct commentStruct) {
        C7573i.m23587b(commentStruct, "$this$getTimeDesc");
        if (TextUtils.isEmpty(commentStruct.mTimeDesc)) {
            String c = C43110ev.m136734c(C6399b.m19921a(), commentStruct.getCommentTime() * 1000);
            C7573i.m23582a((Object) c, "TimeUtils.formatCreateTi…t(), commentTime * 1000L)");
            commentStruct.mTimeDesc = new Regex("(.)").replace((CharSequence) c, "$1⁠");
        }
        String str = commentStruct.mTimeDesc;
        C7573i.m23582a((Object) str, "mTimeDesc");
        return str;
    }

    /* renamed from: h */
    private static boolean m79354h(Comment comment) {
        C7573i.m23587b(comment, "$this$hasNamePrefix");
        if (!m79342a() || TextUtils.isEmpty(comment.getReplyToUserName()) || TextUtils.isEmpty(comment.getReplyToReplyCommentId()) || TextUtils.equals(comment.getReplyToReplyCommentId(), "0")) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    private static String m79357k(Comment comment) {
        Context context;
        C7573i.m23587b(comment, "$this$getTimeDesc");
        Activity g = C6405d.m19984g();
        if (g != null) {
            context = g;
        } else {
            context = C6399b.m19921a();
        }
        String c = C43110ev.m136734c(context, ((long) comment.getCreateTime()) * 1000);
        C7573i.m23582a((Object) c, "TimeUtils.formatCreateTi…ateTime.toLong() * 1000L)");
        return new Regex("(.)").replace((CharSequence) c, "$1⁠");
    }

    /* renamed from: e */
    public static final String m79351e(Comment comment) {
        boolean z;
        C7573i.m23587b(comment, "$this$getForwardText");
        if (TextUtils.isEmpty(comment.getForwardId())) {
            String text = comment.getText();
            if (text == null) {
                text = "";
            }
            return text;
        }
        String string = C6399b.m19921a().getString(R.string.b9u);
        CharSequence text2 = comment.getText();
        if (text2 == null || text2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append(" • ");
            string = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(string);
        String text3 = comment.getText();
        if (text3 == null) {
            text3 = "";
        }
        sb2.append(text3);
        return sb2.toString();
    }

    /* renamed from: b */
    public static final List<TextExtraStruct> m79345b(CommentStruct commentStruct) {
        C7573i.m23587b(commentStruct, "$this$getDisplayTextExtra");
        ArrayList arrayList = new ArrayList();
        int length = commentStruct.getCommentInfo().length() + 1;
        int i = length + 7;
        TextExtraStruct textExtraStruct = new TextExtraStruct();
        textExtraStruct.setType(TextExtraStruct.TYPE_CUSTOM);
        C29050c cVar = new C29050c(C6399b.m19921a(), C6399b.m19921a().getString(R.string.aof), "#FFFFFFFF", R.drawable.aqx, "#80FFFFFF", "#58161823", 10, 17);
        textExtraStruct.setCustomSpan(cVar);
        textExtraStruct.setStart(length);
        textExtraStruct.setEnd(i);
        arrayList.add(textExtraStruct);
        int i2 = i + 1;
        int length2 = i + m79347c(commentStruct).length();
        TextExtraStruct textExtraStruct2 = new TextExtraStruct();
        textExtraStruct2.setType(TextExtraStruct.TYPE_CUSTOM);
        textExtraStruct2.setCustomSpan(new C24145b(C23486n.m77122a(13.0d), C6399b.m19921a().getResources().getColor(R.color.lz)));
        textExtraStruct2.setStart(i2);
        textExtraStruct2.setEnd(length2);
        arrayList.add(textExtraStruct2);
        return arrayList;
    }

    /* renamed from: a */
    public static final String m79339a(CommentStruct commentStruct) {
        C7573i.m23587b(commentStruct, "$this$getDisplayText");
        StringBuilder sb = new StringBuilder(commentStruct.getCommentInfo());
        sb.append(" [label]");
        sb.append(" ");
        sb.append(m79347c(commentStruct));
        String sb2 = sb.toString();
        C7573i.m23582a((Object) sb2, "builder.toString()");
        return sb2;
    }

    /* renamed from: b */
    public static final List<TextExtraStruct> m79344b(Comment comment) {
        List<TextExtraStruct> list;
        int i;
        int i2;
        boolean z;
        C7573i.m23587b(comment, "$this$getDisplayTextExtra");
        if (comment.getTextExtra() != null) {
            list = new ArrayList<>(comment.getTextExtra().size());
            for (TextExtraStruct clone : comment.getTextExtra()) {
                TextExtraStruct clone2 = clone.clone();
                C7573i.m23582a((Object) clone2, "textExtraStruct.clone()");
                list.add(clone2);
            }
        } else {
            list = new ArrayList<>();
        }
        String k = m79357k(comment);
        String text = comment.getText();
        if (text == null) {
            text = "";
        }
        int length = text.length() + 1;
        String text2 = comment.getText();
        if (text2 == null) {
            text2 = "";
        }
        int length2 = text2.length() + k.length();
        TextExtraStruct textExtraStruct = new TextExtraStruct();
        textExtraStruct.setType(TextExtraStruct.TYPE_CUSTOM);
        if (C24220a.m79551a().isBlackBackground()) {
            i = C6399b.m19921a().getResources().getColor(R.color.a53);
        } else {
            i = C6399b.m19921a().getResources().getColor(R.color.abm);
        }
        textExtraStruct.setCustomSpan(new C24145b(C23486n.m77127c(13.0d), i));
        textExtraStruct.setStart(length);
        textExtraStruct.setEnd(length2);
        list.add(textExtraStruct);
        if (m79342a()) {
            String i3 = m79355i(comment);
            int length3 = k.length() + 1;
            TextExtraStruct textExtraStruct2 = new TextExtraStruct();
            textExtraStruct2.setType(TextExtraStruct.TYPE_CUSTOM);
            textExtraStruct2.setCustomSpan(new C24146c());
            String text3 = comment.getText();
            if (text3 == null) {
                text3 = "";
            }
            textExtraStruct2.setStart(text3.length() + length3 + 1);
            String text4 = comment.getText();
            if (text4 == null) {
                text4 = "";
            }
            textExtraStruct2.setEnd(text4.length() + length3 + 1 + i3.length());
            list.add(textExtraStruct2);
        }
        if (!TextUtils.isEmpty(comment.getForwardId())) {
            String string = C6399b.m19921a().getString(R.string.b9u);
            CharSequence text5 = comment.getText();
            if (text5 == null || text5.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(" • ");
                string = sb.toString();
            }
            int length4 = string.length();
            for (TextExtraStruct textExtraStruct3 : list) {
                textExtraStruct3.setStart(textExtraStruct3.getStart() + length4);
                textExtraStruct3.setEnd(textExtraStruct3.getEnd() + length4);
                textExtraStruct3.setUserId(textExtraStruct3.getUserId());
            }
        }
        if (m79354h(comment)) {
            String string2 = C6399b.m19921a().getString(R.string.a91, new Object[]{comment.getReplyToUserName()});
            int length5 = string2.length();
            for (TextExtraStruct textExtraStruct4 : list) {
                textExtraStruct4.setStart(textExtraStruct4.getStart() + length5);
                textExtraStruct4.setEnd(textExtraStruct4.getEnd() + length5);
            }
            TextExtraStruct textExtraStruct5 = new TextExtraStruct();
            textExtraStruct5.setType(TextExtraStruct.TYPE_CUSTOM_COLOR_CLICK_SPAN);
            if (C24220a.m79551a().isBlackBackground()) {
                i2 = C6399b.m19921a().getResources().getColor(R.color.a53);
            } else if (C6399b.m19944t()) {
                i2 = C6399b.m19921a().getResources().getColor(R.color.ayl);
            } else {
                i2 = C6399b.m19921a().getResources().getColor(R.color.sw);
            }
            C7573i.m23582a((Object) string2, "replyUsernamePrefix");
            CharSequence charSequence = string2;
            String replyToUserName = comment.getReplyToUserName();
            C7573i.m23582a((Object) replyToUserName, "replyToUserName");
            int a = C7634n.m23730a(charSequence, replyToUserName, 0, false, 6, (Object) null);
            textExtraStruct5.setStart(a);
            if (C6399b.m19944t()) {
                textExtraStruct5.setBoldText(true);
            }
            textExtraStruct5.setUserId(comment.getReplyToUserId());
            textExtraStruct5.setColor(i2);
            textExtraStruct5.setEnd(a + comment.getReplyToUserName().length());
            list.add(textExtraStruct5);
        }
        return list;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01ac  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List<com.p280ss.android.ugc.aweme.model.TextExtraStruct> m79348c(com.p280ss.android.ugc.aweme.comment.model.Comment r9) {
        /*
            java.lang.String r0 = "$this$getDispalyTextExtraForMoment"
            kotlin.jvm.internal.C7573i.m23587b(r9, r0)
            java.util.List r0 = r9.getTextExtra()
            if (r0 == 0) goto L_0x003b
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r1 = r9.getTextExtra()
            int r1 = r1.size()
            r0.<init>(r1)
            java.util.List r0 = (java.util.List) r0
            java.util.List r1 = r9.getTextExtra()
            java.util.Iterator r1 = r1.iterator()
        L_0x0022:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0042
            java.lang.Object r2 = r1.next()
            com.ss.android.ugc.aweme.model.TextExtraStruct r2 = (com.p280ss.android.ugc.aweme.model.TextExtraStruct) r2
            com.ss.android.ugc.aweme.model.TextExtraStruct r2 = r2.clone()
            java.lang.String r3 = "textExtraStruct.clone()"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            r0.add(r2)
            goto L_0x0022
        L_0x003b:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
        L_0x0042:
            java.lang.String r1 = r9.getForwardId()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x00ac
            android.content.Context r1 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()
            r4 = 2131823265(0x7f110aa1, float:1.9279325E38)
            java.lang.String r1 = r1.getString(r4)
            java.lang.String r4 = r9.getText()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            if (r4 == 0) goto L_0x006c
            int r4 = r4.length()
            if (r4 != 0) goto L_0x006a
            goto L_0x006c
        L_0x006a:
            r4 = 0
            goto L_0x006d
        L_0x006c:
            r4 = 1
        L_0x006d:
            if (r4 != 0) goto L_0x0080
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r1 = " • "
            r4.append(r1)
            java.lang.String r1 = r4.toString()
        L_0x0080:
            int r1 = r1.length()
            java.util.Iterator r4 = r0.iterator()
        L_0x0088:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00ac
            java.lang.Object r5 = r4.next()
            com.ss.android.ugc.aweme.model.TextExtraStruct r5 = (com.p280ss.android.ugc.aweme.model.TextExtraStruct) r5
            int r6 = r5.getStart()
            int r6 = r6 + r1
            r5.setStart(r6)
            int r6 = r5.getEnd()
            int r6 = r6 + r1
            r5.setEnd(r6)
            java.lang.String r6 = r5.getUserId()
            r5.setUserId(r6)
            goto L_0x0088
        L_0x00ac:
            com.ss.android.ugc.aweme.profile.model.User r1 = r9.getUser()
            if (r1 == 0) goto L_0x01e5
            m79356j(r9)
            java.util.Iterator r1 = r0.iterator()
        L_0x00b9:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x00e2
            java.lang.Object r4 = r1.next()
            com.ss.android.ugc.aweme.model.TextExtraStruct r4 = (com.p280ss.android.ugc.aweme.model.TextExtraStruct) r4
            int r5 = r4.getStart()
            java.lang.String r6 = r9.mUserNamePrefix
            int r6 = r6.length()
            int r5 = r5 + r6
            r4.setStart(r5)
            int r5 = r4.getEnd()
            java.lang.String r6 = r9.mUserNamePrefix
            int r6 = r6.length()
            int r5 = r5 + r6
            r4.setEnd(r5)
            goto L_0x00b9
        L_0x00e2:
            com.ss.android.ugc.aweme.profile.model.User r1 = r9.getUser()
            java.lang.String r1 = com.p280ss.android.ugc.aweme.utils.C43122ff.m136774e(r1)
            int r1 = r1.length()
            int r4 = r9.offset
            int r1 = r1 - r4
            int r4 = r9.getLabelType()
            if (r4 <= 0) goto L_0x0121
            java.lang.String r4 = r9.getLabelText()
            int r4 = r4.length()
            int r4 = r4 + r1
            com.ss.android.ugc.aweme.model.TextExtraStruct r5 = new com.ss.android.ugc.aweme.model.TextExtraStruct
            r5.<init>()
            r6 = 65281(0xff01, float:9.1478E-41)
            r5.setType(r6)
            com.ss.android.ugc.aweme.comment.h.c$a r6 = new com.ss.android.ugc.aweme.comment.h.c$a
            int r7 = r9.getLabelType()
            r6.<init>(r7)
            r5.setCustomSpan(r6)
            r5.setStart(r1)
            r5.setEnd(r4)
            r0.add(r5)
            goto L_0x0122
        L_0x0121:
            r4 = r1
        L_0x0122:
            java.util.List r5 = r9.getReplyComments()
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = com.bytedance.common.utility.collection.C6307b.m19566a(r5)
            if (r5 != 0) goto L_0x015f
            java.util.List r5 = r9.getReplyComments()
            java.lang.String r6 = "replyComments"
            kotlin.jvm.internal.C7573i.m23582a(r5, r6)
            java.lang.Object r5 = kotlin.collections.C7525m.m23511f(r5)
            if (r5 == 0) goto L_0x015f
            java.util.List r5 = r9.getReplyComments()
            java.lang.String r6 = "replyComments"
            kotlin.jvm.internal.C7573i.m23582a(r5, r6)
            java.lang.Object r5 = kotlin.collections.C7525m.m23511f(r5)
            java.lang.String r6 = "replyComments.first()"
            kotlin.jvm.internal.C7573i.m23582a(r5, r6)
            com.ss.android.ugc.aweme.comment.model.Comment r5 = (com.p280ss.android.ugc.aweme.comment.model.Comment) r5
            com.ss.android.ugc.aweme.profile.model.User r5 = r5.getUser()
            java.lang.String r6 = "replyComments.first().user"
            kotlin.jvm.internal.C7573i.m23582a(r5, r6)
            java.lang.String r5 = r5.getUid()
            goto L_0x0161
        L_0x015f:
            java.lang.String r5 = ""
        L_0x0161:
            r6 = r5
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 == 0) goto L_0x016e
            java.lang.String r5 = r9.getReplyToUserId()
        L_0x016e:
            r6 = r5
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            r7 = 2131100112(0x7f0601d0, float:1.7812596E38)
            r8 = 65282(0xff02, float:9.148E-41)
            if (r6 != 0) goto L_0x01ac
            com.ss.android.ugc.aweme.model.TextExtraStruct r6 = new com.ss.android.ugc.aweme.model.TextExtraStruct
            r6.<init>()
            r6.setType(r8)
            int r4 = r4 + 3
            r6.setStart(r4)
            java.lang.String r4 = r9.mUserNamePrefix
            int r4 = r4.length()
            r6.setEnd(r4)
            r6.setUserId(r5)
            r6.setBoldText(r3)
            android.content.Context r4 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()
            android.content.res.Resources r4 = r4.getResources()
            int r4 = r4.getColor(r7)
            r6.setColor(r4)
            r0.add(r6)
            goto L_0x01b2
        L_0x01ac:
            java.lang.String r1 = r9.mUserNamePrefix
            int r1 = r1.length()
        L_0x01b2:
            com.ss.android.ugc.aweme.model.TextExtraStruct r4 = new com.ss.android.ugc.aweme.model.TextExtraStruct
            r4.<init>()
            r4.setType(r8)
            r4.setStart(r2)
            r4.setEnd(r1)
            com.ss.android.ugc.aweme.profile.model.User r9 = r9.getUser()
            java.lang.String r1 = "user"
            kotlin.jvm.internal.C7573i.m23582a(r9, r1)
            java.lang.String r9 = r9.getUid()
            r4.setUserId(r9)
            r4.setBoldText(r3)
            android.content.Context r9 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()
            android.content.res.Resources r9 = r9.getResources()
            int r9 = r9.getColor(r7)
            r4.setColor(r9)
            r0.add(r4)
        L_0x01e5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.comment.p1101h.C24148e.m79348c(com.ss.android.ugc.aweme.comment.model.Comment):java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01ae  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List<com.p280ss.android.ugc.aweme.model.TextExtraStruct> m79350d(com.p280ss.android.ugc.aweme.comment.model.Comment r9) {
        /*
            java.lang.String r0 = "$this$getDisplayTextExtraForIns"
            kotlin.jvm.internal.C7573i.m23587b(r9, r0)
            java.util.List r0 = r9.getTextExtra()
            if (r0 == 0) goto L_0x003b
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r1 = r9.getTextExtra()
            int r1 = r1.size()
            r0.<init>(r1)
            java.util.List r0 = (java.util.List) r0
            java.util.List r1 = r9.getTextExtra()
            java.util.Iterator r1 = r1.iterator()
        L_0x0022:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0042
            java.lang.Object r2 = r1.next()
            com.ss.android.ugc.aweme.model.TextExtraStruct r2 = (com.p280ss.android.ugc.aweme.model.TextExtraStruct) r2
            com.ss.android.ugc.aweme.model.TextExtraStruct r2 = r2.clone()
            java.lang.String r3 = "textExtraStruct.clone()"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            r0.add(r2)
            goto L_0x0022
        L_0x003b:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
        L_0x0042:
            java.lang.String r1 = r9.getForwardId()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x00ac
            android.content.Context r1 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()
            r4 = 2131823265(0x7f110aa1, float:1.9279325E38)
            java.lang.String r1 = r1.getString(r4)
            java.lang.String r4 = r9.getText()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            if (r4 == 0) goto L_0x006c
            int r4 = r4.length()
            if (r4 != 0) goto L_0x006a
            goto L_0x006c
        L_0x006a:
            r4 = 0
            goto L_0x006d
        L_0x006c:
            r4 = 1
        L_0x006d:
            if (r4 != 0) goto L_0x0080
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r1 = " • "
            r4.append(r1)
            java.lang.String r1 = r4.toString()
        L_0x0080:
            int r1 = r1.length()
            java.util.Iterator r4 = r0.iterator()
        L_0x0088:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00ac
            java.lang.Object r5 = r4.next()
            com.ss.android.ugc.aweme.model.TextExtraStruct r5 = (com.p280ss.android.ugc.aweme.model.TextExtraStruct) r5
            int r6 = r5.getStart()
            int r6 = r6 + r1
            r5.setStart(r6)
            int r6 = r5.getEnd()
            int r6 = r6 + r1
            r5.setEnd(r6)
            java.lang.String r6 = r5.getUserId()
            r5.setUserId(r6)
            goto L_0x0088
        L_0x00ac:
            com.ss.android.ugc.aweme.profile.model.User r1 = r9.getUser()
            if (r1 == 0) goto L_0x01e7
            m79356j(r9)
            java.util.Iterator r1 = r0.iterator()
        L_0x00b9:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x00e4
            java.lang.Object r4 = r1.next()
            com.ss.android.ugc.aweme.model.TextExtraStruct r4 = (com.p280ss.android.ugc.aweme.model.TextExtraStruct) r4
            int r5 = r4.getStart()
            java.lang.String r6 = r9.mUserNamePrefix
            int r6 = r6.length()
            int r5 = r5 + r6
            int r5 = r5 + r3
            r4.setStart(r5)
            int r5 = r4.getEnd()
            java.lang.String r6 = r9.mUserNamePrefix
            int r6 = r6.length()
            int r5 = r5 + r6
            int r5 = r5 + r3
            r4.setEnd(r5)
            goto L_0x00b9
        L_0x00e4:
            com.ss.android.ugc.aweme.profile.model.User r1 = r9.getUser()
            java.lang.String r1 = com.p280ss.android.ugc.aweme.utils.C43122ff.m136770c(r1)
            int r1 = r1.length()
            int r4 = r9.offset
            int r1 = r1 - r4
            int r4 = r9.getLabelType()
            if (r4 <= 0) goto L_0x0123
            java.lang.String r4 = r9.getLabelText()
            int r4 = r4.length()
            int r4 = r4 + r1
            com.ss.android.ugc.aweme.model.TextExtraStruct r5 = new com.ss.android.ugc.aweme.model.TextExtraStruct
            r5.<init>()
            r6 = 65281(0xff01, float:9.1478E-41)
            r5.setType(r6)
            com.ss.android.ugc.aweme.comment.h.c$a r6 = new com.ss.android.ugc.aweme.comment.h.c$a
            int r7 = r9.getLabelType()
            r6.<init>(r7)
            r5.setCustomSpan(r6)
            r5.setStart(r1)
            r5.setEnd(r4)
            r0.add(r5)
            goto L_0x0124
        L_0x0123:
            r4 = r1
        L_0x0124:
            java.util.List r5 = r9.getReplyComments()
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = com.bytedance.common.utility.collection.C6307b.m19566a(r5)
            if (r5 != 0) goto L_0x0161
            java.util.List r5 = r9.getReplyComments()
            java.lang.String r6 = "replyComments"
            kotlin.jvm.internal.C7573i.m23582a(r5, r6)
            java.lang.Object r5 = kotlin.collections.C7525m.m23511f(r5)
            if (r5 == 0) goto L_0x0161
            java.util.List r5 = r9.getReplyComments()
            java.lang.String r6 = "replyComments"
            kotlin.jvm.internal.C7573i.m23582a(r5, r6)
            java.lang.Object r5 = kotlin.collections.C7525m.m23511f(r5)
            java.lang.String r6 = "replyComments.first()"
            kotlin.jvm.internal.C7573i.m23582a(r5, r6)
            com.ss.android.ugc.aweme.comment.model.Comment r5 = (com.p280ss.android.ugc.aweme.comment.model.Comment) r5
            com.ss.android.ugc.aweme.profile.model.User r5 = r5.getUser()
            java.lang.String r6 = "replyComments.first().user"
            kotlin.jvm.internal.C7573i.m23582a(r5, r6)
            java.lang.String r5 = r5.getUid()
            goto L_0x0163
        L_0x0161:
            java.lang.String r5 = ""
        L_0x0163:
            r6 = r5
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 == 0) goto L_0x0170
            java.lang.String r5 = r9.getReplyToUserId()
        L_0x0170:
            r6 = r5
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            r7 = 2131100112(0x7f0601d0, float:1.7812596E38)
            r8 = 65282(0xff02, float:9.148E-41)
            if (r6 != 0) goto L_0x01ae
            com.ss.android.ugc.aweme.model.TextExtraStruct r6 = new com.ss.android.ugc.aweme.model.TextExtraStruct
            r6.<init>()
            r6.setType(r8)
            int r4 = r4 + 3
            r6.setStart(r4)
            java.lang.String r4 = r9.mUserNamePrefix
            int r4 = r4.length()
            r6.setEnd(r4)
            r6.setUserId(r5)
            r6.setBoldText(r3)
            android.content.Context r4 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()
            android.content.res.Resources r4 = r4.getResources()
            int r4 = r4.getColor(r7)
            r6.setColor(r4)
            r0.add(r6)
            goto L_0x01b4
        L_0x01ae:
            java.lang.String r1 = r9.mUserNamePrefix
            int r1 = r1.length()
        L_0x01b4:
            com.ss.android.ugc.aweme.model.TextExtraStruct r4 = new com.ss.android.ugc.aweme.model.TextExtraStruct
            r4.<init>()
            r4.setType(r8)
            r4.setStart(r2)
            r4.setEnd(r1)
            com.ss.android.ugc.aweme.profile.model.User r9 = r9.getUser()
            java.lang.String r1 = "user"
            kotlin.jvm.internal.C7573i.m23582a(r9, r1)
            java.lang.String r9 = r9.getUid()
            r4.setUserId(r9)
            r4.setBoldText(r3)
            android.content.Context r9 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()
            android.content.res.Resources r9 = r9.getResources()
            int r9 = r9.getColor(r7)
            r4.setColor(r9)
            r0.add(r4)
        L_0x01e7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.comment.p1101h.C24148e.m79350d(com.ss.android.ugc.aweme.comment.model.Comment):java.util.List");
    }

    /* renamed from: a */
    public static final String m79334a(Comment comment, String str) {
        String str2;
        C7573i.m23587b(comment, "$this$getTextWithGifEmojiDetailTail");
        C7573i.m23587b(str, "displayText");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (comment.getEmoji() != null) {
            str2 = " ";
        } else {
            str2 = "";
        }
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: a */
    public static final String m79333a(Comment comment, Paint paint, int i) {
        C7573i.m23587b(comment, "$this$getDisplayTextForMoment");
        C7573i.m23587b(paint, "paint");
        StringBuilder sb = new StringBuilder();
        sb.append(m79346c(comment, paint, i));
        sb.append(m79351e(comment));
        return sb.toString();
    }

    /* renamed from: b */
    public static final String m79343b(Comment comment, Paint paint, int i) {
        C7573i.m23587b(comment, "$this$getDisplayTextForIns");
        C7573i.m23587b(paint, "paint");
        StringBuilder sb = new StringBuilder();
        sb.append(m79349d(comment, paint, i));
        sb.append("：");
        sb.append(m79351e(comment));
        return sb.toString();
    }

    /* renamed from: a */
    public static final String m79337a(Comment comment, boolean z, boolean z2) {
        boolean z3;
        C7573i.m23587b(comment, "$this$getDisplayText");
        String text = comment.getText();
        if (text == null) {
            text = "";
        }
        StringBuilder sb = new StringBuilder(text);
        if (!TextUtils.isEmpty(comment.getForwardId())) {
            String string = C6399b.m19921a().getString(R.string.b9u);
            CharSequence text2 = comment.getText();
            if (text2 == null || text2.length() == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" • ");
                string = sb2.toString();
            }
            sb.insert(0, string);
        }
        if (m79354h(comment)) {
            sb.insert(0, C6399b.m19921a().getString(R.string.a91, new Object[]{comment.getReplyToUserName()}));
        }
        if (z) {
            sb.append(" ");
            sb.append(m79357k(comment));
        }
        if (m79342a() && z2) {
            sb.append(" ");
            sb.append(m79355i(comment));
        }
        String sb3 = sb.toString();
        C7573i.m23582a((Object) sb3, "builder.toString()");
        return sb3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0143  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.String m79346c(com.p280ss.android.ugc.aweme.comment.model.Comment r19, android.graphics.Paint r20, int r21) {
        /*
            r0 = r19
            r1 = r20
            r2 = r21
            com.ss.android.ugc.aweme.profile.model.User r3 = r19.getUser()
            if (r3 == 0) goto L_0x016d
            java.lang.String r3 = r0.mUserNamePrefix
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x016d
            com.ss.android.ugc.aweme.profile.model.User r3 = r19.getUser()
            java.lang.String r3 = com.p280ss.android.ugc.aweme.utils.C43122ff.m136774e(r3)
            java.util.List r4 = r19.getReplyComments()
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = com.bytedance.common.utility.collection.C6307b.m19566a(r4)
            if (r4 != 0) goto L_0x0056
            java.util.List r4 = r19.getReplyComments()
            java.lang.String r5 = "replyComments"
            kotlin.jvm.internal.C7573i.m23582a(r4, r5)
            java.lang.Object r4 = kotlin.collections.C7525m.m23511f(r4)
            if (r4 == 0) goto L_0x0056
            java.util.List r4 = r19.getReplyComments()
            java.lang.String r5 = "replyComments"
            kotlin.jvm.internal.C7573i.m23582a(r4, r5)
            java.lang.Object r4 = kotlin.collections.C7525m.m23511f(r4)
            java.lang.String r5 = "replyComments.first()"
            kotlin.jvm.internal.C7573i.m23582a(r4, r5)
            com.ss.android.ugc.aweme.comment.model.Comment r4 = (com.p280ss.android.ugc.aweme.comment.model.Comment) r4
            com.ss.android.ugc.aweme.profile.model.User r4 = r4.getUser()
            java.lang.String r4 = com.p280ss.android.ugc.aweme.utils.C43122ff.m136774e(r4)
            goto L_0x0058
        L_0x0056:
            java.lang.String r4 = ""
        L_0x0058:
            r5 = r4
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L_0x0065
            java.lang.String r4 = r19.getReplyToUserName()
        L_0x0065:
            if (r1 == 0) goto L_0x0128
            if (r2 <= 0) goto L_0x0128
            int r5 = r19.getLabelType()
            if (r5 <= 0) goto L_0x0128
            java.lang.String r5 = r19.getLabelText()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0128
            r5 = r4
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L_0x008b
            java.lang.String r5 = "："
            float r5 = r1.measureText(r5)
            goto L_0x008c
        L_0x008b:
            r5 = 0
        L_0x008c:
            android.text.SpannableString r6 = new android.text.SpannableString
            java.lang.String r7 = r19.getLabelText()
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r6.<init>(r7)
            com.ss.android.ugc.aweme.comment.h.c$a r7 = new com.ss.android.ugc.aweme.comment.h.c$a
            int r8 = r19.getLabelType()
            r7.<init>(r8)
            java.lang.String r8 = r19.getLabelText()
            int r8 = r8.length()
            int r8 = r8 + -1
            r9 = 33
            r10 = 0
            r6.setSpan(r7, r10, r8, r9)
            android.text.StaticLayout r8 = new android.text.StaticLayout
            r12 = r6
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            android.text.TextPaint r13 = r7.mo62572a(r1)
            r14 = 10000(0x2710, float:1.4013E-41)
            android.text.Layout$Alignment r15 = android.text.Layout.Alignment.ALIGN_NORMAL
            r16 = 1065353216(0x3f800000, float:1.0)
            r17 = 0
            r18 = 0
            r11 = r8
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            float r6 = r8.getLineWidth(r10)
            float r7 = r1.measureText(r3)
            float r7 = r7 + r6
            float r7 = r7 + r5
            float r2 = (float) r2
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 <= 0) goto L_0x0128
            java.lang.String r7 = "..."
            float r8 = r1.measureText(r7)
        L_0x00dc:
            java.lang.String r9 = "username"
            kotlin.jvm.internal.C7573i.m23582a(r3, r9)
            int r9 = r3.length()
            int r9 = r9 + -1
            if (r3 == 0) goto L_0x0120
            java.lang.String r3 = r3.substring(r10, r9)
            java.lang.String r9 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            kotlin.jvm.internal.C7573i.m23582a(r3, r9)
            float r9 = r1.measureText(r3)
            float r9 = r9 + r6
            float r9 = r9 + r8
            float r9 = r9 + r5
            int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r9 > 0) goto L_0x00dc
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r7)
            java.lang.String r3 = r1.toString()
            com.ss.android.ugc.aweme.profile.model.User r1 = r19.getUser()
            java.lang.String r1 = com.p280ss.android.ugc.aweme.utils.C43122ff.m136774e(r1)
            int r1 = r1.length()
            int r2 = r3.length()
            int r1 = r1 - r2
            r0.offset = r1
            goto L_0x0128
        L_0x0120:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            r0.<init>(r1)
            throw r0
        L_0x0128:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            int r2 = r19.getLabelType()
            if (r2 <= 0) goto L_0x013a
            java.lang.String r2 = r19.getLabelText()
            r1.append(r2)
        L_0x013a:
            r2 = r4
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0162
            java.lang.String r2 = " "
            r1.append(r2)
            android.content.Context r2 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131826220(0x7f11162c, float:1.9285318E38)
            java.lang.String r2 = r2.getString(r3)
            r1.append(r2)
            java.lang.String r2 = " "
            r1.append(r2)
            r1.append(r4)
        L_0x0162:
            java.lang.String r2 = "："
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.mUserNamePrefix = r1
        L_0x016d:
            java.lang.String r0 = r0.mUserNamePrefix
            java.lang.String r1 = "mUserNamePrefix"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.comment.p1101h.C24148e.m79346c(com.ss.android.ugc.aweme.comment.model.Comment, android.graphics.Paint, int):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0143  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.String m79349d(com.p280ss.android.ugc.aweme.comment.model.Comment r19, android.graphics.Paint r20, int r21) {
        /*
            r0 = r19
            r1 = r20
            r2 = r21
            com.ss.android.ugc.aweme.profile.model.User r3 = r19.getUser()
            if (r3 == 0) goto L_0x0168
            java.lang.String r3 = r0.mUserNamePrefix
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x0168
            com.ss.android.ugc.aweme.profile.model.User r3 = r19.getUser()
            java.lang.String r3 = com.p280ss.android.ugc.aweme.utils.C43122ff.m136770c(r3)
            java.util.List r4 = r19.getReplyComments()
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = com.bytedance.common.utility.collection.C6307b.m19566a(r4)
            if (r4 != 0) goto L_0x0056
            java.util.List r4 = r19.getReplyComments()
            java.lang.String r5 = "replyComments"
            kotlin.jvm.internal.C7573i.m23582a(r4, r5)
            java.lang.Object r4 = kotlin.collections.C7525m.m23511f(r4)
            if (r4 == 0) goto L_0x0056
            java.util.List r4 = r19.getReplyComments()
            java.lang.String r5 = "replyComments"
            kotlin.jvm.internal.C7573i.m23582a(r4, r5)
            java.lang.Object r4 = kotlin.collections.C7525m.m23511f(r4)
            java.lang.String r5 = "replyComments.first()"
            kotlin.jvm.internal.C7573i.m23582a(r4, r5)
            com.ss.android.ugc.aweme.comment.model.Comment r4 = (com.p280ss.android.ugc.aweme.comment.model.Comment) r4
            com.ss.android.ugc.aweme.profile.model.User r4 = r4.getUser()
            java.lang.String r4 = com.p280ss.android.ugc.aweme.utils.C43122ff.m136770c(r4)
            goto L_0x0058
        L_0x0056:
            java.lang.String r4 = ""
        L_0x0058:
            r5 = r4
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L_0x0065
            java.lang.String r4 = r19.getReplyToUserName()
        L_0x0065:
            if (r1 == 0) goto L_0x0128
            if (r2 <= 0) goto L_0x0128
            int r5 = r19.getLabelType()
            if (r5 <= 0) goto L_0x0128
            java.lang.String r5 = r19.getLabelText()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0128
            r5 = r4
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L_0x008b
            java.lang.String r5 = "："
            float r5 = r1.measureText(r5)
            goto L_0x008c
        L_0x008b:
            r5 = 0
        L_0x008c:
            android.text.SpannableString r6 = new android.text.SpannableString
            java.lang.String r7 = r19.getLabelText()
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r6.<init>(r7)
            com.ss.android.ugc.aweme.comment.h.c$a r7 = new com.ss.android.ugc.aweme.comment.h.c$a
            int r8 = r19.getLabelType()
            r7.<init>(r8)
            java.lang.String r8 = r19.getLabelText()
            int r8 = r8.length()
            int r8 = r8 + -1
            r9 = 33
            r10 = 0
            r6.setSpan(r7, r10, r8, r9)
            android.text.StaticLayout r8 = new android.text.StaticLayout
            r12 = r6
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            android.text.TextPaint r13 = r7.mo62572a(r1)
            r14 = 10000(0x2710, float:1.4013E-41)
            android.text.Layout$Alignment r15 = android.text.Layout.Alignment.ALIGN_NORMAL
            r16 = 1065353216(0x3f800000, float:1.0)
            r17 = 0
            r18 = 0
            r11 = r8
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            float r6 = r8.getLineWidth(r10)
            float r7 = r1.measureText(r3)
            float r7 = r7 + r6
            float r7 = r7 + r5
            float r2 = (float) r2
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 <= 0) goto L_0x0128
            java.lang.String r7 = "..."
            float r8 = r1.measureText(r7)
        L_0x00dc:
            java.lang.String r9 = "username"
            kotlin.jvm.internal.C7573i.m23582a(r3, r9)
            int r9 = r3.length()
            int r9 = r9 + -1
            if (r3 == 0) goto L_0x0120
            java.lang.String r3 = r3.substring(r10, r9)
            java.lang.String r9 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            kotlin.jvm.internal.C7573i.m23582a(r3, r9)
            float r9 = r1.measureText(r3)
            float r9 = r9 + r6
            float r9 = r9 + r8
            float r9 = r9 + r5
            int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r9 > 0) goto L_0x00dc
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r7)
            java.lang.String r3 = r1.toString()
            com.ss.android.ugc.aweme.profile.model.User r1 = r19.getUser()
            java.lang.String r1 = com.p280ss.android.ugc.aweme.utils.C43122ff.m136770c(r1)
            int r1 = r1.length()
            int r2 = r3.length()
            int r1 = r1 - r2
            r0.offset = r1
            goto L_0x0128
        L_0x0120:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            r0.<init>(r1)
            throw r0
        L_0x0128:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            int r2 = r19.getLabelType()
            if (r2 <= 0) goto L_0x013a
            java.lang.String r2 = r19.getLabelText()
            r1.append(r2)
        L_0x013a:
            r2 = r4
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0162
            java.lang.String r2 = " "
            r1.append(r2)
            android.content.Context r2 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131826220(0x7f11162c, float:1.9285318E38)
            java.lang.String r2 = r2.getString(r3)
            r1.append(r2)
            java.lang.String r2 = " "
            r1.append(r2)
            r1.append(r4)
        L_0x0162:
            java.lang.String r1 = r1.toString()
            r0.mUserNamePrefix = r1
        L_0x0168:
            java.lang.String r0 = r0.mUserNamePrefix
            java.lang.String r1 = "mUserNamePrefix"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.comment.p1101h.C24148e.m79349d(com.ss.android.ugc.aweme.comment.model.Comment, android.graphics.Paint, int):java.lang.String");
    }

    /* renamed from: a */
    public static final List<TextExtraStruct> m79340a(CommentStruct commentStruct, Context context, Aweme aweme) {
        C7573i.m23587b(commentStruct, "$this$getDisplayLinkTextExtra");
        C7573i.m23587b(context, "context");
        C7573i.m23587b(aweme, "aweme");
        ArrayList arrayList = new ArrayList();
        int length = commentStruct.getCommentInfo().length() + 1;
        int i = length + 7;
        TextExtraStruct textExtraStruct = new TextExtraStruct();
        textExtraStruct.setType(TextExtraStruct.TYPE_CUSTOM);
        textExtraStruct.setCustomSpan(C24220a.m79551a().getLinkTagSpan(context, aweme));
        textExtraStruct.setStart(length);
        textExtraStruct.setEnd(i);
        arrayList.add(textExtraStruct);
        int i2 = i + 1;
        int length2 = i + m79347c(commentStruct).length();
        TextExtraStruct textExtraStruct2 = new TextExtraStruct();
        textExtraStruct2.setType(TextExtraStruct.TYPE_CUSTOM);
        textExtraStruct2.setCustomSpan(new C24145b(C23486n.m77122a(13.0d), C0683b.m2912c(C6399b.m19921a(), R.color.lz)));
        textExtraStruct2.setStart(i2);
        textExtraStruct2.setEnd(length2);
        arrayList.add(textExtraStruct2);
        return arrayList;
    }

    /* renamed from: a */
    public static /* synthetic */ String m79335a(Comment comment, String str, int i, Object obj) {
        String text = comment.getText();
        C7573i.m23582a((Object) text, "text");
        return m79334a(comment, text);
    }

    /* renamed from: a */
    public static /* synthetic */ String m79338a(Comment comment, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return m79337a(comment, z, false);
    }
}
