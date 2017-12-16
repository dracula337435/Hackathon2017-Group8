package org.dracula.ht2017g8.bo_othersys

import com.fasterxml.jackson.annotation.JsonProperty

class CardPredictBO {

    @JsonProperty("GENDER")
    var gender: String? = null

    @JsonProperty("AGE")
    var age: String? = null

    @JsonProperty("MARITAL_STATUS")
    var maritalStatus: String? = null

    @JsonProperty("PROFESSION")
    var profession: String? = null

    @JsonProperty("INCOME")
    var income: String? = null

    @JsonProperty("BAL_AST")
    var balAst: String? = null
}