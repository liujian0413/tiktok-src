package com.p280ss.android.ugc.aweme.p313im.sdk.detail;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.p263im.core.model.C6425b;
import com.bytedance.p263im.core.model.Conversation;
import com.google.gson.C6711m;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageView;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.framework.services.IReportService;
import com.p280ss.android.ugc.aweme.framework.services.IReportService.IReportCallback;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.p1315b.C30733a;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.selectmsg.C6951b;
import com.p280ss.android.ugc.aweme.p313im.sdk.model.BlockResponse;
import com.p280ss.android.ugc.aweme.p313im.sdk.model.UserStruct;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C31085i;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31878ax;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31878ax.C31882a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31891bc;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31915n;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7063bg;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7074e;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7077s;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.AutoRTLImageView;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.p280ss.android.ugc.aweme.utils.C42996by;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.FriendChatDetailActivity */
public final class FriendChatDetailActivity extends BaseChatDetailActivity implements C6310a {

    /* renamed from: h */
    public static final C31119a f81657h = new C31119a(null);

    /* renamed from: f */
    public IMUser f81658f;

    /* renamed from: g */
    public C6309f f81659g;

    /* renamed from: i */
    private RelativeLayout f81660i;

    /* renamed from: j */
    private AvatarImageView f81661j;

    /* renamed from: k */
    private ImageView f81662k;

    /* renamed from: l */
    private TextView f81663l;

    /* renamed from: m */
    private TextView f81664m;

    /* renamed from: n */
    private TextView f81665n;

    /* renamed from: o */
    private TextView f81666o;

    /* renamed from: p */
    private RelativeLayout f81667p;

    /* renamed from: q */
    private boolean f81668q;

    /* renamed from: r */
    private boolean f81669r;

    /* renamed from: s */
    private int f81670s;

    /* renamed from: t */
    private HashMap f81671t;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.FriendChatDetailActivity$a */
    public static final class C31119a {
        private C31119a() {
        }

