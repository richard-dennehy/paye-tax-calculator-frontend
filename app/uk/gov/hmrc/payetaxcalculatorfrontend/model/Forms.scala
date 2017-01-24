/*
 * Copyright 2017 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.gov.hmrc.payetaxcalculatorfrontend.model

import play.api.data.Form
import play.api.data.Forms._

object Forms {

  val userInputForm : Form[UserInput] =
    Form(mapping(
      "isStatePensionAge" -> nonEmptyText,
      "taxYear" -> nonEmptyText,
      "taxCode" -> nonEmptyText,
      "grossPayPence" -> nonEmptyText,
      "payPeriod" -> nonEmptyText,
      "hoursIn" -> nonEmptyText
    )(UserInput.apply)(UserInput.unapply))

}

case class UserInput(isStatePensionAge: String, taxYear: String, taxCode: String, grossPayPence: String, payPeriod: String, hoursIn: String)
