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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.ContentLanguageGuideSetting */
public final class ContentLanguageGuideSetting extends Message<ContentLanguageGuideSetting, Builder> {
    public static final DefaultValueProtoAdapter<ContentLanguageGuideSetting> ADAPTER = new ProtoAdapter_ContentLanguageGuideSetting();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String code;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String en_name;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String highlight_color;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String icon;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String local_name;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.ContentLanguageGuideSetting$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<ContentLanguageGuideSetting, Builder> {
        public String code;
        public String en_name;
        public String highlight_color;
        public String icon;
        public String local_name;

        public final ContentLanguageGuideSetting build() {
            ContentLanguageGuideSetting contentLanguageGuideSetting = new ContentLanguageGuideSetting(this.en_name, this.code, this.local_name, this.icon, this.highlight_color, super.buildUnknownFields());
            return contentLanguageGuideSetting;
        }

        public final Builder code(String str) {
            this.code = str;
            return this;
        }

        public final Builder en_name(String str) {
            this.en_name = str;
            return this;
        }

        public final Builder highlight_color(String str) {
            this.highlight_color = str;
            return this;
        }

        public final Builder icon(String str) {
            this.icon = str;
            return this;
        }

        public final Builder local_name(String str) {
            this.local_name = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.ContentLanguageGuideSetting$ProtoAdapter_ContentLanguageGuideSetting */
    static final class ProtoAdapter_ContentLanguageGuideSetting extends DefaultValueProtoAdapter<ContentLanguageGuideSetting> {
        public final ContentLanguageGuideSetting redact(ContentLanguageGuideSetting contentLanguageGuideSetting) {
            return contentLanguageGuideSetting;
        }

        public ProtoAdapter_ContentLanguageGuideSetting() {
            super(FieldEncoding.LENGTH_DELIMITED, ContentLanguageGuideSetting.class);
        }

        public final ContentLanguageGuideSetting decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (ContentLanguageGuideSetting) null);
        }

        public final int encodedSize(ContentLanguageGuideSetting contentLanguageGuideSetting) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, contentLanguageGuideSetting.en_name) + ProtoAdapter.STRING.encodedSizeWithTag(2, contentLanguageGuideSetting.code) + ProtoAdapter.STRING.encodedSizeWithTag(3, contentLanguageGuideSetting.local_name) + ProtoAdapter.STRING.encodedSizeWithTag(4, contentLanguageGuideSetting.icon) + ProtoAdapter.STRING.encodedSizeWithTag(5, contentLanguageGuideSetting.highlight_color) + contentLanguageGuideSetting.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, ContentLanguageGuideSetting contentLanguageGuideSetting) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, contentLanguageGuideSetting.en_name);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, contentLanguageGuideSetting.code);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, contentLanguageGuideSetting.local_name);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, contentLanguageGuideSetting.icon);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, contentLanguageGuideSetting.highlight_color);
            protoWriter.writeBytes(contentLanguageGuideSetting.unknownFields());
        }

        public final ContentLanguageGuideSetting decode(ProtoReader protoReader, ContentLanguageGuideSetting contentLanguageGuideSetting) throws IOException {
            Builder builder;
            ContentLanguageGuideSetting contentLanguageGuideSetting2 = (ContentLanguageGuideSetting) C10938a.m32097a().mo26425a(ContentLanguageGuideSetting.class, contentLanguageGuideSetting);
            if (contentLanguageGuideSetting2 != null) {
                builder = contentLanguageGuideSetting2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.en_name((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.code((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.local_name((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.icon((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            builder.highlight_color((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (contentLanguageGuideSetting2 != null) {
                                    break;
                                } else {
                                    throw e;
                                }
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }
    }

    public final String getCode() throws NullValueException {
        if (this.code != null) {
            return this.code;
        }
        throw new NullValueException();
    }

    public final String getEnName() throws NullValueException {
        if (this.en_name != null) {
            return this.en_name;
        }
        throw new NullValueException();
    }

    public final String getHighlightColor() throws NullValueException {
        if (this.highlight_color != null) {
            return this.highlight_color;
        }
        throw new NullValueException();
    }

    public final String getIcon() throws NullValueException {
        if (this.icon != null) {
            return this.icon;
        }
        throw new NullValueException();
    }

    public final String getLocalName() throws NullValueException {
        if (this.local_name != null) {
            return this.local_name;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.en_name = this.en_name;
        builder.code = this.code;
        builder.local_name = this.local_name;
        builder.icon = this.icon;
        builder.highlight_color = this.highlight_color;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.hashCode;
        if (i5 != 0) {
            return i5;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i6 = 0;
        if (this.en_name != null) {
            i = this.en_name.hashCode();
        } else {
            i = 0;
        }
        int i7 = (hashCode + i) * 37;
        if (this.code != null) {
            i2 = this.code.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 37;
        if (this.local_name != null) {
            i3 = this.local_name.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 37;
        if (this.icon != null) {
            i4 = this.icon.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 37;
        if (this.highlight_color != null) {
            i6 = this.highlight_color.hashCode();
        }
        int i11 = i10 + i6;
        this.hashCode = i11;
        return i11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.en_name != null) {
            sb.append(", en_name=");
            sb.append(this.en_name);
        }
        if (this.code != null) {
            sb.append(", code=");
            sb.append(this.code);
        }
        if (this.local_name != null) {
            sb.append(", local_name=");
            sb.append(this.local_name);
        }
        if (this.icon != null) {
            sb.append(", icon=");
            sb.append(this.icon);
        }
        if (this.highlight_color != null) {
            sb.append(", highlight_color=");
            sb.append(this.highlight_color);
        }
        StringBuilder replace = sb.replace(0, 2, "ContentLanguageGuideSetting{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ContentLanguageGuideSetting)) {
            return false;
        }
        ContentLanguageGuideSetting contentLanguageGuideSetting = (ContentLanguageGuideSetting) obj;
        if (!unknownFields().equals(contentLanguageGuideSetting.unknownFields()) || !Internal.equals(this.en_name, contentLanguageGuideSetting.en_name) || !Internal.equals(this.code, contentLanguageGuideSetting.code) || !Internal.equals(this.local_name, contentLanguageGuideSetting.local_name) || !Internal.equals(this.icon, contentLanguageGuideSetting.icon) || !Internal.equals(this.highlight_color, contentLanguageGuideSetting.highlight_color)) {
            return false;
        }
        return true;
    }

    public ContentLanguageGuideSetting(String str, String str2, String str3, String str4, String str5) {
        this(str, str2, str3, str4, str5, ByteString.EMPTY);
    }

    public ContentLanguageGuideSetting(String str, String str2, String str3, String str4, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.en_name = str;
        this.code = str2;
        this.local_name = str3;
        this.icon = str4;
        this.highlight_color = str5;
    }
}
