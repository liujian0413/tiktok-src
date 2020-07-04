package com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.bytedance.p263im.core.model.Message;
import com.bytedance.p263im.core.p584a.C11202d.C11203a;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.p313im.sdk.abtest.IMMessageBgStyleExperiment;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.C30987r;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.C30987r.C30990a;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.MessageViewType;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.CheckMessage;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.SystemContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.p1315b.C30733a;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.selectmsg.C30997a;
import com.p280ss.android.ugc.aweme.p313im.sdk.debug.DebugActivity;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C31090n;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31852a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31877aw;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31878ax.C31882a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31892bd;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31913m;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31915n;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7063bg;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import org.greenrobot.eventbus.C7705c;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.BaseViewHolder */
public abstract class BaseViewHolder<CONTENT extends BaseContent> extends C1293v {

    /* renamed from: l */
    static int f81192l = -1;

    /* renamed from: a */
    public int f81193a = 7;

    /* renamed from: b */
    protected DmtTextView f81194b;

    /* renamed from: c */
    protected ImageView f81195c;

    /* renamed from: d */
    protected String f81196d;

    /* renamed from: e */
    protected View f81197e;

    /* renamed from: f */
    protected CONTENT f81198f;

    /* renamed from: g */
    public int f81199g;

    /* renamed from: h */
    protected SystemContent f81200h;

    /* renamed from: i */
    public Message f81201i;

    /* renamed from: j */
    protected C31882a f81202j;

    /* renamed from: k */
    protected C30990a f81203k;

    /* renamed from: m */
    private int f81204m;

    /* renamed from: n */
    private int f81205n;

    /* renamed from: o */
    private int f81206o;

    /* renamed from: p */
    private TextView f81207p;

    /* renamed from: q */
    private TextView f81208q;

    /* renamed from: r */
    private AvatarImageView f81209r;

    /* renamed from: s */
    private CheckBox f81210s;

    /* renamed from: t */
    private FrameLayout f81211t;

    /* renamed from: u */
    private DmtTextView f81212u;

    /* renamed from: v */
    private View f81213v;

    /* renamed from: w */
    private ImageView f81214w;

    /* renamed from: x */
    private View f81215x;

    /* renamed from: y */
    private C31036j f81216y;

    /* renamed from: z */
    private String f81217z;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo81428a(Message message, int i) {
    }

    /* renamed from: c */
    public View mo81434c() {
        return this.itemView;
    }

