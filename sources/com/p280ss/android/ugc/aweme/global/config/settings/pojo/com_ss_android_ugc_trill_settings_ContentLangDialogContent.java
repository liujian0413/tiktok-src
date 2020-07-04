package com.p280ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.NullValueException;
import com.bytedance.ies.settings.C10938a;
import com.bytedance.ies.settings.MissingRequiredFieldsException;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_trill_settings_ContentLangDialogContent */
public final class com_ss_android_ugc_trill_settings_ContentLangDialogContent extends Message<com_ss_android_ugc_trill_settings_ContentLangDialogContent, Builder> {
    public static final DefaultValueProtoAdapter<com_ss_android_ugc_trill_settings_ContentLangDialogContent> ADAPTER = new C30217x9514942b();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3556653)
    public final String text;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 110371416)
    public final String title;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_trill_settings_ContentLangDialogContent$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<com_ss_android_ugc_trill_settings_ContentLangDialogContent, Builder> {
        public String text;
        public String title;

        public final com_ss_android_ugc_trill_settings_ContentLangDialogContent build() {
            return new com_ss_android_ugc_trill_settings_ContentLangDialogContent(this.title, this.text, super.buildUnknownFields());
        }

        public final Builder text(String str) {
            this.text = str;
            return this;
        }

        public final Builder title(String str) {
            this.title = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_trill_settings_ContentLangDialogContent$ProtoAdapter_com_ss_android_ugc_trill_settings_ContentLangDialogContent */
    static final class C30217x9514942b extends DefaultValueProtoAdapter<com_ss_android_ugc_trill_settings_ContentLangDialogContent> {
        public final com_ss_android_ugc_trill_settings_ContentLangDialogContent redact(com_ss_android_ugc_trill_settings_ContentLangDialogContent com_ss_android_ugc_trill_settings_contentlangdialogcontent) {
            return com_ss_android_ugc_trill_settings_contentlangdialogcontent;
        }

        public C30217x9514942b() {
            super(FieldEncoding.LENGTH_DELIMITED, com_ss_android_ugc_trill_settings_ContentLangDialogContent.class);
        }

        public final com_ss_android_ugc_trill_settings_ContentLangDialogContent decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (com_ss_android_ugc_trill_settings_ContentLangDialogContent) null);
        }

        public final int encodedSize(com_ss_android_ugc_trill_settings_ContentLangDialogContent com_ss_android_ugc_trill_settings_contentlangdialogcontent) {
            return ProtoAdapter.STRING.encodedSizeWithTag(110371416, com_ss_android_ugc_trill_settings_contentlangdialogcontent.title) + ProtoAdapter.STRING.encodedSizeWithTag(3556653, com_ss_android_ugc_trill_settings_contentlangdialogcontent.text) + com_ss_android_ugc_trill_settings_contentlangdialogcontent.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, com_ss_android_ugc_trill_settings_ContentLangDialogContent com_ss_android_ugc_trill_settings_contentlangdialogcontent) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 110371416, com_ss_android_ugc_trill_settings_contentlangdialogcontent.title);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3556653, com_ss_android_ugc_trill_settings_contentlangdialogcontent.text);
            protoWriter.writeBytes(com_ss_android_ugc_trill_settings_contentlangdialogcontent.unknownFields());
        }

        public final com_ss_android_ugc_trill_settings_ContentLangDialogContent decode(ProtoReader protoReader, com_ss_android_ugc_trill_settings_ContentLangDialogContent com_ss_android_ugc_trill_settings_contentlangdialogcontent) throws IOException {
            Builder builder;
            com_ss_android_ugc_trill_settings_ContentLangDialogContent com_ss_android_ugc_trill_settings_contentlangdialogcontent2 = (com_ss_android_ugc_trill_settings_ContentLangDialogContent) C10938a.m32097a().mo26425a(com_ss_android_ugc_trill_settings_ContentLangDialogContent.class, com_ss_android_ugc_trill_settings_contentlangdialogcontent);
            if (com_ss_android_ugc_trill_settings_contentlangdialogcontent2 != null) {
                builder = com_ss_android_ugc_trill_settings_contentlangdialogcontent2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 3556653) {
                    builder.text((String) ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 110371416) {
                    try {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } catch (MissingRequiredFieldsException e) {
                        if (com_ss_android_ugc_trill_settings_contentlangdialogcontent2 == null) {
                            throw e;
                        }
                    }
                } else {
                    builder.title((String) ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }
    }

    public final String getText() throws NullValueException {
        if (this.text != null) {
            return this.text;
        }
        throw new NullValueException();
    }

    public final String getTitle() throws NullValueException {
        if (this.title != null) {
            return this.title;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.title = this.title;
        builder.text = this.text;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i3 = 0;
        if (this.title != null) {
            i = this.title.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.text != null) {
            i3 = this.text.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.text != null) {
            sb.append(", text=");
            sb.append(this.text);
        }
        StringBuilder replace = sb.replace(0, 2, "com_ss_android_ugc_trill_settings_ContentLangDialogContent{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com_ss_android_ugc_trill_settings_ContentLangDialogContent)) {
            return false;
        }
        com_ss_android_ugc_trill_settings_ContentLangDialogContent com_ss_android_ugc_trill_settings_contentlangdialogcontent = (com_ss_android_ugc_trill_settings_ContentLangDialogContent) obj;
        if (!unknownFields().equals(com_ss_android_ugc_trill_settings_contentlangdialogcontent.unknownFields()) || !Internal.equals(this.title, com_ss_android_ugc_trill_settings_contentlangdialogcontent.title) || !Internal.equals(this.text, com_ss_android_ugc_trill_settings_contentlangdialogcontent.text)) {
            return false;
        }
        return true;
    }

    public com_ss_android_ugc_trill_settings_ContentLangDialogContent(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public com_ss_android_ugc_trill_settings_ContentLangDialogContent(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.title = str;
        this.text = str2;
    }
}
