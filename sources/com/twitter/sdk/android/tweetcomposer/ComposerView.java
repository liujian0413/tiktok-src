package com.twitter.sdk.android.tweetcomposer;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.C1642a;
import com.squareup.picasso.Picasso;
import com.twitter.sdk.android.core.internal.UserUtils;
import com.twitter.sdk.android.core.internal.UserUtils.AvatarSize;
import com.twitter.sdk.android.core.models.User;
import com.twitter.sdk.android.tweetcomposer.internal.util.ObservableScrollView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Locale;

public class ComposerView extends LinearLayout {

    /* renamed from: a */
    ImageView f120530a;

    /* renamed from: b */
    ImageView f120531b;

    /* renamed from: c */
    EditText f120532c;

    /* renamed from: d */
    TextView f120533d;

    /* renamed from: e */
    Button f120534e;

    /* renamed from: f */
    ObservableScrollView f120535f;

    /* renamed from: g */
    View f120536g;

    /* renamed from: h */
    ColorDrawable f120537h;

    /* renamed from: i */
    ImageView f120538i;

    /* renamed from: j */
    C46982a f120539j;

    /* renamed from: k */
    private Picasso f120540k;

    /* access modifiers changed from: 0000 */
    public String getTweetText() {
        return this.f120532c.getText().toString();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        m146866a();
        this.f120531b.setOnClickListener(new C46987d(this));
        this.f120534e.setOnClickListener(new C46988e(this));
        this.f120532c.setOnEditorActionListener(new C46989f(this));
        this.f120532c.addTextChangedListener(new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                ComposerView.this.f120539j.mo118154a(ComposerView.this.getTweetText());
            }
        });
        this.f120535f.setScrollViewListener(new C46990g(this));
    }

    /* renamed from: a */
    private void m146866a() {
        this.f120530a = (ImageView) findViewById(R.id.e5b);
        this.f120531b = (ImageView) findViewById(R.id.e5d);
        this.f120532c = (EditText) findViewById(R.id.e5m);
        this.f120533d = (TextView) findViewById(R.id.e5c);
        this.f120534e = (Button) findViewById(R.id.e5q);
        this.f120535f = (ObservableScrollView) findViewById(R.id.e5g);
        this.f120536g = findViewById(R.id.e5f);
        this.f120538i = (ImageView) findViewById(R.id.e5p);
    }

    /* access modifiers changed from: 0000 */
    public void setCallbacks(C46982a aVar) {
        this.f120539j = aVar;
    }

    public ComposerView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo118133a(boolean z) {
        this.f120534e.setEnabled(z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo118135b(View view) {
        this.f120539j.mo118153a();
    }

    /* access modifiers changed from: 0000 */
    public void setTweetText(String str) {
        this.f120532c.setText(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo118131a(int i) {
        if (i > 0) {
            this.f120536g.setVisibility(0);
        } else {
            this.f120536g.setVisibility(4);
        }
    }

    /* access modifiers changed from: 0000 */
    public void setCharCountTextStyle(int i) {
        this.f120533d.setTextAppearance(getContext(), i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo118132a(View view) {
        this.f120539j.mo118155b(getTweetText());
    }

    /* access modifiers changed from: 0000 */
    public void setCharCount(int i) {
        this.f120533d.setText(C1642a.m8035a(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(i)}));
    }

    /* access modifiers changed from: 0000 */
    public void setImageView(Uri uri) {
        if (this.f120540k != null) {
            this.f120538i.setVisibility(0);
            this.f120540k.mo49977a(uri).mo50093a(this.f120538i);
        }
    }

    /* access modifiers changed from: 0000 */
    public void setProfilePhotoView(User user) {
        String a = UserUtils.m146550a(user, AvatarSize.REASONABLY_SMALL);
        if (this.f120540k != null) {
            this.f120540k.mo49979a(a).mo50089a((Drawable) this.f120537h).mo50093a(this.f120530a);
        }
    }

    /* renamed from: a */
    private void m146867a(Context context) {
        this.f120540k = Picasso.m61392a(getContext());
        this.f120537h = new ColorDrawable(context.getResources().getColor(R.color.asl));
        inflate(context, R.layout.b0k, this);
    }

    public ComposerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m146867a(context);
    }

    public ComposerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m146867a(context);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ boolean mo118134a(TextView textView, int i, KeyEvent keyEvent) {
        this.f120539j.mo118155b(getTweetText());
        return true;
    }
}