    /* renamed from: a */
    public final void mo81431a(C30997a aVar) {
        if (this.f81210s != null) {
            this.f81210s.setOnCheckedChangeListener(new C31021a(this, aVar));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo81432a(C30997a aVar, CompoundButton compoundButton, boolean z) {
        if (aVar != null) {
            aVar.mo81274a(z, getAdapterPosition());
        }
    }

    /* renamed from: a */
    public void mo81433a(IMUser iMUser, Message message, int i) {
        this.f81217z = null;
        if (iMUser == null) {
            if (message != null) {
                this.f81217z = String.valueOf(message.getSender());
                C6961d.m21657a().mo18021a(String.valueOf(message.getSender()), message.getSecSender());
            }
            return;
        }
        if (this.f81209r != null) {
            LayoutParams layoutParams = (LayoutParams) this.f81209r.getLayoutParams();
            if (message.getConversationType() != C11203a.f30381b || message.isSelf()) {
                layoutParams.topMargin = 0;
            } else {
                layoutParams.topMargin = (int) C9738o.m28708b(C6399b.m19921a(), 2.0f);
            }
            this.f81209r.setLayoutParams(layoutParams);
            this.f81209r.setTag(67108864, String.valueOf(message.getSender()));
            this.f81209r.setTag(50331648, Integer.valueOf(3));
            this.f81202j.mo82725a(this.f81209r);
            C23323e.m76524b(this.f81209r, iMUser.getAvatarThumb());
            C31852a.m103395a((ImageView) this.f81209r, iMUser);
        }
        if (this.f81212u != null) {
            if (message.isSelf() || !m100897d(message)) {
                this.f81212u.setVisibility(8);
            } else {
                this.f81212u.setText(iMUser.getDisplayName());
                this.f81212u.setVisibility(0);
            }
        }
    }

    /* renamed from: a */
    public void mo81421a(Message message, Message message2, CONTENT content, int i) {
        this.f81201i = message;
        this.f81198f = content;
        this.f81196d = String.valueOf(message.getSender());
        this.f81193a = MessageViewType.valueOf(message).getItemViewType();
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) this.itemView.getLayoutParams();
        if (i == 0) {
            layoutParams.setMargins(0, this.f81204m, 0, this.f81206o);
        } else {
            layoutParams.setMargins(0, this.f81204m, 0, this.f81204m);
        }
        if (this.f81207p != null) {
            this.f81207p.setTextColor(C6399b.m19921a().getResources().getColor(C31915n.m103672b() ? R.color.ay8 : R.color.up));
            this.f81207p.setPadding(this.f81207p.getPaddingLeft(), this.f81207p.getPaddingTop(), this.f81207p.getPaddingRight(), this.f81204m * 2);
            this.f81207p.setVisibility(m100896c(this.f81201i) ? 0 : 8);
        }
        if (this.f81208q != null) {
            if (message2 == null && this.f81193a != 9) {
                this.f81208q.setText(m100892a(this.itemView.getContext(), message.getCreatedAt()));
                this.f81208q.setVisibility(0);
            } else if (message2 == null || message.getCreatedAt() - message2.getCreatedAt() < 300000) {
                this.f81208q.setVisibility(8);
            } else {
                this.f81208q.setText(m100892a(this.itemView.getContext(), message.getCreatedAt()));
                this.f81208q.setVisibility(0);
            }
            if (i == 0) {
                this.f81208q.setPadding(this.f81208q.getPaddingLeft(), 0, this.f81208q.getPaddingRight(), this.f81208q.getPaddingBottom());
            } else {
                this.f81208q.setPadding(this.f81208q.getPaddingLeft(), (int) C9738o.m28708b(C6399b.m19921a(), 4.0f), this.f81208q.getPaddingRight(), this.f81208q.getPaddingBottom());
            }
            if (this.f81208q.getVisibility() == 0 && this.f81207p != null && this.f81207p.getVisibility() == 0) {
                this.f81207p.setPadding(this.f81207p.getPaddingLeft(), this.f81207p.getPaddingTop(), this.f81207p.getPaddingRight(), 0);
            }
        }
        if (this.f81197e != null) {
            this.f81197e.setTag(100663296, content);
            this.f81197e.setTag(134217728, message);
            mo81428a(message, f81192l);
        }
        if (this.f81209r != null) {
            this.f81209r.setTag(134217728, message);
            if (C30733a.m100118b(message.getConversationId()) && !C30733a.m100122f()) {
                this.f81209r.setEnabled(false);
            }
        }
        if (this.f81213v != null) {
            if (!C7063bg.m22053b() || !C7063bg.m22050a(this.f81201i, (BaseContent) content)) {
                this.f81213v.setVisibility(8);
            } else {
                this.f81213v.setVisibility(0);
            }
        }
        if (this.f81216y != null) {
            this.f81216y.mo81504a(message);
        }
        try {
            this.f81200h = CheckMessage.getContent((CheckMessage) C31913m.m103667a((String) message.getLocalExt().get("s:send_response_check_msg"), CheckMessage.class));
        } catch (Exception unused) {
            this.f81200h = null;
        }
        if (this.f81194b != null) {
            if (content != null && content.getExtContent() != null) {
                C30987r.m100847a(content.getExtContent(), (TextView) this.f81194b, this.f81196d);
            } else if (this.f81200h != null) {
                C30987r.m100847a(this.f81200h, (TextView) this.f81194b, this.f81196d);
            } else {
                this.f81194b.setText("");
                this.f81194b.setVisibility(8);
            }
        }
        if (!m100897d(this.f81201i)) {
            DebugActivity.m101400a((View) this.f81209r, this.f81201i);
        }
    }

    /* renamed from: a */
    public final void mo81430a(Message message, boolean z) {
        int i = 8;
        if (this.f81199g == 1) {
            m100894a(message);
            if (this.f81210s != null) {
                this.f81210s.setChecked(z);
            }
            FrameLayout frameLayout = this.f81211t;
            if (m100895b(message)) {
                i = 0;
            }
            m100893a((View) frameLayout, i);
            if (this.f81211t != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f81211t.getLayoutParams();
                if (message.getConversationType() != C11203a.f30381b || message.isSelf()) {
                    marginLayoutParams.topMargin = 0;
                } else {
                    marginLayoutParams.topMargin = this.f81204m;
                }
                this.f81211t.setLayoutParams(marginLayoutParams);
            }
        } else {
            m100893a((View) this.f81211t, 8);
            m100893a(this.f81215x, 8);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo81423b() {
        if (this.f81213v != null) {
            this.f81213v.setOnClickListener(new C31022b(this));
        }
    }

    /* renamed from: e */
    public final void mo81436e() {
        if (C7705c.m23799a().mo20392b((Object) this)) {
            C7705c.m23799a().mo20393c((Object) this);
        }
    }

    /* renamed from: d */
    public final void mo81435d() {
        if (!TextUtils.isEmpty(this.f81217z) && !C7705c.m23799a().mo20392b((Object) this)) {
            C7705c.m23799a().mo20389a((Object) this);
        }
        if (this.f81194b != null) {
            if (this.f81198f != null && this.f81198f.getExtContent() != null) {
                C30987r.m100846a(this.f81198f.getExtContent());
            } else if (this.f81200h != null) {
                C30987r.m100846a(this.f81200h);
            }
        }
    }

    /* renamed from: f */
    private void mo81444f() {
        Context context = this.itemView.getContext();
        this.f81199g = 0;
        this.f81204m = (int) C9738o.m28708b(context, 8.0f);
        this.f81205n = (int) C9738o.m28708b(context, 5.0f);
        this.f81206o = (int) C9738o.m28708b(context, 20.0f);
        this.f81202j = C31882a.m103579n();
        this.f81202j.f83352g = C31892bd.m103607a(context);
        this.f81203k = C30987r.m100842a(context.getResources().getColor(R.color.b0), this.f81196d);
        mo81420a();
        mo81423b();
        if (f81192l == -1) {
            f81192l = C6384b.m19835a().mo15287a(IMMessageBgStyleExperiment.class, true, "message_background_style_in_chat", C6384b.m19835a().mo15295d().message_background_style_in_chat, 0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo81420a() {
        String str;
        this.f81194b = (DmtTextView) mo81425a((int) R.id.c5n);
        this.f81208q = (TextView) mo81425a((int) R.id.c0f);
        this.f81212u = (DmtTextView) mo81425a((int) R.id.e9m);
        this.f81209r = (AvatarImageView) mo81425a((int) R.id.j2);
        this.f81215x = (View) mo81425a((int) R.id.ed1);
        this.f81210s = (CheckBox) mo81425a((int) R.id.tn);
        this.f81211t = (FrameLayout) mo81425a((int) R.id.bjp);
        this.f81213v = (View) mo81425a((int) R.id.ehu);
        this.f81207p = (TextView) mo81425a((int) R.id.e7v);
        this.f81214w = (ImageView) mo81425a((int) R.id.ehv);
        if (C7063bg.m22049a(this.itemView.getContext())) {
            str = "open";
        } else {
            str = "install";
        }
        C31858ad.m103409a(5, str, "duoshan_banner_show");
        DmtTextView dmtTextView = (DmtTextView) mo81425a((int) R.id.e0_);
        if (dmtTextView != null) {
            this.f81216y = new C31036j(dmtTextView);
        }
    }

    /* renamed from: c */
    private static boolean m100896c(Message message) {
        return message.getLocalExt().containsKey("show_unread_message_tips");
    }

    /* renamed from: d */
    private static boolean m100897d(Message message) {
        if (message.getConversationType() == C11203a.f30381b) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m100894a(Message message) {
        if (this.f81215x != null) {
            this.f81215x.setOnClickListener(new C31023c(this, message));
            this.f81215x.setVisibility(0);
        }
    }

    /* renamed from: b */
    private static boolean m100895b(Message message) {
        if (message == null || (message.getMsgStatus() != 2 && message.getMsgStatus() != 5)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final <T> T mo81425a(int i) {
        T findViewById = this.itemView.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        return null;
    }

    /* renamed from: a */
    public void mo81424a(OnClickListener onClickListener) {
        if (this.f81209r != null) {
            this.f81209r.setOnClickListener(onClickListener);
        }
        if (this.f81197e != null) {
            this.f81197e.setOnClickListener(onClickListener);
        }
    }

    @C7709l
    public void onUserUpdate(C31090n nVar) {
        if (TextUtils.equals(this.f81217z, nVar.f81584a)) {
            IMUser b = C6961d.m21657a().mo18029b(nVar.f81584a);
            if (b != null) {
                UrlModel avatarThumb = b.getAvatarThumb();
                if (avatarThumb == null || avatarThumb.getUrlList() == null || avatarThumb.getUrlList().size() == 0) {
                    C23323e.m76503a((RemoteImageView) this.f81209r, (int) R.drawable.a_j);
                } else {
                    C23323e.m76524b(this.f81209r, avatarThumb);
                }
                this.f81212u.setText(b.getDisplayName());
            }
        }
    }

    /* renamed from: a */
    public void mo81426a(OnLongClickListener onLongClickListener) {
        if (this.f81209r != null) {
            this.f81209r.setOnLongClickListener(onLongClickListener);
        }
        if (this.f81197e != null) {
            this.f81197e.setOnLongClickListener(onLongClickListener);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo81427a(View view) {
        C7063bg.m22028a(C6405d.m19984g(), 5, (Object) this.f81201i);
    }

    /* renamed from: a */
    private static CharSequence m100892a(Context context, long j) {
        return C31877aw.m103574b(context, j);
    }

    public BaseViewHolder(View view, int i) {
        super(view);
        mo81444f();
    }

    /* renamed from: a */
    private static void m100893a(View view, int i) {
        if (view != null) {
            view.setVisibility(i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo81429a(Message message, View view) {
        if (m100895b(message) && this.f81210s != null) {
            this.f81210s.setChecked(!this.f81210s.isChecked());
        }
    }
}
