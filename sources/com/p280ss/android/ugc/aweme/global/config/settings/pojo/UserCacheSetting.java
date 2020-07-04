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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UserCacheSetting */
public final class UserCacheSetting extends Message<UserCacheSetting, Builder> {
    public static final DefaultValueProtoAdapter<UserCacheSetting> ADAPTER = new ProtoAdapter_UserCacheSetting();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public final Integer enable_ru_cache;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer enable_ru_insert;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long ru_cache_intervals;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UserCacheSetting$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<UserCacheSetting, Builder> {
        public Integer enable_ru_cache;
        public Integer enable_ru_insert;
        public Long ru_cache_intervals;

        public final UserCacheSetting build() {
            return new UserCacheSetting(this.enable_ru_cache, this.enable_ru_insert, this.ru_cache_intervals, super.buildUnknownFields());
        }

        public final Builder enable_ru_cache(Integer num) {
            this.enable_ru_cache = num;
            return this;
        }

        public final Builder enable_ru_insert(Integer num) {
            this.enable_ru_insert = num;
            return this;
        }

        public final Builder ru_cache_intervals(Long l) {
            this.ru_cache_intervals = l;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UserCacheSetting$ProtoAdapter_UserCacheSetting */
    static final class ProtoAdapter_UserCacheSetting extends DefaultValueProtoAdapter<UserCacheSetting> {
        public final UserCacheSetting redact(UserCacheSetting userCacheSetting) {
            return userCacheSetting;
        }

        public ProtoAdapter_UserCacheSetting() {
            super(FieldEncoding.LENGTH_DELIMITED, UserCacheSetting.class);
        }

        public final UserCacheSetting decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (UserCacheSetting) null);
        }

        public final int encodedSize(UserCacheSetting userCacheSetting) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, userCacheSetting.enable_ru_cache) + ProtoAdapter.INT32.encodedSizeWithTag(2, userCacheSetting.enable_ru_insert) + ProtoAdapter.INT64.encodedSizeWithTag(3, userCacheSetting.ru_cache_intervals) + userCacheSetting.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, UserCacheSetting userCacheSetting) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, userCacheSetting.enable_ru_cache);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, userCacheSetting.enable_ru_insert);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, userCacheSetting.ru_cache_intervals);
            protoWriter.writeBytes(userCacheSetting.unknownFields());
        }

        public final UserCacheSetting decode(ProtoReader protoReader, UserCacheSetting userCacheSetting) throws IOException {
            Builder builder;
            UserCacheSetting userCacheSetting2 = (UserCacheSetting) C10938a.m32097a().mo26425a(UserCacheSetting.class, userCacheSetting);
            if (userCacheSetting2 != null) {
                builder = userCacheSetting2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.enable_ru_cache((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.enable_ru_insert((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.ru_cache_intervals((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (userCacheSetting2 != null) {
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

    public final Integer getEnableRuCache() throws NullValueException {
        if (this.enable_ru_cache != null) {
            return this.enable_ru_cache;
        }
        throw new NullValueException();
    }

    public final Integer getEnableRuInsert() throws NullValueException {
        if (this.enable_ru_insert != null) {
            return this.enable_ru_insert;
        }
        throw new NullValueException();
    }

    public final Long getRuCacheIntervals() throws NullValueException {
        if (this.ru_cache_intervals != null) {
            return this.ru_cache_intervals;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.enable_ru_cache = this.enable_ru_cache;
        builder.enable_ru_insert = this.enable_ru_insert;
        builder.ru_cache_intervals = this.ru_cache_intervals;
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
        if (this.enable_ru_cache != null) {
            i = this.enable_ru_cache.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 37;
        if (this.enable_ru_insert != null) {
            i2 = this.enable_ru_insert.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 37;
        if (this.ru_cache_intervals != null) {
            i4 = this.ru_cache_intervals.hashCode();
        }
        int i7 = i6 + i4;
        this.hashCode = i7;
        return i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.enable_ru_cache != null) {
            sb.append(", enable_ru_cache=");
            sb.append(this.enable_ru_cache);
        }
        if (this.enable_ru_insert != null) {
            sb.append(", enable_ru_insert=");
            sb.append(this.enable_ru_insert);
        }
        if (this.ru_cache_intervals != null) {
            sb.append(", ru_cache_intervals=");
            sb.append(this.ru_cache_intervals);
        }
        StringBuilder replace = sb.replace(0, 2, "UserCacheSetting{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserCacheSetting)) {
            return false;
        }
        UserCacheSetting userCacheSetting = (UserCacheSetting) obj;
        if (!unknownFields().equals(userCacheSetting.unknownFields()) || !Internal.equals(this.enable_ru_cache, userCacheSetting.enable_ru_cache) || !Internal.equals(this.enable_ru_insert, userCacheSetting.enable_ru_insert) || !Internal.equals(this.ru_cache_intervals, userCacheSetting.ru_cache_intervals)) {
            return false;
        }
        return true;
    }

    public UserCacheSetting(Integer num, Integer num2, Long l) {
        this(num, num2, l, ByteString.EMPTY);
    }

    public UserCacheSetting(Integer num, Integer num2, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.enable_ru_cache = num;
        this.enable_ru_insert = num2;
        this.ru_cache_intervals = l;
    }
}
