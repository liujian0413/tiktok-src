package com.p280ss.android.ugc.aweme.p313im.sdk.group.view;

import android.content.Context;
import android.os.Bundle;
import android.support.p029v7.app.AppCompatDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageButton;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p263im.core.model.C11438g;
import com.bytedance.p263im.core.model.Member;
import com.bytedance.p263im.core.p584a.p585a.C11196c;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageView;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.ChatRoomActivity;
import com.p280ss.android.ugc.aweme.p313im.sdk.detail.model.GroupVerifyInfo;
import com.p280ss.android.ugc.aweme.p313im.sdk.detail.model.GroupVerifyResponse;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.C31243a.C31244a;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.model.C31269b;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.model.GroupCheckMsg;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.model.GroupInviteCardInfo;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.p1325a.C31257b;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31913m;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7074e;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7077s;
import com.p280ss.android.ugc.aweme.p313im.service.C7103h;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.GroupInviteDialog */
public final class GroupInviteDialog extends AppCompatDialog {

    /* renamed from: i */
    public static final C6998a f19739i = new C6998a(null);

    /* renamed from: a */
    public final DmtTextView f19740a = ((DmtTextView) this.f19748j.findViewById(R.id.a7m));

    /* renamed from: b */
    public String f19741b;

    /* renamed from: c */
    public String f19742c;

    /* renamed from: d */
    public int f19743d = 1;

    /* renamed from: e */
    public GroupVerifyResponse f19744e;

    /* renamed from: f */
    public int f19745f;

    /* renamed from: g */
    public final String f19746g = this.f19757s;

    /* renamed from: h */
    public final int f19747h;

    /* renamed from: j */
    private final View f19748j;

    /* renamed from: k */
    private final AvatarImageView f19749k = ((AvatarImageView) this.f19748j.findViewById(R.id.j2));

    /* renamed from: l */
    private final DmtTextView f19750l = ((DmtTextView) this.f19748j.findViewById(R.id.c37));

    /* renamed from: m */
    private final DmtTextView f19751m = ((DmtTextView) this.f19748j.findViewById(R.id.a3m));

    /* renamed from: n */
    private final DmtTextView f19752n = ((DmtTextView) this.f19748j.findViewById(R.id.a10));

    /* renamed from: o */
    private final ImageButton f19753o = ((ImageButton) this.f19748j.findViewById(R.id.x_));

    /* renamed from: p */
    private String f19754p;

    /* renamed from: q */
    private Integer f19755q;

    /* renamed from: r */
    private GroupInviteCardInfo f19756r;

    /* renamed from: s */
    private String f19757s;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.GroupInviteDialog$a */
    public static final class C6998a {
        private C6998a() {
        }

        public /* synthetic */ C6998a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.GroupInviteDialog$b */
    public static final class C6999b implements C11196c<List<? extends Member>> {

        /* renamed from: a */
        final /* synthetic */ GroupInviteDialog f19758a;

