package com.p280ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.NullValueException;
import com.bytedance.ies.settings.C10938a;
import com.bytedance.ies.settings.MissingRequiredFieldsException;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.FeConfigCollection */
public final class FeConfigCollection extends Message<FeConfigCollection, Builder> {
    public static final DefaultValueProtoAdapter<FeConfigCollection> ADAPTER = new ProtoAdapter_FeConfigCollection();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.FEConfig#ADAPTER", tag = 6)
    public final FEConfig billboard_fans;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.FEConfig#ADAPTER", tag = 3)
    public final FEConfig billboard_star;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.FEConfig#ADAPTER", tag = 5)
    public final FEConfig brand_rank;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.FEConfig#ADAPTER", tag = 12)
    public final FEConfig creator_center;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.FEConfig#ADAPTER", tag = 2)
    public final FEConfig douyincard;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.FEConfig#ADAPTER", tag = 18)
    public final FEConfig game_assistant_config;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.FEConfig#ADAPTER", tag = 16)
    public final FEConfig game_detail;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.FEConfig#ADAPTER", tag = 15)
    public final FEConfig general_search;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.FEConfig#ADAPTER", tag = 8)
    public final FEConfig guardian_child;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.FEConfig#ADAPTER", tag = 13)
    public final FEConfig guardian_entrance;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.FEConfig#ADAPTER", tag = 7)
    public final FEConfig guardian_parent;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.FEConfig#ADAPTER", tag = 17)
    public final FEConfig hotpot_detail;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.FEConfig#ADAPTER", tag = 19)
    public final FEConfig item_review_reason;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.FEConfig#ADAPTER", tag = 9)
    public final FEConfig judgment_clause;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.FEConfig#ADAPTER", tag = 10)
    public final FEConfig music_faq;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.FEConfig#ADAPTER", tag = 1)
    public final FEConfig ringtone;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.FEConfig#ADAPTER", tag = 14)
    public final FEConfig search_transfer;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.FEConfig#ADAPTER", tag = 4)
    public final FEConfig teen_protection;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.FEConfig#ADAPTER", tag = 11)
    public final FEConfig verification;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.FeConfigCollection$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<FeConfigCollection, Builder> {
        public FEConfig billboard_fans;
        public FEConfig billboard_star;
        public FEConfig brand_rank;
        public FEConfig creator_center;
        public FEConfig douyincard;
        public FEConfig game_assistant_config;
        public FEConfig game_detail;
        public FEConfig general_search;
        public FEConfig guardian_child;
        public FEConfig guardian_entrance;
        public FEConfig guardian_parent;
        public FEConfig hotpot_detail;
        public FEConfig item_review_reason;
        public FEConfig judgment_clause;
        public FEConfig music_faq;
        public FEConfig ringtone;
        public FEConfig search_transfer;
        public FEConfig teen_protection;
        public FEConfig verification;

        public final FeConfigCollection build() {
            return new FeConfigCollection(this, super.buildUnknownFields());
        }

        public final Builder billboard_fans(FEConfig fEConfig) {
            this.billboard_fans = fEConfig;
            return this;
        }

        public final Builder billboard_star(FEConfig fEConfig) {
            this.billboard_star = fEConfig;
            return this;
        }

        public final Builder brand_rank(FEConfig fEConfig) {
            this.brand_rank = fEConfig;
            return this;
        }

        public final Builder creator_center(FEConfig fEConfig) {
            this.creator_center = fEConfig;
            return this;
        }

        public final Builder douyincard(FEConfig fEConfig) {
            this.douyincard = fEConfig;
            return this;
        }

        public final Builder game_assistant_config(FEConfig fEConfig) {
            this.game_assistant_config = fEConfig;
            return this;
        }

        public final Builder game_detail(FEConfig fEConfig) {
            this.game_detail = fEConfig;
            return this;
        }

        public final Builder general_search(FEConfig fEConfig) {
            this.general_search = fEConfig;
            return this;
        }

        public final Builder guardian_child(FEConfig fEConfig) {
            this.guardian_child = fEConfig;
            return this;
        }

        public final Builder guardian_entrance(FEConfig fEConfig) {
            this.guardian_entrance = fEConfig;
            return this;
        }

        public final Builder guardian_parent(FEConfig fEConfig) {
            this.guardian_parent = fEConfig;
            return this;
        }

        public final Builder hotpot_detail(FEConfig fEConfig) {
            this.hotpot_detail = fEConfig;
            return this;
        }

        public final Builder item_review_reason(FEConfig fEConfig) {
            this.item_review_reason = fEConfig;
            return this;
        }

        public final Builder judgment_clause(FEConfig fEConfig) {
            this.judgment_clause = fEConfig;
            return this;
        }

        public final Builder music_faq(FEConfig fEConfig) {
            this.music_faq = fEConfig;
            return this;
        }

        public final Builder ringtone(FEConfig fEConfig) {
            this.ringtone = fEConfig;
            return this;
        }

        public final Builder search_transfer(FEConfig fEConfig) {
            this.search_transfer = fEConfig;
            return this;
        }

        public final Builder teen_protection(FEConfig fEConfig) {
            this.teen_protection = fEConfig;
            return this;
        }

        public final Builder verification(FEConfig fEConfig) {
            this.verification = fEConfig;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.FeConfigCollection$ProtoAdapter_FeConfigCollection */
    static final class ProtoAdapter_FeConfigCollection extends DefaultValueProtoAdapter<FeConfigCollection> {
        public final FeConfigCollection redact(FeConfigCollection feConfigCollection) {
            return feConfigCollection;
        }

        public ProtoAdapter_FeConfigCollection() {
            super(FieldEncoding.LENGTH_DELIMITED, FeConfigCollection.class);
        }

        public final FeConfigCollection decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (FeConfigCollection) null);
        }

        public final int encodedSize(FeConfigCollection feConfigCollection) {
            return FEConfig.ADAPTER.encodedSizeWithTag(1, feConfigCollection.ringtone) + FEConfig.ADAPTER.encodedSizeWithTag(2, feConfigCollection.douyincard) + FEConfig.ADAPTER.encodedSizeWithTag(3, feConfigCollection.billboard_star) + FEConfig.ADAPTER.encodedSizeWithTag(4, feConfigCollection.teen_protection) + FEConfig.ADAPTER.encodedSizeWithTag(5, feConfigCollection.brand_rank) + FEConfig.ADAPTER.encodedSizeWithTag(6, feConfigCollection.billboard_fans) + FEConfig.ADAPTER.encodedSizeWithTag(7, feConfigCollection.guardian_parent) + FEConfig.ADAPTER.encodedSizeWithTag(8, feConfigCollection.guardian_child) + FEConfig.ADAPTER.encodedSizeWithTag(9, feConfigCollection.judgment_clause) + FEConfig.ADAPTER.encodedSizeWithTag(10, feConfigCollection.music_faq) + FEConfig.ADAPTER.encodedSizeWithTag(11, feConfigCollection.verification) + FEConfig.ADAPTER.encodedSizeWithTag(12, feConfigCollection.creator_center) + FEConfig.ADAPTER.encodedSizeWithTag(13, feConfigCollection.guardian_entrance) + FEConfig.ADAPTER.encodedSizeWithTag(14, feConfigCollection.search_transfer) + FEConfig.ADAPTER.encodedSizeWithTag(15, feConfigCollection.general_search) + FEConfig.ADAPTER.encodedSizeWithTag(16, feConfigCollection.game_detail) + FEConfig.ADAPTER.encodedSizeWithTag(17, feConfigCollection.hotpot_detail) + FEConfig.ADAPTER.encodedSizeWithTag(18, feConfigCollection.game_assistant_config) + FEConfig.ADAPTER.encodedSizeWithTag(19, feConfigCollection.item_review_reason) + feConfigCollection.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, FeConfigCollection feConfigCollection) throws IOException {
            FEConfig.ADAPTER.encodeWithTag(protoWriter, 1, feConfigCollection.ringtone);
            FEConfig.ADAPTER.encodeWithTag(protoWriter, 2, feConfigCollection.douyincard);
            FEConfig.ADAPTER.encodeWithTag(protoWriter, 3, feConfigCollection.billboard_star);
            FEConfig.ADAPTER.encodeWithTag(protoWriter, 4, feConfigCollection.teen_protection);
            FEConfig.ADAPTER.encodeWithTag(protoWriter, 5, feConfigCollection.brand_rank);
            FEConfig.ADAPTER.encodeWithTag(protoWriter, 6, feConfigCollection.billboard_fans);
            FEConfig.ADAPTER.encodeWithTag(protoWriter, 7, feConfigCollection.guardian_parent);
            FEConfig.ADAPTER.encodeWithTag(protoWriter, 8, feConfigCollection.guardian_child);
            FEConfig.ADAPTER.encodeWithTag(protoWriter, 9, feConfigCollection.judgment_clause);
            FEConfig.ADAPTER.encodeWithTag(protoWriter, 10, feConfigCollection.music_faq);
            FEConfig.ADAPTER.encodeWithTag(protoWriter, 11, feConfigCollection.verification);
            FEConfig.ADAPTER.encodeWithTag(protoWriter, 12, feConfigCollection.creator_center);
            FEConfig.ADAPTER.encodeWithTag(protoWriter, 13, feConfigCollection.guardian_entrance);
            FEConfig.ADAPTER.encodeWithTag(protoWriter, 14, feConfigCollection.search_transfer);
            FEConfig.ADAPTER.encodeWithTag(protoWriter, 15, feConfigCollection.general_search);
            FEConfig.ADAPTER.encodeWithTag(protoWriter, 16, feConfigCollection.game_detail);
            FEConfig.ADAPTER.encodeWithTag(protoWriter, 17, feConfigCollection.hotpot_detail);
            FEConfig.ADAPTER.encodeWithTag(protoWriter, 18, feConfigCollection.game_assistant_config);
            FEConfig.ADAPTER.encodeWithTag(protoWriter, 19, feConfigCollection.item_review_reason);
            protoWriter.writeBytes(feConfigCollection.unknownFields());
        }

        public final FeConfigCollection decode(ProtoReader protoReader, FeConfigCollection feConfigCollection) throws IOException {
            Builder builder;
            FeConfigCollection feConfigCollection2 = (FeConfigCollection) C10938a.m32097a().mo26425a(FeConfigCollection.class, feConfigCollection);
            if (feConfigCollection2 != null) {
                builder = feConfigCollection2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.ringtone((FEConfig) FEConfig.ADAPTER.decode(protoReader, builder.ringtone));
                            break;
                        case 2:
                            builder.douyincard((FEConfig) FEConfig.ADAPTER.decode(protoReader, builder.douyincard));
                            break;
                        case 3:
                            builder.billboard_star((FEConfig) FEConfig.ADAPTER.decode(protoReader, builder.billboard_star));
                            break;
                        case 4:
                            builder.teen_protection((FEConfig) FEConfig.ADAPTER.decode(protoReader, builder.teen_protection));
                            break;
                        case 5:
                            builder.brand_rank((FEConfig) FEConfig.ADAPTER.decode(protoReader, builder.brand_rank));
                            break;
                        case 6:
                            builder.billboard_fans((FEConfig) FEConfig.ADAPTER.decode(protoReader, builder.billboard_fans));
                            break;
                        case 7:
                            builder.guardian_parent((FEConfig) FEConfig.ADAPTER.decode(protoReader, builder.guardian_parent));
                            break;
                        case 8:
                            builder.guardian_child((FEConfig) FEConfig.ADAPTER.decode(protoReader, builder.guardian_child));
                            break;
                        case 9:
                            builder.judgment_clause((FEConfig) FEConfig.ADAPTER.decode(protoReader, builder.judgment_clause));
                            break;
                        case 10:
                            builder.music_faq((FEConfig) FEConfig.ADAPTER.decode(protoReader, builder.music_faq));
                            break;
                        case 11:
                            builder.verification((FEConfig) FEConfig.ADAPTER.decode(protoReader, builder.verification));
                            break;
                        case 12:
                            builder.creator_center((FEConfig) FEConfig.ADAPTER.decode(protoReader, builder.creator_center));
                            break;
                        case 13:
                            builder.guardian_entrance((FEConfig) FEConfig.ADAPTER.decode(protoReader, builder.guardian_entrance));
                            break;
                        case 14:
                            builder.search_transfer((FEConfig) FEConfig.ADAPTER.decode(protoReader, builder.search_transfer));
                            break;
                        case 15:
                            builder.general_search((FEConfig) FEConfig.ADAPTER.decode(protoReader, builder.general_search));
                            break;
                        case 16:
                            builder.game_detail((FEConfig) FEConfig.ADAPTER.decode(protoReader, builder.game_detail));
                            break;
                        case 17:
                            builder.hotpot_detail((FEConfig) FEConfig.ADAPTER.decode(protoReader, builder.hotpot_detail));
                            break;
                        case 18:
                            builder.game_assistant_config((FEConfig) FEConfig.ADAPTER.decode(protoReader, builder.game_assistant_config));
                            break;
                        case 19:
                            builder.item_review_reason((FEConfig) FEConfig.ADAPTER.decode(protoReader, builder.item_review_reason));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (feConfigCollection2 != null) {
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

    public final FEConfig getBillboardFans() throws NullValueException {
        if (this.billboard_fans != null) {
            return this.billboard_fans;
        }
        throw new NullValueException();
    }

    public final FEConfig getBillboardStar() throws NullValueException {
        if (this.billboard_star != null) {
            return this.billboard_star;
        }
        throw new NullValueException();
    }

    public final FEConfig getBrandRank() throws NullValueException {
        if (this.brand_rank != null) {
            return this.brand_rank;
        }
        throw new NullValueException();
    }

    public final FEConfig getCreatorCenter() throws NullValueException {
        if (this.creator_center != null) {
            return this.creator_center;
        }
        throw new NullValueException();
    }

    public final FEConfig getDouyincard() throws NullValueException {
        if (this.douyincard != null) {
            return this.douyincard;
        }
        throw new NullValueException();
    }

    public final FEConfig getGameAssistantConfig() throws NullValueException {
        if (this.game_assistant_config != null) {
            return this.game_assistant_config;
        }
        throw new NullValueException();
    }

    public final FEConfig getGameDetail() throws NullValueException {
        if (this.game_detail != null) {
            return this.game_detail;
        }
        throw new NullValueException();
    }

    public final FEConfig getGeneralSearch() throws NullValueException {
        if (this.general_search != null) {
            return this.general_search;
        }
        throw new NullValueException();
    }

    public final FEConfig getGuardianChild() throws NullValueException {
        if (this.guardian_child != null) {
            return this.guardian_child;
        }
        throw new NullValueException();
    }

    public final FEConfig getGuardianEntrance() throws NullValueException {
        if (this.guardian_entrance != null) {
            return this.guardian_entrance;
        }
        throw new NullValueException();
    }

    public final FEConfig getGuardianParent() throws NullValueException {
        if (this.guardian_parent != null) {
            return this.guardian_parent;
        }
        throw new NullValueException();
    }

    public final FEConfig getHotpotDetail() throws NullValueException {
        if (this.hotpot_detail != null) {
            return this.hotpot_detail;
        }
        throw new NullValueException();
    }

    public final FEConfig getItemReviewReason() throws NullValueException {
        if (this.item_review_reason != null) {
            return this.item_review_reason;
        }
        throw new NullValueException();
    }

    public final FEConfig getJudgmentClause() throws NullValueException {
        if (this.judgment_clause != null) {
            return this.judgment_clause;
        }
        throw new NullValueException();
    }

    public final FEConfig getMusicFaq() throws NullValueException {
        if (this.music_faq != null) {
            return this.music_faq;
        }
        throw new NullValueException();
    }

    public final FEConfig getRingtone() throws NullValueException {
        if (this.ringtone != null) {
            return this.ringtone;
        }
        throw new NullValueException();
    }

    public final FEConfig getSearchTransfer() throws NullValueException {
        if (this.search_transfer != null) {
            return this.search_transfer;
        }
        throw new NullValueException();
    }

    public final FEConfig getTeenProtection() throws NullValueException {
        if (this.teen_protection != null) {
            return this.teen_protection;
        }
        throw new NullValueException();
    }

    public final FEConfig getVerification() throws NullValueException {
        if (this.verification != null) {
            return this.verification;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.ringtone = this.ringtone;
        builder.douyincard = this.douyincard;
        builder.billboard_star = this.billboard_star;
        builder.teen_protection = this.teen_protection;
        builder.brand_rank = this.brand_rank;
        builder.billboard_fans = this.billboard_fans;
        builder.guardian_parent = this.guardian_parent;
        builder.guardian_child = this.guardian_child;
        builder.judgment_clause = this.judgment_clause;
        builder.music_faq = this.music_faq;
        builder.verification = this.verification;
        builder.creator_center = this.creator_center;
        builder.guardian_entrance = this.guardian_entrance;
        builder.search_transfer = this.search_transfer;
        builder.general_search = this.general_search;
        builder.game_detail = this.game_detail;
        builder.hotpot_detail = this.hotpot_detail;
        builder.game_assistant_config = this.game_assistant_config;
        builder.item_review_reason = this.item_review_reason;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19 = this.hashCode;
        if (i19 != 0) {
            return i19;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i20 = 0;
        if (this.ringtone != null) {
            i = this.ringtone.hashCode();
        } else {
            i = 0;
        }
        int i21 = (hashCode + i) * 37;
        if (this.douyincard != null) {
            i2 = this.douyincard.hashCode();
        } else {
            i2 = 0;
        }
        int i22 = (i21 + i2) * 37;
        if (this.billboard_star != null) {
            i3 = this.billboard_star.hashCode();
        } else {
            i3 = 0;
        }
        int i23 = (i22 + i3) * 37;
        if (this.teen_protection != null) {
            i4 = this.teen_protection.hashCode();
        } else {
            i4 = 0;
        }
        int i24 = (i23 + i4) * 37;
        if (this.brand_rank != null) {
            i5 = this.brand_rank.hashCode();
        } else {
            i5 = 0;
        }
        int i25 = (i24 + i5) * 37;
        if (this.billboard_fans != null) {
            i6 = this.billboard_fans.hashCode();
        } else {
            i6 = 0;
        }
        int i26 = (i25 + i6) * 37;
        if (this.guardian_parent != null) {
            i7 = this.guardian_parent.hashCode();
        } else {
            i7 = 0;
        }
        int i27 = (i26 + i7) * 37;
        if (this.guardian_child != null) {
            i8 = this.guardian_child.hashCode();
        } else {
            i8 = 0;
        }
        int i28 = (i27 + i8) * 37;
        if (this.judgment_clause != null) {
            i9 = this.judgment_clause.hashCode();
        } else {
            i9 = 0;
        }
        int i29 = (i28 + i9) * 37;
        if (this.music_faq != null) {
            i10 = this.music_faq.hashCode();
        } else {
            i10 = 0;
        }
        int i30 = (i29 + i10) * 37;
        if (this.verification != null) {
            i11 = this.verification.hashCode();
        } else {
            i11 = 0;
        }
        int i31 = (i30 + i11) * 37;
        if (this.creator_center != null) {
            i12 = this.creator_center.hashCode();
        } else {
            i12 = 0;
        }
        int i32 = (i31 + i12) * 37;
        if (this.guardian_entrance != null) {
            i13 = this.guardian_entrance.hashCode();
        } else {
            i13 = 0;
        }
        int i33 = (i32 + i13) * 37;
        if (this.search_transfer != null) {
            i14 = this.search_transfer.hashCode();
        } else {
            i14 = 0;
        }
        int i34 = (i33 + i14) * 37;
        if (this.general_search != null) {
            i15 = this.general_search.hashCode();
        } else {
            i15 = 0;
        }
        int i35 = (i34 + i15) * 37;
        if (this.game_detail != null) {
            i16 = this.game_detail.hashCode();
        } else {
            i16 = 0;
        }
        int i36 = (i35 + i16) * 37;
        if (this.hotpot_detail != null) {
            i17 = this.hotpot_detail.hashCode();
        } else {
            i17 = 0;
        }
        int i37 = (i36 + i17) * 37;
        if (this.game_assistant_config != null) {
            i18 = this.game_assistant_config.hashCode();
        } else {
            i18 = 0;
        }
        int i38 = (i37 + i18) * 37;
        if (this.item_review_reason != null) {
            i20 = this.item_review_reason.hashCode();
        }
        int i39 = i38 + i20;
        this.hashCode = i39;
        return i39;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.ringtone != null) {
            sb.append(", ringtone=");
            sb.append(this.ringtone);
        }
        if (this.douyincard != null) {
            sb.append(", douyincard=");
            sb.append(this.douyincard);
        }
        if (this.billboard_star != null) {
            sb.append(", billboard_star=");
            sb.append(this.billboard_star);
        }
        if (this.teen_protection != null) {
            sb.append(", teen_protection=");
            sb.append(this.teen_protection);
        }
        if (this.brand_rank != null) {
            sb.append(", brand_rank=");
            sb.append(this.brand_rank);
        }
        if (this.billboard_fans != null) {
            sb.append(", billboard_fans=");
            sb.append(this.billboard_fans);
        }
        if (this.guardian_parent != null) {
            sb.append(", guardian_parent=");
            sb.append(this.guardian_parent);
        }
        if (this.guardian_child != null) {
            sb.append(", guardian_child=");
            sb.append(this.guardian_child);
        }
        if (this.judgment_clause != null) {
            sb.append(", judgment_clause=");
            sb.append(this.judgment_clause);
        }
        if (this.music_faq != null) {
            sb.append(", music_faq=");
            sb.append(this.music_faq);
        }
        if (this.verification != null) {
            sb.append(", verification=");
            sb.append(this.verification);
        }
        if (this.creator_center != null) {
            sb.append(", creator_center=");
            sb.append(this.creator_center);
        }
        if (this.guardian_entrance != null) {
            sb.append(", guardian_entrance=");
            sb.append(this.guardian_entrance);
        }
        if (this.search_transfer != null) {
            sb.append(", search_transfer=");
            sb.append(this.search_transfer);
        }
        if (this.general_search != null) {
            sb.append(", general_search=");
            sb.append(this.general_search);
        }
        if (this.game_detail != null) {
            sb.append(", game_detail=");
            sb.append(this.game_detail);
        }
        if (this.hotpot_detail != null) {
            sb.append(", hotpot_detail=");
            sb.append(this.hotpot_detail);
        }
        if (this.game_assistant_config != null) {
            sb.append(", game_assistant_config=");
            sb.append(this.game_assistant_config);
        }
        if (this.item_review_reason != null) {
            sb.append(", item_review_reason=");
            sb.append(this.item_review_reason);
        }
        StringBuilder replace = sb.replace(0, 2, "FeConfigCollection{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FeConfigCollection)) {
            return false;
        }
        FeConfigCollection feConfigCollection = (FeConfigCollection) obj;
        if (!unknownFields().equals(feConfigCollection.unknownFields()) || !Internal.equals(this.ringtone, feConfigCollection.ringtone) || !Internal.equals(this.douyincard, feConfigCollection.douyincard) || !Internal.equals(this.billboard_star, feConfigCollection.billboard_star) || !Internal.equals(this.teen_protection, feConfigCollection.teen_protection) || !Internal.equals(this.brand_rank, feConfigCollection.brand_rank) || !Internal.equals(this.billboard_fans, feConfigCollection.billboard_fans) || !Internal.equals(this.guardian_parent, feConfigCollection.guardian_parent) || !Internal.equals(this.guardian_child, feConfigCollection.guardian_child) || !Internal.equals(this.judgment_clause, feConfigCollection.judgment_clause) || !Internal.equals(this.music_faq, feConfigCollection.music_faq) || !Internal.equals(this.verification, feConfigCollection.verification) || !Internal.equals(this.creator_center, feConfigCollection.creator_center) || !Internal.equals(this.guardian_entrance, feConfigCollection.guardian_entrance) || !Internal.equals(this.search_transfer, feConfigCollection.search_transfer) || !Internal.equals(this.general_search, feConfigCollection.general_search) || !Internal.equals(this.game_detail, feConfigCollection.game_detail) || !Internal.equals(this.hotpot_detail, feConfigCollection.hotpot_detail) || !Internal.equals(this.game_assistant_config, feConfigCollection.game_assistant_config) || !Internal.equals(this.item_review_reason, feConfigCollection.item_review_reason)) {
            return false;
        }
        return true;
    }

    public FeConfigCollection(Builder builder, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ringtone = builder.ringtone;
        this.douyincard = builder.douyincard;
        this.billboard_star = builder.billboard_star;
        this.teen_protection = builder.teen_protection;
        this.brand_rank = builder.brand_rank;
        this.billboard_fans = builder.billboard_fans;
        this.guardian_parent = builder.guardian_parent;
        this.guardian_child = builder.guardian_child;
        this.judgment_clause = builder.judgment_clause;
        this.music_faq = builder.music_faq;
        this.verification = builder.verification;
        this.creator_center = builder.creator_center;
        this.guardian_entrance = builder.guardian_entrance;
        this.search_transfer = builder.search_transfer;
        this.general_search = builder.general_search;
        this.game_detail = builder.game_detail;
        this.hotpot_detail = builder.hotpot_detail;
        this.game_assistant_config = builder.game_assistant_config;
        this.item_review_reason = builder.item_review_reason;
    }
}
