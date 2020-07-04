package com.p280ss.android.ugc.aweme.friends.adapter;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.base.BaseViewHolder;
import com.bytedance.ies.dmt.p262ui.common.C10774c;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.github.p739a.p740a.C14689a;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageWithVerify;
import com.p280ss.android.ugc.aweme.challenge.model.Segment;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.friends.adapter.AtFriendsAdapter.C30007a;
import com.p280ss.android.ugc.aweme.friends.model.SummonFriendItem;
import com.p280ss.android.ugc.aweme.friends.p1281a.C30000b;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.p313im.C30553b;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.utils.C43126fg;
import com.p280ss.android.ugc.aweme.utils.UserVerify;
import com.taobao.android.dexposed.ClassUtils;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.friends.adapter.AtFriendsSearchAdapter */
public final class AtFriendsSearchAdapter extends LoadMoreRecyclerViewAdapter {

    /* renamed from: f */
    public static final C30013b f78859f = new C30013b(null);

    /* renamed from: a */
    public List<? extends IMUser> f78860a;

    /* renamed from: b */
    public List<? extends SummonFriendItem> f78861b;

    /* renamed from: c */
    public String f78862c = "";

    /* renamed from: d */
    public int f78863d = -1;

    /* renamed from: e */
    public C30012a f78864e;

    /* renamed from: com.ss.android.ugc.aweme.friends.adapter.AtFriendsSearchAdapter$AtViewHolder */
    public static final class AtViewHolder extends BaseViewHolder<IMUser> {

        /* renamed from: a */
        static final /* synthetic */ C7595j[] f78865a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(AtViewHolder.class), "highlightColor", "getHighlightColor()I")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(AtViewHolder.class), "douyinNickNamePrefix", "getDouyinNickNamePrefix()Ljava/lang/String;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(AtViewHolder.class), "idPrefix", "getIdPrefix()Ljava/lang/String;"))};

        /* renamed from: b */
        public TextView f78866b;

        /* renamed from: c */
        public TextView f78867c;

        /* renamed from: d */
        public AvatarImageWithVerify f78868d;

        /* renamed from: e */
        public TextView f78869e;

        /* renamed from: f */
        public TextView f78870f;

        /* renamed from: g */
        public ImageView f78871g;

        /* renamed from: h */
        public int f78872h = -1;

        /* renamed from: i */
        public String f78873i = "";

        /* renamed from: j */
        public C30012a f78874j;

        /* renamed from: k */
        public final View f78875k;

        /* renamed from: l */
        public final AtFriendsSearchAdapter f78876l;

        /* renamed from: m */
        private final C7541d f78877m = C7546e.m23569a(new C30010c(this));

        /* renamed from: n */
        private final C7541d f78878n = C7546e.m23569a(new C30009b(this));

        /* renamed from: o */
        private final C7541d f78879o = C7546e.m23569a(new C30011d(this));

        /* renamed from: com.ss.android.ugc.aweme.friends.adapter.AtFriendsSearchAdapter$AtViewHolder$a */
        static final class C30008a implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ AtViewHolder f78880a;

            /* renamed from: b */
            final /* synthetic */ User f78881b;

            C30008a(AtViewHolder atViewHolder, User user) {
                this.f78880a = atViewHolder;
                this.f78881b = user;
            }

