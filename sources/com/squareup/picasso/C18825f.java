package com.squareup.picasso;

import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.ContactsContract.Contacts;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.squareup.picasso.C18850u.C18851a;
import com.squareup.picasso.Picasso.LoadedFrom;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.squareup.picasso.f */
final class C18825f extends C18850u {

    /* renamed from: a */
    private static final UriMatcher f50731a;

    /* renamed from: b */
    private final Context f50732b;

    /* renamed from: com.squareup.picasso.f$a */
    static class C18826a {
        /* renamed from: a */
        static InputStream m61484a(ContentResolver contentResolver, Uri uri) {
            return Contacts.openContactPhotoInputStream(contentResolver, uri, true);
        }
    }

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f50731a = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        f50731a.addURI("com.android.contacts", "contacts/lookup/*", 1);
        f50731a.addURI("com.android.contacts", "contacts/#/photo", 2);
        f50731a.addURI("com.android.contacts", "contacts/#", 3);
        f50731a.addURI("com.android.contacts", "display_photo/#", 4);
    }

    C18825f(Context context) {
        this.f50732b = context;
    }

    /* renamed from: a */
    public final boolean mo50006a(C18846s sVar) {
        Uri uri = sVar.f50794d;
        if (!C38347c.f99553h.equals(uri.getScheme()) || !Contacts.CONTENT_URI.getHost().equals(uri.getHost()) || f50731a.match(sVar.f50794d) == -1) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private InputStream m61481b(C18846s sVar) throws IOException {
        ContentResolver contentResolver = this.f50732b.getContentResolver();
        Uri uri = sVar.f50794d;
        switch (f50731a.match(uri)) {
            case 1:
                uri = Contacts.lookupContact(contentResolver, uri);
                if (uri == null) {
                    return null;
                }
                break;
            case 2:
            case 4:
                return contentResolver.openInputStream(uri);
            case 3:
                break;
            default:
                StringBuilder sb = new StringBuilder("Invalid uri: ");
                sb.append(uri);
                throw new IllegalStateException(sb.toString());
        }
        if (VERSION.SDK_INT < 14) {
            return Contacts.openContactPhotoInputStream(contentResolver, uri);
        }
        return C18826a.m61484a(contentResolver, uri);
    }

    /* renamed from: a */
    public final C18851a mo50005a(C18846s sVar, int i) throws IOException {
        InputStream b = m61481b(sVar);
        if (b != null) {
            return new C18851a(b, LoadedFrom.DISK);
        }
        return null;
    }
}
