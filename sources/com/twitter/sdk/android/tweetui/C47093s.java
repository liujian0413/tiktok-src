package com.twitter.sdk.android.tweetui;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.twitter.sdk.android.core.C46827f;
import com.twitter.sdk.android.tweetui.PlayerActivity.PlayerItem;
import com.twitter.sdk.android.tweetui.internal.C47077j;
import com.twitter.sdk.android.tweetui.internal.C47077j.C47078a;
import com.twitter.sdk.android.tweetui.internal.VideoControlView;
import com.twitter.sdk.android.tweetui.internal.VideoView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.twitter.sdk.android.tweetui.s */
final class C47093s {

    /* renamed from: a */
    final VideoView f120846a;

    /* renamed from: b */
    final VideoControlView f120847b;

    /* renamed from: c */
    final ProgressBar f120848c;

    /* renamed from: d */
    final TextView f120849d;

    /* renamed from: e */
    final View f120850e;

    /* renamed from: f */
    int f120851f;

    /* renamed from: g */
    boolean f120852g = true;

    /* renamed from: h */
    final C47078a f120853h;

    /* renamed from: e */
    private void m147230e() {
        this.f120846a.setMediaController(this.f120847b);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo118368c() {
        this.f120846a.mo118307d();
    }

    /* renamed from: f */
    private void m147231f() {
        this.f120850e.setOnClickListener(new C47098x(this));
    }

    /* renamed from: d */
    private void m147229d() {
        this.f120847b.setVisibility(4);
        this.f120846a.setOnClickListener(new C47096v(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo118360a() {
        if (this.f120851f != 0) {
            this.f120846a.mo118299a(this.f120851f);
        }
        if (this.f120852g) {
            this.f120846a.mo118298a();
            this.f120847b.mo118289f();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo118366b() {
        this.f120852g = this.f120846a.mo118301c();
        this.f120851f = this.f120846a.getCurrentPosition();
        this.f120846a.mo118300b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo118361a(MediaPlayer mediaPlayer) {
        this.f120848c.setVisibility(8);
    }

    /* renamed from: a */
    private void m147226a(String str) {
        this.f120849d.setOnClickListener(new C47097w(this, str));
    }

    /* renamed from: b */
    private void m147228b(PlayerItem playerItem) {
        if (playerItem.callToActionText != null && playerItem.callToActionUrl != null) {
            this.f120849d.setVisibility(0);
            this.f120849d.setText(playerItem.callToActionText);
            m147226a(playerItem.callToActionUrl);
            m147231f();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo118362a(View view) {
        if (this.f120849d.getVisibility() == 0) {
            this.f120849d.setVisibility(8);
        } else {
            this.f120849d.setVisibility(0);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo118367b(View view) {
        if (this.f120846a.mo118301c()) {
            this.f120846a.mo118300b();
        } else {
            this.f120846a.mo118298a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo118363a(PlayerItem playerItem) {
        try {
            m147228b(playerItem);
            m147227a(playerItem.looping, playerItem.showVideoControls);
            this.f120846a.setOnTouchListener(C47077j.m147180a((View) this.f120846a, this.f120853h));
            this.f120846a.setOnPreparedListener(new C47094t(this));
            this.f120846a.setOnInfoListener(new C47095u(this));
            this.f120846a.mo118305a(Uri.parse(playerItem.url), playerItem.looping);
            this.f120846a.requestFocus();
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private void m147227a(boolean z, boolean z2) {
        if (!z || z2) {
            m147230e();
        } else {
            m147229d();
        }
    }

    C47093s(View view, C47078a aVar) {
        this.f120850e = view;
        this.f120846a = (VideoView) view.findViewById(R.id.ebx);
        this.f120847b = (VideoControlView) view.findViewById(R.id.eae);
        this.f120848c = (ProgressBar) view.findViewById(R.id.ebc);
        this.f120849d = (TextView) view.findViewById(R.id.sm);
        this.f120853h = aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo118364a(String str, View view) {
        C46827f.m146486b(this.f120849d.getContext(), new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ boolean mo118365a(MediaPlayer mediaPlayer, int i, int i2) {
        if (i == 702) {
            this.f120848c.setVisibility(8);
            return true;
        } else if (i != 701) {
            return false;
        } else {
            this.f120848c.setVisibility(0);
            return true;
        }
    }
}
