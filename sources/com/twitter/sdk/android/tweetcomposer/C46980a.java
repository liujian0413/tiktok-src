package com.twitter.sdk.android.tweetcomposer;

import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import com.twitter.C46817c;
import com.twitter.sdk.android.core.C46821b;
import com.twitter.sdk.android.core.C46830i;
import com.twitter.sdk.android.core.C46965n;
import com.twitter.sdk.android.core.C46969q;
import com.twitter.sdk.android.core.C46972t;
import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.models.User;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.twitter.sdk.android.tweetcomposer.a */
final class C46980a {

    /* renamed from: a */
    final ComposerView f120548a;

    /* renamed from: b */
    final C46972t f120549b;

    /* renamed from: c */
    final Uri f120550c;

    /* renamed from: d */
    final C46974a f120551d;

    /* renamed from: e */
    final C46984c f120552e;

    /* renamed from: com.twitter.sdk.android.tweetcomposer.a$a */
    interface C46982a {
        /* renamed from: a */
        void mo118153a();

        /* renamed from: a */
        void mo118154a(String str);

        /* renamed from: b */
        void mo118155b(String str);
    }

    /* renamed from: com.twitter.sdk.android.tweetcomposer.a$b */
    class C46983b implements C46982a {
        /* renamed from: a */
        public final void mo118153a() {
            C46980a.this.mo118152a();
        }

        C46983b() {
        }

        /* renamed from: a */
        public final void mo118154a(String str) {
            int a = C46980a.this.mo118151a(str);
            C46980a.this.f120548a.setCharCount(C46980a.m146884a(a));
            if (C46980a.m146890c(a)) {
                C46980a.this.f120548a.setCharCountTextStyle(R.style.a03);
            } else {
                C46980a.this.f120548a.setCharCountTextStyle(R.style.a02);
            }
            C46980a.this.f120548a.mo118133a(C46980a.m146888b(a));
        }

        /* renamed from: b */
        public final void mo118155b(String str) {
            C46984c.m146902a().mo118157a("tweet");
            Intent intent = new Intent(C46980a.this.f120548a.getContext(), TweetUploadService.class);
            intent.putExtra("EXTRA_USER_TOKEN", (Parcelable) C46980a.this.f120549b.f120356a);
            intent.putExtra("EXTRA_TWEET_TEXT", str);
            intent.putExtra("EXTRA_IMAGE_URI", C46980a.this.f120550c);
            C46980a.this.f120548a.getContext().startService(intent);
            C46980a.this.f120551d.mo118130a();
        }
    }

    /* renamed from: com.twitter.sdk.android.tweetcomposer.a$c */
    static class C46984c {

        /* renamed from: a */
        public final C46817c f120555a = new C46817c();

        C46984c() {
        }

        /* renamed from: a */
        static C46985b m146902a() {
            return new C46986c(C46996l.m146918a().f120568e);
        }

        /* renamed from: a */
        static C46965n m146901a(C46972t tVar) {
            return C46969q.m146847a().mo118103a(tVar);
        }
    }

    /* renamed from: a */
    static int m146884a(int i) {
        return 140 - i;
    }

    /* renamed from: b */
    static boolean m146888b(int i) {
        return i > 0 && i <= 140;
    }

    /* renamed from: c */
    static boolean m146890c(int i) {
        return i > 140;
    }

    /* renamed from: c */
    private void m146889c() {
        Intent intent = new Intent("com.twitter.sdk.android.tweetcomposer.TWEET_COMPOSE_CANCEL");
        intent.setPackage(this.f120548a.getContext().getPackageName());
        this.f120548a.getContext().sendBroadcast(intent);
    }

    /* renamed from: b */
    private void m146887b() {
        C46984c.m146901a(this.f120549b).mo118095a().verifyCredentials(Boolean.valueOf(false), Boolean.valueOf(true), Boolean.valueOf(false)).mo123283a(new C46821b<User>() {
            /* renamed from: a */
            public final void mo29989a(TwitterException twitterException) {
                C46980a.this.f120548a.setProfilePhotoView(null);
            }

            /* renamed from: a */
            public final void mo29990a(C46830i<User> iVar) {
                C46980a.this.f120548a.setProfilePhotoView((User) iVar.f120123a);
            }
        });
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo118152a() {
        C46984c.m146902a().mo118157a("cancel");
        m146889c();
        this.f120551d.mo118130a();
    }

    /* renamed from: a */
    private void m146886a(Uri uri) {
        if (uri != null) {
            this.f120548a.setImageView(uri);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo118151a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        return this.f120552e.f120555a.mo117892a(str);
    }

    /* renamed from: a */
    private static String m146885a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(str2);
        }
        return sb.toString();
    }

    C46980a(ComposerView composerView, C46972t tVar, Uri uri, String str, String str2, C46974a aVar) {
        this(composerView, tVar, uri, str, str2, aVar, new C46984c());
    }

    private C46980a(ComposerView composerView, C46972t tVar, Uri uri, String str, String str2, C46974a aVar, C46984c cVar) {
        this.f120548a = composerView;
        this.f120549b = tVar;
        this.f120550c = uri;
        this.f120551d = aVar;
        this.f120552e = cVar;
        composerView.setCallbacks(new C46983b());
        composerView.setTweetText(m146885a(str, str2));
        m146887b();
        m146886a(uri);
        C46984c.m146902a().mo118156a();
    }
}
