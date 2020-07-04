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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_notice_api_sp_AssistantUrl */
public final class com_ss_android_ugc_aweme_notice_api_sp_AssistantUrl extends Message<com_ss_android_ugc_aweme_notice_api_sp_AssistantUrl, Builder> {
    public static final DefaultValueProtoAdapter<com_ss_android_ugc_aweme_notice_api_sp_AssistantUrl> ADAPTER = new ProtoAdapter_com_ss_android_ugc_aweme_notice_api_sp_AssistantUrl();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 191224179)
    public final String douplus_assistant_url;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 104267911)
    public final String service_assistant_url;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 95162123)
    public final String shop_assistant_url;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_notice_api_sp_AssistantUrl$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<com_ss_android_ugc_aweme_notice_api_sp_AssistantUrl, Builder> {
        public String douplus_assistant_url;
        public String service_assistant_url;
        public String shop_assistant_url;

        public final com_ss_android_ugc_aweme_notice_api_sp_AssistantUrl build() {
            return new com_ss_android_ugc_aweme_notice_api_sp_AssistantUrl(this.service_assistant_url, this.shop_assistant_url, this.douplus_assistant_url, super.buildUnknownFields());
        }

        public final Builder douplus_assistant_url(String str) {
            this.douplus_assistant_url = str;
            return this;
        }

        public final Builder service_assistant_url(String str) {
            this.service_assistant_url = str;
            return this;
        }

        public final Builder shop_assistant_url(String str) {
            this.shop_assistant_url = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_notice_api_sp_AssistantUrl$ProtoAdapter_com_ss_android_ugc_aweme_notice_api_sp_AssistantUrl */
    static final class ProtoAdapter_com_ss_android_ugc_aweme_notice_api_sp_AssistantUrl extends DefaultValueProtoAdapter<com_ss_android_ugc_aweme_notice_api_sp_AssistantUrl> {
        public final com_ss_android_ugc_aweme_notice_api_sp_AssistantUrl redact(com_ss_android_ugc_aweme_notice_api_sp_AssistantUrl com_ss_android_ugc_aweme_notice_api_sp_assistanturl) {
            return com_ss_android_ugc_aweme_notice_api_sp_assistanturl;
        }

        public ProtoAdapter_com_ss_android_ugc_aweme_notice_api_sp_AssistantUrl() {
            super(FieldEncoding.LENGTH_DELIMITED, com_ss_android_ugc_aweme_notice_api_sp_AssistantUrl.class);
        }

        public final com_ss_android_ugc_aweme_notice_api_sp_AssistantUrl decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (com_ss_android_ugc_aweme_notice_api_sp_AssistantUrl) null);
        }

        public final int encodedSize(com_ss_android_ugc_aweme_notice_api_sp_AssistantUrl com_ss_android_ugc_aweme_notice_api_sp_assistanturl) {
            return ProtoAdapter.STRING.encodedSizeWithTag(104267911, com_ss_android_ugc_aweme_notice_api_sp_assistanturl.service_assistant_url) + ProtoAdapter.STRING.encodedSizeWithTag(95162123, com_ss_android_ugc_aweme_notice_api_sp_assistanturl.shop_assistant_url) + ProtoAdapter.STRING.encodedSizeWithTag(191224179, com_ss_android_ugc_aweme_notice_api_sp_assistanturl.douplus_assistant_url) + com_ss_android_ugc_aweme_notice_api_sp_assistanturl.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, com_ss_android_ugc_aweme_notice_api_sp_AssistantUrl com_ss_android_ugc_aweme_notice_api_sp_assistanturl) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 104267911, com_ss_android_ugc_aweme_notice_api_sp_assistanturl.service_assistant_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 95162123, com_ss_android_ugc_aweme_notice_api_sp_assistanturl.shop_assistant_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 191224179, com_ss_android_ugc_aweme_notice_api_sp_assistanturl.douplus_assistant_url);
            protoWriter.writeBytes(com_ss_android_ugc_aweme_notice_api_sp_assistanturl.unknownFields());
        }

        public final com_ss_android_ugc_aweme_notice_api_sp_AssistantUrl decode(ProtoReader protoReader, com_ss_android_ugc_aweme_notice_api_sp_AssistantUrl com_ss_android_ugc_aweme_notice_api_sp_assistanturl) throws IOException {
            Builder builder;
            com_ss_android_ugc_aweme_notice_api_sp_AssistantUrl com_ss_android_ugc_aweme_notice_api_sp_assistanturl2 = (com_ss_android_ugc_aweme_notice_api_sp_AssistantUrl) C10938a.m32097a().mo26425a(com_ss_android_ugc_aweme_notice_api_sp_AssistantUrl.class, com_ss_android_ugc_aweme_notice_api_sp_assistanturl);
            if (com_ss_android_ugc_aweme_notice_api_sp_assistanturl2 != null) {
                builder = com_ss_android_ugc_aweme_notice_api_sp_assistanturl2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 95162123) {
                    builder.shop_assistant_url((String) ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 104267911) {
                    builder.service_assistant_url((String) ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 191224179) {
                    try {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } catch (MissingRequiredFieldsException e) {
                        if (com_ss_android_ugc_aweme_notice_api_sp_assistanturl2 == null) {
                            throw e;
                        }
                    }
                } else {
                    builder.douplus_assistant_url((String) ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }
    }

    public final String getDouplusAssistantUrl() throws NullValueException {
        if (this.douplus_assistant_url != null) {
            return this.douplus_assistant_url;
        }
        throw new NullValueException();
    }

    public final String getServiceAssistantUrl() throws NullValueException {
        if (this.service_assistant_url != null) {
            return this.service_assistant_url;
        }
        throw new NullValueException();
    }

    public final String getShopAssistantUrl() throws NullValueException {
        if (this.shop_assistant_url != null) {
            return this.shop_assistant_url;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.service_assistant_url = this.service_assistant_url;
        builder.shop_assistant_url = this.shop_assistant_url;
        builder.douplus_assistant_url = this.douplus_assistant_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = this.hashCode;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i4 = 0;
        if (this.service_assistant_url != null) {
            i = this.service_assistant_url.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 37;
        if (this.shop_assistant_url != null) {
            i2 = this.shop_assistant_url.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 37;
        if (this.douplus_assistant_url != null) {
            i4 = this.douplus_assistant_url.hashCode();
        }
        int i7 = i6 + i4;
        this.hashCode = i7;
        return i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.service_assistant_url != null) {
            sb.append(", service_assistant_url=");
            sb.append(this.service_assistant_url);
        }
        if (this.shop_assistant_url != null) {
            sb.append(", shop_assistant_url=");
            sb.append(this.shop_assistant_url);
        }
        if (this.douplus_assistant_url != null) {
            sb.append(", douplus_assistant_url=");
            sb.append(this.douplus_assistant_url);
        }
        StringBuilder replace = sb.replace(0, 2, "com_ss_android_ugc_aweme_notice_api_sp_AssistantUrl{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com_ss_android_ugc_aweme_notice_api_sp_AssistantUrl)) {
            return false;
        }
        com_ss_android_ugc_aweme_notice_api_sp_AssistantUrl com_ss_android_ugc_aweme_notice_api_sp_assistanturl = (com_ss_android_ugc_aweme_notice_api_sp_AssistantUrl) obj;
        if (!unknownFields().equals(com_ss_android_ugc_aweme_notice_api_sp_assistanturl.unknownFields()) || !Internal.equals(this.service_assistant_url, com_ss_android_ugc_aweme_notice_api_sp_assistanturl.service_assistant_url) || !Internal.equals(this.shop_assistant_url, com_ss_android_ugc_aweme_notice_api_sp_assistanturl.shop_assistant_url) || !Internal.equals(this.douplus_assistant_url, com_ss_android_ugc_aweme_notice_api_sp_assistanturl.douplus_assistant_url)) {
            return false;
        }
        return true;
    }

    public com_ss_android_ugc_aweme_notice_api_sp_AssistantUrl(String str, String str2, String str3) {
        this(str, str2, str3, ByteString.EMPTY);
    }

    public com_ss_android_ugc_aweme_notice_api_sp_AssistantUrl(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.service_assistant_url = str;
        this.shop_assistant_url = str2;
        this.douplus_assistant_url = str3;
    }
}
