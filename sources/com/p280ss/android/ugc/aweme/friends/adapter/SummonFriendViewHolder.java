package com.p280ss.android.ugc.aweme.friends.adapter;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageWithVerify;
import com.p280ss.android.ugc.aweme.challenge.model.Segment;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.friends.adapter.SummonFriendAdapter.C30020a;
import com.p280ss.android.ugc.aweme.friends.model.SummonFriendItem;
import com.p280ss.android.ugc.aweme.friends.p1281a.C30000b;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.utils.C43126fg;
import com.p280ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.friends.adapter.SummonFriendViewHolder */
public class SummonFriendViewHolder extends C1293v {

    /* renamed from: a */
    public String f78979a;

    /* renamed from: b */
    public int f78980b;

    /* renamed from: c */
    public C30020a f78981c;

    /* renamed from: d */
    private TextView f78982d;

    /* renamed from: e */
    private TextView f78983e;

    /* renamed from: f */
    private AvatarImageWithVerify f78984f;

    /* renamed from: a */
    public static String m98475a(int i) {
        return i == 1 ? "comment_at" : i == 0 ? "video_at" : "";
    }

    /* renamed from: a */
    private void m98476a(View view) {
        this.f78982d = (TextView) view.findViewById(R.id.dyg);
        this.f78983e = (TextView) view.findViewById(R.id.e1z);
        this.f78984f = (AvatarImageWithVerify) view.findViewById(R.id.czo);
    }

    /* renamed from: a */
    public final void mo76243a(final SummonFriendItem summonFriendItem, final String str) {
        String str2;
        TextView textView;
        String str3;
        UserVerify userVerify;
        if (!(summonFriendItem == null || summonFriendItem.mUser == null)) {
            final User user = summonFriendItem.mUser;
            if (C6399b.m19946v()) {
                textView = this.f78983e;
                StringBuilder sb = new StringBuilder("@");
                sb.append(C43122ff.m136777h(user));
                str2 = sb.toString();
            } else {
                textView = this.f78983e;
                if (TextUtils.isEmpty(user.getSignature())) {
                    str2 = this.f78983e.getResources().getString(R.string.ll);
                } else {
                    str2 = user.getSignature();
                }
            }
            textView.setText(str2);
            if (summonFriendItem.mUser.getNickname() == null) {
                str3 = "";
            } else {
                str3 = summonFriendItem.mUser.getNickname();
            }
            SpannableString spannableString = new SpannableString(str3);
            if (summonFriendItem.segments != null) {
                for (Segment segment : summonFriendItem.segments) {
                    if (segment != null) {
                        spannableString = m98474a(spannableString, segment.begin, segment.end + 1);
                    }
                }
            }
            this.f78982d.setText(spannableString);
            if (user != null) {
                userVerify = new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType()), user.getWeiboVerify());
            } else {
                userVerify = null;
            }
            this.f78984f.setUserData(userVerify);
            if (user != null && C6399b.m19944t()) {
                this.f78984f.mo60896b();
                C43126fg.m136801a(this.itemView.getContext(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), this.f78982d);
            }
            this.itemView.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    String str;
                    ClickInstrumentation.onClick(view);
                    int i = summonFriendItem.type;
                    if (!TextUtils.isEmpty(str)) {
                        C6907h.onEvent(MobClick.obtain().setEventName(SummonFriendViewHolder.m98475a(SummonFriendViewHolder.this.f78980b)).setLabelName("search").setExtValueString(user.getUid()).setValue(SummonFriendViewHolder.this.f78979a).setJsonObject(C6869c.m21381a().mo16887a("search_keyword", str).mo16888b()));
                    }
                    if (C6399b.m19944t() && SummonFriendViewHolder.this.f78980b == 0) {
                        String str2 = "add_video_at";
                        C22984d a = C22984d.m75611a().mo59973a("search_keyword", str);
                        String str3 = "log_pb";
                        C28199ae a2 = C28199ae.m92689a();
                        if (SummonFriendViewHolder.this.f78981c != null) {
                            str = SummonFriendViewHolder.this.f78981c.mo76241a();
                        } else {
                            str = "";
                        }
                        C6907h.m21528b(str2, C33230ac.m107211a(a.mo59973a(str3, a2.mo71791a(str)).mo59973a("to_user_id", user.getUid()).f60753a));
                    }
                    if (!TextUtils.equals(C21115b.m71197a().getCurUserId(), user.getUid())) {
                        user.setAtType(i);
                        C6907h.onEvent(MobClick.obtain().setEventName("at_friend").setLabelName("friend_list").setValue(user.getUid()));
                        C42961az.m136380a(new C30000b(user));
                        return;
                    }
                    C10761a.m31409e(SummonFriendViewHolder.this.itemView.getContext(), (int) R.string.cly).mo25750a();
                }
            });
        }
    }

    public SummonFriendViewHolder(View view, String str, int i) {
        super(view);
        m98476a(view);
        this.f78979a = str;
        this.f78980b = i;
    }

    /* renamed from: a */
    private SpannableString m98474a(SpannableString spannableString, int i, int i2) {
        if (TextUtils.isEmpty(spannableString)) {
            return spannableString;
        }
        int max = Math.max(0, i);
        if (TextUtils.isEmpty(spannableString) || max > i2 || max >= spannableString.length() || i2 > spannableString.length()) {
            return spannableString;
        }
        spannableString.setSpan(new ForegroundColorSpan(this.itemView.getResources().getColor(R.color.a4p)), max, i2, 17);
        return spannableString;
    }
}
