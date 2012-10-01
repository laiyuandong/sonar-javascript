/*
 * Sonar JavaScript Plugin
 * Copyright (C) 2011 Eriks Nukis and SonarSource
 * dev@sonar.codehaus.org
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */
package org.sonar.javascript.api;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class EcmaScriptMetricTest {

  @Test
  public void test() {
    assertThat(EcmaScriptMetric.values()).hasSize(8);

    for (EcmaScriptMetric metric : EcmaScriptMetric.values()) {
      assertThat(metric.getName()).isEqualTo(metric.name());
      assertThat(metric.isCalculatedMetric()).isFalse();
      assertThat(metric.isThereAggregationFormula()).isTrue();
      assertThat(metric.getCalculatedMetricFormula()).isNull();
      assertThat(metric.aggregateIfThereIsAlreadyAValue()).isTrue();
    }
  }

}