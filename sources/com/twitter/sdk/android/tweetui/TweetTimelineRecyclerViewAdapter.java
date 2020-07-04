package com.twitter.sdk.android.tweetui;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.ViewGroup;
import com.twitter.sdk.android.core.C46821b;
import com.twitter.sdk.android.core.models.C46959o;
import com.twitter.sdk.android.core.models.C46960p;

public class TweetTimelineRecyclerViewAdapter extends C1262a<TweetViewHolder> {

    /* renamed from: a */
    protected final Context f120600a;

    /* renamed from: b */
    protected final C47009ad<C46959o> f120601b;

    /* renamed from: c */
    protected C46821b<C46959o> f120602c;

    /* renamed from: d */
    protected final int f120603d;

    protected static final class TweetViewHolder extends C1293v {
        public TweetViewHolder(C47042i iVar) {
            super(iVar);
        }
    }

    public int getItemCount() {
        return this.f120601b.mo118212a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(TweetViewHolder tweetViewHolder, int i) {
        ((C47042i) tweetViewHolder.itemView).setTweet((C46959o) this.f120601b.mo118213a(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public TweetViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C47042i iVar = new C47042i(this.f120600a, new C46960p().mo118091a(), this.f120603d);
        iVar.setOnActionCallback(this.f120602c);
        return new TweetViewHolder(iVar);
    }
}
