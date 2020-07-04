package com.bytedance.android.livesdk.admin.p187ui;

import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3404s.C3405a;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.uikit.p176d.C3517a;
import com.bytedance.android.livesdk.admin.p183a.C3886a;
import com.bytedance.android.livesdk.admin.p184b.C3889b;
import com.bytedance.android.livesdk.admin.p184b.C3890c;
import com.bytedance.android.livesdk.admin.p185c.C3892a;
import com.bytedance.android.livesdk.admin.p186d.C3897a;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.common.AbsViewHolder;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.C8448g;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdk.utils.C9076n;
import com.bytedance.android.livesdk.widget.C9245h.C9249a;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.common.utility.collection.C6307b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.admin.ui.AdminListViewHolder */
public class AdminListViewHolder extends AbsViewHolder implements C3897a {

    /* renamed from: a */
    public TextView f11638a;

    /* renamed from: b */
    public View f11639b;

    /* renamed from: c */
    public HSImageView f11640c;

    /* renamed from: d */
    public Context f11641d;

    /* renamed from: e */
    public C3892a f11642e = new C3892a(this);

    /* renamed from: f */
    public long f11643f;

    /* renamed from: g */
    public long f11644g;

    /* renamed from: i */
    private VHeadView f11645i;

    /* renamed from: j */
    private TextView f11646j;

    /* renamed from: k */
    private C3889b f11647k;

    /* renamed from: a */
    public final void mo11433a(C3890c cVar, Exception exc) {
    }

    /* renamed from: b */
    public final Map<String, String> mo11440b() {
        HashMap hashMap = new HashMap();
        hashMap.put("anchor_id", String.valueOf(this.f11643f));
        hashMap.put("room_id", String.valueOf(this.f11644g));
        hashMap.put("user_id", String.valueOf(this.f11647k.f11616a.getId()));
        return hashMap;
    }

    /* renamed from: a */
    public final void mo11438a() {
        if (this.f11647k != null && this.f11647k.f11616a != null) {
            if (!C3903b.m13776a(this.f11641d)) {
                C3517a.m12960a(this.f11641d, (int) R.string.efp);
            } else {
                m13765a(this.f11647k.f11616a);
            }
        }
    }

    /* renamed from: a */
    private void m13764a(View view) {
        this.f11645i = (VHeadView) view.findViewById(R.id.aus);
        this.f11638a = (TextView) view.findViewById(R.id.ss);
        this.f11639b = view.findViewById(R.id.sx);
        this.f11646j = (TextView) view.findViewById(R.id.e9m);
        this.f11640c = (HSImageView) view.findViewById(R.id.e8y);
        this.f11638a.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                AdminListViewHolder.this.mo11438a();
                C8443c.m25663a().mo21606a("livesdk_anchor_admin_cancel_click", AdminListViewHolder.this.mo11440b(), new Object[0]);
            }
        });
    }

    /* renamed from: a */
    private void m13765a(final User user) {
        String str;
        if (user != null) {
            String string = this.f11641d.getString(R.string.eco);
            if (TextUtils.isEmpty(user.getNickName())) {
                str = "";
            } else {
                str = user.getNickName();
            }
            String string2 = this.f11641d.getString(R.string.ecp);
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append(str);
            sb.append(string2);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.toString());
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f11641d.getResources().getColor(R.color.ae2)), string.length(), string.length() + str.length(), 33);
            new C9249a(this.f11641d).mo22727c((CharSequence) spannableStringBuilder).mo22722b(1, (int) R.string.ecm, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C8448g.m25682a(AdminListViewHolder.this.f11641d);
                    Map b = AdminListViewHolder.this.mo11440b();
                    b.put("action_type", "no");
                    C8443c.m25663a().mo21606a("livesdk_anchor_admin_cancel_toast_click", b, new Object[0]);
                    dialogInterface.dismiss();
                }
            }).mo22722b(0, (int) R.string.ecj, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C8448g.m25682a(AdminListViewHolder.this.f11641d);
                    AdminListViewHolder.this.f11639b.setVisibility(0);
                    AdminListViewHolder.this.f11638a.setVisibility(8);
                    AdminListViewHolder.this.f11642e.mo11431a(false, user.getId(), AdminListViewHolder.this.f11643f, AdminListViewHolder.this.f11644g);
                    Map b = AdminListViewHolder.this.mo11440b();
                    b.put("action_type", "yes");
                    C8443c.m25663a().mo21606a("livesdk_anchor_admin_cancel_toast_click", b, new Object[0]);
                    dialogInterface.dismiss();
                }
            }).mo22729d();
            C8443c.m25663a().mo21606a("livesdk_anchor_admin_cancel_toast_show", mo11440b(), new Object[0]);
            C8448g.m25682a(this.f11641d);
        }
    }

    /* renamed from: a */
    public final <T> void mo11439a(T t) {
        ImageModel imageModel;
        if (t instanceof C3889b) {
            this.f11647k = (C3889b) t;
            User user = this.f11647k.f11616a;
            if (user != null) {
                if (user.getAvatarThumb() != null) {
                    C5343e.m17043b(this.f11645i, user.getAvatarThumb());
                } else {
                    this.f11645i.setImageResource(R.drawable.c4_);
                }
                this.f11645i.setOnClickListener(new C3902a(user));
                this.f11646j.setText(user.getNickName());
                if (user.getUserHonor() != null) {
                    imageModel = user.getUserHonor().mo8707k();
                } else {
                    imageModel = null;
                }
                if (imageModel == null || C6307b.m19566a((Collection<T>) imageModel.getUrls())) {
                    this.f11640c.setVisibility(8);
                } else {
                    C5343e.m17035a((ImageView) this.f11640c, imageModel, (C3405a) new C3405a() {
                        /* renamed from: a */
                        public final void mo10308a(ImageModel imageModel) {
                        }

                        /* renamed from: a */
                        public final void mo10310a(ImageModel imageModel, Exception exc) {
                        }

                        /* renamed from: a */
                        public final void mo10309a(ImageModel imageModel, int i, int i2, boolean z) {
                            LayoutParams layoutParams = AdminListViewHolder.this.f11640c.getLayoutParams();
                            int a = C3358ac.m12510a(32.0f);
                            layoutParams.width = a;
                            layoutParams.height = (i2 * a) / i;
                            AdminListViewHolder.this.f11640c.setLayoutParams(layoutParams);
                        }
                    });
                    this.f11640c.setVisibility(0);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo11435a(boolean z, Exception exc) {
        if (!z) {
            this.f11638a.setVisibility(0);
            this.f11639b.setVisibility(8);
            C9076n.m27095a(this.f11641d, exc);
        }
    }

    /* renamed from: a */
    public final void mo11434a(boolean z, User user) {
        if (!z) {
            this.f11638a.setVisibility(0);
            this.f11639b.setVisibility(8);
            C9097a.m27146a().mo22267a((Object) new C3886a(z, user.getId()));
            C9049ap.m27022a((int) R.string.ezz);
        }
    }

    public AdminListViewHolder(Context context, View view, long j, long j2) {
        super(view, 0);
        m13764a(view);
        this.f11641d = context;
        this.f11643f = j;
        this.f11644g = j2;
    }
}
