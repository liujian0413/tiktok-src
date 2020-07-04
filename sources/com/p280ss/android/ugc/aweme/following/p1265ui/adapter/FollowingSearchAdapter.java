package com.p280ss.android.ugc.aweme.following.p1265ui.adapter;

import android.support.p022v4.content.C0683b;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageWithVerify;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.follow.widet.C29548a;
import com.p280ss.android.ugc.aweme.follow.widet.C29548a.C29556e;
import com.p280ss.android.ugc.aweme.following.p1265ui.view.FollowUserBtn;
import com.p280ss.android.ugc.aweme.metrics.C33276r;
import com.p280ss.android.ugc.aweme.metrics.C33280v;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.UserProfileActivity;
import com.p280ss.android.ugc.aweme.utils.C42918af;
import com.p280ss.android.ugc.aweme.utils.C43126fg;
import com.p280ss.android.ugc.aweme.utils.UserVerify;
import com.taobao.android.dexposed.ClassUtils;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowingSearchAdapter */
public class FollowingSearchAdapter extends BaseAdapter<IMUser> {

    /* renamed from: a */
    public static final String f78264a = "FollowingSearchAdapter";

    /* renamed from: b */
    public String f78265b = "";

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowingSearchAdapter$ViewHolder */
    class ViewHolder extends C1293v {

        /* renamed from: a */
        C29548a f78266a;
        View editRemark;
        AvatarImageWithVerify ivAvatar;
        View more;
        TextView txtDesc;
        FollowUserBtn txtFollow;
        TextView txtUserName;

