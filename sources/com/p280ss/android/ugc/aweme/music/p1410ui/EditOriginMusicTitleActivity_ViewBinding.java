package com.p280ss.android.ugc.aweme.music.p1410ui;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity_ViewBinding */
public class EditOriginMusicTitleActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private EditOriginMusicTitleActivity f88239a;

    /* renamed from: b */
    private View f88240b;

    /* renamed from: c */
    private View f88241c;

    /* renamed from: d */
    private View f88242d;

    public void unbind() {
        EditOriginMusicTitleActivity editOriginMusicTitleActivity = this.f88239a;
        if (editOriginMusicTitleActivity != null) {
            this.f88239a = null;
            editOriginMusicTitleActivity.backBtn = null;
            editOriginMusicTitleActivity.doneBtn = null;
            editOriginMusicTitleActivity.musicTitleEdt = null;
            editOriginMusicTitleActivity.clearBtn = null;
            this.f88240b.setOnClickListener(null);
            this.f88240b = null;
            this.f88241c.setOnClickListener(null);
            this.f88241c = null;
            this.f88242d.setOnClickListener(null);
            this.f88242d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public EditOriginMusicTitleActivity_ViewBinding(final EditOriginMusicTitleActivity editOriginMusicTitleActivity, View view) {
        this.f88239a = editOriginMusicTitleActivity;
        View findRequiredView = Utils.findRequiredView(view, R.id.jo, "field 'backBtn' and method 'onViewClicked'");
        editOriginMusicTitleActivity.backBtn = (ImageView) Utils.castView(findRequiredView, R.id.jo, "field 'backBtn'", ImageView.class);
        this.f88240b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                editOriginMusicTitleActivity.onViewClicked(view);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, R.id.a_8, "field 'doneBtn' and method 'onViewClicked'");
        editOriginMusicTitleActivity.doneBtn = (Button) Utils.castView(findRequiredView2, R.id.a_8, "field 'doneBtn'", Button.class);
        this.f88241c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                editOriginMusicTitleActivity.onViewClicked(view);
            }
        });
        editOriginMusicTitleActivity.musicTitleEdt = (EditText) Utils.findRequiredViewAsType(view, R.id.c25, "field 'musicTitleEdt'", EditText.class);
        View findRequiredView3 = Utils.findRequiredView(view, R.id.wl, "field 'clearBtn' and method 'onViewClicked'");
        editOriginMusicTitleActivity.clearBtn = (ImageButton) Utils.castView(findRequiredView3, R.id.wl, "field 'clearBtn'", ImageButton.class);
        this.f88242d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                editOriginMusicTitleActivity.onViewClicked(view);
            }
        });
    }
}
