package com.p280ss.android.ugc.aweme.profile.p1487ui.widget;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.p029v7.app.AppCompatDialog;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtEditText;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.drawee.drawable.C13421p.C13423b;
import com.facebook.drawee.generic.C13438a;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.C23467g;
import com.p280ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.profile.C35818j;
import com.p280ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.presenter.C35999a;
import com.p280ss.android.ugc.aweme.profile.presenter.C36011ai;
import com.p280ss.android.ugc.aweme.profile.presenter.C36039m;
import com.p280ss.android.ugc.aweme.profile.presenter.C36046t;
import com.p280ss.android.ugc.aweme.profile.util.C36762t;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.RemindUserCompleteProfileDialog */
public final class RemindUserCompleteProfileDialog extends AppCompatDialog implements C36039m, C36046t {

    /* renamed from: e */
    public static final C36645a f96244e = new C36645a(null);

    /* renamed from: a */
    public C36011ai f96245a;

    /* renamed from: b */
    public final C35999a f96246b = new C35999a();

    /* renamed from: c */
    public String f96247c;

    /* renamed from: d */
    public final Context f96248d;

    /* renamed from: f */
    private final boolean f96249f = this.f96251h.getBoolean("complete_avatar");

    /* renamed from: g */
    private final boolean f96250g = this.f96251h.getBoolean("complete_nickname");

    /* renamed from: h */
    private final Bundle f96251h;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.RemindUserCompleteProfileDialog$a */
    public static final class C36645a {
        private C36645a() {
        }

        public /* synthetic */ C36645a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.RemindUserCompleteProfileDialog$b */
    static final class C36646b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RemindUserCompleteProfileDialog f96252a;

        C36646b(RemindUserCompleteProfileDialog remindUserCompleteProfileDialog) {
            this.f96252a = remindUserCompleteProfileDialog;
        }

        public final void onClick(View view) {
            boolean z;
            ClickInstrumentation.onClick(view);
            CharSequence charSequence = this.f96252a.f96247c;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f96252a.f96246b.mo91611a(0);
                return;
            }
            C35999a aVar = this.f96252a.f96246b;
            Context context = this.f96252a.f96248d;
            if (!(context instanceof Activity)) {
                context = null;
            }
            Activity activity = (Activity) context;
            AvatarImageView avatarImageView = (AvatarImageView) this.f96252a.findViewById(R.id.ic);
            IAccountUserService f = C6861a.m21337f();
            C7573i.m23582a((Object) f, "AccountProxyService.userService()");
            aVar.mo91612a(0, activity, avatarImageView, f.getCurUser());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.RemindUserCompleteProfileDialog$c */
    public static final class C36647c extends C23467g {

        /* renamed from: a */
        final /* synthetic */ RemindUserCompleteProfileDialog f96253a;

        C36647c(RemindUserCompleteProfileDialog remindUserCompleteProfileDialog) {
            this.f96253a = remindUserCompleteProfileDialog;
        }

