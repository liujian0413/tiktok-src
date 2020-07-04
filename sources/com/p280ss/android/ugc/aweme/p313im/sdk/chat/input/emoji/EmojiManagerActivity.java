package com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.emoji;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.emoji.model.Emoji;
import com.p280ss.android.ugc.aweme.emoji.p1206d.C27535a;
import com.p280ss.android.ugc.aweme.emoji.p1206d.C27536b;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.emoji.SelfEmojiAdapter.C30833a;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31907i;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.DividerGridItemDecoration;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.ImTextTitleBar;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.ImTextTitleBar.C31980a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.EmojiManagerActivity */
public class EmojiManagerActivity extends AmeActivity implements C27535a {

    /* renamed from: a */
    public SelfEmojiAdapter f80722a;

    /* renamed from: b */
    public ImTextTitleBar f80723b;

    /* renamed from: c */
    public TextView f80724c;

    /* renamed from: d */
    public View f80725d;

    /* renamed from: a */
    public final void mo63141a(List<Emoji> list, boolean z, String str) {
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.EmojiManagerActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.EmojiManagerActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.EmojiManagerActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
    }

    /* renamed from: b */
    public final void mo80693b() {
        this.f80725d.setEnabled(true);
        this.f80724c.setAlpha(1.0f);
    }

    public void onDestroy() {
        super.onDestroy();
        C27536b.m90251a().mo70767b((C27535a) this);
    }

    /* renamed from: a */
    public final void mo80692a() {
        this.f80725d.setEnabled(false);
        this.f80724c.setAlpha(0.5f);
    }

    /* renamed from: c */
    private void m100456c() {
        this.f80723b = (ImTextTitleBar) findViewById(R.id.djz);
        this.f80725d = findViewById(R.id.a74);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.ady);
        this.f80724c = (TextView) findViewById(R.id.a79);
        mo80692a();
        recyclerView.setLayoutManager(new GridLayoutManager(this, 4));
        recyclerView.mo5525a((C1272h) new DividerGridItemDecoration(this));
        this.f80722a = new SelfEmojiAdapter();
        recyclerView.setAdapter(this.f80722a);
        this.f80723b.setOnTitlebarClickListener(new C31980a() {
            /* renamed from: a */
            public final void mo18096a() {
                EmojiManagerActivity.this.finish();
            }

            /* renamed from: b */
            public final void mo18097b() {
                if (EmojiManagerActivity.this.f80722a.f80742b) {
                    EmojiManagerActivity.this.f80722a.f80742b = false;
                    EmojiManagerActivity.this.f80722a.mo80707c();
                    EmojiManagerActivity.this.f80724c.setText(EmojiManagerActivity.this.getString(R.string.bii));
                    EmojiManagerActivity.this.mo80692a();
                    EmojiManagerActivity.this.f80723b.setRightText((int) R.string.bmk);
                    EmojiManagerActivity.this.f80723b.setRightTextColor(EmojiManagerActivity.this.getResources().getColor(R.color.uo));
                    EmojiManagerActivity.this.f80725d.setVisibility(8);
                } else {
                    EmojiManagerActivity.this.f80722a.mo80707c();
                    EmojiManagerActivity.this.f80725d.setVisibility(0);
                    EmojiManagerActivity.this.f80722a.f80742b = true;
                    EmojiManagerActivity.this.f80723b.setRightText((int) R.string.bjh);
                    EmojiManagerActivity.this.f80723b.setRightTextColor(EmojiManagerActivity.this.getResources().getColor(R.color.uu));
                }
                EmojiManagerActivity.this.f80722a.notifyDataSetChanged();
            }
        });
        this.f80722a.f80741a = new C30833a() {
            /* renamed from: a */
            public final void mo80695a() {
                if (EmojiManagerActivity.this.f80722a.mo80706b() > 0) {
                    TextView textView = EmojiManagerActivity.this.f80724c;
                    StringBuilder sb = new StringBuilder();
                    sb.append(EmojiManagerActivity.this.getString(R.string.bii));
                    sb.append("(");
                    sb.append(EmojiManagerActivity.this.f80722a.mo80706b());
                    sb.append(")");
                    textView.setText(sb.toString());
                    EmojiManagerActivity.this.mo80693b();
                    return;
                }
                EmojiManagerActivity.this.f80724c.setText(EmojiManagerActivity.this.getString(R.string.bii));
                EmojiManagerActivity.this.mo80692a();
            }
        };
        this.f80725d.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C31907i.m103655a(EmojiManagerActivity.this, R.string.bij, R.string.bhe, R.string.bi8, new Runnable() {
                    public final void run() {
                        EmojiManagerActivity.this.showProgressDialog(EmojiManagerActivity.this.getString(R.string.bj3));
                        C27536b.m90251a().mo70761a((Emoji[]) EmojiManagerActivity.this.f80722a.mo80705a().toArray(new Emoji[0]));
                    }
                }, new Runnable() {
                    public final void run() {
                    }
                });
            }
        });
    }

    /* renamed from: a */
    public static void m100455a(Context context) {
        context.startActivity(new Intent(context, EmojiManagerActivity.class));
    }

    /* renamed from: a */
    public final void mo63139a(List<Emoji> list) {
        if (!C6307b.m19566a((Collection<T>) list)) {
            this.f80722a.f80744d = list;
            this.f80722a.notifyDataSetChanged();
            ImTextTitleBar imTextTitleBar = this.f80723b;
            StringBuilder sb = new StringBuilder();
            sb.append(getString(R.string.bgl));
            sb.append("(");
            sb.append(list.size());
            sb.append(")");
            imTextTitleBar.setTitle(sb.toString());
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.EmojiManagerActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.bj);
        C6956a.m21633b().setupStatusBar(this);
        m100456c();
        C27536b.m90251a().mo70757a((C27535a) this);
        C27536b.m90251a().mo70769c();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.EmojiManagerActivity", "onCreate", false);
    }

    /* renamed from: b */
    public final void mo63142b(List<Emoji> list, boolean z, String str) {
        dismissProgressDialog();
        if (z) {
            this.f80722a.mo80707c();
            this.f80724c.setText(getString(R.string.bii));
            mo80692a();
            this.f80722a.f80744d = list;
            this.f80722a.notifyDataSetChanged();
            if (C6307b.m19566a((Collection<T>) list)) {
                this.f80723b.setTitle(getString(R.string.bgl));
                this.f80722a.f80742b = false;
                this.f80723b.setRightText((int) R.string.bmk);
                this.f80723b.setRightTextColor(getResources().getColor(R.color.uo));
                this.f80725d.setVisibility(8);
                return;
            }
            ImTextTitleBar imTextTitleBar = this.f80723b;
            StringBuilder sb = new StringBuilder();
            sb.append(getString(R.string.bgl));
            sb.append("(");
            sb.append(list.size());
            sb.append(")");
            imTextTitleBar.setTitle(sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo63140a(List<Emoji> list, Emoji emoji, boolean z, String str) {
        if (z) {
            this.f80722a.f80744d = list;
            this.f80722a.notifyDataSetChanged();
            ImTextTitleBar imTextTitleBar = this.f80723b;
            StringBuilder sb = new StringBuilder();
            sb.append(getString(R.string.bgl));
            sb.append("(");
            sb.append(list.size());
            sb.append(")");
            imTextTitleBar.setTitle(sb.toString());
        }
    }
}
