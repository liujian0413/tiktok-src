package com.bytedance.android.livesdk.kickout.p400ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3404s.C3405a;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.uikit.p176d.C3517a;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.kickout.C8363a;
import com.bytedance.android.livesdk.kickout.C8370b;
import com.bytedance.android.livesdk.kickout.p398a.C8368a;
import com.bytedance.android.livesdk.kickout.p398a.C8369b;
import com.bytedance.android.livesdk.kickout.p399b.C8371a;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.p188b.C3917a;
import com.bytedance.android.livesdk.p188b.C3922f;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.utils.C9076n;
import com.bytedance.android.livesdk.widget.C9245h.C9249a;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.common.utility.collection.C6307b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.kickout.ui.BannedViewHolder */
public class BannedViewHolder extends C1293v implements C3922f, C8370b {

    /* renamed from: a */
    public HSImageView f22944a;

    /* renamed from: b */
    public List<User> f22945b = new ArrayList();

    /* renamed from: c */
    public String f22946c;

    /* renamed from: d */
    private VHeadView f22947d;

    /* renamed from: e */
    private TextView f22948e;

    /* renamed from: f */
    private View f22949f;

    /* renamed from: g */
    private TextView f22950g;

    /* renamed from: h */
    private Context f22951h;

    /* renamed from: i */
    private C8363a f22952i;

    /* renamed from: j */
    private C3917a f22953j;

    /* renamed from: k */
    private User f22954k;

    /* renamed from: l */
    private long f22955l;

    /* renamed from: m */
    private long f22956m;

    /* renamed from: a */
    public final void mo21517a() {
    }

    /* renamed from: a */
    public final void mo21518a(C8371a aVar, Exception exc) {
    }

    /* renamed from: b */
    public final void mo21520b() {
    }

    /* renamed from: b */
    public final void mo11473b(boolean z, Exception exc) {
    }

    /* renamed from: a */
    public final void mo21519a(boolean z, Exception exc) {
        if (!z) {
            this.f22948e.setVisibility(0);
            this.f22949f.setVisibility(8);
            C9076n.m27095a(this.f22951h, exc);
        }
    }

    /* renamed from: a */
    public final void mo11472a(boolean z) {
        if (!z) {
            C9097a.m27146a().mo22267a((Object) new C8368a(false, this.f22954k.getId()));
            this.f22948e.setVisibility(0);
            this.f22949f.setVisibility(8);
        }
    }

    /* renamed from: c */
    public final Map<String, String> mo21529c() {
        HashMap hashMap = new HashMap();
        hashMap.put("anchor_id", String.valueOf(this.f22956m));
        hashMap.put("room_id", String.valueOf(this.f22955l));
        return hashMap;
    }

    /* renamed from: a */
    private static String m25477a(User user) {
        if (user == null) {
            return null;
        }
        return user.displayId;
    }

    /* renamed from: a */
    public final void mo21525a(int i) {
        if (!C8378d.m25496a(this.f22951h)) {
            C3517a.m12960a(this.f22951h, (int) R.string.efp);
        } else {
            m25480a((User) this.f22945b.get(i), this.f22946c);
        }
    }

    /* renamed from: a */
    private void m25478a(View view) {
        this.f22947d = (VHeadView) view.findViewById(R.id.aus);
        this.f22948e = (TextView) view.findViewById(R.id.ss);
        this.f22949f = view.findViewById(R.id.sx);
        this.f22950g = (TextView) view.findViewById(R.id.e9m);
        this.f22944a = (HSImageView) view.findViewById(R.id.e8y);
    }

    /* renamed from: b */
    public final void mo21521b(boolean z) {
        if (!z) {
            this.f22948e.setVisibility(0);
            this.f22949f.setVisibility(8);
            C9097a.m27146a().mo22267a((Object) new C8369b(false, this.f22954k.getId()));
        }
    }

