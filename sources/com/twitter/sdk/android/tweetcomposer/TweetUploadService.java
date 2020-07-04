package com.twitter.sdk.android.tweetcomposer;

import android.app.IntentService;
import android.content.Intent;
import android.net.Uri;
import com.twitter.sdk.android.core.C46821b;
import com.twitter.sdk.android.core.C46830i;
import com.twitter.sdk.android.core.C46965n;
import com.twitter.sdk.android.core.C46969q;
import com.twitter.sdk.android.core.C46972t;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.models.C46953j;
import com.twitter.sdk.android.core.models.C46959o;
import java.io.File;
import okhttp3.MediaType;
import okhttp3.RequestBody;

public class TweetUploadService extends IntentService {

    /* renamed from: a */
    C46979a f120542a;

    /* renamed from: b */
    Intent f120543b;

    /* renamed from: com.twitter.sdk.android.tweetcomposer.TweetUploadService$a */
    static class C46979a {
        C46979a() {
        }

        /* renamed from: a */
        static C46965n m146883a(C46972t tVar) {
            return C46969q.m146847a().mo118103a(tVar);
        }
    }

    public TweetUploadService() {
        this(new C46979a());
    }

    TweetUploadService(C46979a aVar) {
        super("TweetUploadService");
        this.f120542a = aVar;
    }

    /* renamed from: a */
    private void m146873a(Intent intent) {
        Intent intent2 = new Intent("com.twitter.sdk.android.tweetcomposer.UPLOAD_FAILURE");
        intent2.putExtra("EXTRA_RETRY_INTENT", intent);
        intent2.setPackage(getApplicationContext().getPackageName());
        sendBroadcast(intent2);
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        TwitterAuthToken twitterAuthToken = (TwitterAuthToken) intent.getParcelableExtra("EXTRA_USER_TOKEN");
        this.f120543b = intent;
        m146875a(new C46972t(twitterAuthToken, -1, ""), intent.getStringExtra("EXTRA_TWEET_TEXT"), (Uri) intent.getParcelableExtra("EXTRA_IMAGE_URI"));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo118147a(long j) {
        Intent intent = new Intent("com.twitter.sdk.android.tweetcomposer.UPLOAD_SUCCESS");
        intent.putExtra("EXTRA_TWEET_ID", j);
        intent.setPackage(getApplicationContext().getPackageName());
        sendBroadcast(intent);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo118148a(TwitterException twitterException) {
        m146873a(this.f120543b);
        stopSelf();
    }

    /* renamed from: a */
    private void m146875a(final C46972t tVar, final String str, Uri uri) {
        if (uri != null) {
            m146874a(tVar, uri, (C46821b<C46953j>) new C46821b<C46953j>() {
                /* renamed from: a */
                public final void mo29989a(TwitterException twitterException) {
                    TweetUploadService.this.mo118148a(twitterException);
                }

                /* renamed from: a */
                public final void mo29990a(C46830i<C46953j> iVar) {
                    TweetUploadService.this.mo118149a(tVar, str, ((C46953j) iVar.f120123a).f120394b);
                }
            });
        } else {
            mo118149a(tVar, str, (String) null);
        }
    }

    /* renamed from: a */
    private void m146874a(C46972t tVar, Uri uri, C46821b<C46953j> bVar) {
        C46965n a = C46979a.m146883a(tVar);
        String a2 = C46991h.m146908a(this, uri);
        if (a2 == null) {
            mo118148a(new TwitterException("Uri file path resolved to null"));
            return;
        }
        File file = new File(a2);
        a.mo118099e().upload(RequestBody.create(MediaType.parse(C46991h.m146910a(file)), file), null, null).mo123283a(bVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo118149a(C46972t tVar, String str, String str2) {
        C46979a.m146883a(tVar).mo118097c().update(str, null, null, null, null, null, null, Boolean.valueOf(true), str2).mo123283a(new C46821b<C46959o>() {
            /* renamed from: a */
            public final void mo29989a(TwitterException twitterException) {
                TweetUploadService.this.mo118148a(twitterException);
            }

            /* renamed from: a */
            public final void mo29990a(C46830i<C46959o> iVar) {
                TweetUploadService.this.mo118147a(((C46959o) iVar.f120123a).getId());
                TweetUploadService.this.stopSelf();
            }
        });
    }
}
