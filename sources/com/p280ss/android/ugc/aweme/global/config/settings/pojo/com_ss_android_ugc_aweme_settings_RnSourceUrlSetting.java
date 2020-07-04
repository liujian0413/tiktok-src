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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_settings_RnSourceUrlSetting */
public final class com_ss_android_ugc_aweme_settings_RnSourceUrlSetting extends Message<com_ss_android_ugc_aweme_settings_RnSourceUrlSetting, Builder> {
    public static final DefaultValueProtoAdapter<com_ss_android_ugc_aweme_settings_RnSourceUrlSetting> ADAPTER = new C30215x2534eab5();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 202079493)
    public final String channel;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 37365945)
    public final String source_url;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_settings_RnSourceUrlSetting$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<com_ss_android_ugc_aweme_settings_RnSourceUrlSetting, Builder> {
        public String channel;
        public String source_url;

        public final com_ss_android_ugc_aweme_settings_RnSourceUrlSetting build() {
            return new com_ss_android_ugc_aweme_settings_RnSourceUrlSetting(this.channel, this.source_url, super.buildUnknownFields());
        }

        public final Builder channel(String str) {
            this.channel = str;
            return this;
        }

        public final Builder source_url(String str) {
            this.source_url = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_settings_RnSourceUrlSetting$ProtoAdapter_com_ss_android_ugc_aweme_settings_RnSourceUrlSetting */
    static final class C30215x2534eab5 extends DefaultValueProtoAdapter<com_ss_android_ugc_aweme_settings_RnSourceUrlSetting> {
        public final com_ss_android_ugc_aweme_settings_RnSourceUrlSetting redact(com_ss_android_ugc_aweme_settings_RnSourceUrlSetting com_ss_android_ugc_aweme_settings_rnsourceurlsetting) {
            return com_ss_android_ugc_aweme_settings_rnsourceurlsetting;
        }

        public C30215x2534eab5() {
            super(FieldEncoding.LENGTH_DELIMITED, com_ss_android_ugc_aweme_settings_RnSourceUrlSetting.class);
        }

        public final com_ss_android_ugc_aweme_settings_RnSourceUrlSetting decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (com_ss_android_ugc_aweme_settings_RnSourceUrlSetting) null);
        }

        public final int encodedSize(com_ss_android_ugc_aweme_settings_RnSourceUrlSetting com_ss_android_ugc_aweme_settings_rnsourceurlsetting) {
            return ProtoAdapter.STRING.encodedSizeWithTag(202079493, com_ss_android_ugc_aweme_settings_rnsourceurlsetting.channel) + ProtoAdapter.STRING.encodedSizeWithTag(37365945, com_ss_android_ugc_aweme_settings_rnsourceurlsetting.source_url) + com_ss_android_ugc_aweme_settings_rnsourceurlsetting.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, com_ss_android_ugc_aweme_settings_RnSourceUrlSetting com_ss_android_ugc_aweme_settings_rnsourceurlsetting) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 202079493, com_ss_android_ugc_aweme_settings_rnsourceurlsetting.channel);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 37365945, com_ss_android_ugc_aweme_settings_rnsourceurlsetting.source_url);
            protoWriter.writeBytes(com_ss_android_ugc_aweme_settings_rnsourceurlsetting.unknownFields());
        }

        public final com_ss_android_ugc_aweme_settings_RnSourceUrlSetting decode(ProtoReader protoReader, com_ss_android_ugc_aweme_settings_RnSourceUrlSetting com_ss_android_ugc_aweme_settings_rnsourceurlsetting) throws IOException {
            Builder builder;
            com_ss_android_ugc_aweme_settings_RnSourceUrlSetting com_ss_android_ugc_aweme_settings_rnsourceurlsetting2 = (com_ss_android_ugc_aweme_settings_RnSourceUrlSetting) C10938a.m32097a().mo26425a(com_ss_android_ugc_aweme_settings_RnSourceUrlSetting.class, com_ss_android_ugc_aweme_settings_rnsourceurlsetting);
            if (com_ss_android_ugc_aweme_settings_rnsourceurlsetting2 != null) {
                builder = com_ss_android_ugc_aweme_settings_rnsourceurlsetting2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 37365945) {
                    builder.source_url((String) ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 202079493) {
                    try {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } catch (MissingRequiredFieldsException e) {
                        if (com_ss_android_ugc_aweme_settings_rnsourceurlsetting2 == null) {
                            throw e;
                        }
                    }
                } else {
                    builder.channel((String) ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }
    }

    public final String getChannel() throws NullValueException {
        if (this.channel != null) {
            return this.channel;
        }
        throw new NullValueException();
    }

    public final String getSourceUrl() throws NullValueException {
        if (this.source_url != null) {
            return this.source_url;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.channel = this.channel;
        builder.source_url = this.source_url;
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
        if (this.channel != null) {
            i = this.channel.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.source_url != null) {
            i3 = this.source_url.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.channel != null) {
            sb.append(", channel=");
            sb.append(this.channel);
        }
        if (this.source_url != null) {
            sb.append(", source_url=");
            sb.append(this.source_url);
        }
        StringBuilder replace = sb.replace(0, 2, "com_ss_android_ugc_aweme_settings_RnSourceUrlSetting{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com_ss_android_ugc_aweme_settings_RnSourceUrlSetting)) {
            return false;
        }
        com_ss_android_ugc_aweme_settings_RnSourceUrlSetting com_ss_android_ugc_aweme_settings_rnsourceurlsetting = (com_ss_android_ugc_aweme_settings_RnSourceUrlSetting) obj;
        if (!unknownFields().equals(com_ss_android_ugc_aweme_settings_rnsourceurlsetting.unknownFields()) || !Internal.equals(this.channel, com_ss_android_ugc_aweme_settings_rnsourceurlsetting.channel) || !Internal.equals(this.source_url, com_ss_android_ugc_aweme_settings_rnsourceurlsetting.source_url)) {
            return false;
        }
        return true;
    }

    public com_ss_android_ugc_aweme_settings_RnSourceUrlSetting(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public com_ss_android_ugc_aweme_settings_RnSourceUrlSetting(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.channel = str;
        this.source_url = str2;
    }
}
