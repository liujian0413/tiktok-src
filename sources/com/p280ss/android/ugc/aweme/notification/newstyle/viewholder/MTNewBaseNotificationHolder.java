package com.p280ss.android.ugc.aweme.notification.newstyle.viewholder;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.notification.adapter.MTBaseNotificationHolder;
import com.p280ss.android.ugc.aweme.notification.newstyle.C34538e;
import com.p280ss.android.ugc.aweme.notification.newstyle.adapter.C34513c;
import com.p280ss.android.ugc.aweme.notification.p1444ui.C34606a;
import com.p280ss.android.ugc.aweme.notification.util.C34624i;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.aweme.utils.C43126fg;
import com.p280ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewBaseNotificationHolder */
public class MTNewBaseNotificationHolder extends MTBaseNotificationHolder {

    /* renamed from: h */
    static final /* synthetic */ C7595j[] f90182h = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(MTNewBaseNotificationHolder.class), "normalTextColor", "getNormalTextColor()I")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(MTNewBaseNotificationHolder.class), "pressedTextColor", "getPressedTextColor()I")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(MTNewBaseNotificationHolder.class), "andText", "getAndText()Ljava/lang/String;"))};

    /* renamed from: i */
    public static final boolean f90183i = C7163a.m22363a();

    /* renamed from: j */
    public static final C34570a f90184j = new C34570a(null);

    /* renamed from: d */
    private final C7541d f90185d = C7546e.m23569a(new C34572c(this));

    /* renamed from: e */
    private final C7541d f90186e = C7546e.m23569a(new C34574e(this));

    /* renamed from: f */
    private final C7541d f90187f = C7546e.m23569a(new C34571b(this));

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewBaseNotificationHolder$a */
    public static final class C34570a {
        private C34570a() {
        }

        /* renamed from: a */
        private static boolean m111772a() {
            return MTNewBaseNotificationHolder.f90183i;
        }

        public /* synthetic */ C34570a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public final String mo87870a(BaseNotice baseNotice, boolean z) {
            if (C34538e.m111691b()) {
                return "notification_page";
            }
            if (baseNotice != null) {
                int a = C34513c.m111621a(baseNotice);
                if (a != 9) {
                    if (a != 31) {
                        if (a != 33) {
                            if (a != 41) {
                                if (a != 45) {
                                    return "notification_page";
                                }
                                if (z) {
                                    return "at";
                                }
                                return "message_at";
                            } else if (z) {
                                return "like";
                            } else {
                                return "message_like";
                            }
                        } else if (z) {
                            return "fans";
                        } else {
                            return "message_fans";
                        }
                    } else if (z) {
                        return "comment";
                    } else {
                        return "message_comment";
                    }
                } else if (z) {
                    return "pollsticker";
                } else {
                    return "message_vote";
                }
            } else if (!m111772a()) {
                return "notification_page";
            } else {
                throw new IllegalStateException("黑T请传basenotice字段");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewBaseNotificationHolder$b */
    static final class C34571b extends Lambda implements C7561a<String> {

        /* renamed from: a */
        final /* synthetic */ MTNewBaseNotificationHolder f90188a;

        C34571b(MTNewBaseNotificationHolder mTNewBaseNotificationHolder) {
            this.f90188a = mTNewBaseNotificationHolder;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public String invoke() {
            return this.f90188a.f89761c.getString(R.string.cpo);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewBaseNotificationHolder$c */
    static final class C34572c extends Lambda implements C7561a<Integer> {

        /* renamed from: a */
        final /* synthetic */ MTNewBaseNotificationHolder f90189a;

        C34572c(MTNewBaseNotificationHolder mTNewBaseNotificationHolder) {
            this.f90189a = mTNewBaseNotificationHolder;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(m111775a());
        }

        /* renamed from: a */
        private int m111775a() {
            Context context = this.f90189a.f89761c;
            C7573i.m23582a((Object) context, "context");
            return context.getResources().getColor(R.color.a4z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewBaseNotificationHolder$d */
    public static final class C34573d implements C34584a {

        /* renamed from: a */
        final /* synthetic */ MTNewBaseNotificationHolder f90190a;

        /* renamed from: b */
        final /* synthetic */ int f90191b;

        /* renamed from: c */
        final /* synthetic */ BaseNotice f90192c;

        /* renamed from: d */
        final /* synthetic */ String f90193d;

        /* renamed from: e */
        final /* synthetic */ String f90194e;

        /* renamed from: f */
        final /* synthetic */ boolean f90195f;

        /* JADX WARNING: Removed duplicated region for block: B:23:0x0069  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo87871a(android.view.View r16, com.p280ss.android.ugc.aweme.profile.model.User r17, int r18) {
            /*
                r15 = this;
                r0 = r15
                java.lang.String r1 = "v"
                r2 = r16
                kotlin.jvm.internal.C7573i.m23587b(r2, r1)
                int r1 = r0.f90191b
                switch(r1) {
                    case 0: goto L_0x00ba;
                    case 1: goto L_0x0023;
                    case 2: goto L_0x000f;
                    default: goto L_0x000d;
                }
            L_0x000d:
                goto L_0x0122
            L_0x000f:
                java.lang.String r1 = "check_profile"
                com.ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewBaseNotificationHolder r3 = r0.f90190a
                int r3 = r3.getLayoutPosition()
                com.p280ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewBaseNotificationHolder.m111206a(r1, r3)
                android.content.Context r1 = r16.getContext()
                com.p280ss.android.ugc.aweme.notification.utils.C34636e.m111893a(r1)
                goto L_0x0122
            L_0x0023:
                com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice r1 = r0.f90192c
                if (r1 == 0) goto L_0x00b9
                com.ss.android.ugc.aweme.notice.repo.list.bean.DiggNotice r1 = r1.getDiggNotice()
                if (r1 == 0) goto L_0x00b9
                boolean r3 = com.p280ss.android.ugc.aweme.notification.newstyle.C34538e.m111693d()
                if (r3 == 0) goto L_0x009c
                int r3 = r1.getDiggType()
                if (r3 == 0) goto L_0x009c
                int r3 = r1.getDiggType()
                r4 = 3
                r5 = 0
                if (r3 != r4) goto L_0x004f
                com.ss.android.ugc.aweme.comment.model.Comment r3 = r1.getComment()
                if (r3 == 0) goto L_0x004d
                java.lang.String r3 = r3.getCid()
            L_0x004b:
                r8 = r3
                goto L_0x005a
            L_0x004d:
                r8 = r5
                goto L_0x005a
            L_0x004f:
                com.ss.android.ugc.aweme.feed.model.Aweme r3 = r1.getAweme()
                if (r3 == 0) goto L_0x004d
                java.lang.String r3 = r3.getAid()
                goto L_0x004b
            L_0x005a:
                android.content.Context r6 = r16.getContext()
                java.lang.String r2 = "v.context"
                kotlin.jvm.internal.C7573i.m23582a(r6, r2)
                com.ss.android.ugc.aweme.feed.model.Aweme r2 = r1.getAweme()
                if (r2 == 0) goto L_0x006d
                java.lang.String r5 = r2.getAid()
            L_0x006d:
                r7 = r5
                boolean r9 = r0.f90195f
                int r10 = r1.getDiggType()
                com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice r2 = r0.f90192c
                long r11 = r2.getLastReadTime()
                com.ss.android.ugc.aweme.comment.model.Comment r2 = r1.getComment()
                java.lang.String r13 = com.p280ss.android.ugc.aweme.notification.newstyle.model.C34554a.m111727a(r2)
                com.ss.android.ugc.aweme.feed.model.Aweme r1 = r1.getAweme()
                java.lang.String r2 = "this.aweme"
                kotlin.jvm.internal.C7573i.m23582a(r1, r2)
                com.ss.android.ugc.aweme.feed.model.Video r1 = r1.getVideo()
                java.lang.String r2 = "this.aweme.video"
                kotlin.jvm.internal.C7573i.m23582a(r1, r2)
                com.ss.android.ugc.aweme.base.model.UrlModel r14 = r1.getOriginCover()
                com.p280ss.android.ugc.aweme.notification.newstyle.LikeListDetailActivity.C34455a.m111439a(r6, r7, r8, r9, r10, r11, r13, r14)
                goto L_0x00b9
            L_0x009c:
                com.ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewBaseNotificationHolder r2 = r0.f90190a
                com.ss.android.ugc.aweme.feed.model.Aweme r3 = r1.getAweme()
                java.lang.String r4 = "aweme"
                kotlin.jvm.internal.C7573i.m23582a(r3, r4)
                java.lang.String r3 = r3.getAid()
                java.lang.String r4 = "aweme.aid"
                kotlin.jvm.internal.C7573i.m23582a(r3, r4)
                java.lang.String r1 = r1.getCid()
                r2.mo87869a(r3, r1)
                goto L_0x0122
            L_0x00b9:
                return
            L_0x00ba:
                com.ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewBaseNotificationHolder$a r1 = com.p280ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewBaseNotificationHolder.f90184j
                com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice r2 = r0.f90192c
                r3 = 1
                java.lang.String r6 = r1.mo87870a(r2, r3)
                r1 = r6
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                java.lang.String r2 = "fans"
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                boolean r1 = android.text.TextUtils.equals(r1, r2)
                if (r1 == 0) goto L_0x00e6
                com.ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewBaseNotificationHolder r1 = r0.f90190a
                android.content.Context r1 = r1.f89761c
                java.lang.String r2 = "context"
                kotlin.jvm.internal.C7573i.m23582a(r1, r2)
                java.lang.String r2 = "fans"
                com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice r3 = r0.f90192c
                if (r3 == 0) goto L_0x00e2
                int r3 = r3.clientOrder
                goto L_0x00e3
            L_0x00e2:
                r3 = -1
            L_0x00e3:
                com.p280ss.android.ugc.aweme.notification.newstyle.C34538e.m111688a(r1, r2, r3)
            L_0x00e6:
                boolean r1 = com.bytedance.ies.ugc.appcontext.C6399b.m19947w()
                if (r1 == 0) goto L_0x00f9
                com.ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewBaseNotificationHolder r4 = r0.f90190a
                java.lang.String r5 = "click"
                com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice r7 = r0.f90192c
                java.lang.String r8 = r0.f90193d
                java.lang.String r9 = r0.f90194e
                r4.mo87668a(r5, r6, r7, r8, r9)
            L_0x00f9:
                if (r17 == 0) goto L_0x0122
                com.ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewBaseNotificationHolder r2 = r0.f90190a
                java.lang.String r3 = r17.getUid()
                java.lang.String r4 = "user.uid"
                kotlin.jvm.internal.C7573i.m23582a(r3, r4)
                java.lang.String r4 = r17.getSecUid()
                java.lang.String r1 = "user.secUid"
                kotlin.jvm.internal.C7573i.m23582a(r4, r1)
                com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice r5 = r0.f90192c
                r6 = 1
                r7 = 0
                r8 = 16
                r9 = 0
                r1 = r2
                r2 = r3
                r3 = r4
                r4 = r5
                r5 = r6
                r6 = r7
                r7 = r8
                r8 = r9
                com.p280ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewBaseNotificationHolder.m111761a(r1, r2, r3, r4, r5, r6, r7, r8)
                return
            L_0x0122:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewBaseNotificationHolder.C34573d.mo87871a(android.view.View, com.ss.android.ugc.aweme.profile.model.User, int):void");
        }

        C34573d(MTNewBaseNotificationHolder mTNewBaseNotificationHolder, int i, BaseNotice baseNotice, String str, String str2, boolean z) {
            this.f90190a = mTNewBaseNotificationHolder;
            this.f90191b = i;
            this.f90192c = baseNotice;
            this.f90193d = str;
            this.f90194e = str2;
            this.f90195f = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewBaseNotificationHolder$e */
    static final class C34574e extends Lambda implements C7561a<Integer> {

        /* renamed from: a */
        final /* synthetic */ MTNewBaseNotificationHolder f90196a;

        C34574e(MTNewBaseNotificationHolder mTNewBaseNotificationHolder) {
            this.f90196a = mTNewBaseNotificationHolder;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(m111777a());
        }

        /* renamed from: a */
        private int m111777a() {
            Context context = this.f90196a.f89761c;
            C7573i.m23582a((Object) context, "context");
            return context.getResources().getColor(R.color.a51);
        }
    }

    /* renamed from: d */
    private int m111764d() {
        return ((Number) this.f90185d.getValue()).intValue();
    }

    /* renamed from: e */
    private int m111765e() {
        return ((Number) this.f90186e.getValue()).intValue();
    }

    /* renamed from: f */
    private String m111766f() {
        return (String) this.f90187f.getValue();
    }

    /* renamed from: c */
    public int mo87655c() {
        return R.id.c7r;
    }

    /* renamed from: a */
    public final void mo87867a(TextView textView, User user, BaseNotice baseNotice, String str, String str2) {
        C7573i.m23587b(textView, "textView");
        C7573i.m23587b(user, "user");
        textView.setText(m111755a(user, baseNotice, str, str2));
        textView.setMovementMethod(C34606a.m111843a());
        Context context = this.f89761c;
        UserVerify userVerify = new UserVerify(null, user.getCustomVerify(), user.getEnterpriseVerifyReason(), null, null, 25, null);
        C43126fg.m136800a(context, userVerify, textView);
    }

    /* renamed from: a */
    public final void mo87868a(TextView textView, List<? extends User> list, int i, int i2, BaseNotice baseNotice, boolean z, String str, String str2) {
        TextView textView2 = textView;
        List<? extends User> list2 = list;
        C7573i.m23587b(textView, "textView");
        textView.setText(m111756a(list, i, i2, baseNotice, z, str, str2));
        textView.setMovementMethod(C34606a.m111843a());
        if (list2 != null) {
            if (list.size() == 1) {
                Context context = this.f89761c;
                UserVerify userVerify = new UserVerify(null, ((User) list.get(0)).getCustomVerify(), ((User) list.get(0)).getEnterpriseVerifyReason(), null, null, 25, null);
                C43126fg.m136800a(context, userVerify, textView);
            }
            return;
        }
    }

    /* renamed from: a */
    public final void mo87866a(TextView textView, SpannableStringBuilder spannableStringBuilder, int i, int i2, User user, BaseNotice baseNotice, String str, String str2) {
        TextView textView2 = textView;
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        int i3 = i;
        int i4 = i2;
        C7573i.m23587b(textView, "textView");
        C7573i.m23587b(spannableStringBuilder2, "builder");
        User user2 = user;
        C7573i.m23587b(user2, "user");
        spannableStringBuilder2.setSpan(m111758a(user2, 0, baseNotice, true, str, str2), i3, i4, 33);
        spannableStringBuilder2.setSpan(new ForegroundColorSpan(m111764d()), i3, i4, 33);
        textView.setMovementMethod(C34606a.m111843a());
    }

    /* renamed from: a */
    public final void mo87869a(String str, String str2) {
        C7573i.m23587b(str, "aid");
        C7195s a = C7195s.m22438a();
        StringBuilder sb = new StringBuilder("aweme://aweme/detail/");
        sb.append(str);
        a.mo18682a(C7203u.m22460a(sb.toString()).mo18694a("refer", "message").mo18694a("cid", str2).mo18695a());
        C34538e eVar = C34538e.f90108a;
        Context context = this.f89761c;
        C7573i.m23582a((Object) context, "context");
        eVar.mo87841a(context);
    }

    /* renamed from: a */
    private void m111763a(String str, String str2, BaseNotice baseNotice, boolean z, String str3) {
        C7573i.m23587b(str, "uid");
        C7573i.m23587b(str2, "secUid");
        mo87669b(str, str2, "message");
        if (TextUtils.isEmpty(str3)) {
            str3 = f90184j.mo87870a(baseNotice, false);
        }
        m111134a(str, str3, z ? "click_name" : "click_head");
    }

    public MTNewBaseNotificationHolder(View view) {
        C7573i.m23587b(view, "itemView");
        super(view);
    }

    /* renamed from: a */
    private final SpannableStringBuilder m111755a(User user, BaseNotice baseNotice, String str, String str2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        m111762a(user, spannableStringBuilder, baseNotice, str, str2);
        return spannableStringBuilder;
    }

    /* renamed from: a */
    private final void m111762a(User user, SpannableStringBuilder spannableStringBuilder, BaseNotice baseNotice, String str, String str2) {
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        int length = spannableStringBuilder.length();
        CharSequence a = C34538e.m111685a(user);
        if (!TextUtils.isEmpty(a)) {
            spannableStringBuilder.append(a);
            spannableStringBuilder.setSpan(m111758a(user, 0, baseNotice, true, str, str2), length, spannableStringBuilder.length(), 33);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C34624i m111758a(User user, int i, BaseNotice baseNotice, boolean z, String str, String str2) {
        int d = m111764d();
        int e = m111765e();
        C34573d dVar = new C34573d(this, i, baseNotice, str, str2, z);
        C34624i iVar = new C34624i(user, i, d, e, dVar);
        return iVar;
    }

    /* renamed from: a */
    private final SpannableStringBuilder m111756a(List<? extends User> list, int i, int i2, BaseNotice baseNotice, boolean z, String str, String str2) {
        int i3;
        int i4;
        List<? extends User> list2 = list;
        int i5 = i;
        int i6 = i2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (list2 != null && !list.isEmpty()) {
            if (list.size() == 1) {
                return m111755a((User) list2.get(0), baseNotice, str, str2);
            }
            BaseNotice baseNotice2 = baseNotice;
            String str3 = str;
            String str4 = str2;
            if (list.size() != 2 || 1 > i6 || 3 < i6) {
                if (list.size() == 3) {
                    i3 = 2;
                    i4 = 0;
                } else if (i6 == 3 && list.size() > 3) {
                    i4 = 0;
                    i3 = 2;
                } else if (list.size() > 1) {
                    SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
                    BaseNotice baseNotice3 = baseNotice;
                    String str5 = str;
                    String str6 = str2;
                    m111762a((User) list2.get(0), spannableStringBuilder2, baseNotice3, str5, str6);
                    spannableStringBuilder.append(",").append(" ");
                    m111762a((User) list2.get(1), spannableStringBuilder2, baseNotice3, str5, str6);
                    spannableStringBuilder.append(" ").append(m111766f()).append(" ");
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append(this.f89761c.getString(R.string.cpn, new Object[]{Integer.valueOf(Math.max(i6, list.size()) - 2)}));
                    if (i5 == 2) {
                        spannableStringBuilder.setSpan(m111758a(null, 2, baseNotice, true, str, str2), length, spannableStringBuilder.length(), 33);
                    } else {
                        int i7 = length;
                        if (i5 == 1) {
                            spannableStringBuilder.setSpan(m111758a(null, 1, baseNotice, z, str, str2), i7, spannableStringBuilder.length(), 33);
                        }
                    }
                }
                SpannableStringBuilder spannableStringBuilder3 = spannableStringBuilder;
                BaseNotice baseNotice4 = baseNotice;
                String str7 = str;
                String str8 = str2;
                m111762a((User) list2.get(i4), spannableStringBuilder3, baseNotice4, str7, str8);
                spannableStringBuilder.append(", ");
                m111762a((User) list2.get(1), spannableStringBuilder3, baseNotice4, str7, str8);
                spannableStringBuilder.append(" ").append(m111766f()).append(" ");
                m111762a((User) list2.get(i3), spannableStringBuilder3, baseNotice4, str7, str8);
            } else {
                SpannableStringBuilder spannableStringBuilder4 = spannableStringBuilder;
                BaseNotice baseNotice5 = baseNotice;
                String str9 = str;
                String str10 = str2;
                m111762a((User) list2.get(0), spannableStringBuilder4, baseNotice5, str9, str10);
                spannableStringBuilder.append(" ").append(m111766f()).append(" ");
                m111762a((User) list2.get(1), spannableStringBuilder4, baseNotice5, str9, str10);
            }
        }
        return spannableStringBuilder;
    }

    /* renamed from: a */
    public static /* synthetic */ void m111761a(MTNewBaseNotificationHolder mTNewBaseNotificationHolder, String str, String str2, BaseNotice baseNotice, boolean z, String str3, int i, Object obj) {
        boolean z2;
        if ((i & 4) != 0) {
            baseNotice = null;
        }
        BaseNotice baseNotice2 = baseNotice;
        if ((i & 8) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        if ((i & 16) != 0) {
            str3 = "";
        }
        mTNewBaseNotificationHolder.m111763a(str, str2, baseNotice2, z2, str3);
    }
}