            public final void onClick(View view) {
                String str;
                ClickInstrumentation.onClick(view);
                if (C6399b.m19944t() && this.f78880a.f78872h == 0) {
                    String str2 = "add_video_at";
                    C22984d a = C22984d.m75611a().mo59973a("search_keyword", this.f78880a.f78873i);
                    String str3 = "log_pb";
                    C28199ae a2 = C28199ae.m92689a();
                    C30012a aVar = this.f78880a.f78874j;
                    if (aVar != null) {
                        str = aVar.mo76208a();
                    } else {
                        str = null;
                    }
                    C6907h.m21528b(str2, C33230ac.m107211a(a.mo59973a(str3, a2.mo71791a(str)).mo59973a("to_user_id", this.f78881b.getUid()).f60753a));
                }
                IAccountUserService a3 = C21115b.m71197a();
                C7573i.m23582a((Object) a3, "AccountUserProxyService.get()");
                if (!TextUtils.equals(a3.getCurUserId(), this.f78881b.getUid())) {
                    C6907h.onEvent(MobClick.obtain().setEventName("at_friend").setLabelName("friend_list").setValue(this.f78881b.getUid()));
                    C42961az.m136380a(new C30000b(this.f78881b));
                    return;
                }
                View view2 = this.f78880a.itemView;
                C7573i.m23582a((Object) view2, "itemView");
                C10761a.m31399c(view2.getContext(), (int) R.string.cly).mo25750a();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.friends.adapter.AtFriendsSearchAdapter$AtViewHolder$b */
        static final class C30009b extends Lambda implements C7561a<String> {

            /* renamed from: a */
            final /* synthetic */ AtViewHolder f78882a;

            C30009b(AtViewHolder atViewHolder) {
                this.f78882a = atViewHolder;
                super(0);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public String invoke() {
                return this.f78882a.f78875k.getResources().getString(R.string.b8x);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.friends.adapter.AtFriendsSearchAdapter$AtViewHolder$c */
        static final class C30010c extends Lambda implements C7561a<Integer> {

            /* renamed from: a */
            final /* synthetic */ AtViewHolder f78883a;

            C30010c(AtViewHolder atViewHolder) {
                this.f78883a = atViewHolder;
                super(0);
            }

            /* renamed from: a */
            private int m98391a() {
                return this.f78883a.f78875k.getResources().getColor(R.color.a4p);
            }

            public final /* synthetic */ Object invoke() {
                return Integer.valueOf(m98391a());
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.friends.adapter.AtFriendsSearchAdapter$AtViewHolder$d */
        static final class C30011d extends Lambda implements C7561a<String> {

            /* renamed from: a */
            final /* synthetic */ AtViewHolder f78884a;

            C30011d(AtViewHolder atViewHolder) {
                this.f78884a = atViewHolder;
                super(0);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public String invoke() {
                return this.f78884a.f78875k.getResources().getString(R.string.bfu);
            }
        }

        /* renamed from: b */
        private int m98382b() {
            return ((Number) this.f78877m.getValue()).intValue();
        }

        /* renamed from: c */
        private final String m98384c() {
            return (String) this.f78878n.getValue();
        }

        /* renamed from: d */
        private final String m98385d() {
            return (String) this.f78879o.getValue();
        }

        /* renamed from: a */
        public final void mo25667a() {
        }

        /* renamed from: a */
        public final void mo76206a(String str) {
            C7573i.m23587b(str, "<set-?>");
            this.f78873i = str;
        }

        /* renamed from: a */
        private final void m98381a(User user) {
            View view = this.itemView;
            C7573i.m23582a((Object) view, "itemView");
            View view2 = this.itemView;
            C7573i.m23582a((Object) view2, "itemView");
            view.setBackground(C10774c.m31449e(view2.getContext()));
            AvatarImageWithVerify avatarImageWithVerify = this.f78868d;
            String customVerify = user.getCustomVerify();
            Integer valueOf = Integer.valueOf(user.getVerificationType());
            UserVerify userVerify = new UserVerify(user.getAvatarThumb(), customVerify, user.getEnterpriseVerifyReason(), valueOf, user.getWeiboVerify());
            avatarImageWithVerify.setUserData(userVerify);
            if (C6399b.m19944t()) {
                this.f78868d.mo60896b();
                View view3 = this.itemView;
                C7573i.m23582a((Object) view3, "itemView");
                C43126fg.m136801a(view3.getContext(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), this.f78869e);
            }
            if (user.getFollowStatus() == 2) {
                this.f78871g.setVisibility(0);
                this.f78871g.setImageResource(R.drawable.a1i);
            } else {
                this.f78871g.setVisibility(8);
            }
            this.f78867c.setVisibility(8);
            this.f78875k.setOnClickListener(new C30008a(this, user));
        }

        public AtViewHolder(View view, AtFriendsSearchAdapter atFriendsSearchAdapter) {
            C7573i.m23587b(view, "container");
            C7573i.m23587b(atFriendsSearchAdapter, "adapter");
            super(view);
            this.f78875k = view;
            this.f78876l = atFriendsSearchAdapter;
            View findViewById = this.f78875k.findViewById(R.id.d1t);
            C7573i.m23582a((Object) findViewById, "container.findViewById(R.id.sectionLabel)");
            this.f78866b = (TextView) findViewById;
            View findViewById2 = this.f78875k.findViewById(R.id.b0j);
            C7573i.m23582a((Object) findViewById2, "container.findViewById(R.id.indexLabel)");
            this.f78867c = (TextView) findViewById2;
            View findViewById3 = this.f78875k.findViewById(R.id.ic);
            C7573i.m23582a((Object) findViewById3, "container.findViewById(R.id.avatar)");
            this.f78868d = (AvatarImageWithVerify) findViewById3;
            View findViewById4 = this.f78875k.findViewById(R.id.c33);
            C7573i.m23582a((Object) findViewById4, "container.findViewById(R.id.name)");
            this.f78869e = (TextView) findViewById4;
            View findViewById5 = this.f78875k.findViewById(R.id.a7e);
            C7573i.m23582a((Object) findViewById5, "container.findViewById(R.id.desc)");
            this.f78870f = (TextView) findViewById5;
            View findViewById6 = this.f78875k.findViewById(R.id.crd);
            C7573i.m23582a((Object) findViewById6, "container.findViewById(R.id.relation)");
            this.f78871g = (ImageView) findViewById6;
        }

        /* renamed from: a */
        public final void mo76204a(SummonFriendItem summonFriendItem, int i) {
            int i2;
            C7573i.m23587b(summonFriendItem, "data");
            User user = summonFriendItem.mUser;
            List<? extends IMUser> list = this.f78876l.f78860a;
            if (list != null) {
                i2 = list.size();
            } else {
                i2 = 0;
            }
            if (i == i2) {
                this.f78866b.setVisibility(0);
                this.f78866b.setText(R.string.lm);
            } else {
                this.f78866b.setVisibility(8);
            }
            this.f78870f.setVisibility(0);
            if (C6399b.m19946v()) {
                StringBuilder sb = new StringBuilder("@");
                sb.append(C43122ff.m136777h(user));
                this.f78870f.setText(sb.toString());
            } else {
                C7573i.m23582a((Object) user, "user");
                if (TextUtils.isEmpty(user.getSignature())) {
                    this.f78870f.setVisibility(8);
                } else {
                    this.f78870f.setText(user.getSignature());
                }
            }
            C7573i.m23582a((Object) user, "user");
            SpannableString spannableString = new SpannableString(user.getNickname());
            List<Segment> list2 = summonFriendItem.segments;
            if (list2 != null) {
                for (Segment segment : list2) {
                    C7573i.m23582a((Object) segment, "seg");
                    spannableString = m98379a(spannableString, segment.begin, segment.end + 1);
                }
            }
            this.f78869e.setText(spannableString);
            m98381a(user);
        }

        /* renamed from: a */
        public final void mo76205a(IMUser iMUser, int i) {
            C7573i.m23587b(iMUser, "user");
            this.f78869e.setText(iMUser.getNickName());
            if (i == 0) {
                this.f78866b.setVisibility(0);
                this.f78866b.setText(R.string.lq);
            } else {
                this.f78866b.setVisibility(8);
            }
            m98380a(this.f78869e, iMUser, this.f78876l.f78862c);
            m98383b(this.f78870f, iMUser, this.f78876l.f78862c);
            m98381a(C30007a.m98373a(iMUser));
        }

        /* renamed from: a */
        private final SpannableString m98379a(SpannableString spannableString, int i, int i2) {
            CharSequence charSequence = spannableString;
            if (TextUtils.isEmpty(charSequence)) {
                return spannableString;
            }
            int max = Math.max(0, i);
            if (TextUtils.isEmpty(charSequence) || max > i2 || max >= spannableString.length() || i2 > spannableString.length()) {
                return spannableString;
            }
            spannableString.setSpan(new ForegroundColorSpan(m98382b()), max, i2, 17);
            return spannableString;
        }

        /* renamed from: a */
        private final void m98380a(TextView textView, IMUser iMUser, String str) {
            if (!C6399b.m19944t()) {
                if (iMUser.getSearchType() == 5) {
                    str = C30553b.m99810g().convertSearchKeyword(iMUser.getRemarkName(), iMUser.getRemarkPinyin(), iMUser.getRemarkInitial(), str);
                    C7573i.m23582a((Object) str, "IM.get().convertSearchKe…r.remarkInitial, keyword)");
                } else if (iMUser.getSearchType() == 3) {
                    str = C30553b.m99810g().convertSearchKeyword(iMUser.getNickName(), iMUser.getNickNamePinyin(), iMUser.getNickNameInitial(), str);
                    C7573i.m23582a((Object) str, "IM.get().convertSearchKe…nickNameInitial, keyword)");
                }
            } else if (str != null) {
                str = str.toLowerCase();
                C7573i.m23582a((Object) str, "(this as java.lang.String).toLowerCase()");
                String nickName = iMUser.getNickName();
                if (!TextUtils.isEmpty(nickName)) {
                    C7573i.m23582a((Object) nickName, "name");
                    if (nickName != null) {
                        String lowerCase = nickName.toLowerCase();
                        C7573i.m23582a((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
                        int a = C7634n.m23730a((CharSequence) lowerCase, str, 0, false, 6, (Object) null);
                        if (a != -1 && a < nickName.length() && str.length() + a <= nickName.length()) {
                            str = nickName.substring(a, str.length() + a);
                            C7573i.m23582a((Object) str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            int b = m98382b();
            String displayName = iMUser.getDisplayName();
            C7573i.m23582a((Object) displayName, "user.displayName");
            textView.setText(m98378a(b, displayName, str, 0));
        }

        /* renamed from: b */
        private final void m98383b(TextView textView, IMUser iMUser, String str) {
            String str2;
            textView.setVisibility(0);
            if (iMUser.getSearchType() == 5) {
                textView.setText(iMUser.getSignature());
            } else if (iMUser.getSearchType() == 3) {
                if (!TextUtils.isEmpty(iMUser.getRemarkName())) {
                    int b = m98382b();
                    StringBuilder sb = new StringBuilder();
                    sb.append(m98384c());
                    sb.append(iMUser.getNickName());
                    String sb2 = sb.toString();
                    String convertSearchKeyword = C30553b.m99810g().convertSearchKeyword(iMUser.getNickName(), iMUser.getNickNamePinyin(), iMUser.getNickNameInitial(), str);
                    C7573i.m23582a((Object) convertSearchKeyword, "IM.get().convertSearchKe…nickNameInitial, keyword)");
                    textView.setText(m98378a(b, sb2, convertSearchKeyword, m98384c().length()));
                } else if (C6399b.m19946v()) {
                    StringBuilder sb3 = new StringBuilder("@");
                    sb3.append(iMUser.getDisplayId());
                    textView.setText(sb3.toString());
                } else {
                    textView.setText(iMUser.getSignature());
                }
            } else if (iMUser.getSearchType() == 1) {
                if (C6399b.m19946v()) {
                    str2 = "@";
                } else {
                    str2 = m98385d();
                }
                String displayId = iMUser.getDisplayId();
                int b2 = m98382b();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str2);
                sb4.append(displayId);
                String sb5 = sb4.toString();
                String convertSearchKeyword2 = C30553b.m99810g().convertSearchKeyword(displayId, C30013b.m98394a(displayId), C30013b.m98395b(displayId), str);
                C7573i.m23582a((Object) convertSearchKeyword2, "IM.get().convertSearchKe…nyinInitial(id), keyword)");
                textView.setText(m98378a(b2, sb5, convertSearchKeyword2, str2.length()));
            } else if (iMUser.getSearchType() == 2) {
                int b3 = m98382b();
                String string = this.f78875k.getResources().getString(R.string.bia, new Object[]{iMUser.getContactName()});
                C7573i.m23582a((Object) string, "container.resources.getS…t_name, user.contactName)");
                String convertSearchKeyword3 = C30553b.m99810g().convertSearchKeyword(iMUser.getContactName(), iMUser.getContactNamePinyin(), iMUser.getContactNameInitial(), str);
                C7573i.m23582a((Object) convertSearchKeyword3, "IM.get().convertSearchKe…tactNameInitial, keyword)");
                textView.setText(m98378a(b3, string, convertSearchKeyword3, 6));
            } else {
                textView.setVisibility(8);
            }
            if (TextUtils.isEmpty(textView.getText())) {
                textView.setVisibility(8);
            }
        }

        /* renamed from: a */
        private static SpannableString m98378a(int i, String str, String str2, int i2) {
            if (C7634n.m23770b((CharSequence) str2, '.', false)) {
                str2 = C7634n.m23711a(str2, ClassUtils.PACKAGE_SEPARATOR, "\\.", false);
            }
            SpannableString spannableString = new SpannableString(str);
            try {
                Pattern compile = Pattern.compile(str2);
                if (compile == null) {
                    C7573i.m23580a();
                }
                Matcher matcher = compile.matcher(spannableString);
                if (matcher.find()) {
                    int start = matcher.start();
                    int end = matcher.end();
                    if (start >= i2) {
                        spannableString.setSpan(new ForegroundColorSpan(i), start, end, 33);
                    }
                }
                return spannableString;
            } catch (PatternSyntaxException unused) {
                return spannableString;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.adapter.AtFriendsSearchAdapter$a */
    public interface C30012a {
        /* renamed from: a */
        String mo76208a();
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.adapter.AtFriendsSearchAdapter$b */
    public static final class C30013b {
        private C30013b() {
        }

        public /* synthetic */ C30013b(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static String m98394a(String str) {
            if (str != null) {
                StringBuilder sb = new StringBuilder();
                if (str != null) {
                    CharSequence obj = C7634n.m23762b(str).toString();
                    for (int i = 0; i < obj.length(); i++) {
                        sb.append(C14689a.m42504a(obj.charAt(i)));
                    }
                    String sb2 = sb.toString();
                    if (sb2 != null) {
                        return sb2;
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                }
            }
            return "";
        }

        /* renamed from: b */
        public static String m98395b(String str) {
            if (str != null) {
                StringBuilder sb = new StringBuilder();
                if (str != null) {
                    CharSequence obj = C7634n.m23762b(str).toString();
                    for (int i = 0; i < obj.length(); i++) {
                        sb.append(C14689a.m42504a(obj.charAt(i)).charAt(0));
                    }
                    String sb2 = sb.toString();
                    if (sb2 != null) {
                        return sb2;
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                }
            }
            return "";
        }
    }

    /* renamed from: c */
    public final int mo60557c() {
        int i;
        List<? extends IMUser> list = this.f78860a;
        int i2 = 0;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        List<? extends SummonFriendItem> list2 = this.f78861b;
        if (list2 != null) {
            i2 = list2.size();
        }
        return i + i2;
    }

    /* renamed from: a */
    public final void mo76203a(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.f78862c = str;
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tc, viewGroup, false);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(pare…at_friend, parent, false)");
        return new AtViewHolder(inflate, this);
    }

    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        int i2;
        List<? extends IMUser> list = this.f78860a;
        if (list != null) {
            i2 = list.size();
        } else {
            i2 = 0;
        }
        if (vVar != null) {
            AtViewHolder atViewHolder = (AtViewHolder) vVar;
            atViewHolder.f78872h = this.f78863d;
            atViewHolder.mo76206a(this.f78862c);
            atViewHolder.f78874j = this.f78864e;
            if (i < i2) {
                List<? extends IMUser> list2 = this.f78860a;
                if (list2 != null) {
                    atViewHolder.mo76205a((IMUser) list2.get(i), i);
                } else {
                    return;
                }
            } else {
                List<? extends SummonFriendItem> list3 = this.f78861b;
                if (list3 != null) {
                    atViewHolder.mo76204a((SummonFriendItem) list3.get(i - i2), i);
                    return;
                }
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.friends.adapter.AtFriendsSearchAdapter.AtViewHolder");
    }
}
