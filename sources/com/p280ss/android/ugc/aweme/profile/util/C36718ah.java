package com.p280ss.android.ugc.aweme.profile.util;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.AsyncTask.Status;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.dialog.C11029b.C11030a;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.downloadlib.addownload.C19490i;
import com.p280ss.android.downloadlib.p868c.C19513b;
import com.p280ss.android.p872f.p873a.C19550a;
import com.p280ss.android.p872f.p873a.C19551b;
import com.p280ss.android.socialbase.appdownloader.AppDownloader;
import com.p280ss.android.socialbase.appdownloader.AppTaskBuilder;
import com.p280ss.android.socialbase.downloader.downloader.Downloader;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.profile.model.FollowerDetail;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.service.C36074j;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.profile.util.ah */
public final class C36718ah {

    /* renamed from: a */
    public C19550a f96375a;

    /* renamed from: b */
    public DownloadInfo f96376b;

    /* renamed from: c */
    private C36722b f96377c;

    /* renamed from: com.ss.android.ugc.aweme.profile.util.ah$a */
    public interface C36721a {
        /* renamed from: a */
        void mo92828a();
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.util.ah$b */
    class C36722b extends AsyncTask<String, Void, DownloadInfo> {
        private C36722b() {
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            return m118389a((String[]) objArr);
        }

        /* renamed from: a */
        private static DownloadInfo m118389a(String... strArr) {
            if (strArr == null || (strArr.length > 0 && TextUtils.isEmpty(strArr[0]))) {
                return null;
            }
            return AppDownloader.getInstance().getAppDownloadInfo(C6399b.m19921a(), strArr[0]);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onPostExecute(DownloadInfo downloadInfo) {
            super.onPostExecute(downloadInfo);
            if (!isCancelled()) {
                if (downloadInfo != null) {
                    try {
                        if (downloadInfo.getId() != 0 && !Downloader.getInstance(C6399b.m19921a()).isDownloadSuccessAndFileNotExist(downloadInfo)) {
                            if (C36718ah.this.f96376b == null || !(C36718ah.this.f96376b.getStatus() == -4 || C36718ah.this.f96376b.getStatus() == -1)) {
                                C36718ah.this.f96376b = downloadInfo;
                            } else {
                                C36718ah.this.f96376b = null;
                            }
                            return;
                        }
                    } catch (Exception unused) {
                    }
                }
                C36718ah.this.f96376b = null;
            }
        }
    }

