package com.p280ss.android.ugc.trill.settings;

import com.bytedance.ies.abmock.C10292j;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.abmock.p260a.C6382b;
import com.bytedance.ies.abmock.settings.SettingsKey;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

@SettingsKey
/* renamed from: com.ss.android.ugc.trill.settings.ContentLangDialogBoxSettings */
public final class ContentLangDialogBoxSettings {
    public static final ContentLangDialogBoxSettings INSTANCE = new ContentLangDialogBoxSettings();
    @C6382b
    private static ContentLangDialogContent contentLangDialog;

    private ContentLangDialogBoxSettings() {
    }

    public final ContentLangDialogContent getContentLangDialog() {
        return contentLangDialog;
    }

    public static final ContentLangDialogContent getContentLangDialogContent() {
        ContentLangDialogContent contentLangDialogContent;
        try {
            contentLangDialogContent = (ContentLangDialogContent) C10292j.m30480a().mo25014a(ContentLangDialogBoxSettings.class, "content_lang_dialog", C6384b.m19835a().mo15294c().getContentLangDialog(), "com.ss.android.ugc.trill.settings.ContentLangDialogContent", ContentLangDialogContent.class);
        } catch (Throwable unused) {
            contentLangDialogContent = null;
        }
        if (contentLangDialogContent != null) {
            return contentLangDialogContent;
        }
        String string = C6399b.m19921a().getString(R.string.agr);
        C7573i.m23582a((Object) string, "AppContextManager.getApp…ent_language_guide_title)");
        String string2 = C6399b.m19921a().getString(R.string.agp);
        C7573i.m23582a((Object) string2, "AppContextManager.getApp…tent_language_guide_desc)");
        return new ContentLangDialogContent(string, string2);
    }

    public final void setContentLangDialog(ContentLangDialogContent contentLangDialogContent) {
        contentLangDialog = contentLangDialogContent;
    }
}
