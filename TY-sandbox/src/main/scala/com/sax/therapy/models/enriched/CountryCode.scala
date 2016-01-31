package com.sax.therapy.models.enriched

/**
  * Created by therapy2 on 1/30/16.
  * Standard country codes used in Twitter's streaming api.
  */
object CountryCode extends Enumeration {
  val
  ANDORRA,
  UNITED_ARAB_EMIRATES,
  AFGHANISTAN,
  ANTIGUA_AND_BARBUDA,
  ANGUILLA,
  ALBANIA,
  ARMENIA,
  ANGOLA,
  ANTARCTICA,
  ARGENTINA,
  AMERICAN_SAMOA,
  AUSTRIA,
  AUSTRALIA,
  ARUBA,
  ALAND_ISLANDS,
  AZERBAIJAN,
  BOSNIA_AND_HERZEGOVINA,
  BARBADOS,
  BANGLADESH,
  BELGIUM,
  BURKINA_FASO,
  BULGARIA,
  BAHRAIN,
  BURUNDI,
  BENIN,
  SAINT_BARTHÉLEMY,
  BERMUDA,
  BRUNEI_DARUSSALAM,
  BOLIVIA_PLURINATIONAL_STATE_OF,
  BONAIRE_SINT_EUSTATIUS_AND_SABA,
  BRAZIL,
  BAHAMAS,
  BHUTAN,
  BOUVET_ISLAND,
  BOTSWANA,
  BELARUS,
  BELIZE,
  CANADA,
  COCOS_KEELING_ISLANDS,
  CONGO_THE_DEMOCRATIC_REPUBLIC_OF_THE,
  CENTRAL_AFRICAN_REPUBLIC,
  CONGO,
  SWITZERLAND,
  COTE_DIVOIRE,
  COOK_ISLANDS,
  CHILE,
  CAMEROON,
  CHINA,
  COLOMBIA,
  COSTA_RICA,
  CUBA,
  CABO_VERDE,
  CURAÇAO,
  CHRISTMAS_ISLAND,
  CYPRUS,
  CZECH_REPUBLIC,
  GERMANY,
  DJIBOUTI,
  DENMARK,
  DOMINICA,
  DOMINICAN_REPUBLIC,
  ALGERIA,
  ECUADOR,
  ESTONIA,
  EGYPT,
  WESTERN_SAHARA,
  ERITREA,
  SPAIN,
  ETHIOPIA,
  FINLAND,
  FIJI,
  FALKLAND_ISLANDS_MALVINAS,
  MICRONESIA_FEDERATED_STATES_OF,
  FAROE_ISLANDS,
  FRANCE,
  GABON,
  UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND,
  GRENADA,
  GEORGIA,
  FRENCH_GUIANA,
  GUERNSEY,
  GHANA,
  GIBRALTAR,
  GREENLAND,
  GAMBIA,
  GUINEA,
  GUADELOUPE,
  EQUATORIAL_GUINEA,
  GREECE,
  SOUTH_GEORGIA_AND_THE_SOUTH_SANDWICH_ISLANDS,
  GUATEMALA,
  GUAM,
  GUINEA_BISSAU,
  GUYANA,
  HONG_KONG,
  HEARD_ISLAND_AND_MCDONALD_ISLANDS,
  HONDURAS,
  CROATIA,
  HAITI,
  HUNGARY,
  INDONESIA,
  IRELAND,
  ISRAEL,
  ISLE_OF_MAN,
  INDIA,
  BRITISH_INDIAN_OCEAN_TERRITORY,
  IRAQ,
  IRAN_ISLAMIC_REPUBLIC_OF,
  ICELAND,
  ITALY,
  JERSEY,
  JAMAICA,
  JORDAN,
  JAPAN,
  KENYA,
  KYRGYZSTAN,
  CAMBODIA,
  KIRIBATI,
  COMOROS,
  SAINT_KITTS_AND_NEVIS,
  KOREA_DEMOCRATIC_PEOPLES_REPUBLIC_OF,
  KOREA_REPUBLIC_OF,
  KUWAIT,
  CAYMAN_ISLANDS,
  KAZAKHSTAN,
  LAO_PEOPLES_DEMOCRATIC_REPUBLIC,
  LEBANON,
  SAINT_LUCIA,
  LIECHTENSTEIN,
  SRI_LANKA,
  LIBERIA,
  LESOTHO,
  LITHUANIA,
  LUXEMBOURG,
  LATVIA,
  LIBYA,
  MOROCCO,
  MONACO,
  MOLDOVA_REPUBLIC_OF,
  MONTENEGRO,
  SAINT_MARTIN_FRENCH_PART,
  MADAGASCAR,
  MARSHALL_ISLANDS,
  MACEDONIA_THE_FORMER_YUGOSLAV_REPUBLIC_OF,
  MALI,
  MYANMAR,
  MONGOLIA,
  MACAO,
  NORTHERN_MARIANA_ISLANDS,
  MARTINIQUE,
  MAURITANIA,
  MONTSERRAT,
  MALTA,
  MAURITIUS,
  MALDIVES,
  MALAWI,
  MEXICO,
  MALAYSIA,
  MOZAMBIQUE,
  NAMIBIA,
  NEW_CALEDONIA,
  NIGER,
  NORFOLK_ISLAND,
  NIGERIA,
  NICARAGUA,
  NETHERLANDS,
  NORWAY,
  NEPAL,
  NAURU,
  NIUE,
  NEW_ZEALAND,
  OMAN,
  PANAMA,
  PERU,
  FRENCH_POLYNESIA,
  PAPUA_NEW_GUINEA,
  PHILIPPINES,
  PAKISTAN,
  POLAND,
  SAINT_PIERRE_AND_MIQUELON,
  PITCAIRN,
  PUERTO_RICO,
  PALESTINE_STATE_OF,
  PORTUGAL,
  PALAU,
  PARAGUAY,
  QATAR,
  RÉUNION,
  ROMANIA,
  SERBIA,
  RUSSIAN_FEDERATION,
  RWANDA,
  SAUDI_ARABIA,
  SOLOMON_ISLANDS,
  SEYCHELLES,
  SUDAN,
  SWEDEN,
  SINGAPORE,
  SAINT_HELENA_ASCENSION_AND_TRISTAN_DA_CUNHA,
  SLOVENIA,
  SVALBARD_AND_JAN_MAYEN,
  SLOVAKIA,
  SIERRA_LEONE,
  SAN_MARINO,
  SENEGAL,
  SOMALIA,
  SURINAME,
  SOUTH_SUDAN,
  SAO_TOME_AND_PRINCIPE,
  EL_SALVADOR,
  SINT_MAARTEN_DUTCH_PART,
  SYRIAN_ARAB_REPUBLIC,
  SWAZILAND,
  TURKS_AND_CAICOS_ISLANDS,
  CHAD,
  FRENCH_SOUTHERN_TERRITORIES,
  TOGO,
  THAILAND,
  TAJIKISTAN,
  TOKELAU,
  TIMOR_LESTE,
  TURKMENISTAN,
  TUNISIA,
  TONGA,
  TURKEY,
  TRINIDAD_AND_TOBAGO,
  TUVALU,
  TAIWAN_PROVINCE_OF_CHINA,
  TANZANIA_UNITED_REPUBLIC_OF,
  UKRAINE,
  UGANDA,
  UNITED_STATES_MINOR_OUTLYING_ISLANDS,
  UNITED_STATES_OF_AMERICA,
  URUGUAY,
  UZBEKISTAN,
  HOLY_SEE,
  SAINT_VINCENT_AND_THE_GRENADINES,
  VENEZUELA_BOLIVARIAN_REPUBLIC_OF,
  VIRGIN_ISLANDS_BRITISH,
  VIRGIN_ISLANDS_US,
  VIET_NAM,
  VANUATU,
  WALLIS_AND_FUTUNA,
  SAMOA,
  YEMEN,
  MAYOTTE,
  SOUTH_AFRICA,
  ZAMBIA,
  ZIMBABWE = Value