        C6999b(GroupInviteDialog groupInviteDialog) {
            this.f19758a = groupInviteDialog;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo18089a(List<? extends Member> list) {
            C6921a.m21555a("GroupInviteDialog enterGroup success");
            this.f19758a.dismiss();
            this.f19758a.mo18086d();
        }

        /* renamed from: a */
        public final void mo18088a(C11438g gVar) {
            Object obj;
            Object obj2;
            String str;
            Object obj3;
            StringBuilder sb = new StringBuilder("GroupInviteDialog enterGroup failed: ");
            String str2 = null;
            if (gVar != null) {
                obj = Integer.valueOf(gVar.f30956a);
            } else {
                obj = null;
            }
            sb.append(obj);
            sb.append(", ");
            if (gVar != null) {
                obj2 = Integer.valueOf(gVar.f30957b);
            } else {
                obj2 = null;
            }
            sb.append(obj2);
            sb.append(", ");
            if (gVar != null) {
                str = gVar.f30958c;
            } else {
                str = null;
            }
            sb.append(str);
            sb.append(", ");
            if (gVar != null) {
                obj3 = Long.valueOf(gVar.f30959d);
            } else {
                obj3 = null;
            }
            sb.append(obj3);
            sb.append(", ");
            if (gVar != null) {
                str2 = gVar.f30960e;
            }
            sb.append(str2);
            C6921a.m21555a(sb.toString());
            Context context = this.f19758a.getContext();
            C7573i.m23582a((Object) context, "context");
            C31257b.m101861a(context, gVar);
            if (gVar != null) {
                String str3 = gVar.f30960e;
                if (str3 != null) {
                    try {
                        Object a = C31913m.m103667a(str3, GroupCheckMsg.class);
                        C7573i.m23582a(a, "GsonUtil.parse(this, GroupCheckMsg::class.java)");
                        GroupCheckMsg groupCheckMsg = (GroupCheckMsg) a;
                        this.f19758a.f19743d = GroupInviteDialog.m21779a(groupCheckMsg.getStatusCode());
                        this.f19758a.mo18087e();
                    } catch (Exception unused) {
                    }
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo18090a(List<? extends Member> list, C11438g gVar) {
            C6921a.m21555a("GroupInviteDialog enterGroup success with info");
            this.f19758a.dismiss();
            this.f19758a.mo18086d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.GroupInviteDialog$c */
    static final class C7000c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupInviteDialog f19759a;

        C7000c(GroupInviteDialog groupInviteDialog) {
            this.f19759a = groupInviteDialog;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f19759a.f19743d == 6) {
                this.f19759a.mo18082a();
                return;
            }
            this.f19759a.mo18085c();
            if (this.f19759a.f19747h == 1) {
                C31858ad.m103406a();
                C31858ad.m103478g(this.f19759a.f19742c, "group_inflow_toast_click");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.GroupInviteDialog$d */
    static final class C7001d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupInviteDialog f19760a;

        C7001d(GroupInviteDialog groupInviteDialog) {
            this.f19760a = groupInviteDialog;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f19760a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.GroupInviteDialog$e */
    static final class C7002e<TTaskResult, TContinuationResult> implements C1591g<GroupVerifyResponse, Void> {

        /* renamed from: a */
        final /* synthetic */ GroupInviteDialog f19761a;

        C7002e(GroupInviteDialog groupInviteDialog) {
            this.f19761a = groupInviteDialog;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(C1592h<GroupVerifyResponse> hVar) {
            Object obj;
            GroupVerifyInfo groupVerifyInfo;
            C7573i.m23582a((Object) hVar, "task");
            if (!hVar.mo6882b() || hVar.mo6890e() == null) {
                if (hVar.mo6891f() instanceof ApiServerException) {
                    Exception f = hVar.mo6891f();
                    if (f == null) {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException");
                    } else if (((ApiServerException) f).getRawResponse() instanceof GroupVerifyResponse) {
                        Exception f2 = hVar.mo6891f();
                        if (f2 != null) {
                            ApiServerException apiServerException = (ApiServerException) f2;
                            Object rawResponse = apiServerException.getRawResponse();
                            if (rawResponse != null) {
                                GroupVerifyResponse groupVerifyResponse = (GroupVerifyResponse) rawResponse;
                                this.f19761a.f19744e = groupVerifyResponse;
                                this.f19761a.f19745f = apiServerException.getErrorCode();
                                this.f19761a.mo18083a(groupVerifyResponse.getGroupVerifyInfo(), apiServerException.getErrorCode());
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.detail.model.GroupVerifyResponse");
                            }
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException");
                        }
                    }
                }
                this.f19761a.f19743d = 6;
            } else {
                this.f19761a.f19744e = (GroupVerifyResponse) hVar.mo6890e();
                GroupInviteDialog groupInviteDialog = this.f19761a;
                GroupVerifyResponse groupVerifyResponse2 = (GroupVerifyResponse) hVar.mo6890e();
                if (groupVerifyResponse2 != null) {
                    groupVerifyInfo = groupVerifyResponse2.getGroupVerifyInfo();
                } else {
                    groupVerifyInfo = null;
                }
                groupInviteDialog.mo18083a(groupVerifyInfo, ((GroupVerifyResponse) hVar.mo6890e()).status_code);
            }
            StringBuilder sb = new StringBuilder("GroupInviteDialog refreshGroupInfo, RawTicket:");
            sb.append(this.f19761a.f19746g);
            sb.append(", type:");
            sb.append(this.f19761a.f19747h);
            sb.append(", Response:");
            sb.append(this.f19761a.f19744e);
            sb.append(", VerifyInfo:");
            GroupVerifyResponse groupVerifyResponse3 = this.f19761a.f19744e;
            if (groupVerifyResponse3 != null) {
                obj = groupVerifyResponse3.getGroupVerifyInfo();
            } else {
                obj = null;
            }
            sb.append(obj);
            sb.append(", ErrorCode:");
            sb.append(this.f19761a.f19745f);
            sb.append(", CurrentType:");
            sb.append(this.f19761a.f19743d);
            C6921a.m21555a(sb.toString());
            String str = this.f19761a.f19741b;
            if (!(str == null || !C7074e.m22068a(str) || this.f19761a.f19743d == 8)) {
                this.f19761a.f19743d = 0;
            }
            this.f19761a.mo18087e();
            if (this.f19761a.f19743d == 0 || this.f19761a.f19743d == 8) {
                DmtTextView dmtTextView = this.f19761a.f19740a;
                C7573i.m23582a((Object) dmtTextView, "mDescriptionTv");
                dmtTextView.setText(C6399b.m19921a().getString(R.string.bkg));
            }
            if (this.f19761a.f19747h == 4) {
                switch (this.f19761a.f19743d) {
                    case 0:
                        C31858ad.m103464d(this.f19761a.f19742c, C7074e.m22069b().toString(), C7074e.m22069b().toString(), "send");
                        break;
                    case 1:
                        C31858ad.m103464d(this.f19761a.f19742c, this.f19761a.f19741b, C7074e.m22069b().toString(), "join");
                        break;
                    case 2:
                        C31858ad.m103464d(this.f19761a.f19742c, this.f19761a.f19741b, C7074e.m22069b().toString(), "expired");
                        break;
                }
            }
            return null;
        }
    }

    /* renamed from: g */
    private final void m21782g() {
        m21783h();
        mo18082a();
    }

    public final void onStop() {
        C6921a.m21555a("GroupInviteDialog onStop");
        super.onStop();
    }

    /* renamed from: f */
    private final void m21781f() {
        this.f19752n.setOnClickListener(new C7000c(this));
        this.f19753o.setOnClickListener(new C7001d(this));
    }

    /* renamed from: a */
    public final void mo18082a() {
        if (this.f19757s != null) {
            String str = this.f19741b;
            if (str != null && !C7074e.m22068a(str)) {
                this.f19743d = 5;
                mo18087e();
            }
            C7077s.m22157a(this.f19757s, this.f19747h, this.f19742c, (C1591g<GroupVerifyResponse, Void>) new C7002e<GroupVerifyResponse,Void>(this));
        }
    }

    /* renamed from: c */
    public final void mo18085c() {
        int i;
        int i2;
        if (this.f19747h == 4) {
            String str = this.f19742c;
            String str2 = this.f19741b;
            Integer num = this.f19755q;
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = 0;
            }
            C31858ad.m103425a(str, str2, i2);
        }
        StringBuilder sb = new StringBuilder("GroupInviteDialog enterGroup, mInviteUserId:");
        sb.append(this.f19741b);
        sb.append(", mConversationId:");
        sb.append(this.f19742c);
        sb.append(", mConversationShortId:");
        sb.append(this.f19754p);
        sb.append(", mTicket:");
        sb.append(this.f19757s);
        sb.append(", type=");
        sb.append(this.f19747h);
        C6921a.m21555a(sb.toString());
        String str3 = this.f19741b;
        if (str3 != null) {
            int i3 = this.f19747h;
            if (i3 == 1) {
                i = 2;
            } else if (i3 != 4) {
                i = 6;
            } else {
                i = 5;
            }
            C31244a.m101818a().mo81793a(this.f19742c, this.f19754p, C7525m.m23457a(IMUser.fromUser(C7074e.m22071c())), C31269b.m101892a(Long.parseLong(str3), i, this.f19757s), new C6999b(this));
        }
    }

    /* renamed from: d */
    public final void mo18086d() {
        if (this.f19747h == 1) {
            C6956a a = C6956a.m21632a();
            C7573i.m23582a((Object) a, "AwemeImManager.instance()");
            C7103h f = a.mo18009f();
            C7573i.m23582a((Object) f, "AwemeImManager.instance().proxy");
            if (f.isMainPage()) {
                Bundle bundle = new Bundle();
                bundle.putInt("key_enter_from", 8);
                ChatRoomActivity.m21596a(getContext(), this.f19742c, 3, bundle);
                C31858ad.m103406a();
                C31858ad.m103432a(this.f19742c, "", "group", "command", "");
                return;
            }
            C10761a.m31383a(getContext(), (int) R.string.bj8).mo25750a();
            return;
        }
        if (this.f19747h == 4) {
            C10761a.m31383a(getContext(), (int) R.string.bj8).mo25750a();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("key_enter_from", 8);
            ChatRoomActivity.m21596a(getContext(), this.f19742c, 3, bundle2);
            C31858ad.m103406a();
            C31858ad.m103432a(this.f19742c, "", "group", "invite_card", "");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x008d, code lost:
        if (r3 != null) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x006d, code lost:
        if (r2 == null) goto L_0x006f;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m21783h() {
        /*
            r8 = this;
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r8.f19750l
            java.lang.String r1 = "mNameTv"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            android.content.Context r1 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131823688(0x7f110c48, float:1.9280183E38)
            java.lang.String r1 = r1.getString(r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r8.f19740a
            java.lang.String r1 = "mDescriptionTv"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            android.content.Context r1 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131823691(0x7f110c4b, float:1.9280189E38)
            java.lang.String r1 = r1.getString(r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            com.ss.android.ugc.aweme.im.sdk.group.model.GroupInviteCardInfo r0 = r8.f19756r
            if (r0 == 0) goto L_0x013b
            java.lang.String r1 = r0.getConversationId()
            r8.f19742c = r1
            java.lang.String r1 = r0.getConversationShortId()
            r8.f19754p = r1
            java.lang.String r1 = r0.getFromUserId()
            r8.f19741b = r1
            com.bytedance.im.core.model.a r1 = com.bytedance.p263im.core.model.C6417a.m20015a()
            java.lang.String r2 = r0.getConversationId()
            com.bytedance.im.core.model.Conversation r1 = r1.mo15530a(r2)
            if (r1 == 0) goto L_0x006f
            com.bytedance.im.core.model.ConversationCoreInfo r2 = r1.getCoreInfo()
            if (r2 == 0) goto L_0x006f
            java.lang.String r2 = r2.getIcon()
            if (r2 == 0) goto L_0x006f
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r3 = r8.f19749k
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r3 = (com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView) r3
            com.p280ss.android.ugc.aweme.base.C23323e.m76514a(r3, r2)
            if (r2 != 0) goto L_0x007a
        L_0x006f:
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r2 = r8.f19749k
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r2 = (com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView) r2
            com.ss.android.ugc.aweme.base.model.UrlModel r3 = r0.getGroupIcon()
            com.p280ss.android.ugc.aweme.base.C23323e.m76524b(r2, r3)
        L_0x007a:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r8.f19750l
            java.lang.String r3 = "mNameTv"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            if (r1 == 0) goto L_0x0090
            com.bytedance.im.core.model.ConversationCoreInfo r3 = r1.getCoreInfo()
            if (r3 == 0) goto L_0x0090
            java.lang.String r3 = r3.getName()
            if (r3 == 0) goto L_0x0090
            goto L_0x0094
        L_0x0090:
            java.lang.String r3 = r0.getGroupName()
        L_0x0094:
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r2.setText(r3)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x00d6
            int r1 = r1.getMemberCount()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r8.f19755q = r4
            if (r1 <= 0) goto L_0x00d6
            com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = r8.f19751m
            java.lang.String r5 = "mCountTv"
            kotlin.jvm.internal.C7573i.m23582a(r4, r5)
            r4.setVisibility(r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = r8.f19751m
            java.lang.String r5 = "mCountTv"
            kotlin.jvm.internal.C7573i.m23582a(r4, r5)
            android.content.Context r5 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131823710(0x7f110c5e, float:1.9280227E38)
            java.lang.Object[] r7 = new java.lang.Object[r2]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r7[r3] = r1
            java.lang.String r1 = r5.getString(r6, r7)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r4.setText(r1)
        L_0x00d6:
            java.lang.String r1 = r0.getFromUserId()
            java.lang.CharSequence r4 = com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7074e.m22069b()
            java.lang.String r4 = r4.toString()
            boolean r1 = kotlin.jvm.internal.C7573i.m23585a(r1, r4)
            if (r1 == 0) goto L_0x0106
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r8.f19740a
            java.lang.String r1 = "mDescriptionTv"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            android.content.Context r1 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131823699(0x7f110c53, float:1.9280205E38)
            java.lang.String r1 = r1.getString(r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            r8.f19743d = r3
            goto L_0x0137
        L_0x0106:
            com.ss.android.ugc.aweme.im.sdk.d.d r1 = com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d.m21657a()
            java.lang.String r0 = r0.getFromUserId()
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = r1.mo18019a(r0)
            if (r0 == 0) goto L_0x0137
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r8.f19740a
            java.lang.String r4 = "mDescriptionTv"
            kotlin.jvm.internal.C7573i.m23582a(r1, r4)
            android.content.Context r4 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131823702(0x7f110c56, float:1.9280211E38)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r0 = r0.getDisplayName()
            r2[r3] = r0
            java.lang.String r0 = r4.getString(r5, r2)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.setText(r0)
        L_0x0137:
            r8.mo18087e()
            return
        L_0x013b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.group.view.GroupInviteDialog.m21783h():void");
    }

    /* renamed from: e */
    public final void mo18087e() {
        switch (this.f19743d) {
            case 0:
                DmtTextView dmtTextView = this.f19752n;
                if (dmtTextView != null) {
                    dmtTextView.setAlpha(0.5f);
                    dmtTextView.setEnabled(false);
                    Context context = dmtTextView.getContext();
                    C7573i.m23582a((Object) context, "context");
                    dmtTextView.setText(context.getResources().getString(R.string.bkd));
                    break;
                } else {
                    return;
                }
            case 1:
                DmtTextView dmtTextView2 = this.f19752n;
                if (dmtTextView2 != null) {
                    dmtTextView2.setAlpha(1.0f);
                    dmtTextView2.setEnabled(true);
                    Context context2 = dmtTextView2.getContext();
                    C7573i.m23582a((Object) context2, "context");
                    dmtTextView2.setText(context2.getResources().getString(R.string.bkb));
                    break;
                } else {
                    return;
                }
            case 2:
                DmtTextView dmtTextView3 = this.f19752n;
                if (dmtTextView3 != null) {
                    dmtTextView3.setAlpha(0.5f);
                    dmtTextView3.setEnabled(false);
                    Context context3 = dmtTextView3.getContext();
                    C7573i.m23582a((Object) context3, "context");
                    dmtTextView3.setText(context3.getResources().getString(R.string.bkc));
                    break;
                } else {
                    return;
                }
            case 3:
                DmtTextView dmtTextView4 = this.f19752n;
                if (dmtTextView4 != null) {
                    dmtTextView4.setAlpha(0.5f);
                    dmtTextView4.setEnabled(false);
                    Context context4 = dmtTextView4.getContext();
                    C7573i.m23582a((Object) context4, "context");
                    dmtTextView4.setText(context4.getResources().getString(R.string.bka));
                    break;
                } else {
                    return;
                }
            case 4:
                DmtTextView dmtTextView5 = this.f19752n;
                if (dmtTextView5 != null) {
                    dmtTextView5.setAlpha(0.5f);
                    dmtTextView5.setEnabled(false);
                    Context context5 = dmtTextView5.getContext();
                    C7573i.m23582a((Object) context5, "context");
                    dmtTextView5.setText(context5.getResources().getString(R.string.bk_));
                    break;
                } else {
                    return;
                }
            case 5:
                DmtTextView dmtTextView6 = this.f19752n;
                if (dmtTextView6 != null) {
                    dmtTextView6.setAlpha(1.0f);
                    dmtTextView6.setEnabled(true);
                    Context context6 = dmtTextView6.getContext();
                    C7573i.m23582a((Object) context6, "context");
                    dmtTextView6.setText(context6.getResources().getString(R.string.bkf));
                    break;
                } else {
                    return;
                }
            case 6:
                DmtTextView dmtTextView7 = this.f19752n;
                if (dmtTextView7 != null) {
                    dmtTextView7.setAlpha(1.0f);
                    dmtTextView7.setEnabled(true);
                    Context context7 = dmtTextView7.getContext();
                    C7573i.m23582a((Object) context7, "context");
                    dmtTextView7.setText(context7.getResources().getString(R.string.bke));
                    return;
                }
                break;
            case 7:
            case 8:
                DmtTextView dmtTextView8 = this.f19752n;
                if (dmtTextView8 != null) {
                    dmtTextView8.setAlpha(0.5f);
                    dmtTextView8.setEnabled(false);
                    Context context8 = dmtTextView8.getContext();
                    C7573i.m23582a((Object) context8, "context");
                    dmtTextView8.setText(context8.getResources().getString(R.string.bnx));
                    break;
                } else {
                    return;
                }
        }
    }

    /* renamed from: a */
    public final void mo18084a(GroupInviteCardInfo groupInviteCardInfo) {
        C7573i.m23587b(groupInviteCardInfo, "groupInviteCardInfo");
        this.f19756r = groupInviteCardInfo;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(this.f19748j);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-2, -2);
        }
        C6921a.m21555a("GroupInviteDialog onCreate");
        m21781f();
        m21782g();
    }

    /* renamed from: a */
    public static int m21779a(Integer num) {
        if ((num != null && num.intValue() == 7515) || ((num != null && num.intValue() == 7516) || (num != null && num.intValue() == 7517))) {
            return 2;
        }
        if (num != null && num.intValue() == 7519) {
            return 3;
        }
        if (num != null && num.intValue() == 7507) {
            return 4;
        }
        if (num != null && num.intValue() == 7520) {
            return 8;
        }
        if ((num != null && num.intValue() == 7521) || (num != null && num.intValue() == 7522)) {
            return 7;
        }
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d8, code lost:
        if (r1 == null) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0171, code lost:
        if (r10 == null) goto L_0x0173;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m21780a(com.p280ss.android.ugc.aweme.p313im.sdk.detail.model.GroupVerifyInfo r10) {
        /*
            r9 = this;
            java.lang.String r0 = r10.getInviterUserId()
            r9.f19741b = r0
            java.lang.String r0 = r10.getConversationId()
            r9.f19742c = r0
            java.lang.String r0 = r10.getConversationShortId()
            r9.f19754p = r0
            com.bytedance.im.core.model.a r0 = com.bytedance.p263im.core.model.C6417a.m20015a()
            java.lang.String r1 = r10.getConversationId()
            com.bytedance.im.core.model.Conversation r0 = r0.mo15530a(r1)
            java.lang.String r1 = r10.getGroupAvatar()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0031
            int r1 = r1.length()
            if (r1 != 0) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            r1 = 0
            goto L_0x0032
        L_0x0031:
            r1 = 1
        L_0x0032:
            r4 = 0
            if (r1 == 0) goto L_0x004b
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r1 = r9.f19749k
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = (com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView) r1
            if (r0 == 0) goto L_0x0046
            com.bytedance.im.core.model.ConversationCoreInfo r5 = r0.getCoreInfo()
            if (r5 == 0) goto L_0x0046
            java.lang.String r5 = r5.getIcon()
            goto L_0x0047
        L_0x0046:
            r5 = r4
        L_0x0047:
            com.p280ss.android.ugc.aweme.base.C23323e.m76514a(r1, r5)
            goto L_0x0056
        L_0x004b:
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r1 = r9.f19749k
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = (com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView) r1
            java.lang.String r5 = r10.getGroupAvatar()
            com.p280ss.android.ugc.aweme.base.C23323e.m76514a(r1, r5)
        L_0x0056:
            java.lang.String r1 = r10.getGroupName()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            if (r1 == 0) goto L_0x0067
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0065
            goto L_0x0067
        L_0x0065:
            r1 = 0
            goto L_0x0068
        L_0x0067:
            r1 = 1
        L_0x0068:
            if (r1 == 0) goto L_0x0083
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r9.f19750l
            java.lang.String r5 = "mNameTv"
            kotlin.jvm.internal.C7573i.m23582a(r1, r5)
            if (r0 == 0) goto L_0x007d
            com.bytedance.im.core.model.ConversationCoreInfo r5 = r0.getCoreInfo()
            if (r5 == 0) goto L_0x007d
            java.lang.String r4 = r5.getName()
        L_0x007d:
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r1.setText(r4)
            goto L_0x0093
        L_0x0083:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r9.f19750l
            java.lang.String r4 = "mNameTv"
            kotlin.jvm.internal.C7573i.m23582a(r1, r4)
            java.lang.String r4 = r10.getGroupName()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r1.setText(r4)
        L_0x0093:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r9.f19750l
            r1.requestLayout()
            java.lang.Integer r1 = r10.getGroupMemberCount()
            r4 = 2131823710(0x7f110c5e, float:1.9280227E38)
            if (r1 == 0) goto L_0x00da
            r5 = r1
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r9.f19755q = r6
            com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = r9.f19751m
            java.lang.String r7 = "mCountTv"
            kotlin.jvm.internal.C7573i.m23582a(r6, r7)
            r6.setVisibility(r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = r9.f19751m
            java.lang.String r7 = "mCountTv"
            kotlin.jvm.internal.C7573i.m23582a(r6, r7)
            android.content.Context r7 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()
            android.content.res.Resources r7 = r7.getResources()
            java.lang.Object[] r8 = new java.lang.Object[r2]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r8[r3] = r5
            java.lang.String r5 = r7.getString(r4, r8)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r6.setText(r5)
            if (r1 != 0) goto L_0x0112
        L_0x00da:
            if (r0 == 0) goto L_0x0112
            int r0 = r0.getMemberCount()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r9.f19755q = r1
            if (r0 <= 0) goto L_0x0112
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r9.f19751m
            java.lang.String r5 = "mCountTv"
            kotlin.jvm.internal.C7573i.m23582a(r1, r5)
            r1.setVisibility(r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r9.f19751m
            java.lang.String r5 = "mCountTv"
            kotlin.jvm.internal.C7573i.m23582a(r1, r5)
            android.content.Context r5 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()
            android.content.res.Resources r5 = r5.getResources()
            java.lang.Object[] r6 = new java.lang.Object[r2]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r3] = r0
            java.lang.String r0 = r5.getString(r4, r6)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.setText(r0)
        L_0x0112:
            java.lang.String r0 = r10.getInviterUserId()
            java.lang.CharSequence r1 = com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7074e.m22069b()
            java.lang.String r1 = r1.toString()
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0140
            com.bytedance.ies.dmt.ui.widget.DmtTextView r10 = r9.f19740a
            java.lang.String r0 = "mDescriptionTv"
            kotlin.jvm.internal.C7573i.m23582a(r10, r0)
            android.content.Context r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131823699(0x7f110c53, float:1.9280205E38)
            java.lang.String r0 = r0.getString(r1)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.setText(r0)
            goto L_0x018e
        L_0x0140:
            com.ss.android.ugc.aweme.im.sdk.d.d r0 = com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d.m21657a()
            java.lang.String r10 = r10.getInviterUserId()
            com.ss.android.ugc.aweme.im.service.model.IMUser r10 = r0.mo18019a(r10)
            if (r10 == 0) goto L_0x0173
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r9.f19740a
            java.lang.String r1 = "mDescriptionTv"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            android.content.Context r1 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()
            android.content.res.Resources r1 = r1.getResources()
            r4 = 2131823702(0x7f110c56, float:1.9280211E38)
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.String r6 = r10.getDisplayName()
            r5[r3] = r6
            java.lang.String r1 = r1.getString(r4, r5)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            if (r10 != 0) goto L_0x018e
        L_0x0173:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r10 = r9.f19740a
            java.lang.String r0 = "mDescriptionTv"
            kotlin.jvm.internal.C7573i.m23582a(r10, r0)
            android.content.Context r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131823691(0x7f110c4b, float:1.9280189E38)
            java.lang.String r0 = r0.getString(r1)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.setText(r0)
        L_0x018e:
            int r10 = r9.f19747h
            if (r10 != r2) goto L_0x019c
            com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad.m103406a()
            java.lang.String r10 = r9.f19742c
            java.lang.String r0 = "group_inflow_toast_show"
            com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad.m103478g(r10, r0)
        L_0x019c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.group.view.GroupInviteDialog.m21780a(com.ss.android.ugc.aweme.im.sdk.detail.model.GroupVerifyInfo):void");
    }

    /* renamed from: a */
    public final void mo18083a(GroupVerifyInfo groupVerifyInfo, int i) {
        boolean z;
        if (groupVerifyInfo != null) {
            this.f19741b = groupVerifyInfo.getInviterUserId();
            CharSequence ticket = groupVerifyInfo.getTicket();
            if (ticket == null || C7634n.m23713a(ticket)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                this.f19757s = groupVerifyInfo.getTicket();
            }
            m21780a(groupVerifyInfo);
            this.f19743d = m21779a(Integer.valueOf(i));
            if (groupVerifyInfo != null) {
                return;
            }
        }
        GroupInviteDialog groupInviteDialog = this;
        groupInviteDialog.f19743d = m21779a(Integer.valueOf(i));
        if (groupInviteDialog.f19743d == 1) {
            groupInviteDialog.f19743d = 6;
        }
    }

    public GroupInviteDialog(Context context, String str, int i) {
        C7573i.m23587b(context, "context");
        super(context, R.style.ue);
        this.f19757s = str;
        this.f19747h = i;
        View inflate = LayoutInflater.from(context).inflate(R.layout.a6z, null);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(cont…roup_invite_dialog, null)");
        this.f19748j = inflate;
    }
}
