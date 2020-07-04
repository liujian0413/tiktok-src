package com.p280ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.NullValueException;
import com.bytedance.ies.settings.C10938a;
import com.bytedance.ies.settings.C10939b;
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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.ApiConfigEntity */
public final class ApiConfigEntity extends Message<ApiConfigEntity, Builder> {
    public static final DefaultValueProtoAdapter<ApiConfigEntity> ADAPTER = new ProtoAdapter_ApiConfigEntity();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 0, tag = 1)
    public final String api_name;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long delay_time;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 2)
    public final Boolean is_banned;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.ApiConfigEntity$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<ApiConfigEntity, Builder> {
        public String api_name;
        public Long delay_time;
        public Boolean is_banned;

        public final ApiConfigEntity build() {
            if (this.api_name != null) {
                return new ApiConfigEntity(this.api_name, this.is_banned, this.delay_time, super.buildUnknownFields());
            }
            throw C10939b.m32101a(this.api_name, "api_name");
        }

        public final Builder api_name(String str) {
            this.api_name = str;
            return this;
        }

        public final Builder delay_time(Long l) {
            this.delay_time = l;
            return this;
        }

        public final Builder is_banned(Boolean bool) {
            this.is_banned = bool;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.ApiConfigEntity$ProtoAdapter_ApiConfigEntity */
    static final class ProtoAdapter_ApiConfigEntity extends DefaultValueProtoAdapter<ApiConfigEntity> {
        public final ApiConfigEntity redact(ApiConfigEntity apiConfigEntity) {
            return apiConfigEntity;
        }

        public ProtoAdapter_ApiConfigEntity() {
            super(FieldEncoding.LENGTH_DELIMITED, ApiConfigEntity.class);
        }

        public final ApiConfigEntity decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (ApiConfigEntity) null);
        }

        public final int encodedSize(ApiConfigEntity apiConfigEntity) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, apiConfigEntity.api_name) + ProtoAdapter.BOOL.encodedSizeWithTag(2, apiConfigEntity.is_banned) + ProtoAdapter.INT64.encodedSizeWithTag(3, apiConfigEntity.delay_time) + apiConfigEntity.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, ApiConfigEntity apiConfigEntity) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, apiConfigEntity.api_name);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, apiConfigEntity.is_banned);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, apiConfigEntity.delay_time);
            protoWriter.writeBytes(apiConfigEntity.unknownFields());
        }

        public final ApiConfigEntity decode(ProtoReader protoReader, ApiConfigEntity apiConfigEntity) throws IOException {
            Builder builder;
            ApiConfigEntity apiConfigEntity2 = (ApiConfigEntity) C10938a.m32097a().mo26425a(ApiConfigEntity.class, apiConfigEntity);
            if (apiConfigEntity2 != null) {
                builder = apiConfigEntity2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.api_name((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.is_banned((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 3:
                            builder.delay_time((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (apiConfigEntity2 != null) {
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

    public final String getApiName() {
        return this.api_name;
    }

    public final Long getDelayTime() throws NullValueException {
        if (this.delay_time != null) {
            return this.delay_time;
        }
        throw new NullValueException();
    }

    public final Boolean getIsBanned() throws NullValueException {
        if (this.is_banned != null) {
            return this.is_banned;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.api_name = this.api_name;
        builder.is_banned = this.is_banned;
        builder.delay_time = this.delay_time;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = ((unknownFields().hashCode() * 37) + this.api_name.hashCode()) * 37;
        int i3 = 0;
        if (this.is_banned != null) {
            i = this.is_banned.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.delay_time != null) {
            i3 = this.delay_time.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", api_name=");
        sb.append(this.api_name);
        if (this.is_banned != null) {
            sb.append(", is_banned=");
            sb.append(this.is_banned);
        }
        if (this.delay_time != null) {
            sb.append(", delay_time=");
            sb.append(this.delay_time);
        }
        StringBuilder replace = sb.replace(0, 2, "ApiConfigEntity{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ApiConfigEntity)) {
            return false;
        }
        ApiConfigEntity apiConfigEntity = (ApiConfigEntity) obj;
        if (!unknownFields().equals(apiConfigEntity.unknownFields()) || !this.api_name.equals(apiConfigEntity.api_name) || !Internal.equals(this.is_banned, apiConfigEntity.is_banned) || !Internal.equals(this.delay_time, apiConfigEntity.delay_time)) {
            return false;
        }
        return true;
    }

    public ApiConfigEntity(String str, Boolean bool, Long l) {
        this(str, bool, l, ByteString.EMPTY);
    }

    public ApiConfigEntity(String str, Boolean bool, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.api_name = str;
        this.is_banned = bool;
        this.delay_time = l;
    }
}