  override def toString: String = {
    this match {
      case ANDORRA => "AD"
      case UNITED_ARAB_EMIRATES => "AE"
      case AFGHANISTAN => "AF"
      case ANTIGUA_AND_BARBUDA => "AG"
      case ANGUILLA => "AI"
      case ALBANIA => "AL"
      case ARMENIA => "AM"
      case ANGOLA => "AO"
      case ANTARCTICA => "AQ"
      case ARGENTINA => "AR"
      case AMERICAN_SAMOA => "AS"
      case AUSTRIA => "AT"
      case AUSTRALIA => "AU"
      case ARUBA => "AW"
      case ALAND_ISLANDS => "AX"
      case AZERBAIJAN => "AZ"
      case BOSNIA_AND_HERZEGOVINA => "BA"
      case BARBADOS => "BB"
      case BANGLADESH => "BD"
      case BELGIUM => "BE"
      case BURKINA_FASO => "BF"
      case BULGARIA => "BG"
      case BAHRAIN => "BH"
      case BURUNDI => "BI"
      case BENIN => "BJ"
      case SAINT_BARTHÉLEMY => "BL"
      case BERMUDA => "BM"
      case BRUNEI_DARUSSALAM => "BN"
      case BOLIVIA_PLURINATIONAL_STATE_OF => "BO"
      case BONAIRE_SINT_EUSTATIUS_AND_SABA => "BQ"
      case BRAZIL => "BR"
      case BAHAMAS => "BS"
      case BHUTAN => "BT"
      case BOUVET_ISLAND => "BV"
      case BOTSWANA => "BW"
      case BELARUS => "BY"
      case BELIZE => "BZ"
      case CANADA => "CA"
      case COCOS_KEELING_ISLANDS => "CC"
      case CONGO_THE_DEMOCRATIC_REPUBLIC_OF_THE => "CD"
      case CENTRAL_AFRICAN_REPUBLIC => "CF"
      case CONGO => "CG"
      case SWITZERLAND => "CH"
      case COTE_DIVOIRE => "CI"
      case COOK_ISLANDS => "CK"
      case CHILE => "CL"
      case CAMEROON => "CM"
      case CHINA => "CN"
      case COLOMBIA => "CO"
      case COSTA_RICA => "CR"
      case CUBA => "CU"
      case CABO_VERDE => "CV"
      case CURAÇAO => "CW"
      case CHRISTMAS_ISLAND => "CX"
      case CYPRUS => "CY"
      case CZECH_REPUBLIC => "CZ"
      case GERMANY => "DE"
      case DJIBOUTI => "DJ"
      case DENMARK => "DK"
      case DOMINICA => "DM"
      case DOMINICAN_REPUBLIC => "DO"
      case ALGERIA => "DZ"
      case ECUADOR => "EC"
      case ESTONIA => "EE"
      case EGYPT => "EG"
      case WESTERN_SAHARA => "EH"
      case ERITREA => "ER"
      case SPAIN => "ES"
      case ETHIOPIA => "ET"
      case FINLAND => "FI"
      case FIJI => "FJ"
      case FALKLAND_ISLANDS_MALVINAS => "FK"
      case MICRONESIA_FEDERATED_STATES_OF => "FM"
      case FAROE_ISLANDS => "FO"
      case FRANCE => "FR"
      case GABON => "GA"
      case UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND => "GB"
      case GRENADA => "GD"
      case GEORGIA => "GE"
      case FRENCH_GUIANA => "GF"
      case GUERNSEY => "GG"
      case GHANA => "GH"
      case GIBRALTAR => "GI"
      case GREENLAND => "GL"
      case GAMBIA => "GM"
      case GUINEA => "GN"
      case GUADELOUPE => "GP"
      case EQUATORIAL_GUINEA => "GQ"
      case GREECE => "GR"
      case SOUTH_GEORGIA_AND_THE_SOUTH_SANDWICH_ISLANDS => "GS"
      case GUATEMALA => "GT"
      case GUAM => "GU"
      case GUINEA_BISSAU => "GW"
      case GUYANA => "GY"
      case HONG_KONG => "HK"
      case HEARD_ISLAND_AND_MCDONALD_ISLANDS => "HM"
      case HONDURAS => "HN"
      case CROATIA => "HR"
      case HAITI => "HT"
      case HUNGARY => "HU"
      case INDONESIA => "ID"
      case IRELAND => "IE"
      case ISRAEL => "IL"
      case ISLE_OF_MAN => "IM"
      case INDIA => "IN"
      case BRITISH_INDIAN_OCEAN_TERRITORY => "IO"
      case IRAQ => "IQ"
      case IRAN_ISLAMIC_REPUBLIC_OF => "IR"
      case ICELAND => "IS"
      case ITALY => "IT"
      case JERSEY => "JE"
      case JAMAICA => "JM"
      case JORDAN => "JO"
      case JAPAN => "JP"
      case KENYA => "KE"
      case KYRGYZSTAN => "KG"
      case CAMBODIA => "KH"
      case KIRIBATI => "KI"
      case COMOROS => "KM"
      case SAINT_KITTS_AND_NEVIS => "KN"
      case KOREA_DEMOCRATIC_PEOPLES_REPUBLIC_OF => "KP"
      case KOREA_REPUBLIC_OF => "KR"
      case KUWAIT => "KW"
      case CAYMAN_ISLANDS => "KY"
      case KAZAKHSTAN => "KZ"
      case LAO_PEOPLES_DEMOCRATIC_REPUBLIC => "LA"
      case LEBANON => "LB"
      case SAINT_LUCIA => "LC"
      case LIECHTENSTEIN => "LI"
      case SRI_LANKA => "LK"
      case LIBERIA => "LR"
      case LESOTHO => "LS"
      case LITHUANIA => "LT"
      case LUXEMBOURG => "LU"
      case LATVIA => "LV"
      case LIBYA => "LY"
      case MOROCCO => "MA"
      case MONACO => "MC"
      case MOLDOVA_REPUBLIC_OF => "MD"
      case MONTENEGRO => "ME"
      case SAINT_MARTIN_FRENCH_PART => "MF"
      case MADAGASCAR => "MG"
      case MARSHALL_ISLANDS => "MH"
      case MACEDONIA_THE_FORMER_YUGOSLAV_REPUBLIC_OF => "MK"
      case MALI => "ML"
      case MYANMAR => "MM"
      case MONGOLIA => "MN"
      case MACAO => "MO"
      case NORTHERN_MARIANA_ISLANDS => "MP"
      case MARTINIQUE => "MQ"
      case MAURITANIA => "MR"
      case MONTSERRAT => "MS"
      case MALTA => "MT"
      case MAURITIUS => "MU"
      case MALDIVES => "MV"
      case MALAWI => "MW"
      case MEXICO => "MX"
      case MALAYSIA => "MY"
      case MOZAMBIQUE => "MZ"
      case NAMIBIA => "NA"
      case NEW_CALEDONIA => "NC"
      case NIGER => "NE"
      case NORFOLK_ISLAND => "NF"
      case NIGERIA => "NG"
      case NICARAGUA => "NI"
      case NETHERLANDS => "NL"
      case NORWAY => "NO"
      case NEPAL => "NP"
      case NAURU => "NR"
      case NIUE => "NU"
      case NEW_ZEALAND => "NZ"
      case OMAN => "OM"
      case PANAMA => "PA"
      case PERU => "PE"
      case FRENCH_POLYNESIA => "PF"
      case PAPUA_NEW_GUINEA => "PG"
      case PHILIPPINES => "PH"
      case PAKISTAN => "PK"
      case POLAND => "PL"
      case SAINT_PIERRE_AND_MIQUELON => "PM"
      case PITCAIRN => "PN"
      case PUERTO_RICO => "PR"
      case PALESTINE_STATE_OF => "PS"
      case PORTUGAL => "PT"
      case PALAU => "PW"
      case PARAGUAY => "PY"
      case QATAR => "QA"
      case RÉUNION => "RE"
      case ROMANIA => "RO"
      case SERBIA => "RS"
      case RUSSIAN_FEDERATION => "RU"
      case RWANDA => "RW"
      case SAUDI_ARABIA => "SA"
      case SOLOMON_ISLANDS => "SB"
      case SEYCHELLES => "SC"
      case SUDAN => "SD"
      case SWEDEN => "SE"
      case SINGAPORE => "SG"
      case SAINT_HELENA_ASCENSION_AND_TRISTAN_DA_CUNHA => "SH"
      case SLOVENIA => "SI"
      case SVALBARD_AND_JAN_MAYEN => "SJ"
      case SLOVAKIA => "SK"
      case SIERRA_LEONE => "SL"
      case SAN_MARINO => "SM"
      case SENEGAL => "SN"
      case SOMALIA => "SO"
      case SURINAME => "SR"
      case SOUTH_SUDAN => "SS"
      case SAO_TOME_AND_PRINCIPE => "ST"
      case EL_SALVADOR => "SV"
      case SINT_MAARTEN_DUTCH_PART => "SX"
      case SYRIAN_ARAB_REPUBLIC => "SY"
      case SWAZILAND => "SZ"
      case TURKS_AND_CAICOS_ISLANDS => "TC"
      case CHAD => "TD"
      case FRENCH_SOUTHERN_TERRITORIES => "TF"
      case TOGO => "TG"
      case THAILAND => "TH"
      case TAJIKISTAN => "TJ"
      case TOKELAU => "TK"
      case TIMOR_LESTE => "TL"
      case TURKMENISTAN => "TM"
      case TUNISIA => "TN"
      case TONGA => "TO"
      case TURKEY => "TR"
      case TRINIDAD_AND_TOBAGO => "TT"
      case TUVALU => "TV"
      case TAIWAN_PROVINCE_OF_CHINA => "TW"
      case TANZANIA_UNITED_REPUBLIC_OF => "TZ"
      case UKRAINE => "UA"
      case UGANDA => "UG"
      case UNITED_STATES_MINOR_OUTLYING_ISLANDS => "UM"
      case UNITED_STATES_OF_AMERICA => "US"
      case URUGUAY => "UY"
      case UZBEKISTAN => "UZ"
      case HOLY_SEE => "VA"
      case SAINT_VINCENT_AND_THE_GRENADINES => "VC"
      case VENEZUELA_BOLIVARIAN_REPUBLIC_OF => "VE"
      case VIRGIN_ISLANDS_BRITISH => "VG"
      case VIRGIN_ISLANDS_US => "VI"
      case VIET_NAM => "VN"
      case VANUATU => "VU"
      case WALLIS_AND_FUTUNA => "WF"
      case SAMOA => "WS"
      case YEMEN => "YE"
      case MAYOTTE => "YT"
      case SOUTH_AFRICA => "ZA"
      case ZAMBIA => "ZM"
      case ZIMBABWE => "ZW"
      case _ => ""
    }
  }
}