        public final void afterTextChanged(Editable editable) {
            boolean z;
            C7573i.m23587b(editable, "s");
            if (C35818j.m115643a(editable, 20)) {
                C10761a.m31403c(C6399b.m19921a(), C6399b.m19921a().getString(R.string.ru)).mo25750a();
            }
            if (editable.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                ImageButton imageButton = (ImageButton) this.f96253a.findViewById(R.id.pw);
                C7573i.m23582a((Object) imageButton, "btn_clear");
                imageButton.setVisibility(4);
                DmtTextView dmtTextView = (DmtTextView) this.f96253a.findViewById(R.id.ct5);
                Context context = this.f96253a.getContext();
                C7573i.m23582a((Object) context, "context");
                dmtTextView.setTextColor(context.getResources().getColor(R.color.at3));
                DmtTextView dmtTextView2 = (DmtTextView) this.f96253a.findViewById(R.id.ct5);
                C7573i.m23582a((Object) dmtTextView2, "right_btn");
                dmtTextView2.setEnabled(false);
                return;
            }
            ImageButton imageButton2 = (ImageButton) this.f96253a.findViewById(R.id.pw);
            C7573i.m23582a((Object) imageButton2, "btn_clear");
            imageButton2.setVisibility(0);
            DmtTextView dmtTextView3 = (DmtTextView) this.f96253a.findViewById(R.id.ct5);
            Context context2 = this.f96253a.getContext();
            C7573i.m23582a((Object) context2, "context");
            dmtTextView3.setTextColor(context2.getResources().getColor(R.color.lo));
            DmtTextView dmtTextView4 = (DmtTextView) this.f96253a.findViewById(R.id.ct5);
            C7573i.m23582a((Object) dmtTextView4, "right_btn");
            dmtTextView4.setEnabled(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.RemindUserCompleteProfileDialog$d */
    static final class C36648d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RemindUserCompleteProfileDialog f96254a;

        C36648d(RemindUserCompleteProfileDialog remindUserCompleteProfileDialog) {
            this.f96254a = remindUserCompleteProfileDialog;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            ((DmtEditText) this.f96254a.findViewById(R.id.b19)).setText("");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.RemindUserCompleteProfileDialog$e */
    static final class C36649e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RemindUserCompleteProfileDialog f96255a;

        C36649e(RemindUserCompleteProfileDialog remindUserCompleteProfileDialog) {
            this.f96255a = remindUserCompleteProfileDialog;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f96255a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.RemindUserCompleteProfileDialog$f */
    static final class C36650f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RemindUserCompleteProfileDialog f96256a;

        C36650f(RemindUserCompleteProfileDialog remindUserCompleteProfileDialog) {
            this.f96256a = remindUserCompleteProfileDialog;
        }

        public final void onClick(View view) {
            boolean z;
            ClickInstrumentation.onClick(view);
            LinearLayout linearLayout = (LinearLayout) this.f96256a.findViewById(R.id.b1y);
            C7573i.m23582a((Object) linearLayout, "input_container");
            if (linearLayout.getVisibility() == 0) {
                DmtEditText dmtEditText = (DmtEditText) this.f96256a.findViewById(R.id.b19);
                C7573i.m23582a((Object) dmtEditText, "input");
                String valueOf = String.valueOf(dmtEditText.getText());
                if (!C36762t.m118498a(valueOf)) {
                    C10761a.m31409e(this.f96256a.f96248d, (int) R.string.clp).mo25750a();
                    return;
                }
                IAccountUserService f = C6861a.m21337f();
                C7573i.m23582a((Object) f, "AccountProxyService.userService()");
                User curUser = f.getCurUser();
                C7573i.m23582a((Object) curUser, "AccountProxyService.userService().curUser");
                if (C7573i.m23585a((Object) valueOf, (Object) curUser.getNickname())) {
                    this.f96256a.dismiss();
                    return;
                }
                RemindUserCompleteProfileDialog.m118271a(this.f96256a).mo91646b(valueOf);
                ((DmtStatusView) this.f96256a.findViewById(R.id.dav)).mo25942f();
                return;
            }
            AvatarImageView avatarImageView = (AvatarImageView) this.f96256a.findViewById(R.id.ic);
            C7573i.m23582a((Object) avatarImageView, "avatar");
            if (avatarImageView.getVisibility() == 0) {
                CharSequence charSequence = this.f96256a.f96247c;
                if (charSequence == null || charSequence.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    this.f96256a.f96246b.mo91615e();
                    ((DmtStatusView) this.f96256a.findViewById(R.id.dav)).mo25942f();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.RemindUserCompleteProfileDialog$g */
    static final class C36651g implements OnShowListener {

        /* renamed from: a */
        final /* synthetic */ RemindUserCompleteProfileDialog f96257a;

        C36651g(RemindUserCompleteProfileDialog remindUserCompleteProfileDialog) {
            this.f96257a = remindUserCompleteProfileDialog;
        }

        public final void onShow(DialogInterface dialogInterface) {
            LinearLayout linearLayout = (LinearLayout) this.f96257a.findViewById(R.id.b1y);
            C7573i.m23582a((Object) linearLayout, "input_container");
            if (linearLayout.getVisibility() == 0) {
                C1592h.m7848a(100).mo6876a((C1591g<TResult, TContinuationResult>) new C1591g<Void, Object>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C36651g f96258a;

                    {
                        this.f96258a = r1;
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public Void then(C1592h<Void> hVar) {
                        DmtEditText dmtEditText = (DmtEditText) this.f96258a.f96257a.findViewById(R.id.b19);
                        if (dmtEditText != null) {
                            dmtEditText.requestFocus();
                            KeyboardUtils.m77055a(dmtEditText);
                        }
                        return null;
                    }
                }, C1592h.f5958b);
            }
        }
    }

    /* renamed from: a */
    public final void mo66089a(boolean z) {
    }

    public final void cancel() {
        KeyboardUtils.m77057c((DmtEditText) findViewById(R.id.b19));
        super.cancel();
    }

    public final void dismiss() {
        KeyboardUtils.m77057c((DmtEditText) findViewById(R.id.b19));
        super.dismiss();
    }

    /* renamed from: a */
    public static final /* synthetic */ C36011ai m118271a(RemindUserCompleteProfileDialog remindUserCompleteProfileDialog) {
        C36011ai aiVar = remindUserCompleteProfileDialog.f96245a;
        if (aiVar == null) {
            C7573i.m23583a("userPresent");
        }
        return aiVar;
    }

    /* renamed from: a */
    public final void mo61679a(AvatarUri avatarUri) {
        if (avatarUri == null) {
            C10761a.m31399c(getContext(), (int) R.string.d0).mo25750a();
            return;
        }
        C36011ai aiVar = this.f96245a;
        if (aiVar == null) {
            C7573i.m23583a("userPresent");
        }
        aiVar.mo91648d(avatarUri.uri);
    }

    /* renamed from: a */
    public final void mo61680a(Exception exc) {
        ((DmtStatusView) findViewById(R.id.dav)).mo25939d();
    }

    /* renamed from: a */
    private final void m118272a(int i) {
        while (true) {
            switch (i) {
                case 0:
                    LinearLayout linearLayout = (LinearLayout) findViewById(R.id.b1y);
                    C7573i.m23582a((Object) linearLayout, "input_container");
                    linearLayout.setVisibility(0);
                    DmtTextView dmtTextView = (DmtTextView) findViewById(R.id.b1x);
                    C7573i.m23582a((Object) dmtTextView, "input_bottom_hint");
                    dmtTextView.setVisibility(0);
                    if (this.f96250g && this.f96249f) {
                        ((DmtTextView) findViewById(R.id.ct5)).setText(R.string.cnc);
                    }
                    C6907h.m21524a("add_nickname_show", (Map) C22984d.m75611a().mo59973a("enter_from", this.f96251h.getString("enter_from")).mo59973a("enter_method", this.f96251h.getString("enter_method")).f60753a);
                    return;
                case 1:
                    AvatarImageView avatarImageView = (AvatarImageView) findViewById(R.id.ic);
                    C7573i.m23582a((Object) avatarImageView, "avatar");
                    ((C13438a) avatarImageView.getHierarchy()).mo32891a((int) R.drawable.bgh, C13423b.f35599g);
                    AvatarImageView avatarImageView2 = (AvatarImageView) findViewById(R.id.ic);
                    C7573i.m23582a((Object) avatarImageView2, "avatar");
                    avatarImageView2.setVisibility(0);
                    DmtTextView dmtTextView2 = (DmtTextView) findViewById(R.id.a0w);
                    C7573i.m23582a((Object) dmtTextView2, "complete_avatar_hint");
                    dmtTextView2.setVisibility(0);
                    ((DmtTextView) findViewById(R.id.ct5)).setText(R.string.cna);
                    DmtTextView dmtTextView3 = (DmtTextView) findViewById(R.id.ct5);
                    Context context = getContext();
                    C7573i.m23582a((Object) context, "context");
                    dmtTextView3.setTextColor(context.getResources().getColor(R.color.at3));
                    C6907h.m21524a("add_head_show", (Map) C22984d.m75611a().mo59973a("enter_from", this.f96251h.getString("enter_from")).mo59973a("enter_method", this.f96251h.getString("enter_method")).f60753a);
                    return;
                case 2:
                    LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.b1y);
                    C7573i.m23582a((Object) linearLayout2, "input_container");
                    linearLayout2.setVisibility(8);
                    DmtTextView dmtTextView4 = (DmtTextView) findViewById(R.id.b1x);
                    C7573i.m23582a((Object) dmtTextView4, "input_bottom_hint");
                    dmtTextView4.setVisibility(8);
                    ((DmtTextView) findViewById(R.id.title)).setText(R.string.cnd);
                    i = 1;
                default:
                    return;
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -2);
        }
        setContentView(LayoutInflater.from(getContext()).inflate(R.layout.l5, null));
        String string = this.f96251h.getString("enter_method");
        if (string != null) {
            int hashCode = string.hashCode();
            if (hashCode != -1268958287) {
                if (hashCode == 950398559 && string.equals("comment")) {
                    this.f96245a = new C36011ai(3);
                    ((DmtTextView) findViewById(R.id.title)).setText(R.string.a8u);
                    if (this.f96250g && this.f96249f) {
                        ((DmtTextView) findViewById(R.id.dd3)).setText(R.string.a8v);
                    } else if (this.f96250g) {
                        ((DmtTextView) findViewById(R.id.dd3)).setText(R.string.a8w);
                    } else if (this.f96249f) {
                        ((DmtTextView) findViewById(R.id.dd3)).setText(R.string.a8x);
                    }
                }
            } else if (string.equals("follow")) {
                this.f96245a = new C36011ai(2);
                ((DmtTextView) findViewById(R.id.title)).setText(R.string.b8q);
                if (this.f96250g && this.f96249f) {
                    ((DmtTextView) findViewById(R.id.dd3)).setText(R.string.b8r);
                } else if (this.f96250g) {
                    ((DmtTextView) findViewById(R.id.dd3)).setText(R.string.b8s);
                } else if (this.f96249f) {
                    ((DmtTextView) findViewById(R.id.dd3)).setText(R.string.b8t);
                }
            }
        }
        if (this.f96250g) {
            m118272a(0);
        } else if (this.f96249f) {
            m118272a(1);
        }
        ((AvatarImageView) findViewById(R.id.ic)).setOnClickListener(new C36646b(this));
        ((DmtEditText) findViewById(R.id.b19)).addTextChangedListener(new C36647c(this));
        ((ImageButton) findViewById(R.id.pw)).setOnClickListener(new C36648d(this));
        ((DmtTextView) findViewById(R.id.bl1)).setOnClickListener(new C36649e(this));
        ((DmtTextView) findViewById(R.id.ct5)).setOnClickListener(new C36650f(this));
        ((DmtStatusView) findViewById(R.id.dav)).setBuilder(C10803a.m31631a(this.f96248d));
        setOnShowListener(new C36651g(this));
        DmtTextView dmtTextView = (DmtTextView) findViewById(R.id.ct5);
        C7573i.m23582a((Object) dmtTextView, "right_btn");
        dmtTextView.setEnabled(false);
        C36011ai aiVar = this.f96245a;
        if (aiVar == null) {
            C7573i.m23583a("userPresent");
        }
        aiVar.f94200a = this;
        this.f96246b.f94183c = this;
        C35999a aVar = this.f96246b;
        Context context = this.f96248d;
        if (!(context instanceof Activity)) {
            context = null;
        }
        aVar.mo80250b((Activity) context, null);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
    }

    /* renamed from: a */
    public final void mo61681a(String str) {
        if (str != null) {
            this.f96247c = str;
            StringBuilder sb = new StringBuilder("file://");
            sb.append(str);
            Uri parse = Uri.parse(sb.toString());
            C13380c.m39172c().mo33181b(parse);
            C23323e.m76525b((AvatarImageView) findViewById(R.id.ic), parse.toString(), (int) C9738o.m28708b(getContext(), 84.0f), (int) C9738o.m28708b(getContext(), 84.0f));
            DmtTextView dmtTextView = (DmtTextView) findViewById(R.id.ct5);
            C7573i.m23582a((Object) dmtTextView, "right_btn");
            dmtTextView.setEnabled(true);
            DmtTextView dmtTextView2 = (DmtTextView) findViewById(R.id.ct5);
            Context context = getContext();
            C7573i.m23582a((Object) context, "context");
            dmtTextView2.setTextColor(context.getResources().getColor(R.color.lo));
            ((DmtTextView) findViewById(R.id.a0w)).setText(R.string.cu6);
        }
    }

    public RemindUserCompleteProfileDialog(Context context, Bundle bundle) {
        C7573i.m23587b(context, "myContext");
        C7573i.m23587b(bundle, "argument");
        super(context);
        this.f96248d = context;
        this.f96251h = bundle;
    }

    /* renamed from: a */
    public final void mo66087a(Exception exc, int i) {
        ((DmtStatusView) findViewById(R.id.dav)).mo25939d();
        C22814a.m75245a(this.f96248d, exc, R.string.d80);
    }

    /* renamed from: a */
    public final void mo66086a(User user, int i) {
        C7573i.m23587b(user, "data");
        if (i == 0) {
            if (this.f96249f) {
                m118272a(2);
            } else {
                dismiss();
            }
            C6907h.m21524a("add_nickname_success", (Map) C22984d.m75611a().mo59973a("enter_from", this.f96251h.getString("enter_from")).mo59973a("enter_method", this.f96251h.getString("enter_method")).f60753a);
            ((DmtStatusView) findViewById(R.id.dav)).mo25939d();
        } else if (i == 4) {
            C23323e.m76524b((AvatarImageView) findViewById(R.id.ic), user.getAvatarMedium());
            C10761a.m31383a(C6399b.m19921a(), (int) R.string.d7m).mo25750a();
            dismiss();
            C6907h.m21524a("add_head_success", (Map) C22984d.m75611a().mo59973a("enter_from", this.f96251h.getString("enter_from")).mo59973a("enter_method", this.f96251h.getString("enter_method")).f60753a);
            ((DmtStatusView) findViewById(R.id.dav)).mo25939d();
        }
    }

    /* renamed from: a */
    public final void mo66088a(String str, boolean z) {
        ((DmtStatusView) findViewById(R.id.dav)).mo25939d();
    }

    /* renamed from: a */
    public final void mo92982a(int i, int i2, Intent intent) {
        this.f96246b.mo80249a(i, i2, intent);
    }
}
