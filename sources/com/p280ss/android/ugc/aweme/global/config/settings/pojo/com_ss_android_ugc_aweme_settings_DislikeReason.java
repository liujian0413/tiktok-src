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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_settings_DislikeReason */
public final class com_ss_android_ugc_aweme_settings_DislikeReason extends Message<com_ss_android_ugc_aweme_settings_DislikeReason, Builder> {
    public static final DefaultValueProtoAdapter<com_ss_android_ugc_aweme_settings_DislikeReason> ADAPTER = new ProtoAdapter_com_ss_android_ugc_aweme_settings_DislikeReason();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3355)

    /* renamed from: id */
    public final String f79490id;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3556653)
    public final String text;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_settings_DislikeReason$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<com_ss_android_ugc_aweme_settings_DislikeReason, Builder> {

        /* renamed from: id */
        public String f79491id;
        public String text;

        public final com_ss_android_ugc_aweme_settings_DislikeReason build() {
            return new com_ss_android_ugc_aweme_settings_DislikeReason(this.f79491id, this.text, super.buildUnknownFields());
        }

        /* renamed from: id */
        public final Builder mo79623id(String str) {
            this.f79491id = str;
            return this;
        }

        public final Builder text(String str) {
            this.text = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_settings_DislikeReason$ProtoAdapter_com_ss_android_ugc_aweme_settings_DislikeReason */
    static final class ProtoAdapter_com_ss_android_ugc_aweme_settings_DislikeReason extends DefaultValueProtoAdapter<com_ss_android_ugc_aweme_settings_DislikeReason> {
        public final com_ss_android_ugc_aweme_settings_DislikeReason redact(com_ss_android_ugc_aweme_settings_DislikeReason com_ss_android_ugc_aweme_settings_dislikereason) {
            return com_ss_android_ugc_aweme_settings_dislikereason;
        }

        public ProtoAdapter_com_ss_android_ugc_aweme_settings_DislikeReason() {
            super(FieldEncoding.LENGTH_DELIMITED, com_ss_android_ugc_aweme_settings_DislikeReason.class);
        }

        public final com_ss_android_ugc_aweme_settings_DislikeReason decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (com_ss_android_ugc_aweme_settings_DislikeReason) null);
        }

        public final int encodedSize(com_ss_android_ugc_aweme_settings_DislikeReason com_ss_android_ugc_aweme_settings_dislikereason) {
            return ProtoAdapter.STRING.encodedSizeWithTag(3355, com_ss_android_ugc_aweme_settings_dislikereason.f79490id) + ProtoAdapter.STRING.encodedSizeWithTag(3556653, com_ss_android_ugc_aweme_settings_dislikereason.text) + com_ss_android_ugc_aweme_settings_dislikereason.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, com_ss_android_ugc_aweme_settings_DislikeReason com_ss_android_ugc_aweme_settings_dislikereason) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3355, com_ss_android_ugc_aweme_settings_dislikereason.f79490id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3556653, com_ss_android_ugc_aweme_settings_dislikereason.text);
            protoWriter.writeBytes(com_ss_android_ugc_aweme_settings_dislikereason.unknownFields());
        }

        public final com_ss_android_ugc_aweme_settings_DislikeReason decode(ProtoReader protoReader, com_ss_android_ugc_aweme_settings_DislikeReason com_ss_android_ugc_aweme_settings_dislikereason) throws IOException {
            Builder builder;
            com_ss_android_ugc_aweme_settings_DislikeReason com_ss_android_ugc_aweme_settings_dislikereason2 = (com_ss_android_ugc_aweme_settings_DislikeReason) C10938a.m32097a().mo26425a(com_ss_android_ugc_aweme_settings_DislikeReason.class, com_ss_android_ugc_aweme_settings_dislikereason);
            if (com_ss_android_ugc_aweme_settings_dislikereason2 != null) {
                builder = com_ss_android_ugc_aweme_settings_dislikereason2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 3355) {
                    builder.mo79623id((String) ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 3556653) {
                    try {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } catch (MissingRequiredFieldsException e) {
                        if (com_ss_android_ugc_aweme_settings_dislikereason2 == null) {
                            throw e;
                        }
                    }
                } else {
                    builder.text((String) ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }
    }

    public final String getId() throws NullValueException {
        if (this.f79490id != null) {
            return this.f79490id;
        }
        throw new NullValueException();
    }

    public final String getText() throws NullValueException {
        if (this.text != null) {
            return this.text;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.f79491id = this.f79490id;
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
        if (this.f79490id != null) {
            i = this.f79490id.hashCode();
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
        if (this.f79490id != null) {
            sb.append(", id=");
            sb.append(this.f79490id);
        }
        if (this.text != null) {
            sb.append(", text=");
            sb.append(this.text);
        }
        StringBuilder replace = sb.replace(0, 2, "com_ss_android_ugc_aweme_settings_DislikeReason{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com_ss_android_ugc_aweme_settings_DislikeReason)) {
            return false;
        }
        com_ss_android_ugc_aweme_settings_DislikeReason com_ss_android_ugc_aweme_settings_dislikereason = (com_ss_android_ugc_aweme_settings_DislikeReason) obj;
        if (!unknownFields().equals(com_ss_android_ugc_aweme_settings_dislikereason.unknownFields()) || !Internal.equals(this.f79490id, com_ss_android_ugc_aweme_settings_dislikereason.f79490id) || !Internal.equals(this.text, com_ss_android_ugc_aweme_settings_dislikereason.text)) {
            return false;
        }
        return true;
    }

    public com_ss_android_ugc_aweme_settings_DislikeReason(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public com_ss_android_ugc_aweme_settings_DislikeReason(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.f79490id = str;
        this.text = str2;
    }
}