        public /* synthetic */ C31119a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m101481a(Activity activity, IMUser iMUser, boolean z, boolean z2) {
            C7573i.m23587b(activity, "context");
            C7573i.m23587b(iMUser, "user");
            Intent intent = new Intent(activity, FriendChatDetailActivity.class);
            intent.putExtra("simple_uesr", iMUser);
            intent.putExtra("is_stranger", z);
            intent.putExtra("is_author_supporter", z2);
            activity.startActivityForResult(intent, 1);
            C6956a.m21632a().mo18010g();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.FriendChatDetailActivity$b */
    public static final class C31120b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ FriendChatDetailActivity f81672a;

        /* renamed from: b */
        final /* synthetic */ boolean f81673b;

        public final void run() {
            if (this.f81673b) {
                FriendChatDetailActivity.m101465a(this.f81672a).setFollowStatus(0);
            }
            FriendChatDetailActivity.m101465a(this.f81672a).setBlock(this.f81673b);
            C6961d.m21657a().mo18026a(FriendChatDetailActivity.m101465a(this.f81672a));
        }

        C31120b(FriendChatDetailActivity friendChatDetailActivity, boolean z) {
            this.f81672a = friendChatDetailActivity;
            this.f81673b = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.FriendChatDetailActivity$c */
    public static final class C31121c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FriendChatDetailActivity f81674a;

        C31121c(FriendChatDetailActivity friendChatDetailActivity) {
            this.f81674a = friendChatDetailActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (i == -1) {
                C7077s.m22151a((Handler) FriendChatDetailActivity.m101470b(this.f81674a), (CharSequence) FriendChatDetailActivity.m101465a(this.f81674a).getUid(), C31085i.f81578a.mo81570b(FriendChatDetailActivity.m101465a(this.f81674a)), 1, 1);
                C31858ad.m103406a();
                C31858ad.m103463d("success", FriendChatDetailActivity.m101465a(this.f81674a).getUid(), "chat");
                return;
            }
            C31858ad.m103406a();
            C31858ad.m103463d("cancel", FriendChatDetailActivity.m101465a(this.f81674a).getUid(), "chat");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.FriendChatDetailActivity$d */
    public static final class C31122d implements IReportCallback {
        C31122d() {
        }

        public final void onReportEnd() {
        }

        public final void onReportStart() {
        }
    }

    /* renamed from: a */
    public final View mo81586a(int i) {
        if (this.f81671t == null) {
            this.f81671t = new HashMap();
        }
        View view = (View) this.f81671t.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f81671t.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: d */
    public final int mo81592d() {
        return R.layout.bv;
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.FriendChatDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.FriendChatDetailActivity", "onCreate", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.FriendChatDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.FriendChatDetailActivity", "onResume", true);
        super.onResume();
        C31085i iVar = C31085i.f81578a;
        IMUser iMUser = this.f81658f;
        if (iMUser == null) {
            C7573i.m23583a("mUser");
        }
        String b = iVar.mo81570b(iMUser);
        C6309f fVar = this.f81659g;
        if (fVar == null) {
            C7573i.m23583a("mHandler");
        }
        Handler handler = fVar;
        IMUser iMUser2 = this.f81658f;
        if (iMUser2 == null) {
            C7573i.m23583a("mUser");
        }
        C7077s.m22150a(handler, (CharSequence) iMUser2.getUid(), b, 0);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.FriendChatDetailActivity", "onResume", false);
    }

    /* renamed from: h */
    private final void m101474h() {
        boolean z = false;
        if (this.f81670s == 0) {
            C31121c cVar = new C31121c(this);
            IMUser iMUser = this.f81658f;
            if (iMUser == null) {
                C7573i.m23583a("mUser");
            }
            if (iMUser.getFollowStatus() == 2) {
                z = true;
            }
            C7063bg.m22045a((Context) this, z, (OnClickListener) cVar);
            C31858ad.m103406a();
            String str = "chat";
            IMUser iMUser2 = this.f81658f;
            if (iMUser2 == null) {
                C7573i.m23583a("mUser");
            }
            C31858ad.m103463d(str, iMUser2.getUid(), (String) null);
            return;
        }
        C31085i iVar = C31085i.f81578a;
        IMUser iMUser3 = this.f81658f;
        if (iMUser3 == null) {
            C7573i.m23583a("mUser");
        }
        String b = iVar.mo81570b(iMUser3);
        C6309f fVar = this.f81659g;
        if (fVar == null) {
            C7573i.m23583a("mHandler");
        }
        Handler handler = fVar;
        IMUser iMUser4 = this.f81658f;
        if (iMUser4 == null) {
            C7573i.m23583a("mUser");
        }
        C7077s.m22151a(handler, (CharSequence) iMUser4.getUid(), b, 0, 1);
        C31858ad.m103406a();
        IMUser iMUser5 = this.f81658f;
        if (iMUser5 == null) {
            C7573i.m23583a("mUser");
        }
        C31858ad.m103493k(iMUser5.getUid());
    }

    /* renamed from: e */
    public final void mo81593e() {
        boolean z;
        super.mo81593e();
        Intent intent = getIntent();
        C7573i.m23582a((Object) intent, "intent");
        if (intent.getExtras() != null) {
            Intent intent2 = getIntent();
            C7573i.m23582a((Object) intent2, "intent");
            Bundle extras = intent2.getExtras();
            if (extras == null) {
                C7573i.m23580a();
            }
            if (extras.getSerializable("simple_uesr") != null) {
                Intent intent3 = getIntent();
                C7573i.m23582a((Object) intent3, "intent");
                Bundle extras2 = intent3.getExtras();
                if (extras2 == null) {
                    C7573i.m23580a();
                }
                Serializable serializable = extras2.getSerializable("simple_uesr");
                if (serializable != null) {
                    this.f81658f = (IMUser) serializable;
                    IMUser iMUser = this.f81658f;
                    if (iMUser == null) {
                        C7573i.m23583a("mUser");
                    }
                    String uid = iMUser.getUid();
                    CharSequence charSequence = uid;
                    if (charSequence == null || charSequence.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        try {
                            this.f81618e = new C6425b(C6425b.m20076a(Long.parseLong(uid)));
                        } catch (Exception unused) {
                        }
                    }
                    Intent intent4 = getIntent();
                    C7573i.m23582a((Object) intent4, "intent");
                    Bundle extras3 = intent4.getExtras();
                    if (extras3 == null) {
                        C7573i.m23580a();
                    }
                    this.f81668q = extras3.getBoolean("is_stranger", false);
                    Intent intent5 = getIntent();
                    C7573i.m23582a((Object) intent5, "intent");
                    Bundle extras4 = intent5.getExtras();
                    if (extras4 == null) {
                        C7573i.m23580a();
                    }
                    this.f81669r = extras4.getBoolean("is_author_supporter", false);
                    this.f81659g = new C6309f(this);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser");
            }
        }
        finish();
    }

    /* renamed from: g */
    public final void mo81595g() {
        super.mo81595g();
        RelativeLayout relativeLayout = this.f81660i;
        if (relativeLayout == null) {
            C7573i.m23583a("mAvatarLayout");
        }
        View.OnClickListener onClickListener = this;
        relativeLayout.setOnClickListener(onClickListener);
        AvatarImageView avatarImageView = this.f81661j;
        if (avatarImageView == null) {
            C7573i.m23583a("mAvatarImage");
        }
        avatarImageView.setOnClickListener(onClickListener);
        TextView textView = this.f81665n;
        if (textView == null) {
            C7573i.m23583a("mBlockText");
        }
        textView.setOnClickListener(onClickListener);
        TextView textView2 = this.f81666o;
        if (textView2 == null) {
            C7573i.m23583a("mReportText");
        }
        textView2.setOnClickListener(onClickListener);
        C31882a n = C31882a.m103579n();
        View[] viewArr = new View[2];
        RelativeLayout relativeLayout2 = this.f81660i;
        if (relativeLayout2 == null) {
            C7573i.m23583a("mAvatarLayout");
        }
        viewArr[0] = relativeLayout2;
        AvatarImageView avatarImageView2 = this.f81661j;
        if (avatarImageView2 == null) {
            C7573i.m23583a("mAvatarImage");
        }
        viewArr[1] = avatarImageView2;
        n.mo82725a(viewArr);
        int color = getResources().getColor(R.color.ac4);
        int color2 = getResources().getColor(R.color.t9);
        View[] viewArr2 = new View[2];
        TextView textView3 = this.f81665n;
        if (textView3 == null) {
            C7573i.m23583a("mBlockText");
        }
        viewArr2[0] = textView3;
        TextView textView4 = this.f81666o;
        if (textView4 == null) {
            C7573i.m23583a("mReportText");
        }
        viewArr2[1] = textView4;
        C31878ax.m103575a(color, color2, viewArr2);
    }

    /* renamed from: i */
    private final void m101475i() {
        String str;
        Conversation conversation;
        Long l;
        boolean z;
        boolean z2;
        C6425b bVar = this.f81618e;
        String str2 = null;
        if (bVar != null) {
            str = bVar.f18778a;
        } else {
            str = null;
        }
        C6425b bVar2 = this.f81618e;
        if (bVar2 != null) {
            conversation = bVar2.mo15562a();
        } else {
            conversation = null;
        }
        if (conversation != null) {
            l = Long.valueOf(conversation.getConversationShortId());
        } else {
            l = null;
        }
        IMUser iMUser = this.f81658f;
        if (iMUser == null) {
            C7573i.m23583a("mUser");
        }
        CharSequence uid = iMUser.getUid();
        int i = 0;
        if (uid == null || uid.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            CharSequence charSequence = str;
            if (charSequence == null || charSequence.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2 && l != null && l.longValue() > 0) {
                if (this.f81668q) {
                    i = 1;
                } else {
                    IMUser iMUser2 = this.f81658f;
                    if (iMUser2 == null) {
                        C7573i.m23583a("mUser");
                    }
                    if (iMUser2.getCommerceUserLevel() > 0) {
                        i = 2;
                    }
                }
                C6951b.m21627d(str);
                C6951b.m21623a(str, Integer.valueOf(i));
                String str3 = "";
                try {
                    C6711m mVar = new C6711m();
                    mVar.mo16147a("conversation_id", str);
                    String a = C42996by.m136485a(mVar);
                    C7573i.m23582a((Object) a, "GsonUtil.toJson(jsonObject)");
                    str3 = a;
                } catch (Exception unused) {
                }
                Builder builder = new Builder();
                String str4 = "owner_id";
                IMUser iMUser3 = this.f81658f;
                if (iMUser3 == null) {
                    C7573i.m23583a("mUser");
                }
                Builder appendQueryParameter = builder.appendQueryParameter(str4, iMUser3.getUid()).appendQueryParameter("report_type", "im").appendQueryParameter("extra", str3).appendQueryParameter("object_id", String.valueOf(l.longValue()));
                IReportService iReportService = (IReportService) ServiceManager.get().getService(IReportService.class);
                if (iReportService != null) {
                    iReportService.showReportDialog(this, "im_group", appendQueryParameter, new C31122d());
                }
                C31858ad.m103406a();
                C6425b bVar3 = this.f81618e;
                if (bVar3 != null) {
                    str2 = bVar3.f18778a;
                }
                C31858ad.m103487i(str2, "private");
                C22984d dVar = new C22984d();
                String str5 = "author_id";
                IMUser iMUser4 = this.f81658f;
                if (iMUser4 == null) {
                    C7573i.m23583a("mUser");
                }
                C6907h.m21524a("click_report", (Map) dVar.mo59973a(str5, iMUser4.getUid()).mo59973a("object_id", str).mo59973a("object_type", "im").mo59973a("enter_method", "click_share_button").f60753a);
            }
        }
    }

    /* renamed from: f */
    public final void mo81594f() {
        super.mo81594f();
        RelativeLayout relativeLayout = (RelativeLayout) mo81586a((int) R.id.jb);
        C7573i.m23582a((Object) relativeLayout, "avatar_rl");
        this.f81660i = relativeLayout;
        AvatarImageView avatarImageView = (AvatarImageView) mo81586a((int) R.id.j2);
        C7573i.m23582a((Object) avatarImageView, "avatar_iv");
        this.f81661j = avatarImageView;
        ImageView imageView = (ImageView) mo81586a((int) R.id.e_q);
        C7573i.m23582a((Object) imageView, "verify_iv");
        this.f81662k = imageView;
        DmtTextView dmtTextView = (DmtTextView) mo81586a((int) R.id.c37);
        C7573i.m23582a((Object) dmtTextView, "name_tv");
        this.f81663l = dmtTextView;
        DmtTextView dmtTextView2 = (DmtTextView) mo81586a((int) R.id.a83);
        C7573i.m23582a((Object) dmtTextView2, "detail_tv");
        this.f81664m = dmtTextView2;
        RelativeLayout relativeLayout2 = (RelativeLayout) mo81586a((int) R.id.mu);
        C7573i.m23582a((Object) relativeLayout2, "block_rl");
        this.f81667p = relativeLayout2;
        DmtTextView dmtTextView3 = (DmtTextView) mo81586a((int) R.id.cs3);
        C7573i.m23582a((Object) dmtTextView3, "report_tv");
        this.f81666o = dmtTextView3;
        DmtTextView dmtTextView4 = (DmtTextView) mo81586a((int) R.id.mv);
        C7573i.m23582a((Object) dmtTextView4, "block_tv");
        this.f81665n = dmtTextView4;
        if (this.f81668q) {
            RelativeLayout relativeLayout3 = (RelativeLayout) mo81586a((int) R.id.bii);
            C7573i.m23582a((Object) relativeLayout3, "layout_mute");
            relativeLayout3.setVisibility(8);
            RelativeLayout relativeLayout4 = (RelativeLayout) mo81586a((int) R.id.bjt);
            C7573i.m23582a((Object) relativeLayout4, "layout_stick_top");
            relativeLayout4.setVisibility(8);
        }
        if (this.f81669r) {
            RelativeLayout relativeLayout5 = (RelativeLayout) mo81586a((int) R.id.bjd);
            C7573i.m23582a((Object) relativeLayout5, "layout_report");
            relativeLayout5.setVisibility(8);
            RelativeLayout relativeLayout6 = (RelativeLayout) mo81586a((int) R.id.mu);
            C7573i.m23582a((Object) relativeLayout6, "block_rl");
            relativeLayout6.setVisibility(8);
            AutoRTLImageView autoRTLImageView = (AutoRTLImageView) mo81586a((int) R.id.c06);
            C7573i.m23582a((Object) autoRTLImageView, "more_iv");
            autoRTLImageView.setVisibility(8);
            DmtTextView dmtTextView5 = (DmtTextView) mo81586a((int) R.id.a83);
            C7573i.m23582a((Object) dmtTextView5, "detail_tv");
            dmtTextView5.setVisibility(8);
            AvatarImageView avatarImageView2 = (AvatarImageView) mo81586a((int) R.id.j2);
            C7573i.m23582a((Object) avatarImageView2, "avatar_iv");
            avatarImageView2.setEnabled(false);
            RelativeLayout relativeLayout7 = (RelativeLayout) mo81586a((int) R.id.jb);
            C7573i.m23582a((Object) relativeLayout7, "avatar_rl");
            relativeLayout7.setEnabled(false);
        }
        IMUser iMUser = this.f81658f;
        if (iMUser == null) {
            C7573i.m23583a("mUser");
        }
        m101468a(iMUser);
        IMUser iMUser2 = this.f81658f;
        if (iMUser2 == null) {
            C7573i.m23583a("mUser");
        }
        if (TextUtils.equals(iMUser2.getUid(), C7074e.m22069b())) {
            RelativeLayout relativeLayout8 = this.f81667p;
            if (relativeLayout8 == null) {
                C7573i.m23583a("mBlockLayout");
            }
            relativeLayout8.setVisibility(8);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ IMUser m101465a(FriendChatDetailActivity friendChatDetailActivity) {
        IMUser iMUser = friendChatDetailActivity.f81658f;
        if (iMUser == null) {
            C7573i.m23583a("mUser");
        }
        return iMUser;
    }

    /* renamed from: b */
    public static final /* synthetic */ C6309f m101470b(FriendChatDetailActivity friendChatDetailActivity) {
        C6309f fVar = friendChatDetailActivity.f81659g;
        if (fVar == null) {
            C7573i.m23583a("mHandler");
        }
        return fVar;
    }

    /* renamed from: c */
    private final void m101473c(boolean z) {
        C6309f fVar = this.f81659g;
        if (fVar == null) {
            C7573i.m23583a("mHandler");
        }
        fVar.post(new C31120b(this, z));
    }

    public final void handleMsg(Message message) {
        C7573i.m23587b(message, "msg");
        switch (message.what) {
            case 0:
                m101469a(message.obj);
                return;
            case 1:
                m101472b(message.obj);
                break;
        }
    }

    /* renamed from: a */
    private final void m101467a(UserStruct userStruct) {
        IMUser fromUser = IMUser.fromUser(userStruct.getUser());
        C7573i.m23582a((Object) fromUser, "IMUser.fromUser(userStruct.user)");
        this.f81658f = fromUser;
        IMUser iMUser = this.f81658f;
        if (iMUser == null) {
            C7573i.m23583a("mUser");
        }
        m101468a(iMUser);
        C6961d a = C6961d.m21657a();
        IMUser iMUser2 = this.f81658f;
        if (iMUser2 == null) {
            C7573i.m23583a("mUser");
        }
        a.mo18026a(iMUser2);
    }

    /* renamed from: a */
    private final void m101469a(Object obj) {
        if (obj instanceof UserStruct) {
            UserStruct userStruct = (UserStruct) obj;
            if (userStruct.getUser() != null) {
                if (userStruct.getUser().isBlock()) {
                    this.f81670s = 1;
                    TextView textView = this.f81665n;
                    if (textView == null) {
                        C7573i.m23583a("mBlockText");
                    }
                    textView.setText(R.string.br7);
                } else {
                    this.f81670s = 0;
                    TextView textView2 = this.f81665n;
                    if (textView2 == null) {
                        C7573i.m23583a("mBlockText");
                    }
                    textView2.setText(R.string.bha);
                }
                m101467a(userStruct);
            }
        }
    }

    /* renamed from: b */
    private final String m101471b(IMUser iMUser) {
        String str;
        if (TextUtils.isEmpty(iMUser.getRemarkName()) || TextUtils.isEmpty(iMUser.getNickName())) {
            if (TextUtils.isEmpty(iMUser.getSignature())) {
                str = getString(R.string.bh_);
            } else if (C31915n.m103672b()) {
                StringBuilder sb = new StringBuilder();
                sb.append(getString(R.string.bgt));
                sb.append(iMUser.getSignature());
                str = sb.toString();
            } else {
                str = iMUser.getSignature();
            }
            C7573i.m23582a((Object) str, "if (TextUtils.isEmpty(us…          }\n            }");
            return str;
        }
        String string = getString(R.string.bnj, new Object[]{iMUser.getNickName()});
        C7573i.m23582a((Object) string, "getString(R.string.im_nickname, user.nickName)");
        return string;
    }

    public final void onClick(View view) {
        boolean z;
        FriendChatDetailActivity friendChatDetailActivity;
        C7573i.m23587b(view, "v");
        super.onClick(view);
        int id = view.getId();
        if (id == R.id.jb || id == R.id.j2) {
            if (!this.f81669r || C30733a.m100122f()) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                friendChatDetailActivity = this;
            } else {
                friendChatDetailActivity = null;
            }
            FriendChatDetailActivity friendChatDetailActivity2 = friendChatDetailActivity;
            if (friendChatDetailActivity2 != null) {
                C31085i iVar = C31085i.f81578a;
                IMUser iMUser = friendChatDetailActivity2.f81658f;
                if (iMUser == null) {
                    C7573i.m23583a("mUser");
                }
                iVar.mo81571c(iMUser.getUid());
                IMUser iMUser2 = friendChatDetailActivity2.f81658f;
                if (iMUser2 == null) {
                    C7573i.m23583a("mUser");
                }
                C31891bc.m103605a(iMUser2.getUid());
            }
        } else if (id == R.id.mv) {
            m101474h();
        } else if (id == R.id.cs3) {
            m101475i();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m101468a(com.p280ss.android.ugc.aweme.p313im.service.model.IMUser r6) {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r6.getAvatarThumb()
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r6.getAvatarThumb()
            java.lang.String r1 = "user.avatarThumb"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            java.util.List r0 = r0.getUrlList()
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r6.getAvatarThumb()
            java.lang.String r1 = "user.avatarThumb"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            java.util.List r0 = r0.getUrlList()
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x003b
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r0 = r5.f81661j
            if (r0 != 0) goto L_0x0031
            java.lang.String r1 = "mAvatarImage"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0031:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = (com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView) r0
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r6.getAvatarThumb()
            com.p280ss.android.ugc.aweme.base.C23323e.m76524b(r0, r1)
            goto L_0x004c
        L_0x003b:
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r0 = r5.f81661j
            if (r0 != 0) goto L_0x0044
            java.lang.String r1 = "mAvatarImage"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0044:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = (com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView) r0
            r1 = 2131232103(0x7f080567, float:1.8080306E38)
            com.p280ss.android.ugc.aweme.base.C23323e.m76503a(r0, r1)
        L_0x004c:
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r0 = r5.f81661j
            if (r0 != 0) goto L_0x0055
            java.lang.String r1 = "mAvatarImage"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0055:
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31852a.m103395a(r0, r6)
            android.widget.TextView r0 = r5.f81663l
            if (r0 != 0) goto L_0x0063
            java.lang.String r1 = "mUserNameText"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0063:
            java.lang.String r1 = r6.getDisplayName()
            m101466a(r0, r1)
            r0 = r5
            android.content.Context r0 = (android.content.Context) r0
            java.lang.String r1 = r6.getCustomVerify()
            java.lang.String r2 = r6.getEnterpriseVerifyReason()
            android.widget.TextView r3 = r5.f81663l
            if (r3 != 0) goto L_0x007e
            java.lang.String r4 = "mUserNameText"
            kotlin.jvm.internal.C7573i.m23583a(r4)
        L_0x007e:
            com.p280ss.android.ugc.aweme.utils.C43126fg.m136801a(r0, r1, r2, r3)
            android.widget.TextView r0 = r5.f81664m
            if (r0 != 0) goto L_0x008a
            java.lang.String r1 = "mDetailText"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x008a:
            java.lang.String r1 = r5.m101471b(r6)
            m101466a(r0, r1)
            boolean r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            if (r0 != 0) goto L_0x00a3
            android.widget.ImageView r0 = r5.f81662k
            if (r0 != 0) goto L_0x00a0
            java.lang.String r1 = "mVerifyImage"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x00a0:
            com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31889bb.m103601a(r0, r6)
        L_0x00a3:
            boolean r6 = r5.f81669r
            if (r6 == 0) goto L_0x00b5
            android.widget.TextView r6 = r5.f81664m
            if (r6 != 0) goto L_0x00b0
            java.lang.String r0 = "mDetailText"
            kotlin.jvm.internal.C7573i.m23583a(r0)
        L_0x00b0:
            r0 = 8
            r6.setVisibility(r0)
        L_0x00b5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.detail.FriendChatDetailActivity.m101468a(com.ss.android.ugc.aweme.im.service.model.IMUser):void");
    }

    /* renamed from: b */
    private final void m101472b(Object obj) {
        if (obj instanceof ApiServerException) {
            C10761a.m31399c((Context) this, (int) R.string.bj9).mo25750a();
            return;
        }
        if (obj instanceof BlockResponse) {
            BlockResponse blockResponse = (BlockResponse) obj;
            if (blockResponse.getBlockStaus() == 1) {
                this.f81670s = 1;
                TextView textView = this.f81665n;
                if (textView == null) {
                    C7573i.m23583a("mBlockText");
                }
                textView.setText(R.string.br7);
                C10761a.m31383a((Context) this, (int) R.string.bhd).mo25750a();
                m101473c(true);
            } else if (blockResponse.getBlockStaus() == 0) {
                this.f81670s = 0;
                TextView textView2 = this.f81665n;
                if (textView2 == null) {
                    C7573i.m23583a("mBlockText");
                }
                textView2.setText(R.string.bha);
                C10761a.m31383a((Context) this, (int) R.string.br8).mo25750a();
                m101473c(false);
            }
        }
    }

    /* renamed from: a */
    private static void m101466a(TextView textView, String str) {
        CharSequence charSequence = str;
        if (!TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(0);
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(4);
    }
}