    /* renamed from: a */
    private void m25480a(User user, String str) {
        String str2;
        int i;
        String str3;
        if (user != null) {
            this.f22954k = user;
            String string = this.f22951h.getString(R.string.ecq);
            if (TextUtils.isEmpty(m25477a(user))) {
                str2 = "";
            } else {
                str2 = m25477a(user);
            }
            Context context = this.f22951h;
            if (str.equals("activity_banned_talk")) {
                i = R.string.ecr;
            } else {
                i = R.string.ecs;
            }
            String string2 = context.getString(i);
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append(" ");
            sb.append(str2);
            sb.append(" ");
            sb.append(string2);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.toString());
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f22951h.getResources().getColor(R.color.ae2)), string.length() + 1, string.length() + 1 + str2.length(), 33);
            Map c = mo21529c();
            c.put("user_id", user.getIdStr());
            new C9249a(this.f22951h).mo22727c((CharSequence) spannableStringBuilder).mo22722b(1, (int) R.string.ecm, (OnClickListener) new C8376b(this, c)).mo22722b(0, (int) R.string.ecj, (OnClickListener) new C8377c(this, c, str, user)).mo22729d();
            if (this.f22946c.equals("activity_banned_talk")) {
                str3 = "livesdk_anchor_mute_cancel_toast_show";
            } else {
                str3 = "livesdk_anchor_blacklist_cancel_toast_show";
            }
            C8443c.m25663a().mo21606a(str3, c, new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo21526a(List<User> list, final int i) {
        ImageModel imageModel;
        if (list != null) {
            this.f22945b = list;
            User user = (User) list.get(i);
            if (user != null) {
                if (user.getAvatarThumb() != null) {
                    C5343e.m17043b(this.f22947d, user.getAvatarThumb());
                } else {
                    this.f22947d.setImageResource(R.drawable.c4_);
                }
                this.f22947d.setOnClickListener(new C8375a(user));
                this.f22950g.setText(m25477a(user));
                if (user.getUserHonor() != null) {
                    imageModel = user.getUserHonor().mo8707k();
                } else {
                    imageModel = null;
                }
                if (imageModel == null || C6307b.m19566a((Collection<T>) imageModel.getUrls())) {
                    this.f22944a.setVisibility(8);
                } else {
                    C5343e.m17035a((ImageView) this.f22944a, imageModel, (C3405a) new C3405a() {
                        /* renamed from: a */
                        public final void mo10308a(ImageModel imageModel) {
                        }

                        /* renamed from: a */
                        public final void mo10310a(ImageModel imageModel, Exception exc) {
                        }

                        /* renamed from: a */
                        public final void mo10309a(ImageModel imageModel, int i, int i2, boolean z) {
                            LayoutParams layoutParams = BannedViewHolder.this.f22944a.getLayoutParams();
                            int a = C3358ac.m12510a(32.0f);
                            layoutParams.width = a;
                            layoutParams.height = (i2 * a) / i;
                            BannedViewHolder.this.f22944a.setLayoutParams(layoutParams);
                        }
                    });
                    this.f22944a.setVisibility(0);
                }
                this.f22948e.setOnClickListener(new View.OnClickListener() {
                    public final void onClick(View view) {
                        String str;
                        BannedViewHolder.this.mo21525a(i);
                        User user = (User) BannedViewHolder.this.f22945b.get(i);
                        Map c = BannedViewHolder.this.mo21529c();
                        c.put("user_id", user.getIdStr());
                        if (BannedViewHolder.this.f22946c.equals("activity_banned_talk")) {
                            str = "livesdk_anchor_mute_cancel_click";
                        } else {
                            str = "livesdk_anchor_blacklist_cancel_click";
                        }
                        C8443c.m25663a().mo21606a(str, c, new Object[0]);
                    }
                });
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21527a(Map map, DialogInterface dialogInterface, int i) {
        String str;
        if (this.f22946c.equals("activity_banned_talk")) {
            str = "livesdk_anchor_mute_cancel_toast_click";
        } else {
            str = "livesdk_anchor_blacklist_cancel_toast_click";
        }
        map.put("action_type", "no");
        C8443c.m25663a().mo21606a(str, map, new Object[0]);
        dialogInterface.dismiss();
    }

    public BannedViewHolder(Context context, View view, String str, long j, long j2) {
        super(view);
        m25478a(view);
        this.f22951h = context;
        this.f22946c = str;
        this.f22955l = j;
        this.f22956m = j2;
        this.f22952i = new C8363a();
        this.f22952i.f22924a = this;
        this.f22953j = new C3917a();
        this.f22953j.f11735a = this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21528a(Map map, String str, User user, DialogInterface dialogInterface, int i) {
        String str2;
        Map map2 = map;
        if (this.f22946c.equals("activity_banned_talk")) {
            str2 = "livesdk_anchor_mute_cancel_toast_click";
        } else {
            str2 = "livesdk_anchor_blacklist_cancel_toast_click";
        }
        map.put("action_type", "yes");
        C8443c.m25663a().mo21606a(str2, map, new Object[0]);
        this.f22949f.setVisibility(0);
        this.f22948e.setVisibility(8);
        if (str.equals("activity_kick_out")) {
            this.f22952i.mo21512a(false, this.f22955l, user.getId());
        } else {
            this.f22953j.mo11467a(false, this.f22955l, user.getId());
        }
        dialogInterface.dismiss();
    }
}
