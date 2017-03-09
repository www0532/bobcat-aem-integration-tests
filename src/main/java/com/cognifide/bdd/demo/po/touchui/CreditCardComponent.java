/*-
 * #%L
 * Bobcat
 * %%
 * Copyright (C) 2016 Cognifide Ltd.
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package com.cognifide.bdd.demo.po.touchui;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cognifide.qa.bb.qualifier.PageObject;

@PageObject
public class CreditCardComponent {

  public static final String CSS = ".section.creditcard";

  public static final String CARD_TYPE_SELECT_ID = "new_form_test-credit-card-type";

  @FindBy(tagName = "label")
  private WebElement label;

  @FindBy(id = CARD_TYPE_SELECT_ID)
  private WebElement cardTypeSelect;

  public String getLabelText() {
    return label.getText();
  }

  public WebElement getCardTypeSelect() {
    return cardTypeSelect;
  }
}