    /* renamed from: a */
    private static boolean m118383a(Context context) {
        if (!(context instanceof Activity) || ((Activity) context).isFinishing()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static String m118381a(User user) {
        StringBuilder sb = new StringBuilder("snssdk143://profile?uid=");
        sb.append(user.getUid());
        String sb2 = sb.toString();
        List<FollowerDetail> followerDetailList = user.getFollowerDetailList();
        if (followerDetailList != null) {
            for (FollowerDetail followerDetail : followerDetailList) {
                if (followerDetail.getPackageName().equals("com.ss.android.article.news")) {
                    return followerDetail.getOpenUrl();
                }
            }
        }
        return sb2;
    }

    /* renamed from: a */
    private void m118382a(String str) {
        if (!(this.f96377c == null || this.f96377c.getStatus() == Status.FINISHED)) {
            this.f96377c.cancel(true);
        }
        this.f96377c = new C36722b();
        C19513b.m64281a(this.f96377c, str);
    }

    /* renamed from: b */
    private String m118384b(Context context, FollowerDetail followerDetail) {
        if (!C6776h.m20948b(context, followerDetail.getPackageName())) {
            return context.getString(R.string.bt0);
        }
        if (this.f96375a == null || this.f96375a.mo51692a("news_article")) {
            return context.getString(R.string.bt3);
        }
        return context.getString(R.string.bt5);
    }

    /* renamed from: c */
    private String m118385c(Context context, FollowerDetail followerDetail) {
        if (!C6776h.m20948b(context, followerDetail.getPackageName())) {
            return context.getString(R.string.cji, new Object[]{followerDetail.getName()});
        } else if (this.f96375a == null || this.f96375a.mo51692a("news_article")) {
            return context.getString(R.string.bt4, new Object[]{followerDetail.getName()});
        } else {
            return context.getString(R.string.jg, new Object[]{followerDetail.getName()});
        }
    }

    /* renamed from: a */
    public final void mo93045a(Context context, FollowerDetail followerDetail) {
        String str;
        if (this.f96376b == null || (this.f96376b.getStatus() != -3 && !Downloader.getInstance(context).canResume(this.f96376b.getId()))) {
            if (!TextUtils.isEmpty(followerDetail.getAppName())) {
                str = followerDetail.getAppName();
            } else {
                str = followerDetail.getName();
            }
            C19490i.m64190a(true, false, (JSONObject) null, new AppTaskBuilder(context, followerDetail.getDownloadUrl()).name(str).showNotification(true).mimeType("application/vnd.android.package-archive"));
            return;
        }
        AppDownloader.getInstance().handleStatusClick(context, this.f96376b.getId(), this.f96376b.getStatus());
    }

    /* renamed from: a */
    public final void mo93046a(Context context, FollowerDetail followerDetail, User user, C36721a aVar) {
        if (m118383a(context) && followerDetail != null) {
            m118382a(followerDetail.getDownloadUrl());
            if (this.f96375a == null) {
                this.f96375a = C19551b.m64422a(context);
            }
            C11030a b = new C11030a(context).mo26647b((CharSequence) m118385c(context, followerDetail));
            String b2 = m118384b(context, followerDetail);
            final User user2 = user;
            final Context context2 = context;
            final FollowerDetail followerDetail2 = followerDetail;
            final C36721a aVar2 = aVar;
            C367202 r2 = new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    String str;
                    String str2;
                    if (user2 != null) {
                        if (!C6776h.m20948b(context2, followerDetail2.getPackageName()) || !C36718ah.this.f96375a.mo51692a("news_article")) {
                            C36718ah.this.mo93045a(context2, followerDetail2);
                        } else if (aVar2 != null) {
                            MobClick eventName = MobClick.obtain().setEventName("head_to_other_link");
                            if (C6861a.m21337f().isMe(user2.getUid())) {
                                str2 = "personal_homepage";
                            } else {
                                str2 = "others_homepage";
                            }
                            C6907h.onEvent(eventName.setLabelName(str2).setValue(user2.getUid()).setJsonObject(C6869c.m21381a().mo16887a("link_type", followerDetail2.getAppName()).mo16887a("enter_from", "fans_power").mo16888b()));
                            aVar2.mo92828a();
                        } else {
                            MobClick eventName2 = MobClick.obtain().setEventName("head_to_other_link");
                            if (C6861a.m21337f().isMe(user2.getUid())) {
                                str = "personal_homepage";
                            } else {
                                str = "others_homepage";
                            }
                            C6907h.onEvent(eventName2.setLabelName(str).setValue(user2.getUid()).setJsonObject(C6869c.m21381a().mo16887a("link_type", followerDetail2.getAppName()).mo16887a("enter_from", "more_profile").mo16888b()));
                            if (TextUtils.equals(C6861a.m21337f().getCurUserId(), user2.getUid())) {
                                C36074j.f94315a.activeTT(context2, followerDetail2.getPackageName(), C6861a.m21337f().getCurUserId());
                                return;
                            }
                            Uri parse = Uri.parse(C36718ah.m118381a(user2));
                            Intent intent = new Intent("android.intent.action.VIEW");
                            intent.setData(parse);
                            context2.startActivity(intent);
                        }
                    }
                }
            };
            b.mo26641a((CharSequence) b2, (OnClickListener) r2).mo26646b((int) R.string.w_, (OnClickListener) new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                }
            }).mo26642a(false).mo26649b();
        }
    }
}
