package com.twitter.sdk.android.core.identity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.twitter.sdk.android.core.C46821b;
import com.twitter.sdk.android.core.C46969q;
import com.twitter.sdk.android.core.C46972t;
import com.twitter.sdk.android.core.internal.C46869g;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;

public class TwitterLoginButton extends Button {

    /* renamed from: a */
    final WeakReference<Activity> f120135a;

    /* renamed from: b */
    volatile TwitterAuthClient f120136b;

    /* renamed from: c */
    OnClickListener f120137c;

    /* renamed from: d */
    C46821b<C46972t> f120138d;

    /* renamed from: com.twitter.sdk.android.core.identity.TwitterLoginButton$a */
    class C46834a implements OnClickListener {
        private C46834a() {
        }

        /* renamed from: a */
        private static void m146513a(Activity activity) {
            if (activity == null || activity.isFinishing()) {
                C46869g.m146607a("Twitter", "TwitterLoginButton requires an activity. Override getActivity to provide the activity for this button.");
            }
        }

        /* renamed from: a */
        private static void m146514a(C46821b bVar) {
            if (bVar == null) {
                C46869g.m146607a("Twitter", "Callback must not be null, did you call setCallback?");
            }
        }

        public final void onClick(View view) {
            m146514a((C46821b) TwitterLoginButton.this.f120138d);
            m146513a((Activity) TwitterLoginButton.this.f120135a.get());
            TwitterLoginButton.this.getTwitterAuthClient().mo117924a((Activity) TwitterLoginButton.this.f120135a.get(), TwitterLoginButton.this.f120138d);
            if (TwitterLoginButton.this.f120137c != null) {
                TwitterLoginButton.this.f120137c.onClick(view);
            }
        }
    }

    public C46821b<C46972t> getCallback() {
        return this.f120138d;
    }

    /* renamed from: b */
    private void m146511b() {
        if (!isInEditMode()) {
            try {
                C46969q.m146847a();
            } catch (IllegalStateException e) {
                e.getMessage();
                setEnabled(false);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public TwitterAuthClient getTwitterAuthClient() {
        if (this.f120136b == null) {
            synchronized (TwitterLoginButton.class) {
                if (this.f120136b == null) {
                    this.f120136b = new TwitterAuthClient();
                }
            }
        }
        return this.f120136b;
    }

    /* renamed from: a */
    private void m146510a() {
        Resources resources = getResources();
        super.setCompoundDrawablesWithIntrinsicBounds(resources.getDrawable(R.drawable.cks), null, null, null);
        super.setCompoundDrawablePadding(resources.getDimensionPixelSize(R.dimen.vp));
        super.setText(R.string.fgq);
        super.setTextColor(resources.getColor(R.color.ast));
        super.setTextSize(0, (float) resources.getDimensionPixelSize(R.dimen.vu));
        super.setTypeface(Typeface.DEFAULT_BOLD);
        super.setPadding(resources.getDimensionPixelSize(R.dimen.vr), 0, resources.getDimensionPixelSize(R.dimen.vt), 0);
        super.setBackgroundResource(R.drawable.clb);
        super.setOnClickListener(new C46834a());
        if (VERSION.SDK_INT >= 21) {
            super.setAllCaps(false);
        }
    }

    /* access modifiers changed from: protected */
    public Activity getActivity() {
        if ((getContext() instanceof ContextThemeWrapper) && (((ContextThemeWrapper) getContext()).getBaseContext() instanceof Activity)) {
            return (Activity) ((ContextThemeWrapper) getContext()).getBaseContext();
        }
        if (getContext() instanceof Activity) {
            return (Activity) getContext();
        }
        if (isInEditMode()) {
            return null;
        }
        throw new IllegalStateException("TwitterLoginButton requires an activity. Override getActivity to provide the activity for this button.");
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.f120137c = onClickListener;
    }

    public TwitterLoginButton(Context context) {
        this(context, null);
    }

    public void setCallback(C46821b<C46972t> bVar) {
        if (bVar != null) {
            this.f120138d = bVar;
            return;
        }
        throw new IllegalArgumentException("Callback cannot be null");
    }

    public TwitterLoginButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842824);
    }

    public TwitterLoginButton(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, null);
    }

    /* renamed from: a */
    public final void mo117925a(int i, int i2, Intent intent) {
        if (i == getTwitterAuthClient().mo117922a()) {
            getTwitterAuthClient().mo117923a(i, i2, intent);
        }
    }

    private TwitterLoginButton(Context context, AttributeSet attributeSet, int i, TwitterAuthClient twitterAuthClient) {
        super(context, attributeSet, i);
        this.f120135a = new WeakReference<>(getActivity());
        this.f120136b = null;
        m146510a();
        m146511b();
    }
}
