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

package uk.gov.hmrc.payetaxcalculatorfrontend.controllers.QuickCalcControllerSpec


import uk.gov.hmrc.payetaxcalculatorfrontend.controllers.QuickCalcController
import uk.gov.hmrc.payetaxcalculatorfrontend.quickmodel.QuickCalcAggregateInput
import uk.gov.hmrc.payetaxcalculatorfrontend.setup.AppUnitGenerator
import uk.gov.hmrc.payetaxcalculatorfrontend.setup.QuickCalcCacheSetup._

class ShowDaysSpec extends AppUnitGenerator {

  "Show Days Form" should {
    "return 200, with existing list of aggregate" in {
      val controller = new QuickCalcController(messages.messages, cacheReturnTaxCodeStatePensionSalary)
      val action = controller.showDaysAWeek(0,"")
      val result = action.apply(request)
      val status = result.header.status

      status shouldBe 200
    }

    "return 200, with non-existing list of aggregate" in {
      val controller = new QuickCalcController(messages.messages, null)
      val agg = QuickCalcAggregateInput.newInstance
      val result = controller.showDaysAWeekTestable(0,"")(request)(agg)
      val status = result.header.status

      status shouldBe 200
    }
  }

}