        /* renamed from: a */
        public final void mo75733a(IMUser iMUser) {
            final User user = IMUser.toUser(iMUser);
            if (user.getFollowStatus() == 2) {
                user.setFollowerStatus(1);
            }
            this.itemView.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    UserProfileActivity.m117388a(ViewHolder.this.itemView.getContext(), user, "following");
                    new C33276r().mo85322o(user.getUid()).mo85310b("following").mo85319i("personal_homepage").mo85318g("1044").mo85252e();
                }
            });
            UserVerify userVerify = new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType()), user.getWeiboVerify());
            this.ivAvatar.setUserData(userVerify);
            FollowingSearchAdapter.this.mo75731a(this.txtUserName, iMUser, FollowingSearchAdapter.this.f78265b);
            FollowingSearchAdapter.this.mo75732b(this.txtDesc, iMUser, FollowingSearchAdapter.this.f78265b);
            this.f78266a.f77866c = new C29756i(this, iMUser);
            this.f78266a.mo75558a(user);
            this.more.getLayoutParams().width = 0;
            if (C6399b.m19944t()) {
                this.ivAvatar.mo60896b();
                C43126fg.m136801a(this.itemView.getContext(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), this.txtUserName);
            }
        }

        ViewHolder(View view) {
            super(view);
            ButterKnife.bind((Object) this, view);
            this.f78266a = new C29548a(this.txtFollow, new C29556e(FollowingSearchAdapter.this) {
                /* renamed from: a */
                public final void mo67853a(int i, User user) {
                    String str;
                    String str2;
                    super.mo67853a(i, user);
                    if (i == 1) {
                        str = "follow";
                    } else {
                        str = "follow_cancel";
                    }
                    C33280v c = new C33280v(str).mo85345e("others_homepage").mo85341b("common_relation").mo85343c("follow_button");
                    if (i == 1) {
                        str2 = "1007";
                    } else {
                        str2 = "1036";
                    }
                    c.mo85340a(str2).mo85348g(user.getUid()).mo85252e();
                }
            });
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo75734a(IMUser iMUser, FollowStatus followStatus) {
            if (followStatus != null) {
                FollowingSearchAdapter.this.mo75731a(this.txtUserName, iMUser, FollowingSearchAdapter.this.f78265b);
                FollowingSearchAdapter.this.mo75732b(this.txtDesc, iMUser, FollowingSearchAdapter.this.f78265b);
                if (followStatus.isFollowSucess) {
                    iMUser.setFollowStatus(followStatus.followStatus);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowingSearchAdapter$ViewHolder_ViewBinding */
    public class ViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private ViewHolder f78272a;

        public void unbind() {
            ViewHolder viewHolder = this.f78272a;
            if (viewHolder != null) {
                this.f78272a = null;
                viewHolder.ivAvatar = null;
                viewHolder.txtUserName = null;
                viewHolder.txtDesc = null;
                viewHolder.txtFollow = null;
                viewHolder.editRemark = null;
                viewHolder.more = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.f78272a = viewHolder;
            viewHolder.ivAvatar = (AvatarImageWithVerify) Utils.findRequiredViewAsType(view, R.id.b64, "field 'ivAvatar'", AvatarImageWithVerify.class);
            viewHolder.txtUserName = (TextView) Utils.findRequiredViewAsType(view, R.id.e7f, "field 'txtUserName'", TextView.class);
            viewHolder.txtDesc = (TextView) Utils.findRequiredViewAsType(view, R.id.e6j, "field 'txtDesc'", TextView.class);
            viewHolder.txtFollow = (FollowUserBtn) Utils.findRequiredViewAsType(view, R.id.e6o, "field 'txtFollow'", FollowUserBtn.class);
            viewHolder.editRemark = Utils.findRequiredView(view, R.id.b8s, "field 'editRemark'");
            viewHolder.more = Utils.findRequiredView(view, R.id.bzu, "field 'more'");
        }
    }

    public void onViewAttachedToWindow(C1293v vVar) {
        super.onViewAttachedToWindow(vVar);
    }

    public void onViewDetachedFromWindow(C1293v vVar) {
        super.onViewDetachedFromWindow(vVar);
    }

    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        ((ViewHolder) vVar).mo75733a((IMUser) this.f67539l.get(i));
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.w4, viewGroup, false));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo75731a(TextView textView, IMUser iMUser, String str) {
        if (C6399b.m19944t()) {
            textView.setText(iMUser.getDisplayId());
        } else if (TextUtils.isEmpty(str)) {
            textView.setText(iMUser.getDisplayName());
        } else {
            if (C6399b.m19944t()) {
                String nickName = iMUser.getNickName();
                if (!TextUtils.isEmpty(nickName) && !nickName.contains(str)) {
                    str = str.toLowerCase();
                    int indexOf = nickName.toLowerCase().indexOf(str);
                    if (indexOf != -1) {
                        str = nickName.substring(indexOf, Math.min(str.length() + indexOf, nickName.length()));
                    }
                }
            } else if (iMUser.getSearchType() == 5) {
                str = C42918af.m136254a(iMUser.getRemarkName(), iMUser.getRemarkPinyin(), iMUser.getRemarkInitial(), str);
            } else if (iMUser.getSearchType() == 3) {
                str = C42918af.m136254a(iMUser.getNickName(), iMUser.getNickNamePinyin(), iMUser.getNickNameInitial(), str);
            }
            m97484a(textView, iMUser.getDisplayName(), str, 0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo75732b(TextView textView, IMUser iMUser, String str) {
        if (C6399b.m19944t()) {
            textView.setText(iMUser.getNickName());
            return;
        }
        if (TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(iMUser.getSignature())) {
                textView.setText(iMUser.getSignature());
                textView.setVisibility(0);
                return;
            }
        } else if (iMUser.getSearchType() == 5) {
            if (!TextUtils.isEmpty(iMUser.getSignature())) {
                textView.setText(iMUser.getSignature());
                textView.setVisibility(0);
                return;
            }
        } else if (iMUser.getSearchType() == 3) {
            if (!TextUtils.isEmpty(iMUser.getRemarkName())) {
                m97484a(textView, C6399b.m19921a().getResources().getString(R.string.b8j, new Object[]{iMUser.getNickName()}), C42918af.m136254a(iMUser.getNickName(), iMUser.getNickNamePinyin(), iMUser.getNickNameInitial(), str), 3);
                textView.setVisibility(0);
                return;
            } else if (!TextUtils.isEmpty(iMUser.getSignature())) {
                textView.setText(iMUser.getSignature());
                textView.setVisibility(0);
                return;
            }
        } else if (iMUser.getSearchType() == 1) {
            String displayId = iMUser.getDisplayId();
            String a = C42918af.m136254a(displayId, C42918af.m136257b(displayId).toLowerCase(), C42918af.m136253a(displayId), str);
            StringBuilder sb = new StringBuilder();
            sb.append(C6399b.m19921a().getResources().getString(R.string.bfu));
            sb.append(displayId);
            m97484a(textView, sb.toString(), a, 4);
            textView.setVisibility(0);
            return;
        } else if (iMUser.getSearchType() == 2) {
            m97484a(textView, C6399b.m19921a().getResources().getString(R.string.bia, new Object[]{iMUser.getContactName()}), C42918af.m136254a(iMUser.getContactName(), iMUser.getContactNamePinyin(), iMUser.getContactNameInitial(), str), 6);
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
    }

    /* renamed from: a */
    private void m97484a(TextView textView, String str, String str2, int i) {
        textView.setText(m97483a(C0683b.m2912c(textView.getContext(), R.color.ax8), str, str2, i));
    }

    /* renamed from: a */
    private static SpannableString m97483a(int i, String str, String str2, int i2) {
        if (str2.contains(ClassUtils.PACKAGE_SEPARATOR)) {
            str2 = str2.replace(ClassUtils.PACKAGE_SEPARATOR, "\\.");
        }
        SpannableString spannableString = new SpannableString(str);
        try {
            Matcher matcher = Pattern.compile(str2).matcher(spannableString);
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
