package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.view.KeyEvent;
import android.view.Window;
import android.widget.EditText;
import com.bytedance.ies.dmt.p262ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditInputFragment */
public abstract class ProfileEditInputFragment extends ProfileDetailEditFragment {

    /* renamed from: j */
    public static final C36260a f95128j = new C36260a(null);

    /* renamed from: b */
    private HashMap f95129b;

    /* renamed from: i */
    public TextTitleBar f95130i;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditInputFragment$a */
    public static final class C36260a {
        private C36260a() {
        }

        public /* synthetic */ C36260a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditInputFragment$b */
    static final class C36261b implements OnKeyListener {

        /* renamed from: a */
        final /* synthetic */ ProfileEditInputFragment f95131a;

        C36261b(ProfileEditInputFragment profileEditInputFragment) {
            this.f95131a = profileEditInputFragment;
        }

        public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (i == 4) {
                C7573i.m23582a((Object) keyEvent, "e");
                if (keyEvent.getAction() == 1) {
                    this.f95131a.mo92214d();
                }
            }
            return false;
        }
    }

    /* renamed from: a */
    public void mo92207a() {
        if (this.f95129b != null) {
            this.f95129b.clear();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo92215e();

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo92207a();
    }

    /* renamed from: d */
    public boolean mo92214d() {
        if (getDialog() != null) {
            Dialog dialog = getDialog();
            C7573i.m23582a((Object) dialog, "dialog");
            if (dialog.isShowing() && isResumed()) {
                try {
                    dismiss();
                } catch (Exception unused) {
                }
            }
        }
        return true;
    }

    /* renamed from: h */
    public void mo92282h() {
        TextTitleBar textTitleBar = this.f95130i;
        if (textTitleBar != null) {
            DmtTextView endText = textTitleBar.getEndText();
            if (endText != null) {
                endText.setAlpha(1.0f);
            }
        }
        TextTitleBar textTitleBar2 = this.f95130i;
        if (textTitleBar2 != null) {
            DmtTextView endText2 = textTitleBar2.getEndText();
            if (endText2 != null) {
                endText2.setClickable(true);
            }
        }
    }

    /* renamed from: i */
    public void mo92283i() {
        TextTitleBar textTitleBar = this.f95130i;
        if (textTitleBar != null) {
            DmtTextView endText = textTitleBar.getEndText();
            if (endText != null) {
                endText.setAlpha(0.34f);
            }
        }
        TextTitleBar textTitleBar2 = this.f95130i;
        if (textTitleBar2 != null) {
            DmtTextView endText2 = textTitleBar2.getEndText();
            if (endText2 != null) {
                endText2.setClickable(false);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.gf);
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        C7573i.m23582a((Object) onCreateDialog, "super.onCreateDialog(savedInstanceState)");
        onCreateDialog.setOnKeyListener(new C36261b(this));
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setSoftInputMode(4);
        }
        return onCreateDialog;
    }

    /* renamed from: a */
    protected static boolean m117188a(EditText editText, int i) {
        C7573i.m23587b(editText, "editText");
        Editable text = editText.getText();
        if (text.length() <= i) {
            return false;
        }
        int selectionEnd = Selection.getSelectionEnd(text);
        String obj = text.toString();
        if (obj != null) {
            String substring = obj.substring(0, i);
            C7573i.m23582a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            editText.setText(substring);
            Editable text2 = editText.getText();
            if (selectionEnd > text2.length()) {
                selectionEnd = text2.length();
            }
            Selection.setSelection(text2, selectionEnd);
            return true;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }
}
